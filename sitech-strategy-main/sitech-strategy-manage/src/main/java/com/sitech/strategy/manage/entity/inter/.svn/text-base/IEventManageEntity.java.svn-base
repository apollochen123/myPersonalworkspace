package com.sitech.strategy.manage.entity.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;

/**
 * 事件实体
* @date: 2016-9-5 
* @author: tangaq
* @title: IEventManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IEventManageEntity {
	
	/**
	 * 保存事件明细信息
	* @date: 2017-2-12 
	* @author:liuqi
	* @title: saveEventDetailInfo 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	Map<String, Object> saveEventDetailInfo(Map<String, Object> inParam) throws StrategyError;

	/**
	 * 删除事件关系，缴费事件删除事件详情和事件表
	* @date: 2017-3-30 
	* @author: chenhao
	* @title: removeMarketCaseEventRelAndDetailByRelId 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	void removeMarketCaseEventRelAndDetailByRelId(Map<String, Object> inParam) throws StrategyError;
	
}
