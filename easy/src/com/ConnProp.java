package com;

import java.io.UnsupportedEncodingException;

import org.apache.commons.codec.binary.Base64;

public class ConnProp
{
  public String ip;
  public int port;
  public String password;

  public static void main(String[] str){
	  System.out.println(Base64_DECD("b21wYXBwOm9tcEAxMjMh"));
	  System.out.println(Base64_ENCD("ompapp:omp@123!"));
  }
  /**
	 *  ½âÂë
	 * @param in
	 * @param code
	 * @return
	 */
	public static String Base64_DECD(String in){
		
		byte[] buf;
		
			buf = Base64.decodeBase64(in);
		
		return new String(buf);
	}
	
	
	/**
	 *  ×ªÂë
	 * @param in
	 * @param code
	 * @return
	 */
	public static String Base64_ENCD(String in){
		
		byte[] buf;
		
			buf = Base64.encodeBase64(in.getBytes());
		
		return new String(buf);
	}
	
}