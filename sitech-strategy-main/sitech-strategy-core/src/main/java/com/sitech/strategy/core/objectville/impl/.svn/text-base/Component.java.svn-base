package com.sitech.strategy.core.objectville.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IChannel;
import com.sitech.strategy.core.objectville.inter.IComponent;
import com.sitech.strategy.core.objectville.inter.ICustGroup;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.objectville.inter.IRule;

/**
 * 组件对象
* @date: 2017-2-21 
* @author: sunliang 
* @title: Component 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class Component extends BaseClass implements IComponent {
	
	/**
	 * 渠道对象
	 */
	protected IChannel channel;
	/**
	 * 客户群对象
	 */
	protected ICustGroup custGroup;
	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * 规则对象
	 */
	protected IRule rule;
	
	/**
	 * 
	* @date: 2017-2-21 
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
	* @date: 2017-2-21 
	* @author: sunliang 
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
	* @date: 2017-2-21 
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
	 * 获取营销案下基于内容的构件ID(如营销案ID，客户群ID，子活动ID)
	* @date: 2017-2-21 
	* @author: sunliang 
	* @title: getComponentIdBaseContent 
	* @param marketCaseCachePojo
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Set<String> getComponentIdBaseContent(
			IMarketCaseCachePojo marketCaseCachePojo) throws StrategyError {
		Set<String> ComponentIdSet = new HashSet<String>();
		Map<String,Object> marketCaseRel = marketCaseCachePojo.getMarketCaseRel();
		String marketCaseId = (String)(marketCaseCachePojo.getMarketCaseMap()).get("marketCaseId");
		Map<String, Object> marketCaseInfo = (Map<String, Object>)((Map<String, Object>)marketCaseRel.get(Const.COMPONENT_TYPE_MARKETCASE)).get(marketCaseId);
		if (CommonUtils.objectIsNull(marketCaseInfo) || CommonUtils.objectIsNull(marketCaseInfo.get(Const.COMPONENT_TYPE_CUSTGROUP))) {
			return ComponentIdSet;
		}
		ComponentIdSet = ((Map<String,Object>)marketCaseInfo.get(Const.COMPONENT_TYPE_CUSTGROUP)).keySet();
		return ComponentIdSet;
	}

	/**
	 * 过滤营销案下基于内容的构件ID(如营销案ID，客户群ID，子活动ID)
	* @date: 2017-2-21 
	* @author: sunliang 
	* @title: filterComponentIdBaseContent 
	* @param inParam
	* @param userMap
	* @param componentIdSet
	* @param positionInfoMap
	* @param marketCaseCachePojo
	* @param userLabelMap
	* @param globalRuleMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> filterComponentIdBaseContent(
			Map<String, Object> inParam, Map<String, Object> userMap,
			Set<String> componentIdSet, Map<String, Object> positionInfoMap,
			IMarketCaseCachePojo marketCaseCachePojo,
			Map<String, String> userLabelMap, Map<String, Object> globalRuleMap,Map<String,Object> channelInfoMap)
			throws StrategyError {
		List<Map<String,Object>> selectedComponent = new ArrayList<Map<String,Object>>();
		for(String componentId : componentIdSet){
			Map<String,Object> checkParam = this.isComponentIdBaseContent(inParam,userMap,componentId,positionInfoMap,marketCaseCachePojo,userLabelMap, globalRuleMap,channelInfoMap);
			boolean checkFlag = (Boolean)checkParam.get("checkFlag");
			if(checkFlag){
				Map<String, Object> component = new HashMap<String, Object>();
				component.put("componentId", componentId);
				component.put("globalTouchControl", checkParam.get("globalTouchControl"));
				component.put("marketCaseTouchControl", checkParam.get("marketCaseTouchControl"));
				selectedComponent.add(component);
			}
			if (selectedComponent.size() > 0) {
				break;
			}
		}
		
		return selectedComponent;
	}
	
	/**
	 * 判断基于内容关系的组件ID是否满足条件
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: isComponentIdBaseContent 
	* @param inParam
	* @param componentIdBaseContent
	* @param marketCaseCachePojo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> isComponentIdBaseContent(
			Map<String, Object> inParam,Map<String, Object> userMap,String componentId,
			Map<String, Object> positionInfoMap,IMarketCaseCachePojo marketCaseCachePojo,
			Map<String,String> userLabelMap, Map<String, Object> globalRuleMap,
			Map<String,Object> channelInfoMap) throws StrategyError{
		Map<String, Object> retMap = new HashMap<String, Object>();
		
		//获取组件下的目标客户群,客户群的type和id
		Map<String,List<String>> custGroupKindMap = marketCase.getCustGroupIdByComponentIdBaseContent(componentId,marketCaseCachePojo);
		//运营位校验
/*		if(!channel.isPositionId(inParam,componentId,positionInfoMap,marketCaseCachePojo)){
			retMap.put("checkFlag", false);
			return retMap;
		}*/
		//判断用户是否在目标客户群中
		if(!custGroup.isCustGroupUser(inParam, userMap, custGroupKindMap,userLabelMap)){
			retMap.put("checkFlag", false);
			log.debug("isComponentIdBaseContent.custGroupKindMap" + userMap.get("phoneNo"), custGroupKindMap);
			log.debug("isComponentIdBaseContent.retMap" + userMap.get("phoneNo"), retMap);
			return retMap;
		}
		//全局规则校验
		Map<String,Object> globalRuleCheck = rule.isPassGlobalRule(inParam,userMap,(Map<String,Object>)marketCaseCachePojo.getMarketCaseMap(), globalRuleMap);
		boolean globalCheckFlag = (Boolean)globalRuleCheck.get("checkFlag");
		log.debug("===Component.isComponentIdBaseContent.globalCheckFlag===", globalCheckFlag);
		if(!globalCheckFlag){
			retMap.put("checkFlag", false);
			return retMap;
		}
		//活动规则校验
		Map<String,Object> ruleCheck = rule.isFilterRule(inParam,userMap,componentId, marketCaseCachePojo,positionInfoMap,channelInfoMap);
		boolean ruleCheckFlag = (Boolean)ruleCheck.get("checkFlag");
		log.debug("===Component.isComponentIdBaseContent.ruleCheckFlag===", ruleCheckFlag);
		if(!ruleCheckFlag){
			retMap.put("checkFlag", false);
			return retMap;
		}
		retMap.put("globalTouchControl", globalRuleCheck.get("globalTouchControl"));
		retMap.put("marketCaseTouchControl", ruleCheck.get("marketCaseTouchControl"));
		retMap.put("checkFlag", true);
		return retMap;
	}

}
