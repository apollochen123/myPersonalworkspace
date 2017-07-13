package com.sitech.strategy.common.pojo.impl.assemblymsgstructure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.assemblymsgstructure.IAssemblyMsgStructure;
import com.sitech.strategy.common.pojo.inter.route.IRoutePojo;
import com.sitech.strategy.common.pojo.inter.shortmsg.IShortMsgPojo;
import com.sitech.strategy.common.pojo.inter.topic.ITopic;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.common.utils.SequenceUtil;

/**
 * 组装消息结构
* @date: 2016-12-25 
* @author: sunliang 
* @title: AssemblyMsgStructureByKafka 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
* 2017-2-28 luogj 增加IShortMsgPojo、IRoutePojo注入，没有使用，只是为了满足接口注入
 */
public class AssemblyMsgStructureByKafka extends BaseClass implements
		IAssemblyMsgStructure , Serializable{

	/**
	 * 消息主题对象
	 */
	protected ITopic msgTopic;
	
	/**
	 * 短信pojo
	 * */
	private IShortMsgPojo shortMsgPojo;
	
	/**
	 * 路由pojo
	 * */
	private IRoutePojo routePojo;
	
	/**
	 * 
	* @date: 2017-2-28
	* @author: luogj
	* @title: setRoutePojo 
	* @param routePojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */	
	public void setRoutePojo(IRoutePojo routePojo) {
		this.routePojo = routePojo;
	}
	
	/**
	 * 
	* @date: 2017-2-28
	* @author: luogj
	* @title: setShortMsgPojo 
	* @param shortMsgPojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */	
	public void setShortMsgPojo(IShortMsgPojo shortMsgPojo) {
		this.shortMsgPojo = shortMsgPojo;
	}
	
	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: setMsgTopic 
	* @param msgTopic 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMsgTopic(ITopic msgTopic) {
		this.msgTopic = msgTopic;
	}

	/**
	 * 获取批量push业务消息结构
	* @date: 2016-12-25 
	* @author: sunliang 
	* @title: getBatchPushMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getBatchPushMsgStructure(
			Map<String, Object> tempInParam) {
		String sysTime = DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1);	
		String beginDate = (String)tempInParam.get("beginDate");
		String endDate = DateUtil.DateToString(DateUtil.addDays(new Date(), 2), DateUtil.TIME_FROMAT_SIMPLE1);

		Map<String,Object> routingParamMap = new HashMap<String,Object>();
		routingParamMap.put("ROUTE_KEY", "1");
		routingParamMap.put("ROUTE_VALUE", "1");
		
		Map<String,Object> routingMap = new HashMap<String,Object>();
		routingMap.put("ROUTING", routingParamMap);
		
		Map<String,Object> commonMap = new HashMap<String,Object>();
		commonMap.put("BUSI_APP_ID", "1");
		commonMap.put("SYSTEM_ID", "SYSTEM_04");
		
		Map<String,Object> bodyMap = new HashMap<String,Object>();
		bodyMap.put("HEADER", routingMap);
		bodyMap.put("COMMON_INFO", commonMap);
		
		bodyMap.put("TITLE_TYPE", "1002");
		bodyMap.put("CHANNEL_ID", (String)tempInParam.get("channelId"));
		bodyMap.put("POSITION_ID", (String)tempInParam.get("positionId"));
		bodyMap.put("SEQ_ID", (String)tempInParam.get("seqId"));
		bodyMap.put("TASK_ID", (String)tempInParam.get("taskId"));
		bodyMap.put("ACT_ID", (String)tempInParam.get("actId"));
		bodyMap.put("SERVICE_NBR", (String)tempInParam.get("serviceNbr"));
		bodyMap.put("REGION_CODE", (String)tempInParam.get("regionCode"));
		bodyMap.put("ACT_NAME", (String)tempInParam.get("marketCaseName"));
		bodyMap.put("MARKETING_DESCRIPTION", (String)tempInParam.get("marketingDescription"));
		bodyMap.put("CREATE_TIME", sysTime);
		bodyMap.put("BEGIN_DATE", beginDate);
		bodyMap.put("END_DATE", endDate);
		bodyMap.put("GET_TIME", sysTime);
		bodyMap.put("SEND_CONTENT", (String)tempInParam.get("sendContent"));
		bodyMap.put("FROM_TEL", (String)tempInParam.get("fromTel"));
		bodyMap.put("FLOW_CODE", "5350" + (String)tempInParam.get("seqId"));
		bodyMap.put("GET_FLAG", "1");
		bodyMap.put("PARAMS", "");
		bodyMap.put("SENTTYPE", "1");
		bodyMap.put("RESERVE", "ln");
		bodyMap.put("BUSINESS_ID", "5350");
		
		Map<String,Object> map = new HashMap<String,Object>();
		Map<String,Object> rootMap = new HashMap<String,Object>();
		rootMap.put("BODY", bodyMap);
		map.put("ROOT", rootMap);
		
		Map<String,Object> retMap = new HashMap<String,Object>();
		retMap.put("topic", msgTopic.getProducerTopicMessagepush());
		retMap.put("message", JsonUtil.objectToJsonStr(map));
		
		return retMap;
	}

	/** 获取渠道任务推送消息结构
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: getChannelTaskMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> getChannelTaskMsgStructure(
			Map<String, Object> tempInParam) {
		Map<String,Object> paramMap = new HashMap<String, Object>();
		if(CommonUtils.objectIsNull(tempInParam.get("taskId"))){
			paramMap.put("TASK_ID", "");
		}else{
			paramMap.put("TASK_ID", (String)tempInParam.get("taskId"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("actId"))){
			paramMap.put("ACT_ID", "");
		}else{
			paramMap.put("ACT_ID", (String)tempInParam.get("actId"));
		}	
		if(CommonUtils.objectIsNull(tempInParam.get("custGroupId"))){
			paramMap.put("CUST_GROUP_ID", "");
		}else{
			paramMap.put("CUST_GROUP_ID", (String)tempInParam.get("custGroupId"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("actName"))){
			paramMap.put("ACT_NAME", "");
		}else{
			paramMap.put("ACT_NAME", (String)tempInParam.get("actName"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("actType"))){
			paramMap.put("ACT_TYPE", "");
		}else{
			paramMap.put("ACT_TYPE", (String)tempInParam.get("actType"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("channelId"))){
			paramMap.put("CHANNEL_ID", "");
		}else{
			paramMap.put("CHANNEL_ID", (String)tempInParam.get("channelId"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("positionId"))){
			paramMap.put("POSITION_ID", "");
		}else{
			paramMap.put("POSITION_ID", (String)tempInParam.get("positionId"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("custName"))){
			paramMap.put("CUST_NAME", "");
		}else{
			paramMap.put("CUST_NAME", (String)tempInParam.get("custName"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("idNo"))){
			paramMap.put("ID_NO", "");
		}else{
			paramMap.put("ID_NO", (String)tempInParam.get("idNo"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("custId"))){
			paramMap.put("CUST_ID", "");
		}else{
			paramMap.put("CUST_ID", (String)tempInParam.get("custId"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("acctId"))){
			paramMap.put("ACCT_ID", "");
		}else{
			paramMap.put("ACCT_ID", (String)tempInParam.get("acctId"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("contactNbr"))){
			paramMap.put("CONTACT_NBR", "");
		}else{
			paramMap.put("CONTACT_NBR", (String)tempInParam.get("contactNbr"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("regionCode"))){
			paramMap.put("REGION_CODE", "");
		}else{
			paramMap.put("REGION_CODE", (String)tempInParam.get("regionCode"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("serviceNbr"))){
			paramMap.put("SERVICE_NBR", "");
		}else{
			paramMap.put("SERVICE_NBR", (String)tempInParam.get("serviceNbr"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("startDate"))){
			paramMap.put("START_DATE", "");
		}else{
			paramMap.put("START_DATE", (String)tempInParam.get("startDate"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("endDate"))){
			paramMap.put("END_DATE", "");
		}else{
			paramMap.put("END_DATE", (String)tempInParam.get("endDate"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("callFlag"))){
			paramMap.put("CALL_FLAG", "");
		}else{
			paramMap.put("CALL_FLAG", (String)tempInParam.get("callFlag"));
		}
		paramMap.put("TITLE_TYPE", "1001");
		Map<String,Object> common = new HashMap<String, Object>();
		common.put("SYSTEM_ID", "");
		paramMap.put("COMMON_INFO", common);
		Map<String,Object> root = new HashMap<String, Object>();
		root.put("BODY", paramMap);
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("ROOT", root);
		Map<String,Object> message = new HashMap<String, Object>();
		message.put("topic", msgTopic.getProducerTopicTasksyn());
		message.put("message", JsonUtil.objectToJsonStr(param));
		return message;
	}

	/** 获取渠道任务关闭推送消息结构
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: getChannelTaskCloseMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> getChannelTaskCloseMsgStructure(Map<String, Object> tempInParam) {
		Map<String,Object> root = new HashMap<String, Object>();
		Map<String,Object> body = new HashMap<String, Object>();
		Map<String,Object> position = new HashMap<String, Object>();
		List<Map<String,Object>> positionList = new ArrayList<Map<String,Object>>();
		position.put("POSITION_ID", "POSITION_06_01");
		position.put("TASK_ID", "");
		position.put("ACT_ID", tempInParam.get("actId"));
		position.put("SERVICE_NBR", tempInParam.get("serviceNbr"));
		position.put("ID_NO", tempInParam.get("idNo"));
		positionList.add(position);
		body.put("REGION_CODE", tempInParam.get("regionCode"));
		body.put("CHANNEL_ID", tempInParam.get("channelId"));
		body.put("TITLE_TYPE", "1002");
		body.put("OPER_TYPE", "1001");
		body.put("POSITION_INFO_LIST", positionList);
		root.put("BODY", body);
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("ROOT", root);
		Map<String,Object> message = new HashMap<String, Object>();
		message.put("topic", msgTopic.getProducerTopicTasksyn());
		message.put("message", JsonUtil.objectToJsonStr(param));
		return message;
	}
	
	/** 获取渠道任务通知短信消息结构
	* @date: 2017-3-10 
	* @author: wangpei
	* @title: getChannelTaskNoticeMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> getChannelTaskNoticeMsgStructure(Map<String, Object> tempInParam) {
		String sysTime = DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1);	
		String endDate = DateUtil.DateToString(DateUtil.addDays(new Date(), 2), DateUtil.TIME_FROMAT_SIMPLE1);

		Map<String,Object> routingParamMap = new HashMap<String,Object>();
		routingParamMap.put("ROUTE_KEY", "1");
		routingParamMap.put("ROUTE_VALUE", "1");
		
		Map<String,Object> routingMap = new HashMap<String,Object>();
		routingMap.put("ROUTING", routingParamMap);
		
		Map<String,Object> commonMap = new HashMap<String,Object>();
		commonMap.put("BUSI_APP_ID", "1");
		commonMap.put("SYSTEM_ID", "SYSTEM_04");
		String loginNo = (String) tempInParam.get("loginNo");
		String loginName = (String) tempInParam.get("loginName");
		String marketCaseName = (String) tempInParam.get("marketCaseName");
		String serviceNbr = (String) tempInParam.get("serviceNbr");
		String sendContent = loginName+"["+loginNo+"]您好,网厅实时商机单："+marketCaseName+"，商机用户("+serviceNbr+")派单到您工位，请及时处理!";
		Map<String,Object> bodyMap = new HashMap<String,Object>();
		bodyMap.put("HEADER", routingMap);
		bodyMap.put("COMMON_INFO", commonMap);
		String seq = SequenceUtil.getSequence();
		bodyMap.put("TITLE_TYPE", "1002");
		bodyMap.put("CHANNEL_ID", "04");
		bodyMap.put("POSITION_ID", "");
		bodyMap.put("SEQ_ID", seq);
		bodyMap.put("TASK_ID", "");
		bodyMap.put("ACT_ID", (String)tempInParam.get("marketCaseId"));
		bodyMap.put("SERVICE_NBR", (String)tempInParam.get("phoneNo"));
		bodyMap.put("REGION_CODE", (String)tempInParam.get("regionCode"));
		bodyMap.put("ACT_NAME", marketCaseName);
		bodyMap.put("MARKETING_DESCRIPTION",sendContent);
		bodyMap.put("CREATE_TIME", sysTime);
		bodyMap.put("BEGIN_DATE", sysTime);
		bodyMap.put("END_DATE", endDate);
		bodyMap.put("GET_TIME", sysTime);
		bodyMap.put("SEND_CONTENT", sendContent);
		bodyMap.put("FROM_TEL", "2226");
		bodyMap.put("FLOW_CODE", "5350" + seq);
		bodyMap.put("GET_FLAG", "1");
		bodyMap.put("PARAMS", "");
		bodyMap.put("SENTTYPE", "1");
		bodyMap.put("RESERVE", "ln");
		bodyMap.put("BUSINESS_ID", "5350");
		
		Map<String,Object> map = new HashMap<String,Object>();
		Map<String,Object> rootMap = new HashMap<String,Object>();
		rootMap.put("BODY", bodyMap);
		map.put("ROOT", rootMap);
		
		Map<String,Object> retMap = new HashMap<String,Object>();
		retMap.put("topic", msgTopic.getProducerTopicMessagepush());
		retMap.put("message", JsonUtil.objectToJsonStr(map));
		return retMap;
	}

	/** 获取集团短信消息结构
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: getGroupMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> getGroupMsgStructure(Map<String, Object> tempInParam) {
		Map<String,Object> inParam = (Map<String,Object>)tempInParam.get("inParam");
		Map<String,Object> root = (Map<String,Object>)inParam.get("ROOT");
		Map<String,Object> body = (Map<String,Object>)root.get("BODY");
		Map<String,Object> params = (Map<String,Object>)body.get("PARAMS");
		params.put("subChannel", tempInParam.get("result"));
		Map<String,Object> msgMap = new HashMap<String,Object>();
		Map<String,Object> retMap = new HashMap<String,Object>();
		retMap.put("message", JsonUtil.objectToJsonStr(inParam));
		retMap.put("topic",msgTopic.getProducerTopicMessagepush());
		return retMap;
	}
	
	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: getSendGiveFeeMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-27 luogj 增加入参Map<String, Object> inParam, 
	 */
	@Override
	public String getSendGiveFeeMsgStructure(Map<String, Object> inParam, Map<String, Object> tempInParam) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: getSendGiveProdMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-27 luogj 改名，增加入参
	 */
	@Override
	public String getSendGiveProdMsgStructure(Map<String, Object> inParam, Map<String, Object> tempInParam) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 获取发送推荐短信消息结构
	* @date: 2017-2-27 
	* @author: sunliang 
	* @title: getSendRecommendMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-27 luogj 增加入参
	 */
	@Override
	public String getSendRecommendMsgStructure(Map<String, Object> inParam, Map<String, Object> tempInParam) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 获取事件触发推送消息结构
	* @date: 2017-2-21 
	* @author: sunyuan
	* @title: getSendTriggerMsgEventStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getSendTriggerMsgEventStructure(
			Map<String, Object> tempInParam) {
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("eventID", CommonUtils.objectIsNull(tempInParam.get("eventID"))?"":tempInParam.get("eventID"));
		param.put("idNo", CommonUtils.objectIsNull(tempInParam.get("idNo"))?"":tempInParam.get("idNo"));
		param.put("regionCode", CommonUtils.objectIsNull(tempInParam.get("regionCode"))?"":tempInParam.get("regionCode"));
		param.put("prodId", CommonUtils.objectIsNull(tempInParam.get("prodId"))?"":tempInParam.get("prodId"));
		param.put("queryDate", CommonUtils.objectIsNull(tempInParam.get("queryDate"))?"":tempInParam.get("queryDate"));
		param.put("oId", CommonUtils.objectIsNull(tempInParam.get("oId"))?"":tempInParam.get("oId"));
		Map<String,Object> retParam = new HashMap<String, Object>();
		retParam.put("message", JsonUtil.objectToJsonStr(param));
		retParam.put("topic", msgTopic.getProducerTopicTriggermsgevent());
		return retParam;
	}

}
