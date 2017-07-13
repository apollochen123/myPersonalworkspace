package com.sitech.strategy.event.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * Create on 2017-1-20
 * @author: wangpei
 * @Title:GroupMsgEventEntity
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public interface IGroupMsgEventEntity {
	
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
	public void receiveBraodbandPasswordSerivce(Map<String,Object> inParam) throws StrategyError;
	
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
	public void receiveGroupMsgEvent(Map<String,Object> inParam) throws StrategyError;

}
