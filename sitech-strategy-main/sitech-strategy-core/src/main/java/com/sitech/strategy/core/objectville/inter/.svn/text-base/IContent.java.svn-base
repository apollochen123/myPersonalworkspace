package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 内容对象
* @date: 2016-9-5 
* @author: yangwl
* @title: IContent 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IContent {
	
	/** 保存运营位内容
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: addContentInfoByPosition 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String, Object> addContentInfoByPosition(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 保存事件或渠道下的运营位信息
	* @date: 2017-2-23 
	* @author: zhangyw_crmpd
	* @title: addContentInfoForEventOrChannl 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> addContentInfoForEventOrChannel(Map<String, Object> inParam) throws StrategyError;

	/**
	 * 添加内容信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addContentInfo 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addContentInfo(Map<String, Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 添加内容详细信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addContentDetail 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addContentDetail(Map<String, Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 解析缴费事件ID和内容明细
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: parsePayFeeEventIdAndMarketCaseIdReAndContentDetail 
	* @param payFeeEventIdAndMarketCaseIdRelAndEventDetail
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> parsePayFeeEventIdAndMarketCaseIdReAndContentDetail(List<Map<String,Object>> payFeeEventIdAndMarketCaseIdRelAndEventDetail) throws StrategyError;
	
	/**
	 *  查询内容信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryContentById 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryContentById(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 查询内容详细信息
	* @date: 2016-9-15 
	* @author: wangth
	* @Title: queryContentDetail 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> queryContentDetail(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 查询内容详细信息Id
	* @date: 2016-10-7 
	* @author: wangth
	* @Title: queryContentDetailId 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> queryContentDetailId(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;

	/**
	 * 查询产品列表
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryProdList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryProdList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 移除内容信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: removeContentById 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeContentById(Map<String,Object> inParam) throws StrategyError;
	
	/** 删除运营位及内容
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: removePositionAndContent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void removePositionAndContent(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 更新内容信息 
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: updateContentById 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateContentById(Map<String,Object> inParam) throws StrategyError;
	
	
}
