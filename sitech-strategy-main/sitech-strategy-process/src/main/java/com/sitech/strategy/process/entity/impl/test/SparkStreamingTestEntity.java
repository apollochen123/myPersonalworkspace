package com.sitech.strategy.process.entity.impl.test;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.inter.test.ISparkStreamingTestEntity;

/**
 * SparkStreaming测试实体
* @date: 2016-11-21 
* @author: sunliang 
* @title: SparkStreamingTestEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class SparkStreamingTestEntity extends BaseProcessEntity implements
		ISparkStreamingTestEntity, Serializable {
	
	/**
	 * 测试插入数据操作
	 */
	protected IDataInsertor.ITestHbaseInsertor testHbaseInsertor;

	/**
	 * 
	* @date: 2016-11-25 
	* @author: sunliang 
	* @title: setTestHbaseInsertor 
	* @param testHbaseInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTestHbaseInsertor(
			IDataInsertor.ITestHbaseInsertor testHbaseInsertor) {
		this.testHbaseInsertor = testHbaseInsertor;
	}

	/**
	 * 测试
	* @date: 2016-11-21 
	* @author: sunliang 
	* @title: receiveCoupleBack 
	* @param object
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void testSparkStreaming(Object object) throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put(Const.NOSQL_ROWKEY, (String)object);
		tempInParam.put("test1", (String)object);
		tempInParam.put("test2", (String)object);
		
		testHbaseInsertor.testHbaseInsert(tempInParam);
	}

	/**
	 * 测试
	* @date: 2016-11-30 
	* @author: sunliang 
	* @title: testSparkSQL 
	* @param str
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void testSparkSQL(String str) throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put(Const.NOSQL_ROWKEY, str);
		tempInParam.put("test1", str);
		tempInParam.put("test2", str);
		
		testHbaseInsertor.testHbaseInsert(tempInParam);
	}
	

}
