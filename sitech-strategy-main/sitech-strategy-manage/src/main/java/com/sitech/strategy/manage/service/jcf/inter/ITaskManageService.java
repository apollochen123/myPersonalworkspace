package com.sitech.strategy.manage.service.jcf.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 任务
* @date: 2016-12-14 
* @author: zhangjj_crmpd
* @title: ITaskManageService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ITaskManageService {
	
	/**
	 * 查询营业部概况
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: queryDepartmentTaskSurvey 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryDepartmentTaskSurvey(InDTO inDTO);
	
	/**
	 * 查询渠道任务
	* @date: 2016-12-14 
	* @author: zhangjj_crmpd
	* @title: queryChannelTask 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryChannelTask(InDTO inDTO); 
	
	/**
	 * 查询调配任务
	* @date: 2017-1-9 
	* @author: zhangjj_crmpd
	* @title: queryTaskAdjustList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryTaskAdjustList(InDTO inDTO); 
	
	/**
	 * 保存调配信息
	* @date: 2016-12-19 
	* @author: zhangjj_crmpd
	* @title: saveTaskAdjust 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveTaskAdjust(InDTO inDTO); 
	
	
	
}
