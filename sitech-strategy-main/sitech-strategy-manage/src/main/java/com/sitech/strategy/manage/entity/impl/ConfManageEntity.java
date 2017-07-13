package com.sitech.strategy.manage.entity.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.SortParamer;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.pojo.impl.ResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IConfManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;


/**
 * 配置管理实体
 * 
 * @date: 2016-9-5
 * @author: tangaq
 * @title: ConfManageEntity
 * @version 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
public class ConfManageEntity extends BaseManageEntity implements IConfManageEntity {
	
	/**
	 * 删除优先级对象
	 */
	protected IDataDeleter.IPriorityDeleter priorityDeleter; 
	/**
	 * 插入优先级对象
	 */
	protected IDataInsertor.IPriorityInsertor priorityInsertor;
	/**
	 * 查询优先级对象
	 */
	protected IDataSelector.IPrioritySelector prioritySelector;
	 /**
	 * 删除选项配置对象
	 */
	protected IDataDeleter.IConfigDeleter configDeleter;
	/**
	 * 新增选项配置对象
	 */
	protected IDataInsertor.IConfigInsertor configInsertor;
	/**
	 * 更新选项配置
	 */
	protected IDataUpdater.IConfigUpdater configUpdater;
	/**
	 * 查询列表对象
	 */
	protected ResultList resultList;

	/** 
	 * @date: 2016-11-1 
	 * @author: xiongxq
	 * @Title: setConfigDeleter 
	 * @param configDeleter the configDeleter to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setConfigDeleter(IDataDeleter.IConfigDeleter configDeleter) {
		this.configDeleter = configDeleter;
	}

	/** 
	 * @date: 2016-11-1 
	 * @author: xiongxq
	 * @Title: setConfigInsertor 
	 * @param configInsertor the configInsertor to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setConfigInsertor(IDataInsertor.IConfigInsertor configInsertor) {
		this.configInsertor = configInsertor;
	}

	/** 
	 * @date: 2016-11-1 
	 * @author: xiongxq
	 * @Title: setConfigUpdater 
	 * @param configUpdater the configUpdater to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setConfigUpdater(IDataUpdater.IConfigUpdater configUpdater) {
		this.configUpdater = configUpdater;
	}

	/**
	 * 
	* @date: 2016-10-20 
	* @author: fangyuan_crmpd
	* @title: setPriorityDeleter 
	* @param priorityDeleter 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPriorityDeleter(IDataDeleter.IPriorityDeleter priorityDeleter) {
		this.priorityDeleter = priorityDeleter;
	}

	/**
	 * 
	* @date: 2016-10-16 
	* @author: fangyuan_crmpd
	* @title: setPriorityInsertor 
	* @param priorityInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPriorityInsertor(IDataInsertor.IPriorityInsertor priorityInsertor) {
		this.priorityInsertor = priorityInsertor;
	}

	/**
	 * 
	* @date: 2016-10-16 
	* @author: fangyuan_crmpd
	* @title: setPrioritySelector 
	* @param prioritySelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPrioritySelector(IDataSelector.IPrioritySelector prioritySelector) {
		this.prioritySelector = prioritySelector;
	}

	/**
	 * 
	* @date: 2016-10-10 
	* @author: fangyuan_crmpd
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
	@Override
	public Map<String, Object> queryAreaPriorityConfigList(Map<String, Object> inParam) throws StrategyError {
		List<Map<String,Object>> areaPriorityConfigList = prioritySelector.selectAreaPriorityList(inParam);
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("areaPriorityConfigList", areaPriorityConfigList);
		return outParam;
	}

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
	@Override
	public Map<String, Object> queryChoiceConfigList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = this.settleChoiceConfigListFilter(inParam);
		ISortParamer sortParamer = this.settleChoiceConfigListSort(inParam);
		IPagingDevice pagingDevice = this.settleChoiceConfigListPagingDevice(inParam);
		IPagingDevice pagingDeviceTmp =resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice);
		Map<String,Object> outParam = this.getChoiceConfigListByPagingDevice(pagingDeviceTmp);		
		return outParam;
	}

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
	@Override
	public Map<String, Object> queryCustGroupPriorityConfigList(Map<String, Object> inParam) throws StrategyError {	
		List<Map<String,Object>> custGroupPriorityConfigList = prioritySelector.selectCustGroupPriorityList(inParam);
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("custGroupPriorityConfigList", custGroupPriorityConfigList);
		return outParam;
	}

	/**
	 * 优先级主页面查询列表
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
	@Override
	public Map<String, Object> queryPriorityConfigList(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = this.settlePriorityConfigListFilter(inParam);
		ISortParamer sortParamer = this.settlePriorityConfigListSort(inParam);
		IPagingDevice pagingDevice = this.settlePriorityConfigListPagingDevice(inParam);
		IPagingDevice pagingDeviceTmp =resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice);
		Map<String,Object> outParam = this.getPriorityConfigListByPagingDevice(pagingDeviceTmp);		
		return outParam;
	}

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
	@Override
	public void removeAreaPriorityConfig(Map<String, Object> inParam)
			throws StrategyError {
		priorityDeleter.deleteAreaPriorityConfigInfo(inParam);
	}

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
	@Override
	public void removeChoiceConfig(Map<String, Object> inParam)
			throws StrategyError {
		configDeleter.deleteOptionInfo(inParam);
	}

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
	@Override
	public void removeCustGroupPriorityConfig(Map<String, Object> inParam)
			throws StrategyError {
		priorityDeleter.deleteCustGroupPriorityConfigInfo(inParam);
	}

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
	@Override
	public void saveAreaPriorityConfig(Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> tempInParam = this.settleAreaPriorityConfigTemp(inParam);
		priorityInsertor.insertAreaPriorityInfo(inParam, tempInParam);
	}

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
	@Override
	public void saveChoiceConfig(Map<String, Object> inParam)
			throws StrategyError {
		configInsertor.insertOptionInfo(inParam);
	}

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
	@Override
	public void saveCustGroupPriorityConfig(Map<String, Object> inParam) throws StrategyError {
		 Map<String, Object> tempInParam = this.settleCustGroupPriorityConfigTemp(inParam);
		priorityInsertor.insertCustGroupPriorityInfo(inParam, tempInParam);
	}

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
	@Override
	public void updateChoiceConfig(Map<String, Object> inParam)
			throws StrategyError {
		configUpdater.updateOption(inParam);
	}

	/**
	 * 将IPagingDevice中数据取出放到Map里
	* @date: 2016-10-22 
	* @author: xiongxq
	* @Title: getChoiceConfigListByPagingDevice 
	* @param PagingDevice
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getChoiceConfigListByPagingDevice(IPagingDevice PagingDevice){
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("currentPageCode", PagingDevice.getCurrentPageCode());
		outParam.put("perRecordCount", PagingDevice.getPerRecordCount());
		outParam.put("totalRecordCount", PagingDevice.getTotalRecordCount());
		outParam.put("choiceList", PagingDevice.getPerPageInfo());
		outParam.put("queryId", PagingDevice.getQueryId());
		return outParam;
	}

	/**
	 * 查询优先级配置列表出参转化为 Map<String,Object>
	* @date: 2016-10-10 
	* @author: fangyuan_crmpd
	* @title: getPriorityConfigListByPagingDevice 
	* @param pagingDevice
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getPriorityConfigListByPagingDevice
		(IPagingDevice pagingDevice){
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("currentPageCode", pagingDevice.getCurrentPageCode());
		outParam.put("perRecordCount", pagingDevice.getPerRecordCount());
		outParam.put("totalRecordCount", pagingDevice.getTotalRecordCount());	
		outParam.put("priorityConfigList", pagingDevice.getPerPageInfo());
		outParam.put("queryId", pagingDevice.getQueryId());
		return outParam;
	}

	/**
	 * 新增区域优先级入参转换成 Map
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: settleAreaPriorityConfigTemp 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> settleAreaPriorityConfigTemp(Map<String, Object> inParam){
		Map<String, Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", inParam.get("serialId"));
		tempInParam.put("marketCaseId", inParam.get("marketCaseId"));
		tempInParam.put("channelId", inParam.get("channelId"));
		tempInParam.put("regionCode", inParam.get("regionCode"));
		tempInParam.put("regionPriorityClass", inParam.get("regionPriorityClass"));
		return tempInParam;
	}
	
	/**
	 * 生成IQueryFilter对象
	* @date: 2016-10-22 
	* @author: xiongxq
	* @Title: settleChoiceConfigListFilter 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleChoiceConfigListFilter (Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		if(!CommonUtils.objectIsNull(inParam.get("keyWords")) ){
			queryFilter.setKeyWords((List<String>)inParam.get("keyWords"));
		}
		queryFilter.setFieldValue((String)inParam.get("fieldValue"));
		queryFilter.setFieldEnName((String)inParam.get("fieldEnName"));
		
		return queryFilter;
	}
	 
	/**
	 * 生成IPagingDevice对象
	* @date: 2016-10-22 
	* @author: xiongxq
	* @Title: settleChoiceConfigListPagingDevice 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleChoiceConfigListPagingDevice(Map<String, Object> inParam){
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPageCode = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		pagingDevice.setQueryId((String)inParam.get("queryId"));
		if(CommonUtils.objectIsNull(currentPageCode) == true){
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}else{
			pagingDevice.setCurrentPageCode(Integer.parseInt(currentPageCode));
		}
	
		if(CommonUtils.objectIsNull(perRecordCount) == true){
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}else{
			pagingDevice.setPerRecordCount(Integer.parseInt(perRecordCount));
	
		}
	
		if(CommonUtils.objectIsNull(totalRecordCount) == true){
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}else{
			pagingDevice.setTotalRecordCount(Integer.parseInt(totalRecordCount));
		}
		return pagingDevice;
	}

	/**
	* 生成ISortParamer对象
	* @date: 2016-10-22 
	* @author: xiongxq
	* @Title: settleChoiceConfigListSort 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settleChoiceConfigListSort(Map<String, Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		Map<String,String> sortMap = new HashMap<String, String>();
	
		sortMap.put("sortFlag", (String)inParam.get("sortFlag"));
		sortMap.put("sortField", (String)inParam.get("sortField"));
		sortParamer.setSortMap(sortMap);
		return sortParamer;
	}
	
	/**
	 * 保存优先级配置入参转换
	* @date: 2016-10-20 
	* @author: fangyuan_crmpd
	* @title: settleCustGroupPriorityConfigTemp 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> settleCustGroupPriorityConfigTemp(Map<String, Object> inParam){
		Map<String, Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", inParam.get("serialId"));
		tempInParam.put("marketCaseId", inParam.get("marketCaseId"));
		tempInParam.put("channelId", inParam.get("channelId"));
		tempInParam.put("custGroupId", inParam.get("custGroupId"));
		tempInParam.put("custGroupName", inParam.get("custGroupName"));
		tempInParam.put("custGroupPriorityClass", inParam.get("custGroupPriorityClass"));
		return tempInParam;
	}

	/**
	 * 查询优先级配置列表入参转换为 IQueryFilter
	* @date: 2016-10-10 
	* @author: fangyuan_crmpd
	* @title: settlePriorityConfigListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settlePriorityConfigListFilter
		(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setMarketCaseName((String)(inParam.get("keyWord")));
		String channel = (String)(inParam.get("channelId"));
		if (Const.CHANNEL_ID_EVENT.equals(channel)) {
			channel = "";
			queryFilter.setEventChannelId("eventChannelId");
		}
		queryFilter.setChannelId(channel);
		queryFilter.setMarketCaseType((String)(inParam.get("marketCaseType")));
		queryFilter.setMarketCaseBusiType((String)(inParam.get("marketCaseBusiType")));
		return queryFilter;
	}
	
	/**
	 * 查询优先级配置列表入参转换为 IPagingDevice
	* @date: 2016-10-10 
	* @author: fangyuan_crmpd
	* @title: settlePriorityConfigListPagingDevice 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settlePriorityConfigListPagingDevice
		(Map<String, Object> inParam){
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPageCode = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		pagingDevice.setQueryId((String)inParam.get("queryId"));
		
		if(CommonUtils.objectIsNull(currentPageCode) == true){
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}else{
			pagingDevice.setCurrentPageCode(Integer.parseInt(currentPageCode));
		}
	
		if(CommonUtils.objectIsNull(perRecordCount) == true){
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}else{
			pagingDevice.setPerRecordCount(Integer.parseInt(perRecordCount));
	
		}
		
		if(CommonUtils.objectIsNull(totalRecordCount) == true){
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}else{
			pagingDevice.setTotalRecordCount(Integer.parseInt(totalRecordCount));
		}
		return pagingDevice;
	}

	/**
	 * 查询优先级配置列表入参转换为  ISortParamer
	* @date: 2016-10-14 
	* @author: fangyuan_crmpd
	* @title: settlePriorityConfigListSort 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settlePriorityConfigListSort
		(Map<String, Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		return sortParamer;
	}
}

