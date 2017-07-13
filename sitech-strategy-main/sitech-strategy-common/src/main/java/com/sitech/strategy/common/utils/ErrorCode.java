package com.sitech.strategy.common.utils;

/**
 * 错误码
* @date: 2016-9-5 
* @author: sunliang 
* @title: ErrorCode 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public final class ErrorCode {

	/*
	 * 业务提示，范围10011115000000000-10011115000099999
	 */
	public static final String ERROR_CODE_00000 = new String("10011115000000000");
	public static final String ERROR_MSG_00000 = new String("测试");
	public static final String ERROR_DETAIL_MSG_00000 = new String("测试");
	
	public static final String ERROR_CODE_00001 = new String("10011115000000001");
	public static final String ERROR_MSG_00001 = new String("SEQ_ID不存在，此节点必填");
	public static final String ERROR_DETAIL_MSG_00001 = new String("SEQ_ID不存在，此节点必填");
	
	public static final String ERROR_CODE_00002 = new String("10011115000000002");
	public static final String ERROR_MSG_00002 = new String("该事件已被保存");
	public static final String ERROR_DETAIL_MSG_00002= new String("该事件已被保存");
	
	/*
	 * 系统级错误，范围10010115000000000-10010115000019999，系统无法处理的错误，前台返回错误。
	 */
	
	
	/*
	 * 系统级异常，范围10010115000020000-10010115000049999，系统可以处理的异常，前台不返回异常。
	 */
	
	
	/*
	 * 持久化层错误，范围10010115000050000-10010115000069999，系统无法处理错误，前台返回错误。
	 */
	
	
	/*
	 * 持久化层异常，范围10010115000070000-10010115000099999，系统可以处理异常，前台不返回异常。
	 */
}
