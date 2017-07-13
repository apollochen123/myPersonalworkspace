package com.sitech.strategy.persist.capacity.impl;

import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 *  非关系型数据操控接口
* @date: 2016-9-12 
* @author: zhaoyue
* @title: INosqlDML 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface INosqlDML {
	
	/**
	 * COC目标客户群明细
	* @date: 2016-11-23 
	* @author: yangwl
	* @title: ICocCustomerGroup 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class ICocCustomerGroup{
		
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
		abstract Map<String, Map<String,Map<String,String>>> select(Map<String, Object> tempInParam);
	}
	
	/**
	 * 受理记录表
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: IRmAcceptRecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmAcceptRecordInfo{
        /**
         * 受理消息插入
        * @date: 2017-1-25 
        * @author: yexr
        * @title: insertEventInfo 
        * @param inParam
        * @param tempInParam 
        * @exception: 
        * @version: 1.0 
        * @description: 
        * update_version: update_date: update_author: update_note:
         */
		abstract void insert(Map<String, Object> inParam,Map<String, String> tempInParam);

		
		
	}
	

	
	/**
	 * 批量push任务表
	* @date: 2016-9-26 
	* @author: sunliang 
	* @title: IRmInitiativePushTask 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmBatchPushTaskInfo{

		/**
		 * 批量push任务插入
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
		abstract void insert(Map<String, Object> tempInParam,Map<String, String> param);
		
		/**
		 * 根据任务ID查询批量推送任务信息
		* @date: 2016-9-29 
		* @author: yangwl
		* @title: getBatchPushTaskById 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String, String> selectBatchPushTaskById(Map<String,Object> tempInParam);
		
	}
	
	/** 
	 * 批量push任务异常表
	* @date: 2016-11-5 
	* @author: songxj
	* @title: IRmBatchPushTaskExcepInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note: 
	*/
	public abstract class IRmBatchPushTaskExcepInfo {
		
		/** 
		 * 批量push任务处理异常删除
		* @date: 2016-11-5 
		* @author: songxj
		* @title: delete 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		abstract void delete(Map<String, Object> tempInParam);
		
		/** 批量push任务处理异常插入
		* @date: 2016-11-4 
		* @author: songxj
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		abstract void insert(Map<String, Object> tempInParam,Map<String,String> param);
		
		/** 
		 * 批量push任务处理异常查询
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
		abstract Map<String,Map<String,Map<String,String>>> select(Map<String, Object> tempInParam);
	}
	
	/**
	 * 批量push任务成功记录表
	* @date: 2017-2-27 
	* @author: zhangjj_crmpd
	* @title: IRmBatchpushtasksuccInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmBatchPushTaskSuccInfo {
		
		/**
		 * 插入批量push任务成功记录表
		* @date: 2017-2-27 
		* @author: zhangjj_crmpd
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String, Object> tempInParam,Map<String,String> param);
		
	}
	
	
	/**
	 * 渠道外呼接触表
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: IRmChannelCallContactInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmChannelCallContactInfo{
		/** 渠道外呼量插入
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
		abstract void insert(Map<String, Object> tempInParam,Map<String,String> param);
	}
	
	/**
	 * 渠道短信接触表
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: IRmChannelSMSContactInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmChannelSMSContactInfo{
		/** 渠道短信接触量插入
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
		abstract void insert(Map<String, Object> tempInParam,Map<String,String> param);
	}
	
	/**
	 * 渠道任务表
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: IRmChannelTaskInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmChannelTaskInfo{
		
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
		abstract void insert(Map<String, Object> tempInParam,Map<String,String> param);
		/** 模糊查询任务
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
		abstract Map<String, Map<String, Map<String, String>>> scanChannelTask(String startRow,String stopRow);
		
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
		abstract Map<String,String> select(Map<String, Object> tempInParam);
	}
	
	/**
	 * 点击记录表
	* @date: 2016-9-21 
	* @author: sunliang 
	* @title: IRmClickRecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmClickRecordInfo{
		
		/** 点击量插入
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
		abstract void insert(Map<String, Object> tempInParam,Map<String,String> param);

	}
	
	/**
	 * 接触记录表
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: IRmContactRecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmContactRecordInfo{
		
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
		abstract void insert(Map<String, Object> tempInParam,Map<String,String> param);
	}
	
	/**
	 * 目标客户群明细
	* @date: 2016-11-14 
	* @author: yangwl
	* @title: IRmCustGroupDetailInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmCustGroupDetailInfo{
		
		
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
		abstract void createTable(Map<String, Object> inParam);
		
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
		abstract Map<String, Object> insert(Map<String, Object> tempInParam,Map<String,String> param);
	
		/**
		 * 根据serviceNo查询目标客户群明细
		* @date: 2016-11-14 
		* @author: yangwl
		* @title: selectCustGroupDetailByIdNo 
		* @param inParam
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String, String> selectCustGroupDetailByIdNo(Map<String, Object> inParam,IQueryFilter queryFilter);
		
	}
	
	/**客户群自定义标签表
	* Create on 2017-2-21
	* @author: wangpei
	* @Title:IRmCustGroupCustomLabelInfo
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public abstract class IRmCustGroupCustomLabelInfo{
		
		
		
		
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
		abstract Map<String,String> getCustGroupCustomLabelByIdNo(Map<String, Object> tempInParam);
		
		
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
		abstract Map<String, Object> insert(Map<String, Object> tempInParam,Map<String,String> param);
	}
	/**
	 * 黑名单表
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: IRmGreyInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmGreyInfo{

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
		abstract void delete(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 插入黑名单
		* @date: 2016-12-5 
		* @author: zhangjj_crmpd
		* @title: insert 
		* @param inParam
		* @param param
		* @return 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		 * @throws Exception 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String, Object> inParam,Map<String,String> param) throws StrategyError;
		
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
		abstract Map<String, Object> select(Map<String, Object> tempInParam, Set<String> fields);
		
	}	
	
	/**
	 * hbase测试表
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: IRmHiveTestHbaseInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmHbaseTestInfo{
		
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
		abstract void insert(Map<String,String> param);
		
		/**
		 * 
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
		abstract Map<String, String> select(Map<String, Object> tempInParam, Set<String> fields);
	}
	
	/**
	 * 工号信息表
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: IRmLoginInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmLoginMsgInfo{
		/** 根据工号查询工号信息
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
		abstract Map<String,String> getLoginMsgByLoginNo(String loginNo);
	}
	
	/**
	 * 操作日志信息表
	* @date: 2017-3-9 
	* @author: yueyi
	* @title: IRmOperLogInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmOperLogInfo{
		
		/**
		 * 插入操作日志
		* @date: 2017-3-9 
		* @author: yueyi
		* @title: saveOperLogInfo 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insertOperLogInfo(Map<String,String> inParam);
	}
	
	
/*	*//**
	 * 营销案推荐统计表
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: IRmMarketCaseRecommendTotalInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 *//*
	public abstract class IRmMarketCaseRecommendTotalInfo{
		
		*//**
		 * 查询
		* @date: 2016-11-16 
		* @author: yangwl
		* @title: select 
		* @param TempInParam
		* @param param
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 *//*
		abstract Map<String, Object> select(Map<String, Object> tempInParam, Set<String> fields);
		
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
		abstract void insert(Map<String, Object> tempInParam, Map<String, String> param);
	}*/
	
	/**
	 * 推送到达表
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: IRmPushArriveInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmPushArriveInfo{
		
		/**
		 * 到达量插入
		* @date: 2016-10-20 
		* @author: sunliang 
		* @title: insert 
		* @param tempInParam
		* @param param 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String, Object> tempInParam,Map<String,String> param);
	}
	
	/**
	 * 回单记录表
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: IRmRecomBackRecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmReceiptRecordInfo{
		
		/** 回单记录插入
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
		abstract void insert(Map<String, Object> tempInParam,Map<String,String> param);
	}
	
	/**
	 * 推荐受理记录表
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: IRmRecomSuccRecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmRecomAcceptRecordInfo{
		
	}
	
	/**
	 * 推荐关闭表
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: IRmRecommendCloseInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmRecommendCloseInfo{
		
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
		abstract Map<String, Object> select(Map<String, Object> tempInParam);
		
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
		abstract void insert(Map<String, Object> tempInParam,Map<String,String> param);
	}
	
	/**
	 * 推荐记录表
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: IRmRecommendRecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmRecommendRecordInfo{
		
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
		abstract void insert(Map<String, Object> tempInParam, Map<String,String> param);
		
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
		abstract Map<String,String> select(String seqId);     
		
	}
	/**
	 * 用户推荐营销表
	* @date: 2017-4-10 
	* @author: zhangyw_crmpd
	* @title: IRmUserRecommendMarketCaseInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmUserRecommendMarketCaseInfo{
		
		/**
		 * 插入记录
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
		abstract void insert(Map<String, Object> tempInParam, Map<String,String> param);
		
		/**
		 * 查询记录 
		* @date: 2017-4-10 
		* @author: zhangyw_crmpd
		* @title: select 
		* @param seqId
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String,String> select(String seqId);   
		
	}
	
	/**
	 * 短信受理记录表
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: IRmSMSAcceptRecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmSMSAcceptRecordInfo{
		/** 
		 * 插入记录
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
		abstract void insert(Map<String, Object> tempInParam,Map<String,String> param);
	}
	
	/**
	 * 短信上行表
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: IRmSMSPullInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmSMSPullInfo{
		/** 
		 * 插入短信上行量
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
		abstract void insert(Map<String, Object> tempInParam,Map<String,String> param);

	}
	
	/**
	 * 用户信息表
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: IRmUserInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmUserInfo{
		
		/**
		 * 根据phoneNo查询IdNo
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
		abstract String getIdNoByPhoneNo(String phoneNo);
		
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
		abstract Map<String,String> getUserInfoByIdNo(String IdNo);
	}
	
	/**
	 * 用户受理营销案表
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: IRmUserAcceptMarketCaseInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmUserAcceptMarketCaseInfo{
		
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
		abstract Map<String, Object> select(Map<String, Object> tempInParam, Set<String> fields);
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
		abstract void insert(Map<String, Object> tempInParam, Map<String, String> param);
	}
	
	/**
	 * 用户标签表
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: IRmUserLabelInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmUserLabelInfo{
		
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
		abstract Map<String,String> getUserLabelByIdNo(String idNo,Set<String> fields);
		
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
		abstract Map<String,String> getUserLabelByPhoneNo(String phoneNo,Set<String> fields);
		
	}
	
	/**
	 * 用户推荐控制表
	* @date: 2016-11-15 
	* @author: yangwl
	* @title: IRmUserRecommendControl 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmUserRecommendControlInfo{
		
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
		abstract void insert(Map<String, Object> tempInParam, Map<String, String> param);
		
		/**
		 * 根据rowKey查询
		* @date: 2016-11-15 
		* @author: yangwl
		* @title: select 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String, Object> select(Map<String, Object> tempInParam, Set<String> fields);
	}
	
	/**
	 * 用户转换关系表
	* @date: 2016-11-14 
	* @author: yangwl
	* @title: IRmUserRelInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmUserRelInfo{
		
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
		abstract String getIdNoByServiceNo(String serviceNo);
	}
	
	/**
	 * 待发送批量push任务表
	* @date: 2017-1-9 
	* @author: sunliang 
	* @title: IRmWaitSendBatchPushTaskInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmWaitSendBatchPushTaskInfo{
		
		/**
		 * 删除
		* @date: 2017-1-9 
		* @author: sunliang 
		* @title: delete 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String, Object> tempInParam);
		
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
		abstract void insert(Map<String, Object> tempInParam,Map<String,String> param);
		
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
		abstract Map<String,Map<String,Map<String,String>>> select(Map<String, Object> tempInParam);
	}

	

	
}
