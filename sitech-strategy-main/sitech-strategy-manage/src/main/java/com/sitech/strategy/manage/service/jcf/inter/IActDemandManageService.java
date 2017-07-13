package com.sitech.strategy.manage.service.jcf.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 活动需求对象
* @date: 2016-10-20 
* @author: wangth
* @Title: IActDemandManageService 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IActDemandManageService {
	
	/**
	 * 查询活动需求列表
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: queryActDemandList 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryActDemandList(InDTO inDTO);
	
	/**
	 * 查询活动需求详细信息
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: queryActDemandDetail 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryActDemandDetail(InDTO inDTO);
	
	/**
	 * 移除活动需求
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: removeActDemand 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO removeActDemand(InDTO inDTO);
	
	/**
	 * 保存活动需求
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: saveActDemand 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveActDemand(InDTO inDTO);
	
	/**
	 * 更新活动需求
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: updateActDemand 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateActDemand(InDTO inDTO);
}
