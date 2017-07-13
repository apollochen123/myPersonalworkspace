package com.sitech.strategy.manage.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 配置管理实体
* @date: 2016-9-5 
* @author: tangaq
* @title: IConfManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IConfManageEntity {
	
	/**
	 * 查询区域优先级配置列表
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: queryAreaPriorityConfigList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryAreaPriorityConfigList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询选项配置列表
	* @date: 2016-10-22 
	* @author: xiongxq
	* @Title: queryChoiceConfigList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryChoiceConfigList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询用户群优先级配置列表
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupPriorityConfigList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupPriorityConfigList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询优先级主页面列表
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: queryPriorityConfigList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryPriorityConfigList(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 删除区域优先级配置
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: removeAreaPriorityConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeAreaPriorityConfig(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 删除选项配置
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: removeChoiceConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeChoiceConfig(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 删除用户群优先级配置
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupPriorityConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeCustGroupPriorityConfig(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 新增区域优先级配置
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: saveAreaPriorityConfig 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveAreaPriorityConfig(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 保存选项配置
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: saveChoiceConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveChoiceConfig(Map<String,Object> inParam) throws StrategyError;

	
	/**
	 * 保存优先级配置
	* @date: 2016-10-11 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupPriorityConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveCustGroupPriorityConfig(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 修改选项配置
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: updateChoiceConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateChoiceConfig(Map<String,Object> inParam) throws StrategyError;
}