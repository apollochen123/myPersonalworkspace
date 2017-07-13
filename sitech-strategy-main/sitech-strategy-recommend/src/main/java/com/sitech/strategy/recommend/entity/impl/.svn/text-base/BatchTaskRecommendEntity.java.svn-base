package com.sitech.strategy.recommend.entity.impl;

import java.util.HashMap;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IBatchPush;
import com.sitech.strategy.recommend.base.BaseRecommendEntity;
import com.sitech.strategy.recommend.entity.inter.IBatchTaskRecommendEntity;

/**
 * 批量任务推荐实体
* @date: 2016-10-8 
* @author: yangwl
* @title: BatchTaskRecommendEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class BatchTaskRecommendEntity extends BaseRecommendEntity implements IBatchTaskRecommendEntity{
	
	/**
	 * batchPush对象
	 */
	protected IBatchPush batchPush;
	
	/**
	 * 
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: setBatchPush 
	* @param batchPush 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBatchPush(IBatchPush batchPush) {
		this.batchPush = batchPush;
	}
	
	/**
	 * 发送批量事件任务
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: sendBatchEventTask 
	* @param inparam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void sendBatchEventTask(Map<String, Object> inParam) throws StrategyError {
		Map<String, Map<String, Map<String, String>>> waitSendBatchEventTask = batchPush.getWaitSendBatchEventTask(inParam);
		batchPush.sendBatchEventTask(inParam,waitSendBatchEventTask);
	}

	/**
	 * 下发批量push任务
	* @date: 2016-12-24 
	* @author: sunliang 
	* @title: sendBatchPushTask 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void sendBatchPushTask(Map<String, Object> inParam) throws StrategyError {
		Map<String,Object> tempParam  = new HashMap<String,Object>();
		do {
			tempParam.clear();
			tempParam = batchPush.getWaitSendBatchPushMarketCaseId(inParam);
			System.out.println("sendBatchPushTask tempParam:"+tempParam);
			Map<String, Map<String, Map<String, String>>> waitSendBatchPushTask = batchPush.getWaitSendBatchPushTask(inParam,tempParam);
			System.out.println("sendBatchPushTask filterWaitSendBatchPushTask waitSendBatchPushTask before:"+waitSendBatchPushTask);
			batchPush.sendBatchPushTask(tempParam,waitSendBatchPushTask);
			
		} while (!tempParam.isEmpty());
	}

	/**
	 * 批量送套餐
	* @date: 2017-4-17 
	* @author: chenhao
	* @title: sendBatchPushProdTask 
	* @param map
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> sendBatchPushProdTask(Map<String, Object> map) throws StrategyError {
		//调用checkFile入参拼接
		MBean checkFileBean = batchPush.getBatchPushProdTaskCheckFileParam(map);
		//调用checkFile和出参分析
		Map<String,Object> checkFileMap = batchPush.checkFile(checkFileBean);
		//调用addBatchExePlan接口参数拼接
		MBean addBatchExePlanBean = batchPush.getBatchPushProdTaskAddBatchExePlanBeanParam(checkFileMap,map);
		//调用addBatchExePlan
		Map<String,Object> addBatchExePlanMap = batchPush.addBatchExePlan(addBatchExePlanBean);
		return addBatchExePlanMap;
	}
}
