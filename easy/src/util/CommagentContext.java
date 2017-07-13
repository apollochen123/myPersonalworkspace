package util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * <p>
 * Title: Ӧ�ü���ƽ̨��ͨ�Ź���ģ��API
 * </p>
 * <p>
 * Description:�ó����ṩ��Commagentͨ�ŵ�API
 * </p>
 * <p>
 * Copyright: Copyright (c) 2009
 * </p>
 * <p>
 * Company: si-tech
 * </p>
 * 
 * @author machunlin
 * @version 1.0.0
 */
public class CommagentContext {
	public Socket u_t_CommSockid;

	private InputStream inputStream;

	private OutputStream outputStream;

	private int u_t_counter = 0;

	private int u_t_transid = 1;

	private long u_t_lasttime = 0;

	private long u_t_existtime = 0;

	private CommagentMessage databuf;

	private CommagentContext() {
	}

	/**
	 * ��һ�������ַ���ת��Ϊint���ͣ��������쳣�򷵻�0
	 * 
	 * @param str
	 * @return
	 */
	public static int atoni(String str) {
		try {
			return Integer.parseInt(str);
		} catch (NumberFormatException e) {
			return 0;
		}
	}

	/**
	 * �÷�����databuf�е�����ת��Ϊ�ֽ�������ͱ��ġ��������������⣬һ��д�����������������
	 * 
	 * @return
	 * @throws IOException
	 */
	private CommagentContext send_msg() throws IOException {
		byte[] temp = null;
		try {
			temp = databuf.getAsByteArray();
			outputStream.write(temp);
		} catch (IOException e) {
			throw e;
		}
		return this;
	}

	/**
	 * �÷������ڶ�ȡ��ָ�����������ж�ȡָ�����ȵ��ַ��������Ǳ��浽�ֽ�������
	 * 
	 * @param inputStream
	 * @param readLen
	 * @return �ֽ�����
	 * @throws IOException
	 */
	private byte[] read_msg(InputStream inputStream, int readLen)
			throws IOException {
		byte[] temp = new byte[readLen];
		byte[] result = new byte[readLen];
		
		int rcv = 0;
		try {
			while (rcv < readLen) {
				int ret = inputStream.read(temp);
				
				System.arraycopy(temp, 0, result, rcv, ret);
				rcv += ret;
				temp = new byte[readLen - rcv];
			}
		} catch (IOException e) {
			throw e;
		}
		
		return result;
	}

	/**
	 * �÷������ڴ�CommCtrl������������ж�ȡ���ݲ�������databuf��
	 * 
	 * @return �ɹ����ذ��ĳ��ȣ�ʧ�ܷ���-1
	 * @throws Exception
	 */
		int ret = 0;
		private int read_msg() throws Exception {
		int duobao=0;
		CommagentMessage CM=null;
		try {
			while (true) {
				byte[] temp = this.read_msg(inputStream,
						CommagentConfig.HEADLEN);
				if (temp != null) {
					if(duobao==0) {
						databuf = new CommagentMessage(temp); 	//头文件
						CM= new CommagentMessage(temp);    
					}
					else{
						CM= new CommagentMessage(temp);
					}
					duobao++;
					ret += temp.length;
					int msgbodylen = CM.getMsglength();

					
					temp = this.read_msg(inputStream, msgbodylen);
					if (temp != null) {
						databuf.setMsgbody(temp);
						ret += temp.length;
					}
				}
				//System.out.println("F="+(char)databuf.getFinished());
				if(CM.getFinished()=='1') break;
				
			}
		} catch (Exception e) {
			throw e;
		}
		return ret;
	}

	public static CommagentContext Service_Register_Buss(String addr,
			String appid, int servicecount) {
		// String abc = "//127.0.0.1:8110//127.0.0.1:8111";

		String[] addrs = addr.split("//");
		String addr1 = addrs[1];
		String addr2 = addrs[2];
		int index = addr1.indexOf(":");
		String ip1 = addr1.substring(0, index);
		String strPort1 = addr1.substring(index + 1);
		int port1 = Integer.parseInt(strPort1);

		index = addr2.indexOf(":");
		String ip2 = addr2.substring(0, index);
		String strPort2 = addr2.substring(index + 1);
		int port2 = Integer.parseInt(strPort2);

		CommagentContext context = conn_agent(ip1, port1, appid, servicecount);
		if (context == null) {
			context = conn_agent(ip2, port2, appid, servicecount);
		}
		return context;
	}

	/**
	 * �÷������ڷ���˺�commaget��������
	 * 
	 * @param ip
	 * @param port
	 * @param appid
	 * @return
	 */
	public static CommagentContext conn_agent(String ip, int port,
			String appid, int servicecount) {
		CommagentContext commCtrl = new CommagentContext();
		commCtrl.u_t_lasttime = System.currentTimeMillis();
		commCtrl.u_t_existtime = 0;

		if (servicecount < 1 || servicecount > 9999) {
			System.out.println("service count out of bound[1, 9999]");
			return null;
		}
		try {
			commCtrl.u_t_CommSockid = new Socket(ip, port);
			commCtrl.inputStream = commCtrl.u_t_CommSockid.getInputStream();
			commCtrl.outputStream = commCtrl.u_t_CommSockid.getOutputStream();
			commCtrl.databuf = new CommagentMessage();
			// u_t_CommSockid.setSoTimeout(10000);
			commCtrl.databuf.init((byte) '0');
			commCtrl.databuf.setMsgflag(CommagentConfig.MSGFLAG);
			commCtrl.databuf.setVersion(CommagentConfig.VER01);
			commCtrl.databuf.setFinished(CommagentConfig.ISTRUE);
			commCtrl.databuf.setMsgtype(CommagentConfig.SRVREGISTER);
			commCtrl.databuf.setAppid(appid);

			commCtrl.databuf.setMsgbody(serviceCount(servicecount));
			// commCtrl.databuf.setCodetime(Config.DEFAULT_CODE_TIME);

			commCtrl.outputStream.write(commCtrl.databuf.getAsByteArray());

			byte[] connRsp = commCtrl.read_msg(commCtrl.inputStream,
					CommagentConfig.HEADLEN);
			if (connRsp != null) {
				commCtrl.databuf.set(connRsp);
				commCtrl.u_t_lasttime = System.currentTimeMillis();
				commCtrl.u_t_existtime = 0;
				if (atoni(commCtrl.databuf.getCodetime()) == 0) {
					return commCtrl;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	private static String serviceCount(int serviceCount) {
		if (serviceCount < 10) {
			return "000" + serviceCount;
		} else if (serviceCount < 100) {
			return "00" + serviceCount;
		} else if (serviceCount < 1000) {
			return "0" + serviceCount;
		} else {
			return "" + serviceCount;
		}
	}

	/**
	 * �÷������ڷ������commagent���ͱ���
	 * 
	 * @param messageҪ���͵ı�����
	 * @param code��������������
	 * @param flag
	 * @return -2��ʾ���ʧ�� -1��ʾ�����쳣 �ɹ����ط��͵��ֽ���
	 */
	public int send_msg_srv(String message, int code, int flag) {
		return this.send_msg_srv(message.getBytes(), code, flag);
	}

	public int send_msg_srv(byte[] message, int code, int flag) {
		if ((CommagentConfig.MSGBEGIN & flag) == CommagentConfig.MSGBEGIN) {
			u_t_counter = 0;
		}
		if ((CommagentConfig.MSGCONTINUE & flag) == CommagentConfig.MSGCONTINUE) {
			u_t_counter++;
		}
		if ((CommagentConfig.MSGEND & flag) == CommagentConfig.MSGEND) {
			databuf.setFinished(CommagentConfig.ISTRUE);
			// u_t_counter++;
			u_t_existtime = 0;
		} else {
			databuf.setFinished(CommagentConfig.NOTTRUE);
		}
		databuf.setMsgtype(CommagentConfig.MSGRESPONSE);
		byte[] temp = null;
		try {
			databuf.setMsgflag(CommagentConfig.MSGFLAG);
			databuf.setVersion(CommagentConfig.VER01);
			databuf.setTransnum(u_t_counter);
			databuf.setCodetime(code);
			databuf.setMsgbody(message);
			temp = databuf.getAsByteArray();
			outputStream.write(temp);// ***********���ܴ�������
		} catch (SetFieldException e1) {
			e1.printStackTrace();
			return -2;
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
		return temp.length;
	}

	/**
	 * û�н��в���
	 * 
	 * @return
	 * @throws Exception
	 */
	public int recv_msg_srv() throws Exception {
		long tt = System.currentTimeMillis();
		// long alarmtime = tt - u_t_lasttime - u_t_existtime;
		// if (u_t_existtime > 0 && alarmtime > 0) {
		// return -100;
		// } else if (alarmtime == 0) {
		// alarmtime = 1;
		// }
		int msglen = read_msg();
		if (msglen > CommagentConfig.MAXDLEN + CommagentConfig.HEADLEN) {
			return -1;
		}
		if (databuf.getTransnum() == 0) {
			u_t_existtime = atoni(databuf.getCodetime());
			u_t_lasttime = tt;
		}
		if (databuf.getFinished() == CommagentConfig.ISTRUE) {
			u_t_existtime = 0;
			return 0;
		} else {
			return 1;
		}
	}

	/**
	 * �÷������ڴ���һ�����İ������洢��databuf��
	 * 
	 * @param msgtype
	 * @param appid
	 * @param msg
	 * @param flag
	 * @param timeout
	 * @return -1 -3 appid 1
	 */
	private int createmsg(byte msgtype, String appid, byte[] msg, int flag,
			String transcode, int timeout) {
		databuf.init((byte) '0');
		try {
			databuf.setMsgflag(CommagentConfig.MSGFLAG);
			databuf.setVersion(CommagentConfig.VER01);
			if ((flag & CommagentConfig.MSGBEGIN) == CommagentConfig.MSGBEGIN) {
				u_t_counter = 0;
				u_t_transid++;
				u_t_existtime = System.currentTimeMillis() + timeout;
			}
			if ((flag & CommagentConfig.MSGCONTINUE) == CommagentConfig.MSGCONTINUE) {
				u_t_counter++;
			}
			if ((flag & CommagentConfig.MSGEND) == CommagentConfig.MSGEND) {
				databuf.setFinished(CommagentConfig.ISTRUE);
			} else {
				databuf.setFinished(CommagentConfig.NOTTRUE);
			}
			databuf.setMsgtype(msgtype);
			databuf.setAppid(appid);
			/*
			 * ��1.0.4����������ǰ�Ŀͻ���API�У�appid�и�Ҫ�������[500000,999999]�����Χ֮�ڣ�
			 * ���������Χ������ȷ����������Ϣ�������send_msg_cli��������ķ����룬
			 * ��ʱ��ֵΪ-2��������ʹ����ע��appid��ȡֵ��Χ������ǰ���룺 int app =
			 * Integer.parseInt(appid); if (app >= 500000 && app <= 999999) {
			 * databuf.setAppid(appid); } else { return -3; }
			 */
			databuf.setTransid(u_t_transid);
			databuf.setTransnum(u_t_counter);
			databuf.setCodetime(timeout);
			databuf.setTranscode(transcode);
			databuf.setMsgbody(msg);
		} catch (SetFieldException e) {
			e.printStackTrace();
		}
		return 1;
	}

	/**
	 * 
	 * @param addr
	 * @param port
	 * @return
	 */
	public static CommagentContext conn_server(String addr, int port) {
		CommagentContext commCtrl = new CommagentContext();
		commCtrl.u_t_CommSockid = null;
		try {
			commCtrl.u_t_CommSockid = new Socket(addr, port);
			commCtrl.inputStream = commCtrl.u_t_CommSockid.getInputStream();
			commCtrl.outputStream = commCtrl.u_t_CommSockid.getOutputStream();
			commCtrl.databuf = new CommagentMessage();
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return commCtrl;
	}

	public static CommagentContext conn_server(String addr, int port,
			int timeout) {
		CommagentContext commCtrl = new CommagentContext();
		commCtrl.u_t_CommSockid = null;
		try {
			commCtrl.u_t_CommSockid = new Socket();
			commCtrl.u_t_CommSockid.connect(new InetSocketAddress(addr, port),
					timeout * 1000);
			commCtrl.u_t_CommSockid.setSoTimeout(timeout * 1000);
			commCtrl.inputStream = commCtrl.u_t_CommSockid.getInputStream();
			commCtrl.outputStream = commCtrl.u_t_CommSockid.getOutputStream();
			commCtrl.databuf = new CommagentMessage();
		} catch (ConnectException e) {
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return commCtrl;
	}

	/**
	 * 
	 * @param msgtype
	 * @param app
	 * @param msg
	 * @param flag
	 * @param transcode
	 * @param timeout
	 * @return -2��ʾ��������ʧ�� -1 ��ʾ�����쳣���ɹ����ط��͵��ֽ���
	 */
	public int send_msg_cli(byte msgtype, String app, String msg, int flag,
			String transcode, int timeout) {
		return this.send_msg_cli(msgtype, app, msg.getBytes(), flag, transcode,
				timeout);
	}

	public int send_msg_cli(byte msgtype, String app, byte[] msg, int flag,
			String transcode, int timeout) {
		if (createmsg(msgtype, app, msg, flag, transcode, timeout) < 0) {
			return -2;
		}
		byte[] temp = null;
		try {
			temp = databuf.getAsByteArray();
			outputStream.write(temp);
			
		} catch (IOException e) {
			e.printStackTrace();
			return -1;
		}
		return temp.length;
	}

	public CommagentMessage recv_msg_cli() throws Exception {
		int ret = read_msg();
		if (ret > 0) {
			return databuf;
		}
		return null;
	}

	public void stop_conn() {
		try {
			inputStream.close();
			outputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				u_t_CommSockid.close();
			} catch (Exception ee) {
				ee.printStackTrace();
			}

		}
	}

	public void sendMessage(byte msgtype, String appid, String message,
			String transcode, int timeout) throws IOException {
		this
				.sendMessage(msgtype, appid, message.getBytes(), transcode,
						timeout);
	}

	public void sendMessage(String appid, String transcode, String mml,
			int timeout) throws IOException {
		sendMessage(CommagentConfig.MSGREQUEST, appid, mml, transcode, timeout);
	}

	public void sendMessage(byte msgtype, String appid, byte[] message,
			String transcode, int timeout) throws IOException {
		int maxMsgBodyLen = CommagentConfig.MAXDLEN;
		int len = message.length;

		if (len <= maxMsgBodyLen) {// ��������
			createmsg(msgtype, appid, message, CommagentConfig.MSGBEGIN
					| CommagentConfig.MSGEND, transcode, timeout);
			send_msg();
		} else {// �������
			byte[] temp = new byte[maxMsgBodyLen];
			int index = 0;
			int flag = CommagentConfig.MSGBEGIN;
			while (index < len) {
				if (len - index >= maxMsgBodyLen) {
					System.arraycopy(message, index, temp, 0, maxMsgBodyLen);
					index += maxMsgBodyLen;
					createmsg(msgtype, appid, temp, flag, transcode, timeout);
					if (len - index == maxMsgBodyLen) {
						flag = CommagentConfig.MSGEND;
					} else {
						flag = CommagentConfig.MSGCONTINUE;
					}
					send_msg();
				} else {// ���һ��
					int last = len - index;
					temp = new byte[last];
					System.arraycopy(message, index, temp, 0, last);
					this.createmsg(msgtype, appid, temp,
							CommagentConfig.MSGEND, transcode, timeout);
					send_msg();
					break;
				}
			}
		}
	}

	public byte[] readMessageAsByteArray() throws Exception {
		int ret = read_msg();
		byte[] result = null;
		if (ret >= 0) {
			if (databuf.getFinished() == CommagentConfig.ISTRUE) {// ����
				return databuf.getMsgbodyAsByteArray();
			} else {
				result = new byte[CommagentConfig.MAXDLEN];
				System.arraycopy(databuf.getMsgbodyAsByteArray(), 0, result, 0,
						CommagentConfig.MAXDLEN);
				while (true) {
					ret = read_msg();
					if (ret >= 0) {
						int index = result.length;
						int readLen = databuf.getMsglength();
						byte[] temp = new byte[index + readLen];
						System.arraycopy(result, 0, temp, 0, index);
						System.arraycopy(databuf.getMsgbodyAsByteArray(), 0,
								temp, index, databuf.getMsglength());
						result = temp;
						if (databuf.getFinished() == CommagentConfig.ISTRUE) {
							break;
						}
					} else {
						break;
					}
				}
			}
		}
		return result;
	}

	public String readMessageAsString() throws Exception {
		byte[] temp = readMessageAsByteArray();
		if (temp != null) {
			return new String(temp);
		} else {
			return null;
		}
	}

	public CommagentMessage getDatabuf() {
		return databuf;
	}
}
