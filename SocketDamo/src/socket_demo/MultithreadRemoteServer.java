package socket_demo;
import java.net.*;
import java.io.*;

public class MultithreadRemoteServer {
	
	private int listenPort;
	private int MaxListening;
	public MultithreadRemoteServer(int listenPort,int MaxListening){
		this.listenPort=listenPort;
		this.MaxListening=MaxListening;
	}
	//处理连接
	public void acceptConnection(){
		try{
			@SuppressWarnings("resource")
			ServerSocket server=new ServerSocket(listenPort,MaxListening);
			Socket incomingConnection=null;
			while(true){
				incomingConnection=server.accept();
				System.out.println("建立连接成功");
				handleConnection(incomingConnection);
			}
		}catch(BindException e){
			System.out.println("can not bind connection:"+e);
		}catch(IOException e){
			System.out.println("have some question in IO:"+e);
		}
	}
	
     //生成新的线程
	public void handleConnection(Socket incomingConnection) {
		
		//启动一个新的线程
		System.out.println("准备启动一个新线程");
		new Thread(new ConnectionHander(incomingConnection)).start();	
	}
	

	public static void main(String[] args) {
		MultithreadRemoteServer multithreadRemoteServer=new MultithreadRemoteServer(8888,5);
		multithreadRemoteServer.acceptConnection();

	}

}
