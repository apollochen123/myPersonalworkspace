package com.sitech.strategy.event.entity.impl;

import java.io.Serializable;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IEventParse;
import com.sitech.strategy.event.base.BaseEventEntity;
import com.sitech.strategy.event.entity.inter.IGroupMsgEventEntity;

/**
 * Create on 2017-1-20
 * @author: wangpei
 * @Title:GroupMsgEventEntity
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class GroupMsgEventEntity extends BaseEventEntity implements IGroupMsgEventEntity,Serializable{
	protected IEventParse eventParse;
	
	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: setEventParse 
	* @param eventParse 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setEventParse(IEventParse eventParse) {
		this.eventParse = eventParse;
	}

    /**
     * 接收宽带密码服务消息
    * @date: 2017-3-10 
    * @author: tangaq
    * @title: receiveBraodbandPasswordSerivce 
    * @param inParam
    * @throws StrategyError 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	@Override
	public void receiveBraodbandPasswordSerivce(Map<String, Object> inParam)
			throws StrategyError {
		eventParse.paraseBroadbandPasswordService(inParam);
		
	}

	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: receiveGroupMsgEvent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void receiveGroupMsgEvent(Map<String, Object> inParam)throws StrategyError {
		eventParse.parseGroupMsgEvent(inParam);
	}

}
