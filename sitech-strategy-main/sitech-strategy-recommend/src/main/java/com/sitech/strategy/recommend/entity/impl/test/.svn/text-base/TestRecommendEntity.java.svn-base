package com.sitech.strategy.recommend.entity.impl.test;

import java.util.Map;

import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.recommend.base.BaseRecommendService;
import com.sitech.strategy.recommend.entity.inter.test.ITestRecommendEntity;

/**
 * 测试实体
* @date: 2016-11-20 
* @author: sunliang 
* @title: TestRecommendEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class TestRecommendEntity extends BaseRecommendService implements
		ITestRecommendEntity {

	/**
	 * 测试插入对象
	 */
	protected IDataInsertor.ITestInsertor testInsertor;
	/**
	 * 测试查询对象
	 */
	protected IDataSelector.ITestSelector testSelector;
	
	/**
	 * 
	* @date: 2016-11-20 
	* @author: sunliang 
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
	 * 
	* @date: 2016-11-21 
	* @author: sunliang 
	* @title: setTestSelector 
	* @param testSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTestSelector(IDataSelector.ITestSelector testSelector) {
		this.testSelector = testSelector;
	}

	/**
	 * 测试方法
	* @date: 2016-11-20 
	* @author: sunliang 
	* @title: testRecommendEntity 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void testRecommendEntity(Map<String, Object> tempInParam)
			throws StrategyError {
		
		log.info("start test hbase insert", "");
		testInsertor.testHbaseInsert(tempInParam);
		log.info("end test hbase insert", "");
		
		log.info("start test hbase query", "");
		testSelector.selectHbaseTest(tempInParam);
		log.info("end test hbase query", "");
		
		log.info("start test hive jdbc query", "");
		testSelector.selectHiveTest(tempInParam);
		log.info("end test hive jdbc query", "");
		
		log.info("start test sparksql jdbc query", "");
		testSelector.selectSparkSQLTest(tempInParam);
		log.info("end test sparksql jdbc query", "");
		
	}

}
