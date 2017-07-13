package com.sitech.strategy.process.entity.inter;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 错误处理类
 * Create on 2017-5-4
 * @author: chenhao
 * @Title:IExceptionProcessEntity
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public interface IExceptionProcessEntity {

	/**
	 * 生成任务缓存意外终止队列恢复
	* @date: 2017-5-4 
	* @author: chenhao
	* @title: GenerateTaskRpoplpushRecover 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void GenerateTaskRpoplpushRecover(String taskType) throws StrategyError;
}
