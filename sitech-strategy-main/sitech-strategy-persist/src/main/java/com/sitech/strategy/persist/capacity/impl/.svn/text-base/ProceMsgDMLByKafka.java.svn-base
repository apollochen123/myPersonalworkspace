package com.sitech.strategy.persist.capacity.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.persist.base.BaseMessageDB;

/**
 * 消息操控kafka实现
* @date: 2016-9-12 
* @author: zhaoyue
* @title: ProceMsgDMLByKafka 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProceMsgDMLByKafka extends BaseMessageDB implements IMsgDML,Serializable{

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
	@Override
	public void send(Map<String, Object> tempInParam) {
		kafkaProducerUtil.send((String)tempInParam.get("topic"), (String)tempInParam.get("message"));
	}

	/** 批量发送消息
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: batchSend 
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void batchSend(Map<String, Object> tempInParam) {
		kafkaProducerUtil.batchSend((String)tempInParam.get("topic"), (List<String>)tempInParam.get("messages"));
	}
	
}
