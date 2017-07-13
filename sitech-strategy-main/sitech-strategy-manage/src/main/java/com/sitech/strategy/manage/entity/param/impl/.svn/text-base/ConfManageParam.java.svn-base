package com.sitech.strategy.manage.entity.param.impl;

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
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IConfManageParam;

/**
 * 配置管理参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: ConfManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ConfManageParam implements IConfManageParam {
	
	/**
	 * 查询区域优先级配置列表入参转换
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: queryAreaPriorityConfigListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryAreaPriorityConfigListInParam(InDTO inDTO) {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> inMap = mbean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("marketCaseId", inMap.get("MARKET_CASE_ID"));
		inParam.put("channelId", inMap.get("CHANNEL_ID"));
		return inParam;
	}
	
	/**
	 * 查询区域优先级配置列表出参转换
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: queryAreaPriorityConfigListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryAreaPriorityConfigListOutParam(Map<String,Object> outParam) {
		List<Map<String,Object>> areaList = (List<Map<String, Object>>) outParam.get("areaPriorityConfigList");
		List<Map<String,Object>> outAreaList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(areaList) == false){
			for(Map<String,Object> areaDetailMap : areaList){
				Map<String,Object> areaDetailNewMap = new HashMap<String,Object>();
				areaDetailNewMap.put("MARKET_CASE_ID", areaDetailMap.get("marketCaseId"));
				areaDetailNewMap.put("CHANNEL_ID", areaDetailMap.get("channelId"));
				areaDetailNewMap.put("SERIAL_ID", areaDetailMap.get("serialId"));
				areaDetailNewMap.put("REGION_CODE", areaDetailMap.get("regionCode"));
				areaDetailNewMap.put("REGION_NAME", areaDetailMap.get("regionName"));
				areaDetailNewMap.put("REGION_PRIORITY_CLASS", areaDetailMap.get("regionPriorityClass").toString());
				outAreaList.add(areaDetailNewMap);
			}
		}
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("AREA_PRIORITY_CONFIG_LIST", outAreaList);	
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
		
	/**
	 * 查询选择配置列表入参处理 
	* @date: 2016-10-22 
	* @author: xiongxq
	* @Title: queryChoiceConfigListInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryChoiceConfigListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> auditMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("keyWords", auditMap.get("KEY_WORDS"));
		outMap.put("fieldValue", auditMap.get("FIELD_VALUE"));
		outMap.put("fieldEnName", auditMap.get("FIELD_EN_NAME"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_CHOICE);
		outMap.put("currentPageCode", auditMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", auditMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", auditMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("queryId", auditMap.get("QUERY_ID"));
		outMap.put("sortFlag", auditMap.get("SORT_FLAG"));
		outMap.put("sortField", auditMap.get("SORT_FIELD"));
		return outMap;
	}

	/**
	 * 查询选项配置列表出参处理 
	* @date: 2016-10-22 
	* @author: xiongxq
	* @Title: queryChoiceConfigListOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryChoiceConfigListOutParam(
			Map<String, Object> outParam) {
		List<Map<String,Object>> inList = (List<Map<String, Object>>) outParam.get("choiceList");
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String,Object> inMap : inList ){
				Map<String,Object> outMap = new HashMap<String,Object>();
				outMap.put("FIELD_EN_NAME",inMap.get("fieldEnName"));
				outMap.put("FIELD_CN_NAME",inMap.get("fieldCnName"));
				outMap.put("FIELD_DESC",inMap.get("fieldDesc"));
				outMap.put("FIELD_ORDER",inMap.get("fieldOrder"));
				outMap.put("FIELD_VALUE",inMap.get("fieldValue"));
				outList.add(outMap);
			}
		}
		Map<String,Object> auditDownLoadMap =new HashMap<String,Object>();
		auditDownLoadMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		auditDownLoadMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		auditDownLoadMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		auditDownLoadMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		auditDownLoadMap.put("CHOICE_LIST", outList);
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody(auditDownLoadMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 查询用户群优先级配置列表入参转换
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupPriorityConfigListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupPriorityConfigListInParam(InDTO inDTO) {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> inMap = mbean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("marketCaseId", inMap.get("MARKET_CASE_ID"));
		//inParam.put("channelId", inMap.get("CHANNEL_ID"));
		return inParam;
	}
	
	/**
	 * 查询用户群优先级配置列表出参转换
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupPriorityConfigListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCustGroupPriorityConfigListOutParam(Map<String,Object> outParam) {
		List<Map<String,Object>> custGroupList = (List<Map<String, Object>>) outParam.get("custGroupPriorityConfigList");
		List<Map<String,Object>> outCustGroupList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(custGroupList) == false){
			for(Map<String,Object> custGroupDetailMap : custGroupList){
				Map<String,Object> custGroupDetailNewMap = new HashMap<String,Object>();
				custGroupDetailNewMap.put("CUST_GROUP_ID", custGroupDetailMap.get("custGroupId"));
				custGroupDetailNewMap.put("CUST_GROUP_NAME", custGroupDetailMap.get("custGroupName"));
				custGroupDetailNewMap.put("CUST_GROUP_PRIORITY_CLASS", custGroupDetailMap.get("custGroupPriorityClass").toString());
				outCustGroupList.add(custGroupDetailNewMap);
			}
		}
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("CUST_GROUP_PRIORITY_CONFIG_LIST", outCustGroupList);
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 查询主页面优先级列表入参转换
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: queryPriorityConfigListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryPriorityConfigListInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String,Object> inMap = bean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("keyWord", inMap.get("KEY_WORDS"));
		inParam.put("channelId", inMap.get("CHANNEL_ID"));
		inParam.put("marketCaseType", inMap.get("MARKET_CASE_TYPE"));
		inParam.put("marketCaseBusiType", inMap.get("MARKET_CASE_BUSI_TYPE"));
		inParam.put("sortFlag", inMap.get("SORT_FLAG"));
		inParam.put("sortField", inMap.get("SORT_FIELD"));
		inParam.put("queryListType", Const.QUERY_LIST_TYPE_PC);
		inParam.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		inParam.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		inParam.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		inParam.put("queryId", inMap.get("QUERY_ID"));
		return inParam;
	}

	/**
	 * 查询主页面优先级列表出参转换
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: queryPriorityConfigListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryPriorityConfigListOutParam(Map<String, Object> outParam) {
		List<Map<String,Object>> marketCaseNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		List<Map<String,Object>> inList = (List<Map<String, Object>>) outParam.get("priorityConfigList");
		if(CommonUtils.objectIsNull(inList) == false){
		  for(Map<String,Object> basic:inList){
			Map<String,Object> marketCaseMap = new HashMap<String,Object>();
		    marketCaseMap.put("MARKET_CASE_ID", basic.get("marketCaseId"));
		    marketCaseMap.put("MARKET_CASE_NAME", basic.get("marketCaseName"));
		    marketCaseMap.put("MARKET_CASE_TYPE", basic.get("marketCaseType"));
		    marketCaseMap.put("MARKET_CASE_BUSI_TYPE", basic.get("marketCaseBusiType"));
		    marketCaseMap.put("PRIORITY_TYPE", basic.get("priorityType"));
		    marketCaseMap.put("MARKET_CASE_TYPE_NAME", basic.get("marketCaseTypeName"));
		    marketCaseMap.put("MARKET_CASE_BUSI_TYPE_NAME", basic.get("marketCaseBusiTypeName"));
		    marketCaseMap.put("OPER_TIME", basic.get("operTime"));
		    String stTime = (String)basic.get("startTime");
		    String edTime = (String)basic.get("endTime");
		    if(CommonUtils.objectIsNull(stTime) == false){
			   String startTime = DateUtil.stringToString(stTime, DateUtil.TIME_FROMAT_SIMPLE3, DateUtil.DATE_FROMAT_YYYYMMDD2);
			   marketCaseMap.put("START_TIME", startTime);
			}
			if(CommonUtils.objectIsNull(edTime) == false){
			   String endTime = DateUtil.stringToString(edTime, DateUtil.TIME_FROMAT_SIMPLE3, DateUtil.DATE_FROMAT_YYYYMMDD2);
			   marketCaseMap.put("END_TIME", endTime);
			}
			
			marketCaseMap.put("STATUS_CODE", basic.get("statusCode"));
			marketCaseMap.put("STATUS_NAME", basic.get("statusName"));
			marketCaseMap.put("OPER_NO", basic.get("operNo"));
			marketCaseMap.put("OPER_NAME", basic.get("operName"));
			marketCaseMap.put("CUST_GROUP_NUM", basic.get("custGroupNum"));
			marketCaseMap.put("GROUP_ID", basic.get("groupId"));
			marketCaseMap.put("GROUP_NAME", basic.get("groupName"));
			marketCaseMap.put("REGION_CODE", basic.get("regionCode"));
			marketCaseMap.put("REGION_NAME", basic.get("regionName"));
			marketCaseMap.put("MARKET_CASE_LEVEL", basic.get("marketCaseLevel"));
			marketCaseMap.put("MARKET_CASE_CLASS", basic.get("marketCaseClass"));
			marketCaseMap.put("MARKET_CASE_LEVEL_NAME", basic.get("marketCaseLevelName"));
			marketCaseMap.put("MARKET_CASE_CLASS_NAME", basic.get("marketCaseClassName"));
			marketCaseMap.put("REGION_PRIORITY_CLASS", basic.get("regionPriorityClass"));
			marketCaseNewList.add(marketCaseMap);
		   }
		}
		outMap.put("MARKET_CASE_LIST", marketCaseNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 删除区域优先级配置入参转换
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: removeAreaPriorityConfigInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removeAreaPriorityConfigInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String,Object> inMap = bean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("marketCaseId", inMap.get("MARKET_CASE_ID"));
		inParam.put("channelId", inMap.get("CHANNEL_ID"));
		inParam.put("regionCode", inMap.get("REGION_CODE"));
		return inParam;
	}

	/**
	 * 删除区域优先级配置出参转换
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: removeAreaPriorityConfigOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeAreaPriorityConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 删除选项配置入参处理 
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: removeChoiceConfigInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> removeChoiceConfigInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("fieldValue", inMap.get("FIELD_VALUE"));
		inParam.put("fieldEnName", inMap.get("FIELD_EN_NAME"));
		return inParam;
	}

	/** 
	 * 删除选项配置出参处理
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: removeChoiceConfigOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO removeChoiceConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 删除用户群优先级配置入参转换
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupPriorityConfigInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removeCustGroupPriorityConfigInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String,Object> inMap = bean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("marketCaseId", inMap.get("MARKET_CASE_ID"));
		inParam.put("channelId", inMap.get("CHANNEL_ID"));
		inParam.put("custGroupId", inMap.get("CUST_GROUP_ID"));
		return inParam;
	}

	/**
	 * 删除用户群优先级配置出参转换
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupPriorityConfigOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeCustGroupPriorityConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 新增区域优先级配置入参转换
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: saveAreaPriorityConfigInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveAreaPriorityConfigInParam(InDTO inDTO) {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> inMap = mbean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("serialId", SequenceUtil.getSequence());
		inParam.put("marketCaseId", inMap.get("MARKET_CASE_ID"));
		inParam.put("channelId", inMap.get("CHANNEL_ID"));
		inParam.put("regionCode", inMap.get("REGION_CODE"));
		inParam.put("regionPriorityClass", inMap.get("REGION_PRIORITY_CLASS"));
		return inParam;
	}

	/**
	 * 新增区域优先级配置出参转换
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: saveAreaPriorityConfigOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveAreaPriorityConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 保存选项配置入参处理 
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: saveChoiceConfigInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> saveChoiceConfigInParam(InDTO inDTO) {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> inMap = mbean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("fieldValue", inMap.get("FIELD_VALUE"));
		inParam.put("fieldCnName", inMap.get("FIELD_CN_NAME"));
		inParam.put("fieldEnName", inMap.get("FIELD_EN_NAME"));
		inParam.put("fieldDesc", inMap.get("FIELD_DESC"));
		inParam.put("fieldOrder", inMap.get("FIELD_ORDER"));
		return inParam;
	}

	/**
	 * 保存选项配置出参处理 
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: saveChoiceConfigOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO saveChoiceConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 新增优先级配置入参转换
	* @date: 2016-10-11 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupPriorityConfigInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveCustGroupPriorityConfigInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("serialId", SequenceUtil.getSequence());
		inParam.put("marketCaseId", inMap.get("MARKET_CASE_ID"));
		inParam.put("channelId", inMap.get("CHANNEL_ID"));
		inParam.put("custGroupId", inMap.get("CUST_GROUP_ID"));
		inParam.put("custGroupName", inMap.get("CUST_GROUP_NAME"));
		inParam.put("custGroupPriorityClass", inMap.get("CUST_GROUP_PRIORITY_CLASS"));
		return inParam;
	}

	/**
	 * 保存优先级配置出参转换
	* @date: 2016-10-11 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupPriorityConfigOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveCustGroupPriorityConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 修改选项配置入参处理 
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: updateChoiceConfigInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> updateChoiceConfigInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("fieldValue", inMap.get("FIELD_VALUE"));
		inParam.put("fieldCnName", inMap.get("FIELD_CN_NAME"));
		inParam.put("fieldEnName", inMap.get("FIELD_EN_NAME"));
		inParam.put("fieldDesc", inMap.get("FIELD_DESC"));
		inParam.put("fieldOrder", inMap.get("FIELD_ORDER"));
		return inParam;
	}

	/** 
	 * 修改选项配置出参处理
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: updateChoiceConfigOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO updateChoiceConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
}
