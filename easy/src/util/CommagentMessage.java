package util;

import java.util.Arrays;



/**
 * <p>Title: 应用集成平台：通信管理模块数据包对象</p>
 * <p>Description: 用于将Commagent的报文和对象之间的转换</p>
 * <p>Copyright: Copyright (c) 2009</p>
 * <p>Company: si-tech</p>
 * 
 * @author machunlin
 * @version 1.0
 */

public class CommagentMessage {
	
	private byte[] msgflag = new byte[CommagentConfig.msgflag_LEN];           /*消息头标志*/

	private byte[] version = new byte[CommagentConfig.version_LEN];             /*消息版本*/

	private byte finished;                                                                                          /*是否是最后一包*/

	private byte msgtype;                                                                                          /*消息类型*/

	private byte[] msglength = new byte[CommagentConfig.msglength_LEN];   /*消息长度*/

	private byte[] appid = new byte[CommagentConfig.appid_LEN];                   /*服务ID*/

	private byte[] transid = new byte[CommagentConfig.transid_LEN];            /* */

	private byte[] transnum = new byte[CommagentConfig.transnum_LEN];     /* */

	private byte[] codetime = new byte[CommagentConfig.codetime_LEN];      /* */
	private byte[] positionid = new byte[CommagentConfig.positionid_LEN];    /* */

	private byte[] userid = new byte[CommagentConfig.userid_LEN];                /* */

	private byte[] streamid = new byte[CommagentConfig.streamid_LEN];       /* */
	
	private byte[] priority = new byte[CommagentConfig.priority_LEN];           /* */
	
	private byte[] transcode = new byte[CommagentConfig.transcode_LEN];  /* */

	private byte[] msgbody;  
	/* */

	public CommagentMessage() {
		init((byte) '0');
	}

	/**
	 * 根据byteArrayMessage创建CommagentMessage对象
	 * 
	 * @param byteArrayMessage
	 * @throws RuntimeException
	 */
	public CommagentMessage(byte[] byteArrayMessage) throws RuntimeException {
		set(byteArrayMessage);
	}
	
	/**
	 * 根据字符串创建CommagentMessage对象
	 * 
	 * @param stringMessage
	 * @throws RuntimeException
	 */
	public CommagentMessage(String stringMessage) throws RuntimeException {
		this(stringMessage.getBytes());
	}
	
	/**
	 * 根据byteArrayMessage设置CommagentMessage对象，可用于该对象的重新赋值
	 * @param byteArrayMessage
	 */
	public void set(byte[] byteArrayMessage) {
		int length = byteArrayMessage.length;
		int index = 0;
		System.arraycopy(byteArrayMessage, index, msgflag, 0, CommagentConfig.msgflag_LEN);
		index += CommagentConfig.msgflag_LEN;
		System.arraycopy(byteArrayMessage, index, version, 0, CommagentConfig.version_LEN);
		index += CommagentConfig.version_LEN;
		finished = byteArrayMessage[index++];
		msgtype = byteArrayMessage[index++];
		System.arraycopy(byteArrayMessage, index, msglength, 0, CommagentConfig.msglength_LEN);
		index += CommagentConfig.msglength_LEN;
		System.arraycopy(byteArrayMessage, index, appid, 0, CommagentConfig.appid_LEN);
		index += CommagentConfig.appid_LEN;
		System.arraycopy(byteArrayMessage, index, transid, 0, CommagentConfig.transid_LEN);
		index += CommagentConfig.transid_LEN;
		System.arraycopy(byteArrayMessage, index, transnum, 0, CommagentConfig.transnum_LEN);
		index += CommagentConfig.transnum_LEN;
		System.arraycopy(byteArrayMessage, index, codetime, 0, CommagentConfig.codetime_LEN);
		index += CommagentConfig.codetime_LEN;
		System.arraycopy(byteArrayMessage, index, positionid, 0, CommagentConfig.positionid_LEN);
		index += CommagentConfig.positionid_LEN;
		System.arraycopy(byteArrayMessage, index, userid, 0, CommagentConfig.userid_LEN);
		index += CommagentConfig.userid_LEN;
		System.arraycopy(byteArrayMessage, index, streamid, 0, CommagentConfig.streamid_LEN);
		index += CommagentConfig.streamid_LEN;
		System.arraycopy(byteArrayMessage, index, priority, 0, CommagentConfig.priority_LEN);
		index += CommagentConfig.priority_LEN;
		System.arraycopy(byteArrayMessage, index, transcode, 0, CommagentConfig.transcode_LEN);
		index += CommagentConfig.transcode_LEN;
		int len = length - index;
		if (len > 0) {
			msgbody = new byte[len];
			System.arraycopy(byteArrayMessage, index, msgbody, 0, len);
		}
	}

	/**
	 * 用于将该对象的数据部分设置为给定的字符
	 * 
	 * @param character
	 */
	public void init(byte character) {
		initHead(character);
		msgbody = null;
	}

	/**
	 * 用于将该对象的数据头部分设置为给定的字符
	 * 
	 * @param character
	 */
	private void initHead(byte character) {
		initArray(msgflag, character);
		initArray(version, character);
		finished = character;
		msgtype = character;
		
		initArray(msglength, character);
		initArray(appid, character);
		initArray(transid, character);
		initArray(transnum, character);
		initArray(codetime, character);
		initArray(positionid, character);
		initArray(userid, character);
		initArray(streamid, character);
		initArray(priority, character);
		initArray(transcode, (byte)' ');
	}

	public String getAppid() {
		return new String(appid);
	}

	public void setAppid(String appid) throws SetFieldException {
		byte[] temp = appid.getBytes();
		int len = CommagentConfig.appid_LEN;
		int actlen = temp.length;
		if (len == actlen) {
			this.appid = temp;
		} else if (actlen < len) {
			System.arraycopy(temp, 0, this.appid, len - actlen, actlen);
		} else {
			throw new SetFieldException(this.getClass().getName()+"::setAppid(int appid), appid is too bigger!");
		}
	}

	public int getPositionid() {
		return Integer.parseInt(new String(positionid));
	}

	public void setPositionid(int clientid) throws SetFieldException {
		String client = "" + clientid;
		byte[] temp = client.getBytes();
		int len = CommagentConfig.positionid_LEN;
		int actlen = temp.length;
		if (len == actlen) {
			this.positionid = temp;
		} else if (actlen < len) {
			System.arraycopy(temp, 0, this.positionid, len - actlen, actlen);
		} else {
			throw new SetFieldException(this.getClass().getName() + "::setClient(int clientid), clientid is too bigger!");
		}
	}

	public String getCodetime() {
		return new String(codetime);
	}

	public void setCodetime(int codetime) throws SetFieldException {
		String code = "" + codetime;
		byte[] temp = code.getBytes();
		int len = CommagentConfig.codetime_LEN;
		int actlen = temp.length;
		if (len == actlen) {
			this.codetime = temp;
		} else if (actlen < len) {
			System.arraycopy(temp, 0, this.codetime, len - actlen, actlen);
			System.out.println(new String(this.codetime,len - actlen,actlen));
		} else {
			throw new SetFieldException(this.getClass().getName()+ "::setCodetime(int codetime), codetime is too bigger!");
		}
	}

	public byte getFinished() {
		return finished;
	}

	public void setFinished(byte finished) {
		this.finished = finished;
	}

	public String getMsgbodyAsString() {
		if (msgbody != null) {
			return new String(msgbody);
		} else {
			return "";
		}
	}

	public byte[] getMsgbodyAsByteArray() {
		return this.msgbody;
	}

	public void setMsgbody(String stringMessage) throws SetFieldException {
		if (stringMessage != null) {
			msgbody = stringMessage.getBytes();
			setMsglength(msgbody.length);
		}
	}

	public void setMsgbody(byte[] byteArrayMessage) throws SetFieldException {
		if (byteArrayMessage != null) {
			initArray(msglength, (byte) '0');
			int srcLen=0;
			if(msgbody!=null) srcLen=msgbody.length;
			byte[] tsp=new byte[srcLen+byteArrayMessage.length];
			if(msgbody!=null) System.arraycopy(msgbody, 0, tsp, 0, srcLen);
			System.arraycopy(byteArrayMessage, 0, tsp, srcLen, byteArrayMessage.length);
			
			
			//System.out.println("tsp="+new String(tsp));
			msgbody = tsp;
			setMsglength(tsp.length);
			
		}
	}

	public String getMsgflag() {
		return new String(msgflag);
	}

	public void setMsgflag(String msgflag) throws SetFieldException {
		int len = CommagentConfig.msgflag_LEN;
		byte[] temp = msgflag.getBytes();
		int actlen = temp.length;
		if (len == actlen) {
			this.msgflag = temp;
		} else if (actlen < len) {
			System.arraycopy(temp, 0, this.msgflag, len - actlen, actlen);
		} else {
			throw new SetFieldException(this.getClass().getName() + "::setMsgflag(String msgflag), msgflag is too big!");
		}
	}

	public int getMsglength() {
		return Integer.parseInt(new String(msglength));
	}

	private void setMsglength(int msglength) throws SetFieldException {
		String msglen = "" + msglength;
		byte[] temp = msglen.getBytes();
		int len = CommagentConfig.msglength_LEN;
		int actlen = temp.length;
		if (len == actlen) {
			this.msglength = temp;
		} else if (actlen < len) {
			System.arraycopy(temp, 0, this.msglength, len - actlen, actlen);
		} else {
			//throw new SetFieldException(this.getClass().getName() + "::setMsglength(int msglength), msgflag is too bigger!");
		}
		

	}

	public byte getMsgtype() {
		return msgtype;
	}

	public void setMsgtype(byte msgtype) {
		this.msgtype = msgtype;
	}

	public int getStreamid() {
		return Integer.parseInt(new String(streamid));
	}

	public void setStreamid(int streamid) throws SetFieldException {
		String stream = "" + streamid;
		byte[] temp = stream.getBytes();
		int len = CommagentConfig.streamid_LEN;
		int actlen = temp.length;
		if (len == actlen) {
			this.streamid = temp;
		} else if (actlen < len) {
			System.arraycopy(temp, 0, this.streamid, len - actlen, actlen);
		} else {
			throw new SetFieldException(this.getClass().getName() + "::setStreamid(int streamid), streamid is too bigger!");
		}
	}
	
	public int getPriority() {
		return Integer.parseInt(new String(priority));
	}
	
	public void setPriority(int priority) throws SetFieldException{
		String pri = "" + priority;
		byte[] temp = pri.getBytes();
		int len = CommagentConfig.priority_LEN;
		int actlen = temp.length;
		if(len == actlen) {
			this.priority = temp;
		} else if(actlen < len) {
			System.arraycopy(temp, 0, this.priority, len-actlen, actlen);
		} else {
			throw new SetFieldException(this.getClass().getName() +"::setPriority(int priority) error!");
		}
	}
	
	public String getTranscode() {
		return new String(transcode).trim();
	}
	
	public void setTranscode(String transcode) throws SetFieldException {
		byte[] temp = transcode.getBytes();
		if(temp.length >= CommagentConfig.transcode_LEN) {
			byte[] tmp = new byte[CommagentConfig.transcode_LEN];
			System.arraycopy(temp, 0, tmp, 0, CommagentConfig.transcode_LEN);
			temp = tmp;
		}
		int len = CommagentConfig.transcode_LEN;
		int actlen = temp.length;
		if (len == actlen) {
			this.transcode = temp;
		} else if (actlen < len) {
			System.arraycopy(temp, 0, this.transcode, len-actlen, actlen);
		} else {
			throw new SetFieldException(this.getClass().getName() + "::setTranscode(int transcode), transcode is too big!");
		}
	}

	public int getTransid() {
		return Integer.parseInt(new String(transid));
	}

	public void setTransid(int transid) throws SetFieldException {
		String trans = "" + transid;
		byte[] temp = trans.getBytes();
		int len = CommagentConfig.transid_LEN;
		int actlen = temp.length;
		if (len == actlen) {
			this.transid = temp;
		} else if (actlen < len) {
			System.arraycopy(temp, 0, this.transid, len - actlen, actlen);
		} else {
			throw new SetFieldException(this.getClass().getName() + "::setTransid(int transid), transid is too big!");
		}
	}

	public int getTransnum() {
		return Integer.parseInt(new String(transnum));
	}

	public void setTransnum(int transnum) throws SetFieldException {
		String trans = "" + transnum;
		int len = CommagentConfig.transnum_LEN;
		byte[] temp = trans.getBytes();
		int actlen = temp.length;
		if (len == actlen) {
			this.transnum = temp;
		} else if (actlen < len) {
			System.arraycopy(temp, 0, this.transnum, len - actlen, actlen);
		} else {
			throw new SetFieldException(this.getClass().getName() + "::setTransnum(int transnum), transnum is too big!");
		}
	}

	public String getUserid() {
		return new String(userid);
	}

	public void setUserid(String userid) throws SetFieldException {
		int len = CommagentConfig.userid_LEN;
		byte[] temp = userid.getBytes();
		int actlen = temp.length;
		if (len == actlen) {
			this.userid = temp;
		} else if (actlen < len) {
			System.arraycopy(temp, 0, this.userid, len - actlen, actlen);
		} else {
			throw new SetFieldException(this.getClass().getName() + "::setUserid(String userid), userid is too big!");
		}
	}

	public String getVersion() {
		return new String(version);
	}

	public void setVersion(String version) throws SetFieldException {
		int len = CommagentConfig.version_LEN;
		byte[] temp = version.getBytes();
		int actlen = temp.length;
		if (actlen == len) {
			this.version = temp;
		} else if (actlen < len) {
			System.arraycopy(temp, 0, this.version, len - actlen, actlen);
		} else {
			throw new SetFieldException(this.getClass().getName() + "::setVersion(String version), version is too big!");
		}
	}
	
	/**
	 * 该方法用给定字符填充byte数组
	 * @param charArray
	 * @param character
	 */
	private void initArray(byte[] charArray, byte character) {
		for (int i = charArray.length - 1; i >= 0; i--) {
			charArray[i] = character;
		}
	}

	/**
	 * 得到该对象的字符串形式
	 * @return
	 */
	public String getAsString() {
		return new String(this.getAsByteArray());
	}

	/**
	 * 得到该对象的byte数组形式
	 * @return
	 */
	public byte[] getAsByteArray() {
		byte[] byteArray = new byte[CommagentConfig.HEADLEN + this.getMsglength()];
		int index = 0;
		System.arraycopy(msgflag, 0, byteArray, index, CommagentConfig.msgflag_LEN);
		index += CommagentConfig.msgflag_LEN;
		System.arraycopy(version, 0, byteArray, index, CommagentConfig.version_LEN);
		index += CommagentConfig.version_LEN;
		byteArray[index++] = finished;
		byteArray[index++] = msgtype;
		System.arraycopy(msglength, 0, byteArray, index, CommagentConfig.msglength_LEN);
		index += CommagentConfig.msglength_LEN;
		System.arraycopy(appid, 0, byteArray, index, CommagentConfig.appid_LEN);
		index += CommagentConfig.appid_LEN;
		System.arraycopy(transid, 0, byteArray, index, CommagentConfig.transid_LEN);
		index += CommagentConfig.transid_LEN;
		System.arraycopy(transnum, 0, byteArray, index, CommagentConfig.transnum_LEN);
		index += CommagentConfig.transnum_LEN;
		System.arraycopy(codetime, 0, byteArray, index, CommagentConfig.codetime_LEN);
		index += CommagentConfig.codetime_LEN;
		System.arraycopy(positionid, 0, byteArray, index, CommagentConfig.positionid_LEN);
		index += CommagentConfig.positionid_LEN;
		System.arraycopy(userid, 0, byteArray, index, CommagentConfig.userid_LEN);
		index += CommagentConfig.userid_LEN;
		System.arraycopy(streamid, 0, byteArray, index, CommagentConfig.streamid_LEN);
		index += CommagentConfig.streamid_LEN;
		System.arraycopy(priority, 0, byteArray, index, CommagentConfig.priority_LEN);
		index += CommagentConfig.priority_LEN;
		System.arraycopy(transcode, 0, byteArray, index, CommagentConfig.transcode_LEN);
		index += CommagentConfig.transcode_LEN;
		if (msgbody != null) {
			System.arraycopy(msgbody, 0, byteArray, index, this.getMsglength());
		}
		return byteArray;
	}

	public CommagentMessage getHeader() throws SetFieldException {
		byte[] header = new byte[CommagentConfig.HEADLEN];
		System.arraycopy(this.getAsByteArray(), 0, header, 0, CommagentConfig.HEADLEN);
		CommagentMessage headerObj = new CommagentMessage(header);
		initArray(headerObj.msglength, (byte)'0');
		return headerObj;
	}
	
	public String getHeaderString() {
		byte[] header = new byte[CommagentConfig.HEADLEN];
		System.arraycopy(this.getAsByteArray(), 0, header, 0, CommagentConfig.HEADLEN);
		return new String(header);
	}

	public String toString() {
		StringBuffer strbuf = new StringBuffer();
		strbuf.append("msgflag = " + new String(msgflag));
		strbuf.append("\nversion = " + new String(version));
		strbuf.append("\nfinished = " + (char) finished);
		strbuf.append("\nmsgtype = " + (char) msgtype);
		strbuf.append("\nmsglength = " + new String(msglength));
		strbuf.append("\nappid = " + new String(appid));
		strbuf.append("\ntransid = " + new String(transid));
		strbuf.append("\ntransnum = " + new String(transnum));
		strbuf.append("\ncodetime = " + new String(codetime));
		strbuf.append("\npositionid = " + new String(positionid));
		strbuf.append("\nuserid = " + new String(userid));
		strbuf.append("\nstreamid = " + new String(streamid));
		strbuf.append("\npriority = " + new String(priority));
		strbuf.append("\ntranscode = " + new String(transcode));
		if (msgbody != null) {
			strbuf.append("\nmsgbody=" + new String(msgbody));
		} else {
			strbuf.append("\nmsgbody is null");
		}
		return strbuf.toString();
	}
}
