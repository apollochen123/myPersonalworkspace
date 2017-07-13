package com.sitech.strategy.recommend.entity.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.assemblyservicestructure.IAssemblyServiceStructure;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.recommend.base.BaseRecommendEntity;
import com.sitech.strategy.recommend.entity.inter.IManageRecommendEntity;

/**
 * 管理实体
* @date: 2016-10-15 
* @author: yangwl
* @title: ManageRecommendEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ManageRecommendEntity extends BaseRecommendEntity implements IManageRecommendEntity{
	
	/**
	 * 报文组装对象
	 */
	protected IAssemblyServiceStructure assemblyServiceStructure;
	/**
	 * 营销案信息查询
	 */
	protected IDataSelector.ITaskSelector taskSelector;
	
	/** 
	* @date: 2017-2-8 
	* @author: wangpei
	* @title: setAssemblyServiceStructure 
	* @param assemblyServiceStructure 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setAssemblyServiceStructure(
			IAssemblyServiceStructure assemblyServiceStructure) {
		this.assemblyServiceStructure = assemblyServiceStructure;
	}

	/**
	 * 
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: setTaskSelector 
	* @param taskSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTaskSelector(IDataSelector.ITaskSelector taskSelector) {
		this.taskSelector = taskSelector;
	}
	
	/**
	 * 查询客户群列表
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: queryCustList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryCustList(Map<String, Object> inParam)
			throws StrategyError {
		Map<String, Object> marketCaseMap = new HashMap<String, Object>();
		
		List<Map<String, Object>> positionList = (List<Map<String, Object>>)inParam.get("positionList");
		for(Map<String, Object> positionMap:positionList){
			marketCaseMap.put((String)positionMap.get("positionId"), taskSelector.selectCustListFromChannelTask(inParam,positionMap));
		}
		Map<String, Object> outParam = assemblyServiceStructure.toPacketCustListFromChannelTask(marketCaseMap);
		
		return outParam;
	}
	
	/**
	 * 查询营销案列表
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: queryMarketCaseList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseList(Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> marketCaseMap = new HashMap<String, Object>();
		
		List<Map<String, Object>> positionList = (List<Map<String, Object>>)inParam.get("positionList");
		for(Map<String, Object> positionMap:positionList){
			marketCaseMap.put((String)positionMap.get("positionId"), taskSelector.selectMarketCaseListFromChannelTask(inParam,positionMap));
		}
		
		Map<String, Object> outParam = assemblyServiceStructure.toPacketMarketCaseListFromChannelTask(marketCaseMap);
		
		return outParam;
	}

	/**
	 * 查询任务列表
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: queryTaskList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryTaskList(Map<String, Object> inParam)
			throws StrategyError {
		Map<String, Object> marketCaseMap = new HashMap<String, Object>();
		List<Map<String, Object>> positionList = (List<Map<String, Object>>)inParam.get("positionList");
		for(Map<String, Object> positionMap:positionList){
			marketCaseMap.put((String)positionMap.get("positionId"), taskSelector.selecTaskListFromChannelTask(inParam,positionMap));
		}
		Map<String, Object> outParam = assemblyServiceStructure.toPacketTaskListFromChannelTask(marketCaseMap);
		
		return outParam;
	}

}
