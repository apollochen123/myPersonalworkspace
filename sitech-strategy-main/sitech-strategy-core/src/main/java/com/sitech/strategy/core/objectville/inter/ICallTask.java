package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 外呼任务业务接口
* @date: 2017-3-17 
* @author: yuanchun
* @title: ICallTask 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ICallTask {
	
	/**
	 * 增加shell进程执行信息表中外呼任务
	* @date: 2017-3-17 
	* @author: yuanchun
	* @title: addShellProcessExecuteCallTask 
	* @param tempInparamList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	void addShellProcessExecuteCallTask(List<Map<String, Object>> tempInparamList) throws StrategyError;
	
	/**
	 * 解析待生成外呼任务营销案缓存
	* @date: 2017-3-17 
	* @author: yuanchun
	* @title: parseWaitCreateCallTaskMarketCase 
	* @param callTaskMarketCaseAndCustGroupList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> parseWaitCreateCallTaskMarketCase(List<Map<String,Object>> callTaskMarketCaseAndCustGroupList) throws StrategyError;

}
