package com.sitech.strategy.manage.entity.impl;

import java.sql.Timestamp;
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
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.pojo.impl.ResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.ISystemManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 系统管理实体
 * 
 * @date: 2016-9-5
 * @author: tangaq
 * @title: SystemManageEntity
 * @version 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
public class SystemManageEntity extends BaseManageEntity implements ISystemManageEntity {
	/**
	 * 查询列表对象
	 */
	protected ResultList resultList;
	/**
	 * 查询接口服务监控
	 */
	protected IDataSelector.IMonitorSelector monitorSelector;
	/**
	 * 作业配置删除对象
	 */
	protected IDataDeleter.IWorkConfigDeleter workConfigDeleter;
	/**
	 * 作业配置插入对象
	 */
	protected IDataInsertor.IWorkConfigInsertor workConfigInsertor;
	/**
	 * 作业配置更新对象
	 */
	protected IDataUpdater.IWorkConfigUpdater workConfigUpdater;

	/**
	 * 操作日志查询
	 */
	protected IDataSelector.IOperLogSelector operLogSelector;

	/**
	 * 操作日志插入对象
	 */
	protected IDataInsertor.IOperLogInsertor operLogInsertor;
	
	/**
	 * 
	* @date: 2017-3-13 
	* @author: wuJiaFu
	* @title: setMonitorSelector 
	* @param monitorSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMonitorSelector(IDataSelector.IMonitorSelector monitorSelector) {
		this.monitorSelector = monitorSelector;
	}

	/**
	 * 
	 * @date: 2016-11-1
	 * @author: tangaq
	 * @title: setOperLogSelector
	 * @param operLogSelector
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setOperLogSelector(IDataSelector.IOperLogSelector operLogSelector) {
		this.operLogSelector = operLogSelector;
	}

	/**
	 * @date: 2017-3-9
	 * @author: yueyi
	 * @title: setOperLogInsertor
	 * @param operLogInsertor
	 *            the operLogInsertor to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public void setOperLogInsertor(IDataInsertor.IOperLogInsertor operLogInsertor) {
		this.operLogInsertor = operLogInsertor;
	}

	/**
	 * @date: 2016-10-27
	 * @author: xiongxq
	 * @Title: setResultList
	 * @param resultList
	 *            the resultList to set
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setResultList(ResultList resultList) {
		this.resultList = resultList;
	}

	/**
	 * 
	 * @date: 2016-10-22
	 * @author: wangth
	 * @Title: setWorkConfigDeleter
	 * @param workConfigDeleter
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setWorkConfigDeleter(IDataDeleter.IWorkConfigDeleter workConfigDeleter) {
		this.workConfigDeleter = workConfigDeleter;
	}

	/**
	 * 
	 * @date: 2016-10-22
	 * @author: wangth
	 * @Title: setWorkConfigInsertor
	 * @param workConfigInsertor
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setWorkConfigInsertor(IDataInsertor.IWorkConfigInsertor workConfigInsertor) {
		this.workConfigInsertor = workConfigInsertor;
	}

	/**
	 * 
	 * @date: 2016-10-22
	 * @author: wangth
	 * @Title: setWorkConfigUpdater
	 * @param workConfigUpdater
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setWorkConfigUpdater(IDataUpdater.IWorkConfigUpdater workConfigUpdater) {
		this.workConfigUpdater = workConfigUpdater;
	}

	@Override
	public Map<String, Object> queryMessageTriggerLogList(
			Map<String, Object> inParam) throws StrategyError {
		Map<String,Object> outMap = new HashMap<String, Object>();
		IQueryFilter queryFilter =this.settleMessageTriggerLogListFilter(inParam);
		int start = Integer.valueOf(inParam.get("currentPageCode")==null?"1":(String)inParam.get("currentPageCode"));
		int	limit = Integer.valueOf(inParam.get("perRecordCount")==null?"10":(String)inParam.get("perRecordCount"));
		Map<String,Object> resMap=operLogSelector.selectMessageTriggerLogList(inParam, queryFilter, start, limit);
		if (resMap == null) {
			resMap = new HashMap<String,Object>();
		}
		String sum = resMap.get("sum") == null?"0":resMap.get("sum")+"";
		List<Map<String,Object>> outList = resMap.get("result") == null?new ArrayList<Map<String,Object>>():(List<Map<String,Object>>)resMap.get("result");
		outMap.put("currentPageCode", start+"");
		outMap.put("perRecordCount", limit+"");
		outMap.put("totalRecordCount", sum);
		outMap.put("result", outList);
		return outMap;
	}

	/**
	 * 查询操作日志列表
	 * 
	 * @date: 2016-11-2
	 * @author: tangaq
	 * @title: queryOperLogList
	 * @param inParam
	 * @return
	 * @throws StrategyError
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryOperLogList(Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = this.settleOperLogListFilter(inParam);
		int start = Integer.valueOf(inParam.get("currentPageCode") == null ? "1" : (String) inParam.get("currentPageCode"));
		int limit = Integer.valueOf(inParam.get("perRecordCount") == null ? "10" : (String) inParam.get("perRecordCount"));
		Map<String, Object> resMap = operLogSelector.selectOperLogList(inParam, queryFilter, start, limit);
		if (resMap == null) {
			resMap = new HashMap<String, Object>();
		}
		Map<String, Object> outMap = new HashMap<String, Object>();
		String sum = resMap.get("sum") == null ? "0" : resMap.get("sum") + "";
		List<Map<String, Object>> outList = resMap.get("result") == null ? new ArrayList<Map<String, Object>>() : (List<Map<String, Object>>) resMap
				.get("result");
		outMap.put("sum", sum);
		outMap.put("currentPageCode", start + "");
		outMap.put("perRecordCount", limit + "");
		outMap.put("result", outList);
		Map<String, Object> outParam = this.getOperLogListByPagingDevice(outMap);
		return outParam;
	}

	/**
	 * 查询服务监控列表
	 * 
	 * @date: 2016-11-2
	 * @author: tangaq
	 * @title: queryServiceMonitorList
	 * @param inParam
	 * @return
	 * @throws StrategyError
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryServiceMonitorList(Map<String,Object> inParam) throws StrategyError{
		Map<String,Object> serviceMonitorMap = new HashMap<String,Object>();
		int start = Integer.valueOf(inParam.get("currentPageCode") == null ? "1" : (String) inParam.get("currentPageCode"));
		int limit = Integer.valueOf(inParam.get("perRecordCount") == null ? "10" : (String) inParam.get("perRecordCount"));
	    IQueryFilter queryFilter = this.settleServiceMonitorListFilter(inParam);
	    Map<String, Object> resMap = monitorSelector.selectServiceMonitorInfo(inParam, queryFilter,start,limit);
	    String sum = resMap.get("sum") == null ? "0" : resMap.get("sum") + "";
		List<Map<String, Object>> outList = resMap.get("result") == null ? new ArrayList<Map<String, Object>>() : (List<Map<String, Object>>) resMap
				.get("result");
	    Map<String,Object> outMap = new HashMap<String,Object>();
	    outMap.put("currentPageCode", start + "");
	    outMap.put("perRecordCount", limit + "");
	    outMap.put("sum", sum);
	    outMap.put("result", outList);
		return outMap;
	}

	/**
	 * 查询作业配置列表
	 * 
	 * @date: 2016-10-22
	 * @author: wangth
	 * @Title: queryWorkConfigList
	 * @param inParam
	 * @return
	 * @throws StrategyError
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryWorkConfigList(Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		IPagingDevice pagingDevice = new PagingDevice();
		ISortParamer sortParamer = new SortParamer();
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter, sortParamer, pagingDevice.getInstance(inParam));
		Map<String, Object> outParam = this.getWorkConfigListByPagingDevice(pagingDeviceTmp);
		return outParam;
	}

	/**
	 * 移除作业配置列表
	 * 
	 * @date: 2016-10-22
	 * @author: wangth
	 * @Title: removeWorkConfig
	 * @param inParam
	 * @return
	 * @throws StrategyError
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeWorkConfig(Map<String, Object> inParam) throws StrategyError {
		workConfigDeleter.delete(inParam);
	}

	/**
	 * 保存操作日志信息
	 * 
	 * @date: 2017-3-9
	 * @author: yueyi
	 * @title: saveOperLogInfo
	 * @param inParam
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveOperLogInfo(Map<String, Object> inParam) throws StrategyError {
		log.info("第三步ok", "到了");
		operLogInsertor.insertOperLogInfo(inParam);
	}

	/**
	 * 保存作业配置列表
	 * 
	 * @date: 2016-10-22
	 * @author: wangth
	 * @Title: saveWorkConfig
	 * @param inParam
	 * @return
	 * @throws StrategyError
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveWorkConfig(Map<String, Object> inParam) throws StrategyError {
		workConfigInsertor.insert(inParam);
	}

	/**
	 * 更新作业配置列表
	 * 
	 * @date: 2016-10-22
	 * @author: wangth
	 * @Title: updateWorkConfig
	 * @param inParam
	 * @return
	 * @throws StrategyError
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateWorkConfig(Map<String, Object> inParam) throws StrategyError {
		workConfigUpdater.update(inParam);
	}

	/**
	 * 通过分页器获得工号列表
	 * 
	 * @date: 2016-10-27
	 * @author: xiongxq
	 * @Title: getEmployeeNumberListByPagingDevice
	 * @param pagingDevice
	 * @return
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> getEmployeeNumberListByPagingDevice(Map<String, Object> out) {
		Map<String, Object> outParam = new HashMap<String, Object>();
		outParam.put("currentPageCode", out.get("currentPageCode"));
		outParam.put("perRecordCount", out.get("perRecordCount"));
		outParam.put("totalRecordCount", out.get("sum"));
		outParam.put("loginList", out.get("result"));
		outParam.put("queryId", "");
		return outParam;
	}

	/**
	 * 通过分页器获得操作日志列表
	 * 
	 * @date: 2016-11-1
	 * @author: tangaq
	 * @title: getOperLogListByPagingDevice
	 * @param out
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> getOperLogListByPagingDevice(Map<String, Object> out) {
		Map<String, Object> outParam = new HashMap<String, Object>();
		outParam.put("currentPageCode", out.get("currentPageCode"));
		outParam.put("perRecordCount", out.get("perRecordCount"));
		outParam.put("totalRecordCount", out.get("sum"));
		outParam.put("operLogList", out.get("result"));
		outParam.put("queryId", "");
		return outParam;
	}

	/**
	 * 将对象PagingDevice中数据放到Map中
	 * 
	 * @date: 2016-10-17
	 * @author: wangth
	 * @Title: getWorkConfigListByPagingDevice
	 * @param pagingDeviceTmp
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> getWorkConfigListByPagingDevice(IPagingDevice pagingDeviceTmp) {
		Map<String, Object> outMap = new HashMap<String, Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("workConfigList", pagingDeviceTmp.getPerPageInfo());
		outMap.put("queryId", pagingDeviceTmp.getQueryId());
		return outMap;
	}

	/**
	 * 
	* @date: 2017-3-7 
	* @author: wuJiaFu
	* @title: settleOperLogListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleMessageTriggerLogListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		if(CommonUtils.objectIsNull(inParam.get("marketCaseId"))==false){
			queryFilter.setMarketCaseId((String)inParam.get("marketCaseId"));
		}
		return queryFilter;
	}
	
	protected IQueryFilter settleServiceMonitorListFilter(Map<String, Object> inParam) {
		IQueryFilter queryFilter = new QueryFilter();
		if(CommonUtils.objectIsNull(inParam.get("endDate"))==false){
			queryFilter.setOperTimeEnd((Timestamp) inParam.get("endDate"));
		}
		if(CommonUtils.objectIsNull(inParam.get("startDate"))==false){
			queryFilter.setOperTimeStart((Timestamp) inParam.get("startDate"));
		}
		if(CommonUtils.objectIsNull(inParam.get("regionCode"))==false){
			queryFilter.setRegionCode((String) inParam.get("regionCode"));
		}
		if(CommonUtils.objectIsNull(inParam.get("channelId"))==false){
			queryFilter.setChannelId((String) inParam.get("channelId"));
		}
		if(CommonUtils.objectIsNull(inParam.get("keyWords"))==false){
			queryFilter.setKeyWords((List<String>)inParam.get("keyWords"));
		}
		return queryFilter;
	}
	/**
	 * 查询操作日志列表入参转换成IQueryFilter
	 * 
	 * @date: 2016-11-1
	 * @author: tangaq
	 * @title: settleOperLogListFilter
	 * @param inParam
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleOperLogListFilter(Map<String, Object> inParam) {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setOperTimeEnd((Timestamp) inParam.get("operTimeEnd"));
		queryFilter.setOperTimeStart((Timestamp) inParam.get("operTimeStart"));
		queryFilter.setRegionCode((String) inParam.get("regionCode"));
		queryFilter.setMenuName((String) inParam.get("menuName"));
		return queryFilter;
	}

	/**
	 * 生成IQueryFilter对象
	 * 
	 * @date: 2016-10-26
	 * @author: xiongxq
	 * @Title: settleEmployeeNumberListFilter
	 * @param inParam
	 * @return
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleEmployeeNumberListFilter(Map<String, Object> inParam) {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setLoginNo((String) inParam.get("loginNo"));
		queryFilter.setLoginName((String) inParam.get("loginName"));
		return queryFilter;
	}
}
