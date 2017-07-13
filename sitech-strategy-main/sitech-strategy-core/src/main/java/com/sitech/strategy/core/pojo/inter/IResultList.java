package com.sitech.strategy.core.pojo.inter;

import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 查询结果列表对象接口
* @date: 2016-9-5 
* @author: sunliang 
* @title: IResultList 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IResultList {
	
	/**
	 * 获取查询结果
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: queryResultList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IPagingDevice queryResultList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 获取查询结果
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: queryResultList 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @param pagingDevice
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IPagingDevice queryResultList(Map<String,Object> inParam,IQueryFilter queryFilter,ISortParamer sortParamer,IPagingDevice pagingDevice) throws StrategyError;

}
