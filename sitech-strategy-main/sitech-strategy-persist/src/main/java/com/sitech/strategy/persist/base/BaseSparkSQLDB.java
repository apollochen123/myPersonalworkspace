package com.sitech.strategy.persist.base;

import java.io.Serializable;

import com.sitech.strategy.common.pojo.inter.hive.IHiveStatement;
import com.sitech.strategy.common.pojo.inter.spark.ISparkStatement;
import com.sitech.strategy.persist.capacity.impl.IMsgDML;
import com.sitech.strategy.persist.utils.ImpalaUtil;
import com.sitech.strategy.persist.utils.SparkSQLUtil;

/**
 * spark SQL数据处理基类
* @date: 2016-9-10 
* @author: sunliang 
* @title: BaseSparkSQLDB 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class BaseSparkSQLDB extends BaseClass implements Serializable{
	public SparkSQLUtil sparkSQLUtil = SparkSQLUtil.getInstance();
	
	protected ISparkStatement sparkStatement;

	/**
	 * 
	* @date: 2017-2-9 
	* @author: zhangjj_crmpd
	* @title: setSparkStatement 
	* @param sparkStatement 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSparkStatement(ISparkStatement sparkStatement) {
		this.sparkStatement = sparkStatement;
	}
	
}
