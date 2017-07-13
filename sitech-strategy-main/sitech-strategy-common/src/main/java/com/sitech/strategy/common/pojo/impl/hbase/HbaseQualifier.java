package com.sitech.strategy.common.pojo.impl.hbase;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.hbase.IHbaseQualifier;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * hbase 限定符
* @date: 2017-1-13 
* @author: sunliang 
* @title: HbaseQualifier 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class HbaseQualifier extends BaseClass implements IHbaseQualifier,Serializable{
	/**
	 * 处理批量push内容参数
	* @date: 2016-10-18 
	* @author: sunliang 
	* @title: getBatchPushTaskQualifier 
	* @param tempInParam
	* @param contentDetailList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,String> getBatchPushTaskQualifier(Map<String,Object> tempInParam){
		
		Map<String,String> paramMap = new HashMap<String,String>();
		
		paramMap.put("PHONE_NO", CommonUtils.toString(tempInParam.get("phoneNo")));
		paramMap.put("CHANNEL_ID", (String)tempInParam.get("channelId"));
		paramMap.put("POSITION_ID", (String)tempInParam.get("positionId"));
		paramMap.put("SEQ_ID", (String)tempInParam.get("seqId"));
		paramMap.put("TASK_ID", (String)tempInParam.get("taskId"));
		paramMap.put("ACT_ID", (String)tempInParam.get("marketCaseId"));
		paramMap.put("ID_NO", (String)tempInParam.get("idNo"));
		paramMap.put("SERVICE_NBR", (String)tempInParam.get("serviceNbr"));
		paramMap.put("REGION_CODE", (String)tempInParam.get("regionCode"));
		paramMap.put("MARKET_CASE_NAME", (String)tempInParam.get("marketCaseName"));
		paramMap.put("END_TIME", (String)tempInParam.get("endTime"));
		paramMap.put("PRODUCT_COMMODITY_ID", (String)tempInParam.get("productCommodityId"));
		paramMap.put("MARKET_CASE_ID", (String)tempInParam.get("marketCaseId"));
		paramMap.put("CREATE_TIME", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));
		
		paramMap.put("BEGIN_DATE", CommonUtils.toString(tempInParam.get("beginDate")));
		paramMap.put("MARKETING_DESCRIPTION", CommonUtils.toString(tempInParam.get("marketingDescription")));
		paramMap.put("FROM_TEL", CommonUtils.toString(tempInParam.get("fromTel")));
		paramMap.put("SEND_CONTENT", CommonUtils.toString(tempInParam.get("sendContent")));
		return paramMap;
	}
	
	/** 插入push测试任务字段处理
	* @date: 2017-1-16 
	* @author: wangpei
	* @title: getBatchPushTaskVerifyQualifier 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, String> getBatchPushTaskVerifyQualifier(Map<String, Object> tempInParam) {
		Map<String, String> param = new HashMap<String, String>();
		param.put("PHONE_NO", (String) tempInParam.get("phoneNo"));
		param.put("MSG", (String) tempInParam.get("msg"));
		param.put("MARKET_CASE_ID", (String) tempInParam.get("marketCaseId"));
		param.put("TASK_TYPE", Const.TASK_TYPE_VERIFY);
		param.put("CREATE_TIME", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));
		return param;
	}
	
	/** 插入事件任务字段处理
	* @date: 2017-1-16 
	* @author: wangpei
	* @title: getEventTaskQualifier 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, String> getEventTaskQualifier(Map<String, Object> tempInParam) {
		Map<String,String> param = new HashMap<String, String>();
		param.put("PHONE_NO", (String) tempInParam.get("phoneNo"));
		param.put("MSG", (String) tempInParam.get("msg"));
		param.put("END_TIME", (String) tempInParam.get("endTime"));
		param.put("MARKET_CASE_ID", (String) tempInParam.get("marketCaseId"));
		param.put("PRODUCT_COMMODITY_ID", (String) tempInParam.get("productCommodityId"));
		param.put("TASK_TYPE", Const.TASK_TYPE_EVENT);
		param.put("CREATE_TIME", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));
		return param;
	}

	/** 组装hbase渠道任务表字段信息
	* @date: 2017-1-16 
	* @author: wangpei
	* @title: getRmChannelTaskInfoQualifier 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, String> getRmChannelTaskInfoQualifier(Map<String, Object> tempInParam) throws StrategyError {
		Map<String,String> paramMap = new HashMap<String,String>();
		Map<String,Object> MarketCaseBasicMap = (Map<String,Object>)tempInParam.get("marketCaseBasicMap");
		Map<String,Object> userMsgMap = (Map<String,Object>)tempInParam.get("userMsgMap");
		CommonUtils.mapValueIsNullRep(MarketCaseBasicMap);
		CommonUtils.mapValueIsNullRep(tempInParam);
		CommonUtils.mapValueIsNullRep(userMsgMap);
		if(CommonUtils.objectIsNull(tempInParam.get("taskId"))){
			paramMap.put("TASK_ID", "");
		}else{
			paramMap.put("TASK_ID", (String)tempInParam.get("taskId"));
		}
		if ("06".equals(tempInParam.get("channelId"))) {
			paramMap.put("STATUS_CODE", "00");
		}else{
			paramMap.put("STATUS_CODE", "04");
		}
		if(CommonUtils.objectIsNull(tempInParam.get("idNo"))){
			paramMap.put("ID_NO", "");
		}else{
			paramMap.put("ID_NO", (String)tempInParam.get("idNo"));
		}
		if(CommonUtils.objectIsNull(MarketCaseBasicMap.get("marketCaseId"))){
			paramMap.put("ACT_ID", "");
		}else{
			paramMap.put("ACT_ID", (String)MarketCaseBasicMap.get("marketCaseId"));
		}	
		if(CommonUtils.objectIsNull(MarketCaseBasicMap.get("marketCaseName"))){
			paramMap.put("ACT_NAME", "");
		}else{
			paramMap.put("ACT_NAME", (String)MarketCaseBasicMap.get("marketCaseName"));
		}
		if(CommonUtils.objectIsNull(MarketCaseBasicMap.get("marketCaseType"))){
			paramMap.put("ACT_TYPE", "");
		}else{
			paramMap.put("ACT_TYPE", (String)MarketCaseBasicMap.get("marketCaseType"));
		}
		if(CommonUtils.objectIsNull((String)MarketCaseBasicMap.get("marketCaseBusiType"))){
			paramMap.put("BUSI_TYPE", "");
		}else{
			paramMap.put("BUSI_TYPE", (String)MarketCaseBasicMap.get("marketCaseBusiType"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("contactNbr"))){
			paramMap.put("CONTACT_NBR", "");
		}else{
			paramMap.put("CONTACT_NBR", (String)userMsgMap.get("contactNbr"));
		}
		paramMap.put("CREATE_SEQ", (String)tempInParam.get("createSeq"));
		paramMap.put("CREATE_TIME", DateUtil.DateToString(new Date(),DateUtil.TIME_FROMAT_SIMPLE1));
		if(CommonUtils.objectIsNull(tempInParam.get("callType"))){
			paramMap.put("CALL_FLAG", "");
		}else{
			paramMap.put("CALL_FLAG", (String)tempInParam.get("callType"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("custGroupId"))){
			paramMap.put("CUST_GROUP_ID", "");
		}else{
			paramMap.put("CUST_GROUP_ID", (String)tempInParam.get("custGroupId"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("custName"))){
			paramMap.put("CUST_NAME", "");
		}else{
			paramMap.put("CUST_NAME", (String)userMsgMap.get("custName"));
		}
		if(CommonUtils.objectIsNull(MarketCaseBasicMap.get("marketCaseDesc"))){
			paramMap.put("ACT_DESC", "");
		}else{
			paramMap.put("ACT_DESC", (String)MarketCaseBasicMap.get("marketCaseDesc"));
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
		
		if(CommonUtils.objectIsNull(userMsgMap.get("prdInstId"))){
			paramMap.put("PRD_INST_ID", "");
		}else{
			paramMap.put("PRD_INST_ID", (String)userMsgMap.get("prdInstId"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("custId"))){
			paramMap.put("CUST_ID", "");
		}else{
			paramMap.put("CUST_ID", (String)userMsgMap.get("custId"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("acctId"))){
			paramMap.put("ACCT_ID", "");
		}else{
			paramMap.put("ACCT_ID", (String)userMsgMap.get("acctId"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("regionCode"))){
			paramMap.put("REGION_CODE", "");
		}else{
			paramMap.put("REGION_CODE", (String)userMsgMap.get("regionCode"));
		}
		if(CommonUtils.objectIsNull((String)userMsgMap.get("serviceNbr"))){
			paramMap.put("SERVICE_NBR", "");
		}else{
			paramMap.put("SERVICE_NBR", (String)userMsgMap.get("serviceNbr"));
		}
		if(CommonUtils.objectIsNull((String)userMsgMap.get("edwDeptId"))){
			paramMap.put("EDW_DEPT_ID", "");
		}else{
			paramMap.put("EDW_DEPT_ID", (String)userMsgMap.get("edwDeptId"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("smName"))){
			paramMap.put("SM_NAME", "");
		}else{
			paramMap.put("SM_NAME", (String)userMsgMap.get("smName"));
		}
		if(CommonUtils.objectIsNull(MarketCaseBasicMap.get("startTime"))){
			paramMap.put("START_DATE", "");
		}else{
			paramMap.put("START_DATE", (String)MarketCaseBasicMap.get("startTime"));
		}
		if(CommonUtils.objectIsNull(MarketCaseBasicMap.get("endTime"))){
			paramMap.put("END_DATE", "");
		}else{
			paramMap.put("END_DATE", (String)MarketCaseBasicMap.get("endTime"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("isnt4gcard"))){
			paramMap.put("ISNT_4GCARD", "");
		}else{
			paramMap.put("ISNT_4GCARD", (String)userMsgMap.get("isnt4gcard"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("taskExectorNo"))){
			paramMap.put("SERVICE_NO", "-1");
		}else{
			paramMap.put("SERVICE_NO", (String)tempInParam.get("taskExectorNo"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("taskExectorName"))){
			paramMap.put("SERVICE_NAME", "");
		}else{
			paramMap.put("SERVICE_NAME", (String)tempInParam.get("taskExectorName"));
		}
		paramMap.put("STATUS_NAME", "");
		if(CommonUtils.objectIsNull(userMsgMap.get("photoFlag"))){
			paramMap.put("PHOTO_FLAG", "");
		}else{
			paramMap.put("PHOTO_FLAG", (String)userMsgMap.get("photoFlag"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("custGrade"))){
			paramMap.put("CUST_GRADE", "");
		}else{
			paramMap.put("CUST_GRADE", (String)userMsgMap.get("custGrade"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("enjoyFlag"))){
			paramMap.put("ENJOY_FLAG", "");
		}else{
			paramMap.put("ENJOY_FLAG", (String)userMsgMap.get("enjoyFlag"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("bindFlag"))){
			paramMap.put("BIND_FLAG", "");
		}else{
			paramMap.put("BIND_FLAG", (String)userMsgMap.get("bindFlag"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("riskFlag"))){
			paramMap.put("RISK_FLAG", "");
		}else{
			paramMap.put("RISK_FLAG", (String)userMsgMap.get("riskFlag"));
		}
		paramMap.put("NOTE", "");
		if(CommonUtils.objectIsNull(userMsgMap.get("mktAreaName"))){
			paramMap.put("MKT_AREA_NAME", "");
		}else{
			paramMap.put("MKT_AREA_NAME", (String)userMsgMap.get("mktAreaName"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("deptName"))){
			paramMap.put("DEPT_NAME", "");
		}else{
			paramMap.put("DEPT_NAME", (String)userMsgMap.get("deptName"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("deptCode"))){
			paramMap.put("DEPT_CODE", "");
		}else{
			paramMap.put("DEPT_CODE", (String)userMsgMap.get("deptCode"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("dutyZoneName"))){
			paramMap.put("DUTY_ZONE_NAME", "");
		}else{
			paramMap.put("DUTY_ZONE_NAME", (String)userMsgMap.get("dutyZoneName"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("gridName"))){
			paramMap.put("GRID_NAME", "");
		}else{
			paramMap.put("GRID_NAME", (String)userMsgMap.get("gridName"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("gridCode"))){
			paramMap.put("GRID_CODE", "");
		}else{
			paramMap.put("GRID_CODE", (String)userMsgMap.get("gridCode"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("gridId"))){
			paramMap.put("GRID_ID", "");
		}else{
			paramMap.put("GRID_ID", (String)userMsgMap.get("gridId"));
		}
		return paramMap;
	}

	/** 获取批量任务查询限定字段
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: getSelectBatchPushTaskByIdQualifier 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Set<String> getSelectBatchPushTaskByIdQualifier() {
		Set<String> set = new HashSet<String>();
		set.add("ACT_ID");
		set.add("BEGIN_DATE");
		set.add("CHANNEL_ID");
		set.add("CREATE_TIME");
		set.add("END_TIME");
		set.add("FROM_TEL");
		set.add("MARKETING_DESCRIPTION");
		set.add("MARKET_CASE_ID");
		set.add("MARKET_CASE_NAME");
		set.add("PHONE_NO");
		set.add("POSITION_ID");
		set.add("ID_NO");
		set.add("PRODUCT_COMMODITY_ID");
		set.add("REGION_CODE");
		set.add("SEND_CONTENT");
		set.add("SEQ_ID");
		set.add("SERVICE_NBR");
		set.add("TASK_ID");
		return set;
	}

	/**
	 * 增加用户接触记录表限定符处理
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getAddContactRecordQualifier 
	* @param inParam
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, String> getAddContactRecordQualifier(Map<String,Object> inParam,Map<String,Object> tempInParam) {
		Map<String,String> param = new HashMap<String, String>();
		param.put("SEQ_ID", (String) CommonUtils.replaceNull(inParam.get("seqId")));
		param.put("ID_NO", (String) CommonUtils.replaceNull(tempInParam.get("idNo")));
		param.put("REGION_CODE", (String) CommonUtils.replaceNull(inParam.get("regionCode")));
		param.put("CHANNEL_ID", (String) CommonUtils.replaceNull(inParam.get("channelId")));
		param.put("OPER_NO", (String) CommonUtils.replaceNull(inParam.get("operNo")));
		param.put("OPER_NAME", (String) CommonUtils.replaceNull(inParam.get("operName")));
		param.put("NUM_TYPE", (String) CommonUtils.replaceNull(inParam.get("numType")));
		param.put("NUM_VALUE", (String) CommonUtils.replaceNull(inParam.get("numValue")));
		param.put("CONTACT_TIME", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
		return param;
	}

	/**
	 * 
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getInsertRecommendRecordQualifier 
	* @param inParam
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, String> getInsertRecommendRecordQualifier(
			Map<String, Object> inParam, Map<String, Object> tempInParam) {
		Map<String,String> outParam = new HashMap<String,String>();
		outParam.put("MARKET_CASE_ID", (String)tempInParam.get("marketCaseId"));
		outParam.put("RECOMMONED_TIME", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
		outParam.put("POSITION_ID",  (String)tempInParam.get("positionId"));
		outParam.put("REGION_CODE",  (String)tempInParam.get("regionCode"));
		outParam.put("CHANNEL_ID",  (String)tempInParam.get("channelId"));
		outParam.put("ID_NO",  (String)tempInParam.get("idNo"));
		outParam.put("NUM_TYPE",  (String)tempInParam.get("numType"));
		outParam.put("NUM_VALUE",  (String)tempInParam.get("numValue"));
		outParam.put("OPER_NO",  (String)tempInParam.get("operNo"));
		outParam.put("OPER_NAME",  (String)tempInParam.get("operName"));
		return outParam;
	}
	
	/**
	 * 
	* @date: 2017-3-31 
	* @author: sunyuan
	* @title: getInsertUserAcceptMarketCaseQualifier 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,String> getInsertUserAcceptMarketCaseQualifier(Map<String,Object> tempInParam){
		Map<String,String> outParam = new HashMap<String,String>();
		outParam.put("MARKET_CASE_ID", (String)tempInParam.get("marketCaseId"));
		outParam.put("ID_NO",  (String)tempInParam.get("idNo"));
		outParam.put("ACCEPT_TIME", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
		return outParam;
	}
	
	/**
	 * 
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getInsertUserRecommendControlQualifier 
	* @param inParam
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, String> getInsertUserRecommendControlQualifier(
			Map<String, Object> inParam, Map<String, Object> tempInParam) {
		Map<String, String> param = new HashMap<String, String>();
//		param.put("FIRST_RECOMMEND_TIME", (String)tempInParam.get("firstRecommendTime"));
//		param.put("FORWARD_RECOMMEND_TIME", (String)tempInParam.get("forwardRecommendTime"));
//		param.put("RECOMMEND_COUNT", (String)tempInParam.get("recommendCount"));
		param.put("ID_NO", (String)tempInParam.get("idNo"));
		param.put("BATCH_NO", (String)tempInParam.get("batchNo"));
		param.put("RECOMMEND_TIME", (String)tempInParam.get("recommendTime"));
		return param;
	}

	/** 
	* @date: 2017-2-13 
	* @author: wangpei
	* @title: getInsertUserRecommendControlByChannelQualifier 
	* @param inParam
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, String> getInsertUserRecommendControlByChannelQualifier(
			Map<String, Object> inParam, Map<String, Object> tempInParam) {
		Map<String, String> param = new HashMap<String, String>();
		param.put("FIRST_RECOMMEND_TIME", (String)tempInParam.get("firstRecommendTime"));
		param.put("FORWARD_RECOMMEND_TIME", (String)tempInParam.get("forwardRecommendTime"));
		param.put("RECOMMEND_COUNT", (String)tempInParam.get("recommendCount"));
		param.put("COUNT", (String) tempInParam.get("count"));
		param.put("DAY_COUNT", (String) tempInParam.get("dayCount"));
		return param;
	}
	
	/**
	 * 
	* @date: 2017-4-10 
	* @author: sunyuan
	* @title: getInsertUserRecommendMarketCaseQualifier 
	* @param inParam
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, String> getInsertUserRecommendMarketCaseQualifier(
			Map<String, Object> inParam, Map<String, Object> tempInParam) {
		Map<String, String> param = new HashMap<String, String>();
		param.put("ID_NO", (String) tempInParam.get("idNo"));
		param.put("MARKET_CASE_ID", (String)tempInParam.get("marketCaseId"));
		param.put("PHONE_NO", (String)tempInParam.get("phoneNo"));
		param.put("RECOMMEND_TIME", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
		return param;
	}
	
}
