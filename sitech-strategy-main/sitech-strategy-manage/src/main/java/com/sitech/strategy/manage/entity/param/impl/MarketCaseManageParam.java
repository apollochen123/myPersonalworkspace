package com.sitech.strategy.manage.entity.param.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.pojo.inter.IMarketCaseDetailPojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IMarketCaseManageParam;

/**
 * 出入参数大小写转换实体
* @date: 2016-9-14 
* @author: tangaq
* @title: MarketCaseManageParam 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class MarketCaseManageParam  extends BaseManageEntity  implements IMarketCaseManageParam {

	/**
	 * 权限下放入参处理
	* @date: 2016-10-13 
	* @author: tangaq
	* @title: assignMarketCasePermissionByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> assignMarketCasePermissionByIdInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("marketCaseId", inMap.get("MARKET_CASE_ID"));
		inParam.put("marketCaseLevel", inMap.get("MARKET_CASE_LEVEL"));
		return inParam;
	}


	/**
	 * 权限下放出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: assignMarketCasePermissionByIdOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO assignMarketCasePermissionByIdOutParam(){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	/**
	 * 根据营销案名称查询营销案信息入参处理
	* @date: 2017-3-7 
	* @author: yuanliang
	* @title: queryMarketCaseByNameInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseBasicByNameInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();

		outMap.put("marketCaseName", inMap.get("MARKET_CASE_NAME"));

		return outMap;
	}
	/**
	 * 根据营销案名称查询营销案信息出参处理
	* @date: 2017-3-7 
	* @author: yuanliang
	* @title: queryMarketCaseByNameOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMarketCaseBasicByNameOutParam(
			List<Map<String,Object>> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> marketCaseList = new ArrayList<Map<String,Object>>();
		
		List<Map<String,Object>> inList = outParam;
		if(CommonUtils.objectIsNull(inList) == false){
		  for(Map<String,Object> marketCaseMap : inList){
			Map<String,Object> marketCaseNewMap = new HashMap<String,Object>();
			//目前前台只是查询是否存在营销案，后续根据不同场景需要可以进行其他信息的补充完善。
			marketCaseNewMap.put("MARKET_CASE_NAME", marketCaseMap.get("marketCaseName"));


		    marketCaseList.add(marketCaseNewMap);
		  }
		}
		outMap.put("MARKET_CASE_BASIC_LIST",marketCaseList);

		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}	
	/**
	 * 查询营销案模板列表入参处理
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: queryMarketCaseTempListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryMarketCaseTempListInParam(InDTO inDTO){
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		//不知道查询条件
		
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_MCT);
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("isPage", inMap.get("IS_PAGE"));
		outMap.put("isSort", inMap.get("IS_Sort"));
		outMap.put("loginNo", inMap.get("LOGIN_NO"));
		return outMap;
	}
	
	/**
	 * 查询营销案列表入参处理
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: queryMarketCaseListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryMarketCaseListInParam(InDTO inDTO){
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("keyWords", inMap.get("KEY_WORDS"));
		outMap.put("marketCaseType", inMap.get("MARKET_CASE_TYPE"));
		outMap.put("triggerMode", inMap.get("TRIGGER_MODE"));
		outMap.put("marketCaseBusiType", inMap.get("MARKET_CASE_BUSI_TYPE"));
		outMap.put("positionId", inMap.get("POSITION_ID"));
		outMap.put("statusCode", inMap.get("STATUS_CODE"));
		outMap.put("channelId", inMap.get("CHANNEL_ID"));
		outMap.put("regionCode", inMap.get("REGION_CODE"));
		outMap.put("regionCodeArray", inMap.get("REGION_CODE_ARRAY"));
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_MC);
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("isSort", inMap.get("IS_SORT"));
		outMap.put("operNo", inMap.get("OPER_NO"));
		outMap.put("marketCaseId", inMap.get("MARKET_CASE_ID"));
		return outMap;
	}
	
	/**
	 * 查询营销案列表出参处理
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: queryMarketCaseListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMarketCaseListOutParam(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> marketCaseNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		List<Map<String,Object>> inList = (List<Map<String, Object>>) outParam.get("marketCaseList");
		if(CommonUtils.objectIsNull(inList) == false){
		  for(Map<String,Object> basic:inList){
			Map<String,Object> marketCaseMap = new HashMap<String,Object>();
		    marketCaseMap.put("MARKET_CASE_ID", basic.get("marketCaseId"));
		    marketCaseMap.put("MARKET_CASE_NAME", basic.get("marketCaseName"));
		    marketCaseMap.put("MARKET_CASE_TYPE", basic.get("marketCaseType"));
		    marketCaseMap.put("TRIGGER_MODE", basic.get("triggerMode"));
		    marketCaseMap.put("PUSH_MODE", basic.get("pushMode"));
		    
		    marketCaseMap.put("TRIGGER_MODE_NAME",basic.get("triggerModeName"));
		    marketCaseMap.put("MARKET_CASE_BUSI_TYPE", basic.get("marketCaseBusiType"));
		    marketCaseMap.put("MARKET_CASE_TYPE_NAME", basic.get("marketCaseTypeName"));
		    marketCaseMap.put("MARKET_CASE_BUSI_TYPE_NAME", basic.get("marketCaseBusiTypeName"));
			marketCaseMap.put("OPER_TIME", basic.get("operTime"));
	
		    String stTime = (String)basic.get("startTime");
		    String edTime = (String)basic.get("endTime");
			if(CommonUtils.objectIsNull(stTime) == false){
			   String startTime = DateUtil.stringToString(stTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2);
			   marketCaseMap.put("START_TIME", startTime);
			}
			if(CommonUtils.objectIsNull(edTime) == false){
			   String endTime = DateUtil.stringToString(edTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2);
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
			marketCaseMap.put("GROUP_NAME", basic.get("groupName"));
			marketCaseMap.put("MARKET_CASE_LEVEL", basic.get("marketCaseLevel"));
			marketCaseMap.put("MARKET_CASE_CLASS", basic.get("marketCaseClass"));
			marketCaseMap.put("MARKET_CASE_LEVEL_NAME", basic.get("marketCaseLevelName"));
			marketCaseMap.put("MARKET_CASE_CLASS_NAME", basic.get("marketCaseClassName"));
			marketCaseNewList.add(marketCaseMap);
		
		   }
		}
		
		outMap.put("MARKET_CASE_LIST", marketCaseNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 根据权限查询营销案列表入参处理
	* @date: 2017-1-5 
	* @author: yuanchun
	* @title: queryMarketCaseListByPermissionInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseListByPermissionInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("regionCode", inMap.get("REGION_CODE"));
		outMap.put("keyWords", inMap.get("KEY_WORDS"));
		outMap.put("marketCaseType", inMap.get("MARKET_CASE_TYPE"));
		outMap.put("marketCaseBusiType", inMap.get("MARKET_CASE_BUSI_TYPE"));
		outMap.put("marketCaseLevel", inMap.get("MARKET_CASE_LEVEL"));
		outMap.put("positionId", inMap.get("POSITION_ID"));
		outMap.put("statusCode", inMap.get("STATUS_CODE"));
		outMap.put("channelId", inMap.get("CHANNEL_ID"));
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		return outMap;
	}

	/**
	 * 根据权限查询营销案列表出参处理
	* @date: 2017-1-5 
	* @author: yuanchun
	* @title: queryMarketCaseListByPermissionOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMarketCaseListByPermissionOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> marketCaseNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		List<Map<String,Object>> inList = (List<Map<String, Object>>) outParam.get("marketCaseList");
		if(CommonUtils.objectIsNull(inList) == false){
		  for(Map<String,Object> basic:inList){
			Map<String,Object> marketCaseMap = new HashMap<String,Object>();
		    marketCaseMap.put("MARKET_CASE_ID", basic.get("marketCaseId"));
		    marketCaseMap.put("MARKET_CASE_NAME", basic.get("marketCaseName"));
		    marketCaseMap.put("MARKET_CASE_TYPE", basic.get("marketCaseType"));
		    marketCaseMap.put("TRIGGER_MODE", basic.get("triggerMode"));
		    
		    marketCaseMap.put("TRIGGER_MODE_NAME",basic.get("triggerModeName"));
		    marketCaseMap.put("MARKET_CASE_BUSI_TYPE", basic.get("marketCaseBusiType"));
		    marketCaseMap.put("MARKET_CASE_TYPE_NAME", basic.get("marketCaseTypeName"));
		    marketCaseMap.put("MARKET_CASE_BUSI_TYPE_NAME", basic.get("marketCaseBusiTypeName"));
			marketCaseMap.put("OPER_TIME", basic.get("operTime"));
			
			String stTime = (String)basic.get("startTime");
		    String edTime = (String)basic.get("endTime");
			if(CommonUtils.objectIsNull(stTime) == false){
			   String startTime = DateUtil.stringToString(stTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2);
			   marketCaseMap.put("START_TIME", startTime);
			}
			if(CommonUtils.objectIsNull(edTime) == false){
			   String endTime = DateUtil.stringToString(edTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2);
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
			marketCaseMap.put("GROUP_NAME", basic.get("groupName"));
			marketCaseMap.put("MARKET_CASE_LEVEL", basic.get("marketCaseLevel"));
			marketCaseMap.put("MARKET_CASE_CLASS", basic.get("marketCaseClass"));
			marketCaseMap.put("MARKET_CASE_LEVEL_NAME", basic.get("marketCaseLevelName"));
			marketCaseMap.put("MARKET_CASE_CLASS_NAME", basic.get("marketCaseClassName"));
			marketCaseNewList.add(marketCaseMap);
		
		   }
		}
		
		outMap.put("MARKET_CASE_LIST", marketCaseNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	
	
	/**
	 * 根据ID查询营销案、审批详细信息入参处理
	* @date: 2016-10-1 
	* @author: tangaq
	* @title: queryMarketCaseAuditDetailByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseAuditDetailByIdInParam(InDTO inDTO) {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> marketCaseAuditMap = (Map<String,Object>)mbean.getBody();
		Map<String,Object> marketCaseAuditNewMap = new HashMap<String,Object>();
		marketCaseAuditNewMap.put("marketCaseId", marketCaseAuditMap.get("MARKET_CASE_ID"));
		marketCaseAuditNewMap.put("auditRecordId", marketCaseAuditMap.get("AUDIT_RECORD_ID"));
	
		return marketCaseAuditNewMap;
	}

	/**
	 * 根据ID查询营销案、审批详细信息出参处理
	* @date: 2016-10-1 
	* @author: tangaq
	* @title: queryMarketCaseAuditDetailByIdOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMarketCaseAuditDetailByIdOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		Map<String,Object> marketCaseBasicMap = (Map<String,Object>)outParam.get("marketCaseBasic");
		Map<String,Object> marketCaseBasicNewMap = this.marketCaseBasicMapOutParam(marketCaseBasicMap);
		
		Map<String,Object> marketCaseDetail = (Map<String,Object>)outParam.get("marketCaseDetail");
		Map<String,Object> marketCaseNewDetail = this.marketCaseNewDetailOutParam(marketCaseDetail);
	
		
		Map<String,Object> auditDetail = (Map<String,Object>)outParam.get("auditDetail");
	    Map<String,Object> auditNewDetail = this.auditNewDetailOutParam(auditDetail);
	    
		Map<String,Object> actDetail = (Map<String,Object>)outParam.get("actDemandMap");
		Map<String,Object> actNewDetail = this.getActDemandDetailOutParams(actDetail);
	    
	    List<Map<String, Object>> auditDetailList = (List<Map<String, Object>>)outParam.get("auditDetailList");
	    List<Map<String, Object>> auditDetailNewList = this.auditDetailNewListOutParam(auditDetailList);
	    
	    Map<String,Object> marketCaseAuditDetail = this.marketCaseAuditDetailOutParam(marketCaseBasicNewMap,marketCaseNewDetail,auditNewDetail,auditDetailNewList,actNewDetail);
		
		MBean outBean = new MBean();
		outBean.setBody(marketCaseAuditDetail);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 查询营销案详细信息列表入参
	* @date: 2017-3-3 
	* @author: yuanliang
	* @title: queryMarketCaseDetailListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseDetailListInParam(InDTO inDTO) {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> marketCaseId = (Map<String,Object>)mbean.getBody();
		Map<String,Object> marketCaseIdMap = new HashMap<String,Object>();

		return marketCaseIdMap;
	}
	/**
	 * 查询营销案详细信息列表出参
	* @date: 2017-3-3 
	* @author: yuanliang
	* @title: queryMarketCaseDetailListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMarketCaseDetailListOutParam(
			List<IMarketCaseDetailPojo> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		List<Map<String,Object>> retultList = new ArrayList<Map<String,Object>>();
		Map<String,Object> reportMap=new HashMap<String,Object>();
		
		for(IMarketCaseDetailPojo detailPojo:outParam){			
			Map map=detailPojo.getDetailMap();
			Map<String,Object> marketCaseBasic=(Map<String, Object>) map.get("marketCaseBasic");			
			Map<String,Object> marketCaseDetail = (Map<String,Object>) map.get("marketCaseDetail");
			
			List<Map<String,Object>> productCommodityList = (List<Map<String, Object>>) marketCaseDetail.get("productCommodityList");
			Map<String,Object> wholeRule = (Map<String, Object>) marketCaseDetail.get("ruleInfo");
			List<Map<String,Object>> custGroupList = (List<Map<String, Object>>) marketCaseDetail.get("custGroupList");
			Map<String,Object> eventRule = (Map<String, Object>) marketCaseDetail.get("eventInfo");

			reportMap=new HashMap<String,Object>();
			reportMap.put("MARKET_CASE_NAME", marketCaseBasic.get("marketCaseName"));
			reportMap.put("STATUS_NAME", marketCaseBasic.get("statusName"));
			reportMap.put("MARKET_CASE_TYPE_NAME", marketCaseBasic.get("marketCaseTypeName"));
			reportMap.put("OPER_NAME", marketCaseBasic.get("operName"));
			reportMap.put("OPER_TIME", marketCaseBasic.get("operTime"));
			reportMap.put("START_TIME", marketCaseBasic.get("startTime"));
			reportMap.put("END_TIME", marketCaseBasic.get("endTime"));
			
			//客户群、短信内容、发送时段、发送端口
			for(Map<String,Object>  custGroupMap :custGroupList){
				reportMap.put("CUST_GROUP_NAME", custGroupMap.get("custGroupName"));
				reportMap.put("CUST_GROUP_NUM", custGroupMap.get("custGroupNum"));
				
				List<Map<String,Object>> channelList =(List<Map<String,Object>>)custGroupMap.get("channelList");
				for(Map<String,Object>  channelMap :channelList){
					List<Map<String,Object>> positionList = (List<Map<String,Object>>)channelMap.get("positionList");
					for(Map<String,Object>  positionMap :positionList){

						Map<String,Object> contentInfo = (Map<String,Object>)positionMap.get("contentInfo");
            			if(!CommonUtils.objectIsNull(contentInfo)){
            				List<Map<String,Object>> contentDetailList = (List<Map<String,Object>>)contentInfo.get("contentDetailList");
            				if(!CommonUtils.objectIsNull(contentDetailList)){
            					Map<String,Object> contentDetail = contentDetailList.get(0);
            					if(!CommonUtils.objectIsNull(contentDetail)){
            						List<Map<String,Object>> params = (List<Map<String,Object>>)contentDetail.get("params");
            						if(!CommonUtils.objectIsNull(params)){
            							for(Map<String,Object>  param :params){
            								String contentParCode=(String) param.get("contentParCode");
            								if("smsContent".equals(contentParCode)){
            									reportMap.put("SMS_CONTENT", param.get("contentParValue"));
            								}
            							}
            						}
            					}
            				}
            			}
            			
						Map<String,Object> ruleInfo = (Map<String,Object>)positionMap.get("ruleInfo");
            			if(!CommonUtils.objectIsNull(ruleInfo)){
            				List<Map<String,Object>> ruleDetailList = (List<Map<String,Object>>)ruleInfo.get("ruleDetailList");
            				if(!CommonUtils.objectIsNull(ruleDetailList)){
            					Map<String,Object> ruleDetail = ruleDetailList.get(0);
            					if(!CommonUtils.objectIsNull(ruleDetail)){
            						List<Map<String,Object>> params = (List<Map<String,Object>>)ruleDetail.get("params");
            						if(!CommonUtils.objectIsNull(params)){
            							for(Map<String,Object>  param :params){
            								String contentParCode=(String) param.get("ruleParCode");
            								if("start-end".equals(contentParCode)){
            									reportMap.put("START_END", param.get("ruleParValue"));
            								}
            								contentParCode=(String) param.get("ruleParCode");
            								if("sendPort".equals(contentParCode)){
            									reportMap.put("SEND_PORT", param.get("ruleParValue"));
            								}
            							}
            						}
            					}
            				}
            			}
					}
				}
			}
			
			//频控规则
			String touchPeridName="",sendDateName="";
            if(!CommonUtils.objectIsNull(wholeRule)){
            	List<Map<String,Object>> ruleDetailList = (List<Map<String,Object>>)wholeRule.get("ruleDetailList");
            	if(!CommonUtils.objectIsNull(ruleDetailList)){
            		Map<String,Object> ruleDetail = ruleDetailList.get(0);
            		if(!CommonUtils.objectIsNull(ruleDetail)){
            			List<Map<String,Object>> params = (List<Map<String,Object>>)ruleDetail.get("params");
            			if(!CommonUtils.objectIsNull(params)){
            				String parName = "";
            				for(Map<String,Object>  param :params){
            					String contentParCode=(String) param.get("ruleParCode");
									if("touchPerid".equals(contentParCode)){
										String parValue = (String)param.get("ruleParValue");
										if("3".equals(parValue)){
											parName = "月";
										}else if("2".equals(parValue)){
											parName = "周";
										}else{
											parName = "日";
										}
										parName="周期触发 ：每"+parName;
								}
            				}
            				touchPeridName=parName;
            				
            				parName = "";
            				for(Map<String,Object>  param :params){
									if("sendDate".equals(param.get("ruleParCode"))){
										String parValue = (String)param.get("ruleParValue");
										parName=parValue;
								}
            				}
            				sendDateName=parName;
            			}
            		}

            	}
            }
            String frequencyRule=touchPeridName+" "+sendDateName;
            reportMap.put("FREQUENCY_RULE", frequencyRule);
            
			retultList.add(reportMap);
			
		}
		
		outMap.put("MARKET_CASE_DETAIL_LIST", retultList);
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}	
	/**
	 * 查询营销案模板列表出参处理
	* @date: 2016-9-13 
	* @author: fangyuan_crmpd
	* @title: queryMarketCaseTempListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMarketCaseTempListOutParam(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> marketCaseTempList = new ArrayList<Map<String,Object>>();
		
		List<Map<String,Object>> inList = (List<Map<String, Object>>) outParam.get("marketCaseTempList");
		if(CommonUtils.objectIsNull(inList) == false){
		  for(Map<String,Object> marketCaseTempMap : inList){
			Map<String,Object> marketCaseTempNewMap = new HashMap<String,Object>();
		    marketCaseTempNewMap.put("MARKET_CASE_NAME", marketCaseTempMap.get("marketCaseName"));
		    marketCaseTempNewMap.put("MARKET_CASE_ID", marketCaseTempMap.get("marketCaseId"));
		    marketCaseTempNewMap.put("MARKET_CASE_TYPE", marketCaseTempMap.get("marketCaseType"));
		    marketCaseTempNewMap.put("TRIGGER_MODE", marketCaseTempMap.get("triggerMode"));
		    marketCaseTempNewMap.put("MARKET_CASE_BUSI_TYPE", marketCaseTempMap.get("marketCaseBusiType"));
		    marketCaseTempNewMap.put("CURRENT_PAGE_CODE", marketCaseTempMap.get("currentPageCode"));
		    marketCaseTempNewMap.put("PER_RECORD_COUNT", marketCaseTempMap.get("perRecordCount"));
		    marketCaseTempNewMap.put("TOTAL_RECORD_COUNT", marketCaseTempMap.get("totalRecordCount"));

		    marketCaseTempList.add(marketCaseTempNewMap);
		  }
		}
		outMap.put("MARKET_CASE_TEMP_LIST",marketCaseTempList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID",outParam.get("queryId"));

		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 客户群Id参数转换
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: queryMarketCaseIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryMarketCaseIdInParam(InDTO inDTO){
		MBean mbean = inDTO.getMbean();
		Map<String,Object> marketCaseId = (Map<String,Object>)mbean.getBody();
		Map<String,Object> marketCaseIdMap = new HashMap<String,Object>();
		marketCaseIdMap.put("marketCaseId", marketCaseId.get("MARKET_CASE_ID"));
		return marketCaseIdMap;
	}


	/**
	 * 营销案详细出参处理
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: queryMarketCaseOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMarketCaseOutParam(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		Map<String,Object> marketCaseBasicMap = (Map<String,Object>)outParam.get("marketCaseBasic");
		Map<String,Object> marketCaseBasicNewMap = this.marketCaseBasicMapOutParam(marketCaseBasicMap);
		
		Map<String,Object> actDetail = (Map<String,Object>)outParam.get("actDemandMap");
		Map<String,Object> actNewDetail = this.getActDemandDetailOutParams(actDetail);
		
		Map<String,Object> marketCaseDetail = (Map<String,Object>)outParam.get("marketCaseDetail");
		Map<String,Object> marketCaseNewDetail = this.marketCaseNewDetailOutParam(marketCaseDetail);
		
		Map<String,Object> newMarketCase = this.newMarketCaseOutParam(marketCaseBasicNewMap,marketCaseNewDetail,actNewDetail);
		
		MBean outBean = new MBean();
		outBean.setBody(newMarketCase);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}


	/**
	 * 查询营销案入参转换
	* @date: 2016-10-14 
	* @author: fangyuan_crmpd
	* @title: queryMarketCaseInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseInParam(InDTO inDTO) {
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * 查询营销案出参处理
	* @date: 2016-10-14 
	* @author: fangyuan_crmpd
	* @title: queryMarketCaseIdOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMarketCaseIdOutParam(Map<String, Object> outParam) {
		// TODO Auto-generated method stub
		return null;
	}
	


	/** 产品列表查询入参处理
	* @date: 2016-10-12 
	* @author: wangpei
	* @title: queryProductListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> queryProductListInParam(InDTO inDTO){
		MBean mbean = inDTO.getMbean();
		Map<String,Object> body = mbean.getBody();
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("productType", body.get("PRODUCT_TYPE"));
		param.put("productId", body.get("PRODUCT_ID"));
		param.put("productName", body.get("PRODUCT_NAME"));
		param.put("queryListType", Const.QUERY_LIST_TYPE_PROD);
		param.put("queryId", body.get("QUERY_ID"));
		param.put("isSort", body.get("IS_SORT"));
		param.put("currentPageCode", body.get("CURRENT_PAGE_CODE"));
		param.put("perRecordCount", body.get("PER_RECORD_COUNT"));
		param.put("totalRecordCount", body.get("TOTAL_RECORD_COUNT"));
		return param;
	}

	/** 产品列表查询出餐处理
	* @date: 2016-10-12 
	* @author: wangpei
	* @title: queryProductListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public StandardOutDTO queryProductListOutParam(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		List<Map<String,Object>> inList = outParam.get("result") == null?new ArrayList<Map<String,Object>>():(List<Map<String,Object>>)outParam.get("result");
		
		if(CommonUtils.objectIsNull(inList) == false){
		  for(Map<String,Object> product:inList){
			  Map<String,Object> out = new HashMap<String, Object>();
			  out.put("PRODUCT_ID", product.get("productId"));
			  out.put("PRODUCT_TYPE", product.get("productType"));
			  out.put("PRODUCT_NAME", product.get("productName"));
			  out.put("PRODUCT_TYPE_NAME", product.get("productTypeName"));
			  outList.add(out);
		   }
		}
		
		outMap.put("PRODUCT_LIST", outList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("sum") == null?0:outParam.get("sum"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		
		return standardOutDTO;
	}
	
	/**
	 * 删除营销案入参处理
	* @date: 2016-10-14 
	* @author: fangyuan_crmpd
	* @title: removeMarketCaseByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removeMarketCaseByIdInParam(InDTO inDTO) {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> body = mbean.getBody();
		Map<String,Object> param = new HashMap<String, Object>();
		param.put("marketCaseId", body.get("MARKET_CASE_ID"));
	
		return param;
	}


	/**
	 * 删除营销案出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: removeMarketCaseByIdOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeMarketCaseByIdOutParam(){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}


	/** 
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: removeMarketCaseCustGroupRelByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> removeMarketCaseCustGroupRelByIdInParam(
			InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("relId", bean.getBodyStr("REL_ID"));
		inParam.put("custGroupId", bean.getBodyStr("CUST_GROUP_ID"));
		return inParam;
	}


	/**
	 * 重启和暂停营销案入参处理
	* @date: 2016-10-14 
	* @author: fangyuan_crmpd
	* @title: restartAndPauseMarketCaseByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> restartAndPauseMarketCaseByIdInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String, Object> inMap = bean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("marketCaseId", inMap.get("MARKET_CASE_ID"));
		inParam.put("statusCode", inMap.get("STATUS_CODE"));
		return inParam;
	}


	/**
	 * 暂停和重新启动营销案出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: restartAndPauseMarketCaseById 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO restartAndPauseMarketCaseByIdOutParam(){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}


	/** 
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseBasicInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> saveMarketCaseBasicInParam(InDTO inDTO) {
		Map<String, Object> inParam = this.marketCaseBasicInParam(inDTO);
		return inParam;
	}


	/** 
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseBasicOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO saveMarketCaseBasicOutParam(Map<String, Object> outParam) {
		StandardOutDTO outDto = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody("MARKET_CASE_ID",outParam.get("marketCaseId"));
		outDto.setBean(outBean);
		return outDto;
	}


	/** 
	 * 保存营销案客户群关系入参处理
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseCustGroupRelInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> saveMarketCaseCustGroupRelInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("marketCaseId", bean.getBodyStr("MARKET_CASE_ID"));
		inParam.put("custGroupId", bean.getBodyStr("CUST_GROUP_ID"));
		return inParam;
	}


	/** 
	 * 保存营销案客户群关系出参处理
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseCustGroupRelOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public StandardOutDTO saveMarketCaseCustGroupRelOutParam(Map<String, Object> out) {
		StandardOutDTO outDto = new StandardOutDTO();
		MBean bean = new MBean();
		bean.setBody("REL_ID",out.get("relId"));
		outDto.setBean(bean);
		return  outDto;
	}

	/**
	 * 保存营销案详细信息参数处理
	* @date: 2016-9-5 
	* @author: tangaq
	* @Title: saveMarketCaseDetailInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> saveMarketCaseDetailInParam(InDTO inDTO) {
		Map<String,Object> marketCaseBasicMap = this.marketCaseBasicMapInParam(inDTO);
		Map<String,Object> marketCaseDetail = this.marketCaseDetailInParam(inDTO);
		List<Map<String,Object>> fileMap = this.attachInParam(inDTO);
		Map<String,Object> outMap = this.newMarketCaseInParam(marketCaseBasicMap, marketCaseDetail,fileMap);
	    return outMap;
	}

	/**
	 * 保存营销案详细息出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: saveMarketCaseDetailOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveMarketCaseDetailOutParam(Map<String,Object> inMap){
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody("MARKET_CASE_ID",inMap.get("marketCaseId"));
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}


	/**
	 * 保存营销案模板入参处理
	* @date: 2016-10-14 
	* @author: fangyuan_crmpd
	* @title: saveMarketCaseTempByMCIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveMarketCaseTempByMCIdInParam(InDTO inDTO) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 根据营销案ID保存营销案模板出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: saveMarketCaseTempByMCIdOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveMarketCaseTempByMCIdOutParam(){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 根据模板修改营销案详细信息入参处理
	* @date: 2016-11-15 
	* @author: tangaq
	* @title: updateMarketCaseByTemplateInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updateMarketCaseByTemplateInParam(InDTO inDTO) {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> body = mbean.getBody();
		List<Map<String,Object>> relList = (List<Map<String,Object>>)body.get("REL_LIST");
		List<Map<String,Object>> custGroupList = (List<Map<String,Object>>)body.get("CUST_GROUP_LIST");
		List<Map<String,Object>> relNewList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> channelNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> param = new HashMap<String, Object>();
		
		if(CommonUtils.objectIsNull(custGroupList) == false){
			for(Map<String,Object> map:custGroupList){
				List<Map<String,Object>> channelList = (List<Map<String,Object>>)map.get("CHANNEL_LIST");
				if(CommonUtils.objectIsNull(channelList) == false){
					for(Map<String,Object> inMap:channelList){
						Map<String,Object> newMap = new HashMap<String,Object>();
						newMap.put("channelId",inMap.get("CHANNEL_ID"));
						
						
						newMap.put("custGroupChannelRelId",inMap.get("REL_ID"));
						channelNewList.add(newMap);
					}
				}
			}
		}
		
		if(CommonUtils.objectIsNull(relList) == false){
			for(Map<String,Object> map:relList){
				Map<String,Object> newMap = new HashMap<String,Object>();
				newMap.put("relId",map.get("REL_ID"));
				newMap.put("custGroupId",map.get("CUST_GROUP_ID"));
				relNewList.add(newMap);
			}
		}
		
		param.put("relList",relNewList);
		param.put("channelList",channelNewList);
        
		log.info("找到", param);
		return param;
		
	}
	
	 /**
	  * 根据模板修改营销案详细信息出参处理
	 * @date: 2016-11-15 
	 * @author: tangaq
	 * @title: updateMarketCaseByTemplateOutParam 
	 * @return 
	 * @exception: 
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note:
	  */
	@Override
	public StandardOutDTO updateMarketCaseByTemplateOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

    /**
     * 修改营销案状态入参处理
    * @date: 2016-12-19 
    * @author: tangaq
    * @title: updateMarketCaseStatusInParam 
    * @param inDTO
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	@Override
	public Map<String, Object> updateMarketCaseStatusInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String, Object> inMap = bean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("marketCaseId", inMap.get("MARKET_CASE_ID"));
		inParam.put("statusCode", inMap.get("STATUS_CODE"));

		return inParam;
	}

    /**
     * 修改营销案状态出参处理
    * @date: 2016-12-19 
    * @author: tangaq
    * @title: updateMarketCaseStatusOutParam 
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	@Override
	public StandardOutDTO updateMarketCaseStatusOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 *附件上传参数处理 
	* @date: 2016-11-14 
	* @author: xiongxq
	* @Title: attachInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> attachInParam(InDTO inDTO){
		MBean inBean = inDTO.getMbean();
		List<Map<String,Object>> fileList = (List<Map<String,Object>>)inBean.getBodyList("FILE_LIST");
		List<Map<String,Object>> fileNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		if(CommonUtils.objectIsNull(fileList) == false){
			for(Map<String,Object> fileMap : fileList){
				Map<String,Object> fileNewMap = new HashMap<String,Object>();
				fileNewMap.put("fileName",fileMap.get("FILE_NAME"));
				fileNewMap.put("systemName",fileMap.get("SYSTEM_NAME") );
				fileNewMap.put("fileType", fileMap.get("FILE_TYPE"));
				fileNewList.add(fileNewMap);
			 }
		}
		return fileNewList;
	}
	
	/**
	 * 根据营销案ID查询审批记录列表出参处理
	* @date: 2016-11-1 
	* @author: fangyuan_crmpd
	* @title: auditDetailNewListOutParam 
	* @param auditDetailList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> auditDetailNewListOutParam (List<Map<String, Object>> auditDetailList){
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(auditDetailList) == false){
			for(Map<String, Object> inMap : auditDetailList){
				Map<String, Object> outMap = new HashMap<String, Object>();
				outMap.put("AUDITRECORD_ID", inMap.get("auditRecordId"));
				outMap.put("BUSI_ID", inMap.get("busiId"));
				outMap.put("BUSI_TYPE", inMap.get("busiType"));
				outMap.put("AUDIT_ORDER", inMap.get("auditOrder"));
				outMap.put("AUDIT_DESC", inMap.get("auditDesc"));
				outMap.put("AUDIT_STATUS", inMap.get("auditStatus"));
				outMap.put("STATUS_NAME", inMap.get("statusName"));
				outMap.put("AUDIT_NO", inMap.get("auditNo"));
				outMap.put("AUDIT_NAME", inMap.get("auditName"));
				outMap.put("AUDIT_TIME", inMap.get("auditTime"));
				outMap.put("REGION_CODE", inMap.get("regionCode"));
				outMap.put("CITY_CODE", inMap.get("cityCode"));
				outMap.put("GROUP_ID", inMap.get("groupId"));
				outMap.put("OPER_NO", inMap.get("operNo"));
				outMap.put("OPER_NAME", inMap.get("operName"));
				outMap.put("OPER_DATE", inMap.get("operDate"));
				outMap.put("PHONE", inMap.get("phone"));
				outMap.put("FILE_NAME", inMap.get("attachName"));
				outMap.put("SYSTEM_NAME", inMap.get("systemName"));
				outList.add(outMap);
			}
		}
		return outList;
	}

	/**
	 * 审批详细信息出参转换
	* @date: 2016-10-1 
	* @author: tangaq
	* @title: auditNewDetailOutParam 
	* @param auditDetail
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> auditNewDetailOutParam(Map<String,Object> auditDetail){
		Map<String,Object> auditNewDetail = new HashMap<String,Object>();
		
		auditNewDetail.put("AUDIT_STATUS", auditDetail.get("auditStatus"));
		auditNewDetail.put("AUDIT_DESC", auditDetail.get("auditDesc"));
		auditNewDetail.put("AUDIT_NO", auditDetail.get("auditNo"));
		auditNewDetail.put("REGION_CODE", auditDetail.get("regionCode"));
		auditNewDetail.put("AUDITRECORD_ID", auditDetail.get("auditRecordId"));
		auditNewDetail.put("GROUP_CODE", auditDetail.get("groupCode"));
		auditNewDetail.put("AUDIT_ORDER", auditDetail.get("auditOrder"));
		auditNewDetail.put("BUSI_ID", auditDetail.get("busiId"));
		auditNewDetail.put("BUSI_TYPE", auditDetail.get("busiType"));
		auditNewDetail.put("GROUP_ID", auditDetail.get("groupId"));
		auditNewDetail.put("CITY_CODE", auditDetail.get("cityCode"));
		auditNewDetail.put("STATUS_NAME", auditDetail.get("statusName"));
		auditNewDetail.put("OPER_NO", auditDetail.get("operNo"));
		auditNewDetail.put("MARKET_CASE_ID", auditDetail.get("marketCaseId"));
		auditNewDetail.put("MARKET_CASE_NAME", auditDetail.get("marketCaseName"));
		auditNewDetail.put("AUDIT_TIME", auditDetail.get("auditTime"));	
	
		return auditNewDetail;
	}

	/**
		 * channelList入参大小写转换
		* @date: 2016-9-13 
		* @author: tangaq
		* @title: channelNewListInParam 
		* @param channelList
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected List<Map<String,Object>> channelNewListInParam(List<Map<String,Object>> channelList){
			List<Map<String,Object>> channelNewList = new ArrayList<Map<String,Object>>();
	
			if(CommonUtils.objectIsNull(channelList) == false){
			  for(Map<String,Object> channelMap : channelList){
				Map<String,Object> channelNewMap = new HashMap<String,Object>();
				List<Map<String,Object>> positionList = (List<Map<String, Object>>) channelMap.get("POSITION_LIST");
				List<Map<String,Object>> positionNewList = this.positionNewListInParam(positionList);
				
				Map<String,Object> ruleInfo = (Map<String,Object>)channelMap.get("RULE_INFO");
				Map<String,Object> releNewInfo = this.ruleNewInfoInParam(ruleInfo);
				
	//			List<Map<String,Object>> eventList =  (List<Map<String, Object>>) channelMap.get("EVENT_LIST");
	//			List<Map<String,Object>> eventNewList = this.eventNewListInParam(eventList);
				
				channelNewMap.put("channelId",channelMap.get("CHANNEL_ID"));
				channelNewMap.put("channelName",channelMap.get("CHANNEL_NAME"));
				channelNewMap.put("positionList", positionNewList);
				channelNewMap.put("ruleInfo",releNewInfo);
	//			channelNewMap.put("eventList",eventNewList);
				channelNewList.add(channelNewMap);
		      }
			}
			return channelNewList;		
		}


	/**
		 * channelList出参大小写转换
		* @date: 2016-9-13 
		* @author: tangaq
		* @title: channelNewListOutParam 
		* @param channelList
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected List<Map<String,Object>> channelNewListOutParam(List<Map<String,Object>> channelList){
			List<Map<String,Object>> channelNewList = new ArrayList<Map<String,Object>>();
	
			if(CommonUtils.objectIsNull(channelList) == false){
			  for(Map<String,Object> channelMap : channelList){
				Map<String,Object> channelNewMap = new HashMap<String,Object>();
				List<Map<String,Object>> positionList = (List<Map<String, Object>>) channelMap.get("positionList");
				List<Map<String,Object>> positionNewList = this.positionNewListOutParam(positionList);
				
				Map<String,Object> ruleInfo =(Map<String,Object>) channelMap.get("ruleInfo");
				Map<String,Object> ruleNewInfo = this.ruleNewInfoOutParam(ruleInfo);
				
	//			List<Map<String,Object>> eventList =  (List<Map<String, Object>>) channelMap.get("eventList");
	//			List<Map<String,Object>> eventNewList = this.eventNewListOutParam(eventList);
				channelNewMap.put("REL_ID",channelMap.get("relId"));
				channelNewMap.put("CHANNEL_ID",channelMap.get("channelId"));
				channelNewMap.put("CHANNEL_NAME",channelMap.get("channelName"));
				channelNewMap.put("POSITION_LIST", positionNewList);
				channelNewMap.put("RULE_INFO",ruleNewInfo);
	//			channelNewMap.put("EVENT_LIST",eventNewList);
				channelNewList.add(channelNewMap);
		      }
			}
			return channelNewList;		
		}


	/**
	 * contentDetailList入参转换大小写
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: contentDetailNewListInParam 
	* @param contentDetailList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> contentDetailNewListInParam(List<Map<String,Object>> contentDetailList){
		List<Map<String,Object>> contentDetailNewList = new ArrayList<Map<String,Object>>();
		
		if(CommonUtils.objectIsNull(contentDetailList) == false){
		  for(Map<String,Object> contentDetailMap:contentDetailList){
			Map<String,Object> contentDetailNewMap = new HashMap<String,Object>();
			List<Map<String,Object>> contentDetailParam = (List<Map<String,Object>>)contentDetailMap.get("PARAMS");
			List<Map<String,Object>> contentDetailNewParam = this.contentDetailNewParamInParam(contentDetailParam);
			
			contentDetailNewMap.put("batchNo", contentDetailMap.get("BATCH_NO"));
			contentDetailNewMap.put("contentParName", contentDetailMap.get("CONTENT_PAR_NAME"));
			contentDetailNewMap.put("contentParValue", contentDetailMap.get("CONTENT_PAR_VALUE"));
			contentDetailNewMap.put("contentParCode", contentDetailMap.get("CONTENT_PAR_CODE"));
			contentDetailNewMap.put("serialId", contentDetailMap.get("SERIAL_ID"));
			contentDetailNewMap.put("contentId", contentDetailMap.get("CONTENT_ID"));
			contentDetailNewMap.put("contentDetailId", contentDetailMap.get("CONTENT_DETAIL_ID"));
			contentDetailNewMap.put("params",contentDetailNewParam);
			contentDetailNewList.add(contentDetailNewMap);
		  }
		}
		return contentDetailNewList;
	}


	/**
	 * content params入参转换
	* @date: 2016-10-7 
	* @author: tangaq
	* @title: contentDetailNewParamInParam 
	* @param contentDetailParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> contentDetailNewParamInParam(List<Map<String,Object>> contentDetailParam){
		List<Map<String,Object>> contentDetailNewParam = new ArrayList<Map<String,Object>>();
		
		if(CommonUtils.objectIsNull(contentDetailParam) == false){
			for(Map<String,Object> param:contentDetailParam){
				Map<String,Object> newParam = new HashMap<String,Object>();
				newParam.put("batchNo", param.get("BATCH_NO"));
				newParam.put("contentParName", param.get("CONTENT_PAR_NAME"));
				newParam.put("contentParValue", param.get("CONTENT_PAR_VALUE"));
				newParam.put("contentParCode", param.get("CONTENT_PAR_CODE"));
				newParam.put("serialId", param.get("SERIAL_ID"));
				newParam.put("contentId", param.get("CONTENT_ID"));
				
				contentDetailNewParam.add(newParam);
			}
		}
		
		return contentDetailNewParam;
	}


	/**
	 * contentDetailList出参转换大小写
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: contentDetailNewListOutParam 
	* @param contentDetailList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> contentDetailNewListOutParam(List<Map<String,Object>> contentDetailList){
		List<Map<String,Object>> contentDetailNewList = new ArrayList<Map<String,Object>>();
	
		if(CommonUtils.objectIsNull(contentDetailList) == false){
		  for(Map<String,Object> contentDetailMap:contentDetailList){
			Map<String,Object> contentDetailNewMap = new HashMap<String,Object>();
			List<Map<String,Object>> contentParams = (List<Map<String,Object>>)contentDetailMap.get("params");
			List<Map<String,Object>> coontentNewParams = this.contentNewParamsOutParam(contentParams);
			
			contentDetailNewMap.put("BATCH_NO", contentDetailMap.get("batchNo"));
			contentDetailNewMap.put("SERIAL_ID", contentDetailMap.get("serialId"));
			contentDetailNewMap.put("CONTENT_PAR_VALUE", contentDetailMap.get("contentParValue"));
			contentDetailNewMap.put("CONTENT_PAR_NAME", contentDetailMap.get("contentParName"));
			contentDetailNewMap.put("CONTENT_PAR_CODE", contentDetailMap.get("contentParCode"));
			contentDetailNewMap.put("CONTENT_PAR_DESC", contentDetailMap.get("contentParDesc"));
			contentDetailNewMap.put("CONTENT_ID", contentDetailMap.get("contentId"));
			contentDetailNewMap.put("CONTENT_DETAIL_ID", contentDetailMap.get("contentDetailId"));
			contentDetailNewMap.put("PARAMS", coontentNewParams);
			contentDetailNewList.add(contentDetailNewMap);
		  }
		}
		return contentDetailNewList;
	}


	/**
	 * contentInfo入参处理
	* @date: 2016-10-7 
	* @author: tangaq
	* @title: contentNewInfoInParam 
	* @param contentInfo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> contentNewInfoInParam(Map<String,Object> contentInfo){
		Map<String,Object> contentNewInfo = new HashMap<String,Object>();
		List<Map<String,Object>> contentDetailList = (List<Map<String, Object>>) contentInfo.get("CONTENT_DETAIL_LIST");
		List<Map<String,Object>> contentDetailNewList= this.contentDetailNewListInParam(contentDetailList);
		
		contentNewInfo.put("contentDetailList", contentDetailNewList);
		contentNewInfo.put("contentId",contentInfo.get("CONTENT_ID"));
		return contentNewInfo;
	}


	/**
	 * contentInfo出参大小写转换
	* @date: 2016-10-7 
	* @author: tangaq
	* @title: contentNewInfoOutParam 
	* @param contentInfo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> contentNewInfoOutParam(Map<String,Object> contentInfo){
		Map<String,Object> contentNewInfo = new HashMap<String,Object>();
		List<Map<String,Object>> contentDetailList = (List<Map<String, Object>>)contentInfo.get("contentDetailList"); 
		List<Map<String,Object>> contentDetailNewList= this.contentDetailNewListOutParam(contentDetailList);
		
		contentNewInfo.put("CONTENT_ID", contentInfo.get("contentId"));
		contentNewInfo.put("CONTENT_DETAIL_LIST", contentDetailNewList);
		return contentNewInfo;
	}


	/**
	 * content params出参大小写转换
	* @date: 2016-10-7 
	* @author: tangaq
	* @title: contentNewParamsOutParam 
	* @param contentParams
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> contentNewParamsOutParam(List<Map<String,Object>> contentParams){
		List<Map<String,Object>> contentNewParams = new ArrayList<Map<String,Object>>();
		
		if(CommonUtils.objectIsNull(contentParams) == false){
			for(Map<String,Object> params:contentParams){
				Map<String,Object> newParams = new HashMap<String,Object>();
				newParams.put("BATCH_NO", params.get("batchNo"));
				newParams.put("SERIAL_ID", params.get("serialId"));
				newParams.put("CONTENT_PAR_VALUE", params.get("contentParValue"));
				newParams.put("CONTENT_PAR_NAME", params.get("contentParName"));
				newParams.put("CONTENT_PAR_CODE", params.get("contentParCode"));
				newParams.put("CONTENT_PAR_DESC", params.get("contentParDesc"));
				newParams.put("CONTENT_ID", params.get("contentId"));
				newParams.put("CONTENT_DETAIL_ID", params.get("contentDetailId"));
				contentNewParams.add(newParams);
			}
		}
		
		return contentNewParams;
	}


	/**
	 * custGroupList入参大小写转换
	* @date: 2016-10-12 
	* @author: tangaq
	* @title: custGroupListInParam 
	* @param custGroupList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> custGroupListInParam(List<Map<String,Object>> custGroupList){
		
		List<Map<String,Object>> custGroupNewList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(custGroupList) == false){
			for(Map<String,Object> custGroupMap :custGroupList){
				Map<String,Object> custGroupNewMap = new HashMap<String,Object>();
				List<Map<String,Object>> channelList = (List<Map<String, Object>>) custGroupMap.get("CHANNEL_LIST");
				List<Map<String,Object>> channelNewList = this.channelNewListInParam(channelList);
				
				custGroupNewMap.put("custGroupId", custGroupMap.get("CUST_GROUP_ID"));
				custGroupNewMap.put("custGroupName", custGroupMap.get("CUST_GROUP_NAME"));
				custGroupNewMap.put("custGroupType", custGroupMap.get("CUST_GROUP_TYPE"));
				custGroupNewMap.put("custGroupLevel", custGroupMap.get("CUST_GROUP_LEVEL"));
				custGroupNewMap.put("custGroupClass", custGroupMap.get("CUST_GROUP_CLASS"));
		
				custGroupNewMap.put("statusCode", custGroupMap.get("STATUS_CODE"));
				custGroupNewMap.put("channelList", channelNewList);
				
				String stTime = (String)custGroupMap.get("START_TIME");
				String edTime = (String)custGroupMap.get("END_TIME");
				if(CommonUtils.objectIsNull(stTime) == false){
					 String startTime = DateUtil.stringToString(this.timeConvert(stTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
					 custGroupNewMap.put("startTime", startTime);
				}
				if(CommonUtils.objectIsNull(edTime) == false){
					 String endTime = DateUtil.stringToString(this.timeConvert(edTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
					 custGroupNewMap.put("endTime", endTime);	
				}
				
				custGroupNewList.add(custGroupNewMap);
			}
		}
		
		return custGroupNewList;
	}


	/**
	 * custGroupList出参大小写转换
	* @date: 2016-10-12 
	* @author: tangaq
	* @title: custGroupListOutParam 
	* @param custGroupList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> custGroupListOutParam(List<Map<String,Object>>  custGroupList){
		List<Map<String,Object>> custGroupNewList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(custGroupList) == false){
			for(Map<String,Object> custGroupMap :custGroupList){
				Map<String,Object> custGroupNewMap = new HashMap<String,Object>();
				List<Map<String,Object>> channelList = (List<Map<String, Object>>) custGroupMap.get("channelList");
				List<Map<String,Object>> channelNewList = this.channelNewListOutParam(channelList);

				List<Map<String,Object>> eventList = (List<Map<String, Object>>) custGroupMap.get("eventList");
				List<Map<String,Object>> eventNewList = this.eventNewListOutParam(eventList);
				
				custGroupNewMap.put("REL_ID", custGroupMap.get("relId"));
				custGroupNewMap.put("CUST_GROUP_ID", custGroupMap.get("custGroupId"));
				custGroupNewMap.put("CUST_GROUP_NAME", custGroupMap.get("custGroupName"));
				custGroupNewMap.put("CUST_GROUP_DESC", custGroupMap.get("custGroupDesc"));
				custGroupNewMap.put("CUST_GROUP_NUM", custGroupMap.get("custGroupNum"));
				custGroupNewMap.put("OPER_NO", custGroupMap.get("operNo"));
				custGroupNewMap.put("OPER_TIME", custGroupMap.get("operTime"));
				custGroupNewMap.put("CUST_GROUP_TYPE", custGroupMap.get("custGroupType"));
				custGroupNewMap.put("CUST_GROUP_TYPE_NAME", custGroupMap.get("custGroupTypeName"));
				custGroupNewMap.put("CUST_GROUP_LEVEL", custGroupMap.get("custGroupLevel"));
				custGroupNewMap.put("CUST_GROUP_CLASS", custGroupMap.get("custGroupClass"));
		
				custGroupNewMap.put("STATUS_CODE", custGroupMap.get("statusCode"));
				custGroupNewMap.put("CHANNEL_LIST", channelNewList);
				custGroupNewMap.put("EVENT_LIST", eventNewList);
				
				String stTime = (String)custGroupMap.get("startTime");
				String edTime = (String)custGroupMap.get("endTime");
				if(CommonUtils.objectIsNull(stTime) == false){
					 String startTime = DateUtil.stringToString(stTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2);
					 custGroupNewMap.put("START_TIME", startTime);
				}
				if(CommonUtils.objectIsNull(edTime) == false){
					 String endTime = DateUtil.stringToString(edTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2);
					 custGroupNewMap.put("END_TIME", endTime);	
				}
				
				custGroupNewList.add(custGroupNewMap);
			}
		}
		
		return custGroupNewList;
	}



	/**
	 * eventInfo入参处理
	* @date: 2016-11-23 
	* @author: mengxi
	* @title: eventNewInfoInParam 
	* @param eventInfo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> eventNewInfoInParam(Map<String,Object> eventInfo){
		Map<String,Object> eventNewInfo = new HashMap<String,Object>();
		if(CommonUtils.objectIsNull(eventInfo) == false){
			List<Map<String,Object>> eventDetailList = (List<Map<String,Object>>)eventInfo.get("EVENT_DETAIL_LIST");
			List<Map<String,Object>> eventDetailNewList = this.eventNewListInParam(eventDetailList);
			
			eventNewInfo.put("eventDetailList",eventDetailNewList);
		}
		return eventNewInfo;
	}
	
	/**
	 * 事件规则出参大小写转换
	* @date: 2016-12-2 
	* @author: mengxi
	* @title: eventNewInfoOutParam 
	* @param eventInfo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> eventNewInfoOutParam(Map<String,Object> eventInfo){
		Map<String,Object> eventNewInfo = new HashMap<String,Object>();
		
		List<Map<String,Object>> eventDetailList = (List<Map<String,Object>>)eventInfo.get("eventDetailList");
		List<Map<String,Object>> eventDetailNewList = this.eventNewDetailListOutParam(eventDetailList);
		
		eventNewInfo.put("EVENT_ID",eventInfo.get("eventId"));
		eventNewInfo.put("EVENT_DETAIL_LIST", eventDetailNewList);
		return eventNewInfo;
	}

	/**
	 * 事件详情入参处理
	* @date: 2016-11-23 
	* @author: mengxi
	* @title: eventNewListInParam 
	* @param eventList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> eventNewListInParam(List<Map<String,Object>> eventList){
		List<Map<String,Object>> eventNewList = new ArrayList<Map<String,Object>>();

		if(CommonUtils.objectIsNull(eventList) == false){
		  for(Map<String,Object> eventMap : eventList){
			List<Map<String,Object>> eventParams = (List<Map<String, Object>>) eventMap.get("PARAMS");
			List<Map<String,Object>> eventNewParams = this.eventNewParamsInParam(eventParams);
			Map<String,Object> eventNewMap = new HashMap<String,Object>();
			eventNewMap.put("params", eventNewParams);
			eventNewList.add(eventNewMap);
		  }
		}
		return eventNewList;
	}
	
	/**
	 * eventDetailList出参大小写转换
	* @date: 2016-12-2 
	* @author: mengxi
	* @title: eventNewDetailListOutParam 
	* @param eventList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> eventNewDetailListOutParam(List<Map<String,Object>> eventList){
		List<Map<String,Object>> eventNewList = new ArrayList<Map<String,Object>>();

		if(CommonUtils.objectIsNull(eventList) == false){
		  for(Map<String,Object> eventMap : eventList){
			List<Map<String,Object>> eventParams = (List<Map<String, Object>>) eventMap.get("params");
			List<Map<String,Object>> eventNewParams = this.eventNewParamsOutParam(eventParams);
			Map<String,Object> eventNewMap = new HashMap<String,Object>();

			eventNewMap.put("EVENT_DETAIL_TYPE",eventMap.get("eventDetailType"));
			eventNewMap.put("EVENT_ID",eventMap.get("eventId"));
			eventNewMap.put("EVENT_DETAIL_ID",eventMap.get("eventDetailId"));
			eventNewMap.put("PARAMS", eventNewParams);
			eventNewList.add(eventNewMap);
		  }
	    }
		return eventNewList;
	}
	
	/**
	 * 事件详情参数入参处理
	* @date: 2016-11-23 
	* @author: mengxi
	* @title: eventNewParamsInParam 
	* @param eventParams
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> eventNewParamsInParam(List<Map<String,Object>> eventParams){
		List<Map<String,Object>> eventNewParams = new ArrayList<Map<String,Object>>();

		if(CommonUtils.objectIsNull(eventParams) == false){
		  for(Map<String,Object> params : eventParams){
			Map<String,Object> newParams = new HashMap<String,Object>();
			newParams.put("eventParValue", params.get("EVENT_PAR_VALUE"));
			newParams.put("batchNo", params.get("BATCH_NO"));
			newParams.put("eventParName", params.get("EVENT_PAR_NAME"));
			newParams.put("eventParCode", params.get("EVENT_PAR_CODE"));
			newParams.put("eventDetailType", params.get("EVENT_DETAIL_TYPE"));
			newParams.put("eventDetailId", params.get("EVENT_DETAIL_ID"));
			newParams.put("serialId", params.get("SERIAL_ID"));
			eventNewParams.add(newParams);
		  }
		}
		return eventNewParams;
	}
	
	/**
	 * 事件详情参数出参处理
	* @date: 2016-12-2 
	* @author: mengxi
	* @title: eventNewParamsOutParam 
	* @param eventParams
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> eventNewParamsOutParam(List<Map<String,Object>> eventParams){
		List<Map<String,Object>> eventNewParams = new ArrayList<Map<String,Object>>();

		if(CommonUtils.objectIsNull(eventParams) == false){
		  for(Map<String,Object> params : eventParams){
			Map<String,Object> newParams = new HashMap<String,Object>();
			newParams.put("EVENT_PAR_VALUE", params.get("eventParValue"));
			newParams.put("BATCH_NO", params.get("batchNo"));
			newParams.put("EVENT_PAR_CODE", params.get("eventParCode"));
			newParams.put("SERIAL_ID", params.get("serialId"));
			newParams.put("EVENT_PAR_NAME", params.get("eventParName"));
			newParams.put("EVENT_DETAIL_ID", params.get("eventDetailId"));
			newParams.put("EVENT_ID", params.get("eventId"));
			newParams.put("EVENT_DETAIL_TYPE", params.get("eventDetailType"));
			eventNewParams.add(newParams);
		   }
		}
		return eventNewParams;
	}

	/**
	 * eventList出参大小写转换
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: eventNewListOutParam 
	* @param eventList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> eventNewListOutParam(List<Map<String,Object>> eventList){
		List<Map<String,Object>> eventNewList = new ArrayList<Map<String,Object>>();
		
		if(CommonUtils.objectIsNull(eventList) == false){
		  for(Map<String,Object> eventMap : eventList){
			 Map<String,Object> eventNewMap = new HashMap<String,Object>();
			List<Map<String,Object>> eventDetailList = (List<Map<String, Object>>) eventMap.get("eventDetailList");
			List<Map<String,Object>> eventDetailNewList = this.eventDetailNewListOutParam(eventDetailList);
		
			List<Map<String,Object>> positionList = (List<Map<String, Object>>) eventMap.get("positionList");
			List<Map<String,Object>> positionNewList = this.positionNewListOutParam(positionList);
			
			Map<String,Object> ruleInfo =(Map<String,Object>) eventMap.get("ruleInfo");
			Map<String,Object> ruleNewInfo = this.ruleNewInfoOutParam(ruleInfo);
			
			eventNewMap.put("EVENT_ID", eventMap.get("eventId"));
			eventNewMap.put("REL_ID",eventMap.get("relId"));
			eventNewMap.put("POSITION_LIST", positionNewList);
			eventNewMap.put("RULE_INFO",ruleNewInfo);
			eventNewMap.put("EVENT_DETAIL_LIST", eventDetailNewList);
			eventNewList.add(eventNewMap);
	      }
		}
		
		return eventNewList;
	}
	
	/**
	 * eventDetailList出参大小写转换
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: eventDetailNewListOutParam 
	* @param eventDetailList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> eventDetailNewListOutParam(List<Map<String,Object>> eventDetailList){
		List<Map<String,Object>> eventDetailNewList = new ArrayList<Map<String,Object>>();

		if(CommonUtils.objectIsNull(eventDetailList) == false){
		  for(Map<String,Object> eventDetailMap : eventDetailList){
			List<Map<String,Object>> eventParams = (List<Map<String, Object>>) eventDetailMap.get("params");
			List<Map<String,Object>> eventNewParams = this.eventNewParamsOutParam(eventParams);
			Map<String,Object> eventNewMap = new HashMap<String,Object>();

			eventNewMap.put("EVENT_DETAIL_ID",eventDetailMap.get("eventDetailId"));
			eventNewMap.put("EVENT_DETAIL_TYPE",eventDetailMap.get("eventDetailType"));
			eventNewMap.put("PARAMS", eventNewParams);
			eventDetailNewList.add(eventNewMap);
		  }
	    }
		return eventDetailNewList;
	}
	
	/**
	 * 将营销案详细信息和审批详细信息放入一个Map中
	* @date: 2016-10-1 
	* @author: tangaq
	* @title: marketCaseAuditDetailOutParam 
	* @param marketCaseBasicNewMap
	* @param marketCaseDetailNewList
	* @param auditNewDetail
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> marketCaseAuditDetailOutParam(Map<String, Object> marketCaseBasicNewMap,
			Map<String, Object> marketCaseDetailNew,
			Map<String, Object> auditNewDetail,
			List<Map<String, Object>> auditDetailNewList,
			Map<String,Object> auditDetail) {
		Map<String,Object> marketCaseAuditDetail = new HashMap<String,Object>();
		marketCaseAuditDetail.put("MARKET_CASE_BASIC", marketCaseBasicNewMap);
		marketCaseAuditDetail.put("MARKET_CASE_DETAIL",marketCaseDetailNew);
		marketCaseAuditDetail.put("AUDIT_DETAIL",auditNewDetail);
		marketCaseAuditDetail.put("AUDIT_DETAIL_LIST", auditDetailNewList);
		marketCaseAuditDetail.put("ACT_DETAIL", auditDetail);
		return marketCaseAuditDetail;
	}

	/**
	 * marketCaseBasic入参大小写转换
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: marketCaseBasicMapInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> marketCaseBasicMapInParam(InDTO inDTO){
		MBean mbean = inDTO.getMbean();
		Map<String,Object> marketCase = (Map<String,Object>)mbean.getBody();
		Map<String,Object> marketCaseBasic = (Map<String,Object>)marketCase.get("MARKET_CASE_BASIC");
		Map<String,Object> marketCaseBasicMap = new HashMap<String,Object>();
		
		marketCaseBasicMap.put("marketCaseId", marketCaseBasic.get("MARKET_CASE_ID"));
		marketCaseBasicMap.put("marketCaseClass", marketCaseBasic.get("MARKET_CASE_CLASS"));
		marketCaseBasicMap.put("marketCaseName", marketCaseBasic.get("MARKET_CASE_NAME"));
		marketCaseBasicMap.put("triggerMode", marketCaseBasic.get("TRIGGER_MODE"));
		marketCaseBasicMap.put("marketCaseType", marketCaseBasic.get("MARKET_CASE_TYPE"));
		marketCaseBasicMap.put("marketCaseLevel", marketCaseBasic.get("MARKET_CASE_LEVEL"));
		marketCaseBasicMap.put("marketCaseDesc", marketCaseBasic.get("MARKET_CASE_DESC"));
		marketCaseBasicMap.put("marketCaseBusiType", marketCaseBasic.get("MARKET_CASE_BUSI_TYPE"));
		marketCaseBasicMap.put("operNo", marketCaseBasic.get("OPER_NO"));
		marketCaseBasicMap.put("regionCode", marketCaseBasic.get("REGION_CODE"));
		marketCaseBasicMap.put("groupId", marketCaseBasic.get("GROUP_ID"));
		marketCaseBasicMap.put("operName", marketCaseBasic.get("OPER_NAME"));
		marketCaseBasicMap.put("isAudit", marketCaseBasic.get("ISAUDIT"));
		//add by yl at 2017-2-27.湖北增加草稿状态的处理
		if(CommonUtils.objectIsNull(marketCaseBasic.get("IS_DRAFT")) == false){
			marketCaseBasicMap.put("isDraft", marketCaseBasic.get("IS_DRAFT"));
		}		
		//add by yl at 2017-2-27.对于编辑情况，为了不给entity层造成问题，增加由前台决定营销案状态的特殊处理。
		if(CommonUtils.objectIsNull(marketCaseBasic.get("STATUS_CODE")) == false){
			marketCaseBasicMap.put("statusCode", marketCaseBasic.get("STATUS_CODE"));
		}
				
		String edTime = (String)marketCaseBasic.get("END_TIME");
		String stTime = (String)marketCaseBasic.get("START_TIME");
		String opTime = (String)marketCaseBasic.get("OPER_TIME");
		
		if(CommonUtils.objectIsNull(stTime) == false){
		  String startTime = DateUtil.stringToString(this.timeConvert(stTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  marketCaseBasicMap.put("startTime", startTime);	
		}
		if(CommonUtils.objectIsNull(edTime) == false){
		  String endTime = DateUtil.stringToString(this.timeConvert(edTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  marketCaseBasicMap.put("endTime", endTime);	
		}
		if(CommonUtils.objectIsNull(opTime) == false){
		  String operTime = DateUtil.stringToString(this.timeConvert(opTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  marketCaseBasicMap.put("operTime", operTime);	
		}
		
		return marketCaseBasicMap;
	}


	/**
	 * 
	 * marketCaseBasic出参大小写转换
	* @date: 2016-9-14 
	* @author: tangaq
	* @title: marketCaseBasicMapOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> marketCaseBasicMapOutParam(Map<String,Object> outParam){
	    Map<String,Object> marketCaseBasicMap = new HashMap<String,Object>();
		marketCaseBasicMap.put("MARKET_CASE_ID", outParam.get("marketCaseId"));
		marketCaseBasicMap.put("MARKET_CASE_NAME", outParam.get("marketCaseName"));
		marketCaseBasicMap.put("TRIGGER_MODE", outParam.get("triggerMode"));
		marketCaseBasicMap.put("TRIGGER_MODE_NAME", outParam.get("triggerModeName"));
		marketCaseBasicMap.put("MARKET_CASE_TYPE", outParam.get("marketCaseType"));
		marketCaseBasicMap.put("MARKET_CASE_TYPE_NAME", outParam.get("marketCaseTypeName"));
		marketCaseBasicMap.put("MARKET_CASE_BUSI_TYPE", outParam.get("marketCaseBusiType"));
		marketCaseBasicMap.put("MARKET_CASE_BUSI_TYPE_NAME", outParam.get("marketCaseBusiTypeName"));
		marketCaseBasicMap.put("MARKET_CASE_CLASS", outParam.get("marketCaseClass"));
		marketCaseBasicMap.put("MARKET_CASE_CLASS_NAME", outParam.get("marketCaseClassName"));
		marketCaseBasicMap.put("MARKET_CASE_LEVEL", outParam.get("marketCaseLevel"));
		marketCaseBasicMap.put("MARKET_CASE_LEVEL_NAME", outParam.get("marketCaseLevelName"));
		marketCaseBasicMap.put("MARKET_CASE_MARK", outParam.get("marketCaseMark"));
		marketCaseBasicMap.put("MARKET_CASE_MARK_NAME", outParam.get("marketCaseMarkName"));
		marketCaseBasicMap.put("PUSH_MODE", outParam.get("pushMode"));
		marketCaseBasicMap.put("PUSH_MODE_NAME", outParam.get("pushModeName"));
		marketCaseBasicMap.put("STATUS_CODE", outParam.get("statusCode"));
		marketCaseBasicMap.put("MARKET_CASE_DESC", outParam.get("marketCaseDesc"));
		marketCaseBasicMap.put("OPER_NO", outParam.get("operNo"));
		marketCaseBasicMap.put("PHONE", outParam.get("phone"));
		marketCaseBasicMap.put("OPER_NAME", outParam.get("operName"));
		marketCaseBasicMap.put("OPER_TIME", outParam.get("operTime"));
		
		String stTime = (String)outParam.get("startTime");
		String edTime = (String)outParam.get("endTime");
		if(CommonUtils.objectIsNull(stTime) == false){
		  String startTime = DateUtil.stringToString(stTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2);
		  marketCaseBasicMap.put("START_TIME", startTime);
		}
		if(CommonUtils.objectIsNull(edTime) == false){
		  String endTime = DateUtil.stringToString(edTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2);
		  marketCaseBasicMap.put("END_TIME", endTime);	
		}
		

		marketCaseBasicMap.put("START_TIME_2", stTime);//带时分秒的开始时间
		marketCaseBasicMap.put("END_TIME_2", edTime);//带时分秒的结束时间
		
		return marketCaseBasicMap;
	}
	
	/**营销案基本信息入参处理
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: marketCaseBasicInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String,Object> marketCaseBasicInParam(InDTO inDTO){
		MBean bean = inDTO.getMbean();
		Map<String,Object> body = bean.getBody();
		Map<String,Object> marketCaseBasic = new HashMap<String, Object>();
		
		//活动信息
		marketCaseBasic.put("marketCaseId", body.get("MARKET_CASE_ID"));
		marketCaseBasic.put("marketCaseClass", body.get("MARKET_CASE_CLASS"));
		marketCaseBasic.put("marketCaseName", body.get("MARKET_CASE_NAME"));
		marketCaseBasic.put("triggerMode", body.get("TRIGGER_MODE"));
		marketCaseBasic.put("pushMode", body.get("PUSH_MODE"));
		marketCaseBasic.put("marketCaseType", body.get("MARKET_CASE_TYPE"));
		marketCaseBasic.put("marketCaseMsgSendType",body.get("MARKET_CASE_MSG_SEND_TYPE"));
		marketCaseBasic.put("marketCaseLevel", body.get("MARKET_CASE_LEVEL"));
		marketCaseBasic.put("marketCaseMark", body.get("MARKET_CASE_MARK"));
		marketCaseBasic.put("marketCaseDesc", body.get("MARKET_CASE_DESC"));
		marketCaseBasic.put("marketCaseBusiType", body.get("MARKET_CASE_BUSI_TYPE"));
		marketCaseBasic.put("operNo", body.get("OPER_NO"));
		marketCaseBasic.put("regionCode", body.get("REGION_CODE"));
		marketCaseBasic.put("groupId", body.get("GROUP_ID"));
		marketCaseBasic.put("groupName", body.get("GROUP_NAME"));
		marketCaseBasic.put("operName", body.get("OPER_NAME"));
		marketCaseBasic.put("phoneNo", body.get("PHONE_NO"));
		//活动发起信息
		marketCaseBasic.put("actName",body.get("MARKET_CASE_NAME"));
		marketCaseBasic.put("actType",body.get("MARKET_CASE_TYPE"));
		marketCaseBasic.put("actClass",body.get("MARKET_CASE_CLASS"));
		marketCaseBasic.put("actDesc",body.get("MARKET_CASE_DESC"));
		marketCaseBasic.put("actTarget",body.get("ACT_TARGET"));
		marketCaseBasic.put("targetUserDesc",body.get("TARGETUSER_DESC"));
		marketCaseBasic.put("targerFileName",body.get("TARGETFILE_NAME"));
		marketCaseBasic.put("tfSystemName",body.get("TF_SYSTEM_NAME") );
		marketCaseBasic.put("policyDesc",body.get("POLICY_DESC"));
		marketCaseBasic.put("policyFileName",body.get("POLICYFILE_NAME"));
		marketCaseBasic.put("pfSystemName",body.get("PF_SYSTEM_NAME") );
		marketCaseBasic.put("channelId",body.get("CHANNEL_ID"));
		marketCaseBasic.put("channelRuleDesc",body.get("CHANNELRULE_DESC"));
		marketCaseBasic.put("workOrdercloseDesc",body.get("WORKORDERCLOSE_DESC"));
		marketCaseBasic.put("workOrderCloseFileName",body.get("WORKORDERCLOSEFILE_NAME"));
		marketCaseBasic.put("wfSystemName",body.get("WF_SYSTEM_NAME") );
		marketCaseBasic.put("assessRuleDesc",body.get("ASSESSRULE_DESC"));
		marketCaseBasic.put("assessRuleFileName",body.get("ASSESSRULEFILE_NAME"));
		marketCaseBasic.put("rufSystemName",body.get("RUF_SYSTEM_NAME"));
		marketCaseBasic.put("assessReportFileName",body.get("ASSESSREPORTFILE_NAME"));
		marketCaseBasic.put("refSystemName",body.get("REPF_SYSTEM_NAME") );
		marketCaseBasic.put("statusCode",body.get("STATUS_CODE"));
		
		String edTime = (String)body.get("END_TIME");
		String stTime = (String)body.get("START_TIME");
		String opTime = (String)body.get("OPER_TIME");
		
		if(CommonUtils.objectIsNull(stTime) == false){
		  String startTime = DateUtil.stringToString(this.timeConvert(stTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  marketCaseBasic.put("startTime", startTime);	
		}
		if(CommonUtils.objectIsNull(edTime) == false){
		  String endTime = DateUtil.stringToString(this.timeConvert(edTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  marketCaseBasic.put("endTime", endTime);	
		}
		if(CommonUtils.objectIsNull(opTime) == false){
		  String operTime = DateUtil.stringToString(this.timeConvert(opTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  marketCaseBasic.put("operTime", operTime);	
		}
		
		return marketCaseBasic;
	}
	

	/**
	 * marketCaseDetail入参大小写转换
	* @date: 2016-10-12 
	* @author: tangaq
	* @title: marketCaseDetailInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> marketCaseDetailInParam(InDTO inDTO){
		MBean outBean = inDTO.getMbean();
		@SuppressWarnings("unchecked")
		Map<String,Object> marketCaseDetail = (Map<String,Object>)outBean.getBodyObject("MARKET_CASE_DETAIL");
		
		
		List<Map<String,Object>> custGroupList = (List<Map<String,Object>>)marketCaseDetail.get("CUST_GROUP_LIST");
		List<Map<String,Object>> custGroupNewList = this.custGroupListInParam(custGroupList);
		
		List<Map<String,Object>> productCommodityList = (List<Map<String,Object>>)marketCaseDetail.get("PRODUCT_COMMODITY_LIST");
		List<Map<String,Object>> productCommodityNewList = this.productCommodityListInParam(productCommodityList);
		
		Map<String,Object> ruleInfo = (Map<String,Object>)marketCaseDetail.get("RULE_INFO");
		Map<String,Object> ruleNewInfo = this.ruleNewInfoInParam(ruleInfo);
		
		Map<String,Object> eventInfo = (Map<String,Object>)marketCaseDetail.get("EVENT_INFO");
		Map<String,Object> eventNewInfo = this.eventNewInfoInParam(eventInfo);
		
		Map<String,Object> marketCaseNewDetail = this.marketCaseNewDetailInParam(custGroupNewList,productCommodityNewList,ruleNewInfo,eventNewInfo);
		
		return marketCaseNewDetail;
	}


	/**
	 * marketCaseDetail出参大小写转换
	* @date: 2016-10-12 
	* @author: tangaq
	* @title: marketCaseNewDetailOutParam 
	* @param marketCaseDetail
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> marketCaseNewDetailOutParam(Map<String,Object> marketCaseDetail){
		List<Map<String,Object>> custGroupList = (List<Map<String,Object>>)marketCaseDetail.get("custGroupList");
		List<Map<String,Object>> custGroupNewList = this.custGroupListOutParam(custGroupList);
		
		List<Map<String,Object>> productCommodityList = (List<Map<String,Object>>)marketCaseDetail.get("productCommodityList");
		List<Map<String,Object>> productCommodityNewList = this.productCommodityListOutParam(productCommodityList);
		
		Map<String,Object> ruleInfo = (Map<String,Object>)marketCaseDetail.get("ruleInfo");
		Map<String,Object> ruleNewInfo = this.ruleNewInfoOutParam(ruleInfo);
		
		Map<String,Object> eventInfo = (Map<String,Object>)marketCaseDetail.get("eventInfo");
		Map<String,Object> eventNewInfo = this.eventNewInfoOutParam(eventInfo);
		
		Map<String,Object> marketCaseNewDetail = this.marketCaseNewDetail(custGroupNewList,productCommodityNewList,ruleNewInfo,eventNewInfo);
		
		return marketCaseNewDetail;
	}


	/**
	 * 组装marketCaseDetail
	* @date: 2016-10-12 
	* @author: tangaq
	* @title: marketCaseNewDetail 
	* @param custGroupNewList
	* @param productCommodityNewList
	* @param ruleNewInfo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> marketCaseNewDetail (List<Map<String,Object>> custGroupNewList,List<Map<String,Object>> productCommodityNewList,Map<String,Object> ruleNewInfo,Map<String,Object> eventNewInfo){
		Map<String,Object> marketCaseNewDetail = new HashMap<String,Object>();
		marketCaseNewDetail.put("CUST_GROUP_LIST", custGroupNewList);
		marketCaseNewDetail.put("PRODUCT_COMMODITY_LIST", productCommodityNewList);
		marketCaseNewDetail.put("RULE_INFO", ruleNewInfo);
		marketCaseNewDetail.put("EVENT_INFO", eventNewInfo);
		return marketCaseNewDetail;
	}


	/**
	 * 合并marketCaseNewDetail
	* @date: 2016-10-12 
	* @author: tangaq
	* @title: marketCaseNewDetailInParam 
	* @param custGroupNewList
	* @param productCommodityNewList
	* @param ruleNewInfo
	* @param eventNewInfo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> marketCaseNewDetailInParam(List<Map<String,Object>> custGroupNewList,List<Map<String,Object>> productCommodityNewList,Map<String,Object> ruleNewInfo,Map<String,Object> eventNewInfo){
		Map<String,Object> marketCaseNewDetailMap = new HashMap<String,Object>();
		marketCaseNewDetailMap.put("custGroupList",custGroupNewList);
		marketCaseNewDetailMap.put("productCommodityList",productCommodityNewList);
		marketCaseNewDetailMap.put("ruleInfo",ruleNewInfo);
		marketCaseNewDetailMap.put("eventInfo",eventNewInfo);
		return marketCaseNewDetailMap;
	}
	
	/**
	 * 将marketCaseDetailList和marketCaseBasic装进Map里
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: newMarketCaseInParam 
	* @param marketCaseMap
	* @param marketCaseDetailList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> newMarketCaseInParam(Map<String,Object> marketCaseMap,Map<String,Object> marketCaseDetail,List<Map<String,Object>> fileMap){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("marketCaseBasic", marketCaseMap);
		outMap.put("marketCaseDetail", marketCaseDetail);
		outMap.put("fileMap", fileMap);
		return outMap;
	}


	/**
	 * 将MARKET_CASE_DETAIL_LIST和MARKET_CASE_BASIC装进Map里
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: newMarketCaseOutParam 
	* @param marketCaseMap
	* @param marketCaseDetailList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> newMarketCaseOutParam(Map<String,Object> marketCaseMap,Map<String,Object> marketCaseDetail,Map<String,Object> actDetail){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("MARKET_CASE_BASIC", marketCaseMap);
		outMap.put("MARKET_CASE_DETAIL", marketCaseDetail);
		outMap.put("ACT_DETAIL",actDetail);
		return outMap;
	}


	/**
	 * positionList入参大小写转换
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: positionNewListInParam 
	* @param positionList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> positionNewListInParam(List<Map<String,Object>>  positionList){
		List<Map<String,Object>> positionNewList = new ArrayList<Map<String,Object>>();
	
		if(CommonUtils.objectIsNull(positionList) == false){
		  for(Map<String,Object> positionMap : positionList){
			Map<String,Object> positionNewMap = new HashMap<String,Object>();
			Map<String,Object> contentInfo = (Map<String,Object>)positionMap.get("CONTENT_INFO");
			Map<String,Object> contentNewInfo = this.contentNewInfoInParam(contentInfo);
			
			Map<String,Object> ruleInfo = (Map<String,Object>)positionMap.get("RULE_INFO");
			Map<String,Object> ruleNewInfo = this.ruleNewInfoInParam(ruleInfo);
			
			positionNewMap.put("positionId", positionMap.get("POSITION_ID"));
			positionNewMap.put("positionName", positionMap.get("POSITION_NAME"));
			positionNewMap.put("contentInfo", contentNewInfo);
			positionNewMap.put("ruleInfo", ruleNewInfo);
			positionNewList.add(positionNewMap);
		  }
		}	
		return positionNewList;
	}


	/**
	 * positionList出参大小写转换
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: positionNewListOutParam 
	* @param positionList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> positionNewListOutParam(List<Map<String,Object>>  positionList){
		List<Map<String,Object>> positionNewList = new ArrayList<Map<String,Object>>();
	
		if(CommonUtils.objectIsNull(positionList) == false){
		  for(Map<String,Object> positionMap : positionList){
			Map<String,Object> positionNewMap = new HashMap<String,Object>();
			Map<String,Object> contentInfo = (Map<String,Object>) positionMap.get("contentInfo");
			Map<String,Object> contentNewInfo = this.contentNewInfoOutParam(contentInfo);
			
			Map<String,Object> ruleInfo = (Map<String,Object>) positionMap.get("ruleInfo");
			Map<String,Object> ruleNewInfo = this.ruleNewInfoOutParam(ruleInfo);
			
			positionNewMap.put("POSITION_ID", positionMap.get("positionId"));
			positionNewMap.put("POSITION_NAME", positionMap.get("positionName"));
			positionNewMap.put("CONTENT_INFO", contentNewInfo);
			positionNewMap.put("RULE_INFO", ruleNewInfo);
			positionNewMap.put("CONTENT_ID", positionMap.get("contentId"));
			positionNewList.add(positionNewMap);
		  }
		}
		return positionNewList;
	}


	/**
	 * productCommodityList入参大小写转换
	* @date: 2016-10-12 
	* @author: tangaq
	* @title: productCommodityListInParam 
	* @param productCommodityList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> productCommodityListInParam (List<Map<String,Object>> productCommodityList){
		List<Map<String,Object>> productCommodityNewList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(productCommodityList) == false){
			for(Map<String,Object> productCommodity:productCommodityList){
				Map<String,Object> productCommodityNew = new HashMap<String,Object>();
				productCommodityNew.put("productCommodityId", productCommodity.get("PRODUCTCOMMODITY_ID"));
				productCommodityNew.put("productCommodityName", productCommodity.get("PRODUCTCOMMODITY_NAME"));
				productCommodityNewList.add(productCommodityNew);
			}
		}
		
		return productCommodityNewList;
	}
	
	
	/**
	 * productCommodityList出参大小写转换
	* @date: 2016-10-12 
	* @author: tangaq
	* @title: productCommodityListOutParam 
	* @param productCommodityList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> productCommodityListOutParam(List<Map<String,Object>> productCommodityList){
		List<Map<String,Object>> productCommodityNewList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(productCommodityList) == false){
			for(Map<String,Object> productCommodity:productCommodityList){
				Map<String,Object> productCommodityNew = new HashMap<String,Object>();
				productCommodityNew.put("PRODUCTCOMMODITY_ID", productCommodity.get("productCommodityId"));
				productCommodityNew.put("PRODUCTCOMMODITY_NAME", productCommodity.get("productCommodityName"));
				productCommodityNew.put("EFF_TIME", productCommodity.get("effTime"));
				productCommodityNew.put("EXP_TIME", productCommodity.get("expTime"));
				productCommodityNew.put("PRODUCTCOMMODITY_SRC", productCommodity.get("productCommoditySrc"));
				productCommodityNew.put("STATUS_CODE", productCommodity.get("statusCode"));
				productCommodityNew.put("CATA_CODE", productCommodity.get("cataCode"));
				productCommodityNew.put("CHANNEL_TYPE", productCommodity.get("channelType"));
				productCommodityNew.put("CONTENT", productCommodity.get("content"));
				productCommodityNew.put("PRODUCECOMMODITY_NOTE", productCommodity.get("produceCommodityNote"));
				productCommodityNewList.add(productCommodityNew);
			}
		}
		
		return productCommodityNewList;
	}


	/**
		 * ruleInfo出参大小写转换
		* @date: 2016-10-7 
		* @author: tangaq
		* @title: ruleNewInfoOutParam 
		* @param ruleInfo
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> ruleNewInfoOutParam(Map<String,Object> ruleInfo){
			Map<String,Object> ruleNewInfo = new HashMap<String,Object>();
			
			List<Map<String,Object>> ruleDetailList = (List<Map<String,Object>>)ruleInfo.get("ruleDetailList");
			List<Map<String,Object>> ruleDetailNewList = this.ruleNewListOutParam(ruleDetailList);
			
			ruleNewInfo.put("RULE_ID",ruleInfo.get("ruleId"));
			ruleNewInfo.put("RULE_DETAIL_LIST", ruleDetailNewList);
			return ruleNewInfo;
		}

	   /**
		 * 	ruleInfo入参大小写转换
		* @date: 2016-10-7 
		* @author: tangaq
		* @title: ruleNewInfoInParam 
		* @param ruleInfo
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> ruleNewInfoInParam(Map<String,Object> ruleInfo){
			Map<String,Object> ruleNewInfo = new HashMap<String,Object>();
			if(CommonUtils.objectIsNull(ruleInfo) == false){
			List<Map<String,Object>> ruleDetailList = (List<Map<String,Object>>)ruleInfo.get("RULE_DETAIL_LIST");
			List<Map<String,Object>> ruleDetailNewList = this.ruleNewListInParam(ruleDetailList);
			
			ruleNewInfo.put("ruleId",ruleInfo.get("RULE_ID"));
			ruleNewInfo.put("ruleDetailList",ruleDetailNewList);
			}
			return ruleNewInfo;
		}
	
	
	
	/**
	 * rule Params入参大小写转换
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: ruleDetailNewListInParam 
	* @param ruleDetailList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> ruleNewParamsInParam(List<Map<String,Object>> ruleParams){
		List<Map<String,Object>> ruleNewParams = new ArrayList<Map<String,Object>>();

		if(CommonUtils.objectIsNull(ruleParams) == false){
		  for(Map<String,Object> params : ruleParams){
			Map<String,Object> newParams = new HashMap<String,Object>();
			newParams.put("ruleParValue", params.get("RULE_PAR_VALUE"));
			newParams.put("batchNo", params.get("BATCH_NO"));
			newParams.put("ruleParName", params.get("RULE_PAR_NAME"));
			newParams.put("ruleParCode", params.get("RULE_PAR_CODE"));
			newParams.put("ruleDetailType", params.get("RULE_DETAIL_TYPE"));
			newParams.put("ruleDetailId", params.get("RULE_DETAIL_ID"));
			newParams.put("serialId", params.get("SERIAL_ID"));
			ruleNewParams.add(newParams);
		  }
		}
		return ruleNewParams;
	}
	
	/**
	 * ruleDetailList入参大小写转换
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: ruleNewListInParam 
	* @param ruleList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> ruleNewListInParam(List<Map<String,Object>> ruleList){
		List<Map<String,Object>> ruleNewList = new ArrayList<Map<String,Object>>();

		if(CommonUtils.objectIsNull(ruleList) == false){
		  for(Map<String,Object> ruleMap : ruleList){
			List<Map<String,Object>> ruleParams = (List<Map<String, Object>>) ruleMap.get("PARAMS");
			List<Map<String,Object>> ruleNewParams = this.ruleNewParamsInParam(ruleParams);
			Map<String,Object> ruleNewMap = new HashMap<String,Object>();
			ruleNewMap.put("ruleDetailId",ruleMap.get("RULE_DETAIL_ID"));
			ruleNewMap.put("ruleId",ruleMap.get("RULE_ID"));
			ruleNewMap.put("ruleDetailType",ruleMap.get("RULE_DETAIL_TYPE"));
			ruleNewMap.put("serialId",ruleMap.get("SERIAL_ID"));
			ruleNewMap.put("ruleParCode",ruleMap.get("RULE_PAR_CODE"));
			ruleNewMap.put("ruleParName",ruleMap.get("RULE_PAR_NAME"));
			ruleNewMap.put("batchNo",ruleMap.get("BATCH_NO"));
			ruleNewMap.put("params", ruleNewParams);
			ruleNewList.add(ruleNewMap);
		  }
		}
		return ruleNewList;
	}
	
	/**
	 * ruleDetailList出参大小写转换
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: ruleNewParamsOutParam 
	* @param ruleParams
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> ruleNewParamsOutParam(List<Map<String,Object>> ruleParams){
		List<Map<String,Object>> ruleNewParams = new ArrayList<Map<String,Object>>();

		if(CommonUtils.objectIsNull(ruleParams) == false){
		  for(Map<String,Object> params : ruleParams){
			Map<String,Object> newParams = new HashMap<String,Object>();
			newParams.put("RULE_PAR_VALUE", params.get("ruleParValue"));
			newParams.put("BATCH_NO", params.get("batchNo"));
			newParams.put("RULE_PAR_CODE", params.get("ruleParCode"));
			newParams.put("RULE_PAR_DESC", params.get("ruleParDesc"));
			newParams.put("SERIAL_ID", params.get("serialId"));
			newParams.put("RULE_PAR_NAME", params.get("ruleParName"));
			newParams.put("RULE_DETAIL_ID", params.get("ruleDetailId"));
			newParams.put("RULE_ID", params.get("ruleId"));
			newParams.put("RULE_PAR_VALUE", params.get("ruleParValue"));
			newParams.put("RULE_DETAIL_TYPE", params.get("ruleDetailType"));
			ruleNewParams.add(newParams);
		   }
		}
		return ruleNewParams;
	}
	
	/**
	 * ruleDetailList出参大小写转换
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: ruleNewListOutParam 
	* @param ruleList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> ruleNewListOutParam(List<Map<String,Object>> ruleList){
		List<Map<String,Object>> ruleNewList = new ArrayList<Map<String,Object>>();

		if(CommonUtils.objectIsNull(ruleList) == false){
		  for(Map<String,Object> ruleMap : ruleList){
			List<Map<String,Object>> ruleParams = (List<Map<String, Object>>) ruleMap.get("params");
			List<Map<String,Object>> ruleNewParams = this.ruleNewParamsOutParam(ruleParams);
			Map<String,Object> ruleNewMap = new HashMap<String,Object>();

			ruleNewMap.put("RULE_DETAIL_TYPE",ruleMap.get("ruleDetailType"));
			ruleNewMap.put("RULE_ID",ruleMap.get("ruleId"));
			ruleNewMap.put("RULE_DETAIL_ID",ruleMap.get("ruleDetailId"));
			ruleNewMap.put("SERIAL_ID",ruleMap.get("serialId"));
			ruleNewMap.put("PARAMS", ruleNewParams);
			ruleNewList.add(ruleNewMap);
		  }
	    }
		return ruleNewList;
	}
	
	/**
	 * 得到需求发起详细信息出参处理
	* @date: 2016-12-19 
	* @author: tangaq
	* @title: getActDemandDetailOutParams 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getActDemandDetailOutParams(Map<String,Object> outParam){
		Map<String,Object> noMap = new HashMap<String,Object>();
		List<Map<String,Object>> attachList = (List<Map<String,Object>>)outParam.get("attachList");
		List<Map<String,Object>> attachNewList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(attachList)==false){
			for(Map<String,Object> inMap:attachList){
				Map<String,Object> outMap = new HashMap<String,Object>();
				outMap.put("OPER_DATE", inMap.get("operDate"));
				outMap.put("ATTACH_TYPE", inMap.get("attachType"));
				outMap.put("BUSI_ID", inMap.get("busiId"));
				outMap.put("ATTACH_NAME", inMap.get("attachName"));
				outMap.put("BUSI_TYPE", inMap.get("busiType"));
				outMap.put("SERIAL_ID", inMap.get("serialId"));
				outMap.put("OPER_NAME", inMap.get("operName"));
				outMap.put("SYSTEM_NAME", inMap.get("systemName"));
				outMap.put("OPER_TIME", inMap.get("operTime"));
				outMap.put("OPER_NO", inMap.get("operNo"));
				outMap.put("NOTE", inMap.get("note"));
				attachNewList.add(outMap);
			}
		}
		
		noMap.put("SERIAL_ID", outParam.get("serialId"));
		noMap.put("ACT_TYPE",outParam.get("actType"));
		noMap.put("ACT_CLASS",outParam.get("actClass"));
		noMap.put("ACT_NAME", outParam.get("actName"));
		if(!CommonUtils.objectIsNull(outParam.get("startTime"))){
			noMap.put("START_TIME",DateUtil.stringToString((String)outParam.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
		}
		if(!CommonUtils.objectIsNull(outParam.get("endTime"))){
			noMap.put("END_TIME",DateUtil.stringToString((String)outParam.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
		}
		noMap.put("ACT_TARGET",outParam.get("actTarget"));
		noMap.put("TARGETUSER_DESC",outParam.get("targetUserDesc"));
		noMap.put("POLICY_DESC",outParam.get("policyDesc"));
		noMap.put("CHANNEL_ID",outParam.get("channelId"));
		noMap.put("POLICY_DESC", outParam.get("policyDesc"));
		noMap.put("CHANNELRULE_DESC",outParam.get("channelRuleDesc"));
		noMap.put("WORKORDERCLOSE_DESC",outParam.get("workOrdercloseDesc"));
		noMap.put("ASSESSRULE_DESC",outParam.get("assessRuleDesc"));
		noMap.put("ACT_DESC",outParam.get("actDesc"));
		noMap.put("MARKET_CASE_LEVEL",outParam.get("marketCaseLevel"));
		noMap.put("MARKET_CASE_TYPE",outParam.get("marketCaseType"));
		
		noMap.put("OPER_NO",outParam.get("operNo"));
		noMap.put("OPER_NAME",outParam.get("operName"));
		noMap.put("OPER_TIME",outParam.get("operTime"));
		noMap.put("GROUP_ID",outParam.get("groupId"));
		noMap.put("STATUS_CODE",outParam.get("statusCode"));
		noMap.put("ATTACHLIST",attachNewList);
		
		return noMap;
	}


	/**
	 * 入参时间格式转换(入参时间不确定带不带时分秒，若没有带则加上 00:00:00)
	* @date: 2016-9-21 
	* @author: tangaq
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