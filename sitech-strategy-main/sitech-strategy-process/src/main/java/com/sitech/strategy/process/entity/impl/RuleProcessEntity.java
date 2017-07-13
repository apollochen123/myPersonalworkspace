package com.sitech.strategy.process.entity.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IContent;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.inter.IRuleProcessEntity;

/**
 * 规则实体
* @date: 2016-12-29 
* @author: sunliang 
* @title: RuleProcessEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class RuleProcessEntity extends BaseProcessEntity implements
		IRuleProcessEntity {
	
	/**
	 * 内容对象
	 */
	protected IContent content;
	/**
	 * 规则对象
	 */
	protected IRule rule;
	/**
	 * 规则数据插入操作对象
	 */
	protected IDataInsertor.IRuleInsertor ruleInsertor;
	/**
	 * 规则数据查询操作对象
	 */
	protected IDataSelector.IRuleSelector ruleSelector;
	
	/**
	 * 
	* @date: 2017-4-3 
	* @author: sunyuan
	* @title: setContent 
	* @param content 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setContent(IContent content) {
		this.content = content;
	}

	/**
	 * 
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: setRule 
	* @param rule 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRule(IRule rule) {
		this.rule = rule;
	}
	
	/**
	 * 
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: setRuleInsertor 
	* @param ruleInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRuleInsertor(IDataInsertor.IRuleInsertor ruleInsertor) {
		this.ruleInsertor = ruleInsertor;
	}
	
	/**
	 * 
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: setRuleSelector 
	* @param ruleSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRuleSelector(IDataSelector.IRuleSelector ruleSelector) {
		this.ruleSelector = ruleSelector;
	}

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
	@Override
	public void loadGlobalRuleToCache() throws StrategyError {
		//查询全局规则
		List<Map<String, Object>> globalRuleTypeList = this.queryGlobalRuleType();
		//查询全局规则详细信息
		Map<String, Object> globalRuleDetailMap = this.queryGlobalRuleDetail(globalRuleTypeList);
		//加载全局规则缓存
		this.addGlobalRuleToCache(globalRuleDetailMap);
	}
	
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
	public void loadCloseRuleToCache(Map<String,Object> inParam) throws StrategyError{
		//查询关闭规则
		List<Map<String,Object>> closeRuleList = this.queryCloseRule(inParam);
		log.debug("===RuleProcessEntity.loadCloseRuleToCache.closeRuleList===", closeRuleList);
		
		//根据规则id查询营销案
		Map<String,Object> marketCaseInfo = this.queryMarketCaseByRuleId(closeRuleList);
		log.debug("===RuleProcessEntity.loadCloseRuleToCache.marketCaseInfo===", marketCaseInfo);
		
		//加载关闭规则到缓存
		this.addCloseRuleToCache(marketCaseInfo);
	}
	
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
	public void loadEvaluateRuleToCache(Map<String,Object> inParam)throws StrategyError{
		//查询评估规则
		List<Map<String,Object>> evaluateRuleList = this.queryEvaluateRule(inParam);
		log.debug("===RuleProcessEntity.loadEvaluateRuleToCache.evaluateRuleList===", evaluateRuleList);
		
		//根据规则id查询营销案
		Map<String,Object> marketCaseInfo = this.queryMarketCaseByRuleId(evaluateRuleList);
		log.debug("===RuleProcessEntity.loadEvaluateRuleToCache.marketCaseInfo===", marketCaseInfo);
		
		//加载评估规则到缓存
		this.addEvaluateRuleToCache(marketCaseInfo);
	}
	
	/**
	 * 增加互斥规则到缓存
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: loadMutexRuleToCache 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void loadMutexRuleToCache() throws StrategyError {
		//查询所有规则id
		List<Map<String,Object>> ruleIdList = this.queryRuleId();
		log.debug("===RuleProcessEntity.loadMutexRuleToCache.mutexRuleIdList===", ruleIdList);
		
		//查询互斥规则详细
		Map<String,Object> mutexRuleDetailMap = this.queryMutexRuleDetail(ruleIdList);
		log.debug("===RuleProcessEntity.loadMutexRuleToCache.mutexRuleDetailMap===", mutexRuleDetailMap);
		
		//加载互斥规则到缓存
		this.addMutexRuleToCache(mutexRuleDetailMap);
	}
	
	/**
	 * 查询关闭规则
	* @date: 2017-4-3 
	* @author: sunyuan
	* @title: queryCloseRule 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> queryCloseRule(Map<String,Object> inParam)throws StrategyError{
		return ruleSelector.selectRuleDetailList(inParam);
	}
	
	/**
	 * 查询评估规则
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: queryEvaluateRule 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> queryEvaluateRule(Map<String,Object> inParam)throws StrategyError{
		return ruleSelector.selectRuleDetailList(inParam);
	}
	
	/**
	 * 查询全局规则类型
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: queryGlobalRuleType 
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryGlobalRuleType() throws StrategyError{
		return ruleSelector.selectGlobalRuleType();
	}
	
	/**
	 * 查询全局规则的详细信息
	* @date: 2016-11-19 
	* @author: yangwl
	* @title: queryGlobalRuleDetail 
	* @param globalRuleType
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> queryGlobalRuleDetail(List<Map<String, Object>> globalRuleTypeList) throws StrategyError{
		return rule.queryGlobalRuleDetail(globalRuleTypeList);
	}
	
	/**
	 * 根据规则id查询营销案
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: queryMarketCaseByRuleId 
	* @param ruleIdList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> queryMarketCaseByRuleId(List<Map<String,Object>> ruleIdList)throws StrategyError{
		return rule.queryMarketCaseByRuleId(ruleIdList);
	}
	
	/**
	 * 查询互斥规则详细
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: queryMutexRuleDetail 
	* @param inParam
	* @param ruleInfoList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> queryMutexRuleDetail(List<Map<String, Object>> ruleInfoList) throws StrategyError{
		return rule.queryMutexRuleDetail(ruleInfoList);
	}
	
	/**
	 * 加载关闭规则到缓存
	* @date: 2017-4-3 
	* @author: sunyuan
	* @title: addCloseRuleToCache 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addCloseRuleToCache(Map<String,Object> closeRuleDetailMap)throws StrategyError{
		for(Entry<String,Object> closeRule : closeRuleDetailMap.entrySet()){
			if(!CommonUtils.objectIsNull(closeRule.getValue())){
				rule.addCloseRuleToCache(closeRule);
			}
		}
	}
	
	/**
	 * 加载评估规则到缓存
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: addEvaluateRuleToCache 
	* @param evaluateRuleDetailMap
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addEvaluateRuleToCache(Map<String,Object> evaluateRuleDetailMap)throws StrategyError{
		for(Entry<String,Object> evaluateRule : evaluateRuleDetailMap.entrySet()){
			if(!CommonUtils.objectIsNull(evaluateRule.getValue())){
				rule.addEvaluateRuleToCache(evaluateRule);
			}
		}
	}
	
	/**
	 * 加载全局规则缓存
	* @date: 2016-11-19 
	* @author: yangwl
	* @title: addGlobalRuleToCache 
	* @param marketCaseRelCustGroupTypeFormulaCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addGlobalRuleToCache(Map<String, Object> globalRuleDetailMap) throws StrategyError{
		rule.addGlobalRuleToCache(globalRuleDetailMap);
	}
	
	/**
	 * 添加互斥规则到缓存
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: addMutexRuleToCache 
	* @param mutexRuleDetailMap
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addMutexRuleToCache(Map<String, Object> mutexRuleDetailMap) throws StrategyError{
		for(Entry<String,Object> mutexRule : mutexRuleDetailMap.entrySet()){
			if(!CommonUtils.objectIsNull(mutexRule.getValue())){
				rule.addMutexRuleToCache(mutexRule);
			}
		}
	}

	/**
	 * 查询互斥规则Id
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: queryRuleId 
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryRuleId() throws StrategyError{
		return ruleSelector.selectRuleInfoList(new HashMap<String,Object>());
	}
}
