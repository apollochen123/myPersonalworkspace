package com.sitech.strategy.core.objectville.inter;

import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 工作台对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: IWorkBench 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IWorkBench {

	/**
	 *查询营销案审批数量 
	* @date: 2016-11-4 
	* @author: mengxi
	* @title: queryMarketCaseAuditNum 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> selectMarketCaseAuditNum(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 查询营销案数量
	* @date: 2016-11-8 
	* @author: mengxi
	* @title: selectMarketCaseNum 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> selectMarketCaseNum(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 查询公告
	* @date: 2017-2-28 
	* @author: yexr
	* @title: selectNoticeList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> selectNoticeList(Map<String, Object> inParam,IQueryFilter queryFilter,int start,int limit) throws StrategyError;
	
	/**
	 * 新增公告
	* @date: 2017-3-1 
	* @author: yexr
	* @title: insertNotice 
	* @param inParam
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void insertNotice(Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError;
	
	/**
	 * 删除公告
	* @date: 2017-3-1 
	* @author: yexr
	* @title: removeNotice 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeNotice(Map<String, Object> inParam) throws StrategyError;
	
	
	 /**
	  * 修改公告
	 * @date: 2017-3-1 
	 * @author: yexr
	 * @title: updateNotice 
	 * @param inParam
	 * @throws StrategyError 
	 * @exception: 
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note:
	  */
	public void updateNotice(Map<String, Object> inParam) throws StrategyError;
}
