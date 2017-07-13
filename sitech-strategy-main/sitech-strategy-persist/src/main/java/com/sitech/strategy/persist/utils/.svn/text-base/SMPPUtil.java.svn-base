package com.sitech.strategy.persist.utils;

import org.smpp.client.SMPPSenderUtil;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.PropertiesUtil;
import com.sitech.strategy.persist.base.BaseClass;

/**
 * SMPP3.4短信发送工具类
* @date: 2016-10-9 
* @author: yangwl
* @title: SMPPUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class SMPPUtil extends BaseClass{
	
	private static final SMPPUtil INSTANCE = new SMPPUtil();
	private static SMPPSenderUtil smppSender;
	
	private SMPPUtil() {
		if(INSTANCE == null){
			init();
		}	
	}
	
	private static void init(){
		try{
			
			String isLoad = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SMPP,"smpp.isLoad");
			
			if(Const.TRUE_LOWER.equals(isLoad)){
				//通过参数初始化 ( 主机 端口 用户名 密码) 
				String host = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SMPP,"ip-address");
				String port = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SMPP,"port");
				String userName = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SMPP,"system-id");
				String password = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SMPP,"password");
				smppSender = new SMPPSenderUtil(host, Integer.parseInt(port), userName, password);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * 获取SMPPUtil实例
	* @date: 2016-10-9 
	* @author: yangwl
	* @title: getInstance 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static SMPPUtil getInstance() {  
        return INSTANCE;
    }
	
	/** 
	 * 绑定连接
	* @date: 2016-10-26 
	* @author: songxj
	* @title: bindLink  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void bindLink(){
		smppSender.bindLink();
	}
	
	/** 
	 * 判断连接是否断开,返回int=0表示连接正常
	* @date: 2016-10-26 
	* @author: songxj
	* @title: checkStatus 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public int checkStatus(){
		return smppSender.checkStatus();
	}
	
	/**
	 * 断开连接 
	* @date: 2016-10-26 
	* @author: songxj
	* @title: unbindLink  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void unbindLink(){
		smppSender.unbindLink();
	}
	
	/**
	 * 发送消息
	* @date: 2016-10-9 
	* @author: yangwl
	* @title: sendMsg 
	* @param message
	* @param phoneNo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void sendMsg(String message,String phoneNo,String sourceAddr){
		if(message.length() <= 66){
			smppSender.messageSend(message,phoneNo,sourceAddr,1);
		}else if(message.length()>66 && message.length()<=132){
			smppSender.messageSend(message,phoneNo,sourceAddr,2);
		}else if(message.length()>132 && message.length()<=198){
			smppSender.messageSend(message,phoneNo,sourceAddr,3);
		}else{
			smppSender.messageSend(message.substring(0,198),phoneNo,sourceAddr,3);
		}
	}
	
	public static void main(String[] args) {
		SMPPUtil smpp = SMPPUtil.getInstance();
	}	
}
