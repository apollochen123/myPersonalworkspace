package com.sitech.strategy.manage.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 监控实体
* @date: 2016-9-5 
* @author: tangaq
* @title: IMonitorManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IMonitorManageEntity {
	
	/**
	 * 查询作业运行监控列表
	* @date: 2016-11-9 
	* @author: fangyuan_crmpd
	* @title: queryWorkOperMonitorList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryWorkOperMonitorList(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 根据作业编码查询作业运行告警详细信息
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: queryWorkOperWarningDetailByWorkCode 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryWorkOperWarningDetailByWorkCode(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 根据作业编码删除作业运行告警详细信息
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: removeWorkOperWarningDetailByWorkCode 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeWorkOperWarningDetailByWorkCode(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 保存作业运行告警详细信息
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: saveWorkOperWarningDetail 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveWorkOperWarningDetail(Map<String, Object> inParam) throws StrategyError;

}
