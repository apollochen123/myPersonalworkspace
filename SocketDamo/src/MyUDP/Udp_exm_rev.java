package MyUDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class Udp_exm_rev extends Thread {

    @Override//注解重写Thread函数的run函数
    public void run() {
    	//声明一个DatagramSocket对象
    	DatagramSocket socket=null;
         try {
        	 try{
        	 //绑定socket到端口号8888
               socket = new DatagramSocket(8889);
        	 }catch(Exception e){
        		 System.out.println("DatagramSocket create file");
        	 }
            byte[] buf = new byte[1024];
            //把字符串打包成数据报
            DatagramPacket packet = new DatagramPacket(buf, buf.length);
            boolean flag = true;
            while(flag){
                 	//接收数据报
                   socket.receive(packet);
                   System.out.println("接收到消息:"+new String(buf,0,packet.getLength()));
                }
             socket.close();
           }catch (IOException e) {
                   e.printStackTrace();
                  }
         }

        }