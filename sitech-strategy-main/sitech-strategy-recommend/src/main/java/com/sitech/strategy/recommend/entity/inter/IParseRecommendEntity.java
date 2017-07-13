package com.sitech.strategy.recommend.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 推荐解析实体
* @date: 2016-9-5 
* @author: sunliang 
* @title: IParseRecommendEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IParseRecommendEntity {

	/**
	 * 解析渠道任务推荐
	* @date: 2016-10-20 
	* @author: yangwl
	* @title: parseCustmMnagerTask 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> parseChannelTaskRecommend(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 解析事件触发推荐
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: parseEventTriggerRecommend 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void parseEventTriggerRecommend(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 解析渠道触发推荐
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: parseChannelTriggerRecommend 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> parseChannelTriggerRecommend(Map<String,Object> inParam) throws StrategyError;
/*	*//**
	 * 解析渠道触发反馈结果
	* @date: 2016-2-8 
	* @author: zhangqia 
	* @title: channelTriggerRecommendFeedback 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	public Map<String, Object> channelTriggerRecommendFeedback(Map<String, Object> inParam)throws StrategyError;*/
	
}
