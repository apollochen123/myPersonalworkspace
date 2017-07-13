package socket_demo;
import java.io.*;
import java.net.*;

public class PooledRemoteServer {
	protected int listenPort;
	protected int MaxListening;
	protected ServerSocket server;
	
	public PooledRemoteServer(int listenPort,int MaxListening){
		this.listenPort=listenPort;
		this.MaxListening=MaxListening;
		
		
	}
	//此函数，创建一个监听套接字，无限等待。有连接时，调用accept接收。调用handleConnection方法。
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
	
	//此函数，把生成的套接字，通过调用处理类PooledConnectionHander的processRequest方法，把套接字存放入list
	private void handleConnection(Socket incomingConnection) {
		
		PooledConnectionHander.processRequest(incomingConnection);
	}
	
	//启动线程池
	public void setUpHandlers(){
		for(int i=0;i<MaxListening;i++){
			//实例化一个处理类
			PooledConnectionHander currentHandler=new PooledConnectionHander();
			//启动一个新线程
			new Thread(currentHandler,"Handler"+i).start();
			
			System.out.println("Handler"+i+"已经启动");
			
		}
	}
	public static void main(String args[]){
		PooledRemoteServer server=new PooledRemoteServer(8888,5);
		server.setUpHandlers();
		server.acceptConnection();
	}
	

}
