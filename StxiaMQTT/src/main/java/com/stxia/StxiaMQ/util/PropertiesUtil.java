package com.stxia.StxiaMQ.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import javax.servlet.ServletContext;


public class PropertiesUtil {

	/**
	 * 根据properties文件的命和key,获取key值
	* @date: 2017年5月18日 
	* @author: chenhao
	* @title: getProperty 
	* @param propertiesName
	* @param key
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static  final String getProperty(String propertiesName,String key){
		InputStream in = PropertiesUtil.class.getResourceAsStream("/"+propertiesName);
		Properties prop = new Properties();
		if(in != null){
			try{
				prop.load(in);
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		String value = prop.getProperty(key);
		return value;
	}
	
	/**
	 * 根据文件名,获取web容器下key对应value值
	* @date: 2017年5月18日 
	* @author: chenhao
	* @title: getServletContextProperty 
	* @param webFileName
	* @param key
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static final String getServletContextProperty(String webFileName , String key){
		InputStream in = ServletContext.class.getResourceAsStream("/"+webFileName);
		Properties prop = new Properties();
		if(in != null){
			try{
				prop.load(in);
			}catch(IOException e){
				e.printStackTrace();
			}
		}
		String value = prop.getProperty(key);
		return value;
	}
}
