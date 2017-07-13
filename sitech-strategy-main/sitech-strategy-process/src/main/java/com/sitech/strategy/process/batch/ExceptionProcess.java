package com.sitech.strategy.process.batch;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.entity.inter.IExceptionProcessEntity;

public class ExceptionProcess {
	
	protected IExceptionProcessEntity  exceptionProcessEntity;
	
	/**
	 * 
	* @date: 2017-5-4 
	* @author: chenhao
	* @title: setExceptionProcessEntity 
	* @param exceptionProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setExceptionProcessEntity(
			IExceptionProcessEntity exceptionProcessEntity) {
		this.exceptionProcessEntity = exceptionProcessEntity;
	}
	/**
	 * 生成批量发送任务营销案缓存意外终止队列恢复
	* @date: 2017-5-4 
	* @author: chenhao
	* @title: GenerateTaskRpoplpushRecover  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void GenerateTaskRpoplpushRecover(String taskType){
		try{
			exceptionProcessEntity.GenerateTaskRpoplpushRecover(taskType);
		}catch(StrategyError e){
			e.printStackTrace();
		}
	}
	/** 
	 * @date: 2017-5-4 
	 * @author: chenhao
	 * @title: main 
	 * @param args 
	 * @exception: 
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */

	public static void main(String[] args) {
		String taskType = args[0];
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_ALL);
		ExceptionProcess exceptionProcess = (ExceptionProcess) springBeanFactory.getBean("exceptionProcess");
		exceptionProcess.GenerateTaskRpoplpushRecover(taskType);
		System.out.println(taskType);
	}
}
