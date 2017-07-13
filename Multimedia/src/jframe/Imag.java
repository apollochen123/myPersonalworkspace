package jframe;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import java.util.Random;

import javax.swing.*;





public class Imag extends Canvas {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	

	public static void main(String args[]){

		
		final Font mFont =new Font("Arial Black", Font.PLAIN, 16);
		final int IMG_WIDTH=200;
		final int IMG_HEIGHT=18;
		JFrame f=new JFrame();
		MyCanvas mc=new MyCanvas();
		f.add(mc);
		try{
//			File file=new File("D:/diao.png");
//			BufferedImage img=ImageIO.read(file);
			BufferedImage image = new BufferedImage
					(IMG_WIDTH , IMG_HEIGHT , BufferedImage.TYPE_INT_RGB);
				Graphics g = image.getGraphics();
				Random random = new Random();
				g.setColor(getRandColor(200 , 250));
				// 填充背景色
				g.fillRect(1, 1, IMG_WIDTH - 1, IMG_HEIGHT - 1);
				// 为图形验证码绘制边框
				g.setColor(new Color(102 , 102 , 102));
				g.drawRect(0, 0, IMG_WIDTH - 1, IMG_HEIGHT - 1);
				g.setColor(getRandColor(160,200));
				// 生成随机干扰线
				for (int i = 0 ; i < 30 ; i++)
				{
					int x = random.nextInt(IMG_WIDTH - 1);
					int y = random.nextInt(IMG_HEIGHT - 1);
					int xl = random.nextInt(6) + 1;
					int yl = random.nextInt(12) + 1;
					g.drawLine(x , y , x + xl , y + yl);
				}
				g.setColor(getRandColor(160,200));
				// 生成随机干扰线
				for (int i = 0 ; i < 30 ; i++)
				{
					int x = random.nextInt(IMG_WIDTH - 1);
					int y = random.nextInt(IMG_HEIGHT - 1);
					int xl = random.nextInt(12) + 1;
					int yl = random.nextInt(6) + 1;
					g.drawLine(x , y , x - xl , y - yl);
				}
				// 设置绘制字符的字体
				g.setFont(mFont);
				// 用于保存系统生成的随机字符串
				String sRand = "";
				for (int i = 0 ; i < 6 ; i++)
				{
					String tmp = getRandomChar();
					sRand += tmp;
					// 获取随机颜色
					g.setColor(new Color(20 + random.nextInt(110)
						,20 + random.nextInt(110)
						,20 + random.nextInt(110)));
					// 在图片上绘制系统生成的随机字符
					g.drawString(tmp , 15 * i + 10,15);
				}
				System.out.println(sRand);
			mc.setImage(image);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		mc.repaint();
		f.setSize(200, 80);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}



	private static String getRandomChar() {
		// 生成一个0、1、2的随机数字
		int rand = (int)Math.round(Math.random() * 2);
		long itmp = 0;
		char ctmp = '\u0000';
		switch (rand)
		{
			// 生成大写字母
			case 1:
				//随机数*25+65,四舍五入 char a=(char)65;a='A'
				itmp = Math.round(Math.random() * 25 + 65);
				ctmp = (char)itmp;
				return String.valueOf(ctmp);
			// 生成小写字母
			case 2:
				itmp = Math.round(Math.random() * 25 + 97);
				ctmp = (char)itmp;
				return String.valueOf(ctmp);
			// 生成数字
			default :
				itmp = Math.round(Math.random() * 9);
				return  itmp + "";
		}
	}



	private static Color getRandColor(int fc, int bc) {
		//生成一个随机数
		Random  random=new Random();
		if(fc>255) fc=255;
		if(bc>255) bc=255;
		//random.nextInt，返回一个0-（bc-fc）的随机整数值
		int r=fc+random.nextInt(bc-fc);
		int g=fc+random.nextInt(bc-fc);
		int b=fc+random.nextInt(bc-fc);
		return new Color(r,g,b);
	}

}
