package socket_demo;
import java.io.*;
import java.net.*;

public class RemoteFileClient {
	protected BufferedReader socketReader;//声明一恶搞输入流
	protected PrintWriter socketWriter;//声明一个字符串输出流
	protected String hostIp;
	protected int hostPort;
	
	//构造函数 
	public RemoteFileClient(String hostIp,int hostPort){
		this.hostIp=hostIp;
		this.hostPort=hostPort;
	}
	
	//向服务器请求的文件内容
	public String getFile(String fileNameToGet){
		//声明一个StringBuffer类，用法类似String类，但是
		//StringBuffer在进行字符串处理时，不生成新的对象，在内存使用上要优于String类
		//经常需要对一个字符串进行修改，例如插入、删除等操作，使用StringBuffer要更加适合一些
		StringBuffer fileLines=new StringBuffer();
		try{
			socketWriter.println(fileNameToGet);//请求文件名
			socketWriter.flush();//使用flush,发送请求，但不关闭socket
			String line=null;
			//当socketReader这个输入流不为空时，使用socketReader+\n构造StringBuffer类fileLines对象
			while((line=socketReader.readLine())!=null){
				fileLines.append(line+"\n");
			}	
		}catch(IOException e){
			System.out.println("Error reading from file:"+fileNameToGet+e);;
		}
		return fileLines.toString();
	}
	//连接到服务器
	public void setUpConnection(){
		try{
			@SuppressWarnings("resource")
			Socket socket=new Socket(hostIp,hostPort);
			//把socket的getInputStream包装进BufferedReader类，方便我们读取行
			socketReader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//把socket的getOutputStream包装进printWriter类，发送文件请求
			socketWriter=new PrintWriter(socket.getOutputStream());
		}catch(UnknownHostException e){
			System.out.println("UnknownHost at"+hostIp+hostPort);
		}catch(IOException e){
			System.out.println("connection:"+e);
		}
		
	}
	public void tearDownConnection(){
		try{
			socketWriter.close();
			socketReader.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void main(String args[]){
		//构造实体
		RemoteFileClient remoteFileClient=new RemoteFileClient("127.0.0.1",8888);
		//连接到服务器
		remoteFileClient.setUpConnection();
		//实例化一个空的字符串
		StringBuffer fileConnects=new StringBuffer();
		//空字符串写入名字为。。。
		fileConnects.append(remoteFileClient.getFile("E:/1.txt"));
		//打印
		System.out.println(fileConnects.toString());
		//关闭
		//remoteFileClient.tearDownConnection();

	}
	
	

}
