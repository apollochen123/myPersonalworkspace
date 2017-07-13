package com.sitech.strategy.manage.entity.param.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;

/**
 * 事件参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: IEventManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IEventManageParam {
	
	/**
	 * 增加事件明细信息入参
	* @date: 2017-2-14 
	* @author:liuqi
	* @title: saveEventDetailInfoInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> saveEventDetailInfoInParam(InDTO inDTO);
	
	/**
	 * 增加事件明细信息出参
	* @date: 2017-2-14 
	* @author:liuqi
	* @title: saveEventDetailInfoOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveEventDetailInfoOutParam(Map<String, Object> outParam);

	/**
	 *  删除事件关系，缴费事件删除事件详情和事件表入参
	* @date: 2017-3-30 
	* @author: chenhao
	* @title: removeMarketCaseEventRelAndDetailByRelIdInParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> removeMarketCaseEventRelAndDetailByRelIdInParam(
			InDTO inDTO);
	/**
	 *  删除事件关系，缴费事件删除事件详情和事件表出参
	* @date: 2017-3-30 
	* @author: chenhao
	* @title: removeMarketCaseEventRelAndDetailByRelIdOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeMarketCaseEventRelAndDetailByRelIdOutParam();


}
