package com.sitech.strategy.persist.capacity.proxy;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 数据插入器
* @date: 2016-9-5 
* @author: zhaoyue
* @title: IDataInsertor 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IDataInsertor {
	
	/**
	 * 活动需求插入接口
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: IActDemandInsertor 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IActDemandInsertor{
		
		/**
		 * 插入活动需求
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
		public void insert(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 附件数据插入接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: IAttachInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IAttachInsertor{
		
		/**
		 * 批量添加附件
		* @date: 2016-10-20 
		* @author: wangth
		* @Title: insertBatchAttachs  
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertBatchAttachs(List<Map<String,Object>> list);
		
		/**
		 * 保存附件到附件表
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertAttachs 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertAttachs(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 保存图片到附件表
		* @date: 2016-10-1 
		* @author: sunliang
		* @title: insertAttachsPicture 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertAttachsPicture(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 审批记录数据插入操作接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: IAuditInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IAuditInsertor{

		/**
		 * 保存审批记录
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
		public void insertAuditRecord(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 保存审批工号
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
		public void insertAuditNo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 渠道数据插入操作接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: IChannelInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IChannelInsertor{
		
		/**
		 * 添加渠道信息
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
		public void insertChannelInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void insertChannelShowNumToCache(Map<String,Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 渠道显示插入数据操作接口
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: IChannelInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IChannelShowInsertor{
		
		/**
		 * 插入渠道显示信息
		* @date: 2016-10-18 
		* @author: fangyuan_crmpd
		* @title: insertChannelInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertChannelShowInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 公共数据插入操作接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: ICommonInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ICommonInsertor{
		
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
		public void addResultListToCache(Map<String, Object> tempInParam) throws StrategyError;
		
	}
	
	/**
	 * 配置插入操作接口
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: IConfigInsertor 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IConfigInsertor{
		
		/**
		 * 插入选项配置
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
		public void insertOptionInfo(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 内容数据插入操作接口
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: IContentInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IContentInsertor{
		
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
		public void insertContentInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void insertContentDetailInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void insertRelation(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 反馈数据插入接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: ICoupleBackInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ICoupleBackInsertor{
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
		public void addRecommonedCloseToCache(Map<String,Object> tempInParam) throws StrategyError;
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
		public void insertClickRecordInfo(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 插入用户接触接触记录
		* @date: 2016-11-14 
		* @author: yangwl
		* @title: insertContactRecordInfo 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertContactRecordInfo(Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError;

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
		public void insertChannelCallContactInfo(Map<String,Object> tempInParam) throws StrategyError;
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
		public void insertChannelSMSContactInfo(Map<String,Object> tempInParam) throws StrategyError;
		/**
		 * 插入反馈信息
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
		public void insertPushArriveInfo(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void insertReceiptRecordInfo(Map<String,Object> tempInParam) throws StrategyError;
		
		/** 插入推荐关闭表
		* @date: 2016-11-30 
		* @author: wangpei
		* @title: insertRecommendClose 
		* @param tempInParam
		* @param tempInParam2 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public void insertRecommendClose(Map<String, Object> tempInParam, Map<String, Object> param);

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
		public void insertRecommendRecord(Map<String, Object> inParam,Map<String, Object> tempInParam);
		
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
		public void insertSMSAcceptRecordInfo(Map<String,Object> tempInParam) throws StrategyError;
		
		/** 插入短信上行信息
		* @date: 2016-11-3 
		* @author: wangpei
		* @title: insertSMSPullInfo 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public void insertSMSPullInfo(Map<String,Object> tempInParam) throws StrategyError;

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
		public void insertAcceptRecordInfo(Map<String,Object> inParam,Map<String,String> tempInParam) throws StrategyError ;
		
		/**
		 * 用户受理营销案表
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
		public void insertUserAcceptMarketcaseInfo(Map<String,Object> inParam,Map<String,String> tempInParam) throws StrategyError ;
		
	}
	
	/**
	 * 客户群数据插入操作接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: ICustGroupInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ICustGroupInsertor{
		
		/**
		 * 添加客户群标签到缓存
		* @date: 2016-12-29 
		* @author: sunliang 
		* @title: addCustGroupLabelToCache 
		* @param custGroupLableCache
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void addCustGroupLabelToCache(Map<Object,Object> custGroupLableCache) throws StrategyError;
		
		/**
		 * 添加客户群标签Hive表名到缓存
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
		public void addCustGoupLabelHiveTableNameToCache(Map<String, Object> tempInParam) throws StrategyError;
		
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
		public void custGroupDetailLoadToHive(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void custGroupLabelLoadToHive(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void createCustGroupHiveTable(Map<String,Object> inParam,Map<String, Object> tempInParam) throws StrategyError;

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
		public void createCustGroupDetailHbaseTable(Map<String,Object> inParam,Map<String, Object> tempInParam) throws StrategyError;		
		
		/**
		 * 使用spark创建客户群明细表
		* @date: 2017-2-11
		* @author: luogj
		* @title: createCustGroupDetailTableSpark 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */		
		public void createCustGroupDetailSparkTable(Map<String,Object> inParam,Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 创建动态标签客户群明细的文件
		* @date: 2017-2-16
		* @author: luogj
		* @title: createLabelCustGroupDetailFileDynamic 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void createLabelCustGroupDetailFileDynamic(Map<String,Object> inParam) throws StrategyError ;	
		
		/**
		 * 创建静态标签客户群明细的文件
		* @date: 2017-2-16
		* @author: luogj
		* @title: createLabelCustGroupDetailFileStatic 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void createLabelCustGroupDetailFileStatic(Map<String,Object> inParam) throws StrategyError ;		
		
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
		public void createRelateStaticLabelCustGroupTableToHive(Map<String, Object> inParam) throws StrategyError;
		
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
		public Map<String,Object> insertCustGroupDetailHbase(Map<String,Object> inParam,Map<String,String> tempInParam) throws StrategyError;
		
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
		public void insertCustGroupDetailSparkTable(Map<String,Object> inParam,Map<String, Object> tempInParam) throws StrategyError;
		
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
		public void insertCustGroupDetail(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void insertCustGroupAttribute(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void insertCustGroupHandleRecord(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
		
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
		public void insertCustGroupLabel(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
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
		public Map<String,Object> insertCustGroupLabelHbase(Map<String,Object> inParam,Map<String,String> tempInParam) throws StrategyError;
		
		/**
		 * 添加客户群信息
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
		public void insertCustGroup(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void insertCustGroupRelation(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
		
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
		public void insertCustGroupFile(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 批量添加客户群明细
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: insertBatchCustGroupDetail 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertBatchCustGroupDetail(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;

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
		public void insertStaticLabelCustGroupTableInfo(Map<String, Object> inParam) throws StrategyError;
		
	}
	
	/**
	 * 评估统计数据插入操作接口
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: IEvaluateInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IEvaluateInsertor{
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
		public void insertMarketCaseOrderReportData(Map<String,Object> Param) throws StrategyError;

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
		public void insertProductCommodityReportData(Map<String, Object> inParam);

	}
	
	
	/**
	 * 事件数据插入操作接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: IEventInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IEventInsertor{

		/**
		 * 增加缴费事件数据到缓存
		* @date: 2017-2-13 
		* @author: sunyuan
		* @title: addFeeAndEventRelToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Deprecated
		public void addFeeAndEventRelToCache(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void addPayFeeEventAndMarketCaseRelToCache(Map<String, List<Map<String, Object>>> payFeeEventAndMarketCaseRelCache) throws StrategyError;
		
		/**
		 * 增加产品事件数据到缓存
		* @date: 2016-11-24 
		* @author: yuanliang
		* @title: addProductAndEventRelToCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void addProductAndEventRelToCache(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 增加事件信息
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
		public void insertEventInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 增加事件详细信息
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
		public void insertEventDetailInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	
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
		public void insertRelationInfo(Map<String, Object> newInParam) throws StrategyError;

	}
	
	/**
	 * 清单数据插入操作接口
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: IInventoryInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IInventoryInsertor{
		
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
		public void insertInventoryInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	
	}
	
	/**
	 * 登录(权限、角色、菜单)数据插入操作接口
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: ILoginInsertor 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ILoginInsertor{
		
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
		public void insertLoginNo(Map<String,Object>inParam) throws StrategyError;
		
		/**
		 * 批量插入角色与用户关系
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
		public void insertBatchRoleUserRel(Map<String,Object>inParam) throws StrategyError;
		
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
		public void insertRoleMenuRel(List<Map<String, Object>> list) throws StrategyError;
		
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
		public void insertRoleUserRel(Map<String,Object>inParam) throws StrategyError;
		
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
		public void insertMenuInfo(Map<String,Object> inParam) throws StrategyError;
		/**
		 * 
		* @date: 2016-10-26 
		* @author:
		* @title: insertMenuInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insert(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 营销案数据插入操作接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: IMarketCaseInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IMarketCaseInsertor{
		
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
/*		public void addBatchPushMarketCaseAndCustGroupToCache(Map<String, Object> tempInParam) throws StrategyError;*/
		
		/**
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
		 */
		//public void addBatchPushTaskStatusCodeToCache(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void addWaitCreateCallTaskMarketCaseCache(Map<String, Object> tempInParam) throws StrategyError;
		
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
		public void addWaitCreateChannelTaskMarketCaseCache(Map<String, Object> tempInParam) throws StrategyError;
		
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
		public void addMarketCaseDetailToCache(Map<String,IMarketCaseCachePojo> marketCaseCachePojoMap) throws StrategyError;
		
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
		public void addChannelTriggerMarketCaseToCache(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 增加待生成批量push营销案到缓存
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
		public void addWaitCreateBatchPushMarketCaseToCache(Map<String, Object> tempInParam,String param) throws StrategyError;
		
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
		public void addWaitSendBatchPushMarketCaseToCache(Map<String,List<Map<Object, Object>>> tempInParam) throws StrategyError;
		
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
		public void addEventTriggerMarketCaseToCache(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void addMarketCaseRecommendStatusToCache(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 插入关系信息
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
		public void insertRelationInfo(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 插入营销案信息
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
		public void insertMarketCase(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void addMarketCaseRecommendCountByChannel(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void addMarketCaseRecommendCountByChannelAndDate(Map<String,Object> tempInParam) throws StrategyError;

	}
	
	/**
	 * 监控插入操作接口
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: IMonitorWarningInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IMonitorInsertor{
		
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
		public void insertWorkOperWarningInfo(Map<String,Object> inParam) throws StrategyError;
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
		public void addServiceMonitoringCache(Map<String,Object> inParam) throws StrategyError;
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
		public void insertServiceMonitoring(Map<String,Object> inParam) throws StrategyError;

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
	public interface IOperationLogInsertor{
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
		public void insertMessageTriggerLogInfo(Map<String,Object> inParam) throws StrategyError;
	}
	
	
	/**
	 * 运营位插入操作接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: IPositionInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IPositionInsertor{
		
		/**
		 * 添加运营位信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertPositionInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertPositionInfo(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 添加运营位属性信息
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: insertPositionAttrInfo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertPositionAttrInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 优先级数据插入操作接口
	* @date: 2016-10-15 
	* @author: fangyuan_crmpd
	* @title: IPriorityInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IPriorityInsertor{
		
		/**
		 * 增加区域优先级信息
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
		public void insertAreaPriorityInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 新增用户群优先级
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
		public void insertCustGroupPriorityInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 规则数据插入操作接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: IRuleInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IRuleInsertor{
		
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
		public void addCloseRuleToCache(Map<String,Object> tempParam)throws StrategyError;
		
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
		public void addEvaluateRuleToCache(Map<String,Object> tempParam)throws StrategyError;
		
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
		public void addGlobalRuleToCache(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 增加全局规则
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
		 public void insertGlobalRule (Map<String,Object>inParam) throws StrategyError;
		 
		 /**
		  * 加载互斥规则到缓存
		 * @date: 2017-3-30 
		 * @author: sunyuan
		 * @title: addMutexRuleToCache 
		 * @param tempParam
		 * @throws StrategyError 
		 * @exception: 
		 * @version: 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note:
		  */
		 public void addMutexRuleToCache(Map<String,Object> tempParam)throws StrategyError;
		 
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
		public void insertRelationInfo(Map<String,Object> inParam) throws StrategyError;

		/**
		 * 增加规则详细信息
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
		public void insertRuleDetailInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;

		/**
		 * 增加规则信息
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
		public void insertRuleInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
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
				throws StrategyError;
	}
	
	/**
	 * 短信插入接口
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: IShortMessage 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IShortMessageInsertor{
		
		/**
		 * 添加短信接入码
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: insertShortMessageAccessCode 
		* @param inParam
		* @param tempInParam 
		* @version 1.0 
		* @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertShortMessageAccessCode(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 给某个工号添加接入码
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
		public void insertAccessCode(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 *给某个工号批量添加接入码 
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
		public void insertBatchAccessCode(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 数据统计接口
	* @date: 2016-12-20 
	* @author: sunliang 
	* @title: IStatisticInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IStatisticInsertor{
		
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
		public void insertBusiTypeAcceptStatistic(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void insertBusiTypeStatistic(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 插入按渠道类型统计受理数据
		* @date: 2017-2-16 
		* @author: tangaq
		* @title: insertChannelAcceptStatistic 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
        public void insertChannelAcceptStatistic(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void insertChannelRecommonedStatistic(Map<String,Object> tempInParam) throws StrategyError;

		
		/**
		 * 插入公告
		* @date: 2017-3-1 
		* @author: yexr
		* @title: insertNotice 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		 * @return 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertNotice(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void insertRealContactStatistic(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void insertMarketCaseOrderStatistic(Map<String,Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 系统处理插入操作接口
	* @date: 2016-10-13 
	* @author: yangwl
	* @title: ISystemDealInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ISystemDealInsertor{
		/**
		 * 插入任务执行数据
		* @date: 2016-10-13 
		* @author: yangwl
		* @title:  insertShellProcessExecuteInfo
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertShellProcessExecuteInfo(Map<String,Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 任务数据插入接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: ITaskInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ITaskInsertor{
	
		/** 增加任务同步缓存
		* @date: 2016-12-16 
		* @author: wangpei
		* @title: addChannelTaskSynCache 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public void addChannelTaskSynToCache(Map<String,Object> tempInParam);

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
		public void loadChannelTaskToHive(Map<String,Object> tempInParam) throws StrategyError ;
		
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
		public void insertBatchPushCreateTaskCount(Map<String,Object> tempInParam);
		
		/** 
		 * 插入push任务处理异常数据
		* @date: 2016-11-5 
		* @author: songxj
		* @title: insertBatchPushTaskExcep 
		* @param tempInParam
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public void insertBatchPushTaskExcep(Map<String,Object> tempInParam);
		
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
		public void insertBatchPushTaskSucc(Map<String,Object> tempInParam);
		
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
		public void insertWaitSendBatchPushTask(Map<String,Object> tempInParam);
		
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
		public void insertBatchPushTask(Map<String,Object> tempInParam);
		
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
		public void insertBatchPushTaskVerify(Map<String,Object> tempInParam);
		
		/** 插入渠道任务oracle
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
		public void insertChannelTask(Map<String,Object> tempInParam, Map<String,Object> param) throws StrategyError;
		
		/**
		 * 插入渠道任务Hbase
		* @date: 2016-10-17 
		* @author: sunliang 
		* @title: insertChannelTask 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertChannelTaskHbase(Map<String,Object> tempInParam, Map<String,Object> param) throws StrategyError;
		
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
		public void insertEventTask(Map<String,Object> tempInParamn);
		
		/** 推荐关闭数据入hive
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
		public void insertRecommonedCloseHive(Map<String,Object> tempInParam) throws StrategyError ;
		
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
		public void insertTaskAdjust(Map<String,Object> inParam, Map<String,Object> tempInParam) throws StrategyError;
		
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
		public void insertTaskAdjustRuleRelation(Map<String,Object> inParam, Map<String,Object> tempInParam) throws StrategyError;
		

		/** 插入任务工号数据
		* @date: 2016-12-6 
		* @author: wangpei
		* @title: insertTaskServiceNo 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
/*		public void insertTaskServiceNo(Map<String,Object> tempInParam, Map<String,String> param);*/
	}
	
	/**
	 * 插入模板信息接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: ITemplateInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ITemplateInsertor{
		
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
		public void insertTemplate(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	
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
		public void insertRelationInfo(Map<String,Object> inParam) throws StrategyError;
		
	}
	
	/**
	 * 测试数据插入操作
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: ITestInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ITestInsertor{
		
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
		public void testInsert(Map<String,Object> inParam) throws StrategyError;
		
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
		public void testHbaseInsert(Map<String,Object> tempInParam) throws StrategyError;
		
	}
	
	/**
	 * 测试数据插入操作
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: ITestInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ITestHbaseInsertor{
		
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
		public void testHbaseInsert(Map<String,Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 用户数据插入操作接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: IUserInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IUserInsertor{
		
		/**
		 *批量保存灰名单 
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
		public void insertBatchGrey(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 *添加异网号码池 
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
		public void insertDifferentNetPhonePool(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 插入hbase黑名单信息表
		* @date: 2016-12-6 
		* @author: zhangjj_crmpd
		* @title: insertGreyInfo2NoSql 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		 * @throws Exception 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertGreyInfo2NoSql(Map<String, Object> tempInParam,Map<String, String> inParam) throws StrategyError;
		
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
		public void insertSingleGrey(Map<String,Object> inParam) throws StrategyError;
		
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
		public void insertUserAcceptMarketCase(Map<String,Object> inParam)throws StrategyError;
		
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
		public void insertUserLabel(Map<String,Object> inParam, Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 插入用户推荐控制信息
		* @date: 2017-2-12 
		* @author: sunliang 
		* @title: insertUserRecommendControl 
		* @param inParam
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertUserRecommendControl(Map<String, Object> inParam,Map<String, Object> tempInParam);
		
		/**
		 * 插入用户推荐控制信息
		* @date: 2017-2-12 
		* @author: sunliang 
		* @title: insertUserRecommendControlByChannel 
		* @param inParam
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertUserRecommendControlByChannel(Map<String, Object> inParam,Map<String, Object> tempInParam);
		
		/**
		 * 插入用户推荐营销案信息
		* @date: 2017-4-10 
		* @author: sunyuan
		* @title: insertUserRecommendMarketCase 
		* @param inParam
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertRecommendMarketCase(Map<String, Object> inParam,Map<String, Object> tempInParam);
	}
	
	/**
	 * 操作日志插入接口
	* @date: 2017-3-9 
	* @author: yueyi
	* @title: IOperLogInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IOperLogInsertor{
		
		/**
		 * 插入操作日志
		* @date: 2017-3-9 
		* @author: yueyi
		* @title: insertOperLogList 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insertOperLogInfo(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 作业配置插入接口
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: IWorkConfig 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IWorkConfigInsertor{
		
		/**
		 * 插入作业信息
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: insert 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insert(Map<String,Object> inParam) throws StrategyError;
	}	
	/**
	 * 问卷调查插入接口
	* @date: 2016-12-12 
	* @author: zhangqia
	* @Title: IQuestionNaireInsertor 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IQuestionNaireInsertor{
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
		public void addQuestionMarketCaseToCache(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 插入问卷调查信息
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: insert 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void insert(Map<String,Object> inParam) throws StrategyError;
	}
}
