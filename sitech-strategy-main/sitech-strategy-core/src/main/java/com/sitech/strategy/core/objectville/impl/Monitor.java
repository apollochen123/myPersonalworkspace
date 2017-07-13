package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IMonitor;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 监控对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: Monitor 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class Monitor extends BaseClass implements IMonitor,Serializable {
	protected IDataInsertor.IMonitorInsertor monitorInsertor;
	protected IDataSelector.IMonitorSelector monitorSelector;
	
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


	/** 增加服务监控至缓存
	* @date: 2017-3-7 
	* @author: wangpei
	* @title: addServiceMonitoringToCache 
	* @param inParam
	* @param callParam
	* @param outParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void addServiceMonitoringToCache(Map<String, Object> inParam,String callParam, String outParam) throws StrategyError {
		Date callTime = (Date) inParam.get("callTime");
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("serviceName", inParam.get("serviceName"));
		tempInParam.put("systemId", inParam.get("systemId"));
		tempInParam.put("channelId", inParam.get("channelId"));
		tempInParam.put("regionCode", inParam.get("regionCode"));
		tempInParam.put("numType", inParam.get("numType"));
		tempInParam.put("numValue", inParam.get("numValue"));
		tempInParam.put("callTime", callTime);
		tempInParam.put("inParam", callParam);
		tempInParam.put("outParam", outParam);
		Date returnTime = new Date();
		tempInParam.put("returnTime", returnTime);
		tempInParam.put("costTime", returnTime.getTime()-callTime.getTime()+"");
		monitorInsertor.addServiceMonitoringCache(tempInParam);
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
		Map<String, Object> tempInParam = null;
		do{
			try {
				tempInParam = monitorSelector.getAndRemoveServiceMonitoringCache();
			} catch (Exception e) {
			}
			if (!CommonUtils.objectIsNull(tempInParam)) {
				tempInParam.put("serialId", SequenceUtil.getSequence());
				monitorInsertor.insertServiceMonitoring(tempInParam);
			}
		}while(!CommonUtils.objectIsNull(tempInParam));
		
	}
	
}
