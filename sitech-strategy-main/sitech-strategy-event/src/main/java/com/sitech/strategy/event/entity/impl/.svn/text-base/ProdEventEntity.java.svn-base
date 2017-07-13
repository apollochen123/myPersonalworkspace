package com.sitech.strategy.event.entity.impl;

import java.io.Serializable;
import java.util.Map;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IEventParse;
import com.sitech.strategy.event.base.BaseEventEntity;
import com.sitech.strategy.event.entity.inter.IProdEventEntity;

/**
 * Create on 2017-1-20
 * @author: wangpei
 * @Title:ProdEventEntity
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class ProdEventEntity extends BaseEventEntity implements IProdEventEntity, Serializable{
	protected IEventParse eventParse;
	
	public void setEventParse(IEventParse eventParse) {
		this.eventParse = eventParse;
	}

	/**
	 *  接收产品订购事件 
	* @date: 2016-11-23 
	* @author: songxj
	* @title: receiveProdOrderEvent 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void receiveProdOrderEvent(Map<String, Object> inParam) throws StrategyError {
		if (!CommonUtils.objectIsNull(inParam)) {
			eventParse.parseProdOrderEvent(inParam);
		}
	}
}
