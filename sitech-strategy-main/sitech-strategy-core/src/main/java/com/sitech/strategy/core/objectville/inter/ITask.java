package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**渠道任务
 * Create on 2016-11-14
 * @author: wangpei
 * @Title:IChannelTask
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public interface ITask {
	/** 根据同步缓存增加进程表数据
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: addProcessDataByTaskSynCache 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void addProcessDataByTaskSynCache() throws StrategyError;
	
	/** 关闭推荐任务
	* @date: 2016-12-1 
	* @author: wangpei
	* @title: closeRecommonedTask 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void closeRecommonedTask(Map<String, Object> tempInParam) throws StrategyError;
	
	/** 生成批量push任务
	* @date: 2017-1-18 
	* @author: wangpei
	* @title: generateChannelTask 
	* @param tempInParam
	* @param marketCaseCachePojo
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void generateBatchPushTask(Map<String, Object> tempInParam,MarketCaseCachePojo marketCaseCachePojo) throws StrategyError;
	
	/**
	 * 生成批量push短信任务
	* @date: 2017-4-12 
	* @author: sunliang
	* @title: generateBatchPushMsgTask 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String generateBatchPushMsgTask(Map<String, Object> tempInParam) throws StrategyError;
	
	/**
	 * 生成批量push套餐任务
	* @date: 2017-4-12 
	* @author: sunliang
	* @title: generateBatchPushProdTask 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String generateBatchPushProdTask(Map<String, Object> tempInParam) throws StrategyError;
	
	/**
	 * 生成外呼任务
	* @date: 2017-3-16 
	* @author: sunliang 
	* @title: generateCallTask 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String generateCallTask(Map<String, Object> tempInParam) throws StrategyError;

	
	/** 生成渠道任务
	* @date: 2016-11-14 
	* @author: wangpei
	* @title: generateChannelTask 
	* @param tempInParam
	* @param marketCaseCachePojo 
	* @exception: 
	* @version: 1.0 
	* @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void generateChannelTask(Map<String, Object> tempInParam,MarketCaseCachePojo marketCaseCachePojo) throws StrategyError;
	
	/**
	 * 获取批量发送内容
	* @date: 2017-4-13 
	* @author: sunliang
	* @title: getBatchPushContentMap 
	* @param marketCaseCachePojo
	* @param marketCaseId
	* @param custGroupId
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getBatchPushContentMap(IMarketCaseCachePojo marketCaseCachePojo, String marketCaseId,
			String custGroupId,String taskType) throws StrategyError;
	
	/**
	 * 获取外呼内容
	* @date: 2017-3-18 
	* @author: sunliang 
	* @title: getCallContentMap 
	* @param marketCaseCachePojo
	* @param marketCaseId
	* @param custGroupId
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getCallContentMap(IMarketCaseCachePojo marketCaseCachePojo, String marketCaseId,
			String custGroupId) throws StrategyError;
	
	/**
	 * 处理调配任务
	* @date: 2016-12-20 
	* @author: zhangjj_crmpd
	* @title: handleTaskAdjust 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> handleTaskAdjust(Map<String, Object> tempInParam) throws StrategyError;
	
	/**
	 * 查询渠道任务
	* @date: 2016-12-1 
	* @author: zhangjj_crmpd
	* @title: queryTask 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryChannelTask(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 查询营业部任务概况
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: queryDepartmentTaskSurvey 
	* @param tempInParam
	* @param queryFilter
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryDepartmentTaskSurvey(Map<String, Object> tempInParam, IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 查询调配任务
	* @date: 2017-1-9 
	* @author: zhangjj_crmpd
	* @title: queryTaskAdjustList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryTaskAdjustList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 查询调配任务进程
	* @date: 2017-1-25 
	* @author: zhangjj_crmpd
	* @title: queryTaskAdjustProcess 
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> queryTaskAdjustProcess() throws StrategyError;
	
	/**
	 * 任务关闭
	* @date: 2017-1-19 
	* @author: zhangjj_crmpd
	* @title: recommonedTaskClose 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void recommonedTaskClose(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 保存任务调配信息
	* @date: 2016-12-15 
	* @author: zhangjj_crmpd
	* @title: saveTaskAdjust 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	 * @return 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> saveTaskAdjust(Map<String,Object> inParam) throws StrategyError;
	
	/** 生成批量push任务湖北
	* @date: 2017-2-15 
	* @author: zhangqia
	* @title: generateChannelTask 
	* @param tempInParam
	* @param marketCaseCachePojo
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void generateBatchPushTaskForHBMob(Map<String, Object> tempInParam,MarketCaseCachePojo marketCaseCachePojo) throws StrategyError;

}
