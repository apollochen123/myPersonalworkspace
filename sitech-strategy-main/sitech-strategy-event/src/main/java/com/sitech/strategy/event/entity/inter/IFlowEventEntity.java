package com.sitech.strategy.event.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**流量类事件实体
 * Create on 2017-1-22
 * @author: wangpei
 * @Title:IFlowEventEntity
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public interface IFlowEventEntity {

	/**
	 * 接收流量事件
	* @date: 2017-2-16 
	* @author: sunyuan
	* @title: receiveFlowEvent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void receiveFlowEvent(Map<String, Object> inParam) throws StrategyError;
}
