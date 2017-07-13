package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.util.Map;

import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IRealTimePush;

/**
 * 实时push
* @date: 2017-2-10 
* @author: sunliang 
* @title: RealTimePush 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class RealTimePush extends BaseClass implements IRealTimePush,Serializable {

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
	@Override
	public void sendRealTimeMsg(Map<String, Object> tempParam) {
		
	}

}
