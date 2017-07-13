package com.sitech.strategy.process.entity.param.inter;

import java.util.Map;

/**
 * 加载缓存参数处理
* @date: 2016-12-28 
* @author: sunliang 
* @title: ILoadCacheProcessParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ILoadCacheProcessParam {
	
	/**
	 * 加载外呼任务营销案到缓存入参处理
	* @date: 2017-3-17 
	* @author: yuanchun
	* @title: loadWaitCreateCallTaskMarketCaseToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> loadWaitCreateCallTaskMarketCaseToCacheInParam();
	
	/**
	 * 加载渠道任务营销案到缓存入参处理
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: loadWaitCreateChannelTaskMarketCaseToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> loadWaitCreateChannelTaskMarketCaseToCacheInParam();
	
	/**
	 * 加载渠道触发营销案到缓存入参处理
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: loadChannelTriggerMarketCaseToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> loadChannelTriggerMarketCaseToCacheInParam();
	
	/**
	 * 加载关闭规则到缓存入参处理
	* @date: 2017-4-3 
	* @author: sunyuan
	* @title: loadCloseRuleToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> loadCloseRuleToCacheInParam();
	
	/**
	 * 加载评估规则到缓存入参处理
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: loadEvaluateRuleToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> loadEvaluateRuleToCacheInParam();
	
	/**
	 * 加载事件触发营销案到缓存入参处理
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: loadEventTriggerMarketCaseToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> loadEventTriggerMarketCaseToCacheInParam();
	
	/**
	 * 加载费用事件到缓存入参处理
	* @date: 2017-2-12 
	* @author: sunyuan
	* @title: loadPayFeeAndEventRelToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> loadPayFeeAndEventRelToCacheInParam();
	
	/**
	 * 加载营销案详细信息到缓存入参处理
	* @date: 2016-12-30 
	* @author: sunliang 
	* @title: loadMarketCaseToCacheInParam 
	* @param marketCaseLoadInterval
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> loadMarketCaseToCacheInParam(String marketCaseLoadInterval);
	
	/**
	 * 加载产品和事件数据到缓存入参处理
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: loadProductAndEventRelToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> loadProductAndEventRelToCacheInParam();
	
	/**
	 * 加载待生成批量push营销案到缓存入参处理
	* @date: 2017-1-5 
	* @author: sunliang 
	* @title: loadWaitCreateBatchPushMarketCaseToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> loadWaitCreateBatchPushMarketCaseToCacheInParam();
	
	/**
	 * 加载待发送批量push营销案到缓存入参处理
	* @date: 2017-1-5 
	* @author: sunliang 
	* @title: loadWaitSendBatchPushMarketCaseToCacheInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> loadWaitSendBatchPushMarketCaseToCacheInParam();


}
