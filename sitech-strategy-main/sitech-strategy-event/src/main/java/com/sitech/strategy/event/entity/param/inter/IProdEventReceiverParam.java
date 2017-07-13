package com.sitech.strategy.event.entity.param.inter;

import java.util.Map;

/** 
 * 产品事件接收参数处理
* @date: 2016-11-29 
* @author: songxj
* @title: IProdEventReceiverParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note: 
*/
public interface IProdEventReceiverParam {

	/** 
	 * 产品订购事件参数处理
	* @date: 2016-11-29 
	* @author: songxj
	* @title: receiveProdOrderEventInParam 
	* @param o
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> receiveProdOrderEventInParam(Object o);
}
