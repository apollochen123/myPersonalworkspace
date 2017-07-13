package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 批量push业务对象
* @date: 2016-12-28 
* @author: sunliang 
* @title: IBatchPush 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IBatchPush {
	
	/**
	 * 增加当日已处理记录
	* @date: 2017-1-9 
	* @author: sunliang 
	* @title: addCurrentDayProcessedRecord 
	* @param batchPushMarketCaseAndCustGroupList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addCurrentDayProcessedRecord(List<Map<String, Object>> batchPushMarketCaseAndCustGroupList,String param) throws StrategyError;
	
	/**
	 * 过滤等待下发任务
	* @date: 2017-2-16 
	* @author: zhangjj_crmpd
	* @title: filterWaitSendBatchPushTask 
	* @param tempParam
	* @param waitSendBatchPushTask 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, String>> filterWaitSendBatchPushTask(Map<String,Object> tempParam,Map<String,Object> globalRule,Map<String, Map<String, Map<String, String>>> waitSendBatchPushTask)throws StrategyError;
	
	
	
	/**
	 * 得到待发送批量push营销案Id
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: getWaitSendBatchPushMarketCaseId 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> getWaitSendBatchPushMarketCaseId(Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 获取待发送批量push任务
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: getWaitSendBatchPushTask 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Map<String, Map<String, String>>> getWaitSendBatchPushTask(Map<String,Object> InParam,Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 获取待发送批量事件任务
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: getWaitSendBatchEventTask 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Map<String, Map<String, String>>> getWaitSendBatchEventTask(Map<String, Object> tempInParam) throws StrategyError;
	
	/**
	 * 解析待生成批量push营销案缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: parseWaitCreateBatchPushMarketCase 
	* @param batchPushMarketCaseAndCustGroupList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> parseWaitCreateBatchPushMarketCase(List<Map<String,Object>> batchPushMarketCaseAndCustGroupList) throws StrategyError;
	
	/**
	 * 解析待发送批量push营销案缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: parseWaitSendBatchPushMarketCase 
	* @param batchPushMarketCaseAndCustGroupList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,List<Map<Object, Object>>> parseWaitSendBatchPushMarketCase(List<Map<String,Object>> batchPushMarketCaseAndCustGroupList) throws StrategyError;
	
	/**
	 * 下发批量push任务
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: sendBatchPushTask 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void sendBatchPushTask(Map<String,Object> tempParam,Map<String, Map<String, Map<String, String>>> waitSendBatchPushTask) throws StrategyError;

	/**
	 * 发送批量push任务湖北
	* @date: 2017-2-28 
	* @author: zhangqia 
	* @title: sendBatchPushTaskForHBMob 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void sendBatchPushTaskForHBMob(Map<String,Object> tempParam,Map<String, Map<String, Map<String, String>>> waitSendBatchPushTask) throws StrategyError;
	/**
	 * 发送批量事件任务
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: sendBatchEventTask 
	* @param inParam
	* @param waitSendBatchEventTask
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void sendBatchEventTask(Map<String,Object> inParam,Map<String, Map<String, Map<String, String>>> waitSendBatchEventTask) throws StrategyError;
	
	/**
	 * 更新shell进程执行信息表中批量push营销案
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: updateShellProcessExecuteBatchPush 
	* @param tempInParamList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateShellProcessExecuteBatchPush(List<Map<String, Object>> tempInParamList) throws StrategyError;
	/**
	 * 得到待发送批量push营销案Id和发送日期
	* @date: 2016-2-28 
	* @author: zhangqia 
	* @title: getWaitSendBatchPushMarketCaseIdAndSendDate 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> getWaitSendBatchPushMarketCaseIdAndSendDate(Map<String,Object> tempInParam)throws StrategyError;

	/**
	 * 得到checkFile的入参bean
	* @date: 2017-4-17 
	* @author: chenhao
	* @title: getBatchPushProdTaskCheckFileParam 
	* @param map
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public MBean getBatchPushProdTaskCheckFileParam(Map<String, Object> map) throws StrategyError;

     /**
	 * 调用外部接口，验证批量套餐文件是否正确
	* @date: 2017-4-17 
	* @author: chenhao
	* @title: checkFile 
	* @param checkFileBean
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> checkFile(MBean checkFileBean) throws StrategyError;

     /**
	 * 添加批量套餐服务参数处理
	* @date: 2017-4-17 
	* @author: chenhao
	* @title: getBatchPushProdTaskAddBatchExePlanBeanParam 
	* @param checkFileMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public MBean getBatchPushProdTaskAddBatchExePlanBeanParam(Map<String, Object> checkFileMap,Map<String,Object> inParam) throws StrategyError;

     /**
	 * 添加批量套餐服务
	* @date: 2017-4-17 
	* @author: chenhao
	* @title: addBatchExePlan 
	* @param checkFileBean
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> addBatchExePlan(MBean checkFileBean) throws StrategyError;

}
