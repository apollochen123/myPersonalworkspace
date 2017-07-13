package com.sitech.strategy.manage.entity.param.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.ISystemManageParam;

/**
 * 系统管理参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: SystemManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class SystemManageParam implements ISystemManageParam{
	
	/**
	 * 短信触发推送入参处理
	* @date: 2017-3-7 
	* @author: wuJiaFu
	* @title: queryMessageTriggerLogListInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMessageTriggerLogListInParam(InDTO inDTO)
			throws StrategyError {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("marketCaseId", inMap.get("MARKET_CASE_ID"));
		return outMap;
	}
	
	/**
	 * 短信触发推送出参处理
	* @date: 2017-3-7 
	* @author: wuJiaFu
	* @title: queryMessageTriggerLogListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMessageTriggerLogListOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> numberList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> outList =  outParam.get("result")== null ? new ArrayList<Map<String, Object>>(): (List<Map<String, Object>>) outParam.get("result") ;
		if(CommonUtils.objectIsNull(outList) == false){
			for(Map<String,Object> basic : outList){
				Map<String,Object> numberMap = new HashMap<String,Object>();
				numberMap.put("MARKET_CASE_ID", basic.get("marketCaseId"));
				numberMap.put("MARKET_CASE_NAME", basic.get("marketCaseName"));
				numberMap.put("OPER_NO", basic.get("operNo"));
				numberMap.put("OPER_NAME", basic.get("operName"));
				numberMap.put("REGION_NAME", basic.get("regionName"));
				numberMap.put("TRIGGER_NUMBER", basic.get("triggerNumber"));
				numberMap.put("OPER_TIME", basic.get("operTime"));
				numberList.add(numberMap);
			}
		}
		outMap.put("MESSAGE_TRIGGER_LIST",numberList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
		
	}

	/** 
	 * 查询工号列表入参处理
	* @date: 2016-10-26 
	* @author: xiongxq
	* @Title: queryLoginUserListInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryLoginUserListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("loginNo",inMap.get("LOGIN_NO"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_LOGIN);
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("loginName", inMap.get("LOGIN_NAME"));
		return outMap;
	}

	/** 
	 *查询工号列表出参处理 
	* @date: 2016-10-26 
	* @author: xiongxq
	* @Title: queryLoginUserListOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryLoginUserListOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> numberList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> outList = (List<Map<String, Object>>) outParam.get("loginList");
		if(CommonUtils.objectIsNull(outList) == false){
			for(Map<String,Object> basic : outList){
				Map<String,Object> numberMap = new HashMap<String,Object>();
				numberMap.put("LOGIN_NO", basic.get("loginNo"));
				numberMap.put("LOGIN_NAME", basic.get("loginName"));
				numberMap.put("GROUP_NAME", basic.get("groupName"));
				numberMap.put("REGION_CODE", basic.get("regionCode"));
				numberMap.put("USER_ID", basic.get("userId"));
				numberMap.put("GROUP_ID", basic.get("groupId"));
				numberMap.put("GROUP_CODE", basic.get("groupCode"));
				numberMap.put("PHONE", basic.get("phone"));
				numberMap.put("LEVEL_CODE", basic.get("levelCode"));
				numberList.add(numberMap);
			}
		}
		outMap.put("LOGIN_NUMBER_LIST",numberList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 查询操作日志列表入参处理
	* @date: 2016-11-1 
	* @author: tangaq
	* @title: queryOperLogListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryOperLogListInParam(InDTO inDTO) throws StrategyError {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("regionCode", inMap.get("REGION_CODE"));
		String startDate = (String)inMap.get("OPER_START_DATE");
		if(CommonUtils.objectIsNull(startDate) == false){
			Timestamp operTimeStart = DateUtil.string2Timestamp(this.timeConvert(startDate), DateUtil.TIME_FROMAT_SIMPLE1);
			outMap.put("operTimeStart", operTimeStart);
			}
		String endDate = (String)inMap.get("OPER_END_DATE");
		if(CommonUtils.objectIsNull(endDate) == false){
			Timestamp operTimeEnd = DateUtil.string2Timestamp(this.timeConvert(endDate), DateUtil.TIME_FROMAT_SIMPLE1);
			outMap.put("operTimeEnd", operTimeEnd);
			}
		
		outMap.put("menuName", inMap.get("MENU_NAME"));
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		return outMap;
	}

	/**
	 * 查询操作日志列表出参处理
	* @date: 2016-11-1 
	* @author: tangaq
	* @title: queryOperLogListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryOperLogListOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> numberList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> outList = (List<Map<String, Object>>) outParam.get("operLogList");
		if(CommonUtils.objectIsNull(outList) == false){
			for(Map<String,Object> basic : outList){
				Map<String,Object> numberMap = new HashMap<String,Object>();
				numberMap.put("SERIAL_ID", basic.get("serialId"));
				numberMap.put("OPER_NO", basic.get("operNo"));
				numberMap.put("OPER_NAME", basic.get("operName"));
				numberMap.put("OPER_TYPE", basic.get("operType"));
				numberMap.put("OPER_TIME", DateUtil.timestamp2String((Timestamp) basic.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
				numberMap.put("GROUP_ID", basic.get("groupId"));
				numberMap.put("REGION_CODE", basic.get("regionCode"));
				numberMap.put("REGION_NAME", basic.get("regionName"));
				numberMap.put("MENU_ID", basic.get("menuId"));
				numberMap.put("MENU_NAME", basic.get("menuName"));
				numberList.add(numberMap);
			}
		}
		outMap.put("OPER_LOG_LIST",numberList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	

	/**
	 * 查询服务监控列表入参处理
	* @date: 2016-11-2 
	* @author: tangaq
	* @title: queryServiceMonitorListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryServiceMonitorListInParam(InDTO inDTO){
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("keyWords", inMap.get("KEY_WORDS"));
		outMap.put("channelId", inMap.get("CHANNEL_ID"));
		//outMap.put("endDate", inMap.get("END_DATE"));
		if(CommonUtils.objectIsNull(inMap.get("SART_DATE"))==false){
			try {
				outMap.put("startDate", DateUtil.string2Timestamp((String)inMap.get("SART_DATE"), DateUtil.TIME_FROMAT_SIMPLE1));
			} catch (StrategyError e) {
				e.printStackTrace();
			}
		}
		if(CommonUtils.objectIsNull(inMap.get("END_DATE"))==false){
			try {
				outMap.put("endDate", DateUtil.string2Timestamp((String)inMap.get("END_DATE"), DateUtil.TIME_FROMAT_SIMPLE1));
			} catch (StrategyError e) {
				e.printStackTrace();
			}
		}
		outMap.put("groupId", inMap.get("GROUP_ID"));
		outMap.put("regionCode", inMap.get("REGION_CODE"));
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		//outMap.put("keyWords", inMap.get("KEY_WORDS"));
		return outMap;
		
	}
	
	/**
	 * 查询服务监控列表出参处理
	* @date: 2016-11-2 
	* @author: tangaq
	* @title: queryServiceMonitorListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryServiceMonitorListOutParam(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> serviceMonitorList = (List<Map<String,Object>>)outParam.get("result");
		List<Map<String,Object>> serviceMonitorNewList = new ArrayList<Map<String,Object>>();
		
		if(CommonUtils.objectIsNull(serviceMonitorList) == false){
			for(Map<String,Object> serviceNewMap:serviceMonitorList){
				Map<String,Object> noMap = new HashMap<String,Object>();
				noMap.put("SERVICE_CODE", serviceNewMap.get("serialId"));
				noMap.put("SERVICE_NAME", serviceNewMap.get("serviceName"));
				noMap.put("CALL_TIME", serviceNewMap.get("callTime"));
				noMap.put("SYSTEM_ID", serviceNewMap.get("systemId"));
				noMap.put("REGION_CODE", serviceNewMap.get("regionCode"));
				noMap.put("RETURN_TIME", serviceNewMap.get("returnTime"));
				noMap.put("COST_TIME", serviceNewMap.get("costTime"));
				noMap.put("IN_PARAM", serviceNewMap.get("inParam"));
				noMap.put("OUT_PARAM", serviceNewMap.get("outParam"));
				noMap.put("RESPOND_TIME", serviceNewMap.get("respondTime"));
				serviceMonitorNewList.add(noMap);
			}
		}
		
		outMap.put("SERVICE_MONITOR_LIST",serviceMonitorNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
		
	}
	
	
	/**
	 * 查询作业配置列表入参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: queryWorkConfigListInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryWorkConfigListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_WC);
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("keyWords", (String)inMap.get("KEY_WORDS"));
		return outMap;
	}

	/**
	 * 查询作业配置列表出参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: queryWorkConfigListOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryWorkConfigListOutParam(
			Map<String, Object> outParam) {
		return settleWorkConfigOutParams(outParam);	
	}
	
	/**
	 * 移除作业配置入参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: removeWorkConfigInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removeWorkConfigInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("serialId",inMap.get("SERIAL_ID"));
		return outMap;
	}

	/**
	 * 移除作业配置出参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: removeWorkConfigOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeWorkConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/** 
	 * 保存操作日志信息入参
	* @date: 2017-3-9 
	* @author: yueyi
	* @title: saveOperLogInfoInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/	
	@Override
	public Map<String, Object> saveOperLogInfoInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		String operTime = DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1);
		inMap.put("OPER_TIME",operTime);
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("serialId", SequenceUtil.getSequence());
		outMap.put("menuId", (String)inMap.get("MENU_ID"));
		outMap.put("operType", (String)inMap.get("OPER_TYPE"));		
		outMap.put("operNo", (String)inMap.get("OPER_NO"));
		outMap.put("operName", (String)inMap.get("OPER_NAME"));
		outMap.put("operTime", (String)inMap.get("OPER_TIME"));
		outMap.put("inParam", (String)inMap.get("IN_PARAM"));
		outMap.put("outParam", (String)inMap.get("OUT_PARAM"));
		return outMap;
	}
	
	/** 
	 * 保存操作日志信息出参
	* @date: 2017-3-9 
	* @author: yueyi
	* @title: saveOperLogInfoOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO saveOperLogInfoOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 保存作业配置入参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: saveWorkConfigInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveWorkConfigInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("serialId", SequenceUtil.getSequence());
		outMap.put("workName", (String)inMap.get("WORK_NAME"));
		outMap.put("workCatalog", (String)inMap.get("WORK_CATALOG"));
		outMap.put("splitType", (String)inMap.get("SPLIT_TYPE"));
		outMap.put("runTime", (String)inMap.get("RUN_TIME"));
		outMap.put("fileNameType", (String)inMap.get("FILE_NAME_TYPE"));
		outMap.put("note", (String)inMap.get("NOTE"));
		outMap.put("workPeriod", (String)inMap.get("WORK_PERIOD"));
		return outMap;
	}

	/**
	 * 保存作业配置出参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: saveWorkConfigOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveWorkConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 更新作业配置入参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: updateWorkConfigInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updateWorkConfigInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("serialId", (String)inMap.get("SERIAL_ID"));
		outMap.put("workName", (String)inMap.get("WORK_NAME"));
		outMap.put("workCatalog", (String)inMap.get("WORK_CATALOG"));
		outMap.put("splitType", (String)inMap.get("SPLIT_TYPE"));
		outMap.put("runTime", (String)inMap.get("RUN_TIME"));
		outMap.put("fileNameType", (String)inMap.get("FILE_NAME_TYPE"));
		outMap.put("note", (String)inMap.get("NOTE"));
		outMap.put("workPeriod", (String)inMap.get("WORK_PERIOD"));
		return outMap;
	}
	
	/**
	 * 更新作业配置出参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: updateWorkConfigOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO updateWorkConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 处理作业配置出参参数
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: settleWorkConfigOutParams 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected StandardOutDTO settleWorkConfigOutParams(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> workConfigList = (List<Map<String,Object>>)outParam.get("workConfigList");
		List<Map<String,Object>> workConfigNewList = new ArrayList<Map<String,Object>>();
		
		if(!CommonUtils.objectIsNull(workConfigList)){
			for(Map<String,Object> map :workConfigList){
				Map<String,Object> noMap = new HashMap<String,Object>();
				noMap.put("SERIAL_ID", (String)map.get("serialId"));
				noMap.put("WORK_NAME", (String)map.get("workName"));
				noMap.put("WORK_CATALOG", (String)map.get("workCatalog"));
				noMap.put("SPLIT_TYPE", (String)map.get("splitType"));
				noMap.put("RUN_TIME", (String)map.get("runTime"));
				noMap.put("FILE_NAME_TYPE", (String)map.get("fileNameType"));
				noMap.put("NOTE", (String)map.get("note"));
				noMap.put("WORK_PERIOD", (String)map.get("workPeriod"));
				workConfigNewList.add(noMap);
			}
		}
		outMap.put("WORKCONFIG_LIST", workConfigNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(outMap);
		
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 时间转换
	* @date: 2016-11-3 
	* @author: tangaq
	* @title: timeConvert 
	* @param inParamTime
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected String timeConvert(String inParamTime){
		if(inParamTime.indexOf(":")<Integer.valueOf(Const.FLASE_INT)){
			return inParamTime+" 00:00:00";
		}
		return inParamTime;
	}
	
}
