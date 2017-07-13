package com.sitech.strategy.process.entity.impl;

import java.io.Serializable;

import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IMonitor;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.inter.ISystemProcessEntity;

/**
 * Create on 2017-3-8
 * @author: wangpei
 * @Title:SystemProcessEntity
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class SystemProcessEntity extends BaseProcessEntity implements ISystemProcessEntity,Serializable{
	/**
	 * 监控
	 */
	protected IMonitor monitor;
	
	/** 
	* @date: 2017-3-8 
	* @author: wangpei
	* @title: setMonitor 
	* @param monitor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setMonitor(IMonitor monitor) {
		this.monitor = monitor;
	}

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
	@Override
	public void synServiceMonitoringInfo() throws StrategyError {
		monitor.synServiceMonitoringInfo();
	}

}
