package jframe;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

public class MyCanvas extends Canvas{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage img;
	private Image image;
	private int image_width;
	private int image_height;
	
	//传入图片
	public void setImage(BufferedImage img){
		this.img=img;
		this.zoom();
	}

	public void zoom() {
		this.image_width=img.getWidth();
		this.image_height=img.getHeight();
		image=img.getScaledInstance(image_width, image_height, Image.SCALE_SMOOTH);
		
	}
	public void paint(Graphics g){
		g.drawImage(image,0,0,this.getWidth(),this.getHeight(),this);
		
	}
	

}
