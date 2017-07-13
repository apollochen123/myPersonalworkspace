package com.sitech.strategy.common.pojo.impl.hive;

import java.util.HashMap;
import java.util.Map;

/**
 * hive语名对象
* @date: 2017-3-1 
* @author: liuqi
* @title: HiveStatementByJLMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class HiveStatementByJLMob extends HiveStatement {
	
	/**
	 * 获取创建客户群明细表sql
	* @date: 2017-3-2 
	* @author: liuqi
	* @title: getCreateCustGroupDetailInfoSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCreateCustGroupDetailInfoSql(Map<String, Object> inParam) {
		return "create EXTERNAL table clzxdb."+inParam.get("tableStr")+"  (key string,ID_NO string,REGION_CODE string,PHONE_NO string)STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler' WITH SERDEPROPERTIES (\"hbase.columns.mapping\" =\":key,a:ID_NO,a:REGION_CODE,a:PHONE_NO\") TBLPROPERTIES (\"hbase.table.name\" = \"stra_opr:"+inParam.get("tableStr").toString().toUpperCase()+"\")";
	}
	/**
	 * 创建客户群明细Hive表sql
	* @date: 2017-4-13 
	* @author: chenhao
	* @title: getCreateCustGroupDetailInfoHiveSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCreateCustGroupDetailInfoHiveSql(Map<String, Object> inParam) {
		return "create table clzxdb."+inParam.get("tableStr")+"_hive  as select * from "+inParam.get("tableStr");
	}
	/**
	 * 获取导入客户群详细数据sql
	* @date: 2017-3-1 
	* @author: liuqi
	* @title: getLoadCustGroupDetailInfoSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getLoadCustGroupDetailInfoSql(Map<String, Object> inParam) {
		
		return "INSERT OVERWRITE TABLE clzxdb."+inParam.get("tableStr")+" select distinct b.id_no key,b.id_no id_no,b.region_code,b.phone_no from "+inParam.get("tempTableStr")+" a,rm_user_info_hive b WHERE a.phone_no = b.phone_no";
	}
}
