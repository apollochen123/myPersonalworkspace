package com.sitech.strategy.manage.entity.param.inter;

import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;

/**
 * 
* @date: 2016-9-27 
* @author: zhangjj_crmpd
* @title: IProductCommodityManageParam
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IProductCommodityManageParam {

	/**
	 * 
	* @date: 2016-9-27 
	* @author: zhangjj_crmpd
	* @title: productCommodityListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	Map<String, Object> productCommodityListInParam(InDTO inDTO);

	/**
	 * 
	* @date: 2016-9-27 
	* @author: zhangjj_crmpd
	* @title: productCommodityListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	StandardOutDTO productCommodityListOutParam(Map<String, Object> outParam);

}
