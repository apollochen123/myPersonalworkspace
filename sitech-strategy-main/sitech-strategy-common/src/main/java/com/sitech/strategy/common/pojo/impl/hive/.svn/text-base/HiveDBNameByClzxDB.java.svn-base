package com.sitech.strategy.common.pojo.impl.hive;

import java.io.Serializable;
import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.hive.IHiveDBName;

/**
 * hive数据库名称对象
* @date: 2016-12-22 
* @author: sunliang 
* @title: HiveDBNameByClzxDB
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class HiveDBNameByClzxDB extends BaseClass implements IHiveDBName,Serializable {
	
	/**
	 * 数据库名
	 */
	protected final String hiveDatabase = "clzxdb";
	
	/**
	 * 获取数据源模式目标客户群SQL
	* @date: 2016-12-22 
	* @author: sunliang 
	* @title: getCustGroupSQLByDB 
	* @param custGroupTypeAndFormulaMap
	* @param custGroupType
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCustGroupSQLByDB(Map<String,String> custGroupTypeAndFormulaMap,String custGroupType) {
		StringBuffer sb = new StringBuffer();
		sb.append("select id_no from ");
		sb.append(custGroupTypeAndFormulaMap.get(custGroupType));
		return sb.toString();
	}

	/**
	 * 获取coc模式目标客户群SQL
	* @date: 2016-12-22 
	* @author: sunliang 
	* @title: getCustGroupSQLByCocMode 
	* @param custGroupTypeAndFormulaMap
	* @param custGroupType
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCustGroupSQLByCocMode(Map<String,String> custGroupTypeAndFormulaMap,String custGroupType) {
		StringBuffer sb = new StringBuffer();
		sb.append("select PHONE_NO from ");
		sb.append(custGroupTypeAndFormulaMap.get(custGroupType));
		return sb.toString();
	}

	/**
	 * 获取标签模式目标客户群SQL
	* @date: 2016-12-22 
	* @author: sunliang 
	* @title: getCustGroupSQLByLabelMode 
	* @param custGroupTypeAndFormulaMap
	* @param custGroupType
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCustGroupSQLByLabelMode(Map<String,String> custGroupTypeAndFormulaMap,String custGroupType) {
		return custGroupTypeAndFormulaMap.get(custGroupType);
	}

	/**
	 * 获取导入模式目标客户群SQL
	* @date: 2016-12-22 
	* @author: sunliang 
	* @title: getCustGroupSQLByLoadMode 
	* @param custGroupTypeAndFormulaMap
	* @param custGroupType
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCustGroupSQLByLoadMode(Map<String,String> custGroupTypeAndFormulaMap,String custGroupType) {
		return custGroupTypeAndFormulaMap.get(custGroupType);
	}
	
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
		log.debug("HiveTablePojoByClzxDB.getHiveDatabase.hiveDatabase", this.hiveDatabase);
		return this.hiveDatabase;
	}

}
