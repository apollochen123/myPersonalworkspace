package com.sitech.strategy.manage.entity.param.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;

/**
 * 清单参数处理
* @date: 2017-1-12 
* @author: zhangjj_crmpd
* @title: InventoryManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IInventoryManageParam {

	/**
	 * 查询清单列表入参处理
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: queryInventoryListByPageInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	Map<String, Object> queryInventoryListByPageInParam(InDTO inDTO);
	
	
	/**
	 * 查询清单列表出参处理
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: queryInventoryListByPageOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	StandardOutDTO queryInventoryListByPageOutParam(Map<String, Object> outParam);
	
	/**
	 * 保存清单入参参数处理
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: saveInventoryInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	Map<String, Object> saveInventoryInParam(InDTO inDTO);
	
	/**
	 * 保存清单出参参数处理
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: saveInventoryInfoOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	StandardOutDTO saveInventoryInfoOutParam(Map<String, Object> outParam);

}
