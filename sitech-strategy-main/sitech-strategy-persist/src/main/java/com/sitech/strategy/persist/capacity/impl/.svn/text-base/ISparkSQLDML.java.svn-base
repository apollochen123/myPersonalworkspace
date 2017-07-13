package com.sitech.strategy.persist.capacity.impl;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * spark SQL操控接口
* @date: 2016-9-12 
* @author: zhaoyue
* @title: ISparkSQLDML 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ISparkSQLDML {
	
	/**
	 * 评估整合统计
	* @date: 2016-9-21 
	* @author: sunliang 
	* @title: IRmEvaluateTotalInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmEvaluateTotalInfo{
		
	}
	
	/**
	 * 渠道任务
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: IRmChannelTaskInfoSpark 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmChannelTaskInfoSpark{
		
		/**
		 * 查询渠道任务列表
		* @date: 2016-10-20 
		* @author: yangwl
		* @title: selectChannelTaskList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>> selectChannelTaskList(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 查询客户列表
		* @date: 2016-10-15 
		* @author: yangwl
		* @title: selectMarketCaseList 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>> selectCustList(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 查询营销案列表
		* @date: 2016-10-20 
		* @author: yangwl
		* @title: selectMarketCaseList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>> selectMarketCaseList(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 查询任务列表
		* @date: 2016-10-20 
		* @author: yangwl
		* @title: selectTaskList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>> selectTaskList(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 分页查询任务列表
		* @date: 2016-12-15 
		* @author: zhangjj_crmpd
		* @title: selectTaskListByPage 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>> selectTaskListByPage(Map<String, Object> tempInParam) throws StrategyError; 
	}
	
	/**推荐关闭
	* Create on 2016-12-7
	* @author: wangpei
	* @Title:IRmRecommonedCloseInfoSpark
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public abstract class IRmRecommonedCloseInfoSpark{
		
		/** 插入推荐关闭hive表
		* @date: 2016-12-7 
		* @author: wangpei
		* @title: insert 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		abstract void insert (Map<String, Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * spark sql hive表测试
	* @date: 2016-11-21 
	* @author: sunliang 
	* @title: IRmHiveTestInfoSpark 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmHiveTestInfoSpark{
		
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
	 * spark sql hive hbase扩展表测试
	* @date: 2016-11-21 
	* @author: sunliang 
	* @title: IRmHiveTestHbaseInfoSpark 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmHiveTestHbaseInfoSpark{
		
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
	 * 用户标签
	* @date: 2016-9-21 
	* @author: sunliang 
	* @title: IRmUserLabelInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmUserLabelInfo{
		
		/**
		 * 查询符合标签的客户群数量
		* @date: 2017-1-24 
		* @author: zhangjj_crmpd
		* @title: selectCustGroupCountByUserLabel 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>> selectCustGroupCountByUserLabel(Map<String, Object> tempInParam) throws StrategyError;


		abstract List<Map<String, Object>> selectLabelFormulaRestrictCountById(Map<String, Object> inParam) throws StrategyError;
		/**
		 * 查询表的count
		* @date: 2017-4-3 
		* @author: chenhao
		* @title: selectCustGroupDetailCountInSparkTable 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String, Object> selectCustGroupDetailCountInSparkTable(Map<String, Object> tempInParam) throws StrategyError;
	
	}
	
	/**
	* 客户群明细
	* @date: 2017-2-10
	* @author: luogj 
	* @title: IRmCustgroupDetailInfoSpark 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmCustgroupDetailInfoSpark{

		/**
		 * 创建表
		* @date: 2017-2-11
		* @author: luogj 
		* @title: create 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void create(Map<String,Object> tempInParam)throws StrategyError;
		
		/**
		 * 插入
		* @date: 2017-2-10
		* @author: luogj 
		* @title: insert 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> tempInParam)throws StrategyError;
		
		/**
		 * 将动态标签客户群明细的数据插入到文件中
		* @date: 2017-2-16
		* @author: luogj 
		* @title: insertLabelFileDynamic 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insertLabelFileDynamic(Map<String,Object> inParam)throws StrategyError;
		
		/**
		 * 将静态标签客户群明细的数据插入到文件中
		* @date: 2017-2-16
		* @author: luogj 
		* @title: insertLabelFileStatic 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insertLabelFileStatic(Map<String,Object> inParam)throws StrategyError;	
		
		/**
		 * 查询目标客户群数量明细
		* @date: 2017-3-4 
		* @author: zhangjj_crmpd
		* @title: selectCustGroupDetailCountInfo 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> selectCustGroupDetailCountInfo(Map<String,Object> inParam)throws StrategyError;		
	}

}
