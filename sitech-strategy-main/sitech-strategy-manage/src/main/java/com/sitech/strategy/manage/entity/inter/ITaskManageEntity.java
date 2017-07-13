package com.sitech.strategy.manage.entity.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 任务实体
* @date: 2016-12-14 
* @author: zhangjj_crmpd
* @title: ITaskManageEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ITaskManageEntity {
	
	/**
	 * 查询渠道任务
	* @date: 2016-12-14 
	* @author: zhangjj_crmpd
	* @title: queryChannelTask 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryChannelTask(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询营业部任务概况
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: queryDepartmentTaskSurvey 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryDepartmentTaskSurvey(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 保存调配信息
	* @date: 2016-12-19 
	* @author: zhangjj_crmpd
	* @title: saveTaskAdjust 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveTaskAdjust(Map<String,Object> inParam) throws StrategyError;

}
