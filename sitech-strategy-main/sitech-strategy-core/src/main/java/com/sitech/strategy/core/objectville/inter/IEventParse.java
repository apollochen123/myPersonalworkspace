package com.sitech.strategy.core.objectville.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * Create on 2017-1-20
 * @author: wangpei
 * @Title:IEventParse
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public interface IEventParse {
	
	/**
	 * 解析宽带密码服务
	* @date: 2017-3-10 
	* @author: tangaq
	* @title: paraseBroadbandPasswordService 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void paraseBroadbandPasswordService(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 业务受理事件
	* @date: 2017-2-16 
	* @author: sunyuan
	* @title: parseBusiEvent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void parseBusiEvent(Map<String,Object> inParam)throws StrategyError;
	
	/**
	 * 流量事件
	* @date: 2017-2-16 
	* @author: sunyuan
	* @title: parseFlowEvent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void parseFlowEvent(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 缴费事件
	* @date: 2017-2-10 
	* @author: sunyuan
	* @title: parseFeeEvent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void parsePayFeeEvent(Map<String, Object> inParam) throws StrategyError;
	
	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: parseGroupMsgEvent 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void parseGroupMsgEvent(Map<String, Object> inParam)throws StrategyError;
	
	/** 产品订购事件
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: parseProdOrderEvent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void parseProdOrderEvent(Map<String, Object> inParam) throws StrategyError;
}
