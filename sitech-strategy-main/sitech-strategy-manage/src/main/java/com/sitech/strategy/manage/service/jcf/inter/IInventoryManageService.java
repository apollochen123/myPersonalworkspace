package com.sitech.strategy.manage.service.jcf.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 清单服务
* @date: 2017-1-12 
* @author: zhangjj_crmpd
* @title: IInventoryManageService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IInventoryManageService {
	
	/**
	 * 分页查询清单列表
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: queryInventoryListByPage 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryInventoryListByPage(InDTO inDTO); 
	
	/**
	 * 保存清单信息
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: saveInventoryInfo 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveInventoryInfo(InDTO inDTO); 
	
	
	
}
