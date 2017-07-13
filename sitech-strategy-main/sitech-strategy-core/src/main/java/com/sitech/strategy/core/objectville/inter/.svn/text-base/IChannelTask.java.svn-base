package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 渠道任务业务对象
* @date: 2016-12-28 
* @author: sunliang 
* @title: IChannelTask 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IChannelTask {
	
	/**
	 * 从渠道任务中解析值
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: parseChannelTask 
	* @param positionTask
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> parseChannelTask(Map.Entry<String, Object> positionTask) throws StrategyError;
	
	/**
	 * 解析待生成渠道任务营销案缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: parseWaitCreateChannelTaskMarketCase 
	* @param channelTaskMarketCaseAndCustGroupList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> parseWaitCreateChannelTaskMarketCase(List<Map<String,Object>> channelTaskMarketCaseAndCustGroupList) throws StrategyError;
	
	/**
	 * 通过任务ID查询渠道任务
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: queryChannelTaskByTaskId 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryChannelTaskByTaskId(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 查询渠道任务营销案详细
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: queryChannelTaskMarketCaseDetail 
	* @param inParam
	* @param tempInParam
	* @param userMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<IMarketCaseCachePojo> queryChannelTaskMarketCaseDetail(
			Map<String, Object> inParam, Map<String, Object> tempInParam) throws StrategyError;
	
	/**
	 * 更新shell进程执行信息表中渠道任务
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: updateShellProcessExecuteChannelTask 
	* @param tempInparamList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateShellProcessExecuteChannelTask(List<Map<String, Object>> tempInparamList) throws StrategyError;
	
}
