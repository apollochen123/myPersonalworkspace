package com.sitech.strategy.common.pojo.impl.spark;

import java.util.Map;

import com.sitech.strategy.common.pojo.inter.spark.ISparkStatement;

/**
 * sparkSql语句接口，吉林移动专用
* @date: 2017-2-10
* @author: luogj
* @title: SparkStatement 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class SparkStatementByJLMob extends SparkStatement implements ISparkStatement{

	/**
	 * 获取创建动态标签客户群明细的文件sql--从hive写文件	
	* @date: 2017-2-10
	* @author: luogj
	* @title: insertDynamicLabelCustGroupDetailFileSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getInsertLabelCustGroupDetailFileDynamicSql(
			Map<String, Object> inParam) {
		StringBuffer sb = new StringBuffer();
		String filePath = (String) inParam.get("filePath");
		String whereCond = (String) inParam.get("calculateFormula");
		
		sb.append("insert overwrite local directory '" + filePath + "' ");
		sb.append(" select L001017008 from rm_userlabel_info_hive where " + whereCond + "");		
				
		return sb.toString();
	}

	
	/**
	 * 获取插入客户群明细表sql
	* @date: 2017-2-10
	* @author: luogj
	* @title: getInsertCustGroupDetailInfoSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getInsertCustGroupDetailInfoSql(Map<String, Object> inParam) {
		StringBuffer sb = new StringBuffer();
		String tableName = "RM_CUSTGROUP_" + inParam.get("custGroupId") + "_DETAIL_INFO_HIVE";
		String whereCond = (String) inParam.get("calculateFormula");
		
		sb.append("insert into " + tableName );
		sb.append(" select id_no,id_no,L001002004,L001017008 from rm_userlabel_info_hive where " + whereCond + "");		
		return sb.toString();
	}

}
