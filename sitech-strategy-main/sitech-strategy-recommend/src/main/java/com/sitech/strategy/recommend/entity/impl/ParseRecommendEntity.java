package com.sitech.strategy.recommend.entity.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.assemblyservicestructure.IAssemblyServiceStructure;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.algorithm.IRecommedAlgo;
import com.sitech.strategy.core.objectville.inter.IChannelTask;
import com.sitech.strategy.core.objectville.inter.IEvaluate;
import com.sitech.strategy.core.objectville.inter.IEventTrigger;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.core.objectville.inter.IUser;
import com.sitech.strategy.recommend.base.BaseRecommendEntity;
import com.sitech.strategy.recommend.entity.inter.IParseRecommendEntity;

/**
 * 推荐解析实体
* @date: 2016-9-5 
* @author: sunliang 
* @title: ParseEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ParseRecommendEntity extends BaseRecommendEntity implements IParseRecommendEntity,Serializable{
	/**
	 * 报文组装对象
	 */
	protected IAssemblyServiceStructure assemblyServiceStructure;
	/**
	 * 渠道任务对象
	 */
	protected IChannelTask channelTask;
	/**
	 * 评估对象
	 */
	protected IEvaluate evaluate;
	/**
	 * 事件触发
	 */
	protected IEventTrigger eventTrigger;
	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * 规则对象
	 */
	protected IRule rule;
	/**
	 * 推荐算法对象
	 */
	protected IRecommedAlgo recommedAlgo;
	/**
	 * 用户对象
	 */
	protected IUser user;
	
	/** 
	* @date: 2017-2-8 
	* @author: wangpei
	* @title: setAssemblyServiceStructure 
	* @param assemblyServiceStructure 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setAssemblyServiceStructure(
			IAssemblyServiceStructure assemblyServiceStructure) {
		this.assemblyServiceStructure = assemblyServiceStructure;
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
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: setEvaluate 
	* @param evaluate 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEvaluate(IEvaluate evaluate) {
		this.evaluate = evaluate;
	}
	
	/**
	 * 
	* @date: 2017-2-13 
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
	* @date: 2017-2-9 
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
	* @date: 2016-9-14 
	* @author: sunliang 
	* @title: setRecommedAlgo 
	* @param recommedAlgo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRecommedAlgo(IRecommedAlgo recommedAlgo) {
		this.recommedAlgo = recommedAlgo;
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
	 * 
	* @date: 2017-2-9 
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
	 * 解析渠道任务推荐
	* @date: 2016-10-20 
	* @author: yangwl
	* @title: parseChannelTaskRecommend 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> parseChannelTaskRecommend(Map<String, Object> inParam)
			throws StrategyError {
		//增加接触记录
		user.addUserContactRecord(inParam);
		
		List<Map<String, Object>> marketCaseParketPojoList = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> marketCaseParketList = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> userList = (List<Map<String, Object>>)inParam.get("userList");
		Map<String, Object> channelTaskRecord = channelTask.queryChannelTaskByTaskId(inParam);
		

		for (Map.Entry<String, Object> channelTaskMap: channelTaskRecord.entrySet()) {
			Map<String,Object> tempParam = channelTask.parseChannelTask(channelTaskMap);
			Map<String, Object> marketCasePacketPojoMap = recommedAlgo.getChannelTaskRecommendMarketCaseList(inParam,tempParam,userList);
			Map<String, Object> marketCaseParketMap = assemblyServiceStructure.toPacketFromMarketCase(inParam,marketCasePacketPojoMap);
			marketCaseParketPojoList.add(marketCasePacketPojoMap);
			marketCaseParketList.add(marketCaseParketMap);
		}
		//增加接触控制记录
		rule.addTouchControlRecord(inParam,marketCaseParketPojoList);
		//增加推荐记录
		user.addUserRecommendRecord(inParam,marketCaseParketPojoList);
		//记录数据统计缓存
		evaluate.addRealStatisticRecord(inParam, marketCaseParketPojoList);
		//拼装报文
		Map<String, Object> outParam = assemblyServiceStructure.assemblyChannelTriggerPacket(marketCaseParketList);

		return outParam;
	}


	/**
	 * 解析渠道触发推荐
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: parseChannelTriggerRecommend 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> parseChannelTriggerRecommend(Map<String, Object> inParam) throws StrategyError{
		
		//增加接触记录
		//user.addUserContactRecord(inParam);
		
		List<Map<String, Object>> marketCaseParketPojoList = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> marketCaseParketList = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> userList = (List<Map<String, Object>>)inParam.get("userList");
		
		for(Map<String, Object> userMap : userList){
			//获取营销案内容
			Map<String, Object> marketCasePacketPojoMap = recommedAlgo.getChannelTriggerRecommedMarketCaseList(inParam,userMap);
			//解析数据结构
			Map<String, Object> marketCaseParketMap = assemblyServiceStructure.toPacketFromMarketCase(inParam,marketCasePacketPojoMap);
			marketCaseParketPojoList.add(marketCasePacketPojoMap);
			marketCaseParketList.add(marketCaseParketMap);
		}
		//增加接触控制记录
		rule.addTouchControlRecord(inParam,marketCaseParketPojoList);
		//增加推荐记录
		user.addUserRecommendRecord(inParam,marketCaseParketPojoList);
		//增加推荐营销案记录
		user.addUserRecommendMarketCase(inParam,marketCaseParketPojoList);
		//记录数据统计缓存
		evaluate.addRealStatisticRecord(inParam, marketCaseParketPojoList);
		//拼装报文
		Map<String, Object> outParam = assemblyServiceStructure.assemblyChannelTriggerPacket(marketCaseParketList);
		
		return outParam;
		
	}
	
	/**
	 * 解析事件触发推荐
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: parseEventTriggerRecommend 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void parseEventTriggerRecommend(Map<String, Object> inParam)
			throws StrategyError {

		//增加接触记录
		//user.addUserContactRecord(inParam);
		
		List<Map<String, Object>> marketCaseParketPojoList = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> userList = (List<Map<String, Object>>)inParam.get("userList");
		List<String> eventIdList = (List<String>) inParam.get("eventIdList");
		for(String eventId : eventIdList){
			inParam.put("eventId",eventId);
			for(Map<String,Object> userMap : userList){
				//获取营销案内容
				Map<String, Object> marketCasePacketPojoMap = recommedAlgo.getEventTriggerRecommedMarketCaseList(inParam,userMap);
				log.info("ParseRecommendEntity.parseEventTriggerRecommend.marketCasePacketPojoMap" + (String)userMap.get("phoneNo") , marketCasePacketPojoMap);
				if(!CommonUtils.objectIsNull(marketCasePacketPojoMap.get("positionInfoMap"))){
					marketCaseParketPojoList.add(marketCasePacketPojoMap);
				}
			}
			if(!CommonUtils.objectIsNull(marketCaseParketPojoList)){
				break;
			}
		}
		
		//增加推荐记录
		user.addUserRecommendRecord(inParam,marketCaseParketPojoList);
		//增加推荐营销案记录
		user.addUserRecommendMarketCase(inParam,marketCaseParketPojoList);
		//增加全局接触控制记录
		rule.addTouchControlRecord(inParam,marketCaseParketPojoList);
		//记录数据统计缓存
		evaluate.addRealStatisticRecord(inParam,marketCaseParketPojoList);
		//发送事件触发消息
		eventTrigger.sendEventTriggerMsg(inParam, marketCaseParketPojoList);

	}
	
	
	
/*	*//**
	 * 渠道触发推荐反馈
	* @date: 2016-2-8 
	* @author: zhangqi 
	* @title: channelTriggerRecommendFeedback 
	* @param inParam
	* @return
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	public Map<String, Object> channelTriggerRecommendFeedback(Map<String, Object> inParam) throws StrategyError{
		return new HashMap<String, Object>();
	}*/

/*	*//** 
	* @date: 2017-1-12 
	* @author: zhangqia
	* @title: selectIdNoByServiceNo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	 *@param  
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*//*
	protected String[] selectIdNoByServiceNo(Map<String, Object> inParam) throws StrategyError{
		String idNo = userSelector.selectIdNoByServiceNo((String)inParam.get("numValue")+(String)inParam.get("numType"));
		if (CommonUtils.objectIsNull(idNo)) {
			return new String [0];
		}
		log.debug("=======parseRecommendContent====idNoArr===", idNo);
		String[] idNoArr = idNo.split(Const.SEPARATOR_COMMA);
		log.debug("=======parseRecommendContent====idNoArr=size==", idNoArr.length);
		return idNoArr;
	}*/
/*	*//** 
	* @date: 2016-11-26 
	* @author: songxj
	* @title: checkCustGroupAndRuleAndsendMsg 
	* @param marketCaseId
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	 * @param marketCaseIds 
	 * @param seqId 
	 * @param  
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*//*
	protected void checkCustGroupAndRuleAndsendMsg(String marketCaseId, Map<String, Object> inParam,
			String marketCaseIds, String seqId) throws StrategyError{
	
		MarketCaseCachePojo marketCaseCachePojo = queryMarketCaseInfo(marketCaseId);
		List<String> custGroupList = getCustGroupIDList(marketCaseCachePojo.getCustGroupMap());
		
		//客户群校验
		Map<String,List<String>> custGroupKindMap = new HashMap<String,List<String>>();
		custGroupKindMap.put(Const.CUSTGROUP_TYPE_COC, custGroupList);

		if (!custGroup.isCustGroupUser(inParam, custGroupKindMap, new HashMap<String,String>())) {
			return;
		}
		Map<String, List<String>> channelIdAndContentIdList = getChannelIdAndContentIdListMap(marketCaseCachePojo.getMarketCaseRel(), marketCaseId);
		
		Iterator<String> channelIterator = channelIdAndContentIdList.keySet().iterator();
		while (channelIterator.hasNext()) {
			String channelId = (String) channelIterator.next();
			//一个规则一个规则的校验
			inParam.put("channelId", channelId);
			//规则校验和发送smpp短信
			checkRuleAndSendMsg(inParam, marketCaseCachePojo, channelIdAndContentIdList, marketCaseId, marketCaseIds, seqId);
		}
	}*/

/*	*//** 
	 * 规则校验和smpp短信发送
	* @date: 2016-11-26 
	* @author: songxj
	* @title: checkRuleAndSendMsg 
	* @param inParam
	* @param marketCaseCachePojo
	* @param channelIdAndContentIdList
	* @param marketCaseId
	* @param marketCaseIds
	* @param seqId
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*//*
	protected void checkRuleAndSendMsg(Map<String, Object> inParam, MarketCaseCachePojo marketCaseCachePojo,
			Map<String, List<String>> channelIdAndContentIdList,String marketCaseId, String marketCaseIds, String seqId) throws StrategyError {
		String channelId = (String) inParam.get("channelId");
		
		Map<String,Object> marketCaseMap = marketCaseCachePojo.getMarketCaseMap();
		String endTime = (String) marketCaseMap.get("endTime");
		inParam.put("endTime", endTime);
		
		if (rule.isPassRule(inParam, marketCaseCachePojo.getMarketCaseMap(), marketCaseCachePojo.getRuleMap())) {
			//全局规则校验
			Map<String,Object> checkParam = rule.isPassGlobalRule(inParam, marketCaseCachePojo.getMarketCaseMap(), marketCaseCachePojo.getGlobalRuleMap());
			boolean checkFlag = (Boolean) checkParam.get("checkFlag");
			if (checkFlag) {
				List<String> contentList = getMarketCaseContent(marketCaseCachePojo.getContentMap(), channelIdAndContentIdList.get(channelId));
				if ("4".equals(channelId)) {
					for (String contentStr : contentList) {
						inParam.put("msg", contentStr);
						insertEventTaskAndIndexAndCountTable(inParam, marketCaseId);
						// 插入推荐表和营销案推荐统计表
						//insertRecordTable(inParam, marketCaseId, marketCaseIds, seqId);
					}
				}
			}
		}
	}*/

/*	*//** 
	 * 查询营销案中渠道和内容
	* @date: 2016-11-26 
	* @author: songxj
	* @title: getChannelIdAndContentIdListMap 
	* @param inparamMap
	* @param marketCaseId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*//*
	protected Map<String, List<String>> getChannelIdAndContentIdListMap(Map<String, Object> inparamMap, String marketCaseId){
		Map<String, List<String>> chanelIdContentIdList = new HashMap<String, List<String>>();
		if (inparamMap.containsKey(Const.COMPONENT_TYPE_MARKETCASE)) {
			Map<String, Object> marketCaseMap = (Map<String, Object>) inparamMap.get(Const.COMPONENT_TYPE_MARKETCASE);
			Map<String, Object> marketCaseRelMap = (Map<String, Object>) marketCaseMap.get(marketCaseId);
			if (marketCaseRelMap.containsKey(Const.COMPONENT_TYPE_CUSTGROUP)) {
				Map<String, Object> custGroupMap = (Map<String, Object>) marketCaseRelMap.get(Const.COMPONENT_TYPE_CUSTGROUP);
				Iterator<String> componentIdIterator = custGroupMap.keySet().iterator();
				while (componentIdIterator.hasNext()) {
					String componentId = (String) componentIdIterator.next();
					Map<String, Object> channelRelMap = (Map<String, Object>) custGroupMap.get(componentId);
					if (channelRelMap.containsKey(Const.COMPONENT_TYPE_CHANNEL)) {
						Map<String, Object> chanelMap = (Map<String, Object>) channelRelMap.get(Const.COMPONENT_TYPE_CHANNEL);
						Iterator<String> channelIterator = chanelMap.keySet().iterator();
						while (channelIterator.hasNext()) {
							String channelId = (String) channelIterator.next();
							chanelIdContentIdList.put(channelId, getContentIdList(channelId, chanelMap));
						}
					}
				}
			}
		}
		return chanelIdContentIdList;
	}*/

/*	*//** 获取内容id列表
	* @date: 2016-11-26 
	* @author: songxj
	* @title: getContentIdList 
	* @param channelId
	* @param map
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*//*
	protected List<String> getContentIdList(String channelId, Map<String, Object> chanelMap) {
		Map<String, Object> positionMap = (Map<String, Object>) chanelMap.get(channelId);
		Iterator<String> positionIterator = positionMap.keySet().iterator();
		while (positionIterator.hasNext()) {
			String positionID = (String) positionIterator.next();
			Map<String, Object> contentAndRuleMap = (Map<String, Object>) positionMap.get(positionID);
			Iterator<String> positionIterator2 = contentAndRuleMap.keySet().iterator();
			while (positionIterator2.hasNext()) {
				String string = (String) positionIterator2.next();
				Map<String, Object> contentAndRuleMap2 = (Map<String, Object>) contentAndRuleMap.get(string);
				if (contentAndRuleMap2.containsKey(Const.COMPONENT_TYPE_CONTENT)) {
					return (List<String>) contentAndRuleMap2.get(Const.COMPONENT_TYPE_CONTENT);
				}
			}
		}
		return null;
	}*/

/*	*//** 
	 * 查询客户群id列表
	* @date: 2016-11-26 
	* @author: songxj
	* @title: getCustGroupIDList 
	* @param custGroupMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*//*
	protected List<String> getCustGroupIDList(Map<String, Object> custGroupMap){
		List<String> custGroupList = new ArrayList<String>();
		if (!CommonUtils.objectIsNull(custGroupMap)) {
			Iterator<String> custgroupIdIterator = custGroupMap.keySet().iterator();
			while (custgroupIdIterator.hasNext()) {
				String custgroupId = (String) custgroupIdIterator.next();
				Map<String, Object> custGroup = (Map<String, Object>) custGroupMap.get(custgroupId);
				if (custGroup.containsKey("custGroupId")) {
					custGroupList.add((String) custGroup.get("custGroupId"));
				}
			}
		}
		return custGroupList;
	}*/

/*	*//** 
	 * 查询营销案内容列表
	* @date: 2016-11-26 
	* @author: songxj
	* @title: getMarketCaseContent 
	* @param marketCaseContentMap
	* @param contentIdList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*//*
	protected List<String> getMarketCaseContent(Map<String, Object> marketCaseContentMap, List<String> contentIdList){
		List<String> contentList = new ArrayList<String>();
		for (String contentId: contentIdList) {
			List<Map<String,Object>> contentDetailList = (List<Map<String,Object>>)marketCaseContentMap.get(contentId);
			for (int i = 0, j = contentDetailList.size(); i < j; i++) {
				Map<String,Object> contentDetailMap  = contentDetailList.get(i);
				List<Map<String,String>> paramsList = (List<Map<String,String>>)contentDetailMap.get("params");
				for(Map<String,String> param: paramsList){
					if("smsContent".equals(param.get("contentParCode"))){
						String content = param.get("contentParValue");
						contentList.add(content);
					}
				}
			}
		}
		return contentList;
	}*/

/*	*//** 
	 * 查询用户基本信息
	* @date: 2016-11-26 
	* @author: songxj
	* @title: getUserInfo 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*//*
	protected Map<String, Object> getUserInfo(Map<String, Object> inParam) {
		//查询用户信息
		Map<String, String> rmUserInfoMap = userSelector.selectUserInfoByIdNo(inParam);
		if (CommonUtils.objectIsNull(rmUserInfoMap.get("phoneNo"))) {
			return inParam;
		}
		inParam.put("phoneNo", rmUserInfoMap.get("phoneNo"));
		inParam.put("numValue", rmUserInfoMap.get("phoneNo"));
		return inParam;
	}*/

/*	*//** 
	 * 产品订购事件插入任务表、任务索引表和统计表
	* @date: 2016-11-29 
	* @author: songxj
	* @title: insertEventTaskAndIndexAndCountTable  
	* @exception: 
	* @version: 1.0 
	 * @param marketCaseId 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*//*
	protected void insertEventTaskAndIndexAndCountTable(Map<String,Object> tempInParam, String marketCaseId) {
		
		Map<String,Object> tempParam = new HashMap<String,Object>();
		tempParam.put("phoneNo", "");
		tempParam.put("msg", "");
		tempParam.put("endTime", "");
		tempParam.put("marketCaseId", marketCaseId);
		tempParam.put("productCommodityId", tempInParam.get("prodId"));
		tempParam.put("currentDate", DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1));
		tempParam.put("partition", Const.TASK_TYPE_EVENT_PARTITION);
		tempParam.put("taskId", SequenceUtil.getSequence());

		//插入事件任务
		taskInsertor.insertEventTask(tempInParam);
		
		//插入任务索引表 事件部分，后续修改 by sunliang 20170110
		//taskInsertor.insertBatchPushTaskIndex(tempInParam);
		
		//插入任务统计表
		//taskInsertor.insertBatchPushTaskCount(tempInParam);
	}*/

/*	*//**
	 * 插入营销案推荐统计表
	* @date: 2016-11-17 
	* @author: yangwl
	* @title: inserMarketCaseRecommendTotal 
	* @param inParam
	* @param actId
	* @param nowDay 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	protected void inserMarketCaseRecommendTotal(Map<String, Object> inParam, String marketcaseId, String nowDay) throws StrategyError{
		//先查询营销案推荐统计表 
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		Map<String, String> param = new HashMap<String, String>();
		if(nowDay == null || "".equals(nowDay)){
			tempInParam.put(Const.NOSQL_ROWKEY, marketcaseId + ":" + inParam.get("channelId"));
		}else{
			tempInParam.put(Const.NOSQL_ROWKEY, marketcaseId + ":" + inParam.get("channelId") + ":" +nowDay);
		}
		Map<String, Object> recommendTotal = marketCaseSelector.selectMarketCaseRecommendTotalByRowKey(tempInParam, fields);
		
		//在插入营销案推荐统计表
		if(CommonUtils.objectIsNull(recommendTotal)){
			param.put("COUNT", "1");
			marketCaseInsertor.inserMarketCaseRecommendTotal(tempInParam, param);
		}else{
			int count = Integer.valueOf((String)recommendTotal.get("count"));
			param.put("COUNT", String.valueOf(count + 1));
			marketCaseInsertor.inserMarketCaseRecommendTotal(tempInParam, param);
		}
	}*/

/*	*//**
	 * 插入推荐量（推荐表）
	* @date: 2016-11-17 
	* @author: yangwl
	* @title: insertRecommendRecord  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	protected void insertRecommendRecord(Map<String, Object> inParam,Map<String, Object> tempInParam){
		
		Map<String, Object> tempParam = new HashMap<String, Object>();
		tempParam.put("idNo", inParam.get("idNo"));
		tempParam.put("seqId", tempInParam.get("seqId"));
		
		Map<String, String> param = new HashMap<String, String>();
		param.put("MARKET_CASE_ID", (String) CommonUtils.replaceNull(tempInParam.get("marketCaseId")));
		param.put("RECOMMONED_TIME", (String) CommonUtils.replaceNull(tempInParam.get("recommonedTime")));
		param.put("POSITION_ID", (String) CommonUtils.replaceNull(tempInParam.get("positionId")));
		param.put("REGION_CODE", (String) CommonUtils.replaceNull(inParam.get("regionCode")));
		param.put("CHANNEL_ID", (String) CommonUtils.replaceNull(inParam.get("channelId")));
		param.put("ID_NO", (String) CommonUtils.replaceNull(inParam.get("idNo")));
		param.put("NUM_TYPE", (String) CommonUtils.replaceNull(inParam.get("numType")));
		param.put("NUM_VALUE", (String) CommonUtils.replaceNull(inParam.get("numValue")));
		param.put("OPER_NO", (String) CommonUtils.replaceNull(inParam.get("operNo")));
		param.put("OPER_NAME", (String) CommonUtils.replaceNull(inParam.get("operName")));
		
		coupleBackInsertor.insertRecommendRecord(tempParam, param);
	}*/

/*	*//** 
	 * 插入推荐表和营销案推荐统计表
	* @date: 2016-11-26 
	* @author: songxj
	* @title: insertRecordTable 
	* @param inParam
	* @param marketCaseId
	* @param marketCaseIds
	* @param seqId
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*//*
	protected void insertRecordTable(Map<String, Object> inParam,
			String marketCaseId, String marketCaseIds, String seqId) throws StrategyError {
		String nowDay = DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1);
		//插入营销案推荐统计表
		this.inserMarketCaseRecommendTotal(inParam, marketCaseId, "");
		//插入每天营销案推荐统计表
		this.inserMarketCaseRecommendTotal(inParam, marketCaseId, nowDay);
		//插入推荐量（推荐表）
		//this.insertRecommendRecord(marketCaseIds, seqId);
	}*/

/*	*//**
	 * 插入用户的接触记录
	* @date: 2016-11-14 
	* @author: yangwl
	* @title: insertUserContactRecord 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	protected String insertUserContactRecord(Map<String, Object> inParam) throws StrategyError{
		
		Date now = new Date(); 
		SimpleDateFormat dateFormat = new SimpleDateFormat(DateUtil.TIME_FROMAT_SIMPLE3);
		
		String seqId =  SequenceUtil.getSequence();
		String idNo =  (String) CommonUtils.replaceNull(inParam.get("idNo"));
		String regionCode =  (String) CommonUtils.replaceNull(inParam.get("regionCode"));
		String channelId =  (String) CommonUtils.replaceNull(inParam.get("channelId"));
		String operNo =  (String) CommonUtils.replaceNull(inParam.get("operNo"));
		String operName =  (String) CommonUtils.replaceNull(inParam.get("operName"));
		String numType =  (String) CommonUtils.replaceNull(inParam.get("numType"));
		String numValue =  (String) CommonUtils.replaceNull(inParam.get("numValue"));
		String contactTime = dateFormat.format(now);
		
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("SEQ_ID", seqId);
		param.put("ID_NO", idNo);
		param.put("REGION_CODE", regionCode);
		param.put("CHANNEL_ID", channelId);
		param.put("OPER_NO", operNo);
		param.put("OPER_NAME", operName);
		param.put("NUM_TYPE", numType);
		param.put("NUM_VALUE", numValue);
		param.put("CONTACT_TIME", contactTime);
		coupleBackInsertor.insertContactRecordInfo(param);
		
		return seqId;
	}*/
	

/*	*//** 
	 * 缓存中查询营销案信息
	* @date: 2016-11-23 
	* @author: songxj
	* @title: queryMarketCaseInfo 
	* @param marketCaseId
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*//*
	protected MarketCaseCachePojo queryMarketCaseInfo(String marketCaseId) throws StrategyError{
		Map<String,Object> ruleInParam = new HashMap<String,Object>();
		ruleInParam.put("marketCaseId", marketCaseId);
		MarketCaseCachePojo marketCaseCachePojo = marketCaseSelector.getMarketCaseDetailFromCache(ruleInParam);
		return marketCaseCachePojo;
	}*/
	
	
	/**
	 * 记录推荐量
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: recordRecommendInfo 
	* @param inParam
	* @param outParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
/*	protected void recordRecommendInfo(Map<String, Object> inParam, Map<String, Object> outParam) throws StrategyError{
		Date now = new Date();
		String nowDay = DateUtil.DateToString(now, DateUtil.DATE_FROMAT_YYYYMMDD1);
		String nowTime = DateUtil.DateToString(now, DateUtil.TIME_FROMAT_SIMPLE1);

		List<Map<String,Object>> positionInfoList =  (List<Map<String,Object>>)outParam.get(Const.PACKET_PARAM_NODE_POSITION_INFO_LIST);
		for(Map<String, Object> positionInfo : positionInfoList){
			String positionId = (String) positionInfo.get(Const.PACKET_PARAM_NODE_POSITION_ID);
			List<Map<String,Object>> actInfoList =  (List<Map<String,Object>>)positionInfo.get(Const.PACKET_PARAM_NODE_ACT_LIST);
			if(!CommonUtils.objectIsNull(actInfoList)){
				for(Map<String, Object> actInfo : actInfoList){
					String marketcaseId = (String)actInfo.get("ACT_ID");
					String seqId = (String)actInfo.get("SEQ_ID");
					Map<String, Object> tempInParam = new HashMap<String, Object>();
					tempInParam.put("marketCaseId", marketcaseId);
					tempInParam.put("seqId", seqId);
					tempInParam.put("positionId", positionId);
					tempInParam.put("recommonedTime", nowTime);
					//插入营销案推荐统计表
					//this.inserMarketCaseRecommendTotal(inParam, marketcaseId, "");
					//插入每天营销案推荐统计表
					//this.inserMarketCaseRecommendTotal(inParam, marketcaseId, nowDay);
					//插入推荐量（推荐表）
					this.insertRecommendRecord(inParam,tempInParam);
				}
			}	
		}
		
	}*/
/*	*//**
	 * 记录推荐量
	* @date: 2016-12-5 
	* @author: zhangqia
	* @title: recordRecommendWSInfo 
	* @param inParam
	* @param outParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	protected void recordRecommendWSInfo(Map<String, Object> inParam, Map<String, Object> outParam, String seqId) throws StrategyError{
		String nowDay = DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1);
		String marketCaseIds = "";
		List<Map<String,Object>> positionInfoList =  (List<Map<String,Object>>)outParam.get(Const.PACKET_PARAM_NODE_POSITION_INFO_LIST);
		List<String> actInfoList =  (List<String>)outParam.get(Const.PACKET_PARAM_NODE_ACT_LIST);
		if(!CommonUtils.objectIsNull(actInfoList)){
			for(String actInfo : actInfoList){
				marketCaseIds = marketCaseIds + "," + actInfo;
				//插入营销案推荐统计表
				this.inserMarketCaseRecommendTotal(inParam, actInfo, "");
				//插入每天营销案推荐统计表
				this.inserMarketCaseRecommendTotal(inParam, actInfo, nowDay);
			}
				
		}
		//插入推荐量（推荐表）
		//this.insertRecommendRecord(marketCaseIds, seqId);
	}*/
}
