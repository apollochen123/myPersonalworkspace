package com.sitech.strategy.process.batch;

import java.io.Serializable;

import com.sitech.jcfx.dt.MBean;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.utils.ServiceUtil;
import com.sitech.strategy.process.base.BaseProcessBatch;
import com.sitech.strategy.process.entity.inter.ITaskProcessEntity;

/**修改任务
 * Create on 2016-12-1
 * @author: wangpei
 * @Title:UpdateTask
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class UpdateTask extends BaseProcessBatch implements Serializable{
	/**
	 * 任务实体
	 */
	protected ITaskProcessEntity taskProcessEntity;
	
	/** 
	 * @date: 2016-12-1 
	 * @author: wangpei
	 * @title: setTaskProcessEntity 
	 * @param taskProcessEntity the taskProcessEntity to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setTaskProcessEntity(ITaskProcessEntity taskProcessEntity) {
		this.taskProcessEntity = taskProcessEntity;
	}
	
	/** 根据同步缓存增加进程表数据
	* @date: 2016-12-19 
	* @author: wangpei
	* @title: addProcessDataByTaskSynCache  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void addProcessDataByTaskSynCache(){
		log.info("====addProcessDataByTaskSynCache===start==", "1");
		try {
			taskProcessEntity.addProcessDataByTaskSynCache();
		} catch (StrategyError e) {
			log.debug("EXCEPTION", e.getMessage());
		}
		log.info("====addProcessDataByTaskSynCache===end==", "1");
	}

	/** 根据关闭缓存关闭任务
	* @date: 2016-12-1 
	* @author: wangpei
	* @title: closeRecommonedTask  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void closeRecommonedTask(){
		try {
			taskProcessEntity.closeRecommonedTask();
		} catch (StrategyError e) {
			log.debug("EXCEPTION", e.getMessage());
		}
	}
	
	/**
	 * 处理调配任务
	* @date: 2016-12-20 
	* @author: zhangjj_crmpd
	* @title: handleTaskAdjust  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleTaskAdjust(){
		try {
			SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_ALL);
			ITaskProcessEntity taskProcessEntity = (ITaskProcessEntity)springBeanFactory.getBean("taskProcessEntity");
			taskProcessEntity.handleTaskAdjust();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/** 
	* @date: 2016-12-1 
	* @author: wangpei
	* @title: main 
	* @param args 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static void main(String[] args) {
		String taskType = args[0];
		System.out.println("============input====="+taskType);
		if("closeRecommonedTask".equals(taskType)){
			String serviceName = "http://134.64.128.95:14501/sitech-strategy-site/rs/service/com_sitech_strategy_process_service_jcf_inter_ICoupleBackProcessServiceSvc_recommonedTaskClose";
			MBean bean = new MBean();
			String out = ServiceUtil.callService(serviceName, bean.toString());
			System.out.println("============out====="+out);
		}else if("addProcessDataByTaskSynCache".equals(taskType)){
			SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_ALL);
			UpdateTask updateTask = (UpdateTask)springBeanFactory.getBean("updateTask");
			updateTask.addProcessDataByTaskSynCache();
		}else if("handleTaskAdjust".equals(taskType)){
			String serName = "com_sitech_strategy_process_service_jcf_inter_ITaskProcessServiceSvc_parseTaskAdjust";
			String pin=  "{\"ROOT\":{\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"\",\"ROUTE_VALUE\":\"\"}},\"BODY\":{}}}";  
			String result = ServiceUtil.callService("http://134.64.128.95:14501/sitech-strategy-site/rs/service/"+serName, pin);
			System.out.println("============handleTaskAdjust result====="+result);
		}
	}
}
