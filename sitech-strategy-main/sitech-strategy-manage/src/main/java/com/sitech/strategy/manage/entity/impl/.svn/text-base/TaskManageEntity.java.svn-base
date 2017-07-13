package com.sitech.strategy.manage.entity.impl;

import java.util.Map;

import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.impl.Task;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.ITaskManageEntity;



/**
 * 任务实体
* @date: 2016-12-14 
* @author: zhangjj_crmpd
* @title: TaskManageEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class TaskManageEntity extends BaseManageEntity implements ITaskManageEntity {
	
	protected  Task task;
	
	/**
	 * 
	* @date: 2016-12-22 
	* @author: zhangjj_crmpd
	* @title: setTask 
	* @param task 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTask(Task task) {
		this.task = task;
	}

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
	@Override
	public Map<String, Object> queryChannelTask(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setChannelId(CommonUtils.toString(inParam.get("channelId")));
		queryFilter.setRegionCode(CommonUtils.toString(inParam.get("regionCode")));
		queryFilter.setServiceNo(CommonUtils.toString(inParam.get("serviceNo")));
		queryFilter.setMarketCaseId(CommonUtils.toString(inParam.get("marketCaseId")));
		queryFilter.setStatusCode(CommonUtils.toString(inParam.get("statusCode")));
		return task.queryChannelTask(inParam,queryFilter);
	}

	/**
	 * 查询营业部任务概况
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: queryDepartmentTaskSurvey 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryDepartmentTaskSurvey(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setOperNo(CommonUtils.toString(inParam.get("operNo")));
		queryFilter.setGroupCode(CommonUtils.toString(inParam.get("groupCode")));
		return task.queryDepartmentTaskSurvey(inParam,queryFilter);
	}
	
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
	@Override
	public Map<String, Object> saveTaskAdjust(Map<String, Object> inParam)
			throws StrategyError {
		return task.saveTaskAdjust(inParam);
	}

}