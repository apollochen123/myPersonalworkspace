package com.sitech.strategy.common.pojo.impl.hive;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.hive.IHiveStatement;
import com.sitech.strategy.common.utils.CommonUtils;

/**
 * hive语名对象
* @date: 2017-1-16 
* @author: sunliang 
* @title: HiveStatement 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class HiveStatement extends BaseClass implements IHiveStatement,Serializable {
	
	/**
	 * 查询目标客户群数量明细
	* @date: 2017-2-8 
	* @author:liuqi
	* @title: getCustGroupCountDetailInfoSQL 	
	* @param custGroupId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String selectCustGroupCountDetailInfoSQL(Map<String, Object> inParam) {
		return "select count(*) count from  clzxdb."+inParam.get("tableStrFileName");
	}
	
	/**
	 * 获取创建客户群明细表sql
	* @date: 2017-2-8 
	* @author: zhangjj_crmpd
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
		return "create EXTERNAL table clzxdb."+inParam.get("tableStr")+"  (key string,ID_NO string,REGION_CODE string,SERVICE_NBR string)STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler' WITH SERDEPROPERTIES (\"hbase.columns.mapping\" =\":key,a:ID_NO,a:REGION_CODE,a:SERVICE_NBR\") TBLPROPERTIES (\"hbase.table.name\" = \"stra_opr:"+inParam.get("tableStr").toString().toUpperCase()+"\")";
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
	 * 静态标签目标客户群表关联hive（hive扩展表）
	* @date: 2017-3-16 
	* @author:liuqi
	* @title: getCreateRelateStaticLabelCustGroupTableToHiveSql 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCreateRelateStaticLabelCustGroupTableToHiveSql(Map<String, Object> inParam){
		
		return "create EXTERNAL table clzxdb.RM_CUSTGROUP_"+inParam.get("custGroupId")+"_DETAIL_INFO"+" (key string,ID_NO string,REGION_CODE string,PHONE_NO string)STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler' WITH SERDEPROPERTIES (\"hbase.columns.mapping\" =\":key,a:ID_NO,a:REGION_CODE,a:PHONE_NO\")TBLPROPERTIES (\"hbase.table.name\" = \"stra_opr:RM_CUSTGROUP_"+inParam.get("custGroupId").toString().toUpperCase()+"_DETAIL_INFO\")";
	}
	
	/**
	 * 获取创建客户群标签表sql
	* @date: 2017-2-11 
	* @author: zhangjj_crmpd
	* @title: getCreateCustGroupLabelInfoSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCreateCustGroupLabelInfoSql(Map<String, Object> inParam) {
		List<Map<String, Object>> descTableList=  (List<Map<String, Object>>) inParam.get("descTable");
		String tableName = CommonUtils.toString(inParam.get("tableStr"));
		if(CommonUtils.objectIsNull(descTableList)){
			return "";
		}
		//"create EXTERNAL table "+tableStr+" (key string,ID_NO string)STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler' WITH SERDEPROPERTIES (\"hbase.columns.mapping\" =\":key,a:ID_NO\") TBLPROPERTIES (\"hbase.table.name\" = \""+tableStr.toUpperCase()+"\")";
		StringBuffer buffer = new StringBuffer("CREATE EXTERNAL TABLE ");
		StringBuffer hbaseBuffer = new StringBuffer(":key");
		buffer.append(tableName+" (ID_NO string");
		for(int i=0;i<descTableList.size();i++){
			buffer.append(" ,"+descTableList.get(i).get("col_name").toString()+" "+descTableList.get(i).get("data_type").toString());
			hbaseBuffer.append(",a:"+descTableList.get(i).get("col_name").toString().toUpperCase());
		}
		buffer.append(")STORED BY 'org.apache.hadoop.hive.hbase.HBaseStorageHandler' WITH SERDEPROPERTIES (\"hbase.columns.mapping\" =\""+hbaseBuffer.toString()+"\") TBLPROPERTIES (\"hbase.table.name\" = \"stra_opr:"+tableName.toUpperCase()+"\")");
		log.info("joinLabelCreateSql:", buffer.toString());
		System.out.println("getCreateCustGroupLabelInfoSql :"+buffer.toString());
		return buffer.toString();
	}
	
	/**
	 * 获取 表的描述信息
	* @date: 2017-2-27 
	* @author: zhangjj_crmpd
	* @title: getdescTable 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getdescTable(Map<String, Object> inParam) {
		System.out.println("getdescTable: desc clzxdb."+inParam.get("tempTableStr"));
		return "desc clzxdb."+inParam.get("tempTableStr");
	}
	
	/**
	 * 获取删除客户群临时表sql
	* @date: 2017-2-8 
	* @author: zhangjj_crmpd
	* @title: getDropCustGroupTempSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getDropCustGroupTempSql(Map<String, Object> inParam) {
		StringBuffer sb = new StringBuffer();
		sb.append("drop table ");
		sb.append(inParam.get("tempTableStr").toString());
		return sb.toString();
	}
	
	/**
	 * 获取任务表增量同步到hive表sql
	* @date: 2017-2-8 
	* @author: zhangjj_crmpd
	* @title: getloadAddChannelTaskToHiveSql 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getLoadAddChannelTaskToHiveSql(Map<String, Object> inParam) {
		StringBuffer sb = new StringBuffer();
		sb.append("insert into rm_channeltask_info_hive partition(region_code) select ");
		sb.append("ACCT_ID,ACT_DESC,ACT_ID,ACT_NAME,ACT_TYPE,BIND_FLAG,BUSI_TYPE,CALL_FLAG,CHANNEL_ID,CONTACT_NBR,CUST_GRADE,CUST_ID,CUST_NAME,CUST_GROUP_ID,DEPT_CODE,DEPT_NAME,DUTY_ZONE_NAME,EDW_DEPT_ID,END_DATE,ENJOY_FLAG,GRID_CODE,GRID_ID,GRID_NAME,ID_NO,ISNT_4GCARD,MKT_AREA_NAME,NOTE,PHOTO_FLAG,POSITION_ID,PRD_INST_ID,RISK_FLAG,SERVICE_NAME,SERVICE_NBR,SERVICE_NO,SM_NAME,START_DATE,STATUS_CODE,STATUS_NAME,TASK_ID,CREATE_TIME,CREATE_SEQ,REGION_CODE from rm_channeltask_info");
		sb.append("where CREATE_SEQ = '"+(String)inParam.get("createSql")+"' distribute by REGION_CODE ");
		return sb.toString();
	}
	
	/**
	 * 获取导入客户群详细数据sql
	* @date: 2017-2-8 
	* @author: zhangjj_crmpd
	* @title: loadCustGroupDetailInfo 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getLoadCustGroupDetailInfoSql(Map<String, Object> inParam) {
		return "INSERT OVERWRITE TABLE clzxdb."+inParam.get("tableStr")+" select distinct id_no key,b.id_no id_no,b.region_code,b.service_nbr from "+inParam.get("tempTableStr")+" a,rm_user_info_hive b WHERE a.service_nbr = b.service_nbr";
	}
	
	/**
	 * 获取导入客户群标签数据sql
	* @date: 2017-2-11 
	* @author: zhangjj_crmpd
	* @title: getLoadCustGroupLabelInfoSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getLoadCustGroupLabelInfoSql(Map<String, Object> inParam) {
		
		return "INSERT OVERWRITE TABLE "+CommonUtils.toString(inParam.get("tableStr"))+" select b.id_no,a.* from "+CommonUtils.toString(inParam.get("tempTableStr"))+" a,rm_user_info_hive b WHERE a.service_nbr = b.service_nbr";
	}
	
	/**
	 * 获取查询营销案订购量sql
	* @date: 2017-2-8 
	* @author: zhangjj_crmpd
	* @title: getSelectMarketCaseOrderNumSql 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSelectMarketCaseOrderNumSql() {
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		
		//获取当前日期
		Date systemDate = new Date();
		
		//获取昨天的日期
		Date yesterdayDate = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(systemDate);
		calendar.add(calendar.DATE, -1);
		yesterdayDate = calendar.getTime();
		String yesterday = format.format(yesterdayDate);
		String stat_date = yesterday.replace("-", "");
		String stat_month = stat_date.substring(0, 6);
		StringBuffer sb = new StringBuffer();
		sb.append("select a.market_case_id MARKET_CASE_ID,substr(a.create_time,1,10) SEND_DATE,count(distinct c.user_id) ORDER_NUM,'"+yesterday+"' REPORT_DATE from ");
		sb.append("(select * from yxzx.RM_BATCHPUSHTASK_INFO where substr(end_time,1,10) >= '"+yesterday+"' and product_commodity_id <> '' and substr(create_time,1,10) <= '"+yesterday+"') a ");
		sb.append("left join (select user_id,phone_no from dc.DW_USR_ALL_USER_INFO_DM where STAT_MONTH = '"+stat_month+"' and STAT_DATE = '"+stat_date+"') b on a.phone_no = b.phone_no ");
		sb.append("left join (select user_id,prod_id from dc.DWD_LOG_PROD_ACCEPT_DETL_DM where STAT_MONTH = '"+stat_month+"' and STAT_DATE = '"+stat_date+"' and substr(acpt_date,1,10) = '"+yesterday+"' and idu_type = 'I') c on b.user_id = c.user_id and a.product_commodity_id = c.prod_id ");
		sb.append("group by a.market_case_id,substr(a.create_time,1,10)");
		return sb.toString();
	}
	
	/**
	 * 测试查询Hive on hbase表sql
	* @date: 2017-2-8 
	* @author: zhangjj_crmpd
	* @title: getSelectHiveOnHbaseTestSql 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSelectHiveOnHbaseTestSql() {
		return "select TEST1,TEST2 from RM_HIVETEST_HBASE_INFO";
	}
	
	/**
	 * 测试查询Hive表sql
	* @date: 2017-2-8 
	* @author: zhangjj_crmpd
	* @title: getSelectHiveTestSql 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSelectHiveTestSql() {
		return "select TEST1,TEST2 from RM_HIVETEST_INFO";
	}
	
	/**
	 * 获取查询所有表名称sql
	* @date: 2017-2-8 
	* @author: zhangjj_crmpd
	* @title: getShowTablesSql 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getShowTablesSql() {
		return "show tables";
	}

	/**
	 * 获取使用某个数据库sql
	* @date: 2017-2-8 
	* @author: zhangjj_crmpd
	* @title: getUseDatabaseSql 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getUseDatabaseSql() {
		return "use clzxdb";
	}
	
	/**
	 * 增加静态标签客户群信息（hive表）
	* @date: 2017-3-16 
	* @author:liuqi
	* @title: getInsertStaticLabelCustGroupTableInfoSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getInsertStaticLabelCustGroupTableInfoSql(Map<String, Object> inParam){
		
		return "INSERT OVERWRITE TABLE clzxdb.rm_custgroup_"+inParam.get("custGroupId")+"_detail_info select distinct a.id_no key,a.id_no id_no,a.region_code,a.phone_no from rm_custgroup_"+inParam.get("custGroupId")+"_detail_info_hive a";
	}

}
