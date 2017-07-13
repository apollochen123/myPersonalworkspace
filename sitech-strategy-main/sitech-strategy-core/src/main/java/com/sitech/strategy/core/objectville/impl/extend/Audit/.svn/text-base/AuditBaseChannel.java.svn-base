 package com.sitech.strategy.core.objectville.impl.extend.Audit;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IAudit;
import com.sitech.strategy.core.objectville.inter.ICustGroup;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 审批对象
* @date: 2016-9-5 
* @author: yangwl
* @title: Audit 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class AuditBaseChannel extends BaseClass implements IAudit, Serializable {
	
	protected ICustGroup custGroup;
	/**
	 *  审批插入对象
	 */
	protected IDataInsertor.IAuditInsertor auditInsertor;
	/**
	 * 附件插入对象
	 */
	protected IDataInsertor.IAttachInsertor attachInsertor;
	/**
	 *  审批查询对象
	 */
	protected IDataSelector.IAuditSelector auditSelector;
	/**
	 *  审批更新对象
	 */
	protected IDataUpdater.IAuditUpdater auditUpdater;
	
	/**
	 * 审批删除对象
	 */
	protected IDataDeleter.IAuditDeleter auditDeleter;
	
	/**
	 * 工号查询对象
	 */
	protected IDataSelector.ILoginSelector loginSelector;
	
	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * persist 客户群插入对象
	 */
	protected IDataInsertor.ISystemDealInsertor systemDealInsertor;
	
	/**
	 * 
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: setCustGroup 
	* @param custGroup 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroup(ICustGroup custGroup) {
		this.custGroup = custGroup;
	}

	/**
	 * 
	* @date: 2016-10-13 
	* @author: tangaq
	* @title: setAuditDeleter 
	* @param auditDeleter 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAuditDeleter(IDataDeleter.IAuditDeleter auditDeleter) {
		this.auditDeleter = auditDeleter;
	}
	
	/**
	 * 
	* @date: 2017-1-6 
	* @author: tangaq
	* @title: setAttachInsertor 
	* @param attachInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAttachInsertor(IDataInsertor.IAttachInsertor attachInsertor) {
		this.attachInsertor = attachInsertor;
	}

	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setAuditInsertor 
	* @param auditInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAuditInsertor(IDataInsertor.IAuditInsertor auditInsertor) {
		this.auditInsertor = auditInsertor;
	}

	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setAuditSelector 
	* @param auditSelector 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAuditSelector(IDataSelector.IAuditSelector auditSelector) {
		this.auditSelector = auditSelector;
	}

	/**
	 * 
	* @date: 2016-9-30 
	* @author: wangth
	* @Title: setAuditUpdater 
	* @param auditUpdater 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAuditUpdater(IDataUpdater.IAuditUpdater auditUpdater) {
		this.auditUpdater = auditUpdater;
	}
	
	/**
	 * 
	* @date: 2017-3-9 
	* @author: tangaq
	* @title: setLoginSelector 
	* @param loginSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setLoginSelector(IDataSelector.ILoginSelector loginSelector) {
		this.loginSelector = loginSelector;
	}

	/**
	 * 
	* @date: 2016-10-9 
	* @author: wangth
	* @Title: setMarketCase 
	* @param marketCase 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCase(IMarketCase marketCase) {
		this.marketCase = marketCase;
	}
	
	/**
	 * 
	* @date: 2016-10-25 
	* @author: wangth
	* @Title: setSystemDealInsertor 
	* @param systemDealInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSystemDealInsertor(
			IDataInsertor.ISystemDealInsertor systemDealInsertor) {
		this.systemDealInsertor = systemDealInsertor;
	}

	/**
	 * 添加审核信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addAuditRecord 
	* @param inParam
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addAuditRecord(Map<String, Object> inParam) throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		IQueryFilter queryFilter = new QueryFilter();
		String marketCaseType = (String)inParam.get("marketCaseType");
		tempInParam.put("marketCaseId",inParam.get("marketCaseId"));

		//新建状态
		if(CommonUtils.objectIsNull((String)inParam.get("auditOrder"))){
			if(Const.MARKET_CASE_TYPE_SERVICE.equals(marketCaseType)){
				this.settleAddAuditRecordOfAuditNo(inParam);
			}else{
				if(Const.TRIGGER_MODE_PUSH.equals((String)inParam.get("pushMode"))){
					this.settleAddAuditRecordOfAuditNo(inParam);
				}else{
					inParam.put("auditOrder", Const.MARKET_CASE_AUDIT_ORDER_FIRST);
					this.settleAddAuditRecordOfAuditNo(inParam);
					tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_AUDIT_BUSSINESS);
					marketCase.updateMarketCaseStatusById(tempInParam);
				}
			}
		}else if(Const.MARKET_CASE_AUDIT_ORDER_FIRST.equals((String)inParam.get("auditOrder"))){
			if(Const.MARKET_CASE_TYPE_SERVICE.equals(marketCaseType)){
				this.updateAuditRecordStatusById(inParam);
				if(Const.TRUE_INT.equals((String)inParam.get("isPassAudit"))){
					tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_PLANE);
					marketCase.updateMarketCaseStatusById(tempInParam);
				}else{
					tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_NEW);
					marketCase.updateMarketCaseStatusById(tempInParam);
				}
			}else{
				this.updateAuditRecordStatusById(inParam);
				if(Const.TRUE_INT.equals((String)inParam.get("isPassAudit"))){
					this.settleAddAuditRecordOfAuditNo(inParam);
					tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_AUDIT_BUSSINESS);
					marketCase.updateMarketCaseStatusById(tempInParam);
				}else{
					//修改营销案状态，改成新建
					tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_NEW);
					marketCase.updateMarketCaseStatusById(tempInParam);
				}
			}
		}else if(Const.MARKET_CASE_AUDIT_ORDER_SECOND.equals((String)inParam.get("auditOrder"))) {
			this.updateAuditRecordStatusById(inParam);
			if(Const.TRUE_INT.equals((String)inParam.get("isPassAudit"))){
				tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_PLANE);
				marketCase.updateMarketCaseStatusById(tempInParam);
			}else{
				tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_NEW);
				marketCase.updateMarketCaseStatusById(tempInParam);
			}
		}else if(Const.MARKET_CASE_AUDIT_ORDER_THRID.equals((String)inParam.get("auditOrder"))){
			queryFilter.setRoleId(Const.ROLE_ID_MARKETCASE_PLAN);
			this.settleAddAuditRecordOfOperNo(inParam,queryFilter);
			tempInParam.put("statusCode",Const.MARKET_CASE_STATUS_DATACHECK);
			marketCase.updateMarketCaseStatusById(tempInParam);
		}else if(Const.MARKET_CASE_AUDIT_ORDER_FORTH.equals((String)inParam.get("auditOrder"))){
			
			if(Const.TRUE_INT.equals((String)inParam.get("isPassAudit"))){
				tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_CHECK);
				marketCase.updateMarketCaseStatusById(tempInParam);
				inParam.put("auditStatus",Const.MARKET_CASE_AUDIT_VIEW_PASS);
			}else{
				//修改营销案状态，改成活动策划中
				tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_PLANE);
				marketCase.updateMarketCaseStatusById(tempInParam);
				inParam.put("auditStatus",Const.MARKET_CASE_AUDIT_VIEW_BACK);
			}
			inParam.put("auditOrder", Const.MARKET_CASE_AUDIT_ORDER_FORTH);
			queryFilter.setRoleId(Const.ROLE_ID_MARKETCASE_DATA);
			Map<String,Object> temp = this.settleAddAuditRecordOfOperNo(inParam,queryFilter);
			
			inParam.put("auditRecordId",temp.get("auditRecordId"));
			this.settleAddAttachOfAuditRecord(inParam);
			
		}else if(Const.MARKET_CASE_AUDIT_ORDER_FIFTH.equals((String)inParam.get("auditOrder"))){
			if(Const.TRUE_INT.equals((String)inParam.get("isPassAudit"))){
				tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_WAITING);
				marketCase.updateMarketCaseStatusById(tempInParam);
				inParam.put("auditStatus",Const.MARKET_CASE_AUDIT_VIEW_PASS);
			}else{
				//修改营销案状态，改成活动策划中
				tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_PLANE);
				marketCase.updateMarketCaseStatusById(tempInParam);
				inParam.put("auditStatus",Const.MARKET_CASE_AUDIT_VIEW_BACK);
			}
			queryFilter.setRoleId(Const.ROLE_ID_MARKETCASE_SERVICE);
			inParam.put("auditOrder", Const.MARKET_CASE_AUDIT_ORDER_FIFTH);
			Map<String,Object> temp = this.settleAddAuditRecordOfOperNo(inParam,queryFilter);
			inParam.put("auditRecordId",temp.get("auditRecordId"));
			this.settleAddAttachOfAuditRecord(inParam);
		}else if(Const.MARKET_CASE_AUDIT_ORDER_SIXTH.equals((String)inParam.get("auditOrder"))){
			queryFilter.setRoleId(Const.ROLE_ID_MARKETCASE_GRAY);
			this.settleAddAuditRecordOfOperNo(inParam,queryFilter);
		}
	}
	
	/**
	 * 添加审核工号
	* @date: 2016-10-11 
	* @author: wangth
	* @Title: addAuditNo 
	* @param inParam
	* @param tempInParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addAuditNo(Map<String,Object>inParam,Map<String,Object> tempInParam) throws StrategyError{
		tempInParam.putAll(inParam);
		auditInsertor.insertAuditNo(inParam, tempInParam);
	}
	
	/**
	 * 添加下载审批记录
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: addLoadAuditRecord 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addDownLoadAuditRecord(Map<String,Object>inParam) throws StrategyError{
		if(CommonUtils.objectIsNull((String)inParam.get("auditOrder"))){
			Map<String,Object> tempInParam = settleAddAuditParam(inParam);
			tempInParam.put("auditNo", (String)inParam.get("auditNo"));
			tempInParam.put("operNo", (String)inParam.get("operNo"));
			auditInsertor.insertAuditRecord(inParam, tempInParam);
		}else{
			this.settleUpdateDownLoadAuditRecordParam(inParam);
		}
	}
	
	/**
	 * 删除审批工号
	* @date: 2016-10-13 
	* @author: tangaq
	* @title: removeAuditNo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeAuditNo(Map<String,Object> inParam) throws StrategyError{
		auditDeleter.deleteAuditNo(inParam);
	}
	
	/**
	 * 查询审批工号列表
	* @date: 2016-10-11 
	* @author: wangth
	* @Title: queryAuditNo 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryAuditNoList(Map<String, Object> inParam,
			IQueryFilter queryFilter) throws StrategyError {
		queryFilter.setAuditType((String)inParam.get("auditType"));
		return auditSelector.selectAuditNoList(inParam, queryFilter);
	}
	
	/**
	 * 查询审核历史信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryAuditRecordHis 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryAuditRecordHis(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		
		return null;
	}

	/**
	 * 根据不同条件查询审核任务列表 
	* @date: 2016-10-2 
	* @author: wangth 
	* @title: queryAuditRecordList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryAuditRecordList(
			Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		this.settleQueryAuditRecordListParams(inParam,queryFilter);
		List<Map<String,Object>> auditList = auditSelector.selectMarketCaseAuditRecordList(inParam, queryFilter);
		return auditList;
	}
	
	/**
	 * 根据Id查询审批记录详情
	* @date: 2016-9-29 
	* @author: wangth
	* @Title: queryAuditRecordDetail 
	* @param inParam
	* @param queryFilter
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryAuditRecordDetail(
			Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError{
		Map<String,Object> auditMap = (Map<String,Object>)(auditSelector.selectMarketCaseAuditRecordList(inParam, queryFilter).get(0));
		return auditMap;
	}
	
	/**
	 *查询下载审批记录列表
	* @date: 2016-10-18 
	* @author: wangth
	* @Title: queryDownLoadAuditRecordList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String,Object>> queryDownLoadAuditRecordList(Map<String, Object> inParam, IQueryFilter queryFilter)throws StrategyError{
		this.settleQueryAuditRecordListParams(inParam,queryFilter);
		List<Map<String,Object>> auditList = auditSelector.selectDownLoadAuditRecordList(inParam, queryFilter);
		return auditList;
	}
	
	@Override
	public List<Map<String, Object>> queryMarketCaseAuditCaseList(
			IQueryFilter queryFilter) throws StrategyError {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 更新审批任务操作状态
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: updateAuditRecordStatusById 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateAuditRecordStatusById(
			Map<String, Object> inParam) throws StrategyError {
		auditUpdater.updateAuditRecord(this.settleUpdateAuditParam(inParam));
	}
	
	/**
	 * 处理 添加审批人的审批记录
	* @date: 2016-10-14 
	* @author: wangth
	* @Title: settleAddAuditRecordOfAuditNo 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void settleAddAuditRecordOfAuditNo(Map<String,Object> inParam) throws StrategyError{
		IQueryFilter queryFilter = new QueryFilter();
		List<Map<String,Object>> auditNoList = this.settleQueryAuditNoByChannelIdParam(inParam, queryFilter);
		if(!CommonUtils.objectIsNull(auditNoList)){
			for(Map<String,Object> auditNoMap:auditNoList){
				Map<String,Object> auditMap = this.settleAddAuditParam(inParam);
				auditMap.put("auditNo", auditNoMap.get("auditNo"));
				auditInsertor.insertAuditRecord(inParam,auditMap);
			}
			if (CommonUtils.objectIsNull((String)inParam.get("auditOrder"))) {
				Map<String,Object> param = new HashMap<String, Object>();
				param.put("marketCaseId", inParam.get("marketCaseId"));
				param = this.settleUpdateMarketCaseStatusParam(param);
				marketCase.updateMarketCaseBasicById(param);
			}
		}	
	}
	
	/**
	 * 处理添加操作人的审批记录
	* @date: 2017-3-9 
	* @author: tangaq
	* @title: settleAddAuditRecordOfOperNo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> settleAddAuditRecordOfOperNo(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		String status = inParam.get("auditStatus")==null?Const.MARKET_CASE_AUDIT_VIEW_PASS:(String)inParam.get("auditStatus");
		
		IQueryFilter marketQueryFilter = new QueryFilter();
		marketQueryFilter.setMarketCaseId((String)inParam.get("marketCaseId"));
		Map<String,Object> marketCaseMap = marketCase.queryMarketCaseBasicById(inParam, marketQueryFilter);
      
		String regionCode = (String)marketCaseMap.get("regionCode");
		
		List<Map<String,Object>> loginNoList =  loginSelector.selectRoleUserRel(inParam, queryFilter);
		Map<String,Object> auditMap = this.settleAddAuditParam(inParam);
		String auditNo = "";
		if(!CommonUtils.objectIsNull(loginNoList)){
			for(Map<String,Object> loginMap:loginNoList){
				String userRegionCode = (String)loginMap.get("regionCode");
				if("0".equals(userRegionCode) || regionCode.equals(userRegionCode)){
					auditNo += (String)loginMap.get("loginNo")+",";
				}
			}
		}
		if(!"".equals(auditNo)){
			auditMap.put("auditNo", auditNo.substring(0,auditNo.length()-1));
		}
		
		auditMap.put("auditStatus",status);
		auditMap.put("auditDesc", inParam.get("auditDesc"));
		auditMap.put("auditOrder",inParam.get("auditOrder"));
		auditInsertor.insertAuditRecord(inParam,auditMap);

		return auditMap;
	}
	
	/**
	 * 添加审批参数处理
	* @date: 2016-9-30 
	* @author: wangth
	* @Title: addAuditSettleParam 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> settleAddAuditParam(Map<String,Object> tempInParam){
		Map<String,Object> auditMap = new HashMap<String,Object>();
		String auditRecordId = SequenceUtil.getSequence();
		auditMap.put("auditRecordId", auditRecordId);
		if(!CommonUtils.objectIsNull((String)tempInParam.get("marketCaseId"))){
			auditMap.put("busiId", (String)tempInParam.get("marketCaseId"));
			auditMap.put("busiType", Const.COMPONENT_TYPE_MARKETCASE);
		}else if(!CommonUtils.objectIsNull((String)tempInParam.get("custGroupId"))){
			auditMap.put("busiId", (String)tempInParam.get("custGroupId"));
			auditMap.put("busiType", Const.COMPONENT_TYPE_CUSTGROUP);
		}
		auditMap.put("auditStatus",Const.MARKET_CASE_AUDIT_VIEW_PEND);
		auditMap.put("auditTime",new Date());
		auditMap.put("operDate",new Date());
		auditMap.put("cityCode",(String)tempInParam.get("cityCode"));
		auditMap.put("regionCode",(String)tempInParam.get("regionCode"));
		auditMap.put("groupId",(String)tempInParam.get("groupId"));
		auditMap.put("operNo",(String)tempInParam.get("operNo"));
		auditMap.put("operName",(String)tempInParam.get("operName"));
		if(!CommonUtils.objectIsNull((String)tempInParam.get("auditOrder"))){
			auditMap.put("auditOrder",Integer.parseInt((String)tempInParam.get("auditOrder"))+Integer.parseInt(Const.TRUE_INT));
		}else{
			auditMap.put("auditOrder",Const.MARKET_CASE_AUDIT_ORDER_FIRST);
		}			
		return auditMap;
	}

	/**
	 * 处理审批中的附件信息
	* @date: 2017-1-6 
	* @author: tangaq
	* @title: settleAddAttachOfAuditRecord 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void settleAddAttachOfAuditRecord(Map<String,Object> inParam)throws StrategyError{
		if(!CommonUtils.objectIsNull(inParam.get("fileName"))){
			Map<String,Object> tempInParam = new HashMap<String,Object>();
			tempInParam.put("serialId", SequenceUtil.getSequence());
			tempInParam.put("busiId", inParam.get("auditRecordId"));
			tempInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE);
			tempInParam.put("attachName", inParam.get("fileName"));
			tempInParam.put("attachType", Const.ATTACH_FILR_TYPE_AUDITRECORD);
			tempInParam.put("systemName", inParam.get("systemName"));
			tempInParam.put("operNo", inParam.get("operNo"));
			tempInParam.put("operName", inParam.get("operName"));
			tempInParam.put("operDate", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
			attachInsertor.insertAttachs(tempInParam, tempInParam);
		}
	}
	
	/**
	 * 处理导入目标客群进程参数处理(已废弃)
	* @date: 2016-10-23 
	* @author: wangth
	* @Title: settleCustGroupShellProcessParam 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Deprecated
	protected void settleMarketCaseShellProcessParam(Map<String,Object> inParam)throws StrategyError{
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("busiId", inParam.get("marketCaseId"));
		tempInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE);
		//tempInParam.put("processNo", Const.SHELLPROCESS_NO_MARKETCASE);
		//tempInParam.put("processName", Const.SHELLPROCESS_NAME_MARKETCASE);
		tempInParam.put("updateTime", new Date());
		systemDealInsertor.insertShellProcessExecuteInfo(tempInParam);
		tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("busiId", inParam.get("marketCaseId"));
		tempInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE);
		//tempInParam.put("processNo", Const.SHELLPROCESS_NO_CHANNELTASK);
		//tempInParam.put("processName", Const.SHELLPROCESS_NAME_CHANNELTASK);
		tempInParam.put("updateTime", new Date());
		systemDealInsertor.insertShellProcessExecuteInfo(tempInParam);
	}
	
	/**
	 * 根据渠道Id查询工号
	* @date: 2016-10-11 
	* @author: wangth
	* @Title: settleChannelIdParam 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> settleQueryAuditNoByChannelIdParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		List<Map<String,Object>> channelIdList = marketCase.queryChannelIdByMarketCaseId(inParam,queryFilter);
		List<Map<String,Object>> auditNoList = new ArrayList<Map<String,Object>>();
		queryFilter = new QueryFilter();
		queryFilter.setAuditType((String)inParam.get("auditType"));
		queryFilter.setRegionCode((String)inParam.get("regionCode"));
		
		if(!CommonUtils.objectIsNull(channelIdList)){
			List<String> channelId = new ArrayList<String>();
			for(int i =0 ;i<channelIdList.size();i++){
				channelId.add((String) (channelIdList.get(i)).get("channelId"));
			}
			queryFilter.setChannelIdArray(channelId);
			
		}
		if(CommonUtils.objectIsNull((String)inParam.get("auditOrder"))){
			queryFilter.setAuditOrder(Const.MARKET_CASE_AUDIT_ORDER_FIRST);
		}else if(Const.MARKET_CASE_AUDIT_ORDER_FIRST.equals((String)inParam.get("auditOrder"))){
			queryFilter.setAuditOrder(Const.MARKET_CASE_AUDIT_ORDER_SECOND);
		}
		auditNoList = auditSelector.selectBusiAuditNoList(inParam, queryFilter);
		
		return auditNoList;
	}
	
	/**
	 * 处理 查询审批任务列表参数
	* @date: 2016-10-15 
	* @author: wangth
	* @Title: settleQueryAuditRecordListParams  
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void settleQueryAuditRecordListParams(Map<String, Object> inParam, IQueryFilter queryFilter){
		if(!CommonUtils.objectIsNull((String)inParam.get("auditOrder"))){
		queryFilter.setAuditOrder((String)inParam.get("auditOrder"));
		}
		if(!CommonUtils.objectIsNull((String)inParam.get("auditRecordId"))){
		queryFilter.setAuditRecordId((String)inParam.get("auditRecordId"));
		}
		if(!CommonUtils.objectIsNull((String)inParam.get("marketCaseId"))){
			queryFilter.setBusiId((String)inParam.get("marketCaseId"));
		}else if(!CommonUtils.objectIsNull((String)inParam.get("custGroupId"))){
			queryFilter.setCustGroupId((String)inParam.get("custGroupId"));
		}
		if(!CommonUtils.objectIsNull((String)inParam.get("auditNo"))){
		queryFilter.setAuditNo((String)inParam.get("auditNo"));
		}
		if(!CommonUtils.objectIsNull((String)inParam.get("busiType"))){
		queryFilter.setBusiType((String)inParam.get("busiType"));
		}
		if(!CommonUtils.objectIsNull(inParam.get("keyWords"))){
		List<String> keyWords = ((List<String>)inParam.get("keyWords"));
		queryFilter.setKeyWords(keyWords);
		}
		if(!CommonUtils.objectIsNull((String)inParam.get("auditStatus"))){
			queryFilter.setAuditStatus((String)inParam.get("auditStatus"));
		}
		
	}
	
	/**
	 * 处理修改审批表中的审批意见参数
	* @date: 2016-9-30 
	* @author: wangth
	* @Title: updateAuditSettleParam 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> settleUpdateAuditParam(Map<String,Object> inParam){
		Map<String,Object> updateMap = new HashMap<String,Object>();
		if(!CommonUtils.objectIsNull((String)inParam.get("marketCaseId"))){
			updateMap.put("busiId", (String)inParam.get("marketCaseId"));
		}else if(!CommonUtils.objectIsNull((String)inParam.get("marketCaseId"))){
			updateMap.put("busiId", (String)inParam.get("custGroupId"));
		}
		updateMap.put("auditOrder",(String)inParam.get("auditOrder"));
		updateMap.put("busiId",(String)inParam.get("marketCaseId"));
		updateMap.put("auditDesc", (String)inParam.get("auditDesc"));
		updateMap.put("auditTime", new Date());
		updateMap.put("operDate", new Date());
		updateMap.put("operNo", (String)inParam.get("operNo"));
		updateMap.put("operName", (String)inParam.get("operName"));
		updateMap.put("regionCode", (String)inParam.get("regionCode"));
		updateMap.put("groupId", (String)inParam.get("groupId"));
		if(Const.FLASE_INT.equals((String)inParam.get("isPassAudit"))){
			updateMap.put("auditStatus", Const.MARKET_CASE_AUDIT_VIEW_BACK);
		}else{
			updateMap.put("auditStatus", Const.MARKET_CASE_AUDIT_VIEW_PASS);
		}		
		return updateMap;
	}
	
	/**
	 * 处理更新下载审批记录参数
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: settleUpdateDownLoadAuditRecordParam 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void settleUpdateDownLoadAuditRecordParam(Map<String,Object> inParam) throws StrategyError{
		Map<String,Object> tempInParam = inParam;
		if(Const.TRUE_INT.equals((String)inParam.get("isPassAudit"))){
			tempInParam.putAll(inParam);
			tempInParam.put("auditStatus", Const.MARKET_CASE_AUDIT_VIEW_PASS);
			tempInParam.put("auditTime", new Date());
			tempInParam.put("busiId", (String)inParam.get("custGroupId"));
			auditUpdater.updateAuditRecord(tempInParam);
		}else{
			tempInParam.put("auditStatus", Const.MARKET_CASE_AUDIT_VIEW_BACK);
			tempInParam.put("auditTime", new Date());
		}
	}
	
	/**
	 * 处理 更新审批营销案记录参数
	* @date: 2016-10-15 
	* @author: wangth
	* @Title: settleUpdateAuditRecordParam 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void settleUpdateMarketCaseAuditRecordParam(Map<String,Object> inParam) throws StrategyError{
		IQueryFilter queryFilter = new QueryFilter();
		List<Map<String,Object>> auditNoList = this.settleQueryAuditNoByChannelIdParam(inParam, queryFilter);
		if(!CommonUtils.objectIsNull(auditNoList)){
			for(Map<String,Object> auditMap:auditNoList){
				Map<String,Object> updateMap = this.settleUpdateAuditParam(inParam);
				updateMap.put("auditNo", auditMap.get("auditNo"));
				updateMap.put("operNo", inParam.get("operNo"));
				this.updateAuditRecordStatusById(updateMap);
			}
		}
	}
	
	/**
	 * 处理 更新营销案状态参数
	* @date: 2016-10-9 
	* @author: wangth
	* @Title: settleUpdateMarketCaseStatusParam 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> settleUpdateMarketCaseStatusParam(Map<String,Object> inParam) throws StrategyError{
		Map<String,Object> tempInParam = inParam;
		if(Const.TRUE_INT.equals((String)inParam.get("isPassAudit"))){
			//改营销案状态改成策划中
			tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_PLANE);
			//this.settleMarketCaseShellProcessParam(tempInParam);
		}else if (Const.FLASE_INT.equals((String)inParam.get("isPassAudit"))) {
			//修改营销案状态，改成新建
			tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_NEW);
		}else{
			tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_AUDIT);
		}
		return tempInParam;
	}
}
