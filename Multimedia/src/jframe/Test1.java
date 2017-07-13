package jframe;

import java.awt.*;

import javax.swing.*;

public class Test1 extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void CreatJFrame(String title){
		JFrame jf=new JFrame(title); //new 一个窗口对象
		Container container=jf.getContentPane(); //获取一个容器
		JLabel jl=new JLabel("这是一个新的窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);//设置居中
		container.add(jl);
		container.setBackground(Color.white);
		jf.setVisible(true);
		jf.setSize(400, 200);
		//设置窗体关闭方式
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		Test1 a=new Test1();
		a.CreatJFrame("66666666");
		
	}
	
	

}
