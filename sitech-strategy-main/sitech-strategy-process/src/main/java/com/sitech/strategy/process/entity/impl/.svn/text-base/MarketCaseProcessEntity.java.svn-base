package com.sitech.strategy.process.entity.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.MarketCaseDetailPojo;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseDetailPojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.algorithm.IFilterAlgorithm;
import com.sitech.strategy.core.objectville.inter.IBatchPush;
import com.sitech.strategy.core.objectville.inter.ICallTask;
import com.sitech.strategy.core.objectville.inter.IChannelTask;
import com.sitech.strategy.core.objectville.inter.IChannelTrigger;
import com.sitech.strategy.core.objectville.inter.IEventTrigger;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.inter.IMarketCaseProcessEntity;


/**
 * 营销案实体
* @date: 2016-9-5 
* @author: sunliang 
* @title: MarketCaseEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class MarketCaseProcessEntity extends BaseProcessEntity implements IMarketCaseProcessEntity {
	
	/**
	 * 批量push业务对象
	 */
	protected IBatchPush batchPush;
	/**
	 * 外呼任务业务对象
	 */
	protected ICallTask callTask;
	/**
	 * 渠道任务业务对象
	 */
	protected IChannelTask channelTask;
	/**
	 * 渠道触发业务对象
	 */
	protected IChannelTrigger channelTrigger;
	/**
	 * 事件触发业务对象
	 */
	protected IEventTrigger eventTrigger;
	/**
	 * 过滤算法对象
	 */
	protected IFilterAlgorithm filterAlgorithm;
	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * 营销案插入对象
	 */
	protected IDataInsertor.IMarketCaseInsertor marketCaseInsertor;
	/**
	 * 营销案查询对象
	 */
	protected IDataSelector.IMarketCaseSelector marketCaseSelector;
	/**
	 * 营销案缓存对象
	 */
	protected IMarketCaseCachePojo marketCaseCachePojo;
	/**
	 * 营销案详细信息对象
	 */
	protected IMarketCaseDetailPojo marketCaseDetailPojo;


	/**
	 * 
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: setBatchPush 
	* @param batchPush 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBatchPush(IBatchPush batchPush) {
		this.batchPush = batchPush;
	}
	
	/**
	 * 
	* @date: 2017-3-18 
	* @author: yuanchun
	* @title: setCallTask 
	* @param callTask 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCallTask(ICallTask callTask) {
		this.callTask = callTask;
	}

	/**
	 * 
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: setChannelTask 
	* @param channelTask 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelTask(IChannelTask channelTask) {
		this.channelTask = channelTask;
	}
	
	/**
	 * 
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: setChannelTrigger 
	* @param channelTrigger 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelTrigger(IChannelTrigger channelTrigger) {
		this.channelTrigger = channelTrigger;
	}
	
	/**
	 * 
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: setEventTrigger 
	* @param eventTrigger 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventTrigger(IEventTrigger eventTrigger) {
		this.eventTrigger = eventTrigger;
	}
	
	/**
	 * 
	* @date: 2016-11-7 
	* @author: sunliang 
	* @title: setFilterAlgorithm 
	* @param filterAlgorithm 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setFilterAlgorithm(IFilterAlgorithm filterAlgorithm) {
		this.filterAlgorithm = filterAlgorithm;
	}
	
	/**
	 * 
	* @date: 2016-9-30 
	* @author: yangwl
	* @title: setMarketCaseSelector 
	* @param marketCaseSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseSelector(
			IDataSelector.IMarketCaseSelector marketCaseSelector) {
		this.marketCaseSelector = marketCaseSelector;
	}

	/**
	 * 
	* @date: 2016-9-22 
	* @author: yangwl
	* @title: setMarketCaseDetailPojo 
	* @param marketCaseDetailPojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseDetailPojo(IMarketCaseDetailPojo marketCaseDetailPojo) {
		this.marketCaseDetailPojo = marketCaseDetailPojo;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setMarketCaseInsertor 
	* @param marketCaseInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseInsertor(
			IDataInsertor.IMarketCaseInsertor marketCaseInsertor) {
		this.marketCaseInsertor = marketCaseInsertor;
	}

	/**
	 * 
	* @date: 2016-9-5 
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
	* @date: 2016-9-22 
	* @author: yangwl
	* @title: setMarketCaseCachePojo 
	* @param marketCaseCachePojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseCachePojo(IMarketCaseCachePojo marketCaseCachePojo) {
		this.marketCaseCachePojo = marketCaseCachePojo;
	}
	
	/**
	 * 加载渠道触发营销案到缓存
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: loadChannelTriggerMarketCaseToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void loadChannelTriggerMarketCaseToCache(Map<String,Object> inParam) throws StrategyError{
		Map<String, Object> tempParam = new HashMap<String,Object>();
		String[] regionCodeArray = (String[])inParam.get("regionCode");
		
		for(String regionCode : regionCodeArray){
			tempParam.put("regionCode", regionCode);
			
			//查询渠道触发营销案和关联的运营位
			List<Map<String, Object>> ChannelTriggerMarketCaseAndPositionIdList = this.queryChannelTriggerMarketCase(tempParam);
			log.debug(regionCode+"ChannelTriggerMarketCaseAndPositionIdList.size==", ChannelTriggerMarketCaseAndPositionIdList.size());
			log.debug("ChannelTriggerMarketCaseAndPositionIdList====", ChannelTriggerMarketCaseAndPositionIdList);
			//解析渠道触发营销案缓存
			Map<String, Object> channelTriggerMarketCaseCache = this.parseChannelTriggerMarketCaseCache(ChannelTriggerMarketCaseAndPositionIdList);
			log.debug(regionCode+"channelTriggerMarketCaseCache====", channelTriggerMarketCaseCache);

			//加载渠道触发营销案缓存
			this.addChannelTriggerMarketCaseToCache(regionCode, channelTriggerMarketCaseCache);
		}	
	}
	
	/**
	 * 加载事件触发营销案
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: loadEventTriggerMarketCaseToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void loadEventTriggerMarketCaseToCache(Map<String, Object> inParam)
			throws StrategyError {
		
		//查询事件触发营销案
		List<Map<String, Object>> eventTriggermarketCaseList = this.queryEventTriggerMarketCase(inParam);
		log.debug("loadEventTriggerMarketCaseToCache.eventTriggermarketCaseList", eventTriggermarketCaseList);
		//解析事件触发营销案缓存
		Map<String, Object> evnetTriggerMarketCaseCache=this.parseEventTriggerMarketCaselCache(eventTriggermarketCaseList);
		//加载事件触发营销案缓存
		this.addEventTriggerMarketCaseToCache(evnetTriggerMarketCaseCache);
		
	}
	
	/**
	 * 加载营销案详细到缓存
	* @date: 2016-11-7 
	* @author: sunliang 
	* @title: loadMarketCaseToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void loadMarketCaseToCache(Map<String,Object> inParam) throws StrategyError{
		
		//查询营销案详细信息
		Map<String,IMarketCaseDetailPojo> marketCaseDetailPojoMap = this.queryMarketCaseDetail(inParam);
		//解析营销案详细信息缓存
		Map<String,IMarketCaseCachePojo> marketCasePojoCache = this.parseMarketCaseCache(marketCaseDetailPojoMap);
		//加载缓存
		this.addMarketCaseToCache(marketCasePojoCache);

	}
	
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
		//增加当日已处理记录
		this.addCurrentDayProcessedRecord(batchPushMarketCaseAndCustGroupList,param);
	}
	
	/**
	 * 加载外呼任务营销案缓存
	* @date: 2017-3-17 
	* @author: yuanchun
	* @title: loadWaitCreateCallTaskMarketCaseToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void loadWaitCreateCallTaskMarketCaseToCache(Map<String, Object> inParam) throws StrategyError {
		//查询当前生效的营销案关联的客户群类型和表达式
		List<Map<String, Object>> callTaskMarketCaseAndCustGroupList = this.queryCallTaskMarketCaseAndCustGroup(inParam);
		//解析待生成外呼任务缓存
		Map<String, Object> waitCreateCallTaskMarketCaseCache = this.parseWaitCreateCallTaskMarketCaseCache(callTaskMarketCaseAndCustGroupList);
		//加载到缓存  List<Map<marketCaseId:custGroupId,Map<custGroupType,relatedDataSource>>>
		this.addWaitCreateCallTaskMarketCaseToCache(waitCreateCallTaskMarketCaseCache);
		//更新shell进程执行信息表中外呼任务
		this.addShellProcessExecuteCallTask(callTaskMarketCaseAndCustGroupList);
		
	}

	/**
	 * 加载渠道任务营销案缓存
	* @date: 2017-1-9 
	* @author: sunliang 
	* @title: loadWaitCreateChannelTaskMarketCaseToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void loadWaitCreateChannelTaskMarketCaseToCache(Map<String,Object> inParam) throws StrategyError{

		//查询当前生效的营销案关联的客户群类型和表达式
		List<Map<String, Object>> channelTaskMarketCaseAndCustGroupList = this.queryChannelTaskMarketCaseAndCustGroup(inParam);
		//解析待生成渠道任务缓存
		Map<String, Object> waitCreateChannelTaskMarketCaseCache = this.parseWaitCreateChannelTaskMarketCaseCache(channelTaskMarketCaseAndCustGroupList);
		//加载缓存
		this.addWaitCreateChannelTaskMarketCaseToCache(waitCreateChannelTaskMarketCaseCache);
		//更新shell进程执行信息表中渠道任务
		this.updateShellProcessExecuteChannelTask(channelTaskMarketCaseAndCustGroupList);
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
		List<Map<String, Object>> batchPushMarketCaseAndCustGroupList = this.queryBatchPushMarketCaseAndCustGroupForWaitSend(inParam);
		//解析有待发送任务的批量push营销案的缓存结构(有序集合)
		Map<String,List<Map<Object, Object>>> waitSendBatchPushMarketCaseCache = this.parseWaitSendBatchPushMarketCaseCache(batchPushMarketCaseAndCustGroupList);
		//加载待发送任务缓存
		this.addWaitSendBatchPushMarketCaseToCache(waitSendBatchPushMarketCaseCache);
	}
	
	/**
	 * 加载渠道触发营销案信息到缓存
	* @date: 2016-11-21 
	* @author: yangwl
	* @title: addChannelTriggerMarketCaseToCache 
	* @param marketCaseRelCustGroupTypeFormulaCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addChannelTriggerMarketCaseToCache(String regionCode, Map<String, Object> channelTriggerMarketCaseCache) throws StrategyError{
		if(!CommonUtils.objectIsNull(channelTriggerMarketCaseCache)){
			for(Map.Entry<String, Object> entry : channelTriggerMarketCaseCache.entrySet()){
				marketCase.addChannelTriggerMarketCaseToCache(regionCode,entry);
			}
		}
	}
	
	/**
	 * 加载营销案信息到缓存
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: addMarketCaseToCache 
	* @param marketCaseCachePojoList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addMarketCaseToCache(Map<String,IMarketCaseCachePojo> marketCaseCachePojoMap) throws StrategyError{
		marketCaseInsertor.addMarketCaseDetailToCache(marketCaseCachePojoMap);
	}
	
	/**
	 * 加载事件触发营销案
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: addEventTriggerMarketCaseToCache 
	* @param evnetTriggerMarketCaseCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addEventTriggerMarketCaseToCache(Map<String, Object> evnetTriggerMarketCaseCache) throws StrategyError{
		
		for(Map.Entry<String, Object> evnetTriggerMarketCase : evnetTriggerMarketCaseCache.entrySet()){
			marketCase.addEventTriggerMarketCaseToCache(evnetTriggerMarketCase);
		}
	}
	
	/**
	 * 添加待生成批量push营销案缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: addWaitCreateBatchPushMarketCaseToCache 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addWaitCreateBatchPushMarketCaseToCache(Map<String, Object> waitCreateBatchPushMarketCaseCache,String param) throws StrategyError{
		if(!CommonUtils.objectIsNull(waitCreateBatchPushMarketCaseCache)){
			marketCaseInsertor.addWaitCreateBatchPushMarketCaseToCache(waitCreateBatchPushMarketCaseCache,param);
		}
	}
	
	/**
	 * 加载待生成外呼任务营销案到缓存
	* @date: 2017-3-17 
	* @author: yuanchun
	* @title: addWaitCreateCallTaskMarketCaseToCache 
	* @param waitCreateCallTaskMarketCaseCache 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addWaitCreateCallTaskMarketCaseToCache(Map<String, Object> waitCreateCallTaskMarketCaseCache) throws StrategyError {
		if(!CommonUtils.objectIsNull(waitCreateCallTaskMarketCaseCache)){
			marketCaseInsertor.addWaitCreateCallTaskMarketCaseCache(waitCreateCallTaskMarketCaseCache);
		}	
	}

	
	/**
	 * 加载待生成渠道任务营销案到缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: addWaitCreateChannelTaskMarketCaseToCache 
	* @param waitCreateChannelTaskMarketCaseCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addWaitCreateChannelTaskMarketCaseToCache(Map<String, Object> waitCreateChannelTaskMarketCaseCache) throws StrategyError{
		if(!CommonUtils.objectIsNull(waitCreateChannelTaskMarketCaseCache)){
			marketCaseInsertor.addWaitCreateChannelTaskMarketCaseCache(waitCreateChannelTaskMarketCaseCache);
		}	
	}
	
	/**
	 * 添加待发送批量push营销案缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: addWaitSendBatchPushMarketCaseToCache 
	* @param waitSendBatchPushMarketCaseCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addWaitSendBatchPushMarketCaseToCache(Map<String,List<Map<Object, Object>>> waitSendBatchPushMarketCaseCache) throws StrategyError{
		marketCaseInsertor.addWaitSendBatchPushMarketCaseToCache(waitSendBatchPushMarketCaseCache);
	}
	
	/**
	 * 增加当日已处理记录
	* @date: 2017-1-9 
	* @author: sunliang 
	* @title: addCurrentDayProcessedRecord 
	* @param batchPushMarketCaseAndCustGroupList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addCurrentDayProcessedRecord(List<Map<String, Object>> batchPushMarketCaseAndCustGroupList,String param) throws StrategyError{
		batchPush.addCurrentDayProcessedRecord(batchPushMarketCaseAndCustGroupList,param);
	}
	
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
	protected Map<String, Object> parseChannelTriggerMarketCaseCache(List<Map<String,Object>> ChannelTriggerMarketCaseAndPositionIdList) throws StrategyError{
		return channelTrigger.parseChannelTriggerMarketCaseCache(ChannelTriggerMarketCaseAndPositionIdList);
	}
	
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
	protected Map<String, Object> parseEventTriggerMarketCaselCache(List<Map<String,Object>> eventTriggermarketCaseList) throws StrategyError{
		return eventTrigger.parseEventTriggerMarketCaselCache(eventTriggermarketCaseList);
	}
	
	/**
	 * 解析营销案详细信息缓存
	* @date: 2016-12-30 
	* @author: sunliang 
	* @title: parseMarketCaseCache 
	* @param marketCaseDetailPojoMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,IMarketCaseCachePojo> parseMarketCaseCache(Map<String,IMarketCaseDetailPojo> marketCaseDetailPojoMap) throws StrategyError{
		return marketCase.parseMarketCaseCache(marketCaseDetailPojoMap);
	}
	
	/**
	 * 解析待生成批量push营销案缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: parseWaitCreateBatchPushMarketCaseCache 
	* @param batchPushMarketCaseAndCustGroupList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> parseWaitCreateBatchPushMarketCaseCache(List<Map<String,Object>> batchPushMarketCaseAndCustGroupList) throws StrategyError{
		return batchPush.parseWaitCreateBatchPushMarketCase(batchPushMarketCaseAndCustGroupList);
	}
	
	/**
	 * 解析待创建外呼任务营销案缓存
	* @date: 2017-3-17 
	* @author: yuanchun
	* @title: parseWaitCreateCallTaskMarketCaseCache 
	* @param callTaskMarketCaseAndCustGroupList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> parseWaitCreateCallTaskMarketCaseCache(List<Map<String, Object>> callTaskMarketCaseAndCustGroupList) throws StrategyError{
		return callTask.parseWaitCreateCallTaskMarketCase(callTaskMarketCaseAndCustGroupList);
	}
	
	/**
	 * 解析待创建渠道任务营销案缓存
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: parseWaitCreateChannelTaskMarketCaseCache 
	* @param channelTaskMarketCaseAndCustGroupList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> parseWaitCreateChannelTaskMarketCaseCache(List<Map<String, Object>> channelTaskMarketCaseAndCustGroupList) throws StrategyError{
		return channelTask.parseWaitCreateChannelTaskMarketCase(channelTaskMarketCaseAndCustGroupList);
	}
	
	/**
	 * 解析待发送批量push营销案缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: parseWaitSendBatchPushMarketCaseCache 
	* @param batchPushMarketCaseAndCustGroupList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,List<Map<Object, Object>>> parseWaitSendBatchPushMarketCaseCache(List<Map<String,Object>> batchPushMarketCaseAndCustGroupList) throws StrategyError{
		return batchPush.parseWaitSendBatchPushMarketCase(batchPushMarketCaseAndCustGroupList);
	}
	
	/**
	 * 查询批量push营销案和目标客户群
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: queryBatchPushMarketCaseAndCustGroup 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> queryBatchPushMarketCaseAndCustGroup(Map<String,Object> inParam,String param) throws StrategyError{
		//查询出状态在执行中的，在有效期内的营销案
		List<Map<String,Object>> marketCaseAndCustGroupList = marketCaseSelector.selectBatchPushMarketCaseAndCustGroup(inParam);
		//过滤出当天有下发任务的批量push营销案
		List<Map<String,Object>> batchPushMarketCaseAndCustGroupList = filterAlgorithm.filterBatchPushMarketCase(marketCaseAndCustGroupList,param);
		return batchPushMarketCaseAndCustGroupList;
	}
	/**
	 * 查询批量push营销案和目标客户群
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: queryBatchPushMarketCaseAndCustGroupForWaitSend 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> queryBatchPushMarketCaseAndCustGroupForWaitSend(Map<String,Object> inParam) throws StrategyError{
		//查询出状态在执行中的，在有效期内的营销案
		List<Map<String,Object>> marketCaseAndCustGroupList = marketCaseSelector.selectBatchPushMarketCaseAndCustGroup(inParam);
		//过滤出当天有下发任务的批量push营销案
		List<Map<String,Object>> batchPushMarketCaseAndCustGroupList = filterAlgorithm.filterBatchPushMarketCaseOnlyWaitSend(marketCaseAndCustGroupList);
		return batchPushMarketCaseAndCustGroupList;
	}
	
	/**
	 * 查询外呼任务营销案和目标客户群
	* @date: 2017-3-17 
	* @author: yuanchun
	* @title: queryCallTaskMarketCaseAndCustGroup 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryCallTaskMarketCaseAndCustGroup(Map<String, Object> inParam)  throws StrategyError{
		//查询出状态在执行中的，在有效期内的，外呼类型的营销案
		List<Map<String,Object>> marketCaseAndCustGroupList = marketCaseSelector.selectCallTaskMarketCaseAndCustGroup(inParam);
		//过滤出已经加过缓存的外呼营销案
		List<Map<String,Object>> callTaskMarketCaseAndCustGroupList = filterAlgorithm.filterCallTaskMarketCaseAndCustGroup(marketCaseAndCustGroupList);
		return callTaskMarketCaseAndCustGroupList;
	}
	
	/**
	 * 查询渠道任务营销案和目标客户群
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: queryChannelTaskMarketCaseAndCustGroup 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryChannelTaskMarketCaseAndCustGroup(Map<String,Object> inParam) throws StrategyError{
		return marketCaseSelector.selectChannelTaskMarketCaseAndCustGroup(inParam);
	}
	
	/**
	 * 查询渠道触发营销案
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: queryChannelTriggerMarketCase 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> queryChannelTriggerMarketCase(Map<String,Object> tempInParam) throws StrategyError{
		return marketCaseSelector.selectChannelTriggerMarketCase(tempInParam);
	}
	
	/**
	 * 查询事件触发营销案
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: queryEventTriggerMarketCase 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryEventTriggerMarketCase(Map<String,Object> tempInParam) throws StrategyError{
		return marketCaseSelector.selectEventTriggerMarketCase(tempInParam);
	}
	
	/**
	 * 根据条件查询营销案详细信息
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: queryMarketCaseDetail
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,IMarketCaseDetailPojo> queryMarketCaseDetail(Map<String,Object> inParam) throws StrategyError{
		return marketCase.queryMarketCaseDetailForMap(inParam);
	}
	
	/**
	 * 增加shell进程执行信息表中外呼任务
	* @date: 2017-3-17 
	* @author: yuanchun
	* @title: addShellProcessExecuteCallTask 
	* @param tempInparamList 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addShellProcessExecuteCallTask(List<Map<String, Object>> tempInparamList) throws StrategyError{
		callTask.addShellProcessExecuteCallTask(tempInparamList);
	}
	
	/**
	 * 更新shell进程执行信息表中渠道任务
	* @date: 2016-10-13 
	* @author: yangwl
	* @title: updateShellProcessExecuteChannelTask 
	* @param queryParam
	* @param tempInparamList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void updateShellProcessExecuteChannelTask(List<Map<String, Object>> tempInparamList) throws StrategyError{
		channelTask.updateShellProcessExecuteChannelTask(tempInparamList);
	}
	
	/**
	 * 更新shell进程执行信息表中批量push营销案
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: updateShellProcessExecuteBatchPush 
	* @param tempInParamList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void updateShellProcessExecuteBatchPush(List<Map<String, Object>> tempInParamList) throws StrategyError{
		batchPush.updateShellProcessExecuteBatchPush(tempInParamList);
	}

}
