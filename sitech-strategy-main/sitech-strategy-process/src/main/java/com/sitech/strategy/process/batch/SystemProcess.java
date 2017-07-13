package com.sitech.strategy.process.batch;

import java.io.Serializable;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.base.BaseClass;
import com.sitech.strategy.process.entity.inter.ISystemProcessEntity;

/**系统进程
 * Create on 2017-3-8
 * @author: wangpei
 * @Title:SystemProcess
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class SystemProcess extends BaseClass implements Serializable{
	/**
	 * 
	 */
	protected ISystemProcessEntity systemProcessEntity;
	
	/** 
	* @date: 2017-3-8 
	* @author: wangpei
	* @title: setSystemProcessEntity 
	* @param systemProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setSystemProcessEntity(ISystemProcessEntity systemProcessEntity) {
		this.systemProcessEntity = systemProcessEntity;
	}

	/** 同步服务监控
	* @date: 2017-3-8 
	* @author: wangpei
	* @title: synServiceMonitoringInfo  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void synServiceMonitoringInfo(){
		try {
			systemProcessEntity.synServiceMonitoringInfo();
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/** 
	* @date: 2017-3-8 
	* @author: wangpei
	* @title: main 
	* @param args 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static void main(String[] args) {
		String processType = args[0];
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_ALL);
		if ("serviceMonitoring".equals(processType)) {
			SystemProcess systemProcess = (SystemProcess) springBeanFactory.getBean("systemProcess");
			systemProcess.synServiceMonitoringInfo();
		}
	}
}
