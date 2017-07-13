package Mytcp;

import java.io.*;
import java.net.*;

public class Client{
	public static void main(String[] args){
		try{
			Socket socket=new Socket("127.0.0.1",4700);//创建套接字并绑定
			BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
			//系统输入BufferedReader对象
			PrintWriter os=new PrintWriter(socket.getOutputStream());
			//由Socket对象得到输出流，并构造PrintWriter对象
			BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//由Socket对象得到输入流，并构造相应的BufferedReader对象
			
			String readline;
			readline=sin.readLine();//从系统标准输入一个字符串
			
			while(!readline.equals("exit")){
				os.println(readline);
				//从系统标准输入读出的字符串输出到Server
				os.flush();//刷新输出流，使server能马上收到该字符串
				System.out.println("Client:"+readline);//系统标准输出上打印读入的字符串
				
				System.out.println("Server:"+is.readLine());//从服务器得到的字符串，并打印
				
				readline=sin.readLine(); //系统标准输入读入一个字符串
			}
			os.close();
			is.close();
			socket.close();
		}catch(Exception e){
			System.out.println(e);//出错打印
		}
	}
}