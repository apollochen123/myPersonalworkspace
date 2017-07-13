package com.sitech.strategy.persist.capacity.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.base.BaseHiveDB;

/**
 * 操作数控Hive实现
* @date: 2016-9-12 
* @author: zhaoyue
* @title: ProceHiveDML 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProceHiveDML extends BaseHiveDB implements IHiveDML, Serializable{
	
	/**
	 * hive通用信息
	* @date: 2016-11-25 
	* @author: zhangjj_crmpd
	* @title: CommonInfoHive 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class CommonInfoHive extends ICommonInfoHive implements Serializable{

		/**
		 * 查询表结构
		* @date: 2016-11-25 
		* @author: zhangjj_crmpd
		* @title: descTable 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> descTable(Map<String, Object> inParam)
				throws StrategyError {
			return hiveUtil.executeQuerySQL(hiveStatement.getdescTable(inParam));
		}
		
		/**
		 * 查询所有表名称
		* @date: 2016-11-25 
		* @author: zhangjj_crmpd
		* @title: showTables 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> showTables(Map<String, Object> inParam)
				throws StrategyError {
			hiveUtil.executeSql(hiveStatement.getUseDatabaseSql());
			return hiveUtil.executeQuerySQL(hiveStatement.getShowTablesSql());
		}
		
	}
	
	/**渠道任务hive表
	* Create on 2016-12-6
	* @author: wangpei
	* @Title:RmChannelTaskInfoHive
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class RmChannelTaskInfoHive extends IRmChannelTaskInfoHive implements Serializable{

		/** 增量从hbase外部表同步至hive表
		* @date: 2016-12-6 
		* @author: wangpei
		* @title: loadAddChannelTaskToHive 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void loadAddChannelTaskToHive(Map<String, Object> inParam)throws StrategyError {
			hiveUtil.executeSql(hiveStatement.getLoadAddChannelTaskToHiveSql(inParam));
		}

	}
	
	/**
	 * 客户群明细hive表
	* @date: 2016-10-30 
	* @author: zhangjj_crmpd
	* @title: RmCustGroupInfoHive 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmCustGroupDetailInfoHive extends IRmCustGroupDetailInfoHive implements Serializable{

		/**
		 * 创建客户群明细表
		* @date: 2016-10-30 
		* @author: zhangjj_crmpd
		* @title: createAndLoadCustGroup 
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void createCustGroupDetailInfo(Map<String,Object> inParam) throws StrategyError {
			hiveUtil.executeSql(hiveStatement.getCreateCustGroupDetailInfoSql(inParam));
		}
		/**
		 * 创建客户群明细hive表
		* @date: 2017-4-13 
		* @author: chenhao
		* @title: createCustGroupDetailInfoHive 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		void createCustGroupDetailInfoHive(Map<String,Object> inParam) throws StrategyError {
			hiveUtil.executeSql(hiveStatement.getCreateCustGroupDetailInfoHiveSql(inParam));
		}
		
		
		/**
		 * 删除客户群临时表
		* @date: 2016-10-30 
		* @author: zhangjj_crmpd
		* @title: dropCustGroupTemp 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void dropCustGroupTemp(Map<String, Object> inParam)
				throws StrategyError {
			hiveUtil.executeSql(hiveStatement.getDropCustGroupTempSql(inParam));
		}

		/**
		 * 导入客户群详细数据
		* @date: 2016-10-30 
		* @author: zhangjj_crmpd
		* @title: loadCustGroupDetailInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void loadCustGroupDetailInfo(Map<String, Object> inParam)
				throws StrategyError {
			hiveUtil.executeSql(hiveStatement.getLoadCustGroupDetailInfoSql(inParam));
		}

		
		/**
		 * 查询目标客户群数量
		* @date: 2017-2-8 
		* @author:liuqi
		* @title: selectCustGroupDetailCountInfo 
		* @param custGroupId
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String,Object>> selectCustGroupDetailCountInfo(Map<String, Object> custGroupIdInParam) throws StrategyError{
			List<Map<String,Object>> resultList = hiveUtil.executeQuerySQL(hiveStatement.selectCustGroupCountDetailInfoSQL(custGroupIdInParam));
			return resultList;
		}
	}
	
	/**
	 * 客户群明细hive表
	* @date: 2016-10-30 
	* @author: zhangjj_crmpd
	* @title: RmCustGroupInfoHive 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmCustGroupLabelInfoHive extends IRmCustGroupLabelInfoHive implements Serializable{

		/**
		 * 创建客户群标签表
		* @date: 2017-2-11 
		* @author: zhangjj_crmpd
		* @title: createCustGroupLabelInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void createCustGroupLabelInfo(Map<String, Object> inParam,Map<String, Object> tempInParam)
				throws StrategyError {
			hiveUtil.executeSql(hiveStatement.getCreateCustGroupLabelInfoSql(inParam));
		}
		
		/**
		 * 静态标签目标客户群表关联hive（hive扩展表）
		* @date: 2017-3-16 
		* @author:liuqi
		* @title: createRelateStaticLabelCustGroupTableToHive 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void createRelateStaticLabelCustGroupTableToHive(Map<String, Object> inParam) throws StrategyError{
			
			hiveUtil.executeSql(hiveStatement.getCreateRelateStaticLabelCustGroupTableToHiveSql(inParam));
		}


		/**
		 * 导入客户群标签数据
		* @date: 2017-2-11 
		* @author: zhangjj_crmpd
		* @title: loadCustGroupLabelInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void loadCustGroupLabelInfo(Map<String, Object> inParam)
				throws StrategyError {
			hiveUtil.executeSql(hiveStatement.getLoadCustGroupLabelInfoSql(inParam));
			
		}
		
		/**
		 * 增加静态标签客户群信息（hive表）
		* @date: 2017-3-16 
		* @author:liuqi
		* @title: insertStaticLabelCustGroupTableInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insertStaticLabelCustGroupTableInfo(Map<String, Object> inParam) throws StrategyError{
			
			hiveUtil.executeSql(hiveStatement.getInsertStaticLabelCustGroupTableInfoSql(inParam));
		}
	}
	
	
	/**
	 * 评估统计hive
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: RmEvaluateStatisticsInfoHive 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmEvaluateStatisticsInfoHive extends IRmEvaluateStatisticsInfoHive implements Serializable{
		/**
		 * 查询营销案订购量
		* @date: 2016-11-26 
		* @author: mengxi
		* @title: selectMarketCaseOrderNum 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectMarketCaseOrderNum()throws StrategyError{
			List<Map<String, Object>>  marketCaseList = hiveUtil.executeQuerySQL(hiveStatement.getSelectMarketCaseOrderNumSql());
			
			return marketCaseList;	
		}

	}
	
	/**
	 * hive测试表
	* @date: 2016-11-21 
	* @author: sunliang 
	* @title: RmHiveTestInfoHive 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmHiveTestInfoHive extends IRmHiveTestInfoHive{

		/**
		 * 查询
		* @date: 2016-11-21 
		* @author: sunliang 
		* @title: select 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(Map<String, Object> tempInParam)
				throws StrategyError {

			hiveUtil.executeSql(hiveStatement.getUseDatabaseSql());
			List<Map<String, Object>> retList = hiveUtil.executeQuerySQL(hiveStatement.getSelectHiveTestSql());
			return retList;
		}
		
	}
	
	/**
	 * hive hbase扩展表测试
	* @date: 2016-11-21 
	* @author: sunliang 
	* @title: RmHiveTestHbaseInfoHive 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmHiveTestHbaseInfoHive extends IRmHiveTestHbaseInfoHive{

		/**
		 * 查询
		* @date: 2016-11-21 
		* @author: sunliang 
		* @title: select 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(Map<String, Object> tempInParam)
				throws StrategyError {
			hiveUtil.executeSql("use clzxdb");
			List<Map<String, Object>> retList = hiveUtil.executeQuerySQL(hiveStatement.getSelectHiveOnHbaseTestSql());
			return retList;
		}
		
	}

/*	*//**任务工号hive表
	* Create on 2016-12-6
	* @author: wangpei
	* @Title:RmTaskServiceNoInfoHive
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*//*
	public class RmTaskServiceNoInfoHive extends IRmTaskServiceNoInfoHive implements Serializable{
	
		*//** 增量从hbase外部表同步至hive表
		* @date: 2016-12-6 
		* @author: wangpei
		* @title: loadAddTaskServiceNoToHive 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*//*
		@Override
		void loadAddTaskServiceNoToHive(Map<String, Object> inParam)throws StrategyError {
			hiveUtil.executeSql("set hive.exec.dynamic.partition.mode=nostrick");
			String sql = "insert into rm_taskserviceno_info_hive select ";
			sql+="task_id,service_no,service_name,create_seq from rm_taskserviceno_info";
			sql+="where CREATE_SEQ = '"+(String)inParam.get("createSql")+"'  ";
			hiveUtil.executeSql(sql);
		}
	}*/

}
