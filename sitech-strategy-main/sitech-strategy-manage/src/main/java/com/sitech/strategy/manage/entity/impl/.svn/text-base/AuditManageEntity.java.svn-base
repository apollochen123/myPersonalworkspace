package com.sitech.strategy.manage.entity.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.SortParamer;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;


import com.sitech.strategy.core.objectville.inter.IAudit;
import com.sitech.strategy.core.pojo.impl.ResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IAuditManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IMsgSender;

/**
 * 审核实体
* @date: 2016-9-5 
* @author: tangaq
* @title: AuditManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class AuditManageEntity extends BaseManageEntity implements IAuditManageEntity {
	
	/**
	 * 查询列表对象
	 */
	protected ResultList resultList;
	/**
	 * 审核对象
	 */
	protected IAudit audit;
	/**
	 * CMPP短信下发
	 */
	protected IMsgSender.IBatchPushSender batchPushSender;
	/**
	 * 用户查询对象
	 */
	protected IDataSelector.ILoginSelector loginSelector;
	
    /**
     * 
    * @date: 2016-10-14 
    * @author: tangaq
    * @title: setAudit 
    * @param audit 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public void setAudit(IAudit audit) {
		this.audit = audit;
	}

	/**
	 * 
	* @date: 2016-9-23 
	* @author: tangaq
	* @title: setResultList 
	* @param resultList 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setResultList(ResultList resultList) {
		this.resultList = resultList;
	}
	/**
	 * 
	* @date: 2016-11-14 
	* @author: yuanliang
	* @title: setBatchPushSender 
	* @param batchPushSender 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBatchPushSender(IMsgSender.IBatchPushSender batchPushSender) {
		this.batchPushSender = batchPushSender;
	}
	/**
	 * 
	* @date: 2016-11-14 
	* @author: yuanliang
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
	 * 下载审批列表
	* @date: 2016-9-20 
	* @author: fangyuan_crmpd
	* @title: downLoadAuditList
	* @param inParam
	* @return outParam
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryDownLoadAuditList(Map<String, Object> inParam) 
			throws StrategyError{
		IQueryFilter queryFilter = this.settleDownLoadAuditListFilter(inParam);
		ISortParamer sortParamer = this.settleDownLoadAuditListSort(inParam);
		IPagingDevice pagingDevice = this.settleDownLoadAuditListPagingDevice(inParam);
		IPagingDevice pagingDeviceTmp =resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice);
		Map<String,Object> outParam = this.getDownLoadAuditListByPagingDevice(pagingDeviceTmp);		
		return outParam;
	}

	/**
	 * 查询下载审批人列表 
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: queryLoadAuditorList 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryLoadAuditorList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = this.settleLoadAuditorListFilter(inParam);
		ISortParamer sortParamer = this.settleLoadAuditorListSort(inParam);
		IPagingDevice pagingDevice = this.settleLoadAuditorListPagingDevice(inParam);
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice);
		Map<String,Object> outParam = this.getLoadAuditListByPagingDevice(pagingDeviceTmp);
		return outParam;
	}
	
	/**
	 * 查询营销案审批列表
	* @date: 2016-9-20 
	* @author: tangaq
	* @title: queryMarketCaseAuditList 
	* @param inParam
	* @return outMap
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseAuditList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = this.settleMarketCaseAuditListFilter(inParam);
		ISortParamer sortParamer = this.settleMarketCaseAuditListSort(inParam);
		IPagingDevice pagingDevice = this.settleMarketCaseAuditListPagingDevice(inParam);
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice);
		Map<String,Object> outMap = this.getMarketCaseAuditListByPagingDevice(pagingDeviceTmp);		
		return outMap;
	}

	/** 
	 * 查询营销案审批人列表
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: queryMarketCaseAuditorList 
	* @param inParam
	* @return Map
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryMarketCaseAuditorList(Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = this.settleMarketCaseAuditorListFilter(inParam);
		ISortParamer sortParamer = this.settleMarketCaseAuditorListSort(inParam);
		IPagingDevice pagingDevice = this.settleMarketCaseAuditorListPagingDevice(inParam);
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice);
		Map<String,Object> outParam = this.getMarketCaseAuditorListByPagingDevice(pagingDeviceTmp);
		
		return outParam;
	}
	/**
	 * 查询营销案的审批情况
	* @date: 2017-3-1 
	* @author: yuanliang
	* @title: queryMarketCaseAuditCaseList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseAuditCaseList(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setBusiId((String) inParam.get("busiId"));
		List<Map<String,Object>> auditList= audit.queryMarketCaseAuditCaseList(queryFilter);
		
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("auditCaseList", auditList);
		return outMap;
	}	
	
	/** 
	 * 删除下载审批人
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: removeLoadAuditor 
	* @param inParam
	* @return Map
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void removeLoadAuditor(Map<String, Object> inParam)
			throws StrategyError {
		audit.removeAuditNo(inParam);
	}

	/** 
	 * 删除营销案审批人
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: removeMarketCaseAuditor 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void removeMarketCaseAuditor(Map<String, Object> inParam)
			throws StrategyError {
		audit.removeAuditNo(inParam);
	}
	
	/**
	 * 保存下载审批
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: saveLoadAudit 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveDownLoadAudit(Map<String, Object> inParam) throws StrategyError {
		audit.addDownLoadAuditRecord(inParam);
	}
	
	/** 
	 * 保存下载审批人
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: saveLoadAuditor 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void saveLoadAuditor(Map<String, Object> inParam)
			throws StrategyError {
		audit.addAuditNo(inParam, inParam);
	}

	/** 
	 * 保存营销案审批
	* @date: 2016-9-20 
	* @author: xiongxq
	* @Title: saveMarketCaseAudit 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void saveMarketCaseAudit(Map<String, Object> inParam)
			throws StrategyError {
		audit.addAuditRecord(inParam);
	}
	
	/** 
	 * 保存营销案审批人
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: saveMarketCaseAuditor 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void saveMarketCaseAuditor(Map<String, Object> inParam)
			throws StrategyError {
		audit.addAuditNo(inParam, inParam);
	}

	/**
	 * 给待审批人员发送审批短信提醒
	* @date: 2016-11-14 
	* @author: yuanliang
	* @title: sendSmppToAuditor 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> sendShortMessageToAuditor(Map<String, Object> inParam)
			throws StrategyError {
		Map<String,String> tempInParam = new HashMap<String, String>();
		List<String> auditAuditorList=(List<String>) inParam.get("auditNoList");
		String msgContent=(String) inParam.get("shortMessage");
		
		try {
			batchPushSender.openConnect();
			//循环发送短信
			for(String auditNo:auditAuditorList){
				if (0 != batchPushSender.checkConnStatus()) {
					batchPushSender.closeConnect();
				}
				IQueryFilter queryFilter = new QueryFilter();
				queryFilter.setLoginNo(auditNo);
				Map<String, Object> loginMap=this.loginSelector.selectLoginNo(inParam, queryFilter);
				String phoneNo=(String) loginMap.get("phone");
				if(CommonUtils.objectIsNull(phoneNo)==false){
					this.sendSMPPMsg(phoneNo, msgContent);
				}
				
			}//end for

			batchPushSender.closeConnect();
		}catch (Throwable e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * 审批状态变更
	* @date: 2016-9-22 
	* @author: fangyuan_crmpd
	* @title: updateAuditStatus
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateAuditStatus(Map<String, Object> inParam)
			throws StrategyError {
	}

	/**
	 * 更新下载审批人 
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: updateLoadAuditor 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> updateLoadAuditor(Map<String, Object> inParam)
			throws StrategyError {
		return null;
	}

	/** 
	 * 更新营销案审批人
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: updateMarketCaseAuditor 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> updateMarketCaseAuditor(Map<String, Object> inParam)
			throws StrategyError {
		return null;
	}

	//============================================
	/**
	 * 下载审批列表出参(分页器对象转换成map)
	* @date: 2016-9-23 
	* @author: fangyuan_crmpd
	* @title: getDownLoadAuditListByPagingDevice 
	* @param pagingDeviceTmp
	* @return outMap
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getDownLoadAuditListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("auditDownLoadList", pagingDeviceTmp.getPerPageInfo());
		return outMap;
	}

	/**
	 * PagingDevice取出结果放入Map
	* @date: 2016-10-11 
	* @author: tangaq
	* @title: getLoadAuditListByPagingDevice 
	* @param pagingDeviceTmp
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getLoadAuditListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("loadAuditorList", pagingDeviceTmp.getPerPageInfo());
		outMap.put("queryId", pagingDeviceTmp.getQueryId());
		return outMap;
	}

	/**
	 * 从PagingDevice中得到营销案审批人列表和分页信息
	* @date: 2016-10-10 
	* @author: tangaq
	* @title: getMarketCaseAuditorListByPagingDevice 
	* @param pagingDeviceTmp
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getMarketCaseAuditorListByPagingDevice (IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("marketCaseAuditorList", pagingDeviceTmp.getPerPageInfo());
		outMap.put("queryId", pagingDeviceTmp.getQueryId());
		return outMap;
	}

	/**
	 * PagingDevice取出结果放入Map
	* @date: 2016-9-23 
	* @author: tangaq
	* @title: getMarketCaseAuditListByPagingDevice 
	* @param pagingDeviceTmp
	* @return outMap
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getMarketCaseAuditListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("auditList", pagingDeviceTmp.getPerPageInfo());
		outMap.put("queryId", pagingDeviceTmp.getQueryId());
		return outMap;
	}

	/**
	 * 下载审批列表入参转换
	* @date: 2016-9-23 
	* @author: fangyuan_crmpd
	* @title: settleDownLoadAuditListFilter
	* @param inParam
	* @return queryFilter
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleDownLoadAuditListFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		return queryFilter;
	}

	/**
	 * 下载审批列表分页器参数转换判断
	* @date: 2016-9-23 
	* @author: fangyuan_crmpd
	* @title: settleDownLoadAuditListPagingDevice 
	* @param inParam
	* @return pagingDevice
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleDownLoadAuditListPagingDevice(Map<String, Object> inParam){
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPageCode = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		
		if(CommonUtils.objectIsNull(currentPageCode)==true){
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}else{
			pagingDevice.setCurrentPageCode(Integer.parseInt(currentPageCode));
		}
	
		if(CommonUtils.objectIsNull(perRecordCount)==true){
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}else{
			pagingDevice.setPerRecordCount(Integer.parseInt(perRecordCount));
	
		}
		
		if(CommonUtils.objectIsNull(totalRecordCount)==true){
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}else{
			pagingDevice.setTotalRecordCount(Integer.parseInt(totalRecordCount));
		}
		return pagingDevice;
	}

	/**
	 * 下载审批列表排序器参数
	* @date: 2016-9-23 
	* @author: fangyuan_crmpd
	* @title: settleDownLoadAuditListSort 
	* @param inParam
	* @return sortParamer
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settleDownLoadAuditListSort(Map<String, Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		Map<String,String> sortMap = new HashMap<String, String>();
		sortMap.put("sortFlag", (String)inParam.get("sortFlag"));
		sortMap.put("sortField", (String)inParam.get("sortField"));
		sortParamer.setSortMap(sortMap);
		return sortParamer;
	}

	/**
	 * 生成IQueryFilter对象
	* @date: 2016-9-23 
	* @author: tangaq
	* @title: settleMarketCaseAuditListFilter 
	* @param inParam
	* @return queryFilter
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleMarketCaseAuditListFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setKeyWords((List<String>)inParam.get("keyWords"));
		queryFilter.setAuditNo((String) inParam.get("auditNo"));
		//update by yl at 2016-11-29.使用角色审批，因此前台不需要传递审批人了。使用登录工号角色进行查询。
		queryFilter.setLoginNo((String) inParam.get("loginNo"));		
		queryFilter.setAuditStatus((String) inParam.get("auditStatus"));
		return queryFilter;
	}

	/**
	 * 分页信息
	* @date: 2016-9-23 
	* @author: tangaq
	* @title: settleMarketCaseAuditListPagingDevice 
	* @param inParam
	* @return pagingDevice
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleMarketCaseAuditListPagingDevice(Map<String, Object> inParam){
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPageCode = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		pagingDevice.setQueryId((String)inParam.get("queryId"));
		
		if(CommonUtils.objectIsNull(currentPageCode)==true){
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}else{
			pagingDevice.setCurrentPageCode(Integer.parseInt(currentPageCode));
		}
	
		if(CommonUtils.objectIsNull(perRecordCount)==true){
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}else{
			pagingDevice.setPerRecordCount(Integer.parseInt(perRecordCount));
	
		}
		
		if(CommonUtils.objectIsNull(totalRecordCount)==true){
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}else{
			pagingDevice.setTotalRecordCount(Integer.parseInt(totalRecordCount));
	
		}
		return pagingDevice;
	}

	/**
	 * 生成ISortParamer对象
	* @date: 2016-9-23 
	* @author: tangaq
	* @title: settleMarketCaseAuditListSort 
	* @param inParam
	* @return sortParamer
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settleMarketCaseAuditListSort(Map<String, Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		Map<String,String> sortMap = new HashMap<String, String>();
		sortMap.put("sortFlag", (String)inParam.get("sortFlag"));
		sortMap.put("sortField", (String)inParam.get("sortField"));
		sortParamer.setSortMap(sortMap);
		return sortParamer;
	}

	/**
	 * 查询下载审批人列表 入参转化为IPagingDevice
	* @date: 2016-10-11 
	* @author: tangaq
	* @title: settleLoadAuditorListPagingDevice 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleLoadAuditorListPagingDevice(Map<String,Object> inParam){
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPageCode = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		pagingDevice.setQueryId((String)inParam.get("queryId"));

		if(CommonUtils.objectIsNull(currentPageCode)==true){
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}else{
			pagingDevice.setCurrentPageCode(Integer.parseInt(currentPageCode));
		}
	
		if(CommonUtils.objectIsNull(perRecordCount)==true){
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}else{
			pagingDevice.setPerRecordCount(Integer.parseInt(perRecordCount));
	
		}
		
		if(CommonUtils.objectIsNull(totalRecordCount)==true){
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}else{
			pagingDevice.setTotalRecordCount(Integer.parseInt(totalRecordCount));
	
		}
		return pagingDevice;
	}

	/**
	 * 查询营销案审批人列表入参转换为IQueryFilter
	* @date: 2016-10-10 
	* @author: tangaq
	* @title: settleMarketCaseAuditorListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleMarketCaseAuditorListFilter (Map<String,Object> inParam) {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setAuditType((String)inParam.get("auditType"));
		//湖北审批人查询使用regionCode
		queryFilter.setRegionCode((String)inParam.get("regionCode"));
		queryFilter.setChannelId((String)inParam.get("channelId"));
		queryFilter.setAuditOrder((String)inParam.get("auditOrder"));
		return queryFilter;
	}

	/**
	 * 查询营销案审批人列表入参转换为ISortParamer
	* @date: 2016-10-10 
	* @author: tangaq
	* @title: settleMarketCaseAuditorListSort 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settleMarketCaseAuditorListSort (Map<String,Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		Map<String,String> sortMap = new HashMap<String, String>();
		
		sortMap.put("sortFlag", (String)inParam.get("sortFlag"));
		sortMap.put("sortField", (String)inParam.get("sortField"));
		sortParamer.setSortMap(sortMap);
		
		return sortParamer;
	}

	/**
	 * 查询营销案审批人列表入参转换为IPagingDevice
	* @date: 2016-10-10 
	* @author: tangaq
	* @title: settleMarketCaseAuditorListPagingDevice 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleMarketCaseAuditorListPagingDevice (Map<String,Object> inParam){
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPageCode = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		pagingDevice.setQueryId((String)inParam.get("queryId"));
		
		if(CommonUtils.objectIsNull(currentPageCode) == false){
			pagingDevice.setCurrentPageCode(Integer.parseInt(currentPageCode));
		}else{
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}
		if(CommonUtils.objectIsNull(perRecordCount) == false){
			pagingDevice.setPerRecordCount(Integer.parseInt(perRecordCount));
		}else{
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}
		if(CommonUtils.objectIsNull(totalRecordCount) == false){
			pagingDevice.setTotalRecordCount(Integer.parseInt(totalRecordCount));
		}else{
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}
		
		return pagingDevice;
	}

	/**
	 * 查询下载审批人列表 入参转化为IQueryFilter
	* @date: 2016-10-11 
	* @author: tangaq
	* @title: settleLoadAuditorListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleLoadAuditorListFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setAuditType((String)inParam.get("auditType"));
		return queryFilter;
	}

	/**
	 * 查询下载审批人列表 入参转化为ISortParamer
	* @date: 2016-10-11 
	* @author: tangaq
	* @title: settleLoadAuditorListSort 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settleLoadAuditorListSort(Map<String, Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		Map<String,String> sortMap = new HashMap<String, String>();
		sortMap.put("sortFlag", (String)inParam.get("sortFlag"));
		sortMap.put("sortField", (String)inParam.get("sortField"));
		sortParamer.setSortMap(sortMap);
		return sortParamer;
	}
	
	/**
	 * 发送SMPP短信
	* @date: 2016-11-14 
	* @author: yuanliang
	* @title: sendSMPPMsg 
	* @param phoneNo
	* @param msgContent 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void sendSMPPMsg(String phoneNo, String msgContent){
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("message", msgContent);
		tempInParam.put("phoneNo", phoneNo);
		try {
			batchPushSender.sendBatchPushMsg(tempInParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
}
