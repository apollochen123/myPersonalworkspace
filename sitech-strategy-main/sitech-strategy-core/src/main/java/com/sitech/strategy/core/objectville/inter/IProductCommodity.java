package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 产商品实体
* @date: 2016-10-6 
* @author: zhangjj_crmpd
* @title: IProductCommodity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IProductCommodity {
	
	/**
	 * 从content中获取产商品ID
	* @date: 2016-12-22 
	* @author: sunliang 
	* @title: getProductCommodityIdFromContent 
	* @param contentMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getProductCommodityIdFromContent(Map<String,Object> contentMap);
	
	/**
	 * 查询产品列表
	* @date: 2016-10-6 
	* @author: zhangjj_crmpd
	* @title: queryProductCommodityList 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryProductCommodityList(Map<String,Object> inParam,IQueryFilter queryFilter, ISortParamer sortParamer) throws StrategyError;
	
	/**
	 * 查询产商品
	* @date: 2016-10-18 
	* @author: zhangjj_crmpd
	* @title: queryProductCommodity 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryProductCommodity(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
}
