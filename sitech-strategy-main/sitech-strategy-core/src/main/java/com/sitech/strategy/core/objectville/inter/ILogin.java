package com.sitech.strategy.core.objectville.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 登录对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: ILogin 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface ILogin {
	
	/** 获取工号登录信息
	* @date: 2016-10-27 
	* @author: wangpei
	* @title: getLoginMsg 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> getLoginMsg( Map<String,Object> inParam) throws StrategyError;

}
