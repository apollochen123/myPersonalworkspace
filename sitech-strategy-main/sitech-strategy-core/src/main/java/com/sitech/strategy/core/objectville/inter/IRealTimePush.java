package com.sitech.strategy.core.objectville.inter;

import java.util.Map;

/**
 * 实时push
* @date: 2017-2-10 
* @author: sunliang 
* @title: IRealTimePush 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IRealTimePush {
	
	/**
	 * 发送实时消息
	* @date: 2017-2-13 
	* @author: sunliang 
	* @title: sendRealTimeMsg 
	* @param tempParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void sendRealTimeMsg(Map<String, Object> tempParam);

}
