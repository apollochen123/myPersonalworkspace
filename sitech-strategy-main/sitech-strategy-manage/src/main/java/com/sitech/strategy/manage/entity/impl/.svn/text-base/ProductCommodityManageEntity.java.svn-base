package com.sitech.strategy.manage.entity.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.SortParamer;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IProductCommodity;
import com.sitech.strategy.core.pojo.impl.ResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IProductCommodityManageEntity;

/**
 * 产商品
* @date: 2016-10-6 
* @author: zhangjj_crmpd
* @title: ProductCommodityManageEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProductCommodityManageEntity extends BaseManageEntity implements IProductCommodityManageEntity {
	
	/**
	 * 产商品对象
	 */
	protected IProductCommodity productCommodity;
	/**
	 * 查询结果列表对象
	 */
	protected ResultList resultList;
	/**
	 * 
	 */
	protected IPagingDevice pagingDevice;

	/**
	 * 
	* @date: 2016-10-6 
	* @author: zhangjj_crmpd
	* @title: setProductCommodity 
	* @param productCommodity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setProductCommodity(IProductCommodity productCommodity) {
		this.productCommodity = productCommodity;
	}

	/**
	 * 
	* @date: 2016-10-6 
	* @author: zhangjj_crmpd
	* @title: setResultList 
	* @param resultList 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setResultList(ResultList resultList) {
		this.resultList = resultList;
	}

	/**
	 * 
	* @date: 2016-10-6 
	* @author: zhangjj_crmpd
	* @title: setPagingDevice 
	* @param pagingDevice 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPagingDevice(IPagingDevice pagingDevice) {
		this.pagingDevice = pagingDevice;
	}

	/**
	 * 
	* @date: 2016-9-27 
	* @author: zhangjj_crmpd
	* @title: queryProductCommodityList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryProductCommodityList(Map<String,Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = this.queryProductCommodityListFilter(inParam);
		
		return productCommodity.queryProductCommodityList(inParam, queryFilter, null);
		
		
	}

	/**
	 * 
	* @date: 2016-10-6 
	* @author: zhangjj_crmpd
	* @title: queryProductCommodityListPage 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice queryProductCommodityListPage(Map<String, Object> inParam) {
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPageCode = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		
		if(currentPageCode == null || "".equals(currentPageCode)){
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}else{
			pagingDevice.setCurrentPageCode(Integer.parseInt(currentPageCode));
		}
	
		if(perRecordCount == null || "".equals(perRecordCount)){
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}else{
			pagingDevice.setPerRecordCount(Integer.parseInt(perRecordCount));

		}
		
		if(totalRecordCount == null || "".equals(totalRecordCount)){
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}else{
			pagingDevice.setTotalRecordCount(Integer.parseInt(totalRecordCount));

		}
		
		return pagingDevice;
	}

	/**
	 * 将查询营销案列表方法返回值放到Map中
	* @date: 2016-10-6 
	* @author: zhangjj_crmpd
	* @title: queryProductCommodityListParam 
	* @param pagingDeviceTmp
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> queryProductCommodityListParam(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("productCommodityList", pagingDeviceTmp.getPerPageInfo());
		return outMap;
	}
	
	/**
	 * 
	* @date: 2016-10-6 
	* @author: zhangjj_crmpd
	* @title: queryProductCommodityListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter queryProductCommodityListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();

		queryFilter.setProductCommodityId((String)inParam.get("productCommodityId"));
		queryFilter.setProductCommodityName((String)inParam.get("productCommodityName"));
		queryFilter.setChannelType((String)inParam.get("channelType"));
		queryFilter.setCategroy((String)inParam.get("cataCode"));
		queryFilter.setKeyWords((List<String>)inParam.get("keyWords"));

		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2016-10-6 
	* @author: zhangjj_crmpd
	* @title: queryProductCommodityListSort 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer queryProductCommodityListSort(Map<String,Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		Map<String,String> sortMap = new HashMap<String, String>();
		
		sortMap.put("sortFalg", (String)inParam.get("sortFalg"));
		sortMap.put("sortField", (String)inParam.get("sortField"));
		sortParamer.setSortMap(sortMap);
		
		return sortParamer;
	}
	
}
