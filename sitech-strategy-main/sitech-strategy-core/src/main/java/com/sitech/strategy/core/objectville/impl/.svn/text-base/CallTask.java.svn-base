package com.sitech.strategy.core.objectville.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.ICallTask;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 外呼任务业务对象
* @date: 2017-3-17 
* @author: yuanchun
* @title: CallTask 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class CallTask extends BaseClass implements ICallTask {

	/**
	 * 公共数据查询操作接口
	 */
	protected IDataSelector.ICommonSelector commonSelector;
	/**
	 * 系统处理数据更新对象
	 */
	protected IDataUpdater.ISystemDealUpdater systemDealUpdater;
	/**
	 * 系统处理数据插入对象
	 */
	protected IDataInsertor.ISystemDealInsertor systemDealInsertor;
	
	/**
	 * 
	* @date: 2017-3-18 
	* @author: yuanchun
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
	* @date: 2017-4-24 
	* @author: yuanchun
	* @title: setSystemDealInsertor 
	* @param systemDealInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSystemDealInsertor(
			IDataInsertor.ISystemDealInsertor systemDealInsertor) {
		this.systemDealInsertor = systemDealInsertor;
	}

	/**
	 * 
	* @date: 2017-3-18 
	* @author: yuanchun
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
	@Override
	public Map<String, Object> parseWaitCreateCallTaskMarketCase(
			List<Map<String, Object>> callTaskMarketCaseAndCustGroupList)
			throws StrategyError {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<Map<String, Object>> waitCreateCallTaskMarketCaseList = new ArrayList<Map<String, Object>>();
		if(!CommonUtils.objectIsNull(callTaskMarketCaseAndCustGroupList)){
			for(Map<String, Object>  marketCaseRelCustGroupType:callTaskMarketCaseAndCustGroupList){
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
				waitCreateCallTaskMarketCaseList.add(marketCaseCustGroupMap);
			}
			resultMap.put("waitCreateCallTaskMarketCaseList", waitCreateCallTaskMarketCaseList);
		}	
		return resultMap;
	}

	/**
	 * 添加shell进程执行信息表中外呼任务
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
	@Override
	public void addShellProcessExecuteCallTask(List<Map<String, Object>> tempInparamList) throws StrategyError {
		for(Map<String, Object>  baseInfo:tempInparamList){
			Map<String, Object> tempInParam = new HashMap<String, Object>();
			tempInParam.put("serialId", SequenceUtil.getSequence());
			tempInParam.put("busiId", baseInfo.get("marketCaseId"));
			tempInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE);
			tempInParam.put("processNo", Const.SHELLPROCESS_NO_WAITCREATECALLTASK);
			tempInParam.put("processName", Const.SHELLPROCESS_NAME_WAITCREATECALLTASK);
			tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_EXE);
			String dataBaseTime = commonSelector.selectDataBaseSysTime();
			tempInParam.put("updateTime", DateUtil.string2Timestamp(dataBaseTime, DateUtil.TIME_FROMAT_SIMPLE3));
			systemDealInsertor.insertShellProcessExecuteInfo(tempInParam);
		}
	}
	
}
