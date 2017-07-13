package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IPosition;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 运营位对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: Position 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class Position extends BaseClass implements IPosition, Serializable {
	/**
	 * 运营位插入对象
	 */
	protected IDataInsertor.IPositionInsertor positionInsertor;
	/**
	 * 运营位删除对象
	 */
	protected IDataDeleter.IPositionDeleter positionDeleter;
	/**
	 * 运营位修改对象
	 */
	protected IDataUpdater.IPositionUpdater positionUpdater;
	/**
	 * 运营位查询对象
	 */
	protected IDataSelector.IPositionSelector positionSelector;
	/**
	 * 查询内部类对象
	 */
	protected QueryParamSettle queryParamSettle = new QueryParamSettle();
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setPositionInsertor 
	* @param positionInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPositionInsertor(IDataInsertor.IPositionInsertor positionInsertor) {
		this.positionInsertor = positionInsertor;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setPositionDeleter 
	* @param positionDeleter 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPositionDeleter(IDataDeleter.IPositionDeleter positionDeleter) {
		this.positionDeleter = positionDeleter;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setPositionUpdater 
	* @param positionUpdater 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPositionUpdater(IDataUpdater.IPositionUpdater positionUpdater) {
		this.positionUpdater = positionUpdater;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setPositionSelector 
	* @param positionSelector 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPositionSelector(IDataSelector.IPositionSelector positionSelector) {
		this.positionSelector = positionSelector;
	}
	
	/**
	 * 添加运营位信息
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: addPositionInfo 
	* @param inParam
	* @param tempInParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addPositionInfo(Map<String, Object> inParam) throws StrategyError{
		positionInsertor.insertPositionInfo(inParam);
	}
	
	/**
	 * 获取营销案下的运营位信息
	* @date: 2017-2-21 
	* @author: sunliang 
	* @title: getPositionInfoForMarketCase 
	* @param marketCaseCachePojo
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> getPositionInfoForMarketCase(
			IMarketCaseCachePojo marketCaseCachePojo) throws StrategyError {
		List<String> positionIdList = (List<String>)marketCaseCachePojo.getPositionMap().get(Const.COMPONENT_TYPE_POSITION);
		List<Map<String,Object>> positionMapList = new ArrayList<Map<String,Object>>();
		
		for(String positionId : positionIdList){
			Map<String,Object> positionMap = new HashMap<String,Object>();
			positionMap.put("positionId", positionId);
			positionMapList.add(positionMap);
		}
		
		return positionMapList;
	}
	
	/**
	 * 运营位id校验
	* @date: 2016-9-26 
	* @author: zhaoyue
	* @title: isPositionId 
	* @param inParam
	* @param positionId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public boolean isPositionId(Map<String, Object> inParam,
			Set<String> positionIdSet) {
		for(String positionId: positionIdSet){
			List<Map<String, Object>> positionIdList = (List<Map<String, Object>>)inParam.get("positionIdList");
			for(Map<String, Object> Id:positionIdList){
				if(Id.get("positionId").equals(positionId)){
					return true;
				}
			}	
		}
		return false;
	}
	
	/**
	 * 查询运营位内容信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryPositionById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Deprecated
	@Override
	public Map<String,Object> queryPositionById(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		//查询运营位基本信息
		List<Map<String, Object>> list = positionSelector.selectPositionInfo(inParam,queryFilter);
		if(!CommonUtils.objectIsNull(list)){
			Map<String,Object> positionMap = ((List<Map<String, Object>>)positionSelector.selectPositionInfo(inParam,queryFilter)).get(0);
			return positionMap;
		}
		return new HashMap<String,Object>();
	}
	
	/**
	 * 查询运营位内容信息(新)
	* @date: 2017-3-17 
	* @author: sunyuan
	* @title: queryPositionById 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryPositionById(Map<String,Object> tempInParam)throws StrategyError {
		List<Map<String, Object>> list = positionSelector.selectPositionInfo(tempInParam);
		if(!CommonUtils.objectIsNull(list)){
			Map<String,Object> positionInfoMap = list.get(0);
			return positionInfoMap;
		}
		return new HashMap<String,Object>();
	}
	
	/**
	 * 查询运营位列表
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: queryPositionList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryPositionList(Map<String, Object> inParam,
			IQueryFilter queryFilter) throws StrategyError {
		queryParamSettle.settleQueryPositionListParam(inParam,queryFilter);
		List<Map<String,Object>> positionList = positionSelector.selectPositionInfo(inParam, queryFilter);
		return positionList;
	}
	
	/**
	 * 移除运营位容信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: removePositionById 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removePositionById(Map<String,Object> inParam) throws StrategyError {
		positionDeleter.deletePositionInfo(inParam);
	}
	
	/**
	 * 更新运营位内容信息 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: updatePositionById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updatePositionById(Map<String,Object> inParam) throws StrategyError {
		positionUpdater.updatePositionInfo(inParam);
	}
	
	/**
	 * 查询参数整理
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: QueryParamSettle 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	protected class QueryParamSettle implements Serializable{
		/**
		 * 处理，查询客户群列表参数
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: settleQueryshortMessageAccessCodeListParam 
		* @param inParam
		* @param queryFilter 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@SuppressWarnings("unchecked")
		protected void settleQueryPositionListParam(Map<String,Object> inParam,IQueryFilter queryFilter){
			queryFilter.setPositionId((String)inParam.get("positionId"));
			List<String> keyWords = ((List<String>)inParam.get("keyWords"));
			queryFilter.setKeyWords(keyWords);
		}
	}

}
