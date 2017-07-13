package com.sitech.strategy.manage.entity.param.impl;


import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;

import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IShortMessageManageParam;

/**
 * 短信参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: ShortMessageManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ShortMessageManageParam implements IShortMessageManageParam {
	
	/**
	 * 根据工号查询接入码列表入参处理 
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: queryAccessCodeListByLoginNoInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryAccessCodeListByLoginNoInParam(
			InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("serType", inMap.get("SER_TYPE")==null?"":inMap.get("SER_TYPE"));
		outMap.put("loginNo", inMap.get("LOGIN_NO"));
		return outMap;
	}

	/** 
	 * 根据工号查询接入码列表出参处理
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: queryAccessCodeListByLoginNoOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryAccessCodeListByLoginNoOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> accessCodeList = (List<Map<String,Object>>)outParam.get("accessCodeList");
		List<Map<String,Object>> accessCodeNotList = (List<Map<String,Object>>)outParam.get("accessCodeNotList");
		List<Map<String,Object>> accessCodeNewList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> accessCodeNewNotList = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(accessCodeNotList)){
			for(Map<String,Object> map :accessCodeNotList){
				Map<String,Object> noMap = new HashMap<String,Object>();
				noMap.put("ACCESS_CODE", (String)map.get("accessCode"));
				noMap.put("ACCESS_NAME", (String)map.get("accessName"));
				noMap.put("SER_NAME", (String)map.get("serName"));
				accessCodeNewNotList.add(noMap);
			}
		}
		if(!CommonUtils.objectIsNull(accessCodeList)){
			for(Map<String,Object> map :accessCodeList){
				Map<String,Object> noMap = new HashMap<String,Object>();
				noMap.put("ACCESS_CODE", (String)map.get("accessCode"));
				noMap.put("ACCESS_NAME", (String)map.get("accessName"));
				noMap.put("SER_NAME", (String)map.get("serName"));
				accessCodeNewList.add(noMap);
			}
		}
		outMap.put("ACCESS_CODE_LIST", accessCodeNewList);
		outMap.put("ACCESS_CODE_NOT_LIST", accessCodeNewNotList);
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/** 
	 * 查询接入码列表入参转换
	* @date: 2016-9-15 
	* @author: xiongxq
	* @Title: queryAccessCodeListInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryShortMessageAccessCodeListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_SMAC);
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("serName", inMap.get("SER_NAME") == null?"":inMap.get("SER_NAME"));
		outMap.put("serType", inMap.get("SER_TYPE") == null?"":inMap.get("SER_TYPE"));
		outMap.put("accessCode", inMap.get("ACCESS_CODE") == null?"":inMap.get("ACCESS_CODE"));
		outMap.put("accessName", inMap.get("ACCESS_NAME") == null?"":inMap.get("ACCESS_NAME"));
		outMap.put("startDate",inMap.get("START_DATE") == null?"":inMap.get("START_DATE"));
		outMap.put("endDate", inMap.get("END_DATE") == null?"":inMap.get("END_DATE"));
		outMap.put("note", inMap.get("NOTE") == null?"":inMap.get("NOTE"));
		outMap.put("statusCode", inMap.get("STATUS_CODE") == null?"":inMap.get("STATUS_CODE"));
		return outMap;
	}

	/** 
	 * 查询接入码列表出参转换
	* @date: 2016-9-15 
	* @author: xiongxq
	* @Title: queryAccessCodeListOutParam 
	* @param inMap
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryShortMessageAccessCodeListOutParam(Map<String, Object> outParam) {
		return settleShortMessageAccessCodeOutParams(outParam);
	}
	
	/**
	 * 根据日期查询短信推送流量入参处理
	* @date: 2016-10-30 
	* @author: fangyuan_crmpd
	* @title: queryShortMsgMoveTrafficByDateInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryShortMsgMoveTrafficByDateInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		String date = (String) inMap.get("DATE");
		if(CommonUtils.objectIsNull(date) == false){
			  String dates = DateUtil.stringToString(this.timeConvert(date), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
			  inParam.put("date", dates);	
		}else{
			Date currentDates = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
			String currentDate = sdf.format(currentDates);
			inParam.put("date", currentDate);
		}
		return inParam;
	}
	
	/**
	 * 根据日期查询短信推送流量出参处理
	* @date: 2016-10-30 
	* @author: fangyuan_crmpd
	* @title: queryShortMsgMoveTrafficByDateOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryShortMsgMoveTrafficByDateOutParam(
			Map<String, Object> outParam) {
		List<Map<String, Object>> list = (List<Map<String, Object>>) outParam.get("queryShortMsgMoveTrafficByDateList"); 
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(list) == false){
			for(Map<String, Object> inMap : list){
				Map<String, Object> outMap = new HashMap<String, Object>();
				outMap.put("MARKET_CASE_ID", inMap.get("marketCaseId"));
				outMap.put("MARKET_CASE_NAME", inMap.get("marketCaseName"));
				String date = (String)inMap.get("date");
				if(CommonUtils.objectIsNull(date) == false){
					 String dates = DateUtil.stringToString(date, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2);
					 outMap.put("DATE", dates);
				}
				outMap.put("TOTAL_COUNT", inMap.get("totalCount"));
				outMap.put("SEND_ALREADY_COUNT", inMap.get("sendAlreadyCount"));
				outMap.put("SEND_WAIT_COUNT", inMap.get("sendWaitCount"));
				outMap.put("SEND_FAIL_COUNT", inMap.get("sendFailCount"));
				outList.add(outMap);
			}
		}
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String, Object> outMap = new HashMap<String, Object>();
		outMap.put("QUERY_SHORT_MSG_MOVE_TRAFFIC_BY_DATE", outList);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 根据营销案ID查询短信推送流量入参处理
	* @date: 2016-10-30 
	* @author: fangyuan_crmpd
	* @title: queryShortMsgMoveTrafficByMarketCaseIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryShortMsgMoveTrafficByMarketCaseIdInParam(
			InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("marketCaseId", inMap.get("MARKET_CASE_ID"));
		return inParam;
	}
	
	/**
	 * 根据营销案ID查询短信推送流量出参处理
	* @date: 2016-10-30 
	* @author: fangyuan_crmpd
	* @title: queryShortMsgMoveTrafficByMarketCaseIdOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryShortMsgMoveTrafficByMarketCaseIdOutParam(
			Map<String, Object> outParam) {
		List<Map<String, Object>> list = (List<Map<String, Object>>) outParam.get("queryShortMsgMoveTrafficByMarketCaseIdList"); 
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(list) == false){
			for(Map<String, Object> inMap : list){
				Map<String, Object> outMap = new HashMap<String, Object>();
				outMap.put("MARKET_CASE_ID", inMap.get("marketCaseId"));
				outMap.put("MARKET_CASE_NAME", inMap.get("marketCaseName"));
				String date = (String)inMap.get("date");
				if(CommonUtils.objectIsNull(date) == false){
					 String dates = DateUtil.stringToString(date, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2);
					 outMap.put("DATE", dates);
				}
				outMap.put("TOTAL_COUNT", inMap.get("totalCount"));
				outMap.put("SEND_ALREADY_COUNT", inMap.get("sendAlreadyCount"));
				outMap.put("SEND_WAIT_COUNT", inMap.get("sendWaitCount"));
				outMap.put("SEND_FAIL_COUNT", inMap.get("sendFailCount"));
				outList.add(outMap);
			}
		}
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String, Object> outMap = new HashMap<String, Object>();
		outMap.put("QUERY_SHORT_MSG_MOVE_TRAFFIC_BY_MARKET_CASE_ID", outList);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 根据工号删除接入码入参处理 
	* @date: 2016-10-28 
	* @author: xiongxq
	* @Title: removeAccessCodeByLoginNoInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> removeAccessCodeByLoginNoInParam(InDTO inDTO) {
		MBean outBean = inDTO.getMbean();
		Map<String,Object> inMap = outBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("accessCode", inMap.get("ACCESS_CODE"));
		outMap.put("loginNo", inMap.get("LOGIN_NO"));
		return outMap;
	}

	/**
	 * 根据工号删除接入码出参处理 
	* @date: 2016-10-28 
	* @author: xiongxq
	* @Title: removeAccessCodeByLoginNoOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO removeAccessCodeByLoginNoOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}

	/**
	 * 移除短信接入码入参
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: removeShortMessageAccessCodeInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removeShortMessageAccessCodeInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("serType",inMap.get("SER_TYPE"));
		outMap.put("accessCode",inMap.get("ACCESS_CODE"));
		return outMap;
	}
	
	/**
	 * 移除短信接入码出参
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: removeShortMessageAccessCodeOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeShortMessageAccessCodeOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}
	
	/**
	 * 给某个工号添加接入码入参处理 
	* @date: 2016-10-28 
	* @author: xiongxq
	* @Title: saveAccessCodeForLoginNoInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> saveAccessCodeForLoginNoInParam(InDTO inDTO) {
		MBean outBean = inDTO.getMbean();
		Map<String,Object> inMap = outBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		String accessCodeArr = (String)inMap.get("ACCESS_CODE_ARR");
		
		String [] arr = accessCodeArr.split(",");
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		for(int i=0;i<arr.length;i++){
			String accessCode = arr[i];
			Map<String,Object> arrMap = new HashMap<String,Object>();
			arrMap.put("accessCode", accessCode);
			arrMap.put("loginNo", inMap.get("LOGIN_NO"));
			outMap.put("serName", inMap.get("SER_NAME"));
			outMap.put("accessName", inMap.get("ACCESS_NAME"));
			outList.add(arrMap);
		}
		outMap.put("outList", outList);
		return outMap;
	}

	/**
	 * 给某个工号添加接入码出参处理 
	* @date: 2016-10-28 
	* @author: xiongxq
	* @Title: saveAccessCodeForLoginNoOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO saveAccessCodeForLoginNoOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}

	/**
	 * 保存短信接入码入参
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: saveShortMessageAccessCodeInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveShortMessageAccessCodeInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("serName",inMap.get("SER_NAME"));
		outMap.put("serType",inMap.get("SER_TYPE"));
		outMap.put("accessCode",inMap.get("ACCESS_CODE"));
		outMap.put("accessName",inMap.get("ACCESS_NAME"));
		outMap.put("startDate",inMap.get("START_DATE"));
		outMap.put("endDate",inMap.get("END_DATE"));
		outMap.put("note",inMap.get("NOTE"));
		outMap.put("statusCode",inMap.get("STATUS_CODE"));
		return outMap;
	}
	
	/**
	 * 保存短信接入码出参
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: saveShortMessageAccessCodeOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveShortMessageAccessCodeOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}
	
	/**
	 * 短信模拟发送入参处理
	* @date: 2017-1-9 
	* @author: tangaq
	* @title: sendShortMessageSimulationInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> sendShortMessageSimulationInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("marketCaseId",inMap.get("MARKET_CASE_ID"));
		outMap.put("phoneNo",inMap.get("PHONE_NO"));
		return outMap;
	}

	/**
	 * 短信模拟发送出参处理
	* @date: 2017-1-9 
	* @author: tangaq
	* @title: sendShortMessageSimulationOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO sendShortMessageSimulationOutParam(Map<String,Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("RESULT",outParam.get("result"));
		MBean outBean = new MBean();
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 更新短信接入码入参
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: updateShortMessageAccessCodeInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updateShortMessageAccessCodeInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("serName",inMap.get("SER_NAME"));
		outMap.put("serType",inMap.get("SER_TYPE"));
		outMap.put("accessCode",inMap.get("ACCESS_CODE"));
		outMap.put("accessName",inMap.get("ACCESS_NAME"));
		outMap.put("startDate",inMap.get("START_DATE"));
		outMap.put("endDate",inMap.get("END_DATE"));
		outMap.put("note",inMap.get("NOTE"));
		outMap.put("statusCode",inMap.get("STATUS_CODE"));
		return outMap;
	}
	
	/**
	 * 更新短信接入码出参
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: updateShortMessageAccessCodeOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO updateShortMessageAccessCodeOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}
	
	/**
	 * 处理短信接入码出参参数
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: settlePositionInfoParams 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected StandardOutDTO settleShortMessageAccessCodeOutParams(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> accessCodeList = (List<Map<String,Object>>)outParam.get("accessCodeList");
		List<Map<String,Object>> accessCodeNewList = new ArrayList<Map<String,Object>>();
		
		if(!CommonUtils.objectIsNull(accessCodeList)){
			for(Map<String,Object> map :accessCodeList){
				Map<String,Object> noMap = new HashMap<String,Object>();
				noMap.put("SER_NAME", (String)map.get("serName"));
				noMap.put("SER_TYPE", (String)map.get("serType"));
				noMap.put("ACCESS_CODE", (String)map.get("accessCode"));
				noMap.put("ACCESS_NAME", (String)map.get("accessName"));
				noMap.put("START_DATE", (String)map.get("startDate"));
				noMap.put("END_DATE", (String)map.get("endDate"));
				noMap.put("NOTE", (String)map.get("note"));
				noMap.put("STATUS_CODE", (String)map.get("statusCode"));
				accessCodeNewList.add(noMap);
			}
		}
		outMap.put("ACCESSCODE_LIST", accessCodeNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(outMap);
		
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 时间格式转换
	* @date: 2016-10-30 
	* @author: fangyuan_crmpd
	* @title: timeConvert 
	* @param formTime
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected String timeConvert(String formTime){
		if(formTime.indexOf(":") < Integer.valueOf(Const.FLASE_INT)){
			return formTime+" 00:00:00";
		}
		return formTime;
	}
}
