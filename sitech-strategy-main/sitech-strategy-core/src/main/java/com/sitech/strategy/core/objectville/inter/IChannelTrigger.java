package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCasePacketPojo;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 渠道触发业务对象
* @date: 2016-12-29 
* @author: sunliang 
* @title: IChannelTrigger 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IChannelTrigger {
	
	/**
	 * 过滤渠道触发营销案
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: filterChannelTriggerRecommedMarketCase 
	* @param inParam
	* @param userLabelMap
	* @param positionInfoMap
	* @param marketCaseCachePojoList
	* @param showNumMap
	* @param globalRuleMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<IMarketCasePacketPojo> filterChannelTriggerRecommedMarketCase(
			Map<String, Object> inParam, Map<String, Object> userMap,Map<String, String> userLabelMap,
			Map<String, Object> positionInfoMap,
			List<IMarketCaseCachePojo> marketCaseCachePojoList,
			Map<String, Object> globalRuleMap)
			throws StrategyError;
	
	
	/**
	 * 查询渠道触发营销案
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: queryChannelTriggerMarketCaseDetail 
	* @param inParam
	* @param position
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<IMarketCaseCachePojo> queryChannelTriggerMarketCaseDetail(Map<String,Object> inParam,Map<String, Object> userMap,Map<String,Object> position) throws StrategyError;
	
	/**
	 * 解析渠道触发营销案缓存
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: parseChannelTriggerMarketCaseCache 
	* @param ChannelTriggerMarketCaseAndPositionIdList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> parseChannelTriggerMarketCaseCache(List<Map<String,Object>> ChannelTriggerMarketCaseAndPositionIdList) throws StrategyError;
	
}
