package com.sitech.strategy.core.objectville.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.impl.MarketCasePacketPojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCasePacketPojo;
import com.sitech.strategy.common.pojo.inter.channel.IChannelPojo;
import com.sitech.strategy.common.pojo.inter.priority.IPriorityPojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IChannel;
import com.sitech.strategy.core.objectville.inter.IChannelTrigger;
import com.sitech.strategy.core.objectville.inter.IComponent;
import com.sitech.strategy.core.objectville.inter.ICustGroup;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IMarketCaseSelector;

/**
 * 渠道触发业务对象
* @date: 2016-12-29 
* @author: sunliang 
* @title: ChannelTrigger 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ChannelTrigger extends BaseClass implements IChannelTrigger {
	
	/**
	 * 组件对象
	 */
	protected IComponent component;
	/**
	 * 渠道对象
	 */
	protected IChannel channel;
	/**
	 * 渠道pojo对象
	 */
	protected IChannelPojo channelPojo;
	/**
	 * 组件对象
	 */
	protected ICustGroup custGroup;
	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * 营销案查询对象
	 */
	protected IMarketCaseSelector marketCaseSelector;
	/**
	 * 优先级pojo
	 */
	protected IPriorityPojo priorityPojo;
	/**
	 * 区域用户群优先级查询操作实现类
	 */
	protected IDataSelector.IPrioritySelector prioritySelector;
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
	 * 渠道对象
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
	* @date: 2017-2-28 
	* @author: sunliang 
	* @title: setChannelPojo 
	* @param channelPojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelPojo(IChannelPojo channelPojo) {
		this.channelPojo = channelPojo;
	}
	/** 
	* @date: 2017-2-21 
	* @author: wangpei
	* @title: setCustGroup 
	* @param custGroup 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setCustGroup(ICustGroup custGroup) {
		this.custGroup = custGroup;
	}
	/**
	 * 
	* @date: 2017-2-11 
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
	* @date: 2017-2-11 
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
	* @date: 2017-2-28 
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
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: setPrioritySelector 
	* @param prioritySelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPrioritySelector(IDataSelector.IPrioritySelector prioritySelector) {
		this.prioritySelector = prioritySelector;
	}
	
	/**
	 * 
	* @date: 2017-2-11 
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
	 * 过滤渠道触发营销案
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: filterChannelTriggerRecommedMarketCase 
	* @param inParam
	* @param userLabelMap
	* @param positionInfoMap
	* @param marketCaseCachePojoList
	* @param showNumMap
	* @param globalRuleMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<IMarketCasePacketPojo> filterChannelTriggerRecommedMarketCase(
			Map<String, Object> inParam,Map<String, Object> userMap,Map<String, String> userLabelMap,
			Map<String, Object> positionInfoMap,
			List<IMarketCaseCachePojo> marketCaseCachePojoList,
			Map<String, Object> globalRuleMap)
			throws StrategyError {
		
		int checkFlag = 0;
		List<IMarketCasePacketPojo> returnMarketCasePacketPojoList = new ArrayList<IMarketCasePacketPojo>();
		List<Map<String, Object>> channelShowNumList = channel.getChannelShowNum(inParam);
		Map<String, Object> channelShowNum = channelPojo.getChannelShowNum(inParam,channelShowNumList);
		Map<String,Object> channelInfoMap = new HashMap<String,Object>();
		channelInfoMap.put("channelId", inParam.get("channelId"));
		//循环判断营销案是否满足
		for(IMarketCaseCachePojo marketCaseCachePojo : marketCaseCachePojoList){
			Map<String,Object> userRecommonedControl = rule.getUserRecommendControlByChannel(inParam,userMap, marketCaseCachePojo.getMarketCaseMap());
			inParam.put("marketCaseTouchControl", userRecommonedControl);
			log.debug("=====userRecommonedControl===", userRecommonedControl);
			//判断营销案下是否有互斥规则
//			List<String> mutexRuleInfoList = rule.getMutexRuleInfoByMarketCase(marketCaseCachePojo);
			
			//判断营销案下是否有满足基于内容关系的构件ID(如营销案ID，客户群ID，子活动ID)等
			Set<String> componentIdSet = component.getComponentIdBaseContent(marketCaseCachePojo);
			log.debug("filterChannelTriggerRecommedMarketCase.componentIdSet" + (String)userMap.get("phoneNo"), componentIdSet);
			List<Map<String,Object>> componentList = component.filterComponentIdBaseContent(inParam,userMap,componentIdSet,positionInfoMap,marketCaseCachePojo,userLabelMap, globalRuleMap,channelInfoMap);
			log.debug("filterChannelTriggerRecommedMarketCase.componentList" + (String)userMap.get("phoneNo"), componentList);
			
			if(CommonUtils.objectIsNull(componentList)){ 
				continue;
			}
			
			for(Map<String,Object> component: componentList){
				String componentId = (String) component.get("componentId");		
				log.debug("====filterChannelTriggerRecommedMarketCase==component=", component);
				//获取内容明细
				Map<String,Object> contentMap = marketCase.getContentMapByComponentId(inParam,componentId, marketCaseCachePojo,(String)positionInfoMap.get("positionId"));
				//获取营销案明细
				Map<String,Object> marketCaseBasicMap = marketCase.getMarketCaseBasicMapByComponentId(componentId, marketCaseCachePojo);
				//校验渠道展示数量
				int showFlag =channelPojo.isChannelShowNum(marketCaseBasicMap, channelShowNum);
				
				if(1 == showFlag){
					//加载加载营销案
					if(!CommonUtils.objectIsNull(positionInfoMap.get("seqId"))){
						marketCaseBasicMap.put("seqId", positionInfoMap.get("seqId"));
					}else{
						marketCaseBasicMap.put("seqId", SequenceUtil.getSequence());
					}
					
					List<Map<String,String>> globalTouchControl = (List<Map<String, String>>)component.get("globalTouchControl");
					IMarketCasePacketPojo marketCasePacketPojo = new MarketCasePacketPojo();
					marketCasePacketPojo.setContentMap(contentMap);
					marketCasePacketPojo.setMarketCaseBasic(marketCaseBasicMap);
					//获取客户群自定义标签
					Map<String,String> custGroupLabel = this.getCustGroupCustomLabel(inParam, userMap, marketCaseCachePojo, componentId);
					marketCasePacketPojo.setLabelInfo(custGroupLabel);
					
					marketCasePacketPojo.setGlobalTouchControl(globalTouchControl);
					Map<String,Object> marketCaseTouchControl = (Map<String, Object>) component.get("marketCaseTouchControl");
					if (CommonUtils.objectIsNull(marketCaseTouchControl)) {
						marketCaseTouchControl = rule.dealFrequencyRuleInTouchResult(userRecommonedControl, 3);
					}
					log.debug("===new====marketCaseTouchControl===", marketCaseTouchControl);
					marketCasePacketPojo.setChannelTouchControl(marketCaseTouchControl);
					returnMarketCasePacketPojoList.add(marketCasePacketPojo);
					
				}else if(0 == showFlag){
					checkFlag = 1;
					break;
				}
			}
			if(checkFlag == 1){
				break;
			}
		}
	
		return returnMarketCasePacketPojoList;
	}
	
	/**
	 * 查询渠道触发营销案
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: queryChannelTriggerMarketCaseDetail 
	* @param inParam
	* @param position
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<IMarketCaseCachePojo> queryChannelTriggerMarketCaseDetail(
			Map<String, Object> inParam, Map<String, Object> userMap,Map<String, Object> position)
			throws StrategyError {
		
		List<IMarketCaseCachePojo> marketCaseCachPojoList = new ArrayList<IMarketCaseCachePojo>();
		List<String> marketCaseCacheIdList = marketCaseSelector.getChannelTriggerMarketCaseCacheFromCache(inParam,position);
		log.debug("queryChannelTriggerMarketCaseDetail.marketCaseCacheIdList", marketCaseCacheIdList);
		Set<String> chooseMarketCaseIds = (Set<String>)position.get("actList");
		
		Map<String,Object> tempParam = new HashMap<String,Object>();
		if(!CommonUtils.objectIsNull(marketCaseCacheIdList)){
			for(String marketCaseId : marketCaseCacheIdList){
				tempParam.clear();
				tempParam.put("marketCaseId", marketCaseId);
				
				if (!CommonUtils.objectIsNull(chooseMarketCaseIds) && !chooseMarketCaseIds.contains(marketCaseId)) {
					log.debug("queryChannelTriggerMarketCaseDetail.chooseMarketCaseIds", chooseMarketCaseIds);
					continue;
				}
				//校验营销案是否暂停
				String marketCaseStatus = marketCaseSelector.getMarketCaseRecommendStatusFromCache(tempParam);
				if(!CommonUtils.objectIsNull(marketCaseStatus) && Const.MARKET_CASE_STATUS_SUSPEND.equals(marketCaseStatus)){
					log.debug("queryChannelTriggerMarketCaseDetail.marketCaseStatus", marketCaseStatus);
					continue;
				}
				//校验是否推荐关闭
				if (!rule.isRecommonedClose(inParam, userMap,tempParam)){
					log.debug("queryChannelTriggerMarketCaseDetail.isRecommonedClose","");
					continue;
				}
				
				MarketCaseCachePojo marketCase = marketCaseSelector.getMarketCaseDetailFromCache(tempParam);
				if (!CommonUtils.objectIsNull(marketCase) && !CommonUtils.objectIsNull(marketCase.getMarketCaseMap())) {
					if (Const.MARKET_CASE_STATUS_EXE.equals(marketCase.getMarketCaseMap().get("statusCode"))
						&&DateUtil.isEffective((String)marketCase.getMarketCaseMap().get("startTime"), (String)marketCase.getMarketCaseMap().get("endTime"), DateUtil.DATE_FROMAT_YYYYMMDD2)) {
						log.debug("queryChannelTriggerMarketCaseDetail.MARKET_CASE_STATUS_EXE","");
						marketCaseCachPojoList.add(marketCase);
					}
				}
				log.debug("queryChannelTriggerMarketCaseDetail.marketCaseCachPojoList.size()", marketCaseCachPojoList.size());
			}
		}	
		return marketCaseCachPojoList;
	}

	/**
	 * 解析渠道触发营销案缓存
	* @date: 2017-2-11 
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
	@Override
	public Map<String, Object> parseChannelTriggerMarketCaseCache(
			List<Map<String, Object>> ChannelTriggerMarketCaseAndPositionIdList)
			throws StrategyError {
		Map<String, Object> channelTriggerMarketCase = new HashMap<String, Object>();
		Set<String> positionSet = new HashSet<String>();
		if(!CommonUtils.objectIsNull(ChannelTriggerMarketCaseAndPositionIdList)){
			//获取运营位的集合
			for(Map<String, Object> marketCaseAndPositionId : ChannelTriggerMarketCaseAndPositionIdList){
				positionSet.add((String)marketCaseAndPositionId.get("positionId"));
			}
			//按照运营位分组
			for(String position : positionSet){
				List<Map<String, Object>> marketCaseList = new ArrayList<Map<String, Object>>();
				Map<String, Object> marketCaseInfo = new HashMap<String, Object>();
				for(Map<String, Object> marketCaseAndPositionId : ChannelTriggerMarketCaseAndPositionIdList){
					if(position.equals((String)marketCaseAndPositionId.get("positionId"))){
						String marketCaseId = (String)marketCaseAndPositionId.get("marketCaseId");
						//查询优先级
						List<Map<String, Object>> regionPriorityList = this.queryMarketCaseAreaPriority(marketCaseAndPositionId);
						if(!CommonUtils.objectIsNull(regionPriorityList)){
							for(Map<String, Object> regionPriority : regionPriorityList){
								marketCaseInfo.put(marketCaseId, Double.valueOf(priorityPojo.getDefaultPriority(marketCaseId)));
							}
						}else{
							marketCaseInfo.put((String)marketCaseAndPositionId.get("marketCaseId"), Double.valueOf(priorityPojo.getDefaultPriority(marketCaseId)));
						}
					}
				}
				marketCaseList.add(marketCaseInfo);
				channelTriggerMarketCase.put(position, marketCaseList);
			}
		}
		return channelTriggerMarketCase;
	}
	
	/** 获取客户群自定义标签数据
	* @date: 2017-2-21 
	* @author: wangpei
	* @title: getCustGroupCustomLabel 
	* @param inParam
	* @param userMap
	* @param marketCaseCachePojo
	* @param CustGroupId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String,String> getCustGroupCustomLabel(Map<String,Object> inParam,Map<String,Object> userMap,IMarketCaseCachePojo marketCaseCachePojo ,String custGroupId) throws StrategyError{
		Map<String,Object> custGroupMap = (Map<String, Object>) marketCaseCachePojo.getCustGroupMap().get(custGroupId);
		String custGroupType = (String) custGroupMap.get("custGroupType");
		Map<String,String> custGroupLabel = null;
		if (Const.CUSTGROUP_TYPE_LOAD.equals(custGroupType) || Const.CUSTGROUP_TYPE_DB.equals(custGroupType)) {
			Map<String,Object> tempInParam = new HashMap<String, Object>();
			tempInParam.put("custGroupId", custGroupId);
			custGroupLabel = custGroup.getCustGroupCustomLabel(userMap, tempInParam);
		}
		return custGroupLabel;
		
	}
	
	/**
	* 查询区域营销案优先级
	* @date: 2016-11-28 
	* @author: yangwl
	* @title: queryMarketCaseAreaPriority 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> queryMarketCaseAreaPriority(Map<String,Object> marketCaseAndPositionId) throws StrategyError{
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("marketCaseId", (String)marketCaseAndPositionId.get("marketCaseId"));
		tempInParam.put("channelId", (String)marketCaseAndPositionId.get("channelId"));
		tempInParam.put("regionCode", (String)marketCaseAndPositionId.get("regionCode"));
		return prioritySelector.selectAreaPriorityList(tempInParam);
	}

}
