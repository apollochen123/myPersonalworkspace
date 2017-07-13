package com.sitech.strategy.event.entity.impl;

import java.io.Serializable;
import java.util.Map;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IEventParse;
import com.sitech.strategy.event.base.BaseEventEntity;
import com.sitech.strategy.event.entity.inter.IBusiEventEntity;

public class BusiEventEntity extends BaseEventEntity implements IBusiEventEntity,Serializable{
	protected IEventParse eventParse;

	public void setEventParse(IEventParse eventParse) {
		this.eventParse = eventParse;
	}
	
	/**
	 * 接收业务受理事件
	* @date: 2017-2-16 
	* @author: sunyuan
	* @title: receiveBusiEvent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void receiveBusiEvent(Map<String, Object> inParam) throws StrategyError {
		if(!CommonUtils.objectIsNull(inParam)){
			eventParse.parseBusiEvent(inParam);
		}
	}
}
