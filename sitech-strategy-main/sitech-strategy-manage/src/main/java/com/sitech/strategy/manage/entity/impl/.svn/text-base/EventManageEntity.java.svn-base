package com.sitech.strategy.manage.entity.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IEvent;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IEventManageEntity;

/**
 * 事件实体
* @date: 2016-9-5 
* @author: tangaq
* @title: EventManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class EventManageEntity extends BaseManageEntity implements IEventManageEntity {
	
	/**
	 * 事件配置对象
	 */
	protected IEvent event;
	
	/**
	 * 
	* @date: 2017-2-14 
	* @author:liuqi
	* @title: getEvent 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IEvent getEvent() {
		return event;
	}

	/**
	 * 
	* @date: 2017-2-14 
	* @author:liuqi
	* @title: setEvent 
	* @param event 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEvent(IEvent event) {
		this.event = event;
	}

	/**
	 *  保存事件明细信息
	* @date: 2017-2-12 
	* @author: liuqi
	* @title: saveEventDetailInfo
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveEventDetailInfo(Map<String, Object> inParam) throws StrategyError {
		
		return  event.addEventDetailInfo(inParam);
	}
	
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
	@Override
	public void removeMarketCaseEventRelAndDetailByRelId(Map<String, Object> inParam) throws StrategyError{
		event.romoveMarketCaseEventRelAndDetailByRelId(inParam);
	}
}
