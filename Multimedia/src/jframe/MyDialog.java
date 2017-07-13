package jframe;

import java.awt.*;

import javax.swing.* ;

public class MyDialog extends JDialog{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyDialog(MyFrame frame){
		super(frame,"第一个JDiaLog窗体",true);
		Container container=getContentPane();
		container.add(new JLabel("aaaaaa"));
		setBounds(120,120,100,100);
		
	}

}
