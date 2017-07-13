package com.sitech.strategy.recommend.batch;

import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.recommend.base.BaseClass;
import com.sitech.strategy.recommend.entity.inter.IBatchTaskRecommendEntity;
import com.sitech.strategy.recommend.entity.param.inter.IBatchEventTaskParam;


/**
 * 批量事件任务发送
* @date: 2016-11-29
* @author: songxj
* @title: BatchEventTask
* @version: 1.0
* @description：
* update_version: update_date: update_author: update_note:
*/
public class BatchEventTask extends BaseClass{
	
	/**
	 * 批量任务推荐实体对象
	 */
	protected IBatchTaskRecommendEntity batchTaskRecommendEntity;
	/**
	 * 参数处理对象
	 */
	protected IBatchEventTaskParam batchEventTaskParam;

	/** 
	* @date: 2016-11-30 
	* @author: songxj
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
	 * 
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: setBatchEventTaskParam 
	* @param batchEventTaskParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBatchEventTaskParam(IBatchEventTaskParam batchEventTaskParam) {
		this.batchEventTaskParam = batchEventTaskParam;
	}

	/**
	 * 发送批量事件任务
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: sendBatchEventTask 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void sendBatchEventTask(String processId){
		try {
			Map<String,Object> inParam = batchEventTaskParam.getSendBatchEventTaskInParam(processId);
			batchTaskRecommendEntity.sendBatchEventTask(inParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		String loadType = args[0];
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_RECOMMEND);
		BatchEventTask batchEventTask = (BatchEventTask)springBeanFactory.getBean("batchEventTask");
		long start = System.currentTimeMillis();
		if(loadType.equals("batchEventTask")){
			if (args.length < 2) {
				System.err.println("please input process id, eg: 99");
				System.exit(0);
			}
			batchEventTask.sendBatchEventTask(args[1]);
		}
		long end = System.currentTimeMillis();
		long time = end - start;
		System.out.println("总共花时间为：" + time/1000 + "s");
	}

}
