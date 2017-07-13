package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IChannelTask;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IMarketCaseSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.ITaskSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;
import com.sitech.strategy.persist.capacity.proxy.IMsgSender;

/**
 * 渠道任务业务对象
* @date: 2016-12-28 
* @author: sunliang 
* @title: ChannelTask 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ChannelTask extends BaseClass implements IChannelTask,Serializable {
	/**
	 * 渠道任务发送
	 */
	protected IMsgSender.IChannelTaskSender channelTaskSender;
	/**
	 * 公共数据查询操作接口
	 */
	protected IDataSelector.ICommonSelector commonSelector;
	/**
	 * 营销案查询对象
	 */
	protected IMarketCaseSelector marketCaseSelector;
	/**
	 *规则
	 */
	protected IRule rule;
	/**
	 * 任务更新
	 */
	protected IDataUpdater.ITaskUpdater taskUpdater;
	/**
	 * 系统处理数据更新对象
	 */
	protected IDataUpdater.ISystemDealUpdater systemDealUpdater;
	/**
	 * 任务查询对象
	 */
	protected ITaskSelector taskSelector;

	
	/** 
	* @date: 2017-3-6 
	* @author: wangpei
	* @title: setChannelTaskSender 
	* @param channelTaskSender 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setChannelTaskSender(IMsgSender.IChannelTaskSender channelTaskSender) {
		this.channelTaskSender = channelTaskSender;
	}

	/**
	 * 
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: setCommonSelector 
	* @param commonSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCommonSelector(IDataSelector.ICommonSelector commonSelector) {
		this.commonSelector = commonSelector;
	}
	
	/**
	 * 
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: setMarketCaseSelector 
	* @param marketCaseSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseSelector(IMarketCaseSelector marketCaseSelector) {
		this.marketCaseSelector = marketCaseSelector;
	}

	/** 
	* @date: 2017-2-15 
	* @author: wangpei
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
	 * 
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: setSystemDealUpdater 
	* @param systemDealUpdater 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSystemDealUpdater(
			IDataUpdater.ISystemDealUpdater systemDealUpdater) {
		this.systemDealUpdater = systemDealUpdater;
	}
	
	/** 
	* @date: 2017-3-6 
	* @author: wangpei
	* @title: setTaskUpdater 
	* @param taskUpdater 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setTaskUpdater(IDataUpdater.ITaskUpdater taskUpdater) {
		this.taskUpdater = taskUpdater;
	}

	/**
	 * 
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: setTaskSelector 
	* @param taskSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTaskSelector(ITaskSelector taskSelector) {
		this.taskSelector = taskSelector;
	}
	
	/**
	 * 从渠道任务中解析值
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: parseChannelTask 
	* @param channelTaskMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> parseChannelTask(
			Entry<String, Object> channelTaskMap) throws StrategyError {
		
		Map<String,Object> outParam = new HashMap<String,Object>();
		String positionId = channelTaskMap.getKey();
		Map<String, String> task = (Map<String, String>)channelTaskMap.getValue();
		String idNo = task.get("idNo");
		outParam.put("channelTaskMap", task);
		outParam.put("positionId", positionId);
		outParam.put("idNo", idNo);
		
		return outParam;
	}
	
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
	@Override
	public Map<String, Object> parseWaitCreateChannelTaskMarketCase(
			List<Map<String, Object>> channelTaskMarketCaseAndCustGroupList)
			throws StrategyError {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<Map<String, Object>> waitCreateChannelTaskMarketCaseList = new ArrayList<Map<String, Object>>();
		if(!CommonUtils.objectIsNull(channelTaskMarketCaseAndCustGroupList)){
			for(Map<String, Object>  marketCaseRelCustGroupType:channelTaskMarketCaseAndCustGroupList){
				Map<String, Object> marketCaseCustGroupMap = new HashMap<String, Object>();
				Map<String, Object> custGroupTypeFormula = new HashMap<String, Object>();
				String custGroupType = (String)marketCaseRelCustGroupType.get("custGroupType");
				if(Const.CUSTGROUP_TYPE_LOAD.equals(custGroupType)) {
					custGroupTypeFormula.put(custGroupType, "RM_CUSTGROUP_"+(String)marketCaseRelCustGroupType.get("custGroupId")+"_DETAIL_INFO");
				}else if(Const.CUSTGROUP_TYPE_DB.equals(custGroupType)) {
					custGroupTypeFormula.put(custGroupType, "RM_CUSTGROUP_"+(String)marketCaseRelCustGroupType.get("custGroupId")+"_DETAIL_INFO");
				}else{
					custGroupTypeFormula.put(custGroupType, marketCaseRelCustGroupType.get("labelFormula"));
				}
				marketCaseCustGroupMap.put(marketCaseRelCustGroupType.get("marketCaseId") + Const.SEPARATOR_COLON + (String)marketCaseRelCustGroupType.get("custGroupId"), custGroupTypeFormula);
				waitCreateChannelTaskMarketCaseList.add(marketCaseCustGroupMap);
			}
			resultMap.put("waitCreateChannelTaskMarketCaseList", waitCreateChannelTaskMarketCaseList);
		}	
		return resultMap;
	}
	
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
	@Override
	public Map<String, Object> queryChannelTaskByTaskId(
			Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> positionMap = new HashMap<String, Object>();
		List<Map<String, Object>> positionInfoList = (List<Map<String, Object>>)inParam.get("positionIdList");
		for(Map<String, Object> positionInfoMap:positionInfoList){
			Map<String, Object> tempParam = new HashMap<String, Object>();
			tempParam.put("taskId", positionInfoMap.get("taskId"));
			Map<String, String>	task = taskSelector.getChannelTask(tempParam);
			if (!CommonUtils.objectIsNull(task) && task.get("regionCode").equals(inParam.get("regionCode"))) {
				Map<String, Object> tempInParam = new HashMap<String, Object>();
				tempInParam.put("marketCaseId", task.get("actId"));
				tempInParam.put("idNo", task.get("idNo"));
				if (rule.isRecommonedClose(inParam, tempInParam, tempInParam)) {
					positionMap.put((String)positionInfoMap.get("positionId"),task);
				}
			}
		}
		return positionMap;
	}
	
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
	@Override
	public List<IMarketCaseCachePojo> queryChannelTaskMarketCaseDetail(
			Map<String, Object> inParam, Map<String, Object> tempInParam) throws StrategyError {
		
		Map<String, Object> task =  (Map<String, Object>) tempInParam.get("channelTaskMap");
		log.debug("queryChannelTaskMarketCaseDetail.task==task=", task);
		//根据营销案ID在缓存中查询营销案详细信息
		List<IMarketCaseCachePojo> marketCaseCachePojoList = new ArrayList<IMarketCaseCachePojo>();
		if(!CommonUtils.objectIsNull(task)){
			Map<String, Object> tempParam = new HashMap<String, Object>();
			tempParam.put("marketCaseId", task.get("actId"));
			MarketCaseCachePojo cachePojo = marketCaseSelector.getMarketCaseDetailFromCache(tempParam);
			if (!CommonUtils.objectIsNull(cachePojo)) {
				Map<String,Object> marketCaseBasic = cachePojo.getMarketCaseMap();
				if(!CommonUtils.objectIsNull(marketCaseBasic) && Const.MARKET_CASE_STATUS_EXE.equals(marketCaseBasic.get("statusCode"))){
					marketCaseCachePojoList.add(cachePojo);
				}
			}
		}
		return marketCaseCachePojoList;
	}
	
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
	@Override
	public void updateShellProcessExecuteChannelTask(
			List<Map<String, Object>> tempInparamList) throws StrategyError {
		for(Map<String, Object>  baseInfo:tempInparamList){
			Map<String, Object> tempInParam = new HashMap<String, Object>();
			tempInParam.put("busiId", baseInfo.get("marketCaseId"));
			tempInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE);
			tempInParam.put("processNo", Const.SHELLPROCESS_NO_WAITCREATECHANNELTASK);
			tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_EXE);
			String dataBaseTime = commonSelector.selectDataBaseSysTime();
			tempInParam.put("updateTime", DateUtil.string2Timestamp(dataBaseTime, DateUtil.TIME_FROMAT_SIMPLE3));
			systemDealUpdater.updateShellProcessExecuteInfo(tempInParam);
		}
	}
}
