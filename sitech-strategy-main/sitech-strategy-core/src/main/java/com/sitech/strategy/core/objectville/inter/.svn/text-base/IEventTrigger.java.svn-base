package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 事件触发业务对象
* @date: 2017-1-2 
* @author: sunliang 
* @title: IEvnetTrigger 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IEventTrigger {
	
	/**
	 * 过滤事件触发推荐营销案
	* @date: 2017-2-14 
	* @author: sunliang 
	* @title: filterEventTriggerRecommedMarketCase 
	* @param inParam
	* @param userMap
	* @param userLabelMap
	* @param marketCaseCachePojoList
	* @param channelShowNumMap
	* @param globalRuleMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> filterEventTriggerRecommedMarketCase(
			Map<String, Object> inParam, Map<String, Object> userMap,
			Map<String, String> userLabelMap,
			List<IMarketCaseCachePojo> marketCaseCachePojoList,
			Map<String, Object> globalRuleMap) throws StrategyError;
	
	/**
	 * 查询事件触发营销案详细
	* @date: 2017-2-14 
	* @author: sunliang 
	* @title: queryEventTriggerMarketCaseDetail 
	* @param inParam
	* @param userMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<IMarketCaseCachePojo> queryEventTriggerMarketCaseDetail(Map<String, Object> inParam,Map<String,Object> userMap,Map<String,String> userInfoMap) throws StrategyError;
	
	/**
	 * 解析事件触发营销案缓存
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: parseEventTriggerMarketCaselCache 
	* @param eventTriggermarketCaseList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> parseEventTriggerMarketCaselCache(List<Map<String,Object>> eventTriggermarketCaseList) throws StrategyError;
	
	/**
	 * 发送事件触发消息
	* @date: 2017-2-13 
	* @author: sunliang 
	* @title: sendEventTriggerMsg 
	* @param inParam
	* @param marketCaseParketPojoList 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void sendEventTriggerMsg(Map<String, Object> inParam,List<Map<String, Object>> marketCaseParketPojoList) throws StrategyError;

}
