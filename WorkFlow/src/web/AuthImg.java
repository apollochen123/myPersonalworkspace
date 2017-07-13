package web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.*;
import java.awt.*;
import java.awt.image.*;
import java.util.*;
import javax.imageio.*;


@WebServlet(urlPatterns={"/WEB-INF/content/authImg.jsp"})
public class AuthImg extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// 定义图形验证码中绘制字符的字体
	private final Font mFont =
		new Font("Arial Black", Font.PLAIN, 16);
	// 定义图形验证码的大小
	private final int IMG_WIDTH = 100;
	private final int IMG_HEIGTHT = 18;
	// 定义一个获取随机颜色的方法
	private Color getRandColor(int fc,int bc)
	{
		//生成一个随机数
		Random random = new Random();
		if(fc > 255) fc = 255;
		if(bc > 255) bc=255;
		//random.nextInt，返回一个0-（bc-fc）的随机整数值
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		// 得到随机颜色
		return new Color(r , g , b);
	}
	// 重写service方法，生成对客户端的响应
	public void service(HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, IOException
	{
		// 设置禁止缓存
		//设置页面不缓存
		//Pragma:设置页面是否缓存，为Pragma则缓存，no-cache则不缓存
		response.setHeader("Pragma","No-cache");
		//浏览器和缓存服务器都不应该缓存页面信息
		response.setHeader("Cache-Control","no-cache");
		response.setDateHeader("Expires", 0);//过期时限值为0;
		//设置响应的MIME类型,常用为“text/html”
		response.setContentType("image/jpeg");
		
		//servlet页面默认是不缓存的
		
		//本页面允许在浏览器端或缓存服务器中缓存，时限为20秒。
		//20秒之内重新进入该页面的话不会进入该servlet的
//		java.util.Date date=new java.util.Date();
//		response.setDateHeader("Last-Modified",date.getTime()); //Last-Modified:页面的最后生成时
//		response.setDateHeader("Expires",date.getTime()+20000); //Expires:过时期限值 
//		//Cache-Control来控制页面的缓存与否,public:浏览器和缓存服务器都可以缓存页面信息；
//		response.setHeader("Cache-Control", "public"); 
//		//Pragma:设置页面是否缓存，为Pragma则缓存，no-cache则不缓存
//		response.setHeader("Pragma", "Pragma"); 
		
		BufferedImage image = new BufferedImage
			(IMG_WIDTH , IMG_HEIGTHT , BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		Random random = new Random();
		g.setColor(getRandColor(200 , 250));
		// 填充背景色
		g.fillRect(1, 1, IMG_WIDTH - 1, IMG_HEIGTHT - 1);
		// 为图形验证码绘制边框
		g.setColor(new Color(102 , 102 , 102));
		g.drawRect(0, 0, IMG_WIDTH - 1, IMG_HEIGTHT - 1);
		g.setColor(getRandColor(160,200));
		// 生成随机干扰线
		for (int i = 0 ; i < 30 ; i++)
		{
			int x = random.nextInt(IMG_WIDTH - 1);
			int y = random.nextInt(IMG_HEIGTHT - 1);
			int xl = random.nextInt(6) + 1;
			int yl = random.nextInt(12) + 1;
			g.drawLine(x , y , x + xl , y + yl);
		}
		g.setColor(getRandColor(160,200));
		// 生成随机干扰线
		for (int i = 0 ; i < 30 ; i++)
		{
			int x = random.nextInt(IMG_WIDTH - 1);
			int y = random.nextInt(IMG_HEIGTHT - 1);
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
		// 获取HttpSesssion对象
		HttpSession session = request.getSession(true);
		// 将随机字符串放入HttpSesssion对象中
		session.setAttribute("rand" , sRand);
		g.dispose();
		// 向输出流中输出图片
		ImageIO.write(image, "JPEG", response.getOutputStream());
	}
	// 定义获取随机字符串方法
//   另一种生成随机字符串的方式
//	 public static String getRandomString(int length){
//	     String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//	     Random random=new Random();
//	     StringBuffer sb=new StringBuffer();
//	     for(int i=0;i<length;i++){
//	       int number=random.nextInt(62);
//	       sb.append(str.charAt(number));
//	     }
//	     return sb.toString();
//	 }
	private String getRandomChar()
	{
		// 生成一个0、1、2的随机数字
		int rand = (int)Math.round(Math.random() * 2);
		long itmp = 0;
		char ctmp = '\u0000';
		switch (rand)
		{
			// 生成大写字母
			case 1:
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
}

