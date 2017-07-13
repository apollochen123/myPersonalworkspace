package com.sitech.strategy.persist.utils.idmm;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DmmQueue {
	private static Log log = LogFactory.getLog(DmmQueue.class);
	//消息中间件接收队列
	private static int queueLength=10000;
	public static BlockingQueue<String> dmmConsumerWaitDealQueue = new ArrayBlockingQueue<String>(queueLength);
	
	/**
	 * 消费消息放入待处理队列
	* @date: 2017-2-13 
	* @author: chenmy
	* @title: inputWaitDealMessage 
	* @param msg 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void inputWaitDealMessage(String msg){
		try {
			dmmConsumerWaitDealQueue.put(msg);
		} catch (Exception e) {
			log.error("inputUnAnaMessage",e);
		}
		
	}
	
	/**
	 * 从待处理队列中获得消息msg
	* @date: 2017-2-13 
	* @author: chenmy
	* @title: getWaitDealMessage 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String getWaitDealMessage(){
		String msg = null;
		try {
			msg = dmmConsumerWaitDealQueue.take();
		} catch (Exception e) {
			log.error("getUnAnaMessage",e);
		}
		return msg;
	}
	
}
