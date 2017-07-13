package com.sitech.strategy.process.batch;

import java.util.Map;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.base.BaseClass;
import com.sitech.strategy.process.entity.inter.IChannelProcessEntity;
import com.sitech.strategy.process.entity.inter.ICustGroupProcessEntity;
import com.sitech.strategy.process.entity.inter.IEventProcessEntity;
import com.sitech.strategy.process.entity.inter.IMarketCaseProcessEntity;
import com.sitech.strategy.process.entity.inter.IQuestionNaireProcessEntity;
import com.sitech.strategy.process.entity.inter.IRuleProcessEntity;
import com.sitech.strategy.process.entity.param.inter.ILoadCacheProcessParam;

/**
 * 加载缓存
* @date: 2016-9-5 
* @author: sunliang 
* @title: LoadCache 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class LoadCache extends BaseClass{
	
	/**
	 * 渠道实体
	 */
	protected IChannelProcessEntity channelProcessEntity;
	/**
	 * 目标客户群实体
	 */
	protected ICustGroupProcessEntity custGroupProcessEntity;
	/**
	 * 事件实体
	 */
	protected IEventProcessEntity eventProcessEntity;
	/**
	 * 加载缓存参数处理对象
	 */
	protected ILoadCacheProcessParam loadCacheProcessParam;
	/**
	 * 营销案实体
	 */
	protected IMarketCaseProcessEntity marketCaseProcessEntity;
	/**
	 * 调查问卷实体
	 */
	protected IQuestionNaireProcessEntity questionNaireProcessEntity;
	/**
	 * 规则实体
	 */
	protected IRuleProcessEntity ruleProcessEntity;

	/**
	 * 
	* @date: 2016-11-29 
	* @author: yangwl
	* @title: setChannelProcessEntity 
	* @param channelProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelProcessEntity(IChannelProcessEntity channelProcessEntity) {
		this.channelProcessEntity = channelProcessEntity;
	}

	/**
	 * 
	* @date: 2016-9-14 
	* @author: yangwl
	* @title: setCustGroupProcessEntity 
	* @param custGroupProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupProcessEntity(
			ICustGroupProcessEntity custGroupProcessEntity) {
		this.custGroupProcessEntity = custGroupProcessEntity;
	}
	
	/**
	 * 
	* @date: 2016-11-24 
	* @author: yuanliang
	* @title: setEventProcessEntity 
	* @param eventProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventProcessEntity(IEventProcessEntity eventProcessEntity) {
		this.eventProcessEntity = eventProcessEntity;
	}
	
	/**
	 * 
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: setLoadCacheProcessParam 
	* @param loadCacheProcessParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setLoadCacheProcessParam(
			ILoadCacheProcessParam loadCacheProcessParam) {
		this.loadCacheProcessParam = loadCacheProcessParam;
	}

	/**
	 * 
	* @date: 2016-9-14 
	* @author: yangwl
	* @title: setMarketCaseProcessEntity 
	* @param marketCaseProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseProcessEntity(
			IMarketCaseProcessEntity marketCaseProcessEntity) {
		this.marketCaseProcessEntity = marketCaseProcessEntity;
	}

	/**
	 * 
	* @date: 2016-12-22 
	* @author: yuanliang
	* @title: setQuestionNaireProcessEntity 
	* @param questionNaireProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setQuestionNaireProcessEntity(
			IQuestionNaireProcessEntity questionNaireProcessEntity) {
		this.questionNaireProcessEntity = questionNaireProcessEntity;
	}
	
	/**
	 * 
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: setRuleProcessEntity 
	* @param ruleProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRuleProcessEntity(IRuleProcessEntity ruleProcessEntity) {
		this.ruleProcessEntity = ruleProcessEntity;
	}
	
	/**
	 * 加载渠道展示数量到缓存
	* @date: 2016-11-29 
	* @author: yangwl
	* @title: loadChannelShowToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadChannelShowNumToCache(){
		try {
			channelProcessEntity.loadChannelShowNumToCache();
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 加载渠道触发营销案到缓存
	* @date: 2016-11-21 
	* @author: yangwl
	* @title: loadChannelTriggerMarketCaseToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadChannelTriggerMarketCaseToCache(){
		try {
			Map<String,Object> inParam = loadCacheProcessParam.loadChannelTriggerMarketCaseToCacheInParam();
			marketCaseProcessEntity.loadChannelTriggerMarketCaseToCache(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 加载关闭规则到缓存
	* @date: 2017-4-3 
	* @author: sunyuan
	* @title: loadCloseRuleToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadCloseRuleToCache(){
		try{
			Map<String,Object> inParam = loadCacheProcessParam.loadCloseRuleToCacheInParam();
			ruleProcessEntity.loadCloseRuleToCache(inParam);
		}catch(StrategyError e){
			e.printStackTrace();
		}
	}
	
	/**
	 * 加载目标客户群标签到缓存
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: loadCustGoupLabelToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadCustGoupLabelToCache(){
		try {
			custGroupProcessEntity.loadCustGoupLabelToCache();
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 加载评估规则到缓存
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: loadEvaluateRuleToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadEvaluateRuleToCache(){
		try{
			Map<String,Object> inParam = loadCacheProcessParam.loadEvaluateRuleToCacheInParam();
			ruleProcessEntity.loadEvaluateRuleToCache(inParam);
		}catch(StrategyError e){
			e.printStackTrace();
		}
	}
	
	/**
	 * 加载事件触发营销案到缓存
	* @date: 2016-11-24 
	* @author: yuanliang
	* @title: loadEventTriggerMarketCaseToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadEventTriggerMarketCaseToCache(){
		try {
			Map<String,Object> inParam = loadCacheProcessParam.loadEventTriggerMarketCaseToCacheInParam();
			marketCaseProcessEntity.loadEventTriggerMarketCaseToCache(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 加载全局规则到缓存
	* @date: 2016-11-19 
	* @author: yangwl
	* @title: loadGlobalRuleToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadGlobalRuleToCache(){
		try {
			ruleProcessEntity.loadGlobalRuleToCache();
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}

	/**
	 * 加载营销案数据到缓存
	* @date: 2016-11-7 
	* @author: sunliang 
	* @title: loadMarketCaseToCache 
	* @param marketCaseLoadInterval 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadMarketCaseToCache(String marketCaseLoadInterval){
		try {
			Map<String,Object> inParam = loadCacheProcessParam.loadMarketCaseToCacheInParam(marketCaseLoadInterval);
			marketCaseProcessEntity.loadMarketCaseToCache(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 加载互斥规则到缓存
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: loadMutexRuleToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
//	public void loadMutexRuleToCache(){
//		try {
//			ruleProcessEntity.loadMutexRuleToCache();
//		} catch (StrategyError e) {
//			e.printStackTrace();
//		}
//	}
	
	/**
	 * 加载缴费事件到缓存
	* @date: 2017-2-12 
	* @author: sunyuan
	* @title: loadFeeEventToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadPayFeeAndEventRelToCache(){
		try {
			Map<String,Object> inParam = loadCacheProcessParam.loadPayFeeAndEventRelToCacheInParam();
			eventProcessEntity.loadPayFeeAndEventRelToCache(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 加载产品和事件数据到缓存
	* @date: 2016-11-24 
	* @author: yuanliang
	* @title: loadProductAndEventRelToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadProductAndEventRelToCache(){
		try {
			Map<String,Object> inParam = loadCacheProcessParam.loadProductAndEventRelToCacheInParam();
			eventProcessEntity.loadProductAndEventRelToCache(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	

	/**
	 * 加载营销案和问卷调查ID到缓存
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: loadQuestionMarketCaseToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadQuestionMarketCaseToCache(){
		try {
			questionNaireProcessEntity.loadQuestionMarketCaseToCache();
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}	
	
	/**
	 * 加载待生成批量push营销案到缓存
	* @date: 2017-1-5 
	* @author: sunliang 
	* @title: loadWaitCreateBatchPushMarketCaseToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadWaitCreateBatchPushMarketCaseToCache(String param){
		try {
			Map<String,Object> inParam = loadCacheProcessParam.loadWaitCreateBatchPushMarketCaseToCacheInParam();
			marketCaseProcessEntity.loadWaitCreateBatchPushMarketCaseToCache(inParam,param);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 加载外呼任务营销案到缓存
	* @date: 2017-3-17 
	* @author: yuanchun
	* @title: loadWaitCreateCallTaskMarketCaseCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */			
	public void loadWaitCreateCallTaskMarketCaseCache(){
		try {
			Map<String,Object> inParam = loadCacheProcessParam.loadWaitCreateCallTaskMarketCaseToCacheInParam();
			marketCaseProcessEntity.loadWaitCreateCallTaskMarketCaseToCache(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 加载渠道任务营销案到缓存
	* @date: 2016-10-12 
	* @author: yangwl
	* @title: loadWaitCreateChannelTaskMarketCaseToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadWaitCreateChannelTaskMarketCaseToCache(){
		try {
			Map<String,Object> inParam = loadCacheProcessParam.loadWaitCreateChannelTaskMarketCaseToCacheInParam();
			marketCaseProcessEntity.loadWaitCreateChannelTaskMarketCaseToCache(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 加载待发送批量push营销案到缓存
	* @date: 2017-1-5 
	* @author: sunliang 
	* @title: loadWaitSendBatchPushMarketCaseToCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadWaitSendBatchPushMarketCaseToCache(){
		try {
			Map<String,Object> inParam = loadCacheProcessParam.loadWaitSendBatchPushMarketCaseToCacheInParam();
			marketCaseProcessEntity.loadWaitSendBatchPushMarketCaseToCache(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: main 
	* @param args 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void main(String[] args){
		System.out.println("=========welcome LoadCache===========");
		String loadType = args[0];
		String pushParam = "";
		if(args.length>1){
			pushParam = args [1];
		}
		
		
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_ALL);
		LoadCache loadCache = (LoadCache)springBeanFactory.getBean("loadCache");
		long start = System.currentTimeMillis();

		if(loadType.equals("loadChannelShowNumToCache")){
			loadCache.loadChannelShowNumToCache();
		}
		
		if(loadType.equals("loadChannelTriggerMarketCaseToCache")){
			loadCache.loadChannelTriggerMarketCaseToCache();
		}
		
		if(loadType.equals("loadCloseRuleToCache")){
			loadCache.loadCloseRuleToCache();
		}
		
		if(loadType.equals("loadCustGoupLabelToCache")){
			loadCache.loadCustGoupLabelToCache();
		}
		
		if(loadType.equals("loadEvaluateRuleToCache")){
			loadCache.loadEvaluateRuleToCache();
		}
		
		if(loadType.equals("loadEventTriggerMarketCaseToCache")){
			loadCache.loadEventTriggerMarketCaseToCache();
		}
		
		if(loadType.equals("loadPayFeeAndEventRelToCache")){
			loadCache.loadPayFeeAndEventRelToCache();
		}
		
		if(loadType.equals("loadGlobalRuleToCache")){
			loadCache.loadGlobalRuleToCache();
		}
		
		if(loadType.equals("loadMarketCaseToCache")){
			String marketCaseLoadInterval = args[1];
			loadCache.loadMarketCaseToCache(marketCaseLoadInterval);
		}
		
//		if(loadType.equals("loadMutexRuleToCache")){
//			loadCache.loadMutexRuleToCache();
//		}
		
		if(loadType.equals("loadProductAndEventRelToCache")){
			loadCache.loadProductAndEventRelToCache();
		}
		
		if(loadType.equals("loadQuestionMarketCaseToCache")){
			loadCache.loadQuestionMarketCaseToCache();
		}
		
		if(loadType.equals("loadWaitCreateBatchPushMarketCaseToCache")){
			loadCache.loadWaitCreateBatchPushMarketCaseToCache(pushParam);
		}
		
		if(loadType.equals("loadWaitCreateCallTaskMarketCaseCache")){
			loadCache.loadWaitCreateCallTaskMarketCaseCache();
		}
		
		if(loadType.equals("loadWaitCreateChannelTaskMarketCaseToCache")){
			loadCache.loadWaitCreateChannelTaskMarketCaseToCache();
		}
		
		if(loadType.equals("loadWaitSendBatchPushMarketCaseToCache")){
			loadCache.loadWaitSendBatchPushMarketCaseToCache();
		}
		
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("总共花时间为：" + time/1000 + "s");
	}
}
