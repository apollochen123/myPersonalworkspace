package com.sitech.strategy.persist.capacity.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.pojo.impl.ResultItemPojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.cache.ICacheKey;
import com.sitech.strategy.common.pojo.inter.hbase.IHbaseQualifier;
import com.sitech.strategy.common.pojo.inter.hbase.IHbaseRowKey;
import com.sitech.strategy.common.pojo.inter.rdbms.IIBatisFields;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.base.BaseProxyClass;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;

/**
 * 数据插入器
* @date: 2016-10-1 
* @author: zhaoyue
* @title: ProxyDataInsertor 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProxyDataInsertor extends BaseProxyClass implements IDataInsertor, Serializable{
	
	/**
	 * cacheKey
	 */
	protected ICacheKey cacheKey;
	/**
	 * hbaseQualifier
	 */
	protected IHbaseQualifier hbaseQualifier;
	/**
	 * hbaseRowKey
	 */
	protected IHbaseRowKey hbaseRowKey;
	/**
	 * iBatisFields
	 */
	protected IIBatisFields iBatisFields;
	
	/**
	 * 
	* @date: 2017-1-16 
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
	 * @date: 2017-1-16 
	 * @author: wangpei
	 * @title: setHbaseQualifier 
	 * @param hbaseQualifier the hbaseQualifier to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setHbaseQualifier(IHbaseQualifier hbaseQualifier) {
		this.hbaseQualifier = hbaseQualifier;
	}
	
	/** 
	 * @date: 2017-1-16 
	 * @author: wangpei
	 * @title: setHbaseRowKey 
	 * @param hbaseRowKey the hbaseRowKey to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setHbaseRowKey(IHbaseRowKey hbaseRowKey) {
		this.hbaseRowKey = hbaseRowKey;
	}

	/** 
	* @date: 2017-2-27 
	* @author: wangpei
	* @title: setiBatisFields 
	* @param iBatisFields 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setiBatisFields(IIBatisFields iBatisFields) {
		this.iBatisFields = iBatisFields;
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
	public class ActDemandInsertor implements IActDemandInsertor{

		protected IRDBMSDML.IRmActDemandInfo rmActDemandInfo;
		
		public void setRmActDemandInfo(IRDBMSDML.IRmActDemandInfo rmActDemandInfo) {
			this.rmActDemandInfo = rmActDemandInfo;
		}

		/**
		 * 活动需求插入接口
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
		public void insert(Map<String, Object> inParam,
				Map<String, Object> tempInParam) throws StrategyError {
			rmActDemandInfo.insert(tempInParam);
		}
	}
	
	/**
	 * 附件数据插入接口
	* @date: 2016-10-1 
	* @author: wangth
	* @title: AttachInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class AttachInsertor implements IAttachInsertor,Serializable{
		
		protected IRDBMSDML.IRmAttachInfo rmAttachInfo;
		
		public void setRmAttachInfo(IRDBMSDML.IRmAttachInfo rmAttachInfo) {
			this.rmAttachInfo = rmAttachInfo;
		}

		/**
		 * 批量添加附件
		* @date: 2016-10-20 
		* @author: wangth
		* @Title: insertBatchAttachs 
		* @param list 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertBatchAttachs(List<Map<String, Object>> list) {
			rmAttachInfo.insertBatchAttach(list);
		}
		
		/**
		 * 插入附件到附件表
		* @date: 2016-10-1 
		* @author: wangth
		* @title: insertAttachs 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertAttachs(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			rmAttachInfo.insertSingleAttach(tempInParam);
		}
		
		/**
		 * 插入图片到附件表
		* @date: 2016-10-1 
		* @author: wangth
		* @title: insertAttachsPicture 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertAttachsPicture(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			// TODO Auto-generated method stub
		}
	}
	
	/**
	 * 插入审批记录实现类
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: AuditInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */ 
	public class AuditInsertor implements IAuditInsertor, Serializable{
		protected IRDBMSDML.IRmAuditRecordInfo rmAuditRecordInfo;
		protected IRDBMSDML.IRmAuditNoInfo rmAuditNoInfo;
		
		public void setRmAuditRecordInfo(IRDBMSDML.IRmAuditRecordInfo rmAuditRecordInfo) {
			this.rmAuditRecordInfo = rmAuditRecordInfo;
		}
		
		public void setRmAuditNoInfo(IRDBMSDML.IRmAuditNoInfo rmAuditNoInfo) {
			this.rmAuditNoInfo = rmAuditNoInfo;
		}


		/**
		 * 插入审批记录
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertAuditRecord 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertAuditRecord(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			rmAuditRecordInfo.insert(tempInParam);
		}
		
		/**
		 * 插入审批工号
		* @date: 2016-10-10 
		* @author: wangth
		* @Title: insertAuditNo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertAuditNo(Map<String, Object> inParam,
				Map<String, Object> tempInParam) throws StrategyError {
			rmAuditNoInfo.inser(tempInParam);
			
		}
	}
	
	/**
	 * 渠道数据插入操作接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: ChannelInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ChannelInsertor implements IChannelInsertor, Serializable{
		
		protected ICacheDML.IChannelShowNumCache channelShowNumCache;
		protected IRDBMSDML.IRmChannelInfo rmChannelInfo;
		protected IRDBMSDML.IRmAttributeInfo rmAttributeInfo;
		
		public void setChannelShowNumCache(
				ICacheDML.IChannelShowNumCache channelShowNumCache) {
			this.channelShowNumCache = channelShowNumCache;
		}

		public void setRmChannelInfo(IRDBMSDML.IRmChannelInfo rmChannelInfo) {
			this.rmChannelInfo = rmChannelInfo;
		}
		
		public void setRmAttributeInfo(IRDBMSDML.IRmAttributeInfo rmAttributeInfo) {
			this.rmAttributeInfo = rmAttributeInfo;
		}


		/**
		 * 插入渠道信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertChannelInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertChannelInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			rmChannelInfo.insert(tempInParam);
		}
		
		/**
		 * 插入渠道展示数量到缓存
		* @date: 2016-11-28 
		* @author: yangwl
		* @title: insertChannelShowNumToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertChannelShowNumToCache(Map<String,Object> tempInParam) throws StrategyError {
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_CHANNEL_SHOWNUM + tempInParam.get("channelId"));
			tempParam.put(Const.CACHE_VALUE, tempInParam.get("channelShowNum"));
			log.debug("===insertChannelShowNumToCache===", tempParam);
			channelShowNumCache.add(tempParam);
		}
	}
	
	/**
	 * 渠道显示数据插入操作
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: ChannelShowInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ChannelShowInsertor implements IChannelShowInsertor{
		
		/**
		 * 渠道显示
		 */
		protected IRDBMSDML.IRmChannelShowInfo rmChannelShowInfo;
		
		/**
		 * 
		* @date: 2016-10-18 
		* @author: fangyuan_crmpd
		* @title: setRmChannelShowInfo 
		* @param rmChannelShowInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmChannelShowInfo(IRDBMSDML.IRmChannelShowInfo rmChannelShowInfo) {
			this.rmChannelShowInfo = rmChannelShowInfo;
		}

		/**
		 * 插入渠道显示数据
		* @date: 2016-10-18 
		* @author: fangyuan_crmpd
		* @title: insertChannelShowInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertChannelShowInfo(Map<String, Object> inParam,
				Map<String, Object> tempInParam) throws StrategyError {
			rmChannelShowInfo.insert(tempInParam);
		}
		
	}
	
	/**
	 * 公共数据插入操作接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: CommonInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class CommonInsertor implements ICommonInsertor{
		
		protected ICacheDML.IResultListCache resultListCache;

		public void setResultListCache(ICacheDML.IResultListCache resultListCache) {
			this.resultListCache = resultListCache;
		}

		/**
		 * 加载查询结果列表到缓存
		* @date: 2017-1-16 
		* @author: sunliang 
		* @title: addResultListToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addResultListToCache(Map<String, Object> tempInParam) throws StrategyError {
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_RESULTLIST + (String)tempInParam.get("queryId"));
			tempParam.put(Const.CACHE_VALUE, (List<ResultItemPojo>)tempInParam.get("resultItemList"));
			tempParam.put(Const.CACHE_DIRECTION, Const.CACHE_RESTORE_DIRECTION_RIGHT);
			
			resultListCache.add(tempParam);
		}

	}
	
	/**
	 * 配置插入操作实现类
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: ConfigInsertor 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ConfigInsertor implements IConfigInsertor{
		
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
		 * 保存选项信息
		* @date: 2016-10-25 
		* @author: xiongxq
		* @Title: insertOptionInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertOptionInfo(Map<String, Object> inParam) throws StrategyError {
			inParam.put("serialId", SequenceUtil.getSequence());
			rmCodeNameDict.insert(inParam);
		}
	}
	
	/**
	 * 保存内容数据实现类
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: ContentInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ContentInsertor implements IContentInsertor, Serializable{
		
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
		 * 插入内容信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertContentInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertContentInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			rmContentInfo.insert(tempInParam);
		}
		
		/**
		 * 插入内容详细信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertContentDetailInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertContentDetailInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			rmContentDetailInfo.insert(tempInParam);
		}

		/** 插入关系
		* @date: 2016-10-18 
		* @author: wangpei
		* @title: insertRelation 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		public void insertRelation(Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError {
			rmRelationRel.insert(tempInParam);
		}
	}
	
	/**
	 * 反馈数据插入接口
	* @date: 2016-10-20 
	* @author: sunliang 
	* @title: CoupleBackInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class CoupleBackInsertor implements ICoupleBackInsertor,Serializable{
		
		private static final long serialVersionUID = -7937546846901866596L;
		protected ICacheDML.IMarketCaseRecommonedCloseCache marketCaseRecommonedCloseCache;
		protected INosqlDML.IRmAcceptRecordInfo rmAcceptRecordInfo;
		protected INosqlDML.IRmChannelCallContactInfo rmChannelCallContactInfo;
		protected INosqlDML.IRmChannelSMSContactInfo rmChannelSMSContactInfo;
		protected INosqlDML.IRmClickRecordInfo rmClickRecordInfoHbase;
		protected INosqlDML.IRmContactRecordInfo rmContactRecordInfoHbase;
		protected INosqlDML.IRmPushArriveInfo rmPushArriveInfoHbase;
		protected INosqlDML.IRmReceiptRecordInfo rmReceiptRecordInfoHbase;
		protected INosqlDML.IRmRecommendCloseInfo rmRecommendCloseInfoHbase;
		protected INosqlDML.IRmRecommendRecordInfo rmRecommendRecordInfoHbase;
		protected INosqlDML.IRmSMSAcceptRecordInfo rmSMSAcceptRecordInfoHbase;
		protected INosqlDML.IRmSMSPullInfo rmSMSPullInfoHbase;
		protected INosqlDML.IRmUserAcceptMarketCaseInfo rmUserAcceptMarketCaseInfo;
		
		/**
		 * 
		* @date: 2017-4-8 
		* @author: zhangyw_crmpd
		* @title: setRmUserAcceptMarketCaseInfo 
		* @param rmUserAcceptMarketCaseInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmUserAcceptMarketCaseInfo(
				INosqlDML.IRmUserAcceptMarketCaseInfo rmUserAcceptMarketCaseInfo) {
			this.rmUserAcceptMarketCaseInfo = rmUserAcceptMarketCaseInfo;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setMarketCaseRecommonedCloseCache 
		 * @param marketCaseRecommonedCloseCache the marketCaseRecommonedCloseCache to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setMarketCaseRecommonedCloseCache(
				ICacheDML.IMarketCaseRecommonedCloseCache marketCaseRecommonedCloseCache) {
			this.marketCaseRecommonedCloseCache = marketCaseRecommonedCloseCache;
		}
		
        /**
         * 
        * @date: 2017-2-15 
        * @author: tangaq
        * @title: setRmAcceptRecordInfo 
        * @param rmAcceptRecordInfo 
        * @exception: 
        * @version: 1.0 
        * @description: 
        * update_version: update_date: update_author: update_note:
         */
		public void setRmAcceptRecordInfo(
				INosqlDML.IRmAcceptRecordInfo rmAcceptRecordInfo) {
			this.rmAcceptRecordInfo = rmAcceptRecordInfo;
		}

        /**
         * 
        * @date: 2017-2-22 
        * @author: tangaq
        * @title: setRmChannelCallContactInfo 
        * @param rmChannelCallContactInfo 
        * @exception: 
        * @version: 1.0 
        * @description: 
        * update_version: update_date: update_author: update_note:
         */
		public void setRmChannelCallContactInfo(
				INosqlDML.IRmChannelCallContactInfo rmChannelCallContactInfo) {
			this.rmChannelCallContactInfo = rmChannelCallContactInfo;
		}

		/**
		 * 
		* @date: 2017-2-22 
		* @author: tangaq
		* @title: setRmChannelSMSContactInfo 
		* @param rmChannelSMSContactInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmChannelSMSContactInfo(
				INosqlDML.IRmChannelSMSContactInfo rmChannelSMSContactInfo) {
			this.rmChannelSMSContactInfo = rmChannelSMSContactInfo;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmClickRecordInfoHbase 
		 * @param rmClickRecordInfoHbase the rmClickRecordInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmClickRecordInfoHbase(
				INosqlDML.IRmClickRecordInfo rmClickRecordInfoHbase) {
			this.rmClickRecordInfoHbase = rmClickRecordInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmContactRecordInfoHbase 
		 * @param rmContactRecordInfoHbase the rmContactRecordInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmContactRecordInfoHbase(
				INosqlDML.IRmContactRecordInfo rmContactRecordInfoHbase) {
			this.rmContactRecordInfoHbase = rmContactRecordInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmPushArriveInfoHbase 
		 * @param rmPushArriveInfoHbase the rmPushArriveInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmPushArriveInfoHbase(
				INosqlDML.IRmPushArriveInfo rmPushArriveInfoHbase) {
			this.rmPushArriveInfoHbase = rmPushArriveInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmReceiptRecordInfoHbase 
		 * @param rmReceiptRecordInfoHbase the rmReceiptRecordInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmReceiptRecordInfoHbase(
				INosqlDML.IRmReceiptRecordInfo rmReceiptRecordInfoHbase) {
			this.rmReceiptRecordInfoHbase = rmReceiptRecordInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmRecommendCloseInfoHbase 
		 * @param rmRecommendCloseInfoHbase the rmRecommendCloseInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmRecommendCloseInfoHbase(
				INosqlDML.IRmRecommendCloseInfo rmRecommendCloseInfoHbase) {
			this.rmRecommendCloseInfoHbase = rmRecommendCloseInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmRecommendRecordInfoHbase 
		 * @param rmRecommendRecordInfoHbase the rmRecommendRecordInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmRecommendRecordInfoHbase(
				INosqlDML.IRmRecommendRecordInfo rmRecommendRecordInfoHbase) {
			this.rmRecommendRecordInfoHbase = rmRecommendRecordInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmSMSAcceptRecordInfoHbase 
		 * @param rmSMSAcceptRecordInfoHbase the rmSMSAcceptRecordInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmSMSAcceptRecordInfoHbase(
				INosqlDML.IRmSMSAcceptRecordInfo rmSMSAcceptRecordInfoHbase) {
			this.rmSMSAcceptRecordInfoHbase = rmSMSAcceptRecordInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmSMSPullInfoHbase 
		 * @param rmSMSPullInfoHbase the rmSMSPullInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmSMSPullInfoHbase(INosqlDML.IRmSMSPullInfo rmSMSPullInfoHbase) {
			this.rmSMSPullInfoHbase = rmSMSPullInfoHbase;
		}

		/** 加载推荐关闭至缓存
		* @date: 2016-11-30 
		* @author: wangpei
		* @title: addRecommonedCloseToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void addRecommonedCloseToCache(Map<String, Object> tempInParam)
				throws StrategyError {
			
			Set<String> closeSet = (Set<String>)tempInParam.get("closeSet");
			List<String> colseList = new ArrayList<String>();
			
			if(!CommonUtils.objectIsNull(closeSet)){
				for(String str : closeSet){
					colseList.add(str);
				}
			}
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_RECOMMONEDCLOSE);
			tempParam.put(Const.CACHE_DIRECTION, Const.CACHE_RESTORE_DIRECTION_LEFT);
			tempParam.put(Const.CACHE_VALUE, colseList);
			
			marketCaseRecommonedCloseCache.add(tempParam);
		}
		
		/**
		 * 插入受理记录
		* @date: 2017-2-14 
		* @author: yexr
		* @title: insertAcceptRecordInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertAcceptRecordInfo(Map<String, Object> inParam,
				Map<String, String> tempInParam) throws StrategyError {
			String rowKey = hbaseRowKey.getAcceptRecordRowkey(inParam);
		
			tempInParam.put(Const.NOSQL_ROWKEY, rowKey);
			log.info("insertAcceptRecordInfo", inParam);
			rmAcceptRecordInfo.insert(inParam,tempInParam);
			
		}
		
		/**
		 * 插入渠道外呼接触信息
		* @date: 2017-2-21 
		* @author: tangaq
		* @title: insertChannelCallContactInfo 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertChannelCallContactInfo(Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String,String> param = new HashMap<String, String>();
			for(Map.Entry<String, Object> me : tempInParam.entrySet()){
				param.put(me.getKey(), me.getValue()+"");
			}
			String rowKey = hbaseRowKey.getChannelCallContactRowkey(tempInParam);
			
			
			param.put(Const.NOSQL_ROWKEY, rowKey);
			rmChannelCallContactInfo.insert(tempInParam, param);
			
		}

		/** 
		 * 插入渠道短信接触信息
		* @date: 2016-11-3 
		* @author: wangpei
		* @title: insertChannelSMSContactInfo 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertChannelSMSContactInfo(Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String,String> param = new HashMap<String, String>();
			for(Map.Entry<String, Object> me : tempInParam.entrySet()){
				param.put(me.getKey(), me.getValue()+"");
			}
			String rowKey = hbaseRowKey.getChannelSMSContactRowKey(tempInParam);
			
			param.put(Const.NOSQL_ROWKEY, rowKey);
			rmChannelSMSContactInfo.insert(tempInParam, param);
			
			
		}

		/** 
		 * 插入点击记录信息
		* @date: 2016-11-2 
		* @author: wangpei
		* @title: insertClickRecordInfo 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertClickRecordInfo(Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String,String> param = new HashMap<String, String>();
			for(Map.Entry<String, Object> me : tempInParam.entrySet()){
				param.put(me.getKey(), me.getValue()+"");
			}
			String rowKey = hbaseRowKey.getClickRecordRowkey(tempInParam);
			
			param.put(Const.NOSQL_ROWKEY, rowKey);
			rmClickRecordInfoHbase.insert(tempInParam, param);
		}

		/**
		 * 插入接触记录
		* @date: 2016-11-14 
		* @author: yangwl
		* @title: insertContactRecordInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertContactRecordInfo(Map<String, Object> inParam,Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String,String> param = hbaseQualifier.getAddContactRecordQualifier(inParam,tempInParam);
			String rowKey = hbaseRowKey.getContactRecordRowkey(tempInParam);
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			
			rmContactRecordInfoHbase.insert(tempParam, param);
		}
		
		/**
		 * 插入推送到达信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertPushArriveInfo 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertPushArriveInfo(Map<String,Object> tempInParam) throws StrategyError {
			Map<String,String> param = new HashMap<String, String>();
			for(Map.Entry<String, Object> me : tempInParam.entrySet()){
				param.put(me.getKey(), me.getValue()+"");
			}
			String rowKey = hbaseRowKey.getPushArriveRowKey(tempInParam);
			
			
			param.put(Const.NOSQL_ROWKEY, rowKey);
			rmPushArriveInfoHbase.insert(tempInParam, param);
		}
		
		/** 插入回单数据
		* @date: 2016-11-3 
		* @author: wangpei
		* @title: insertReceiptRecordInfo 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertReceiptRecordInfo(Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String,String> param = new HashMap<String, String>();
			for(Map.Entry<String, Object> me : tempInParam.entrySet()){
				param.put(me.getKey(), me.getValue()+"");
			}
			String rowKey = hbaseRowKey.getReceiptRecordRowkey(tempInParam);
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			
			rmReceiptRecordInfoHbase.insert(tempParam, param);
		}
		
		/** 插入推荐关闭表
		* @date: 2016-11-30 
		* @author: wangpei
		* @title: insertRecommendClose 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertRecommendClose(Map<String, Object> tempInParam,Map<String, Object> param) {
			String rowKey = hbaseRowKey.getRecommendCloseRowkey(tempInParam);
			Map<String,String> inParam = new HashMap<String, String>();
			for(Map.Entry<String, Object> me : tempInParam.entrySet()){
				inParam.put(me.getKey(), me.getValue()+"");
			}
			tempInParam.put(Const.NOSQL_ROWKEY, rowKey);
			rmRecommendCloseInfoHbase.insert(tempInParam, inParam);
		}

		/**
		 * 插入推荐记录表
		* @date: 2017-2-12 
		* @author: sunliang 
		* @title: insertRecommendRecord 
		* @param inParam
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertRecommendRecord(Map<String, Object> inParam,Map<String, Object> tempInParam){
			String rowKey = hbaseRowKey.getRecommendRecordRowkey(tempInParam);
			Map<String,String> param = hbaseQualifier.getInsertRecommendRecordQualifier(inParam, tempInParam);
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			
			rmRecommendRecordInfoHbase.insert(tempParam, param);
		}

		/** 插入短信受理信息
		* @date: 2016-11-3 
		* @author: wangpei
		* @title: insertSMSAcceptRecordInfo 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertSMSAcceptRecordInfo(Map<String, Object> tempInParam)
				throws StrategyError {
		}

		/** 
		 * 插入短信上行信息
		* @date: 2016-11-3 
		* @author: wangpei
		* @title: insertSMSPullRecordInfo 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertSMSPullInfo(Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String,String> param = new HashMap<String, String>();
			for(Map.Entry<String, Object> me : tempInParam.entrySet()){
				param.put(me.getKey(), me.getValue()+"");
			}
			String rowKey = hbaseRowKey.getSMSPullRowkey(tempInParam);
			
		
			param.put(Const.NOSQL_ROWKEY, rowKey);
			rmSMSPullInfoHbase.insert(tempInParam, param);
			
		}
		/**
		 * 插入用户受理营销案信息
		* @date: 2017-4-8 
		* @author: zhangyw_crmpd
		* @title: insertUserAcceptMarketcaseInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertUserAcceptMarketcaseInfo(Map<String, Object> inParam,
				Map<String, String> tempInParam) throws StrategyError {
			String rowKey = hbaseRowKey.getUserAcceptMarketcaseRowkey(inParam);
			tempInParam.put(Const.NOSQL_ROWKEY, rowKey);
			log.info("insertAcceptRecordInfo", inParam);
			rmAcceptRecordInfo.insert(inParam,tempInParam);
			
		}
	}
	
	/**
	 * 插入客户群数据实现类
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: CustGroupInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class CustGroupInsertor implements ICustGroupInsertor,Serializable{
		
		protected IRDBMSDML.IRmCustGroupAttributeInfo rmCustGroupAttributeInfo;
		protected IRDBMSDML.IRmCustGroupInfo rmCustGroupInfo;
		protected IRDBMSDML.IRmCustGroupLabelInfo rmCustGroupLabelInfo;
		protected ICacheDML.ICustGroupLabelFormulaCache custGroupLabelFormulaCache;
		protected IHiveDML.IRmCustGroupDetailInfoHive rmCustGroupDetailInfoHive;
		protected IHiveDML.IRmCustGroupLabelInfoHive rmCustGroupLabelInfoHive;
		protected IRDBMSDML.IRmRelationRel rmRelationRel;		
		protected ISparkSQLDML.IRmCustgroupDetailInfoSpark rmCustgroupDetailInfoSpark;
		protected INosqlDML.IRmCustGroupDetailInfo rmCustGroupDetailInfoHbase;
		protected INosqlDML.IRmCustGroupCustomLabelInfo rmCustGroupCustomLabelInfoHbase;
		protected IRDBMSDML.IRmCustGroupHandleRecordInfo rmCustGroupHandleRecordInfo;
		
		public void setRmCustGroupAttributeInfo(
				IRDBMSDML.IRmCustGroupAttributeInfo rmCustGroupAttributeInfo) {
			this.rmCustGroupAttributeInfo = rmCustGroupAttributeInfo;
		}

		public void setRmCustGroupInfo(IRDBMSDML.IRmCustGroupInfo rmCustGroupInfo) {
			this.rmCustGroupInfo = rmCustGroupInfo;
		}

		public void setRmCustGroupDetailInfoHive(
				IHiveDML.IRmCustGroupDetailInfoHive rmCustGroupDetailInfoHive) {
			this.rmCustGroupDetailInfoHive = rmCustGroupDetailInfoHive;
		}

		public void setRmCustGroupLabelInfoHive(
				IHiveDML.IRmCustGroupLabelInfoHive rmCustGroupLabelInfoHive) {
			this.rmCustGroupLabelInfoHive = rmCustGroupLabelInfoHive;
		}



		public void setCustGroupLabelFormulaCache(ICacheDML.ICustGroupLabelFormulaCache custGroupLabelFormulaCache) {
			this.custGroupLabelFormulaCache = custGroupLabelFormulaCache;
		}
		
		public void setRmCustGroupLabelInfo(IRDBMSDML.IRmCustGroupLabelInfo rmCustGroupLabelInfo) {
			this.rmCustGroupLabelInfo = rmCustGroupLabelInfo;
		}
		
		public void setRmRelationRel(IRDBMSDML.IRmRelationRel rmRelationRel) {
			this.rmRelationRel = rmRelationRel;
		}
		
		public void setRmCustgroupDetailInfoSpark(ISparkSQLDML.IRmCustgroupDetailInfoSpark rmCustgroupDetailInfoSpark) {
			this.rmCustgroupDetailInfoSpark = rmCustgroupDetailInfoSpark;
		}
		
		public void setRmCustGroupDetailInfoHbase(INosqlDML.IRmCustGroupDetailInfo rmCustGroupDetailInfoHbase) {
			this.rmCustGroupDetailInfoHbase = rmCustGroupDetailInfoHbase;
		}
		
		
		public void setRmCustGroupCustomLabelInfoHbase(
				INosqlDML.IRmCustGroupCustomLabelInfo rmCustGroupCustomLabelInfoHbase) {
			this.rmCustGroupCustomLabelInfoHbase = rmCustGroupCustomLabelInfoHbase;
		}
		
		public void setRmCustGroupHandleRecordInfo(
				IRDBMSDML.IRmCustGroupHandleRecordInfo rmCustGroupHandleRecordInfo) {
			this.rmCustGroupHandleRecordInfo = rmCustGroupHandleRecordInfo;
		}

		/**
		 * 添加客户群标签到缓存
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: addCustGroupLabelToCache 
		* @param inParam
		* @param custGroupLable 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addCustGroupLabelToCache(Map<Object,Object> custGroupLableCache) {
			log.debug("====addCustGroupLabelToCache()===","");
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.CACHE_VALUE, custGroupLableCache);
			log.debug("====tempParam===",tempParam);
			custGroupLabelFormulaCache.add(tempParam);
		}
		
		/**
		 * 添加客户群Hive表名到缓存
		* @date: 2017-3-14 
		* @author: yuanchun
		* @title: addCustGoupLabelHiveTableNameToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addCustGoupLabelHiveTableNameToCache(Map<String, Object> tempInParam) throws StrategyError {
			custGroupLabelFormulaCache.addList(tempInParam);
		}
		
		/**
		 * 客户群详情加载到hive
		* @date: 2016-10-30 
		* @author: zhangjj_crmpd
		* @title: loadCustGroupToHive 
		* @param inParam
		* @param tmpInparam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void custGroupDetailLoadToHive(Map<String, Object> inParam,
				Map<String, Object> tempInParam) throws StrategyError {
			rmCustGroupDetailInfoHive.createCustGroupDetailInfo(tempInParam);
			rmCustGroupDetailInfoHive.loadCustGroupDetailInfo(tempInParam);
			rmCustGroupDetailInfoHive.createCustGroupDetailInfoHive(tempInParam);
			
		}

		/**
		 * 客户群标签加载到hive
		* @date: 2017-2-11 
		* @author: zhangjj_crmpd
		* @title: custGroupLabelLoadToHive 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void custGroupLabelLoadToHive(Map<String, Object> inParam,
				Map<String, Object> tempInParam) throws StrategyError {
			rmCustGroupLabelInfoHive.createCustGroupLabelInfo(inParam,tempInParam);
			rmCustGroupLabelInfoHive.loadCustGroupLabelInfo(tempInParam);
			
		}
		
		/**
		 * 创建客户群Hive表
		* @date: 2016-11-14 
		* @author: zhangjj_crmpd
		* @title: createCustGroupHiveTable 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void createCustGroupHiveTable(Map<String,Object> inParam,Map<String, Object> tempInParam) throws StrategyError {
			rmCustGroupDetailInfoHive.createCustGroupDetailInfo(tempInParam);
		}
		
		/**
		 * 创建客户群明细hbase表
		* @date: 2017-2-11
		* @author: luogj
		* @title: createCustGroupDetailHbaseTable 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void createCustGroupDetailHbaseTable(Map<String,Object> inParam,Map<String, Object> tempInParam) throws StrategyError {
			rmCustGroupDetailInfoHbase.createTable(tempInParam);
		}
		
		/**
		 * 使用spark创建客户群明细表
		* @date: 2017-2-11
		* @author: luogj
		* @title: createCustGroupDetailSparkTable 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void createCustGroupDetailSparkTable(Map<String,Object> inParam,Map<String, Object> tempInParam) throws StrategyError {
			rmCustgroupDetailInfoSpark.create(tempInParam);
		}

		/**
		 * 创建动态标签客户群明细的文件
		* @date: 2017-2-10
		* @author: luogj
		* @title: createLabelCustGroupDetailFileDynamic 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void createLabelCustGroupDetailFileDynamic(Map<String,Object> inParam) throws StrategyError {
			rmCustgroupDetailInfoSpark.insertLabelFileDynamic(inParam);
		}
		
		/**
		 * 创建静态标签客户群明细的文件	
		* @date: 2017-2-10
		* @author: luogj
		* @title: createLabelCustGroupDetailFileStatic 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void createLabelCustGroupDetailFileStatic(Map<String,Object> inParam) throws StrategyError {
			rmCustgroupDetailInfoSpark.insertLabelFileStatic(inParam);
		}
		
		/**
		 * 静态标签目标客户群表关联hive（hive扩展表）
		* @date: 2017-3-14 
		* @author:liuqi
		* @title: createRelateStaticLabelCustGroupTableToHive 
		* @param outMap 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void createRelateStaticLabelCustGroupTableToHive(Map<String, Object> inParam) throws StrategyError {
			
			rmCustGroupLabelInfoHive.createRelateStaticLabelCustGroupTableToHive(inParam);
		}
		
		/**
		 * 通过hbase导入客户群明细表
		* @date: 2017-2-23 
		* @author: zhangjj_crmpd
		* @title: insertCustGroupDetailByHbase 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String,Object> insertCustGroupDetailHbase(Map<String, Object> inParam,
				Map<String, String> tempInParam) throws StrategyError {
			inParam.put(Const.NOSQL_ROWKEY, inParam.get("idNo"));
			return rmCustGroupDetailInfoHbase.insert(inParam, tempInParam);
		}
		
		/**
		 * 使用spark插入客户群明细表
		* @date: 2017-2-11
		* @author: luogj
		* @title: insertCustGroupDetailSparkTable 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertCustGroupDetailSparkTable(Map<String,Object> inParam,Map<String, Object> tempInParam) throws StrategyError {
			rmCustgroupDetailInfoSpark.insert(tempInParam);
		}
		
		/**
		 * 插入客户群明细
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertCustGroupDetail 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertCustGroupDetail(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			
		}
		
		/**
		 * 插入客户群属性信息
		* @date: 2017-2-9 
		* @author: tangaq
		* @title: insertCustGroupAttribute 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertCustGroupAttribute(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError{
			rmCustGroupInfo.insertCustGroupAttribute(tempInParam);
		}
		
		/**
		 * 插入客户群处理记录
		* @date: 2017-3-10 
		* @author: zhangjj_crmpd
		* @title: insertCustGroupHandleRecord 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertCustGroupHandleRecord(Map<String, Object> inParam,
				Map<String, Object> tempInParam) throws StrategyError {
			rmCustGroupHandleRecordInfo.insert(tempInParam);
		}
		
		/**
		 * 插入客户群标签信息
		* @date: 2016-11-3 
		* @author: zhangjj_crmpd
		* @title: insertCustGroupLabel 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertCustGroupLabel(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			System.out.println("%#$%^#$333333ProxyDataInsertor__inParam>>>>>>>"+inParam);
			System.out.println("%#$%^#$333333ProxyDataInsertor__tempInParam>>>>>>>"+tempInParam);
			rmCustGroupLabelInfo.insert(tempInParam);
		}
		
		/**
		 * 插入hbase 客户群标签表
		* @date: 2017-2-23 
		* @author: zhangjj_crmpd
		* @title: insertCustGroupLabelHbase 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public Map<String,Object> insertCustGroupLabelHbase(Map<String, Object> inParam,
				Map<String, String> tempInParam) throws StrategyError {
			inParam.put(Const.NOSQL_ROWKEY, inParam.get("idNo"));
			return rmCustGroupCustomLabelInfoHbase.insert(inParam, tempInParam);
		}
		
		/**
		 * 插入客户群信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertCustGroup 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertCustGroup(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			rmCustGroupInfo.insert(tempInParam);
			rmCustGroupAttributeInfo.insertCustGroupAttribute(tempInParam);
		}
		
		/**
		 * 添加客户群与子客户群关系入关系表
		* @date: 2016-11-24 
		* @author: fangyuan_crmpd
		* @title: insertCustGroupRelation 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertCustGroupRelation(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			rmRelationRel.insert(tempInParam);
		}
		
		/**
		 * 添加客户群文件信息
		* @date: 2016-10-16 
		* @author: wangth
		* @Title: insertCustGroupFile 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertCustGroupFile(Map<String, Object> inParam,
				Map<String, Object> tempInParam) throws StrategyError {
			rmCustGroupInfo.insertCustGroupFile(tempInParam);
		}
		
		/**
		 * 批量添加客户群明细
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertBatchCustGroupDetail 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertBatchCustGroupDetail(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			// TODO Auto-generated method stub
		}
		
		/**
		 * 增加静态标签客户群信息（hive表）
		* @date: 2017-3-14 
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
		public void insertStaticLabelCustGroupTableInfo(Map<String, Object> inParam) throws StrategyError{
			
			rmCustGroupLabelInfoHive.insertStaticLabelCustGroupTableInfo(inParam);
			
		}
	}
	
	/**
	 * 评估统计数据插入操作接口
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: EvaluateInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class EvaluateInsertor implements IEvaluateInsertor,Serializable {
		protected IRDBMSDML.IRmMarketCaseOrderReportInfo rmMarketCaseOrderReportInfo;
		protected IRDBMSDML.IRmProductCommodityReportInfo rmProductCommodityReportInfo;
		
		/**
		 * 
		* @date: 2017-2-22 
		* @author: mengxi
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
		* @date: 2016-11-27 
		* @author: mengxi
		* @title: setRmMarketCaseOrderReportInfo 
		* @param rmMarketCaseOrderReportInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmMarketCaseOrderReportInfo(IRDBMSDML.IRmMarketCaseOrderReportInfo rmMarketCaseOrderReportInfo) {
			this.rmMarketCaseOrderReportInfo = rmMarketCaseOrderReportInfo;
		}

		/**
		 * 插入营销案产品订购量统计表
		* @date: 2016-11-26 
		* @author: mengxi
		* @title: insertMarketCaseOrderReportData 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertMarketCaseOrderReportData(Map<String,Object> inParam) throws StrategyError{
			rmMarketCaseOrderReportInfo.insert(inParam);
		}

		/**
		 * 导入产商品信息报表数据
		* @date: 2017-1-24 
		* @author: mengxi
		* @title: insertProductCommodityReportData 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertProductCommodityReportData(Map<String, Object> inParam) {
			rmProductCommodityReportInfo.insert(inParam);
		}
	}
	
	
	/**
	 * 事件数据插入操作接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: EventInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class EventInsertor implements IEventInsertor, Serializable{
		
		protected IRDBMSDML.IRmEventInfo rmEventInfo;
		protected IRDBMSDML.IRmEventDetailInfo rmEventDetailInfo;
		protected ICacheDML.IFeeAndEventRelCache feeAndEventRelCache;
		protected ICacheDML.IProductAndEventRelCache productAndEventRelCache;
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		public void setRmEventInfo(IRDBMSDML.IRmEventInfo rmEventInfo) {
			this.rmEventInfo = rmEventInfo;
		}

		public IRDBMSDML.IRmRelationRel getRmRelationRel() {
			return rmRelationRel;
		}

		public void setRmRelationRel(IRDBMSDML.IRmRelationRel rmRelationRel) {
			this.rmRelationRel = rmRelationRel;
		}

		public void setRmEventDetailInfo(IRDBMSDML.IRmEventDetailInfo rmEventDetailInfo) {
			this.rmEventDetailInfo = rmEventDetailInfo;
		}
		
		public void setFeeAndEventRelCache(
				ICacheDML.IFeeAndEventRelCache feeAndEventRelCache) {
			this.feeAndEventRelCache = feeAndEventRelCache;
		}

		public void setProductAndEventRelCache(ICacheDML.IProductAndEventRelCache productAndEventRelCache) {
			this.productAndEventRelCache = productAndEventRelCache;
		}

		/**
		 * 插入事件信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertEventInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertEventInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			rmEventInfo.insert(tempInParam);
		}
		
		/**
		 * 增加关系信息
		* @date: 2017-2-13 
		* @author:liuqi
		* @title: insertRelationInfo 
		* @param newInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertRelationInfo(Map<String, Object> newInParam) throws StrategyError{
			rmRelationRel.insert(newInParam);
		}
		
		/**
		 * 插入事件详细信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertEventDetailInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertEventDetailInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			rmEventDetailInfo.insert(tempInParam);
		}
		
		/**
		 * 增加缴费和事件关系到缓存
		* @date: 2017-2-13 
		* @author: sunyuan
		* @title: addFeeAndEventRelToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		* 2017-3-2 luogj 临时屏蔽渠道划分
		 */
		@Deprecated
		@Override
		public void addFeeAndEventRelToCache(Map<String,Object> tempInParam) throws StrategyError{
			String channelId = (String)tempInParam.get("channelId");
			List<Map<String, Object>> eventDetail = (List<Map<String, Object>>)tempInParam.get("eventDetail");
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
//			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_EVENT_FEE + channelId);
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_EVENT_FEE);
			tempParam.put(Const.CACHE_VALUE, eventDetail);
			
			feeAndEventRelCache.putAll(tempParam);
		}
		
		/**
		 * 加载缴费事件与营销案关系缓存
		* @date: 2017-3-7 
		* @author: sunliang 
		* @title: addPayFeeEventAndMarketCaseRelToCache 
		* @param payFeeEventAndMarketCaseRelCache
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addPayFeeEventAndMarketCaseRelToCache(
				Map<String, List<Map<String, Object>>> payFeeEventAndMarketCaseRelCache)
				throws StrategyError {
			Map<String,Object> tempParam = new HashMap<String,Object>();
			for(Map.Entry<String, List<Map<String, Object>>> entry : payFeeEventAndMarketCaseRelCache.entrySet()){
				tempParam.put(Const.CACHE_KEY, entry.getKey());
				tempParam.put(Const.CACHE_VALUE, entry.getValue());
				feeAndEventRelCache.putAll(tempParam);
			}
		}
		
		/**
		 * 增加产品和事件关系到缓存
		* @date: 2017-1-2 
		* @author: sunliang 
		* @title: addProductAndEventRelToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addProductAndEventRelToCache(Map<String, Object> tempInParam)throws StrategyError {
			String product = (String)tempInParam.get("product");
			List<Map<String, Object>> event = (List<Map<String, Object>>)tempInParam.get("event");
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_EVENT_PRODUCT + product);
			tempParam.put(Const.CACHE_VALUE, event);
			
			productAndEventRelCache.putAll(tempParam);
		}

	}
	
	/**
	 * 清单数据插入实现
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: InventoryInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class InventoryInsertor implements IInventoryInsertor, Serializable{
		
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
		 * 插入清单信息
		* @date: 2017-1-12 
		* @author: zhangjj_crmpd
		* @title: insertInventoryInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertInventoryInfo(Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError {
			rmInventoryInfo.insert(tempInParam);
		}
				
	}
	
	
	/**
	 * 登录(权限、角色、菜单)数据插入操作实现类
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: LoginInsertor 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class LoginInsertor implements ILoginInsertor{
		
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
		 * 角色与用户关系对象
		 */
		protected IRDBMSDML.IRmRoleMenuRel rmRoleMenuRel;
		/**
		 * 工号信息
		 */
		protected IRDBMSDML.IRmLoginMsgInfo RmLoginmsgInfo;

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
         * 
        * @date: 2017-1-22 
        * @author: hannn
        * @title: setRmLoginMsgInfo 
        * @param rmLoginMsgInfo 
        * @exception: 
        * @version: 1.0 
        * @description: 
        * update_version: update_date: update_author: update_note:
         */
		public void setRmLoginMsgInfo(IRDBMSDML.IRmLoginMsgInfo RmLoginmsgInfo) {
			this.RmLoginmsgInfo = RmLoginmsgInfo;
		}

		/**
		 * 插入角色信息
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: insert 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insert(Map<String, Object> inParam) throws StrategyError {
			rmRoleInfo.insert(inParam);
		}
		
		/**
		 * 批量插入用户和角色的关系
		* @date: 2016-10-29 
		* @author: xiongxq
		* @Title: insertBatchRoleUserRel 
		* @param inParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertBatchRoleUserRel(Map<String, Object> inParam)
				throws StrategyError {
			rmRoleUserRel.insertBatchRoleUserRel(inParam);
		}
		/**
		 * 插入工号信息
		* @date: 2017-1-22 
		* @author: hannn
		* @title: insertLoginNo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertLoginNo(Map<String, Object> inParam) throws StrategyError {
			RmLoginmsgInfo.insert(inParam);
		}
		/**
		 * 插入角色和菜单的关系
		* @date: 2016-10-28 
		* @author: zhangjj_crmpd
		* @title: insertRoleMenuRel 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertRoleMenuRel(List<Map<String, Object>> list)
				throws StrategyError {
			rmRoleMenuRel.insert(list);
		}
		
		/**
		 * 插入用户和角色的关系
		* @date: 2016-10-27 
		* @author: wangth
		* @Title: insertRoleUserRel 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertRoleUserRel(Map<String, Object> inParam)
				throws StrategyError {
			rmRoleUserRel.insert(inParam);
		}
		
		/**
		 * 插入菜单
		* @date: 2016-10-26 
		* @author: fangyuan_crmpd
		* @title: insertMenuInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertMenuInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmMenuInfo.insert(inParam);
			
		}
	}
	
	/**
	 * 插入营销案数据实现类
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: MarketCaseInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class MarketCaseInsertor implements IMarketCaseInsertor, Serializable{
		
/*		protected ICacheDML.IBatchPushSendStatus batchPushSendStatus;*/
		protected ICacheDML.IChannelTriggerMarketCaseCache channelTriggerMarketCaseCache;
		protected ICacheDML.IEventTriggerMarketCaseCache eventTriggerMarketCaseCache;
		protected ICacheDML.IMarketCaseDetailCache marketCaseDetailCache;
		protected IRDBMSDML.IRmMarketCaseAttributeInfo rmMarketCaseAttributeInfo;
		protected IRDBMSDML.IRmMarketCaseInfo rmMarketCaseInfo;
		//protected INosqlDML.IRmMarketCaseRecommendTotalInfo rmMarketCaseRecommendTotalInfo;
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		protected ICacheDML.IMarketCaseRecommendStatusCache marketCaseRecommendStatusCache;
		protected ICacheDML.IStatisticCache statisticCache;
		protected ICacheDML.IWaitCreateBatchPushMarketCaseCache waitCreateBatchPushMarketCaseCache;
		protected ICacheDML.IWaitCreateCallTaskMarketCaseCache waitCreateCallTaskMarketCaseCache;
		protected ICacheDML.IWaitCreateChannelTaskMarketCaseCache waitCreateChannelTaskMarketCaseCache;
		protected ICacheDML.IWaitSendBatchPushMarketCaseCache waitSendBatchPushMarketCaseCache;


/*		public void setBatchPushSendStatus(
				ICacheDML.IBatchPushSendStatus batchPushSendStatus) {
			this.batchPushSendStatus = batchPushSendStatus;
		}

		public void setChannelTaskMarketCaseLabelFormulaCache(
				ICacheDML.IChannelTaskMarketCaseLabelFormulaCache channelTaskMarketCaseLabelFormulaCache) {
			this.channelTaskMarketCaseLabelFormulaCache = channelTaskMarketCaseLabelFormulaCache;
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
		
		public void setRmMarketCaseAttributeInfo(
				IRDBMSDML.IRmMarketCaseAttributeInfo rmMarketCaseAttributeInfo) {
			this.rmMarketCaseAttributeInfo = rmMarketCaseAttributeInfo;
		}

		public void setRmMarketCaseInfo(IRDBMSDML.IRmMarketCaseInfo rmMarketCaseInfo) {
			this.rmMarketCaseInfo = rmMarketCaseInfo;
		}

/*		public void setRmMarketCaseRecommendTotalInfo(
				INosqlDML.IRmMarketCaseRecommendTotalInfo rmMarketCaseRecommendTotalInfo) {
			this.rmMarketCaseRecommendTotalInfo = rmMarketCaseRecommendTotalInfo;
		}*/

		public void setMarketCaseRecommendStatusCache(
				ICacheDML.IMarketCaseRecommendStatusCache marketCaseRecommendStatusCache) {
			this.marketCaseRecommendStatusCache = marketCaseRecommendStatusCache;
		}

		public void setRmRelationRel(IRDBMSDML.IRmRelationRel rmRelationRel) {
			this.rmRelationRel = rmRelationRel;
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

		/**
		 * 加载批量push营销案和目标客户群信息到缓存
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: addBatchPushMarketCaseAndCustGroupToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
/*		@Override
		public void addBatchPushMarketCaseAndCustGroupToCache(Map<String, Object> tempInParam) throws StrategyError{
			batchPushAndCustGroupRel.putAll(tempInParam);
		}*/
		
/*		*//**
		 * 加载营销案状态到缓存中
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: addBatchPushTaskStatusCodeToCache 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 *//*
		@Override
		public void addBatchPushTaskStatusCodeToCache(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			batchPushSendStatus.add(tempInParam);
		}*/
		
		/**
		 * 加载营销案推荐状态到缓存
		* @date: 2017-2-7 
		* @author: sunliang 
		* @title: addMarketCaseRecommendStatusToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addMarketCaseRecommendStatusToCache(Map<String,Object> tempInParam) throws StrategyError {
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_RECOMMENDSTATUS + tempInParam.get("marketCaseId"));
			tempParam.put(Const.CACHE_VALUE, tempInParam.get("marketCaseId"));
			marketCaseRecommendStatusCache.add(tempParam);
		}
		
		/**
		 * 加载待生成外呼任务营销案缓存
		* @date: 2017-3-17 
		* @author: yuanchun
		* @title: addWaitCreateCallTaskMarketCaseCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addWaitCreateCallTaskMarketCaseCache(Map<String, Object> tempInParam) throws StrategyError{
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_CALLTASK_WAITCREATE);
			tempParam.put(Const.CACHE_VALUE, tempInParam.get("waitCreateCallTaskMarketCaseList"));
			tempParam.put(Const.CACHE_DIRECTION, Const.CACHE_RESTORE_DIRECTION_LEFT);
			
			waitCreateCallTaskMarketCaseCache.add(tempParam);
		}
		
		/**
		 * 加载待生成渠道任务营销案缓存
		* @date: 2017-1-16 
		* @author: sunliang 
		* @title: addWaitCreateChannelTaskMarketCaseCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addWaitCreateChannelTaskMarketCaseCache(Map<String, Object> tempInParam) throws StrategyError{
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_CHANNELTASK_WAITCREATE);
			tempParam.put(Const.CACHE_VALUE, tempInParam.get("waitCreateCallTaskMarketCaseList"));
			tempParam.put(Const.CACHE_DIRECTION, Const.CACHE_RESTORE_DIRECTION_LEFT);
			
			waitCreateChannelTaskMarketCaseCache.add(tempParam);
		}
		
		/**
		 * 添加营销案详细信息到缓存
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: addMarketCaseDetailToCache 
		* @param marketCaseCachePojoMap
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addMarketCaseDetailToCache(Map<String,IMarketCaseCachePojo> marketCaseCachePojoMap) throws StrategyError {
			Map<String,Object> tempParam = new HashMap<String,Object>();
			for(Map.Entry<String,IMarketCaseCachePojo> map : marketCaseCachePojoMap.entrySet()){
				tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_DETAIL + map.getKey());
				tempParam.put(Const.CACHE_VALUE, map.getValue());
				marketCaseDetailCache.add(tempParam);
			}
			
		}
		
		/**
		 * 加载渠道触发营销案到缓存
		* @date: 2016-10-11 
		* @author: yangwl
		* @title: addChannelTriggerMarketCaseToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addChannelTriggerMarketCaseToCache(Map<String, Object> tempInParam) throws StrategyError{
			
			String regionCode = (String) tempInParam.get("regionCode");
			String positionId = (String) tempInParam.get("positionId");
			List<Map<String, Object>> channelTriggerMarketCaseCacheList = (List<Map<String, Object>>) tempInParam.get("channelTriggerMarketCaseCache");
			
			Map<String, Object> tempParam = new HashMap<String, Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_CHANNELTRIGGER + regionCode +Const.SEPARATOR_COLON+positionId);
			tempParam.put(Const.CACHE_VALUE, channelTriggerMarketCaseCacheList);
			log.debug("====addChannelTriggerMarketCaseToCache===", tempParam);
			channelTriggerMarketCaseCache.add(tempParam);
			
		}
		
		/**
		 * 加载事件触发营销案到缓存
		* @date: 2017-1-2 
		* @author: sunliang 
		* @title: addEventTriggerMarketCaseToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addEventTriggerMarketCaseToCache(
				Map<String, Object> tempInParam) throws StrategyError {
			String event = (String)tempInParam.get("event");
			List<Map<String, Object>> marketCase = (List<Map<String, Object>>)tempInParam.get("marketCase");
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.CACHE_KEY,Const.CACHE_DATATYPE_MARKETCASE_EVENTTRIGGER + event);
			tempParam.put(Const.CACHE_VALUE, marketCase);
			
			eventTriggerMarketCaseCache.putAll(tempParam);		
		}
		
		/**
		 * 
		* @date: 2016-12-28 
		* @author: sunliang 
		* @title: addWaitCreateBatchPushMarketCaseToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addWaitCreateBatchPushMarketCaseToCache(Map<String, Object> tempInParam,String param) throws StrategyError{
			
			if(Const.BATCHPUSHMSG.equalsIgnoreCase(param)){
				//发短信缓存
				Map<String,Object> tempParam = new HashMap<String,Object>();
				tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEMSG);
				tempParam.put(Const.CACHE_VALUE, tempInParam.get("waitCreateBatchPushMsgMarketCase"));
				tempParam.put(Const.CACHE_DIRECTION, Const.CACHE_RESTORE_DIRECTION_LEFT);
				waitCreateBatchPushMarketCaseCache.putAll(tempParam);
				log.info("addCacheResult", "pushMsgCacheAdded");
			}else if(Const.BATCHPUSHPROD.equalsIgnoreCase(param)){
				//送套餐
				Map<String,Object> tempParam2 = new HashMap<String,Object>();
				tempParam2.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEPROD);
				tempParam2.put(Const.CACHE_VALUE, tempInParam.get("waitCreateBatchPushProdMarketCase"));
				tempParam2.put(Const.CACHE_DIRECTION, Const.CACHE_RESTORE_DIRECTION_LEFT);
				waitCreateBatchPushMarketCaseCache.putAll(tempParam2);
				log.info("addCacheResult", "pushProdCacheAdded");
			}else{
				log.info("addCacheResult", "nothingAdded");
			}
		}
		
		/**
		 * 增加测试、补发等待发送批量push营销案到缓存
		* @date: 2016-11-7 
		* @author: yuanliang
		* @title: addWaitSendMarketCasePriorityToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addWaitSendBatchPushMarketCaseToCache(
				Map<String,List<Map<Object, Object>>> tempInParam) throws StrategyError {
			waitSendBatchPushMarketCaseCache.add(tempInParam);			
		}		
		/**
		 * 插入关系表数据
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertRelationInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertRelationInfo(Map<String,Object> inParam) throws StrategyError {
			rmRelationRel.insert(inParam);
		}
		
		/**
		 * 插入营销案数据
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertMarketCase 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertMarketCase(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			rmMarketCaseInfo.insert(tempInParam);
			rmMarketCaseAttributeInfo.insert(tempInParam);
		}
		
		/**
		 * 记录基于渠道的营销案推荐统计
		* @date: 2017-1-10 
		* @author: sunliang 
		* @title: addMarketCaseRecommendCountByChannel 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addMarketCaseRecommendCountByChannel(Map<String,Object> tempInParam) throws StrategyError {
			
			String marketCaseId = (String)tempInParam.get("marketCaseId");
			String channelId = (String)tempInParam.get("channelId");
			String key = Const.CACHE_DATATYPE_STATISTIC + "marketCaseRecommend"
					+ Const.SEPARATOR_COLON + marketCaseId
					+ Const.SEPARATOR_COLON + channelId;
			
			statisticCache.add(key);
		}
		
		/**
		 * 记录基于渠道和日期的营销案推荐统计
		* @date: 2017-1-10 
		* @author: sunliang 
		* @title: addMarketCaseRecommendCountByChannelAndDate 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addMarketCaseRecommendCountByChannelAndDate(Map<String,Object> tempInParam) throws StrategyError {
			
			String marketCaseId = (String)tempInParam.get("marketCaseId");
			String channelId = (String)tempInParam.get("channelId");
			String currDate = DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1);
			String key = Const.CACHE_DATATYPE_STATISTIC + "marketCaseRecommend"
					+ Const.SEPARATOR_COLON + marketCaseId
					+ Const.SEPARATOR_COLON + channelId
					+ Const.SEPARATOR_COLON + currDate;
			
			statisticCache.add(key);
		}

	}
	
	/**
	 * 监控插入操作实现类
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: MonitorWarningInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class MonitorInsertor implements IMonitorInsertor{
		
		/**
		 * 监控告警对象
		 */
		protected IRDBMSDML.IRmMonitorWarningInfo rmMonitorWarningInfo;
		/**
		 * 服务监控表
		 */
		protected IRDBMSDML.IRmServicemonitoringInfo rmServicemonitoringInfo;
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

		public void setRmServicemonitoringInfo(
				IRDBMSDML.IRmServicemonitoringInfo rmServicemonitoringInfo) {
			this.rmServicemonitoringInfo = rmServicemonitoringInfo;
		}

		public void setServiceMonitoringCache(
				ICacheDML.IServiceMonitoringCache serviceMonitoringCache) {
			this.serviceMonitoringCache = serviceMonitoringCache;
		}

		/**
		 * 插入作业运行告警详细信息
		* @date: 2016-11-13 
		* @author: fangyuan_crmpd
		* @title: insertWorkOperWarningInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertWorkOperWarningInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmMonitorWarningInfo.insert(inParam);
			
		}

		/** 插入服务监控缓存
		* @date: 2017-3-7 
		* @author: wangpei
		* @title: addServiceMonitoringCache 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void addServiceMonitoringCache(Map<String, Object> inParam)
				throws StrategyError {
			Map<String, Object> tempInParam = new HashMap<String, Object>();
			tempInParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_SERVICEMONITORING);
			tempInParam.put(Const.CACHE_VALUE, inParam);
			tempInParam.put(Const.CACHE_DIRECTION, Const.CACHE_RESTORE_DIRECTION_LEFT);
			serviceMonitoringCache.add(tempInParam);
		}

		/** 插入服务监控表
		* @date: 2017-3-8 
		* @author: wangpei
		* @title: insertServiceMonitoring 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertServiceMonitoring(Map<String, Object> inParam)throws StrategyError {
			rmServicemonitoringInfo.insert(inParam);
		}	
	}
	
	/**
	 * 操作日志插入接口
	* @date: 2017-3-7 
	* @author: WuJiaFu
	* @title: IOperationLogInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */          
	public class OperationLogInsertor implements IOperationLogInsertor, Serializable{
		
		/**
		 * 短信触发记录
		 */
		protected IRDBMSDML.IRmMessageTriggerLogInfo rmMessageTriggerLogInfo;
		
		
		public void setRmMessageTriggerLogInfo(
				IRDBMSDML.IRmMessageTriggerLogInfo rmMessageTriggerLogInfo) {
			this.rmMessageTriggerLogInfo = rmMessageTriggerLogInfo;
		}


		/**
		 * 插入短信触发记录日志
		* @date: 2017-3-7 
		* @author: wuJiaFu
		* @title: insertMessageTriggerLogInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertMessageTriggerLogInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmMessageTriggerLogInfo.insert(inParam);
		}
		
	}
	
	public class PositionInsertor implements IPositionInsertor, Serializable{
		
		protected IRDBMSDML.IRmPositionInfo rmPositionInfo;
		protected IRDBMSDML.IRmAttributeInfo rmAttributeInfo;
		
		public void setRmPositionInfo(IRDBMSDML.IRmPositionInfo rmPositionInfo) {
			this.rmPositionInfo = rmPositionInfo;
		}
		
		public void setRmAttributeInfo(IRDBMSDML.IRmAttributeInfo rmAttributeInfo) {
			this.rmAttributeInfo = rmAttributeInfo;
		}

		/**
		 * 插入运营位信息
		* @date: 2016-10-1 
		* @author: wangth
		* @title: insertPositionInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertPositionInfo(Map<String,Object> inParam) throws StrategyError {
			rmPositionInfo.insert(inParam);
		}
		
		/**
		 * 插入运营位属性信息
		* @date: 2016-10-1 
		* @author: wangth
		* @title: insertPositionAttrInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertPositionAttrInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			List<Map<String,Object>> list = (List<Map<String, Object>>) inParam.get("positionList");
			if(!CommonUtils.objectIsNull(list)){
				rmAttributeInfo.insert(list);
			}
		}
	}
	
	/**
	 * 优先级插入操作实现类
	* @date: 2016-10-15 
	* @author: fangyuan_crmpd
	* @title: PriorityInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class PriorityInsertor implements IPriorityInsertor{
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
		 * 插入区域优先级数据
		* @date: 2016-10-15 
		* @author: fangyuan_crmpd
		* @title: insertAreaPriorityInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertAreaPriorityInfo(Map<String, Object> inParam,
				Map<String, Object> tempInParam) throws StrategyError {
			rmAreaPriorityInfo.insert(tempInParam);
		}
		
		/**
		 * 插入用户群优先级
		* @date: 2016-10-20 
		* @author: fangyuan_crmpd
		* @title: insertCustGroupPriorityInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertCustGroupPriorityInfo(Map<String, Object> inParam,
				Map<String, Object> tempInParam) throws StrategyError {
			rmCustGroupPriorityInfo.insert(tempInParam);
		}
	}
	
	/**
	 * 规则数据插入操作接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: RuleInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RuleInsertor implements IRuleInsertor, Serializable{
		
		/**
		 * 关闭规则缓存
		 */
		protected ICacheDML.ICloseRuleCache closeRuleCache;
		/**
		 * 评估规则缓存
		 */
		protected ICacheDML.IEvaluateRuleCache evaluateRuleCache;
		/**
		 * 全局规则缓存
		 */
		protected ICacheDML.IGlobalRuleCache globalRuleCache;
		/**
		 * 互斥规则缓存
		 */
		protected ICacheDML.IMutexRuleCache mutexRuleCache;
		/**
		 * 关系对象
		 */
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		/**
		 * 规则对象
		 */
		protected IRDBMSDML.IRmRuleInfo rmRuleInfo;
		/**
		 * 规则详情对象
		 */
		protected IRDBMSDML.IRmRuleDetailInfo rmRuleDetailInfo;	
		/**
		 * 主动PUSH任务控制对象
		 */
		protected IRDBMSDML.IRmWaitSendTaskControlInfo rmWaitSendTaskControlInfo;
		
		/**
		 * 
		* @date: 2017-4-6 
		* @author: sunyuan
		* @title: setCloseRuleCache 
		* @param closeRuleCache 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setCloseRuleCache(ICacheDML.ICloseRuleCache closeRuleCache) {
			this.closeRuleCache = closeRuleCache;
		}

		/**
		 * 
		* @date: 2017-4-7 
		* @author: sunyuan
		* @title: setEvaluateRuleCache 
		* @param evaluateRuleCache 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setEvaluateRuleCache(ICacheDML.IEvaluateRuleCache evaluateRuleCache) {
			this.evaluateRuleCache = evaluateRuleCache;
		}

		/**
		 * 
		* @date: 2016-12-28 
		* @author: sunliang 
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
		* @date: 2017-3-30 
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
		 * 加载关闭规则到缓存
		* @date: 2017-4-6 
		* @author: sunyuan
		* @title: addCloseRuleToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addCloseRuleToCache(Map<String,Object> tempParam)throws StrategyError{
			Map<String,Object> tempInParam = new HashMap<String,Object>();
			tempInParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_RULE_CLOSE + tempParam.get("prodId"));
			tempInParam.put(Const.CACHE_VALUE, tempParam.get("ruleDetail"));
			closeRuleCache.add(tempInParam);
		}
		
		/**
		 * 加载评估规则到缓存
		* @date: 2017-4-6 
		* @author: sunyuan
		* @title: addEvaluateRuleToCache 
		* @param tempParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addEvaluateRuleToCache(Map<String,Object> tempParam)throws StrategyError{
			Map<String,Object> tempInParam = new HashMap<String,Object>();
			tempInParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_RULE_EVALUATE + tempParam.get("prodId"));
			tempInParam.put(Const.CACHE_VALUE, tempParam.get("ruleDetail"));
			evaluateRuleCache.add(tempInParam);
		}
		
		/**
		 * 加载全局规则到缓存
		* @date: 2016-11-19 
		* @author: yangwl
		* @title: addGlobalRuleToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addGlobalRuleToCache(Map<String, Object> tempInParam) throws StrategyError{
			Map<String, Object> tempParam = new HashMap<String, Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_RULE_GLOBALRULE);
			tempParam.put("value", tempInParam.get("globalRuelDetailMap"));
			globalRuleCache.add(tempParam);
		}
		
		/**
		 * 插入全局规则
		* @date: 2016-10-14 
		* @author: xiongxq
		* @Title: insertGlobalRule 
		* @param inParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertGlobalRule(Map<String,Object>inParam) throws StrategyError{
			rmRuleDetailInfo.insert(inParam);
		}
		
		/**
		 * 插入互斥规则
		* @date: 2017-3-30 
		* @author: sunyuan
		* @title: addMutexRuleToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void addMutexRuleToCache(Map<String, Object> tempInParam) throws StrategyError{
			Map<String, Object> tempParam = new HashMap<String, Object>();
			tempParam.put(Const.CACHE_KEY, tempInParam.get("marketCaseId"));
			tempParam.put(Const.CACHE_VALUE, tempInParam.get("mutexRuleDetail"));
			mutexRuleCache.add(tempParam);
		}
		
		/** 
		* @date: 2016-10-17 
		* @author: wangpei
		* @title: insertRelationInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		public void insertRelationInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmRelationRel.insert(inParam);
		}

		/**
		 * 插入规则信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertRuleInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertRuleInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			rmRuleInfo.insert(tempInParam);
		}
		
		/**
		 * 插入规则详细信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertRuleDetailInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertRuleDetailInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			rmRuleDetailInfo.insert(tempInParam);
		}
		/**
		 * 插入已经生成的批量PUSH任务控制信息
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
		public void insertWaitSendTaskControlList(Map<String, Object> inParam)
				throws StrategyError {
			rmWaitSendTaskControlInfo.insert(inParam);
		}
	}
	
	/**
	 * 短信数据插入对象
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: ShortMessage 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ShortMessageInsertor implements IShortMessageInsertor{
		
		/**
		 * 短信对象
		 */
		protected IRDBMSDML.IRmShortMessageInfo rmShortMessageInfo;
		/**
		 * 角色与用户对象
		 */
		protected IRDBMSDML.IRmRoleUserRel rmRoleUserRel;
		
		/** 
		 * @date: 2016-10-29 
		 * @author: xiongxq
		 * @Title: setRmRoleUserRel 
		 * @param rmRoleUserRel the rmRoleUserRel to set
		 * @version 1.0 
		 * @Description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmRoleUserRel(IRDBMSDML.IRmRoleUserRel rmRoleUserRel) {
			this.rmRoleUserRel = rmRoleUserRel;
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
		 *给某个工号添加接入码  
		* @date: 2016-10-28 
		* @author: xiongxq
		* @Title: insertAccessCode 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertAccessCode(Map<String, Object> inParam) throws StrategyError {
			rmRoleUserRel.insertAccessCode(inParam);
		}

		/**
		 * 给某个工号批量添加接入码
		* @date: 2016-10-29 
		* @author: xiongxq
		* @Title: insertBatchAccessCode 
		* @param inParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertBatchAccessCode(Map<String, Object> inParam) throws StrategyError {
			rmRoleUserRel.insertBatchAccessCode(inParam);
		}

		/**
		 * 插入短信码
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: insertShortMessageAccessCode 
		* @param inParam
		* @param tempInParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertShortMessageAccessCode(Map<String, Object> inParam,
				Map<String, Object> tempInParam) throws StrategyError{
			rmShortMessageInfo.insert(tempInParam);
		}
	}
	
	/**
	 * 系统执行插入操作接口
	* @date: 2016-10-13 
	* @author: yangwl
	* @title: SystemDealInsertor
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class SystemDealInsertor implements ISystemDealInsertor, Serializable{
		
		protected IRDBMSDML.IRmShellProcessExecuteInfo rmShellProcessExecuteInfo;

		public void setRmShellProcessExecuteInfo(
				IRDBMSDML.IRmShellProcessExecuteInfo rmShellProcessExecuteInfo) {
			this.rmShellProcessExecuteInfo = rmShellProcessExecuteInfo;
		}

		/**
		 * 插入任务执行数据
		* @date: 2016-10-13 
		* @author: yangwl
		* @title: insertShellProcessExecuteInfo 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertShellProcessExecuteInfo(Map<String,Object> tempInParam) throws StrategyError{
			if(!CommonUtils.objectIsNull(tempInParam.get("updateTime"))){
				tempInParam.put("operTime", DateUtil.DateToString((Date)tempInParam.get("updateTime"), DateUtil.TIME_FROMAT_SIMPLE3));	
			}
			rmShellProcessExecuteInfo.insert(tempInParam);
		}
	}
	
	/**
	 * 数据统计插入
	* @date: 2016-12-20 
	* @author: sunliang 
	* @title: StatisticInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class StatisticInsertor implements IStatisticInsertor,Serializable {
		
		protected ICacheDML.IStatisticCache statisticCache;
		protected IRDBMSDML.IRmNoticeInfo rmNoticeInfo;
		
		public void setRmNoticeInfo(IRDBMSDML.IRmNoticeInfo rmNoticeInfo) {
			this.rmNoticeInfo = rmNoticeInfo;
		}
		public void setStatisticCache(ICacheDML.IStatisticCache statisticCache) {
			this.statisticCache = statisticCache;
		}

		/**
		 * 插入按业务类型统计受理数据
		* @date: 2017-2-16 
		* @author: tangaq
		* @title: insertBusiTypeAcceptStatistic 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertBusiTypeAcceptStatistic(Map<String, Object> tempInParam)
				throws StrategyError {
			String currentDay = (String)tempInParam.get("currentDay");
			String regionCode = (String)tempInParam.get("regionCode");
			String busiType = (String)tempInParam.get("busiType");
			
			String marketCaseRecommendKey = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_MARKETCASEACCEPT + Const.SEPARATOR_COLON + busiType + Const.SEPARATOR_COLON + currentDay + Const.SEPARATOR_COLON + regionCode;
			log.info("insertBusiTypeStatistic.marketCaseRecommendKey", marketCaseRecommendKey);
			statisticCache.add(marketCaseRecommendKey);
			
		}

		/**
		 * 插入按业务类型统计数据
		* @date: 2016-12-20 
		* @author: sunliang 
		* @title: insertBusiTypeStatistic 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertBusiTypeStatistic(Map<String, Object> tempInParam)
				throws StrategyError {
			
//			String currentDay = (String)tempInParam.get("currentDay");
//			String regionCode = (String)tempInParam.get("regionCode");
//			String busiType = (String)tempInParam.get("busiType");
			String marketCaseId = (String)tempInParam.get("marketCaseId");
			
//			String marketCaseRecommendKey = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_MARKETCASERECOMMEND + Const.SEPARATOR_COLON + busiType + Const.SEPARATOR_COLON + currentDay + Const.SEPARATOR_COLON + regionCode;
			String marketCaseRecommendKey = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_MARKETCASERECOMMEND + Const.SEPARATOR_COLON + marketCaseId;

			log.debug("insertBusiTypeStatistic.marketCaseRecommendKey", marketCaseRecommendKey);
			statisticCache.add(marketCaseRecommendKey);
		}

		/**
		 * 插入按渠道类型统计受理数据
		* @date: 2017-2-16 
		* @author: tangaq
		* @title: insertChannelAcceptStatic 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertChannelAcceptStatistic(Map<String, Object> tempInParam)
				throws StrategyError {
			String currentDay = (String)tempInParam.get("currentDay");
			String regionCode = (String)tempInParam.get("regionCode");
			String sceneType = (String)tempInParam.get("sceneType");
			
			String marketCaseRecommendKey = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_REALACCEPT_DAY + Const.SEPARATOR_COLON + sceneType + Const.SEPARATOR_COLON + currentDay + Const.SEPARATOR_COLON + regionCode;
			log.info("insertChannelAcceptStatic.marketCaseRecommendKey", marketCaseRecommendKey);
			statisticCache.add(marketCaseRecommendKey);
			
		}

		/** 插入渠道推荐统计数据
		* @date: 2017-1-4 
		* @author: wangpei
		* @title: insertChannelRecommonedStatistic 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertChannelRecommonedStatistic(Map<String, Object> tempInParam) throws StrategyError {
			String currentDay = (String)tempInParam.get("currentDay");
			String regionCode = (String)tempInParam.get("regionCode");
			String sceneType = (String)tempInParam.get("sceneType");
			
			String channelRecommendKey = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_CHANNELRECOMMEND + Const.SEPARATOR_COLON + sceneType + Const.SEPARATOR_COLON + currentDay + Const.SEPARATOR_COLON + regionCode;
			
			log.debug("channelRecommendKey", channelRecommendKey);
			statisticCache.add(channelRecommendKey);
								
		}

		/**
		 * 插入公告
		* @date: 2017-3-1 
		* @author: yexr
		* @title: insertNotice 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertNotice(Map<String, Object> inParam,
				Map<String, Object> tempInParam) throws StrategyError {			
			 rmNoticeInfo.insertNotice(tempInParam);
		}
		/**
		 * 插入实时接触统计数据
		* @date: 2016-12-20 
		* @author: sunliang 
		* @title: insertRealContactStatistic 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertRealContactStatistic(Map<String, Object> tempInParam)throws StrategyError {
			
			String currentDay = (String)tempInParam.get("currentDay");
			String currentMonth = (String)tempInParam.get("currentMonth");
			String regionCode = (String)tempInParam.get("regionCode");
			String sceneType = (String)tempInParam.get("sceneType");
			
			String realcontactByMonthKey = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_REALCONTACT_MONTH + Const.SEPARATOR_COLON + currentMonth + Const.SEPARATOR_COLON + regionCode;
			String realcontactByDayKey = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_REALCONTACT_DAY + Const.SEPARATOR_COLON + currentDay + Const.SEPARATOR_COLON + regionCode;
			String channelRealcontactByDayKey = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_CHANNELREALCONTACT_DAY + Const.SEPARATOR_COLON + sceneType + Const.SEPARATOR_COLON + currentDay + Const.SEPARATOR_COLON + regionCode;

			log.debug("realcontactByMonthKey", realcontactByMonthKey);
			log.debug("realcontactByDayKey", realcontactByDayKey);
			log.debug("channelRealcontactByDayKey", channelRealcontactByDayKey);
			
			statisticCache.add(realcontactByMonthKey);
			statisticCache.add(realcontactByDayKey);
			statisticCache.add(channelRealcontactByDayKey);
		
		}
		/**
		 * 插入实时资费反馈统计数据
		* @date: 2017-4-6 
		* @author: zhangyw_crmpd
		* @title: insertMarketCaseOrderStatistic 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertMarketCaseOrderStatistic(Map<String, Object> tempInParam)throws StrategyError {
			String currentDay = (String)tempInParam.get("currentDay");
			String currentMonth = (String)tempInParam.get("currentMonth");
			String marketCaseId = (String)tempInParam.get("marketCaseId");
			
			String marketCaseOrderByMonthKey = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_MARKETCASEORDERBYMONTH + Const.SEPARATOR_COLON + marketCaseId + Const.SEPARATOR_COLON + currentMonth;
			String marketCaseOrderByDayKey = Const.CACHE_DATATYPE_STATISTIC + Const.STATISTIC_TYPE_MARKETCASEORDERBYDAY + Const.SEPARATOR_COLON + marketCaseId + Const.SEPARATOR_COLON + currentDay;
			log.info("marketCaseOrderByMonthKey", marketCaseOrderByMonthKey);
			log.info("marketCaseOrderByDayKey", marketCaseOrderByDayKey);
			System.out.println("*******####******marketCaseOrderByMonthKey***"+marketCaseOrderByMonthKey);
			System.out.println("********#####*****marketCaseOrderByDayKey***"+marketCaseOrderByDayKey);
			statisticCache.add(marketCaseOrderByMonthKey);
			statisticCache.add(marketCaseOrderByDayKey);
		}
		
	}
	
	/**
	 * 任务数据插入对象
	* @date: 2016-10-1 
	* @author: sunliang
	* @title: TaskInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class TaskInsertor implements ITaskInsertor,Serializable {
		//protected ICacheDML.IBatchPushTask batchPushTask;
		protected INosqlDML.IRmBatchPushTaskInfo rmBatchPushTaskInfoHbase;
		protected INosqlDML.IRmBatchPushTaskExcepInfo rmBatchPushTaskExcepInfoHbase;
		protected INosqlDML.IRmChannelTaskInfo rmChannelTaskInfoHbase;
		protected IHiveDML.IRmChannelTaskInfoHive rmChannelTaskInfoHive;
		protected ISparkSQLDML.IRmRecommonedCloseInfoSpark rmRecommonedCloseInfoSpark;
		protected IRDBMSDML.IRmChannelTaskInfo rmChannelTaskInfo;
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		protected IRDBMSDML.IRmTaskAdjustInfo rmTaskAdjustInfo;
		protected INosqlDML.IRmWaitSendBatchPushTaskInfo rmWaitSendBatchPushTaskInfoHbase;
		protected INosqlDML.IRmBatchPushTaskSuccInfo rmBatchPushTaskSuccInfoHbase;
		protected ICacheDML.IStatisticCache statisticCache;
		protected ICacheDML.IWaitSynChannelTaskCache waitSynChannelTaskCache;

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
		 * @title: setRmBatchPushTaskExcepInfoHbase 
		 * @param rmBatchPushTaskExcepInfoHbase the rmBatchPushTaskExcepInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmBatchPushTaskExcepInfoHbase(
				INosqlDML.IRmBatchPushTaskExcepInfo rmBatchPushTaskExcepInfoHbase) {
			this.rmBatchPushTaskExcepInfoHbase = rmBatchPushTaskExcepInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmChannelTaskInfoHbase 
		 * @param rmChannelTaskInfoHbase the rmChannelTaskInfoHbase to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmChannelTaskInfoHbase(
				INosqlDML.IRmChannelTaskInfo rmChannelTaskInfoHbase) {
			this.rmChannelTaskInfoHbase = rmChannelTaskInfoHbase;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmChannelTaskInfoHive 
		 * @param rmChannelTaskInfoHive the rmChannelTaskInfoHive to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmChannelTaskInfoHive(
				IHiveDML.IRmChannelTaskInfoHive rmChannelTaskInfoHive) {
			this.rmChannelTaskInfoHive = rmChannelTaskInfoHive;
		}

		public void setRmChannelTaskInfo(IRDBMSDML.IRmChannelTaskInfo rmChannelTaskInfo) {
			this.rmChannelTaskInfo = rmChannelTaskInfo;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmRecommonedCloseInfoSpark 
		 * @param rmRecommonedCloseInfoSpark the rmRecommonedCloseInfoSpark to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmRecommonedCloseInfoSpark(
				ISparkSQLDML.IRmRecommonedCloseInfoSpark rmRecommonedCloseInfoSpark) {
			this.rmRecommonedCloseInfoSpark = rmRecommonedCloseInfoSpark;
		}

		/** 
		 * @date: 2017-1-16 
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
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setRmTaskAdjustInfo 
		 * @param rmTaskAdjustInfo the rmTaskAdjustInfo to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmTaskAdjustInfo(IRDBMSDML.IRmTaskAdjustInfo rmTaskAdjustInfo) {
			this.rmTaskAdjustInfo = rmTaskAdjustInfo;
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
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setStatisticCache 
		 * @param statisticCache the statisticCache to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		
		public void setStatisticCache(ICacheDML.IStatisticCache statisticCache) {
			this.statisticCache = statisticCache;
		}

		/** 
		 * @date: 2017-1-16 
		 * @author: wangpei
		 * @title: setWaitSynChannelTaskCache 
		 * @param waitSynChannelTaskCache the waitSynChannelTaskCache to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setWaitSynChannelTaskCache(
				ICacheDML.IWaitSynChannelTaskCache waitSynChannelTaskCache) {
			this.waitSynChannelTaskCache = waitSynChannelTaskCache;
		}
		
		/**
		 * 
		* @date: 2017-2-28 
		* @author: zhangjj_crmpd
		* @title: setRmBatchPushTaskSuccInfoHbase 
		* @param rmBatchPushTaskSuccInfoHbase 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmBatchPushTaskSuccInfoHbase(
				INosqlDML.IRmBatchPushTaskSuccInfo rmBatchPushTaskSuccInfoHbase) {
			this.rmBatchPushTaskSuccInfoHbase = rmBatchPushTaskSuccInfoHbase;
		}

		/** 
		* @date: 2016-12-16 
		* @author: wangpei
		* @title: addChannelTaskSynToCache 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void addChannelTaskSynToCache(Map<String, Object> tempInParam) {
			
			Set<String> synSet = (Set<String>)tempInParam.get("taskSyn");
			List<String> synList = new ArrayList<String>();
			
			if(!CommonUtils.objectIsNull(synSet)){
				for(String str : synSet){
					synList.add(str);
				}
			}
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_CHANNELTASK_WAITSYN);
			tempParam.put(Const.CACHE_VALUE, synList);
			tempParam.put(Const.CACHE_DIRECTION, Const.CACHE_RESTORE_DIRECTION_LEFT);
			
			waitSynChannelTaskCache.add(tempParam);
		}

		/** 加载任务到hive表
		* @date: 2016-12-6 
		* @author: wangpei
		* @title: loadChannelTaskToHive 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void loadChannelTaskToHive(Map<String, Object> tempInParam)throws StrategyError {
			rmChannelTaskInfoHive.loadAddChannelTaskToHive(tempInParam);
			//rmTaskServiceNoInfoHive.loadAddTaskServiceNoToHive(tempInParam);
		}

		/**
		 * 插入批量push任务
		* @date: 2016-10-18 
		* @author: sunliang 
		* @title: insertBatchPushTask 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertBatchPushTask(Map<String,Object> tempInParam) {
			
			String taskId = (String)tempInParam.get("taskId");
			String rowKey = hbaseRowKey.getBatchPushTaskRowkey(tempInParam);
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			tempInParam.put("seqId", taskId);
			tempInParam.put("taskId", taskId);

			Map<String,String> param = hbaseQualifier.getBatchPushTaskQualifier(tempInParam);
			
			log.debug("TaskInsertor.insertBatchPushTask.tempParam", tempParam);
			log.debug("TaskInsertor.insertBatchPushTask.param", param);
			
			rmBatchPushTaskInfoHbase.insert(tempParam,param);
		}
		
		/**
		 * 插入批量push生成任务数
		* @date: 2017-1-9 
		* @author: sunliang 
		* @title: insertBatchPushCreateTaskCount 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertBatchPushCreateTaskCount(Map<String, Object> tempInParam) {
			
			String marketCaseId = (String)tempInParam.get("marketCaseId");
			String currentDate = (String)tempInParam.get("currentDate");
			String key = Const.CACHE_DATATYPE_STATISTIC + "createTaskCount"
					+ Const.SEPARATOR_COLON + marketCaseId
					+ Const.SEPARATOR_COLON + currentDate;
			
			statisticCache.add(key);
			
			//rmBatchPushTaskCountInfo.insert(tempParam, param);
		}
		
		/** 
		 * 插入push任务处理异常数据
		* @date: 2016-11-5 
		* @author: songxj
		* @title: insertBatchPushTaskExcep 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertBatchPushTaskExcep(Map<String, Object> tempInParam) {
			
			String rowKey = hbaseRowKey.getBatchPushTaskExcepRowkey(tempInParam);
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			
			Map<String, String> param = new HashMap<String, String>();
			param.put("unused", "unused");
			
			rmBatchPushTaskExcepInfoHbase.insert(tempParam,param);
		}
		
		/**
		 * 插入push任务处理成功数据
		* @date: 2017-2-27 
		* @author: zhangjj_crmpd
		* @title: insertBatchPushTaskSucc 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertBatchPushTaskSucc(Map<String, Object> tempInParam) {
			String rowKey = hbaseRowKey.getBatchPushTaskSuccRowkey(tempInParam);
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			
			Map<String, String> param = new HashMap<String, String>();
			param.put("TASK_ID", (String) tempInParam.get("taskId"));
			param.put("MARKET_CASE_ID", (String) tempInParam.get("marketCaseId"));
			param.put("SEND_TIME", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));
			
			rmBatchPushTaskSuccInfoHbase.insert(tempParam,param);
			
		}
		
		/**
		 * 插入待发送批量push任务
		* @date: 2017-1-9 
		* @author: sunliang 
		* @title: insertWaitSendBatchPushTask 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertWaitSendBatchPushTask(Map<String, Object> tempInParam) {
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			String rowKey = hbaseRowKey.getWaitSendBatchPushTaskRowKey(tempInParam);
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			
			Map<String, String> param = new HashMap<String, String>();
			param.put("unused", "unused");
			
			rmWaitSendBatchPushTaskInfoHbase.insert(tempParam,param);
		}
		
		/** 
		* @date: 2017-2-27 
		* @author: wangpei
		* @title: insertChannelTask 
		* @param tempInParam
		* @param param
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		public void insertChannelTask(Map<String, Object> tempInParam,Map<String, Object> param) throws StrategyError {
			Map<String, Object> tempParam = iBatisFields.getRmChannelTaskInfoFields(tempInParam);
			rmChannelTaskInfo.insert(tempParam);
		}

		/**
		 * 插入渠道任务
		* @date: 2016-10-18 
		* @author: sunliang 
		* @title: insertChannelTask 
		* @param tempInParam
		* @param contentDetailList 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertChannelTaskHbase(Map<String,Object> tempInParam, Map<String,Object> param) throws StrategyError{
			String rowKey = hbaseRowKey.getChannelTaskRowkey(tempInParam);
			tempInParam.put(Const.NOSQL_ROWKEY, rowKey);
			Map<String,String> insertParam = hbaseQualifier.getRmChannelTaskInfoQualifier(tempInParam);
			rmChannelTaskInfoHbase.insert(tempInParam, insertParam);
		}

		/** 
		 * 插入push测试任务
		* @date: 2016-11-5 
		* @author: songxj
		* @title: insertBatchPushTaskVerify 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertBatchPushTaskVerify(Map<String, Object> tempInParam) {
			String rowKey = hbaseRowKey.getBatchPushTaskVerifyRowkey(tempInParam);
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			
			Map<String, String> param = hbaseQualifier.getBatchPushTaskVerifyQualifier(tempInParam);
			rmBatchPushTaskInfoHbase.insert(tempParam, param);
		}

		/** 
		 * 插入事件任务
		* @date: 2016-11-29 
		* @author: songxj
		* @title: insertEventTask 
		* @param tempInParamn
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertEventTask(Map<String, Object> tempInParamn) {
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			String rowKey = hbaseRowKey.getEventTaskRowkey(tempInParamn);
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			
			Map<String,String> param = hbaseQualifier.getEventTaskQualifier(tempInParamn);
			rmBatchPushTaskInfoHbase.insert(tempParam, param);
		}

		/** 
		* @date: 2016-12-7 
		* @author: wangpei
		* @title: insertRecommonedCloseHive 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		public void insertRecommonedCloseHive(Map<String, Object> tempInParam)
				throws StrategyError {
			rmRecommonedCloseInfoSpark.insert(tempInParam);
		}

		/**
		 * 插入任务调配信息
		* @date: 2016-12-15 
		* @author: zhangjj_crmpd
		* @title: insertTaskAdjust 
		* @param tempInParam
		* @param param
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertTaskAdjust(Map<String, Object> tempInParam,
				Map<String, Object> param) throws StrategyError {
			rmTaskAdjustInfo.insert(param);
		}
			/**
		 * 插入任务调配规则关系
		* @date: 2016-12-15 
		* @author: zhangjj_crmpd
		* @title: insertTaskAdjustRuleRelation 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertTaskAdjustRuleRelation(Map<String, Object> inParam,
				Map<String, Object> tempInParam) throws StrategyError {
			rmRelationRel.insert(tempInParam);
		}


	}
		
	/**
	 * 插入模板信息实现类
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: TempLateInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class TemplateInsertor implements ITemplateInsertor{
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
		 * 添加模板信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertMarketCaseTempById 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author:zhangjj_crmpd update_note:
		 */
		@Override
		public void insertTemplate(Map<String, Object> inParam,
				Map<String, Object> tempInParam) throws StrategyError {
			rmTemplateInfo.insert(tempInParam);
		}

		/**
		 * 插入关系信息
		* @date: 2016-11-11 
		* @author: tangaq
		* @title: insertRelationInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertRelationInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmRelationRel.insert(inParam);
		}
		
	}
	
	/**
	 * 测试数据插入操作实现
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: TestInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class TestInsertor implements ITestInsertor,Serializable {
		protected IRDBMSDML.ITestTable testTable;
		protected INosqlDML.IRmHbaseTestInfo rmHbaseTestInfoHbase;

		public void setRmHbaseTestInfoHbase(
				INosqlDML.IRmHbaseTestInfo rmHbaseTestInfoHbase) {
			this.rmHbaseTestInfoHbase = rmHbaseTestInfoHbase;
		}

		public void setTestTable(IRDBMSDML.ITestTable testTable) {
			this.testTable = testTable;
		}

		/**
		 * 测试数据插入
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: testInsert 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void testInsert(Map<String,Object> inParam) throws StrategyError{
			testTable.insert(inParam);
			//throw new StrategyError(ErrorCode.ERROR_CODE_00000,ErrorCode.ERROR_MSG_00000,ErrorCode.ERROR_DETAIL_MSG_00000);
		}
		
		/**
		 * 测试hbase数据插入
		* @date: 2016-11-20 
		* @author: sunliang 
		* @title: testHbaseInsert 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void testHbaseInsert(Map<String, Object> tempInParam)
				throws StrategyError {
			
			Map<String,String> param = new HashMap<String,String>();
			param.put(Const.NOSQL_ROWKEY, (String)tempInParam.get(Const.NOSQL_ROWKEY));
			param.put("test1", (String)tempInParam.get("test1"));
			param.put("test2", (String)tempInParam.get("test2"));
			
			rmHbaseTestInfoHbase.insert(param);
		}
	}
	
	/**
	 * 测试数据插入操作实现
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: TestInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class TestHbaseInsertor implements ITestHbaseInsertor,Serializable {
		
		protected INosqlDML.IRmHbaseTestInfo rmHbaseTestInfoHbase;
		
		
		public void setRmHbaseTestInfoHbase(
				INosqlDML.IRmHbaseTestInfo rmHbaseTestInfoHbase) {
			this.rmHbaseTestInfoHbase = rmHbaseTestInfoHbase;
		}

		/**
		 * 测试hbase数据插入
		* @date: 2016-11-20 
		* @author: sunliang 
		* @title: testHbaseInsert 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void testHbaseInsert(Map<String, Object> tempInParam)
				throws StrategyError {
			
			Map<String,String> param = new HashMap<String,String>();
			param.put(Const.NOSQL_ROWKEY, (String)tempInParam.get(Const.NOSQL_ROWKEY));
			param.put("test1", (String)tempInParam.get("test1"));
			param.put("test2", (String)tempInParam.get("test2"));
			
			rmHbaseTestInfoHbase.insert(param);
		}
		
	}
	
	
	
	/**
	 * 用户数据插入操作实现类
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: UserInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class UserInsertor implements IUserInsertor,Serializable{
		/**
		 * 异网号码池对象
		 */
		protected IRDBMSDML.IRmDifferentNetPhonePoolInfo rmDifferentNetPhonePoolInfo;
		/**
		 * 灰名单查询对象
		 */
		protected IRDBMSDML.IRmGreyInfo rmGreyInfo;
		
		protected INosqlDML.IRmGreyInfo rmGreyInfoHbase;
		/**
		 * 用户办理营销案表
		 */
		protected INosqlDML.IRmUserAcceptMarketCaseInfo rmUserAcceptMarketCaseInfoHbase;
		/**
		 * 用户标签查询对象
		 */
		protected IRDBMSDML.IRmUserLabelTmp rmUserLabelTmp;
		/**
		 * 用户推荐控制表
		 */
		protected INosqlDML.IRmUserRecommendControlInfo rmUserRecommendControlInfoHbase;
		/**
		 * 用户推荐营销案表
		 */
		protected INosqlDML.IRmUserRecommendMarketCaseInfo rmUserRecommendMarketCaseInfoHbase;

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
		 * 
		* @date: 2017-4-1 
		* @author: sunyuan
		* @title: setRmUserAcceptMarketCaseInfoHbase 
		* @param rmUserAcceptMarketCaseInfoHbase 
		* @exception: 
		* @version: 1.0 
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
		 * 
		* @date: 2017-4-10 
		* @author: sunyuan
		* @title: setRmUserRecommendMarketCaseInfoHbase 
		* @param rmUserRecommendMarketCaseInfoHbase 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmUserRecommendMarketCaseInfoHbase(
				INosqlDML.IRmUserRecommendMarketCaseInfo rmUserRecommendMarketCaseInfoHbase) {
			this.rmUserRecommendMarketCaseInfoHbase = rmUserRecommendMarketCaseInfoHbase;
		}

		/** 
		 * 批量插入灰名单
		* @date: 2016-10-20 
		* @author: xiongxq
		* @Title: insertBatchGrey 
		* @param inParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertBatchGrey(Map<String, Object> inParam)throws StrategyError {
			rmGreyInfo.insert(inParam);
		}

		/** 
		 * 添加异网号码池
		* @date: 2016-10-31 
		* @author: xiongxq
		* @Title: insertDifferentNetPhonePool 
		* @param inParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertDifferentNetPhonePool(Map<String, Object> inParam)
				throws StrategyError {
			rmDifferentNetPhonePoolInfo.insert(inParam);
		}
		
		/**
		 * 插入hbase黑名单信息表
		* @date: 2016-12-6 
		* @author: zhangjj_crmpd
		* @title: insertGreyInfo2NoSql 
		* @param inParam
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		 * @throws Exception 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertGreyInfo2NoSql(Map<String, Object> tempInParam,Map<String, String> inParam) throws StrategyError{
			String rowKey = hbaseRowKey.getGreyRowKey(tempInParam);
			tempInParam.put(Const.NOSQL_ROWKEY, rowKey);
			rmGreyInfoHbase.insert(tempInParam, inParam);
		}
		
		/** 
		 * 保存单个灰名单
		* @date: 2016-10-20 
		* @author: xiongxq
		* @Title: insertSingleGrey 
		* @param inParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void insertSingleGrey(Map<String, Object> inParam)throws StrategyError {
			log.info("insertSingleGrey inParam", inParam);
			rmGreyInfo.insert(inParam);
		    }
		
		/**
		 * 插入用户办理营销案表
		* @date: 2017-3-31 
		* @author: sunyuan
		* @title: insertUserAcceptMarketCase 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertUserAcceptMarketCase(Map<String,Object> inParam)throws StrategyError{
			Map<String,Object> tempInParam = new HashMap<String,Object>();
			tempInParam.put(Const.NOSQL_ROWKEY, (String)inParam.get("marketCaseId") + ":" + inParam.get("idNo"));
			
			Map<String,String> param = hbaseQualifier.getInsertUserAcceptMarketCaseQualifier(tempInParam);
			rmUserAcceptMarketCaseInfoHbase.insert(tempInParam,param);
		}
		
		/**
		 * 新增用户标签
		* @date: 2016-10-24 
		* @author: fangyuan_crmpd
		* @title: insertUserLabel 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertUserLabel(Map<String, Object> inParam, Map<String,Object> tempInParam)
				throws StrategyError {
			rmUserLabelTmp.insertUserLabel(tempInParam);
		}
		
		/**
		 * 插入用户推荐控制信息
		* @date: 2016-11-15 
		* @author: yangwl
		* @title: insertUserRecommendControl 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertUserRecommendControl(Map<String, Object> inParam,Map<String, Object> tempInParam){
			String rowKey = hbaseRowKey.getUserRecommendControlByBatchNoRowkey(tempInParam);
			Map<String,String> param = hbaseQualifier.getInsertUserRecommendControlQualifier(inParam,tempInParam);
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			rmUserRecommendControlInfoHbase.insert(tempParam, param);
		}
		
		/**
		 * 插入用户推荐控制信息
		* @date: 2016-11-15 
		* @author: yangwl
		* @title: insertUserRecommendControlByChannel 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertUserRecommendControlByChannel(Map<String, Object> inParam,Map<String, Object> tempInParam){
			String rowKey = hbaseRowKey.getUserRecommendControlByChannelRowkey(tempInParam);
			
			Map<String,String> param = hbaseQualifier.getInsertUserRecommendControlByChannelQualifier(inParam, tempInParam);
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			rmUserRecommendControlInfoHbase.insert(tempParam, param);
		}

		/**
		 * 插入用户推荐营销案信息
		* @date: 2017-4-10 
		* @author: sunyuan
		* @title: insertRecommendMarketCase 
		* @param inParam
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertRecommendMarketCase(Map<String, Object> inParam,Map<String, Object> tempInParam){
			String rowKey = hbaseRowKey.getUserRecommendMarketCaseRowkey(tempInParam);
			Map<String,String> param = hbaseQualifier.getInsertUserRecommendMarketCaseQualifier(inParam, tempInParam);
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			
			rmUserRecommendMarketCaseInfoHbase.insert(tempParam, param);
		}
		
   }
	
	/**
	 * 操作日志插入器
	 * 
	 * @date: 2017-3-9
	 * @author: yueyi
	 * @title: OperLogInsertor
	 * @version: 1.0
	 * @description： update_version: update_date: update_author: update_note:
	 */
	public class OperLogInsertor implements IOperLogInsertor {

		protected INosqlDML.IRmOperLogInfo rmOperLogInfoHbase;

		public void setRmOperLogInfoHbase(INosqlDML.IRmOperLogInfo rmOperLogInfoHbase) {
			this.rmOperLogInfoHbase = rmOperLogInfoHbase;
		}

		/**
		 * 插入操作日志
		 * @date: 2017-3-9
		 * @author: yueyi
		 * @title: insertOperLogInfo
		 * @param inParam
		 * @return
		 * @exception:
		 * @version: 1.0
		 * @description: update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insertOperLogInfo(Map<String, Object> inParam) throws StrategyError {
			String rowKey = hbaseRowKey.getOperLogInfoRowKey(inParam);
			log.info("第四步ok",rowKey);

			Map<String, String> tempInParam = new HashMap<String,String>();
			for (Map.Entry<String, Object> entry : inParam.entrySet()) {
				tempInParam.put(CommonUtils.camelToUnderline(entry.getKey()), (String) entry.getValue());
			}
			tempInParam.put(Const.NOSQL_ROWKEY,rowKey);
			
			log.info("第五步ok", tempInParam);
			rmOperLogInfoHbase.insertOperLogInfo(tempInParam);
		}
	}

	
	/**
	 * 作业配置插入接口
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: WorkCofigInsertor 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class WorkConfigInsertor implements IWorkConfigInsertor{
		
		protected IRDBMSDML.IRmWorkCofigInfo rmWorkCofigInfo;
		
		public void setRmWorkCofigInfo(IRDBMSDML.IRmWorkCofigInfo rmWorkCofigInfo) {
			this.rmWorkCofigInfo = rmWorkCofigInfo;
		}
		
		/**
		 * 插入作业配置
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: insert 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insert(Map<String, Object> inParam) throws StrategyError {
			rmWorkCofigInfo.insert(inParam);
		}
	}
	/**
	 * 调查问卷插入接口
	* @date: 2016-12-12 
	* @author: zhangqia
	* @Title: QuestionNaireInsertor 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class QuestionNaireInsertor implements IQuestionNaireInsertor{
		
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
		 * 增加营销案和问卷调查ID关系到缓存
		* @date: 2016-12-22 
		* @author: yuanliang
		* @title: addQuestionMarketCaseToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void addQuestionMarketCaseToCache(Map<String, Object> tempInParam)
				throws StrategyError {
			marketCaseQuestionCache.add(tempInParam);			
		}
		
		/**
		 * 插入调查问卷
		* @date: 2016-12-12 
		* @author: zhangqia
		* @Title: insert 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void insert(Map<String, Object> inParam) throws StrategyError {
			rmQuestionNaireInfo.insert(inParam);
		}
	}
}
