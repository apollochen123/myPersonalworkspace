package com.sitech.strategy.process.entity.impl.extend;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.entity.impl.MarketCaseProcessEntity;
import com.sitech.strategy.process.entity.inter.IMarketCaseProcessEntity;

/**
 * 营销案实体
* @date: 2016-12-28 
* @author: sunliang 
* @title: MarketCaseProcessEntityByAHTel 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class MarketCaseProcessEntityByAHTel extends MarketCaseProcessEntity
		implements IMarketCaseProcessEntity {
	
	/**
	 * 加载待生成批量push营销案到缓存
	* @date: 2017-1-5 
	* @author: sunliang 
	* @title: loadWaitCreateBatchPushMarketCaseToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void loadWaitCreateBatchPushMarketCaseToCache(Map<String,Object> inParam,String param) throws StrategyError{
		
		//查询批量push营销案和目标客户群
		List<Map<String, Object>> batchPushMarketCaseAndCustGroupList = this.queryBatchPushMarketCaseAndCustGroup(inParam,param);
		//解析待生成批量push任务缓存
		Map<String, Object> waitCreateBatchPushMarketCaseCache = this.parseWaitCreateBatchPushMarketCaseCache(batchPushMarketCaseAndCustGroupList);
		//加载待生成任务缓存
		this.addWaitCreateBatchPushMarketCaseToCache(waitCreateBatchPushMarketCaseCache,param);
		//更新shell进程执行信息表中批量push营销案关联的数据源名称
		this.updateShellProcessExecuteBatchPush(batchPushMarketCaseAndCustGroupList);
	}
	
	/**
	 * 加载待发送批量push营销案到缓存
	* @date: 2017-1-5 
	* @author: sunliang 
	* @title: loadWaitSendBatchPushMarketCaseToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void loadWaitSendBatchPushMarketCaseToCache(Map<String,Object> inParam) throws StrategyError{
		
		//查询批量push营销案和目标客户群
		List<Map<String, Object>> batchPushMarketCaseAndCustGroupList = this.queryBatchPushMarketCaseAndCustGroup(inParam,null);
		//解析待发送批量push任务缓存
		Map<String,List<Map<Object, Object>>> waitSendBatchPushMarketCaseCache = this.parseWaitSendBatchPushMarketCaseCache(batchPushMarketCaseAndCustGroupList);
		//加载待发送任务缓存
		this.addWaitSendBatchPushMarketCaseToCache(waitSendBatchPushMarketCaseCache);
		//更新shell进程执行信息表中批量push营销案关联的数据源名称
		this.updateShellProcessExecuteBatchPush(batchPushMarketCaseAndCustGroupList);
	}
	
	/**
	 * 查询批量push营销案和目标客户群
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title:  
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
//	protected List<Map<String,Object>> queryBatchPushMarketCaseAndCustGroup(Map<String,Object> inParam) throws StrategyError{
//		return marketCaseSelector.selectBatchPushMarketCaseAndCustGroup(inParam);
//	}
	
}
