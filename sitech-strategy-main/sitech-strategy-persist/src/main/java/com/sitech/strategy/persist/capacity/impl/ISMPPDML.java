package com.sitech.strategy.persist.capacity.impl;

import java.util.Map;

/**
 * Create on 2017-1-20
 * @author: wangpei
 * @Title:ISMPPDML
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public interface ISMPPDML {
	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: bindLink  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void bindLink();
	
	/** 判断连接是否断开,返回int=0表示连接正常
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: checkStatus 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public int checkStatus();
	
	/** 断开连接 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: unbindLink  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void unbindLink();
	
	/** 用SMPP协议发送信息
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: send 
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void send(Map<String, Object> tempInParam);
}
