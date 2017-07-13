package com.sitech.strategy.common.pojo.impl.rdbms;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.rdbms.IIBatisQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 查询参数pojo
* @date: 2017-1-13 
* @author: sunliang 
* @title: IBatisQueryFilter 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class IBatisQueryFilter extends BaseClass implements IIBatisQueryFilter,Serializable {

	/**
	 * 
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: getSelectBatchPushMarketCaseAndCustGroupQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectBatchPushMarketCaseAndCustGroupQueryFilter(Map<String,Object> tempInParam) throws StrategyError {
		String marketCaseStatusCode = CommonUtils.objectIsNull(tempInParam.get("marketCaseStatusCode")) ? "04" : (String)tempInParam.get("marketCaseStatusCode");
		String marketCaseValidDate = CommonUtils.objectIsNull(tempInParam.get("marketCaseValidDate")) ? Const.TRUE_LOWER : (String)tempInParam.get("marketCaseValidDate");
		String sysDate = CommonUtils.objectIsNull(tempInParam.get("sysDate")) ? DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3) : (String)tempInParam.get("sysDate");
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setMarketStatusCode(marketCaseStatusCode);
		queryFilter.setMarketCaseValidDate(marketCaseValidDate);
		queryFilter.setSysDate(DateUtil.string2Timestamp(sysDate, DateUtil.TIME_FROMAT_SIMPLE3));
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-2-21 
	* @author:liuqi
	* @title: getSelectEventRelationQueryFilter
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectEventRelationQueryFilter(Map<String, Object> inParam) throws StrategyError{
		
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentRelId((String) inParam.get("parentRelId"));
		queryFilter.setParentComponentId((String) inParam.get("parentComponentId"));
		queryFilter.setParentComponentType((String) inParam.get("parentComponentType"));
		queryFilter.setComponentId((String) inParam.get("componentId"));
		queryFilter.setComponentType((String) inParam.get("componentType"));
		
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-3-17 
	* @author: yuanchun
	* @title: getSelectCallTaskMarketCaseAndCustGroupQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectCallTaskMarketCaseAndCustGroupQueryFilter(Map<String, Object> tempInParam) throws StrategyError {
		
		String marketCaseStatusCode = CommonUtils.objectIsNull(tempInParam.get("marketCaseStatusCode")) ? "04" : (String)tempInParam.get("marketCaseStatusCode");
		String marketCaseValidDate = CommonUtils.objectIsNull(tempInParam.get("marketCaseValidDate")) ? Const.TRUE_LOWER : (String)tempInParam.get("marketCaseValidDate");
		String sysDate = CommonUtils.objectIsNull(tempInParam.get("sysDate")) ? DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3) : (String)tempInParam.get("sysDate");
		
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setMarketStatusCode(marketCaseStatusCode);
		queryFilter.setMarketCaseValidDate(marketCaseValidDate);
		queryFilter.setSysDate(DateUtil.string2Timestamp(sysDate, DateUtil.TIME_FROMAT_SIMPLE3));
		
		return queryFilter;
	}
	
	
	/**
	 * 
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: getSelectChannelTaskMarketCaseAndCustGroupQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectChannelTaskMarketCaseAndCustGroupQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError {
		
		String marketCaseStatusCode = CommonUtils.objectIsNull(tempInParam.get("marketCaseStatusCode")) ? "04" : (String)tempInParam.get("marketCaseStatusCode");
		String marketCaseValidDate = CommonUtils.objectIsNull(tempInParam.get("marketCaseValidDate")) ? Const.TRUE_LOWER : (String)tempInParam.get("marketCaseValidDate");
		String sysDate = CommonUtils.objectIsNull(tempInParam.get("sysDate")) ? DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3) : (String)tempInParam.get("sysDate");
		
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setMarketStatusCode(marketCaseStatusCode);
		queryFilter.setMarketCaseValidDate(marketCaseValidDate);
		queryFilter.setSysDate(DateUtil.string2Timestamp(sysDate, DateUtil.TIME_FROMAT_SIMPLE3));
		
		return queryFilter;
	}

	/**
	 * 
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: getSelectChannelTriggerMarketCaseQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectChannelTriggerMarketCaseQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError {
		String marketCaseStatusCode = CommonUtils.objectIsNull(tempInParam.get("marketCaseStatusCode")) ? "04" : (String)tempInParam.get("marketCaseStatusCode");
		String marketCaseValidDate = CommonUtils.objectIsNull(tempInParam.get("marketCaseValidDate")) ? Const.TRUE_LOWER : (String)tempInParam.get("marketCaseValidDate");
		String sysDate = CommonUtils.objectIsNull(tempInParam.get("sysDate")) ? DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3) : (String)tempInParam.get("sysDate");
		String provinceCode = CommonUtils.objectIsNull(tempInParam.get("provinceCode")) ? "0" : (String)tempInParam.get("provinceCode");
		String regionCodeStr = CommonUtils.objectIsNull(tempInParam.get("regionCode")) ? "" : (String)tempInParam.get("regionCode");
		log.debug("getSelectChannelTriggerMarketCaseQueryFilter.regionCodeStr", regionCodeStr);
		
		List<String> regionCodeList = new ArrayList<String>();
		regionCodeList.add(provinceCode);
		regionCodeList.add(regionCodeStr);
		
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setMarketStatusCode(marketCaseStatusCode);
		queryFilter.setMarketCaseValidDate(marketCaseValidDate);
		queryFilter.setSysDate(DateUtil.string2Timestamp(sysDate, DateUtil.TIME_FROMAT_SIMPLE3));
		queryFilter.setRegionCodeArray(regionCodeList);
		
		log.debug("getSelectChannelTriggerMarketCaseQueryFilter.queryFilter.setMarketStatusCode", queryFilter.getMarketStatusCode());
		log.debug("getSelectChannelTriggerMarketCaseQueryFilter.queryFilter.setMarketCaseValidDate", queryFilter.getMarketCaseValidDate());
		log.debug("getSelectChannelTriggerMarketCaseQueryFilter.queryFilter.setSysDate", queryFilter.getSysDate());
		log.debug("getSelectChannelTriggerMarketCaseQueryFilter.queryFilter.setRegionCodeArray", queryFilter.getRegionCodeArray());
		
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-2-21 
	* @author: zhangjj_crmpd
	* @title: getSelectCustGroupListQueryFilter 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectCustGroupListQueryFilter(
			Map<String, Object> inParam) {
		IQueryFilter queryFilter=new QueryFilter();
		queryFilter.setCustGroupId((String)inParam.get("custGroupId"));
		queryFilter.setCustGroupName((String)inParam.get("custGroupName"));
		queryFilter.setCustGroupType((String)inParam.get("custGroupType"));
		queryFilter.setStatusCode((String)inParam.get("custGroupStatus"));
		queryFilter.setOperTimeStart((Timestamp) inParam.get("custGroupOperTimeStart"));
		queryFilter.setOperTimeEnd((Timestamp) inParam.get("custGroupOperTimeEnd"));
		queryFilter.setKeyWords((List<String>)inParam.get("keyWords"));
		queryFilter.setRegionCodeArray((List<String>)inParam.get("regionCodeArray"));
		queryFilter.setOperNo((String)inParam.get("operNo"));
		queryFilter.setCustGroupStartDate(CommonUtils.toString(inParam.get("custGroupStartDate")) );
		queryFilter.setCustGroupEndDate(CommonUtils.toString(inParam.get("custGroupEndDate")));
		String withoutBlack = (String)inParam.get("withoutBlack")==null?"false":(String)inParam.get("withoutBlack");
		if(withoutBlack.equals(Const.TRUE_LOWER)){
			queryFilter.setWithoutBlack(withoutBlack);
		}	
		//queryFilter.setOperTime((String)inParam.get("operTime"));
		//queryFilter.setOperTime((String)inParam.get("custGroupNum"));
		//queryFilter.setOperTime((String)inParam.get("operName"));
		return queryFilter;
	}

	/**
	 * 
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: getSelectGlobalRuleTypeQueryFilter 
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectGlobalRuleTypeQueryFilter() throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setRuleId(Const.RULE_VALUE_GLOBALRULE_RULEID);
		return queryFilter;
	}

	/**
	 * 
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: getSelectGlobalRuleDetailQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectGlobalRuleDetailQueryFilter(Map<String,Object> tempInParam)
			throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setRuleId(Const.RULE_VALUE_GLOBALRULE_RULEID);
		queryFilter.setRuleDetailId((String)tempInParam.get("globalRuleDetailId"));
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-4-5 
	* @author: sunyuan
	* @title: getSelectRelationQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectRelationQueryFilter(Map<String,Object> tempInParam)throws StrategyError{
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setComponentId((String)tempInParam.get("componentId"));
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: getSelectRuleDetailQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IQueryFilter getSelectRuleDetailQueryFilter(Map<String,Object> tempInParam) throws StrategyError{
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setRuleId((String) (CommonUtils.objectIsNull(tempInParam.get("ruleId"))?"":tempInParam.get("ruleId")));
		queryFilter.setRuleDetailType((String) (CommonUtils.objectIsNull(tempInParam.get("ruleDetailType"))?"":tempInParam.get("ruleDetailType")));
		queryFilter.setRuleParCode((String) (CommonUtils.objectIsNull(tempInParam.get("ruleParCode"))?"":tempInParam.get("ruleParCode")));
		
		log.debug("===IBatisQueryFilter.getSelectRuleDetailQueryFilter.queryFilter.getRuleId()===", queryFilter.getRuleId());
		log.debug("===IBatisQueryFilter.getSelectRuleDetailQueryFilter.queryFilter.getRuleDetailType()===", queryFilter.getRuleDetailType());
		log.debug("===IBatisQueryFilter.getSelectRuleDetailQueryFilter.queryFilter.getRuleParCode()===", queryFilter.getRuleParCode());
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: getSelectInventoryQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectInventoryQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setStartDate(DateUtil.string2Timestamp(CommonUtils.toString(tempInParam.get("startDate")) , DateUtil.TIME_FROMAT_SIMPLE1));
		queryFilter.setEndDate(DateUtil.string2Timestamp(CommonUtils.toString(tempInParam.get("endDate")) , DateUtil.TIME_FROMAT_SIMPLE1));
		queryFilter.setTaskName(CommonUtils.toString(tempInParam.get("taskName")));
		queryFilter.setOperNo(CommonUtils.toString(tempInParam.get("operNo")));
		queryFilter.setStatusCode(CommonUtils.toString(tempInParam.get("statusCode")));
		queryFilter.setApplyRegionCode(CommonUtils.toString(tempInParam.get("applyRegionCode")));
		queryFilter.setBusiId(CommonUtils.toString(tempInParam.get("busiId")));
		log.debug("getSelectInventoryQueryFilterg+++++++tempInParam", tempInParam.toString());
		return queryFilter;
	}

	/**
	 * 
	* @date: 2016-12-30 
	* @author: sunliang 
	* @title: getSelectMarketCaseIdListQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectMarketCaseIdListQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError {
		
		String queryDate = CommonUtils.objectIsNull(tempInParam.get("queryDate")) ? DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3) : (String)tempInParam.get("queryDate");
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setSysDate(DateUtil.string2Timestamp(queryDate,DateUtil.TIME_FROMAT_SIMPLE3));
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-4-17 
	* @author: yuanchun
	* @title: getselectMarketCaseReportFormListQueryFilter 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getselectMarketCaseReportFormListQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setMarketCaseName((String)tempInParam.get("marketCaseName"));
		queryFilter.setRegionCode((String)tempInParam.get("regionCode"));
		//后期备用
		//queryFilter.setOperNo((String)tempInParam.get("operNo"));
		return queryFilter;
	}

	/**
	 * 
	* @date: 2017-4-17 
	* @author: yuanchun
	* @title: getselectMarketCaseTargetCustCountQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getselectMarketCaseTargetCustCountQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setMarketCaseId((String)tempInParam.get("marketCaseId"));
		return queryFilter;
	}

	
	/**
	 * 
	* @date: 2017-4-5 
	* @author: sunyuan
	* @title: getSelectMarketCaseIdByChannelRelQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectMarketCaseIdByChannelRelQueryFilter(Map<String,Object> tempInParam)throws StrategyError{
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setRelId((String)tempInParam.get("parentRelId"));
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2016-12-30 
	* @author: sunliang 
	* @title: getSelectMarketCaseListQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectMarketCaseListQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError {
		String queryDate = CommonUtils.objectIsNull(tempInParam.get("queryDate")) ? DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3) : (String)tempInParam.get("queryDate");
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setSysDate(DateUtil.string2Timestamp(queryDate,DateUtil.TIME_FROMAT_SIMPLE3));
		return queryFilter;
	}

	/**
	 * 
	* @date: 2017-2-10 
	* @author: yuanchun
	* @title: getSelectProductListQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectProductListQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setProductId(CommonUtils.toString(tempInParam.get("productId")));
		queryFilter.setProductName(CommonUtils.toString(tempInParam.get("productName")));
		queryFilter.setProductType(CommonUtils.toString(tempInParam.get("productType")));
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-2-26 
	* @author: sunyuan
	* @title: getselectAreaPriorityRelByMarketCaseIdQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IQueryFilter getselectAreaPriorityRelByMarketCaseIdQueryFilter(Map<String,Object> tempInParam) throws StrategyError{
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setMarketCaseId(CommonUtils.toString(tempInParam.get("marketCaseId")));
		queryFilter.setChannelId(CommonUtils.toString(tempInParam.get("channelId")));
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: getSelectEventDetailListQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectEventDetailListQueryFilter(
			Map<String,Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter= new QueryFilter();		
		queryFilter.setEventId(CommonUtils.objectIsNull((String)tempInParam.get("eventId"))?"":(String)tempInParam.get("eventId"));
		queryFilter.setEventDetailType(CommonUtils.objectIsNull((String)tempInParam.get("eventDetailType"))?"":(String)tempInParam.get("eventDetailType"));
		queryFilter.setEventParCode(CommonUtils.objectIsNull((String)tempInParam.get("eventParCode"))?"":(String)tempInParam.get("eventParCode"));
		
		return queryFilter;
	}

	/**
	 * 
	* @date: 2017-2-14 
	* @author: sunyuan
	* @title: getSelectMarketCaseIdByEventIdListQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IQueryFilter getSelectMarketCaseIdByEventIdListQueryFilter(Map<String,Object> tempInParam) throws StrategyError{
		IQueryFilter queryFilter= new QueryFilter();
		queryFilter.setComponentId((String)tempInParam.get("eventId"));
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_CUSTGROUP);
		queryFilter.setComponentType(Const.COMPONENT_TYPE_EVENT);
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-3-30 
	* @author: sunyuan
	* @title: getSelectMarketCaseIdByRuleIdQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IQueryFilter getSelectMarketCaseIdByRuleIdQueryFilter(Map<String,Object> tempInParam) throws StrategyError{
		IQueryFilter queryFilter= new QueryFilter();
		queryFilter.setComponentId((String)tempInParam.get("ruleId"));
		queryFilter.setComponentType(Const.COMPONENT_TYPE_RULE);
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: getSelectEventTriggerMarketCaseQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectEventTriggerMarketCaseQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError {
		
		String dataBaseTime = (String)tempInParam.get("dataBaseTime");
		
		IQueryFilter queryFilter= new QueryFilter();		
		queryFilter.setSysDate(DateUtil.string2Timestamp(dataBaseTime,DateUtil.TIME_FROMAT_SIMPLE3));
		log.debug("getSelectEventTriggerMarketCaseQueryFilter.queryFilter.setSysDate", queryFilter.getSysDate());
		
		return queryFilter;
	}

	/**
	 * 
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: getSelectMarketCaseListFromChannelTaskQueryFilter 
	* @param inParam
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectMarketCaseListFromChannelTaskQueryFilter(
			Map<String, Object> inParam, Map<String, Object> tempInParam)
			throws StrategyError {
		
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setPositionId((String) tempInParam.get("positionId"));
		queryFilter.setMarketCaseId((String) tempInParam.get("marketCaseId"));
		queryFilter.setStatusCode("04");
		if ("1009".equals(inParam.get("numType"))) {
			queryFilter.setEdwDeptId((String) inParam.get("numValue"));
		}else if("1010".equals(inParam.get("numType"))){
			queryFilter.setServiceNo((String)inParam.get("numValue"));
		}else if("1011".equals(inParam.get("numType"))){
			queryFilter.setGridId((String)inParam.get("numValue"));
		}
		return queryFilter;
	}

	/**
	 * 
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: getSelectCustListFromChannelTaskQueryFilter 
	* @param inParam
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectCustListFromChannelTaskQueryFilter(
			Map<String, Object> inParam, Map<String, Object> tempInParam)
			throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setPositionId((String) tempInParam.get("positionId"));
		queryFilter.setMarketCaseId((String) tempInParam.get("marketCaseId"));
		queryFilter.setStatusCode("04");
		if ("1009".equals(inParam.get("numType"))) {
			queryFilter.setEdwDeptId((String) inParam.get("numValue"));
		}else if("1010".equals(inParam.get("numType"))){
			queryFilter.setServiceNo((String)inParam.get("numValue"));
		}else if("1011".equals(inParam.get("numType"))){
			queryFilter.setGridId((String)inParam.get("numValue"));
		}
		return queryFilter;
	}

	/**
	 * 
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: getSelecTaskListFromChannelTaskQueryFilter 
	* @param inParam
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelecTaskListFromChannelTaskQueryFilter(
			Map<String, Object> inParam, Map<String, Object> tempInParam)
			throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setPositionId((String) tempInParam.get("positionId"));
		queryFilter.setMarketCaseId((String) tempInParam.get("marketCaseId"));
		queryFilter.setStatusCode("04");
		if ("1009".equals(inParam.get("numType"))) {
			queryFilter.setEdwDeptId((String) inParam.get("numValue"));
		}else if("1010".equals(inParam.get("numType"))){
			queryFilter.setServiceNo((String)inParam.get("numValue"));
		}else if("1011".equals(inParam.get("numType"))){
			queryFilter.setGridId((String)inParam.get("numValue"));
		}else if("1007".equals(inParam.get("numType"))){
			queryFilter.setCustId((String)inParam.get("numValue"));
		}else if("1001".equals(inParam.get("numType"))){
			queryFilter.setServiceNbr((String)inParam.get("numValue"));
		}else if("1008".equals(inParam.get("numType"))){
			queryFilter.setAcctId((String)inParam.get("numValue"));
		}	
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-2-9 
	* @author: sunyuan
	* @title: getSelectCodeNameQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectCodeNameQueryFilter(Map<String,Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter= new QueryFilter();		
		queryFilter.setFieldEnName(CommonUtils.objectIsNull(tempInParam.get("fieldEnName"))? null:(String)tempInParam.get("fieldEnName"));
		queryFilter.setFieldDesc(CommonUtils.objectIsNull(tempInParam.get("fieldDesc"))? null:(String)tempInParam.get("fieldDesc"));
		queryFilter.setFieldValueDesc(CommonUtils.objectIsNull(tempInParam.get("fieldValueDesc"))? null:(String)tempInParam.get("fieldValueDesc"));
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-3-17 
	* @author: sunyuan
	* @title: getSelectPositionInfoQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectPositionInfoQueryFilter(Map<String,Object> tempInParam) throws StrategyError{
		IQueryFilter queryFilter= new QueryFilter();
		queryFilter.setPositionId(CommonUtils.objectIsNull(tempInParam.get("positionId"))?null:(String)tempInParam.get("positionId"));
		return queryFilter;
	}

	/**
	 * 
	* @date: 2017-2-9 
	* @author: sunyuan
	* @title: getSelectUserLabelListQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectUserLabelListQueryFilter(Map<String, Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter= new QueryFilter();		
		queryFilter.setUserLabelName(CommonUtils.objectIsNull(tempInParam.get("userLabelName"))? null:(String)tempInParam.get("userLabelName"));
		queryFilter.setCustGroupId(CommonUtils.objectIsNull(tempInParam.get("custGroupId"))? null:(String)tempInParam.get("custGroupId"));
		return queryFilter;
	}
	
	/**
	 * 查询用户标签列表(直接分页不加入缓存)
	* @date: 2017-3-14 
	* @author: zhangwie_crmpd_cmi_ah
	* @title: getUserLabelForPageQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getUserLabelForPageQueryFilter(Map<String, Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter= new QueryFilter();		
		queryFilter.setUserLabelName(CommonUtils.objectIsNull(tempInParam.get("userLabelName"))? null:(String)tempInParam.get("userLabelName"));
		queryFilter.setCustGroupId(CommonUtils.objectIsNull(tempInParam.get("custGroupId"))? null:(String)tempInParam.get("custGroupId"));
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: getSelectPayFeeEventIdQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectPayFeeEventIdQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter= new QueryFilter();		
		queryFilter.setEventType((String)tempInParam.get("eventType"));
		log.debug("getSelectPayFeeEventIdQueryFilter.queryFilter.getEventType()", queryFilter.getEventType());
		return queryFilter;
	}
	/**
	 * 
	* @date: 2017-3-14 
	* @author: chenhao 
	* @title: getSelectGreyListQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectGreyListQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError{
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setChannelId((String) tempInParam.get("channelId"));
		queryFilter.setPhoneNo((String) tempInParam.get("phoneNo"));
		queryFilter.setRegionCode((String) tempInParam.get("regionCode"));
		return queryFilter;
	}

	/**
	 * 
	* @date: 2017-3-8 
	* @author: sunliang 
	* @title: getSelectMarketCaseIdByEventIdQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectMarketCaseIdByEventIdQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter= new QueryFilter();		
		queryFilter.setEventId((String)tempInParam.get("eventId"));
		return queryFilter;
	}

	/**
	 * 
	* @date: 2017-3-30 
	* @author: sunyuan
	* @title: getSelectMarketCaseIdByEventIdQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectMarketCaseInfoByIdQueryFilter(Map<String, Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter= new QueryFilter();		
		queryFilter.setMarketCaseId((String)tempInParam.get("marketCaseId"));
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-3-8 
	* @author: sunliang 
	* @title: getSelectRuleDetailsByEventIdAndMarketCaseIdQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectRuleDetailsByEventIdAndMarketCaseIdQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter= new QueryFilter();		
		queryFilter.setEventId((String)tempInParam.get("eventId"));
		queryFilter.setMarketCaseId((String)tempInParam.get("marketCaseId"));
		return queryFilter;
	}

	/**
	 * 
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: getSelectRuleInfoListQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectRuleInfoListQueryFilter(Map<String, Object> tempInParam) throws StrategyError{
		IQueryFilter queryFilter= new QueryFilter();
		queryFilter.setRuleDetailType((String) tempInParam.get("ruleDetailType"));
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2017-3-8 
	* @author: sunliang 
	* @title: getSelectContentDetailsByEventIdAndMarketCaseIdQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectContentDetailsByEventIdAndMarketCaseIdQueryFilter(
			Map<String, Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter= new QueryFilter();		
		queryFilter.setEventId((String)tempInParam.get("eventId"));
		queryFilter.setMarketCaseId((String)tempInParam.get("marketCaseId"));
		return queryFilter;
	}

	/**
	 * 
	* @date: 2017-4-4 
	* @author: sunyuan
	* @title: getSelectContentDetailsByProdIdQueryFilter 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IQueryFilter getSelectContentDetailsByProdIdQueryFilter(Map<String,Object> tempInParam)throws StrategyError{
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setContentParValue((String)tempInParam.get("ruleParValue"));
		queryFilter.setContentParCode("offerProductId");
		return queryFilter;
	}
	/**
	 * 
	* @date: 2017-3-30 
	* @author: chenhao
	* @title: getSelectEventIdByRelIdQueryFilter 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IQueryFilter getSelectEventIdByRelIdQueryFilter(Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter= new QueryFilter();		
		queryFilter.setRelId((String)inParam.get("relId"));
		return queryFilter;
	}

}
