package com.sitech.strategy.common.pojo.impl.cache;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.cache.ICacheKey;
import com.sitech.strategy.common.utils.Const;

/**
 * 缓存key对象
* @date: 2017-1-13 
* @author: sunliang 
* @title: CacheKey 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class CacheKey extends BaseClass implements ICacheKey ,Serializable{

	/**
	 * 
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getChannelTriggerMarketCaseCacheFromCacheKey 
	* @param inParam
	* @param position
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> getChannelTriggerMarketCaseCacheFromCacheKey(
			Map<String, Object> inParam, Map<String, Object> position) {
		Map<String, Object> outParam = new HashMap<String, Object>();
		outParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_CHANNELTRIGGER + (String)inParam.get("regionCode") + Const.SEPARATOR_COLON + (String)position.get("positionId"));
		outParam.put(Const.CACHE_START, "0");
		outParam.put(Const.CACHE_END, "-1");
		return outParam;
	}

	/**
	 * 
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getMarketCaseRecommendStatusFromCacheKey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getMarketCaseRecommendStatusFromCacheKey(
			Map<String, Object> tempInParam) {
		Map<String, Object> outParam = new HashMap<String, Object>();
		outParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_RECOMMENDSTATUS + (String)tempInParam.get("marketCaseId"));
		return outParam;
	}

	/**
	 * 
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getMarketCaseDetailFromCacheKey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getMarketCaseDetailFromCacheKey(
			Map<String, Object> tempInParam) {
		Map<String,Object> outParam = new HashMap<String,Object>();
		String key = Const.CACHE_DATATYPE_MARKETCASE_DETAIL + (String)tempInParam.get("marketCaseId");
		outParam.put(Const.CACHE_KEY, key);
		return outParam;
	}

	/**
	 * 
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getChannelShowNumFromCacheKey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getChannelShowNumFromCacheKey(
			Map<String, Object> tempInParam) {
		Map<String,Object> tempParam = new HashMap<String,Object>();
		tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_CHANNEL_SHOWNUM + tempInParam.get("channelId"));
		return tempParam;
	}

	/**
	 * 
	* @date: 2017-2-17 
	* @author: sunliang 
	* @title: getEventTriggerMarketCaseByEventIdFromCacheKey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getEventTriggerMarketCaseByEventIdFromCacheKey(
			Map<String, Object> tempInParam) {
		Map<String,Object> tempParam = new HashMap<String,Object>();
		Map<String,Object> userInfoMap = (Map<String,Object>)tempInParam.get("userInfoMap");
		String regionCode = (String)userInfoMap.get("regionCode");
		tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_EVENTTRIGGER + regionCode + Const.SEPARATOR_COLON + (String)tempInParam.get("eventId"));
		tempParam.put(Const.CACHE_START, "0");
		tempParam.put(Const.CACHE_END, "-1");
		
		log.debug("getEventTriggerMarketCaseByEventIdFromCacheKey.CACHE_KEY", tempParam.get(Const.CACHE_KEY));
		
		return tempParam;
	}
	
	/**
	 * 
	* @date: 2017-4-7 
	* @author: sunliang
	* @title: getEventTriggerMarketCaseByEventIdFromCacheKeyForAll 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getEventTriggerMarketCaseByEventIdFromCacheKeyForAll(
			Map<String, Object> tempInParam) {
		Map<String,Object> tempParam = new HashMap<String,Object>();
		Map<String,Object> userInfoMap = (Map<String,Object>)tempInParam.get("userInfoMap");
		String regionCode = (String)userInfoMap.get("regionCode");
		//2210暂时写死，后续从regionCode类中取 by sunliang 20170407 紧急上线
		tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_EVENTTRIGGER + "2210" + Const.SEPARATOR_COLON + (String)tempInParam.get("eventId"));
		tempParam.put(Const.CACHE_START, "0");
		tempParam.put(Const.CACHE_END, "-1");
		
		log.debug("getEventTriggerMarketCaseByEventIdFromCacheKey.CACHE_KEY", tempParam.get(Const.CACHE_KEY));
		
		return tempParam;
	}


	/**
	 * 根据资费ID查询营销案列表（评估规则）
	* @date: 2017-4-7 
	* @author: zhangyw_crmpd
	* @title: getMarketCaseIdByPostageIdFromCacheKey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getMarketCaseIdByPostageIdFromEvaluateCacheKey(
			Map<String, Object> tempInParam) {
		Map<String,Object> tempParam = new HashMap<String,Object>();

		tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_RULE_EVALUATE + (String)tempInParam.get("prodPrcid"));
		tempParam.put(Const.CACHE_START, "0");
		tempParam.put(Const.CACHE_END, "-1");
		
		log.info("getMarketCaseIdByPostageIdFromEvaluateCacheKey.CACHE_KEY", tempParam.get(Const.CACHE_KEY));
		
		return tempParam;
	}
	
	/**
	 * 根据资费ID查询营销案列表(关闭规则)
	* @date: 2017-4-10 
	* @author: zhangyw_crmpd
	* @title: getMarketCaseIdByPostageIdFromCloseCacheKey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getMarketCaseIdByPostageIdFromCloseCacheKey(
			Map<String, Object> tempInParam) {
		Map<String,Object> tempParam = new HashMap<String,Object>();

		tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_RULE_CLOSE  + (String)tempInParam.get("prodPrcid"));
		tempParam.put(Const.CACHE_START, "0");
		tempParam.put(Const.CACHE_END, "-1");
		
		log.info("getMarketCaseIdByPostageIdFromCloseCacheKey.CACHE_KEY", tempParam.get(Const.CACHE_KEY));
		
		return tempParam;
	}

	/**
	 * 
	* @date: 2017-3-31 
	* @author: sunyuan
	* @title: getMutexRuleFromCacheKey 
	* @param tempParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> getMutexRuleFromCacheKey(Map<String,Object> tempInParam){
		Map<String,Object> tempParam = new HashMap<String,Object>();
		String key = Const.CACHE_DATATYPE_RULE_MUTEXRULE+(String)tempInParam.get("marketCaseId");
		tempParam.put(Const.CACHE_KEY, key);
		tempParam.put(Const.CACHE_START, "0");
		tempParam.put(Const.CACHE_END, "-1");
		return tempParam;
	}
	

}
