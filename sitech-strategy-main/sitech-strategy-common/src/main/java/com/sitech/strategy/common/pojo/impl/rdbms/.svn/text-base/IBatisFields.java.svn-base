package com.sitech.strategy.common.pojo.impl.rdbms;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.rdbms.IIBatisFields;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.MD5RowKeyGenerator;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * Create on 2017-2-27
 * @author: wangpei
 * @Title:IBatisFields
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class IBatisFields extends BaseClass implements IIBatisFields,Serializable{

	/** 组装渠道任务字段
	* @date: 2017-2-27 
	* @author: wangpei
	* @title: getRmChannelTaskInfoFields 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> getRmChannelTaskInfoFields(Map<String, Object> tempInParam) throws StrategyError {
		Map<String,Object> paramMap = new HashMap<String,Object>();
		Map<String,Object> MarketCaseBasicMap = (Map<String,Object>)tempInParam.get("marketCaseBasicMap");
		Map<String,Object> userMsgMap = (Map<String,Object>)tempInParam.get("userMsgMap");
		CommonUtils.mapValueIsNullRep(MarketCaseBasicMap);
		CommonUtils.mapValueIsNullRep(tempInParam);
		CommonUtils.mapValueIsNullRep(userMsgMap);
		paramMap.put("key", MD5RowKeyGenerator.generatePrefix((String) tempInParam.get("taskId"))+Const.SEPARATOR_COLON+(String) tempInParam.get("taskId"));
		if(CommonUtils.objectIsNull(tempInParam.get("taskId"))){
			paramMap.put("taskId", "");
		}else{
			paramMap.put("taskId", (String)tempInParam.get("taskId"));
		}
		paramMap.put("statusCode", "04");
		if(CommonUtils.objectIsNull(tempInParam.get("idNo"))){
			paramMap.put("idNo", "");
		}else{
			paramMap.put("idNo", (String)tempInParam.get("idNo"));
		}
		if(CommonUtils.objectIsNull(MarketCaseBasicMap.get("marketCaseId"))){
			paramMap.put("actId", "");
		}else{
			paramMap.put("actId", (String)MarketCaseBasicMap.get("marketCaseId"));
		}	
		if(CommonUtils.objectIsNull(MarketCaseBasicMap.get("marketCaseName"))){
			paramMap.put("actName", "");
		}else{
			paramMap.put("actName", (String)MarketCaseBasicMap.get("marketCaseName"));
		}
		if(CommonUtils.objectIsNull(MarketCaseBasicMap.get("marketCaseType"))){
			paramMap.put("actType", "");
		}else{
			paramMap.put("actType", (String)MarketCaseBasicMap.get("marketCaseType"));
		}
		if(CommonUtils.objectIsNull((String)MarketCaseBasicMap.get("marketCaseBusiType"))){
			paramMap.put("busiType", "");
		}else{
			paramMap.put("busiType", (String)MarketCaseBasicMap.get("marketCaseBusiType"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("contactNbr"))){
			paramMap.put("contactNbr", "");
		}else{
			paramMap.put("contactNbr", (String)userMsgMap.get("contactNbr"));
		}
		paramMap.put("createSeq", (String)tempInParam.get("createSeq"));
		paramMap.put("createTime", DateUtil.DateToString(new Date(),DateUtil.TIME_FROMAT_SIMPLE1));
		if(CommonUtils.objectIsNull(tempInParam.get("callType"))){
			paramMap.put("callFlag", "");
		}else{
			paramMap.put("callFlag", (String)tempInParam.get("callType"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("custGroupId"))){
			paramMap.put("custGroupId", "");
		}else{
			paramMap.put("custGroupId", (String)tempInParam.get("custGroupId"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("custName"))){
			paramMap.put("custName", "");
		}else{
			paramMap.put("custName", (String)userMsgMap.get("custName"));
		}
		if(CommonUtils.objectIsNull(MarketCaseBasicMap.get("marketCaseDesc"))){
			paramMap.put("actDesc", "");
		}else{
			paramMap.put("actDesc", (String)MarketCaseBasicMap.get("marketCaseDesc"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("channelId"))){
			paramMap.put("channelId", "");
		}else{
			paramMap.put("channelId", (String)tempInParam.get("channelId"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("positionId"))){
			paramMap.put("positionId", "");
		}else{
			paramMap.put("positionId", (String)tempInParam.get("positionId"));
		}
		
		if(CommonUtils.objectIsNull(userMsgMap.get("prdInstId"))){
			paramMap.put("prdInstId", "");
		}else{
			paramMap.put("prdInstId", (String)userMsgMap.get("prdInstId"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("custId"))){
			paramMap.put("custId", "");
		}else{
			paramMap.put("custId", (String)userMsgMap.get("custId"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("acctId"))){
			paramMap.put("acctId", "");
		}else{
			paramMap.put("acctId", (String)userMsgMap.get("acctId"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("regionCode"))){
			paramMap.put("regionCode", "");
		}else{
			paramMap.put("regionCode", (String)userMsgMap.get("regionCode"));
		}
		if(CommonUtils.objectIsNull((String)userMsgMap.get("serviceNbr"))){
			paramMap.put("serviceNbr", "");
		}else{
			paramMap.put("serviceNbr", (String)userMsgMap.get("serviceNbr"));
		}
		if(CommonUtils.objectIsNull((String)userMsgMap.get("edwDeptId"))){
			paramMap.put("edwDeptId", "");
		}else{
			paramMap.put("edwDeptId", (String)userMsgMap.get("edwDeptId"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("smName"))){
			paramMap.put("smName", "");
		}else{
			paramMap.put("smName", (String)userMsgMap.get("smName"));
		}
		if(CommonUtils.objectIsNull(MarketCaseBasicMap.get("startTime"))){
			paramMap.put("startDate", "");
		}else{
			paramMap.put("startDate", (String)MarketCaseBasicMap.get("startTime"));
		}
		if(CommonUtils.objectIsNull(MarketCaseBasicMap.get("endTime"))){
			paramMap.put("endDate", "");
		}else{
			paramMap.put("endDate", (String)MarketCaseBasicMap.get("endTime"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("isnt4gcard"))){
			paramMap.put("isnt4gcard", "");
		}else{
			paramMap.put("isnt4gcard", (String)userMsgMap.get("isnt4gcard"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("taskExectorNo"))){
			paramMap.put("serviceNo", "-1");
		}else{
			paramMap.put("serviceNo", (String)tempInParam.get("taskExectorNo"));
		}
		if(CommonUtils.objectIsNull(tempInParam.get("taskExectorName"))){
			paramMap.put("serviceName", "");
		}else{
			paramMap.put("serviceName", (String)tempInParam.get("taskExectorName"));
		}
		paramMap.put("statusName", "");
		if(CommonUtils.objectIsNull(userMsgMap.get("photoFlag"))){
			paramMap.put("photoFlag", "");
		}else{
			paramMap.put("photoFlag", (String)userMsgMap.get("photoFlag"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("custGrade"))){
			paramMap.put("custGrade", "");
		}else{
			paramMap.put("custGrade", (String)userMsgMap.get("custGrade"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("enjoyFlag"))){
			paramMap.put("enjoyFlag", "");
		}else{
			paramMap.put("enjoyFlag", (String)userMsgMap.get("enjoyFlag"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("bindFlag"))){
			paramMap.put("bindFlag", "");
		}else{
			paramMap.put("bindFlag", (String)userMsgMap.get("bindFlag"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("riskFlag"))){
			paramMap.put("riskFlag", "");
		}else{
			paramMap.put("riskFlag", (String)userMsgMap.get("riskFlag"));
		}
		paramMap.put("note", "");
		if(CommonUtils.objectIsNull(userMsgMap.get("mktAreaName"))){
			paramMap.put("mktAreaName", "");
		}else{
			paramMap.put("mktAreaName", (String)userMsgMap.get("mktAreaName"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("deptName"))){
			paramMap.put("deptName", "");
		}else{
			paramMap.put("deptName", (String)userMsgMap.get("deptName"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("deptCode"))){
			paramMap.put("deptCode", "");
		}else{
			paramMap.put("deptCode", (String)userMsgMap.get("deptCode"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("dutyZoneName"))){
			paramMap.put("dutyZoneName", "");
		}else{
			paramMap.put("dutyZoneName", (String)userMsgMap.get("dutyZoneName"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("gridName"))){
			paramMap.put("gridName", "");
		}else{
			paramMap.put("gridName", (String)userMsgMap.get("gridName"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("gridCode"))){
			paramMap.put("gridCode", "");
		}else{
			paramMap.put("gridCode", (String)userMsgMap.get("gridCode"));
		}
		if(CommonUtils.objectIsNull(userMsgMap.get("gridId"))){
			paramMap.put("gridId", "");
		}else{
			paramMap.put("gridId", (String)userMsgMap.get("gridId"));
		}
		return paramMap;
	}

}
