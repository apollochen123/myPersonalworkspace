package com.sitech.strategy.manage.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 评估(查询、报表)实体
* @date: 2016-9-5 
* @author: tangaq
* @title: IEvaluateManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IEvaluateManageEntity {
	
	/**
	 * 查询区域市场空间数据
	* @date: 2016-11-9 
	* @author: fangyuan_crmpd
	* @title: queryAreaMarketSpaceData 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryAreaMarketSpaceData(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询营销案客户关系列表
	* @date: 2016-10-17 
	* @author: fangyuan_crmpd
	* @title: queryMarketCaseRelCustList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseRelCustList(Map<String,Object> inParam) throws StrategyError;
	
	/** 
	 * 营销案push任务统计查询
	* @date: 2016-10-29 
	* @author: songxj
	* @title: queryPushTaskStatistics 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> queryPushTaskStatistics(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 *查询报表列表 
	* @date: 2016-11-21 
	* @author: xiongxq
	* @Title: queryReportFormList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryReportFormList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询营销案报表统计
	* @date: 2017-4-17 
	* @author: yuanchun
	* @title: queryReportFormStatistics 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryReportFormStatistics(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 查询用户回单反馈列表
	* @date: 2017-1-9 
	* @author:liuqi
	* @title: queryUserReceiptRecordListList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryUserReceiptRecordList(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 查询用户接触视图列表
	* @date: 2017-1-8 
	* @author:liuqi
	* @title: queryUserTouchViewList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryUserTouchViewList(Map<String,Object> inParam) throws StrategyError;

}
