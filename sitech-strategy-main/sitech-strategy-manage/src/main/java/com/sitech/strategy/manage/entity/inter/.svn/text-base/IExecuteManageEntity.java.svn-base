package com.sitech.strategy.manage.entity.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 
* @date: 2016-9-28 
* @author: wangth
* @Title: IExecuteManageEntity 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IExecuteManageEntity {
/*	*//**
	 * 往缓存中添加营销案状态（暂停）
	* @date: 2016-9-28 
	* @author: wangth
	* @Title: addMarketCaseTaskStatusCodeToCache 
	* @return 
	* @version 1.0 
	 * @throws StrategyError 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	public void addBatchPushTaskStatusCodeToCache(Map<String,Object> inParam) throws StrategyError;*/
	
	/**
	 * 暂停营销案推荐
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: pauseMarketCaseRecommend 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void pauseMarketCaseRecommend(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 往批量push营销案待发送营销案列表缓存添加补发数据
	* @date: 2016-11-11 
	* @author: yuanliang
	* @title: addRepairWaitSendBatchPushMarketCaseToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addRepairWaitSendBatchPushMarketCaseToCache(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 营销案测试时，往优先级缓存添加测试数据
	* @date: 2016-11-7 
	* @author: yuanliang
	* @title: addBatchPushMarketCasePriorityForTestToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addTestWaitSendBatchPushMarketCaseToCache(Map<String,Object> inParam) throws StrategyError;
	
	/** 
	 * 验证营销案
	* @date: 2016-10-31 
	* @author: songxj
	* @title: marketCaseVerify 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String, Object> marketCaseVerify(Map<String, Object> inParam) throws StrategyError;
	
/*	*//**
	 * 恢复活动时从缓存中移除数据
	* @date: 2016-9-29 
	* @author: wangth
	* @Title: removeMarketCaseTaskStatusCodeToCache 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	public void removeBatchPushTaskStatusCodeFromCache(Map<String,Object> inParam) throws StrategyError;*/
	
	public void recoverMarketCaseRecommendPause(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 获得补发的营销案
	* @date: 2016-11-16 
	* @author: yuanliang
	* @title: getRepairWaitSendBatchPushMarketCase 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> getRepairWaitSendBatchPushMarketCase(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 发送营销案ID
	* @date: 2016-12-16 
	* @author: yuanchun
	* @Title: sendMarketIdToCache 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void sendMarketIdToCache(Map<String,Object> inParam) throws StrategyError; 

}
