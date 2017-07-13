package com.sitech.strategy.common.pojo.impl.hive;

import java.io.Serializable;

import com.sitech.strategy.common.pojo.inter.hive.IHiveDBName;

/**
 * hive数据库名称对象
* @date: 2016-12-22 
* @author: sunliang 
* @title: HiveDBNameByZjcoc 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class HiveDBNameByZjcoc extends HiveDBNameByClzxDB implements IHiveDBName,Serializable {

	/**
	 * 数据库名
	 */
	protected final String hiveDatabase = "zjcoc";

	/**
	 * 获取Hive数据库名
	* @date: 2016-12-22 
	* @author: sunliang 
	* @title: getHiveDatabase 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getHiveDatabase() {
		log.debug("HiveTablePojoByZjcoc.getHiveDatabase.hiveDatabase", this.hiveDatabase);
		return this.hiveDatabase;
	}

}
