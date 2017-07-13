package com.sitech.strategy.event.entity.impl;

import java.io.Serializable;
import java.util.Map;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IEventParse;
import com.sitech.strategy.event.base.BaseEventEntity;
import com.sitech.strategy.event.entity.inter.IFeeEventEntity;

/**
 * 缴费事件
* @date: 2017-2-10 
* @author: sunyuan
* @title: FeeEventEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class FeeEventEntity extends BaseEventEntity implements IFeeEventEntity,Serializable{
	
	protected IEventParse eventParse;
	
	/**
	 * 
	* @date: 2017-2-10 
	* @author: sunyuan
	* @title: setEventParse 
	* @param eventParse 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventParse(IEventParse eventParse) {
		this.eventParse = eventParse;
	}

	/**
	 * 接收缴费事件
	* @date: 2017-2-10 
	* @author: sunyuan
	* @title: receiveFeeEvent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void receiveFeeEvent(Map<String, Object> inParam)
			throws StrategyError {
		if (!CommonUtils.objectIsNull(inParam)) {
			eventParse.parsePayFeeEvent(inParam);
		}
	}
}
