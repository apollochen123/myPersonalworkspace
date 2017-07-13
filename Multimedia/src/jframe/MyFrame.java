package jframe;

import java.awt.*;
import java.awt.event.*;

import javax.swing.* ;
public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		new MyFrame();

	}
	public MyFrame(){
		Container container=getContentPane();
		container.setLayout(null);
		JLabel jl=new JLabel("这是一个新的窗体");
		jl.setHorizontalAlignment(SwingConstants.CENTER);//设置居中
		container.add(jl);
		container.setBackground(Color.white);
		JButton bl=new JButton("弹出对话框");
		bl.setBounds(150,50, 100, 20);
		bl.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				new MyDialog(MyFrame.this).setVisible(true);
			}
		});
		container.add(bl);
		this.setVisible(true);
		this.setSize(400, 200);
		//设置窗体关闭方式
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	

}
