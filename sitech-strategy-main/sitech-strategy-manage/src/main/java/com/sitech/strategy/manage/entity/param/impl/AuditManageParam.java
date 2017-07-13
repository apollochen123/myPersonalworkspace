package com.sitech.strategy.manage.entity.param.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IAuditManageParam;

/**
 * 审核参数转换实体
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: AuditManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class AuditManageParam implements IAuditManageParam{
	
	/**
	 * 下载审批列表入参转换
	* @date: 2016-9-20 
	* @author: fangyuan_crmpd
	* @title:downLoadAuditListInParam 
	* @param inDTO
	* @return outMap
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryDownLoadAuditListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> auditMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_DLAD);
		outMap.put("keyWords", auditMap.get("KEY_WORDS"));
		outMap.put("status", auditMap.get("AUDIT_STATUS"));
		outMap.put("busiType", auditMap.get("BUSI_TYPE"));
		outMap.put("currentPageCode", auditMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", auditMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", auditMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("isPage", auditMap.get("IS_PAGE"));
		outMap.put("sortFlag", auditMap.get("SORT_FLAG"));
		outMap.put("sortField", auditMap.get("SORT_FIELD"));
		return outMap;
	}

	/**
	 * 下载审批列表出参转换
	* @date: 2016-9-20 
	* @author: fangyuan_crmpd
	* @title: downLoadAuditListOutParam 
	* @param outParam
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryDownLoadAuditListOutParam(Map<String, Object> outParam) {
		List<Map<String,Object>> inList = (List<Map<String, Object>>) outParam.get("auditDownLoadList");
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String,Object> inMap : inList ){
				Map<String,Object> outMap = new HashMap<String,Object>();
				outMap.put("CUST_GROUP_NAME",inMap.get("custGroupName"));
				outMap.put("CUST_GROUP_NUM",inMap.get("custGroupNum"));
				outMap.put("AUDIT_TIME",inMap.get("auditTime"));
				outMap.put("AUDIT_STATUS",inMap.get("auditStatus"));
				outMap.put("OPER_NAME",inMap.get("operName"));
				outMap.put("AUDIT_NO",inMap.get("auditNo"));
				outList.add(outMap);
			}
		}
		Map<String,Object> auditDownLoadMap =new HashMap<String,Object>();
		auditDownLoadMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		auditDownLoadMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		auditDownLoadMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		auditDownLoadMap.put("AUDIT_DOWN_LOAD_LIST", outList);
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody(auditDownLoadMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/** 
	 * 查询下载审批人列表入参处理
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: queryLoadAuditorListInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryLoadAuditorListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("auditType",inMap.get("AUDIT_TYPE"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_ADR);
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("isPage", inMap.get("IS_PAGE"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("loginNo", inMap.get("LOGIN_NO"));
		outMap.put("regionCode", inMap.get("REGION_CODE"));
		outMap.put("groupId", inMap.get("GROUP_ID"));
		

		return outMap;
	}

	/** 
	 * 查询下载审批人列表出参处理
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: queryLoadAuditorListOutParam 
	* @param outParam
	* @return standardOutDTO
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryLoadAuditorListOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> loadAuditorNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> outList = (List<Map<String, Object>>) outParam.get("loadAuditorList");
		
		if(CommonUtils.objectIsNull(outList) == false){
			for(Map<String,Object> basic : outList){
				Map<String,Object> LoadAuditorMap = new HashMap<String,Object>();
				LoadAuditorMap.put("CHANNEL_ID", basic.get("channelId"));
				LoadAuditorMap.put("REGION_CODE", basic.get("regionCode"));
				LoadAuditorMap.put("AUDIT_ORDER", basic.get("auditOrder"));
				LoadAuditorMap.put("AUDIT_NO", basic.get("auditNo"));
				LoadAuditorMap.put("AUDIT_TYPE", basic.get("auditType"));
				LoadAuditorMap.put("DOWNLOAD_NUM", basic.get("downLoadNum"));
				LoadAuditorMap.put("CHANNEL_NAME", basic.get("channelName"));
				LoadAuditorMap.put("REGION_NAME", basic.get("regionName"));


				loadAuditorNewList.add(LoadAuditorMap);
			}
		}
		
		outMap.put("LOAD_AUDITOR_LIST",loadAuditorNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 查询审批列表入参转换
	* @date: 2016-9-20 
	* @author: tangaq
	* @title: queryMarketCaseAuditListInParam 
	* @param inDTO
	* @return outMap
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseAuditListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_AD);
		if(CommonUtils.objectIsNull(inMap.get("KEY_WORDS"))){
			outMap.put("keyWords", new ArrayList<String>());
		}else{
			outMap.put("keyWords", (List<String>)inMap.get("KEY_WORDS"));
		}		
		outMap.put("auditStatus", inMap.get("AUDIT_STATUS"));
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		//add by yl at 2016-10-22.查询我的审批数据
		//update by yl at 2016-11-29.使用角色审批，因此前台不需要传递审批人了。
		outMap.put("auditNo", inMap.get("AUDIT_NO"));
		outMap.put("loginNo", inMap.get("LOGIN_NO"));
		
		return outMap;
	}

	/**
	 * 查询审批列表出参转换
	* @date: 2016-9-20 
	* @author: tangaq
	* @title: queryMarketCaseAuditListOutParam 
	* @param outParam
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMarketCaseAuditListOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		List<Map<String,Object>> auditList = (List<Map<String,Object>>)outParam.get("auditList");
		List<Map<String,Object>> auditNewList = new ArrayList<Map<String,Object>>();
		
		if(CommonUtils.objectIsNull(auditList)==false){
			for(Map<String,Object> auditMap:auditList){
				Map<String,Object> noMap = new HashMap<String,Object>();
			noMap.put("MARKET_CASE_NAME", auditMap.get("marketCaseName"));
			noMap.put("MARKET_CASE_ID", auditMap.get("marketCaseId"));
			noMap.put("AUDIT_STATUS", auditMap.get("auditStatus"));
			noMap.put("AUDIT_DESC", auditMap.get("auditDesc"));
			noMap.put("AUDIT_NO", auditMap.get("auditNo"));
			noMap.put("REGION_CODE", auditMap.get("regionCode"));
			noMap.put("AUDIT_RECORD_ID", auditMap.get("auditRecordId"));
			noMap.put("GROUP_CODE", auditMap.get("groupCode"));
			noMap.put("AUDIT_ORDER", auditMap.get("auditOrder"));
			noMap.put("BUSI_ID", auditMap.get("busiId"));
			noMap.put("BUSI_TYPE", auditMap.get("busiType"));
			noMap.put("GROUP_ID", auditMap.get("groupId"));
			noMap.put("CITY_CODE", auditMap.get("cityCode"));
			noMap.put("STATUS_NAME", auditMap.get("statusName"));
			noMap.put("OPER_NO", auditMap.get("operNo"));
			String adTime = (String)auditMap.get("auditTime");
			if(adTime !=null && !"".equals(adTime)){
				String auditTime = DateUtil.stringToString(adTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE1);
				noMap.put("AUDIT_TIME", auditTime);
			}
			noMap.put("OPER_NAME", auditMap.get("operName"));
			noMap.put("GROUP_NAME", auditMap.get("groupName"));
			noMap.put("MARKET_CASE_TYPE_NAME", auditMap.get("marketCaseTypeName"));
			auditNewList.add(noMap);
		  }
		} 
		outMap.put("AUDIT_LIST", auditNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(outMap);
		
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 *	时间格式的转换
	* @date: 2016-10-11 
	* @author: fangyuan_crmpd
	* @title: timeConvert 
	* @param time
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected String timeConvert(String formTime){
		if(formTime.indexOf(":") < Integer.parseInt(Const.FLASE_INT)){
			return formTime+" 00:00:00";
		}
		return formTime;
	}
	
	/** 
	 * 查询营销案审批人列表入参处理
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: queryMarketCaseAuditorListInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryMarketCaseAuditorListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("auditType",inMap.get("AUDIT_TYPE"));
		outMap.put("auditOrder",inMap.get("AUDIT_ORDER"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_ADR);
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("isPage", inMap.get("IS_PAGE"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("loginNo", inMap.get("LOGIN_NO"));
		outMap.put("regionCode", inMap.get("REGION_CODE"));
		outMap.put("channelId", inMap.get("CHANNEL_ID"));
		outMap.put("groupId", inMap.get("GROUP_ID"));
		return outMap;
		
	}

	/** 
	 * 查询营销案审批人列表出参处理
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: queryMarketCaseAuditorListOutParam 
	* @param outParam
	* @return standardOutDTO
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryMarketCaseAuditorListOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> marketCaseAuditorNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> outList = (List<Map<String, Object>>) outParam.get("marketCaseAuditorList");
		
		if(CommonUtils.objectIsNull(outList) == false){
			for(Map<String,Object> basic : outList){
				Map<String,Object> marketCaseAuditorMap = new HashMap<String,Object>();
				marketCaseAuditorMap.put("CHANNEL_ID", basic.get("channelId"));
				marketCaseAuditorMap.put("REGION_CODE", basic.get("regionCode"));
				marketCaseAuditorMap.put("AUDIT_ORDER", basic.get("auditOrder"));
				marketCaseAuditorMap.put("AUDIT_NO", basic.get("auditNo"));
				marketCaseAuditorMap.put("AUDIT_ORDER_NAME", basic.get("auditOrderName"));
				marketCaseAuditorMap.put("AUDIT_TYPE", basic.get("auditType"));
				marketCaseAuditorMap.put("CHANNEL_NAME", basic.get("channelName"));
				marketCaseAuditorMap.put("REGION_NAME", basic.get("regionName"));
				marketCaseAuditorMap.put("GROUP_ID", basic.get("groupId"));
				
				marketCaseAuditorNewList.add(marketCaseAuditorMap);
			}
		}
		
		outMap.put("MARKET_CASE_AUDITOR_LIST",marketCaseAuditorNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	/**
	 * 
	* @date: 2017-3-1 
	* @author: yuanliang
	* @title: queryMarketCaseAuditCaseListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseAuditCaseListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
				
		outMap.put("busiId", inMap.get("MARKET_CASE_ID"));

		return outMap;
	}
	/**
	 * 
	* @date: 2017-3-1 
	* @author: yuanliang
	* @title: queryMarketCaseAuditCaseListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMarketCaseAuditCaseListOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		List<Map<String,Object>> auditCaseList = (List<Map<String,Object>>)outParam.get("auditCaseList");
		List<Map<String,Object>> auditCaseNewList = new ArrayList<Map<String,Object>>();
		
		if(CommonUtils.objectIsNull(auditCaseList)==false){
			for(Map<String,Object> auditCaseMap:auditCaseList){
				Map<String,Object> noMap = new HashMap<String,Object>();

			noMap.put("AUDIT_STATUS", auditCaseMap.get("auditStatus"));
			noMap.put("STATUS_NAME", auditCaseMap.get("statusName"));			
			noMap.put("AUDIT_DESC", auditCaseMap.get("auditDesc"));
			noMap.put("AUDIT_NO", auditCaseMap.get("auditNo"));
			noMap.put("AUDIT_NAME", auditCaseMap.get("auditName"));
			noMap.put("ROLE_NAME", auditCaseMap.get("roleName"));

			String adTime = (String)auditCaseMap.get("auditTime");
			if(adTime !=null && !"".equals(adTime)){
				String auditTime = DateUtil.stringToString(adTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE1);
				noMap.put("AUDIT_TIME", auditTime);
			}

			auditCaseNewList.add(noMap);
		  }
		} 
		outMap.put("AUDIT_CASE_LIST", auditCaseNewList);

		outBean.setBody(outMap);
		
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/** 
	 * 删除下载审批人入参处理
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: removeLoadAuditorInParam 
	* @param inDTO
	* @return  
	* @return Map 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> removeLoadAuditorInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("regionCode",inMap.get("REGION_CODE"));
		
		outMap.put("auditType",inMap.get("AUDIT_TYPE"));
		outMap.put("downLoadNum",inMap.get("DOWNLOAD_NUM"));

		return outMap;
	}

	/**
	 * 删除下载审批人出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: removeDownLoadAuditorOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeLoadAuditorOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/** 
	 * 删除营销案审批人入参处理
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: removeMarketCaseAuditorInParam 
	* @param inDTO
	* @return 
	* @Title: removeMarketCaseAuditorInParam 
	* @param inDTO
	* @return Map
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> removeMarketCaseAuditorInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("channelId",inMap.get("CHANNEL_ID"));
		outMap.put("regionCode",inMap.get("REGION_CODE"));
		outMap.put("auditNo",inMap.get("AUDIT_NO"));
		outMap.put("auditOrder",inMap.get("AUDIT_ORDER"));
		outMap.put("auditType",inMap.get("AUDIT_TYPE"));
		
		return outMap;
	}

	/**
	 * 删除营销案审批人出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: removeMarketCaseAuditorOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeMarketCaseAuditorOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}
	
	/**
	 * 保存下载审批入参
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: saveLoadAuditInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveDownLoadAuditInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> auditMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("custGroupId", auditMap.get("CUST_GROUP_ID"));
		outMap.put("isPassAudit", auditMap.get("IS_PASS_AUDIT"));
		outMap.put("auditDesc", auditMap.get("AUDIT_DESC"));
		outMap.put("operNo",auditMap.get("OPER_NO"));
		outMap.put("auditNo",auditMap.get("OPER_NO"));
		outMap.put("groupId", auditMap.get("GROUP_ID"));
		outMap.put("auditOrder",auditMap.get("AUDIT_ORDER"));
		outMap.put("cityCode",auditMap.get("CITY_CODE"));
		outMap.put("regionCode",auditMap.get("REGION_CODE"));
		outMap.put("busiId",auditMap.get("BUSI_ID"));
		outMap.put("busiType",auditMap.get("BUSI_TYPE"));
		outMap.put("auditRecordId",auditMap.get("AUDITRECORD_ID"));
		return outMap;
	}
	
	/**
	 * 保存下载审批出参
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: saveLoadAuditOutParam 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveDownLoadAuditOutParam() {
		MBean mbean = new MBean();
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}
	
	/**
	 * 保存下载审批人出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: saveLoadAuditorOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveLoadAuditorOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/** 
	 * 保存下载审批人入参处理
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: saveLoadAuditorInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> saveLoadAuditorInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("regionCode",inMap.get("REGION_CODE"));
		outMap.put("downLoadNum",inMap.get("DOWNLOAD_NUM"));
		outMap.put("auditNo",inMap.get("AUDIT_NO"));
		outMap.put("auditType",inMap.get("AUDIT_TYPE"));
		
		return outMap;
	}

	/** 
	 * 保存营销案审批人入参处理
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: saveMarketCaseAuditorInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> saveMarketCaseAuditorInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("channelId",inMap.get("CHANNEL_ID"));
		outMap.put("regionCode",inMap.get("REGION_CODE"));
		outMap.put("auditOrder",inMap.get("AUDIT_ORDER"));
		outMap.put("auditType", inMap.get("AUDIT_TYPE"));
		outMap.put("auditNo", inMap.get("AUDIT_NO"));
		outMap.put("groupId", inMap.get("GROUP_ID"));

		return outMap;
	}

	/**
	 * 保存营销案审批人出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: saveMarketCaseAuditorOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveMarketCaseAuditorOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/** 
	 * 保存营销案审批入参转换
	* @date: 2016-9-20 
	* @author: xiongxq
	* @Title: saveMarketCaseAuditInParam 
	* @param inDTO
	* @return outMap
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> saveMarketCaseAuditInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> auditMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("marketCaseId", auditMap.get("MARKET_CASE_ID"));
		outMap.put("marketCaseType",auditMap.get("MARKET_CASE_TYPE"));
		outMap.put("triggerMode", auditMap.get("TRIGGER_MODE"));
		outMap.put("pushMode", auditMap.get("PUSH_MODE"));
		outMap.put("isPassAudit", auditMap.get("IS_PASS_AUDIT"));
		outMap.put("auditType", auditMap.get("AUDIT_TYPE"));
		outMap.put("auditDesc", auditMap.get("AUDIT_DESC"));
		outMap.put("auditRecordId", auditMap.get("AUDIT_RECORD_ID"));
		outMap.put("operNo",auditMap.get("OPER_NO"));
		outMap.put("operName", auditMap.get("OPER_NAME"));
		outMap.put("updateNo",auditMap.get("OPER_NO"));
		outMap.put("updateName", auditMap.get("OPER_NAME"));
		
		outMap.put("groupId", auditMap.get("GROUP_ID"));
		outMap.put("auditOrder",auditMap.get("AUDIT_ORDER"));
		outMap.put("regionCode",auditMap.get("REGION_CODE"));
		outMap.put("fileName",auditMap.get("FILE_NAME"));
		outMap.put("systemName",auditMap.get("SYSTEM_NAME"));
		//update by yl at 2016-11-29.使用角色审批，因此前台不需要传递审批人了。而是使用角色。
//		if(CommonUtils.objectIsNull(auditMap.get("AUDIT_NO"))==false){
//			outMap.put("auditNoList",Arrays.asList(auditMap.get("AUDIT_NO").toString().split(Const.SEPARATOR_AND))) ;
//		}			
		if(CommonUtils.objectIsNull(auditMap.get("AUDIT_ROLE"))==false){
			outMap.put("auditRoleList",Arrays.asList(auditMap.get("AUDIT_ROLE").toString().split(Const.SEPARATOR_AND))) ;
		}
		outMap.put("loginNo", auditMap.get("LOGIN_NO"));//审批人
		//end.
		return outMap;
	}

	/**
	 * 保存营销案审批出参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: saveMarketCaseAuditOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveMarketCaseAuditOutParam() {
		MBean mbean = new MBean();
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}

	/**
	 * 给待审批人员发送审批短信提醒入参转换
	* @date: 2016-11-15 
	* @author: yuanliang
	* @title: sendShortMessageToAuditorInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> sendShortMessageToAuditorInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String,Object> auditMap = bean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();

		if(CommonUtils.objectIsNull(auditMap.get("AUDIT_NO"))==false){
			outMap.put("auditNoList",Arrays.asList(auditMap.get("AUDIT_NO").toString().split(Const.SEPARATOR_AND))) ;
		}
		outMap.put("shortMessage", auditMap.get("SHORT_MESSAGE"));
		
		return outMap;
	}

	/**
	 * 给待审批人员发送审批短信提醒出参转换
	* @date: 2016-11-15 
	* @author: yuanliang
	* @title: sendShortMessageToAuditorOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO sendShortMessageToAuditorOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 审批状态变更入参转换
	* @date: 2016-9-22 
	* @author: fangyuan_crmpd
	* @title: updateAuditStatusInParam
	* @param inDTO
	* @return outMap
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updateAuditStatusInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String,Object> auditMap = bean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("marketCaseId", auditMap.get("MARKET_CASE_ID"));
		return outMap;
	}

	/**
	 * 审批状态变更出参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: updateAuditStatusOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO updateAuditStatusOutParam() {
		MBean mbean = new MBean();
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}
	
	/** 
	 * 更新下载审批人入参处理
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: updateLoadAuditorInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> updateLoadAuditorInParam(InDTO inDTO) {
		return null;
	}

	/**
	 * 更新下载审批人出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: updateLoadAuditorOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO updateLoadAuditorOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/** 
	 * 更新营销案审批人入参处理
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: updateMarketCaseAuditorInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> updateMarketCaseAuditorInParam(InDTO inDTO) {
		return null;
	}

	/**
	 * 更新营销案审批人出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: updateMarketCaseAuditorOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO updateMarketCaseAuditorOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}



	
}
