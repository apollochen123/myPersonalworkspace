package socket_demo;
import java.io.*;
import java.net.*;

public class RemoteFileServer {
	
	private int listenPort;
	//构造函数
	public RemoteFileServer(int listenPort){
		this.listenPort=listenPort;
	}
	
	//完成accept
	public void acceptConnections(){
		try{
			//创建监听套接字
			@SuppressWarnings("resource")
			ServerSocket server=new ServerSocket(listenPort);
			//随机套接字
			Socket incomingConnection=null;
			while(true){
				//随机套接字，接受accept请求
				incomingConnection=server.accept();
				System.out.println("已连接");
				handleConnection(incomingConnection);
			}
		}catch(BindException e){
			System.out.println("Unable band the port："+listenPort);
		}catch(IOException e){
			e.printStackTrace();
		}
	}


	
	
	public void handleConnection(Socket incomingConnection) {
		try{
			//生成一个输出流，指向套接字的输出
			OutputStream outputToSocket=incomingConnection.getOutputStream();
			//生成一个输入流，只想套接字的输入
			InputStream inputFromSocket=incomingConnection.getInputStream();
			//包装输入流
			BufferedReader streamReader=new BufferedReader(new InputStreamReader(inputFromSocket));
			//以输入流，streamReader得到的路径，生成文件，生成文件读取流
		    
			//为什么要必须要赋值再能生成File？
			String a=streamReader.readLine().toString();
			System.out.println(a);
		    FileReader fileReader = new FileReader(new File(a));
			
		
			//包装文件读取流，使之能按行读取
			BufferedReader bufferedFileReader=new BufferedReader(fileReader);
			
			
			
			//包装一个输出流，使其能够按行读取
			PrintWriter streamFileWirter=new PrintWriter(new OutputStreamWriter(outputToSocket));
			String line=null;
			//按行读取文件内容，如果不为空
			while((line=bufferedFileReader.readLine())!=null){
				//按行把读取的内容打印给包装好的输出流，输出给socket
				streamFileWirter.println(line);
					
			}
			fileReader.close();
			streamFileWirter.close();
			streamReader.close();
			
			
			
		}catch(Exception e){
			System.out.println("Error handing a client："+e);
		}
		
	}
	public static void main(String args[]){
		RemoteFileServer remoteFileServer=new RemoteFileServer(8888);
		remoteFileServer.acceptConnections();
	}
	

}
