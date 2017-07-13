package jframe;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.media.*;
public class Vedio implements  ControllerListener {
    private int videoWidth=0;
    private int videoHeight=0;
    private int controlHeight=30;
    private int insetWidth = 20;
    private int insetHeight=30;
   
    private Player player;
	private Frame f; //定义窗口文件
	private Player mediaPlayer;
    private Component visual;//定义容器
    private Component control;
    @SuppressWarnings("unused")
	private Panel panel;
    
   
	@Override
	public void controllerUpdate(ControllerEvent ce) {
		// TODO Auto-generated method stub
		if(ce instanceof RealizeCompleteEvent ){
			//player实例化完成后进行player播放前预处理 
			player.prefetch();  
		}
		else if(ce instanceof PrefetchCompleteEvent){
			if (visual != null) 
				return;  
			//取得player中的播放视频的组件，并得到视频窗口的大小  
			//然后把视频窗口的组件添加到Frame窗口中
			if((visual=player.getVisualComponent())!=null){
				Dimension size=visual.getPreferredSize();
				videoWidth=size.width;
				videoHeight=size.height;
				f.add(visual);
			}
			else{
				videoWidth=320;
			}
			 //取得player中的视频播放控制条组件，并把该组件添加到Frame窗口
			if((control=player.getControlPanelComponent())!=null){
				 controlHeight = control.getPreferredSize().height;
				 f.add(control, BorderLayout.SOUTH);  
			}
			//设定Frame窗口的大小，使得满足视频文件的默认大小 
			f.setSize(videoWidth+insetWidth,videoHeight+controlHeight+insetHeight);
			f.validate();
			//启动播放
			player.start();
			mediaPlayer.start();
		}
		else if(ce instanceof EndOfMediaEvent){
			player.setMediaTime(new Time(0));
			player.start();
		}
		
	}

    
    public void play(){
    	f=new Frame("简单的视频播放");
    	f.addWindowListener(new WindowAdapter(){
    		 public void windowClosing(WindowEvent we) {
    			 if(player != null) {
    				 player.close();  
    			 }
    			 System.exit(0);
    		 }
    	});
    	f.setSize(500,400);//窗口大小
    	f.setVisible(true);//可视化true
    	//获取视频播放的源地址
    	URL url=null;
    	
    	try{
    		url=new URL("file:/D:/2.avi");
    	}catch(MalformedURLException e){
    		e.printStackTrace();
    	}
    	//通过调用Manager的createPlayer方法来创建一个Player的对象 
    	//这个对象是媒体播放的核心控制对象 
    	try{
    		player=Manager.createPlayer(url);
    	}catch(NoPlayerException e1){
    		e1.printStackTrace();
    	}catch(IOException e1){
    		e1.printStackTrace();
    	}
    	player.addControllerListener(this);
    	player.realize();
    	
    }
    public static void main(String args[]){
    	Vedio v=new Vedio();
    	v.play();
    }
 
    
    

}
