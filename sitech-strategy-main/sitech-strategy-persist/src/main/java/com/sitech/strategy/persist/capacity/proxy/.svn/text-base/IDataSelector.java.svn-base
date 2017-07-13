package com.sitech.strategy.persist.capacity.proxy;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.ResultItemPojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 数据查询器
* @date: 2016-9-5 
* @author: zhaoyue
* @title: IDataSelector 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IDataSelector {
	/**
	 * 活动需求插入接口
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: IActDemandInsertor 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IActDemandSelector{
		
		/**
		 * 查询活动需求列表
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
		public List<Map<String,Object>> select(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	}
	/**
	 * 附件数据查询操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IAttachSeletor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IAttachSelector{
		
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
		@Deprecated
		public List<Map<String, Object>> selectAttachs(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		
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
		public List<Map<String, Object>> selectAttachs(Map<String, Object> inParam) throws StrategyError;
	}

	/**
	 * 审批记录数据查询操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IAuditSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IAuditSelector{
		
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
		public List<Map<String,Object>> selectAuditRecordDetailListByMarketCaseId(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;

		/**
		 * 查询审批人列表
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
		public List<Map<String,Object>> selectAuditNoList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询业务审批工号
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
		public List<Map<String,Object>> selectBusiAuditNoList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询下载审批记录列表
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
		public List<Map<String,Object>> selectDownLoadAuditRecordList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
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
		public List<Map<String,Object>> selectMarketCaseAuditRecordList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public Map<String,Object> selectMarketCaseAuditNum(Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError;
	
	}
	
	/**
	 * hbase 批量push任务查询
	* @date: 2016-9-29 
	* @author: yangwl
	* @title: IBatchPushTaskSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IBatchPushTaskSelector{

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
		public Map<String, String> selectBatchPushTaskById(String taskId) throws StrategyError;
		
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
		public String selectBatchPushCreateTaskCount(Map<String, Object> tempInParam) throws StrategyError;
		
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
		public String selectBatchPushSendTaskCount(Map<String, Object> tempInParam) throws StrategyError;
		
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
		public Map<String,Map<String,Map<String,String>>> selectWaitSendBatchPushTask(Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError;
		
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
		public Map<String,Map<String,Map<String,String>>> selectWaitSendBatchEventTask(Map<String, Object> tempInParam) throws StrategyError;

		/**
		 * 查询校验成功文件名和添加批量计划
		* @date: 2017-4-26 
		* @author: chenhao
		* @title: checkFileAndAddBatchExePlan 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String, Object> checkFile(String checkFileBean) throws StrategyError;

		/**
		 * 添加批量计划
		* @date: 2017-4-26 
		* @author: chenhao
		* @title: addBatchExePlan 
		* @param string
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String, Object> addBatchExePlan(String addBatchExePlan) throws StrategyError;
	}

	/**
	 *  渠道数据查询操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IChannelSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IChannelSelector{
		
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
		public List<Map<String,Object>>  getChannelShowNumFromCache(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 
		* @date: 2016-12-28 
		* @author: sunliang 
		* @title: selectChannelShowNum 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectChannelShowNum() throws StrategyError;
		
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
		public List<Map<String,Object>>  selectChannelInfo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;

	}
	
	/**
	 * 渠道显示数据查询操作接口
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: IChannelShowSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IChannelShowSelector{
		
		/**
		 * 查询渠道显示信息
		* @date: 2016-10-19 
		* @author: fangyuan_crmpd
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
		public List<Map<String,Object>>  selectChannelShowInfo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	}
		
	/**
	 * 公共数据查询操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: ICommonSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ICommonSelector{
		
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
		public List<Map<String,Object>> selectCodeName(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询codename(新)
		* @date: 2017-2-8 
		* @author: sunyuan
		* @title: selectCodeName 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectCodeName(Map<String, Object> tempInParam) throws StrategyError;

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
		public List<Map<String, Object>> descTable(Map<String, Object> tempInParam) throws StrategyError; 
		
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
		public String selectDataBaseSysTime();
		
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
		public Map<String,Object> selectLabelValueByLabelCode(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public Map<String,Object> selectShortMsgAccessCode(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询hive数据库中的表名
		* @date: 2016-11-25 
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
		public List<Map<String, Object>> showTables(Map<String, Object> tempInParam) throws StrategyError; 
		
		/**
		 * 指定页数返回查询结果
		* @date: 2016-10-1 
		* @author: sunliang
		* @title: getResultListFromCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<ResultItemPojo> getResultListFromCache(Map<String,Object> tempInParam) throws StrategyError;

	}
	
	/**
	 * 配置查询操作接口
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: IConfigSelector 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IConfigSelector{
		/**
		 * 查询选项配置列表
		* @date: 2016-10-24 
		* @author: xiongxq
		* @Title: selectOptionConfigList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectOptionConfigList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	}
	
	/**
	 * 内容数据查询操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IContentSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IContentSelector{
		
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
		public Map<String,Object> selectContentInfo(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;

		/**
		 * 查询内容详细信息
		* @date: 2016-10-1 
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
		public List<Map<String,Object>> selectContentDetailList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 根据产品id查询内容明细
		* @date: 2017-4-3 
		* @author: sunyuan
		* @title: selectContentDetailsByProdId 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectContentDetailsByProdId(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 根据事件ID和营销案ID查询内容明细
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
		public List<Map<String,Object>> selectContentDetailsByEventIdAndMarketCaseId(Map<String,Object> tempInParam) throws StrategyError;

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
		public List<Map<String,Object>> selectMarketCaseTermList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;

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
		public List<Map<String,Object>> selectProdList(Map<String,Object> inParam) throws StrategyError;
		
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
		public List<Map<String,Object>> selectContentDetailId(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/** 查询关系
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
		public Map<String,Object> selectRelation(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;

	}
	
	/**反馈查询
	* Create on 2016-12-1
	* @author: wangpei
	* @Title:ICoupleBackSelector
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public interface ICoupleBackSelector{
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
		public String getChannelTaskRecommonedCloseCache() throws StrategyError;
		
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
		public Map<String,String> selectRecommendRecordInfo(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 查询用户推荐营销案件信息
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
		public Map<String,String> selectUserRecommendMarketCaseInfo(Map<String,Object> tempInParam) throws StrategyError;
	}
	/**
	 * 客户群数据查询操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: ICustGroupSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ICustGroupSelector{
		
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
		public List<Map<String, Object>> getCustGroupDetailCountFromHive(Map<String, Object> custGroupIdInParam) throws StrategyError;
		
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
		public String getCustGroupLabelFromCache(Map<String,Object> tempInParam) throws StrategyError;

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
		public List<Map<String,Object>> selectAllCustGroupLabelList() throws StrategyError;

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
		public Map<String, Map<String,Map<String,String>>> selectCocCustomerGroupByRowKey(Map<String, Object> tempInParam) throws StrategyError;

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
		public Map<String ,Object> selectCustGroupAttribute(Map<String, Object> tempInParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public List<Map<String, Object>> selectAllCustGroupAttribute()throws StrategyError;
		
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
		public List<Map<String, Object>> selectCustGroupCountByUserLabel(Map<String, Object> tempInParam) throws StrategyError;

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
		public List<Map<String, Object>> selectLabelFormulaRestrictCountById(Map<String, Object> inParam) throws StrategyError;
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
		public List<Map<String,Object>> selectCustGroupHandleRecord(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public List<Map<String,Object>> selectCustGroupList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public Map<String,Object> selectCustGroupListByPage(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
		
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
		public Map<String,Object> selectCustGroupLabel(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public Map<String,Object> selectCustGroupLabelItem(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 *  查询客户群数量
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
		public Map<String,Object> selectCustGroupCountById(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 根据serviceNo查询目标客户群明细
		* @date: 2016-10-1 
		* @author: zhaoyue
		* @title: selectCustGroupDetailByIdNo 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String,String> selectCustGroupDetailByIdNo(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 根据客户群ID查询客户群关系列表
		* @date: 2016-11-24 
		* @author: fangyuan_crmpd
		* @title: selectCustGroupRelationListByCustGroupId 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectCustGroupRelationListByCustGroupId(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询客户群有无绑定活动
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
		public List<Map<String,Object>> selectCustGroupAndActRealation(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/** 查询自定义标签信息（导入，数据源）
		* @date: 2017-2-21 
		* @author: wangpei
		* @title: selectLoadCustGroupLabel 
		* @param inParam
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public Map<String,String> selectCustGroupCustomLabel(Map<String, Object> inParam,Map<String,Object> tempInParam) throws StrategyError;

		/**
		 * 查询插入表的客户群数量
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
		public Map<String, Object> selectCustGroupDetailCountInSparkTable(Map<String, Object> tempInParam) throws StrategyError;
		

	}
	
	/**
	 * 评估数据查询操作接口
	* @date: 2016-11-25 
	* @author: xiongxq
	* @Title: IEvaluateSelector 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IEvaluateSelector{

		/**
		 * 查询渠道营销案订购汇总信息
		* @date: 2016-11-26 
		* @author: yuanliang
		* @title: selectChannelMarketCaseOrderReportInfoList 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectChannelMarketCaseOrderReportInfoList(Map<String,Object> inParam) throws StrategyError;

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
		public List<Map<String,Object>> selectChannelTouchNumByRegionCode(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;

		/**
		 *查询15天订购量 
		* @date: 2016-11-27 
		* @date: 2016-11-25 
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
		public List<Map<String,Object>> selectFifthDayOrderNum(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;

		/**
		 * 查询营销案订购量
		* @date: 2017-01-11
		* @author: mengxi
		* @title: selectMarketCaseOrderNum 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectMarketCaseOrderNum()throws StrategyError;
		
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
		public Map<String,Object> selectMarketCaseOrderReportSendNum(IQueryFilter queryFilter) throws StrategyError;

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
		public List<Map<String,Object>> selectMarketCaseTouchNumByRegionCode(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;

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
		public Map<String,Object> selectMarketCasePushTaskStatistics(Map<String,Object> inParam);
		
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
		public Map<String,Object> selectOrderNum(Map<String,Object> termParam) throws StrategyError;
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
		public List<Map<String,Object>> selectProductCommodityReportInfo(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
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
		public String selectProductCommodityReportCount(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
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
		public List<Map<String,Object>> selectProductCommodityReportInfoByProvince(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
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
		public List<Map<String,Object>> selectRegionCodeConvertRate(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;

		/**
		 *查询7天订购量 
		* @date: 2016-11-27 
		* @author: xiongxq
		* @Title: selectSevenDayOrderNum 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectSevenDayOrderNum(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;

		/**
		 * 查询3天订购量
		* @date: 2016-11-25 
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
		public List<Map<String,Object>> selectThreeDayOrderNum(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 *  根据地市查询用户接触量
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
		public List<Map<String,Object>> selectUserTouchNumByRegionCode(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	}
	
	/**
	 * 事件数据查询操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IEventSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IEventSelector{

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
		public List<Map<String,Object>> selectEventDetailId(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public List<String> selectEventDetailByChannelIdFromCache(Map<String, Object> inParam) throws StrategyError;
		

		
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
		public List<String> selectEventIdByProdIdFromCache(Map<String, Object> inParam) throws StrategyError;
		
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
		public Map<String,Object> selectEventInfo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public List<Map<String,Object>> selectEventDetailList(Map<String,Object> tempInParam) throws StrategyError;
		
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
		@Deprecated
		public List<Map<String,Object>> selectEventDetailList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public Map<String, Object> selectEventRelation(Map<String, Object> inParam) throws StrategyError;
		
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
		public List<Map<String, Object>> selectMarketCaseIdByEventIdList(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public List<Map<String, Object>> selectPayFeeEventId(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public String selectGroupMsgEvent(Map<String, Object> inParam);
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
		public Map<String, Object> selectEventIdByRelId(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**清单数据查询操作
	* Create on 2017-1-16
	* @author: wangpei
	* @Title:InventorySelector
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public interface IInventorySelector{
		/** 分页查询清单列表
		* @date: 2017-1-16 
		* @author: wangpei
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
		public Map<String, Object> selectInventoryInfoListByPage(Map<String, Object> inParam, Map<String, Object> tempInParam)throws StrategyError;
	}
	
	/**
	 * 标签码表查询接口
	* @date: 2017-3-4 
	* @author: yuanchun
	* @title: ILabelCodeNameSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ILabelCodeNameSelector{
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
		public Map<String,Object> selectLabelCodeName(Map<String, Object> inParam) throws StrategyError;
	}
	
	/**
	 * 登录(权限、角色、菜单)数据查询操作接口
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: ILoginSelector 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ILoginSelector{
		
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
		public List<Map<String,Object>> select(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/** 查询工号信息
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
		public Map<String,String> selectLoginMsgByLoginNoHbase(Map<String,Object> inParam);
		
		/**
		 *根据工号查询该工号下面未拥有的角色列表 
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
		public List<Map<String,Object>> selectNotHasRoleByLoginNo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;

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
		public List<Map<String,Object>> selectRoleMenuRel(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public List<Map<String,Object>> selectRoleByLoginNo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询角色和用户关系列表
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
		public List<Map<String,Object>> selectRoleUserRel(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public List<Map<String,Object>> selectLoginNoList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public Map<String,Object> selectForPage(Map<String, Object> inParam,IQueryFilter queryFilter,int start , int limit) throws StrategyError;

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
		public Map<String,Object> selectLoginNo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询菜单列表
		* @date: 2016-10-26 
		* @author: fangyuan_crmpd
		* @title: selectMenuList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectMenuList(Map<String,Object> inParam) throws StrategyError;
		
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
		public List<Map<String, Object>> selectMenuDetailById(Map<String,Object> inParam) throws StrategyError;
		
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
		public List<Map<String, Object>> selectMenuListByLoginNo(Map<String, Object> inParam) throws StrategyError;
	}
	
	/**
	 * 营销案数据查询操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IMarketCaseSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IMarketCaseSelector{
		
		/**
		 * 从缓存中查询待生成批量
		* @date: 2016-12-28 
		* @author: sunliang 
		* @title: getWaitCreateBatchPushMarketCaseFromCache 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String, Map<String,String>> getWaitCreateBatchPushMarketCaseFromCache(String taskType) throws StrategyError;

		/**
		 * 查询待生成批量营销案tmp缓存(执行出错任务)
		* @date: 2017-5-4 
		* @author: chenhao
		* @title: getWaitCreateBatchPushMarketCaseFromTmpCache 
		* @param taskType
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> getWaitCreateBatchPushMarketCaseFromTmpCache(String taskType) throws StrategyError;
		
		/**
		 * 通过缓存查询批量Push营销案ID的任务总数
		* @date: 2016-10-9 
		* @author: yangwl
		* @title: getBatchPushMarketIdTaskCountFromCache 
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		//public long getBatchPushMarketIdTaskCountFromCache(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 查询批量Push营销案的状态
		* @date: 2016-10-2 
		* @author: yangwl
		* @title: getBatchPushSendStatusFromCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		//public String getBatchPushSendStatusFromCache(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 从缓存得到待生成外呼任务
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
		public Map<String, Map<String,String>> getWaitCallTaskPushMarketCaseFromCache() throws StrategyError;
		
		/**
		 * 从缓存查询渠道任务的营销案下的目标客户群类型和目标客户群标签表达式
		* @date: 2016-10-12 
		* @author: yangwl
		* @title: getChannelTaskMarketCaseLabelFormulaFromCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String, Map<String,String>> getChannelTaskMarketCaseLabelFormulaFromCache(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public MarketCaseCachePojo getMarketCaseDetailFromCache(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public List<String> getChannelTriggerMarketCaseCacheFromCache(Map<String, Object> inParam,Map<String, Object> position) throws StrategyError;
		
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
		public String getWaitSendBatchPushMarketCaseFromCache(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 通过缓存查询营销案推荐的状态
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
		public String getMarketCaseRecommendStatusFromCache(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 通过缓存查询营销案对应的任务Id
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: getMarketCaseTaskIdFromCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		//public List<String> getMarketCaseTaskIdFromCache(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 查询外呼任务营销案和目标客户群
		* @date: 2017-3-17 
		* @author: yuanchun
		* @title: selectCallTaskMarketCaseAndCustGroup 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectCallTaskMarketCaseAndCustGroup(Map<String, Object> inParam) throws StrategyError;
		
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
		public List<Map<String, Object>> selectChannelTaskMarketCaseAndCustGroup(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 查询批量push营销案和目标客户群
		* @date: 2016-12-28 
		* @author: sunliang 
		* @title: selectBatchPushMarketCaseAndCustGroup 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectBatchPushMarketCaseAndCustGroup(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public List<Map<String, Object>> selectChannelTriggerMarketCase(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public List<Map<String,Object>> selectEventTriggerMarketCase(Map<String,Object> tempInParam) throws StrategyError;
		
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
		public List<String> getEventTriggerMarketCaseByEventIdFromCache(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 从评估规则缓存中通过资费ID查询营销案列表信息
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
		public List<String> getMarketCaseIdByPostageIdFromEvaluateCache(Map<String,Object> tempInParam) throws StrategyError;
		
		
		/**
		 * 从关闭规则缓存中通过资费ID查询营销案列表信息
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
		public List<String> getMarketCaseIdByPostageIdFromCloseCache(Map<String,Object> tempInParam) throws StrategyError;
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
		public List<Map<String,Object>> selectMarketCaseAndWholeRuleDetail(IQueryFilter queryFilter) throws StrategyError;
		
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
		public Map<String,Object> selectMarketCaseIdByCloseRuleId(Map<String,Object> tempInParam)throws StrategyError;
		
/*		*//** 
		 * 根据事件ID查询营销案ID列表
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
		public List<String> selectMarketCaseIDByEventIdFromCache1(Map<String, Object> inParam) throws StrategyError;*/
		
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
		public List<Map<String, Object>> selectMarketCaseIdList(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 
		* @date: 2017-3-7 
		* @author: sunliang 
		* @title: selectMarketCaseIdByEventId 
		* @param tempParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectMarketCaseIdByEventId(Map<String,Object> tempInParam) throws StrategyError;
		
		/**
		 * 根据营销案id查询营销案信息
		* @date: 2017-3-30 
		* @author: sunyuan
		* @title: selectMarketCaseInfoById 
		* @param tempInParam
		* @return 
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String,Object> selectMarketCaseInfoById(Map<String,Object> tempInParam)throws StrategyError;
		
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
		@Deprecated
		public List<Map<String,Object>> selectMarketCaseList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public List<Map<String,Object>> selectMarketCaseList(Map<String,Object> tempInParam) throws StrategyError;
		
		/** 
		* @date: 2017-1-16 
		* @author: wangpei
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
		public Map<String, Object> selectMarketCaseListForPage(IQueryFilter queryFilter, int start, int limit) throws StrategyError;

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
		public String selectMarketCaseRecommendCount(Map<String, Object> tempInParam) throws StrategyError;
		
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
		public String selectMarketCaseRecommendCountByDate(Map<String, Object> tempInParam) throws StrategyError;
		
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
		public Map<String, Object> selectMarketCaseReportFormList(Map<String, Object> tempInParam) throws StrategyError;

		/**
		 * 查询批量营销案推荐量
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
		public String selectBatchMarketCaseRecommendCount(Map<String, Object> tempInParam) throws StrategyError;
		
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
		public Map<String, Object> selectMarketCaseTargetCustCount(Map<String, Object> tempInParam) throws StrategyError;
		
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
		public Map<String,Object> selectMarketCaseNum(Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询营销案转化量
		* @date: 2017-4-18 
		* @author: yuanchun
		* @title: selectMarketCaseOrderCount 
		* @param tempParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String,Object> selectMarketCaseOrderCount(Map<String, Object> tempParam) throws StrategyError;
		
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
		public Map<String, Object> selectRecommendCloseByRowKey(Map<String, Object> tempInParam) throws StrategyError;
		
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
		public List<Map<String,Object>> selectRelationList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;


	}
	
	/**
	 * 监控数据查询操作接口
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: IMonitorWarningSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IMonitorSelector{
		
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
		public Map<String,Object> selectWorkOperWarningInfo(Map<String, Object> inParam) throws StrategyError;
		/** 查询服务监控返回并删除
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
		public Map<String,Object> getAndRemoveServiceMonitoringCache() throws StrategyError;

		/**
		 * 接口服务监控查询
		* @date: 2017-3-10 
		* @author: wuJiaFu
		* @title: selectWorkOperWarningInfo 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String, Object> selectServiceMonitorInfo(Map<String, Object> inParam,IQueryFilter queryFilter,int start,int limit) throws StrategyError;
	}
	
	/**
	 * 操作日志查询接口
	* @date: 2016-11-1 
	* @author: tangaq
	* @title: IOperLogSelector 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IOperLogSelector{
		
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
		public Map<String,Object> selectOperLogList (Map<String,Object> inParam,IQueryFilter queryFilter,int start, int limit) throws StrategyError;
		
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
		public Map<String,Object> selectMessageTriggerLogList (Map<String,Object> inParam,IQueryFilter queryFilter,int start, int limit) throws StrategyError;
		
	}
		
	/**
	 * 运营位数据查询接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IPositionSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IPositionSelector{

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
		public List<Map<String, Object>> selectPositionInfo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询运营位信息(新)
		* @date: 2017-3-17 
		* @author: sunyuan
		* @title: selectPositionInfo 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectPositionInfo(Map<String, Object> inParam) throws StrategyError;
		
		/**
		 *查询运营位属性信息
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
		public List<Map<String,Object>> selectPositionAttrInfo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	}
	
	/**
	 * 产商品数据查询接口
	* @date: 2016-10-1 
	* @author: zhaoyue
	* @title: IProductCommoditySelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IProductCommoditySelector{
		
		/**
		 * 查询产商品列表
		* @date: 2016-10-1 
		* @author: zhaoyue
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
		public List<Map<String,Object>> selectProductCommodityList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public Map<String,Object> selectProductCommodity(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public String selectProductCommodityCount(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	}
	/**产品查询接口
	* Create on 2016-10-13
	* @author: wangpei
	* @Title:IProductSelector
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public interface IProductSelector{
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
		public  List<Map<String,Object>> selectProductList(Map<String, Object> inParam,IQueryFilter queryFilter);
		
		/** 分页查询
		* @date: 2016-10-30 
		* @author: wangpei
		* @title: selectProductListForPage 
		* @param inParam
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public  Map<String,Object> selectProductListForPage(Map<String, Object> inParam) throws StrategyError;
	}

	/**
	 * 区域用户群优先级数据查询接口
	* @date: 2016-10-15 
	* @author: fangyuan_crmpd
	* @title: IAreaPrioritySelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IPrioritySelector{
		
		/**
		 * 查询区域优先级信息
		* @date: 2016-10-15 
		* @author: fangyuan_crmpd
		* @title: selectAreaPriorityList
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectAreaPriorityList(Map<String, Object> inParam) throws StrategyError;
		
		/**
		 * 查询区域优先级，营销案管理列表
		* @date: 2016-10-19 
		* @author: fangyuan_crmpd
		* @title: selectAreaPriorityRelMarketCaseList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>>  selectAreaPriorityRelMarketCaseList(Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询用户群优先级信息
		* @date: 2016-10-15 
		* @author: fangyuan_crmpd
		* @title: selectCustGroupPriorityList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectCustGroupPriorityList(Map<String, Object> inParam) throws StrategyError;
	}
	
	/**
	 * 规则数据查询操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IRuleSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IRuleSelector{
		
		/**
		 *查询全局规则
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
		public List<Map<String,Object>> selectGlobalRule (Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public List<Map<String,Object>> selectGlobalRuleType() throws StrategyError;
		
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
		public List<Map<String,Object>> selectGlobalRuleDetailById(Map<String, Object> tempInParam) throws StrategyError;
		

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
		public Map<String,Object> selectGlobalRuleFromCache() throws StrategyError;
		
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
		public List<String> getMutexRuleFromCache(Map<String,Object> tempParam) throws StrategyError;
		
		/**
		 * 根据规则ID查询营销案
		* @date: 2017-3-30 
		* @author: sunyuan
		* @title: selectMarketCaseIdByRuleId 
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String, Object> selectMarketCaseIdByRuleId(Map<String,Object> tempInParam) throws StrategyError;
		
		/** 查询关系
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
		public Map<String,Object> selectRelation(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;

		/**
		 * 查询关系
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
		public Map<String,Object> selectRelation(Map<String, Object> inParam) throws StrategyError;
		
		/**
		 * 查询规则基本信息
		* @date: 2016-10-1 
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
		public Map<String,Object> selectRuleInfo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public List<Map<String, Object>> selectRuleInfoList(Map<String, Object> inParam) throws StrategyError;
		
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
		public List<Map<String,Object>> selectRuleDetailBatchNoById(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public List<Map<String,Object>> selectRuleDetailByParentComponentId(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询规则明细信息
		* @date: 2016-10-1 
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
		public List<Map<String,Object>> selectRuleDetailList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询规则明细信息(新)
		* @date: 2017-3-29 
		* @author: sunyuan
		* @title: selectRuleDetailList 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectRuleDetailList(Map<String, Object> inParam) throws StrategyError;
		
		/**
		 * 查询规则详细信息Id
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
		public List<Map<String,Object>> selectRuleDetailId(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public List<Map<String,Object>> selectRuleDetailsByEventIdAndMarketCaseId(Map<String,Object> tempInParam) throws StrategyError;
		
		
		/**
		 * 查询全局规则根据营销案Id
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
		public List<Map<String,Object>> selectWholeRuleDetailByMarketCaseId(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询当日是否已经生成了批量PUSH任务
		* @date: 2016-11-8 
		* @author: zhangqia
		* @title: selectWaitSendTaskControlList 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectWaitSendTaskControlList(Map<String, Object> inParam, IQueryFilter queryFilter)throws StrategyError;
		/**
		 * 根据营销案id查询规则
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
		public List<Map<String, Object>> selectRuleDetailByMarketCaseId(Map<String, Object> inParam, IQueryFilter queryFilter)throws StrategyError;
	}

	/**
	 * 短信查询接口
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: IShortMessage 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IShortMessageSelector{
		
		/**
		 *根据工号查询该工号下面拥有的接入码列表 
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
		public List<Map<String,Object>> selectAccessCodeListByLoginNo(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;

		/**
		 *根据工号查询该工号下面未有的接入码列表  
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
		public List<Map<String,Object>> selectNotHasAccessCodeListByLoginNo(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;

		/**
		 * 查询短信接入码列表
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
		public List<Map<String,Object>> selectShortMessageAccessCodeList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 根据日期查询短信推送流量
		* @date: 2016-10-30 
		* @author: fangyuan_crmpd
		* @title: selectShortMsgMoveTrafficByDate 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectShortMsgMoveTrafficByDate(Map<String,Object> inParam)  throws StrategyError;;
		
		/**
		 * 根据营销案ID查询短信推送流量
		* @date: 2016-10-30 
		* @author: fangyuan_crmpd
		* @title: selectShortMsgMoveTrafficByMarketCaseId 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectShortMsgMoveTrafficByMarketCaseId(Map<String,Object> inParam)  throws StrategyError;
	}
	
	/**
	 * 数据统计查询接口
	* @date: 2016-12-20 
	* @author: sunliang 
	* @title: IStatisticSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IStatisticSelector{
		
		/**
		 *  查询公告列表
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
		public Map<String, Object> selectNoticeList(Map<String, Object> inParam,IQueryFilter queryFilter,int start, int limit) throws StrategyError;
		
		/**
		 * 数据统计查询
		* @date: 2016-12-20 
		* @author: sunliang 
		* @title: selectStatistic 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* tempInParam:statisType,currentDate,regionCode,channelType,busiType
		* update_version: update_date: update_author: update_note:
		 */
		public String selectStatistic(Map<String,Object> tempInParam);
		
		
	}
	
	
	
	/**
	 * 系统处理查询操作接口
	* @date: 2016-11-14 
	* @author: zhangjj_crmpd
	* @title: ISystemDealSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ISystemDealSelector{
		
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
		public List<Map<String,Object>> selectShellProcessExecuteList(Map<String,Object> tempInParam,IQueryFilter queryFilter) throws StrategyError;

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
		public List<Map<String, Object>> selectShellProcessExecuteById(IQueryFilter queryFilter) throws StrategyError;
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
	public interface ITaskSelector{
		
		/** 查询任务
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
		public Map<String,String> getChannelTask(Map<String, Object> tempInParam) throws StrategyError;

		/** 得到任务同步的缓存
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
		public String getChannelTaskSynCache() throws StrategyError;
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
		public Map<String,Map<String,Map<String,String>>> scanChannelTask(Map<String, Object> tempInParam) throws StrategyError;
		/**
		 * 查询渠道任务
		* @date: 2016-10-20 
		* @author: yangwl
		* @title: selecChannelTaskList 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String, Object>> selectChannelTaskList(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 分页查询渠道任务
		* @date: 2016-12-15 
		* @author: zhangjj_crmpd
		* @title: selectChannelTaskListByPage 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String, Object> selectChannelTaskListByPage(Map<String, Object> tempInParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询渠道任务数量
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
		public Map<String, Object> selectChannelTaskListCount(Map<String, Object> tempInParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public List<Map<String, Object>> selectCustListFromChannelTask(Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError;
		
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
		public List<Map<String, Object>> selectMarketCaseListFromChannelTask(Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError;
		
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
		public List<Map<String, Object>> selecTaskListFromChannelTask(Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError;
		
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
		public Map<String, Object> selectTaskAdjust(Map<String, Object> tempInParam,IQueryFilter queryFilter) throws StrategyError;
		
		/** 查询调配信息与规则关系
		* @date: 2017-1-16 
		* @author: wangpei
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
		public List<Map<String, Object>> selectTaskAdjustAndRuleRelation(Map<String, Object> tempInParam, IQueryFilter queryFilter)throws StrategyError;
		
		/** 根据参数查询任务调配信息
		* @date: 2017-1-16 
		* @author: wangpei
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
		public List<Map<String, Object>> selectTaskAdjustByParam(Map<String, Object> tempInParam, IQueryFilter queryFilter)throws StrategyError ;
		
		/** 根据负责人工号分组查询任务数
		* @date: 2017-1-16 
		* @author: wangpei
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
		public List<Map<String,Object>> selectTaskCountGroupByLoginNo(Map<String, Object> tempInParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public List<Map<String, Object>> selectWaitSendChannelTaskList(Map<String, Object> tempInParam) throws StrategyError;

	}
	
	/**
	 * 测试查询
	* @date: 2016-11-20 
	* @author: sunliang 
	* @title: ITestSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ITestSelector{
		
		/**
		 * 查询hbase测试
		* @date: 2016-11-20 
		* @author: sunliang 
		* @title: selectHbaseTest 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String, String> selectHbaseTest(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 查询hive测试
		* @date: 2016-11-20 
		* @author: sunliang 
		* @title: selectHiveTest 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectHiveTest(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 查询sparkSQL测试
		* @date: 2016-11-20 
		* @author: sunliang 
		* @title: selectSparkSQLTest 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectSparkSQLTest(Map<String, Object> tempInParam) throws StrategyError;
		
	}
	
	/**
	 * 查询模板信息接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: ITemplateSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ITemplateSelector{
		
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
		 public List<Map<String,Object>> selectTemplateList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		 
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
		 public Map<String,Object> selectTemplateInfo(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		 
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
		 public Map<String,Object> selectRelationInfo(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	}
	
	/**
	 * 用户查询操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IUserSelector 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IUserSelector{
		
		/**
		 *查询异网号码池列表  
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
		public List<Map<String,Object>> selectDifferentNetPhonePoolList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public Map<String,Object> selectGreyInfoByRowKey(Map<String,Object> tempInParam, Set<String> fields);
		
		/**
		 * 查询灰名单列表
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
		public List<Map<String,Object>> selectGreyList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		/**
		 * 查询灰名单列表分页
		* @date: 2017-3-14
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
		public Map<String, Object> selectGreyListForPage(Map<String, Object> inParam) throws StrategyError;
		
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
		public String selectIdNoByServiceNo(String serviceNo) throws StrategyError;
		
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
		public Map<String,Object> selectUserAcceptMarketCaseByRowKey(Map<String,Object> tempInParam);
		
		/** 查询用户资料
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
		public Map<String,String> selectUserInfoByIdNo(Map<String,Object> tempInParam);
		
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
		public List<Map<String,Object>> selectUserInfoList(Map<String,Object> inParam,IQueryFilter queryFilter);
		
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
		public Map<String, Object> selectUserDataList(Map<String, Object> inParam,IQueryFilter queryFilter,int start, int limit) throws StrategyError;

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
		public Map<String,String> selectUserLabelByPhoneNo(Map<String, Object> tempInParam) throws StrategyError;

		/**
		 * 根据idNo查询用户标签数据
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
		public Map<String,String> selectUserLabelByIdNo(Map<String, Object> tempInParam) throws StrategyError;
		
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
		public List<Map<String,Object>> selectUserLabelList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
		/**
		 * 查询用户标签列表(新)
		* @date: 2017-2-8 
		* @author: sunyuan
		* @title: selectUserLabelList 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectUserLabelList(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 查询用户标签列表(直接分页不加入缓存)
		* @date: 2017-3-14 
		* @author: zhangwie_crmpd_cmi_ah
		* @title: selectUserLabelForPage 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String, Object> selectUserLabelForPage(Map<String, Object> inParam) throws StrategyError;
		
		/**
		 * 查询经分同步用户标签列表
		* @date: 2017-3-2 
		* @author: yuanchun
		* @title: selectUserLabelList 
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public List<Map<String,Object>> selectUserLabelForPage(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
		
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
		public Map<String, Object> selectUserRecommendControlByRowKey(Map<String, Object> tempInParam, Set<String> fields);
		
		/** 据rowkey查用户渠道推荐控制信息
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
		public Map<String, Object> selectUserRecommendControlByChannel(Map<String, Object> tempInParam, Set<String> fields);
		
		/**  查询用户回单反馈表
		* @date: 2017-1-16 
		* @author: wangpei
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
		public Map<String, Object> selectUserReceiptRecordList(Map<String, Object> inParam, IQueryFilter queryFilter,int start, int limit) throws StrategyError;
		
		/** 查询用户接触信息
		* @date: 2017-1-16 
		* @author: wangpei
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
		public Map<String, Object> selectUserTouchViewList(Map<String, Object> inParam, IQueryFilter queryFilter,int start, int limit) throws StrategyError ;


	}
	
	/**
	 * 作业配置查询接口
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: IWorkConfigSelector 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IWorkConfigSelector{
		
		/**
		 * 查询作业配置列表
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
		public List<Map<String,Object>> selectWorkConfigList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	}
	/**
	 * 调查问卷查询接口
	* @date: 2016-12-12 
	* @author: zhangqia
	* @Title: IQuestionNaireSelector 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IQuestionNaireSelector{
		
		/**
		 * 查询调查问卷
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
		public Map<String,Object> selectQuestionNaireById(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;

		/**
		 * 查询缓存中问卷ID
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
		public Map<String,Object> selectQuestionNaireFromCache()throws StrategyError;
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
		public List<Map<String,Object>> selectQuestionNaireList(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
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
		public List<Map<String,Object>> selectMarketCaseAndContentList(IQueryFilter queryFilter) throws StrategyError;
		
	}
}
