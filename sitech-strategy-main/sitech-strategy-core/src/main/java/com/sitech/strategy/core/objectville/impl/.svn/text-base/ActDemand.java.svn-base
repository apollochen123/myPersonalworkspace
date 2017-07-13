package com.sitech.strategy.core.objectville.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IActDemand;
import com.sitech.strategy.core.objectville.inter.IAttach;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;
import com.sun.corba.se.spi.orbutil.fsm.Input;

/**
 * 活动需求对象
* @date: 2016-12-9 
* @author: wangth
* @Title: ActDemand 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class ActDemand extends BaseClass implements IActDemand {
	
	/**
	 * 附件对象
	 */
	protected IAttach attach;
	/**
	 *活动需求删除对象 
	 */
	protected IDataDeleter.IActDemandDeleter actDemandDeleter;
	/**
	 * 活动需求插入对象
	 */
	protected IDataInsertor.IActDemandInsertor actDemandInsertor;
	/**
	 * 活动需求查询对象
	 */
	protected IDataSelector.IActDemandSelector actDemandSelector;
	
	protected IDataUpdater.IActDemandUpdater  actDemandUpdater; 
	
	/**
	 * 
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: setAttach 
	* @param attach 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAttach(IAttach attach) {
		this.attach = attach;
	}
	
	/**
	 * 
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: setActDemandDeleter 
	* @param actDemandDeleter 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setActDemandDeleter(IDataDeleter.IActDemandDeleter actDemandDeleter) {
		this.actDemandDeleter = actDemandDeleter;
	}

	/**
	 * 
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: setActDemandInsertor 
	* @param actDemandInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setActDemandInsertor(
			IDataInsertor.IActDemandInsertor actDemandInsertor) {
		this.actDemandInsertor = actDemandInsertor;
	}
	
	/**
	 * 
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: setActDemandSeletor 
	* @param actDemandSeletor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setActDemandSelector(IDataSelector.IActDemandSelector actDemandSelector) {
		this.actDemandSelector = actDemandSelector;
	}
	
	/**
	 * 
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: setActDemandUpdater 
	* @param actDemandUpdater 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setActDemandUpdater(IDataUpdater.IActDemandUpdater actDemandUpdater) {
		this.actDemandUpdater = actDemandUpdater;
	}

	/**
	 * 添加活动需求
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: addActDemand 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addActDemand(Map<String, Object> inParam) throws StrategyError {
		Map<String,Object> tempInParam = settleAddActDemandParam (inParam);
	
		if(CommonUtils.objectIsNull(inParam.get("policyDesc"))==false){
			actDemandInsertor.insert(inParam, tempInParam);
		}
		if(CommonUtils.objectIsNull(inParam.get("refSystemName"))==false || CommonUtils.objectIsNull(inParam.get("rufSystemName"))==false || CommonUtils.objectIsNull(inParam.get("wfSystemName"))==false){
			List<Map<String,Object>> attachList = settleAddAttachParam(tempInParam);
			attach.addBatchAttach(attachList);
		}
	}
	
	/**
	 * 查询活动需求列表
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: queryActDemandList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryActDemandList(
			Map<String, Object> inParam, IQueryFilter queryFilter)
			throws StrategyError {
		return actDemandSelector.select(inParam, queryFilter);
	}
	
	/**
	 * 查询活动需求详细信息
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: queryActDemandDetail 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryActDemandDetail(
			Map<String, Object> inParam, IQueryFilter queryFilter)
			throws StrategyError {
		List<Map<String,Object>> actDemandList = this.queryActDemandList(inParam, queryFilter);
		Map<String,Object> actDemandMap = new HashMap<String,Object>() ;
		if(!CommonUtils.objectIsNull(actDemandList)){
			actDemandMap = actDemandList.get(0);
		}
		List<Map<String,Object>> attachList = (List<Map<String,Object>>)attach.queryAttachList(inParam,queryFilter) == null?new ArrayList<Map<String,Object>>():(List<Map<String,Object>>)attach.queryAttachList(inParam,queryFilter);
		actDemandMap.put("attachList", attachList);
		return actDemandMap;
	}
	
	/**
	 * 移除活动需求
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: removeActDemand 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeActDemand(Map<String, Object> inParam)
			throws StrategyError {
		actDemandDeleter.deleteActDemand(inParam);
		inParam.put("busiId", inParam.get("serialId"));
		attach.removeAttach(inParam);
	}
	
	/**
	 * 更新活动需求
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: updateActDemand 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateActDemand(Map<String, Object> inParam)
			throws StrategyError {
		if(CommonUtils.objectIsNull(inParam.get("policyDesc")) == false){
			inParam.put("serialId", inParam.get("marketCaseId"));
			actDemandUpdater.updateActDemand(inParam);
		}
		if(CommonUtils.objectIsNull(inParam.get("refSystemName"))==false || CommonUtils.objectIsNull(inParam.get("rufSystemName"))==false || CommonUtils.objectIsNull(inParam.get("wfSystemName")) ==false){
			Map<String,Object> tempInParam = settleAddActDemandParam (inParam);
			attach.removeAttach(tempInParam);
			List<Map<String,Object>> list = settleAddAttachParam(tempInParam);
			attach.addBatchAttach(list);
		}
	}
	
	/**
	 * 处理 添加活动需求参数
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: settleAddActDemandParam 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> settleAddActDemandParam(Map<String, Object> inParam){
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.putAll(inParam);
		String serialId = SequenceUtil.getSequence();
		tempInParam.put("serialId", serialId);
		if(CommonUtils.objectIsNull(inParam.get("marketCaseId")) ==false){
			tempInParam.put("serialId",(String)inParam.get("marketCaseId"));
		}
		
		tempInParam.put("operTime", new Date());
		return tempInParam;
	}
	
	/**
	 * 处理添加附件参数
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: settleAddAttachParam 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> settleAddAttachParam(Map<String, Object> inParam){
		List<Map<String,Object>> attachList = new ArrayList<Map<String,Object>>();
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("busiId", inParam.get("serialId"));
		tempInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE);
		tempInParam.put("attachName", inParam.get("policyFileName"));
		tempInParam.put("attachType", Const.ATTACH_FILE_TYPE_POLICY);
		tempInParam.put("systemName", inParam.get("pfSystemName"));
		tempInParam.put("operNo", inParam.get("operNo"));
		tempInParam.put("operName", inParam.get("operName"));
		tempInParam.put("operDate", new Date());
		attachList.add(tempInParam);
		tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("busiId", inParam.get("serialId"));
		tempInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE);
		tempInParam.put("attachName", inParam.get("targerFileName"));
		tempInParam.put("attachType", Const.ATTACH_FILE_TYPE_TARGET);
		tempInParam.put("systemName", inParam.get("tfSystemName"));
		tempInParam.put("operNo", inParam.get("operNo"));
		tempInParam.put("operName", inParam.get("operName"));
		tempInParam.put("operDate", new Date());
		attachList.add(tempInParam);
		tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("busiId", inParam.get("serialId"));
		tempInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE);
		tempInParam.put("attachName", inParam.get("workOrderCloseFileName"));
		tempInParam.put("attachType", Const.ATTACH_FILE_TYPE_CLOSERULE);
		tempInParam.put("systemName", inParam.get("wfSystemName"));
		tempInParam.put("operNo", inParam.get("operNo"));
		tempInParam.put("operName", inParam.get("operName"));
		tempInParam.put("operDate", new Date());
		attachList.add(tempInParam);
		tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("busiId", inParam.get("serialId"));
		tempInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE);
		tempInParam.put("attachName", inParam.get("assessRuleFileName"));
		tempInParam.put("attachType", Const.ATTACH_FILE_TYPE_ASSESSRLUE);
		tempInParam.put("systemName", inParam.get("rufSystemName"));
		tempInParam.put("operNo", inParam.get("operNo"));
		tempInParam.put("operName", inParam.get("operName"));
		tempInParam.put("operDate", new Date());
		attachList.add(tempInParam);
		tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("busiId", inParam.get("serialId"));
		tempInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE);
		tempInParam.put("attachName", inParam.get("assessReportFileName"));
		tempInParam.put("attachType", Const.ATTACH_FILE_TYPE_ASSESSREPORT);
		tempInParam.put("systemName", inParam.get("refSystemName"));
		tempInParam.put("operNo", inParam.get("operNo"));
		tempInParam.put("operName", inParam.get("operName"));
		tempInParam.put("operDate", new Date());
		attachList.add(tempInParam);
		return attachList;
	}
	
	/**
	 * 处理活动需求更新参数
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: settleUpdateActDemandParam 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> settleUpdateActDemandParam(Map<String,Object> inParam){
		return inParam;
	}
}
