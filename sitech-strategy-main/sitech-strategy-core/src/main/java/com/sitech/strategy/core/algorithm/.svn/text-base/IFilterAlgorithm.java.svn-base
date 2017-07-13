package com.sitech.strategy.core.algorithm;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 过滤算法接口
* @date: 2016-11-7 
* @author: sunliang 
* @title: IFilterAlgorithm 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IFilterAlgorithm extends IAlgorithm{
	
	/**
	 * 过滤出批量push营销案
	* @date: 2016-11-7 
	* @author: sunliang 
	* @title: filterBatchPushMarketCase 
	* @param marketCaseAndCustGroupList
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> filterBatchPushMarketCase(List<Map<String,Object>> marketCaseAndCustGroupList,String param) throws StrategyError;
	/**
	 * 过滤出批量push营销案-当天待发送营销案
	* @date: 2016-12-26 
	* @author: zhangqia 
	* @title: filterBatchPushMarketCaseOnlyWaitSend 
	* @param marketCaseAndCustGroupList
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> filterBatchPushMarketCaseOnlyWaitSend(List<Map<String,Object>> marketCaseAndCustGroupList) throws StrategyError;
	/**
	 * 过滤出已经生成的外呼任务营销案
	* @date: 2017-4-22 
	* @author: yuanchun
	* @title: filterCallTaskMarketCaseAndCustGroup 
	* @param marketCaseAndCustGroupList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> filterCallTaskMarketCaseAndCustGroup(List<Map<String, Object>> marketCaseAndCustGroupList) throws StrategyError;
}
