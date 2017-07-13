package socket_demo;
import java.io.*;
import java.net.*;

public class ConnectionHander implements Runnable {
	
	private Socket socketTohandle;
	public ConnectionHander(Socket socketTohandle){
		System.out.println("线程启动成功");
		this.socketTohandle=socketTohandle;
	}
	
	@Override
	public void run(){
		try{
			//得到一个输出流，指向socket打印输出
			PrintWriter streamWriter= new PrintWriter(socketTohandle.getOutputStream());
			//包装InputStream到BufferedReader,使之能按行读取,得到一个有效路径
			InputStream inputFromSocket=socketTohandle.getInputStream();
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
		}catch(Exception e){
			System.out.println("Error handing a clinet"+e);
			e.printStackTrace();
		}
	
	}

}
