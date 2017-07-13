package com.stxia.StxiaMQ.util;

 
public interface StxiaConfig {
	
	public static final String PRONAME="stxiaMQTTconfig.properties";
	/**
	 * 设置阿里云的AccessKey，用于鉴权
	 */
	public static final String ACCESSKEY = PropertiesUtil.getProperty(PRONAME, "accesskey");
	/**
	 * 设置阿里云的SecretKey，用于鉴权
	 */
	public static final String SECRETKEY=PropertiesUtil.getProperty(PRONAME, "secretkey");
	/**
	 * 设置一级Topic
	 */
	public static final String TOPIC=PropertiesUtil.getProperty(PRONAME, "topic");
	/**
	 * 设置PID
	 */
	public static final String PID=PropertiesUtil.getProperty(PRONAME, "pid");
	/**
	 * 设置密码
	 */
	public static final String PASSWD = PropertiesUtil.getProperty(PRONAME, "passwd");
}
