package com.sitech.strategy.core.objectville.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.impl.MarketCasePacketPojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCasePacketPojo;
import com.sitech.strategy.common.pojo.inter.position.IPositionPojo;
import com.sitech.strategy.common.pojo.inter.priority.IPriorityPojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IComponent;
import com.sitech.strategy.core.objectville.inter.IEventTrigger;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.objectville.inter.IPosition;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IMarketCaseSelector;
import com.sitech.strategy.persist.capacity.proxy.IMsgSender;
import com.sitech.strategy.persist.capacity.proxy.IMsgSender.IRecommendMsgSender;

/**
 * 事件触发业务对象
* @date: 2017-1-2 
* @author: sunliang 
* @title: EventTrigger 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class EventTrigger extends BaseClass implements IEventTrigger {
	/**
	 * 组件对象
	 */
	protected IComponent component;
	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * 营销案查询对象
	 */
	protected IMarketCaseSelector marketCaseSelector;
	/**
	 * 赠费消息发送对象
	 */
	protected IMsgSender.IGiveFeeSender giveFeeSender;
	/**
	 * 赠套餐消息发送对象
	 */
	protected IMsgSender.IGiveProdSender giveProdSender;
	/**
	 * 运营位对象
	 */
	protected IPosition position;
	/**
	 * 运营位pojo
	 */
	protected IPositionPojo positionPojo;
	/**
	 * 优先级pojo
	 */
	protected IPriorityPojo priorityPojo;
	/**
	 * 推荐短信发送
	 */
	protected IRecommendMsgSender recommendMsgSender;
	/**
	 * 规则对象
	 */
	protected IRule rule;
	
	/**
	 * 
	* @date: 2017-2-21 
	* @author: sunliang 
	* @title: setComponent 
	* @param component 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setComponent(IComponent component) {
		this.component = component;
	}

	/**
	 * 
	* @date: 2017-2-21 
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
	* @date: 2017-2-17 
	* @author: sunliang 
	* @title: setMarketCaseSelector 
	* @param marketCaseSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseSelector(IMarketCaseSelector marketCaseSelector) {
		this.marketCaseSelector = marketCaseSelector;
	}
	
	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: setGiveFeeSender 
	* @param giveFeeSender 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setGiveFeeSender(IMsgSender.IGiveFeeSender giveFeeSender) {
		this.giveFeeSender = giveFeeSender;
	}

	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: setGiveProdSender 
	* @param giveProdSender 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setGiveProdSender(IMsgSender.IGiveProdSender giveProdSender) {
		this.giveProdSender = giveProdSender;
	}
	
	/**
	 * 
	* @date: 2017-2-21 
	* @author: sunliang 
	* @title: setPosition 
	* @param position 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPosition(IPosition position) {
		this.position = position;
	}
	
	/**
	 * 
	* @date: 2017-2-23 
	* @author: sunliang 
	* @title: setPositionPojo 
	* @param positionPojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPositionPojo(IPositionPojo positionPojo) {
		this.positionPojo = positionPojo;
	}
	
	/**
	 * 
	* @date: 2017-3-1 
	* @author: sunliang 
	* @title: setPriorityPojo 
	* @param priorityPojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPriorityPojo(IPriorityPojo priorityPojo) {
		this.priorityPojo = priorityPojo;
	}
	
	/**
	 * 
	* @date: 2017-2-27 
	* @author: sunliang 
	* @title: setRecommendMsgSender 
	* @param recommendMsgSender 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRecommendMsgSender(IRecommendMsgSender recommendMsgSender) {
		this.recommendMsgSender = recommendMsgSender;
	}
	
	/**
	 * 
	* @date: 2017-2-17 
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
	* @date: 2017-2-14 
	* @author: sunliang 
	* @title: filterEventTriggerRecommedMarketCase 
	* @param inParam
	* @param userMap
	* @param userLabelMap
	* @param marketCaseCachePojoList
	* @param channelShowNumMap
	* @param globalRuleMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> filterEventTriggerRecommedMarketCase(
			Map<String, Object> inParam, Map<String, Object> userMap,
			Map<String, String> userLabelMap,
			List<IMarketCaseCachePojo> marketCaseCachePojoList,
			Map<String, Object> globalRuleMap) throws StrategyError {
		Map<String, Object> positionMap = new HashMap<String, Object>();
		List<IMarketCasePacketPojo> returnMarketCasePacketPojoList = new ArrayList<IMarketCasePacketPojo>();
		
		//事件触发时channelInfoMap里存入positionId，方便规则匹配
		Map<String,Object> channelInfoMap = new HashMap<String,Object>();
		//循环判断营销案是否满足
		for(IMarketCaseCachePojo marketCaseCachePojo : marketCaseCachePojoList){
			Map<String,Object> userRecommonedControl = rule.getUserRecommendControlByChannel(inParam,userMap, marketCaseCachePojo.getMarketCaseMap());
			inParam.put("marketCaseTouchControl", userRecommonedControl);
			
			//判断营销案下是否有满足基于内容关系的构件ID(如营销案ID，客户群ID，子活动ID)等
			List<Map<String,Object>>  positionInfoList = position.getPositionInfoForMarketCase(marketCaseCachePojo);
			
			//查询互斥规则
//			List<String> mutexRuleInfoList = rule.getMutexRuleInfoByMarketCase(marketCaseCachePojo);
//			log.debug("===EventTrigger.filterEventTriggerRecommedMarketCase.mutexRuleInfoList===", mutexRuleInfoList);
			
			for(Map<String,Object> positionInfoMap : positionInfoList){
				channelInfoMap.put("channelId",positionInfoMap.get("positionId"));
				log.debug("===EventTrigger.filterEventTriggerRecommedMarketCase.channelInfoMap===",channelInfoMap);
				
				Set<String> componentIdSet = component.getComponentIdBaseContent(marketCaseCachePojo);
				log.debug("filterEventTriggerRecommedMarketCase.componentIdSet" + userMap.get("phoneNo"), componentIdSet);
				List<Map<String,Object>> componentList = component.filterComponentIdBaseContent(inParam,userMap,componentIdSet,positionInfoMap,marketCaseCachePojo,userLabelMap, globalRuleMap,channelInfoMap);
				log.debug("filterEventTriggerRecommedMarketCase.componentList" + userMap.get("phoneNo"), componentList);
				if(CommonUtils.objectIsNull(componentList)){ 
					continue;
				}
				
				log.debug("filterEventTriggerRecommedMarketCase.componentList.size()" + userMap.get("phoneNo"), componentList.size());
				
				for(Map<String,Object> component: componentList){
					String componentId = (String) component.get("componentId");		
					log.debug("filterEventTriggerRecommedMarketCase.componentId" + userMap.get("phoneNo"), componentId);
					
					//获取内容明细
					Map<String,Object> contentMap = marketCase.getContentMapByComponentIdByEvent(inParam,componentId, marketCaseCachePojo,(String)positionInfoMap.get("positionId"));
					log.debug("filterEventTriggerRecommedMarketCase.contentMap", contentMap);
					//获取营销案明细
					Map<String,Object> marketCaseBasicMap = marketCase.getMarketCaseBasicMapByComponentId(componentId, marketCaseCachePojo);
					log.debug("filterEventTriggerRecommedMarketCase.marketCaseBasicMap" + userMap.get("phoneNo"), marketCaseBasicMap);
						
					List<Map<String,String>> globalTouchControl = (List<Map<String, String>>)component.get("globalTouchControl");
					IMarketCasePacketPojo marketCasePacketPojo = new MarketCasePacketPojo();
					marketCasePacketPojo.setContentMap(contentMap);
					marketCasePacketPojo.setMarketCaseBasic(marketCaseBasicMap);
					marketCasePacketPojo.setLabelInfo(new HashMap<String, String>());
					
					marketCasePacketPojo.setGlobalTouchControl(globalTouchControl);
					Map<String,Object> marketCaseTouchControl = (Map<String, Object>) component.get("marketCaseTouchControl");
					if (CommonUtils.objectIsNull(marketCaseTouchControl)) {
						marketCaseTouchControl = rule.dealFrequencyRuleInTouchResult(userRecommonedControl, 3);
					}
					
					marketCasePacketPojo.setChannelTouchControl(marketCaseTouchControl);
					returnMarketCasePacketPojoList.add(marketCasePacketPojo);

				}
				log.debug("filterEventTriggerRecommedMarketCase.returnMarketCasePacketPojoList" + userMap.get("phoneNo"), returnMarketCasePacketPojoList.size());
				positionMap.put((String)positionInfoMap.get("positionId"), returnMarketCasePacketPojoList);
			}
			if(!CommonUtils.objectIsNull(positionMap)){
				return positionMap;
			}
		}
		return positionMap;
	}
	
	/**
	 * 查询事件触发营销案详细
	* @date: 2017-2-14 
	* @author: sunliang 
	* @title: queryEventTriggerMarketCaseDetail 
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
	public List<IMarketCaseCachePojo> queryEventTriggerMarketCaseDetail(
			Map<String, Object> inParam, Map<String, Object> userMap,Map<String,String> userInfoMap)
			throws StrategyError {
		List<IMarketCaseCachePojo> marketCaseCachPojoList = new ArrayList<IMarketCaseCachePojo>();
		inParam.put("userInfoMap", userInfoMap);
		log.debug("queryEventTriggerMarketCaseDetail.inParam" + userMap.get("phoneNo"), inParam);
		List<String> marketCaseCacheIdList = marketCaseSelector.getEventTriggerMarketCaseByEventIdFromCache(inParam);
		
		log.info("queryEventTriggerMarketCaseDetail.marketCaseCacheIdList" + userMap.get("phoneNo"), marketCaseCacheIdList);
		
		Map<String,Object> tempParam = new HashMap<String,Object>();
		if(!CommonUtils.objectIsNull(marketCaseCacheIdList)){
			for(String marketCaseId : marketCaseCacheIdList){
				log.info("queryEventTriggerMarketCaseDetail.marketCaseId0" + userMap.get("phoneNo"), marketCaseId);
				tempParam.clear();
				tempParam.put("marketCaseId", marketCaseId);
				
				//校验营销案是否暂停
				String marketCaseStatus = marketCaseSelector.getMarketCaseRecommendStatusFromCache(tempParam);
				if(!CommonUtils.objectIsNull(marketCaseStatus) && Const.MARKET_CASE_STATUS_SUSPEND.equals(marketCaseStatus)){
					continue;
				}
				log.info("queryEventTriggerMarketCaseDetail.marketCaseId1" + userMap.get("phoneNo"), marketCaseId);
				//校验是否推荐关闭
				if (!rule.isRecommonedClose(inParam, userMap,tempParam)){
					continue;
				}
				log.info("queryEventTriggerMarketCaseDetail.marketCaseId2" + userMap.get("phoneNo"), marketCaseId);
				//查询营销案详细
				MarketCaseCachePojo marketCase = marketCaseSelector.getMarketCaseDetailFromCache(tempParam);
				if (!CommonUtils.objectIsNull(marketCase) && !CommonUtils.objectIsNull(marketCase.getMarketCaseMap())) {
					//查询营销案状态
					if (!Const.MARKET_CASE_STATUS_EXE.equals(marketCase.getMarketCaseMap().get("statusCode"))) {
						continue;
					}
					//判断当前时间是否符合营销案生效时间
					String startTime = (String) marketCase.getMarketCaseMap().get("startTime");
					String endTime = (String) marketCase.getMarketCaseMap().get("endTime");
					log.debug("===EventTrigger.queryEventTriggerMarketCaseDetail.startTime===", startTime);
					log.debug("===EventTrigger.queryEventTriggerMarketCaseDetail.endTime===", endTime);
					if(DateUtil.isEffective(startTime,endTime,DateUtil.TIME_FROMAT_SIMPLE1)){
						log.debug("===EventTrigger.queryEventTriggerMarketCaseDetail.flag===", "true");
						marketCaseCachPojoList.add(marketCase);
					}
				}
				log.info("queryEventTriggerMarketCaseDetail.marketCaseId3" + userMap.get("phoneNo"), marketCaseId);
			}
		}	
		return marketCaseCachPojoList;
	}
	
	/**
	 * 解析事件触发营销案缓存
	 * 按照后续插入缓存的要求，解析组织事件和营销案关系数据
	 * redis数据结构，其中  key是  regionCode:eventId ，value是 zset<marketCaseId,score>
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
	@Override
	public Map<String, Object> parseEventTriggerMarketCaselCache(
			List<Map<String, Object>> eventTriggermarketCaseList)
			throws StrategyError {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Map<String,Map> regionEventMap=new HashMap();//key:"regionCode:eventId", value:marketCaseId,score
		
		if(!CommonUtils.objectIsNull(eventTriggermarketCaseList)){
			//按照regionCode:eventId分组，获得营销案
			for(Map<String, Object> marketCaseMap : eventTriggermarketCaseList){
				String marketCaseId=(String)marketCaseMap.get("marketCaseId");
				String regionCode=(String) marketCaseMap.get("regionCode");
				String eventId=(String) marketCaseMap.get("componentId");
				String compKey=regionCode+Const.SEPARATOR_COLON+eventId;

				if(regionEventMap.containsKey(compKey)){
					Map eventParMap=regionEventMap.get(compKey);
					eventParMap.put(marketCaseId, Double.valueOf(priorityPojo.getDefaultPriority(marketCaseId)));
					
					regionEventMap.put(compKey, eventParMap);		
				}else{
					Map eventParMap= new HashMap();
					eventParMap.put(marketCaseId, Double.valueOf(priorityPojo.getDefaultPriority(marketCaseId)));
					
					regionEventMap.put(compKey, eventParMap);
				}							
				
			}//for
						
			//生成保存 redis cache的数据结构
			for(Entry<String, Map> map : regionEventMap.entrySet()){
				List<Map<String, Object>> cacheList = new ArrayList<Map<String, Object>>();

				String regionEventCompId=(String)map.getKey();
				Map<String, Object> eventInfoMap = (Map<String, Object>)map.getValue();				
				
				//由于后续需要使用putAll的方式保存cache，而那边是个通用的list<map>的结构，因此，此处虽然list是一个元素，也需要构造后续使用的数据结构。
				cacheList.add(eventInfoMap);
				resultMap.put(regionEventCompId, cacheList);
			}			
			
		}		
		return resultMap;
	}

	/**
	 * 发送事件触发消息
	* @date: 2017-2-13 
	* @author: sunliang 
	* @title: sendEventTriggerMsg 
	* @param inParam
	* @param marketCaseParketPojoList 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-27 luogj 修改推荐短信的运营位判断方法；报文格式化方法增加inParam入参
	 */
	@Override
	public void sendEventTriggerMsg(Map<String, Object> inParam,
			List<Map<String, Object>> marketCaseParketPojoList) throws StrategyError {
		
		log.debug("sendEventTriggerMsg.inParam", inParam);
		log.debug("sendEventTriggerMsg.marketCaseParketPojoList.size()", marketCaseParketPojoList.size());
		
		Map<String,Object> tempParam = new HashMap<String,Object>();
		for(Map<String,Object> marketCaseParketPojo : marketCaseParketPojoList){
			Map<String,Object> userMap = (Map<String,Object>)marketCaseParketPojo.get("userMap") == null ? new HashMap<String,Object>() : (Map<String,Object>)marketCaseParketPojo.get("userMap");
			Map<String,Object> userInfoMap = (Map<String,Object>)marketCaseParketPojo.get("userInfoMap") == null ? new HashMap<String,Object>() : (Map<String,Object>)marketCaseParketPojo.get("userInfoMap");
			Map<String,Object> positionMap = (Map<String,Object>)marketCaseParketPojo.get("positionInfoMap") == null ? new HashMap<String,Object>() : (Map<String,Object>)marketCaseParketPojo.get("positionInfoMap");
			Map<String,Object> userLabelMap = (Map<String,Object>)marketCaseParketPojo.get("userLabelMap") == null ? new HashMap<String,Object>() : (Map<String,Object>)marketCaseParketPojo.get("userLabelMap");
			
			log.debug("sendEventTriggerMsg.positionMap" + (String)userMap.get("phoneNo"), positionMap);
			log.debug("sendEventTriggerMsg.userMap.phoneNo" + (String)userMap.get("phoneNo"), marketCaseParketPojo);
			tempParam.clear();
			tempParam.put("userMap", userMap);
			tempParam.put("userInfoMap", userInfoMap);
			tempParam.put("userLabelMap", userLabelMap);
			for(Map.Entry<String, Object> entry : positionMap.entrySet()){
				String positionId = entry.getKey();
				log.debug("sendEventTriggerMsg.positionId" + (String)userMap.get("phoneNo"), positionId);
				List<IMarketCasePacketPojo> marketCasePacketPojoList = (List<IMarketCasePacketPojo>)entry.getValue();
				for(IMarketCasePacketPojo marketCasePacketPojo : marketCasePacketPojoList){
					tempParam.put("marketCasePacketPojo", marketCasePacketPojo);
					log.debug("sendEventTriggerMsg.marketCasePacketPojo.getMarketCaseBasic()" + (String)userMap.get("phoneNo"), marketCasePacketPojo.getMarketCaseBasic());
					if(positionPojo.isGiveFeePositon(positionId)){
						log.debug("sendEventTriggerMsg", "赠费用");
						giveFeeSender.sendGiveFeeMsg(inParam, tempParam);
					}else if(positionPojo.isGiveProdPosition(positionId)){
						log.debug("sendEventTriggerMsg", "赠套餐");
						giveProdSender.sendGiveProdMsg(inParam, tempParam);
					}else if(positionPojo.isRecommendMsgPosition(positionId)){
						log.debug("sendEventTriggerMsg", "发短信");
						recommendMsgSender.sendRecommendMsg(inParam, tempParam);
					}
				}
			}
		}
	}

}
