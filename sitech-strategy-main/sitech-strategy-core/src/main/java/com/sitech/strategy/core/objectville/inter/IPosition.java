package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 运营位对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: IPosition 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IPosition {
	
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
	public void addPositionInfo(Map<String, Object> inParam) throws StrategyError;
	
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
	public List<Map<String,Object>> getPositionInfoForMarketCase(IMarketCaseCachePojo marketCaseCachePojo) throws StrategyError;
	
	/**
	 * 运营位id校验
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @Title: isPositionId 
	* @param inParam
	* @param positionId
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean isPositionId(Map<String,Object> inParam,Set<String> positionId);
	
	/**
	 *  查询运营位信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryPositionById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryPositionById(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
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
	public List<Map<String, Object>> queryPositionList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 移除运营位信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: removePositionById 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removePositionById(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 *  更新运营位信息 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: updatePositionById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updatePositionById(Map<String,Object> inParam) throws StrategyError;
	
}
