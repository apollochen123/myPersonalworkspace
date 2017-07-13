package com.sitech.strategy.common.base;

import java.io.Serializable;

import com.sitech.strategy.common.utils.LogSlf4jUtil;
import com.sitech.strategy.common.utils.LogUtil;

/**
 * 通用工具基类
* @date: 2016-9-5 
* @author: sunliang 
* @title: BaseClass 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class BaseClass{
	
	/**
	 * 日志工具对象
	 */
	protected LogUtil log = new LogUtil(this.getClass());
	
	//protected LogSlf4jUtil log = new LogSlf4jUtil(this.getClass());

}
