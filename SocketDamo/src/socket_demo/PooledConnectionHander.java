package socket_demo;
import java.io.*;
import java.net.*;
import java.util.*;

public class PooledConnectionHander implements Runnable {
	protected Socket serverConnection;
	//连接池列表
	protected static List<Socket> pool=new LinkedList<Socket>();
	
	//构造函数
	public PooledConnectionHander(){
		
	}
	//处理部分,文件流输出到
	public void handleConnection(){
		try{
			//得到一个输出流，指向socket打印输出
			PrintWriter streamWriter= new PrintWriter(serverConnection.getOutputStream());
			//包装InputStream到BufferedReader,使之能按行读取,得到一个有效路径
			InputStream inputFromSocket=serverConnection.getInputStream();
			BufferedReader streamReader=new BufferedReader(new InputStreamReader(inputFromSocket));
			String fileToRead=streamReader.readLine().toString();
			
			//创建文件读取流
			FileReader fileReader = new FileReader(new File(fileToRead));
		    //包装文件读取流，使之能按行读取
			BufferedReader bufferedFileReader=new BufferedReader(fileReader);
			String line=null;
			while((line=bufferedFileReader.readLine())!=null){
				streamWriter.println(line);
			}
			
			bufferedFileReader.close();
			fileReader.close();
			streamWriter.close();
			streamReader.close();
		}catch(FileNotFoundException e){
			System.out.println("Error handing a clinet"+e);
			e.printStackTrace();
		}catch(IOException e){
			System.out.println("Error in IO:"+e);
		}
		
	}
	
	
	//
	public static void processRequest(Socket requestToHandle){
		synchronized(pool){
			//把传入的Socket对象，添加到Linkedlist的尾端。
			pool.add(pool.size(),requestToHandle);
			System.out.println(requestToHandle.getInetAddress()+":已经连接");
			//通知pool可以用
			pool.notifyAll();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			synchronized(pool){
				while(pool.isEmpty()){
					try{
						pool.wait();
					}catch(InterruptedException e){
						e.printStackTrace();
					}
				}
				
				serverConnection=(Socket)pool.remove(0);
			}
			handleConnection();
		}
		
	}

}
