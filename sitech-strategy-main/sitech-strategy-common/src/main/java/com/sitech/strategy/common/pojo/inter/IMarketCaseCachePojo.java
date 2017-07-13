package com.sitech.strategy.common.pojo.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 缓存中保存营销案的对象接口
* @date: 2016-9-5 
* @author: sunliang 
* @title: IMarketCaseCachePojo 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IMarketCaseCachePojo {
	
	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: getMarketCaseRel 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getMarketCaseRel();

	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: setMarketCaseRel 
	* @param marketCaseRel 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseRel(Map<String, Object> marketCaseRel);

	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: getCustGroupMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getCustGroupMap();

	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: setCustGroupMap 
	* @param custGroupMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupMap(Map<String, Object> custGroupMap);
	
	/**
	 * 
	* @date: 2016-9-16 
	* @author: yangwl
	* @title: getChannelMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getPositionMap();
	
	/**
	 * 
	* @date: 2016-9-16 
	* @author: yangwl
	* @title: setChannelMap 
	* @param channelMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPositionMap(Map<String, Object> channelMap);

	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: getGlobalRuleMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getGlobalRuleMap();

	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: setGlobalRuleMap 
	* @param globalRuleMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setGlobalRuleMap(Map<String, Object> globalRuleMap);
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getMarketCaseMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getMarketCaseMap();
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setMarketCaseMap 
	* @param marketCaseMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseMap(Map<String, Object> marketCaseMap);
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getRuleMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getRuleMap();
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setRuleMap 
	* @param ruleMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRuleMap(Map<String, Object> ruleMap);
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getContentMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getContentMap();
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setContentMap 
	* @param contentMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setContentMap(Map<String, Object> contentMap);
	
	/**
	 * 得到营销案缓存Key
	* @date: 2016-10-1 
	* @author: sunliang 
	* @title: getMarketCaseCacheKey 
	* @param inParam
	* @param positionId
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseCacheKey(Map<String, Object> inParam,String positionId) throws StrategyError;
	
	/**
	 * 营销案分类
	* @date: 2016-10-1 
	* @author: yangwl 
	* @title: groupMarketCaseByKey 
	* @param marketCaseCachePojoList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> groupMarketCaseByKey(List<IMarketCaseCachePojo> marketCaseCachePojoList) throws StrategyError;

}
