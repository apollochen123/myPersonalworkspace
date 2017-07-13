package com.sitech.strategy.manage.entity.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IMonitorManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 监控实体
* @date: 2016-9-5 
* @author: tangaq
* @title: MonitorManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class MonitorManageEntity extends BaseManageEntity implements IMonitorManageEntity {
	
	/**
	 * 监控删除对象
	 */
	protected IDataDeleter.IMonitorDeleter monitorDeleter;
	/**
	 * 监控插入对象
	 */
	protected IDataInsertor.IMonitorInsertor monitorInsertor;
	/**
	 * 监控查询对象
	 */
	protected IDataSelector.IMonitorSelector monitorSelector;

	/** 
	* @date: 2017-3-7 
	* @author: wangpei
	* @title: setMonitorDeleter 
	* @param monitorDeleter 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setMonitorDeleter(IDataDeleter.IMonitorDeleter monitorDeleter) {
		this.monitorDeleter = monitorDeleter;
	}

	/** 
	* @date: 2017-3-7 
	* @author: wangpei
	* @title: setMonitorInsertor 
	* @param monitorInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setMonitorInsertor(IDataInsertor.IMonitorInsertor monitorInsertor) {
		this.monitorInsertor = monitorInsertor;
	}

	/** 
	* @date: 2017-3-7 
	* @author: wangpei
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
	 * 查询作业运行监控列表
	* @date: 2016-11-7 
	* @author: fangyuan_crmpd
	* @title: queryWorkOperMonitorList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryWorkOperMonitorList(
			Map<String, Object> inParam) throws StrategyError {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("workCode", "111111");
		map1.put("workName", "针维用户标签001");
		map1.put("startTime", "2016-11-09 11:00:00");
		map1.put("endTime", "2016-11-09 12:00:00");
		map1.put("workPeriod", "月");
		map1.put("workStatus", "执行中");
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("workCode", "222222");
		map2.put("workName", "针维用户标签002");
		map2.put("startTime", "2016-11-11 11:00:00");
		map2.put("endTime", "2016-11-11 12:00:00");
		map2.put("workPeriod", "日");
		map2.put("workStatus", "异常");
		list.add(map2);
		Map<String, Object> outParam = new HashMap<String, Object>();
		outParam.put("queryWorkOperMonitorList", list);
		outParam.put("currentPageCode", "1");
		outParam.put("perRecordCount", "10");
		outParam.put("totalRecordCount", "1");
		outParam.put("queryId", "3432253523");
		return outParam;
	}
	
	/**
	 * 根据作业编码查询作业运行告警详细信息
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: queryWorkOperWarningDetailByWorkCode 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryWorkOperWarningDetailByWorkCode(
			Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> outMap = monitorSelector.selectWorkOperWarningInfo(inParam);
		Map<String, Object> outParam = new HashMap<String, Object>();
		outParam.put("workOperWarningDetailMap", outMap);
		return outParam;
	}
	
	/**
	 * 根据作业编码删除作业运行告警详细信息
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: removeWorkOperWarningDetailByWorkCode 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeWorkOperWarningDetailByWorkCode(
			Map<String, Object> inParam) throws StrategyError {
		monitorDeleter.deleteWorkOperWarningInfo(inParam);
		
	}
	
	/**
	 * 保存作业运行告警详细信息
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: saveWorkOperWarningDetail 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveWorkOperWarningDetail(Map<String, Object> inParam)
			throws StrategyError {
		monitorInsertor.insertWorkOperWarningInfo(inParam);
		
	}

}
