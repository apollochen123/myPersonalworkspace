package com.sitech.strategy.process.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 规则实体
* @date: 2016-12-29 
* @author: sunliang 
* @title: IRuleProcessEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IRuleProcessEntity {
	
	/**
	 * 加载全局规则到缓存
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: loadGlobalRuleToCache 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadGlobalRuleToCache() throws StrategyError;
	
	/**
	 * 加载关闭规则到缓存
	* @date: 2017-4-3 
	* @author: sunyuan
	* @title: loadCloseRuleToCache 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadCloseRuleToCache(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 加载评估规则到缓存
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: loadEvaluateRuleToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadEvaluateRuleToCache(Map<String,Object> inParam)throws StrategyError;
	
	/**
	 * 加载互斥规则到缓存
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: loadMutexRuleToCache 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadMutexRuleToCache() throws StrategyError;

}
