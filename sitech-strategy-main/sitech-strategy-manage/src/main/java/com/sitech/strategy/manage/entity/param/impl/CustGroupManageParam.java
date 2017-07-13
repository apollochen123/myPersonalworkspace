package com.sitech.strategy.manage.entity.param.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
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
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.ICustGroupManageParam;

/** 目标客户群参数处理
 * @date: 2016-9-14 
 * @author: xiongxq
 * @Title: CustGroupManageParam 
 * @version 1.0 
 * @Description： 
 * update_version: update_date: update_author: update_note: 
 */
public class CustGroupManageParam extends BaseManageEntity implements
		ICustGroupManageParam {

	/**
	 *批量添加号码到目标客户群入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: addBatchNoToCustGroupInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> addBatchNoToCustGroupInParam(InDTO inDTO) {
		return null;
	}

	/**
	 * 批量添加号码到目标客户群出参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: addBatchNoToCustGroupOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO addBatchNoToCustGroupOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}

	/**
	 * 添加单个号码到目标客户群入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: addSingleNoToCustGroupInParam 
	* @param inDTO
	* @return outMap
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> addSingleNoToCustGroupInParam(InDTO inDTO) {	
		MBean inBean = inDTO.getMbean();
		Map<String,Object> body = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		//处理common_info 节点
		outMap.put("commonInfo", addSingleNoToCustGroupCommonInParam(body));
		outMap.put("channelId", body.get("CHANNEL_ID"));
		outMap.put("operNo", body.get("OPER_NO"));
		outMap.put("operName", body.get("OPER_NAME"));
		outMap.put("marketCaseId", body.get("ACT_ID"));
		outMap.put("custGroupId", body.get("CUST_GROUP_ID"));
		outMap.put("phoneNo", body.get("PHONE_NO"));
		outMap.put("regionCode", body.get("REGION_CODE"));
		outMap.put("positionInfoList", body.get("POSITION_INFO_LIST"));
		
		return outMap;
	}

	/**
	 * 单个添加号码到目标客户群出参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: addSingleNoToCustGroupOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO addSingleNoToCustGroupOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}
	
	/**
	 * 根据客户群ID查询此客户群有无关联活动入参转换
	* @date: 2017-2-9 
	* @author: wuJiaFu
	* @title: queryActRelationListByCustGroupIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryActRelationListByCustGroupIdInParam(InDTO inDTO){
		Map<String,Object> outMap = new HashMap<String,Object>();
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		outMap.put("custGroupId", custGroupMap.get("CUST_GROUP_ID"));
		return outMap;
	}
	
	/**
	 * 根据客户群ID查询此客户群有无关联活动出参转换
	* @date: 2017-2-10 
	* @author: wuJiaFu
	* @title: queryActRelationListByCustGroupIdOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryActRelationListByCustGroupIdOutParam(Map<String, Object> outParam) {
		MBean outMbean = new MBean();
		outMbean.setBody(outParam);
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(outMbean);
		return standardOutDTO;
	}

	/**
	 * 创建标签客户群明细文件入参转换--从hive中将明细数据导入到文件中
	* @date: 2017-2-16
	* @author: luogj
	* @title: createLabelCustGroupDetailFileInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> createLabelCustGroupDetailFileInParam(InDTO inDTO){
		Map<String,Object> outMap = new HashMap<String,Object>();
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();

		outMap.put("custGroupId", custGroupMap.get("CUST_GROUP_ID"));
		outMap.put("labelType", custGroupMap.get("LABEL_TYPE"));
		outMap.put("filePath", custGroupMap.get("FILE_PATH"));
		outMap.put("calculateFormula", custGroupMap.get("CALCULATE_FORMULA"));
		
		return outMap;
	}
	

	/**
	 * 创建标签客户群明细文件出参转换--从hive中将明细数据导入到文件中
	* @date: 2017-2-16
	* @author: luogj
	* @title: createLabelCustGroupDetailFileOutParam 
	* @param 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO createLabelCustGroupDetailFileOutParam(){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}	
	
	/**
	 * 根据ID查询客户群信息入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupByIdInParam 
	* @param inDTO
	* @return outMap
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryCustGroupByIdInParam(InDTO inDTO) {	
		Map<String,Object> outMap = new HashMap<String,Object>();
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		
		outMap.put("custGroupId", custGroupMap.get("CUST_GROUP_ID"));
		outMap.put("custGroupType", custGroupMap.get("CUST_GROUP_TYPE"));
		
		return outMap;
	}
	    
	/**
	 * 根据ID查询客户群信息出参转换
	* @date: 2016-9-12 
	* @author: tangaq
	* @title: queryCustGroupByIdOutParam 
	* @param outParam
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-17 luogj 增加返回GROUP_LABLE_TYPE、GROUP_ATTACH_NAME
	 */
	@Override
	public StandardOutDTO queryCustGroupByIdOutParam(Map<String, Object> outParam) {
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("CUST_GROUP_ID", outParam.get("custGroupId"));
		outMap.put("CUST_GROUP_NAME", outParam.get("custGroupName"));
		outMap.put("CUST_GROUP_TYPE", outParam.get("custGroupType"));
		outMap.put("CUST_GROUP_TYPE_NAME", outParam.get("custGroupTypeName"));
		outMap.put("STATUS_CODE", outParam.get("statusCode"));
		
		String stTime = (String)outParam.get("startTime");
		outMap.put("START_TIME",stTime);
		
		String edTime = (String)outParam.get("endTime");
		outMap.put("END_TIME",edTime);
		
		outMap.put("CUST_GROUP_NUM", outParam.get("custGroupNum"));
		outMap.put("REGION_CODE", outParam.get("regionCode"));
		outMap.put("REGION_NAME", outParam.get("regionName"));
		outMap.put("GROUP_ID", outParam.get("GroupId"));
		outMap.put("CUSTGROUP_DESC", outParam.get("custGroupDesc"));
		outMap.put("OPER_TIME", outParam.get("operTime"));
		outMap.put("OPER_NO", outParam.get("operNo"));
		outMap.put("OPER_NAME", outParam.get("operName"));
		outMap.put("UPDATE_NO", outParam.get("updateNo"));
		outMap.put("UPDATE_NAME", outParam.get("updateName"));
		outMap.put("UPDATE_TIME", outParam.get("updateTime"));
		outMap.put("GROUP_FORMULA", outParam.get("labelFormula"));
		outMap.put("GROUP_FORMULA_CN", outParam.get("labelFormulaCN"));
		outMap.put("GROUP_LABLE_TYPE", outParam.get("labelType"));
		outMap.put("GROUP_ATTACH_NAME", outParam.get("attachName"));
		outMap.put("USER_TYPE", outParam.get("userType"));
		outMap.put("ATTACH_NAME", outParam.get("attachName"));
		outMap.put("SYSTEM_NAME", outParam.get("systemName"));
		
		outMap.put("SQL_SCRIPT", outParam.get("sqlScript"));
		outMap.put("PERIOD", outParam.get("period"));
		outMap.put("TABEL_NAME", outParam.get("tabelName"));
		outMap.put("DATA_SOURCE", outParam.get("dataSource"));
		outMap.put("EXE_TIME", (String)outParam.get("exeTime"));
		outMap.put("DATA_SOURCE_NAME", outParam.get("dataSourceName"));
		outMap.put("PERIOD_NAME", outParam.get("periodName"));
		outMap.put("USER_TYPE", outParam.get("userType"));
		outMap.put("USER_TYPE_NAME", outParam.get("userTypeName"));
		List<Map<String,Object>> userList = (List<Map<String,Object>>)outParam.get("USER_LABEL_LIST");
		List<Map<String,Object>> newList = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(userList)){
			for(Map<String,Object> inMap:userList){
				Map<String,Object> userMap = new HashMap<String,Object>();
				userMap.put("USER_LABEL_CODE", inMap.get("userLabelCode"));
				userMap.put("USER_LABEL_KEY", inMap.get("userLabelKey"));
				newList.add(userMap);
			}
			
		}
		outMap.put("USER_LABEL_LIST", newList);
		MBean outMbean = new MBean();
		outMbean.setBody(outMap);
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(outMbean);
		
		return standardOutDTO;
	}    
	
	/**
	 * 查询符合标签的客户群数量入参转换
	* @date: 2017-1-24 
	* @author: zhangjj_crmpd
	* @title: queryCustGroupCountByUserLabelInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryCustGroupCountByUserLabelInParam(InDTO inDTO) {
		Map<String,Object> outMap = new HashMap<String,Object>();
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		outMap.put("groupFormula", custGroupMap.get("LABEL_FORMULA")==null?" 1=1 ":custGroupMap.get("LABEL_FORMULA"));
		outMap.put("custGroupId", custGroupMap.get("CUST_GROUP_ID")==null?"":custGroupMap.get("CUST_GROUP_ID"));
		return outMap;
	}
	
	/**
	 * 查询符合标签的客户群数量出参转换
	* @date: 2017-1-24 
	* @author: zhangjj_crmpd
	* @title: queryCustGroupCountByUserLabelOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryCustGroupCountByUserLabelOutParam(
			Map<String, Object> outParam) {
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("COUNT", outParam.get("count")==null?"0":outParam.get("count"));
		MBean outMbean = new MBean();
		outMbean.setBody(outMap);
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(outMbean);
		
		return standardOutDTO;
	}
	/**
	 *  查询二次过滤标签的人数入参转换
	* @date: 2017-4-7 
	* @author: chenhao
	* @title: queryLabelFormulaRestrictCountByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryLabelFormulaRestrictCountByIdInParam(
			InDTO inDTO) {
		Map<String,Object> outMap = new HashMap<String,Object>();
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		outMap.put("custGroupId", custGroupMap.get("CUST_GROUP_ID")==null?"":custGroupMap.get("CUST_GROUP_ID"));
		return outMap;
	}
	
	/**
	 * 查询二次过滤标签的人数出参转换
	* @date: 2017-4-7 
	* @author: chenhao
	* @title: queryLabelFormulaRestrictCountByIdOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryLabelFormulaRestrictCountByIdOutParam(
			Map<String, Object> outParam) {
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("COUNT", outParam.get("count")==null?"0":outParam.get("count"));
		MBean outMbean = new MBean();
		outMbean.setBody(outMap);
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(outMbean);
		return standardOutDTO;
	}

	/**
	 * 查询客户群标签元素入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupLabelItemInParam 
	* @param inDTO
	* @return outMap
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryCustGroupLabelItemInParam(InDTO inDTO) {	
		MBean inBean = inDTO.getMbean();
		Map<String,Object> labelMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("userLabelName", labelMap.get("USER_LABEL_NAME"));
		outMap.put("custGroupId", labelMap.get("CUST_GROUP_ID"));
		outMap.put("busiType", labelMap.get("BUSI_TYPE"));
		
		return outMap;
	}

	/**
	 *  查询客户群标签元素出参处理
	* @date: 2016-9-12 
	* @author: xiongxq
	* @Title: queryCustGroupLabelItemOutParam 
	* @param inMap
	* @return standardOutDTO
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryCustGroupLabelItemOutParam(List<Map<String,Object>> inParam){
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(inParam)){
			for(Map<String,Object> map : inParam){
				Map<String,Object> outMap = new HashMap<String,Object>();
				outMap.put("USER_LABEL_NAME", map.get("userLabelName"));
				outMap.put("USER_LABEL_KEY", map.get("userLabelKey"));
				outMap.put("USER_LABEL_TYPE", map.get("userLabelType"));
				outMap.put("USER_LABEL_BOXTYPE", map.get("userLabelBoxtype"));
				list.add(outMap);
			}
		}
		
		MBean outMbean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("LABEL_LIST", list);
		outMbean.setBody(outMap);
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(outMbean);
		
		return standardOutDTO;
	}

	/**
	 * 查询客户群列表入参转换
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryCustGroupListInParam 
	* @param inDTO
	* @return outMap
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryCustGroupListInParam(InDTO inDTO) throws StrategyError {
		
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		String stTime = (String)custGroupMap.get("START_TIME");
		if(CommonUtils.objectIsNull(stTime) == false){
		    String startTime = DateUtil.stringToString(this.timeConvert(stTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
			outMap.put("startTime", startTime);
			}
		
		String edTime = (String)custGroupMap.get("END_TIME");
		if(CommonUtils.objectIsNull(edTime) == false){
		    String endTime = DateUtil.stringToString(this.timeConvert(edTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
			outMap.put("endTime", endTime);
			}
		
		String custGroupStartDate = (String)custGroupMap.get("CUST_GROUP_OPER_TIME_START");
		if(CommonUtils.objectIsNull(custGroupStartDate) == false){
			Timestamp custGroupOperTimeStart = DateUtil.string2Timestamp(this.timeConvert(custGroupStartDate), DateUtil.TIME_FROMAT_SIMPLE1);
			outMap.put("custGroupOperTimeStart", custGroupOperTimeStart);
			}
		String custGroupEndDate = (String)custGroupMap.get("CUST_GROUP_OPER_TIME_END");
		if(CommonUtils.objectIsNull(custGroupEndDate) == false){
			Timestamp custGroupOperTimeEnd = DateUtil.string2Timestamp(this.timeConvert(custGroupEndDate), DateUtil.TIME_FROMAT_SIMPLE1);
			outMap.put("custGroupOperTimeEnd", custGroupOperTimeEnd);
			}
		
		outMap.put("keyWords", custGroupMap.get("KEY_WORDS"));
		outMap.put("operNo", custGroupMap.get("OPER_NO"));
		outMap.put("isPage", custGroupMap.get("IS_PAGE"));
		outMap.put("queryId", custGroupMap.get("QUERY_ID"));
		outMap.put("custGroupType", custGroupMap.get("CUST_GROUP_TYPE"));
		outMap.put("custGroupStatus",custGroupMap.get("CUST_GROUP_STATUS"));
		outMap.put("perRecordCount", custGroupMap.get("PER_RECORD_COUNT")==null?"10":custGroupMap.get("PER_RECORD_COUNT"));
		outMap.put("regionCode", custGroupMap.get("REGION_CODE"));
		outMap.put("regionCodeArray", custGroupMap.get("REGION_CODE_ARRAY"));
		outMap.put("currentPageCode", custGroupMap.get("CURRENT_PAGE_CODE")==null?"1":custGroupMap.get("CURRENT_PAGE_CODE"));
		outMap.put("totalRecordCount", custGroupMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_CG);
		outMap.put("withoutBlack", custGroupMap.get("WITHOUTBLACK")==null?"false":custGroupMap.get("WITHOUTBLACK"));
		
		return outMap;
	}

	/**
	 * 查询客户群列表出参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupListOutParam 
	* @param inList
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	*/
	@Override
	public StandardOutDTO queryCustGroupListOutParam(Map<String,Object> outParam){
		List<Map<String,Object>> custGroupList = new ArrayList<Map<String,Object>>();
		custGroupList = (List<Map<String,Object>>)outParam.get("custGroupList");
		
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(custGroupList) == false){	
			for(Map<String,Object> innerMap:custGroupList){
				Map<String,Object> custGroupMap = new HashMap<String,Object>();
				custGroupMap.put("CUST_GROUP_ID", innerMap.get("custGroupId"));
				custGroupMap.put("CUST_GROUP_NAME", innerMap.get("custGroupName"));
				custGroupMap.put("CUST_GROUP_TYPE", innerMap.get("custGroupType"));
				custGroupMap.put("CUST_GROUP_TYPE_NAME", innerMap.get("custGroupTypeName"));
				custGroupMap.put("CUST_GROUP_NUM", innerMap.get("custGroupNum"));
				custGroupMap.put("OPER_NO", innerMap.get("operNo"));
				custGroupMap.put("OPER_NAME", innerMap.get("operName"));
				custGroupMap.put("OPER_TIME",innerMap.get("operTime"));
				custGroupMap.put("GROUP_ID",innerMap.get("groupId"));
				custGroupMap.put("GROUP_NAME",innerMap.get("groupName"));
				custGroupMap.put("REGION_CODE",innerMap.get("regionCode"));
				custGroupMap.put("REGION_NAME",innerMap.get("regionName"));
				custGroupMap.put("USER_TYPE",innerMap.get("userType"));
				
				String stTime = (String)innerMap.get("startTime");
				if(CommonUtils.objectIsNull(stTime) == false){
					custGroupMap.put("START_TIME", DateUtil.stringToString(stTime,DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
				}
				
				String edTime = (String)innerMap.get("endTime");
				if(CommonUtils.objectIsNull(edTime) == false){
					custGroupMap.put("END_TIME", DateUtil.stringToString(stTime,DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
				}
				
				custGroupMap.put("CUST_GROUP_DESC", innerMap.get("custGroupDesc"));
				outList.add(custGroupMap);
			}
		}	
		outMap.put("CUST_GROUP_LIST", outList);
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount")==null?0:outParam.get("perRecordCount"));
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount")==null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId"));
		MBean outMbean = new MBean();
		outMbean.setBody(outMap);
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(outMbean);
		return standardOutDTO;
	}
	
	/**
	 * 根据客户群ID查询客户群关系列表入参处理
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupRelationListByCustGroupIdInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupRelationListByCustGroupIdInParam(InDTO inDTO) throws StrategyError {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("parentComponentId", inMap.get("PARENT_CUST_GROUP_ID")==null?"":inMap.get("PARENT_CUST_GROUP_ID"));
		inParam.put("componentId", inMap.get("CUST_GROUP_ID")==null?"":inMap.get("CUST_GROUP_ID"));
		inParam.put("componentType", Const.COMPONENT_TYPE_CUSTGROUP);
		inParam.put("parentComponentType", Const.COMPONENT_TYPE_CUSTGROUP);
		return inParam;
	}
	
	/**
	 * 根据客户群ID查询客户群关系列表出参处理
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupRelationListByCustGroupIdOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCustGroupRelationListByCustGroupIdOutParam(Map<String,Object> outParam) {
		List<Map<String, Object>> list = (List<Map<String, Object>>) outParam.get("queryCustGroupRelationList");
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(list) == false){
			for(Map<String, Object> inMap : list) {
				Map<String, Object> outMap = new HashMap<String, Object>();
				outMap.put("CUST_GROUP_ID", inMap.get("componentId"));
				outMap.put("CUST_GROUP_NAME", inMap.get("custGroupName"));
				outMap.put("PARENT_REL_ID", inMap.get("parentRelId"));
				outList.add(outMap);
			}
		}
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody("QUERY_CUST_GROUP_RELATION_LIST", outList);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	
	/**
	 * 根据id查询客户群模板列表入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupTempListInParam 
	* @param inDTO
	* @return outParam
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryCustGroupTempListInParam(InDTO inDTO) {	
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		Map<String,Object> outParam = new HashMap<String,Object>();
		
		outParam.put("custGroupId", custGroupMap.get("CUST_GROUP_ID"));
		
		return outParam;
	}

	/**
	 * 查询客户群模板列表出参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupTempListOutParam
	* @param inList
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryCustGroupTempListOutParam(Map<String,Object> outParam){
		List<Map<String,Object>> inList = new ArrayList<Map<String,Object>>();
		inList = (List<Map<String,Object>>)outParam.get("CUST_GROUP_LIST");
		
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(outList) == false){
			for(Map<String,Object> innerMap:inList){
				Map<String,Object> noMap = new HashMap<String,Object>();
				noMap.put("CUST_GROUP_ID", innerMap.get("custGroupId"));
				noMap.put("CUST_GROUP_NAME", innerMap.get("custGroupName"));
				noMap.put("CUST_GROUP_TYPE", innerMap.get("custGroupType"));
				noMap.put("CUST_GROUP_NUM", innerMap.get("custGroupNum"));
				noMap.put("OPER_NO", innerMap.get("operNo"));
				noMap.put("OPER_TIME",innerMap.get("operTime"));
				noMap.put("CUST_GROUP_DESC", innerMap.get("custGroupDesc"));
				outList.add(noMap);
			}
		}	
		outMap.put("CUST_GROUP_LIST", outList);
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount")==null?0:outParam.get("perRecordCount"));
		outMap.put("CURRENT_PAGE", outParam.get("currentPage")==null?0:outParam.get("currentPage"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount")==null?0:outParam.get("totalRecordCount"));
		
		MBean outMbean = new MBean();
		outMbean.setBody(outMap);
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(outMbean);
		
		return standardOutDTO;
	}
	
	/**
	 * 查询客户群明细文件列表入参处理
	* @date: 2016-10-30 
	* @author: tangaq
	* @title: queryCustGroupDetailFileListInParam 
	* @param InDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupDetailFileListInParam(InDTO inDTO) throws StrategyError{
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupInventoryMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		String custGroupStartDate = (String)custGroupInventoryMap.get("OPER_TIME_START");
		if(CommonUtils.objectIsNull(custGroupStartDate) == false){
			Timestamp custGroupOperTimeStart = DateUtil.string2Timestamp(this.timeConvert(custGroupStartDate), DateUtil.TIME_FROMAT_SIMPLE1);
			outMap.put("operTimeStart", custGroupOperTimeStart);
			}
		String custGroupEndDate = (String)custGroupInventoryMap.get("OPER_TIME_END");
		if(CommonUtils.objectIsNull(custGroupEndDate) == false){
			Timestamp custGroupOperTimeEnd = DateUtil.string2Timestamp(this.timeConvert(custGroupEndDate), DateUtil.TIME_FROMAT_SIMPLE1);
			outMap.put("operTimeEnd", custGroupOperTimeEnd);
			}
		
		outMap.put("taskName", custGroupInventoryMap.get("TASK_NAME"));
		outMap.put("operNo", custGroupInventoryMap.get("OPER_NO"));
		outMap.put("isPage", custGroupInventoryMap.get("IS_PAGE"));
		outMap.put("queryId", custGroupInventoryMap.get("QUERY_ID"));
		outMap.put("custGroupId", custGroupInventoryMap.get("CUST_GROUP_ID"));
		outMap.put("perRecordCount", custGroupInventoryMap.get("PER_RECORD_COUNT"));
		outMap.put("currentPageCode", custGroupInventoryMap.get("CURRENT_PAGE_CODE"));
		outMap.put("totalRecordCount", custGroupInventoryMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_DLAD);
		
		return outMap;
	}
	
	/**
	 * 查询客户群明细文件列表出参处理
	* @date: 2016-10-30 
	* @author: tangaq
	* @title: queryCustGroupDetailFileListOutParam 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCustGroupDetailFileListOutParam(Map<String,Object> inParam){
		List<Map<String,Object>> custGroupInventoryNewList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> custGroupInventoryList = (List<Map<String,Object>>)inParam.get("custGroupInventoryList");
		if(CommonUtils.objectIsNull(custGroupInventoryList) == false){
			for(Map<String,Object> inventoryMap:custGroupInventoryList){
				Map<String,Object> outMap = new HashMap<String,Object>();
				outMap.put("CUST_GROUP_ID", inventoryMap.get("custGroupId"));
				outMap.put("CUST_GROUP_NAME", inventoryMap.get("custGroupName"));
				outMap.put("SERIAL_ID", inventoryMap.get("serialId"));
				outMap.put("OPER_NO", inventoryMap.get("operNo"));
				outMap.put("OPER_NAME", inventoryMap.get("operName"));
				outMap.put("OPER_TIME", inventoryMap.get("operTime"));
				outMap.put("TASK_TYPE", inventoryMap.get("taskType"));
				outMap.put("TASK_NAME", inventoryMap.get("taskName"));
				outMap.put("REGION_CODE", inventoryMap.get("regionCode"));
				outMap.put("GROUP_ID", inventoryMap.get("groupId"));
				outMap.put("DOWNLOAD_NUM", inventoryMap.get("downloadNum"));
				outMap.put("INVENTORY_NUM", inventoryMap.get("inventoryNum"));
				outMap.put("AUDIT_NO", inventoryMap.get("auditNo"));
				outMap.put("AUDIT_TIME", inventoryMap.get("auditTime"));
				outMap.put("AUDIT_CODE", inventoryMap.get("auditCode"));
				outMap.put("SYSTEM_NAME", inventoryMap.get("systemName"));
				custGroupInventoryNewList.add(outMap);
			}
		}
		
		Map<String,Object> inventoryMap = new HashMap<String,Object>();
		inventoryMap.put("CUST_GROUP_INVENTORY_LIST", custGroupInventoryNewList);
		inventoryMap.put("PER_RECORD_COUNT", inParam.get("perRecordCount")==null?0:inParam.get("perRecordCount"));
		inventoryMap.put("CURRENT_PAGE_CODE", inParam.get("currentPageCode") == null?0:inParam.get("currentPageCode"));
		inventoryMap.put("TOTAL_RECORD_COUNT", inParam.get("totalRecordCount")==null?0:inParam.get("totalRecordCount"));
		inventoryMap.put("QUERY_ID", inParam.get("queryId"));
		MBean outMbean = new MBean();
		outMbean.setBody(inventoryMap);
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(outMbean);
		return standardOutDTO;
		
		
		
	}

	/**
	 * 查询客户群处理记录入参处理
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: queryCustGroupHandleRecordInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryCustGroupHandleRecordInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		String custGroupId = (String)custGroupMap.get("CUST_GROUP_ID");
		outMap.put("custGroupId", custGroupId);
		return outMap;
	}

	/**
	 * 查询客户群处理记录出参处理
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: queryCustGroupHandleRecordOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryCustGroupHandleRecordOutParam(
			Map<String, Object> outParam) {
		List<Map<String,Object>> inList = (List<Map<String, Object>>) outParam.get("custGroupHandleRecordList");
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String,Object> inMap : inList ){
				Map<String,Object> outMap = new HashMap<String,Object>();
				outMap.put("CUST_GROUP_ID", inMap.get("custGroupId"));
				outMap.put("CUST_GROUP_NAME", inMap.get("custGroupName"));
				outMap.put("SERIAL_ID", inMap.get("serialId"));
				outMap.put("DISPOSE_STEP", inMap.get("disposeStep"));
				outMap.put("DISPOSE_DESC", inMap.get("disposeDesc"));
				outMap.put("DISPOSE_TIME", inMap.get("disposeTime"));
				String stTime = (String)inMap.get("startTime");
				if(CommonUtils.objectIsNull(stTime) == false){
					outMap.put("START_TIME", DateUtil.stringToString(stTime,DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
				}
				
				String edTime = (String)inMap.get("endTime");
				if(CommonUtils.objectIsNull(edTime) == false){
					outMap.put("END_TIME", DateUtil.stringToString(edTime,DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
				}
				outMap.put("DISPOSE_STATUS", inMap.get("disposeStatus"));
				outMap.put("DATA_NUM", inMap.get("dataNum"));
				outList.add(outMap);
			}
		}
		Map<String,Object> codeMap =new HashMap<String,Object>();
		codeMap.put("CUST_GROUP_LIST", outList);
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody(codeMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 查询标签码表入参
	* @date: 2017-3-4 
	* @author: yuanchun
	* @title: queryLabelCodeNameListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryLabelCodeNameListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> codeMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("fieldEnName", codeMap.get("FIELD_EN_NAME"));
		outMap.put("fieldDesc", codeMap.get("FIELD_DESC"));
		outMap.put("fieldValueDesc", codeMap.get("FIELD_VALUE_DESC"));
		outMap.put("currentPageCode", codeMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", codeMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", codeMap.get("TOTAL_RECORD_COUNT"));
		return outMap;
	}

	/**
	 * 查询标签码表出参
	* @date: 2017-3-4 
	* @author: yuanchun
	* @title: queryLabelCodeNameListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryLabelCodeNameListOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> inList = outParam.get("result") == null?new ArrayList<Map<String,Object>>():(List<Map<String,Object>>)outParam.get("result");
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String,Object> inMap : inList ){
				Map<String,Object> outMap = new HashMap<String,Object>();
				outMap.put("FIELD_EN_NAME", inMap.get("fieldEnName"));
				outMap.put("FIELD_CN_NAME", inMap.get("fieldCnName"));
				outMap.put("FIELD_VALUE", inMap.get("fieldValue"));
				outMap.put("FIELD_DESC", inMap.get("fieldDesc"));
				outList.add(outMap);
			}
		}
		Map<String,Object> codeMap =new HashMap<String,Object>();
		codeMap.put("CODE_LIST", outList);
		codeMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		codeMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		codeMap.put("TOTAL_RECORD_COUNT", outParam.get("sum") == null?0:outParam.get("sum"));
		outBean.setBody(codeMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 根据标签元素查询标签值入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryLabelValueByCodeInParam 
	* @param inDTO
	* @return outParam
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryLabelValueByCodeInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> labelMap = inBean.getBody();
		Map<String,Object> outParam = new HashMap<String,Object>();
		
		outParam.put("labelCode", labelMap.get("LABEL_CODE"));
		
		return outParam;
	}

	/**
	 * 根据标签元素查询标签值出参转换
	* @date: 2016-9-12 
	* @author: xiongxq
	* @Title: queryLabelValueByCodeOutParam 
	* @param inMap
	* @return standardOutDTO
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public  StandardOutDTO queryLabelValueByCodeOutParam(Map<String,Object> outParam){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("LABEL_NAME", outParam.get("labelName"));
		
		MBean outMbean = new MBean();
		outMbean.setBody(outMap);
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(outMbean);
		
		return standardOutDTO;
	}

	/**
	 * 批量删除号码入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: removeBatchNoFromCustGroupInParam 
	* @param inDTO
	* @return outParam
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> removeBatchNoFromCustGroupInParam(InDTO inDTO) {
		
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("custGroupId", custGroupMap.get("CUST_GROUP_ID"));
		
		return outParam;
	}

	/**
	 * 批量删除号码出参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: removeBatchNoFromCustGroupOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeBatchNoFromCustGroupOutParam() {
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}

	/**
	 * 根据id删除目标客户群入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: removeCustGroupByIdInParam 
	* @param inDTO
	* @return outParam
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> removeCustGroupByIdInParam(InDTO inDTO) {
		
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		Map<String,Object> outParam = new HashMap<String,Object>();
		
		outParam.put("custGroupId", custGroupMap.get("CUST_GROUP_ID"));
		outParam.put("custGroupType", custGroupMap.get("CUST_GROUP_TYPE"));
		
		return outParam;
	}

	/**
	 * 根据id删除目标客户群出参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupByIdOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeCustGroupByIdOutParam(Map<String,Object> outParam) {
		
		MBean outMbean = new MBean();
		outMbean.setBody(outParam);
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(outMbean);
		return standardOutDTO;
	}
	
	/**
	 * 根据子客户群ID删除父客户群与子客户的关系入参处理
	* @date: 2016-11-28 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupRelationByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeCustGroupRelationByIdInParam(InDTO inDTO){
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("componentId", inMap.get("CUST_GROUP_ID"));
		inParam.put("parentComponentId", inMap.get("PARENT_CUST_GROUP_ID"));
		return inParam;
	}
	
	/**
	 * 根据子客户群ID删除父客户群与子客户的关系出参处理
	* @date: 2016-11-28 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupRelationByIdOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeCustGroupRelationByIdOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	
	}
	
	/**
	 * 从目标客户群中删除单个号码入参转换
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: removeSingleNoFromCustGroupInParam 
	* @param inDTO
	* @return outParam
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> removeSingleNoFromCustGroupInParam(InDTO inDTO) {	
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		Map<String,Object> outParam = new HashMap<String,Object>();
		
		outParam.put("custGroupId", custGroupMap.get("CUST_GROUP_ID"));
		outParam.put("phoneNumeber", custGroupMap.get("PHONE_NO"));
		
		return outParam;
	}

	/**
	 * 从目标客户群中删除单个号码出参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: removeSingleNoFromCustGroupOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeSingleNoFromCustGroupOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}

	/**
	 * 保存目标客户群信息入参处理
	* @date: 2016-9-22 
	* @author: xiongxq
	* @Title: saveCustGroupInParam 
	* @return outParam
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> saveCustGroupInParam(InDTO inDTO){
		
		Map<String,Object> outParam = new HashMap<String,Object>();
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		
		String custGroupType = (String)custGroupMap.get("CUST_GROUP_TYPE");
		if(Const.CUSTGROUP_TYPE_LABEL.equals(custGroupType) || Const.CUSTGROUP_TYPE_LABEL_STATIC.equals(custGroupType)){
			outParam = this.saveLabelCustGroupInParam(inDTO);
		}else if(Const.CUSTGROUP_TYPE_LOAD.equals(custGroupType) || Const.CUSTGROUP_TYPE_BLACK.equals(custGroupType) ){
			outParam = this.saveLoadCustGroupInParam(inDTO);
		}else if(Const.CUSTGROUP_TYPE_DB.equals(custGroupType)){
			outParam = this.saveDataTermCustGroupInParam(inDTO);
		}
		
		return outParam;
	}

	/**
	 * 保存目标客户群信息出参处理
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupOutParam 
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveCustGroupOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		mbean.setBody("CUST_GROUP_ID", outParam.get("custGroupId"));
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}
	
	/**
	 * 保存目标客户群与子客户群关系入参处理
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupRelationInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveCustGroupRelationInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("componentId", inMap.get("CUST_GROUP_ID"));
		inParam.put("parentComponentId", inMap.get("PARENT_CUST_GROUP_ID"));
		inParam.put("parentRelId", inMap.get("PARENT_REL_ID"));
		inParam.put("relId", SequenceUtil.getSequence());
		inParam.put("componentType", Const.COMPONENT_TYPE_CUSTGROUP);
		inParam.put("parentComponentType", Const.COMPONENT_TYPE_CUSTGROUP);
		return inParam;
	}
	
	/**
	 * 保存目标客户群与子客户群关系出参处理
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupRelationOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveCustGroupRelationOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}
	
	/**
	 * 添加单个号码到目标客户群Common节点入参转换
	* @date: 2017-2-23 
	* @author: zhangjj_crmpd
	* @title: addSingleNoToCustGroupCommonInParam 
	* @param body
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> addSingleNoToCustGroupCommonInParam(Map<String, Object> body) {
		Map<String, Object> common = (Map<String, Object>) body.get("COMMON_INFO");
		Map<String, Object> commonOut = new HashMap<String, Object>(); 
		if(CommonUtils.objectIsNull(common)){
			return commonOut;
		}
		commonOut.put("busiAppId", CommonUtils.toString(common.get("BUSI_APP_ID")) );
		commonOut.put("systemId", CommonUtils.toString(common.get("SYSTEM_ID")) );
		return commonOut;
	}
	
	/**
	 * 保存数据库模式客户群入参处理
	* @date: 2016-9-22 
	* @author: xiongxq
	* @Title: saveDataTermCustGroupInParam 
	* @param inDTO
	* @return outParam
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> saveDataTermCustGroupInParam(InDTO inDTO){
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		Map<String,Object> outParam = new HashMap<String,Object>();
		
		outParam.put("custGroupId", custGroupMap.get("CUST_GROUP_ID"));
		outParam.put("custGroupType", custGroupMap.get("CUST_GROUP_TYPE"));
		outParam.put("custGroupName", custGroupMap.get("CUST_GROUP_NAME"));
		outParam.put("custGroupDesc", custGroupMap.get("CUST_GROUP_DESC"));
		outParam.put("custGroupUpdate", custGroupMap.get("CUST_GROUP_UPDATE"));
		
		String stTime = (String)custGroupMap.get("START_TIME");
		if(!CommonUtils.objectIsNull(stTime) ){
			String startTime = DateUtil.stringToString(this.timeConvert(stTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
			outParam.put("startTime", startTime);
		}
		
		String edTime = (String)custGroupMap.get("END_TIME");
		if(!CommonUtils.objectIsNull(edTime) ){
			String endTime = DateUtil.stringToString(this.timeConvert(edTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
			outParam.put("endTime",endTime );
		}
		
		String exTime = (String)custGroupMap.get("EXE_TIME");
		if(!CommonUtils.objectIsNull(exTime)){
			String exeTime = DateUtil.stringToString(exTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		    outParam.put("exeTime",exeTime);
		}
		
		outParam.put("statusCode", custGroupMap.get("STATUS_CODE"));
		outParam.put("sqlScript", custGroupMap.get("SQL_SCRIPT"));
		outParam.put("dataSource", custGroupMap.get("DATE_SOURCE"));
		outParam.put("period", custGroupMap.get("PERIOD"));
		outParam.put("tabelName", custGroupMap.get("TABEL_NAME"));
		outParam.put("operNo", custGroupMap.get("OPER_NO"));
		outParam.put("operName", custGroupMap.get("OPER_NAME"));
		outParam.put("regionCode", custGroupMap.get("REGION_CODE"));
		outParam.put("groupId", custGroupMap.get("GROUP_ID"));
		outParam.put("groupName", custGroupMap.get("GROUP_NAME"));
		outParam.put("relatedDataSourceName", custGroupMap.get("RELATED_DATA_SOURCE_NAME"));
		outParam.put("userType", custGroupMap.get("USER_TYPE"));
		return outParam;
	}

	/**
	 * 保存标签客户群入参转换 
	* @date: 2016-9-22 
	* @author: xiongxq
	* @Title: saveLabelCustGroupInParam 
	* @param inDTO
	* @return outParam
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-12: luogj: 增加label_type入参处理
	 */
	protected Map<String,Object> saveLabelCustGroupInParam(InDTO inDTO){
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("custGroupId", custGroupMap.get("CUST_GROUP_ID"));
		outParam.put("custGroupType", custGroupMap.get("CUST_GROUP_TYPE"));
		outParam.put("custGroupName", custGroupMap.get("CUST_GROUP_NAME"));
		outParam.put("custGroupDesc", custGroupMap.get("CUST_GROUP_DESC"));
		
 		String stTime = (String)custGroupMap.get("START_TIME");
		if(!CommonUtils.objectIsNull(stTime) ){
		String startTime = DateUtil.stringToString(this.timeConvert(stTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		outParam.put("startTime", startTime);
		}
		
		String edTime = (String)custGroupMap.get("END_TIME");
		if(!CommonUtils.objectIsNull(edTime) ){
		String endTime = DateUtil.stringToString(this.timeConvert(edTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		outParam.put("endTime",endTime );
		}
		
		outParam.put("operNo", custGroupMap.get("OPER_NO"));
		outParam.put("operName", custGroupMap.get("OPER_NAME"));
		outParam.put("regionCode", custGroupMap.get("REGION_CODE"));
		outParam.put("groupId", custGroupMap.get("GROUP_ID"));
		outParam.put("groupName", custGroupMap.get("GROUP_NAME"));
		outParam.put("labelFormula", custGroupMap.get("GROUP_FORMULA"));
		outParam.put("labelFormulaCN", custGroupMap.get("GROUP_FORMULA_CN"));
		outParam.put("calculateFormula", custGroupMap.get("CALCULATE_FORMULA"));
		outParam.put("labelDesc", custGroupMap.get("LABEL_DESC"));
		outParam.put("labelType", custGroupMap.get("LABEL_TYPE"));
		outParam.put("userType", custGroupMap.get("USER_TYPE"));
		outParam.put("label_formula_restrict", custGroupMap.get("LABEL_FORMULA_RESTRICT"));
		return outParam;
	}

	/**
	 * 保存导入客户群入参转换
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: saveLoadCustGroupInParam
	* @param inDTO
	* @return outParam
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> saveLoadCustGroupInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> custGroupMap = inBean.getBody();
		Map<String,Object> outParam = new HashMap<String,Object>();
		
		String stTime = (String)custGroupMap.get("START_TIME");
		if(!CommonUtils.objectIsNull(stTime) ){
		String startTime = DateUtil.stringToString(this.timeConvert(stTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		outParam.put("startTime", startTime);
		}
		
		String edTime = (String)custGroupMap.get("END_TIME");
		if(!CommonUtils.objectIsNull(edTime) ){
		String endTime = DateUtil.stringToString(this.timeConvert(edTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		outParam.put("endTime",endTime );
		}
		outParam.put("custGroupId", custGroupMap.get("CUST_GROUP_ID"));
		outParam.put("relatedDataSourceName", custGroupMap.get("RELATED_DATASOURCE_NAME"));
		outParam.put("relatedDataSourceType", custGroupMap.get("RELATED_DATASOURCE_TYPE"));
		outParam.put("custGroupType", custGroupMap.get("CUST_GROUP_TYPE"));
		outParam.put("custGroupName", custGroupMap.get("CUST_GROUP_NAME"));
		outParam.put("groupId", custGroupMap.get("GROUP_ID"));
		outParam.put("groupName", custGroupMap.get("GROUP_NAME"));
		outParam.put("regionCode", custGroupMap.get("REGION_CODE"));
		outParam.put("custGroupDesc", custGroupMap.get("CUST_GROUP_DESC"));
		outParam.put("operNo", custGroupMap.get("OPER_NO"));
		outParam.put("operName", custGroupMap.get("OPER_NAME"));
		outParam.put("fileName", custGroupMap.get("FILE_NAME"));
		outParam.put("custGroupStatus", custGroupMap.get("CUST_GROUP_STATUS"));
		outParam.put("operType", custGroupMap.get("OPER_TYPE"));
		outParam.put("attachName", custGroupMap.get("ATTACH_NAME"));
		outParam.put("systemName", custGroupMap.get("SYSTEM_NAME"));
		outParam.put("note", custGroupMap.get("NOTE"));
		outParam.put("userType", custGroupMap.get("USER_TYPE"));
		outParam.put("custGroupNum", custGroupMap.get("CUST_GROUP_NUM"));
		outParam.put("label_formula_restrict",custGroupMap.get("LABEL_FORMULA_RESTRICT"));
		return outParam;
	}
	
	/**
	  * 时间参数的转换
	* @date: 2016-9-21 
	* @author: xiongxq
	* @Title: timeConvert 
	* @param time
	* @return inParamTime
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected String timeConvert(String inParamTime){
		if(inParamTime.indexOf(":")<Integer.valueOf(Const.FLASE_INT)){
			return inParamTime+" 00:00:00";
		}
		return inParamTime;
	}



}
