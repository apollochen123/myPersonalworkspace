package com.sitech.strategy.common.utils;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 日志工具类
* @date: 2016-9-5 
* @author: sunliang 
* @title: LogUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class LogUtil implements Serializable{
	
	/**
	 * log对象
	 */
	protected Log log;
	
	/**
	 * 获取log对象
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getLog 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Log getLog() {
		return log;
	}
	/**
	 * 构造方法
	* @date: 2016-9-12 
	* @author: sunliang 
	* @param c 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public LogUtil(Class c){
		log = LogFactory.getLog(c);
	}
	
	/**
	 * 构造方法
	* @date: 2016-9-12 
	* @author: sunliang 
	* @param str 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public LogUtil(String str){
		log = LogFactory.getLog(str);
	}
	
	/**
	 * 使用error模式打印日志
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: error 
	* @param name
	* @param value 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void error(String name,Object value){
		log.error("------" + name + "=" + "" + value + "------");
	}
	/**
	 * 使用debug模式打印日志
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: debug 
	* @param name
	* @param value 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void debug(String name,Object value){
		log.debug("------" + name + "=" + "" + value + "------");
	}
	
	/**
	 * 使用info模式打印日志
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: info 
	* @param name
	* @param value 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void info(String name,Object value){
		log.info("------" + name + "=" + "" + value + "------");
	}

}
