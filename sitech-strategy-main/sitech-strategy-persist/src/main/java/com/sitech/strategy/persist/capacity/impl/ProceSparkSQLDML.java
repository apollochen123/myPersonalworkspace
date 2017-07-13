package com.sitech.strategy.persist.capacity.impl;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.hbase.IHbaseTableName;
import com.sitech.strategy.common.pojo.inter.hive.IHiveDBName;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.base.BaseSparkSQLDB;

/**
 *  操作数控sparkSQL实现
* @date: 2016-9-12 
* @author: zhaoyue
* @title: ProceSparkSQLDML 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProceSparkSQLDML extends BaseSparkSQLDB implements ISparkSQLDML {
			
	/**
	 * 渠道任务
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: RmChannelTaskInfoSpark 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmChannelTaskInfoSpark extends IRmChannelTaskInfoSpark implements Serializable{
		
		/**
		 * 查询客户经理任务列表
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
		List<Map<String, Object>> selectChannelTaskList(Map<String, Object> tempInParam) throws StrategyError{
			log.debug("=========selecChannelTaskList====tempInParam==", tempInParam);
			String channelTaskSql = sparkStatement.getSelectChannelTaskListSql(tempInParam);
			if(CommonUtils.objectIsNull(channelTaskSql)){
				return null;
			}
			sparkSQLUtil.executeSql(sparkStatement.getUseDatabaseSql(tempInParam));
			List<Map<String,Object>> returnList = sparkSQLUtil.executeQuerySQL(channelTaskSql);
			List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
			if (!CommonUtils.objectIsNull(returnList)) {
				System.out.println("==========temp============"+returnList.get(0));
				for (Map<String, Object> map : returnList) {
					Map<String, Object> o = new HashMap<String, Object>();
					for(Map.Entry<String, Object> e:map.entrySet()){
						o.put(CommonUtils.toCamelModel(e.getKey()), e.getValue());
					}
					outList.add(o);
				}
				System.out.println("==========outtemp============"+outList.get(0));
			}
			return outList;
		}
		
		/**
		 * 查询客户列表
		* @date: 2016-10-17 
		* @author: yangwl
		* @title: selectCustList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		List<Map<String, Object>> selectCustList(Map<String, Object> tempInParam) throws StrategyError{
			sparkSQLUtil.executeSql(sparkStatement.getSelectCustListSql(tempInParam));
			String channelTaskSql = sparkStatement.getSelectCustListSql(tempInParam);
			if(CommonUtils.objectIsNull(channelTaskSql)){
				return null;
			}
			List<Map<String,Object>> returnList = sparkSQLUtil.executeQuerySQL(channelTaskSql);
			List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
			if (!CommonUtils.objectIsNull(returnList)) {
				System.out.println("==========temp============"+returnList.get(0));
				for (Map<String, Object> map : returnList) {
					Map<String, Object> o = new HashMap<String, Object>();
					for(Map.Entry<String, Object> e:map.entrySet()){
						o.put(CommonUtils.toCamelModel(e.getKey()), e.getValue());
					}
					outList.add(o);
				}
				System.out.println("==========outtemp============"+outList.get(0));
			}
			return outList;
		}
		
		/**
		 * 查询营销案列表
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
		List<Map<String, Object>> selectMarketCaseList(Map<String, Object> tempInParam) throws StrategyError{
			String channelTaskSql = sparkStatement.getSelectCustListSql(tempInParam);
			if(CommonUtils.objectIsNull(channelTaskSql)){
				return null;
			}
			sparkSQLUtil.executeSql(sparkStatement.getSelectMarketCaseListSql(tempInParam));
			List<Map<String,Object>> returnList = sparkSQLUtil.executeQuerySQL(channelTaskSql);
			List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
			if (!CommonUtils.objectIsNull(returnList)) {
				System.out.println("==========temp============"+returnList.get(0));
				for (Map<String, Object> map : returnList) {
					Map<String, Object> o = new HashMap<String, Object>();
					for(Map.Entry<String, Object> e:map.entrySet()){
						o.put(CommonUtils.toCamelModel(e.getKey()), e.getValue());
					}
					outList.add(o);
				}
				System.out.println("==========outtemp============"+outList.get(0));
			}
			return outList;
		}
		
		/**
		 * 查询任务列表
		* @date: 2016-10-17 
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
		List<Map<String, Object>> selectTaskList(Map<String, Object> tempInParam) throws StrategyError{
			String channelTaskSql = sparkStatement.getSelectCustListSql(tempInParam);
			if(CommonUtils.objectIsNull(channelTaskSql)){
				return null;
			}
			sparkSQLUtil.executeSql(sparkStatement.getSelectMarketCaseListSql(tempInParam));
			List<Map<String,Object>> returnList = sparkSQLUtil.executeQuerySQL(channelTaskSql);
			List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
			if (!CommonUtils.objectIsNull(returnList)) {
				System.out.println("==========temp============"+returnList.get(0));
				for (Map<String, Object> map : returnList) {
					Map<String, Object> o = new HashMap<String, Object>();
					for(Map.Entry<String, Object> e:map.entrySet()){
						o.put(CommonUtils.toCamelModel(e.getKey()), e.getValue());
					}
					outList.add(o);
				}
				System.out.println("==========outtemp============"+outList.get(0));
			}
			return outList;
		}

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
		@Override
		@Deprecated
		List<Map<String, Object>> selectTaskListByPage(
				Map<String, Object> tempInParam) throws StrategyError {
			String channelTaskSql = sparkStatement.getSelectCustListSql(tempInParam);
			if(CommonUtils.objectIsNull(channelTaskSql)){
				return null;
			}
			sparkSQLUtil.executeSql(sparkStatement.getSelectMarketCaseListSql(tempInParam));
			List<Map<String,Object>> returnList = sparkSQLUtil.executeQuerySQL(channelTaskSql);
			List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
			if (!CommonUtils.objectIsNull(returnList)) {
				for (Map<String, Object> map : returnList) {
					Map<String, Object> o = new HashMap<String, Object>();
					for(Map.Entry<String, Object> e:map.entrySet()){
						o.put(CommonUtils.toCamelModel(e.getKey()), e.getValue());
					}
					outList.add(o);
				}
			}
			return outList;
		}
	}
	/**推荐关闭
	* Create on 2016-12-7
	* @author: wangpei
	* @Title:RmRecommonedCloseInfoSpark
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class RmRecommonedCloseInfoSpark extends IRmRecommonedCloseInfoSpark implements Serializable{

		/** 
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
		@Override
		void insert(Map<String, Object> tempInParam) throws StrategyError {
			sparkSQLUtil.executeSql(sparkStatement.getUseDatabaseSql(tempInParam));
			sparkSQLUtil.executeSql(sparkStatement.getInsertRmRecommonedCloseInfoSql(tempInParam));
		}
		
	}
	/**
	 * spark sql hive表测试
	* @date: 2016-11-21 
	* @author: sunliang 
	* @title: RmHiveTestInfoSpark 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmHiveTestInfoSpark extends IRmHiveTestInfoSpark {

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
			sparkSQLUtil.executeSql(sparkStatement.getUseDatabaseSql(tempInParam));
			List<Map<String, Object>> retList = sparkSQLUtil.executeQuerySQL(sparkStatement.getSelectHiveTestSql(tempInParam));
			return retList;
		}
		
	}
	
	/**
	 * 
	* @date: 2016-11-21 
	* @author: sunliang 
	* @title: RmHiveTestHbaseInfoSpark 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmHiveTestHbaseInfoSpark extends IRmHiveTestHbaseInfoSpark {

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
			sparkSQLUtil.executeSql("use clzxdb");
			List<Map<String, Object>> retList = sparkSQLUtil.executeQuerySQL(sparkStatement.getSelectHiveOnHbaseTestSql(tempInParam));
			return retList;
		}
		
	}
	
	/**
	 * 用户标签
	* @date: 2017-2-10 
	* @author: zhangjj_crmpd
	* @title: RmUserLabelInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmUserLabelInfo extends IRmUserLabelInfo implements Serializable{

		/**
		 * 查询符合标签的客户群数量
		* @date: 2017-2-10 
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
		@Override
		List<Map<String, Object>> selectCustGroupCountByUserLabel(
				Map<String, Object> tempInParam) throws StrategyError {
			log.info("------------------sql---------------", sparkStatement.getselectCustGroupCountByUserLabelSql(tempInParam));
			return sparkSQLUtil.executeQuerySQL(sparkStatement.getselectCustGroupCountByUserLabelSql(tempInParam));
		}

		/**
		 * 查询表的count
		* @date: 2017-4-3 
		* @author: chenhao
		* @title: selectCustGroupDetailCountInSparkTable 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectCustGroupDetailCountInSparkTable(Map<String, Object> tempInParam) throws StrategyError {
			List<Map<String,Object>> list =sparkSQLUtil.executeQuerySQL(sparkStatement.getselectCustGroupDetailCountInSparkTable(tempInParam));
			return list.get(0);
		}

		/**
		 * 查询2次标签过滤后的人数
		* @date: 2017-4-8 
		* @author: chenhao
		* @title: selectLabelFormulaRestrictCountById 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectLabelFormulaRestrictCountById(Map<String, Object> inParam) throws StrategyError {
			return sparkSQLUtil.executeQuerySQL(sparkStatement.getselectLabelFormulaRestrictCountSql(inParam));
		}
		
	}
	
	/**
	* 客户群明细
	* @date: 2017-2-10
	* @author: luogj
	* @title: RmCustgroupDetailInfoSpark 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmCustgroupDetailInfoSpark  extends IRmCustgroupDetailInfoSpark implements Serializable{
		
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
		 * 插入
		* @date: 2017-2-11
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
		@Override
		void insert(Map<String, Object> tempInParam)
				throws StrategyError {
			sparkSQLUtil.executeSql("use " + hiveDBName.getHiveDatabase());					
			sparkSQLUtil.executeSql(sparkStatement.getInsertCustGroupDetailInfoSql(tempInParam));
		}

		/**
		 * 插入
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
		@Override
		void create(Map<String, Object> tempInParam) throws StrategyError {
			sparkSQLUtil.executeSql("use " + hiveDBName.getHiveDatabase());
			sparkSQLUtil.executeSql(sparkStatement.getCreateCustGroupDetailInfoHiveSql(tempInParam));
		}
		
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
		@Override
		void insertLabelFileDynamic(Map<String,Object> inParam)throws StrategyError{
			sparkSQLUtil.executeSql("use " + hiveDBName.getHiveDatabase());
			sparkSQLUtil.executeSql(sparkStatement.getInsertLabelCustGroupDetailFileDynamicSql(inParam));
		}
		
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
		@Override
		void insertLabelFileStatic(Map<String,Object> inParam)throws StrategyError{
			sparkSQLUtil.executeSql("use " + hiveDBName.getHiveDatabase());
			sparkSQLUtil.executeSql(sparkStatement.getInsertLabelCustGroupDetailFileStaticSql(inParam));
		}

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
		@Override
		List<Map<String, Object>> selectCustGroupDetailCountInfo(
				Map<String, Object> inParam) throws StrategyError {
			List<Map<String,Object>> resultList = sparkSQLUtil.executeQuerySQL(sparkStatement.getSelectCustGroupCountDetailInfoSQL(inParam));
			return resultList;
		}
	}
}
