package com.sitech.strategy.common.utils;

import com.sitech.jcf.core.exception.BusiException;

/**
 * 错误异常处理类
* @date: 2016-9-5 
* @author: sunliang 
* @title: StrategyError 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class StrategyError extends Exception{
	
	private static final long serialVersionUID = -8160457352412395111L;
	/**
	 * 错误码
	 */
	protected String returnCode;
	/**
	 * 错误信息
	 */
	protected String returnMsg;
	/**
	 * 错误详细信息
	 */
	protected String returnDetailMsg;
	/**
	 * 异常对象
	 */
	protected Exception exception;
	/**
	 * 日志工具对象
	 */
	protected LogUtil logUtil = new LogUtil("ERROR");
	
	/**
	 * 构造方法
	* @date: 2016-9-5 
	* @author: sunliang 
	* @param exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StrategyError(Exception exception){
		this.exception = exception;
	}
	
	/**
	 * 构造方法
	* @date: 2016-9-5 
	* @author: sunliang 
	* @param returnCode
	* @param returnMsg
	* @param returnDetailMsg 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StrategyError(String returnCode,String returnMsg,String returnDetailMsg){
		this.returnCode = returnCode;
		this.returnMsg = returnMsg;
		this.returnDetailMsg = returnDetailMsg;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setException 
	* @param exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setException(Exception exception) {
		this.exception = exception;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getException 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Exception getException() {
		return exception;
	}
	
	/**
	 * 将异常通过jcf框架抛出
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: processExcepByJCF  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void processExcepByJCF(){
		throw new BusiException(returnCode,returnMsg,returnDetailMsg);
	}
	
	/**
	 * 将异常记录到错误日志文件
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: processExcepByLog  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void processExcepByLog(){
		logUtil.getLog().error("returnCode=" + returnCode + ";" + "returnMsg=" + returnMsg + ";" + "returnDetailMsg=" + returnDetailMsg + ";");
	}
	
}
