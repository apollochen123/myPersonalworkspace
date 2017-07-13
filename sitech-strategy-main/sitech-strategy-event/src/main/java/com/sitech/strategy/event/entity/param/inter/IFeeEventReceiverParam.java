package com.sitech.strategy.event.entity.param.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;

/**费用类事件参数处理
 * Create on 2017-1-22
 * @author: wangpei
 * @Title:IFeeEventReceiverParam
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public interface IFeeEventReceiverParam {

	/**
	 * 接收缴费事件参数处理
	* @date: 2017-2-10 
	* @author: sunyuan
	* @title: receiveFeeMsgEventParam 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> receiveFeeEventInParam(Object inParam);
}
