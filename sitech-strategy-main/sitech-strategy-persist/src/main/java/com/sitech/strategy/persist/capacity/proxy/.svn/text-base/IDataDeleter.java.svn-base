package com.sitech.strategy.persist.capacity.proxy;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 数据删除器
* @date: 2016-9-5 
* @author: zhaoyue
* @title: IDataDeleter 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IDataDeleter {
	
	/**
	 * 活动需求数据删除操作接口
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: IActDemandDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IActDemandDeleter{
		
		/**
		 * 删除活动需求
		* @date: 2016-10-21 
		* @author: wangth
		* @Title: deleteActDemand 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteActDemand(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 审批记录数据删除操作接口
	* @date: 2016-10-13 
	* @author: tangaq
	* @title: IAuditDeleter 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IAuditDeleter{
		
		/**
		 * 删除审批工号
		* @date: 2016-10-13 
		* @author: tangaq
		* @title: deleteAuditNo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteAuditNo(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 附件删除接口
	* @date: 2016-10-24 
	* @author: wangth
	* @Title: IAttachDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IAttachDeleter{
			
		/**
		 * 删除附件
		* @date: 2016-10-24 
		* @author: wangth
		* @Title: deleteAttach 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteAttach(Map<String,Object> inParam) throws StrategyError;
		
	}
		
	/**
	 * 渠道删除操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IChannelDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IChannelDeleter{
		
		/**
		 * 删除渠道信息
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: deleteChannelInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteChannelInfo(Map<String,Object> inParam) throws StrategyError;
		
		/** 删除客户群渠道关系
		* @date: 2016-10-17 
		* @author: wangpei
		* @title: deleteCustGroupChannelRelation 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public void deleteCustGroupChannelRelation(Map<String,Object> inParam) throws StrategyError;

	}
	
	/**
	 * 渠道显示删除数据操作接口
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: IChannelShowDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IChannelShowDeleter{
		
		/**
		 * 删除渠道显示信息
		* @date: 2016-10-18 
		* @author: fangyuan_crmpd
		* @title: deleteChannelInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteChannelShowInfo(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 配置删除操作接口
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: IConfigDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IConfigDeleter{
		
		/**
		 * 删除选项信息
		* @date: 2016-10-25 
		* @author: xiongxq
		* @Title: deleteOptionInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteOptionInfo(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 内容数据删除接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IContentDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IContentDeleter{
		
		/**
		 * 删除内容信息
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: deleteContentInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteContentInfo(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 删除内容详细信息
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: deleteContentDetailInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteContentDetailInfo(Map<String,Object> inParam) throws StrategyError;
		
		/** 删除关系
		* @date: 2016-10-18 
		* @author: wangpei
		* @title: deleteRelation 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public void deleteRelation(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 客户群数据删除操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: ICustGroupDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ICustGroupDeleter{
		
		/**
		 * 删除客户群信息
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: deleteCustGroup 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteCustGroup(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 删除客户群标签信息
		* @date: 2016-11-3 
		* @author: zhangjj_crmpd
		* @title: deleteCustGroupLabel 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteCustGroupLabel(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 删除客户群中的手机号码
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: deletePhoneNoFromCustGroup 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deletePhoneNoFromCustGroup(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 批量删除客户群中的手机号码
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: deletePhoneNoFromCustGroup 
		* @param list
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deletePhoneNoFromCustGroup(List list) throws StrategyError;
		
		/**
		 * 获取后删除目标客户群表名缓存（静态标签）
		* @date: 2017-3-15 
		* @author:liuqi
		* @title: getAndDeleteCustGroupTableNameCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public String getAndDeleteCustGroupTableNameCache(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 删除客户群临时表
		* @date: 2016-10-30 
		* @author: zhangjj_crmpd
		* @title: dropCustGroupTemp 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void dropCustGroupTemp(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 *  公共数据删除操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: ICommonDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ICommonDeleter{
		
	}

	/**
	 * 事件数据删除操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IEventDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IEventDeleter{
		
		/**
		 * 删除事件信息
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: deleteEventInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteEventInfo(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 删除事件详细信息
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: deleteEventDetailInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteEventDetailInfo(Map<String,Object> inParam) throws StrategyError;
		/**
		 * 删除事件和客户群关系
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: deleteEventDetailInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteCustGroupEventRelation(Map<String, Object> inParam) throws StrategyError;
		
	}
	
	/**
	 * 清单数据删除操作接口
	* @date: 2017-4-25 
	* @author: zhangzx_crmpd
	* @title: IInventoryDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IInventoryDeleter{
		
		/**
		 * 删除清单信息
		* @date: 2017-4-25 
		* @author: zhangzx_crmpd
		* @title: deleteInventoryInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteInventoryInfo(Map<String,Object> inParam) throws StrategyError; 
		
	}
	
	
	
	/**
	 * 登录(权限、角色、菜单)数据删除操作接口
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: ILoginDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ILoginDeleter{
		
		/**
		 * 删除菜单
		* @date: 2016-10-26 
		* @author: fangyuan_crmpd
		* @title: deleteMenuInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteMenuInfo(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 删除角色
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: delete 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void delete(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 删除角色与菜单关系
		* @date: 2016-10-28 
		* @author: zhangjj_crmpd
		* @title: deleteRoleMenuRel 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteRoleMenuRel(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 删除用户和角色关系
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: deleteRoleUserRel 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteRoleUserRel(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 营销案数据删除操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IMarketCaseDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IMarketCaseDeleter{
		
		/**
		 * 从缓存中删除批量push营销案任务
		* @date: 2016-10-9 
		* @author: yangwl
		* @title: deleteBatchPushMarketCaseTaskFromCache 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		//public void deleteBatchPushMarketCaseTaskFromCache(Map<String, Object> inParam) throws StrategyError;
		
		/**
		 * 移除缓存中的批量push营销案状态信息
		* @date: 2016-9-29 
		* @author: wangth
		* @Title: removeBatchPushTaskStatusCodeFromCache 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		//public void removeBatchPushTaskStatusCodeFromCache(Map<String, Object> inParam) throws StrategyError;
		
		/**
		 * 从缓存中删除营销案推荐状态
		* @date: 2017-2-7 
		* @author: sunliang 
		* @title: removeMarketCaseRecommendStatusFromCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void removeMarketCaseRecommendStatusFromCache(Map<String, Object> tempInParam) throws StrategyError;
		
		/** 删除客户群营销案关系
		* @date: 2016-10-14 
		* @author: wangpei
		* @title: removeMaketCaseCustGroupRelation 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public void removeMaketCaseCustGroupRelation(Map<String, Object> inParam) throws StrategyError;
		
		/**
		 * 从缓存中删除待发送批量push营销案
		* @date: 2016-12-24 
		* @author: sunliang 
		* @title: removeWaitSendBatchPushMarketCaseFromCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void removeWaitSendBatchPushMarketCaseFromCache(Map<String, Object> tempInParam) throws StrategyError;
	
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
		public void deleteMarketCaseById(Map<String, Object> inParam);

		/**
		 * 按value删除待生成批量营销案临时缓存队列
		* @date: 2017-5-3 
		* @author: chenhao
		* @title: rmWaitCreateBatchPushMarketCaseTmp 
		* @param taskType
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public Map<String, Map<String, String>> rmWaitCreateBatchPushMarketCaseTmp(String taskType,Map<String, Map<String,String>> rmMap)throws StrategyError;

		/**
		 * 按key删除待生成批量营销案临时缓存队列list
		* @date: 2017-5-5 
		* @author: chenhao
		* @title: rmWaitCreateBatchPushMarketCaseTmpList 
		* @param taskType 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void rmWaitCreateBatchPushMarketCaseTmpList(String taskType) throws StrategyError;
	
	}
	
	/**
	 * 监控数据删除接口
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: IMonitorWarningDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IMonitorDeleter{
		
		/**
		 * 删除作业运行告警详细信息
		* @date: 2016-11-13 
		* @author: fangyuan_crmpd
		* @title: deleteWorkOperWarningInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteWorkOperWarningInfo(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 运营位数据删除接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IPositionDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IPositionDeleter{
		
		/**
		 * 删除运营位信息
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: deletePositionInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deletePositionInfo(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 删除运营位属性信息
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: deletePositionAttrInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deletePositionAttrInfo(Map<String,Object> inParam) throws StrategyError;
		
	}

	/**
	 * 删除优先级数据操作接口
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: IPriorityDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IPriorityDeleter{
		
		/**
		 * 删除区域优先级配置信息
		* @date: 2016-10-19 
		* @author: fangyuan_crmpd
		* @title: deleteAreaPriorityConfigInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteAreaPriorityConfigInfo(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 删除用户群优先级配置信息
		* @date: 2016-10-19 
		* @author: fangyuan_crmpd
		* @title: deleteCustGroupPriorityConfigInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteCustGroupPriorityConfigInfo(Map<String,Object> inParam) throws StrategyError;
	}

	/**
	 * 关系删除操作接口
	* @date: 2016-10-21 
	* @author: zhangjj_crmpd
	* @title: IRelationDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IRelationDeleter{
		
		/**
		 * 删除关系
		* @date: 2016-10-21 
		* @author: zhangjj_crmpd
		* @title: deleteRelation 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteRelation(Map<String,Object> inParam) throws StrategyError;
		
	}
	
	/**
	 * 规则数据删除操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IRuleDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IRuleDeleter{
		
		/**
		 * 删除全局规则
		* @date: 2016-10-15 
		* @author: xiongxq
		* @Title: deleteGlobalRule 
		* @param inParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteGlobalRule(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 删除规则信息
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: deleteRuleInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteRuleInfo(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 删除规则详细信息
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: deleteRuleDetailInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteRuleDetailInfo(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 短信删除操作接口
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: IShortMessage 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IShortMessageDeleter{
		
		/**
		 * 根据工号删除接入码
		* @date: 2016-10-28 
		* @author: xiongxq
		* @Title: deleteAccessCodeByLoginNo 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteAccessCodeByLoginNo(Map<String,Object> inParam)throws StrategyError;

		/**
		 *删除短信接入码接口
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: deleteShortMessageAccessCode  
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteShortMessageAccessCode(Map<String,Object> inParam,Map<String,Object> tempInParam)throws StrategyError;
	}
	
	/**
	 * 数据统计接口
	* @date: 2017-3-1 
	* @author: yexr
	* @title: IStatisticDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IStatisticDeleter{
		/**
		 * 删除公告
		* @date: 2017-3-1 
		* @author: yexr
		* @title: removeNotice 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void removeNotice(Map<String,Object> inParam) throws StrategyError;
	}
	
	/** 
	 * 删除批量push索引数据
	* @date: 2016-11-4 
	* @author: songxj
	* @title: ITaskIndexDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note: 
	*/
	public interface ITaskDeleter {
		
		/** 
		 * 删除批量push索引数据
		 * @date: 2016-11-4 
		 * @author: songxj
		 * @title: deleteBatchPushTaskIndex 
		 * @param tempInParam 
		 * @exception: 
		 * @version: 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void deleteBatchPushTaskIndex(Map<String, Object> tempInParam);
	}

	/**
	 * 删除模板信息接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: ITemplateDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ITemplateDeleter{
		
		/**
		 * 
		* @date: 2016-10-19 
		* @author: zhangjj_crmpd
		* @title: deleteTemplate 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		 public void deleteTemplate(Map<String,Object> inParam) throws StrategyError;
		
	}

	/**
	 * 用户删除操作接口
	* @date: 2016-9-5 
	* @author: zhaoyue
	* @title: IUserDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IUserDeleter{
		
		/**
		 * 删除灰名单
		* @date: 2016-10-19 
		* @author: xiongxq
		* @Title: deleteGrey 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteGrey(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 从NoSql中删除黑名单数据
		* @date: 2016-12-6 
		* @author: zhangjj_crmpd
		* @title: deleteGreyFromNoSql 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteGreyFromNoSql(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 删除异网号码池 
		* @date: 2016-10-31 
		* @author: xiongxq
		* @Title: deleteDifferentNetPhonePool 
		* @param inParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteDifferentNetPhonePool(Map<String,Object> inParam)throws StrategyError;
		
		/**
		 * 删除用户标签
		* @date: 2016-10-27 
		* @author: fangyuan_crmpd
		* @title: deleteUserLabel 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void deleteUserLabel(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 删除作业配置接口
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: IWorkConfig 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IWorkConfigDeleter{
		
		/**
		 *删除作业配置
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: delete 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void delete(Map<String,Object> inParam) throws StrategyError;
	}
}
