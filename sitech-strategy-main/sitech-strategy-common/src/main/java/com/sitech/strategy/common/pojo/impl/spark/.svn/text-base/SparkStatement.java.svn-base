package com.sitech.strategy.common.pojo.impl.spark;

import java.io.Serializable;
import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.hbase.IHbaseTableName;
import com.sitech.strategy.common.pojo.inter.hive.IHiveDBName;
import com.sitech.strategy.common.pojo.inter.spark.ISparkStatement;
import com.sitech.strategy.common.utils.CommonUtils;

/**
 * sparkSql语句接口
* @date: 2017-2-9 
* @author: zhangjj_crmpd
* @title: SparkStatement 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class SparkStatement extends BaseClass implements ISparkStatement,Serializable{
	
	/**
	 * hbase表名称对象
	 */
	protected IHbaseTableName hbaseTableName;
	
	/**
	 * hive表pojo对象
	 */
	protected IHiveDBName hiveDBName;	
	
	/**
	 * 
	* @date: 2017-2-11
	* @author: luogj 
	* @title: setHiveDBName 
	* @param hiveDBName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setHiveDBName(IHiveDBName hiveDBName) {
		this.hiveDBName = hiveDBName;
	}
	
	/**
	 * 
	* @date: 2017-2-11
	* @author: luogj
	* @title: setHbaseTableName 
	* @param hbaseTableName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setHbaseTableName(IHbaseTableName hbaseTableName) {
		this.hbaseTableName = hbaseTableName;
	}

	/**
	 * 获取创建动态标签客户群明细的文件sql--从hive写文件	
	* @date: 2017-2-16
	* @author: luogj
	* @title: getInsertLabelCustGroupDetailFileDynamicSql 
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
		// TODO Auto-generated method stub
		return null;
	}


	/**
	 * 获取创建静态标签客户群明细的文件sql--从hive写文件	
	* @date: 2017-2-16
	* @author: luogj
	* @title: getInsertLabelCustGroupDetailFileStaticSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getInsertLabelCustGroupDetailFileStaticSql(
			Map<String, Object> inParam) {
		StringBuffer sb = new StringBuffer();
		String tableName = "RM_CUSTGROUP_" + inParam.get("custGroupId") + "_DETAIL_INFO";		
		String filePath = (String) inParam.get("filePath");
		
		sb.append("insert overwrite local directory '" + filePath + "' ");
		sb.append(" select service_nbr from " + tableName);			
				
		return sb.toString();		
	}
	
	/**
	 * 获取创建客户群明细表sql--hive
	* @date: 2017-2-10
	* @author: luogj
	* @title: getCreateCustGroupDetailInfoHbaseSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCreateCustGroupDetailInfoHiveSql(Map<String, Object> inParam) {
		StringBuffer sb = new StringBuffer();
		String tableName = hiveDBName.getHiveDatabase() + ".RM_CUSTGROUP_" + inParam.get("custGroupId") + "_DETAIL_INFO_HIVE";
		//hive内建表
		sb.append("create table " + tableName + " ");
		sb.append("(key string,ID_NO string,REGION_CODE string,phone_no string)");
		
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
		return "";
	}
	
	/**
	 * 插入推荐关闭Sql
	* @date: 2017-2-10 
	* @author: zhangjj_crmpd
	* @title: getInsertRmRecommonedCloseInfoSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getInsertRmRecommonedCloseInfoSql(Map<String, Object> inParam) {
		String sql = "insert into rm_recommonedClose_info_hive values";
		sql += "('"+inParam.get("idNo")+"','"+inParam.get("marketCaseId")+"','"+inParam.get("channelId")+"')";
		return sql;
	}
	
	/**
	 * 获取查询客户经理任务列表sql
	* @date: 2017-2-9 
	* @author: zhangjj_crmpd
	* @title: getSelectChannelTaskListSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSelectChannelTaskListSql(Map<String, Object> inParam) {
		String channelTaskSql = "select ID_NO, TASK_ID, ACT_ID, ACT_NAME, CUST_NAME, PRD_INST_ID, " +
				"CUST_ID, ACCT_ID, REGION_CODE, SERVICE_NBR, SM_NAME, START_DATE , " +
				"END_DATE, ISNT_4GCARD, SERVICE_NO, SERVICE_NAME , STATUS_NAME, " +
				"PHOTO_FLAG, CUST_GRADE, ENJOY_FLAG, BIND_FLAG, RISK_FLAG, NOTE, " +
				"MKT_AREA_NAME, DEPT_NAME, DUTY_ZONE_NAME, GRID_NAME from RM_CHANNELTASK_INFO where ";
		if(!CommonUtils.objectIsNull(inParam.get("positionId"))){
			channelTaskSql = channelTaskSql + " position_id = '" + inParam.get("positionId") + "' ";
			if(!CommonUtils.objectIsNull(inParam.get("marketCaseId"))){
				channelTaskSql = channelTaskSql + " and act_id = '" + inParam.get("marketCaseId") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("statusCode"))){
				channelTaskSql = channelTaskSql + " and status_code = '" + inParam.get("statusCode") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("taskId"))){
				channelTaskSql = channelTaskSql + " and task_id = '" + inParam.get("taskId") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("channelId"))){
				channelTaskSql = channelTaskSql + " and channel_id = '" + inParam.get("channelId") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("idNo"))){
				channelTaskSql = channelTaskSql + " and id_no = '" + inParam.get("idNo") + "' ";
			}
		}else{
			return null;
		}
		return channelTaskSql;
	}
	
	/**
	 * 
	* @date: 2017-2-10 
	* @author: zhangjj_crmpd
	* @title: getselectCustGroupCountByUserLabelSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getselectCustGroupCountByUserLabelSql(
			Map<String, Object> inParam) {
		return "select count(1) count from clzxdb.rm_userlabel_info_hive where "+inParam.get("groupFormula");
	}
	
	/**
	 * 查询目标客户群数量明细
	* @date: 2017-3-4 
	* @author: zhangjj_crmpd
	* @title: getSelectCustGroupCountDetailInfoSQL 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSelectCustGroupCountDetailInfoSQL(Map<String, Object> inParam) {
		return "select count(*) count from  clzxdb."+inParam.get("tableStrFileName");
	}
	
	
	/**
	 * 获取查询客户列表sql
	* @date: 2017-2-9 
	* @author: zhangjj_crmpd
	* @title: getSelectCustListSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSelectCustListSql(Map<String, Object> inParam) {
		String channelTaskSql = "select REGION_CODE, CUST_ID, CUST_NAME, SERVICE_NBR, DUTY_ZONE_NAME, GRID_NAME, count(1) TASK_NUM from RM_CHANNELTASK_INFO where ";
		if(!CommonUtils.objectIsNull(inParam.get("positionId"))){
			channelTaskSql = channelTaskSql + " position_id = '" + inParam.get("positionId") + "' ";
			if(!CommonUtils.objectIsNull(inParam.get("marketCaseId"))){
				channelTaskSql = channelTaskSql + " and act_id = '" + inParam.get("marketCaseId") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("statusCode"))){
				channelTaskSql = channelTaskSql + " and status_code = '" + inParam.get("statusCode") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("regionCode"))){
				channelTaskSql = channelTaskSql + " and region_code = '" + inParam.get("regionCode") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("gridId"))){
				channelTaskSql = channelTaskSql + " and grid_id = '" + inParam.get("gridId") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("edwDeptId"))){
				channelTaskSql = channelTaskSql + " and edw_dept_id = '" + inParam.get("edwDeptId") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("serviceNo"))){
				channelTaskSql = channelTaskSql + " and service_no = '" + inParam.get("serviceNo") + "' ";
			}
		}else{
			return null;
		}
		channelTaskSql = channelTaskSql + " group by REGION_CODE, CUST_ID, CUST_NAME, SERVICE_NBR, DUTY_ZONE_NAME, GRID_NAME";
		
		return channelTaskSql;
	}
	
	/**
	 * 测试查询Hive on hbase表sql
	* @date: 2017-2-10 
	* @author: zhangjj_crmpd
	* @title: getSelectHiveOnHbaseTestSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSelectHiveOnHbaseTestSql(Map<String, Object> inParam) {
		return "select TEST1,TEST2 from RM_HIVETEST_HBASE_INFO";
	}

	/**
	 * 测试查询Hive表sql
	* @date: 2017-2-10 
	* @author: zhangjj_crmpd
	* @title: getSelectHiveTestSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSelectHiveTestSql(Map<String, Object> inParam) {
		return "select TEST1,TEST2 from RM_HIVETEST_INFO";
	}
	
	/**
	 * 查询营销案列表sql
	* @date: 2017-2-9 
	* @author: zhangjj_crmpd
	* @title: getSelectMarketCaseListSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSelectMarketCaseListSql(Map<String, Object> inParam) {
		String channelTaskSql = "select ACT_ID, ACT_NAME, ACT_TYPE, BUSI_TYPE, START_DATE, END_DATE, ACT_DESC, count(1) TASK_NUM from RM_CHANNELTASK_INFO where ";
		if(!CommonUtils.objectIsNull(inParam.get("positionId"))){
			channelTaskSql = channelTaskSql + " position_id = '" + inParam.get("positionId") + "' ";
			if(!CommonUtils.objectIsNull(inParam.get("marketCaseId"))){
				channelTaskSql = channelTaskSql + " and act_id = '" + inParam.get("marketCaseId") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("statusCode"))){
				channelTaskSql = channelTaskSql + " and status_code = '" + inParam.get("statusCode") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("regionCode"))){
				channelTaskSql = channelTaskSql + " and region_code = '" + inParam.get("regionCode") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("gridId"))){
				channelTaskSql = channelTaskSql + " and grid_id = '" + inParam.get("gridId") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("edwDeptId"))){
				channelTaskSql = channelTaskSql + " and edw_dept_id = '" + inParam.get("edwDeptId") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("serviceNo"))){
				channelTaskSql = channelTaskSql + " and service_no = '" + inParam.get("serviceNo") + "' ";
			}
		}else{
			return null;
		}
		channelTaskSql = channelTaskSql + " group by ACT_ID, ACT_NAME, ACT_TYPE, BUSI_TYPE, START_DATE, END_DATE, ACT_DESC";
		return channelTaskSql;
	}
	
	/**
	 * 查询任务列表Sql
	* @date: 2017-2-10 
	* @author: zhangjj_crmpd
	* @title: getSelectTaskListSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSelectTaskListSql(Map<String, Object> inParam) {
		String channelTaskSql = "select TASK_ID, ACT_ID, ACT_NAME, CUST_NAME, PRD_INST_ID, CUST_ID, ACCT_ID, REGION_CODE, SERVICE_NBR, SM_NAME, START_DATE, END_DATE, ISNT_4GCARD, SERVICE_NO, SERVICE_NAME, STATUS_NAME, PHOTO_FLAG, CUST_GRADE, ENJOY_FLAG, BIND_FLAG, RISK_FLAG, NOTE, MKT_AREA_NAME, DEPT_NAME, DUTY_ZONE_NAME, GRID_NAME from RM_CHANNELTASK_INFO where ";
		if(!CommonUtils.objectIsNull(inParam.get("positionId"))){
			channelTaskSql = channelTaskSql + " position_id = '" + inParam.get("positionId") + "' ";
			if(!CommonUtils.objectIsNull(inParam.get("marketCaseId"))){
				channelTaskSql = channelTaskSql + " and act_id = '" + inParam.get("marketCaseId") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("statusCode"))){
				channelTaskSql = channelTaskSql + " and status_code = '" + inParam.get("statusCode") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("regionCode"))){
				channelTaskSql = channelTaskSql + " and region_code = '" + inParam.get("regionCode") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("gridId"))){
				channelTaskSql = channelTaskSql + " and grid_id = '" + inParam.get("gridId") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("edwDeptId"))){
				channelTaskSql = channelTaskSql + " and edw_dept_id = '" + inParam.get("edwDeptId") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("serviceNo"))){
				channelTaskSql = channelTaskSql + " and service_no = '" + inParam.get("serviceNo") + "' ";
			}
			if(!CommonUtils.objectIsNull(inParam.get("channelId"))){
				channelTaskSql = channelTaskSql + " and channel_id = '" + inParam.get("channelId") + "' ";
			}
		}else{
			return null;
		}
		return channelTaskSql;
	}
	
	/**
	 * 获取使用某个数据库sql
	* @date: 2017-2-9 
	* @author: zhangjj_crmpd
	* @title: getUseDatabaseSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getUseDatabaseSql(Map<String, Object> inParam) {
		return "use clzxdb";
	}

	/**
	 * 
	* @date: 2017-4-8 
	* @author: chenhao
	* @title: getselectCustGroupDetailCountInSparkTable 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getselectCustGroupDetailCountInSparkTable(
			Map<String, Object> tempInParam) {
		String table = "RM_CUSTGROUP_" + tempInParam.get("custGroupId") + "_DETAIL_INFO_HIVE";
		String sql = "select count(1) count from "+table;
//		System.out.println("+++++++++++++++++++++++++chenhaosql++++++++++++==="+sql);
		return sql;
	}

	/**
	 * 
	* @date: 2017-4-14 
	* @author: chenhao
	* @title: getselectLabelFormulaRestrictCountSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getselectLabelFormulaRestrictCountSql(
			Map<String, Object> inParam) {
		String custGroupTable = "RM_CUSTGROUP_" + inParam.get("custGroupId") + "_DETAIL_INFO_HIVE";
		if(!CommonUtils.objectIsNull(inParam.get("label_formula_restrict"))){
			String label_formula_restrict = (String) inParam.get("label_formula_restrict");
			String sql = "select count(1) count from clzxdb."+custGroupTable+" a,(select id_no from clzxdb.rm_userlabel_info_hive where "+label_formula_restrict+") b where a.id_no = b.id_no";
			return sql;
		}else{
			String sql = "select count(1) count from clzxdb."+custGroupTable;
			return sql;
		}

	}


}
