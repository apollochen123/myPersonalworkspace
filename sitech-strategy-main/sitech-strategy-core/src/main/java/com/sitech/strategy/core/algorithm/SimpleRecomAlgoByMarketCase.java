package com.sitech.strategy.core.algorithm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCasePacketPojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IChannel;
import com.sitech.strategy.core.objectville.inter.IChannelTask;
import com.sitech.strategy.core.objectville.inter.IChannelTrigger;
import com.sitech.strategy.core.objectville.inter.IEventTrigger;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.core.objectville.inter.IUser;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 基本营销案的简单推荐算法
* @date: 2016-9-5 
* @author: sunliang 
* @title: SimpleRecomAlgoByMarketCase 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class SimpleRecomAlgoByMarketCase extends Algorithm implements IRecommedAlgo,Serializable {

	/**
	 * 渠道对象
	 */
	protected IChannel channel;
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
	 * 规则对象
	 */
	protected IRule rule;
	/**
	 * 用户对象
	 */
	protected IUser user;
	/**
	 * 用户查询对象
	 */
	protected IDataSelector.IUserSelector userSelector;

	/**
	 * 
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: setChannel 
	* @param channel 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannel(IChannel channel) {
		this.channel = channel;
	}
	
	/**
	 * 
	* @date: 2017-2-11 
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
	* @date: 2017-2-12 
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
	* @date: 2017-2-14 
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
	* @date: 2016-10-21 
	* @author: yangwl
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
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: setUser 
	* @param user 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUser(IUser user) {
		this.user = user;
	}

	/**
	 * 
	* @date: 2016-10-21 
	* @author: yangwl
	* @title: setUserSelector 
	* @param userSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUserSelector(IDataSelector.IUserSelector userSelector) {
		this.userSelector = userSelector;
	}

	/**
	 * 获取渠道任务推荐营销案列表
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getChannelTaskRecommendMarketCaseList 
	* @param inParam
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getChannelTaskRecommendMarketCaseList(Map<String, Object> inParam,Map<String, Object> tempInParam,List<Map<String, Object>> userMap) throws StrategyError {
		
		Map<String, Object> returnMarketCasePacketPojoMap = new HashMap<String, Object>();
		returnMarketCasePacketPojoMap.put("userMap", tempInParam);
		log.debug("getChannelTaskRecommendMarketCaseList==tempInParam=", tempInParam);
		//查询用户数据
		Map<String,String> userInfoMap = userSelector.selectUserInfoByIdNo(tempInParam);
		returnMarketCasePacketPojoMap.put("userInfoMap", userInfoMap);
		//查询用户标签数据
		Map<String,String> userLabelMap = userSelector.selectUserLabelByIdNo(tempInParam);
		returnMarketCasePacketPojoMap.put("userLabelMap", userLabelMap);
		
		//查询全局规则
		Map<String, Object> globalRuleMap = rule.getGlobalRuleByCache();
		log.debug("getChannelTaskRecommendMarketCaseList.globalRuleMap", globalRuleMap);
		//查询全局频控控制数据
		Map<String, Object> globalTouchControlAndRule= rule.getGlobalRecommendControlAndRule(inParam,tempInParam, globalRuleMap);
		log.debug("getChannelTaskRecommendMarketCaseList.globalTouchControlAndRule", globalRuleMap);
		inParam.put("globalTouchControlAndRule", globalTouchControlAndRule);
		
		//根据运营位查询营销案
		Map<String, Object> positionMap = new HashMap<String, Object>();
		List<IMarketCaseCachePojo> marketCaseCachePojoList = channelTask.queryChannelTaskMarketCaseDetail(inParam, tempInParam);
		log.debug("getChannelTaskRecommendMarketCaseList.==marketCaseCachePojoList=", marketCaseCachePojoList);
		Map<String, Object> positionInfoMap = new HashMap<String, Object>();
		positionInfoMap.put("positionId", tempInParam.get("positionId"));
		log.debug("getChannelTaskRecommendMarketCaseList==positionInfoMap=", positionInfoMap);
		List<IMarketCasePacketPojo> recommendMarketList = channelTrigger.filterChannelTriggerRecommedMarketCase(inParam,tempInParam,userLabelMap,positionInfoMap,marketCaseCachePojoList,globalRuleMap);
		positionMap.put((String)tempInParam.get("positionId"), recommendMarketList);
		
		returnMarketCasePacketPojoMap.put("positionInfoMap", positionMap);
		
		return returnMarketCasePacketPojoMap;
	}
	
	/**
	 * 获取渠道触发推荐营销案列表
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getChannelTriggerRecommedMarketCaseList 
	* @param inParam
	* @param userMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getChannelTriggerRecommedMarketCaseList(Map<String, Object> inParam,Map<String,Object> userMap) throws StrategyError{
		
		Map<String, Object> returnMarketCasePacketPojoMap = new HashMap<String, Object>();
		returnMarketCasePacketPojoMap.put("userMap", userMap);
		
		//查询全局规则
		Map<String, Object> globalRuleMap = rule.getGlobalRuleByCache();
		log.debug("getRecommedMarketCaseList.globalRuleMap", globalRuleMap);
		
		//查询全局频控控制数据
		Map<String, Object> globalTouchControlAndRule= rule.getGlobalRecommendControlAndRule(inParam,userMap, globalRuleMap);
		log.debug("getRecommedMarketCaseList.globalTouchControlAndRule", globalTouchControlAndRule);
		inParam.put("globalTouchControlAndRule", globalTouchControlAndRule);
		
		//查询用户标签数据
		Map<String,String> userLabelMap = user.queryUserLabelByIdNo(userMap);
		returnMarketCasePacketPojoMap.put("userLabelMap", userLabelMap);
		log.debug("getRecommedMarketCaseList.userLabelMap", userLabelMap);
		
		//查询用户数据
		Map<String,String> userInfoMap = user.queryUserInfoByIdNo(userMap);
		returnMarketCasePacketPojoMap.put("userInfoMap", userInfoMap);
		log.debug("getRecommedMarketCaseList.userInfoMap", userInfoMap);
		
		//根据运营位查询营销案
		Map<String, Object> positionMap = new HashMap<String, Object>();
		List<Map<String, Object>> positionIdList = (List<Map<String, Object>>)inParam.get("positionIdList");
		for(Map<String, Object> positionInfoMap : positionIdList){
			List<IMarketCaseCachePojo> marketCaseCachePojoList = new ArrayList<IMarketCaseCachePojo>();
			if (!CommonUtils.objectIsNull(userInfoMap.get("regionCode")) && userInfoMap.get("regionCode").equals(inParam.get("regionCode"))) {
				marketCaseCachePojoList = channelTrigger.queryChannelTriggerMarketCaseDetail(inParam, userMap,positionInfoMap);
				log.debug("marketCaseCachePojoList.size()", marketCaseCachePojoList.size());
			}
			List<IMarketCasePacketPojo> recommendMarketList = channelTrigger.filterChannelTriggerRecommedMarketCase(inParam,userMap,userLabelMap,positionInfoMap,marketCaseCachePojoList,globalRuleMap);
			log.debug("getChannelTriggerRecommedMarketCaseList.recommendMarketList", recommendMarketList);
			positionMap.put((String)positionInfoMap.get("positionId"), recommendMarketList);
		}
		returnMarketCasePacketPojoMap.put("positionInfoMap", positionMap);
		
		//查询用户的接触历史记录
		List<Map<String, Object>> userTouchHisRecordList = user.getUserHisTouchRecord(userMap);
		returnMarketCasePacketPojoMap.put(Const.PACKET_PARAM_NODE_TOUCH_HIS_LIST, userTouchHisRecordList);
		
		log.debug("SimpleRecomAlgoByMarketCase.getChannelTriggerRecommedMarketCaseList.returnMarketCasePacketPojoMap", returnMarketCasePacketPojoMap);
		
		return returnMarketCasePacketPojoMap;
	}
	
	/**
	 * 获取事件触发推荐营销案列表
	* @date: 2017-2-13 
	* @author: sunliang 
	* @title: getEventTriggerRecommedMarketCaseList 
	* @param inParam
	* @param userMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getEventTriggerRecommedMarketCaseList(
			Map<String, Object> inParam,Map<String,Object> userMap) throws StrategyError {
		Map<String, Object> returnMarketCasePacketPojoMap = new HashMap<String, Object>();
		returnMarketCasePacketPojoMap.put("userMap", userMap);
		
		//查询全局规则
		Map<String, Object> globalRuleMap = rule.getGlobalRuleByCache();
		log.debug("getRecommedMarketCaseList.globalRuleMap", globalRuleMap);
		
		//查询全局频控控制数据
		Map<String, Object> globalTouchControlAndRule= rule.getGlobalRecommendControlAndRule(inParam, userMap,globalRuleMap);
		log.debug("getRecommedMarketCaseList.globalTouchControlAndRule", globalTouchControlAndRule);
		inParam.put("globalTouchControlAndRule", globalTouchControlAndRule);
		
		//查询用户标签数据
		Map<String,String> userLabelMap = user.queryUserLabelByIdNo(userMap);
		returnMarketCasePacketPojoMap.put("userLabelMap", userLabelMap);
		log.debug("getRecommedMarketCaseList.userLabelMap", userLabelMap);
		
		//查询用户数据
		Map<String,String> userInfoMap = user.queryUserInfoByIdNo(userMap);
		returnMarketCasePacketPojoMap.put("userInfoMap", userInfoMap);
		log.debug("getRecommedMarketCaseList.userInfoMap", userInfoMap);
		
		List<IMarketCaseCachePojo> marketCaseCachePojoList = eventTrigger.queryEventTriggerMarketCaseDetail(inParam,userMap,userInfoMap);
		log.info("SimpleRecomAlgoByMarketCase.getEventTriggerRecommedMarketCaseList.marketCaseCachePojoList.size()" + userMap.get("phoneNo"), marketCaseCachePojoList.size());
		Map<String, Object> positionMap = eventTrigger.filterEventTriggerRecommedMarketCase(inParam,userMap,userLabelMap,marketCaseCachePojoList,globalRuleMap);
		log.info("SimpleRecomAlgoByMarketCase.getEventTriggerRecommedMarketCaseList.positionMap" + userMap.get("phoneNo"), positionMap);
		
		returnMarketCasePacketPojoMap.put("positionInfoMap", positionMap);
		log.info("SimpleRecomAlgoByMarketCase.getEventTriggerRecommedMarketCaseList.returnMarketCasePacketPojoMap", returnMarketCasePacketPojoMap);
		
		return returnMarketCasePacketPojoMap;
	}

}
