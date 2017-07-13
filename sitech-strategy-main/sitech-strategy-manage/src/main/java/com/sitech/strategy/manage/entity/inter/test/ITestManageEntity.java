package com.sitech.strategy.manage.entity.inter.test;

import java.util.Map;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 测试实体
* @date: 2016-9-5 
* @author: tangaq
* @title: ITestManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ITestManageEntity {
	/**
	 * 测试方法
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: testManageEntity 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void testManageEntity(Map<String,Object> inParam) throws StrategyError;
}
