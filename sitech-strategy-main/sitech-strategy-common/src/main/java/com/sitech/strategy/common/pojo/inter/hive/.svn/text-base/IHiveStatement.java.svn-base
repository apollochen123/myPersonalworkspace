package com.sitech.strategy.common.pojo.inter.hive;

import java.util.Map;

/**
 * Hive语句接口
* @date: 2017-1-16 
* @author: sunliang 
* @title: IHiveStatement 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IHiveStatement {
	
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
	public String selectCustGroupCountDetailInfoSQL(Map<String, Object> inParam);
	
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
	public String getCreateCustGroupDetailInfoSql(Map<String,Object> inParam);
	
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
	public String getCreateRelateStaticLabelCustGroupTableToHiveSql(Map<String, Object> inParam);
	
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
	public String getCreateCustGroupLabelInfoSql(Map<String,Object> inParam);
	
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
	public String getdescTable(Map<String, Object> inParam);
	
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
	public String getDropCustGroupTempSql(Map<String,Object> inParam);
	
	/**
	 * 获取任务表增量同步到hive表sql
	* @date: 2017-2-8 
	* @author: zhangjj_crmpd
	* @title: getloadAddChannelTaskToHiveSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getLoadAddChannelTaskToHiveSql(Map<String, Object> inParam);
	
	/**
	 * 获取导入客户群详细数据sql
	* @date: 2017-2-8 
	* @author: zhangjj_crmpd
	* @title: getLoadCustGroupDetailInfoSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getLoadCustGroupDetailInfoSql(Map<String, Object> inParam);
	
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
	public String getLoadCustGroupLabelInfoSql(Map<String, Object> inParam);
	
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
	public String getSelectHiveOnHbaseTestSql();
	
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
	public String getSelectHiveTestSql();
	
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
	public String getSelectMarketCaseOrderNumSql();
	
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
	public String getShowTablesSql();
	
	
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
	public String getUseDatabaseSql();
	
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
	public String getInsertStaticLabelCustGroupTableInfoSql(Map<String, Object> inParam);

	/**
	 * 添加导入模式hive表
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
	public String getCreateCustGroupDetailInfoHiveSql(Map<String, Object> inParam);
	
}
