package com.sitech.strategy.common.pojo.inter.spark;

import java.util.Map;

/**
 * sparkSql语句接口
* @date: 2017-2-9 
* @author: zhangjj_crmpd
* @title: ISparkStatement 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ISparkStatement {

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
	public String getInsertLabelCustGroupDetailFileDynamicSql(Map<String,Object> inParam);	
	
	/**
	 * 获取创建静态标签客户群明细的文件sql--从hive写文件	
	* @date: 2017-2-16
	* @author: luogj
	* @title: getInsertLabelCustGroupDetailStaticFileSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getInsertLabelCustGroupDetailFileStaticSql(Map<String,Object> inParam);	
	
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
	public String getCreateCustGroupDetailInfoHiveSql(Map<String,Object> inParam);	
	
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
	public String getInsertCustGroupDetailInfoSql(Map<String,Object> inParam);
	
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
	public String getInsertRmRecommonedCloseInfoSql(Map<String,Object> inParam);
	
	
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
	public String getSelectChannelTaskListSql(Map<String,Object> inParam);
	
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
	public String getSelectCustListSql(Map<String,Object> inParam);
	
	/**
	 * 查询符合标签的客户群数量sql
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
	public String getselectCustGroupCountByUserLabelSql(Map<String,Object> inParam);
	
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
	public String getSelectCustGroupCountDetailInfoSQL(Map<String, Object> inParam);
	
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
	public String getSelectHiveOnHbaseTestSql(Map<String,Object> inParam);
	
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
	public String getSelectHiveTestSql(Map<String,Object> inParam);
	
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
	public String getSelectMarketCaseListSql(Map<String,Object> inParam);
	
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
	public String getSelectTaskListSql(Map<String,Object> inParam);

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
	public String getUseDatabaseSql(Map<String,Object> inParam);

	/**
	 * 查询表count
	* @date: 2017-4-3 
	* @author: chenhao
	* @title: getselectCustGroupDetailCountInSparkTable 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getselectCustGroupDetailCountInSparkTable(Map<String, Object> tempInParam);

	/**
	 * 查询2次过滤人数
	* @date: 2017-4-8 
	* @author: chenhao
	* @title: getselectLabelFormulaRestrictCountSql 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getselectLabelFormulaRestrictCountSql(Map<String, Object> inParam);

}
