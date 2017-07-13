package com.sitech.strategy.process.entity.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IChannelTask;
import com.sitech.strategy.core.objectville.inter.ICustGroup;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.core.objectville.inter.ITask;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.inter.ITaskProcessEntity;

/**
 * 任务实体
* @date: 2016-9-26 
* @author: sunliang 
* @title: TaskProcessEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class TaskProcessEntity extends BaseProcessEntity implements ITaskProcessEntity,Serializable{
	
	/**
	 * 渠道任务对象
	 */
	protected IChannelTask channelTask;
	/**
	 * 反馈查询
	 */
	protected IDataSelector.ICoupleBackSelector coupleBackSelector;
	/**
	 * 目标客户群对象
	 */
	protected ICustGroup custGroup;
	/**
	 * 营销案
	 */
	protected IMarketCase marketCase;
	/**
	 * 营销案数据查询对象
	 */
	protected IDataSelector.IMarketCaseSelector marketCaseSelector;
	/**
	 * 营销案数据删除对象
	 */
	protected IDataDeleter.IMarketCaseDeleter marketCaseDeleter;
	/**
	 * 规则对象
	 */
	protected IRule rule;
	/**
	 * 任务对象
	 */
	protected ITask task;
	/**
	 * 任务数据插入对象
	 */
	protected IDataInsertor.ITaskInsertor taskInsertor;
	/**
	 * 系統处理查询
	 */
	protected IDataSelector.ISystemDealSelector systemDealSelector;

	
	/** 
	* @date: 2017-3-6 
	* @author: wangpei
	* @title: setChannelTask 
	* @param channelTask 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setChannelTask(IChannelTask channelTask) {
		this.channelTask = channelTask;
	}
	/** 
	 * @date: 2016-12-1 
	 * @author: wangpei
	 * @title: setCoupleBackSelector 
	 * @param coupleBackSelector the coupleBackSelector to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setCoupleBackSelector(
			IDataSelector.ICoupleBackSelector coupleBackSelector) {
		this.coupleBackSelector = coupleBackSelector;
	}
	/**
	 * 
	* @date: 2016-10-17 
	* @author: sunliang 
	* @title: setCustGroup 
	* @param custGroup 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroup(ICustGroup custGroup) {
		this.custGroup = custGroup;
	}
	
	/**
	 * 
	* @date: 2017-1-25 
	* @author: zhangjj_crmpd
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
	 * 
	* @date: 2016-9-29 
	* @author: sunliang 
	* @title: setMarketCaseSelector 
	* @param marketCaseSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseSelector(
			IDataSelector.IMarketCaseSelector marketCaseSelector) {
		this.marketCaseSelector = marketCaseSelector;
	}
	public void setMarketCaseDeleter(
			IDataDeleter.IMarketCaseDeleter marketCaseDeleter) {
		this.marketCaseDeleter = marketCaseDeleter;
	}
	
	/**
	 * 
	* @date: 2017-4-13 
	* @author: sunliang
	* @title: setRule 
	* @param rule 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRule(IRule rule) {
		this.rule = rule;
	}
	
	/** 
	 * @date: 2016-11-14 
	 * @author: wangpei
	 * @title: setTask 
	 * @param task the task to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setTask(ITask task) {
		this.task = task;
	}

	/**
	 * 
	* @date: 2016-9-26 
	* @author: sunliang 
	* @title: setTaskInsertor 
	* @param taskInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTaskInsertor(IDataInsertor.ITaskInsertor taskInsertor) {
		this.taskInsertor = taskInsertor;
	}
	
	/**
	 * 
	* @date: 2016-12-20 
	* @author: zhangjj_crmpd
	* @title: setSystemDealSelector 
	* @param systemDealSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSystemDealSelector(
			IDataSelector.ISystemDealSelector systemDealSelector) {
		this.systemDealSelector = systemDealSelector;
	}

	/** 
	* @date: 2016-12-16 
	* @author: wangpei
	* @title: addChannelTaskSynCache 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public void addChannelTaskSynCache(Map<String,Object> tempInParam) throws StrategyError {
		taskInsertor.addChannelTaskSynToCache(tempInParam);
	}

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
	@Override
	public void addProcessDataByTaskSynCache() throws StrategyError {
		task.addProcessDataByTaskSynCache();
	}

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
	@Override
	public void closeRecommonedTask() throws StrategyError {
		String recommonedClose = null;
		do {
			recommonedClose = coupleBackSelector.getChannelTaskRecommonedCloseCache();
			Map<String, Object> tempInParam = new HashMap<String, Object>();
			tempInParam.put("recommonedClose", recommonedClose);
			task.closeRecommonedTask(tempInParam);
		} while (!CommonUtils.objectIsNull(recommonedClose));
		
	}

	/**
	 * 生成批量push任务
	* @date: 2017-4-12 
	* @author: sunliang
	* @title: generateBatchPushTask 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String generateBatchPushTask(Map<String,Object> tempInParam) throws StrategyError{
		String taskType = (String)tempInParam.get("taskType");
		String retStr = null;
		if("batchPushMsg".equals(taskType)){
			retStr = task.generateBatchPushMsgTask(tempInParam);
		}else if("batchPushProd".equals(taskType)){
			retStr = task.generateBatchPushProdTask(tempInParam);
		}
		return retStr;
	}
	
	/**
	 * 
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
	@Override
	public String generateCallTask(Map<String, Object> tempInParam)
			throws StrategyError {
		String retStr = task.generateCallTask(tempInParam);
		return retStr;
	}
	
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
	@Override
	public void generateChannelTask(Map<String, Object> tempInParam,MarketCaseCachePojo marketCaseCachePojo){
		try {
			task.generateChannelTask(tempInParam, marketCaseCachePojo);
		} catch (StrategyError e) {
			log.error("====generateChannelTask==error", tempInParam);
		}
	}
	
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
	@Override
	public Map<String, Object> getBatchPushContentMap(
			IMarketCaseCachePojo marketCaseCachePojo, String marketCaseId,
			String custGroupId,String taskType) throws StrategyError {
		return task.getBatchPushContentMap(marketCaseCachePojo, marketCaseId, custGroupId,taskType);
	}
	
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
	@Override
	public Map<String, Object> getCallContentMap(
			IMarketCaseCachePojo marketCaseCachePojo, String marketCaseId,
			String custGroupId) throws StrategyError {
		return task.getCallContentMap(marketCaseCachePojo, marketCaseId, custGroupId);
	}
	
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
	@Override
	public Map<String, Map<String,String>> getWaitCreateBatchPushMarketCase(String taskType) throws StrategyError {
		return marketCaseSelector.getWaitCreateBatchPushMarketCaseFromCache(taskType);
	}
	
	/**
	 * 删除待生成批量push任务的临时表
	* @date: 2017-5-3 
	* @author: chenhao
	* @title: getWaitCreateBatchPushMarketCase1 
	* @param taskType
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Map<String,String>> rmWaitCreateBatchPushMarketCaseTmp(String taskType,Map<String, Map<String,String>> rmMap) throws StrategyError {
		return marketCaseDeleter.rmWaitCreateBatchPushMarketCaseTmp(taskType,rmMap);
	}
	
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
	@Override
	public Map<String, Map<String,String>> getWaitCreateCallTaskMarketCase() throws StrategyError {
		return marketCaseSelector.getWaitCallTaskPushMarketCaseFromCache();
	}
	
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
	@Override
	public Map<String, Map<String,String>> getChannelMarketCaseAndCustGroup() throws StrategyError {
		return marketCase.getChannelTaskMarketCaseLabelFormulaFromCache();
	}
	
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
	@Override
	public String getCustGroupParseFormula(Map<String,String> custGroupTypeAndFormulaMap) throws StrategyError {
		return custGroup.getCustGroupParseFormula(custGroupTypeAndFormulaMap, null);
	}
	
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
	@Override
	public String getCustGroupParseFormula(Map<String,String> custGroupTypeAndFormulaMap, String custGroupId) throws StrategyError {
		return custGroup.getCustGroupParseFormula(custGroupTypeAndFormulaMap, custGroupId);
	}
	
	/**
	 * 通过ID从缓存中取出营销案详细信息
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
	@Override
	public MarketCaseCachePojo getMarketCaseCachePojoById(String marketCaseId)
			throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("marketCaseId", marketCaseId);
		return marketCaseSelector.getMarketCaseDetailFromCache(tempInParam);
	}
	
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
	@Override
	public void handleTaskAdjust() throws StrategyError {
		List<Map<String,Object>> processExecuteList = task.queryTaskAdjustProcess();
		if(CommonUtils.objectIsNull(processExecuteList)){
			return;
		}
		for(Map<String,Object> processExecute : processExecuteList){
			task.handleTaskAdjust(processExecute);
		}
		
	}
	
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
	@Override
	public boolean isGray(Map<String,Object> tempInParam) throws StrategyError {
		Map<String,Object> tempParam = new HashMap<String,Object>();
		Map<String,Object> userMap = (Map<String,Object>)tempInParam.get("userMap");
		Map<String,Object> contentMap = (Map<String,Object>)tempInParam.get("contentMap");
		List<String> ruleIdList = (List<String>)contentMap.get("ruleIdList");
		
		tempParam.put("unTroubleCustIdList", ruleIdList);
		tempParam.put("userMap", userMap);
		return rule.isPassGrey(tempParam);
	}
	
}
