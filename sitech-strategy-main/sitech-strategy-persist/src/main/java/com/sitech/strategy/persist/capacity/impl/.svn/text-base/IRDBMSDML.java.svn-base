package com.sitech.strategy.persist.capacity.impl;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 关系型数据操控接口
* @date: 2016-9-12 
* @author: zhaoyue
* @title: IRDBMSDML 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IRDBMSDML {

	/**
	 * 测试
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: ITestTable 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class ITestTable{
		
		/**
		 *  插入
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam);
	}
	
	/**
	 * 公共数据操作
	* @date: 2016-9-19 
	* @author: zhaoyue
	* @title: ICommon 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class ICommonInfo{
		
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
		abstract List<Map<String,Object>> selectCodeName(IQueryFilter queryFilter);
		
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
		abstract String selectDataBaseSysTime();
		
	}
	
	/**
	 * 活动需求表
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: IRmActDemand 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmActDemandInfo{
		
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
		abstract void delete(Map<String,Object> inParam);
		 
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
		abstract void insert(Map<String,Object> inParam) throws StrategyError;
		
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
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
		/**
		 *更新
		* @date: 2016-10-20 
		* @author: wangth
		* @Title: update 
		* @param inParam 
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 附件表
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: IRmAttach 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmAttachInfo{
		
		/**
		 * 删除附件
		* @date: 2016-10-24 
		* @author: wangth
		* @Title: delete 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);
		/**
		 * 批量添加附件
		* @date: 2016-10-20 
		* @author: wangth
		* @Title: insertBatchAttach 
		* @param list 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insertBatchAttach(List<Map<String,Object>> list);
		
		/**
		 * 添加单个附件
		* @date: 2016-10-23 
		* @author: wangth
		* @Title: insertSingleAttach  
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insertSingleAttach(Map<String,Object> inParam) throws StrategyError;
		
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
		abstract List<Map<String,Object>> selectAttach(IQueryFilter queryFilter);
	}
	
	/**
	 *属性表 
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: IRmAttributeInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmAttributeInfo {
		
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
		abstract void insert(List<Map<String, Object>> list);
		
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
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
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
		abstract void update(Map<String,Object> inParam);
		
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
		abstract void delete(Map<String,Object> inParam);
		
	}
	
	/**
	 *  区域优先级表
	* @date: 2016-10-15 
	* @author: fangyuan_crmpd
	* @title: IRmPriorityInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmAreaPriorityInfo{
		
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
		abstract void delete(Map<String,Object> inParam);
		
		/**
		 * 插入
		* @date: 2016-10-15 
		* @author: fangyuan_crmpd
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 查询区域优先级
		* @date: 2016-10-15 
		* @author: fangyuan_crmpd
		* @title: select 
		* @param queryFilter 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> select(Map<String,Object> inParam);
		
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
		abstract List<Map<String,Object>> selectAreaPriorityRelByMarketCaseId(IQueryFilter queryFilter);	
		
		/**
		 * 查询区域优先级，营销案关联列表
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
		abstract List<Map<String,Object>> selectAreaPriorityRelMarketCase(IQueryFilter queryFilter);
		
	}
	
	/**
	 * 审批记录
	* @date: 2016-9-15 
	* @author: zhaoyue
	* @title: IRmAuditrecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmAuditRecordInfo{
		
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
		abstract void insert(Map<String,Object> inParam);
		
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
		abstract List<Map<String,Object>> selectDownLoadAuditRecord(IQueryFilter queryFilter);
		
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
		abstract List<Map<String,Object>> selectMarketCaseAuditRecord(IQueryFilter queryFilter);
		
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
		abstract List<Map<String,Object>> selectAuditRecordDetailListByMarketCaseId(IQueryFilter queryFilter);
		
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
		abstract void update(Map<String,Object> inParam);
		
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
		abstract Map<String,Object> selectMarketCaseAuditNum(IQueryFilter queryFilter);
	}
	
	/**
	 * 批量push发送成功任务表
	* @date: 2017-3-14 
	* @author: tangaq
	* @title: IRmBatchPushTaskSuccInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmBatchPushTaskSuccInfo{
		abstract Map<String,Object> select(Map<String,Object> inParam);
	}
	
	/**
	 * 批量push待发送任务表
	* @date: 2017-3-14 
	* @author: tangaq
	* @title: IRmWaitSendBatchPushTaskInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmWaitSendBatchPushTaskInfo{
		abstract Map<String,Object> select(Map<String,Object> inParam);
	}
	
	/**
	 * 批量push异常任务表
	* @date: 2017-3-14 
	* @author: tangaq
	* @title: IRmBatchPushTaskExcepInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmBatchPushTaskExcepInfo{
		abstract Map<String,Object> select(Map<String,Object> inParam);
	}
	
	/**
	 * 批量push任务表
	* @date: 2017-3-14 
	* @author: tangaq
	* @title: IRmBatchPushTaskInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmBatchPushTaskInfo{
		
	}
	
	/**
	 * 审批工号
	* @date: 2016-10-10 
	* @author: wangth
	* @Title: IRmAuditNoInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmAuditNoInfo{
		
		/**
		 * 插入
		* @date: 2016-10-10 
		* @author: wangth
		* @Title: inser  
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void inser(Map<String,Object> inParam);
		
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
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
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
		abstract List<Map<String,Object>> selectBusiAuditNO(IQueryFilter queryFilter);
		
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
		abstract void update(Map<String,Object> inParam);
		
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
		abstract void delete(Map<String,Object> inParam);
	}
	
	/**
	 * 触点商机表
	* @date: 2016-12-13 
	* @author: tangaq
	* @title: IRmChannelBussinessInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmChannelBussinessInfo{
		
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
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
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
		abstract List<Map<String,Object>> selectByRegionCode(IQueryFilter queryFilter);
	}
	
	/**
	 * 渠道表
	* @date: 2016-9-8 
	* @author: zhaoyue
	* @title: RmChannelInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmChannelInfo{
		
		/**
		 * 插入渠道信息
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 查询渠道信息
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: select 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
		/**
		 * 更新渠道信息
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam);
		
	}
	
	/**
	 * 渠道显示表
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: IRmChannelInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmChannelShowInfo{
		
		/**
		 * 删除渠道显示信息
		* @date: 2016-10-18 
		* @author: fangyuan_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);

		/**
		 * 插入渠道显示信息
		* @date: 2016-10-18 
		* @author: fangyuan_crmpd
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 查询渠道显示列表信息
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
		abstract List<Map<String, Object>> select(IQueryFilter queryFilter);
		
		/**
		 * 更新渠道显示信息
		* @date: 2016-10-18 
		* @author: fangyuan_crmpd
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam);
	}
	
	/**渠道任务表
	* Create on 2016-12-21
	* @author: wangpei
	* @Title:IRmChannelTaskInfo
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public abstract class IRmChannelTaskInfo{
		
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
		abstract void batchUpdate(List<Map<String,Object>> tempInParam);
		
		/** 查询活动列表
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
		abstract List<Map<String, Object>> selectMarketCaseList(IQueryFilter queryFilter);

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
		abstract List<Map<String, Object>> selectCustList(IQueryFilter queryFilter);
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
		abstract List<Map<String,Object>> selectTaskCountGroupByLoginNo(IQueryFilter queryFilter);

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
		abstract List<Map<String, Object>> selectTaskList(IQueryFilter queryFilter);
		
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
		abstract Map<String, Object> selectTaskListByPage(Map<String, Object> tempInParam,IQueryFilter queryFilter,int startNum,int limit);
		
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
		abstract Map<String, Object> selectTaskListCount(Map<String, Object> tempInParam,IQueryFilter queryFilter);
		
		/** 查询待发送的渠道任务列表
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
		abstract List<Map<String, Object>> selectWaitSendTaskList(IQueryFilter queryFilter);

		/** 插入
		* @date: 2017-2-27 
		* @author: wangpei
		* @title: insert 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		abstract void insert(Map<String, Object> tempInParam);
		
		/** 修改状态
		* @date: 2016-12-21 
		* @author: wangpei
		* @title: updateStatus 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		abstract void updateStatus(Map<String,Object> inParam);
		
		/**
		 * 更新负责人工号
		* @date: 2016-12-21 
		* @author: zhangjj_crmpd
		* @title: updateServiceNo 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void updateServiceNo(Map<String,Object> inParam);
	}
	/**
	 * 内容表
	* @date: 2016-9-8 
	* @author: zhaoyue
	* @title: IRmContentInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmContentInfo{
		
		/**
		 * 插入内容
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 查询内容
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: select 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String,Object> select(IQueryFilter queryFilter);
		
		/**
		 * 更新内容
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam);

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
		abstract void delete(Map<String,Object> inParam);
		
	}
	
	/**
	 * 内容详细信息表
	* @date: 2016-9-8 
	* @author: zhaoyue
	* @title: IRmContentDetailInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmContentDetailInfo{
		/** 删除内容详细信息
		* @date: 2016-10-21 
		* @author: wangpei
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		abstract void delete(Map<String,Object> inParam);
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
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 查询内容详细信息
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>> select(IQueryFilter queryFilter);
		
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
		abstract List<Map<String,Object>> selectContentDetailId(IQueryFilter queryFilter);
		
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
		abstract List<Map<String,Object>> selectContentDetailByProdId(IQueryFilter queryFilter);
		
		/**
		 * 根据事件ID和营销案ID查询内容明细
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
		abstract List<Map<String,Object>> selectContentDetailsByEventIdAndMarketCaseId(IQueryFilter queryFilter);
		
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
		abstract void update(Map<String,Object> inParam);
		
	}
	
	/**
	 * 客户群属性表
	* @date: 2017-3-12 
	* @author: tangaq
	* @title: IRmCustGroupAttributeInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmCustGroupAttributeInfo{
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
		abstract void insertCustGroupAttribute(Map<String,Object> inParam) throws StrategyError;
		
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
		abstract List<Map<String, Object>> select(IQueryFilter queryFilter);
		
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
		abstract void update(Map<String,Object> inParam) throws StrategyError;
		
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
		abstract void delete(Map<String,Object> inParam) throws StrategyError;
		
	}
	
	/**
	 * 目标客户群表
	* @date: 2016-9-8 
	* @author: zhaoyue
	* @title: RmCustGroupInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmCustGroupInfo{
		
		/**
		 * 插入目标客户群
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam) throws StrategyError;
		
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
		abstract void insertCustGroupAttribute(Map<String,Object> inParam) throws StrategyError;
		
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
		abstract void insertCustGroupFile(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 查询客户群
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: select 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
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
		abstract Map<String,Object> selectByPage(IQueryFilter queryFilter,int startPage,int limit);
		
		/**
		 * 查询客户群属性
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
		abstract Map<String,Object> selectCustGroupAttribute(IQueryFilter queryFilter);
		
		/**
		 * 删除客户群
		* @date: 2017-2-10 
		* @author: wuJiaFu
		* @title: update 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 更新客户群
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam) throws StrategyError;
		
		/** 
		* @date: 2016-10-17 
		* @author: songxj
		* @title: updateById 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		abstract void updateById(Map<String,Object> inParam);
		
	}
	
	/**
	 * 客户群处理记录表
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: IRmCustGroupHandleRecordInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmCustGroupHandleRecordInfo{
		
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
		abstract void insert(Map<String,Object> inParam) throws StrategyError;
		
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
		abstract List<Map<String,Object>> selectCustGroupHandleRecord(IQueryFilter queryFilter);
	}
	
	/**
	 * 客户群标签表
	* @date: 2016-9-20 
	* @author: yangwl
	* @title: IRmCustGroupLableInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmCustGroupLabelInfo{
		
		/**
		 * 删除标签客户群
		* @date: 2016-11-3 
		* @author: zhangjj_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);
		
		/**
		 * 插入客户群标签表
		* @date: 2016-9-20 
		* @author: yangwl
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 查询客户群标签表
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
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
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
		abstract Map<String,Object> selectCustGroupLabel(IQueryFilter queryFilter);
		
		/**
		 * 更新客户群标签表
		* @date: 2016-9-20 
		* @author: yangwl
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam);
		
	}
	
	/**
	 * 用户群优先级表
	* @date: 2016-10-15 
	* @author: fangyuan_crmpd
	* @title: IRMCustGroupPriorityInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmCustGroupPriorityInfo{
		
		/**
		 * 删除用户群优先级
		* @date: 2016-10-19 
		* @author: fangyuan_crmpd
		* @title: delete 
		* @param queryFilter 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);

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
		abstract void insert(Map<String,Object> inParam);

		/**
		 * 查询用户群优先级
		* @date: 2016-10-15 
		* @author: fangyuan_crmpd
		* @title: select 
		* @param queryFilter 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> select(Map<String,Object> inParam);
	}
	
	/**
	 * 编码表
	* @date: 2016-10-24 
	* @author: xiongxq
	* @Title: IRmCodeNameDict 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmCodeNameDict{
		
		/**
		 * 删除编码表数据
		* @date: 2016-10-25 
		* @author: xiongxq
		* @Title: delete 
		* @param inParam
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);

		/**
		 * 保存编码表列表
		* @date: 2016-10-25 
		* @author: xiongxq
		* @Title: insert 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam);

		/**
		 * 查询编码列表
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
		abstract List<Map<String, Object>> select(IQueryFilter queryFilter);
		
		/**
		 * 更新编码列表
		* @date: 2016-10-26 
		* @author: xiongxq
		* @Title: update 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam);
	}
	
	/**
	 * 异网号码池表
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: IRmDifferentNetPhonePoolInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmDifferentNetPhonePoolInfo{
		
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
		abstract void delete(Map<String,Object> inParam);

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
		abstract void insert(Map<String,Object> inParam) throws StrategyError;

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
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
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
		abstract void update(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 营销案订购统计报表
	* @date: 2016-11-25 
	* @author: xiongxq
	* @Title: IRmMarketCaseOrderReportInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmMarketCaseOrderReportInfo{
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
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 查询3天推送量
		* @date: 2016-11-25 
		* @author: xiongxq
		* @Title: selectThreeDay 
		* @param queryFilter
		* @return 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> selectThreeDay(IQueryFilter queryFilter);
		
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
		abstract List<Map<String,Object>> selectSevenDay(IQueryFilter queryFilter);
		
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
		abstract List<Map<String,Object>> selectFifthDay(IQueryFilter queryFilter);
		
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
		abstract Map<String,Object> selectOrderNum(Map<String,Object> termParam);
		
		abstract List<Map<String,Object>> selectChannelMarketCaseOrderReportInfo(Map<String,Object> termParam);
		abstract Map<String,Object> selectMarketCaseOrderReportSendNum(IQueryFilter queryFilter);
	}
		
	/**
	 * 事件表
	* @date: 2016-9-10 
	* @author: zhaoyue
	* @title: IRmEventInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmEventInfo{
		
		/**
		 * 插入
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 查询
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: select 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String,Object> select(IQueryFilter queryFilter);
		
		/**
		 * 查询缴费事件ID
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: select 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> selectPayFeeEventId(IQueryFilter queryFilter);
		
		/**
		 * 更新
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam);

		/**
		 * 根据relId查询EventId
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
		abstract Map<String, Object> selectEventIdByRelId(IQueryFilter queryFilter);

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
		abstract void deleter(Map<String, Object> inParam);

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
		abstract void deleterRelation(Map<String, Object> inParam);



		
	}
	
	/**
	 * 事件详细信息
	* @date: 2016-9-10 
	* @author: zhaoyue
	* @title: IRmEventDetailInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmEventDetailInfo{
		
		/**
		 * 插入事件详细信息
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 查询事件详细信息
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: select 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);

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
		abstract List<Map<String,Object>> selectEventDetailId(IQueryFilter queryFilter);
		
		/**
		 * 修改事件详细信息
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam);

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
		abstract void deleter(Map<String, Object> inParam);

	}
	
	/**
	 * 灰名单表
	* @date: 2016-10-19 
	* @author: xiongxq
	* @Title: IRmGreyInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmGreyInfo{
		
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
		abstract void delete(Map<String,Object> inParam);

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
		abstract void insert(Map<String,Object> inParam) throws StrategyError;

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
		abstract List<Map<String, Object>> select(IQueryFilter queryFilter);
		/**
		 * 分页查询
		* @date: 2017-3-14
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
		abstract Map<String,Object> selectForPage(IQueryFilter queryFilter,int start,int limit) throws StrategyError;
		
		/**
		 * 更新
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
		abstract void update(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 清单表
	* @date: 2017-1-11 
	* @author: zhangjj_crmpd
	* @title: IRmInventoryInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmInventoryInfo{
		
		/**
		 * 删除清单
		* @date: 2017-1-11 
		* @author: zhangjj_crmpd
		* @title: delete 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> tempInParam);

		/**
		 * 插入清单
		* @date: 2017-1-11 
		* @author: zhangjj_crmpd
		* @title: insert 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> tempInParam) throws StrategyError;

		/**
		 * 查询清单
		* @date: 2017-1-11 
		* @author: zhangjj_crmpd
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>> select(IQueryFilter queryFilter);
		
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
		abstract Map<String, Object> selectByPage(IQueryFilter queryFilter,int startPage,int limit);
		
		/**
		 * 更新清单
		* @date: 2017-1-11 
		* @author: zhangjj_crmpd
		* @title: update 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> tempInParam) throws StrategyError;
	}
	
	
	/**
	 * 经分同步的用户标签表(吉林)
	* @date: 2017-2-23 
	* @author: yuanchun
	* @title: RmlabelArchivesTmp 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmlabelArchivesTmp{
		
		/**
		 * 分页查询用户标签列表
		* @date: 2017-3-2 
		* @author: yuanchun
		* @title: selectUserLabel 
		* @param inParam
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String,Object> selectUserLabel(IQueryFilter queryFilter,int start,int limit);
		
		/**
		 * 查询用户标签列表
		* @date: 2017-3-2 
		* @author: yuanchun
		* @title: selectUserLabel 
		* @param inParam
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> selectUserLabel(Map<String,Object> inParam,IQueryFilter queryFilter);
		
	}
	
	/**
	 * 标签码表
	* @date: 2017-3-4 
	* @author: yuanchun
	* @title: IRmLabelCodeNameDict 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmLabelCodeNameDict{
		
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
		abstract Map<String,Object> selectLabelCodeName(IQueryFilter queryFilter,int start,int limit);
	}
	
	/**
	 * 工号表
	* @date: 2016-10-27 
	* @author: xiongxq
	* @Title: IRmLoginuserInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmLoginMsgInfo{
		
		/**
		 * 插入工号
		* @date: 2016-12-26 
		* @author: hannn
		* @Title: insertServiceNo 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 查询
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
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
		/** 分页查询
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
		abstract Map<String,Object> selectForPage(IQueryFilter queryFilter,int start,int limit);

		/** 查询登录工号
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
		abstract Map<String,Object> selectLoginNo(IQueryFilter queryFilter);
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
		abstract int updateLoginPassword(Map<String, Object> inParam);

	}
	
	/**
	 * 营销案商机表
	* @date: 2016-12-13 
	* @author: tangaq
	* @title: IRmMarketCaseBussinessInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmMarketCaseBussinessInfo{
		
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
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
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
		abstract List<Map<String,Object>> selectByRegionCode(IQueryFilter queryFilter);
	}
	
	/**
	 * 营销案属性表
	* @date: 2017-3-12 
	* @author: tangaq
	* @title: IRmMarketCaseAttributeInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmMarketCaseAttributeInfo{
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
		abstract void insert(Map<String, Object> inParam)throws StrategyError;
		
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
		abstract void update(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 删除营销案属性
		* @date: 2017-3-12 
		* @author: tangaq
		* @title: deleteMarketCaseById 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);
	}
	
	/**
	 * 营销案表
	* @date: 2016-9-8 
	* @author: zhaoyue
	* @title: IRmMarketCaseInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmMarketCaseInfo{
		
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
		abstract void deleteMarketCaseById(Map<String,Object> inParam);
		
		/**
		 * 插入营销案
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 查询营销案
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: select 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
		/**
		 * 根据id查询营销案
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
		abstract Map<String,Object> selectMarketCaseById(IQueryFilter queryFilter);
		
		/**
		 * 查询营销案ID列表
		* @date: 2016-10-27 
		* @author: yangwl
		* @title: selectMarketCaseIdList 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>> selectMarketCaseIdList(IQueryFilter queryFilter);
		
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
		abstract Map<String, Object> selectMarketCaseReportFormList(IQueryFilter queryFilter, int start, int limit);
		
		/**
		 * 查询目标客户数
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
		abstract Map<String, Object> selectMarketCaseTargetCustCount(IQueryFilter queryFilter);

		/**
		 * 根据权限查询营销案列表
		* @date: 2017-1-5 
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
		abstract Map<String, Object> selectMarketCaseListForPage(IQueryFilter queryFilter, int start, int limit);
		
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
		abstract List<Map<String,Object>> selectBatchPushMarketCaseAndCustGroup(IQueryFilter queryFilter);
		
		/**
		 * 查询渠道触发营销案
		* @date: 2016-11-21 
		* @author: yangwl
		* @title: selectMarketCaseAndPositionId 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> selectChannelTriggerMarketCase(IQueryFilter queryFilter);

		/**
		 * 查找营销案和全局规则信息
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
		abstract List<Map<String,Object>> selectMarketCaseAndWholeRuleDetail(IQueryFilter queryFilter);

		/**
		 * 查询外呼任务的营销案下的目标客户群类型和目标客户群标签表达式
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
		abstract List<Map<String, Object>> selectCallTaskMarketCaseLabelFormula(IQueryFilter queryFilter);
		
		/**
		 * 查询渠道任务的营销案下的目标客户群类型和目标客户群标签表达式
		* @date: 2016-10-12 
		* @author: yangwl
		* @title: selectMarketCaseRelCustGroup 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> selectChannelTaskMarketCaseLabelFormula(IQueryFilter queryFilter);

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
		abstract List<Map<String, Object>> selectEventTriggerMarketCase(IQueryFilter queryFilter);
		
		/**
		 * 更新营销案
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam) throws StrategyError;
		
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
		abstract Map<String,Object> selectMarketCaseNum(IQueryFilter queryFilter);

	}
	
	/**
	 * 菜单表
	* @date: 2016-10-26 
	* @author: fangyuan_crmpd
	* @title: IRmMenuInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmMenuInfo{
		
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
		abstract void delete(Map<String,Object> inParam);

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
		abstract void insert(Map<String,Object> inParam);

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
		abstract List<Map<String, Object>> selectMenuList(Map<String,Object> inParam);
		
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
		abstract List<Map<String, Object>> selectMenuDetailById(Map<String,Object> inParam);
		
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
		abstract List<Map<String, Object>> selectMenuListByLoginNo(Map<String,Object> inParam);
		
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
		abstract void update(Map<String,Object> inParam);
		
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
	public abstract class IRmMessageTriggerLogInfo{
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
		abstract void insert(Map<String, Object> inParam) throws StrategyError;
		
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
		abstract Map<String,Object> select(Map<String, Object> inParam, IQueryFilter queryFilter,
				int start, int limit);
		
	}
	
	
	/**
	 * 监控告警表
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: IRmMonitorWarningInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmMonitorWarningInfo{
		
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
		abstract void delete(Map<String, Object> inParam);
		
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
		abstract void insert(Map<String, Object> inParam) throws StrategyError;
		
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
		abstract Map<String,Object> select(Map<String, Object> inParam);
			
	}
	
	 /**
	   * 公告表
	  * @date: 2017-2-27 
	  * @author: yexr
	  * @title: IRmNoticeInfo 
	  * @version: 1.0 
	  * @description： 
	  * update_version: update_date: update_author: update_note:
	   */
     public abstract class IRmNoticeInfo{
		
		/**
		 * 查询公告列表
		* @date: 2017-2-27 
		* @author: yexr
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
  	   abstract Map<String, Object> selectNoticeList(IQueryFilter queryFilter,int start,int limit);
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
  	  abstract void insertNotice(Map<String,Object> tempInParam) throws StrategyError;
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
	   	abstract void removeNotice(Map<String, Object> inParam);
		/**
		 * 修改公告
		* @date: 2017-3-1 
		* @author: yexr
		* @title: updateNotice 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
	   	abstract void updateNotice(Map<String,Object> inParam);
		
	}
	
	/**
	 * 操作日志表
	* @date: 2016-11-1 
	* @author: tangaq
	* @title: IRmOperLogInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmOperLogInfo{
				
		/**
		 * 查询操作日志列表
		* @date: 2016-11-1 
		* @author: tangaq
		* @title: selectOperLogList 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String,Object> selectOperLogList(IQueryFilter queryFilter,int start,int limit);
		
	}
	
	/**
	 * 运营位表
	* @date: 2016-9-10 
	* @author: zhaoyue
	* @title: IRmPositionInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmPositionInfo{
		
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
		abstract void delete(Map<String,Object> inParam);
		
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
		abstract void insert(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 查询运营位信息
		* @date: 2016-9-10 
		* @author: zhaoyue
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>> select(IQueryFilter queryFilter);
		
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
		abstract void update(Map<String,Object> inParam) throws StrategyError;

		
	}
	
	/**
	 * 产商品操作
	* @date: 2016-9-27 
	* @author: zhangjj_crmpd
	* @title: IRmProductCommodityInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmProductCommodityInfo{
		
		/**
		 * 查询产商品列表
		* @date: 2016-9-27 
		* @author: zhangjj_crmpd
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> selectRmProductCommodityList(IQueryFilter queryFilter,int startNum,int endNum);
		
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
		abstract Map<String,Object> selectRmProductCommodity(IQueryFilter queryFilter);
		
		
		
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
		abstract String selectProductCommodityCount(IQueryFilter queryFilter);
	}
	/**
	* Create on 2016-10-15
	* @author: wangpei
	* @Title:IRmProductInfo
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public abstract class IRmProductInfo{
		
		/** 产品查询
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
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
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
		abstract Map<String,Object> selectForPage(IQueryFilter queryFilter,int start,int limit);

	}
	/**
	 * 用户推荐表
	* @date: 2017-1-6 
	* @author: liuqi
	* @title: IRmUserTouchViewInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmRecommendRecordInfo {
		
		/**
		 * 查询用户推荐表
		* @date: 2017-1-6 
		* @author:liuqi
		* @title: select 
		* @param inParam
		* @param queryFilter
		* @param start
		* @param limit
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract  Map<String, Object> select(Map<String, Object> inParam,
				IQueryFilter queryFilter, int start, int limit); 
	}
	
	/**
	 * 查询回单反馈类
	* @date: 2017-1-9 
	* @author: liuqi
	* @title: IRmReceiptRecordInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmReceiptRecordInfo {
		
		/**
		 * 查询用户回单反馈表
		* @date: 2017-1-9 
		* @author:liuqi
		* @title: select 
		* @param inParam
		* @param queryFilter
		* @param start
		* @param limit
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String, Object> select(Map<String, Object> inParam,IQueryFilter queryFilter, int start, int limit); 
	}
	
	/**
	 * 关系表
	* @date: 2016-9-8 
	* @author: zhaoyue
	* @title: IRmRelstionRel 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmRelationRel{
		
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
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 *  查询关系表
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: select 
		* @param inParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>>  select(IQueryFilter queryFilter);
		
		/**
		 * 查询客户群与子客户关系列表
		* @date: 2016-11-25 
		* @author: fangyuan_crmpd
		* @title: selectCustGroupRelation 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> selectCustGroupRelation(IQueryFilter queryFilter);
				
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
		abstract List<Map<String,Object>> selectMarketCaseIdByEventId(IQueryFilter queryFilter);
		
		/**
		 * 根据渠道查询营销案id
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
		abstract Map<String,Object> selectMarketCaseIdByChannelRel(IQueryFilter queryFilter);
		
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
		abstract Map<String, Object> selectMarketCaseIdByRuleId(IQueryFilter queryFilter);
		
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
		abstract Map<String, Object>  selectRelation(IQueryFilter queryFilter);

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
		abstract void update(Map<String,Object> inParam);
		
		/** 删除关系
		* @date: 2016-10-14 
		* @author: wangpei
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		abstract void delete(Map<String,Object> inParam);

	}
	
	/**
	 * 角色表
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: IRmRoleInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmRoleInfo{
		
		/**
		 * 删除角色
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: delete 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);
		
		/**
		 * 插入角色
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: insert 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 查询角色列表
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: select 
		* @param inParam
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
		/**
		 *根据工号查询该工号下面拥有的角色列表 
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
		abstract List<Map<String, Object>> selectByLoginNo(IQueryFilter queryFilter);
		
		/**
		 * 根据工号查询该工号下面未拥有的角色列表 
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
		abstract List<Map<String, Object>> selectNoHasByLoginNo(IQueryFilter queryFilter);
		
		/**
		 * 更新角色
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: update 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam);
		
	}
	
	/**
	 * 角色菜单关系
	* @date: 2016-10-28 
	* @author: zhangjj_crmpd
	* @title: IRmRoleMenuRel 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmRoleMenuRel{
		
		/**
		 * 删除角色与菜单关系
		* @date: 2016-10-28 
		* @author: zhangjj_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);
		
		/**
		 * 插入角色与菜单关系
		* @date: 2016-10-28 
		* @author: zhangjj_crmpd
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(List<Map<String, Object>> list);
		
		/**
		 * 查询角色与菜单关系
		* @date: 2016-10-28 
		* @author: zhangjj_crmpd
		* @title: select 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
	}
	
	/**
	 * 用户角色关系表
	* @date: 2016-10-26 
	* @author: wangth
	* @Title: IRmRoleUserRel 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmRoleUserRel{
		
		/**
		 * 批量插入角色和用户关系
		* @date: 2016-10-29 
		* @author: xiongxq
		* @Title: batchInsert 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insertBatchRoleUserRel(Map<String,Object> inParam);

		/**
		 * 删除角色与用户关系
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: delete 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);

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
		abstract void deleteByLoginNo(Map<String,Object> inParam);

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
		abstract void insertAccessCode(Map<String,Object> inParam);
		
		/**
		 *批量添加接入码 
		* @date: 2016-10-29 
		* @author: xiongxq
		* @Title: insertBatchAccessCode 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insertBatchAccessCode(Map<String,Object> inParam);
		
		/**
		 * 插入角色和用户关系
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: insert 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 查询角色与用户关系列表
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: select 
		* @param inParam
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
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
	public abstract class IRmRuleInfo{
		
		/**
		 * 插入规则表
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 删除规则表
		* @date: 2016-10-21 
		* @author: zhangjj_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);

		/**
		 * 查询规则表
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: select 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String,Object> select(IQueryFilter queryFilter);
		
		/**
		 * 查询规则表结合
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
		abstract List<Map<String,Object>> selectRuleInfoList(IQueryFilter queryFilter);
		
		/**
		 * 更新规则表
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam);
	}
	
	/**
	 * 规则详细信息表
	* @date: 2016-9-8 
	* @author: zhaoyue
	* @title: RmRuleDetailInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmRuleDetailInfo{
		
		/**
		 * 删除规则信息
		* @date: 2016-10-15 
		* @author: xiongxq
		* @Title: delete 
		* @param inParam 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);
		
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
		abstract void insert(Map<String,Object> inParam);
		
		/**
		 * 查询规则信息
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: select 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>> select(IQueryFilter queryFilter);
		
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
		abstract List<Map<String, Object>> selectRuleDetailBatchNoById(IQueryFilter queryFilter);
		
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
		abstract List<Map<String, Object>> selectRuleDetailByParentComponentId(IQueryFilter queryFilter);
		
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
		abstract List<Map<String,Object>> selectRuleDetailId(IQueryFilter queryFilter);
		
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
		abstract List<Map<String,Object>> selectRuleDetailsByEventIdAndMarketCaseId(IQueryFilter queryFilter);
		
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
		abstract List<Map<String, Object>> selectWholeRuleDetailByMarketCaseId(IQueryFilter queryFilter);
		
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
		abstract void update(Map<String,Object> inParam);

		/**
		 * 根据push营销案id查询规则
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
		abstract List<Map<String, Object>> selectRuleDetailByMarketCaseId(IQueryFilter queryFilter);
	}
	
	
	/**
	 * 批量PUSH生成记录表
	* @date: 2016-9-8 
	* @author: zhangqia
	* @title: IRmWaitSendTaskControlInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmWaitSendTaskControlInfo{
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
		abstract void insert(Map<String,Object> inParam);
		
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
		abstract List<Map<String, Object>> select(IQueryFilter queryFilter);
	}
	
	/**服务监控表
	* Create on 2017-3-8
	* @author: wangpei
	* @Title:IRmServicemonitoringInfo
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public abstract class IRmServicemonitoringInfo{
		/** 插入
		* @date: 2017-3-8 
		* @author: wangpei
		* @title: insert 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		abstract void insert(Map<String, Object> tempInParam);
		
		/**
		 * 查询
		* @date: 2017-3-10 
		* @author: wuJiaFu
		* @title: select 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String, Object> select(Map<String, Object> inParam,int start,int limit);
	}
	/**
	 * 短信信息
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: IRmShortMessageInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmShortMessageInfo{
		
		/**
		 * 删除短信信息
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: delete 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);
		
		/**
		 * 插入短信信息
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		 * @throws StrategyError 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> inParam) throws StrategyError;

		/**
		 * 查询短信列表信息
		* @date: 2016-9-8 
		* @author: zhaoyue
		* @title: select 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>> select(IQueryFilter queryFilter);
		
		/**
		 * 根据工号查询该工号下面拥有的接入码列表
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
		abstract List<Map<String, Object>> selectAccessCodeByLoginNo(IQueryFilter queryFilter);
		
		/**
		 *根据工号查询该工号下面未有的接入码列表 
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
		abstract List<Map<String, Object>> selectNotHasAccessCodeByLoginNo(IQueryFilter queryFilter);

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
		abstract void update(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 短信推送流量表
	* @date: 2016-10-31 
	* @author: fangyuan_crmpd
	* @title: IRmShortMsgMoveTrafficInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmShortMsgMoveTrafficInfo{
		
		/**
		 * 根据日期查询短信推送流量
		* @date: 2016-10-30 
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
		abstract List<Map<String, Object>> selectShortMsgMoveTrafficByDate(Map<String, Object> inParam) throws StrategyError;
		
		/**
		 * 根据营销案ID查询短信推送流量
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
		abstract List<Map<String, Object>> selectShortMsgMoveTrafficByMarketCaseId(Map<String, Object> inParam);
		
	}

	/**
	 * shell进程执行信息表
	* @date: 2016-10-13 
	* @author: yangwl
	* @title: IRmShellProcessExecuteInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmShellProcessExecuteInfo{
		
		/**
		 * 插入
		* @date: 2016-10-13 
		* @author: yangwl
		* @title: insert 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String,Object> tempInParam);
		
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
		abstract List<Map<String, Object>> select(IQueryFilter queryFilter);
		
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
		abstract void update(Map<String,Object> tempInParam);


		/**
		 * 
		* @date: 2017-4-14 
		* @author: chenhao
		* @title: selectToday 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String, Object>> selectToday(IQueryFilter queryFilter);

		}

	/**
	 * 任务调配表
	* @date: 2016-12-15 
	* @author: zhangjj_crmpd
	* @title: IRmTaskAdjustInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmTaskAdjustInfo{
		
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
		abstract void insert(Map<String,Object> inParam) throws StrategyError;
		
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
		abstract Map<String, Object> selectTaskAdjustInfo(IQueryFilter queryFilter);
		
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
		abstract List<Map<String, Object>> selectTaskAdjustInfoByParam(IQueryFilter queryFilter);
		
		/**
		 * 更新调配信息
		* @date: 2016-12-15 
		* @author: zhangjj_crmpd
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam);
		
		/**
		 * 删除调配信息
		* @date: 2016-12-15 
		* @author: zhangjj_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);
	}
	
	
	/**
	 * 模板表
	* @date: 2016-10-19 
	* @author: zhangjj_crmpd
	* @title: IRmTemplateInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmTemplateInfo{
		
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
		abstract void insert(Map<String,Object> inParam) throws StrategyError;
		
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
		abstract List<Map<String, Object>> selectTemplateList(IQueryFilter queryFilter);
		
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
		abstract Map<String, Object> selectTemplateInfo(IQueryFilter queryFilter);
		
		/**
		 * 更新模板
		* @date: 2016-10-19 
		* @author: zhangjj_crmpd
		* @title: update 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam);
		
		/**
		 * 删除模板
		* @date: 2016-10-19 
		* @author: zhangjj_crmpd
		* @title: delete 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void delete(Map<String,Object> inParam);
	}
	
	/**
	 * 接触量表
	* @date: 2016-12-13 
	* @author: tangaq
	* @title: IRmTouchCountInfo 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmTouchCountInfo{
		
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
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter);
		
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
		abstract List<Map<String,Object>> selectByRegionCode(IQueryFilter queryFilter);
		
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
		abstract List<Map<String,Object>> selectRegionCodeConvertRate(IQueryFilter queryFilter);
	}
	
	/**
	 * 用户临时标签表
	* @date: 2016-10-20 
	* @author: tangaq
	* @title: IRmUserLabelTmp 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmUserLabelTmp{
		
		/**
		 * 删除
		* @date: 2016-10-27 
		* @author: fangyuan_crmpd
		* @title: deleteUserLabel 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void deleteUserLabel(Map<String,Object> inParam);

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
		abstract void insertUserLabel(Map<String,Object> inParam) throws StrategyError;

		/**
		 * 查询用户标签
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
		abstract List<Map<String,Object>> selectUserLabel(IQueryFilter queryFilter);
		
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
		abstract Map<String,Object> selectForPage(IQueryFilter queryFilter,int start,int limit);
		
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
		abstract void updateUserLabel(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 用户资料表
	* @date: 2016-11-11 
	* @author: fangyuan_crmpd
	* @title: IRmUserMsgInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmUserInfo{
		
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
		abstract List<Map<String, Object>> select(IQueryFilter queryFilter);
		
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
		abstract Map<String, Object> selectForPage(IQueryFilter queryFilter,int start,int limit);
		
	}
	
	/**
	 * 作业配置表
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: IRmWorkCofigInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmWorkCofigInfo{
		
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
		abstract void delete(Map<String,Object> inParam);
		
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
		abstract void insert(Map<String,Object> inParam) throws StrategyError;
		
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
		abstract List<Map<String, Object>> select(IQueryFilter queryFilter);
		
		/**
		 * 更新作业配置列表
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: update 
		* @param inParam 
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void update(Map<String,Object> inParam) throws StrategyError;
	}
	/**
	 * 调查问卷表
	* @date: 2016-12-12 
	* @author: zhangqia
	* @Title: IRmQuestionNaireInfo 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmQuestionNaireInfo{
		
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
		abstract void insert(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 根据ID查询问卷调查
		* @date: 2016-12-12 
		* @author: zhangqia
		* @Title: select 
		* @param queryFilter
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract Map<String, Object> select(IQueryFilter queryFilter);
		/**
		 * 查询问卷调查列表
		* @date: 2016-12-21 
		* @author: yuanliang
		* @title: selectL 
		* @param queryFilter
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract List<Map<String,Object>> selectQuestionNaireList(IQueryFilter queryFilter);
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
		abstract List<Map<String,Object>> selectMarketCaseAndContentList(IQueryFilter queryFilter);
		
		/**
		 * 更新问卷调查根据ID
		* @date: 2016-12-12 
		* @author: zhangqia
		* @Title: update 
		* @param inParam 
		* @version 1.0 
		 * @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		
		abstract void update(Map<String,Object> inParam) throws StrategyError;
	}

/**
	 * 查询产商品信息报表
	* @date: 2017-2-21 
	* @author: hannn
	* @title: IRmProductCommodityReportInfo 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public abstract class IRmProductCommodityReportInfo{
		/**
		 * 导入产商品通用信息报表数据
		* @date: 2017-1-24 
		* @author: mengxi
		* @title: insert 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		abstract void insert(Map<String, Object> inParam);
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
		abstract List<Map<String,Object>> select(IQueryFilter queryFilter,int startNum,int endNum);
		/**
		 * 
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
		abstract String selectProductCommodityReportCount(IQueryFilter queryFilter);
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
		abstract List<Map<String,Object>> selectProductCommodityReport(IQueryFilter queryFilter,int startNum,int endNum);
	}
}

