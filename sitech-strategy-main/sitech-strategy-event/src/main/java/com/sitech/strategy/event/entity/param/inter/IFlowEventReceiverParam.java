package com.sitech.strategy.event.entity.param.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;

/**流量类事件参数处理
 * Create on 2017-1-22
 * @author: wangpei
 * @Title:IFlowEventReceiverParam
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public interface IFlowEventReceiverParam {
	/**
	 * 接收流量类事件入参
	* @date: 2017-2-16 
	* @author: sunyuan
	* @title: receiveFlowEventInParam 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> receiveFlowEventInParam(Object inParam);
}
