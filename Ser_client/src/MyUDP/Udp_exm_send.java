package MyUDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Udp_exm_send extends Thread {
	
	@Override 	//重写父类方法，检查方法的正确性
	public void run(){
		try{
			//创建一个Udp套接字
			DatagramSocket socket=null;
			try{
			socket=new DatagramSocket();
			}catch(Exception e){
				System.out.println("DatagramSocket create file");
			}
			//以系统标准键盘输入创建BufferedReader类
			BufferedReader keyReader=new BufferedReader(new InputStreamReader(System.in));
			//声明一个字符串
			String line=null;
			//创建数据报载体，常见用法：
			//public DatagramPacket(byte []buf, int length)
			DatagramPacket packet=null;
			
			while((line=keyReader.readLine())!=null){
				//发送数据报
				//DatagramPacket(byte []buf,int length,InetAddress address,int port)
				//参数，字符串数组，长度，目的地址和端口号
				packet = new DatagramPacket(line.getBytes(), line.getBytes().length,InetAddress.getByName("127.0.0.1"), 8889);
				
				socket.send(packet);
				System.out.println("您已经发送消息"+line);
			}
			}catch(IOException e){
				e.printStackTrace();
			}
	        }
	    
	}


