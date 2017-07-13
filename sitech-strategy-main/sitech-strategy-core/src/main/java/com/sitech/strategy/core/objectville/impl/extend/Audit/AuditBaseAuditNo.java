package com.sitech.strategy.core.objectville.impl.extend.Audit;

import java.io.Serializable;
import java.util.Arrays;
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
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

public class AuditBaseAuditNo extends BaseClass implements IAudit, Serializable  {
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
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * persist 客户群插入对象
	 */
	protected IDataInsertor.ISystemDealInsertor systemDealInsertor;
	
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

	public void setSystemDealInsertor(
			IDataInsertor.ISystemDealInsertor systemDealInsertor) {
		this.systemDealInsertor = systemDealInsertor;
	}
	
	/**
	 * 审批操作由省公司集中化管理，地市和省级策划人员进行营销案策划后都会提交省市场部管理员角色和省客服部管理员角色进行审批。即只有一级审批了。
	 * 省市场部管理员角色和省客服部管理员角色下可配多个工号，其中一个工号审批通过即可
	* @date: 2016-11-29 
	* @author: yuanliang
	* @title: addAuditRecord 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addAuditRecord(Map<String, Object> inParam)
			throws StrategyError {
		if(CommonUtils.objectIsNull((String)inParam.get("auditOrder")) == true){
			this.settleAddAuditRecordOfAuditNo(inParam);
		}else{
			
			/**
			 * 根据审批状态进行判断
			 * 1.1）打回
			 *   批量修改:某个营销案的相同审批顺序的所有审批记录为打回；
			 *   修改营销案为打回状态
			 * 1.2）通过  
			 *   修改当前的审批记录  
			 *   查询条件:某个营销案的相同审批顺序的审批记录，如果所有审批状态都是审批通过，则修改营销案状态为运行中  
			 */
			if(Const.TRUE_INT.equals((String)inParam.get("isPassAudit"))){
				//修改当前的审批记录
				this.updateAuditRecordStatusById(inParam);
				//查询条件:某个营销案 并且 相同审批顺序的审批记录，如果所有审批状态都是审批通过，则修改营销案状态为执行中  
				boolean isAllAuditPass=isAllAuditPassByAuditOrder(inParam);
				if(true==isAllAuditPass){
					marketCase.updateMarketCaseStatusById(this.setUpdateMarketCaseStatusParam(inParam, Const.MARKET_CASE_STATUS_TEST));
				}else{
					marketCase.updateMarketCaseStatusById(this.setUpdateMarketCaseStatusParam(inParam, Const.MARKET_CASE_STATUS_AUDIT));
				}
			}else{
				//批量修改:某个营销案的相同审批顺序的所有审批记录为打回
				Map<String,Object> tempInParam = inParam;
				tempInParam.remove("auditRecordId");//批量修改，去掉auditRecordId条件
				this.updateAuditRecordStatusById(tempInParam);
				//修改营销案为打回状态
				marketCase.updateMarketCaseStatusById(this.setUpdateMarketCaseStatusParam(inParam, Const.MARKET_CASE_STATUS_BACK));
			}
		}
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
	* update_version: 
	* update_date: 2016-10-20 
	* update_author: yuanliang
	* update_note:
	 */
	//@Override
	public void addAuditRecord_oldbak(Map<String, Object> inParam)
			throws StrategyError {
		if(CommonUtils.objectIsNull((String)inParam.get("auditOrder")) == true){
			this.settleAddAuditRecordOfAuditNo(inParam);
		}else if(Const.MARKET_CASE_AUDIT_ORDER_FIRST.equals((String)inParam.get("auditOrder"))){
			/**
			 * 根据审批状态进行判断
			 * 1.1）打回
			 *   批量修改:某个营销案的相同审批顺序的所有审批记录为打回；
			 *   修改营销案为打回状态
			 * 1.2）通过
			 *   修改当前的审批记录
			 *   查询条件:某个营销案的相同审批顺序的所有审批记录
			 *   1)如果所有审批状态都是审批通过，并且
			 *    a)没有后续审批人，则修改营销案状态为执行中
			 *    b)如果有后续审批人，则 根据前台计算好的审批人，插入审批表。同时，修改营销案状态为审批中。
			 *       目前有点前台和后台服务混合驱动工作流的。
			 *   2)未全部审批通过，则修改营销案状态为审批中。
			 */
			if(Const.TRUE_INT.equals((String)inParam.get("isPassAudit"))){
				//修改当前的审批记录
				this.updateAuditRecordStatusById(inParam);
				//查询条件:某个营销案 并且 相同审批顺序的审批记录，如果所有审批状态都是审批通过，则修改营销案状态为执行中  
				boolean isAllAuditPass=isAllAuditPassByAuditOrder(inParam);
				if(true==isAllAuditPass){
					//是否有审批人
					if(haveAuditor(inParam)){
						this.settleAddAuditRecordOfAuditNo(inParam);
						marketCase.updateMarketCaseStatusById(this.setUpdateMarketCaseStatusParam(inParam, Const.MARKET_CASE_STATUS_AUDIT));					
					}else{
						marketCase.updateMarketCaseStatusById(this.setUpdateMarketCaseStatusParam(inParam, Const.MARKET_CASE_STATUS_TEST));
					}
					
				}else{
					marketCase.updateMarketCaseStatusById(this.setUpdateMarketCaseStatusParam(inParam, Const.MARKET_CASE_STATUS_AUDIT));
				}				
				
			}else{
				//批量修改:某个营销案的相同审批顺序的所有审批记录为打回
				Map<String,Object> tempInParam = inParam;
				tempInParam.remove("auditRecordId");//批量修改，去掉auditRecordId条件
				this.updateAuditRecordStatusById(inParam);
				//修改营销案为打回状态
				marketCase.updateMarketCaseStatusById(this.setUpdateMarketCaseStatusParam(inParam, Const.MARKET_CASE_STATUS_BACK));				
			}
		}else if(Const.MARKET_CASE_AUDIT_ORDER_SECOND.equals((String)inParam.get("auditOrder"))) {

			/**
			 * 根据审批状态进行判断
			 * 1.1）打回
			 *   批量修改:某个营销案的相同审批顺序的所有审批记录为打回；
			 *   修改营销案为打回状态
			 * 1.2）通过  
			 *   修改当前的审批记录  
			 *   查询条件:某个营销案的相同审批顺序的审批记录，如果所有审批状态都是审批通过，则修改营销案状态为运行中  
			 */
			if(Const.TRUE_INT.equals((String)inParam.get("isPassAudit"))){
				//修改当前的审批记录
				this.updateAuditRecordStatusById(inParam);
				//查询条件:某个营销案 并且 相同审批顺序的审批记录，如果所有审批状态都是审批通过，则修改营销案状态为执行中  
				boolean isAllAuditPass=isAllAuditPassByAuditOrder(inParam);
				if(true==isAllAuditPass){
					marketCase.updateMarketCaseStatusById(this.setUpdateMarketCaseStatusParam(inParam, Const.MARKET_CASE_STATUS_TEST));
				}else{
					marketCase.updateMarketCaseStatusById(this.setUpdateMarketCaseStatusParam(inParam, Const.MARKET_CASE_STATUS_AUDIT));
				}
			}else{
				//批量修改:某个营销案的相同审批顺序的所有审批记录为打回
				Map<String,Object> tempInParam = inParam;
				tempInParam.remove("auditRecordId");//批量修改，去掉auditRecordId条件
				this.updateAuditRecordStatusById(tempInParam);
				//修改营销案为打回状态
				marketCase.updateMarketCaseStatusById(this.setUpdateMarketCaseStatusParam(inParam, Const.MARKET_CASE_STATUS_BACK));
			}
			
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
	public void addAuditNo(Map<String, Object> inParam,
			Map<String, Object> tempInParam) throws StrategyError {
		auditInsertor.insertAuditNo(inParam, tempInParam); 
		
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
	public List<Map<String, Object>> queryAuditNoList(
			Map<String, Object> inParam, IQueryFilter queryFilter)
			throws StrategyError {
		queryFilter.setRegionCode((String)inParam.get("regionCode"));
		queryFilter.setGroupId((String)inParam.get("groupId"));
		List<Map<String,Object>> auditNo = auditSelector.selectAuditNoList(inParam, queryFilter);
		return auditNo;
	}
	
	/**
	 * 保存下载审批
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: addDownLoadAuditRecord 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addDownLoadAuditRecord(Map<String, Object> inParam)
			throws StrategyError {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 查询审批工号历史信息
	* @date: 2016-10-14 
	* @author: wangth
	* @Title: queryAuditRecordHis 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryAuditRecordHis(
			Map<String, Object> inParam, IQueryFilter queryFilter)
			throws StrategyError {
		
		return null;
	}
	
	/**
	 * 查询审批记录
	* @date: 2016-10-14 
	* @author: wangth
	* @Title: queryAuditRecordList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryAuditRecordList(
			Map<String, Object> inParam, IQueryFilter queryFilter)
			throws StrategyError {
		this.settleQueryAuditRecordListParams(inParam,queryFilter);
		List<Map<String,Object>> auditList = auditSelector.selectMarketCaseAuditRecordList(inParam, queryFilter);
		return auditList;
	}
	
	/**
	 * 根据不同条件查询审核任务列表 
	* @date: 2016-10-14 
	* @author: wangth
	* @Title: queryAuditRecordDetail 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryAuditRecordDetail(
			Map<String, Object> inParam, IQueryFilter queryFilter)
			throws StrategyError {
		Map<String,Object> auditMap = (Map<String,Object>)(auditSelector.selectMarketCaseAuditRecordList(inParam, queryFilter).get(0));
		return auditMap;
	}
	
	/**
	 * 查询下载审批列表
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
	public List<Map<String, Object>> queryDownLoadAuditRecordList(
			Map<String, Object> inParam, IQueryFilter queryFilter)
			throws StrategyError {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 查询营销案的审批情况
	* @date: 2017-3-1 
	* @author: yuanliang
	* @title: queryMarketCaseAuditCaseList 
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryMarketCaseAuditCaseList(
			IQueryFilter queryFilter) throws StrategyError {
		Map<String, Object> inParam=null;
		return auditSelector.selectAuditRecordDetailListByMarketCaseId(inParam, queryFilter);
	}	
	/**
	 * 删除审批工号
	* @date: 2016-10-13 
	* @author: wangth
	* @title: removeAuditNo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeAuditNo(Map<String, Object> inParam) throws StrategyError {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 *  更新审批任务操作状态
	* @date: 2016-10-14 
	* @author: wangth
	* @Title: updateAuditRecordStatusById 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateAuditRecordStatusById(Map<String, Object> inParam)
			throws StrategyError {
		auditUpdater.updateAuditRecord(this.settleUpdateAuditParam(inParam));
		
	}
	
	/**
	 * 是否有审批人
	* @date: 2016-10-20 
	* @author: yuanliang
	* @title: haveAuditor 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean haveAuditor(Map<String,Object> inParam){
		boolean haveAuditor=false;
		List<String> auditNoList = (List<String>) inParam.get("auditNoList");		
		if(CommonUtils.objectIsNull(auditNoList) == false ){
			haveAuditor=true;
		}
		return haveAuditor;
	}
	
	/**
	 * 由于并发的情况，需要查询某个营销案的相同审批顺序的所有记录是否都审批通过。
	* @date: 2016-10-20 
	* @author: yuanliang
	* @title: isAllAuditPassByAuditOrder 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean isAllAuditPassByAuditOrder(Map<String,Object> inParam) throws StrategyError{
		IQueryFilter auditFilter = new QueryFilter();
		Map<String, Object> tmpMap=new HashMap<String, Object>();
		tmpMap.put("marketCaseId", inParam.get("marketCaseId"));
		tmpMap.put("auditOrder", inParam.get("auditOrder"));				
		List<Map<String, Object>> auditList = this.queryAuditRecordList(tmpMap, auditFilter);
		boolean isAllAuditPass=true;
		for(Map<String, Object> auditMap:auditList){
			String auditStatus=(String) auditMap.get("auditStatus");
			if(!Const.MARKET_CASE_AUDIT_VIEW_PASS.equals(auditStatus)){
				isAllAuditPass=false;
			}
		}

		return isAllAuditPass;
	}
	
	/**
	 * 添加审批人的审批记录
	* @date: 2016-10-14 
	* @author: wangth
	* @Title: addAuditRecordToAuditNo 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void settleAddAuditRecordOfAuditNo(Map<String,Object> inParam) throws StrategyError{
		//
		List<String> auditRoleList = (List<String>) inParam.get("auditRoleList");	
		if(CommonUtils.objectIsNull(auditRoleList) == false ){
			for(String auditRole:auditRoleList){
				Map<String,Object> auditMap = this.settleAddAuditParam(inParam);
				auditMap.put("auditRole", auditRole);
				auditInsertor.insertAuditRecord(inParam,auditMap);
			}
			return;//update by yl at 2016-11-29. 目前改造为角色审批，因此优先级高，处理完就返回了。
		}
		
		List<String> auditNoList = (List<String>) inParam.get("auditNoList");	
		if(CommonUtils.objectIsNull(auditNoList) == false ){
			for(String auditNO:auditNoList){
				Map<String,Object> auditMap = this.settleAddAuditParam(inParam);
				auditMap.put("auditNo", auditNO);
				auditInsertor.insertAuditRecord(inParam,auditMap);
			}
		}	
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
		auditMap.put("auditDesc", (String)tempInParam.get("auditDesc"));
		auditMap.put("busiId", (String)tempInParam.get("marketCaseId"));
		auditMap.put("busiType", Const.COMPONENT_TYPE_MARKETCASE);
		auditMap.put("auditStatus",Const.MARKET_CASE_AUDIT_VIEW_PEND);
		auditMap.put("cityCode",(String)tempInParam.get("cityCode"));
		auditMap.put("regionCode",(String)tempInParam.get("regionCode"));
		auditMap.put("groupId",(String)tempInParam.get("groupId"));
		if(CommonUtils.objectIsNull((String)tempInParam.get("auditOrder")) == false){
			if(Const.MARKET_CASE_AUDIT_ORDER_FIRST.equals((String)tempInParam.get("auditOrder"))){
				auditMap.put("auditOrder",Const.MARKET_CASE_AUDIT_ORDER_SECOND);
			}	
		}else{
			auditMap.put("auditOrder",Const.MARKET_CASE_AUDIT_ORDER_FIRST);
		}
		return auditMap;
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
	protected void settleQueryAuditRecordListParams(Map<String, Object> inParam, IQueryFilter queryFilter){
		queryFilter.setAuditOrder((String)inParam.get("auditOrder"));
		queryFilter.setAuditRecordId((String)inParam.get("auditRecordId"));
		queryFilter.setBusiId((String)inParam.get("marketCaseId"));
		queryFilter.setAuditNo((String)inParam.get("auditNo"));
		queryFilter.setAuditStatus((String)inParam.get("auditStatus"));
		//add by yl at 2016-10-22.查询我的审批数据
		queryFilter.setAuditNo((String)inParam.get("auditNo"));
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
		updateMap.put("busiId",(String)inParam.get("marketCaseId"));
		updateMap.put("auditRecordId",(String)inParam.get("auditRecordId"));
		updateMap.put("auditDesc", (String)inParam.get("auditDesc"));
		updateMap.put("auditTime", new Date());
		//审批顺序 by yl at 2016-10-20.
		updateMap.put("auditOrder",(String)inParam.get("auditOrder"));
		if(Const.TRUE_INT.equals((String)inParam.get("isPassAudit"))){
			updateMap.put("auditStatus", Const.MARKET_CASE_AUDIT_VIEW_PASS);
		}else{
			updateMap.put("auditStatus", Const.MARKET_CASE_AUDIT_VIEW_BACK);
		}
		//update by yl at 2016-11-29.使用角色审批，因此前台不需要传递审批人了。传递登录工号。
		updateMap.put("loginNo", (String)inParam.get("loginNo"));
		return updateMap;
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
	protected Map<String,Object> settleUpdateMarketCaseStatusParam_old(Map<String,Object> inParam){
		Map<String,Object> tempInParam = inParam;
		if(Const.TRUE_INT.equals((String)inParam.get("isPassAudit"))){
			//改营销案状态改成执行中
			tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_EXE);
		}else{
			//修改营销案状态，改成打回
			tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_BACK);
		}
		return tempInParam;
	}
	
	/**
	 * 不根据审批顺序判断,直接更新营销案状态参数
	* @date: 2016-10-20 
	* @author: yuanliang
	* @title: setUpdateMarketCaseStatusParam 
	* @param inParam
	* @param auditOrder
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> setUpdateMarketCaseStatusParam(Map<String,Object> inParam, String auditStatus){
		Map<String,Object> tempInParam = inParam;
		//不修改营销案创建的数据，只是修改操作人、时间、状态。
		tempInParam.remove("operNo");
		tempInParam.remove("operName");
		tempInParam.remove("regionCode");
		
		tempInParam.put("statusCode", auditStatus);	
		return tempInParam;
	}
	

	

}
