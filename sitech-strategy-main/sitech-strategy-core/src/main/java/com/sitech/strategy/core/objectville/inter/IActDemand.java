package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 活动需求对象
* @date: 2016-10-20 
* @author: wangth
* @Title: IActDemand 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IActDemand {
	
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
	public void addActDemand(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询活动需求列表
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: queryActDemandList 
	* @param inParam
	* @param queryFilter
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryActDemandList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
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
	public Map<String,Object> queryActDemandDetail(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
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
	public void removeActDemand(Map<String,Object> inParam) throws StrategyError;
	
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
	public void updateActDemand(Map<String,Object> inParam) throws StrategyError;
}
