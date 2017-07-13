package com.sitech.strategy.process.entity.impl;

import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.process.entity.inter.IExceptionProcessEntity;

public class ExceptionProcessEntity implements IExceptionProcessEntity {

	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	
	/**
	 * 
	* @date: 2017-5-4 
	* @author: chenhao
	* @title: setMarketCase 
	* @param marketCase 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCase(IMarketCase marketCase) {
		this.marketCase = marketCase;
	}

	/**
	 * 生成批量发送任务营销案缓存意外终止队列恢复
	* @date: 2017-5-4 
	* @author: chenhao
	* @title: GenerateTaskRpoplpushRecover 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void GenerateTaskRpoplpushRecover(String taskType) throws StrategyError {
		marketCase.MarketCaseRpoplpushRecover(taskType);
	}

}
