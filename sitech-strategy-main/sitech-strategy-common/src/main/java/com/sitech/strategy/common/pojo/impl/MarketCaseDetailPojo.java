package com.sitech.strategy.common.pojo.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseDetailPojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;


/**
 * 营销案明细对象
* @date: 2016-9-5 
* @author: sunliang 
* @title: MarketCaseDetailPojo 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class MarketCaseDetailPojo extends BaseClass implements IMarketCaseDetailPojo,Comparable<MarketCaseDetailPojo>, Serializable{
	
	/**
	 * 营销案ID
	 */
	protected String marketCaseId;
	/**
	 * 营销案明细
	 */
	protected Map<String,Object> detailMap;
	/**
	 * 排序参数对象
	 */
	protected SortParamer sortParamer;
	/**
	 * 客户群
	 */
	protected Map<String, Object> custGroupCacheMap = new HashMap<String, Object>();
	/**
	 * 运营位 方便对营销案进行按照地市ID+positionID进行分组
	 */
	protected List<String> positionCacheList = new ArrayList<String>();
	/**
	 * 运营位 方便对营销案进行按照地市ID+positionID进行分组
	 */
	protected Map<String,Object> positionCacheMap = new HashMap<String, Object>();
	/**
	 * 全局规则
	 */
	protected Map<String,Object> globalRuleCacheMap = new HashMap<String, Object>();
	/**
	 * 营销案规则
	 */
	protected Map<String,Object> ruleCacheMap = new HashMap<String, Object>();
	/**
	 * 营销案内容
	 */
	protected Map<String,Object> contentCacheMap = new HashMap<String, Object>();
	
	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: getMarketCaseId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseId() {
		return marketCaseId;
	}

	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: setMarketCaseId 
	* @param marketCaseId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseId(String marketCaseId) {
		this.marketCaseId = marketCaseId;
	}

	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: getDetailMap 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getDetailMap() {
		return detailMap;
	}

	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: setDetailMap 
	* @param detailMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setDetailMap(Map<String, Object> detailMap) {
		this.detailMap = detailMap;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getSortParamer 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public SortParamer getSortParamer() {
		return sortParamer;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setSortParamer 
	* @param sortParamer 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSortParamer(SortParamer sortParamer) {
		this.sortParamer = sortParamer;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: compareTo 
	* @param o
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public int compareTo(MarketCaseDetailPojo o) {
		return 0;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: equals 
	* @param obj
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public boolean equals(Object obj){
		return false;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: hashCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public int hashCode(){
		return 0;
	}
	
	/**
	 * marketCaseDetailPojo转换为marketCaseCachePojo
	* @date: 2016-10-1 
	* @author: sunliang 
	* @title: toMarketCaseCachePojo 
	* @param marketCaseDetail
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IMarketCaseCachePojo toMarketCaseCachePojo(Map<String, Object> marketCase) throws StrategyError{
		
		IMarketCaseCachePojo marketCaseCachePojo = new MarketCaseCachePojo();
		this.parseMarketCaseBasicToCachePojo(marketCase, marketCaseCachePojo);
		this.parseMarketCaseDetail(marketCase, marketCaseCachePojo);
		
		marketCaseCachePojo.setCustGroupMap(custGroupCacheMap);
		// 运营位的值不能重复，为了方便解析按照地市ID+运营位ID入cache
		positionCacheMap.put(Const.COMPONENT_TYPE_POSITION, positionCacheList);
		marketCaseCachePojo.setPositionMap(positionCacheMap);
		marketCaseCachePojo.setContentMap(contentCacheMap);
		//marketCaseCachePojo.setGlobalRuleMap(ruleCacheMap);
		marketCaseCachePojo.setRuleMap(ruleCacheMap);
		return marketCaseCachePojo;
	}
	
	/**
	 * 查询营销案客户群的基本信息
	* @date: 2016-10-1 
	* @author: yangwl 
	* @title: getCustGroupBasicInfo 
	* @param tempParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getCustGroupBasicInfo(Map<String,Object> tempParam) throws StrategyError{
		Map<String,Object> custGroupMap = new HashMap<String,Object>();
		custGroupMap.put("custGroupId", (String) tempParam.get("custGroupId"));
		custGroupMap.put("custGroupType", (String) tempParam.get("custGroupType"));
		return custGroupMap;
	}

	/**
	 * 解析内容信息
	* @date: 2016-10-1 
	* @author: yangwl 
	* @title: parseContentToCachePojo 
	* @param positionInfoMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected  List<String> parseContentToCachePojo(Map<String,Object> positionInfoMap) throws StrategyError{
		List<String> contentList =  new ArrayList<String>();
		Map<String, Object>  contentInfoMap = (Map<String, Object>)positionInfoMap.get("contentInfo");
		contentList.add((String)contentInfoMap.get("contentId"));
		contentCacheMap.put((String)contentInfoMap.get("contentId"), contentInfoMap.get("contentDetailList"));
		return contentList;
	}
	
	/**
	 * 解析渠道信息
	* @date: 2016-10-1 
	* @author: yangwl 
	* @title: parseChannelToCachePojo 
	* @param custGroupIdMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected  Map<String, Object> parseChannelToCachePojo(Map<String,Object> custGroupIdMap) throws StrategyError{
		Map<String, Object>  returnMap = new HashMap<String, Object>();
		Map<String,Object> channelrel= new HashMap<String, Object>();
		
		List<Map<String,Object>> channelInfoList = (List<Map<String, Object>>)custGroupIdMap.get("channelList");
		for(Map<String,Object> channelInfoMap:channelInfoList){
			Map<String, Object>  retMap = new HashMap<String, Object>();
			if(!CommonUtils.objectIsNull(channelInfoMap.get("ruleInfo")) && channelInfoMap.get("ruleInfo") != ""){
				retMap.put(Const.COMPONENT_TYPE_RULE, parseRuleToCachePojo(channelInfoMap));
			}
			if(!CommonUtils.objectIsNull(channelInfoMap.get("positionList")) && channelInfoMap.get("positionList") != ""){
				retMap.put(Const.COMPONENT_TYPE_POSITION,parsePositionToCachePojo(channelInfoMap));
			}	
			//retMap.put(Const.COMPONENT_TYPE_EVENT,parseEventToCachePojo(channelInfoMap));
			returnMap.put((String)channelInfoMap.get("channelId"), retMap);
			
		}
		channelrel.put(Const.COMPONENT_TYPE_CHANNEL, returnMap);
		return channelrel;
	}
	
	/**
	 * 解析客户群信息
	* @date: 2016-10-1 
	* @author: sunliang 
	* @title: parseCustGroupToCachePojo 
	* @param marketCaseDetail
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected  Map<String, Object> parseCustGroupToCachePojo(List<Map<String,Object>> custGroupList) throws StrategyError{
		Map<String, Object> CustGroupRelMap = new HashMap<String, Object>();
		
		for(Map<String,Object> custGroupIdMap:custGroupList){
			Map<String,Object> marketCaseCustGroupMap = getCustGroupBasicInfo(custGroupIdMap);
			custGroupCacheMap.put((String)custGroupIdMap.get("custGroupId"), marketCaseCustGroupMap);
			if(!CommonUtils.objectIsNull(custGroupIdMap.get("channelList")) && custGroupIdMap.get("channelList") != ""){
				CustGroupRelMap.put((String)custGroupIdMap.get("custGroupId"), parseChannelToCachePojo(custGroupIdMap));
			}	
			if(!CommonUtils.objectIsNull(custGroupIdMap.get("eventList")) && custGroupIdMap.get("eventList") != ""){
				CustGroupRelMap.put((String)custGroupIdMap.get("custGroupId"), parseEventToCachePojoByCustGroup(custGroupIdMap));
			}
		}
		return CustGroupRelMap;
	}

	/**
	 * 解析事件信息
	* @date: 2016-10-1 
	* @author: yangwl 
	* @title: parseEventToCachePojo 
	* @param marketCaseChannelMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected  List<String> parseEventToCachePojo(Map<String,Object> marketCaseChannelMap) throws StrategyError{
		List<String> eventList =  new ArrayList<String>();
		
		List<Map<String,Object>> eventInfoList = (List<Map<String, Object>>)marketCaseChannelMap.get("eventList");
		for(Map<String,Object> eventInfoMap:eventInfoList){
			ruleCacheMap.put((String)eventInfoMap.get("eventId"), eventInfoMap.get("eventDetailList"));
			eventList.add((String)eventInfoMap.get("eventId"));
		}
		return eventList;
	}
	
	/**
	 * 解析渠道信息
	* @date: 2016-10-1 
	* @author: yangwl 
	* @title: parseChannelToCachePojo 
	* @param custGroupIdMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected  Map<String, Object> parseEventToCachePojoByCustGroup(Map<String,Object> custGroupIdMap) throws StrategyError{
		Map<String, Object>  returnMap = new HashMap<String, Object>();
		Map<String,Object> eventrel= new HashMap<String, Object>();
		
		List<Map<String,Object>> eventInfoList = (List<Map<String, Object>>)custGroupIdMap.get("eventList");
		for(Map<String,Object> eventInfoMap:eventInfoList){
			Map<String, Object>  retMap = new HashMap<String, Object>();
			if(!CommonUtils.objectIsNull(eventInfoMap.get("ruleInfo")) && eventInfoMap.get("ruleInfo") != ""){
				retMap.put(Const.COMPONENT_TYPE_RULE, parseRuleToCachePojo(eventInfoMap));
			}
			if(!CommonUtils.objectIsNull(eventInfoMap.get("positionList")) && eventInfoMap.get("positionList") != ""){
				retMap.put(Const.COMPONENT_TYPE_POSITION,parsePositionToCachePojo(eventInfoMap));
			}	
			returnMap.put((String)eventInfoMap.get("eventId"), retMap);
			
		}
		eventrel.put(Const.COMPONENT_TYPE_EVENT, returnMap);
		return eventrel;
	}
	

	/**
	 * 解析营销案基本信息
	* @date: 2016-10-1 
	* @author: sunliang 
	* @title: parseMarketCaseBasicToCachePojo 
	* @param marketCaseDetail
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void parseMarketCaseBasicToCachePojo(Map<String,Object> marketCaseDetail, IMarketCaseCachePojo marketCaseCachePojo) throws StrategyError{
		Map<String, Object> marketCaseBasic= (Map<String, Object>)marketCaseDetail.get("marketCaseBasic");
		marketCaseCachePojo.setMarketCaseMap(marketCaseBasic);
	}
	
	/**
	 * 解析营销案详细信息
	* @date: 2016-10-13 
	* @author: yangwl
	* @title: parseMarketCaseDetail 
	* @param marketCaseDetail
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void parseMarketCaseDetail(Map<String,Object> marketCase, IMarketCaseCachePojo marketCaseCachePojo)  throws StrategyError{
		Map<String,Object> marketCaseDownRel =  new HashMap<String, Object>();
		Map<String,Object> marketCaseRelMap=  new HashMap<String, Object>();
		Map<String,Object> relMap=  new HashMap<String, Object>();
		
		String marketCaseId = (String)((Map<String, Object>)marketCase.get("marketCaseBasic")).get("marketCaseId");
		Map<String, Object> marketCaseDetail = (Map<String, Object>)marketCase.get("marketCaseDetail");
		if( !CommonUtils.objectIsNull(marketCaseDetail.get("ruleInfo")) && marketCaseDetail.get("ruleInfo") != ""){
			marketCaseDownRel.put(Const.COMPONENT_TYPE_RULE,this.parseRuleToCachePojo(marketCaseDetail));
		}
		if( !CommonUtils.objectIsNull(marketCaseDetail.get("custGroupList")) && marketCaseDetail.get("custGroupList") != ""){
			marketCaseDownRel.put(Const.COMPONENT_TYPE_CUSTGROUP, this.parseCustGroupToCachePojo((List<Map<String, Object>>)marketCaseDetail.get("custGroupList")));
		}
		if( !CommonUtils.objectIsNull(marketCaseDetail.get("productCommodityList")) && marketCaseDetail.get("productCommodityList") != ""){
			marketCaseDownRel.put(Const.COMPONENT_TYPE_PRODUCTCOMMODITY, this.parseProductCommodityToCachePojo(marketCaseDetail));
		}
		marketCaseRelMap.put(marketCaseId, marketCaseDownRel);
		relMap.put(Const.COMPONENT_TYPE_MARKETCASE, marketCaseRelMap);
		log.debug("parseMarketCaseDetail.marketCaseRelMap", marketCaseRelMap);
		marketCaseCachePojo.setMarketCaseRel(relMap);
	}
	
	/**
	 * 解析运营位信息
	* @date: 2016-10-1 
	* @author: yangwl 
	* @title: parsePositionToCachePojo 
	* @param marketCaseChannelMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected  Map<String, Object> parsePositionToCachePojo(Map<String,Object> marketCaseChannelMap) throws StrategyError{
		Map<String, Object> positionContentMap = new HashMap<String, Object>();
		
		List<Map<String,Object>> positionInfoList = (List<Map<String, Object>>)marketCaseChannelMap.get("positionList");
		for(Map<String,Object> positionInfoMap:positionInfoList){
			Map<String, Object> positionRel = new HashMap<String, Object>();
			boolean flag = true;//判断是否有重复的运营ID
			for(String   positionCache:positionCacheList){
				if(positionCache.equals(positionInfoMap.get("positionId"))){
					flag = false;
				}	
			}
			if(flag){
				positionCacheList.add((String)positionInfoMap.get("positionId"));
			}
			if(!CommonUtils.objectIsNull(positionInfoMap.get("contentInfo")) && positionInfoMap.get("contentInfo") != ""){
				positionRel.put(Const.COMPONENT_TYPE_CONTENT, parseContentToCachePojo(positionInfoMap));
			}
			if(!CommonUtils.objectIsNull(positionInfoMap.get("ruleInfo")) && positionInfoMap.get("ruleInfo") != ""){
				positionRel.put(Const.COMPONENT_TYPE_RULE, this.parseRuleToCachePojo(positionInfoMap));
			}
			positionContentMap.put((String)positionInfoMap.get("positionId"), positionRel);
		}
		return positionContentMap;
	}
	
	/**
	 * 解析产商品
	* @date: 2016-10-11 
	* @author: yangwl
	* @title: parseProductCommodityToCachePojo 
	* @param marketCaseChannelMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected  List<String> parseProductCommodityToCachePojo(Map<String,Object> marketCaseDetailMap) throws StrategyError{
		List<String> returnList = new ArrayList<String>();
		
		List<Map<String,Object>> productCommodityList = (List<Map<String, Object>>)marketCaseDetailMap.get("productCommodityList");
		for(Map<String,Object> productCommodityMap:productCommodityList){
			returnList.add((String)productCommodityMap.get("productId"));
			contentCacheMap.put((String)productCommodityMap.get("productId"), productCommodityMap);
		}
		return returnList;
	}
	
	/**
	 * 解析规则信息
	* @date: 2016-10-1 
	* @author: yangwl 
	* @title: parseRuleToCachePojo 
	* @param marketCaseChannelMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected  List<String> parseRuleToCachePojo(Map<String,Object> marketCaseChannelMap) throws StrategyError{
		List<String> ruleList =  new ArrayList<String>();

		Map<String, Object> marketCaseRuleMap = (Map<String, Object>)marketCaseChannelMap.get("ruleInfo");
		ruleCacheMap.put((String)marketCaseRuleMap.get("ruleId"), marketCaseRuleMap.get("ruleDetailList"));
		ruleList.add((String)marketCaseRuleMap.get("ruleId"));
		return ruleList;
	}
}
