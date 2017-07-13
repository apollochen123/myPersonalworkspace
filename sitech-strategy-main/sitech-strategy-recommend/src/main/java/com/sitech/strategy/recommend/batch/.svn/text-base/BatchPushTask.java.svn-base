package com.sitech.strategy.recommend.batch;

import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.recommend.entity.inter.IBatchTaskRecommendEntity;
import com.sitech.strategy.recommend.entity.param.inter.IBatchPushTaskParam;

/**
 * 批量push任务发送
* @date: 2016-9-28 
* @author: sunliang 
* @title: BatchPushSend 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class BatchPushTask extends BaseClass{
	
	/**
	 * 批量push任务参数处理对象
	 */
	protected IBatchPushTaskParam batchPushTaskParam;
	/**
	 * 批量任务推荐实体
	 */
	protected IBatchTaskRecommendEntity batchTaskRecommendEntity;

	/**
	 * 
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: setBatchPushTaskParam 
	* @param batchPushTaskParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBatchPushTaskParam(IBatchPushTaskParam batchPushTaskParam) {
		this.batchPushTaskParam = batchPushTaskParam;
	}
	
	/**
	 * 
	* @date: 2016-12-24 
	* @author: sunliang 
	* @title: setBatchTaskRecommendEntity 
	* @param batchTaskRecommendEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBatchTaskRecommendEntity(
			IBatchTaskRecommendEntity batchTaskRecommendEntity) {
		this.batchTaskRecommendEntity = batchTaskRecommendEntity;
	}
	
	/**
	 * 批量push短信下发
	* @date: 2016-12-24 
	* @author: sunliang 
	* @title: sendBatchPushTask 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void sendBatchPushTask(String processId){
		try {
			Map<String,Object> inParam = batchPushTaskParam.getSendBatchPushTaskInParam(processId);
			batchTaskRecommendEntity.sendBatchPushTask(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 批量push短信下发程序
	* @date: 2016-12-24 
	* @author: sunliang 
	* @title: main 
	* @param args 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void main(String[] args){
		
		if (args.length < 1) {
			System.err.println("please input process id");
			System.exit(0);
		}

		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_ALL);
		BatchPushTask batchPushTask = (BatchPushTask)springBeanFactory.getBean("batchPushTask");
		
		long start = System.currentTimeMillis();
		batchPushTask.sendBatchPushTask(args[0]);
		long end = System.currentTimeMillis();
		
		System.out.println("total time：" + (end - start)/1000 + "s");
	}
}
