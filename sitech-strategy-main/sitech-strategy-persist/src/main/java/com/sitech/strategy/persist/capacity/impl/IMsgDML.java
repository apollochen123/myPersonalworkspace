package com.sitech.strategy.persist.capacity.impl;

import java.util.Map;

/**
 * 消息操控接口
* @date: 2016-9-12 
* @author: zhaoyue
* @title: IMsgDML 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IMsgDML {
	/** 发送消息
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: send 
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void send(Map<String,Object> tempInParam);
	
	/** 批量发送
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: batchSend 
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void batchSend(Map<String,Object> tempInParam);
}
