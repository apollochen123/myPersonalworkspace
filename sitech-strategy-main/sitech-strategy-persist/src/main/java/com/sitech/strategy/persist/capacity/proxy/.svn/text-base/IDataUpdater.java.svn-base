package com.sitech.strategy.persist.capacity.proxy;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 数据更新器
* @date: 2016-9-5 
* @author: zhangjj_crmpd
* @title: IDataUpdater 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IDataUpdater {
	
	/**
	 * 活动需求数据更新接口
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: IActDemandUpdater 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IActDemandUpdater{
		
		/**
		 * 更新活动需求
		* @date: 2016-10-21 
		* @author: wangth
		* @Title: updateActDemand 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateActDemand(Map<String,Object> inParam) throws StrategyError;
	}
	/**
	 * 审批记录数据更新操作接口
	* @date: 2016-9-5 
	* @author: zhangjj_crmpd
	* @title: IAuditUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IAuditUpdater{
		
		/**
		 * 更新审批记录
		* @date: 2016-9-30 
		* @author: zhaoyue
		* @title: updateAuditRecord 
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateAuditRecord(Map<String,Object> inParam) throws StrategyError;

	}
	
	/**
	 * 渠道数据更新操作接口
	* @date: 2016-9-5 
	* @author: zhangjj_crmpd
	* @title: IChannelUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IChannelUpdater{
		
		/**
		 * 更新渠道信息	
		* @date: 2016-9-5 
		* @author: zhangjj_crmpd
		* @title: updateChannelInfo 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateChannelInfo(Map<String,Object> inParam);
	}
	
	/**
	 * 渠道数据更新操作接口
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: IChannelShowUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IChannelShowUpdater{
		
		/**
		 * 更新渠道显示数据
		* @date: 2016-10-18 
		* @author: fangyuan_crmpd
		* @title: updateChannelShowInfo 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateChannelShowInfo(Map<String,Object> inParam);
	}
	
	/**
	 * 公共数据更新操作接口
	* @date: 2016-9-5 
	* @author: zhangjj_crmpd
	* @title: ICommonUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ICommonUpdater{
	}
	
	/**
	 * 配置更新操作接口
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: IConfigUpdater 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IConfigUpdater{
		
		/**
		 * 更新选项配置
		* @date: 2016-10-26 
		* @author: xiongxq
		* @Title: updateOption 
		* @param inParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateOption(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 内容数据更新操作接口
	* @date: 2016-9-5 
	* @author: zhangjj_crmpd
	* @title: IContentUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IContentUpdater{
		
		/**
		 * 更新内容信息
		* @date: 2016-9-5 
		* @author: zhangjj_crmpd
		* @title: updateContentInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateContentInfo(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 更新内容详细信息
		* @date: 2016-9-5 
		* @author: zhangjj_crmpd
		* @title: updateContentDetailInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateContentDetailInfo(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 客户群数据更新操作接口
	* @date: 2016-9-5 
	* @author: zhangjj_crmpd
	* @title: ICustGroupUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ICustGroupUpdater{
		
		/**
		 * 更新客户群标签
		* @date: 2016-9-5 
		* @author: zhaoyue
		* @title: updateCustGroupLabel 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateCustGroupLabel(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 更新客户群信息
		* @date: 2016-9-5 
		* @author: zhangjj_crmpd
		* @title: updateCustGroup 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateCustGroup(Map<String,Object> inParam) throws StrategyError;
		
		/** 根据客户群id更新客户群信息
		* @date: 2016-10-13 
		* @author: songxj
		* @title: updateCustGroupById  
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public void updateCustGroupById(Map<String, Object> inParam) throws StrategyError;
		
		/**
		 * 更新目标客户群数量明细
		* @date: 2017-2-12 
		* @author:liuqi
		* @title: updateCustGroupCountDetailInfo 
		* @param countParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateCustGroupDetailCountInfo(Map<String, Object> countParam) throws StrategyError;
		
	}
	
	/**
	 * 事件数据更新操作接口
	* @date: 2016-9-5 
	* @author: zhangjj_crmpd
	* @title: IEventUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IEventUpdater{
		
		/**
		 * 更新事件信息
		* @date: 2016-9-5 
		* @author: zhangjj_crmpd
		* @title: updateEventInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateEventInfo(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 更新事件详细信息
		* @date: 2016-9-5 
		* @author: zhangjj_crmpd
		* @title: updateEventDatailInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateEventDatailInfo(Map<String,Object> inParam) throws StrategyError;

		
	}
	
	/**
	 *  登录(权限、角色、菜单)数据更新操作接口
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: ILoginUpdater 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ILoginUpdater{
		
		/**
		 * 修改菜单详细信息
		* @date: 2016-10-26 
		* @author: fangyuan_crmpd
		* @title: updateMenuDetail 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateMenuDetail(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 更新角色
		* @date: 2016-10-26 
		* @author: wangth
		* @Title: update 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void update(Map<String,Object> inParam) throws StrategyError;
		/**
		 * 修改工号密码
		* @date: 2016-11-30 
		* @author: yuanliang
		* @title: updateLoginPassword 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public int updateLoginPassword(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 营销案数据更新操作接口
	* @date: 2016-9-5 
	* @author: zhangjj_crmpd
	* @title: IMarketCaseUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IMarketCaseUpdater{
		
		/**
		 * 更新营销案信息
		* @date: 2016-9-5 
		* @author: zhangjj_crmpd
		* @title: updateMarketCase 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateMarketCase(Map<String,Object> inParam) throws StrategyError;
		
	}
	
	/**
	 * 运营位数据更新操作接口
	* @date: 2016-9-5 
	* @author: zhangjj_crmpd
	* @title: IPositionUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IPositionUpdater{
		
		/**
		 * 更新运营位信息
		* @date: 2016-9-5 
		* @author: zhangjj_crmpd
		* @title: updatePositionInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updatePositionInfo(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 更新新运营位属性信息
		* @date: 2016-9-5 
		* @author: zhangjj_crmpd
		* @title: updatePositionAttrInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updatePositionAttrInfo(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 规则数据更新操作接口
	* @date: 2016-9-5 
	* @author: zhangjj_crmpd
	* @title: IRuleUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IRuleUpdater{
		
		/**
		 * 更新规则信息
		* @date: 2016-9-5 
		* @author: zhangjj_crmpd
		* @title: updateRuleInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateRuleInfo(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 更新规则详细信息
		* @date: 2016-9-5 
		* @author: zhangjj_crmpd
		* @title: updateRuleDetailInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateRuleDetailInfo(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 短信接入更新接口
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: IShortMessage 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IShortMessageUpdater{

		/**
		 * 更新短信接入码接口
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: updateShortMessageAccessCode 
		* @param inParam 
		* @version 1.0 
		* @throws StrategyError 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateShortMessageAccessCode(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 系统处理更新接口
	* @date: 2016-10-13 
	* @author: yangwl
	* @title: ISystemDealUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ISystemDealUpdater{
		
		/**
		 * 更新任务执行信息
		* @date: 2016-10-13 
		* @author: yangwl
		* @title: updateShellProcessExecuteInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateShellProcessExecuteInfo(Map<String,Object> tempInParam) throws StrategyError;
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
	public interface IStatisticUpdater{
		/**
		 * 修改公告
		* @date: 2017-3-1 
		* @author: yexr
		* @title: updateNotice 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateNotice(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	* Create on 2016-12-21
	* @author: wangpei
	* @Title:ITaskUpdater
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public interface ITaskUpdater{
		/** 批量修改
		* @date: 2017-3-6 
		* @author: wangpei
		* @title: batchUpdateChannelTask 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public void batchUpdateChannelTask(List<Map<String,Object>> tempInParam);

		/**
		 * 更新负责人工号(调配)
		* @date: 2016-12-21 
		* @author: zhangjj_crmpd
		* @title: updateChannelTaskServiceNo 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateChannelTaskServiceNo(Map<String,Object> tempInParam);
		
		/** 修改渠道任务状态
		* @date: 2016-12-21 
		* @author: wangpei
		* @title: updateChannelTaskStatus 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public void updateChannelTaskStatus(Map<String,Object> tempInParam);
		
	}
	/**
	 * 更新模板信息接口
	* @date: 2016-9-5 
	* @author: zhangjj_crmpd
	* @title: ITempLateUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ITemplateUpdater{
		
		/**
		 * 更新模板接口
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: deleteTemplate 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		 public void updateTemplate(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 用户更新操作接口
	* @date: 2016-9-5 
	* @author: zhangjj_crmpd
	* @title: IUserUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IUserUpdater{
		
		/**
		 * 更新灰名单
		* @date: 2016-10-21 
		* @author: xiongxq
		* @Title: updateGrey 
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateGrey(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 *更新异网号码池 
		* @date: 2016-10-31 
		* @author: xiongxq
		* @Title: updateDifferentNetPhonePool 
		* @param inParam
		* @param tempInParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateDifferentNetPhonePool(Map<String,Object> inParam) throws StrategyError;
		
		/**
		 * 更新用户标签
		* @date: 2016-10-27 
		* @author: fangyuan_crmpd
		* @title: updateUserLabel 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void updateUserLabel(Map<String,Object> inParam) throws StrategyError;
	}
	
	/**
	 * 作业配置更新接口
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: IWorkConfigUpdater 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IWorkConfigUpdater{
		
		/**
		 * 更新作业配置
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: update 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void update(Map<String,Object> inParam) throws StrategyError;
	}
	/**
	 * 调查问卷更新
	* @date: 2016-12-12 
	* @author: zhangqia
	* @Title: IQuestionNaireUpdater 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IQuestionNaireUpdater{
		
		/**
		 * 调查问卷更新
		* @date: 2016-12-12 
		* @author: zhangqia
		* @Title: update 
		* @param inParam
		* @param 
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void update(Map<String, Object> inParam) throws StrategyError;
	}
}
