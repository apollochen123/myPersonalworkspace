package com.sitech.strategy.manage.entity.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 审核实体
* @date: 2016-9-5 
* @author: tangaq
* @title: IAuditManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IAuditManageEntity {
	
	/**
	 * 下载审批列表
	* @date: 2016-9-20 
	* @author: fangyuan_crmpd
	* @title: downLoadAuditList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryDownLoadAuditList(Map<String,Object> inParam) 
			throws StrategyError;
	
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
	public Map<String, Object> queryLoadAuditorList(Map<String,Object> inParam) 
			throws StrategyError;

	/**
	 * 查询审批列表
	* @date: 2016-9-20 
	* @author: tangaq
	* @title: queryMarketCaseAuditList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseAuditList(Map<String,Object> inParam) 
			throws StrategyError;

	/**
	 * 查询营销案审批人列表
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: queryMarketCaseAuditorList 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryMarketCaseAuditorList(Map<String,Object> inParam) 
			throws StrategyError;
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
	public Map<String, Object> queryMarketCaseAuditCaseList(Map<String,Object> inParam) 
			throws StrategyError;
	
	/**
	 * 删除下载审批人
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: removeLoadAuditor 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeLoadAuditor(Map<String,Object> inParam) 
			throws StrategyError;

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
	public void removeMarketCaseAuditor(Map<String,Object> inParam) 
			throws StrategyError;
	
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
	public void saveDownLoadAudit(Map<String,Object> inParam) 
			throws StrategyError;
	
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
	public void saveLoadAuditor(Map<String,Object> inParam) 
			throws StrategyError;

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
	public void saveMarketCaseAudit(Map<String,Object> inParam) 
			throws StrategyError;

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
	public void saveMarketCaseAuditor(Map<String,Object> inParam) 
			throws StrategyError;

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
	public Map<String, Object> sendShortMessageToAuditor(Map<String,Object> inParam) 
			throws StrategyError;
	
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
	public void updateAuditStatus(Map<String,Object> inParam) 
			throws StrategyError;
	
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
	public Map<String, Object> updateLoadAuditor(Map<String,Object> inParam) 
			throws StrategyError;

	/**
	 * 更新营销案审批人
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: updateMarketCaserAuditor 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> updateMarketCaseAuditor(Map<String,Object> inParam) 
			throws StrategyError;
	

	
		
}