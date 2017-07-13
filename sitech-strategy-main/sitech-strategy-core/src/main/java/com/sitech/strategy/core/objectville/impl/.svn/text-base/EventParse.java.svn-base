package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IEventParse;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IMsgSender;

/**事件解析
 * Create on 2017-1-20
 * @author: wangpei
 * @Title:EventParse
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class EventParse extends BaseClass implements IEventParse,Serializable{
	/**
	 * 消息发送器对象
	 */
	protected IMsgSender.IBatchPushSender batchPushSender;
	/**
	 * 事件查询
	 */
	protected IDataSelector.IEventSelector eventSelector;
	/**
	 * 集团事件发送
	 */
	protected IMsgSender.IGroupMsgEventSender groupMsgEventSender;
	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * 营销案数据查询对象
	 */
	protected IDataSelector.IMarketCaseSelector marketCaseSelector;
	/**
	 * 规则对象
	 */
	protected IRule rule;
	/**
	 * 事件触发发送
	 */
	protected IMsgSender.ITriggerMsgEventSender triggerMsgEventSender;
	/**
	 * 用户信息插入
	 */
	protected IDataInsertor.IUserInsertor userInsertor;
	/**
	 * 用户查询
	 */
	protected IDataSelector.IUserSelector userSelector;
	
    /**
     * 	
    * @date: 2017-3-11 
    * @author: tangaq
    * @title: setBatchPushSender 
    * @param batchPushSender 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public void setBatchPushSender(IMsgSender.IBatchPushSender batchPushSender) {
		this.batchPushSender = batchPushSender;
	}

	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: setEventSelector 
	* @param eventSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setEventSelector(IDataSelector.IEventSelector eventSelector) {
		this.eventSelector = eventSelector;
	}
	
	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: setGroupMsgEventSender 
	* @param groupMsgEventSender 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setGroupMsgEventSender(
			IMsgSender.IGroupMsgEventSender groupMsgEventSender) {
		this.groupMsgEventSender = groupMsgEventSender;
	}
	
    /**
     * 	
    * @date: 2017-3-11 
    * @author: tangaq
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
	* @date: 2017-3-11 
	* @author: tangaq
	* @title: setUserInsertor 
	* @param userInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUserInsertor(IDataInsertor.IUserInsertor userInsertor) {
		this.userInsertor = userInsertor;
	}

	/**
	 * 
	* @date: 2017-3-10 
	* @author: tangaq
	* @title: setMarketCaseSelector 
	* @param marketCaseSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseSelector(
			IDataSelector.IMarketCaseSelector marketCaseSelector) {
		this.marketCaseSelector = marketCaseSelector;
	}
	
    /**
     * 
    * @date: 2017-3-10 
    * @author: tangaq
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
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: setTriggerMsgEventSender 
	* @param triggerMsgEventSender 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTriggerMsgEventSender(
			IMsgSender.ITriggerMsgEventSender triggerMsgEventSender) {
		this.triggerMsgEventSender = triggerMsgEventSender;
	}
	
	/**
	 * 
	* @date: 2017-3-11 
	* @author: tangaq
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
	 * 解析宽带密码服务
	* @date: 2017-3-10 
	* @author: tangaq
	* @title: paraseBroadbandPasswordService 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void paraseBroadbandPasswordService(Map<String, Object> inParam)
			throws StrategyError {
        MarketCaseCachePojo marketCaseCachePojo = marketCaseSelector.getMarketCaseDetailFromCache(inParam);
        Map<String,Object> marketCaseBaseMap = marketCaseCachePojo.getMarketCaseMap();
        Map<String,Object> custGroupMap = (Map<String,Object>)marketCaseCachePojo.getCustGroupMap();
    	if(!CommonUtils.objectIsNull(custGroupMap)){
			for(String custGroupId : custGroupMap.keySet()){
               inParam.put("componentIdBaseContent", ((Map<String,Object>)custGroupMap.get(custGroupId)).get("custGroupId"));
               inParam.put("custGroupId", ((Map<String,Object>)custGroupMap.get(custGroupId)).get("custGroupId"));
			}
    	}
		Map<String,Object> marketCaseRelMap = (Map<String,Object>)(marketCaseCachePojo.getMarketCaseRel()).get(Const.COMPONENT_TYPE_MARKETCASE);
		Map<String,Object> channelRelMap = marketCase.getChannelIdFromMarketCaseRel(inParam,marketCaseRelMap);
		for(Map.Entry<String, Object> chEntry : channelRelMap.entrySet()){
			String channelId = chEntry.getKey();
			inParam.put("channelId", channelId);
		}
    	log.info("inParam", inParam);
    	Map<String,Object> userMap = new HashMap<String,Object>();
    	userMap.put("idNo",inParam.get("idNo"));
    	Map<String,Object> marketCaseTouchControlParse = rule.getUserRecommendControlByChannel(inParam,userMap,marketCaseBaseMap);
    	log.info("show marketCaseTouchControlParse", marketCaseTouchControlParse);
    	inParam.put("marketCaseTouchControl", marketCaseTouchControlParse);
    	Map<String, Object> checkMap = rule.isFilterRule(inParam, userMap, (String)inParam.get("componentIdBaseContent"), marketCaseCachePojo,new HashMap<String,Object>(),new HashMap<String,Object>());
        log.info("checkMap", checkMap);
    	if(!(Boolean)checkMap.get("checkFlag")){
    		return;
    	}
    	
    	Map<String,Object> marketCaseTouchControl = (Map<String,Object>)checkMap.get("marketCaseTouchControl");
    	if(!CommonUtils.objectIsNull(marketCaseTouchControl)){
    		Map<String, Object> tempInParam = new HashMap<String,Object>();
    		tempInParam.put("idNo", userMap.get("idNo"));
    		tempInParam.put("channelId", inParam.get("channelId"));
    		tempInParam.put("marketCaseId", inParam.get("marketCaseId"));
    		tempInParam.putAll(marketCaseTouchControl);
    		log.info("====addTouchControlRecord==tempInParam=", tempInParam);
    		userInsertor.insertUserRecommendControlByChannel(inParam, tempInParam);
    	}
    	this.settleSendBroadbandPasswordMsg(inParam,marketCaseCachePojo);
	}

	/**
	 * 业务受理事件
	* @date: 2017-2-16 
	* @author: sunyuan
	* @title: parseBusiEvent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void parseBusiEvent(Map<String,Object> inParam)throws StrategyError{
		triggerMsgEventSender.sendTriggerMsgEvent(inParam);
	}
	
	/**
	 * 流量事件
	* @date: 2017-2-16 
	* @author: sunyuan
	* @title: parseFlowEvent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void parseFlowEvent(Map<String, Object> inParam) throws StrategyError{
		triggerMsgEventSender.sendTriggerMsgEvent(inParam);
	}
	
	/** 解析集团事件
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: parseGroupMsgEvent 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void parseGroupMsgEvent(Map<String, Object> inParam) throws StrategyError{
		String outParam = eventSelector.selectGroupMsgEvent(inParam);
		String result = this.settleGroupMsgServicesOutParam(outParam);
		if(!CommonUtils.objectIsNull(result)){
			inParam.put("result", result);
			groupMsgEventSender.sendGroupMsg(inParam);
		}
	}

	/**
	 * 费用事件
	* @date: 2017-2-10 
	* @author: sunyuan
	* @title: parsePayFeeEvent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void parsePayFeeEvent(Map<String, Object> inParam) throws StrategyError {
		List<String> eventIdList = new ArrayList<String>();
		String inParamEventId = (String) inParam.get("eventId");
		if(!CommonUtils.objectIsNull(inParamEventId)){
			log.debug("EventParse.parsePayFeeEvent   inParam-----------------", inParam);
			eventIdList.add(inParamEventId);
			inParam.put("eventIdList", eventIdList);
			triggerMsgEventSender.sendTriggerMsgEvent(inParam);
		}else{
			//根据缴费金额匹配事件id
			eventIdList = queryAllEventIdByChannelId((String) inParam.get("eventTriggerChannelId"),(String) inParam.get("eventValue"));
			if (!CommonUtils.objectIsNull(eventIdList)) {
				Map<String,Object> outParam = new HashMap<String,Object>();
				outParam.put("eventIdList", eventIdList);
				outParam.put("regionCode", inParam.get("regonCode"));
				outParam.put("phoneNo", inParam.get("phoneNo"));
				outParam.put("contractNo", inParam.get("contractNo"));
				outParam.put("eventTriggerChannelId", inParam.get("eventTriggerChannelId"));
				triggerMsgEventSender.sendTriggerMsgEvent(outParam);
			}
		}
	}
	
	/** 产品订购事件
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: parseProdOrderEvent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void parseProdOrderEvent(Map<String, Object> inParam)
			throws StrategyError {
		//根据产品ID查询事件ID列表
		List<String> eventIDList = this.queryAllEventIdByProdID((String) inParam.get("prodId"));
		if (!CommonUtils.objectIsNull(eventIDList)) {
			for (int i = 0, j = eventIDList.size(); i < j; i++) {
				String eventID = eventIDList.get(i);
				inParam.put("eventID", eventID);
				triggerMsgEventSender.sendTriggerMsgEvent(inParam);
			}
		}
	}
	
	/**
	 * 根据服务号码查询用户信息
	* @date: 2017-3-11 
	* @author: tangaq
	* @title: getUserInfoByServiceNbr 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getUserInfoByServiceNbr(Map<String,Object> tempInParam) throws StrategyError{
		Map<String,Object> outMap = new HashMap<String,Object>();
		String seriveNo = (String)tempInParam.get("mainNbr");
		log.info("get serivrceNbr", seriveNo);
		String idNo = userSelector.selectIdNoByServiceNo(seriveNo+Const.NUM_TYPE_PHONE_NO)==null?"":userSelector.selectIdNoByServiceNo(seriveNo+Const.NUM_TYPE_PHONE_NO);
		log.info("get idNo", idNo);
		Map<String,Object> inMap = new HashMap<String,Object>();
		inMap.put("idNo", idNo);
		Map<String,String> userMap = userSelector.selectUserInfoByIdNo(inMap);
		log.info("userMap", userMap);
		String userRegionCode = "";
	    userRegionCode = userMap.get("regionCode").toString();
	    outMap.put("userRegionCode", userRegionCode);
		
		return outMap;
	}

	/**
	 * 根据缴费金额匹配事件ID
	* @date: 2017-2-10 
	* @author: sunyuan
	* @title: queryAllEventIdByChannel  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-3-2 luogj 临时屏蔽渠道划分
	* 2017-3-2 luogj 缓存中金额单位是分，需要x100
	 */
	protected List<String> queryAllEventIdByChannelId(String eventTriggerChannelId,String eventValue){
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		List<String> eventDetailStrList = new ArrayList<String>();
		List<String> eventIdList = new ArrayList<String>();
		Double money = Double.parseDouble(eventValue);
		try {
			tempInParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_EVENT_FEE+eventTriggerChannelId);
//			if (null != channelId) {
//				tempInParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_EVENT_FEE+channelId);
//			}
			tempInParam.put(Const.CACHE_START, "0");
			tempInParam.put(Const.CACHE_END, "-1");
			tempInParam.put(Const.CACHE_DIRECTION, "1");
			eventDetailStrList = eventSelector.selectEventDetailByChannelIdFromCache(tempInParam);
			
			log.debug("queryAllEventIdByChannelId.eventDetailStrList", eventDetailStrList);
			
			//匹配
			for(String eventDetailStr : eventDetailStrList){
				log.debug("queryAllEventIdByChannelId.eventDetailStr", eventDetailStr);
				//缓存中value的格式   startFee:endFee:eventId
				String[] eventDetailArr = eventDetailStr.split(Const.SEPARATOR_COLON);
				Double startFee = Double.parseDouble(eventDetailArr[0]);
				Double endFee = Double.parseDouble(eventDetailArr[1]);
				String eventId = eventDetailArr[2];
				log.debug("queryAllEventIdByChannelId.startFee", startFee);
				log.debug("queryAllEventIdByChannelId.endFee", endFee);
				log.debug("queryAllEventIdByChannelId.eventId", eventId);
				log.debug("queryAllEventIdByChannelId.money", money);
				if(money>=startFee*100 && money<=endFee*100){
					eventIdList.add(eventId);
				}
			}
		} catch (StrategyError e) {
			e.printStackTrace();
		}
		log.debug("queryAllEventIdByChannelId.eventIdList", eventIdList);
		return eventIdList;
	}
	
	/** 
	 * 根据产品ID查询事件ID列表
	* @date: 2016-11-23 
	* @author: songxj
	* @title: queryAllEventIdByProdID 
	* @param prodID
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected List<String> queryAllEventIdByProdID(String prodID){
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		List<String> eventIDList = new ArrayList<String>();
		try {
			tempInParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_EVENT_PRODUCT);
			if (null != prodID) {
				tempInParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_EVENT_PRODUCT+prodID);
			}
			tempInParam.put(Const.CACHE_START, "0");
			tempInParam.put(Const.CACHE_END, "-1");
			tempInParam.put(Const.CACHE_DIRECTION, "1");
			eventIDList = eventSelector.selectEventIdByProdIdFromCache(tempInParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
		return eventIDList;
	}
	
	/** 处理CRM集团服务出参
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: settleGroupMsgEventParam 
	* @param param
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected String settleGroupMsgServicesOutParam(String param){
	    String subChannel = "";
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap = JsonUtil.JsonStrToMap(param);
		Map<String,Object> tcpCont = (Map<String,Object>)paramMap.get("TcpCont");
		if(Const.FLASE_INT.equals(tcpCont.get("RespCode")) ){
			Map<String,Object> svcCont = (Map<String,Object>)paramMap.get("SvcCont");
			List<Map<String,Object>>  returnMsg = (List<Map<String,Object>>)svcCont.get("RETURN_MSG");             
			Map<String,Object> inMap = (Map<String,Object>)returnMsg.get(0);
		    if(!CommonUtils.objectIsNull(inMap.get("PROD_INST_ATTR_SUB"))){
		    	for(Map<String,Object> proSubMap:(List<Map<String,Object>>)inMap.get("PROD_INST_ATTR_SUB")){
		    		String sub =(String)proSubMap.get("ATTR_ID"); 
		    		if(Const.CHANNEL_CUREDULITY_SERVICE.equals(sub) || Const.CHANNEL_EURFING_SERVICE.equals(sub) || Const.CHANNEL_PAYMENT_SERVICE.equals(sub) || Const.CHANNEL_WECHAR_SERVICE.equals(sub)){
		    			subChannel += sub+";";
		    		}
		    	}
		    }
		}
		return subChannel;
	}
	
	/**
	 * 处理发送宽带密码错误消息
	* @date: 2017-3-11 
	* @author: tangaq
	* @title: settleSendBroadbandPasswordMsg 
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void settleSendBroadbandPasswordMsg(Map<String,Object> tempInParam,MarketCaseCachePojo marketCaseCachePojo) throws StrategyError{
		log.info("show settleSendBroadbandPasswordMsg", tempInParam);
		Map<String,Object> marketCaseMap =  marketCaseCachePojo.getMarketCaseMap();
		Map<String,Object> tempParam = new HashMap<String,Object>();
		tempParam.put("beginDate",DateUtil.DateToString(new Date(),  DateUtil.TIME_FROMAT_SIMPLE1));
		Map<String,Object> marketCaseRelMap = (Map<String,Object>)(marketCaseCachePojo.getMarketCaseRel()).get(Const.COMPONENT_TYPE_MARKETCASE);
		Map<String,Object> channelRelMap = marketCase.getChannelIdFromMarketCaseRel(tempInParam,marketCaseRelMap);
		for(Map.Entry<String, Object> chEntry : channelRelMap.entrySet()){
			String channelId = chEntry.getKey();
			tempParam.put("channelId", channelId);
			Map<String,Object> positionRelMap = (Map<String,Object>)((Map<String,Object>)channelRelMap.get(channelId)).get(Const.COMPONENT_TYPE_POSITION);
			log.info("positionRelMap", positionRelMap);
			for(Map.Entry<String, Object> poEntry : positionRelMap.entrySet()){
				String positionId = poEntry.getKey();
				tempParam.put("positionId", positionId);
				log.info("show positionId", positionId);
				List<String> contentIdList = (List<String>)((Map<String,Object>)positionRelMap.get(positionId)).get(Const.COMPONENT_TYPE_CONTENT);
				tempParam.put("contentId", contentIdList.get(0));
			}
		}
		
		String sendContent = "";
		if("0".equals(tempParam.get("routeUser"))){
			sendContent= (String)tempInParam.get("sendContent");
		}else{
			sendContent= (String)tempInParam.get("sendContentRoute");
		}
        
		Map<String,Object> userMap = this.getUserInfoByServiceNbr(tempInParam);
		
		tempParam.put("sendContent",sendContent);
		tempParam.put("marketingDescription",sendContent);
		tempParam.put("fromTel",tempInParam.get("flowCode"));
		String taskId = SequenceUtil.getSequence();
		tempParam.put("taskId", taskId);
		tempParam.put("seqId", taskId);
		tempParam.put("serviceNbr", tempInParam.get("mainNbr"));
		tempParam.put("actId", tempInParam.get("marketCaseId"));
		tempParam.put("actName", marketCaseMap.get("marketCaseName"));
		tempParam.putAll(marketCaseMap);
		tempParam.put("regionCode", userMap.get("userRegionCode"));
		//tempParam.put("regionCode", "0");
		tempParam.put("createTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));
		
		log.info("send ...", tempParam);
		batchPushSender.sendBatchPushMsg(tempParam);
	}
}
