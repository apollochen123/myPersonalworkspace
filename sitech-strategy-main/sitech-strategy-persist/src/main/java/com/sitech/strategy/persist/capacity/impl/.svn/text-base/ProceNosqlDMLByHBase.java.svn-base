package com.sitech.strategy.persist.capacity.impl;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.hbase.IHbaseTableName;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.MD5RowKeyGenerator;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.base.BaseHBaseDB;

/**
 * 非关系型数据操控hbase实现
* @date: 2016-9-12 
* @author: zhaoyue
* @title: ProceNosqlDMLByHBase 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProceNosqlDMLByHBase extends BaseHBaseDB implements INosqlDML,Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1268561281097461190L;

	/**
	 * COC目标客户群明细
	* @date: 2016-11-23 
	* @author: yangwl
	* @title: CocCustomerGroup 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class CocCustomerGroup extends ICocCustomerGroup implements Serializable {
		
		/**
		 * serialVersionUID
		 */
		private static final long serialVersionUID = 6795820020813253868L;

		/**
		 * 查询
		* @date: 2016-11-16 
		* @author: yangwl
		* @title: select 
		* @param tempInParam
		* @param param
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Map<String,Map<String,String>>> select(Map<String, Object> tempInParam){
			Map<String,Map<String,Map<String,String>>> ret = null;
			try {
				ret = hbaseDao.scaneByScope(hbaseTableName.getCocCustomerGroup((String)tempInParam.get("queryDate")), (String)tempInParam.get("startRow"), (String)tempInParam.get("stopRow"), hbaseTableName.getCocCustomerGroupFamily());
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			
			Map<String,Map<String,Map<String,String>>> retMap = new HashMap<String, Map<String,Map<String,String>>>();
			
			if(!CommonUtils.objectIsNull(ret)){
				for(Map.Entry<String, Map<String,Map<String,String>>> me : ret.entrySet()){
					Map<String,Map<String,String>> value = me.getValue();
					String key = CommonUtils.toCamelModel(me.getKey());
					retMap.put(key, value);
				}
			}	
			return retMap;
		}
	}
	
	/**
	 * 受理记录表
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: RmAcceptRecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmAcceptRecordInfo extends IRmAcceptRecordInfo implements Serializable{
		/**
		 * 插入
		* @date: 2017-2-14 
		* @author: yexr
		* @title: insert 
		* @param inParam
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam, Map<String, String> tempInParam) {
			log.info("ProceNosqlDMLByHBase.RmAcceptRecordInfo.insert.tempInParam", tempInParam.toString());
            String rowkey = tempInParam.get(Const.NOSQL_ROWKEY);
			try {
				hbaseDao.insert(hbaseTableName.getAcceptRecord(), rowkey, "a", tempInParam);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
				System.out.println(this.getClass().getName());
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}
	}
	
	/**
	 * 批量push任务表
	* @date: 2016-9-26 
	* @author: sunliang 
	* @title: RmInitiativePushTask 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmBatchPushTaskInfo extends IRmBatchPushTaskInfo implements Serializable{

		/**
		 * 主动push任务插入
		* @date: 2016-12-22 
		* @author: sunliang 
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> tempInParam,Map<String, String> param) {
			
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			String table = hbaseTableName.getBatchPushTask();
			log.info("ProceNosqlDMLByHBase.RmBatchPushTaskInfo.insert.rowKey", rowKey);
			log.info("ProceNosqlDMLByHBase.RmBatchPushTaskInfo.insert.param", param);
			log.info("ProceNosqlDMLByHBase.RmBatchPushTaskInfo.insert.table", table);
			
			try {
				hbaseDao.insert(table, rowKey, "a", param);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			log.info("ProceNosqlDMLByHBase.RmBatchPushTaskInfo.insert.end", "");
			
		}
		
		/**
		 * 根据任务ID查询批量推送任务信息
		* @date: 2016-9-29 
		* @author: yangwl
		* @title: selectBatchPushTaskById 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, String> selectBatchPushTaskById(Map<String,Object> tempInParam) {
			
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			Set set = (Set)tempInParam.get("qualifierSet");
			
			Map<String,String> ret = null;
			Map<String,String> retMap = null;
			try {
				ret = hbaseDao.query(hbaseTableName.getBatchPushTask(), rowKey, "a", set);
				retMap = CommonUtils.toCamelModelByMap(ret);
				
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			
			return retMap;
		}

	}
	
	/** 
	 * 批量push任务异常表
	* @date: 2016-11-5 
	* @author: songxj
	* @title: RmBatchPushTaskExcepInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note: 
	*/
	public class RmBatchPushTaskExcepInfo extends IRmBatchPushTaskExcepInfo implements Serializable {

		/** 
		 * 批量push异常删除
		* @date: 2016-11-5 
		* @author: songxj
		* @title: delete 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void delete(Map<String, Object> tempInParam) {
			
		}
		
		/** 
		 * push任务异常数据插入
		* @date: 2016-11-5 
		* @author: songxj
		* @title: insert 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void insert(Map<String, Object> tempInParam,Map<String,String> param) {
			
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			
			try {
				hbaseDao.insert(hbaseTableName.getBatchPushTaskExcep(), rowKey, "a", param);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}
		
		/** 
		 * 批量push异常查询
		* @date: 2016-11-5 
		* @author: songxj
		* @title: select 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		Map<String, Map<String, Map<String, String>>> select(
				Map<String, Object> tempInParam) {
			return null;
		}
	}
	
	public class RmBatchPushTaskSuccInfo extends IRmBatchPushTaskSuccInfo implements Serializable {

		/** 
		 * push任务异常数据插入
		* @date: 2016-11-5 
		* @author: songxj
		* @title: insert 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void insert(Map<String, Object> tempInParam,Map<String,String> param) {
			
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			
			try {
				hbaseDao.insert(hbaseTableName.getRmBatchPushTaskSuccInfo(), rowKey, "a", param);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}
		
	}
	

	/**
	 * 待发送批量push任务表
	* @date: 2017-1-9 
	* @author: sunliang 
	* @title: RmWaitSendBatchPushTaskInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmWaitSendBatchPushTaskInfo extends IRmWaitSendBatchPushTaskInfo implements Serializable{

		/**
		 * 删除
		* @date: 2017-1-9 
		* @author: sunliang 
		* @title: delete 
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> param) {
			String rowKey = (String) param.get(Const.NOSQL_ROWKEY);
			System.out.println("RmBatchPushTaskIndexInfo.delete.rowKey=" + rowKey);
			try {
				hbaseDao.delete(hbaseTableName.getWaitSendBatchPushTask(), rowKey);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}

		/**
		 * 插入
		* @date: 2017-1-9 
		* @author: sunliang 
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> tempInParam,Map<String,String> param) {
			
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			
			log.debug("ProceNosqlDMLByHBase.RmBatchPushTaskIndexInfo.insert.rowKey", rowKey);
			log.debug("ProceNosqlDMLByHBase.RmBatchPushTaskIndexInfo.insert.param", param);

			try {
				hbaseDao.insert(hbaseTableName.getWaitSendBatchPushTask(), rowKey, "a", param);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}

		/**
		 * 查询
		* @date: 2017-1-9 
		* @author: sunliang 
		* @title: select 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String,Map<String,Map<String,String>>> select(Map<String, Object> tempInParam) {
			Map<String,Map<String,Map<String,String>>> result = null;
			
			String startRow = (String)tempInParam.get("startRow");
			String stopRow = (String)tempInParam.get("stopRow");
 			
			try {
				result = hbaseDao.scaneByScope(hbaseTableName.getWaitSendBatchPushTask(),startRow,stopRow,"");
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			
			if(CommonUtils.objectIsNull(result)){
				result = new HashMap<String,Map<String,Map<String,String>>>();
			}
			
			return result;
		}
	}
	
	/**
	 * 渠道外呼接触表
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: IRmChannelCallContactInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmChannelCallContactInfo extends IRmChannelCallContactInfo implements Serializable{

		/**
		 * 渠道外呼量插入
		* @date: 2017-2-22 
		* @author: tangaq
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> tempInParam, Map<String, String> param) {
			log.info("ProceNosqlDMLByHBase.RmClickRecordInfo.insert.tempInParam", tempInParam.toString());
			log.info("ProceNosqlDMLByHBase.RmClickRecordInfo.insert.param", param.toString());
			String rowkey = param.get(Const.NOSQL_ROWKEY);
			
			try {
				hbaseDao.insert(hbaseTableName.getChannelCallContact(), rowkey, "a", param);
			} catch (Exception e) {
				log.info(this.getClass().getName(), e.getMessage());
			}
			
		}
		
	}
	
	/**
	 * 渠道短信接触表
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: RmChannelSMSContactInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmChannelSMSContactInfo extends IRmChannelSMSContactInfo implements Serializable{

		/**
		 * 渠道短信接触量插入
		* @date: 2017-2-22 
		* @author: tangaq
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> tempInParam, Map<String, String> param) {
			log.info("ProceNosqlDMLByHBase.RmChannelSMSContactInfo.insert.tempInParam", tempInParam.toString());
			log.info("ProceNosqlDMLByHBase.RmChannelSMSContactInfo.insert.param", param.toString());
			String rowkey = param.get(Const.NOSQL_ROWKEY);
			
			try {
				hbaseDao.insert(hbaseTableName.getChannelSMSContact(), rowkey, "a", param);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			
		}
		
	}
	
	/**
	 * 渠道任务表
	* @date: 2016-10-17 
	* @author: sunliang 
	* @title: RmChannelTaskInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmChannelTaskInfo extends IRmChannelTaskInfo implements Serializable{
		
		/**
		 * 渠道任务插入
		* @date: 2016-10-17 
		* @author: sunliang 
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> tempInParam,Map<String,String> param) {

			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			
			log.debug("ProceNosqlDMLByHBase.RmChannelTaskInfo.insert.tempInParam", tempInParam.toString());
			log.debug("ProceNosqlDMLByHBase.RmChannelTaskInfo.insert.param", param.toString());
			
			try {
				hbaseDao.insert(hbaseTableName.getChannelTask(), rowKey, "a", param);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}

		/** 模糊查询渠道任务
		* @date: 2016-12-1 
		* @author: wangpei
		* @title: scanChannelTask 
		* @param startRow
		* @param stopRow
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		Map<String, Map<String, Map<String, String>>> scanChannelTask(String startRow,String stopRow) {
			Map<String,Map<String, Map<String,String>>> ret = null;
			try {
				ret = hbaseDao.scaneByScope(hbaseTableName.getChannelTask(), startRow, stopRow, "a");
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			return ret;
		}

		/** 查询任务
		* @date: 2016-12-5 
		* @author: wangpei
		* @title: select 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		Map<String, String> select(Map<String, Object> tempInParam) {
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			Map<String, String> ret = null;
			Map<String,String> out = new HashMap<String, String>();
			try {
				ret = hbaseDao.query(hbaseTableName.getChannelTask(), rowKey, "a");
				if(!CommonUtils.objectIsNull(ret)){
					for (Map.Entry<String, String> entry:ret.entrySet()) {
						out.put(CommonUtils.toCamelModel(entry.getKey()), entry.getValue());
					}
				}
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			return out;
		}
		
	}
	
	/**点击记录表
	* Create on 2016-11-2
	* @author: wangpei
	* @Title:RmClickRecordInfo
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class RmClickRecordInfo extends IRmClickRecordInfo implements Serializable{
		
		/** 
		 * 点击量插入
		* @date: 2016-11-2 
		* @author: wangpei
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void insert(Map<String, Object> tempInParam, Map<String, String> param) {
			log.info("ProceNosqlDMLByHBase.RmClickRecordInfo.insert.tempInParam", tempInParam.toString());
			log.info("ProceNosqlDMLByHBase.RmClickRecordInfo.insert.param", param.toString());
			String rowkey = param.get(Const.NOSQL_ROWKEY);
			
			try {
				hbaseDao.insert(hbaseTableName.getClickRecord(), rowkey, "a", param);
			} catch (Exception e) {
				log.info("filed", "U filed");
				log.info(this.getClass().getName(), e.getMessage());
			}
			
		}
		
	}
	
	/**
	 * 接触记录表
	* @date: 2016-11-14 
	* @author: yangwl
	* @title: RmContactRecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmContactRecordInfo extends IRmContactRecordInfo implements Serializable{
		
		/**
		 * 插入
		* @date: 2016-11-14 
		* @author: yangwl
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> tempInParam, Map<String, String> param) {
			
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			log.debug("ProceNosqlDMLByHBase.RmContactRecordInfo.insert.tempInParam", tempInParam.toString());
			log.debug("ProceNosqlDMLByHBase.RmContactRecordInfo.insert.param", param.toString());
			
			try {
				hbaseDao.insert(hbaseTableName.getContactRecord(), rowKey, "a", param);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			
		}
		
	}
	
	/**
	 * 目标客户群明细
	* @date: 2016-11-14 
	* @author: yangwl
	* @title: RmCustGroupDetailInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmCustGroupDetailInfo extends IRmCustGroupDetailInfo implements Serializable{			
		
		/**
		 * 创建客户群明细表
		* @date: 2017-2-11
		* @author: luogj
		* @title: createTable 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void createTable(Map<String, Object> inParam) {
			try {
				String tableName = hbaseTableName.getCustGroupDetail(inParam.get("custGroupId").toString());
				String[] cols = new String[]{"a"};
				hbaseDao.createTable(tableName, cols);
			} catch (IOException e) {			
				e.printStackTrace();
			}
		}
		
		/**
		 * 插入客户群明细表
		* @date: 2017-2-23 
		* @author: zhangjj_crmpd
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> insert(Map<String, Object> tempInParam, Map<String, String> param) {
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			try {
				hbaseDao.insert(hbaseTableName.getCustGroupDetail(CommonUtils.toString(tempInParam.get("custGroupId"))) , rowKey, "a", param);
				tempInParam.put("result", true);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
				tempInParam.put("result", false);
			}
			return tempInParam;
		}
		
		
		/**
		 * 根据serviceNo查询目标客户群明细
		* @date: 2016-11-14 
		* @author: yangwl
		* @title: selectCustGroupDetailByServiceNo 
		* @param inParam
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, String> selectCustGroupDetailByIdNo(Map<String, Object> inParam,IQueryFilter queryFilter){
			
			Set set = new HashSet();
			set.add("ID_NO");
			Map<String,String> ret = null;
			try {
				ret = hbaseDao.query(hbaseTableName.getCustGroupDetail(queryFilter.getCustGroupId()), (String)inParam.get("idNo"), "a", set);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			
			Map<String,String> retMap = new HashMap<String, String>();
			if(!CommonUtils.objectIsNull(ret)){
				for(Map.Entry<String, String> me : ret.entrySet()){
					String value = me.getValue();
					String key = CommonUtils.toCamelModel(me.getKey());
					retMap.put(key, value);
				}
			}	
			return retMap;
		}
		

	}
	
	/**客户群自定义标签表
	* Create on 2017-2-21
	* @author: wangpei
	* @Title:RmCustGroupCustomLabelInfo
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class RmCustGroupCustomLabelInfo extends IRmCustGroupCustomLabelInfo implements Serializable{
		
		/**
		 * 插入客户群标签表
		* @date: 2017-2-23 
		* @author: zhangjj_crmpd
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> insert(Map<String, Object> tempInParam, Map<String, String> param) {
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			System.out.println("insert tempInParam:"+tempInParam+",param:"+param);
			try {
				hbaseDao.insert(hbaseTableName.getCustGroupLabel(CommonUtils.toString(tempInParam.get("custGroupId"))) , rowKey, "a", param);
				tempInParam.put("result", true);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
				tempInParam.put("result", false);
			}
			return tempInParam;
		}
		

		/** 查询客户群自定义标签
		* @date: 2017-2-21 
		* @author: wangpei
		* @title: getCustGroupCustomLabelByIdNo 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		Map<String, String> getCustGroupCustomLabelByIdNo(Map<String, Object> tempInParam) {
			Map<String,String> ret = null;
			try {
				ret = hbaseDao.query(hbaseTableName.getCustGroupLabel((String) tempInParam.get("custGroupId")), (String)tempInParam.get("idNo"), "a");
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			return ret;
		}

	}
	
	/**
	 * 黑名单表
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: RmGreyInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmGreyInfo extends IRmGreyInfo implements Serializable{
		
		/**
		 * 删除黑名单
		* @date: 2016-12-5 
		* @author: zhangjj_crmpd
		* @title: delete 
		* @param tempInParam
		* @param param
		* @return 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		 * @throws Exception 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> tempInParam) throws StrategyError {
			try {
				String rowKey = (String) tempInParam.get(Const.NOSQL_ROWKEY);
				hbaseDao.delete(hbaseTableName.getGrey(), rowKey);
			} catch (Exception e) {
				//log.debug(this.getClass().getName(), e.getMessage());
				throw new StrategyError(e);
			}
		}

		/**
		 * 插入黑名单
		* @date: 2016-12-5 
		* @author: zhangjj_crmpd
		* @title: insert 
		* @param tempInParam
		* @param param
		* @return 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		 * @throws Exception 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> tempInParam,
				Map<String, String> param) throws StrategyError {
			try {
				log.debug("insert param", param);
				log.debug("insert tempInParam", tempInParam);
				String rowKey = (String) tempInParam.get(Const.NOSQL_ROWKEY);
				hbaseDao.insert(hbaseTableName.getGrey(), rowKey , "a", param);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
				throw new StrategyError(e);
			}
		}
		
		/**
		 * 查询
		* @date: 2016-11-16 
		* @author: yangwl
		* @title: select 
		* @param tempInParam
		* @param fields
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> select(Map<String, Object> tempInParam, Set<String> fields){
			Map<String,String> ret = null;
			try {
				String rowkey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
				ret = hbaseDao.query(hbaseTableName.getGrey(), rowkey, "a");
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			
			Map<String,Object> retMap = new HashMap<String, Object>();
			if(!CommonUtils.objectIsNull(ret)){
				for(Map.Entry<String, String> me : ret.entrySet()){
					String value = me.getValue();
					String key = CommonUtils.toCamelModel(me.getKey());
					retMap.put(key, value);
				}
			}	
			return retMap;
		}

	}
	
	/**
	 * hbase测试表
	* @date: 2016-11-20 
	* @author: sunliang 
	* @title: RmHbaseTestInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmHbaseTestInfo extends IRmHbaseTestInfo implements Serializable{
		
		/**
		 * 插入
		* @date: 2016-11-20 
		* @author: sunliang 
		* @title: insert 
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, String> param) {
			
			String rowKey = param.get(Const.NOSQL_ROWKEY);
			
			try {
				hbaseDao.insert(hbaseTableName.getHbaseTest(), rowKey, "a", param);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}

		/**
		 * 查询
		* @date: 2016-11-20 
		* @author: sunliang 
		* @title: select 
		* @param tempInParam
		* @param fields
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, String> select(Map<String, Object> tempInParam,
				Set<String> fields) {
			
			Map<String,String> ret = null;
			try {
				ret = hbaseDao.query(hbaseTableName.getHbaseTest(), (String)tempInParam.get(Const.NOSQL_ROWKEY), "a");
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			return ret;
		}
		
	}
	
	/**
	 * 工号信息表
	* Create on 2016-11-14
	* @author: wangpei
	* @Title:RmLoginMsgInfo
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class RmLoginMsgInfo extends IRmLoginMsgInfo implements Serializable{

		/** 
		* @date: 2016-11-14 
		* @author: wangpei
		* @title: getLoginMsgByLoginNo 
		* @param loginNo
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		Map<String, String> getLoginMsgByLoginNo(String loginNo) {
			Map<String,String> ret = null;
			Map<String,String> out = new HashMap<String, String>();
			try {
				ret = hbaseDao.query(hbaseTableName.getLoginMsg(), loginNo, "a");
				if(!CommonUtils.objectIsNull(ret)){
					for (Map.Entry<String, String> entry:ret.entrySet()) {
						out.put(CommonUtils.toCamelModel(entry.getKey()), entry.getValue());
					}
				}
				
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			return out;
		}
		
	}
	
	/**
	 * 操作日志信息表
	* @date: 2017-3-9 
	* @author: yueyi
	* @title: RmOperLogInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmOperLogInfo extends IRmOperLogInfo implements Serializable{
		
		/** 
		 * 插入操作日志
		* @date: 2017-3-9 
		* @author: yueyi
		* @title: insertOperLogInfo 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/		
		@Override
		void insertOperLogInfo(Map<String,String> tempInParam) {			
			String rowKey = (String) tempInParam.get(Const.NOSQL_ROWKEY);
			log.info("第六步ok", rowKey);
			try {
				log.info("第七步ok",hbaseTableName.getOperLogInfo());
				hbaseDao.insert(hbaseTableName.getOperLogInfo(), rowKey , "a", tempInParam);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}		
	}
	
/*	*//**
	 * 营销案推荐统计表
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: RmMarketCaseRecommendTotalInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 *//*
	public class RmMarketCaseRecommendTotalInfo extends IRmMarketCaseRecommendTotalInfo implements Serializable{
		
		*//**
		 * 插入
		* @date: 2016-11-17 
		* @author: yangwl
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 *//*
		@Override
		void insert(Map<String, Object> tempInParam, Map<String, String> param) {
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			try {
				hbaseDao.insert(hbaseTableName.getMarketCaseRecommendtotal(), rowKey, "a", param);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}
		
		*//**
		 * 查询
		* @date: 2016-11-16 
		* @author: yangwl
		* @title: select 
		* @param tempInParam
		* @param param
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 *//*
		@Override
		Map<String, Object> select(Map<String, Object> tempInParam, Set<String> fields){
			Map<String,String> ret = null;
			try {
				ret = hbaseDao.query(hbaseTableName.getMarketCaseRecommendtotal(), (String)tempInParam.get(Const.NOSQL_ROWKEY), "a", fields);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			
			Map<String,Object> retMap = new HashMap<String, Object>();
			if(!CommonUtils.objectIsNull(ret)){
				for(Map.Entry<String, String> me : ret.entrySet()){
					String value = me.getValue();
					String key = CommonUtils.toCamelModel(me.getKey());
					retMap.put(key, value);
				}
			}	
			return retMap;
		}
		
	}*/
	
	/**
	 * 推送到达表
	* @date: 2016-10-20 
	* @author: sunliang 
	* @title: RmPushArriveInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmPushArriveInfo extends IRmPushArriveInfo implements Serializable{

		private static final long serialVersionUID = 6363207774154918143L;
		
		/**
		 * 推送到达量插入
		* @date: 2016-10-20 
		* @author: sunliang 
		* @title: insert 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> tempInParam,Map<String,String> param) {
			log.info("ProceNosqlDMLByHBase.RmSMSPullInfo.insert.tempInParam", tempInParam.toString());
			log.info("ProceNosqlDMLByHBase.RmSMSPullInfo.insert.param", param.toString());
			String seqId = (String)param.get(Const.NOSQL_ROWKEY);

			try {
				hbaseDao.insert(hbaseTableName.getPushArrive(), seqId, "a", param);
			} catch (Exception e) {
				log.info(this.getClass().getName(), e.getMessage());
			}
		}
		
	}
	
	/**
	 * 回单记录表
	* Create on 2016-11-3
	* @author: wangpei
	* @Title:RmReceiptRecordInfo
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class RmReceiptRecordInfoHbase extends IRmReceiptRecordInfo implements Serializable{

		/** 插入回单记录
		* @date: 2016-11-3 
		* @author: wangpei
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void insert(Map<String, Object> tempInParam, Map<String, String> param) {
			//log.info("ProceNosqlDMLByHBase.RmReceiptRecordInfo.insert.tempInParam", tempInParam.toString());
			//log.info("ProceNosqlDMLByHBase.RmReceiptRecordInfo.insert.param", param.toString());
			
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			CommonUtils.mapValueIsNullRepByStr(param);
			
			try {
				hbaseDao.insert(hbaseTableName.getReceiptRecord(), rowKey, "a", param);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}
		
	}
	
	/**
	 * 推荐受理记录表
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: RmRecomAcceptRecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmRecomAcceptRecordInfo extends IRmRecomAcceptRecordInfo implements Serializable{
		
	}
	
	/**
	 * 推荐关闭表
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: RmRecommendCloseInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmRecommendCloseInfo extends IRmRecommendCloseInfo implements Serializable{
		
		/**
		 * 查询
		* @date: 2016-11-28 
		* @author: yangwl
		* @title: select 
		* @param tempInParam
		* @param fields
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> select(Map<String, Object> tempInParam){
			Map<String,String> ret = null;
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			try {
				ret = hbaseDao.query(hbaseTableName.getRecommendClose(), rowKey, "a");
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			
			Map<String,Object> retMap = new HashMap<String, Object>();
			if(!CommonUtils.objectIsNull(ret)){
				for(Map.Entry<String, String> me : ret.entrySet()){
					String value = me.getValue();
					String key = CommonUtils.toCamelModel(me.getKey());
					retMap.put(key, value);
				}
			}	
			return retMap;
		}

		/** 插入
		* @date: 2016-11-30 
		* @author: wangpei
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void insert(Map<String, Object> tempInParam, Map<String, String> param) {
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			try {
				hbaseDao.insert(hbaseTableName.getRecommendClose(), rowKey, "a", "key","value");
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}
	}
	
	/** 
	 * 推荐记录表
	* @date: 2016-11-5 
	* @author: songxj
	* @title: RmRecommendRecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note: 
	*/
	public class RmRecommendRecordInfo extends IRmRecommendRecordInfo implements Serializable{
		
		/** 
		 * 插入记录
		* @date: 2016-11-5 
		* @author: songxj
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void insert(Map<String, Object> tempInParam, Map<String, String> param) {
			String rowkey = (String) tempInParam.get(Const.NOSQL_ROWKEY);
			try {
				hbaseDao.insert(hbaseTableName.getRecommendReord(), rowkey, "a", param);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}

		/**
		 * 查询记录
		* @date: 2017-2-16 
		* @author: tangaq
		* @title: select 
		* @param seqId
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, String> select(String idNo) {
			Map<String,String> ret = null;
			Map<String,String> out = new HashMap<String, String>();
			try {
				log.info("===getRecommendRecordNo========idNo====", idNo);
				ret = hbaseDao.query(hbaseTableName.getRecommendReord(), idNo, "a");
				log.info("===getRecommendRecordNo========ret====", ret);
				if(!CommonUtils.objectIsNull(ret)){
					for (Map.Entry<String, String> entry:ret.entrySet()) {
						out.put(CommonUtils.toCamelModel(entry.getKey()), entry.getValue());
					}
				}
			} catch (Exception e) {
				log.info("error:", e.getMessage());
				e.getStackTrace();
				log.debug(this.getClass().getName(), e.getMessage());
			}
			System.out.println("show hbaseTableName.getRecommendReord():"+out);
			return out;
			
		}
		
	}
	
	/**
	 * 用户推荐记录表
	* @date: 2017-4-10 
	* @author: zhangyw_crmpd
	* @title: RmUserRecommendMarketCaseInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmUserRecommendMarketCaseInfo extends IRmUserRecommendMarketCaseInfo implements Serializable{
		
		/**
		 * 插入信息
		* @date: 2017-4-10 
		* @author: zhangyw_crmpd
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> tempInParam, Map<String, String> param) {
			String rowkey = (String) tempInParam.get(Const.NOSQL_ROWKEY);
			try {
				hbaseDao.insert(hbaseTableName.getUserRecommendMarketCase(), rowkey, "a", param);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}
		
		/**
		 * 查询信息
		* @date: 2017-4-10 
		* @author: zhangyw_crmpd
		* @title: select 
		* @param idNo
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, String> select(String idNo) {
			Map<String,String> ret = null;
			Map<String,String> out = new HashMap<String, String>();
			try {
				log.info("===getRecommendRecordNo========idNo====", idNo);
				ret = hbaseDao.query(hbaseTableName.getUserRecommendMarketCase(), idNo, "a");
				log.info("===getRecommendRecordNo========ret====", ret);
				if(!CommonUtils.objectIsNull(ret)){
					for (Map.Entry<String, String> entry:ret.entrySet()) {
						out.put(CommonUtils.toCamelModel(entry.getKey()), entry.getValue());
					}
				}
			} catch (Exception e) {
				log.info("error:", e.getMessage());
				e.getStackTrace();
				log.debug(this.getClass().getName(), e.getMessage());
			}
			System.out.println("show hbaseTableName.getRecommendReord():"+out);
			return out;
			
		}
		
	}
	
	/**
	 * 短信受理记录表
	* Create on 2016-11-3
	* @author: wangpei
	* @Title:RmSMSAcceptRecordInfo
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class RmSMSAcceptRecordInfo extends IRmSMSAcceptRecordInfo implements Serializable{
		
		/** 插入短信受理记录
		* @date: 2016-11-3 
		* @author: wangpei
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void insert(Map<String, Object> tempInParam, Map<String, String> param) {
			log.info("ProceNosqlDMLByHBase.RmSMSPullInfo.insert.tempInParam", tempInParam.toString());
			log.info("ProceNosqlDMLByHBase.RmSMSPullInfo.insert.param", param.toString());
			String rowkey = param.get(Const.NOSQL_ROWKEY);
			
			try {
				hbaseDao.insert(hbaseTableName.getSmsPull(), rowkey, "a", param);
			} catch (Exception e) {
				log.info(this.getClass().getName(), e.getMessage());
			}
		}
		
	}
	
	/**
	* 短信上行表
	* Create on 2016-11-3
	* @author: wangpei
	* @Title:RmSMSPullInfo
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class RmSMSPullInfo extends IRmSMSPullInfo implements Serializable{

		/** 
		 * 短信上行量插入
		* @date: 2016-11-3 
		* @author: wangpei
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void insert(Map<String, Object> tempInParam, Map<String, String> param) {
			log.info("ProceNosqlDMLByHBase.RmSMSPullInfo.insert.tempInParam", tempInParam.toString());
			log.info("ProceNosqlDMLByHBase.RmSMSPullInfo.insert.param", param.toString());
			String rowkey = param.get(Const.NOSQL_ROWKEY);
			
			try {
				hbaseDao.insert(hbaseTableName.getSmsPull(), rowkey, "a", param);
			} catch (Exception e) {
				log.info(this.getClass().getName(), e.getMessage());
			}
		}
		
	}
	
	/**
	 * 用户信息
	* @date: 2016-9-21 
	* @author: sunliang 
	* @title: RmUserInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmUserInfo extends IRmUserInfo implements Serializable{

		/**
		 * 根据phoneNo查询idNo
		* @date: 2016-10-18 
		* @author: sunliang 
		* @title: getIdNoByPhoneNo 
		* @param phoneNo
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		String getIdNoByPhoneNo(String phoneNo) {
			Set<String> fields = new HashSet<String>();
			fields.add("ID_NO");
			
			Map<String,String> ret = null;
			try {
				ret = hbaseDao.query(hbaseTableName.getUser(), phoneNo, "a", fields);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			return (String)ret.get("ID_NO");
		}

		/** 根据idNo查询用户资料
		* @date: 2016-11-14 
		* @author: wangpei
		* @title: getUserInfoByIdNo 
		* @param IdNo
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		Map<String, String> getUserInfoByIdNo(String idNo) {
			Map<String,String> ret = null;
			Map<String,String> out = new HashMap<String, String>();
			try {
				log.info("===getUserInfoByIdNo========idNo====", idNo);
				ret = hbaseDao.query(hbaseTableName.getUser(), idNo, "a");
				log.info("===getUserInfoByIdNo========ret====", ret);
				if(!CommonUtils.objectIsNull(ret)){
					for (Map.Entry<String, String> entry:ret.entrySet()) {
						out.put(CommonUtils.toCamelModel(entry.getKey()), entry.getValue());
					}
				}
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			return out;
		}
		
	}
	
	/**
	 * 用户受理营销案表
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: RmUserAcceptMarketCaseInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmUserAcceptMarketCaseInfo extends IRmUserAcceptMarketCaseInfo implements Serializable{

		/**
		 * 查询
		* @date: 2016-11-16 
		* @author: yangwl
		* @title: select 
		* @param tempInParam
		* @param fields
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> select(Map<String, Object> tempInParam, Set<String> fields){
			Map<String,String> ret = null;
			try {
				ret = hbaseDao.query(hbaseTableName.getUserAcceptMarketCase(), (String)tempInParam.get(Const.NOSQL_ROWKEY), "a");
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			
			Map<String,Object> retMap = new HashMap<String, Object>();
			if(!CommonUtils.objectIsNull(ret)){
				for(Map.Entry<String, String> me : ret.entrySet()){
					String value = me.getValue();
					String key = CommonUtils.toCamelModel(me.getKey());
					retMap.put(key, value);
				}
			}	
			return retMap;
		}

		/**
		 * 插入
		* @date: 2017-4-8 
		* @author: zhangyw_crmpd
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> tempInParam, Map<String, String> param) {
			log.info("ProceNosqlDMLByHBase.RmSMSPullInfo.insert.tempInParam", tempInParam.toString());
			log.info("ProceNosqlDMLByHBase.RmSMSPullInfo.insert.param", param.toString());
			String rowkey = param.get(Const.NOSQL_ROWKEY);
			
			try {
				hbaseDao.insert(hbaseTableName.getSmsPull(), rowkey, "a", param);
			} catch (Exception e) {
				log.info(this.getClass().getName(), e.getMessage());
			}
		}
	}
	
	/**
	 * 用户标签
	* @date: 2016-9-21 
	* @author: sunliang 
	* @title: RmUserLabelInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmUserLabelInfo extends IRmUserLabelInfo implements Serializable{

		/**
		 * 根据idNo查询用户标签
		* @date: 2016-10-18 
		* @author: sunliang 
		* @title: getUserLabelById 
		* @param idNo
		* @param fields
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, String> getUserLabelByIdNo(String idNo,Set<String> fields) {
			
			StringBuffer sb = new StringBuffer(idNo);
			StringBuffer sbu = sb.reverse();
			
			log.info("=================getUserLabelByIdNo.sbu=========================",sbu.toString());
			
			Map<String,String> ret = null;
			try {
				ret = hbaseDao.query(hbaseTableName.getUserLabel(), sbu.toString(), "a");
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			return ret;
		}

		/**
		 * 根据手机号码查询用户标签
		* @date: 2016-10-28 
		* @author: yangwl
		* @title: getUserLabelByPhoneNo 
		* @param phoneNo
		* @param fields
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, String> getUserLabelByPhoneNo(String phoneNo,
				Set<String> fields) {
			Map<String,String> ret = null;
			try {
				ret = hbaseDao.query(hbaseTableName.getUserLabel(), phoneNo, "a", fields);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			return ret;
		}

	}
	
	/**
	 * 用户推荐控制表
	* @date: 2016-11-15 
	* @author: yangwl
	* @title: RmUserRecommendControl 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmUserRecommendControlInfo extends IRmUserRecommendControlInfo implements Serializable{
		
		/**
		 * 插入
		* @date: 2016-11-15 
		* @author: yangwl
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> tempInParam, Map<String, String> param) {
			
			try {
				log.debug("RmUserRecommendControlInfo.insert.tempInParam", tempInParam);
				log.debug("RmUserRecommendControlInfo.insert.param", param);
				hbaseDao.insert(hbaseTableName.getUserRecommendControl(),(String)tempInParam.get(Const.NOSQL_ROWKEY), "a", param);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
		}
		
		/**
		 * 查询
		* @date: 2016-11-15 
		* @author: yangwl
		* @title: select 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> select(Map<String, Object> tempInParam, Set<String> fields) {
			String rowKey = (String)tempInParam.get(Const.NOSQL_ROWKEY);
			Map<String,String> ret = null;
			try {
				ret = hbaseDao.query(hbaseTableName.getUserRecommendControl(), rowKey ,"a", fields);
			} catch (Exception e) {
				log.debug(this.getClass().getName(), e.getMessage());
			}
			
			Map<String,Object> retMap = new HashMap<String, Object>();
			if(!CommonUtils.objectIsNull(ret)){
				for(Map.Entry<String, String> me : ret.entrySet()){
					String value = me.getValue();
					String key = CommonUtils.toCamelModel(me.getKey());
					retMap.put(key, value);
				}
			}	
			return retMap;
		}
		
	}
	
	/**
	 * 用户转换关系表
	* @date: 2016-11-14 
	* @author: yangwl
	* @title: RmUserRelInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmUserRelInfo extends IRmUserRelInfo implements Serializable{

		/**
		 * 根据serviceNo查询IdNo
		* @date: 2016-11-14 
		* @author: yangwl
		* @title: getIdNoByServiceNo 
		* @param serviceNo
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		String getIdNoByServiceNo(String serviceNo) {
			Set<String> fields = new HashSet<String>();
			fields.add("ID_NO");
			
			Map<String,String> ret = null;
			try {
				log.debug("getIdNoByServiceNo.serviceNo", serviceNo);
				ret = hbaseDao.query(hbaseTableName.getUserRel(), serviceNo, "a", fields);
				log.debug("getIdNoByServiceNo.ret", ret);
			} catch (Exception e) {
				e.printStackTrace();
			}
			if(CommonUtils.objectIsNull(ret)){
				return null;
			}
			return (String)ret.get("ID_NO");
		}
		
	}
	
}
