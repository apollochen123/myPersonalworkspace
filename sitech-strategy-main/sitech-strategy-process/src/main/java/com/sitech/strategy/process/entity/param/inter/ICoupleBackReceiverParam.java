package com.sitech.strategy.process.entity.param.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 反馈接收参数处理
* @date: 2016-11-26 
* @author: sunliang 
* @title: ICoupleBackReceiverParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ICoupleBackReceiverParam {
	
	/**
	 * 接收反馈消息入参处理
	* @date: 2016-11-26 
	* @author: sunliang 
	* @title: receiveCoupleBackInParam 
	* @param o
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> receiveCoupleBackInParam(Object o) throws StrategyError;

	
/**
 * 接收受理消息入参处理
* @date: 2017-2-14 
* @author: yexr
* @title: receiveAcceptCoupleBackInParam 
* @param inParam
* @return
* @throws StrategyError 
* @exception: 
* @version: 1.0 
* @description: 
* update_version: update_date: update_author: update_note:
 */
   public Map<String,Object> receiveAcceptCoupleBackInParam(Object inParam)throws StrategyError;
   
   /**
    * 接收资费反馈入参处理
   * @date: 2017-4-6 
   * @author: zhangyw_crmpd
   * @title: receivePostageOrderInParam 
   * @param inParam
   * @return
   * @throws StrategyError 
   * @exception: 
   * @version: 1.0 
   * @description: 
   * update_version: update_date: update_author: update_note:
    */
   public Map<String,Object> receivePostageOrderInParam(Object inParam)throws StrategyError;
}
