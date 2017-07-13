package com.sitech.strategy.core.objectville.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 监控对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: IMonitor 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IMonitor {
	/** 增加服务监控至缓存
	* @date: 2017-3-7 
	* @author: wangpei
	* @title: addServiceMonitoringToCache 
	* @param inParam
	* @param callParam
	* @param outParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void addServiceMonitoringToCache(Map<String,Object> inParam,String callParam,String outParam)throws StrategyError;
	/** 同步服务监控信息
	* @date: 2017-3-8 
	* @author: wangpei
	* @title: synServiceMonitoringInfo 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void synServiceMonitoringInfo()throws StrategyError;
}
