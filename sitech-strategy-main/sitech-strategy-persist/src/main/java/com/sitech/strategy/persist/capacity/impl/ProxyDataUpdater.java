package com.sitech.strategy.persist.capacity.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.base.BaseProxyClass;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter.IStatisticDeleter;

/**
 * 数据更新器
* @date: 2016-9-12 
* @author: zhaoyue
* @title: ProxyDataUpdater 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProxyDataUpdater extends BaseProxyClass implements IDataUpdater,Serializable {
	
	/**
	 * 活动需求更新操作
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: ActDemandUpdater 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ActDemandUpdater implements IActDemandUpdater,Serializable{
		
		protected IRDBMSDML.IRmActDemandInfo rmActDemandInfo;
		
		public void setRmActDemandInfo(IRDBMSDML.IRmActDemandInfo rmActDemandInfo) {
			this.rmActDemandInfo = rmActDemandInfo;
		}

		/**
		 * 活动需求更新
		* @date: 2016-10-21 
		* @author: wangth
		* @Title: updateActDemand 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateActDemand(Map<String, Object> inParam) throws StrategyError{
			rmActDemandInfo.update(inParam);
		}
		
	}
	/**
	 * 审批记录数据更新操作接口
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: AuditUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class AuditUpdater implements IAuditUpdater, Serializable{
		
		protected IRDBMSDML.IRmAuditRecordInfo rmAuditRecordInfo;
		
		/**
		 * 
		* @date: 2016-10-8 
		* @author: wangth
		* @Title: setRmAuditRecordInfo 
		* @param rmAuditRecordInfo 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmAuditRecordInfo(IRDBMSDML.IRmAuditRecordInfo rmAuditRecordInfo) {
			this.rmAuditRecordInfo = rmAuditRecordInfo;
		}



		/**
		 * 更新审批记录状态
		* @date: 2016-9-30 
		* @author: zhaoyue
		* @title: updateAuditRecord 
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateAuditRecord(Map<String,Object> inParam) throws StrategyError {
			rmAuditRecordInfo.update(inParam);
		}
	}
	
	/**
	 * 公共数据更新操作实现类
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: CommonUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class CommonUpdater implements ICommonUpdater,Serializable{
		
	}
	
	/**
	 * 配置更新操作实现类
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: ConfigUpdater 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ConfigUpdater implements IConfigUpdater,Serializable{
		
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
		 * 更新选项配置 
		* @date: 2016-10-26 
		* @author: xiongxq
		* @Title: updateOptionConfig 
		* @param inParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void updateOption(Map<String, Object> inParam)
				throws StrategyError {
			rmCodeNameDict.update(inParam);
		}
	}
	
	/**
	 * 内容数据更新操作实现类
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: ContentUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ContentUpdater implements IContentUpdater,Serializable{
		
		protected IRDBMSDML.IRmContentInfo rmContentInfo;
		protected IRDBMSDML.IRmContentDetailInfo rmContentDetailInfo;

		public void setRmContentInfo(IRDBMSDML.IRmContentInfo rmContentInfo) {
			this.rmContentInfo = rmContentInfo;
		}

		public void setRmContentDetailInfo(
				IRDBMSDML.IRmContentDetailInfo rmContentDetailInfo) {
			this.rmContentDetailInfo = rmContentDetailInfo;
		}

		/**
		 * 更新内容信息
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: updateContentInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateContentInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmContentInfo.update(inParam);
		}

		/**
		 * 更新内容详细信息
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: updateContentDetailInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateContentDetailInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmContentDetailInfo.update(inParam);
		}
	}
	
	/**
	 * 渠道数据更新操作实现类
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: ChannelUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ChannelUpdater implements IChannelUpdater,Serializable{

		protected IRDBMSDML.IRmChannelInfo rmChannelInfo;
		
		public void setRmChannelInfo(IRDBMSDML.IRmChannelInfo rmChannelInfo) {
			this.rmChannelInfo = rmChannelInfo;
		}

		/**
		 * 更新渠道信息	
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: updateChannelInfo 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateChannelInfo(Map<String, Object> inParam) {
			rmChannelInfo.update(inParam);
		}
	}
	
	/**
	 * 渠道显示数据更新操作
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: ChannelShowUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ChannelShowUpdater implements IChannelShowUpdater{
		
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
		 * 更新渠道显示信息
		* @date: 2016-10-18 
		* @author: fangyuan_crmpd
		* @title: updateChannelShowInfo 
		* @param inParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateChannelShowInfo(Map<String, Object> inParam) {
			rmChannelShowInfo.update(inParam);
		}
	}
	
	/**
	 * 客户群数据更新操作接口
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: CustGroupUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class CustGroupUpdater implements ICustGroupUpdater,Serializable{

		protected IRDBMSDML.IRmCustGroupAttributeInfo rmCustGroupAttributeInfo;
		protected IRDBMSDML.IRmCustGroupInfo rmCustGroupInfo;
		protected IRDBMSDML.IRmCustGroupLabelInfo rmCustGroupLabelInfo;
		
		public void setRmCustGroupAttributeInfo(
				IRDBMSDML.IRmCustGroupAttributeInfo rmCustGroupAttributeInfo) {
			this.rmCustGroupAttributeInfo = rmCustGroupAttributeInfo;
		}

		public void setRmCustGroupInfo(IRDBMSDML.IRmCustGroupInfo rmCustGroupInfo) {
			this.rmCustGroupInfo = rmCustGroupInfo;
		}

		public void setRmCustGroupLabelInfo(
				IRDBMSDML.IRmCustGroupLabelInfo rmCustGroupLabelInfo) {
			this.rmCustGroupLabelInfo = rmCustGroupLabelInfo;
		}


		
		/**
		 * 更新客户群标签
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: updateCustGroupLabel 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateCustGroupLabel(Map<String, Object> inParam)
				throws StrategyError {
			rmCustGroupLabelInfo.update(inParam);
			
		}

		/**
		 * 更新客户群信息
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: updateCustGroup 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateCustGroup(Map<String, Object> inParam)
				throws StrategyError {
			rmCustGroupInfo.update(inParam);
			rmCustGroupAttributeInfo.update(inParam);
		}

		/** 
		 * 根据客户群id更新客户群信息
		* @date: 2016-10-13 
		* @author: songxj
		* @title: updateCustGroupById 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void updateCustGroupById(Map<String, Object> inParam)
				throws StrategyError {
			rmCustGroupInfo.updateById(inParam);
		}
		
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
		@Override
		public void updateCustGroupDetailCountInfo(Map<String, Object> countParam) throws StrategyError{
			rmCustGroupInfo.update(countParam);
		}
	}
	
	/**
	 * 事件数据更新操作实现类
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: EventUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class EventUpdater implements IEventUpdater,Serializable{

		protected IRDBMSDML.IRmEventInfo rmEventInfo;
		protected IRDBMSDML.IRmEventDetailInfo rmEventDetailInfo;
		
		public void setRmEventInfo(IRDBMSDML.IRmEventInfo rmEventInfo) {
			this.rmEventInfo = rmEventInfo;
		}

		public void setRmEventDetailInfo(IRDBMSDML.IRmEventDetailInfo rmEventDetailInfo) {
			this.rmEventDetailInfo = rmEventDetailInfo;
		}

		/**
		 *  更新事件信息
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: updateEventInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateEventInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmEventInfo.update(inParam);
		}

		/**
		 * 更新事件详细信息
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: updateEventDatailInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateEventDatailInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmEventDetailInfo.update(inParam);
		}
		
	}
	
	/**
	 *  登录(权限、角色、菜单)数据更新操作实现类
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: LoginUpdater 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class LoginUpdater implements ILoginUpdater,Serializable {
		
		/**
		 * 菜单对象
		 */
		protected IRDBMSDML.IRmMenuInfo rmMenuInfo;
		
		/**
		 * 角色对象
		 */
		protected IRDBMSDML.IRmRoleInfo rmRoleInfo;
		/**
		 * 工号对象
		 */
		protected IRDBMSDML.IRmLoginMsgInfo rmLoginMsgInfo;

		
		public void setRmLoginMsgInfo(IRDBMSDML.IRmLoginMsgInfo rmLoginMsgInfo) {
			this.rmLoginMsgInfo = rmLoginMsgInfo;
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
		* @date: 2016-10-31 
		* @author: xiongxq
		* @Title: setRmRoleInfo 
		* @param rmRoleInfo 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmRoleInfo(IRDBMSDML.IRmRoleInfo rmRoleInfo) {
			this.rmRoleInfo = rmRoleInfo;
		}
		
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
		@Override
		public void update(Map<String, Object> inParam) throws StrategyError {
			rmRoleInfo.update(inParam);
		}
		
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
		@Override
		public void updateMenuDetail(Map<String, Object> inParam)
				throws StrategyError {
			rmMenuInfo.update(inParam);
		}
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
		@Override
		public int updateLoginPassword(Map<String, Object> inParam)
				throws StrategyError {
			return rmLoginMsgInfo.updateLoginPassword(inParam);
		}		
		
	}
	
	/**
	 * 营销案数据更新操作实现类
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: MarketCaseUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class MarketCaseUpdater implements IMarketCaseUpdater, Serializable{
		
		protected IRDBMSDML.IRmMarketCaseAttributeInfo rmMarketCaseAttributeInfo;
		protected IRDBMSDML.IRmMarketCaseInfo rmMarketCaseInfo;
		

		public void setRmMarketCaseAttributeInfo(
				IRDBMSDML.IRmMarketCaseAttributeInfo rmMarketCaseAttributeInfo) {
			this.rmMarketCaseAttributeInfo = rmMarketCaseAttributeInfo;
		}

		public void setRmMarketCaseInfo(IRDBMSDML.IRmMarketCaseInfo rmMarketCaseInfo) {
			this.rmMarketCaseInfo = rmMarketCaseInfo;
		}

		/**
		 * 更新营销案信息
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: updateMarketCase 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateMarketCase(Map<String, Object> inParam)
				throws StrategyError {
			rmMarketCaseInfo.update(inParam);
			rmMarketCaseAttributeInfo.update(inParam);
		}
	}
	
	/**
	 * 运营位数据更新操作实现类
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: PositionUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class PositionUpdater implements IPositionUpdater,Serializable{
		
		protected IRDBMSDML.IRmPositionInfo rmPositionInfo;
		
		public void setRmPositionInfo(IRDBMSDML.IRmPositionInfo rmPositionInfo) {
			this.rmPositionInfo = rmPositionInfo;
		}

		/**
		 * 更新运营位信息
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: updatePositionInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updatePositionInfo(Map<String, Object> inParam)
				throws StrategyError {
			Map<String,Object> tempInParam = inParam;
			rmPositionInfo.update(tempInParam);
		}

		/**
		 * 更新新运营位详细信息
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: updatePositionAttrInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updatePositionAttrInfo(Map<String, Object> inParam)
				throws StrategyError {
			// TODO Auto-generated method stub
			
		}
	}
	
	/**
	 * 规则数据更新操作实现类
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: RuleUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RuleUpdater implements IRuleUpdater,Serializable{
		
		/**
		 * 规则对象
		 */
		protected IRDBMSDML.IRmRuleInfo rmRuleInfo;
		/**
		 * 规则详情对象
		 */
		protected IRDBMSDML.IRmRuleDetailInfo rmRuleDetailInfo;
		
		/**
		 * 
		* @date: 2016-10-31 
		* @author: xiongxq
		* @Title: setRmRuleInfo 
		* @param rmRuleInfo 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmRuleInfo(IRDBMSDML.IRmRuleInfo rmRuleInfo) {
			this.rmRuleInfo = rmRuleInfo;
		}
		
		/**
		 * 
		* @date: 2016-10-31 
		* @author: xiongxq
		* @Title: setRmRuleDetailInfo 
		* @param rmRuleDetailInfo 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmRuleDetailInfo(IRDBMSDML.IRmRuleDetailInfo rmRuleDetailInfo) {
			this.rmRuleDetailInfo = rmRuleDetailInfo;
		}

		/**
		 * 更新规则详细信息
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: updateRuleDetailInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateRuleDetailInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmRuleDetailInfo.update(inParam);
		}

		/**
		 * 更新规则信息
		* @date: 2016-9-12 
		* @author: zhaoyue
		* @title: updateRuleInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateRuleInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmRuleInfo.update(inParam);
		}
	}
	
	/**
	 * 短信码更新操作实现类
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: ShortMessage 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ShortMessageUpdater implements IShortMessageUpdater,Serializable{
		
		/**
		 * 短信对象
		 */
		protected IRDBMSDML.IRmShortMessageInfo rmShortMessageInfo;
		
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
		 * 更新短信码
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: updateShortMessageAccessCode 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateShortMessageAccessCode(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
			rmShortMessageInfo.update(tempInParam);
		}
	}
	
	/**
	 * 系统处理更新接口
	* @date: 2016-10-13 
	* @author: yangwl
	* @title: SystemDealUpdater
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class SystemDealUpdater implements ISystemDealUpdater,Serializable{
		
		protected IRDBMSDML.IRmShellProcessExecuteInfo rmShellProcessExecuteInfo;
		
		public void setRmShellProcessExecuteInfo(
				IRDBMSDML.IRmShellProcessExecuteInfo rmShellProcessExecuteInfo) {
			this.rmShellProcessExecuteInfo = rmShellProcessExecuteInfo;
		}
		
		

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
		@Override
		public void updateShellProcessExecuteInfo(Map<String,Object> tempInParam) throws StrategyError{
			rmShellProcessExecuteInfo.update(tempInParam);
		}
	}
	
	
	public class StatisticUpdater implements IStatisticUpdater,Serializable {
		protected IRDBMSDML.IRmNoticeInfo rmNoticeInfo;
			
		public void setRmNoticeInfo(IRDBMSDML.IRmNoticeInfo rmNoticeInfo) {
			this.rmNoticeInfo = rmNoticeInfo;
		}
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
		@Override
		public void updateNotice(Map<String, Object> inParam)
				throws StrategyError {
			rmNoticeInfo.updateNotice(inParam);						
		}
		
		
		}
	
	/**任务修改
	* Create on 2016-12-21
	* @author: wangpei
	* @Title:TaskUpdater
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class TaskUpdater implements ITaskUpdater,Serializable{
		/**
		 * 渠道任务
		 */
		protected IRDBMSDML.IRmChannelTaskInfo rmChannelTaskInfo;
		
		/** 
		* @date: 2017-3-6 
		* @author: wangpei
		* @title: batchUpdateChannelTask 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		public void batchUpdateChannelTask(List<Map<String, Object>> tempInParam) {
			rmChannelTaskInfo.batchUpdate(tempInParam);
		}

		/** 
		 * @date: 2016-12-21 
		 * @author: wangpei
		 * @title: setRmChannelTaskInfo 
		 * @param rmChannelTaskInfo the rmChannelTaskInfo to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmChannelTaskInfo(IRDBMSDML.IRmChannelTaskInfo rmChannelTaskInfo) {
			this.rmChannelTaskInfo = rmChannelTaskInfo;
		}
		
		/**
		 * 
		* @date: 2016-12-21 
		* @author: zhangjj_crmpd
		* @title: updateChannelTaskServiceNo 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateChannelTaskServiceNo(Map<String, Object> tempInParam) {
			rmChannelTaskInfo.updateServiceNo(tempInParam);
			
		}

		/** 修改任务状态
		* @date: 2016-12-21 
		* @author: wangpei
		* @title: updateChannelTaskStatus 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void updateChannelTaskStatus(Map<String, Object> tempInParam) {
			rmChannelTaskInfo.updateStatus(tempInParam);
		}

	}
	/**
	 * 更新模板信息实现类
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: TempLateUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class TemplateUpdater implements ITemplateUpdater,Serializable{
		
		protected IRDBMSDML.IRmTemplateInfo rmTemplateInfo;
		
		/**
		 * 
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: setRmTemplateInfo 
		* @param rmTemplateInfo 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmTemplateInfo(IRDBMSDML.IRmTemplateInfo rmTemplateInfo) {
			this.rmTemplateInfo = rmTemplateInfo;
		}
		
		/**
		 * 更新模板
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: updateTemplate 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void updateTemplate(Map<String, Object> inParam)
				throws StrategyError {
			rmTemplateInfo.update(inParam);
		}
		
	}
	
	/**
	 * 用户更新操作实现类
	* @date: 2016-9-12 
	* @author: zhaoyue
	* @title: UserUpdater 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class UserUpdater implements IUserUpdater,Serializable{
		/**
		 * 异网号码池对象
		 */
		protected IRDBMSDML.IRmDifferentNetPhonePoolInfo rmDifferentNetPhonePoolInfo;
		/**
		 * 灰名单对象
		 */
		protected IRDBMSDML.IRmGreyInfo rmGreyInfo;
		/**
		 * 用户标签对象
		 */
		protected IRDBMSDML.IRmUserLabelTmp rmUserLabelTmp;
		
		/** 
		 * @date: 2016-10-31 
		 * @author: xiongxq
		 * @Title: setRmDifferentNetPhonePoolInfo 
		 * @param rmDifferentNetPhonePoolInfo the rmDifferentNetPhonePoolInfo to set
		 * @version 1.0 
		 * @Description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmDifferentNetPhonePoolInfo(
				IRDBMSDML.IRmDifferentNetPhonePoolInfo rmDifferentNetPhonePoolInfo) {
			this.rmDifferentNetPhonePoolInfo = rmDifferentNetPhonePoolInfo;
		}

		/**
		 * 		
		* @date: 2016-10-27 
		* @author: fangyuan_crmpd
		* @title: setRmUserLabelTmp 
		* @param rmUserLabelTmp 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmUserLabelTmp(IRDBMSDML.IRmUserLabelTmp rmUserLabelTmp) {
			this.rmUserLabelTmp = rmUserLabelTmp;
		}

		/** 
		 * @date: 2016-10-21 
		 * @author: xiongxq
		 * @Title: setRmGreyInfo 
		 * @param rmGreyInfo the rmGreyInfo to set
		 * @version 1.0 
		 * @Description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmGreyInfo(IRDBMSDML.IRmGreyInfo rmGreyInfo) {
			this.rmGreyInfo = rmGreyInfo;
		}

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
		@Override
		public void updateGrey(Map<String,Object> inParam) throws StrategyError {
			rmGreyInfo.update(inParam);
		}
		
		/** 
		 * 修改异网号码池
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
		@Override
		public void updateDifferentNetPhonePool(Map<String, Object> inParam) throws StrategyError {
			rmDifferentNetPhonePoolInfo.update(inParam);		
		}
		
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
		@Override
		public void updateUserLabel(Map<String, Object> inParam)
				throws StrategyError {
			rmUserLabelTmp.updateUserLabel(inParam);
			
		}
	}
	
	/**
	 * 作业配置更新操作
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: WorkConfigUpdater 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class WorkConfigUpdater implements IWorkConfigUpdater,Serializable{
		
		protected IRDBMSDML.IRmWorkCofigInfo rmWorkCofigInfo;
		
		public void setRmWorkCofigInfo(IRDBMSDML.IRmWorkCofigInfo rmWorkCofigInfo) {
			this.rmWorkCofigInfo = rmWorkCofigInfo;
		}

		/**
		 * 作业配置更新
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: update 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void update(Map<String, Object> inParam) throws StrategyError {
			rmWorkCofigInfo.update(inParam);
		}
		
	}
	/**
	 * 调查问卷更新操作
	* @date: 2016-12-12 
	* @author: zhangqia
	* @Title: QuestionNaireUpdater 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class QuestionNaireUpdater implements IQuestionNaireUpdater,Serializable{
		
		protected IRDBMSDML.IRmQuestionNaireInfo rmQuestionNaireInfo;
		
		public void setRmQuestionNaireInfo(IRDBMSDML.IRmQuestionNaireInfo rmQuestionNaireInfo) {
			this.rmQuestionNaireInfo = rmQuestionNaireInfo;
		}

		/**
		 * 调查问卷更新
		* @date: 2016-12-12 
		* @author: zhangqia
		* @Title: update 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void update(Map<String, Object> inParam) throws StrategyError {
			rmQuestionNaireInfo.update(inParam);
		}
		
	}
}
