package com.sitech.strategy.core.algorithm;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 推荐算法接口
* @date: 2016-9-5 
* @author: sunliang 
* @title: IRecommedAlgo 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IRecommedAlgo extends IAlgorithm{
	
	/**
	 * 获取渠道任务推荐营销案列表
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getChannelTaskRecommendMarketCaseList 
	* @param inParam
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getChannelTaskRecommendMarketCaseList(Map<String, Object> inParam,Map<String, Object> tempInParam,List<Map<String, Object>> userList) throws StrategyError;
	
	/**
	 * 获取渠道触发推荐营销案列表
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: getChannelTriggerRecommedMarketCaseList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getChannelTriggerRecommedMarketCaseList(Map<String,Object> inParam,Map<String,Object> userMap) throws StrategyError;
	
	/**
	 * 获取事件触发推荐营销案列表
	* @date: 2017-2-13 
	* @author: sunliang 
	* @title: getEventTriggerRecommedMarketCaseList 
	* @param inParam
	* @param userMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getEventTriggerRecommedMarketCaseList(Map<String,Object> inParam,Map<String,Object> userMap) throws StrategyError;
	
}
