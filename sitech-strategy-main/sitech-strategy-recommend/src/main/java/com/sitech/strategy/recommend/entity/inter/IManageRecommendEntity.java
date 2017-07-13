package com.sitech.strategy.recommend.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 管理实体
* @date: 2016-10-15 
* @author: yangwl
* @title: IManageRecommendEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IManageRecommendEntity {
	
	/**
	 * 查询客户群列表
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: queryCustList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询营销案列表
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: queryMarketCaseList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询任务列表
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: queryCustList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryTaskList(Map<String,Object> inParam) throws StrategyError;
}
