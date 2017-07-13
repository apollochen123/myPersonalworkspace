package com.sitech.strategy.process.entity.impl;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IContent;
import com.sitech.strategy.core.objectville.inter.IEvent;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.inter.IEventProcessEntity;

/**
 * 事件处理实体
* @date: 2016-11-24 
* @author: yuanliang
* @title: EventProcessEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class EventProcessEntity extends BaseProcessEntity implements IEventProcessEntity {
	/**
	 * 内容对象
	 */
	protected IContent content;
	/**
	 * 事件对象
	 */
	protected IEvent event;
	/**
	 * 事件查询操作接口
	 */
	protected IDataSelector.IEventSelector eventSelector;
	/**
	 * 事件插入操作接口
	 */
	protected IDataInsertor.IEventInsertor eventInsertor;
	/**
	 * 营销案查询对象
	 */
	protected IMarketCase marketCase;
	/**
	 * 规则对象
	 */
	protected IRule rule;
	
	/**
	 * 
	* @date: 2017-3-7 
	* @author: sunliang 
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
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: setEvent 
	* @param event 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEvent(IEvent event) {
		this.event = event;
	}
	
	/**
	 * 
	* @date: 2016-11-24 
	* @author: yuanliang
	* @title: setEventSelector 
	* @param eventSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventSelector(IDataSelector.IEventSelector eventSelector) {
		this.eventSelector = eventSelector;
	}
	
	/**
	 * 
	* @date: 2016-11-24 
	* @author: yuanliang
	* @title: setEventInsertor 
	* @param eventInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventInsertor(IDataInsertor.IEventInsertor eventInsertor) {
		this.eventInsertor = eventInsertor;
	}
	
	/**
	 * 
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: setMarketCase 
	* @param marketCase 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCase(IMarketCase marketCase) {
		this.marketCase = marketCase;
	}
	
	/**
	 * 
	* @date: 2017-3-7 
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
	 * 加载缴费事件数据到缓存
	* @date: 2017-2-12 
	* @author: sunyuan
	* @title: loadFeeEventToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
/*	public void loadFeeAndEventRelToCache(Map<String,Object> inParam) throws StrategyError{
		//查询事件详细信息
		List<Map<String,Object>> feeEventDetailList = this.queryFeeEventDetailList(inParam);
		//解析数据
		Map<String,Object> feeAndEventRelCache = this.parseFeeAndEventRelCache(feeEventDetailList);
		//加载缓存
		this.addFeeAndEventRelToCache(feeAndEventRelCache);
	}*/
	
	public void loadPayFeeAndEventRelToCache(Map<String,Object> inParam) throws StrategyError{
		
		//查询缴费事件ID
		List<Map<String, Object>> payFeeEventId = eventSelector.selectPayFeeEventId(inParam);
		log.debug("loadPayFeeAndEventRelToCache.payFeeEventId", payFeeEventId);
		//根据事件ID得到事件下的营销案
		List<Map<String,Object>> payFeeEventIdAndMarketCaseIdRel = marketCase.parsePayFeeEventIdAndMarketCaseIdRel(payFeeEventId);
		log.debug("loadPayFeeAndEventRelToCache.payFeeEventIdAndMarketCaseIdRel", payFeeEventIdAndMarketCaseIdRel);
		//根据事件ID查询事件详细
		List<Map<String,Object>> payFeeEventIdAndMarketCaseIdRelAndEventDetail = event.parsePayFeeEventIdAndMarketCaseIdRelAndEventDetail(payFeeEventIdAndMarketCaseIdRel);
		log.debug("loadPayFeeAndEventRelToCache.payFeeEventIdAndMarketCaseIdRelAndEventDetail", payFeeEventIdAndMarketCaseIdRelAndEventDetail);
		//根据事件ID和营销案ID取内容
		List<Map<String,Object>> payFeeEventIdAndMarketCaseIdReAndContentDetail = content.parsePayFeeEventIdAndMarketCaseIdReAndContentDetail(payFeeEventIdAndMarketCaseIdRelAndEventDetail);
		log.debug("loadPayFeeAndEventRelToCache.payFeeEventIdAndMarketCaseIdReAndContentDetail", payFeeEventIdAndMarketCaseIdReAndContentDetail);
		//根据事件ID和营销案ID取规则
		Map<String,List<Map<String,Object>>> payFeeEventIdAndMarketCaseIdRelAndRuleDetail = rule.parsePayFeeEventIdAndMarketCaseIdRelAndRuleDetail(payFeeEventIdAndMarketCaseIdReAndContentDetail);
		log.debug("loadPayFeeAndEventRelToCache.payFeeEventIdAndMarketCaseIdRelAndRuleDetail", payFeeEventIdAndMarketCaseIdRelAndRuleDetail);
		//加载缓存
		event.addPayFeeEventAndMarketCaseRelToCache(payFeeEventIdAndMarketCaseIdRelAndRuleDetail);
		
	}
	
	/**
	 * 加载产品和事件关系数据到缓存
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: loadProductAndEventRelToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void loadProductAndEventRelToCache(Map<String,Object> inParam) throws StrategyError {
		
		//查询事件详细信息
		//selectProductEventDetailList
		List<Map<String, Object>> productEventDetailList = this.queryProductEventDetailList(inParam);
		//解析数据
		Map<String, Object> productAndEventRelCache=this.parseProductAndEventRelCache(productEventDetailList);
		//加载缓存
		this.addProductAndEventRelToCache(productAndEventRelCache);
	}
	
	/**
	 * 加载缴费与事件关系数据到缓存
	* @date: 2017-2-13 
	* @author: sunyuan
	* @title: addFeeAndEventRelToCache 
	* @param feeAndEventRelCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addFeeAndEventRelToCache(Map<String, Object> feeAndEventRelCache) throws StrategyError{
		for(Map.Entry<String, Object> feeAndEventRel : feeAndEventRelCache.entrySet()){
			event.addFeeAndEventRelToCache(feeAndEventRel);
		}
	}

	/**
	 * 加载产品与事件关系数据到缓存
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: addProductAndEventRelToCache 
	* @param productAndEventRelCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addProductAndEventRelToCache(Map<String, Object> productAndEventRelCache) throws StrategyError{
		
		for(Map.Entry<String, Object> productAndEventRel : productAndEventRelCache.entrySet()){
			event.addProductAndEventRelToCache(productAndEventRel);
		}
	}
	
	/**
	 * 解析缴费与事件关系缓存
	* @date: 2017-2-14 
	* @author: sunyuan
	* @title: parseFeeAndEventRelCache 
	* @param feeEventDetailList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> parseFeeAndEventRelCache(List<Map<String,Object>> feeEventDetailList) throws StrategyError {
		return event.parseFeeAndEventRelCache(feeEventDetailList);
	}

	/**
	 * 解析产品与事件关系缓存
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: parseProductAndEventRelCache 
	* @param productEventDetailList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> parseProductAndEventRelCache(List<Map<String,Object>> productEventDetailList) throws StrategyError {
		return event.parseProductAndEventRelCache(productEventDetailList);
	}
	
	/**
	 * 查询缴费事件详细信息
	* @date: 2017-2-12 
	* @author: sunyuan
	* @title: queryFeeEventDetailList 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryFeeEventDetailList(Map<String,Object> tempInParam) throws StrategyError{
		return event.queryEventDetailAndPriority(tempInParam);
	}
	
	/**
	 * 查询产品事件详细信息
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: queryProductEventDetailList 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryProductEventDetailList(Map<String,Object> tempInParam) throws StrategyError{
		return eventSelector.selectEventDetailList(tempInParam);
	}

}
