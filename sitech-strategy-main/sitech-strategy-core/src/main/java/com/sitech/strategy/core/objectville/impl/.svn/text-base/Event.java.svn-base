package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.priority.IPriorityPojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.ErrorCode;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IEvent;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 事件对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: Event 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class Event extends BaseClass implements IEvent, Serializable {
	
	/**
	 * 事件插入对象
	 */
	protected IDataInsertor.IEventInsertor eventInsertor;
	/**
	 * 事件删除对象
	 */
	protected IDataDeleter.IEventDeleter eventDeleter;
	/**
	 * 事件查询对象
	 */
	protected IDataSelector.IEventSelector eventSelector;
	/**
	 * 事件修改对象
	 */
	protected IDataUpdater.IEventUpdater eventUpdater;
	/**
	 * 事件规则插入对象
	 */
	protected IDataInsertor.IRuleInsertor ruleInsertor;
	/**
	 * prioritypojo对象
	 */
	protected IPriorityPojo priorityPojo;
	/**
	 * 区域用户群优先级数据查询对象
	 */
	protected IDataSelector.IPrioritySelector prioritySelector;
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setEventInsertor 
	* @param eventInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventInsertor(IDataInsertor.IEventInsertor eventInsertor) {
		this.eventInsertor = eventInsertor;
	}

	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setEventDeleter 
	* @param eventDeleter 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventDeleter(IDataDeleter.IEventDeleter eventDeleter) {
		this.eventDeleter = eventDeleter;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setEventSelector 
	* @param eventSelector 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventSelector(IDataSelector.IEventSelector eventSelector) {
		this.eventSelector = eventSelector;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setEventUpdater 
	* @param eventUpdater 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventUpdater(IDataUpdater.IEventUpdater eventUpdater) {
		this.eventUpdater = eventUpdater;
	}
	
	/**
	 * 
	* @date: 2017-2-15 
	* @author: sunyuan
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
	 * 添加事件的详细信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addEventDetail 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addEventDetail(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
		eventInsertor.insertEventDetailInfo(inParam,tempInParam);
		
	}
	
	/**
	 * 添加事件的基本信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addEventInfo 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addEventInfo(Map<String,Object> inParam,Map<String,Object>tempInParam) throws StrategyError {
		eventInsertor.insertEventInfo(inParam,tempInParam);
	}
	
	/**
	 * 
	* @date: 2017-2-21 
	* @author:liuqi
	* @title: getRuleInsertor 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IDataInsertor.IRuleInsertor getRuleInsertor() {
		return ruleInsertor;
	}
	/**
	 * 
	* @date: 2017-2-21 
	* @author:liuqi
	* @title: setRuleInsertor 
	* @param ruleInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRuleInsertor(IDataInsertor.IRuleInsertor ruleInsertor) {
		this.ruleInsertor = ruleInsertor;
	}
	
	/**
	 * 
	* @date: 2017-3-2 
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
	 * 增加事件明细信息
	* @date: 2017-2-16 
	* @author:liuqi
	* @title: addEventDetailInfo 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> addEventDetailInfo(Map<String, Object> inParam) throws StrategyError{
		
		List<Map<String, Object>> custGroupList = (List<Map<String, Object>>) inParam.get("custGroupList");
		List<Map<String, Object>>  eventDetailInfoList = (List<Map<String, Object>>) inParam.get("eventDetailInfoList");
		Map<String,Object> out = new HashMap<String, Object>();
		List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
		
		String eventDetailId="";
		String eventId="";
		boolean boo=false;
		if (!CommonUtils.objectIsNull(custGroupList)) {
			//前台处理缴费事件列表为必不为空
			String eve =(String) eventDetailInfoList.get(0).get("eventId");
			if(boo=(eve==null||eve.isEmpty())){
				eventDetailId= SequenceUtil.getSequence();
				eventId= SequenceUtil.getSequence();
				for (Map<String, Object> custGroup : custGroupList) {
				
					if (!CommonUtils.objectIsNull(eventDetailInfoList)) {
						for (int i=0;i<eventDetailInfoList.size();i++) {
							String marketCaseCustGrouprelId = (String)custGroup.get("relId");
							String custGroupId = (String)custGroup.get("custGroupId");
							String custGroupName = (String)custGroup.get("custGroupName");
							Map<String,Object> param = new HashMap<String, Object>();
							param.put("marketCaseCustGrouprelId", marketCaseCustGrouprelId);
							param.put("custGroupId", custGroupId);
							param.put("custGroupName", custGroupName);
							param.put("eventId", eventId);
							param.put("eventDetailId", eventDetailId);
							out = this.addEventDetailByNotExistsEventId(param, eventDetailInfoList.get(i));
							outList.add(out);
						}
					}
				}
				
			}else{
				if (!CommonUtils.objectIsNull(custGroupList)) {
				for (Map<String, Object> custGroup : custGroupList) {
					if (!CommonUtils.objectIsNull(eventDetailInfoList)) {
						for (int i=0;i<eventDetailInfoList.size();i++) {
							String marketCaseCustGrouprelId = (String)custGroup.get("relId");
							String custGroupId = (String)custGroup.get("custGroupId");
							String custGroupName = (String)custGroup.get("custGroupName");
							Map<String,Object> param = new HashMap<String, Object>();
							param.put("marketCaseCustGrouprelId", marketCaseCustGrouprelId);
							param.put("custGroupId", custGroupId);
							param.put("custGroupName", custGroupName);
							out = this.addEventDetailByExistsEventId(param, eventDetailInfoList.get(i));
							outList.add(out);
							}
						}
					}
				}
			}
			
			if(boo){
			for (int i=0;i<eventDetailInfoList.size();i++) {
			//增加事件详细表信息
			String eventDetailType = (String) eventDetailInfoList.get(i).get("eventDetailType");
			List<Map<String,Object>> params = (List<Map<String, Object>>) eventDetailInfoList.get(i).get("params");
			String ob=Const.RULE_TYPE_EVENTTRIGGERCHANNEL;
			
			for (Map<String, Object> map : params) {
				String obj=(String)map.get("eventParCode");
				if(!(obj.equals(ob))){
				map.put("serialId", SequenceUtil.getSequence());
				map.put("eventId", eventId);
				map.put("eventDetailId", eventDetailId);
				map.put("eventDetailType", eventDetailType);
				eventInsertor.insertEventDetailInfo(map, map);
					}
				}
			}
			
			for (int i=0;i<eventDetailInfoList.size();i++) {
				//增加事件表信息
				String eventDetailType = (String) eventDetailInfoList.get(i).get("eventDetailType");
				List<Map<String,Object>> params = (List<Map<String, Object>>) eventDetailInfoList.get(i).get("params");
				Map<String,Object> map = new HashMap<String, Object>();
					map.put("serialId", SequenceUtil.getSequence());
					map.put("eventId", eventId);
					map.put("eventType", eventDetailType);
					eventInsertor.insertEventInfo(map, map);
					
					}
				}
			}
		Map<String,Object> outMap = new HashMap<String, Object>();
		outMap.put("outList", outList);
		return outMap;
	}
	
	/**
	 * 加载缴费与事件关系数据到缓存
	* @date: 2017-2-13 
	* @author: sunyuan
	* @title: addFeeAndEventRelToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Deprecated
	public void addFeeAndEventRelToCache(Map.Entry<String, Object> inParam)
			throws StrategyError {
		String key = inParam.getKey();
		List<Map<String, Object>> value = (List<Map<String, Object>>) inParam.getValue();
		Map<String, Object> tempParam = new HashMap<String, Object>();
		tempParam.put("channelId", key);
		tempParam.put("eventDetail", value);
		eventInsertor.addFeeAndEventRelToCache(tempParam);
	}
	
	/**
	 * 加载缴费事件与营销案关系缓存
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: addPayFeeEventAndMarketCaseRelToCache 
	* @param payFeeEventAndMarketCaseRelCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addPayFeeEventAndMarketCaseRelToCache(
			Map<String, List<Map<String, Object>>> payFeeEventAndMarketCaseRelCache)
			throws StrategyError {
		eventInsertor.addPayFeeEventAndMarketCaseRelToCache(payFeeEventAndMarketCaseRelCache);
	}
	
	/**
	 * 加载产品与事件关系数据到缓存
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: addProductAndEventRelToCache 
	* @param productAndEventRelCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addProductAndEventRelToCache(Map.Entry<String, Object> inParam)
			throws StrategyError {
		String key = inParam.getKey();
		List<Map<String, Object>> value = (List<Map<String, Object>>) inParam.getValue();
		Map<String, Object> tempParam = new HashMap<String, Object>();
		tempParam.put("product", key);
		tempParam.put("event", value);
		eventInsertor.addProductAndEventRelToCache(tempParam);
	}
	
	/**
	 * 解析缴费与事件关系缓存
	* @date: 2017-2-13 
	* @author: sunyuan
	* @title: parseFeeAndEventRelCache 
	* @param feeEventDetailList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Deprecated
	public Map<String, Object> parseFeeAndEventRelCache(List<Map<String,Object>> feeEventDetailList) throws StrategyError{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		if(!CommonUtils.objectIsNull(feeEventDetailList)){
			Map<String,Map> feeEventMap = parseFeeAndEventRelCacheDataPro(feeEventDetailList);
			//生成保存 redis cache的数据结构
			for(Entry<String, Map> map : feeEventMap.entrySet()){
				List<Map<String, Object>> cacheList = new ArrayList<Map<String, Object>>();

				String channelId=(String)map.getKey();
				Map<String, Object> eventMap = (Map<String, Object>)map.getValue();				
				
				//由于后续需要使用putAll的方式保存cache，而那边是个通用的list<map>的结构，因此，此处虽然list是一个元素，也需要构造后续使用的数据结构。
				cacheList.add(eventMap);
				resultMap.put(channelId, cacheList);
			}
			
		}
		return resultMap;
	}
	
	/**
	 * 解析缴费与事件关系缓存数据处理
	* @date: 2017-2-26 
	* @author: sunyuan
	* @title: parseFeeAndEventRelCacheDataPro 
	* @param feeEventDetailList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Deprecated
	protected Map<String,Map> parseFeeAndEventRelCacheDataPro(List<Map<String,Object>> feeEventDetailList){
		Map<String,Map> detailMap = new HashMap<String,Map>();
		for(int i=0;i<feeEventDetailList.size();i++){
			Map<String,Object> iFeeEventDetailMap = feeEventDetailList.get(i);
			String iEventId = (String) iFeeEventDetailMap.get("eventId");
			for(int j=i+1;j<feeEventDetailList.size();j++){
				Map<String,Object> jFeeEventDetailMap = feeEventDetailList.get(j);
				String jEventId = (String) jFeeEventDetailMap.get("eventId");
				if(jEventId.equals(iEventId)){
					String startFee;//缴费起始金额
					String endFee;//缴费截止金额
					if(Const.FEE_PAY_START.equals(iFeeEventDetailMap.get("eventParCode"))){
						startFee = (String) iFeeEventDetailMap.get("eventParValue");
						endFee = (String) jFeeEventDetailMap.get("eventParValue");
					}else{
						startFee = (String) jFeeEventDetailMap.get("eventParValue");
						endFee = (String) iFeeEventDetailMap.get("eventParValue");
					}
					if(startFee.equals(endFee)){
						break;
					}
					String channelId = (String) iFeeEventDetailMap.get("channelId");
					Double regionPriorityClass = (Double) iFeeEventDetailMap.get("regionPriorityClass");
					Double score = regionPriorityClass;
					String eventDetail = startFee+Const.SEPARATOR_COMMA+endFee+Const.SEPARATOR_COMMA+
										 jEventId+Const.SEPARATOR_COMMA+score;
					String eventDetailType = (String) iFeeEventDetailMap.get("eventDetailType");
					if(Const.EVENT_CLASS_FEE_PAY.equals(eventDetailType)){
						if(detailMap.containsKey(channelId)){
							Map eventMap=(Map) detailMap.get(channelId);
							eventMap.put(eventDetail, score);
							
							detailMap.put(channelId, eventMap);
						}else{
							Map eventMap = new HashMap();
							eventMap.put(eventDetail, score);
							
							detailMap.put(channelId, eventMap);
						}
					}
				}

			}
		}
		return detailMap;
	}
	
	/**
	 * 解析事件ID和营销案ID缓存数据
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: parsePayFeeEventAndMarketCaseRelCache 
	* @param payFeeEventIdAndMarketCaseIdRelAndRuleDetail
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
/*	@Override
	public Map<String, List<Map<String, Object>>> parsePayFeeEventAndMarketCaseRelCache(
			List<Map<String, Object>> payFeeEventIdAndMarketCaseIdRelAndRuleDetailList)
			throws StrategyError {
		
		Map<String,List<Map<String,Object>>> payFeeEventAndMarketCaseRelCache = new HashMap<String,List<Map<String,Object>>>();
		for(Map<String, Object> payFeeEventIdAndMarketCaseIdRelAndRuleDetail : payFeeEventIdAndMarketCaseIdRelAndRuleDetailList){
			for(Map.Entry<String, Object> entry : payFeeEventIdAndMarketCaseIdRelAndRuleDetail.entrySet()){
				if(payFeeEventAndMarketCaseRelCache.get(entry.getKey()) == null){
					List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
					Map<String,Object> map = new HashMap<String,Object>();
					Map<String,Object> val = (Map<String,Object>)entry.getValue();
					String key = (String)val.get("feePayStart") + Const.SEPARATOR_COLON + (String)val.get("feePayEnd") + Const.SEPARATOR_COLON + (String)val.get("marketCaseId");
					String value = (String)val.get("offerMoney");
					map.put(key, value);
					list.add(map);
					payFeeEventAndMarketCaseRelCache.put(entry.getKey(), list);
				}else{
					List<Map<String,Object>> list = payFeeEventAndMarketCaseRelCache.get(entry.getKey());
					Map<String,Object> map = list.get(0);
					Map<String,Object> val = (Map<String,Object>)entry.getValue();
					String key = (String)val.get("feePayStart") + Const.SEPARATOR_COLON + (String)val.get("feePayEnd") + Const.SEPARATOR_COLON + (String)val.get("marketCaseId");
					String value = (String)val.get("offerMoney");
					map.put(key, value);
				}
			}
		}
		
		return payFeeEventAndMarketCaseRelCache;
	}*/
	
	/**
	 * 解析产品与事件关系缓存
	 * 按照后续插入缓存的要求，解析组织产品和事件关系数据
	 * redis数据结构，其中  key是  productId ，value是 zset<eventId,score>
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: parseProductAndEventRelCache 
	* @param productEventDetailList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> parseProductAndEventRelCache(
			List<Map<String, Object>> productEventDetailList)
			throws StrategyError {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		Double score = 0.0;//目前没有意义，但是数据结构需要
		Map<String,Map> productEventMap=new HashMap();//key:productId, value:eventId,score
		
		if(!CommonUtils.objectIsNull(productEventDetailList)){
			
			//按照产品分组，获得事件集合
			for(Map<String, Object> productEventDetailMap : productEventDetailList){
				
				String eventDetailType=(String) productEventDetailMap.get("eventDetailType");
				String eventParCode=(String) productEventDetailMap.get("eventParCode");
				String productId=(String) productEventDetailMap.get("eventParValue");
				String eventId=(String) productEventDetailMap.get("eventId");
				//为了避免查询条件问题，需要增加判断条件:EventDetailType/EventParCode 是事件产品。
				if(Const.RULE_TYPE_EVENT_PRODUCT.equals(eventDetailType)
						&& Const.RULE_CODE_EVENT_PRODUCTID.equals(eventParCode)){
					if(productEventMap.containsKey(productId)){
						Map eventParMap=productEventMap.get(productId);
						eventParMap.put(eventId, score);
						
						productEventMap.put(productId, eventParMap);		
					}else{
						Map eventParMap= new HashMap();
						eventParMap.put(eventId, score);
						
						productEventMap.put(productId, eventParMap);
					}
				}
								
			}//for
			
			//生成保存 redis cache的数据结构
			for(Entry<String, Map> map : productEventMap.entrySet()){
				List<Map<String, Object>> cacheList = new ArrayList<Map<String, Object>>();

				String productId=(String)map.getKey();
				Map<String, Object> eventInfoMap = (Map<String, Object>)map.getValue();				
				
				//由于后续需要使用putAll的方式保存cache，而那边是个通用的list<map>的结构，因此，此处虽然list是一个元素，也需要构造后续使用的数据结构。
				cacheList.add(eventInfoMap);
				resultMap.put(productId, cacheList);
			}
			
		}		
		return resultMap;
	}
	
	/**
	 * 查询事件信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryEvent 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryEvent(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		Map<String,Object> eventMap = this.queryEventInfo(inParam,queryFilter);
		//查询事件的基本信息
		List<Map<String,Object>> eventDetailList = this.queryEventDetail(inParam,queryFilter);
		eventMap.put("eventDetailList", eventDetailList);
		return eventMap;
	}
	
	/**
	 * 移除事件信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: removeEventById 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeEventById(Map<String,Object> inParam) throws StrategyError {
		this.removeEventInfo(inParam);
		this.removeEventDetail(inParam);
	}
	
	/**
	 * 更新事件信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: updateEventById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateEventById(Map<String,Object> inParam) throws StrategyError {
		this.updateEventInfo(inParam);
		this.updateEventDetail(inParam);
	}
	
	
	/**
	 * 查询事件详细信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryEventDetail  
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryEventDetail(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		List<Map<String,Object>> eventDetailList = eventSelector.selectEventDetailList(inParam,queryFilter);
		return eventDetailList;
	}
	
	/**
	 * 查询事件规则详情Id
	* @date: 2016-12-2 
	* @author: mengxi
	* @title: queryEventDetailId 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> queryEventDetailId(Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError {
		List<Map<String,Object>> eventDetailIdList = eventSelector.selectEventDetailId(inParam,queryFilter);
		return eventDetailIdList;
	}
	
	/**
	 *  解析缴费事件ID和事件详细
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: parsePayFeeEventIdAndMarketCaseIdRelAndEventDetail 
	* @param payFeeEventIdAndMarketCaseIdRel
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> parsePayFeeEventIdAndMarketCaseIdRelAndEventDetail(
			List<Map<String, Object>> payFeeEventIdAndMarketCaseIdRel)
			throws StrategyError {
		List<Map<String,Object>> retList = new ArrayList<Map<String,Object>>();
		
		Map<String,Object> tempParam = new HashMap<String,Object>();
		for(Map<String, Object> map : payFeeEventIdAndMarketCaseIdRel){
			for(Map.Entry<String, Object> entry : map.entrySet()){
				tempParam.put("eventId", entry.getKey());
				List<Map<String,Object>> eventlist = eventSelector.selectEventDetailList(tempParam);
				log.debug("parsePayFeeEventIdAndMarketCaseIdRelAndEventDetail.eventlist", eventlist);
				
				Map<String,Object> retMap = new HashMap<String,Object>();
				for(Map<String,Object> eventDetailMap : eventlist){
					if("feePayStart".equals((String)eventDetailMap.get("eventParCode"))){
						retMap.put("feePayStart", (String)eventDetailMap.get("eventParValue"));
					}
					if("feePayEnd".equals((String)eventDetailMap.get("eventParCode"))){
						retMap.put("feePayEnd", (String)eventDetailMap.get("eventParValue"));
					}
				}
				retMap.put("marketCaseId", entry.getValue());
				retMap.put("eventId", entry.getKey());
				retList.add(retMap);
			}
		}
		
		return retList;
	}
	
	/**
	 * 查询事件详情和优先级
	* @date: 2017-2-14 
	* @author: sunyuan
	* @title: queryEventDetailAndPriority
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> queryEventDetailAndPriority(Map<String, Object> inParam) throws StrategyError{
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		//查询事件详情
		List<Map<String,Object>> eventDetailList = eventSelector.selectEventDetailList(inParam);
		for(Map<String,Object> eventDetailMap : eventDetailList){
			String eventId = CommonUtils.objectIsNull((String)eventDetailMap.get("eventId"))?"":(String)eventDetailMap.get("eventId");
			String eventDetailType = CommonUtils.objectIsNull((String)eventDetailMap.get("eventDetailType"))?"":(String)eventDetailMap.get("eventDetailType");
			String eventParCode = CommonUtils.objectIsNull((String)eventDetailMap.get("eventParCode"))?"":(String)eventDetailMap.get("eventParCode");
			String eventParValue = CommonUtils.objectIsNull((String)eventDetailMap.get("eventParValue"))?"":(String)eventDetailMap.get("eventParValue");
			//循环通过每个事件的id查询对应的营销案id
			List<Map<String,Object>> marketCaseIdList = eventSelector.selectMarketCaseIdByEventIdList(eventDetailMap);
			for(Map<String,Object> marketCaseIdMap : marketCaseIdList){
				String marketCaseId = (String) marketCaseIdMap.get("parentComponentId");
				if(!CommonUtils.objectIsNull(marketCaseId)){
					marketCaseIdMap.put("marketCaseId", marketCaseId);
					//通过每个营销案的id查询对应的优先级
					List<Map<String,Object>> areaPriorityList = prioritySelector.selectAreaPriorityList(marketCaseIdMap);
					//数据处理
					for(Map<String,Object> areaPriorityMap : areaPriorityList){
						Map<String,Object> outMap = new HashMap<String,Object>();
						String channelId = (String) areaPriorityMap.get("channelId");
						Double regionPriorityClass = ((BigDecimal) areaPriorityMap.get("regionPriorityClass")).doubleValue();
						outMap.put("eventId", CommonUtils.objectIsNull(eventId)?"":eventId);
						outMap.put("channelId", CommonUtils.objectIsNull(channelId)?"":channelId);
						outMap.put("regionPriorityClass", Double.valueOf(priorityPojo.getDefaultPriority(marketCaseId)));
						outMap.put("eventDetailType", CommonUtils.objectIsNull(eventDetailType)?"":eventDetailType);
						outMap.put("eventParCode", CommonUtils.objectIsNull(eventParCode)?"":eventParCode);
						outMap.put("eventParValue", CommonUtils.objectIsNull(eventParValue)?"":eventParValue);
						outList.add(outMap);
					}
				}
			}
			
		}
		return outList;
	}
	
	/**
	 * 通过前台传入的事件Id增加事件详细信息
	 * 前台传入的事件Id为空（缴费事件）
	* @date: 2017-2-17 
	* @author:liuqi
	* @title: addEventDetailByNotExistsEventId 
	* @param inParam
	* @param eventDetailInfo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> addEventDetailByNotExistsEventId(Map<String, Object> inParam, Map<String, Object> eventDetailInfo) throws StrategyError{
		
		String marketCaseCustGrouprelId = (String) inParam.get("marketCaseCustGrouprelId");  //relId
		String custGroupId = (String) inParam.get("custGroupId");
		String custGroupName = (String) inParam.get("custGroupName");
		String custGroupEventRelId ="";
		String eventId=(String) inParam.get("eventId");
		String ruleDetailId="";
		String ruleId="";
		String eventRuleRelId="";
		//查询事件是否已有关系start
		
		Map<String,Object> newInParam = new HashMap<String, Object>();
		newInParam.put("parentComponentId", custGroupId);
		newInParam.put("parentComponentType", Const.COMPONENT_TYPE_CUSTGROUP);
		newInParam.put("componentType", Const.COMPONENT_TYPE_EVENT);
		newInParam.put("componentId", eventId);
		//查询事件是否已有关系 end
		Map<String,Object> eventRel = eventSelector.selectEventRelation(newInParam);
			if (CommonUtils.objectIsNull(eventRel)) {
				custGroupEventRelId= SequenceUtil.getSequence();
				newInParam.put("relId", custGroupEventRelId);
				newInParam.put("parentRelId", marketCaseCustGrouprelId);
				eventInsertor.insertRelationInfo(newInParam);
			}else{
				custGroupEventRelId = (String)eventRel.get("relId");
			}
		
		List<Map<String, Object>> eventDetailCodeInfo =(List<Map<String, Object>>) eventDetailInfo.get("params");
		//筛选出需要的code值
			if(!CommonUtils.objectIsNull(eventDetailCodeInfo)){
			//start
			Map<String,Object> param = new HashMap<String, Object>();
			param.put("parentComponentId", eventId);
			param.put("parentComponentType", Const.COMPONENT_TYPE_EVENT);
			param.put("componentType",Const.COMPONENT_TYPE_RULE);
			param.put("parentRelId", custGroupEventRelId);
			ruleId=SequenceUtil.getSequence();
			eventRuleRelId=SequenceUtil.getSequence();
			param.put("componentId",ruleId);
			param.put("relId", eventRuleRelId);
			eventInsertor.insertRelationInfo(param);
			//end	
			Map<String,Object> codeInfo = new HashMap<String, Object>();
			for(int i=0;i<eventDetailCodeInfo.size();i++){
				//事件渠道入规则表
				if(((String)(eventDetailCodeInfo.get(i).get("eventParCode"))).equals(Const.RULE_TYPE_EVENTTRIGGERCHANNEL)){
					codeInfo.put("eventParValue", eventDetailCodeInfo.get(i).get("eventParValue"));
					String ruleParName=(String) eventDetailCodeInfo.get(i).get("eventParName"); 
					String ruleParCode =(String) eventDetailCodeInfo.get(i).get("eventParCode");
					String codeInfoMess=(String)codeInfo.get("eventParValue");
					String[] str = codeInfoMess.split("~");
					String first="";
					String second="";
					//规则表
					Map<String,Object> pa = new HashMap<String, Object>();
					pa.put("ruleId",ruleId);
					pa.put("serialId", SequenceUtil.getSequence());
					ruleInsertor.insertRuleInfo(pa, pa);
					
					//从数组中筛选出渠道的code值分别挂入规则明细表
					for(int a=0;a<str.length;a++){
						String db = str[a];
						String[] f = db.split("\\^");
							for(int a1=0;a1<f.length;a1++){
								first = f[0];
								second= f[1];
							}
							//将事件规则中的渠道放入规则明细表中
							String serialId =SequenceUtil.getSequence();
							Map<String,Object> para = new HashMap<String, Object>();
							ruleDetailId = SequenceUtil.getSequence();
							para.put("ruleId", ruleId);
							para.put("serialId", serialId);
							para.put("ruleDetailId", ruleDetailId);
							para.put("ruleParName", ruleParName);
							para.put("ruleParCode",Const.RULE_CODE_EVENTTRIGGERCHANNEL);
							para.put("ruleDetailType",Const.RULE_TYPE_EVENTTRIGGERCHANNEL);
							para.put("ruleParDesc", second);
							para.put("ruleParValue", first);
							ruleInsertor.insertRuleDetailInfo(para, para);
						}
					}
				}
			}
		//增加的出参返回值
		Map<String,Object> out = new HashMap<String, Object>();
		out.put("marketCaseCustGroupRelId", marketCaseCustGrouprelId);
		out.put("custGroupEventRelId", custGroupEventRelId);
		out.put("custGroupId", custGroupId);
		out.put("ruleId", ruleId);
		out.put("ruleDetailId", ruleDetailId);
		out.put("custGroupName", custGroupName);
		out.put("eventRuleRelId", eventRuleRelId);
		out.put("eventId", eventId);
		return out;
	}

	/**
	 * 通过前台传入的事件Id增加事件详细信息
	 * 前台传入的事件Id不为空（剩余流量，省外流量费用，业务受理）
	* @date: 2017-2-14 
	* @author: liuqi
	* @title: addEventDetailByExistsEventId 
	* @param inParam
	* @param eventDetailInfo
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> addEventDetailByExistsEventId(Map<String, Object> inParam,Map<String, Object> eventDetailInfo) throws StrategyError{
		
		String marketCaseCustGrouprelId = (String) inParam.get("marketCaseCustGrouprelId");  //relId
		String custGroupId = (String) inParam.get("custGroupId");
		String custGroupName = (String) inParam.get("custGroupName");
		String custGroupEventRelId ="";
		String eventId=(String) eventDetailInfo.get("eventId");
		String ruleDetailId="";
		String ruleId="";
		String eventRuleRelId="";
		//查询客户群是否关联此事件start
		
		Map<String,Object> newInParam = new HashMap<String, Object>();
		newInParam.put("parentComponentId", custGroupId);
		newInParam.put("parentRelId", marketCaseCustGrouprelId);
		newInParam.put("parentComponentType", Const.COMPONENT_TYPE_CUSTGROUP);
		newInParam.put("componentType", Const.COMPONENT_TYPE_EVENT);
		newInParam.put("componentId", eventId);
		//查询客户群是否关联此事件end
		Map<String,Object> eventRel = eventSelector.selectEventRelation(newInParam);
			if(CommonUtils.objectIsNull(eventRel)){
				custGroupEventRelId= SequenceUtil.getSequence();
				newInParam.put("relId", custGroupEventRelId);
				eventInsertor.insertRelationInfo(newInParam);
			}else{
				custGroupEventRelId = (String)eventRel.get("relId");
				throw new StrategyError(ErrorCode.ERROR_CODE_00002,ErrorCode.ERROR_MSG_00002,ErrorCode.ERROR_DETAIL_MSG_00002);
			}
		//判断事件传入是否有含有渠道param值在里面
			List<Map<String, Object>> eventDetailCodeInfo =(List<Map<String, Object>>) eventDetailInfo.get("params");
			if(!CommonUtils.objectIsNull(eventDetailCodeInfo)){
				//start
				Map<String,Object> param = new HashMap<String, Object>();
				param.put("parentComponentId", eventId);
				param.put("parentComponentType", Const.COMPONENT_TYPE_EVENT);
				param.put("componentType",Const.COMPONENT_TYPE_RULE);
				param.put("parentRelId", custGroupEventRelId);
				ruleId=SequenceUtil.getSequence();
				eventRuleRelId=SequenceUtil.getSequence();
				param.put("componentId",ruleId);
				param.put("relId", eventRuleRelId);
				eventInsertor.insertRelationInfo(param);
				//end	
				
			Map<String,Object> codeInfo = new HashMap<String, Object>();
			for(int i=0;i<eventDetailCodeInfo.size();i++){
				//事件渠道入规则表
				if(((String)(eventDetailCodeInfo.get(i).get("eventParCode"))).equals(Const.RULE_TYPE_EVENTTRIGGERCHANNEL)){
					codeInfo.put("eventParValue", eventDetailCodeInfo.get(i).get("eventParValue"));
					String ruleParName=(String) eventDetailCodeInfo.get(i).get("eventParName"); 
					String ruleParCode =(String) eventDetailCodeInfo.get(i).get("eventParCode");
					String codeInfoMess=(String)codeInfo.get("eventParValue");
					String[] str = codeInfoMess.split("~");
					String first="";
					String second="";
					//规则表
					Map<String,Object> pa = new HashMap<String, Object>();
					pa.put("ruleId",ruleId);
					pa.put("serialId", SequenceUtil.getSequence());
					ruleInsertor.insertRuleInfo(pa, pa);
					//从数组中筛选出渠道的code值分别挂入规则明细表
					for(int a=0;a<str.length;a++){
						String db = str[a];
						String[] f = db.split("\\^");
							for(int a1=0;a1<f.length;a1++){
								first = f[0];
								second= f[1];
							}
							//将事件规则中的渠道放入规则明细表
							String serialId =SequenceUtil.getSequence();
							Map<String,Object> para = new HashMap<String, Object>();
							ruleDetailId = SequenceUtil.getSequence();
							para.put("ruleId", ruleId);
							para.put("serialId", serialId);
							para.put("ruleDetailId", ruleDetailId);
							para.put("ruleParName", ruleParName);
							para.put("ruleParCode",Const.RULE_CODE_EVENTTRIGGERCHANNEL);
							para.put("ruleDetailType",Const.RULE_TYPE_EVENTTRIGGERCHANNEL);							
							para.put("ruleParDesc", second);
							para.put("ruleParValue", first);
							ruleInsertor.insertRuleDetailInfo(para, para);
						}
					}
				}
			}
		//增加的出参返回值
		Map<String,Object> out = new HashMap<String, Object>();
		out.put("marketCaseCustGroupRelId", marketCaseCustGrouprelId);
		out.put("custGroupEventRelId", custGroupEventRelId);
		out.put("custGroupId", custGroupId);
		out.put("custGroupName", custGroupName);
		out.put("ruleId", ruleId);
		out.put("ruleDetailId", ruleDetailId);
		out.put("eventRuleRelId", eventRuleRelId);
		out.put("eventId", eventId);
		return out;
}

	/**
	 * 查询事件基本信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryEventInfo  
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> queryEventInfo(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		return eventSelector.selectEventInfo(inParam,queryFilter);
		
	}
	
	/**
	 * 移除事件的详细信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: removeventDetail  
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void removeEventDetail(Map<String,Object> inParam) throws StrategyError {
		eventDeleter.deleteEventDetailInfo(inParam);
	}
	
	/**
	 * 移除事件的基本信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: removeventInfo  
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void removeEventInfo(Map<String,Object> inParam) throws StrategyError {
		eventDeleter.deleteEventInfo(inParam);
	}
	
	/**
	 * 更新事件的详细信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: updateEventDetail 
	* @param inparam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void updateEventDetail(Map<String,Object> inParam) throws StrategyError {
		eventUpdater.updateEventDatailInfo(inParam);
	}
		
	/**
	 * 更新事件的基本信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: updateEventInfo 
	* @param inparam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void updateEventInfo(Map<String,Object> inparam) throws StrategyError {
		eventUpdater.updateEventInfo(inparam);
	}
	
	/**
	 * 根据relId查询事件id，根据查询的事件id，删除事件和事件详情，再删除关系表
	* @date: 2017-3-30 
	* @author: chenhao
	* @title: romoveMarketCaseEventRelAndDetailByRelId 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void romoveMarketCaseEventRelAndDetailByRelId(Map<String, Object> inParam) throws StrategyError{
		//根据relId取得事件id
		Map<String,Object> eventMap = eventSelector.selectEventIdByRelId(inParam);
		String eventId = (String) eventMap.get("eventId");
		//如果取得的id不为缴费id
		if(!CommonUtils.objectIsNull(eventId)){
			String e = eventId.substring(0, 4);
			if(Const.EVENT_TYPE_FLOW.equals(e)||Const.EVENT_TYPE_FEE.equals(e)||Const.EVENT_TYPE_BUSI.equals(e)){
				eventDeleter.deleteCustGroupEventRelation(inParam);	
			}else{
				//System.out.println("----------删除事件开始-------------");
				eventDeleter.deleteEventInfo(eventMap);
				//System.out.println("删除事件成功+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++chen");
				eventDeleter.deleteEventDetailInfo(eventMap);
				//System.out.println("删除事件详情成功+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++chen");
				eventDeleter.deleteCustGroupEventRelation(inParam);
				//System.out.println("删除事件关系成功+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++chen");
			}

		}
			
		
		
	}
	

}
