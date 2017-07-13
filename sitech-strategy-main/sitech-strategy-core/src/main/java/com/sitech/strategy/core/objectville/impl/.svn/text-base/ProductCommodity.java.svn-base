package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IProductCommodity;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 产商品实体
* @date: 2016-10-6 
* @author: zhangjj_crmpd
* @title: ProductCommodity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProductCommodity extends BaseClass implements IProductCommodity, Serializable{
	/**
	 * 产品查询对象
	 */
	protected  IDataSelector.IProductCommoditySelector productCommoditySelector;

	/**
	 * 
	* @date: 2016-10-6 
	* @author: zhangjj_crmpd
	* @title: setProductCommoditySelector 
	* @param productCommoditySelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setProductCommoditySelector(
			IDataSelector.IProductCommoditySelector productCommoditySelector) {
		this.productCommoditySelector = productCommoditySelector;
	}
	
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
	@Override
	public String getProductCommodityIdFromContent(
			Map<String, Object> contentMap) {
		
		String productCommodityId = "";
		for (Object values : contentMap.values()) {
			if ((values instanceof Map) && (((Map) values).containsKey("productCommodityId"))) {
				productCommodityId = (String) ((Map) values).get("productCommodityId");
			}
		}
		return productCommodityId;
	}

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
	@Override
	public Map<String,Object> queryProductCommodityList(Map<String, Object> inParam,IQueryFilter queryFilter, ISortParamer sortParamer)
			throws StrategyError {
		Map outParam = new HashMap<String,Object>();
		List<Map<String,Object>> productCommodityList = productCommoditySelector.selectProductCommodityList(inParam, queryFilter);
		String totalRecord = productCommoditySelector.selectProductCommodityCount(inParam, queryFilter);
		outParam.put("productCommodityList", productCommodityList);
		outParam.put("totalRecord", totalRecord);
		return outParam;
	}

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
	@Override
	public Map<String, Object> queryProductCommodity(
			Map<String, Object> inParam, IQueryFilter queryFilter)
			throws StrategyError {
		// TODO Auto-generated method stub
		return productCommoditySelector.selectProductCommodity(inParam, queryFilter);
	}
}
