package com.sitech.strategy.manage.entity.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.SortParamer;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IActDemand;
import com.sitech.strategy.core.pojo.impl.ResultList;
import com.sitech.strategy.manage.entity.inter.IActDemandManageEntity;

/**
 * 活动需求对象
* @date: 2016-10-20 
* @author: wangth
* @Title: ActDemandManageEntity 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class ActDemandManageEntity implements IActDemandManageEntity {
	/**
	 * 活动需求对象
	 */
	protected IActDemand actDemand;
	/**
     * 查询结果对象
     */
	protected ResultList resultList;
	
	/**
	 * 
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: setActDemand 
	* @param actDemand 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setActDemand(IActDemand actDemand) {
		this.actDemand = actDemand;
	}
	
	/**
	 * 
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: setResultList 
	* @param resultList 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setResultList(ResultList resultList) {
		this.resultList = resultList;
	}

	/**
	 * 查询活动需求列表
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: queryActDemandList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryActDemandList(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = this.settleActDemandListFilter(inParam);
		IPagingDevice pagingDevice = new PagingDevice();
		ISortParamer sortParamer = this.settleActDemandListSort(inParam);
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice.getInstance(inParam));
		Map<String,Object> outParam = this.getActDemandListByPagingDevice(pagingDeviceTmp);
		return outParam;
	}
	
	/**
	 * 查询活动需求详细信息
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: queryActDemandDetail 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryActDemandDetail(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setActDemandId((String)inParam.get("serialId"));
		queryFilter.setBusiId((String)inParam.get("serialId"));
		queryFilter.setActDemandId((String)inParam.get("serialId"));
		Map<String,Object> actDemandMap = actDemand.queryActDemandDetail(inParam, queryFilter);
		return actDemandMap;
	}
	
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
	@Override
	public void removeActDemand(Map<String, Object> inParam)
			throws StrategyError {
		actDemand.removeActDemand(inParam);
	}
	
	/**
	 * 保存活动需求
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: saveActDemand 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveActDemand(Map<String, Object> inParam) throws StrategyError {
		actDemand.addActDemand(inParam);
	}
	
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
	@Override
	public void updateActDemand(Map<String, Object> inParam)
			throws StrategyError {
		actDemand.updateActDemand(inParam);
	}
	
	/**
	 * 将对象PagingDevice中数据放到Map中
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: getShortMessageAccessCodeListByPagingDevice 
	* @param pagingDeviceTmp
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getActDemandListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("actDemandList", pagingDeviceTmp.getPerPageInfo());
		outMap.put("queryId", pagingDeviceTmp.getQueryId());
		return outMap;
	}

	/**
	 * 查询活动需求列表入参转换成ISortParamer
	* @date: 2016-10-28 
	* @author: tangaq
	* @title: settleActDemandListSort 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settleActDemandListSort(Map<String, Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		Map<String,String> sortMap = new HashMap<String, String>();
		sortMap.put("sortFlag", (String)inParam.get("sortFlag"));
		sortMap.put("sortField", (String)inParam.get("sortField"));
		sortParamer.setSortMap(sortMap);
		return sortParamer;
	}

	/**
	 * 查询活动需求列表入参转换成IQueryFilter
	* @date: 2016-10-28 
	* @author: tangaq
	* @title: settleActDemandListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleActDemandListFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setActDemandType((String)inParam.get("actType"));
		queryFilter.setActDemandName((String)inParam.get("actName"));
		queryFilter.setActDemandClass((String)inParam.get("actClass"));
		queryFilter.setKeyWords((List)inParam.get("keyWords"));
		queryFilter.setOperTimeStart((Timestamp)inParam.get("actDemandStartDate"));
		queryFilter.setOperTimeEnd((Timestamp)inParam.get("actDemandEndDate"));
		return queryFilter;
	}

}
