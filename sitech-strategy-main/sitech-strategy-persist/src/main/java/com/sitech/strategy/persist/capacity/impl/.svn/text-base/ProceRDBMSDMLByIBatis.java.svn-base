package com.sitech.strategy.persist.capacity.impl;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.base.BaseIBatisDB;

/**
 * 关系型数据操控oracle实现
* @date: 2016-9-10 
* @author: zhaoyue
* @title: ProceRDBMSDMLByIBatis 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProceRDBMSDMLByIBatis extends BaseIBatisDB implements IRDBMSDML,Serializable {
	
	/**
	 * 测试
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: TestTable 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class TestTable extends ITestTable implements Serializable {
		
		/**
		 * 插入
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisTesttableInsert(), inParam);
		}	
	}
	
	/**
	 * 公共数据
	* @date: 2016-9-19 
	* @author: zhaoyue
	* @title: CommonInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class CommonInfo extends ICommonInfo implements Serializable{
		
		/**
		 * 查询codename
		* @date: 2016-10-31 
		* @author: wangth
		* @Title: selectCodeName 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectCodeName(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisCodenameSelect(), queryFilter);
			return list;
		}
		
		/**
		 * 查询数据库系统时间
		* @date: 2016-10-19 
		* @author: yangwl
		* @title: selectDataBaseSysTime 
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		String selectDataBaseSysTime(){
			String sysTimeMap =  "";
			if("oracle".equals(Const.DATABASE_RELATIONAL_SOURCE)){
				sysTimeMap = (String)baseDao.queryForObject(iBatisSqlMap.getIbatisDualSelectSystimefromoracle());
			}
			if("mysql".equals(Const.DATABASE_RELATIONAL_SOURCE)){
				sysTimeMap = (String)baseDao.queryForObject(iBatisSqlMap.getIbatisDualSelectSystimefrommysql());
			}
			return sysTimeMap;
		}

	}
	
	/**
	 * 活动需求表
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: RmActDemand 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmActDemandInfo extends IRmActDemandInfo implements Serializable{
		
		/**
		 * 删除
		* @date: 2016-10-20 
		* @author: wangth
		* @Title: delete 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmactdemandinfoDelete(),inParam);
		}
		
		/**
		 * 插入
		* @date: 2016-10-20 
		* @author: wangth
		* @Title: insert 
		* @param inParam 
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			baseDao.insert(iBatisSqlMap.getIbatisRmactdemandinfoInsert(), inParam);
		}
		
		/**
		 * 查询
		* @date: 2016-10-20 
		* @author: wangth
		* @Title: select 
		* @param queryFilter 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String,Object>> select(IQueryFilter queryFilter) {
			List<Map<String,Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmactdemandinfoSelect(), queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(int i=0;i<list.size();i++){
					Map<String, Object> map = list.get(i);
					map.put("startTime", DateUtil.timestamp2String((Timestamp) map.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("endTime", DateUtil.timestamp2String((Timestamp) map.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("updateTime", DateUtil.timestamp2String((Timestamp) map.get("updateTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}
		
		/**
		 * 更新
		* @date: 2016-10-20 
		* @author: wangth
		* @Title: update 
		* @param inParam 
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) throws StrategyError {
			baseDao.update(iBatisSqlMap.getIbatisRmactdemandinfoUpdate(), inParam);
		}
		
	}
	
	/**
	 * 附件表
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: RmAttach 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmAttachInfo extends IRmAttachInfo implements Serializable{
		
		/**
		 * 附件删除
		* @date: 2016-10-24 
		* @author: wangth
		* @Title: delete 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmattachinfoDelete(), inParam);
			
		}
		
		/**
		 * 批量添加
		* @date: 2016-10-20 
		* @author: wangth
		* @Title: insertBatchAttach 
		* @param list 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insertBatchAttach(List<Map<String, Object>> list) {
			baseDao.batchInsert(iBatisSqlMap.getIbatisRmattachinfoInsert(), list);
		}
		
		/**
		 * 添加单个附件
		* @date: 2016-10-23 
		* @author: wangth
		* @Title: insertSingleAttach 
		* @param inParam 
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insertSingleAttach(Map<String, Object> inParam) throws StrategyError {
			inParam.put("operDate", DateUtil.string2Timestamp((String)inParam.get("operDate"), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.insert(iBatisSqlMap.getIbatisRmattachinfoInsert(),inParam);
		}
		
		/**
		 * 查询附件
		* @date: 2016-10-24 
		* @author: wangth
		* @Title: selectAttach 
		* @param inParam
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectAttach(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmattachinfoSelect(), queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(int i=0;i<list.size();i++){
					Map<String, Object> map = list.get(i);
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}

	}
	
	/**
	 * 属性表
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: RmEventDetailInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmAttributeInfo extends IRmAttributeInfo implements Serializable{
		
		/**
		 * 插入
		* @date: 2016-9-15 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(List<Map<String, Object>> list) {
			baseDao.batchInsert(iBatisSqlMap.getIbatisRmattributeinfoInsert(), list);
		}
		
		/**
		 * 查询
		* @date: 2016-9-15 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String,Object>> select(IQueryFilter queryFilter) {
			List<Map<String,Object>> list = (List<Map<String,Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmattributeinfoSelect(),queryFilter);
			return list;
		}

		/**
		 * 更新
		* @date: 2016-9-15 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmattributeinfoUpdate(), inParam);
		}
		
		/**
		 * 删除
		* @date: 2016-11-10 
		* @author: wangth
		* @Title: delete 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmattributeinfoDelete(),inParam);
		}
	}
	
	/**
	 * 区域优先级表
	* @date: 2016-10-15 
	* @author: fangyuan_crmpd
	* @title: RmAreaPriorityInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmAreaPriorityInfo extends IRmAreaPriorityInfo implements Serializable{
		
		/**
		 * 删除
		* @date: 2016-10-19 
		* @author: fangyuan_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmareapriorityinfoDelete(), inParam);
			
		}
		/**
		 * 插入区域优先级信息
		* @date: 2016-10-15 
		* @author: fangyuan_crmpd
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmareapriorityinfoInsert(), inParam);		
		}
		
		/**
		 * 查询区域优先级
		* @date: 2016-10-15 
		* @author: fangyuan_crmpd
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(Map<String,Object> inParam) {
			List<Map<String, Object>> list = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmareapriorityinfoSelect(),inParam);
			return list;
		}
		
		/**
		 * 根据营销案ID查优先级
		* @date: 2017-2-26 
		* @author: sunyuan
		* @title: selectAreaPriorityRelByMarketCaseId
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectAreaPriorityRelByMarketCaseId(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmareapriorityinfoByMarketCaseIdSelect(),queryFilter);
			return list;
		}
		
		/**
		 * 查询区域优先级，营销案关联列表信息
		* @date: 2016-10-19 
		* @author: fangyuan_crmpd
		* @title: selectAreaPriorityRelMarketCase 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectAreaPriorityRelMarketCase(
				IQueryFilter queryFilter) {
			List<Map<String, Object>> list = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmareapriorityinfoSelectRel(),queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(int i=0;i<list.size();i++){
					Map<String, Object> map = list.get(i);
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("startTime", DateUtil.timestamp2String((Timestamp) map.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE3));
					map.put("endTime",  DateUtil.timestamp2String((Timestamp) map.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE3));
					outList.add(map);
				}
			}
			return outList;
		}
	}
	
	/**
	 * 审批记录表
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: RmAuditRecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmAuditRecordInfo extends IRmAuditRecordInfo implements Serializable{
		
		/**
		 * 插入 
		* @date: 2016-9-15 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmauditrecordinfoInsert(),inParam);
		}
		
		/**
		 * 查询下载审批记录
		* @date: 2016-10-18 
		* @author: wangth
		* @Title: selectDownLoadAuditRecord 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectDownLoadAuditRecord(
				IQueryFilter queryFilter) {
			List<Map<String, Object>> list = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmauditinventoryinfoSelect(),queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(int i=0;i<list.size();i++){
					Map<String, Object> map = list.get(i);
					map.put("auditTime", DateUtil.timestamp2String((Timestamp) map.get("auditTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}
		
		/**
		 * 查询营销案审批记录
		* @date: 2016-9-15 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectMarketCaseAuditRecord(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmauditrecordinfoSelectMarketcaseauditrecord(),queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(int i=0;i<list.size();i++){
					Map<String, Object> map = list.get(i);
					map.put("auditTime", DateUtil.timestamp2String((Timestamp) map.get("auditTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}
		
		/**
		 * 根据营销案ID查询审批记录列表
		* @date: 2016-11-1 
		* @author: fangyuan_crmpd
		* @title: selectAuditRecordDetailListByMarketCaseId 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectAuditRecordDetailListByMarketCaseId(
				IQueryFilter queryFilter) {
			List<Map<String, Object>> list = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmauditrecordinfoSelectAuditrecorddetaillist(),queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(int i=0;i<list.size();i++){
					Map<String, Object> map = list.get(i);
					map.put("auditTime", DateUtil.timestamp2String((Timestamp) map.get("auditTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("operDate", DateUtil.timestamp2String((Timestamp) map.get("operDate"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}

		/**
		 * 更新
		* @date: 2016-9-15 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmauditrecordinfoUpdate(),inParam);
		}
		

		/** 
		* 查询营销案审批数量 
		* @date: 2016-11-4 
		* @author: mengxi 
		* @title: selectMarketCaseAuditNum 
		* @param inParam 
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/ 
		Map<String,Object> selectMarketCaseAuditNum(IQueryFilter queryFilter){ 
			Map<String, Object> map = (Map<String, Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmauditrecordinfoSelectMarketcaseauditnum(), queryFilter); 
			return map; 
		}
	} 
	
	/**
	 * 审批工号表
	* @date: 2016-10-10 
	* @author: wangth
	* @Title: RmAuditNoInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmAuditNoInfo extends IRmAuditNoInfo implements Serializable{
		
		/**
		 * 插入
		* @date: 2016-10-10 
		* @author: wangth
		* @Title: inser 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void inser(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmauditnoinfoInsert(),inParam);
		}
		
		/**
		 * 查询
		* @date: 2016-10-10 
		* @author: wangth
		* @Title: select 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@SuppressWarnings("unchecked")
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmauditnoinfoSelect(),queryFilter);
			return list;
		}
		
		/**
		 * 查询业务审批工号
		* @date: 2016-10-27 
		* @author: wangth
		* @Title: selectBusiAuditNO 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectBusiAuditNO(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmauditnoinfoSelectBusiauditno(),queryFilter);
			return list;
		}
		
		/**
		 * 更新
		* @date: 2016-10-10 
		* @author: wangth
		* @Title: update 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmauditnoinfoUpdate(),inParam);
		}

		/**
		 * 删除
		* @date: 2016-10-13 
		* @author: tangaq
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmauditnoinfoDelete(),inParam);
		}

	}
	
	/**
	 * 批量push发送成功任务表
	* @date: 2017-3-14 
	* @author: tangaq
	* @title: RmBatchPushTaskSuccInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmBatchPushTaskSuccInfo extends IRmBatchPushTaskSuccInfo implements Serializable{

		@Override
		Map<String, Object> select(Map<String,Object> inParam) {
			Map<String, Object> map = (Map<String, Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmbatchpushsuccSelect(),inParam);
			return map;
		}
		
	}
	
	/**
	 * 批量push待发送任务表
	* @date: 2017-3-14 
	* @author: tangaq
	* @title: RmWaitSendBatchPushTaskInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmWaitSendBatchPushTaskInfo extends IRmWaitSendBatchPushTaskInfo implements Serializable{

		@Override
		Map<String, Object> select(Map<String,Object> inParam) {
			Map<String, Object> map = (Map<String, Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmbatchpushwaitsendSelect(),inParam);
			return map;
		}
		
	}
	
	/**
	 * 批量push异常任务表
	* @date: 2017-3-14 
	* @author: tangaq
	* @title: RmBatchPushTaskExcepInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmBatchPushTaskExcepInfo extends IRmBatchPushTaskExcepInfo implements Serializable{

		@Override
		Map<String, Object> select(Map<String,Object> inParam) {
			Map<String, Object> map = (Map<String, Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmbatchpushexcepSelect(),inParam);
			return map;
		}
		
	}
	
	/**
	 * 批量push任务表
	* @date: 2017-3-14 
	* @author: tangaq
	* @title: RmBatchPushTaskInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmBatchPushTaskInfo extends IRmBatchPushTaskInfo implements Serializable{
		
	}
	
	/**
	 * 内容表
	* @date: 2016-9-8 
	* @author: zhaoyue
	* @title: RmContentInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmContentInfo extends IRmContentInfo implements Serializable{
		
		/**
		 * 插入内容表
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmcontentinfoInsert(),inParam);
		}
		
		/**
		 * 查询内容表
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String,Object> select(IQueryFilter queryFilter) {
			Map<String,Object> map = (Map<String,Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmcontentinfoSelect(),queryFilter);
			return map;
		}

		/**
		 * 更新内容表
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmcontentinfoUpdate(), inParam);
		}

		/**
		 * 删除内容
		* @date: 2016-10-21 
		* @author: zhangjj_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmcontentinfoDelete(), inParam);
		}
		
	}
	
	/**
	 * 内容详细信息表
	* @date: 2016-9-8 
	* @author: zhaoyue
	* @title: RmContentDetailInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public  class RmContentDetailInfo extends IRmContentDetailInfo implements Serializable{
		
		/**删除内容详细信息
		* @date: 2016-10-21 
		* @author: wangpei
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmcontentdetailDelete(),inParam);
		}

		/**
		 * 插入内容详细信息
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmcontentdetailInsert(),inParam);
		}

		/**
		 * 查询内容详细信息
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmcontentdetailSelect(),queryFilter);
			return list;
		}
		
		/**
		 * 查询内容详细信息Id
		* @date: 2016-10-7 
		* @author: wangth
		* @Title: selectContentDetailId 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectContentDetailId(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmcontentdetailSelectContentdetailid(),queryFilter);
			return list;
		}
		
		/**
		 * 根据产品id查询内容明细
		* @date: 2017-4-4 
		* @author: sunyuan
		* @title: selectContentDetailByProdId 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String,Object>> selectContentDetailByProdId(IQueryFilter queryFilter){
			List<Map<String,Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmcontentdetailSelectContentDetailsByProdId(),queryFilter);
			return list;
		}
		
		/**
		 * 
		* @date: 2017-3-8 
		* @author: sunliang 
		* @title: selectContentDetailsByEventIdAndMarketCaseId 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectContentDetailsByEventIdAndMarketCaseId(
				IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmcontentdetailSelectContentDetailsByEventIdAndMarketCaseId(),queryFilter);
			return list;
		}
		
		/**
		 * 更新内容详细信息
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmcontentdetailUpdate(), inParam);
		}

	}

	/**
	 * 触点商机表
	* @date: 2016-12-13 
	* @author: tangaq
	* @title: RmChannelBussinessInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmChannelBussinessInfo extends IRmChannelBussinessInfo implements Serializable {
		
		/**
		 *  查询全省的接触量
		* @date: 2016-12-13 
		* @author: tangaq
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String,Object>> outList =  (List<Map<String,Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmchannelbussinessinfoSelect(),queryFilter);
			 return outList;
		}
		
		/**
		 * 查询各个地市的接触量
		* @date: 2016-12-13 
		* @author: tangaq
		* @title: selectByRegionCode 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectByRegionCode(IQueryFilter queryFilter) {
			return (List<Map<String,Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmchannelbussinessinfoSelectChannelbussinessbyregioncode(),queryFilter);
		}
	}

	
	/**
	 * 渠道表
	* @date: 2016-9-13 
	* @author: zhaoyue
	* @title: RmChannelInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmChannelInfo extends IRmChannelInfo implements Serializable{

		/**
		 * 插入
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmchannelinfoInsert(),inParam);
		}

		/**
		 * 查询
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			return (List<Map<String,Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmchannelinfoSelect(),queryFilter);
		}

		/**
		 * 更新
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmchannelinfoUpdate(),inParam);
		}
	}
	
	/**
	 * 渠道显示表
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: RmChannelShowInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmChannelShowInfo extends IRmChannelShowInfo implements Serializable{
		
		/**
		 * 删除渠道显示数据
		* @date: 2016-10-18 
		* @author: fangyuan_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmchannelshowinfoDelete(),inParam);	
		}
		
		/**
		 * 插入渠道显示数据
		* @date: 2016-10-18 
		* @author: fangyuan_crmpd
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmchannelshowinfoInsert(),inParam);	
		}
	
		/**
		 * 查询渠道显示数据
		* @date: 2016-10-19 
		* @author: fangyuan_crmpd
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmchannelshowinfoSelect(),queryFilter); 
			return list;
		}
		
		/**
		 * 更新渠道显示数据
		* @date: 2016-10-18 
		* @author: fangyuan_crmpd
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmchannelshowinfoUpdate(),inParam);	
		}

	}
	/**渠道任务
	* Create on 
	* @date: 2016-12-21
	* @author: wangpei
	* @Title:RmChannelTaskInfo
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class RmChannelTaskInfo extends IRmChannelTaskInfo implements Serializable{

		/** 批量修改
		* @date: 2017-3-6 
		* @author: wangpei
		* @title: batchUpdate 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void batchUpdate(List<Map<String, Object>> tempInParam) {
			baseDao.batchUpdate(iBatisSqlMap.getIbatisRmchanneltaskinfoUpdate(), tempInParam);
		}

		/** 查询客户列表
		* @date: 2016-12-21 
		* @author: wangpei
		* @title: selectCustList 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> selectCustList(IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisRmchanneltaskinfoSelectCustlist(), queryFilter);
		}

		/** 查询营销案列表
		* @date: 2016-12-21 
		* @author: wangpei
		* @title: selectMarketCaseList 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> selectMarketCaseList(IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisRmchanneltaskinfoSelectMarketcaselist(), queryFilter);
		}

		/** 查询任务列表
		* @date: 2016-12-21 
		* @author: wangpei
		* @title: selectTaskList 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> selectTaskList(IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisRmchanneltaskinfoSelectTasklist(), queryFilter);
		}
		
		/**
		 * 分页查询任务列表
		* @date: 2016-12-22 
		* @author: zhangjj_crmpd
		* @title: selectTaskListByPage 
		* @param tempInParam
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectTaskListByPage(
				Map<String, Object> tempInParam, IQueryFilter queryFilter,int startNum,int limit) {
			return baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmchanneltaskinfoSelectTasklistcondition(),queryFilter, startNum, limit);
		}
		
		/**
		 * 查询任务列表数量
		* @date: 2016-12-22 
		* @author: zhangjj_crmpd
		* @title: selectTaskListCount 
		* @param tempInParam
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectTaskListCount(Map<String, Object> tempInParam, IQueryFilter queryFilter) {
			// TODO Auto-generated method stub
			return (Map<String, Object>) baseDao.queryForObject(iBatisSqlMap.getIbatisRmchanneltaskinfoSelectTasklistcount(), queryFilter);
		}
		
		/**
		 * 根据负责人工号分组查询任务数
		* @date: 2017-1-11 
		* @author: tangaq
		* @title: selectTaskCountGroupByLoginNo
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectTaskCountGroupByLoginNo(
				IQueryFilter queryFilter) {
			
			return baseDao.queryForList(iBatisSqlMap.getbatisRmchanneltaskinfoSelectTaskCountGroupByLoginNo(),queryFilter);
		}
		
		/** 
		* @date: 2017-3-6 
		* @author: wangpei
		* @title: selectWaitSendTaskList 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		List<Map<String, Object>> selectWaitSendTaskList(IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisRmchanneltaskinfoSelectWaitSendChannelTasklist(), queryFilter);
		}

		/** 
		* @date: 2017-2-27 
		* @author: wangpei
		* @title: insert 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		void insert(Map<String, Object> tempInParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmchanneltaskInfoInsert(), tempInParam);
		}

		/** 
		* @date: 2016-12-21 
		* @author: wangpei
		* @title: updateStatus 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void updateStatus(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmchanneltaskinfoUpdateStatus(), inParam);
		}

		/**
		 * 更新负责人工号(调配)
		* @date: 2016-12-21 
		* @author: zhangjj_crmpd
		* @title: updateServiceNo 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void updateServiceNo(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmchanneltaskinfoUpdateServiceno(), inParam);
		}

	}
	
	/**
	 * 客户群属性表
	* @date: 2017-3-12 
	* @author: tangaq
	* @title: RmCustGroupAttributeInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmCustGroupAttributeInfo extends IRmCustGroupAttributeInfo implements Serializable{

		/**
		 * 插入客户群属性信息
		* @date: 2017-3-12 
		* @author: tangaq
		* @title: insertCustGroupAttribute 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insertCustGroupAttribute(Map<String, Object> inParam)
				throws StrategyError {
			baseDao.insert(iBatisSqlMap.getIbatisRmcustgroupattributeinfoinsert(),inParam);
		}
		
		/**
		 * 查询客户群属性信息
		* @date: 2017-4-12 
		* @author: zhangzx_crmpd
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisRmcustgroupattributeinfoselect(),queryFilter);
		}

		/**
		 * 更新客户群属性信息
		* @date: 2017-3-12 
		* @author: tangaq
		* @title: update 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) throws StrategyError {
			baseDao.update(iBatisSqlMap.getIbatisRmcustgroupattributeinfoupdate(), inParam);
		}
		
		/**
		 * 删除客户群属性信息
		* @date: 2017-4-25 
		* @author: zhangzx_crmpd
		* @title: delete 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) throws StrategyError {
			baseDao.update(iBatisSqlMap.getIbatisRmcustgroupattributeinfoDelete(), inParam);
		}
		
	}
	
	/**
	 * 目标客户群表
	* @date: 2016-9-13 
	* @author: zhaoyue
	* @title: RmCustGroupInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmCustGroupInfo extends IRmCustGroupInfo implements Serializable{

		/**
		 * 插入
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			//日期转换
			inParam.put("operTime", DateUtil.string2Timestamp((String)inParam.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("startTime", DateUtil.string2Timestamp((String)inParam.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("endTime", DateUtil.string2Timestamp((String)inParam.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("exeTime", DateUtil.string2Timestamp((String)inParam.get("exeTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.insert(iBatisSqlMap.getIbatisRmcustgroupinfoInsert(),inParam);
		}
		
		/**
		 * 
		* @date: 2017-2-10 
		* @author: wuJiaFu
		* @title: delete 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		void delete(Map<String, Object> inParam) throws StrategyError {
			
			baseDao.delete(iBatisSqlMap.getIbatisRmcustgroupinfoDelete(),inParam);
		}
		
		/**
		 * 插入客户群属性信息
		* @date: 2017-2-12 
		* @author: tangaq
		* @title: insertCustGroupAttribute 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insertCustGroupAttribute(Map<String, Object> inParam)
				throws StrategyError {
			baseDao.insert(iBatisSqlMap.getIbatisRmcustgroupattributeinfoinsert(),inParam);
		}

		/**
		 * 添加客户群文件信息
		* @date: 2016-10-16 
		* @author: wangth
		* @Title: insertCustGroupFile 
		* @param inParam 
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insertCustGroupFile(Map<String, Object> inParam) throws StrategyError {
			inParam.put("operTime", DateUtil.string2Timestamp((String)inParam.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.insert(iBatisSqlMap.getIbatisRmcustgroupfileinfoInsert(),inParam);
		}
		
		/**
		 * 查询
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmcustgroupinfoSelect(),queryFilter); 
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(int i=0;i<list.size();i++){
					Map<String, Object> map = list.get(i);
					map.put("startTime", DateUtil.timestamp2String((Timestamp) map.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("endTime", DateUtil.timestamp2String((Timestamp) map.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("updateTime", DateUtil.timestamp2String((Timestamp) map.get("updateTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}
		
		/**
		 * 分页查询客户群
		* @date: 2017-2-21 
		* @author: zhangjj_crmpd
		* @title: selectByPage 
		* @param queryFilter
		* @param startPage
		* @param limit
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String,Object> selectByPage(IQueryFilter queryFilter,
				int startPage, int limit) {
			String withoutBlack = queryFilter.getWithoutBlack()==null?"false":queryFilter.getWithoutBlack();
			Map<String, Object> resMap = new HashMap<String, Object>();
			if(withoutBlack.equals(Const.TRUE_LOWER)){
				 queryFilter.setCustGroupType(Const.CUSTGROUP_TYPE_BLACK);
				 resMap = baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmcustgroupinfoSelectWithOutBlack(), queryFilter,startPage, limit);
			}else{
				 resMap = baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmcustgroupinfoSelect(), queryFilter,startPage, limit);
			}
			List<Map<String, Object>> list = (List<Map<String, Object>>) resMap.get("result");
			List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
			if (!CommonUtils.objectIsNull(list)) {
				for (int i = 0; i < list.size(); i++) {
					Map<String, Object> map = list.get(i);
					map.put("startTime", DateUtil.timestamp2String((Timestamp) map.get("startTime"),DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("endTime", DateUtil.timestamp2String((Timestamp) map.get("endTime"),DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"),DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("updateTime", DateUtil.timestamp2String((Timestamp) map.get("updateTime"),DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			resMap.put("result", outList);
			return resMap;
		}
		
		/**
		 * 查询客户群属性信息
		* @date: 2017-3-6 
		* @author: tangaq
		* @title: selectCustGroupAttribute 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectCustGroupAttribute(IQueryFilter queryFilter) {
			Map<String, Object> resMap = (Map<String, Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmcustgroupattributeinfoselect(), queryFilter);
			Map<String,Object> map = new HashMap<String,Object>();
			if(!CommonUtils.objectIsNull(resMap)){
				if(!CommonUtils.objectIsNull(resMap.get("exeTime"))){
					resMap.put("exeTime", DateUtil.timestamp2String((Timestamp) resMap.get("exeTime"),DateUtil.TIME_FROMAT_SIMPLE2));
				}
			}
			
			return resMap;
		}

		/**
		 * 更新
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) throws StrategyError {
			//日期转换
			inParam.put("operTime", DateUtil.string2Timestamp((String)inParam.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("startTime", DateUtil.string2Timestamp((String)inParam.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("endTime", DateUtil.string2Timestamp((String)inParam.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE3));

			System.out.println("RmcustgroupinfoUpdate update:"+inParam);
			baseDao.update(iBatisSqlMap.getIbatisRmcustgroupinfoUpdate(),inParam);
		}

		/** 
		* @date: 2016-10-18 
		* @author: songxj
		* @title: updateById 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void updateById(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmcustgroupinfoUpdateCustgroupbyid(), inParam);
		}

	}
	
	/**
	 * 客户群处理记录表
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: RMCustGroupHandleRecordInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RMCustGroupHandleRecordInfo extends IRmCustGroupHandleRecordInfo implements Serializable{

		/**
		 * 插入客户群处理记录
		* @date: 2017-3-10 
		* @author: zhangjj_crmpd
		* @title: insert 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			inParam.put("startTime", DateUtil.string2Timestamp(CommonUtils.toString(inParam.get("startTime")), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("endTime", DateUtil.string2Timestamp(CommonUtils.toString(inParam.get("endTime")), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.insert(iBatisSqlMap.getIbatisRmcustgrouphandlerecordinfoInsert(), inParam);
		}
		
		/**
		 * 查询客户群处理记录
		* @date: 2017-3-7 
		* @author: tangaq
		* @title: selectCustGroupHandleRecord 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectCustGroupHandleRecord(IQueryFilter queryFilter) {
	
					List<Map<String,Object>> resList = baseDao.queryForList(iBatisSqlMap.getIbatisRmcustgrouphandlerecordinfoSelect(),queryFilter); 
					List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
					if (!CommonUtils.objectIsNull(resList)) {
						for (int i = 0; i < resList.size(); i++) {
							Map<String, Object> map = resList.get(i);
							map.put("startTime", DateUtil.timestamp2String((Timestamp) map.get("startTime"),DateUtil.TIME_FROMAT_SIMPLE1));
							map.put("endTime", DateUtil.timestamp2String((Timestamp) map.get("endTime"),DateUtil.TIME_FROMAT_SIMPLE1));
							outList.add(map);
						}
					}
					
					return outList;
		}

	}
	
	/**
	 * 客户群标签
	* @date: 2016-9-20 
	* @author: yangwl
	* @title: RmCustGroupInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmCustGroupLabelInfo extends IRmCustGroupLabelInfo implements Serializable{

		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmcustgrouplabelinfoDelete(),inParam);
		}
		
		/**
		 * 插入
		* @date: 2016-9-20 
		* @author: yangwl
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {

			baseDao.insert(iBatisSqlMap.getIbatisRmcustgrouplabelinfoInsert(),inParam);
		}

		/**
		 * 查询
		* @date: 2016-9-20 
		* @author: yangwl
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisRmcustgrouplabelinfoSelect(),queryFilter); 
		}
		
		/**
		 * 查询客户群标签
		* @date: 2016-11-12 
		* @author: wangth
		* @Title: selectCustGroupLabel 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectCustGroupLabel(IQueryFilter queryFilter) {
			Map<String,Object> map = (Map<String, Object>) baseDao.queryForObject(iBatisSqlMap.getIbatisRmcustgrouplabelinfoSelect(), queryFilter);
			return map;
		}

		/**
		 * 更新
		* @date: 2016-9-20 
		* @author: yangwl
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmcustgrouplabelinfoUpdate(),inParam);
		}
		
	}
	
	/**
	 * 用户群优先级表
	* @date: 2016-10-15 
	* @author: fangyuan_crmpd
	* @title: RmCustGroupPriorityInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmCustGroupPriorityInfo extends IRmCustGroupPriorityInfo implements Serializable{
		
		/**
		 * 删除用户群优先级
		* @date: 2016-10-15 
		* @author: fangyuan_crmpd
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmcustgrouppriorityinfoDelete(), inParam);
		}

		/**
		 * 插入用户群优先级
		 * @date: 2016-10-19 
		 * @author: fangyuan_crmpd
		 * @title: insert 
		 * @param inParam 
		 * @exception: 
		 * @version: 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmcustgrouppriorityinfoInsert(), inParam);
		}
		
		/**
		 * 查询用户群优先级
		* @date: 2016-10-15 
		* @author: fangyuan_crmpd
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(Map<String,Object> inParam) {
			List<Map<String, Object>> list = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmcustgrouppriorityinfoSelect(),inParam);
			return list;
		}
	}
	
	/**
	 * 编码表
	* @date: 2016-10-24 
	* @author: xiongxq
	* @Title: RmCodeNameDict 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmCodeNameDict extends IRmCodeNameDict implements Serializable{

		/** 
		 * 删除
		* @date: 2016-10-25 
		* @author: xiongxq
		* @Title: delete 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmcodenamedictDelete(), inParam);
		}
	
		/**
		 * 新增 
		* @date: 2016-10-25 
		* @author: xiongxq
		* @Title: insert 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmcodenamedictInsert(),inParam);
		}

		/** 
		 * 查询
		* @date: 2016-10-24 
		* @author: xiongxq
		* @Title: select 
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> outList = baseDao.queryForList(iBatisSqlMap.getIbatisRmcodenamedictSelect(), queryFilter);
			List<Map<String, Object>> choiceConfigList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(outList)){
				for(int i=0;i<outList.size();i++){
					Map<String, Object> outMap = outList.get(i);
					outMap.put("operDate", DateUtil.timestamp2String((Timestamp) outMap.get("operDate"), DateUtil.TIME_FROMAT_SIMPLE1));
					choiceConfigList.add(outMap);
				}
			}
			return choiceConfigList;
		}

		/**
		 * 更新 
		* @date: 2016-10-26 
		* @author: xiongxq
		* @Title: update 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmcodenamedictUpdate(),inParam);
		}
	}
	
	/**
	 * 异网号码池表
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: RmDifferentNetPhonePoolInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmDifferentNetPhonePoolInfo extends IRmDifferentNetPhonePoolInfo implements Serializable{
		
		/**
		 * 删除异网号码池 
		* @date: 2016-10-31 
		* @author: xiongxq
		* @Title: delete 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmdifferentnetphonepoolinfoDelete(), inParam);
		}

		/**
		 * 添加异网号码池 
		* @date: 2016-10-31 
		* @author: xiongxq
		* @Title: insert 
		* @param inParam 
		* @exception:
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			inParam.put("startTime", DateUtil.string2Timestamp((String)inParam.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("endTime", DateUtil.string2Timestamp((String)inParam.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("operTime", DateUtil.string2Timestamp((String)inParam.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.insert(iBatisSqlMap.getIbatisRmdifferentnetphonepoolinfoInsert(), inParam);
		}

		/**
		 * 查询异网号码池列表  
		* @date: 2016-10-30 
		* @author: xiongxq
		* @Title: select 
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmdifferentnetphonepoolinfoSelect(),queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(int i=0;i<list.size();i++){
					Map<String, Object> map = list.get(i);
					map.put("startTime", DateUtil.timestamp2String((Timestamp) map.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("endTime", DateUtil.timestamp2String((Timestamp) map.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}

		/**
		 * 修改异网号码池 
		* @date: 2016-10-31 
		* @author: xiongxq
		* @Title: update 
		* @param inParam 
		* @exception:
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void update(Map<String, Object> inParam) throws StrategyError {
			inParam.put("startTime", DateUtil.string2Timestamp((String)inParam.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("endTime", DateUtil.string2Timestamp((String)inParam.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("operTime", DateUtil.string2Timestamp((String)inParam.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.update(iBatisSqlMap.getIbatisRmdifferentnetphonepoolinfoUpdate(),inParam);
		}
	}
	
	/**
	 * 营销案商机表
	* @date: 2016-12-13 
	* @author: tangaq
	* @title: RmMarketCaseBussinessInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmMarketCaseBussinessInfo extends IRmMarketCaseBussinessInfo implements Serializable{
		
		/**
		 * 查询全省的接触量
		* @date: 2016-12-13 
		* @author: tangaq
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			return (List<Map<String, Object>>) baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcasebussinessinfoSelect(), queryFilter);
		}
		
		/**
		 * 查询各个地市的接触量
		* @date: 2016-12-13 
		* @author: tangaq
		* @title: selectByRegionCode 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectByRegionCode(IQueryFilter queryFilter) {
			return (List<Map<String, Object>>) baseDao.queryForObject(iBatisSqlMap.getIbatisRmmarketcasebussinessinfoSelectMarketcasebussinessbyregioncode(), queryFilter);
		}
	}

	
	/**
	 * 营销案订购统计报表
	* @date: 2016-11-25 
	* @author: xiongxq
	* @Title: RmMarketCaseOrderReportInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmMarketCaseOrderReportInfo extends IRmMarketCaseOrderReportInfo implements Serializable{
		
		/**
		 * 插入营销案产品订购量统计表
		* @date: 2016-11-26 
		* @author: mengxi
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		void insert(Map<String,Object> inParam){
			log.info("RmMarketCaseOrderReportInfo.insert.inParam", inParam);
			baseDao.insert(iBatisSqlMap.getIbatisRmmarketcaseorderreportinfoInsertMarketcaseorderreport(),inParam);
		}
		
		/** 
		 * 查询渠道营销案订购汇总信息
		* @date: 2016-11-26 
		* @author: yuanliang
		* @title: selectChannelMarketCaseOrderReportInfo 
		* @param termParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> selectChannelMarketCaseOrderReportInfo(
				Map<String, Object> termParam) {
			List<Map<String,Object>> outList = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseorderreportinfoSelectChannelmarketcaseorderreport(),termParam);
			return outList;
		}

		/**
		 * 查询15天推送量  
		* @date: 2016-11-26 
		* @author: xiongxq
		* @Title: selectFifthDay 
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> selectFifthDay(IQueryFilter queryFilter) {
			List<Map<String,Object>> outList = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreportbyfifth(),queryFilter);
			List<Map<String, Object>> resultList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(outList)){
				for(int i=0;i<outList.size();i++){
					Map<String, Object> map = outList.get(i);
					//数据库是 date类型，不是 datetime类型
					map.put("sendDate", DateUtil.DateToString( (java.util.Date)map.get("sendDate"), DateUtil.DATE_FROMAT_YYYYMMDD2));
					resultList.add(map);
				}
			}
			return resultList;
		}

		/** 
		 * 查询某个营销案的所有订购量
		* @date: 2016-11-26 
		* @author: xiongxq
		* @Title: selectOrderNum 
		* @param termParam
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		Map<String, Object> selectOrderNum(Map<String, Object> termParam) {
			Map<String,Object> outMap = (Map<String,Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreport(),termParam);
			return outMap;
		}

		/** 
		 * 根据日期参数的不同，查询昨日曝光量、当日累计曝光量
		* @date: 2016-11-26 
		* @author: yuanliang
		* @title: selectMarketCaseOrderReportSendNum 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		Map<String, Object> selectMarketCaseOrderReportSendNum(
				IQueryFilter queryFilter) {
			Map<String,Object> outMap = (Map<String,Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreportsendnum(),queryFilter);
			return outMap;
		}

		/**
		 * 查询7天推送量 
		* @date: 2016-11-26 
		* @author: xiongxq
		* @Title: selectSevenDay 
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> selectSevenDay(IQueryFilter queryFilter) {
			List<Map<String,Object>> outList = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreportbyseven(),queryFilter);
			List<Map<String, Object>> resultList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(outList)){
				for(int i=0;i<outList.size();i++){
					Map<String, Object> map = outList.get(i);
					//数据库是 date类型，不是 datetime类型
					map.put("sendDate", DateUtil.DateToString( (java.util.Date)map.get("sendDate"), DateUtil.DATE_FROMAT_YYYYMMDD2));
					resultList.add(map);
				}
			}
			return resultList;
		}

		/**
		 * 查询3天推送量 
		* @date: 2016-11-26 
		* @author: xiongxq
		* @Title: selectThreeDay 
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> selectThreeDay(IQueryFilter queryFilter) {
			List<Map<String,Object>> outList = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreportbythree(),queryFilter);
			List<Map<String, Object>> resultList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(outList)){
				for(int i=0;i<outList.size();i++){
					Map<String, Object> map = outList.get(i);
					//数据库是 date类型，不是 datetime类型
					map.put("sendDate", DateUtil.DateToString( (java.util.Date)map.get("sendDate"), DateUtil.DATE_FROMAT_YYYYMMDD2));
					resultList.add(map);
				}
			}
			return outList;
		}
	}
	
	/**
	 * 事件详细信息表
	* @date: 2016-9-10 
	* @author: zhaoyue
	* @title: RmEventDetailInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmEventDetailInfo extends IRmEventDetailInfo implements Serializable{
		
		/**
		 * 保存事件详细信息
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmeventdetailinfoInsert(),inParam);
		}
	
		/**
		 * 查询事件详细信息
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List select(IQueryFilter queryFilter) {
			List list = baseDao.queryForList(iBatisSqlMap.getIbatisRmeventdetailinfoSelect(), queryFilter);
			return list;
		}
		

		/**
		 * 查询事件规则详细信息Id
		* @date: 2016-12-2 
		* @author: mengxi
		* @title: selectEventDetailId 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		List<Map<String, Object>> selectEventDetailId(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmeventdetailinfoSelectEventdetailid(),queryFilter);
			return list;
		}
	
		/**
		 * 更新事件详细信息
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmeventdetailinfoUpdate(),inParam);
		}

		/**
		 * 删除事件详情
		* @date: 2017-3-30 
		* @author: chenhao
		* @title: deleter 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void deleter(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisEventDetailinfoDelete(),inParam);
			
		}
		
	}

	/**
	 * 事件表
	* @date: 2016-9-10 
	* @author: zhaoyue
	* @title: RmEventInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmEventInfo extends IRmEventInfo implements Serializable{
		
		/**
		 * 插入事件信息
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmeventinfoInsert(),inParam);
		}
	
		/**
		 * 查询事件信息
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> select(IQueryFilter queryFilter) {
			Map<String, Object> map = (Map<String, Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmeventinfoSelect(), queryFilter);
			return map;
		}
	
		/**
		 * 更新事件信息
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmeventinfoUpdate(),inParam);
		}

		/**
		 * 查询缴费事件ID
		* @date: 2017-3-7 
		* @author: sunliang 
		* @title: selectPayFeeEventId 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String,Object>> selectPayFeeEventId(IQueryFilter queryFilter) {
			List<Map<String,Object>> list = (List<Map<String,Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmeventinfoSelectPayFeeEventId(), queryFilter);
			return list;
		}

		/**
		 * 根据relId查询事件Id
		* @date: 2017-3-30 
		* @author: chenhao
		* @title: selectEventIdByRelId 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectEventIdByRelId(IQueryFilter queryFilter) {
			Map<String, Object> map = (Map<String, Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmrelationrelSelect(), queryFilter);
			Map<String,Object> result = new HashMap<String,Object>();
			String eventId =(String) map.get("componentId");
			result.put("eventId", eventId);
			return result;
		}

		/**
		 * 删除事件
		* @date: 2017-3-30 
		* @author: chenhao
		* @title: deleter 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void deleter(Map<String, Object> inParam) {
			System.out.println("ProceRDBMSDMLByIBatis.java开始删除");
			baseDao.delete(iBatisSqlMap.getIbatisEventinfoDelete(),inParam);
			System.out.println("ProceRDBMSDMLByIBatis.java开始完成");
		}

		/**
		 * 删除事件关系
		* @date: 2017-3-30 
		* @author: chenhao
		* @title: deleterRelation 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void deleterRelation(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmrelationrelDelete(),inParam);
			
		}
		
	}

	/**
	 * 灰名单表
	* @date: 2016-10-19 
	* @author: xiongxq
	* @Title: RmGreyInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmGreyInfo extends IRmGreyInfo implements Serializable{

		/** 
		 * 删除
		* @date: 2016-10-19 
		* @author: xiongxq
		* @Title: delete 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmgreyinfoDelete(),inParam);
		}
		
		/**
		 * 插入
		* @date: 2016-10-20 
		* @author: xiongxq
		* @Title: insert 
		* @param inParam 
		* @exception:
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String,Object> inParam) throws StrategyError {
			log.info("RmGreyInfo.insertRmGreyInfo :", inParam);
			Map<String,Object>  tempInParam = new HashMap<String, Object>();
			tempInParam.putAll(inParam);
			tempInParam.put("startDate", DateUtil.string2Timestamp((String)inParam.get("startDate"), DateUtil.DATE_FROMAT_YYYYMMDD2));
			tempInParam.put("endDate", DateUtil.string2Timestamp((String)inParam.get("endDate"), DateUtil.DATE_FROMAT_YYYYMMDD2));
			tempInParam.put("operTime", DateUtil.string2Timestamp((String)inParam.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.insert(iBatisSqlMap.getIbatisRmgreyinfoInsert(),tempInParam);
		}

		/** 
		 * 查询
		* @date: 2016-10-19 
		* @author: xiongxq
		* @Title: select 
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> outList = baseDao.queryForList(iBatisSqlMap.getIbatisRmgreyinfoSelect(), queryFilter);
			List<Map<String, Object>> greyList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(outList)){
				for(int i=0;i<outList.size();i++){
					Map<String, Object> map = outList.get(i);
					map.put("startDate", DateUtil.timestamp2String((Timestamp) map.get("startDate"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("endDate", DateUtil.timestamp2String((Timestamp) map.get("endDate"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					greyList.add(map);
				}
			}
			return greyList;
		}
		/** 
		 * 分页查询
		* @date: 2016-3-14
		* @author: chenhao
		* @Title: selectForPage 
		* @param queryFilter
		* @param start
		* @param limit
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		Map<String,Object> selectForPage(IQueryFilter queryFilter,int start,int limit) throws StrategyError{
			Map<String,Object> greyMap=baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmgreyinfoSelect(),queryFilter, start, limit);
			return greyMap;
		}
		

		/**
		 * 修改 
		* @date: 2016-10-21 
		* @author: xiongxq
		* @Title: update 
		* @param inParam 
		* @exception:
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void update(Map<String, Object> inParam) throws StrategyError {
			inParam.put("startDate", DateUtil.string2Timestamp((String)inParam.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("endDate", DateUtil.string2Timestamp((String)inParam.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.insert(iBatisSqlMap.getIbatisRmgreyinfoUpdate(),inParam);
		}
	}
	

	/**
	 * 清单表
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: RmInventoryInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmInventoryInfo extends IRmInventoryInfo implements Serializable {

		/**
		 * 删除清单
		* @date: 2017-1-12 
		* @author: zhangjj_crmpd
		* @title: delete 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> tempInParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRminventoryinfoDelete(), tempInParam);
		}

		/**
		 * 插入清单
		* @date: 2017-1-12 
		* @author: zhangjj_crmpd
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
			tempInParam.put("operTime", DateUtil.string2Timestamp(CommonUtils.toString(tempInParam.get("operTime")),DateUtil.TIME_FROMAT_SIMPLE1));
			baseDao.insert(iBatisSqlMap.getIbatisRminventoryinfoInsert(), tempInParam);
		}

		/**
		 * 查询清单 
		* @date: 2017-1-12 
		* @author: zhangjj_crmpd
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisRminventoryinfoSelect(), queryFilter);
		}
		
		/**
		 * 分页查询清单
		* @date: 2017-1-12 
		* @author: zhangjj_crmpd
		* @title: selectByPage 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectByPage(IQueryFilter queryFilter,int startPage,int limit) {
			Map outMap = baseDao.queryForPagingList(iBatisSqlMap.getIbatisRminventoryinfoSelect(), queryFilter, startPage, limit);
			List<Map<String, Object>> list = (List<Map<String, Object>>)outMap.get("result");
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(int i=0;i<list.size();i++){
					Map<String, Object> map = list.get(i);
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			outMap.put("result", outList);
			return outMap;
		}

		/**
		 * 更新清单
		* @date: 2017-1-12 
		* @author: zhangjj_crmpd
		* @title: update 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> tempInParam) throws StrategyError {
			baseDao.update(iBatisSqlMap.getIbatisRminventoryinfoUpdate(), tempInParam);
		}

	}
	
	/**
	 * 标签码表
	* @date: 2017-3-3 
	* @author: yuanchun
	* @title: RmLabelCodeNameTmp 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmLabelCodeNameDict extends IRmLabelCodeNameDict implements Serializable{

		/**
		 * 查询标签码表
		* @date: 2017-3-9 
		* @author: yuanchun
		* @title: selectLabelCodeName 
		* @param queryFilter
		* @param start
		* @param limit
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectLabelCodeName(IQueryFilter queryFilter, int start,int limit) {
			return baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmlabelcodenamedictSelect(), queryFilter, start, limit);
		}
		
	}
	
	/**
	 * 用户标签表(吉林)
	* @date: 2017-2-23 
	* @author: yuanchun
	* @title: RmlabelArchivesTmp 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmlabelArchivesTmp extends IRmlabelArchivesTmp implements Serializable{
		
		/**
		 * 分页查询用户标签列表
		* @date: 2017-3-31 
		* @author: yuanchun
		* @title: selectUserLabel 
		* @param queryFilter
		* @param start
		* @param limit
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String,Object> selectUserLabel(IQueryFilter queryFilter, int start,int limit){
			return baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmlabelarchivestmpSelect(),queryFilter,start,limit);
		}
		
		/**
		 * 查询用户标签列表
		* @date: 2017-2-23 
		* @author: yuanchun
		* @title: selectUserLabel 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String,Object>> selectUserLabel(Map<String, Object> inParam,IQueryFilter queryFilter){
			List<Map<String,Object>> list = (List<Map<String,Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmlabelarchivestmpSelect(),queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
			   if(!CommonUtils.objectIsNull(list)){
					for(int i=0;i<list.size();i++){
						Map<String, Object> map = list.get(i);
						map.put("endDate", DateUtil.timestamp2String((Timestamp) map.get("endDate"), DateUtil.TIME_FROMAT_SIMPLE1));
						map.put("startDate", DateUtil.timestamp2String((Timestamp) map.get("startDate"), DateUtil.TIME_FROMAT_SIMPLE1));
						map.put("updateDate", DateUtil.timestamp2String((Timestamp) map.get("updateDate"), DateUtil.TIME_FROMAT_SIMPLE1));
						map.put("queryLabelArchivesFlag",inParam.get("queryLabelArchivesFlag"));
						outList.add(map);
					}
				}
			return list;
		}
	}
	
	/**
	 * 工号表
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: RmLoginMsgInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmLoginMsgInfo extends IRmLoginMsgInfo implements Serializable{
		
		//private static final String IBATIS_INSERT_RmLoginMsgInfo ="RmLoginmsgInfo.insertRmLoginUserInfo";
		/**
		 * 插入工号
		* @date: 2017-1-22 
		* @author: hannn
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmLoginMsgInfoInsert(), inParam);
			
		}
		
//		void insertServiceNo(Map<String, Object> inParam) {
//			baseDao.insert(IBATIS_INSERT_RmLoginMsgInfo, inParam);
//		}
		/** 查询
		* @date: 2016-10-27 
		* @author: xiongxq
		* @Title: select 
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> outList = baseDao.queryForList(iBatisSqlMap.getIbatisRmloginuserinfoSelect(), queryFilter);
			return outList;
		}

		/** 
		* @date: 2016-10-31 
		* @author: wangpei
		* @title: selectForPage 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		Map<String, Object> selectForPage(IQueryFilter queryFilter,int start,int limit) {
			return baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmloginuserinfoSelect(), queryFilter, start, limit);
		}

		/** 
		* @date: 2016-10-27 
		* @author: wangpei
		* @title: selectLoginNo 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		Map<String, Object> selectLoginNo(IQueryFilter queryFilter) {
			return (Map<String, Object>) baseDao.queryForObject(iBatisSqlMap.getIbatisRmloginuserinfoSelectLoginuserbyid(), queryFilter);
		}
		/**
		 * 修改工号密码
		* @date: 2016-11-30 
		* @author: yuanliang
		* @title: updateLoginPassword 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		int updateLoginPassword(Map<String, Object> inParam) {
			return baseDao.update(iBatisSqlMap.getIbatisRmloginuserinfoUpdate(), inParam);
		}
	}
	
	/**
	 * 营销案属性表
	* @date: 2017-3-12 
	* @author: tangaq
	* @title: RmMarketCaseAttributeInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmMarketCaseAttributeInfo extends IRmMarketCaseAttributeInfo implements Serializable{

		/**
		 * 插入营销案属性信息
		* @date: 2017-3-12 
		* @author: tangaq
		* @title: insert 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			baseDao.insert(iBatisSqlMap.getIbatisRmmarketcaseattributeinfoInsert(),inParam);
			
		}

		/**
		 * 修改营销案属性信息
		* @date: 2017-3-12 
		* @author: tangaq
		* @title: update 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) throws StrategyError {
			baseDao.update(iBatisSqlMap.getIbatisRmmarketcaseattributeinfoUpdate(), inParam);
			
		}

		/**
		 *  删除营销案属性
		* @date: 2017-3-12 
		* @author: tangaq
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmmarketcaseattributeinfoDelete(), inParam);
		}
		
	}
	
	/**
	 * 营销案表
	* @date: 2016-9-9 
	* @author: zhaoyue
	* @title: RmMarketCaseInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmMarketCaseInfo extends IRmMarketCaseInfo implements Serializable{
		
		/**
		 * 插入营销案信息
		* @date: 2016-9-9 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			//日期转换
			inParam.put("operTime", DateUtil.string2Timestamp((String)inParam.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("startTime", DateUtil.string2Timestamp((String)inParam.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("endTime", DateUtil.string2Timestamp((String)inParam.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("updateTime", DateUtil.string2Timestamp((String)inParam.get("updateTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.insert(iBatisSqlMap.getIbatisRmmarketcaseinfoInsert(),inParam);
		}
	
		/**
		 * 查询营销案信息
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			log.info("RmMarketCaseInfo.select.queryFilter", queryFilter.getSysDate());
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseinfoSelect(),queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(int i=0;i<list.size();i++){
					Map<String, Object> map = list.get(i);
					map.put("startTime", DateUtil.timestamp2String((Timestamp) map.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("endTime", DateUtil.timestamp2String((Timestamp) map.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("updateTime", DateUtil.timestamp2String((Timestamp) map.get("updateTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}
		
		/**
		 * 根据id查询营销案信息
		* @date: 2017-3-30 
		* @author: sunyuan
		* @title: selectMarketCaseById 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String,Object> selectMarketCaseById(IQueryFilter queryFilter){
			Map<String,Object> map = (Map<String, Object>) baseDao.queryForObject(iBatisSqlMap.getIbatisRmmarketcaseinfoSelectById(),queryFilter);
			return map;
		}
		
		/**
		 * 更新营销案信息
		* @date: 2016-9-9 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) throws StrategyError {
			//日期转换
			inParam.put("operTime", DateUtil.string2Timestamp((String)inParam.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("startTime", DateUtil.string2Timestamp((String)inParam.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("endTime", DateUtil.string2Timestamp((String)inParam.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.update(iBatisSqlMap.getIbatisRmmarketcaseinfoUpdate(), inParam);
		}
		
		/**
		 * 查询营销案ID列表
		* @date: 2016-11-7 
		* @author: sunliang 
		* @title: selectMarketCaseIdList 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectMarketCaseIdList(IQueryFilter queryFilter) {
			List<Map<String, Object>> marketCaseIdList = baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseinfoSelectMarketcaseid(),queryFilter);
			return marketCaseIdList;
		}
		
		/**
		 * 查询营销案报表列表（执行中，已经推送的营销案）
		* @date: 2017-4-17 
		* @author: yuanchun
		* @title: selectMarketCaseReportFormList 
		* @param queryFilter
		* @param start
		* @param limit
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectMarketCaseReportFormList(
				IQueryFilter queryFilter, int start, int limit) {
			Map<String, Object> resMap = baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmmarketcaseinfoSelectExecuteMarketCase(), queryFilter,start, limit);
			return resMap;
		}
		
		/**
		 * 查询目标用户数
		* @date: 2017-4-17 
		* @author: yuanchun
		* @title: selectMarketCaseTargetCustCount 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectMarketCaseTargetCustCount(
				IQueryFilter queryFilter) {
			Map<String, Object> retMap = new HashMap<String, Object>();
			List<Map<String, Object>> custGroupList  =  baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseinfoSelectTargetCustCount(), queryFilter);
			retMap.put("custGroupList", custGroupList);
			log.debug("selectMarketCaseTargetCustCount.resMap", retMap);
			return retMap;
		}

		
		/**
		 * 根据权限查询营销案列表
		* @date: 2017-1-10 
		* @author: yuanchun
		* @title: selectMarketCaseListForPage 
		* @param queryFilter
		* @param start
		* @param limit
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectMarketCaseListForPage(
				IQueryFilter queryFilter, int start, int limit) {
			Map<String, Object> resMap = baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmmarketcaseinfoSelect(), queryFilter,start, limit);
			List<Map<String, Object>> list = (List<Map<String, Object>>) resMap.get("result");
			List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
			if (!CommonUtils.objectIsNull(list)) {
				for (int i = 0; i < list.size(); i++) {
					Map<String, Object> map = list.get(i);
					map.put("startTime", DateUtil.timestamp2String((Timestamp) map.get("startTime"),DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("endTime", DateUtil.timestamp2String((Timestamp) map.get("endTime"),DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"),DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("updateTime", DateUtil.timestamp2String((Timestamp) map.get("updateTime"),DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			resMap.put("result", outList);
			return resMap;
		}
		
		/**
		 * 查询批量push营销案和目标客户群
		* @date: 2016-12-28 
		* @author: sunliang 
		* @title: selectBatchPushMarketCaseAndCustGroup 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectBatchPushMarketCaseAndCustGroup(IQueryFilter queryFilter) {
			
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseinfoSelectBatchpushmarketcaseandcustgroup(), queryFilter);
			
			if(!CommonUtils.objectIsNull(list)){
				for(Map<String,Object> map : list){
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			
			return outList;
			
		}
		
		/**
		 * 查询外呼任务营销案下的目标客户群类型和目标客户群标签表达式
		* @date: 2017-3-17 
		* @author: yuanchun
		* @title: selectCallTaskMarketCaseLabelFormula 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectCallTaskMarketCaseLabelFormula(IQueryFilter queryFilter) {
			List<Map<String,Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseinfoSelectMarketcaserelcalltaskcustgrouptypeandformula(), queryFilter);
			return list;
		}
		
		/**
		 * 查询渠道任务的营销案下的目标客户群类型和目标客户群标签表达式
		* @date: 2016-10-12 
		* @author: yangwl
		* @title: selectMarketcaseRelCustGroupTypeAndFormula 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectChannelTaskMarketCaseLabelFormula(IQueryFilter queryFilter) {
			List<Map<String,Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseinfoSelectMarketcaserelcustgrouptypeandformula(), queryFilter);
			return list;
		}
		
		/**
		 * 根据Id删除营销案
		* @date: 2016-10-17 
		* @author: zhangjj_crmpd
		* @title: deleteMarketCaseById 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void deleteMarketCaseById(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmmarketcaseinfoDelete(), inParam);
			
		}
		
		/**
		 * 查询营销案数量
		* @date: 2016-11-8 
		* @author: mengxi
		* @title: selectMarketCaseNum 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		Map<String,Object> selectMarketCaseNum(IQueryFilter queryFilter){ 
			Map<String, Object> map = (Map<String, Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmmarketcaseinfoSelectRmmarketcasenum(), queryFilter); 
			List<Map<String,Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseinfoSelectRmmarketcasecount(), queryFilter);
			map.put("marketCaseList", list);
			return map; 
		}

		/**
		 * 查询渠道触发营销案
		* @date: 2016-11-21 
		* @author: yangwl
		* @title: selectChannelTriggerMarketCase 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String,Object>> selectChannelTriggerMarketCase(IQueryFilter queryFilter){
			List<Map<String,Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseinfoSelectChanneltriggermarketcase(), queryFilter);
			return list;
		}
		
		/**
		 * 查询营销案和全局规则
		* @date: 2016-11-16 
		* @author: yuanliang
		* @title: selectMarketCaseAndWholeRuleDetail 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectMarketCaseAndWholeRuleDetail(
				IQueryFilter queryFilter) {
			List<Map<String,Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseinfoSelectMarketcaseandwholeruledetail(), queryFilter);
			return list;
		}

		/**
		 * 查询事件触发营销案
		* @date: 2017-1-2 
		* @author: sunliang 
		* @title: selectEventTriggerMarketCase 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectEventTriggerMarketCase(
				IQueryFilter queryFilter) {
			List<Map<String,Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmmarketcaseinfoSelectEventtriggermarketcase(), queryFilter);
			return list;
		}
	}
	
	/**
	 * 菜单表
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: RmMenuInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmMenuInfo extends IRmMenuInfo implements Serializable{
		
		/**
		 * 删除
		* @date: 2016-10-26 
		* @author: fangyuan_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmmenuinfoDelete(), inParam);
			
		}
		
		/**
		 * 插入
		* @date: 2016-10-26 
		* @author: fangyuan_crmpd
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmmenuinfoInsert(), inParam);
			
		}
		
		/**
		 * 查询菜单列表
		* @date: 2016-10-26 
		* @author: fangyuan_crmpd
		* @title: selectMenuList 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectMenuList(Map<String, Object> inParam) {
			List<Map<String,Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmmenuinfoSelect(), inParam);
			return list;
		}
		
		/**
		 * 查询菜单详细信息
		* @date: 2016-10-26 
		* @author: fangyuan_crmpd
		* @title: selectMenuDetailById 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectMenuDetailById(Map<String, Object> inParam) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmmenuinfoSelectMenubyid(), inParam);
			return list;
		}
		
		/**
		 * 通过工号查询菜单列表
		* @date: 2016-10-29 
		* @author: fangyuan_crmpd
		* @title: selectMenuListByLoginNo 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		List<Map<String, Object>> selectMenuListByLoginNo(Map<String, Object> inParam) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmmenuinfoSelectMenubyloginno(), inParam);
			return list;
		}
		
		/**
		 * 更新
		* @date: 2016-10-26 
		* @author: fangyuan_crmpd
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmmenuinfoUpdate(), inParam);
			
		}	
	}
	
	/**
	 * 短信触发操作日志
	* @date: 2017-3-7 
	* @author: WuJiaFu
	* @title: IRmMessageTriggerLogInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmMessageTriggerLogInfo extends IRmMessageTriggerLogInfo implements Serializable{
		
		/**
		 * 插入
		* @date: 2017-3-7 
		* @author: wuJiaFu
		* @title: insert 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			baseDao.insert(iBatisSqlMap.getIbatisRmmessagetriggerloginfoInsert(),inParam);
			
		}

		/**
		 * 查询
		* @date: 2017-3-7 
		* @author: wuJiaFu
		* @title: select 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> select(Map<String, Object> inParam,IQueryFilter queryFilter,
				int start, int limit) {
			Map<String, Object> map = (Map<String, Object>)baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmmessagetriggerloginfoSelect(), queryFilter, start, limit); 
			return map;
		}
		
	}
	
	
	/**
	 * 监控告警表
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: RmMonitorWarningInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmMonitorWarningInfo extends IRmMonitorWarningInfo implements Serializable{
		
		/**
		 * 删除
		* @date: 2016-11-13 
		* @author: fangyuan_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmmonitorwarninginfoDelete(), inParam);
			
		}
		
		/**
		 * 插入
		* @date: 2016-11-13 
		* @author: fangyuan_crmpd
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			inParam.put("runingTime", DateUtil.string2Timestamp((String)inParam.get("runingTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.insert(iBatisSqlMap.getIbatisRmmonitorwarninginfoInsert(),inParam);
			
		}
		
		/**
		 * 查询
		* @date: 2016-11-13 
		* @author: fangyuan_crmpd
		* @title: select 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> select(Map<String, Object> inParam) {
			Map<String, Object> map = (Map<String, Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmmonitorwarninginfoSelect(), inParam); 
			map.put("runingTime", DateUtil.timestamp2String((Timestamp) map.get("runingTime"), DateUtil.TIME_FROMAT_SIMPLE3));	
			return map;
		}
		
	}
	
	/**
	 * 公告表
	* @date: 2017-2-27 
	* @author: yexr
	* @title: RmNoticeInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmNoticeInfo extends IRmNoticeInfo implements Serializable{
		/**
		 * 查询公告列表
		* @date: 2017-2-27 
		* @author: yexr
		* @title: selectNoticeList 
		* @param queryFilter
		* @param start
		* @param limit
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectNoticeList(IQueryFilter queryFilter,int start,int limit) {
			return baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmnoticeinfoSelect(), queryFilter,start,limit);
			
		}

		/**
		 * 插入公告
		* @date: 2017-3-1 
		* @author: yexr
		* @title: insertNotice 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insertNotice(Map<String, Object> tempInParam) throws StrategyError {
			tempInParam.put("createTime", DateUtil.string2Timestamp((String)tempInParam.get("createTime"), DateUtil.TIME_FROMAT_SIMPLE1));
			baseDao.insert(iBatisSqlMap.getIbatisRmnoticeinfoInsert(),tempInParam);	
		}
		
		/**
		 * 删除公告
		* @date: 2017-3-1 
		* @author: yexr
		* @title: removeNotice 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void removeNotice(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmnoticeinfoDelete(),inParam);	
		}
		
		
		/**
		 * 修改公告
		* @date: 2017-3-1 
		* @author: yexr
		* @title: updateNotice 
		* @param tempInParam
		* @exception: 
		* @version: 1.0 
		 * @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void updateNotice(Map<String, Object> inParam) {
			try {
				inParam.put("createTime", DateUtil.string2Timestamp((String)inParam.get("createTime"), DateUtil.TIME_FROMAT_SIMPLE1));
			} catch (StrategyError e) {
				e.printStackTrace();
			}
			baseDao.update(iBatisSqlMap.getIbatisRmnoticeinfoUpdate(),inParam);						
		}
	}
	
	/**
	 * 操作日志表
	* @date: 2016-11-1 
	* @author: tangaq
	* @title: RmOperLogInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmOperLogInfo extends IRmOperLogInfo implements Serializable{

		/**
		 * 查询操作日志列表
		* @date: 2016-11-1 
		* @author: tangaq
		* @title: selectOperLogList 
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectOperLogList(IQueryFilter queryFilter,int start,int limit) {
			return  baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmoperloginfoSelect(),queryFilter,start,limit);
		}

	}
	/**
	 * 产商品信息查询
	* @date: 2017-2-21 
	* @author: hannn
	* @title: RmProductCommodityReportInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmProductCommodityReportInfo extends IRmProductCommodityReportInfo implements Serializable{
		/**
		 * 查询产商品信息报表
		* @date: 2017-3-3 
		* @author: hannn
		* @title: select 
		* @param queryFilter
		* @param startNum
		* @param endNum
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
			@Override
			List<Map<String, Object>> select(IQueryFilter queryFilter,int startNum,int endNum) {
				List<Map<String, Object>> list = baseDao.queryForListBeginEnd(iBatisSqlMap.getIbatisRmProductCommodityReportInfoSelect(),queryFilter,startNum,endNum);
				return list;
			}
			/**
			 * 查询产商品报表总记录
			* @date: 2017-2-24 
			* @author: hannn
			* @title: selectProductCommodityReportCount 
			* @param queryFilter
			* @return 
			* @exception: 
			* @version: 1.0 
			* @description: 
			* update_version: update_date: update_author: update_note:
			 */
			@Override
			public String selectProductCommodityReportCount(IQueryFilter queryFilter) {
				return (String) baseDao.queryForObject(iBatisSqlMap.getIbatisRmProductCommodityReportInfoSelectCount(), queryFilter) ;
			}
			/**
			 * 查询全省产商品信息报表
			* @date: 2017-2-24 
			* @author: hannn
			* @title: selectProductCommodityReport 
			* @param queryFilter
			* @param startNum
			* @param endNum
			* @return 
			* @exception: 
			* @version: 1.0 
			* @description: 
			* update_version: update_date: update_author: update_note:
			 */
			@Override
			List<Map<String, Object>> selectProductCommodityReport(IQueryFilter queryFilter,int startNum,int endNum) {
				List<Map<String, Object>> list = baseDao.queryForListBeginEnd(iBatisSqlMap.getIbatisRmProductCommodityReportInfoByProvinceSelect(),queryFilter,startNum,endNum);
				return list;
			}
			/**
			 * 插入产商品信息报表数据
			* @date: 2017-2-22 
			* @author: mengxi
			* @title: insert 
			* @param inParam 
			* @exception: 
			* @version: 1.0 
			* @description: 
			* update_version: update_date: update_author: update_note:
			 */
			void insert(Map<String, Object> inParam) {
				log.info("RmProductCommodityReportInfo.insert.inParam", inParam);
				baseDao.insert(iBatisSqlMap.getIbatisRmProductCommodityReportInfoInsert(), inParam);
			}
	}

	/**
	 * 运营位表
	* @date: 2016-9-10 
	* @author: zhaoyue
	* @title: RmPositionInf 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmPositionInfo extends IRmPositionInfo implements Serializable{

		/**
		 * 删除运营位信息
		* @date: 2016-10-19 
		* @author: wangth
		* @Title: delete 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmpositioninfoDelete(), inParam);
		}
		
		/**
		 * 插入运营位信息
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			if(!CommonUtils.objectIsNull((String)inParam.get("operTime"))){
				inParam.put("operTime", DateUtil.string2Timestamp((String)inParam.get("operTime"), DateUtil.DATE_FROMAT_YYYYMMDD2));
			}
			baseDao.insert(iBatisSqlMap.getIbatisRmpositioninfoInsert(),inParam);
		}

		/**
		 * 查询运营位信息
		* @date: 2016-9-15 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>>  list = baseDao.queryForList(iBatisSqlMap.getIbatisRmpositioninfoSelect(), queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(Map<String,Object> map : list){
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}

		/**
		 * 更新运营位信息
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) throws StrategyError {
			inParam.put("operTime", DateUtil.string2Timestamp((String)inParam.get("operTime"), DateUtil.DATE_FROMAT_YYYYMMDD2));
			baseDao.update(iBatisSqlMap.getIbatisRmpositioninfoUpdate(),inParam);
		}
	}
	
	/**
	 * 产商品操作
	* @date: 2016-10-6 
	* @author: zhangjj_crmpd
	* @title: RmProductCommodityInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmProductCommodityInfo extends IRmProductCommodityInfo implements Serializable{
		
		/**
		 * 查询产商品列表
		* @date: 2016-10-6 
		* @author: zhangjj_crmpd
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectRmProductCommodityList(IQueryFilter queryFilter,int startNum,int endNum) {
			List<Map<String, Object>> list = baseDao.queryForListBeginEnd(iBatisSqlMap.getIbatisRmproductcommodityinfoSelect(),queryFilter,startNum,endNum);
			return list;
		}

		
		/**
		 * 按条件查询产商品数量
		* @date: 2016-10-9 
		* @author: zhangjj_crmpd
		* @title: selectProductCommodityCount 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String selectProductCommodityCount(IQueryFilter queryFilter) {
			return (String) baseDao.queryForObject(iBatisSqlMap.getIbatisRmproductcommodityinfoSelectCount(), queryFilter) ;
		}

		/**
		 * 查询产商品
		* @date: 2016-10-18 
		* @author: zhangjj_crmpd
		* @title: selectRmProductCommodity 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectRmProductCommodity(IQueryFilter queryFilter) {
			return (Map<String, Object>) baseDao.queryForObject(iBatisSqlMap.getIbatisRmproductcommodityinfoSelect(), queryFilter);
		}
	}

	/**产品操作
	* Create on 2016-10-25
	* @author: wangpei
	* @Title:RmProductInfo
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class RmProductInfo extends IRmProductInfo implements Serializable{

		/** 
		* @date: 2016-10-13 
		* @author: wangpei
		* @title: select 
		* @param queryFilter
		* @param startNum
		* @param endNum
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisRmproductdictSelect(),queryFilter);
		}

		/** 分页
		* @date: 2016-10-30 
		* @author: wangpei
		* @title: selectForPage 
		* @param queryFilter
		* @param start
		* @param limit
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		Map<String, Object> selectForPage(IQueryFilter queryFilter, int start,
				int limit) {
			return baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmproductdictSelect(), queryFilter, start, limit);
		}
	}
	
	/**
	* 调查问卷
	* @date: 2016-12-12 
	* @author: zhangqia
	* @Title: RmQuestionNaireInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	*/
	public class RmQuestionNaireInfo extends IRmQuestionNaireInfo implements Serializable{
		
		/**
		 * 插入问卷调查
		* @date: 2016-12-12 
		* @author: zhangqia
		* @Title: insert 
		* @param inParam 
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			baseDao.insert(iBatisSqlMap.getIbatisRmquestionnaireinfoInsert(), inParam);
		}
		/**
		 * 查询问卷调查根据ID
		* @date: 2016-12-12 
		* @author: zhangqia
		* @Title: select 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String,Object> select(IQueryFilter queryFilter) {
			Map<String, Object> map = (Map<String, Object>) baseDao.queryForObject(iBatisSqlMap.getIbatisRmquestionnaireinfoSelect(), queryFilter);
			return map;
		}
		/**
		 * 查询问卷调查列表
		* @date: 2016-12-21 
		* @author: yuanliang
		* @title: selectQuestionNaireList 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String,Object>> selectQuestionNaireList(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmquestionnaireinfoSelectQuestionnairelist(),queryFilter);
			return list;
		}
		/**
		 * 查询营销案对应的问卷调查列表信息
		* @date: 2016-12-21 
		* @author: yuanliang
		* @title: selectMarketCaseAndContentList 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectMarketCaseAndContentList(
				IQueryFilter queryFilter) {
			List<Map<String, Object>> list = (List<Map<String, Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmquestionnaireinfoSelectMarketcaseandcontentlist(),queryFilter);
			return list;
		}		
		/**
		 * 更新调查问卷根据ID
		* @date: 2016-10-22 
		* @author: zhangqia
		* @Title: update 
		* @param inParam 
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) throws StrategyError {
			baseDao.update(iBatisSqlMap.getIbatisRmquestionnaireinfoUpdate(), inParam);
		}

	}
	

/**
	 * 回单反馈表
	 * 
	 * @date: 2017-1-9
	 * @author: liuqi
	 * @title: RmReceiptRecordInfo
	 * @version: 1.0
	 * @description： update_version: update_date: update_author: update_note:
	 */
	public class RmReceiptRecordInfo extends IRmReceiptRecordInfo implements
			Serializable {

		/**
		 * 查询回单反馈表
		 * 
		 * @date: 2017-1-9
		 * @author:liuqi
		 * @title: select
		 * @param inParam
		 * @exception:
		 * @version: 1.0
		 * @description: update_version: update_date: update_author:
		 *               update_note:
		 */
		Map<String, Object> select(Map<String, Object> inParam,
				IQueryFilter queryFilter, int start, int limit) {
			return baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmreceiptRecordInfoSelect(),queryFilter, start, limit);
		}
	}
	
	/**
	 * 关系表
	* @date: 2016-9-8 
	* @author: zhaoyue
	* @title: RmRelstionRel 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmRelationRel extends IRmRelationRel implements Serializable{
		
		/**
		 * 插入关系表
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String,Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmrelationrelInsert(), inParam);
		}
		
		/**
		 * 查询关系表
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmrelationrelSelect(), queryFilter);
			return list;
		}
	
		/**
		 * 查询客户群与子客户关系列表
		* @date: 2016-11-25 
		* @author: fangyuan_crmpd
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectCustGroupRelation(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmrelationrelSelectCustgrouprel(),queryFilter); 
			return list;
		}
	
		/**
		 * 根据事件id查询营销案id
		* @date: 2017-2-14 
		* @author: sunyuan
		* @title: selectMarketCaseIdByEventId 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		List<Map<String,Object>> selectMarketCaseIdByEventId(IQueryFilter queryFilter){
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmrelationrelSelectMarketCaserel(),queryFilter); 
			return list;
		}
		
		/**
		 * 根据渠道查询营销案
		* @date: 2017-4-5 
		* @author: sunyuan
		* @title: selectMarketCaseIdByChannelRel 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		Map<String,Object> selectMarketCaseIdByChannelRel(IQueryFilter queryFilter){
			Map<String,Object> map = (Map<String, Object>) baseDao.queryForObject(iBatisSqlMap.getIbatisRmrelationrelSelectMarketCaserelByChannelRel(),queryFilter);
			return map;
		}
		
		/**
		 * 根据规则id查询营销案id
		* @date: 2017-3-30 
		* @author: sunyuan
		* @title: selectMarketCaseIdByRuleId 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		Map<String,Object> selectMarketCaseIdByRuleId(IQueryFilter queryFilter){
			Map<String, Object> map = (Map<String, Object>) baseDao.queryForObject(iBatisSqlMap.getIbatisRmrelationrelSelectMarketCaserelByRuleId(),queryFilter); 
			return map;
		}
		
		/** 查询关系
		* @date: 2016-10-17 
		* @author: wangpei
		* @title: selectRelation 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		Map<String, Object> selectRelation(IQueryFilter queryFilter) {
			return (Map<String, Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmrelationrelSelect(), queryFilter);
		}

		/**
		 * 更新关系表
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmrelationrelUpdate(), inParam);
		}

		/** 
		* @date: 2016-10-14 
		* @author: wangpei
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmrelationrelDelete(), inParam);
		}
		
	}
	
	/**
	 * 角色表
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: RmRoleInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmRoleInfo extends IRmRoleInfo implements Serializable{
		
		/**
		 * 删除
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: delete 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmroleinfoDelete(), inParam);
		}
		
		/**
		 * 插入
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: insert 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmroleinfoInsert(), inParam);
		}
		
		/**
		 * 查询列表
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: select 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmroleinfoSelect(), queryFilter);
			return list;
		}
		
		/**
		 * 根据工号查询该工号下面拥有的角色列表 
		* @date: 2016-10-27 
		* @author: xiongxq
		* @Title: selectByLoginNo 
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> selectByLoginNo(IQueryFilter queryFilter) {
			List<Map<String, Object>> outList = baseDao.queryForList(iBatisSqlMap.getIbatisRmroleinfoSelectRoledetail(), queryFilter);
			return outList;
		}

		/**
		 * 根据工号查询该工号下面未拥有的角色 
		* @date: 2016-10-28 
		* @author: xiongxq
		* @Title: selectNoHasByLoginNo 
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> selectNoHasByLoginNo(IQueryFilter queryFilter) {
			List<Map<String, Object>> outList = baseDao.queryForList(iBatisSqlMap.getIbatisRmroleinfoSelectNothasrole(), queryFilter);
			return outList;
		}

		/**
		 * 更新
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: update 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmroleinfoUpdate(), inParam);
		}
	}
	
	/**
	 * 角色菜单关系
	* @date: 2016-10-28 
	* @author: zhangjj_crmpd
	* @title: RmRoleUserRel 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmRoleMenuRel extends IRmRoleMenuRel implements Serializable{
		
		/**
		 * 删除角色与菜单关系
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: delete 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmrolemenurelDelete(), inParam);
		}
		
		/**
		 * 插入角色与菜单关系
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: insert 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(List<Map<String, Object>> list) {
			baseDao.batchInsert(iBatisSqlMap.getIbatisRmrolemenurelInsert(), list);
		}
		
		/**
		 * 查询角色与菜单关系
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: select 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmrolemenurelSelect(), queryFilter);
			return list;
		}
		
	}
	
	/**
	 * 用户角色关系表
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: RmRoleUserRel 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmRoleUserRel extends IRmRoleUserRel implements Serializable{
		
		/**
		 * 删除用户和角色的关系
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: delete 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmroleuserrelDelete(), inParam);
		}
		
		/**
		 * 根据工号删除接入码 
		* @date: 2016-10-28 
		* @author: xiongxq
		* @Title: deleteByLoginNo 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void deleteByLoginNo(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmroleuserrelDelete(),inParam);
		}

		/**
		 * 插入用户和角色关系
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: insert 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmroleuserrelInsert(), inParam);
		}
		
		/**
		 * 插入接入码 
		* @date: 2016-10-28 
		* @author: xiongxq
		* @Title: insertAccessCode 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void insertAccessCode(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmroleuserrelInsert(), inParam);
		}

		/**
		 * 批量添加接入码
		* @date: 2016-10-29 
		* @author: xiongxq
		* @Title: insertBatchAccessCode 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		void insertBatchAccessCode(Map<String, Object> inParam) {
			baseDao.batchInsert(iBatisSqlMap.getIbatisRmroleuserrelInsert(), (List<Map<String,Object>>)inParam.get("outList"));
		}

		/**
		 * 批量插入用户和角色关系
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: insert 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insertBatchRoleUserRel(Map<String, Object> inParam) {
			baseDao.batchInsert(iBatisSqlMap.getIbatisRmroleuserrelInsert(), (List<Map<String,Object>>)inParam.get("outList"));
		}
		
		/**
		 * 查询用户和角色的关系
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: select 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmroleuserrelSelect(), queryFilter);
			return list;
		}
	}
	
	/**
	 * 规则表
	* @date: 2016-9-8 
	* @author: zhaoyue
	* @title: RmRuleInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmRuleInfo extends IRmRuleInfo implements Serializable{
		
		/**
		 * 删除规则信息
		* @date: 2016-10-21 
		* @author: zhangjj_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmruleinfoDelete(), inParam);
		}

		/**
		 * 插入规则信息
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmruleinfoInsert(),inParam);
		}
		
		/**
		 * 查询规则信息
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> select(IQueryFilter queryFilter) {
			Map<String, Object> map = (Map<String, Object>)baseDao.queryForObject(iBatisSqlMap.getIbatisRmruleinfoSelect(),queryFilter);
			return map;
		}
		
		/**
		 * 查询规则表集合
		* @date: 2017-3-29 
		* @author: sunyuan
		* @title: selectRuleInfoList 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		List<Map<String,Object>> selectRuleInfoList(IQueryFilter queryFilter){
			List<Map<String,Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmruleinfoListSelect(), queryFilter);
			return list;
		}
		
		/**
		 * 更新规则信息
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmruleinfoUpdate(), inParam);
		}
	}
	
	/**
	 * 用户推荐表
	 * 
	 * @date: 2017-1-6
	 * @author: liuqi
	 * @title: RmUserTouchViewInfo
	 * @version: 1.0
	 * @description： update_version: update_date: update_author: update_note:
	 */
	public class RmRecommendRecordInfo extends IRmRecommendRecordInfo implements
			Serializable {

		/**
		 * 查询用户推荐表
		 * 
		 * @date: 2017-1-6
		 * @author: liuqi
		 * @title: select
		 * @param inParam
		 * @param queryFilter
		 * @param start
		 * @param limit
		 * @return
		 * @exception:
		 * @version: 1.0
		 * @description: update_version: update_date: update_author:
		 *               update_note:
		 */
		@Override
		Map<String, Object> select(Map<String, Object> inParam,IQueryFilter queryFilter, int start, int limit) {
			return baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmrecommendRecordInfoSelect(),queryFilter, start, limit);
		}

	}
	
	/**
	 * 规则信息表
	* @date: 2016-9-8 
	* @author: zhaoyue
	* @title: RmRuleDetailInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmRuleDetailInfo extends IRmRuleDetailInfo implements Serializable{
		
		/**
		 * 删除规则配置 
		* @date: 2016-10-15 
		* @author: xiongxq
		* @Title: delete 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmruledetailinfoDelete(),inParam);
		}
		
		/**
		 * 插入规则详细信息
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmruledetailinfoInsert(),inParam);
		}
	
		/**
		 * 查询内容详细信息
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmruledetailinfoSelect(), queryFilter);
			log.debug("===ProceRDBMSDMLByIBatis.RmRuleDetailInfo.select.list===", list);
			return list;
		}
		
		/**
		 * 根据id查询分组查询规则批次号
		* @date: 2016-12-21 
		* @author: zhangjj_crmpd
		* @title: selectRuleDetailBatchNoById 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectRuleDetailBatchNoById(
				IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisRmruledetailinfoSelectSelectruledetailbatchnobyid(), queryFilter);
		}
		
		/**
		 * 根据关系id查询规则详情
		* @date: 2016-12-21 
		* @author: zhangjj_crmpd
		* @title: selectRuleDetailByParentComponentId 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectRuleDetailByParentComponentId(
				IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisRmruledetailinfoSelectSelectruledetailbyparentcomponentid(), queryFilter);
		}
	
		/**
		 * 查询规则详细信息Id
		* @date: 2016-10-8 
		* @author: wangth
		* @Title: selectRuleDetailId 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectRuleDetailId(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmruledetailinfoSelectRuledetailid(),queryFilter);
			return list;
		}
		
		/**
		 * 根据事件ID和营销案ID查询规则详细
		* @date: 2017-3-8 
		* @author: sunliang 
		* @title: selectRuleDetailsByEventIdAndMarketCaseId 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectRuleDetailsByEventIdAndMarketCaseId(
				IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmruledetailinfoSelectRuleDetailsByEventIdAndMarketCaseId(),queryFilter);
			return list;
		}
		
		/**
		 * 查询全局规则根据营销案Id
		* @date: 2016-11-8 
		* @author: zhangjj_crmpd
		* @title: selectWholeRuleDetailByMarketCaseId 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectWholeRuleDetailByMarketCaseId(
				IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisRmruledetailinfoSelectSelectwholeruledetailbymarketcaseid(), queryFilter);
		}

		/**
		 * 更新内容详细信息
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmruledetailinfoUpdate(), inParam);
		}

		/**
		 * 根据push营销案id，查询规则
		* @date: 2017-4-12 
		* @author: chenhao
		* @title: selectRuleDetailByMarketCaseId 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectRuleDetailByMarketCaseId(IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisRmruledetailinfoSelectRuleDetailByMarketCaseId(), queryFilter);
		}

	}
	
	/**
	 * 
	* @date: 2016-9-8 
	* @author: zhangqia 
	* @title: WaitSendTaskControl 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmWaitSendTaskControlInfo extends IRmWaitSendTaskControlInfo implements Serializable{
		
		/**
		 * 插入批量主动PUSH任务记录
		* @date: 2016-9-8 
		* @author: zhangqia
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmwaitsendtaskcontrolinfoInsert(),inParam);
		}	
		/**
		 * 查询批量主动PUSH任务加载记录
		* @date: 2016-9-8 
		* @author: zhangqia
		* @title: select 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmwaitsendtaskcontrolinfoSelect(), queryFilter);
			return list;
		}
	}
	
	/**服务监控表
	* Create on 2017-3-8
	* @author: wangpei
	* @Title:RmServicemonitoringInfo
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class RmServicemonitoringInfo extends IRmServicemonitoringInfo implements Serializable{

		/** 
		* @date: 2017-3-8 
		* @author: wangpei
		* @title: insert 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		void insert(Map<String, Object> tempInParam) {
			baseDao.insert(iBatisSqlMap.getIbatisRmServicemonitoringInfoInsert(),tempInParam);
		}
		
		/**
		 * 
		* @date: 2017-3-10 
		* @author: wuJiaFu
		* @title: select 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> select(Map<String, Object> inParam,int start,int limit) {
			Map<String, Object> outMap = baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmServicemonitoringInfoSelect(), inParam,start,limit);
			
			return outMap;
		}
		
		
	}
	/**
	 * 短信表
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: RmShortMessageInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmShortMessageInfo extends IRmShortMessageInfo implements Serializable{
		
		/**
		 * 删除短信码
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: delete 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmmsgaccesscodeserinfoDelete(),inParam);
		}
		
		/**
		 * 插入短信码
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: insert 
		* @param inParam 
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			inParam.put("startDate", DateUtil.string2Timestamp((String)inParam.get("startDate"), DateUtil.DATE_FROMAT_YYYYMMDD2));
			inParam.put("endDate", DateUtil.string2Timestamp((String)inParam.get("endDate"), DateUtil.DATE_FROMAT_YYYYMMDD2));
			baseDao.insert(iBatisSqlMap.getIbatisRmmsgaccesscodeserinfoInsert(), inParam);
		}
		
		/**
		 * 查询短信码列表
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: select 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmmsgaccesscodeserinfoSelect(), queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(Map<String,Object> map : list){
					map.put("startDate", DateUtil.timestamp2String((Timestamp) map.get("startDate"), DateUtil.TIME_FROMAT_SIMPLE1));
					map.put("endDate", DateUtil.timestamp2String((Timestamp) map.get("endDate"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}
		
		/**
		 * 根据工号查询该工号下拥有的接入码列表 
		* @date: 2016-10-28 
		* @author: xiongxq
		* @Title: selectAccessCodeByLoginNo 
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> selectAccessCodeByLoginNo(
				IQueryFilter queryFilter) {
			List<Map<String, Object>> outList = baseDao.queryForList(iBatisSqlMap.getIbatisRmmsgaccesscodeserinfoSelectMsgaccesscodeserdetail(), queryFilter);
			return outList;
		}

		/**
		 * 根据工号查询该工号下未有的接入码列表  
		* @date: 2016-10-28 
		* @author: xiongxq
		* @Title: selectNotHasAccessCodeByLoginNo 
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		List<Map<String, Object>> selectNotHasAccessCodeByLoginNo(
				IQueryFilter queryFilter) {
			List<Map<String, Object>> outList = baseDao.queryForList(iBatisSqlMap.getIbatisRmmsgaccesscodeserinfoSelectMsgaccesscodesernothas(), queryFilter);
			return outList;
		}

		/**
		 * 更新短信信息
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: update 
		* @param inParam 
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) throws StrategyError {
			inParam.put("startDate", DateUtil.string2Timestamp((String)inParam.get("startDate"), DateUtil.DATE_FROMAT_YYYYMMDD2));
			inParam.put("endDate", DateUtil.string2Timestamp((String)inParam.get("endDate"), DateUtil.DATE_FROMAT_YYYYMMDD2));
			baseDao.update(iBatisSqlMap.getIbatisRmmsgaccesscodeserinfoUpdate(), inParam);
		}
	}
	
	/**
	 * 短信推送流量表
	* @date: 2016-10-31 
	* @author: fangyuan_crmpd
	* @title: RmShortMsgMoveTrafficInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmShortMsgMoveTrafficInfo extends IRmShortMsgMoveTrafficInfo implements Serializable{
		
		/**
		 * 通过日期查询短信推送流量表
		* @date: 2016-10-31 
		* @author: fangyuan_crmpd
		* @title: selectShortMsgMoveTrafficByDate 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectShortMsgMoveTrafficByDate(
				Map<String, Object> inParam) throws StrategyError {
			inParam.put("date", DateUtil.string2Timestamp((String)inParam.get("date"), DateUtil.TIME_FROMAT_SIMPLE3));
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisShortmsgmovetrafficinfoSelectBydate(), inParam);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(Map<String,Object> map : list){
					map.put("date", DateUtil.timestamp2String((Timestamp) map.get("date"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}
		
		/**
		 * 通过营销案ID查询短信推送流量
		* @date: 2016-10-31 
		* @author: fangyuan_crmpd
		* @title: selectShortMsgMoveTrafficByMarketCaseId 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectShortMsgMoveTrafficByMarketCaseId(
				Map<String, Object> inParam) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisShortmsgmovetrafficinfoSelectBymarketcaseid(), inParam);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(Map<String,Object> map : list){
					map.put("date", DateUtil.timestamp2String((Timestamp) map.get("date"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}
		
	}
	
	/**
	 * shell进程执行信息表
	* @date: 2016-10-13 
	* @author: yangwl
	* @title: RmShellProcessExecuteInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public  class RmShellProcessExecuteInfo extends IRmShellProcessExecuteInfo implements Serializable{
		
		/**
		 * 增加
		* @date: 2016-10-13 
		* @author: yangwl
		* @title: insert 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> tempInParam) {
			baseDao.insert(iBatisSqlMap.getIbatisShellprocessexecuteinfoInsert(),tempInParam);
		}

		/**
		 * 查询
		* @date: 2016-10-13 
		* @author: yangwl
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisShellprocessexecuteinfoSelect(), queryFilter);
		}

		/**
		 * 更新
		* @date: 2016-10-13 
		* @author: yangwl
		* @title: update 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> tempInParam) {
			baseDao.update(iBatisSqlMap.getIbatisShellprocessexecuteinfoUpdate(),tempInParam);
		}
		/**
		 * 
		* @date: 2017-4-14 
		* @author: chenhao
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectToday(IQueryFilter queryFilter) {
			return baseDao.queryForList(iBatisSqlMap.getIbatisShellprocessexecuteinfoSelectToday(), queryFilter);
		}
		
	}
	
	/**
	 * 调配信息表
	* @date: 2016-12-15 
	* @author: zhangjj_crmpd
	* @title: RmTemplateInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public  class RmTaskAdjustInfo extends IRmTaskAdjustInfo implements Serializable{

		/**
		 * 删除调配信息
		* @date: 2016-10-19 
		* @author: zhangjj_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmtaskadjustinfoDelete(),inParam);
		}
		
		/**
		 * 插入任务调配信息
		* @date: 2016-12-15 
		* @author: zhangjj_crmpd
		* @title: insert 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			inParam.put("operTime", DateUtil.string2Timestamp((String)inParam.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
			inParam.put("startTime", DateUtil.string2Timestamp((String)inParam.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE1));
			inParam.put("endTime", DateUtil.string2Timestamp((String)inParam.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE1));
			baseDao.insert(iBatisSqlMap.getIbatisRmtaskadjustinfoInsert(),inParam);
			
		}

		/**
		 * 查询任务调配信息
		* @date: 2016-12-15 
		* @author: zhangjj_crmpd
		* @title: selectTaskAdjustInfo 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectTaskAdjustInfo(IQueryFilter queryFilter) {
			return (Map<String, Object>) baseDao.queryForObject(iBatisSqlMap.getIbatisRmtaskadjustinfoSelect(), queryFilter);
		}
		
		/**
		 * 根据参数查询任务调配信息
		* @date: 2017-1-9 
		* @author: zhangjj_crmpd
		* @title: selectTaskAdjustInfoByParam 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectTaskAdjustInfoByParam(
				IQueryFilter queryFilter) {
			return  baseDao.queryForList(iBatisSqlMap.getIbatisRmtaskadjustinfoSelectByParam(), queryFilter);
		}

		/**
		 * 更新调配信息
		* @date: 2016-10-19 
		* @author: zhangjj_crmpd
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmtaskadjustinfoUpdate(), inParam);
			
		}

	}
	
	
	/**
	 * 模板信息表
	* @date: 2016-12-15 
	* @author: zhangjj_crmpd
	* @title: RmTemplateInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public  class RmTemplateInfo extends IRmTemplateInfo implements Serializable{

		/**
		 * 插入模板
		* @date: 2016-10-19 
		* @author: zhangjj_crmpd
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			inParam.put("operTime", DateUtil.string2Timestamp((String)inParam.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
			inParam.put("startTime", DateUtil.string2Timestamp((String)inParam.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE1));
			inParam.put("endTime", DateUtil.string2Timestamp((String)inParam.get("endTime"), DateUtil.TIME_FROMAT_SIMPLE1));
			baseDao.insert(iBatisSqlMap.getIbatisRmtemplateinfoInsert(),inParam);
			
		}

		/**
		 * 查询模板列表
		* @date: 2016-10-19 
		* @author: zhangjj_crmpd
		* @title: selectTemplateList 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectTemplateList(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmtemplateinfoSelect(), queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(int i=0;i<list.size();i++){
					Map<String, Object> map = list.get(i);
					map.put("operTime", DateUtil.timestamp2String((Timestamp) map.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}

		/**
		 * 查询模板信息
		* @date: 2016-10-19 
		* @author: zhangjj_crmpd
		* @title: selectTemplateInfo 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectTemplateInfo(IQueryFilter queryFilter) {
			return (Map<String, Object>) baseDao.queryForObject(iBatisSqlMap.getIbatisRmtemplateinfoSelect(), queryFilter);
		}

		/**
		 * 更新模板信息
		* @date: 2016-10-19 
		* @author: zhangjj_crmpd
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) {
			baseDao.update(iBatisSqlMap.getIbatisRmtemplateinfoUpdate(), inParam);
			
		}

		/**
		 * 删除模板信息
		* @date: 2016-10-19 
		* @author: zhangjj_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmtemplateinfoDelete(),inParam);
		}
		
	}
	
	/**
	 *  接触量表
	* @date: 2016-12-13 
	* @author: tangaq
	* @title: RmTouchCountInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmTouchCountInfo extends IRmTouchCountInfo implements Serializable{
	
		/**
		 * 查询全省的接触量
		* @date: 2016-12-13 
		* @author: tangaq
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String,Object>> outList = (List<Map<String,Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmtouchcountinfoSelect(),queryFilter);
			return outList;
		}
		
		/**
		 * 查询各个地市的接触量
		* @date: 2016-12-13 
		* @author: tangaq
		* @title: selectByRegionCode 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectByRegionCode(IQueryFilter queryFilter) {
			List<Map<String,Object>> outList = (List<Map<String,Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmtouchcountinfoSelectByregioncode(),queryFilter);
			return outList;
		}
		
		/**
		 * 查询各个地市的转化率
		* @date: 2016-12-13 
		* @author: tangaq
		* @title: selectRegionCodeConvertRate 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> selectRegionCodeConvertRate(
				IQueryFilter queryFilter) {
			List<Map<String,Object>> outList = (List<Map<String,Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmtouchcountinfoSelectConvertrate(),queryFilter);
			return outList;
		}
	}

	
	/**
	 * 用户临时标签表
	* @date: 2016-10-20 
	* @author: tangaq
	* @title: RmUserLabelTmp 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmUserLabelTmp extends IRmUserLabelTmp implements Serializable{
		
		/**
		 * 删除用户标签
		* @date: 2016-10-27 
		* @author: fangyuan_crmpd
		* @title: deleteUserLabel 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void deleteUserLabel(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmuserlabeltmpDelete(),inParam);
			
		}

		/**
		 * 新增用户标签
		* @date: 2016-10-24 
		* @author: fangyuan_crmpd
		* @title: insertUserLabel 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insertUserLabel(Map<String, Object> inParam) throws StrategyError {
			inParam.put("beginDate", DateUtil.string2Timestamp((String)inParam.get("beginDate"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("endDate", DateUtil.string2Timestamp((String)inParam.get("endDate"), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.insert(iBatisSqlMap.getIbatisRmuserlabeltmpInsert(),inParam);	
		}

		/**
		 * 查询用户标签信息
		* @date: 2016-10-19 
		* @author: tangaq
		* @title: selectUserLabel 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String,Object>> selectUserLabel(IQueryFilter queryFilter){
			List<Map<String,Object>> list = (List<Map<String,Object>>)baseDao.queryForList(iBatisSqlMap.getIbatisRmuserlabeltmpSelect(),queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
			   if(!CommonUtils.objectIsNull(list)){
					for(int i=0;i<list.size();i++){
						Map<String, Object> map = list.get(i);
						map.put("beginDate", DateUtil.timestamp2String((Timestamp) map.get("beginDate"), DateUtil.TIME_FROMAT_SIMPLE1));
						map.put("endDate", DateUtil.timestamp2String((Timestamp) map.get("endDate"), DateUtil.TIME_FROMAT_SIMPLE1));
						outList.add(map);
					}
				}
			return list;
		}
		
		/**
		 * 查询用户标签列表(直接分页不加入缓存)
		* @date: 2017-3-14 
		* @author: zhangwie_crmpd_cmi_ah
		* @title: selectForPage 
		* @param queryFilter
		* @param start
		* @param limit
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectForPage(IQueryFilter queryFilter, int start,
				int limit) {
			return baseDao.queryForPagingList(iBatisSqlMap.getUserLabelForPageSelect(), queryFilter, start, limit);
		}
		
		
		/**
		 * 更新用户标签
		* @date: 2016-10-27 
		* @author: fangyuan_crmpd
		* @title: updateUserLabel 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void updateUserLabel(Map<String, Object> inParam) throws StrategyError {
			inParam.put("beginDate", DateUtil.string2Timestamp((String)inParam.get("beginDate"), DateUtil.TIME_FROMAT_SIMPLE3));
			inParam.put("endDate", DateUtil.string2Timestamp((String)inParam.get("endDate"), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.update(iBatisSqlMap.getIbatisRmuserlabeltmpUpdate(),inParam);
		}	
	}
	
	/**
	 * 用户信息表
	* @date: 2016-11-11 
	* @author: fangyuan_crmpd
	* @title: RmUserInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmUserInfo extends IRmUserInfo implements Serializable{
		
		/**
		 * 查询用户列表
		* @date: 2016-12-5 
		* @author: zhangjj_crmpd
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			log.info("select queryFilter", queryFilter);
			return baseDao.queryForList(iBatisSqlMap.getIbatisRmuserinfoSelect(), queryFilter);
		}
		
		/**
		 * 查询用户资料列表
		* @date: 2016-11-11 
		* @author: fangyuan_crmpd
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		Map<String, Object> selectForPage(IQueryFilter queryFilter,int start,int limit) {
			return baseDao.queryForPagingList(iBatisSqlMap.getIbatisRmuserinfoSelect(), queryFilter,start,limit);
			
		}

	}
	
	/**
	 * 作业配置表
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: RmWorkConfigInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RmWorkConfigInfo extends IRmWorkCofigInfo implements Serializable{
		
		/**
		 * 删除作业配置
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: delete 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void delete(Map<String, Object> inParam) {
			baseDao.delete(iBatisSqlMap.getIbatisRmworkconfiginfoDelete(),inParam);
		}
		
		/**
		 * 插入作业配置
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: insert 
		* @param inParam 
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void insert(Map<String, Object> inParam) throws StrategyError {
			inParam.put("runTime", DateUtil.string2Timestamp((String)inParam.get("runTime"), DateUtil.TIME_FROMAT_SIMPLE3));
			baseDao.insert(iBatisSqlMap.getIbatisRmworkconfiginfoInsert(), inParam);
		}
		
		/**
		 * 查询作业配置列表
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: select 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		List<Map<String, Object>> select(IQueryFilter queryFilter) {
			List<Map<String, Object>> list = baseDao.queryForList(iBatisSqlMap.getIbatisRmworkconfiginfoSelect(), queryFilter);
			List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
			if(!CommonUtils.objectIsNull(list)){
				for(Map<String,Object> map : list){
					map.put("runTime", DateUtil.timestamp2String((Timestamp) map.get("runTime"), DateUtil.TIME_FROMAT_SIMPLE1));
					outList.add(map);
				}
			}
			return outList;
		}
		
		/**
		 * 更新作业配置
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: update 
		* @param inParam 
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		void update(Map<String, Object> inParam) throws StrategyError {
			inParam.put("runTime", DateUtil.string2Timestamp((String)inParam.get("runTime"), DateUtil.DATE_FROMAT_YYYYMMDD2));
			baseDao.update(iBatisSqlMap.getIbatisRmworkconfiginfoUpdate(), inParam);
		}
		
	}
	
}
