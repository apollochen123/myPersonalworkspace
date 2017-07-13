package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 审批对象
* @date: 2016-9-5 
* @author: yangwl
* @title: IAudit 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IAudit {
	
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
	public void addAuditRecord(Map<String, Object> inParam) throws StrategyError;
	
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
	public void addAuditNo(Map<String,Object>inParam,Map<String,Object> tempInParam) throws StrategyError;
	
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
	public void addDownLoadAuditRecord(Map<String,Object>inParam) throws StrategyError;
	
	/**
	 * 删除审核工号
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
	public void removeAuditNo(Map<String,Object> inParam) throws StrategyError;
	
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
	public List<Map<String, Object>> queryAuditNoList(Map<String,Object>inParam,IQueryFilter queryFilter) throws StrategyError;
	
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
	public List<Map<String, Object>> queryAuditRecordHis(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 根据不同条件查询审核任务列表 
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryAuditRecordList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> queryAuditRecordList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
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
	public List<Map<String,Object>> queryDownLoadAuditRecordList(Map<String, Object> inParam, IQueryFilter queryFilter)throws StrategyError;
	
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
	public Map<String,Object> queryAuditRecordDetail(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
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
	public List<Map<String,Object>> queryMarketCaseAuditCaseList(IQueryFilter queryFilter)throws StrategyError;
	
	
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
	public void updateAuditRecordStatusById(Map<String, Object> inParam) throws StrategyError;
}
