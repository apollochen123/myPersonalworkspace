package com.sitech.strategy.persist.capacity.impl;


import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * hive操控接口
* @date: 2016-9-12 
* @author: zhaoyue
* @title: IHiveDML 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IHiveDML {
	
	/**
	 * hive通用信息
	* @date: 2016-11-25 
	* @author: zhangjj_crmpd
	* @title: ICommonInfoHive 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class ICommonInfoHive{
		
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
		abstract List<Map<String,Object>>  descTable(Map<String,Object> inParam)throws StrategyError;
		
		/**
		 * 查询所有表名称
		* @date: 2016-10-30 
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
		abstract List<Map<String,Object>>  showTables(Map<String,Object> inParam)throws StrategyError;
		
	}
	
	/**渠道任务hive表
	* Create on 2016-12-6
	* @author: wangpei
	* @Title:IRmChannelTaskInfoHive
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public abstract class IRmChannelTaskInfoHive{
		/** 增量从hbase外部表同步至hive表
		* @date: 2016-12-6 
		* @author: wangpei
		* @title: loadChannelTaskToHive 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		abstract void loadAddChannelTaskToHive(Map<String,Object> inParam)throws StrategyError;
		
	}
	
	/**
	 * 客户群明细hive表
	* @date: 2016-10-30 
	* @author: zhangjj_crmpd
	* @title: IRmCustGroupInfoHive 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmCustGroupDetailInfoHive{
		
		/**
		 * 创建客户群明细表
		* @date: 2016-10-30 
		* @author: zhangjj_crmpd
		* @title: createCustGroupDetailInfo 
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void  createCustGroupDetailInfo(Map<String,Object> inParam)throws StrategyError;
		

		/**
		 * 删除临时表
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
		abstract void  dropCustGroupTemp(Map<String,Object> inParam)throws StrategyError;
		
		/**
		 * 查询目标客户群数量明细
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
		abstract List<Map<String,Object>> selectCustGroupDetailCountInfo(Map<String, Object> custGroupIdInParam) throws StrategyError;
		
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
		abstract void  loadCustGroupDetailInfo(Map<String,Object> inParam)throws StrategyError;


		abstract void createCustGroupDetailInfoHive (Map<String,Object> inParam) throws StrategyError;
		
	}
	
	
	/**
	 * 客户群标签hive表
	* @date: 2016-10-30 
	* @author: zhangjj_crmpd
	* @title: IRmCustGroupInfoHive 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmCustGroupLabelInfoHive{
		
		
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
		abstract void  createCustGroupLabelInfo(Map<String, Object> inParam,
				Map<String, Object> tempInParam)throws StrategyError;
		
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
		abstract void createRelateStaticLabelCustGroupTableToHive(Map<String, Object> inParam)throws StrategyError;

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
		abstract void  loadCustGroupLabelInfo(Map<String,Object> inParam)throws StrategyError;
		
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
		abstract void insertStaticLabelCustGroupTableInfo(Map<String, Object> inParam)throws StrategyError;
		
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
	public abstract class IRmEvaluateStatisticsInfoHive{

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
		public abstract List<Map<String, Object>> selectMarketCaseOrderNum()throws StrategyError;
	}
	
	/**
	 * hive测试表
	* @date: 2016-11-21 
	* @author: sunliang 
	* @title: IRmHiveTestInfoHive 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmHiveTestInfoHive{
		
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
		abstract List<Map<String,Object>> select(Map<String,Object> tempInParam)throws StrategyError;
	}
	
	/**
	 * hive hbase扩展表测试
	* @date: 2016-11-21 
	* @author: sunliang 
	* @title: IRmHiveTestHbaseInfoHive 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmHiveTestHbaseInfoHive{
		
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
		abstract List<Map<String,Object>> select(Map<String,Object> tempInParam)throws StrategyError;
	}

	/**任务工号表
	* Create on 2016-12-6
	* @author: wangpei
	* @Title:IRmTaskServiceNoInfoHive
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public abstract class IRmTaskServiceNoInfoHive{
		
		/** 增量从hbase外部表同步至hive表
		* @date: 2016-12-6 
		* @author: wangpei
		* @title: loadTaskServiceNoToHive 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		abstract void loadAddTaskServiceNoToHive(Map<String,Object> inParam)throws StrategyError;
	
	}
	
}
