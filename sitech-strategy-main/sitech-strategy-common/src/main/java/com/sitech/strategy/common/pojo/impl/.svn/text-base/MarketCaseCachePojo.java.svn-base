package com.sitech.strategy.common.pojo.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.jcfx.dt.MBean;
import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 缓存中保存营销案的对象
* @date: 2016-9-5 
* @author: sunliang 
* @title: MarketCaseCachePojo 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class MarketCaseCachePojo extends BaseClass implements IMarketCaseCachePojo,Serializable {

	private static final long serialVersionUID = 7117289707255329202L;
	/**
	 * 营销案基本信息
	 */
	protected Map<String,Object> marketCaseMap;
	/**
	 * 营销案关系
	 */
	protected Map<String,Object> marketCaseRel;
	/**
	 * 目标客户群
	 */
	protected Map<String,Object> custGroupMap;
	/**
	 * 运营位
	 */
	protected Map<String,Object> positionMap;
	/**
	 * 全局规则
	 */
	protected Map<String,Object> globalRuleMap;
	/**
	 * 营销案规则
	 */
	protected Map<String,Object> ruleMap;
	/**
	 * 营销案内容
	 */
	protected Map<String,Object> contentMap;
	
	
	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: getMarketCaseRel 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getMarketCaseRel() {
		return marketCaseRel;
	}

	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: setMarketCaseRel 
	* @param marketCaseRel 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseRel(Map<String, Object> marketCaseRel) {
		this.marketCaseRel = marketCaseRel;
	}

	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: getCustGroupMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getCustGroupMap() {
		return custGroupMap;
	}

	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: setCustGroupMap 
	* @param custGroupMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupMap(Map<String, Object> custGroupMap) {
		this.custGroupMap = custGroupMap;
	}

	/**
	 * 
	* @date: 2016-9-16 
	* @author: yangwl
	* @title: getChannelMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getPositionMap() {
		return positionMap;
	}
	
	/**
	 * 
	* @date: 2016-9-16 
	* @author: yangwl
	* @title: setChannelMap 
	* @param channelMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPositionMap(Map<String, Object> positionMap) {
		this.positionMap = positionMap;
	}
	
	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: getGlobalRuleMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getGlobalRuleMap() {
		return globalRuleMap;
	}

	/**
	 * 
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: setGlobalRuleMap 
	* @param globalRuleMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setGlobalRuleMap(Map<String, Object> globalRuleMap) {
		this.globalRuleMap = globalRuleMap;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getMarketCaseMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getMarketCaseMap() {
		return marketCaseMap;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setMarketCaseMap 
	* @param marketCaseMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setMarketCaseMap(Map<String, Object> marketCaseMap) {
		this.marketCaseMap = marketCaseMap;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getRuleMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getRuleMap() {
		return ruleMap;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setRuleMap 
	* @param ruleMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setRuleMap(Map<String, Object> ruleMap) {
		this.ruleMap = ruleMap;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getContentMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getContentMap() {
		return contentMap;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setContentMap 
	* @param contentMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setContentMap(Map<String, Object> contentMap) {
		this.contentMap = contentMap;
	}
	
	/**
	 * 得到营销案缓存Key
	* @date: 2016-10-1 
	* @author: sunliang 
	* @title: getMarketCaseCacheKey 
	* @param inParam
	* @param positionId
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getMarketCaseCacheKey(Map<String, Object> inParam,String positionId) throws StrategyError {
		return Const.CACHE_DATATYPE_MARKETCASE_CHANNELTRIGGER + inParam.get("regionCode") + Const.SEPARATOR_COLON + positionId;
	}
	
	/**
	 * 营销案分类
	* @date: 2016-10-1 
	* @author: yangwl 
	* @title: groupMarketCaseByKey 
	* @param marketCaseCachePojoList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> groupMarketCaseByKey(List<IMarketCaseCachePojo> marketCaseCachePojoList) throws StrategyError{
		Map<String, Object> results = new HashMap<String, Object>();
		Map<String, Object> regionAndPosition = new HashMap<String, Object>();
		Map<String, IMarketCaseCachePojo> marketCaseDetail = new HashMap<String, IMarketCaseCachePojo>();
		
		for(IMarketCaseCachePojo marketCaseCachePojo:marketCaseCachePojoList){
			MBean ss = new MBean();
			ss.setBody(marketCaseCachePojo.getPositionMap());
			String regionCode = (String)marketCaseCachePojo.getMarketCaseMap().get("regionCode");
			String marketCaseId = (String)marketCaseCachePojo.getMarketCaseMap().get("marketCaseId");
			List<String> positionList = (List<String>)marketCaseCachePojo.getPositionMap().get(Const.COMPONENT_TYPE_POSITION);
			for(String  position:positionList){
				List<String> regionAndPositionList = new ArrayList<String>();
				String key = null;
				Set<String>	set	= regionAndPosition.keySet();	
				Iterator<String> it	= set.iterator(); 
				while(it.hasNext()){ 
					key = it.next();
					if(key.equals(Const.CACHE_DATATYPE_MARKETCASE_CHANNELTRIGGER + regionCode+ ":" + position)){
						regionAndPositionList = (List<String>)regionAndPosition.get(Const.CACHE_DATATYPE_MARKETCASE_CHANNELTRIGGER + regionCode + ":" + position);
						break;
					}
				}
				regionAndPositionList.add(marketCaseId);
				regionAndPosition.put(Const.CACHE_DATATYPE_MARKETCASE_CHANNELTRIGGER + regionCode + ":" + position, regionAndPositionList);
			}
			marketCaseDetail.put(Const.CACHE_DATATYPE_MARKETCASE_DETAIL + marketCaseId, marketCaseCachePojo);
		}
		MBean ss = new MBean();
		ss.setBody(regionAndPosition);
		results.put("regionAndPosition", regionAndPosition);
		results.put("marketCaseDetail", marketCaseDetail);
		return results;
	}
}
