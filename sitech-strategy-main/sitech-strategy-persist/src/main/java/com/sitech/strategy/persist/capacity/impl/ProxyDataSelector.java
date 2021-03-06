package com.sitech.strategy.persist.capacity.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.jcfx.dt.MBean;
import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.ResultItemPojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.cache.ICacheKey;
import com.sitech.strategy.common.pojo.inter.hbase.IHbaseQualifier;
import com.sitech.strategy.common.pojo.inter.hbase.IHbaseRowKey;
import com.sitech.strategy.common.pojo.inter.rdbms.IIBatisQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.common.utils.MD5RowKeyGenerator;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.base.BaseProxyClass;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IActDemandSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IAttachSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IAuditSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IBatchPushTaskSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IChannelSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.ICommonSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IConfigSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IContentSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.ICoupleBackSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.ICustGroupSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IEvaluateSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IEventSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IInventorySelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.ILabelCodeNameSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.ILoginSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IMarketCaseSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IMonitorSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IOperLogSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IPositionSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IPrioritySelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IProductCommoditySelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IProductSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IQuestionNaireSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IRuleSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IShortMessageSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IStatisticSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.ISystemDealSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.ITaskSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.ITemplateSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.ITestSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IUserSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IWorkConfigSelector;



/**
 * 数据查询器
* @date: 2016-9-9 
* @author: zhaoyue
* @title: ProxyDataSelector 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProxyDataSelector extends BaseProxyClass implements IDataSelector,Serializable {
	
	/**
	 * 缓存rowKey对象
	 */
	protected ICacheKey cacheKey;
	/**
	 * hbaseRowKey对象
	 */
	protected IHbaseRowKey hbaseRowKey;
	/**
	 * iBatisQueryFilter对象
	 */
	protected IIBatisQueryFilter iBatisQueryFilter;
	/**
	 * hbaseQualifier
	 */
	protected IHbaseQualifier hbaseQualifier;
	
	/**
	 * 
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: setCacheKey 
	* @param cacheKey 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCacheKey(ICacheKey cacheKey) {
		this.cacheKey = cacheKey;
	}
	
	/** 
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: setHbaseRowKey 
	* @param hbaseRowKey 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setHbaseRowKey(IHbaseRowKey hbaseRowKey) {
		this.hbaseRowKey = hbaseRowKey;
	}
	
	/** 
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: setiBatisQueryFilter 
	* @param iBatisQueryFilter 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setiBatisQueryFilter(IIBatisQueryFilter iBatisQueryFilter) {
		this.iBatisQueryFilter = iBatisQueryFilter;
	}
	
	/** 
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: setHbaseQualifier 
	* @param hbaseQualifier 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setHbaseQualifier(IHbaseQualifier hbaseQualifier) {
		this.hbaseQualifier = hbaseQualifier;
	}

	/**
	 * 活动需求插入接口
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: ActDemand 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ActDemandSelector implements IActDemandSelector{
		
		protected IRDBMSDML.IRmActDemandInfo rmActDemandInfo;
		
		public void setRmActDemandInfo(IRDBMSDML.IRmActDemandInfo rmActDemandInfo) {
			this.rmActDemandInfo = rmActDemandInfo;
		}


		/**
		 * 查询
		* @date: 2016-10-20 
		* @author: wangth
		* @Title: insert 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> select(Map<String, Object> inParam,
				IQueryFilter queryFilter) throws StrategyError {
			return rmActDemandInfo.select(queryFilter);
		}
		
	}
	/**
	 * 附件数据查询操作实现类
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: AttachSeletor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class AttachSelector implements IAttachSelector,Serializable{
		
		protected IRDBMSDML.IRmAttachInfo rmAttachInfo;
		
		public void setRmAttachInfo(IRDBMSDML.IRmAttachInfo rmAttachInfo) {
			this.rmAttachInfo = rmAttachInfo;
		}
		
		/**
		 * 查询附件信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectAttachs 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectAttachs(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			return rmAttachInfo.selectAttach(queryFilter);
		}
		
        
        /**
		 * 查询附件信息
		* @date: 2017-2-16 
		* @author: luogj
		* @title: selectAttachs 
		* @param inParam 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectAttachs(Map<String, Object> inParam) throws StrategyError {
			IQueryFilter queryFilter = getAttachQueryFilter(inParam);
			
			return rmAttachInfo.selectAttach(queryFilter);
		}
		
		/**
		 * 附件表sql条件处理
		* @date: 2017-2-16 
		* @author: luogj
		* @title: getAttachQueryFilter 
		* @param inParam 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public IQueryFilter getAttachQueryFilter(Map<String, Object> inParam){
			IQueryFilter queryFilter = new QueryFilter();
			queryFilter.setBusiId((String)inParam.get("busiId"));
			
			return queryFilter;
		}		
	}

	/**
	 * 审批记录数据查询操作实现类
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: AuditSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class AuditSelector implements IAuditSelector, Serializable{
		protected IRDBMSDML.IRmAuditRecordInfo rmAuditRecordInfo;
		protected IRDBMSDML.IRmAuditNoInfo rmAuditNoInfo;
		
		public void setRmAuditRecordInfo(IRDBMSDML.IRmAuditRecordInfo rmAuditRecordInfo) {
			this.rmAuditRecordInfo = rmAuditRecordInfo;
		}
		
		public void setRmAuditNoInfo(IRDBMSDML.IRmAuditNoInfo rmAuditNoInfo) {
			this.rmAuditNoInfo = rmAuditNoInfo;
		}

		
		/**
		 * 根据营销案ID查询审批记录列表
		* @date: 2016-11-1 
		* @author: fangyuan_crmpd
		* @title: selectAuditRecordDetailListByMarketCaseId 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectAuditRecordDetailListByMarketCaseId(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmAuditRecordInfo.selectAuditRecordDetailListByMarketCaseId(queryFilter);
		}

		/**
		 * 查询审批工号
		* @date: 2016-10-10 
		* @author: wangth
		* @Title: selectAuditNoList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectAuditNoList(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String,Object>> auditNoList = rmAuditNoInfo.select(queryFilter);
			return auditNoList;
		}
		
		/**
		 * 查询下载审批任务列表
		* @date: 2016-10-18 
		* @author: wangth
		* @Title: selectDownLoadAuditRecordList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectDownLoadAuditRecordList(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmAuditRecordInfo.selectDownLoadAuditRecord(queryFilter);
		}
		

		/**
		 * 查询审核任务列表
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectMarketCaseAuditRecordList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectMarketCaseAuditRecordList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			return rmAuditRecordInfo.selectMarketCaseAuditRecord(queryFilter);
		}
		
		/**
		 * 查询业务审批工号列表
		* @date: 2016-10-27 
		* @author: wangth
		* @Title: selectBusiAuditNoList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectBusiAuditNoList(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmAuditNoInfo.selectBusiAuditNO(queryFilter);
		}
		
		/** 
		* 查询营销案审批数量 
		* @date: 2016-11-4 
		* @author: mengxi 
		* @title: selectMarketCaseAuditNum 
		* @param inParam 
		* @return 
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/ 
		public Map<String,Object> selectMarketCaseAuditNum(Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError{ 
			return rmAuditRecordInfo.selectMarketCaseAuditNum(queryFilter); 
		}
	}
	
	/**
	 * hbase 批量push任务查询
	* @date: 2016-9-29 
	* @author: yangwl
	* @title: BatchPushTaskSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class BatchPushTaskSelector implements IBatchPushTaskSelector,Serializable{

		//protected INosqlDML.IRmBatchPushTaskCountInfo rmBatchPushTaskCountInfo;
		protected INosqlDML.IRmBatchPushTaskInfo rmBatchPushTaskInfoHbase;
		protected INosqlDML.IRmWaitSendBatchPushTaskInfo rmWaitSendBatchPushTaskInfoHbase;
		protected ICacheDML.IStatisticCache statisticCache;
		protected IServiceDML proceServiceDML;
		
		
/*		public void setRmBatchPushTaskCountInfo(
				INosqlDML.IRmBatchPushTaskCountInfo rmBatchPushTaskCountInfo) {
			this.rmBatchPushTaskCountInfo = rmBatchPushTaskCountInfo;
		}*/
		public void setProceServiceDML(IServiceDML proceServiceDML) {
			this.proceServiceDML = proceServiceDML;
		}

		public void setStatisticCache(ICacheDML.IStatisticCache statisticCache) {
			this.statisticCache = statisticCache;
		}
		
		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmBatchPushTaskInfoHbase 
		 * @param rmBatchPushTaskInfoHbase the rmBatchPushTaskInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmBatchPushTaskInfoHbase(
				INosqlDML.IRmBatchPushTaskInfo rmBatchPushTaskInfoHbase) {
			this.rmBatchPushTaskInfoHbase = rmBatchPushTaskInfoHbase;
		}
		
		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmWaitSendBatchPushTaskInfoHbase 
		 * @param rmWaitSendBatchPushTaskInfoHbase the rmWaitSendBatchPushTaskInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmWaitSendBatchPushTaskInfoHbase(
				INosqlDML.IRmWaitSendBatchPushTaskInfo rmWaitSendBatchPushTaskInfoHbase) {
			this.rmWaitSendBatchPushTaskInfoHbase = rmWaitSendBatchPushTaskInfoHbase;
		}

		/**
		 * 根据任务ID查询批量push信息
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: selectBatchPushTaskById 
		* @param taskId
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, String> selectBatchPushTaskById(String taskId)
				throws StrategyError {
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			String hash = (String)MD5RowKeyGenerator.generatePrefix(taskId);
			String rowKey = hash + Const.SEPARATOR_COLON + taskId;
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			Set<String> set = hbaseQualifier.getSelectBatchPushTaskByIdQualifier();
			tempParam.put("qualifierSet", set);
			
			return rmBatchPushTaskInfoHbase.selectBatchPushTaskById(tempParam);
		}
		
		/**
		 * 查询批量push生成任务数
		* @date: 2017-1-10 
		* @author: sunliang 
		* @title: selectBatchPushCreateTaskCount 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String selectBatchPushCreateTaskCount(
				Map<String, Object> tempInParam) throws StrategyError {
			
			String marketCaseId = (String)tempInParam.get("marketCaseId");
			String currDate = DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1);
			String key = Const.CACHE_DATATYPE_STATISTIC + "createTaskCount"
					+ Const.SEPARATOR_COLON + marketCaseId
					+ Const.SEPARATOR_COLON + currDate;
			
			return statisticCache.get(key);
		}
		
		/**
		 * 查询批量push发送任务数
		* @date: 2017-1-10 
		* @author: sunliang 
		* @title: selectBatchPushSendTaskCount 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String selectBatchPushSendTaskCount(
				Map<String, Object> tempInParam) throws StrategyError {
			String marketCaseId = (String)tempInParam.get("marketCaseId");
			String currDate = DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1);
			String key = Const.CACHE_DATATYPE_STATISTIC + "sendTaskCount"
					+ Const.SEPARATOR_COLON + marketCaseId
					+ Const.SEPARATOR_COLON + currDate;
			
			return statisticCache.get(key);
		}

		/**
		 * 查询待发送批量push任务
		* @date: 2017-1-10 
		* @author: sunliang 
		* @title: selectWaitSendBatchPushTask 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String,Map<String,Map<String,String>>> selectWaitSendBatchPushTask(
				Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError {
 		
			String prefixRowkey = hbaseRowKey.getSelectWaitSendBatchPushTaskRowKey(inParam, tempInParam);
			
			String startRow = prefixRowkey+Const.SEPARATOR_COLON+"0";
			String stopRow = prefixRowkey+Const.SEPARATOR_COLON+"~";
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put("startRow", startRow);
			tempParam.put("stopRow", stopRow);
			
			return rmWaitSendBatchPushTaskInfoHbase.select(tempParam);
		}

		/**
		 * 查询待发送批量事件任务
		* @date: 2017-2-8 
		* @author: sunliang 
		* @title: selectWaitSendBatchEventTask 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Map<String, Map<String, String>>> selectWaitSendBatchEventTask(
				Map<String, Object> tempInParam) throws StrategyError {
			
			String processId = (String)tempInParam.get("processId");
			String sendDate = (String)tempInParam.get("sendDate");
			String prefixRowkey = sendDate + Const.SEPARATOR_COLON + processId;
			
			String startRow = prefixRowkey+Const.SEPARATOR_COLON+"0";
			String stopRow = prefixRowkey+Const.SEPARATOR_COLON+"~";
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put("startRow", startRow);
			tempParam.put("stopRow", stopRow);
			
			return rmWaitSendBatchPushTaskInfoHbase.select(tempParam);
		}
		/**
		 * 查询校验成功文件名和添加批量计划
		* @date: 2017-4-26 
		* @author: chenhao
		* @title: checkFile
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> checkFile(String checkFileBean) throws StrategyError{
			String checkResult = proceServiceDML.checkFile(checkFileBean);
			log.info("-----------------checkResult---------------", checkResult);
			MBean bean = new MBean(checkResult);
			Map<String,Object> checkFileResult  = (Map<String, Object>) bean.getBodyObject("OUT_DATA.CHECK_RESULT");
			log.info("-----------------checkFileResult---------------", checkFileResult);
			return checkFileResult;
		}

		/**
		 * 添加批量计划
		* @date: 2017-4-26 
		* @author: chenhao
		* @title: addBatchExePlan 
		* @param addBatchExePlan
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> addBatchExePlan(String addBatchExePlan) throws StrategyError {
			String addBatchExePlanResult = proceServiceDML.addBatchExePlan(addBatchExePlan);
			Map<String, Object> result = new HashMap<String,Object>();
			result = JsonUtil.JsonStrToMap(addBatchExePlanResult);
			log.info("-----------------addBatchExePlanResult---------------", result);
			return result;
		}
		
	}

	/**
	 * 渠道数据查询操作实现类
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: ChannelSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ChannelSelector implements IChannelSelector, Serializable{
		
		protected ICacheDML.IChannelShowNumCache channelShowNumCache;
		protected IRDBMSDML.IRmChannelShowInfo rmChannelShowInfo;
		protected IRDBMSDML.IRmChannelInfo rmChannelInfo;

		public void setChannelShowNumCache(
				ICacheDML.IChannelShowNumCache channelShowNumCache) {
			this.channelShowNumCache = channelShowNumCache;
		}
		public void setRmChannelShowInfo(IRDBMSDML.IRmChannelShowInfo rmChannelShowInfo) {
			this.rmChannelShowInfo = rmChannelShowInfo;
		}
		public void setRmChannelInfo(IRDBMSDML.IRmChannelInfo rmChannelInfo) {
			this.rmChannelInfo = rmChannelInfo;
		}

		/**
		 * 从缓存中获取渠道展示数量
		* @date: 2016-11-28 
		* @author: yangwl
		* @title: getChannelShowNumFromCache 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> getChannelShowNumFromCache(Map<String, Object> tempInParam)throws StrategyError {
			Map<String,Object> tempParam = cacheKey.getChannelShowNumFromCacheKey(tempInParam);
			return channelShowNumCache.get(tempParam);
		}
		
		/**
		 * 查询渠道显示信息
		* @date: 2016-10-19 
		* @author: fangyuan_crmpd
		* @title: selectChannelShowInfo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectChannelShowNum() throws StrategyError {
			IQueryFilter queryFilter = new QueryFilter();
			return rmChannelShowInfo.select(queryFilter);
		}
		
		/**
		 * 查询渠道信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectChannelInfo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectChannelInfo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			return rmChannelInfo.select(queryFilter);
		}
		
	}
	
	/**
	 * 公共数据查询操作
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: CommonSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class CommonSelector implements ICommonSelector,Serializable{
		protected IRDBMSDML.ICommonInfo commonInfo;
		protected ICacheDML.IResultListCache resultListCache;
		protected IHiveDML.ICommonInfoHive CommonInfoHive;

		public void setResultListCache(ICacheDML.IResultListCache resultListCache) {
			this.resultListCache = resultListCache;
		}

		public void setCommonInfo(IRDBMSDML.ICommonInfo commonInfo) {
			this.commonInfo = commonInfo;
		}
		
		public void setCommonInfoHive(IHiveDML.ICommonInfoHive commonInfoHive) {
			CommonInfoHive = commonInfoHive;
		}
		
		/**
		 * 查询hive表结构
		* @date: 2016-11-25 
		* @author: zhangjj_crmpd
		* @title: descTable 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> descTable(Map<String, Object> tempInParam)
				throws StrategyError {
			return CommonInfoHive.descTable(tempInParam);
		}

		/**
		 * 查询codename
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectCodeName 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectCodeName(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			List<Map<String, Object>> list = commonInfo.selectCodeName(queryFilter);
			return list;
		}
		
		/**
		 * 查询codename(新)
		* @date: 2017-2-8 
		* @author: sunyuan
		* @title: selectCodeName 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectCodeName(Map<String, Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectCodeNameQueryFilter(tempInParam);
			List<Map<String, Object>> list = commonInfo.selectCodeName(queryFilter);
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
		public String selectDataBaseSysTime(){
			return commonInfo.selectDataBaseSysTime();
		}

		/**
		 * 根据标签元素id查询标签元素的值
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectLabelValueByLabelCode 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectLabelValueByLabelCode(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			return null;
		}

		/**
		 * 查询短信接入码数据
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectShortMsgAccessCode 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectShortMsgAccessCode(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			return null;
		}
		
		/**
		 * 查询Hive clzx中库中的表名
		* @date: 2016-10-30 
		* @author: zhangjj_crmpd
		* @title: showTables 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> showTables(
				Map<String, Object> tempInParam) throws StrategyError {
			return CommonInfoHive.showTables(tempInParam);
		}

		/**
		 * 指定页数返回查询结果
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: getResultListFromCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<ResultItemPojo> getResultListFromCache(Map<String, Object> tempInParam) throws StrategyError {
			List<ResultItemPojo> resultListTmp = resultListCache.get(tempInParam);
			List<ResultItemPojo> resultItemPojoList = new ArrayList<ResultItemPojo>();
			for(Object resultItem:resultListTmp){
				ResultItemPojo resultItemPojo = (ResultItemPojo)resultItem;
				resultItemPojoList.add(resultItemPojo);
			}
			return resultItemPojoList;
		}

	}
	
	/**
	 * 配置查询操作实现类
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: ConfigSelector 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ConfigSelector implements IConfigSelector{
		
		/**
		 * 编码对象
		 */
		protected IRDBMSDML.IRmCodeNameDict rmCodeNameDict;
		
		/**
		 * 
		* @date: 2016-11-14 
		* @author: fangyuan_crmpd
		* @title: setRmCodeNameDict 
		* @param rmCodeNameDict 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmCodeNameDict(IRDBMSDML.IRmCodeNameDict rmCodeNameDict) {
			this.rmCodeNameDict = rmCodeNameDict;
		}
	
		/** 
		 * 查询选项配置列表
		* @date: 2016-10-24 
		* @author: xiongxq
		* @Title: selectChoiceConfigList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public List<Map<String, Object>> selectOptionConfigList(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmCodeNameDict.select(queryFilter);
		}
	}
	
	/**
	 * 内容数据查询操作实现类
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: ContentSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ContentSelector implements IContentSelector, Serializable{
		
		protected IRDBMSDML.IRmContentInfo rmContentInfo;
		protected IRDBMSDML.IRmContentDetailInfo rmContentDetailInfo;
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		
		public void setRmContentInfo(IRDBMSDML.IRmContentInfo rmContentInfo) {
			this.rmContentInfo = rmContentInfo;
		}

		public void setRmContentDetailInfo(
				IRDBMSDML.IRmContentDetailInfo rmContentDetailInfo) {
			this.rmContentDetailInfo = rmContentDetailInfo;
		}
		
		/** 
		 * @date: 2016-10-18 
		 * @author: wangpei
		 * @title: setRmRelationRel 
		 * @param rmRelationRel the rmRelationRel to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		
		public void setRmRelationRel(IRDBMSDML.IRmRelationRel rmRelationRel) {
			this.rmRelationRel = rmRelationRel;
		}

		/**
		 * 查询产品列表
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectProdList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String,Object>> selectProdList(Map<String, Object> inParam) throws StrategyError {
			return null;
		}

		/**
		 * 查询营销用语列表
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectMarketCaseTermList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String,Object>> selectMarketCaseTermList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			return null;
		}

		/**
		 * 查询内容信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectContentInfo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectContentInfo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			Map<String,Object> map = rmContentInfo.select(queryFilter);
			return map;
		}
		
		/**
		 * 根据产品id查询内容明细
		* @date: 2017-4-3 
		* @author: sunyuan
		* @title: selectContentDetailList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String,Object>> selectContentDetailsByProdId(Map<String, Object> tempInParam) throws StrategyError{
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectContentDetailsByProdIdQueryFilter(tempInParam);
			List<Map<String,Object>> list = rmContentDetailInfo.selectContentDetailByProdId(queryFilter);
			return list;
		}
		
		/**
		 * 
		* @date: 2017-3-8 
		* @author: sunliang 
		* @title: selectContentDetailsByEventIdAndMarketCaseId 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectContentDetailsByEventIdAndMarketCaseId(
				Map<String, Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectContentDetailsByEventIdAndMarketCaseIdQueryFilter(tempInParam);
			List<Map<String, Object>> list = rmContentDetailInfo.selectContentDetailsByEventIdAndMarketCaseId(queryFilter);
			return list;
		}

		/**
		 * 查询内容详细信息
		* @date: 2016-9-13 
		* @author: zhaoyue
		* @title: selectContentDetailList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String,Object>> selectContentDetailList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			
			List<Map<String,Object>> list = rmContentDetailInfo.select(queryFilter);
			return list;
		}
		
		/**
		 * 查询内容详细信息Id
		* @date: 2016-10-7 
		* @author: wangth
		* @Title: selectContentDetailId 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectContentDetailId(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String,Object>> list = rmContentDetailInfo.selectContentDetailId(queryFilter);
			return list;
		}

		/** 
		* @date: 2016-10-18 
		* @author: wangpei
		* @title: selectRelation 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		public Map<String, Object> selectRelation(Map<String, Object> inParam,
				IQueryFilter queryFilter) throws StrategyError {
			return (Map<String, Object>)rmRelationRel.selectRelation(queryFilter);
		}

	}
	/**反馈查询
	* Create on 2016-12-1
	* @author: wangpei
	* @Title:CoupleBackSelector
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class CoupleBackSelector implements ICoupleBackSelector, Serializable{

		protected ICacheDML.IMarketCaseRecommonedCloseCache marketCaseRecommonedCloseCache;
		protected INosqlDML.IRmRecommendRecordInfo rmRecommendRecordInfoHbase;
		protected INosqlDML.IRmUserRecommendMarketCaseInfo rmUserRecommendMarketCaseInfo;
		
		public void setMarketCaseRecommonedCloseCache(
				ICacheDML.IMarketCaseRecommonedCloseCache marketCaseRecommonedCloseCache) {
			this.marketCaseRecommonedCloseCache = marketCaseRecommonedCloseCache;
		}
		
		public void setRmRecommendRecordInfoHbase(
				INosqlDML.IRmRecommendRecordInfo rmRecommendRecordInfoHbase) {
			this.rmRecommendRecordInfoHbase = rmRecommendRecordInfoHbase;
		}

		public void setRmUserRecommendMarketCaseInfo(
				INosqlDML.IRmUserRecommendMarketCaseInfo rmUserRecommendMarketCaseInfo) {
			this.rmUserRecommendMarketCaseInfo = rmUserRecommendMarketCaseInfo;
		}

		/** 获取推荐关闭缓存
		* @date: 2016-12-1 
		* @author: wangpei
		* @title: getChannelTaskRecommonedCloseCache 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public String getChannelTaskRecommonedCloseCache() throws StrategyError {
			Map<String,Object> tempInParam = new HashMap<String, Object>();
			tempInParam.put("key", Const.CACHE_DATATYPE_MARKETCASE_RECOMMONEDCLOSE);
			tempInParam.put("direction", "");
			return marketCaseRecommonedCloseCache.getAndRemove(tempInParam);
		}

		/**
		 * 查询推荐记录信息
		* @date: 2017-2-16 
		* @author: tangaq
		* @title: selectRecommendRecordInfo 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, String> selectRecommendRecordInfo(Map<String,Object> tempInParam)
				throws StrategyError {
			Map<String,String> recommendRecordMap = rmRecommendRecordInfoHbase.select((String)tempInParam.get("rowKey"));
			if(CommonUtils.objectIsNull(recommendRecordMap)){
				recommendRecordMap = new HashMap<String,String>();
			}
			
			return recommendRecordMap;
		}
		
		/**
		 * 查询用户推荐营销案表
		* @date: 2017-4-10 
		* @author: zhangyw_crmpd
		* @title: selectUserRecommendMarketCaseInfo 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, String> selectUserRecommendMarketCaseInfo(
				Map<String, Object> tempInParam) throws StrategyError {
			Map<String,String> userRecommendMarketCaseMap = rmUserRecommendMarketCaseInfo.select((String)tempInParam.get("rowKey"));
			if(CommonUtils.objectIsNull(userRecommendMarketCaseMap)){
				userRecommendMarketCaseMap = new HashMap<String,String>();
			}
			
			return userRecommendMarketCaseMap;
		}
		
	}
	/**
	 * 客户群数据查询操作
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: CustGroupSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class CustGroupSelector implements ICustGroupSelector,Serializable{
		
		protected INosqlDML.ICocCustomerGroup cocCustomerGroupHbase;
		protected INosqlDML.IRmCustGroupDetailInfo rmCustGroupDetailInfoHbase;
		protected INosqlDML.IRmCustGroupCustomLabelInfo rmCustGroupCustomLabelInfoHbase;
		protected IRDBMSDML.IRmCustGroupHandleRecordInfo rmCustGroupHandleRecordInfo;
		protected IRDBMSDML.IRmCustGroupAttributeInfo rmCustGroupAttributeInfo;
		protected IRDBMSDML.IRmCustGroupInfo rmCustGroupInfo;
		protected IRDBMSDML.IRmCustGroupLabelInfo rmCustGroupLabelInfo;
		protected ICacheDML.ICustGroupLabelFormulaCache custGroupLabelFormulaCache;
		protected IHiveDML.IRmCustGroupDetailInfoHive RmCustGroupDetailInfoHive;
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		protected ISparkSQLDML.IRmUserLabelInfo rmUserLabelInfoSpark;
		protected ISparkSQLDML.IRmCustgroupDetailInfoSpark rmCustgroupDetailInfoSpark;


		

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setCocCustomerGroupHbase 
		 * @param cocCustomerGroupHbase the cocCustomerGroupHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setCocCustomerGroupHbase(
				INosqlDML.ICocCustomerGroup cocCustomerGroupHbase) {
			this.cocCustomerGroupHbase = cocCustomerGroupHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmCustGroupDetailInfoHbase 
		 * @param rmCustGroupDetailInfoHbase the rmCustGroupDetailInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmCustGroupDetailInfoHbase(
				INosqlDML.IRmCustGroupDetailInfo rmCustGroupDetailInfoHbase) {
			this.rmCustGroupDetailInfoHbase = rmCustGroupDetailInfoHbase;
		}


		public void setRmCustGroupLabelInfo(
				IRDBMSDML.IRmCustGroupLabelInfo rmCustGroupLabelInfo) {
			this.rmCustGroupLabelInfo = rmCustGroupLabelInfo;
		}
		
		public void setRmCustGroupCustomLabelInfoHbase(
				INosqlDML.IRmCustGroupCustomLabelInfo rmCustGroupCustomLabelInfoHbase) {
			this.rmCustGroupCustomLabelInfoHbase = rmCustGroupCustomLabelInfoHbase;
		}
		
		public void setRmCustGroupHandleRecordInfo(
				IRDBMSDML.IRmCustGroupHandleRecordInfo rmCustGroupHandleRecordInfo) {
			this.rmCustGroupHandleRecordInfo = rmCustGroupHandleRecordInfo;
		}

		public void setCustGroupLabelFormulaCache(
				ICacheDML.ICustGroupLabelFormulaCache custGroupLabelFormulaCache) {
			this.custGroupLabelFormulaCache = custGroupLabelFormulaCache;
		}
		
		public void setRmCustGroupAttributeInfo(
				IRDBMSDML.IRmCustGroupAttributeInfo rmCustGroupAttributeInfo) {
			this.rmCustGroupAttributeInfo = rmCustGroupAttributeInfo;
		}

		public void setRmCustGroupInfo(IRDBMSDML.IRmCustGroupInfo rmCustGroupInfo) {
			this.rmCustGroupInfo = rmCustGroupInfo;
		}

		public void setRmCustGroupDetailInfoHive(
				IHiveDML.IRmCustGroupDetailInfoHive rmCustGroupDetailInfoHive) {
			RmCustGroupDetailInfoHive = rmCustGroupDetailInfoHive;
		}

		public void setRmRelationRel(IRDBMSDML.IRmRelationRel rmRelationRel) {
			this.rmRelationRel = rmRelationRel;
		}
		
		public void setRmUserLabelInfoSpark(
				ISparkSQLDML.IRmUserLabelInfo rmUserLabelInfoSpark) {
			this.rmUserLabelInfoSpark = rmUserLabelInfoSpark;
		}
		
		public void setRmCustgroupDetailInfoSpark(
				ISparkSQLDML.IRmCustgroupDetailInfoSpark rmCustgroupDetailInfoSpark) {
			this.rmCustgroupDetailInfoSpark = rmCustgroupDetailInfoSpark;
		}

		/**
		 * 通过缓存查询客户群标签
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: getCustGroupLabelFromCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String getCustGroupLabelFromCache(Map<String,Object> tempInParam) throws StrategyError {
			String custGroupLabel = custGroupLabelFormulaCache.get(tempInParam);
			return custGroupLabel;
		}
		
		/**
		 * 查询目标客户群数量明细
		* @date: 2017-2-12 
		* @author:liuqi
		* @title: getCustGroupDetailCountFromHive 
		* @param custGroupIdInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> getCustGroupDetailCountFromHive(Map<String, Object> custGroupIdInParam) throws StrategyError{
			 return rmCustgroupDetailInfoSpark.selectCustGroupDetailCountInfo(custGroupIdInParam);
		}
		
		/**
		 * 查询COC目标客户群明细
		* @date: 2016-11-23 
		* @author: yangwl
		* @title: selectCocCustomerGroupByRowKey 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Map<String,Map<String,String>>> selectCocCustomerGroupByRowKey(Map<String, Object> tempInParam) throws StrategyError {
			return cocCustomerGroupHbase.select(tempInParam);
		}
		
		/**
		 * 查询客户群属性信息
		* @date: 2017-3-6 
		* @author: tangaq
		* @title: selectCustGroupAttribute 
		* @param tempInParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectCustGroupAttribute(Map<String, Object> tempInParam, IQueryFilter queryFilter)throws StrategyError {
			return rmCustGroupInfo.selectCustGroupAttribute(queryFilter);
		}
		
		/**
		 * 查询全部客户群属性信息
		* @date: 2017-4-12 
		* @author: zhangzx_crmpd
		* @title: selectAllCustGroupAttribute 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectAllCustGroupAttribute()throws StrategyError {
			IQueryFilter queryFilter = new QueryFilter(); 
			return rmCustGroupAttributeInfo.select(queryFilter);
		}

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
		@Override
		public List<Map<String, Object>> selectCustGroupCountByUserLabel(
				Map<String, Object> tempInParam) throws StrategyError {
			return rmUserLabelInfoSpark.selectCustGroupCountByUserLabel(tempInParam);
		}
		/**
		 * 查询二次过滤标签的人数
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
		public List<Map<String, Object>> selectLabelFormulaRestrictCountById(
				Map<String, Object> inParam) throws StrategyError {
			return rmUserLabelInfoSpark.selectLabelFormulaRestrictCountById(inParam);
		}

		
		/**
		 * 查询客户群处理记录
		* @date: 2017-3-7 
		* @author: tangaq
		* @title: selectCustGroupHandleRecord 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectCustGroupHandleRecord(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			
			return rmCustGroupHandleRecordInfo.selectCustGroupHandleRecord(queryFilter);
		}

		/**
		 * 查询客户群表标签元素
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectCustGroupLabelItem 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectCustGroupLabelItem(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			return null;
		}

		/** 
		* @date: 2017-2-21 
		* @author: wangpei
		* @title: selectCustGroupCustomLabel 
		* @param inParam
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public Map<String, String> selectCustGroupCustomLabel(Map<String, Object> inParam, Map<String, Object> tempInParam) throws StrategyError {
			tempInParam.put("idNo", inParam.get("idNo"));
			Map<String, String> custGroupLabel = rmCustGroupCustomLabelInfoHbase.getCustGroupCustomLabelByIdNo(tempInParam);
			if (custGroupLabel == null) {
				custGroupLabel = new HashMap<String, String>();
			}
			return custGroupLabel;
		}

		/**
		 * 查询客户群信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectCustGroupList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectCustGroupList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			return rmCustGroupInfo.select(queryFilter);
		}
		
		/**
		 * 分页查询客户群信息
		* @date: 2017-2-21 
		* @author: zhangjj_crmpd
		* @title: selectCustGroupListByPage 
		* @param inParam
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectCustGroupListByPage(
				Map<String, Object> inParam, Map<String, Object> tempInParam)
				throws StrategyError {
			return rmCustGroupInfo.selectByPage(iBatisQueryFilter.getSelectCustGroupListQueryFilter(tempInParam), Integer.parseInt(CommonUtils.toString(tempInParam.get("startPage"))) , Integer.parseInt(CommonUtils.toString(tempInParam.get("limit"))));
		}

		/**
		 * 查询客户群数量
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectCustGroupCountById 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectCustGroupCountById(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			return null;
		}

		/**
		 * 根据serviceNo查询目标客户群明细
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectCustGroupDetailByServiceNo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, String> selectCustGroupDetailByIdNo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			return rmCustGroupDetailInfoHbase.selectCustGroupDetailByIdNo(inParam, queryFilter);
		}
		
		/**
		 * 查询客户群标签
		* @date: 2016-11-11 
		* @author: wangth
		* @Title: selectCustGroupLabel 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectCustGroupLabel(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmCustGroupLabelInfo.selectCustGroupLabel(queryFilter);
		}	
		
		/**
		 * 查询全部目标客户群标签
		* @date: 2016-12-29 
		* @author: sunliang 
		* @title: selectAllCustGroupLabelList 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectAllCustGroupLabelList() throws StrategyError {
			IQueryFilter queryFilter = new QueryFilter();
			return rmCustGroupLabelInfo.select(queryFilter);
		}
		
		
		/**
		 * 根据客户群ID查询客户群关系列表
		* @date: 2016-11-24 
		* @author: fangyuan_crmpd
		* @title: selectCustGroupRelationListByCustGroupId 
		* @param inParam
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectCustGroupRelationListByCustGroupId
				(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			List<Map<String, Object>> outList = rmRelationRel.selectCustGroupRelation(queryFilter);
			return outList;
		}

		/**
		 * 查询客户群与活动关系列表
		* @date: 2017-2-16 
		* @author: wuJiaFu
		* @title: selectCustGroupAndActRealation 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectCustGroupAndActRealation(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String, Object>> list = rmRelationRel.select(queryFilter);
			return list;
		}

		/**
		 * 查询客户群表的数量
		* @date: 2017-4-3 
		* @author: chenhao
		* @title: selectCustGroupDetailCountInSparkTable 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectCustGroupDetailCountInSparkTable(Map<String, Object> tempInParam) throws StrategyError{
			Map<String,Object> countMap = rmUserLabelInfoSpark.selectCustGroupDetailCountInSparkTable(tempInParam);
			return countMap;
		}
	}
	
	/**
	 * 评估数据查询操作实现类
	* @date: 2016-11-25 
	* @author: xiongxq
	* @Title: EvaluateSelector 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class EvaluateSelector implements IEvaluateSelector,Serializable{
		
		/**
		 * 评估统计hive
		 */
		protected IHiveDML.IRmEvaluateStatisticsInfoHive rmEvaluateStatisticsInfoHive;
		
		/**
		 * 批量push成功表
		 */
		protected IRDBMSDML.IRmBatchPushTaskSuccInfo rmBatchPushTaskSuccInfo;
		
		/**
		 * 批量push异常表
		 */
		protected IRDBMSDML.IRmBatchPushTaskExcepInfo rmBatchPushTaskExcepInfo;
		
		/**
		 * 批量push任务表
		 */
		protected IRDBMSDML.IRmBatchPushTaskInfo rmBatchPushTaskInfo;
		
		/**
		 * 批量push待发送表
		 */
		protected IRDBMSDML.IRmWaitSendBatchPushTaskInfo rmWaitSendBatchPushTaskInfo;
		
		/**
		 * 触点商机表
		 */
		protected IRDBMSDML.IRmChannelBussinessInfo rmChannelBussinessInfo;
		/**
		 * 营销案商机表
		 */
		protected IRDBMSDML.IRmMarketCaseBussinessInfo rmMarketCaseBussinessInfo;
		/**
		 * 营销案订购统计报表
		 */
		protected IRDBMSDML.IRmMarketCaseOrderReportInfo rmMarketCaseOrderReportInfo;
		/**
		 * 接触量总表
		 */
		protected IRDBMSDML.IRmTouchCountInfo rmTouchCountInfo;
		/**
		 * 产商品信息查询
		 */
		protected IRDBMSDML.IRmProductCommodityReportInfo rmProductCommodityReportInfo;
		/**
		 * 
		* @date: 2016-12-14 
		* @author: tangaq
		* @title: setRmChannelBussinessInfo 
		* @param rmChannelBussinessInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmChannelBussinessInfo(
			IRDBMSDML.IRmChannelBussinessInfo rmChannelBussinessInfo) {
			this.rmChannelBussinessInfo = rmChannelBussinessInfo;
		}
		
        /**
         * 
        * @date: 2017-3-15 
        * @author: tangaq
        * @title: setRmBatchPushTaskSuccInfo 
        * @param rmBatchPushTaskSuccInfo 
        * @exception: 
        * @version: 1.0 
        * @description: 
        * update_version: update_date: update_author: update_note:
         */
        public void setRmBatchPushTaskSuccInfo(
				IRDBMSDML.IRmBatchPushTaskSuccInfo rmBatchPushTaskSuccInfo) {
			this.rmBatchPushTaskSuccInfo = rmBatchPushTaskSuccInfo;
		}



		/**
         * 
        * @date: 2017-3-15 
        * @author: tangaq
        * @title: setRmBatchPushTaskExcepInfo 
        * @param rmBatchPushTaskExcepInfo 
        * @exception: 
        * @version: 1.0 
        * @description: 
        * update_version: update_date: update_author: update_note:
         */
		public void setRmBatchPushTaskExcepInfo(
				IRDBMSDML.IRmBatchPushTaskExcepInfo rmBatchPushTaskExcepInfo) {
			this.rmBatchPushTaskExcepInfo = rmBatchPushTaskExcepInfo;
		}

        /**
         * 
        * @date: 2017-3-15 
        * @author: tangaq
        * @title: setRmBatchPushTaskInfo 
        * @param rmBatchPushTaskInfo 
        * @exception: 
        * @version: 1.0 
        * @description: 
        * update_version: update_date: update_author: update_note:
         */
		public void setRmBatchPushTaskInfo(
				IRDBMSDML.IRmBatchPushTaskInfo rmBatchPushTaskInfo) {
			this.rmBatchPushTaskInfo = rmBatchPushTaskInfo;
		}
        
		/**
		 * 
		* @date: 2017-3-15 
		* @author: tangaq
		* @title: setRmWaitSendBatchPushTaskInfo 
		* @param rmWaitSendBatchPushTaskInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmWaitSendBatchPushTaskInfo(
				IRDBMSDML.IRmWaitSendBatchPushTaskInfo rmWaitSendBatchPushTaskInfo) {
			this.rmWaitSendBatchPushTaskInfo = rmWaitSendBatchPushTaskInfo;
		}



		/**
		 * 查询产商品信息报表
		* @date: 2017-2-21 
		* @author: hannn
		* @title: setRmProductCommodityReportInfo 
		* @param rmProductCommodityReportInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmProductCommodityReportInfo(
				IRDBMSDML.IRmProductCommodityReportInfo rmProductCommodityReportInfo) {
			this.rmProductCommodityReportInfo = rmProductCommodityReportInfo;
		}


		/**
		 * 
		* @date: 2017-1-11 
		* @author: mengxi
		* @title: setRmEvaluateStatisticsInfoHive 
		* @param rmEvaluateStatisticsInfoHive 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmEvaluateStatisticsInfoHive(
				IHiveDML.IRmEvaluateStatisticsInfoHive rmEvaluateStatisticsInfoHive) {
			this.rmEvaluateStatisticsInfoHive = rmEvaluateStatisticsInfoHive;
		}
		/**
		 * 
		* @date: 2016-12-14 
		* @author: tangaq
		* @title: setRmMarketCaseBussinessInfo 
		* @param rmMarketCaseBussinessInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmMarketCaseBussinessInfo(
				IRDBMSDML.IRmMarketCaseBussinessInfo rmMarketCaseBussinessInfo) {
			this.rmMarketCaseBussinessInfo = rmMarketCaseBussinessInfo;
		}

		/** 
		 * @date: 2016-11-26 
		 * @author: xiongxq
		 * @Title: setRmMarketCaseOrderReportInfo 
		 * @param rmMarketCaseOrderReportInfo the rmMarketCaseOrderReportInfo to set
		 * @version 1.0 
		 * @Description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmMarketCaseOrderReportInfo(
				IRDBMSDML.IRmMarketCaseOrderReportInfo rmMarketCaseOrderReportInfo) {
			this.rmMarketCaseOrderReportInfo = rmMarketCaseOrderReportInfo;
		}
		
        /**
		 * 
		* @date: 2016-12-14 
		* @author: tangaq
		* @title: setRmTouchCountInfo 
		* @param rmTouchCountInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmTouchCountInfo(IRDBMSDML.IRmTouchCountInfo rmTouchCountInfo) {
			this.rmTouchCountInfo = rmTouchCountInfo;
		}

			/** 
		* @date: 2016-11-27 
		* @author: xiongxq
		* @Title: selectChannelMarketCaseOrderReportInfoList 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public List<Map<String, Object>> selectChannelMarketCaseOrderReportInfoList(
				Map<String, Object> inParam) throws StrategyError {
			return rmMarketCaseOrderReportInfo.selectChannelMarketCaseOrderReportInfo(inParam);
		}
			/**
			 * 根据地市查询某个触点下的接触量
			* @date: 2016-12-13 
			* @author: tangaq
			* @title: selectChannelTouchNumByRegionCode 
			* @param inParam
			* @param queryFilter
			* @return
			* @throws StrategyError 
			* @exception: 
			* @version: 1.0 
			* @description: 
			* update_version: update_date: update_author: update_note:
			 */
			@Override
			public List<Map<String, Object>> selectChannelTouchNumByRegionCode(
					Map<String, Object> inParam, IQueryFilter queryFilter)
					throws StrategyError {
				List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
				if("0".equals(inParam.get("regionCode"))){
					outList = rmChannelBussinessInfo.select(queryFilter);
				}else{
					outList = rmChannelBussinessInfo.selectByRegionCode(queryFilter);
				}
				return outList;
			}

			/** 
			 * 查询15天订购量
			* @date: 2016-11-27 
			* @author: xiongxq
			* @Title: selectFifthDayOrderNum 
			* @param inParam
			* @param queryFilter
			* @return
			* @throws StrategyError 
			* @exception:
			* @version 1.0 
			* @Description: 
			* update_version: update_date: update_author: update_note: 
			*/
			@Override
			public List<Map<String, Object>> selectFifthDayOrderNum(
					Map<String, Object> inParam, IQueryFilter queryFilter)
					throws StrategyError {
				queryFilter.setFifthDay((String)inParam.get("fifthDay"));
				return rmMarketCaseOrderReportInfo.selectFifthDay(queryFilter);
		}
			
		/**
		 * 查询营销案订购量
		* @date: 2017-1-11 
		* @author: mengxi
		* @title: selectMarketCaseOrderNum 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectMarketCaseOrderNum()throws StrategyError {
			return rmEvaluateStatisticsInfoHive.selectMarketCaseOrderNum();
		}
			
		/**
		 * 根据日期参数的不同，查询昨日曝光量、当日累计曝光量
		* @date: 2016-11-26 
		* @author: yuanliang
		* @title: selectMarketCaseOrderReportSendNum 
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectMarketCaseOrderReportSendNum(
				IQueryFilter queryFilter) throws StrategyError {
			return rmMarketCaseOrderReportInfo.selectMarketCaseOrderReportSendNum(queryFilter);
		}

		/**
		 * 根据地市查询某个营销案大类下面的接触量 
		* @date: 2016-12-13 
		* @author: tangaq
		* @title: selectMarketCaseTouchNumByRegionCode 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectMarketCaseTouchNumByRegionCode(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
			if("0".equals(inParam.get("regionCode"))){
				outList = rmMarketCaseBussinessInfo.select(queryFilter);
			}else{
				outList = rmMarketCaseBussinessInfo.selectByRegionCode(queryFilter);
			}
			return outList;
		}
		
		/**
		 * 营销案push任务统计查询
		* @date: 2017-3-15 
		* @author: tangaq
		* @title: selectMarketCasePushTaskStatistics 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectMarketCasePushTaskStatistics(Map<String, Object> inParam) {
			Map<String,Object> batchPushSucc = rmBatchPushTaskSuccInfo.select(inParam);
			Map<String,Object> batchPushWait = rmWaitSendBatchPushTaskInfo.select(inParam);
			Map<String,Object> batchPushExcp =  rmBatchPushTaskExcepInfo.select(inParam);
			
			Map<String,Object> outMap = new HashMap<String,Object>();
			if(!CommonUtils.objectIsNull(batchPushSucc)){
				outMap.putAll(batchPushSucc);
			}
			if(!CommonUtils.objectIsNull(batchPushWait)){
				outMap.putAll(batchPushWait);
			}
			if(!CommonUtils.objectIsNull(batchPushExcp)){
				outMap.putAll(batchPushExcp);
			}
			return outMap;
		}

		/**
		 * 查询产商品信息报表
		* @date: 2017-3-3 
		* @author: hannn
		* @title: selectProductCommodityReportInfo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectProductCommodityReportInfo(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String, Object>> list = rmProductCommodityReportInfo.select(queryFilter,(Integer)inParam.get("startNum"),(Integer)inParam.get("endNum"));
			return list;
		}
     /**
      * 查询产商品信息报表总数
     * @date: 2017-2-24 
     * @author: hannn
     * @title: selectProductCommodityReportCount 
     * @param inParam
     * @param queryFilter
     * @return
     * @throws StrategyError 
     * @exception: 
     * @version: 1.0 
     * @description: 
     * update_version: update_date: update_author: update_note:
      */
		public String selectProductCommodityReportCount(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			   return rmProductCommodityReportInfo.selectProductCommodityReportCount(queryFilter);
		}
		/**
		 * 查询全省产商品信息报表
		* @date: 2017-2-24 
		* @author: hannn
		* @title: selectProductCommodityReportInfoByProvince 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectProductCommodityReportInfoByProvince(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String, Object>> list = rmProductCommodityReportInfo.selectProductCommodityReport(queryFilter,(Integer)inParam.get("startNum"),(Integer)inParam.get("endNum"));
			return list;
		}
		/** 
		 * 查询某个营销案的所有订购量
		* @date: 2016-11-26 
		* @author: xiongxq
		* @Title: selectOrderNum 
		* @param termParam
		* @return
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public Map<String, Object> selectOrderNum(Map<String, Object> termParam)
				throws StrategyError {
			Map<String,Object> outMap = rmMarketCaseOrderReportInfo.selectOrderNum(termParam);
			return outMap;
		}

		/**
		 * 查询各个地市的转化率
		* @date: 2016-12-13 
		* @author: tangaq
		* @title: selectRegionCodeConvertRate 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectRegionCodeConvertRate(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String,Object>> outList = rmTouchCountInfo.selectRegionCodeConvertRate(queryFilter);
			return outList;
		}

		/** 
		 * 查询7天订购量
		* @date: 2016-11-27 
		* @author: xiongxq
		* @Title: selectSevenDayOrderNum 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectSevenDayOrderNum(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			queryFilter.setSevenDay((String)inParam.get("sevenDay"));
			return rmMarketCaseOrderReportInfo.selectSevenDay(queryFilter);
		}
		
		/** 
		 * 查询3天订购量
		* @date: 2016-11-27 
		* @author: xiongxq
		* @Title: selectThreeDayOrderNum 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public List<Map<String, Object>> selectThreeDayOrderNum(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			queryFilter.setThreeDay((String)inParam.get("threeDay"));
			return rmMarketCaseOrderReportInfo.selectThreeDay(queryFilter);
		}

		/**
		 * 根据地市查询用户接触量
		* @date: 2016-12-13 
		* @author: tangaq
		* @title: selectUserTouchNumByRegionCode 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectUserTouchNumByRegionCode(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
			if("0".equals(inParam.get("regionCode"))){
				outList = rmTouchCountInfo.select(queryFilter);
			}else{
				outList = rmTouchCountInfo.selectByRegionCode(queryFilter);
			}
			return outList;
		}
		
	}

		/**
	 * 事件数据查询操作实现类
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: EventSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class EventSelector implements IEventSelector,Serializable{

		protected ICacheDML.IFeeAndEventRelCache feeAndEventRelCache;
		protected ICacheDML.IProductAndEventRelCache productAndEventRelCache;
		protected IRDBMSDML.IRmAreaPriorityInfo rmAreaPriorityInfo;
		protected IRDBMSDML.IRmEventInfo rmEventInfo;
		protected IRDBMSDML.IRmEventDetailInfo rmEventDetailInfo;
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		protected IServiceDML proceServiceDML;
		
		public void setFeeAndEventRelCache(
				ICacheDML.IFeeAndEventRelCache feeAndEventRelCache) {
			this.feeAndEventRelCache = feeAndEventRelCache;
		}

		public void setProductAndEventRelCache(
				ICacheDML.IProductAndEventRelCache productAndEventRelCache) {
			this.productAndEventRelCache = productAndEventRelCache;
		}
		
		public void setRmEventInfo(IRDBMSDML.IRmEventInfo rmEventInfo) {
			this.rmEventInfo = rmEventInfo;
		}

		public void setRmEventDetailInfo(IRDBMSDML.IRmEventDetailInfo rmEventDetailInfo) {
			this.rmEventDetailInfo = rmEventDetailInfo;
		}
		
		public void setRmAreaPriorityInfo(IRDBMSDML.IRmAreaPriorityInfo rmAreaPriorityInfo) {
			this.rmAreaPriorityInfo = rmAreaPriorityInfo;
		}

		public void setRmRelationRel(IRDBMSDML.IRmRelationRel rmRelationRel) {
			this.rmRelationRel = rmRelationRel;
		}

		public void setProceServiceDML(IServiceDML proceServiceDML) {
			this.proceServiceDML = proceServiceDML;
		}

		/**
		 * 查询事件规则详细信息Id
		* @date: 2016-12-2 
		* @author: mengxi
		* @title: selectEventDetailId 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectEventDetailId(Map<String, Object> inParam, IQueryFilter queryFilter)throws StrategyError {
			List<Map<String,Object>> list = rmEventDetailInfo.selectEventDetailId(queryFilter);
			return list;
		}
		
		/**
		 * 根据渠道ID查询事件ID
		* @date: 2017-2-15 
		* @author: sunyuan
		* @title: selectEventDetailByChannelIdFromCache 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<String> selectEventDetailByChannelIdFromCache(Map<String, Object> inParam) throws StrategyError{
			return feeAndEventRelCache.get(inParam);
		}
		
		/** 
		 * 根据产品ID查询事件ID
		* @date: 2016-11-23 
		* @author: songxj
		* @title: selectEventIdByProdIdFromCache 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public List<String> selectEventIdByProdIdFromCache(Map<String, Object> inParam) throws StrategyError {
			return productAndEventRelCache.get(inParam);
		}

		/**
		 * 查询事件信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectEventInfo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectEventInfo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			
			Map<String, Object> map = rmEventInfo.select(queryFilter);
			return map;
		}
		/**
		 * 根据relId查询事件id
		* @date: 2017-3-30 
		* @author: chenhao
		* @title: selectEventIdByRelId 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectEventIdByRelId(Map<String,Object> inParam) throws StrategyError{
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectEventIdByRelIdQueryFilter(inParam);
			Map<String, Object> map = rmEventInfo.selectEventIdByRelId(queryFilter);
			return map;
		}
		
		/**
		 * 查询事件详细信息
		* @date: 2017-1-2 
		* @author: sunliang 
		* @title: selectEventDetailList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectEventDetailList(Map<String,Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectEventDetailListQueryFilter(tempInParam);
			List<Map<String, Object>> list = rmEventDetailInfo.select(queryFilter);
			return list;
		}

		/**
		 * 查询事件详情和优先级
		* @date: 2017-2-14 
		* @author: sunyuan
		* @title: selectMarketCaseIdByEventIdList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectMarketCaseIdByEventIdList(Map<String,Object> tempInParam) throws StrategyError {
			IQueryFilter selectMarketCaseIdByEventIdQueryFilter = iBatisQueryFilter.getSelectMarketCaseIdByEventIdListQueryFilter(tempInParam);
			List<Map<String, Object>> marketCaseIdList = rmRelationRel.selectMarketCaseIdByEventId(selectMarketCaseIdByEventIdQueryFilter);
			return marketCaseIdList;
		}
		
		/**
		 * 查询缴费事件ID
		* @date: 2017-3-7 
		* @author: sunliang 
		* @title: selectPayFeeEventId 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectPayFeeEventId(Map<String, Object> tempInParam)
				throws StrategyError {
			IQueryFilter selectPayFeeEventIdQueryFilter = iBatisQueryFilter.getSelectPayFeeEventIdQueryFilter(tempInParam);
			List<Map<String, Object>> payFeeEventId = rmEventInfo.selectPayFeeEventId(selectPayFeeEventIdQueryFilter);
			return payFeeEventId;
		}
		
		/**
		 * 查询事件详细信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectEventDetailList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		@Deprecated
		public List<Map<String, Object>> selectEventDetailList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			List<Map<String, Object>> list = rmEventDetailInfo.select(queryFilter);
			return list;
		}
		
		/**
		 * 查询营销案下的客户群对应的事件关系
		* @date: 2017-2-13 
		* @author:liuqi
		* @title: selectEventRelation 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectEventRelation(Map<String, Object> inParam) throws StrategyError{
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectEventRelationQueryFilter(inParam);
			
			return rmRelationRel.selectRelation(queryFilter);
		}
		
		/**
		 * 查询派单事件
		* @date: 2016-12-27 
		* @author: tangaq
		* @title: selectGroupMsgEvent 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String selectGroupMsgEvent(Map<String, Object> inParam) {
			String outParam = proceServiceDML.selectGroupMsgByCRM(inParam);
			return outParam;
		}

	}
	
	/**
	 * 清单数据查询操作
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: InventorySelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class InventorySelector implements IInventorySelector,Serializable{

		protected IRDBMSDML.IRmInventoryInfo rmInventoryInfo;
		
		/**
		 * 
		* @date: 2017-1-12 
		* @author: zhangjj_crmpd
		* @title: setRmInventoryInfo 
		* @param rmInventoryInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmInventoryInfo(IRDBMSDML.IRmInventoryInfo rmInventoryInfo) {
			this.rmInventoryInfo = rmInventoryInfo;
		}

		/**
		 * 分页查询清单列表
		* @date: 2017-1-12 
		* @author: zhangjj_crmpd
		* @title: selectInventoryInfoListByPage 
		* @param inParam
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectInventoryInfoListByPage(Map<String, Object> inParam, Map<String, Object> tempInParam)throws StrategyError {
			return rmInventoryInfo.selectByPage(iBatisQueryFilter.getSelectInventoryQueryFilter(tempInParam), Integer.parseInt(CommonUtils.toString(tempInParam.get("startPage"))), Integer.parseInt(CommonUtils.toString(tempInParam.get("limit"))));
		}

	}
	
	/**
	 * 标签码表查询操作实体类
	* @date: 2017-3-4 
	* @author: yuanchun
	* @title: LabelCodeNameSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class LabelCodeNameSelector implements ILabelCodeNameSelector,Serializable{
		
		protected IRDBMSDML.IRmLabelCodeNameDict rmLabelCodeNameDict;
		
		/**
		 * 
		* @date: 2017-3-4 
		* @author: yuanchun
		* @title: setRmLabelCodeNameDict 
		* @param rmLabelCodeNameDict 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmLabelCodeNameDict(
				IRDBMSDML.IRmLabelCodeNameDict rmLabelCodeNameDict) {
			this.rmLabelCodeNameDict = rmLabelCodeNameDict;
		}

		/**
		 * 查询标签码表
		* @date: 2017-3-4 
		* @author: yuanchun
		* @title: select 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectLabelCodeName(Map<String, Object> inParam)
				throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectCodeNameQueryFilter(inParam);
			int start = Integer.valueOf(inParam.get("currentPageCode")==null?"1":(String)inParam.get("currentPageCode"));
			int	limit = Integer.valueOf(inParam.get("perRecordCount")==null?"10":(String)inParam.get("perRecordCount"));
			Map<String, Object> labelCodeNameListInfo = rmLabelCodeNameDict.selectLabelCodeName(queryFilter, start, limit);
			labelCodeNameListInfo.put("currentPageCode", start+"");
			labelCodeNameListInfo.put("perRecordCount", limit+"");
			return labelCodeNameListInfo;
		}
		
	}
	
	/**
	 * 登录(权限、角色、菜单)数据查询操作实现类
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: LoginSelector 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class LoginSelector implements ILoginSelector,Serializable{
		
		/**
		 * 工号对象
		 */
		protected IRDBMSDML.IRmLoginMsgInfo rmLoginMsgInfo;
		/**
		 * 工号对象
		 */
		protected INosqlDML.IRmLoginMsgInfo rmLoginMsgInfoHbase;
		/**
		 * 菜单对象
		 */
		protected IRDBMSDML.IRmMenuInfo rmMenuInfo;

		/**
		 * 角色对象
		 */
		protected IRDBMSDML.IRmRoleInfo rmRoleInfo;

		/**
		 * 角色与用户关系对象
		 */
		protected IRDBMSDML.IRmRoleUserRel rmRoleUserRel;

		/**
		 * 角色与菜单关系对象
		 */
		protected IRDBMSDML.IRmRoleMenuRel rmRoleMenuRel;

		/** 
		 * @date: 2016-10-27 
		 * @author: xiongxq
		 * @Title: setRmLoginMsgInfo 
		 * @param rmLoginMsgInfo the rmLoginMsgInfo to set
		 * @version 1.0 
		 * @Description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmLoginMsgInfo(IRDBMSDML.IRmLoginMsgInfo rmLoginMsgInfo) {
			this.rmLoginMsgInfo = rmLoginMsgInfo;
		}
		
		/** 
		 * @date: 2016-11-14 
		 * @author: wangpei
		 * @title: setRmLoginMsgInfoHbase 
		 * @param rmLoginMsgInfoHbase the rmLoginMsgInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmLoginMsgInfoHbase(INosqlDML.IRmLoginMsgInfo rmLoginMsgInfoHbase) {
			this.rmLoginMsgInfoHbase = rmLoginMsgInfoHbase;
		}

		/**
		 * 
		* @date: 2016-10-26 
		* @author: fangyuan_crmpd
		* @title: setRmMenuInfo 
		* @param rmMenuInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmMenuInfo(IRDBMSDML.IRmMenuInfo rmMenuInfo) {
			this.rmMenuInfo = rmMenuInfo;
		}
		
		/**
		 * 
		* @date: 2016-10-28 
		* @author: zhangjj_crmpd
		* @title: setRmRoleInfo 
		* @param rmRoleInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmRoleInfo(IRDBMSDML.IRmRoleInfo rmRoleInfo) {
			this.rmRoleInfo = rmRoleInfo;
		}
		
		/**
		 * 
		* @date: 2016-10-28 
		* @author: zhangjj_crmpd
		* @title: setRmRoleUserRel 
		* @param rmRoleUserRel 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmRoleUserRel(IRDBMSDML.IRmRoleUserRel rmRoleUserRel) {
			this.rmRoleUserRel = rmRoleUserRel;
		}

		/**
		 * 
		* @date: 2016-10-28 
		* @author: zhangjj_crmpd
		* @title: setRmRoleMenuRel 
		* @param rmRoleMenuRel 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmRoleMenuRel(IRDBMSDML.IRmRoleMenuRel rmRoleMenuRel) {
			this.rmRoleMenuRel = rmRoleMenuRel;
		}

		/**
		 * 查询角色列表
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: select 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> select(Map<String, Object> inParam,
				IQueryFilter queryFilter) throws StrategyError {
			List<Map<String, Object>> list = rmRoleInfo.select(queryFilter);
			return list;
		}
		
		/** 分页查询工号列表
		* @date: 2016-10-31 
		* @author: wangpei
		* @title: selectForPage 
		* @param inParam
		* @param queryFilter
		* @param start
		* @param limit
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		public Map<String, Object> selectForPage(
				Map<String, Object> inParam, IQueryFilter queryFilter,
				int start, int limit) throws StrategyError {
			return rmLoginMsgInfo.selectForPage(queryFilter, start, limit);
		}

		/** 
		 * 查询工号列表
		* @date: 2016-10-27 
		* @author: xiongxq
		* @Title: selectLoginNoList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public List<Map<String, Object>> selectLoginNoList(Map<String, Object> inParam,
				IQueryFilter queryFilter) throws StrategyError {
			List<Map<String,Object>> outList = rmLoginMsgInfo.select(queryFilter);
			return outList;
		}

		/** 查询工号信息
		* @date: 2016-10-27 
		* @author: wangpei
		* @title: selectLoginNo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public Map<String, Object> selectLoginNo(Map<String, Object> inParam,
				IQueryFilter queryFilter) throws StrategyError {
			return rmLoginMsgInfo.selectLoginNo(queryFilter);
		}

		/** 从hbase查询工号信息
		* @date: 2016-11-14 
		* @author: wangpei
		* @title: selectLoginMsgByLoginNoHbase 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public Map<String, String> selectLoginMsgByLoginNoHbase(
				Map<String, Object> inParam) {
			return rmLoginMsgInfoHbase.getLoginMsgByLoginNo((String)inParam.get("loginNo"));
		}

		/**
		 * 根据工号查询该工号下面未拥有的角色列表 
		* @date: 2016-10-28 
		* @author: xiongxq
		* @Title: selectNotHasRoleByLoginNo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public List<Map<String, Object>> selectNotHasRoleByLoginNo(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String,Object>> outList = rmRoleInfo.selectNoHasByLoginNo(queryFilter);
			return outList;
		}

		/**
		 * 查询菜单列表
		* @date: 2016-10-26 
		* @author: fangyuan_crmpd
		* @title: selectMenuList 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectMenuList(
				Map<String, Object> inParam) throws StrategyError {
			List<Map<String, Object>> list = rmMenuInfo.selectMenuList(inParam);
			return list;
		}

		/**
		 * 查询菜单详细信息
		* @date: 2016-10-26 
		* @author: fangyuan_crmpd
		* @title: selectMenuDetailById 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectMenuDetailById(
				Map<String, Object> inParam) throws StrategyError {
			List<Map<String, Object>> list = rmMenuInfo.selectMenuDetailById(inParam);
			return list;
		}

		/**
		 * 通过工号查询菜单列表
		* @date: 2016-10-29 
		* @author: fangyuan_crmpd
		* @title: selectMenuListByLoginNo 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectMenuListByLoginNo(
				Map<String, Object> inParam) throws StrategyError {
			List<Map<String, Object>> list = rmMenuInfo.selectMenuListByLoginNo(inParam);
			return list;
		}

		/**
		 * 查询用户和菜单关系列表
		* @date: 2016-10-28 
		* @author: zhangjj_crmpd
		* @title: selectRoleMenuRel 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectRoleMenuRel(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmRoleMenuRel.select(queryFilter);
		}
		
		/**
		 * 查询用户和角色的关系列表
		* @date: 2016-10-27 
		* @author: wangth
		* @Title: selectRoleUserRel 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectRoleUserRel(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String, Object>> list = rmRoleUserRel.select(queryFilter);
			return list;
		}

		/** 
		 * 根据工号查询该工号下面拥有的角色列表
		* @date: 2016-10-27 
		* @author: xiongxq
		* @Title: selectRoleByLoginNo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public List<Map<String, Object>> selectRoleByLoginNo(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String, Object>> outList = rmRoleInfo.selectByLoginNo(queryFilter);
			return outList;
		}
	}
	
	/**
	 * 营销案数据查询操作实现类
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: MarketCaseSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class MarketCaseSelector implements IMarketCaseSelector,Serializable{
		
		protected ICacheDML.IChannelTriggerMarketCaseCache channelTriggerMarketCaseCache;
		protected ICacheDML.IEventTriggerMarketCaseCache eventTriggerMarketCaseCache;
		protected ICacheDML.IMarketCaseDetailCache marketCaseDetailCache;
		protected ICacheDML.IMarketCaseRecommendStatusCache marketCaseRecommendStatusCache;
		protected IRDBMSDML.IRmMarketCaseInfo rmMarketCaseInfo;
		protected INosqlDML.IRmRecommendCloseInfo rmRecommendCloseInfoHbase;
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		protected IServiceDML proceServiceDML;
		protected ICacheDML.IStatisticCache statisticCache; 
		protected ICacheDML.IWaitCreateBatchPushMarketCaseCache waitCreateBatchPushMarketCaseCache;
		protected ICacheDML.IWaitCreateCallTaskMarketCaseCache waitCreateCallTaskMarketCaseCache;
		protected ICacheDML.IWaitCreateChannelTaskMarketCaseCache waitCreateChannelTaskMarketCaseCache;
		protected ICacheDML.IWaitSendBatchPushMarketCaseCache waitSendBatchPushMarketCaseCache; 
		protected ICacheDML.IEvaluateRuleCache evaluateRuleCache;
		protected ICacheDML.ICloseRuleCache closeRuleCache;

/*		public void setBatchPushTask(ICacheDML.IBatchPushTask batchPushTask) {
			this.batchPushTask = batchPushTask;
		}

		public void setBatchPushSendStatus(
				ICacheDML.IBatchPushSendStatus batchPushSendStatus) {
			this.batchPushSendStatus = batchPushSendStatus;
		}*/
		
		public void setChannelTriggerMarketCaseCache(
				ICacheDML.IChannelTriggerMarketCaseCache channelTriggerMarketCaseCache) {
			this.channelTriggerMarketCaseCache = channelTriggerMarketCaseCache;
		}

		public void setEventTriggerMarketCaseCache(
				ICacheDML.IEventTriggerMarketCaseCache eventTriggerMarketCaseCache) {
			this.eventTriggerMarketCaseCache = eventTriggerMarketCaseCache;
		}

		public void setMarketCaseDetailCache(
				ICacheDML.IMarketCaseDetailCache marketCaseDetailCache) {
			this.marketCaseDetailCache = marketCaseDetailCache;
		}

		public void setMarketCaseRecommendStatusCache(
				ICacheDML.IMarketCaseRecommendStatusCache marketCaseRecommendStatusCache) {
			this.marketCaseRecommendStatusCache = marketCaseRecommendStatusCache;
		}

		public void setRmMarketCaseInfo(IRDBMSDML.IRmMarketCaseInfo rmMarketCaseInfo) {
			this.rmMarketCaseInfo = rmMarketCaseInfo;
		}

		public void setRmRelationRel(IRDBMSDML.IRmRelationRel rmRelationRel) {
			this.rmRelationRel = rmRelationRel;
		}
		
		public void setRmRecommendCloseInfoHbase(
				INosqlDML.IRmRecommendCloseInfo rmRecommendCloseInfoHbase) {
			this.rmRecommendCloseInfoHbase = rmRecommendCloseInfoHbase;
		}

		public void setProceServiceDML(IServiceDML proceServiceDML) {
			this.proceServiceDML = proceServiceDML;
		}

		public void setStatisticCache(ICacheDML.IStatisticCache statisticCache) {
			this.statisticCache = statisticCache;
		}
		
		public void setWaitCreateBatchPushMarketCaseCache(
				ICacheDML.IWaitCreateBatchPushMarketCaseCache waitCreateBatchPushMarketCaseCache) {
			this.waitCreateBatchPushMarketCaseCache = waitCreateBatchPushMarketCaseCache;
		}
		
		public void setWaitCreateCallTaskMarketCaseCache(
				ICacheDML.IWaitCreateCallTaskMarketCaseCache waitCreateCallTaskMarketCaseCache) {
			this.waitCreateCallTaskMarketCaseCache = waitCreateCallTaskMarketCaseCache;
		}
		
		public void setWaitCreateChannelTaskMarketCaseCache(
				ICacheDML.IWaitCreateChannelTaskMarketCaseCache waitCreateChannelTaskMarketCaseCache) {
			this.waitCreateChannelTaskMarketCaseCache = waitCreateChannelTaskMarketCaseCache;
		}
		
		public void setWaitSendBatchPushMarketCaseCache(
				ICacheDML.IWaitSendBatchPushMarketCaseCache waitSendBatchPushMarketCaseCache) {
			this.waitSendBatchPushMarketCaseCache = waitSendBatchPushMarketCaseCache;
		}

		public void setEvaluateRuleCache(ICacheDML.IEvaluateRuleCache evaluateRuleCache) {
			this.evaluateRuleCache = evaluateRuleCache;
		}
		
		public void setCloseRuleCache(ICacheDML.ICloseRuleCache closeRuleCache) {
			this.closeRuleCache = closeRuleCache;
		}

		/**
		 * 从缓存中查询批量push营销案
		* @date: 2016-10-1 
		* @author: sunliang
		* @title: getBatchPushMarketCaseAndCustGroupFromCache 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Map<String,String>> getWaitCreateBatchPushMarketCaseFromCache(String taskType)
				throws StrategyError {
			Map<String,Object> tempParam = new HashMap<String,Object>();
			if("batchPushMsg".equals(taskType)){
				tempParam.put("key", Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEMSG);
				tempParam.put("tmpKey", Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEMSG_TMP);
			}else if("batchPushProd".equals(taskType)){
				tempParam.put("key", Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEPROD);
				tempParam.put("tmpKey", Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEPROD_TMP);
			}
			tempParam.put("direction", "");
			return (Map<String, Map<String,String>>)waitCreateBatchPushMarketCaseCache.getByRpoplpush(tempParam);
		}
		
		/**
		 * 查询待生成批量营销案tmp缓存(执行出错任务)
		* @date: 2017-5-4 
		* @author: chenhao
		* @title: getWaitCreateBatchPushMarketCaseFromTmpCache 
		* @param taskType
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> getWaitCreateBatchPushMarketCaseFromTmpCache(String taskType)
				throws StrategyError {
			Map<String,Object> tempParam = new HashMap<String,Object>();
			if("batchPushMsg".equals(taskType)){
				tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEMSG_TMP);
			}else if("batchPushProd".equals(taskType)){
				tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEPROD_TMP);
			}
			tempParam.put("direction", "");
			return (List<Map<String, Object>>)waitCreateBatchPushMarketCaseCache.getAll(tempParam);
		}
		
		/**
		 * 
		* @date: 2017-3-16 
		* @author: sunliang 
		* @title: getWaitCallTaskPushMarketCaseFromCache 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Map<String, String>> getWaitCallTaskPushMarketCaseFromCache()
				throws StrategyError {
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_CALLTASK_WAITCREATE);
			tempParam.put(Const.CACHE_DIRECTION, "");
			System.out.println("==========getWaitCallTaskPushMarketCaseFromCache.key==========" + tempParam.get(Const.CACHE_KEY));
			Map<String, Map<String, String>> m = (Map<String, Map<String,String>>)waitCreateCallTaskMarketCaseCache.getAndRemove(tempParam);
			System.out.println("==========getWaitCallTaskPushMarketCaseFromCache.m==========" + m);
			return m;
		}
		
		/**
		 * 从缓存查询渠道任务的营销案下的目标客户群类型和目标客户群标签表达式
		* @date: 2016-10-12 
		* @author: yangwl
		* @title: getChannelTaskMarketCaseLabelFormulaToCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Map<String,String>> getChannelTaskMarketCaseLabelFormulaFromCache(Map<String,Object> tempInParam) throws StrategyError{
			return waitCreateChannelTaskMarketCaseCache.getAndRemove(tempInParam);
		}
		
		/**
		 * 通过缓存查询营销案详细信息
		* @date: 2016-10-8 
		* @author: sunliang 
		* @title: getMarketCaseDetailFromCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public MarketCaseCachePojo getMarketCaseDetailFromCache(Map<String,Object> tempInParam) throws StrategyError {
			Map<String,Object> tempParam = cacheKey.getMarketCaseDetailFromCacheKey(tempInParam);
			return marketCaseDetailCache.get(tempParam);
		}
		
		/**
		 * 从缓存中查询渠道触发营销案
		* @date: 2017-2-12 
		* @author: sunliang 
		* @title: getChannelTriggerMarketCaseCacheFromCache 
		* @param inParam
		* @param position
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<String> getChannelTriggerMarketCaseCacheFromCache(Map<String, Object> inParam,Map<String, Object> position) throws StrategyError {
			
			Map<String,Object> tempParam = cacheKey.getChannelTriggerMarketCaseCacheFromCacheKey(inParam, position);
			List<String> MarketCaseCachePojoList = channelTriggerMarketCaseCache.get(tempParam);
			return MarketCaseCachePojoList;
		}
		
		/**
		 * 得到待发送批量push营销案
		* @date: 2016-12-24 
		* @author: sunliang 
		* @title: getWaitSendBatchPushMarketCaseFromCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String getWaitSendBatchPushMarketCaseFromCache(Map<String,Object> tempInParam)throws StrategyError {
			String processId = tempInParam.get("processId")==null?"":(String)tempInParam.get("processId");
			Map<String,Object> tempParam = new HashMap<String,Object>();
			if("".equals(processId)||processId==null){
				tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITSNED);
			}else{
				tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITSNED+Const.SEPARATOR_COLON+processId);
			}
			tempParam.put(Const.CACHE_START, "0");
			tempParam.put(Const.CACHE_END, "0");
			
			List<String> list = waitSendBatchPushMarketCaseCache.get(tempParam);
			
			if(list.size() == 1) {
				return list.get(0);
			} else {
				log.error("MarketCaseSelector.getWaitSendBatchPushMarketCaseFromCache", list);
				return "";
			}
		}
		
		/**
		 * 通过缓存查询营销案推荐状态
		* @date: 2016-11-14 
		* @author: yangwl
		* @title: getMarketCaseRecommendStatusFromCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String getMarketCaseRecommendStatusFromCache(Map<String,Object> tempInParam) throws StrategyError {
			Map<String,Object> tempParam = cacheKey.getMarketCaseRecommendStatusFromCacheKey(tempInParam);
			return marketCaseRecommendStatusCache.get(tempParam);
		}
		
		/**
		 * 查询外呼任务营销案和目标客户群
		* @date: 2017-3-17 
		* @author: yuanchun
		* @title: selectCallTaskMarketCaseAndCustGroup 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectCallTaskMarketCaseAndCustGroup(
				Map<String, Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectCallTaskMarketCaseAndCustGroupQueryFilter(tempInParam);
			List<Map<String,Object>> resultList = rmMarketCaseInfo.selectCallTaskMarketCaseLabelFormula(queryFilter);
			log.debug("++++++++++++++++++++++selectCallTaskMarketCaseAndCustGroup.resultList", resultList.toString());
			return resultList;
		}
		
		/**
		 * 查询渠道任务营销案和目标客户群
		* @date: 2016-12-28 
		* @author: sunliang 
		* @title: selectChannelTaskMarketCaseAndCustGroup 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectChannelTaskMarketCaseAndCustGroup(Map<String, Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectChannelTaskMarketCaseAndCustGroupQueryFilter(tempInParam);
			List<Map<String,Object>> resultList = rmMarketCaseInfo.selectChannelTaskMarketCaseLabelFormula(queryFilter);
			return resultList;
		}
		
		/**
		 * 查询批量push营销案和目标客户群
		* @date: 2016-12-28 
		* @author: sunliang 
		* @title: selectMarketCaseAndCustGroupList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectBatchPushMarketCaseAndCustGroup(Map<String,Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectBatchPushMarketCaseAndCustGroupQueryFilter(tempInParam);
			List<Map<String,Object>> resultList = rmMarketCaseInfo.selectBatchPushMarketCaseAndCustGroup(queryFilter);
			return resultList;
		}
		
		/**
		 * 查询渠道触发营销案
		* @date: 2016-12-29 
		* @author: sunliang 
		* @title: selectChannelTriggerMarketCase 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectChannelTriggerMarketCase(Map<String,Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectChannelTriggerMarketCaseQueryFilter(tempInParam);
			List<Map<String,Object>> resultList = rmMarketCaseInfo.selectChannelTriggerMarketCase(queryFilter);
			return resultList;
		}
		
		/**
		 * 查询事件触发营销案
		* @date: 2017-1-2 
		* @author: sunliang 
		* @title: selectEventTriggerMarketCase 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectEventTriggerMarketCase(
				Map<String, Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectEventTriggerMarketCaseQueryFilter(tempInParam);
			List<Map<String, Object>>  list = rmMarketCaseInfo.selectEventTriggerMarketCase(queryFilter);
			return list;
		}
		
		/**
		 * 从缓存中通过事件ID查询事件触发营销案
		* @date: 2017-2-17 
		* @author: sunliang 
		* @title: getEventTriggerMarketCaseByEventIdFromCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<String> getEventTriggerMarketCaseByEventIdFromCache(
				Map<String, Object> tempInParam) throws StrategyError {
			Map<String,Object> tempParam = cacheKey.getEventTriggerMarketCaseByEventIdFromCacheKey(tempInParam);
			List<String> retList = eventTriggerMarketCaseCache.get(tempParam);
			Map<String,Object> tempParam1 = cacheKey.getEventTriggerMarketCaseByEventIdFromCacheKeyForAll(tempInParam);
			List<String> retList1 = eventTriggerMarketCaseCache.get(tempParam1);
			retList.addAll(retList1);
			return retList;
		}
		
		/**
		 * 从评估缓存中通过资费ID查询营销案列表信息
		* @date: 2017-4-7 
		* @author: zhangyw_crmpd
		* @title: getMarketCaseIdByPostageIdFromCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<String> getMarketCaseIdByPostageIdFromEvaluateCache(
				Map<String, Object> tempInParam) throws StrategyError {
			Map<String,Object> tempParam = cacheKey.getMarketCaseIdByPostageIdFromEvaluateCacheKey(tempInParam);
			return evaluateRuleCache.get(tempParam);
		}
		
		/**
		 * 从关闭缓存中通过资费ID查询营销案列表信息
		* @date: 2017-4-10 
		* @author: zhangyw_crmpd
		* @title: getMarketCaseIdsByPostageIdFromCloseCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<String> getMarketCaseIdByPostageIdFromCloseCache(
				Map<String, Object> tempInParam) throws StrategyError {
			Map<String,Object> tempParam = cacheKey.getMarketCaseIdByPostageIdFromCloseCacheKey(tempInParam);
			return closeRuleCache.get(tempParam);
		}
		/**
		 * 查询营销案和全局规则信息
		* @date: 2016-11-16 
		* @author: yuanliang
		* @title: selectMarketCaseAndWholeRuleDetail 
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectMarketCaseAndWholeRuleDetail(IQueryFilter queryFilter) throws StrategyError {
			List<Map<String,Object>> resultList = rmMarketCaseInfo.selectMarketCaseAndWholeRuleDetail(queryFilter);
			return resultList;
		}	

		/**
		 * 根据规则id查询营销案id
		* @date: 2017-4-6 
		* @author: sunyuan
		* @title: selectMarketCaseIdByRuleId 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String,Object> selectMarketCaseIdByCloseRuleId(Map<String,Object> tempInParam)throws StrategyError{
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectMarketCaseIdByRuleIdQueryFilter(tempInParam);
			Map<String,Object> marketCaseInfo = rmRelationRel.selectMarketCaseIdByRuleId(queryFilter);
			return marketCaseInfo;
		}

/*		*//** 
		 * 根据事件ID查询营销案ID列表缓存
		* @date: 2016-11-23 
		* @author: songxj
		* @title: selectMarketCaseIDByEventIdFromCache 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*//*
		@Override
		public List<String> selectMarketCaseIDByEventIdFromCache(
				Map<String, Object> inParam) throws StrategyError {
			return eventTriggerMarketCaseCache.get(inParam);
		}*/
		
		/**
		 * 查询营销案ID列表
		* @date: 2016-11-7 
		* @author: sunliang 
		* @title: selectMarketCaseIdList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectMarketCaseIdList(Map<String,Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectMarketCaseIdListQueryFilter(tempInParam);
			List<Map<String, Object>> marketCaseIdList = rmMarketCaseInfo.selectMarketCaseIdList(queryFilter);
			return marketCaseIdList;
		}
		
		/**
		 * 
		* @date: 2017-3-7 
		* @author: sunliang 
		* @title: selectMarketCaseIdByEventId 
		* @param eventIdList
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectMarketCaseIdByEventId(
				Map<String,Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectMarketCaseIdByEventIdQueryFilter(tempInParam);
			List<Map<String, Object>> marketCaseIdList = rmRelationRel.selectMarketCaseIdByEventId(queryFilter);
			return marketCaseIdList;
		}
		
		/**
		 * 根据营销案id查询营销案信息
		* @date: 2017-3-30 
		* @author: sunyuan
		* @title: selectMarketCaseInfoById 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String,Object> selectMarketCaseInfoById(Map<String,Object> tempInParam)throws StrategyError{
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectMarketCaseInfoByIdQueryFilter(tempInParam);
			return rmMarketCaseInfo.selectMarketCaseById(queryFilter);
		}
		
		/**
		 * 查询营销案信息(已过时，请替换为electMarketCaseList(Map<String,Object> tempInParam))
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectMarketCaseList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		@Deprecated
		public List<Map<String, Object>> selectMarketCaseList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			return rmMarketCaseInfo.select(queryFilter);
		}
		
		/**
		 * 查询营销案信息
		* @date: 2016-12-30 
		* @author: sunliang 
		* @title: selectMarketCaseList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectMarketCaseList(Map<String, Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectMarketCaseListQueryFilter(tempInParam);
			return rmMarketCaseInfo.select(queryFilter);
		}
		
		/**
		 * 根据权限查询营销案列表
		* @date: 2017-1-5 
		* @author: yuanchun
		* @title: selectMarketCaseListForPage
		* @param queryFilter
		* @param start
		* @param limit
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectMarketCaseListForPage(IQueryFilter queryFilter, int start, int limit) throws StrategyError {
			return rmMarketCaseInfo.selectMarketCaseListForPage(queryFilter,start,limit);
		}
		
		/**
		 * 查询营销案推荐数
		* @date: 2017-1-10 
		* @author: sunliang 
		* @title: selectMarketCaseRecommendCount 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String selectMarketCaseRecommendCount(Map<String, Object> tempInParam) throws StrategyError{
			
			String marketCaseId = (String)tempInParam.get("marketCaseId");
			String key = Const.CACHE_DATATYPE_STATISTIC + "marketCaseRecommend"
					+ Const.SEPARATOR_COLON + marketCaseId;
			
			return statisticCache.get(key);
		}
		
		/**
		 * 基于日期查询营销案推荐数
		* @date: 2017-1-10 
		* @author: sunliang 
		* @title: selectMarketCaseRecommendCountByDate 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String selectMarketCaseRecommendCountByDate(Map<String, Object> tempInParam) throws StrategyError{
			
			String marketCaseId = (String)tempInParam.get("marketCaseId");
			String channelId = (String)tempInParam.get("channelId");
			String key = Const.CACHE_DATATYPE_STATISTIC + "marketCaseRecommend"
					+ Const.SEPARATOR_COLON + marketCaseId
					+ Const.SEPARATOR_COLON + channelId;
			
			return statisticCache.get(key);
		}
		
		
		/**
		 * 查询营销案报表列表（执行中，已经推送的营销案）
		* @date: 2017-4-17 
		* @author: yuanchun
		* @title: selectMarketCaseReportFormList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectMarketCaseReportFormList(
				Map<String, Object> tempInParam)  throws StrategyError{
			Map<String, Object> retMap = new HashMap<String, Object>();
			log.info("selectMarketCaseReportFormList.tempInParam",tempInParam);
			IQueryFilter queryFilter = iBatisQueryFilter.getselectMarketCaseReportFormListQueryFilter(tempInParam);
			int start = Integer.valueOf(tempInParam.get("currentPageCode")==null?"1":(String)tempInParam.get("currentPageCode"));
			int	limit = Integer.valueOf(tempInParam.get("perRecordCount")==null?"10":(String)tempInParam.get("perRecordCount"));
			Map<String, Object> marketCaseMap = rmMarketCaseInfo.selectMarketCaseReportFormList(queryFilter, start, limit);
			
			log.info("selectMarketCaseReportFormList.marketCaseMap", marketCaseMap);
			
			retMap.put("marketCaseList",marketCaseMap.get("result") == null?new ArrayList<Map<String,Object>>():(List<Map<String,Object>>)marketCaseMap.get("result"));
			retMap.put("totalRecordCount", marketCaseMap.get("sum") == null?0:marketCaseMap.get("sum"));
			retMap.put("currentPageCode", start+"");
			retMap.put("perRecordCount", limit+"");
			log.info("selectMarketCaseReportFormList.retMap", retMap);
			return retMap;
		}

		/**
		 * 查询营销案推荐量
		* @date: 2017-4-18 
		* @author: yuanchun
		* @title: selectBatchMarketCaseRecommendCount 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String selectBatchMarketCaseRecommendCount(
				Map<String, Object> tempInParam) throws StrategyError {
			String recommendCount = proceServiceDML.selectBatchMarketCaseRecommendCount(tempInParam);
			return recommendCount;
		}

		/**
		 * 查询营销案下的目标客户群数
		* @date: 2017-4-17 
		* @author: yuanchun
		* @title: selectMarketCaseTargetCustCount 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectMarketCaseTargetCustCount(
				Map<String, Object> tempInParam) throws StrategyError {
			Map<String, Object> retMap = new HashMap<String, Object>();
			log.info("selectMarketCaseTargetCustCount.tempInParam", tempInParam);
			IQueryFilter queryFilter = iBatisQueryFilter.getselectMarketCaseTargetCustCountQueryFilter(tempInParam);
			Map<String, Object> custGroupMap = rmMarketCaseInfo.selectMarketCaseTargetCustCount(queryFilter);
			if(!CommonUtils.objectIsNull(custGroupMap)){
				List<Map<String, Object>> custGroupList = (List<Map<String, Object>>) custGroupMap.get("custGroupList");
				long targetCustCount = 0;
				for(Map<String, Object> custGroup: custGroupList){
					log.debug("selectMarketCaseTargetCustCount.custGroup", custGroup);
					if(!CommonUtils.objectIsNull(custGroup.get("custGroupNum"))){
						targetCustCount = Long.valueOf(custGroup.get("custGroupNum").toString())+targetCustCount;
						retMap.put("custGroupType", custGroup.get("custGroupType"));
						retMap.put("custGroupTypeName", custGroup.get("custGroupTypeName"));
					}
					log.debug("selectMarketCaseTargetCustCount.targetCustCount", targetCustCount);
				}
				retMap.put("targetCustCount", targetCustCount+"");
				
			}else{
				retMap.put("targetCustCount", "0");
				retMap.put("custGroupType", "");
				retMap.put("custGroupTypeName", "");
			}
			return retMap;
			
		}
		
		/**
		 * 查询营销案数量
		* @date: 2016-11-8 
		* @author: mengxi
		* @title: selectMarketCaseNum 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String,Object> selectMarketCaseNum(Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError{ 
			return rmMarketCaseInfo.selectMarketCaseNum(queryFilter); 
		}

		/**
		 * 查询营销案转化量
		* @date: 2017-4-18 
		* @author: yuanchun
		* @title: selectMarketCaseOrderCount 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String,Object> selectMarketCaseOrderCount(Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String,Object> orderCountMap = new HashMap<String, Object>();
			String marketCaseId = (String) tempInParam.get("marketCaseId");
			String currentDay = (String) DateUtil.getCurrentDay();
			String currentMonth = (String) DateUtil.getCurrentMonth();
			
			String marketCaseOrderByMonthKey = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_MARKETCASEORDERBYMONTH + Const.SEPARATOR_COLON + marketCaseId + Const.SEPARATOR_COLON + currentMonth;
			String marketCaseOrderByDayKey = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_MARKETCASEORDERBYDAY + Const.SEPARATOR_COLON + marketCaseId + Const.SEPARATOR_COLON + currentDay;
			log.debug("selectMarketCaseOrderCount.marketCaseOrderByMonthKey", marketCaseOrderByMonthKey);
			log.debug("selectMarketCaseOrderCount.marketCaseOrderByDayKey", marketCaseOrderByDayKey);
			
			String orderCountByMonth = statisticCache.get(marketCaseOrderByMonthKey);
			String orderCountByDay = statisticCache.get(marketCaseOrderByDayKey);
			log.debug("selectMarketCaseOrderCount.orderCountByMonth", orderCountByMonth);
			log.debug("selectMarketCaseOrderCount.orderCountByDay", orderCountByDay);
			
			orderCountMap.put("orderCountByMonth", (orderCountByMonth==null?"0":orderCountByMonth));
			orderCountMap.put("orderCountByDay", (orderCountByDay==null?"0":orderCountByDay));
			return orderCountMap;
		}
		
		/**
		 * 查询推荐关闭数据
		* @date: 2016-11-28 
		* @author: yangwl
		* @title: selectRecommendCloseByRowKey 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectRecommendCloseByRowKey(Map<String, Object> tempInParam) throws StrategyError{
			String rowKey = hbaseRowKey.getRecommendCloseRowkey(tempInParam);
			tempInParam.put(Const.NOSQL_ROWKEY, rowKey);
			return rmRecommendCloseInfoHbase.select(tempInParam);
		}
		
		/**
		 * 查询关系信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectRelationList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectRelationList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			List<Map<String, Object>>  list = rmRelationRel.select(queryFilter);
			return list;
		}

	}
	
	/**
	 * 监控数据查询操作实现类
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: MonitorWarningSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class MonitorSelector implements IMonitorSelector{
		/**
		 * 接口服务监控对象
		 */
		protected IRDBMSDML.IRmServicemonitoringInfo rmServicemonitoringInfo;
		
		/**
		 * 监控告警对象
		 */
		protected IRDBMSDML.IRmMonitorWarningInfo rmMonitorWarningInfo;
		/**
		 * 服务监控缓存
		 */
		protected ICacheDML.IServiceMonitoringCache serviceMonitoringCache;
		
		/**
		 * 
		* @date: 2016-11-13 
		* @author: fangyuan_crmpd
		* @title: setRmMonitorWarningInfo 
		* @param rmMonitorWarningInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmMonitorWarningInfo(
				IRDBMSDML.IRmMonitorWarningInfo rmMonitorWarningInfo) {
			this.rmMonitorWarningInfo = rmMonitorWarningInfo;
		}
		
		public void setServiceMonitoringCache(
				ICacheDML.IServiceMonitoringCache serviceMonitoringCache) {
			this.serviceMonitoringCache = serviceMonitoringCache;
		}
		
		
		public void setRmServicemonitoringInfo(
				IRDBMSDML.IRmServicemonitoringInfo rmServicemonitoringInfo) {
			this.rmServicemonitoringInfo = rmServicemonitoringInfo;
		}

		/**
		 * 查询作业运行告警详细信息
		* @date: 2016-11-13 
		* @author: fangyuan_crmpd
		* @title: selectWorkOperWarningInfo 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectWorkOperWarningInfo(
				Map<String, Object> inParam) throws StrategyError {
			return rmMonitorWarningInfo.select(inParam);
		}

		
		/**
		 * 接口服务监控查询
		* @date: 2017-3-10 
		* @author: wuJiaFu
		* @title: selectServiceMonitorInfo 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectServiceMonitorInfo(
				Map<String, Object> inParam,IQueryFilter queryFilter,int start,int limit) throws StrategyError {
			return rmServicemonitoringInfo.select(inParam,start,limit);
		}
		
		/** 
		* @date: 2017-3-7 
		* @author: wangpei
		* @title: getAndRemoveServiceMonitoringCache 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public Map<String, Object> getAndRemoveServiceMonitoringCache()throws StrategyError {
			Map<String, Object> tempInParam = new HashMap<String, Object>();
			tempInParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_SERVICEMONITORING);
			tempInParam.put(Const.CACHE_DIRECTION, Const.CACHE_RESTORE_DIRECTION_RIGHT);
			return serviceMonitoringCache.getAndRemove(tempInParam);
		}		
	}
	
	/**
	 * 操作日志查询操作
	* @date: 2016-11-1 
	* @author: tangaq
	* @title: OperLogSelector 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class OperLogSelector implements IOperLogSelector{
		
		protected IRDBMSDML.IRmOperLogInfo rmOperLogInfo;
		protected IRDBMSDML.IRmMessageTriggerLogInfo rmMessageTriggerLogInfo;
		
		/**
		 * 
		* @date: 2016-11-1 
		* @author: tangaq
		* @title: setRmOperLogInfo 
		* @param rmOperLogInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmOperLogInfo(IRDBMSDML.IRmOperLogInfo rmOperLogInfo) {
			this.rmOperLogInfo = rmOperLogInfo;
		}
		
		/**
		 * 
		* @date: 2017-3-7 
		* @author: wuJiaFu
		* @title: setRmMessageTriggerLogInfo 
		* @param rmMessageTriggerLogInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmMessageTriggerLogInfo(
				IRDBMSDML.IRmMessageTriggerLogInfo rmMessageTriggerLogInfo) {
			this.rmMessageTriggerLogInfo = rmMessageTriggerLogInfo;
		}



		/**
		 * 查询操作日志列表
		* @date: 2016-11-1 
		* @author: tangaq
		* @title: selectOperLogList 
		* @param inParam
		* @param queryFilter
		* @param start
		* @param limit
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectOperLogList(
				Map<String, Object> inParam, IQueryFilter queryFilter,int start,int limit)
				throws StrategyError {
			return  rmOperLogInfo.selectOperLogList(queryFilter,start,limit);
		}
		/**
		 * 短信触发操作日志查询
		* @date: 2017-3-7 
		* @author: wuJiaFu
		* @title: selectMessageTriggerLogList 
		* @param inParam
		* @param queryFilter
		* @param start
		* @param limit
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectMessageTriggerLogList(
				Map<String, Object> inParam, IQueryFilter queryFilter,
				int start, int limit) throws StrategyError {
			return rmMessageTriggerLogInfo.select(inParam,queryFilter,start,limit);
		}
		
		
	}
	
	/**
	 * 运营位数据查询实现类
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: PositionSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class PositionSelector implements IPositionSelector, Serializable{
		protected IRDBMSDML.IRmPositionInfo rmPositionInfo;
		protected IRDBMSDML.IRmAttributeInfo rmAttributeInfo;
		
		public void setRmPositionInfo(IRDBMSDML.IRmPositionInfo rmPositionInfo) {
			this.rmPositionInfo = rmPositionInfo;
		}
		
		public void setRmAttributeInfo(IRDBMSDML.IRmAttributeInfo rmAttributeInfo) {
			this.rmAttributeInfo = rmAttributeInfo;
		}

		/**
		 * 查询运营位信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectPositionInfo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Deprecated
		@Override
		public List<Map<String, Object>> selectPositionInfo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			return rmPositionInfo.select(queryFilter);
		}
		
		/**
		 * 查询运营位信息(新)
		* @date: 2017-3-17 
		* @author: sunyuan
		* @title: selectPositionInfo 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectPositionInfo(Map<String, Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectPositionInfoQueryFilter(tempInParam);
			return rmPositionInfo.select(queryFilter);
		}

		/**
		 * 查询运营位详细信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectPositionAttrInfo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String,Object>> selectPositionAttrInfo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			List<Map<String,Object>> list = rmAttributeInfo.select(queryFilter);
			return list;
		}
		
		
	}

	/**
	 * 产商品数据查询实现类
	* @date: 2016-9-27 
	* @author: zhangjj_crmpd
	* @title: ProductCommoditySelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ProductCommoditySelector implements IProductCommoditySelector, Serializable{

		protected IRDBMSDML.IRmProductCommodityInfo rmProductCommodityInfo;
		
		/**
		 * 
		* @date: 2016-10-7 
		* @author: zhangjj_crmpd
		* @title: setRmProductCommodityInfo 
		* @param rmProductCommodityInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmProductCommodityInfo(
				IRDBMSDML.IRmProductCommodityInfo rmProductCommodityInfo) {
			this.rmProductCommodityInfo = rmProductCommodityInfo;
		}


		/**
		 * 查询产商品列表
		* @date: 2016-9-27 
		* @author: zhangjj_crmpd
		* @title: selectProductCommodityList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectProductCommodityList(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String, Object>> list = rmProductCommodityInfo.selectRmProductCommodityList(queryFilter,(Integer)inParam.get("startNum"),(Integer)inParam.get("endNum"));
			return list;
		}

		/**
		 * 按条件查询产商品数量
		* @date: 2016-10-9 
		* @author: zhangjj_crmpd
		* @title: selectProductCommodityCount 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String selectProductCommodityCount(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			
			return rmProductCommodityInfo.selectProductCommodityCount(queryFilter);
		}

		/**
		 * 查询产商品
		* @date: 2016-10-18 
		* @author: zhangjj_crmpd
		* @title: selectProductCommodity 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectProductCommodity(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmProductCommodityInfo.selectRmProductCommodity(queryFilter);
		}
	}
	
	public class ProductSelector implements IProductSelector{
		protected IRDBMSDML.IRmProductInfo rmProductInfo;
		
		protected IServiceDML proceServiceDML;
		/** 
		 * @date: 2016-10-13 
		 * @author: wangpei
		 * @title: setRmProductInfo 
		 * @param rmProductInfo the rmProductInfo to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		
		public void setRmProductInfo(IRDBMSDML.IRmProductInfo rmProductInfo) {
			this.rmProductInfo = rmProductInfo;
		}
		
		/**
		 * 
		* @date: 2017-2-11 
		* @author: yuanchun
		* @title: setServiceDML 
		* @param the serviceDML to setter
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setProceServiceDML(IServiceDML proceServiceDML) {
			this.proceServiceDML = proceServiceDML;
		}

		/** 查询产品列表
		* @date: 2016-10-13 
		* @author: wangpei
		* @title: selectProductList 
		* @param inParam
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		public List<Map<String, Object>> selectProductList(Map<String, Object> inParam, IQueryFilter queryFilter) {
			return rmProductInfo.select(queryFilter);
		}
		/** 分页查询
		* @date: 2016-10-30 
		* @author: wangpei
		* @title: selectProductListForPage 
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
		public Map<String, Object> selectProductListForPage(Map<String, Object> inParam) throws StrategyError{
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectProductListQueryFilter(inParam);
			int start = Integer.valueOf(inParam.get("currentPageCode")==null?"1":(String)inParam.get("currentPageCode"));
			int	limit = Integer.valueOf(inParam.get("perRecordCount")==null?"10":(String)inParam.get("perRecordCount"));
			Map<String, Object> productListInfo = rmProductInfo.selectForPage(queryFilter, start, limit);
			productListInfo.put("currentPageCode", start+"");
			productListInfo.put("perRecordCount", limit+"");
			return productListInfo;
		}
		
	}
	
	/**
	 * 区域用户群优先级查询操作实现类
	* @date: 2016-10-15 
	* @author: fangyuan_crmpd
	* @title: PrioritySelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class PrioritySelector implements IPrioritySelector, Serializable{
		/**
		 * 区域优先级
		 */
		protected IRDBMSDML.IRmAreaPriorityInfo rmAreaPriorityInfo;
		/**
		 * 用户群优先级
		 */
		protected IRDBMSDML.IRmCustGroupPriorityInfo rmCustGroupPriorityInfo;
		
		/**
		 * 
		* @date: 2016-10-20 
		* @author: fangyuan_crmpd
		* @title: setRmAreaPriorityInfo 
		* @param rmAreaPriorityInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmAreaPriorityInfo(
				IRDBMSDML.IRmAreaPriorityInfo rmAreaPriorityInfo) {
			this.rmAreaPriorityInfo = rmAreaPriorityInfo;
		}
		
		/**
		 * 
		* @date: 2016-10-20 
		* @author: fangyuan_crmpd
		* @title: setRmCustGroupPriorityInfo 
		* @param rmCustGroupPriorityInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmCustGroupPriorityInfo(
				IRDBMSDML.IRmCustGroupPriorityInfo rmCustGroupPriorityInfo) {
			this.rmCustGroupPriorityInfo = rmCustGroupPriorityInfo;
		}
	
		/**
		 * 查询区域优先级信息
		* @date: 2016-10-15 
		* @author: fangyuan_crmpd
		* @title: selectAreaPriorityInfo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String,Object>> selectAreaPriorityList(
				Map<String, Object> inParam)
				throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getselectAreaPriorityRelByMarketCaseIdQueryFilter(inParam);
			List<Map<String,Object>> list = rmAreaPriorityInfo.selectAreaPriorityRelByMarketCaseId(queryFilter);
			return list;
		}
		
		/**
		 * 查询区域优先级，营销案关联列表
		* @date: 2016-10-19 
		* @author: fangyuan_crmpd
		* @title: selectAreaPriorityRelMarketCaseList 
		* @param inParam
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectAreaPriorityRelMarketCaseList(Map<String, Object> inParam, IQueryFilter queryFilter) 
				throws StrategyError{
			return rmAreaPriorityInfo.selectAreaPriorityRelMarketCase(queryFilter);
		}
		
		/**
		 * 查询用户群优先级信息
		* @date: 2016-10-15 
		* @author: fangyuan_crmpd
		* @title: selectCustGroupPriorityInfo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String,Object>> selectCustGroupPriorityList(
				Map<String, Object> inParam)
				throws StrategyError {
			List<Map<String,Object>> list = rmCustGroupPriorityInfo.select(inParam);
			return list;
		}	
	}
	
	/**
	 * 规则数据查询操作实现类
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: RuleSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RuleSelector implements IRuleSelector,Serializable{
		protected ICacheDML.IGlobalRuleCache globalRuleCache;
		protected ICacheDML.IMutexRuleCache mutexRuleCache;
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		protected IRDBMSDML.IRmRuleInfo rmRuleInfo;
		protected IRDBMSDML.IRmRuleDetailInfo rmRuleDetailInfo;
		protected IRDBMSDML.IRmWaitSendTaskControlInfo rmWaitSendTaskControlInfo;		
		
		/**
		 * 
		* @date: 2016-11-15 
		* @author: yangwl
		* @title: setGlobalRuleCache 
		* @param globalRuleCache 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setGlobalRuleCache(ICacheDML.IGlobalRuleCache globalRuleCache) {
			this.globalRuleCache = globalRuleCache;
		}

		/**
		 * 
		* @date: 2017-3-31 
		* @author: sunyuan
		* @title: setMutexRuleCache 
		* @param mutexRuleCache 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setMutexRuleCache(ICacheDML.IMutexRuleCache mutexRuleCache) {
			this.mutexRuleCache = mutexRuleCache;
		}

		/**
		 * 
		* @date: 2016-12-28 
		* @author: sunliang 
		* @title: setRmRuleInfo 
		* @param rmRuleInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmRuleInfo(IRDBMSDML.IRmRuleInfo rmRuleInfo) {
			this.rmRuleInfo = rmRuleInfo;
		}

		/**
		 * 
		* @date: 2016-12-28 
		* @author: sunliang 
		* @title: setRmRuleDetailInfo 
		* @param rmRuleDetailInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmRuleDetailInfo(IRDBMSDML.IRmRuleDetailInfo rmRuleDetailInfo) {
			this.rmRuleDetailInfo = rmRuleDetailInfo;
		}
		
		/**
		 * 
		* @date: 2016-12-28 
		* @author: sunliang 
		* @title: setRmWaitSendTaskControlInfo 
		* @param rmWaitSendTaskControlInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmWaitSendTaskControlInfo(
				IRDBMSDML.IRmWaitSendTaskControlInfo rmWaitSendTaskControlInfo) {
			this.rmWaitSendTaskControlInfo = rmWaitSendTaskControlInfo;
		}

		/** 
		 * @date: 2016-10-17 
		 * @author: wangpei
		 * @title: setRmRelationRel 
		 * @param rmRelationRel the rmRelationRel to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		
		public void setRmRelationRel(IRDBMSDML.IRmRelationRel rmRelationRel) {
			this.rmRelationRel = rmRelationRel;
		}

		/** 
		 * 查询全局规则
		* @date: 2016-10-15 
		* @author: xiongxq
		* @Title: selectGlobalRule 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public List<Map<String, Object>> selectGlobalRule(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String,Object>> outList = rmRuleDetailInfo.select(queryFilter);
			return outList;
		}
		
		/**
		 * 查询全局规则类型
		* @date: 2016-12-29 
		* @author: sunliang 
		* @title: selectGlobalRuleType 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectGlobalRuleType() throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectGlobalRuleTypeQueryFilter();
			List<Map<String,Object>> list = rmRuleDetailInfo.selectRuleDetailId(queryFilter);
			return list;
		}
		
		/**
		 * 查询全局规则详细信息
		* @date: 2016-12-29 
		* @author: sunliang 
		* @title: selectGlobalRuleDetailById 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectGlobalRuleDetailById(
				Map<String, Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectGlobalRuleDetailQueryFilter(tempInParam);
			List<Map<String, Object>> list = rmRuleDetailInfo.select(queryFilter);
			return list;
		}
		
		/**
		 * 通过缓存查询全局规则
		* @date: 2016-11-15 
		* @author: yangwl
		* @title: selectGlobalRuleFromCache 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectGlobalRuleFromCache()
				throws StrategyError {
			Map<String, Object> tempParam = new HashMap<String, Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_RULE_GLOBALRULE);
			return globalRuleCache.get(tempParam);
		}
		
		/**
		 * 通过缓存查询互斥规则
		* @date: 2017-3-31 
		* @author: sunyuan
		* @title: getMutexRuleFromCache 
		* @param tempParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<String> getMutexRuleFromCache(Map<String,Object> tempParam)throws StrategyError{
			Map<String, Object> tempInParam = cacheKey.getMutexRuleFromCacheKey(tempParam);
			return mutexRuleCache.get(tempInParam);
		}
		
		/**
		 * 根据规则ID查询营销案
		* @date: 2017-3-30 
		* @author: sunyuan
		* @title: selectMarketCaseIdByRuleId 
		* @param ruleId
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String,Object> selectMarketCaseIdByRuleId(Map<String,Object> tempInParam) throws StrategyError{
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectMarketCaseIdByRuleIdQueryFilter(tempInParam);
			return rmRelationRel.selectMarketCaseIdByRuleId(queryFilter);
		}
		
		/** 
		* @date: 2016-10-17 
		* @author: wangpei
		* @title: selectRelation 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Deprecated
		@Override
		public Map<String, Object> selectRelation(Map<String, Object> inParam,
				IQueryFilter queryFilter) throws StrategyError {
			return rmRelationRel.selectRelation(queryFilter);
		}

		/**
		 * 查询关系(新)
		* @date: 2017-4-5 
		* @author: sunyuan
		* @title: selectRelation 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectRelation(Map<String, Object> inParam) throws StrategyError {
			IQueryFilter quertFilter = iBatisQueryFilter.getSelectRelationQueryFilter(inParam);
			return rmRelationRel.selectRelation(quertFilter);
		}
		
		/**
		 * 查询规则基本信息
		* @date: 2016-9-15 
		* @author: zhaoyue
		* @title: selectRuleInfo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectRuleInfo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			Map<String, Object> map = rmRuleInfo.select(queryFilter);
			return map;
		}
		
		/**
		 * 查询规则基本信息集合
		* @date: 2017-3-29 
		* @author: sunyuan
		* @title: selectRuleInfo 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectRuleInfoList(Map<String, Object> inParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectRuleInfoListQueryFilter(inParam);
			List<Map<String, Object>> ruleInfoList = rmRuleInfo.selectRuleInfoList(queryFilter);
			return ruleInfoList;
		}
		
		/**
		 * 根据id查询分组查询规则批次号
		* @date: 2016-12-21 
		* @author: zhangjj_crmpd
		* @title: selectRuleDetailBatchNoById 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectRuleDetailBatchNoById(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmRuleDetailInfo.selectRuleDetailBatchNoById(queryFilter);
		}
		
		/**
		 * 根据关系id查询规则详情
		* @date: 2016-12-21 
		* @author: zhangjj_crmpd
		* @title: selectRuleDetailByParentComponentId 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectRuleDetailByParentComponentId(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmRuleDetailInfo.selectRuleDetailByParentComponentId(queryFilter);
		}

		/**
		 *  查询规则明细信息
		* @date: 2016-9-15 
		* @author: zhaoyue
		* @title: selectRuleDetailList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Deprecated
		@Override
		public List<Map<String, Object>> selectRuleDetailList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			List<Map<String, Object>> list = rmRuleDetailInfo.select(queryFilter);
			return list;
		}
		
		/**
		 * 查询规则明细信息(新)
		* @date: 2017-3-29 
		* @author: sunyuan
		* @title: selectRuleDetailList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectRuleDetailList(Map<String, Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectRuleDetailQueryFilter(tempInParam);
			List<Map<String, Object>> list = rmRuleDetailInfo.select(queryFilter);
			return list;
		}
		
		/**
		 * 查询规则详细信息Id
		* @date: 2016-10-8 
		* @author: wangth
		* @Title: selectRuleDetailId 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectRuleDetailId(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			List<Map<String,Object>> list = rmRuleDetailInfo.selectRuleDetailId(queryFilter);
			return list;
		}
		
		/**
		 * 根据事件ID和营销案ID查询规则明细
		* @date: 2017-3-8 
		* @author: sunliang 
		* @title: selectRuleDetailsByEventIdAndMarketCaseId 
		* @param tempParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectRuleDetailsByEventIdAndMarketCaseId(
				Map<String, Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectRuleDetailsByEventIdAndMarketCaseIdQueryFilter(tempInParam);
			List<Map<String, Object>> list = rmRuleDetailInfo.selectRuleDetailsByEventIdAndMarketCaseId(queryFilter);
			return list;
		}

		/**
		 * 根据营销案Id查询全局规则详情
		* @date: 2016-11-8 
		* @author: zhangjj_crmpd
		* @title: selectWholeRuleDetailByMarketCaseId 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectWholeRuleDetailByMarketCaseId(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmRuleDetailInfo.selectWholeRuleDetailByMarketCaseId(queryFilter);
		}
        /** 
         * 根据push营销案id查询规则
	* @date: 2017-4-12 
	* @author: chenhao
	* @title: selectRuleDetailByMarketCaseId 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> selectRuleDetailByMarketCaseId(
			Map<String, Object> inParam, IQueryFilter queryFilter)
			throws StrategyError {
		return rmRuleDetailInfo.selectRuleDetailByMarketCaseId(queryFilter);
	}
		/**
		 * 查询已经生成的批量PUSH任务列表
		* @date: 2016-11-8 
		* @author: zhangqia
		* @title: selectWholeRuleDetailByMarketCaseId 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectWaitSendTaskControlList(Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmWaitSendTaskControlInfo.select(queryFilter);
		}

	}
	
	/**
	 * 短信码查询对象
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: ShortMessage 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ShortMessageSelector implements IShortMessageSelector{
		
		/**
		 * 短信对象
		 */
		protected IRDBMSDML.IRmShortMessageInfo rmShortMessageInfo;
		/**
		 * 短信推送流量
		 */
		protected IRDBMSDML.IRmShortMsgMoveTrafficInfo rmShortMsgMoveTrafficInfo;
		
		/**
		 * 
		* @date: 2016-10-31 
		* @author: fangyuan_crmpd
		* @title: setRmShortMsgMoveTrafficInfo 
		* @param rmShortMsgMoveTrafficInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmShortMsgMoveTrafficInfo(
				IRDBMSDML.IRmShortMsgMoveTrafficInfo rmShortMsgMoveTrafficInfo) {
			this.rmShortMsgMoveTrafficInfo = rmShortMsgMoveTrafficInfo;
		}

		/** 
		 * @date: 2016-11-1 
		 * @author: xiongxq
		 * @Title: setRmShortMessageInfo 
		 * @param rmShortMessageInfo the rmShortMessageInfo to set
		 * @version 1.0 
		 * @Description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmShortMessageInfo(
				IRDBMSDML.IRmShortMessageInfo rmShortMessageInfo) {
			this.rmShortMessageInfo = rmShortMessageInfo;
		}
		
		/**
		 * 根据工号查询该工号下面拥有的接入码列表 
		* @date: 2016-10-28 
		* @author: xiongxq
		* @Title: selectAccessCodeListByLoginNo 
		* @param inParam
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public List<Map<String, Object>> selectAccessCodeListByLoginNo (
				Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError {
			List<Map<String,Object>> outList = rmShortMessageInfo.selectAccessCodeByLoginNo(queryFilter);
			return outList;
		}

		/**
		 * 根据工号查询该工号下面未拥有的接入码列表  
		* @date: 2016-10-28 
		* @author: xiongxq
		* @Title: selectNotHasAccessCodeListByLoginNo 
		* @param inParam
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public List<Map<String, Object>> selectNotHasAccessCodeListByLoginNo(
				Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError {
			List<Map<String,Object>> outList = rmShortMessageInfo.selectNotHasAccessCodeByLoginNo(queryFilter);
			return outList;
		}

		/**
		 * 查询短信码列表
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: selectShortMessageAccessCodeList 
		* @param inParam
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectShortMessageAccessCodeList(
				Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError {
			return rmShortMessageInfo.select(queryFilter);
		}
		
		/**
		 * 根据日期查询短信推送流量
		* @date: 2016-10-30 
		* @author: fangyuan_crmpd
		* @title: selectShortMsgMoveTrafficByDate 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectShortMsgMoveTrafficByDate(
				Map<String, Object> inParam) throws StrategyError {
				return rmShortMsgMoveTrafficInfo.selectShortMsgMoveTrafficByDate(inParam);	
		}
		
		/**
		 * 根据营销案ID查询短信推送流量
		* @date: 2016-10-30 
		* @author: fangyuan_crmpd
		* @title: selectShortMsgMoveTrafficByMarketCaseId 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectShortMsgMoveTrafficByMarketCaseId(
				Map<String, Object> inParam) throws StrategyError {
			return rmShortMsgMoveTrafficInfo.selectShortMsgMoveTrafficByMarketCaseId(inParam);
		}
	}
	
	/**
	 * 数据统计查询对象
	* @date: 2016-12-20 
	* @author: sunliang 
	* @title: StatisticSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class StatisticSelector implements IStatisticSelector,Serializable {
		
		protected ICacheDML.IStatisticCache statisticCache;
        protected IRDBMSDML.IRmNoticeInfo rmNoticeInfo;
		
		public void setRmNoticeInfo(IRDBMSDML.IRmNoticeInfo rmNoticeInfo) {
			this.rmNoticeInfo = rmNoticeInfo;
		}
		
		public void setStatisticCache(ICacheDML.IStatisticCache statisticCache) {
			this.statisticCache = statisticCache;
		}
		
		/**
		 * 查询公告列表
		* @date: 2017-2-27 
		* @author: yexr
		* @title: selectNoticeList 
		* @param inParam
		* @param queryFilter
		* @param start
		* @param limit
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String, Object> selectNoticeList(Map<String, Object> inParam,IQueryFilter queryFilter,int start, int limit) throws StrategyError {
			return rmNoticeInfo.selectNoticeList(queryFilter,start,limit);
			
		}




		/**
		 * 
		* @date: 2016-12-20 
		* @author: sunliang 
		* @title: selectStatistic 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String selectStatistic(
				Map<String, Object> tempInParam) {
			String statisType = (String)tempInParam.get("statisType");
			String currentDate = (String)tempInParam.get("currentDate");
			String regionCode = (String)tempInParam.get("regionCode");
			String sceneType = (String)tempInParam.get("sceneType");
			String busiType = (String)tempInParam.get("busiType");
			String marketCaseId = (String)tempInParam.get("marketCaseId");
			
			log.debug("statisType", statisType);
			log.debug("currentDate", currentDate);
			log.debug("regionCode", regionCode);
			log.debug("sceneType", sceneType);
			log.debug("busiType", busiType);
			log.debug("marketCaseId", marketCaseId);
			
			String key = null;
			if(Const.STATISTIC_TYPE_REALCONTACT_DAY.equals(statisType) || Const.STATISTIC_TYPE_REALCONTACT_MONTH.equals(statisType)){
				key = Const.CACHE_DATATYPE_STATISTIC + statisType + Const.SEPARATOR_COLON + currentDate + Const.SEPARATOR_COLON + regionCode;
			}else if(Const.STATISTIC_TYPE_CHANNELRECOMMEND.equals(statisType) || Const.STATISTIC_TYPE_CHANNELREALCONTACT_DAY.equals(statisType) || Const.STATISTIC_TYPE_REALACCEPT_DAY.equals(statisType)){
				key = Const.CACHE_DATATYPE_STATISTIC + statisType + Const.SEPARATOR_COLON + sceneType + Const.SEPARATOR_COLON + currentDate + Const.SEPARATOR_COLON + regionCode;
			}else if(Const.STATISTIC_TYPE_MARKETCASERECOMMEND.equals(statisType) || Const.STATISTIC_TYPE_MARKETCASEACCEPT.equals(busiType)){
				key = Const.CACHE_DATATYPE_STATISTIC + statisType + Const.SEPARATOR_COLON + busiType + Const.SEPARATOR_COLON + currentDate + Const.SEPARATOR_COLON + regionCode;
			}else if(Const.STATISTIC_TYPE_CREATETASKCOUNT.equals(statisType)){
				
			}else if(Const.STATISTIC_TYPE_SENDTASKCOUNT.equals(statisType)){
				key = Const.CACHE_DATATYPE_STATISTIC + statisType + Const.SEPARATOR_COLON + marketCaseId + Const.SEPARATOR_COLON + currentDate;
			}
			
			String num = statisticCache.get(key);
			if(CommonUtils.objectIsNull(num)){
				num = "0";
			}
			
			return num;
		}
		
	}
	
	/**
	 * 系统处理查询操作接口
	* @date: 2016-11-14 
	* @author: zhangjj_crmpd
	* @title: SystemDealSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class SystemDealSelector implements ISystemDealSelector ,Serializable{

		protected IRDBMSDML.IRmShellProcessExecuteInfo rmShellProcessExecuteInfo;

		/**
		 * 
		* @date: 2016-11-14 
		* @author: zhangjj_crmpd
		* @title: setRmShellProcessExecuteInfo 
		* @param rmShellProcessExecuteInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmShellProcessExecuteInfo(
				IRDBMSDML.IRmShellProcessExecuteInfo rmShellProcessExecuteInfo) {
			this.rmShellProcessExecuteInfo = rmShellProcessExecuteInfo;
		}

		/**
		 * 根据Id查询执行数据
		* @date: 2017-4-22 
		* @author: yuanchun
		* @title: selectShellProcessExecuteById 
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectShellProcessExecuteById(
				IQueryFilter queryFilter) throws StrategyError {
			return rmShellProcessExecuteInfo.select(queryFilter);
		}
		
		
		/**
		 * 查询任务执行数据
		* @date: 2016-11-14 
		* @author: zhangjj_crmpd
		* @title: selectShellProcessExecuteList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectShellProcessExecuteList(
				Map<String, Object> tempInParam,IQueryFilter queryFilter) throws StrategyError {
			return rmShellProcessExecuteInfo.selectToday(queryFilter);
		}

	}
	

	
	/**
	 * 任务数据查询接口
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: ITaskSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class TaskSelector implements ITaskSelector, Serializable{

		protected IRDBMSDML.IRmChannelTaskInfo rmChannelTaskInfo;
		protected ISparkSQLDML.IRmChannelTaskInfoSpark rmChannelTaskInfoSpark;
		protected INosqlDML.IRmChannelTaskInfo rmChannelTaskInfoHbase;
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		protected IRDBMSDML.IRmTaskAdjustInfo rmTaskAdjustInfo;
		protected ICacheDML.IWaitSynChannelTaskCache waitSynChannelTaskCache;
		
		public void setRmChannelTaskInfo(IRDBMSDML.IRmChannelTaskInfo rmChannelTaskInfo) {
			this.rmChannelTaskInfo = rmChannelTaskInfo;
		}

		public void setRmChannelTaskInfoSpark(
				ISparkSQLDML.IRmChannelTaskInfoSpark rmChannelTaskInfoSpark) {
			this.rmChannelTaskInfoSpark = rmChannelTaskInfoSpark;
		}

		public void setRmChannelTaskInfoHbase(
				INosqlDML.IRmChannelTaskInfo rmChannelTaskInfoHbase) {
			this.rmChannelTaskInfoHbase = rmChannelTaskInfoHbase;
		}
		/**
		 * 
		* @date: 2017-1-9 
		* @author: zhangjj_crmpd
		* @title: setRmRelationRel 
		* @param rmRelationRel 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmRelationRel(IRDBMSDML.IRmRelationRel rmRelationRel) {
			this.rmRelationRel = rmRelationRel;
		}

		/**
		 * 
		* @date: 2016-12-22 
		* @author: zhangjj_crmpd
		* @title: setRmTaskAdjustInfo 
		* @param rmTaskAdjustInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmTaskAdjustInfo(IRDBMSDML.IRmTaskAdjustInfo rmTaskAdjustInfo) {
			this.rmTaskAdjustInfo = rmTaskAdjustInfo;
		}
		
		public void setWaitSynChannelTaskCache(
				ICacheDML.IWaitSynChannelTaskCache waitSynChannelTaskCache) {
			this.waitSynChannelTaskCache = waitSynChannelTaskCache;
		}
		

		/** 模糊查询渠道任务
		* @date: 2016-12-1 
		* @author: wangpei
		* @title: scanChannelTask 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public Map<String, Map<String, Map<String, String>>> scanChannelTask(
				Map<String, Object> tempInParam) throws StrategyError {
			return rmChannelTaskInfoHbase.scanChannelTask((String)tempInParam.get("startRow"), (String)tempInParam.get("stopRow"));
		}

		/** 查询渠道任务
		* @date: 2016-12-5 
		* @author: wangpei
		* @title: getChannelTask 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public Map<String, String> getChannelTask(Map<String, Object> tempInParam) throws StrategyError {
			String rowKey = hbaseRowKey.getChannelTaskRowkey(tempInParam);
			tempInParam.put(Const.NOSQL_ROWKEY, rowKey);
			return rmChannelTaskInfoHbase.select(tempInParam);
		}

		/** 
		* @date: 2016-12-19 
		* @author: wangpei
		* @title: getChannelTaskSynCache 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public String getChannelTaskSynCache() throws StrategyError {
			Map<String,Object> tempInParam = new HashMap<String, Object>();
			tempInParam.put("key", Const.CACHE_DATATYPE_MARKETCASE_CHANNELTASK_WAITSYN);
			tempInParam.put("direction", "");
			return waitSynChannelTaskCache.getAndRemove(tempInParam);
		}

		/**
		 * 查询渠道任务
		* @date: 2016-10-20 
		* @author: wangpei
		* @title: selectChannelTaskList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectChannelTaskList(
				Map<String, Object> tempInParam) throws StrategyError {
			return rmChannelTaskInfoSpark.selectChannelTaskList(tempInParam);
		}
		
		/**
		 * 分页查询渠道任务
		* @date: 2016-12-22 
		* @author: zhangjj_crmpd
		* @title: selectChannelTaskListByPage 
		* @param tempInParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectChannelTaskListByPage(
				Map<String, Object> tempInParam,IQueryFilter queryFilter) throws StrategyError {
			return rmChannelTaskInfo.selectTaskListByPage(tempInParam, queryFilter, Integer.parseInt(CommonUtils.toString(tempInParam.get("startNum"))),Integer.parseInt(CommonUtils.toString(tempInParam.get("limit"))));
		}
		
		/**
		 * 查询渠道任务数量
		* @date: 2016-12-22 
		* @author: zhangjj_crmpd
		* @title: selectChannelTaskListCount 
		* @param tempInParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectChannelTaskListCount(
				Map<String, Object> tempInParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmChannelTaskInfo.selectTaskListCount(tempInParam, queryFilter);
		}
		
		/**
		 * 从渠道任务中查询客户列表
		* @date: 2016-10-17 
		* @author: yangwl
		* @title: selecCustListFromChannelTask 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectCustListFromChannelTask(
				Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectCustListFromChannelTaskQueryFilter(inParam,tempInParam);
			return rmChannelTaskInfo.selectCustList(queryFilter);
		}
		
		/**
		 * 从渠道任务中查询营销案列表
		* @date: 2016-10-15 
		* @author: yangwl
		* @title: selecMarketCaseListFromChannelTask 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectMarketCaseListFromChannelTask(Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError{
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectMarketCaseListFromChannelTaskQueryFilter(inParam,tempInParam);
			return rmChannelTaskInfo.selectMarketCaseList(queryFilter);
		}
		
		/**
		 * 查询调配信息
		* @date: 2016-12-20 
		* @author: zhangjj_crmpd
		* @title: selectTaskAdjust 
		* @param tempInParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectTaskAdjust(Map<String, Object> tempInParam,IQueryFilter queryFilter) throws StrategyError {
			return rmTaskAdjustInfo.selectTaskAdjustInfo(queryFilter);
		}

		/**
		 * 查询调配信息与规则关系
		* @date: 2017-1-9 
		* @author: zhangjj_crmpd
		* @title: selectTaskAdjustAndRuleRelation 
		* @param tempInParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectTaskAdjustAndRuleRelation(Map<String, Object> tempInParam, IQueryFilter queryFilter)throws StrategyError {
			return rmRelationRel.select(queryFilter);
		}
		
		/**
		 * 根据参数查询任务调配信息
		* @date: 2017-1-9 
		* @author: zhangjj_crmpd
		* @title: selectTaskAdjustByParam 
		* @param tempInParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectTaskAdjustByParam(Map<String, Object> tempInParam, IQueryFilter queryFilter)throws StrategyError {
			return rmTaskAdjustInfo.selectTaskAdjustInfoByParam(queryFilter);
		}

		/**
		 * 根据负责人工号分组查询任务数
		* @date: 2017-1-11 
		* @author: tangaq
		* @title: selectTaskCountGroupByLoginNo 
		* @param tempInParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String,Object>> selectTaskCountGroupByLoginNo(Map<String, Object> tempInParam,IQueryFilter queryFilter) throws StrategyError{
			return rmChannelTaskInfo.selectTaskCountGroupByLoginNo(queryFilter);
		}

		/**
		 * 从渠道任务中查询任务列表
		* @date: 2016-10-17 
		* @author: yangwl
		* @title: selecTaskListFromChannelTask 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selecTaskListFromChannelTask(
				Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError {
			IQueryFilter queryFilter = iBatisQueryFilter.getSelecTaskListFromChannelTaskQueryFilter(inParam,tempInParam);
			return rmChannelTaskInfo.selectTaskList(queryFilter);
		}

		/** 查询待发送任务
		* @date: 2017-3-6 
		* @author: wangpei
		* @title: selectWaitSendChannelTaskList 
		* @param tempInParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public List<Map<String, Object>> selectWaitSendChannelTaskList(Map<String, Object> tempInParam)throws StrategyError {
			return rmChannelTaskInfo.selectWaitSendTaskList(new QueryFilter());
		}

	}
	
	/**
	 * 测试查询
	* @date: 2016-11-20 
	* @author: sunliang 
	* @title: TestSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class TestSelector implements ITestSelector{
		
		protected INosqlDML.IRmHbaseTestInfo rmHbaseTestInfoHbase;
		protected IHiveDML.IRmHiveTestInfoHive rmHiveTestInfoHive;
		protected IHiveDML.IRmHiveTestHbaseInfoHive rmHiveTestHbaseInfoHive;
		protected ISparkSQLDML.IRmHiveTestInfoSpark rmHiveTestInfoSpark;
		protected ISparkSQLDML.IRmHiveTestHbaseInfoSpark rmHiveTestHbaseInfoSpark;

		
		public void setRmHbaseTestInfoHbase(
				INosqlDML.IRmHbaseTestInfo rmHbaseTestInfoHbase) {
			this.rmHbaseTestInfoHbase = rmHbaseTestInfoHbase;
		}
		public void setRmHiveTestInfoHive(
				IHiveDML.IRmHiveTestInfoHive rmHiveTestInfoHive) {
			this.rmHiveTestInfoHive = rmHiveTestInfoHive;
		}
		
		public void setRmHiveTestHbaseInfoHive(
				IHiveDML.IRmHiveTestHbaseInfoHive rmHiveTestHbaseInfoHive) {
			this.rmHiveTestHbaseInfoHive = rmHiveTestHbaseInfoHive;
		}
		
		public void setRmHiveTestInfoSpark(
				ISparkSQLDML.IRmHiveTestInfoSpark rmHiveTestInfoSpark) {
			this.rmHiveTestInfoSpark = rmHiveTestInfoSpark;
		}
		
		public void setRmHiveTestHbaseInfoSpark(
				ISparkSQLDML.IRmHiveTestHbaseInfoSpark rmHiveTestHbaseInfoSpark) {
			this.rmHiveTestHbaseInfoSpark = rmHiveTestHbaseInfoSpark;
		}

		/**
		 * 查询hbase测试
		* @date: 2016-11-21 
		* @author: sunliang 
		* @title: selectHbaseTest 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, String> selectHbaseTest(
				Map<String, Object> tempInParam) throws StrategyError{
			Set<String> fields = new HashSet<String>();
			fields.add("test1");
			fields.add("test2");
			Map<String, String> ret = rmHbaseTestInfoHbase.select(tempInParam, fields);
			log.info("selectHbaseTest.ret", ret);
			return ret;
		}

		/**
		 * 查询hive测试
		* @date: 2016-11-21 
		* @author: sunliang 
		* @title: selectHiveTest 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectHiveTest(
				Map<String, Object> tempInParam) throws StrategyError{
			
			List<Map<String, Object>> hiveList = rmHiveTestInfoHive.select(tempInParam);
			log.info("selectHiveTest.hiveList", hiveList);
			List<Map<String, Object>> hiveHbaseList = rmHiveTestHbaseInfoHive.select(tempInParam);
			log.info("selectHiveTest.hiveHbaseList", hiveHbaseList);
			
			return hiveHbaseList;
		}

		/**
		 * 查询sparkSQL测试
		* @date: 2016-11-21 
		* @author: sunliang 
		* @title: selectSparkSQLTest 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectSparkSQLTest(
				Map<String, Object> tempInParam) throws StrategyError{
			
			List<Map<String, Object>> sparkList = rmHiveTestInfoSpark.select(tempInParam);
			log.info("selectSparkSQLTest.sparkList", sparkList);
			List<Map<String, Object>> sparkHbaseList = rmHiveTestHbaseInfoSpark.select(tempInParam);
			log.info("selectSparkSQLTest.sparkHbaseList", sparkHbaseList);
			
			return sparkHbaseList;
		}
		
	}
	
	/**
	 * 查询模板信息实现类
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: TemplateSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class TemplateSelector implements ITemplateSelector{
		
		protected IRDBMSDML.IRmTemplateInfo rmTemplateInfo;
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		
		/**
		 * 
		* @date: 2016-10-19 
		* @author: zhangjj_crmpd
		* @title: setRmTemplateInfo 
		* @param rmTemplateInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmTemplateInfo(IRDBMSDML.IRmTemplateInfo rmTemplateInfo) {
			this.rmTemplateInfo = rmTemplateInfo;
		}
		
		/**
		 * 
		* @date: 2016-11-11 
		* @author: tangaq
		* @title: setRmRelationRel 
		* @param rmRelationRel 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmRelationRel(IRDBMSDML.IRmRelationRel rmRelationRel) {
			this.rmRelationRel = rmRelationRel;
		}

		/**
		 * 查询模板列表
		* @date: 2016-10-19 
		* @author: zhangjj_crmpd
		* @title: selectTemplateList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectTemplateList(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmTemplateInfo.selectTemplateList(queryFilter);
		}

		/**
		  * 查询模板信息
		 * @date: 2016-10-19 
		 * @author: zhangjj_crmpd
		 * @title: selectTemplateInfo 
		 * @param inParam
		 * @param queryFilter
		 * @return
		 * @throws StrategyError 
		 * @exception: 
		 * @version: 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note:
		  */
		@Override
		public Map<String, Object> selectTemplateInfo(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			// TODO Auto-generated method stub
			return rmTemplateInfo.selectTemplateInfo(queryFilter);
		}

		/**
		 * 查询关系信息
		* @date: 2016-11-11 
		* @author: tangaq
		* @title: selectRelationInfo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectRelationInfo(
				Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			
			return rmRelationRel.selectRelation(queryFilter);
		}

	}

	/**
	 * 用户查询操作实现类
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: UserSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class UserSelector implements IUserSelector, Serializable{
		
		protected IRDBMSDML.ICommonInfo commonInfo;
		/**
		 * 异网号码池对象
		 */
		protected IRDBMSDML.IRmDifferentNetPhonePoolInfo rmDifferentNetPhonePoolInfo;
		/**
		 *灰名单对象
		 */
		protected IRDBMSDML.IRmGreyInfo rmGreyInfo;
		/**
		 *灰名单对象Hbase
		 */
		protected INosqlDML.IRmGreyInfo rmGreyInfoHbase;
		/**
		 * 用户办理营销案表
		 */
		protected INosqlDML.IRmUserAcceptMarketCaseInfo rmUserAcceptMarketCaseInfoHbase;
		/**
		 * 用户对象
		 */
		protected INosqlDML.IRmUserInfo rmUserInfoHbase;
		/**
		 * 用户资料对象
		 */
		protected IRDBMSDML.IRmUserInfo rmUserInfo;
		protected INosqlDML.IRmUserLabelInfo rmUserLabelInfoHbase;
		protected IRDBMSDML.IRmUserLabelTmp rmUserLabelTmp;
		/**
		 * 用户推荐控制表
		 */
		protected INosqlDML.IRmUserRecommendControlInfo rmUserRecommendControlInfoHbase;
		/**
		 * 用户关系
		 */
		protected INosqlDML.IRmUserRelInfo rmUserRelInfoHbase;
		/**
		 * 用户接触对象
		 */
		protected IRDBMSDML.IRmRecommendRecordInfo rmRecommendRecordInfo;
		/**
		 * 用户反馈对象
		 */
		protected IRDBMSDML.IRmReceiptRecordInfo  rmReceiptRecordInfo;
		/**
		 * 经分同步的用户标签表
		 */
		protected IRDBMSDML.IRmlabelArchivesTmp rmlabelArchivesTmp;
		
		/**
		 * 
		* @date: 2017-3-4 
		* @author: yuanchun
		* @title: setCommonInfo 
		* @param commonInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setCommonInfo(IRDBMSDML.ICommonInfo commonInfo) {
			this.commonInfo = commonInfo;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmDifferentNetPhonePoolInfo 
		 * @param rmDifferentNetPhonePoolInfo the rmDifferentNetPhonePoolInfo to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmDifferentNetPhonePoolInfo(
				IRDBMSDML.IRmDifferentNetPhonePoolInfo rmDifferentNetPhonePoolInfo) {
			this.rmDifferentNetPhonePoolInfo = rmDifferentNetPhonePoolInfo;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmGreyInfo 
		 * @param rmGreyInfo the rmGreyInfo to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmGreyInfo(IRDBMSDML.IRmGreyInfo rmGreyInfo) {
			this.rmGreyInfo = rmGreyInfo;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmGreyInfoHbase 
		 * @param rmGreyInfoHbase the rmGreyInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmGreyInfoHbase(INosqlDML.IRmGreyInfo rmGreyInfoHbase) {
			this.rmGreyInfoHbase = rmGreyInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmUserAcceptMarketCaseInfoHbase 
		 * @param rmUserAcceptMarketCaseInfoHbase the rmUserAcceptMarketCaseInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmUserAcceptMarketCaseInfoHbase(
				INosqlDML.IRmUserAcceptMarketCaseInfo rmUserAcceptMarketCaseInfoHbase) {
			this.rmUserAcceptMarketCaseInfoHbase = rmUserAcceptMarketCaseInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmUserInfoHbase 
		 * @param rmUserInfoHbase the rmUserInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmUserInfoHbase(INosqlDML.IRmUserInfo rmUserInfoHbase) {
			this.rmUserInfoHbase = rmUserInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmUserInfo 
		 * @param rmUserInfo the rmUserInfo to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmUserInfo(IRDBMSDML.IRmUserInfo rmUserInfo) {
			this.rmUserInfo = rmUserInfo;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmUserLabelInfoHbase 
		 * @param rmUserLabelInfoHbase the rmUserLabelInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmUserLabelInfoHbase(
				INosqlDML.IRmUserLabelInfo rmUserLabelInfoHbase) {
			this.rmUserLabelInfoHbase = rmUserLabelInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmUserLabelTmp 
		 * @param rmUserLabelTmp the rmUserLabelTmp to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmUserLabelTmp(IRDBMSDML.IRmUserLabelTmp rmUserLabelTmp) {
			this.rmUserLabelTmp = rmUserLabelTmp;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmUserRecommendControlInfoHbase 
		 * @param rmUserRecommendControlInfoHbase the rmUserRecommendControlInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		
		public void setRmUserRecommendControlInfoHbase(
				INosqlDML.IRmUserRecommendControlInfo rmUserRecommendControlInfoHbase) {
			this.rmUserRecommendControlInfoHbase = rmUserRecommendControlInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmUserRelInfoHbase 
		 * @param rmUserRelInfoHbase the rmUserRelInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmUserRelInfoHbase(INosqlDML.IRmUserRelInfo rmUserRelInfoHbase) {
			this.rmUserRelInfoHbase = rmUserRelInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmRecommendRecordInfo 
		 * @param rmRecommendRecordInfo the rmRecommendRecordInfo to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmRecommendRecordInfo(
				IRDBMSDML.IRmRecommendRecordInfo rmRecommendRecordInfo) {
			this.rmRecommendRecordInfo = rmRecommendRecordInfo;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmReceiptRecordInfo 
		 * @param rmReceiptRecordInfo the rmReceiptRecordInfo to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmReceiptRecordInfo(
				IRDBMSDML.IRmReceiptRecordInfo rmReceiptRecordInfo) {
			this.rmReceiptRecordInfo = rmReceiptRecordInfo;
		}

		/**
		* @date: 2017-2-23 
		* @author: yuanchun
		* @title: setRmlabelArchivesTmp 
		* @param rmlabelArchivesTmp 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmlabelArchivesTmp(
				IRDBMSDML.IRmlabelArchivesTmp rmlabelArchivesTmp) {
			this.rmlabelArchivesTmp = rmlabelArchivesTmp;
		}
		
		/**
		 * 查询异网号码池列表   
		* @date: 2016-10-30 
		* @author: xiongxq
		* @Title: selectDifferentNetPhonePoolList 
		* @param inParam
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public List<Map<String, Object>> selectDifferentNetPhonePoolList(
				Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError {
			return rmDifferentNetPhonePoolInfo.select(queryFilter);	
		}
		
		/**
		 * nosql中查询灰名单信息
		* @date: 2016-11-16 
		* @author: yangwl
		* @title: selectGreyInfoByRowKey 
		* @param tempInParam
		* @param fields
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String,Object> selectGreyInfoByRowKey(Map<String,Object> tempInParam, Set<String> fields){
			String rowKey = hbaseRowKey.getGreyRowKey(tempInParam);
			tempInParam.put(Const.NOSQL_ROWKEY, rowKey);
			return rmGreyInfoHbase.select(tempInParam, fields);
		}
		
		/**
		 * 查询灰名单表 
		* @date: 2016-10-19 
		* @author: xiongxq
		* @Title: selectGreyList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public List<Map<String, Object>> selectGreyList(Map<String, Object> inParam,
				IQueryFilter queryFilter) throws StrategyError {
			return rmGreyInfo.select(queryFilter);
		}
		/**
		 * 查询灰名单表 
		* @date: 2017-03-14
		* @author: chenhao
		* @Title: selectGreyListForPage 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public Map<String, Object> selectGreyListForPage(Map<String, Object> inParam) 
				throws StrategyError{
			int start = Integer.valueOf((inParam.get("currentPageCode")==null||inParam.get("currentPageCode")=="")?"1":(String)inParam.get("currentPageCode"));
			int	limit = Integer.valueOf((inParam.get("perRecordCount")==null||inParam.get("currentPageCode")=="")?"10":(String)inParam.get("perRecordCount"));
			IQueryFilter queryFilter = iBatisQueryFilter.getSelectGreyListQueryFilter(inParam);
			Map<String,Object> greyMap = rmGreyInfo.selectForPage(queryFilter, start, limit);
			greyMap.put("currentPageCode", start+"");
			greyMap.put("perRecordCount", limit+"");
			return greyMap;	
		}
		
		/**
		 * 根据serviceNo在用户关系表中查询idNo
		* @date: 2016-11-14 
		* @author: yangwl
		* @title: selectIdNoByServiceNo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String selectIdNoByServiceNo(String serviceNo)
				throws StrategyError {
			return rmUserRelInfoHbase.getIdNoByServiceNo(serviceNo);
		}
		
		/**
		 * 查询用户办理过互斥营销案信息
		* @date: 2016-11-16 
		* @author: yangwl
		* @title: selectUserAcceptMarketCaseByRowKey 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String,Object> selectUserAcceptMarketCaseByRowKey(Map<String,Object> tempInParam){
			String rowKey = hbaseRowKey.getUserAcceptMarketCaseRowkey(tempInParam);
			tempInParam.put(Const.NOSQL_ROWKEY, rowKey);
			return rmUserAcceptMarketCaseInfoHbase.select(tempInParam,new HashSet<String>());
		}
		
		/**  查询用户资料
		* @date: 2016-11-14 
		* @author: wangpei
		* @title: selectUserInfoByIdNo 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public Map<String,String> selectUserInfoByIdNo(Map<String,Object> tempInParam){
			Map<String,String> userInfoMap = rmUserInfoHbase.getUserInfoByIdNo((String)tempInParam.get("idNo"));
			if(CommonUtils.objectIsNull(userInfoMap)){
				userInfoMap = new HashMap<String,String>();
			}
			
			return userInfoMap;
		}
		
		/**
		 * 查询用户列表
		* @date: 2016-12-5 
		* @author: zhangjj_crmpd
		* @title: selectUserInfoList 
		* @param inParam
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectUserInfoList(Map<String,Object> inParam,IQueryFilter queryFilter){
			return  rmUserInfo.select(queryFilter);
		}
		
		/**
		 * 查询用户资料列表
		* @date: 2016-11-11 
		* @author: fangyuan_crmpd
		* @title: selectUserDataList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String, Object> selectUserDataList(Map<String, Object> inParam,IQueryFilter queryFilter,int start, int limit) throws StrategyError {
			return rmUserInfo.selectForPage(queryFilter,start,limit);
			
		}

		/**
		 * 查询用户标签数据
		* @date: 2016-10-18 
		* @author: sunliang 
		* @title: selectUserLabelByIdNo 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, String> selectUserLabelByIdNo(Map<String,Object> tempInParam) throws StrategyError {
			
			Set<String> fields = new HashSet<String>();
			for(String field : Const.QUERY_USER_LABEL_ITEM_BATCHPUSH){
				fields.add(field);
			}
			
			Map<String,String> userLabelMap = rmUserLabelInfoHbase.getUserLabelByIdNo((String)tempInParam.get("idNo"), fields);
			if(CommonUtils.objectIsNull(userLabelMap)){
				userLabelMap = new HashMap<String,String>();
			}
			
			return userLabelMap;
		}
		
		/**
		 * 查询用户标签列表
		* @date: 2017-2-23 
		* @author: yuanchun
		* @title: selectUserLabelList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		   public List<Map<String,Object>> selectUserLabelForPage(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
			   return rmlabelArchivesTmp.selectUserLabel(inParam,queryFilter);
		   }
		
		/**
		 * 查询用户标签列表
		* @date: 2016-10-19 
		* @author: tangaq
		* @title: selectUserLabelList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
	   @Override
	   public List<Map<String,Object>> selectUserLabelList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		   return rmUserLabelTmp.selectUserLabel(queryFilter);
	   }

		 /**
		 * 查询用户标签列表(新)
		* @date: 2017-2-8 
		* @author: sunyuan
		* @title: selectUserLabelList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
	   public List<Map<String,Object>> selectUserLabelList(Map<String, Object> tempInParam) throws StrategyError {
		   IQueryFilter queryFilter = iBatisQueryFilter.getSelectUserLabelListQueryFilter(tempInParam);
		   return rmUserLabelTmp.selectUserLabel(queryFilter);
	   }
	   
	   /**
	    * 查询用户标签列表(直接分页不加入缓存)
	   * @date: 2017-3-14 
	   * @author: zhangwie_crmpd_cmi_ah
	   * @title: selectProductListForPage 
	   * @param inParam
	   * @return
	   * @throws StrategyError 
	   * @exception: 
	   * @version: 1.0 
	   * @description: 
	   * update_version: update_date: update_author: update_note:
	    */
	   public Map<String, Object> selectUserLabelForPage(Map<String, Object> inParam) throws StrategyError{
		   IQueryFilter queryFilter = iBatisQueryFilter.getUserLabelForPageQueryFilter(inParam); 
		   int start = Integer.valueOf(inParam.get("currentPageCode")==null?"1":(String)inParam.get("currentPageCode")); 
		   int	limit = Integer.valueOf(inParam.get("perRecordCount")==null?"10":(String)inParam.get("perRecordCount")); 
		   Map<String,Object> labelListInfo = new HashMap<String, Object>(); 
		   Map<String, Object> userLabelListInfo = new HashMap<String, Object>(); 
		   List<Map<String,Object>> tempLabelList = new ArrayList<Map<String,Object>>(); 
		   //客户标签管理标志 
		   String queryLabelArchivesFlag = (String) inParam.get("queryLabelArchivesFlag"); 
		   if (CommonUtils.objectIsNull(queryLabelArchivesFlag)) { 
		   userLabelListInfo = rmUserLabelTmp.selectForPage(queryFilter, start, limit); 
		   }else{ 
		   userLabelListInfo = rmlabelArchivesTmp.selectUserLabel(queryFilter, start, limit); 
		   } 
		   tempLabelList = (List<Map<String, Object>>) userLabelListInfo.get("result"); 
		   String totalRecordCount = userLabelListInfo.get("sum") == null?"0":userLabelListInfo.get("sum")+""; 
		   labelListInfo.put("tempLableList",tempLabelList); 
		   labelListInfo.put("queryLabelArchivesFlag",queryLabelArchivesFlag); 
		   labelListInfo.put("totalRecordCount",totalRecordCount); 
		   labelListInfo.put("currentPageCode", start+""); 
		   labelListInfo.put("perRecordCount", limit+""); 
		   return labelListInfo; 
		}

		/**
		 * 根据phoneNo查询用户标签数据
		* @date: 2016-10-18 
		* @author: sunliang 
		* @title: selectUserLabelByPhoneNo 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, String> selectUserLabelByPhoneNo(
				Map<String, Object> tempInParam) throws StrategyError {
			//先通过转换表将IDNO查出来
			//Map<String,String> userLabelMap = rmUserLabelInfo.getUserLabelByPhoneNo((String)tempInParam.get("phoneNo"), fields);
			Map<String,String> userLabelMap = rmUserLabelInfoHbase.getUserLabelByIdNo((String)tempInParam.get("idNo"), (Set<String>)tempInParam.get("fields"));
			return userLabelMap;
		}
		
		/**
		 * 根据rowkey查用户推荐控制信息
		* @date: 2016-11-15 
		* @author: yangwl
		* @title: selectUserRecommendControlByRowKey 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectUserRecommendControlByRowKey(Map<String, Object> tempInParam, Set<String> fields){
			String rowKey = hbaseRowKey.getUserRecommendControlByBatchNoRowkey(tempInParam);
			tempInParam.put(Const.NOSQL_ROWKEY, rowKey);
			return rmUserRecommendControlInfoHbase.select(tempInParam, fields);
		}
		
		/** 根据rowkey查用户渠道推荐控制信息
		* @date: 2016-12-25 
		* @author: wangpei
		* @title: selectUserRecommendControlByChannel 
		* @param tempInParam
		* @param fields
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public Map<String, Object> selectUserRecommendControlByChannel(Map<String, Object> tempInParam, Set<String> fields){
			String rowKey = hbaseRowKey.getUserRecommendControlByChannelRowkey(tempInParam);
			tempInParam.put(Const.NOSQL_ROWKEY, rowKey);
			return rmUserRecommendControlInfoHbase.select(tempInParam, fields);
		}
		
		/**
		 * 查询用户回单反馈表
		* @date: 2017-1-9 
		* @author: liuqi
		* @title: selectUserReceiptRecordList 
		* @param inParam
		* @param queryFilter
		* @param start
		* @param limit
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectUserReceiptRecordList(Map<String, Object> inParam, IQueryFilter queryFilter,int start, int limit) throws StrategyError {
			return rmReceiptRecordInfo.select(inParam,queryFilter,start,limit);
		}
		
		/**
		 * 查询用户接触信息
		* @date: 2017-1-6 
		* @author: liuqi
		* @title: selectUserTouchViewList 
		* @param inParam
		* @param queryFilter
		* @param start
		* @param limit
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectUserTouchViewList(Map<String, Object> inParam, IQueryFilter queryFilter,int start, int limit) throws StrategyError {
			return rmRecommendRecordInfo.select(inParam,queryFilter,start,limit);
	
		}

	}
	
	/**
	 * 作业配置查询操作
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: WorkConfigSelector 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class WorkConfigSelector implements IWorkConfigSelector{
		
		protected IRDBMSDML.IRmWorkCofigInfo rmWorkCofigInfo;
		
		public void setRmWorkCofigInfo(IRDBMSDML.IRmWorkCofigInfo rmWorkCofigInfo) {
			this.rmWorkCofigInfo = rmWorkCofigInfo;
		}
		
		/**
		 * 查询作业配置操作
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: selectWorkConfigList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectWorkConfigList(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmWorkCofigInfo.select(queryFilter);
		}
	}
	/**
	 * 调查问卷查询
	* @date: 2016-12-12 
	* @author: zhangqia
	* @Title: QuestionNaireSelector 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class QuestionNaireSelector implements IQuestionNaireSelector{
		
		protected IRDBMSDML.IRmQuestionNaireInfo rmQuestionNaireInfo;
		protected ICacheDML.IMarketCaseQuestionCache marketCaseQuestionCache;
		
		public void setRmQuestionNaireInfo(IRDBMSDML.IRmQuestionNaireInfo rmQuestionNaireInfo) {
			this.rmQuestionNaireInfo = rmQuestionNaireInfo;
		}
		public void setMarketCaseQuestionCache(
				ICacheDML.IMarketCaseQuestionCache marketCaseQuestionCache) {
			this.marketCaseQuestionCache = marketCaseQuestionCache;
		}
		/**
		 * 查询调查问卷操作
		* @date: 2016-12-12 
		* @author: zhangqia
		* @Title: selectQuestionNaireList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectQuestionNaireById(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmQuestionNaireInfo.select(queryFilter);
		}
		/**
		 * 查询调查问卷缓存中的关联问卷ID
		* @date: 2016-12-12 
		* @author: zhangqia
		* @Title: selectQuestionNaireList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String, Object> selectQuestionNaireFromCache()
				throws StrategyError {
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_QUESTION);
			return marketCaseQuestionCache.get(tempParam);
		}
		/**
		 * 查询问卷调查列表
		* @date: 2016-12-21 
		* @author: yuanliang
		* @title: selectQuestionNaireList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectQuestionNaireList(
				Map<String, Object> inParam, IQueryFilter queryFilter)
				throws StrategyError {
			return rmQuestionNaireInfo.selectQuestionNaireList(queryFilter);
		}

		/**
		 * 查询营销案对应的问卷调查列表信息
		* @date: 2016-12-21 
		* @author: yuanliang
		* @title: selectMarketCaseAndContent 
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public List<Map<String, Object>> selectMarketCaseAndContentList(
				IQueryFilter queryFilter) throws StrategyError {
			return rmQuestionNaireInfo.selectMarketCaseAndContentList(queryFilter);
		}
	} 
	
}

