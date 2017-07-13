package com.sitech.strategy.recommend.entity.impl.extend;

import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IBatchPush;
import com.sitech.strategy.recommend.base.BaseRecommendEntity;
import com.sitech.strategy.recommend.entity.impl.BatchTaskRecommendEntity;
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
public class BatchTaskRecommendEntityByHBMob extends BatchTaskRecommendEntity implements IBatchTaskRecommendEntity{
	
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
			tempParam = batchPush.getWaitSendBatchPushMarketCaseIdAndSendDate(inParam);
			System.out.println("sendBatchPushTask tempParam:"+tempParam);
			Map<String, Map<String, Map<String, String>>> waitSendBatchPushTask = batchPush.getWaitSendBatchPushTask(inParam,tempParam);
			System.out.println("sendBatchPushTask filterWaitSendBatchPushTask waitSendBatchPushTask before:"+waitSendBatchPushTask);
			batchPush.sendBatchPushTaskForHBMob(tempParam,waitSendBatchPushTask);
			
		} while (!tempParam.isEmpty());
	}

}
