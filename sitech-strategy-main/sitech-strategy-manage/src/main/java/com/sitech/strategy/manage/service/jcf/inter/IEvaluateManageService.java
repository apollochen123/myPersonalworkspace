package com.sitech.strategy.manage.service.jcf.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 评估(查询、报表)
* @date: 2016-9-5 
* @author: sunliang
* @title: IEvaluateManageService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IEvaluateManageService {
	
	/**
	 * 查询区域市场空间数据
	* @date: 2016-11-9 
	* @author: fangyuan_crmpd
	* @title: queryAreaMarketSpaceData
	* @param inDTO 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryAreaMarketSpaceData(InDTO inDTO);
	
	/**
	 * 查询营销案客户关系列表
	* @date: 2016-10-17 
	* @author: fangyuan_crmpd
	* @title: queryMarketCaseRelCustList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMarketCaseRelCustList(InDTO inDTO);
	
	/** 
	 * 营销案push任务统计
	* @date: 2016-10-29 
	* @author: songxj
	* @title: queryPushTaskStatistics 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public OutDTO queryPushTaskStatistics(InDTO inDTO);
	
	/**
	 *查询报表列表 
	* @date: 2016-11-21 
	* @author: xiongxq
	* @Title: queryReportFormList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryReportFormList(InDTO inDTO);
	
	/**
	 * 查询营销案报表统计
	* @date: 2017-4-17 
	* @author: yuanchun
	* @title: queryReportFormStatistics 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryReportFormStatistics(InDTO inDTO);
	
	/**
	 * 查询用户接触视图列表
	* @date: 2016-11-9 
	* @author: fangyuan_crmpd
	* @title: queryUserTouchViewList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryUserTouchViewList(InDTO inDTO);
	
	/**
	 * 查询用户回单反馈列表
	* @date: 2017-1-9 
	* @author:liuqi
	* @title: queryUserReceiptRecordList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryUserReceiptRecordList(InDTO inDTO);
	
}
