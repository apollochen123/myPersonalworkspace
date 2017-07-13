package com.sitech.strategy.persist.capacity.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.hbase.IHbaseRowKey;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.MD5RowKeyGenerator;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.base.BaseProxyClass;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor.IInventoryInsertor;

/**
 * 数据删除器
* @date: 2016-9-12 
* @author: zhaoyue
* @title: ProxyDataDeleter 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProxyDataDeleter extends BaseProxyClass implements IDataDeleter,Serializable{
	protected IHbaseRowKey hbaseRowKey;
	
	public void setHbaseRowKey(IHbaseRowKey hbaseRowKey) {
		this.hbaseRowKey = hbaseRowKey;
	}

	/**
	 * 活动需求操作实现
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: ActDemandDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ActDemandDeleter implements IActDemandDeleter{
		
		protected IRDBMSDML.IRmActDemandInfo rmActDemandInfo;
		
		public void setRmActDemandInfo(IRDBMSDML.IRmActDemandInfo rmActDemandInfo) {
			this.rmActDemandInfo = rmActDemandInfo;
		}

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
		@Override
		public void deleteActDemand(Map<String, Object> inParam)
				throws StrategyError {
			rmActDemandInfo.delete(inParam);
		}
		
	}
	
	/**
	 * 审批记录数据删除操作实现
	* @date: 2016-10-13 
	* @author: tangaq
	* @title: AuditDeleter 
	* @version 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class AuditDeleter implements IAuditDeleter, Serializable{
		
		/**
		 * 审批工号对象
		 */
		protected IRDBMSDML.IRmAuditNoInfo rmAuditNoInfo;
		
		/**
		 * 
		* @date: 2016-10-13 
		* @author: tangaq
		* @title: setRmAuditNoInfo 
		* @param rmAuditNoInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmAuditNoInfo(IRDBMSDML.IRmAuditNoInfo rmAuditNoInfo) {
			this.rmAuditNoInfo = rmAuditNoInfo;
		}

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
		@Override
		public void deleteAuditNo(Map<String, Object> inParam) throws StrategyError {
			rmAuditNoInfo.delete(inParam);
			
		}
		
	}
	
	/**
	 * 附件删除实现
	* @date: 2016-10-24 
	* @author: wangth
	* @Title: AttachDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class AttachDeleter implements IAttachDeleter,Serializable{
		
		protected IRDBMSDML.IRmAttachInfo rmAttachInfo;
		
		public void setRmAttachInfo(IRDBMSDML.IRmAttachInfo rmAttachInfo) {
			this.rmAttachInfo = rmAttachInfo;
		}
		
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
		@Override
		public void deleteAttach(Map<String, Object> inParam)
				throws StrategyError {
			rmAttachInfo.delete(inParam);
		}
		
	}
	
	/**渠道删除
	* Create on 2016-10-17
	* @author: wangpei
	* @Title:ChannelDeleter
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class ChannelDeleter implements IChannelDeleter, Serializable{
		
		/**
		 * 渠道表
		 */
		protected IRDBMSDML.IRmChannelInfo rmChannelInfo;
		/**
		 * 关系表
		 */
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		
		
		/** 
		 * @date: 2016-10-17 
		 * @author: wangpei
		 * @title: setRmChannelInfo 
		 * @param rmChannelInfo the rmChannelInfo to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		
		public void setRmChannelInfo(IRDBMSDML.IRmChannelInfo rmChannelInfo) {
			this.rmChannelInfo = rmChannelInfo;
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
		* @date: 2016-10-17 
		* @author: wangpei
		* @title: deleteChannelInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		public void deleteChannelInfo(Map<String, Object> inParam)
				throws StrategyError {
		}

		/** 
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
		
		@Override
		public void deleteCustGroupChannelRelation(Map<String, Object> inParam)
				throws StrategyError {
			rmRelationRel.delete(inParam);
		}
		
	}
	
	/**
	 * 配置删除操作实现类
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: ConfigDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ConfigDeleter implements IConfigDeleter{
		
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
		@Override
		public void deleteOptionInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmCodeNameDict.delete(inParam);
		}
	}
	
	/**内容删除
	* Create on 2016-10-18
	* @author: wangpei
	* @Title:ContentDeleter
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class ContentDeleter implements IContentDeleter, Serializable{
		protected IRDBMSDML.IRmContentInfo rmContentInfo;
		protected IRDBMSDML.IRmContentDetailInfo rmContentDetailInfo;
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		
		
		/** 
		 * @date: 2016-10-18 
		 * @author: wangpei
		 * @title: setRmContentInfo 
		 * @param rmContentInfo the rmContentInfo to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmContentInfo(IRDBMSDML.IRmContentInfo rmContentInfo) {
			this.rmContentInfo = rmContentInfo;
		}

		/** 
		 * @date: 2016-10-18 
		 * @author: wangpei
		 * @title: setRmContentDetailInfo 
		 * @param rmContentDetailInfo the rmContentDetailInfo to set
		 * @version 1.0 
		 * @description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		
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
		* @date: 2016-10-18 
		* @author: wangpei
		* @title: deleteContentInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		public void deleteContentInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmContentInfo.delete(inParam);
		}

		/** 
		* @date: 2016-10-18 
		* @author: wangpei
		* @title: deleteContentDetailInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		
		@Override
		public void deleteContentDetailInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmContentDetailInfo.delete(inParam);
		}

		/** 
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
		
		@Override
		public void deleteRelation(Map<String, Object> inParam)
				throws StrategyError {
			rmRelationRel.delete(inParam);
		}
		
	}
	
	/**
	 * 客户群删除
	* @date: 2016-10-30 
	* @author: zhangjj_crmpd
	* @title: CustGroupDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class CustGroupDeleter implements ICustGroupDeleter,Serializable{
		
		protected ICacheDML.IStaticLabelCustGroupCache staticLabelCustGroupCache;
		protected IRDBMSDML.IRmCustGroupLabelInfo rmCustGroupLabelInfo;
		protected IHiveDML.IRmCustGroupDetailInfoHive rmCustGroupDetailInfoHive;
		protected IRDBMSDML.IRmCustGroupInfo  rmCustGroupInfo;
		protected IRDBMSDML.IRmCustGroupAttributeInfo rmCustGroupAttributeInfo;
		
		/**
		 * 
		* @date: 2017-3-15 
		* @author:liuqi
		* @title: getStaticLabelCustGroupCache 
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public ICacheDML.IStaticLabelCustGroupCache getStaticLabelCustGroupCache() {
			return staticLabelCustGroupCache;
		}
		
		/**
		 * 
		* @date: 2017-3-15 
		* @author:liuqi
		* @title: setStaticLabelCustGroupCache 
		* @param staticLabelCustGroupCache 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setStaticLabelCustGroupCache(
				ICacheDML.IStaticLabelCustGroupCache staticLabelCustGroupCache) {
			this.staticLabelCustGroupCache = staticLabelCustGroupCache;
		}
		
		/**
		 * 
		* @date: 2017-2-11 
		* @author: zhangjj_crmpd
		* @title: setRmCustGroupDetailInfoHive 
		* @param rmCustGroupDetailInfoHive 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmCustGroupDetailInfoHive(
				IHiveDML.IRmCustGroupDetailInfoHive rmCustGroupDetailInfoHive) {
			this.rmCustGroupDetailInfoHive = rmCustGroupDetailInfoHive;
		}

		/**
		 * 
		* @date: 2016-11-3 
		* @author: zhangjj_crmpd
		* @title: setRmCustGroupLabelInfo 
		* @param rmCustGroupLabelInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmCustGroupLabelInfo(
				IRDBMSDML.IRmCustGroupLabelInfo rmCustGroupLabelInfo) {
			this.rmCustGroupLabelInfo = rmCustGroupLabelInfo;
		}
		
		/**
		 * 
		* @date: 2017-2-10 
		* @author: wuJiaFu
		* @title: setRmCustGroupInfo 
		* @param rmCustGroupInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmCustGroupInfo(IRDBMSDML.IRmCustGroupInfo rmCustGroupInfo) {
			this.rmCustGroupInfo = rmCustGroupInfo;
		}
		
		/**
		 * 
		* @date: 2017-4-25 
		* @author: zhangzx_crmpd
		* @title: setRmCustGroupAttributeInfo 
		* @param rmCustGroupAttributeInfo 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void setRmCustGroupAttributeInfo(
				IRDBMSDML.IRmCustGroupAttributeInfo rmCustGroupAttributeInfo) {
			this.rmCustGroupAttributeInfo = rmCustGroupAttributeInfo;
		}
		

		/**
		 * 删除客户群信息
		* @date: 2016-10-30 
		* @author: zhangjj_crmpd
		* @title: deleteCustGroup 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void deleteCustGroup(Map<String, Object> inParam) throws StrategyError {
			rmCustGroupInfo.delete(inParam);
			rmCustGroupAttributeInfo.delete(inParam);
		}
		
		/**
		 * 删除标签客户群
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
		@Override
		public void deleteCustGroupLabel(Map<String, Object> inParam)
				throws StrategyError {
			rmCustGroupLabelInfo.delete(inParam);
		}

		/**
		 * 删除客户群中的手机号码
		* @date: 2016-10-30 
		* @author: zhangjj_crmpd
		* @title: deletePhoneNoFromCustGroup 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void deletePhoneNoFromCustGroup(Map<String, Object> inParam)
				throws StrategyError {
			// TODO Auto-generated method stub
			
		}

		/**
		 * 获取后删除目标客户群表名缓存（静态标签）
		* @date: 2017-3-15 
		* @author: liuqi
		* @title: getAndDeleteCustGroupTableNameCache 
		* @param tempInParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public String getAndDeleteCustGroupTableNameCache(Map<String, Object> tempInParam) throws StrategyError{
			
			return staticLabelCustGroupCache.getAndRemove(tempInParam);
			
		}
		
		/**
		 * 批量删除客户群中的手机号码
		* @date: 2016-10-30 
		* @author: zhangjj_crmpd
		* @title: deletePhoneNoFromCustGroup 
		* @param list
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void deletePhoneNoFromCustGroup(List list) throws StrategyError {
			// TODO Auto-generated method stub
			
		}

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
		@Override
		public void dropCustGroupTemp(Map<String, Object> inParam)
				throws StrategyError {
			rmCustGroupDetailInfoHive.dropCustGroupTemp(inParam);
		}

		
	}
	/**
	 * 渠道显示数据删除操作
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: ChannelShowDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ChannelShowDeleter implements IChannelShowDeleter,Serializable{
		
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
		 * 删除渠道显示信息
		* @date: 2016-10-18 
		* @author: fangyuan_crmpd
		* @title: deleteChannelShowInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void deleteChannelShowInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmChannelShowInfo.delete(inParam);	
		}
	}
	
	/**
	 * 清单数据删除操作实现类
	* @date: 2017-4-25 
	* @author: zhangzx_crmpd
	* @title: InventoryInsertor 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class InventoryDeleter implements IInventoryDeleter, Serializable{
		
		protected IRDBMSDML.IRmInventoryInfo rmInventoryInfo;
		
		/**
		 * 
		* @date: 2017-4-25 
		* @author: zhangzx_crmpd
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
		 * 
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
		@Override
		public void deleteInventoryInfo(Map<String, Object> inParam) throws StrategyError {
			rmInventoryInfo.delete(inParam);
		}
		
	
	}
	
	/**
	 * 登录(权限、角色、菜单)数据删除操作实现类
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: LoginDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class LoginDeleter implements ILoginDeleter{
		/**
		 * 菜单对象
		 */
		protected IRDBMSDML.IRmMenuInfo rmMenuInfo;
		
		/**
		 * 角色对象
		 */
		protected IRDBMSDML.IRmRoleInfo rmRoleInfo;

		/**
		 * 角色用户关系对象
		 */
		protected IRDBMSDML.IRmRoleUserRel rmRoleUserRel;

		/**
		 * 角色菜单关系对象
		 */
		protected IRDBMSDML.IRmRoleMenuRel rmRoleMenuRel;

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
		@Override
		public void delete(Map<String, Object> inParam) throws StrategyError {
			rmRoleInfo.delete(inParam);
		}
		
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
		@Override
		public void deleteRoleMenuRel(Map<String, Object> inParam)
				throws StrategyError {
			rmRoleMenuRel.delete(inParam);
		}
		
		/**
		 * 删除角色和用户的关系
		* @date: 2016-10-27 
		* @author: wangth
		* @Title: deleteRoleUserRel 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void deleteRoleUserRel(Map<String, Object> inParam)
				throws StrategyError {
			rmRoleUserRel.delete(inParam);
		}

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
		@Override
		public void deleteMenuInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmMenuInfo.delete(inParam);
			
		}
	}
	
	/**
	 *营销案删除操作实现类 
	* @date: 2016-11-1 
	* @author: xiongxq
	* @Title: MarketCaseDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class MarketCaseDeleter implements IMarketCaseDeleter, Serializable{
	
/*		protected ICacheDML.IBatchPushSendStatus batchPushSendStatus;
		protected ICacheDML.IBatchPushTask batchPushTask;*/
		protected ICacheDML.IMarketCaseRecommendStatusCache marketCaseRecommendStatusCache;
		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		protected IRDBMSDML.IRmMarketCaseAttributeInfo rmMarketCaseAttributeInfo;
		protected IRDBMSDML.IRmMarketCaseInfo rmMarketCaseInfo;
		protected IRDBMSDML.IRmActDemandInfo rmActDemandInfo;
		protected ICacheDML.IWaitSendBatchPushMarketCaseCache waitSendBatchPushMarketCaseCache;
		protected ICacheDML.IWaitCreateBatchPushMarketCaseCache waitCreateBatchPushMarketCaseCache;
		
		public void setRmMarketCaseInfo(IRDBMSDML.IRmMarketCaseInfo rmMarketCaseInfo) {
			this.rmMarketCaseInfo = rmMarketCaseInfo;
		}
		public void setWaitCreateBatchPushMarketCaseCache(ICacheDML.IWaitCreateBatchPushMarketCaseCache waitCreateBatchPushMarketCaseCache) {
			this.waitCreateBatchPushMarketCaseCache = waitCreateBatchPushMarketCaseCache;
		}
		
		public void setRmActDemandInfo(IRDBMSDML.IRmActDemandInfo rmActDemandInfo) {
			this.rmActDemandInfo = rmActDemandInfo;
		}
	
/*		public void setBatchPushTask(ICacheDML.IBatchPushTask batchPushTask) {
			this.batchPushTask = batchPushTask;
		}
	
		public void setBatchPushSendStatus(
				ICacheDML.IBatchPushSendStatus batchPushSendStatus) {
			this.batchPushSendStatus = batchPushSendStatus;
		}
*/		
		
		public void setMarketCaseRecommendStatusCache(
				ICacheDML.IMarketCaseRecommendStatusCache marketCaseRecommendStatusCache) {
			this.marketCaseRecommendStatusCache = marketCaseRecommendStatusCache;
		}
		
		public void setRmMarketCaseAttributeInfo(
				IRDBMSDML.IRmMarketCaseAttributeInfo rmMarketCaseAttributeInfo) {
			this.rmMarketCaseAttributeInfo = rmMarketCaseAttributeInfo;
		}

		public void setWaitSendBatchPushMarketCaseCache(
				ICacheDML.IWaitSendBatchPushMarketCaseCache waitSendBatchPushMarketCaseCache) {
			this.waitSendBatchPushMarketCaseCache = waitSendBatchPushMarketCaseCache;
		}
		
		public void setRmRelationRel(IRDBMSDML.IRmRelationRel rmRelationRel) {
			this.rmRelationRel = rmRelationRel;
		}
	
/*		*//**
		 * 从缓存中删除批量push营销案任务
		* @date: 2016-10-9 
		* @author: yangwl
		* @title: deleteBatchPushMarketCaseTaskFromCache 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 *//*
		@Override
		public void deleteBatchPushMarketCaseTaskFromCache(
				Map<String, Object> tempInParam) throws StrategyError {
			batchPushTask.remove(tempInParam);
		}*/
	
/*		*//**
		 * 移除缓存中营销案状态信息
		* @date: 2016-9-29 
		* @author: wangth
		* @Title: removeMarketCaseTaskStatusCodeToCache 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 *//*
		@Override
		public void removeBatchPushTaskStatusCodeFromCache(
				Map<String,Object> tempInParam) throws StrategyError {
			batchPushSendStatus.remove(tempInParam);
			
		}*/
		
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
		@Override
		public void removeMarketCaseRecommendStatusFromCache(Map<String, Object> tempInParam) throws StrategyError {
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_RECOMMENDSTATUS + (String)tempInParam.get("marketCaseId"));
			marketCaseRecommendStatusCache.remove(tempParam);
		}
	
		/** 
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
		@Override
		public void removeMaketCaseCustGroupRelation(Map<String, Object> inParam)
				throws StrategyError {
			rmRelationRel.delete(inParam);
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
		public void deleteMarketCaseById(Map<String, Object> inParam){
			rmMarketCaseInfo.deleteMarketCaseById(inParam);
			rmMarketCaseAttributeInfo.delete(inParam);
			rmActDemandInfo.delete(inParam);
		}

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
		@Override
		public void removeWaitSendBatchPushMarketCaseFromCache(
				Map<String, Object> tempInParam) throws StrategyError {
			String processId = tempInParam.get("processId")==null?"":(String)tempInParam.get("processId");
			Map<String,Object> tempParam = new HashMap<String,Object>();
			if("".equals(processId)||processId==null){
				tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITSNED);
			}else{
				tempParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITSNED+Const.SEPARATOR_COLON+processId);
			}
			tempParam.put(Const.CACHE_MEMBER, tempInParam.get("marketCaseId"));
			waitSendBatchPushMarketCaseCache.remove(tempParam);
			
		}

		/**
		 * 从缓存中删除批量push营销案任务
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
		@Override
		public Map<String, Map<String, String>> rmWaitCreateBatchPushMarketCaseTmp(String taskType,Map<String, Map<String,String>> rmMap) throws StrategyError {
			Map<String,Object> tempParam = new HashMap<String,Object>();
			if("batchPushMsg".equals(taskType)){
				tempParam.put("key", Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEMSG_TMP);
			}else if("batchPushProd".equals(taskType)){
				tempParam.put("key", Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEPROD_TMP);
			}
			return (Map<String, Map<String,String>>)waitCreateBatchPushMarketCaseCache.removeByLrem(tempParam,rmMap);
		}

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
		public void rmWaitCreateBatchPushMarketCaseTmpList(String taskType) throws StrategyError{
			Map<String,Object> tempParam = new HashMap<String,Object>();
			if("batchPushMsg".equals(taskType)){
				tempParam.put("key", Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEMSG_TMP);
			}else if("batchPushProd".equals(taskType)){
				tempParam.put("key", Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITCREATEPROD_TMP);
			}
			waitCreateBatchPushMarketCaseCache.remove(tempParam);
		}

	}

	/**
	 * 监控数据删除操作实现类
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: MonitorWarningDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class MonitorDeleter implements IMonitorDeleter{
		
		/**
		 * 监控告警对象
		 */
		protected IRDBMSDML.IRmMonitorWarningInfo rmMonitorWarningInfo;
		
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
		@Override
		public void deleteWorkOperWarningInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmMonitorWarningInfo.delete(inParam);
			
		}
		
	}
	
	
	/**
	 * 运营位配置数据删除
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: PositionDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class PositionDeleter implements IPositionDeleter, Serializable{
		
		protected IRDBMSDML.IRmPositionInfo rmPositionInfo;
		protected IRDBMSDML.IRmAttributeInfo rmAttributeInfo;
		
		public void setRmPositionInfo(IRDBMSDML.IRmPositionInfo rmPositionInfo) {
			this.rmPositionInfo = rmPositionInfo;
		}
		
		public void setRmAttributeInfo(IRDBMSDML.IRmAttributeInfo rmAttributeInfo) {
			this.rmAttributeInfo = rmAttributeInfo;
		}
		
		/**
		 * 删除运营位内容
		* @date: 2016-10-19 
		* @author: wangth
		* @Title: deletePositionInfo 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void deletePositionInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmPositionInfo.delete(inParam);
			
		}
		
		/**
		 * 删除运营位属性
		* @date: 2016-10-19 
		* @author: wangth
		* @Title: deletePositionAttrInfo 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void deletePositionAttrInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmAttributeInfo.delete(inParam);
		}
		
	}
	
	/**
	 * 删除优先级数据
	* @date: 2016-10-20 
	* @author: fangyuan_crmpd
	* @title: PositionDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class PriorityDeleter implements IPriorityDeleter{
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
		 * 删除区域优先级数据
		* @date: 2016-10-20 
		* @author: fangyuan_crmpd
		* @title: deleteAreaPriorityConfigInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void deleteAreaPriorityConfigInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmAreaPriorityInfo.delete(inParam);
		}
		
		/**
		 * 删除用户群优先级配置
		* @date: 2016-10-20 
		* @author: fangyuan_crmpd
		* @title: deleteCustGroupPriorityConfigInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void deleteCustGroupPriorityConfigInfo(
				Map<String, Object> inParam) throws StrategyError {
			rmCustGroupPriorityInfo.delete(inParam);
		}
		
	}
	
	/**
	 * 关系删除操作
	* @date: 2016-10-21 
	* @author: zhangjj_crmpd
	* @title: RelationDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RelationDeleter implements IRelationDeleter, Serializable{

		protected IRDBMSDML.IRmRelationRel rmRelationRel;
		
		public void setRmRelationRel(IRDBMSDML.IRmRelationRel rmRelationRel) {
			this.rmRelationRel = rmRelationRel;
		}

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
		@Override
		public void deleteRelation(Map<String, Object> inParam)
				throws StrategyError {
			rmRelationRel.delete(inParam);
		}
	}
	
	/**
	 * 规则配置数据删除实现类
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: RuleDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RuleDeleter implements IRuleDeleter,Serializable{
		
		/**
		 * 规则详情对象
		 */
		protected IRDBMSDML.IRmRuleDetailInfo rmRuleDetailInfo;
		/**
		 * 规则对象
		 */
		protected IRDBMSDML.IRmRuleInfo rmRuleInfo;
		
		/** 
		 * @date: 2016-10-17 
		 * @author: xiongxq
		 * @Title: setRmRuleDetailInfo 
		 * @param rmRuleDetailInfo the rmRuleDetailInfo to set
		 * @version 1.0 
		 * @Description: 
		 * update_version: update_date: update_author: update_note: 
		 */
		public void setRmRuleDetailInfo(IRDBMSDML.IRmRuleDetailInfo rmRuleDetailInfo) {
			this.rmRuleDetailInfo = rmRuleDetailInfo;
		}
		
		/**
		 * 
		* @date: 2016-10-21 
		* @author: zhangjj_crmpd
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
		@Override
		public void deleteGlobalRule(Map<String, Object> inParam)
				throws StrategyError {
			rmRuleDetailInfo.delete(inParam);
		}

		/** 
		 * 删除规则信息
		* @date: 2016-10-16 
		* @author: xiongxq
		* @Title: deleteRuleInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void deleteRuleInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmRuleInfo.delete(inParam);
		}

		/** 
		 * 删除规则详细信息
		* @date: 2016-10-16 
		* @author: xiongxq
		* @Title: deleteRuleDetailInfo 
		* @param inParam
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void deleteRuleDetailInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmRuleDetailInfo.delete(inParam);
		}
	}
	
	/**
	 * 短信对象
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: ShortMessage 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class ShortMessageDeleter implements IShortMessageDeleter{
		
		/**
		 *短信对象
		 */
		protected IRDBMSDML.IRmShortMessageInfo rmShortMessageInfo;
		/**
		 * 角色与用户关系对象
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
		@Override
		public void deleteAccessCodeByLoginNo(Map<String, Object> inParam) throws StrategyError {
			rmRoleUserRel.deleteByLoginNo(inParam);
		}

		/**
		 * 删除短信接入码
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: deleteShortMessageAccessCode 
		* @param inParam 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void deleteShortMessageAccessCode(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError{
			rmShortMessageInfo.delete(tempInParam);
		}
	}
	
	
	/**
	 * 数据统计删除
	* @date: 2017-3-1 
	* @author: yexr
	* @title: StatisticDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class StatisticDeleter implements IStatisticDeleter,Serializable {
		protected IRDBMSDML.IRmNoticeInfo rmNoticeInfo;
			
		public void setRmNoticeInfo(IRDBMSDML.IRmNoticeInfo rmNoticeInfo) {
			this.rmNoticeInfo = rmNoticeInfo;
		}
          /**
           * 删除公告
          * @date: 2017-3-1 
          * @author: yexr
          * @title: removeNotice 
          * @param inParam
          * @throws StrategyError 
          * @exception: 
          * @version: 1.0 
          * @description: 
          * update_version: update_date: update_author: update_note:
           */
		@Override
		public void removeNotice(Map<String, Object> inParam)
				throws StrategyError {
			rmNoticeInfo.removeNotice(inParam);						
		}
		
		
		}
	
	/** 
	 * 删除批量push任务索引
	* @date: 2016-11-4 
	* @author: songxj
	* @title: TaskIndexDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note: 
	*/
	public class TaskDeleter implements ITaskDeleter {

		protected INosqlDML.IRmWaitSendBatchPushTaskInfo rmWaitSendBatchPushTaskInfoHbase;

		public void setRmWaitSendBatchPushTaskInfoHbase(
				INosqlDML.IRmWaitSendBatchPushTaskInfo rmWaitSendBatchPushTaskInfoHbase) {
			this.rmWaitSendBatchPushTaskInfoHbase = rmWaitSendBatchPushTaskInfoHbase;
		}

		/**
		 * 
		* @date: 2017-1-10 
		* @author: sunliang 
		* @title: deleteBatchPushTaskIndex 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void deleteBatchPushTaskIndex(Map<String, Object> tempInParam) {
			
			String rowKey = hbaseRowKey.getWaitSendBatchPushTaskRowKey(tempInParam);
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put(Const.NOSQL_ROWKEY, rowKey);
			
			rmWaitSendBatchPushTaskInfoHbase.delete(tempParam);
		}
		
	}
	
	/**
	 * 删除模板信息实现类
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: TemplateDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class TemplateDeleter implements ITemplateDeleter{
		
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
		 * 删除模板信息
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: deleteTemplate 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void deleteTemplate(Map<String, Object> inParam)
				throws StrategyError {
			rmTemplateInfo.delete(inParam);
		}
		
	}
	
	/**
	 * 用户删除操作实现类
	* @date: 2016-10-19 
	* @author: xiongxq
	* @Title: UserDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class UserDeleter implements IUserDeleter{
		/**
		 * 异网号码池对象
		 */
		protected IRDBMSDML.IRmDifferentNetPhonePoolInfo rmDifferentNetPhonePoolInfo;
		/**
		 * 灰名单对象
		 */
		protected IRDBMSDML.IRmGreyInfo rmGreyInfo;
		
		protected INosqlDML.IRmGreyInfo rmGreyInfoHbase;
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
		 * @date: 2016-10-19 
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
		
		public void setRmGreyInfoHbase(INosqlDML.IRmGreyInfo rmGreyInfoHbase) {
			this.rmGreyInfoHbase = rmGreyInfoHbase;
		}

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
		@Override
		public void deleteGrey(Map<String, Object> inParam) throws StrategyError {
			rmGreyInfo.delete(inParam);
		}
		
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
		@Override
		public void deleteGreyFromNoSql(Map<String, Object> tempInParam)
				throws StrategyError {
			String rowKey = hbaseRowKey.getGreyRowKey(tempInParam);
			tempInParam.put(Const.NOSQL_ROWKEY, rowKey);
			rmGreyInfoHbase.delete(tempInParam);
			
		}
		
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
		@Override
		public void deleteDifferentNetPhonePool(Map<String, Object> inParam)
				throws StrategyError {
			rmDifferentNetPhonePoolInfo.delete(inParam);			
		}
		
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
		@Override
		public void deleteUserLabel(Map<String, Object> inParam)
				throws StrategyError {
			rmUserLabelTmp.deleteUserLabel(inParam);
		}

	}
	
	/**
	 * 删除作业实现
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: WorkCofigDeleter 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class WorkConfigDeleter implements IWorkConfigDeleter{
		
		protected IRDBMSDML.IRmWorkCofigInfo rmWorkCofigInfo;
		
		public void setRmWorkCofigInfo(IRDBMSDML.IRmWorkCofigInfo rmWorkCofigInfo) {
			this.rmWorkCofigInfo = rmWorkCofigInfo;
		}
		
		/**
		 * 删除作业配置
		* @date: 2016-10-22 
		* @author: wangth
		* @Title: delete 
		* @param inParam
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void delete(Map<String, Object> inParam) throws StrategyError {
			rmWorkCofigInfo.delete(inParam);
			
		}
	}
	/**
	 * 删除事件实现类
	* @date: 2017-3-30 
	* @author: chenhao
	* @title: EventDeleter 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class EventDeleter implements IEventDeleter,Serializable{
		
		protected IRDBMSDML.IRmEventDetailInfo rmEventDetailInfo;
		protected IRDBMSDML.IRmEventInfo rmEventInfo;
		
		
		
		public IRDBMSDML.IRmEventDetailInfo getRmEventDetailInfo() {
			return rmEventDetailInfo;
		}

		public void setRmEventDetailInfo(IRDBMSDML.IRmEventDetailInfo rmEventDetailInfo) {
			this.rmEventDetailInfo = rmEventDetailInfo;
		}

		public IRDBMSDML.IRmEventInfo getRmEventInfo() {
			return rmEventInfo;
		}

		public void setRmEventInfo(IRDBMSDML.IRmEventInfo rmEventInfo) {
			this.rmEventInfo = rmEventInfo;
		}

		@Override
		public void deleteEventInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmEventInfo.deleter(inParam);		
		}

		@Override
		public void deleteEventDetailInfo(Map<String, Object> inParam)
				throws StrategyError {
			rmEventDetailInfo.deleter(inParam);
			
		}

		@Override
		public void deleteCustGroupEventRelation(Map<String, Object> inParam)
				throws StrategyError {
			rmEventInfo.deleterRelation(inParam);
			
		}
		
	}
}
