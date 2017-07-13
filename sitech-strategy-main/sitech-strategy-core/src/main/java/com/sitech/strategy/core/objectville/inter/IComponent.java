package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 组件对象
* @date: 2017-2-21 
* @author: sunliang 
* @title: IComponent 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IComponent {
	
	/**
	 * 获取营销案下基于内容的构件ID(如营销案ID，客户群ID，子活动ID)
	* @date: 2017-2-21 
	* @author: sunliang 
	* @title: getComponentIdBaseContent 
	* @param marketCaseCachePojo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Set<String> getComponentIdBaseContent(IMarketCaseCachePojo marketCaseCachePojo) throws StrategyError;;
	
	/**
	 * 过滤营销案下基于内容的构件ID(如营销案ID，客户群ID，子活动ID)
	* @date: 2017-2-21 
	* @author: sunliang 
	* @title: filterComponentIdBaseContent 
	* @param inParam
	* @param userMap
	* @param componentIdSet
	* @param positionInfoMap
	* @param marketCaseCachePojo
	* @param userLabelMap
	* @param globalRuleMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> filterComponentIdBaseContent(
			Map<String, Object> inParam, Map<String, Object> userMap,Set<String> componentIdSet,
			Map<String, Object> positionInfoMap,
			IMarketCaseCachePojo marketCaseCachePojo,
			Map<String, String> userLabelMap, Map<String, Object> globalRuleMap,
			Map<String,Object> channelInfoMap)
			throws StrategyError;

}
