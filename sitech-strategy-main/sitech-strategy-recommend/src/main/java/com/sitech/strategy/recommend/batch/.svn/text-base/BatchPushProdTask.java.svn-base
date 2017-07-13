package com.sitech.strategy.recommend.batch;

import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.recommend.entity.inter.IBatchTaskRecommendEntity;
import com.sitech.strategy.recommend.entity.param.inter.IBatchPushProdTaskParam;

public class BatchPushProdTask {
	
	/**
	 * 批量任务推荐实体对象
	 */
	protected IBatchTaskRecommendEntity batchTaskRecommendEntity;
	/**
	 * 批量送套餐任务实体
	 */
	protected IBatchPushProdTaskParam batchPushProdTaskParam;

	public IBatchTaskRecommendEntity getBatchTaskRecommendEntity() {
		return batchTaskRecommendEntity;
	}

	public void setBatchTaskRecommendEntity(
			IBatchTaskRecommendEntity batchTaskRecommendEntity) {
		this.batchTaskRecommendEntity = batchTaskRecommendEntity;
	}

	public IBatchPushProdTaskParam getBatchPushProdTaskParam() {
		return batchPushProdTaskParam;
	}

	public void setBatchPushProdTaskParam(
			IBatchPushProdTaskParam batchPushProdTaskParam) {
		this.batchPushProdTaskParam = batchPushProdTaskParam;
	}

	/**
	 * 发送批量套餐
	* @date: 2017-4-17 
	* @author: chenhao
	* @title: sendBatchProdTask  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void sendBatchPushProdTask(Map<String,Object> inParam){
		try {
			Map<String,Object> map = batchPushProdTaskParam.getSendBatchPushProdTaskInParam(inParam);
			batchTaskRecommendEntity.sendBatchPushProdTask(map);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
	}
	/** 
	 * @date: 2017-4-17 
	 * @author: chenhao
	 * @title: main 
	 * @param args 
	 * @exception: 
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public static void main(String[] args) {
		Map<String,Object> m = new HashMap<String,Object>();
		m.put("fileName",args[0]);
		m.put("ftpIp", args[1]);
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_ALL);
		BatchPushProdTask batchPushProdTask = (BatchPushProdTask)springBeanFactory.getBean("batchPushProdTask");
		batchPushProdTask.sendBatchPushProdTask(m);
		System.exit(0);
	}
}
