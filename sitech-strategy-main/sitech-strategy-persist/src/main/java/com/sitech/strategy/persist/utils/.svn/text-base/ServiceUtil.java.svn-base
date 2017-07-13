package com.sitech.strategy.persist.utils;

import com.sitech.strategy.common.utils.SvcConst;
import com.sitech.strategy.persist.base.BaseClass;

/**
 * 服务调用工具类
* @date: 2016-9-11 
* @author: sunliang 
* @title: ServiceUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ServiceUtil extends BaseClass{
	
	/**
	 * 服务调用方法
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: callService 
	* @param serName
	* @param serParam
	* @param serType
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String callService(String serName,String serParam,String serType){
		String result = null;
		if(SvcConst.SERVICE_TYPE_REST.equals(serType)){
			HttpUtil.setCharset(SvcConst.CALL_SERVICE_CODE);
			result = HttpUtil.invoke(serName, serParam);
		} else if(SvcConst.SERVICE_TYPE_HSF.equals(serType)) {
			result = com.sitech.jcfx.service.client.ServiceUtil.callService(serName, serParam);
		} else if(SvcConst.SERVICE_TYPE_WS.equals(serType)) {
			
		}
		return result;
	}
	
	/**
	 * 默认为restful方式的服务调用方法
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: callService 
	* @param serName
	* @param serParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String callService(String serName,String serParam){
		return callService(serName,serParam,SvcConst.DEFAULT_SERVICE_TYPE);
	}
}
