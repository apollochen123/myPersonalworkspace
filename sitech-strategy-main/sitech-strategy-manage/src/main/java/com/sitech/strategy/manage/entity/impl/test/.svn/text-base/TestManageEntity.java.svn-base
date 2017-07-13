package com.sitech.strategy.manage.entity.impl.test;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.test.ITestManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;

/**
 * 测试实体
* @date: 2016-9-5 
* @author: tangaq
* @title: TestManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class TestManageEntity extends BaseManageEntity implements ITestManageEntity{
	/**
	 * 测试对象
	 */
	protected IDataInsertor.ITestInsertor testInsertor;
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: setTestInsertor 
	* @param testInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTestInsertor(IDataInsertor.ITestInsertor testInsertor) {
		this.testInsertor = testInsertor;
	}
	
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
	@Override
	public void testManageEntity(Map<String,Object> inParam) throws StrategyError{
		testInsertor.testInsert(inParam);
	}
		
}

