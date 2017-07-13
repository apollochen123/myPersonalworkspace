package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 事件对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: IEvent 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IEvent {
	
	/**
	 * 增加事件的基本信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addEventInfo 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addEventInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 增加事件的详细信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addEventDetail 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addEventDetail(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 增加事件明细信息
	* @date: 2017-2-16 
	* @author:liuqi
	* @title: addEventDetailInfo 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> addEventDetailInfo(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 加载缴费与事件关系数据到缓存
	* @date: 2017-2-13 
	* @author: sunyuan
	* @title: addFeeAndEventRelToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addFeeAndEventRelToCache(Map.Entry<String, Object> inParam) throws StrategyError;
	
	/**
	 * 加载缴费事件与营销案关系缓存
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: addPayFeeEventAndMarketCaseRelToCache 
	* @param payFeeEventAndMarketCaseRelCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addPayFeeEventAndMarketCaseRelToCache(Map<String,List<Map<String,Object>>> payFeeEventAndMarketCaseRelCache) throws StrategyError;
	
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
	public void addProductAndEventRelToCache(Map.Entry<String, Object> inParam) throws StrategyError;
	
	/**
	 * 解析缴费与事件关系到缓存
	* @date: 2017-2-13 
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
	public Map<String, Object> parseFeeAndEventRelCache(List<Map<String,Object>> feeEventDetailList) throws StrategyError;
	
	/**
	 * 解析产品与事件关系缓存
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: parseProductAndEventRelCache 
	* @param productEventDetailList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> parseProductAndEventRelCache(List<Map<String,Object>> productEventDetailList) throws StrategyError;
	
	/**
	 * 解析缴费事件ID和事件详细
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: parsePayFeeEventIdAndMarketCaseIdRelAndEventDetail 
	* @param payFeeEventIdAndMarketCaseIdRel
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> parsePayFeeEventIdAndMarketCaseIdRelAndEventDetail(List<Map<String,Object>> payFeeEventIdAndMarketCaseIdRel) throws StrategyError;
	
	/**
	 * 解析事件ID和营销案ID缓存数据
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: parsePayFeeEventAndMarketCaseRelCache 
	* @param payFeeEventIdAndMarketCaseIdRelAndRuleDetail
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	//public Map<String,List<Map<String,Object>>> parsePayFeeEventAndMarketCaseRelCache(List<Map<String,Object>> payFeeEventIdAndMarketCaseIdRelAndRuleDetail) throws StrategyError;
	
	/**
	 * 查询事件信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryEvent 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryEvent(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 查询事件规则详细信息
	* @date: 2016-12-2 
	* @author: mengxi
	* @title: queryEventDetail 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryEventDetail(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 查询事件规则详情Id
	* @date: 2016-12-2 
	* @author: mengxi
	* @title: queryEventDetailId 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> queryEventDetailId(Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 查询事件详情和优先级
	* @date: 2017-2-14 
	* @author: sunyuan
	* @title: queryEventDetailAndPriority
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> queryEventDetailAndPriority(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 事件对象
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: removeEventById 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeEventById(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 更新事件信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: updateEventById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateEventById(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 根据relId查询事件id，根据查询的事件id，删除事件和事件详情，再删除关系表
	* @date: 2017-3-30 
	* @author: chenhao
	* @title: romoveMarketCaseEventRelAndDetailByRelId 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void romoveMarketCaseEventRelAndDetailByRelId(Map<String, Object> inParam) throws StrategyError;
	
}
