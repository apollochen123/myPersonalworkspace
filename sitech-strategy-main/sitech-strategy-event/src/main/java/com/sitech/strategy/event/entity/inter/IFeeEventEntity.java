package com.sitech.strategy.event.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**费用类事件实体
 * Create on 2017-1-22
 * @author: wangpei
 * @Title:IFeeEventEntity
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public interface IFeeEventEntity {

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
	public void receiveFeeEvent(Map<String, Object> inParam) throws StrategyError;
}
