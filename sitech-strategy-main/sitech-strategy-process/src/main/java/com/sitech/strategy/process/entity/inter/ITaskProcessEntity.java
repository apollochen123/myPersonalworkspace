package com.sitech.strategy.process.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 任务实体
* @date: 2016-9-26 
* @author: sunliang 
* @title: ITaskProcessEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ITaskProcessEntity {
	/** 加载渠道任务同步缓存
	* @date: 2016-12-16 
	* @author: wangpei
	* @title: addChannelTaskSynCache 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void addChannelTaskSynCache(Map<String,Object> tempInParam) throws StrategyError;
	
	/** 根据同步缓存增加进程表数据
	* @date: 2016-12-19 
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
	public void closeRecommonedTask() throws StrategyError;
	/**
	 * 生成批量push任务
	* @date: 2016-10-8 
	* @author: sunliang 
	* @title: generateBatchPushTask 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String generateBatchPushTask(Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 生成外呼任务
	* @date: 2017-3-16 
	* @author: sunliang 
	* @title: generateCallTask 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String generateCallTask(Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 生成渠道任务
	* @date: 2016-10-17 
	* @author: sunliang 
	* @title: generateChannelTask 
	* @param tempInParam
	* @param marketCaseCachePojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void generateChannelTask(Map<String,Object> tempInParam,MarketCaseCachePojo marketCaseCachePojo);
	
	/**
	 * 
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: getWaitCreateBatchPushMarketCase 
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Map<String,String>> getWaitCreateBatchPushMarketCase(String taskType) throws StrategyError;
	
	/**
	 * 得到待生成外呼任务营销案
	* @date: 2017-3-16 
	* @author: sunliang 
	* @title: getWaitCreateCallTaskMarketCase 
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Map<String,String>> getWaitCreateCallTaskMarketCase() throws StrategyError;
	
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
	public Map<String,Object> getBatchPushContentMap(IMarketCaseCachePojo marketCaseCachePojo,String marketCaseId,String custGroupId,String taskType) throws StrategyError;
	
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
	public Map<String,Object> getCallContentMap(IMarketCaseCachePojo marketCaseCachePojo,String marketCaseId,String custGroupId) throws StrategyError;
	
	/**
	 * 得到需要生产渠道任务的营销案和目标客户群
	* @date: 2016-10-12 
	* @author: sunliang 
	* @title: getChannelMarketCaseAndCustGroup 
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Map<String,String>> getChannelMarketCaseAndCustGroup() throws StrategyError;
	
	/**
	 * 获取目标客户群解析表达式
	* @date: 2016-10-25 
	* @author: yangwl
	* @title: getCustGroupParseFormula 
	* @param custGroupTypeAndFormulaMap
	* @param custGroupId
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getCustGroupParseFormula(Map<String,String> custGroupTypeAndFormulaMap, String custGroupId) throws StrategyError;
	
	/**
	 * 获取目标客户群解析表达式
	* @date: 2016-10-17 
	* @author: sunliang 
	* @title: getCustGroupParseFormula 
	* @param custGroupTypeAndFormulaMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getCustGroupParseFormula(Map<String,String> custGroupTypeAndFormulaMap) throws StrategyError;
	
	/**
	 * 通过ID从缓存中取出营销案信息
	* @date: 2016-9-29 
	* @author: sunliang 
	* @title: getMarketCaseCachePojoById 
	* @param MarketCaseId
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public MarketCaseCachePojo getMarketCaseCachePojoById(String marketCaseId) throws StrategyError;
	/**
	 * 处理调配任务
	* @date: 2016-12-20 
	* @author: zhangjj_crmpd
	* @title: handleTaskAdjust  
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleTaskAdjust() throws StrategyError;
	
	/**
	 * 判断是否为灰名单用户
	* @date: 2017-4-12 
	* @author: sunliang
	* @title: isGray 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	boolean isGray(Map<String,Object> tempInParam) throws StrategyError;

	/**
	 * 删除批量任务队列临时缓存
	* @date: 2017-5-3 
	* @author: chenhao
	* @title: rmWaitCreateBatchPushMarketCaseTmp 
	* @param taskType
	* @param waitCreateBatchPushMarketCaseMap
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Map<String,String>> rmWaitCreateBatchPushMarketCaseTmp(String taskType,Map<String, Map<String, String>> waitCreateBatchPushMarketCaseMap) throws StrategyError;
}
