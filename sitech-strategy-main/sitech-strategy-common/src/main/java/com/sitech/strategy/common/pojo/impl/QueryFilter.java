package com.sitech.strategy.common.pojo.impl;

import java.sql.Timestamp;
import java.util.List;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.PropertiesUtil;

/**
 * 查询过滤器
 * 
 * @date: 2016-9-5
 * @author: sunliang
 * @title: QueryFilter
 * @version: 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
public class QueryFilter extends BaseClass implements IQueryFilter {

	/**
	 * 接入码
	 */
	protected String accessCode;
	/**
	 * 接入码服务类型
	 */
	protected String accessCodeServiceType;
	/**
	 * 账户Id
	 */
	protected String acctId;
	/**
	 * 活动需求类型
	 */
	protected String actDemandClass;
	/**
	 * 活动需求Id
	 */
	protected String actDemandId;
	/**
	 * 活动需求名称
	 */
	protected String actDemandName;
	/**
	 * 活动需求级别
	 */
	protected String actDemandType;
	/**
	 * 活动Id
	 */
	protected String actId;
	/**
	 * 申请地市
	 */
	protected String applyRegionCode;
	/**
	 * 审批工号
	 */
	protected String auditNo;
	/**
	 * 审批级别
	 */
	protected String auditOrder;
	/**
	 * 审批ID
	 */
	protected String auditRecordId;
	/**
	 * 审批状态
	 */
	protected String auditStatus;
	/**
	 * 审批类型
	 */
	protected String auditType;
	/**
	 * 批次号
	 */
	protected String batchNo;
	/**
	 * 审批业务id
	 */
	protected String busiId;
	/**
	 * 业务类型
	 */
	protected String busiType;
	/**
	 * 选项标识
	 */
	protected String categroy;
	/**
	 * 渠道Id
	 */
	protected String channelId;
	/**
	 * 多个渠道Id
	 */
	protected List<String> channelIdArray;
	/**
	 * 渠道名称
	 */
	protected String channelName;
	/**
	 * 渠道类型
	 */
	protected String channelType;
	/**
	 * 组件Id
	 */
	protected String componentId;
	/**
	 * 组件类型
	 */
	protected String componentType;
	/**
	 * 内容详细信息Id
	 */
	protected String contentDetailId;
	/**
	 * 内容Id
	 */
	protected String contentId;
	/**
	 * 内容名称
	 */
	protected String contentName;
	/**
	 * 内容代码
	 */
	protected String contentParCode;
	/**
	 * 内容值
	 */
	protected String contentParValue;
	/**
	 * 目标客户群创建工号
	 */
	protected String custGroupCreateLoginNo;
	/**
	 * 客户群明细文件名
	 */
	protected String custGroupDetailFileName;
	/**
	 * 目标客户群结束时间
	 */
	protected String custGroupEndDate;
	/**
	 * 目标客户群ID
	 */
	protected String custGroupId;
	/**
	 * 目标客户群名称
	 */
	protected String custGroupName;
	/**
	 * 客户群操作时间
	 */
	protected String custGroupOperTime;
	/**
	 * 目标客户群开始时间
	 */
	protected String custGroupStartDate;
	/**
	 * 客户群类型
	 */
	protected String custGroupType;
	/**
	 * 客户ID
	 */
	protected String custId;
	/**
	 * 客户名称
	 */
	protected String custName;
	/**
	 * 客户或者服务号码
	 */
	protected String custNameOrServiceNbr;
	public static final String DB_DATASOURCE = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_DATASOURCE, "DATASOURCE.TYPE");
	/**
	 * 数据源，在ibatis中对于不同数据库方言时判断使用。
	 */
	protected String dbType = DB_DATASOURCE;
	/**
	 * 事件渠道Id 在查询优先级服务中作为查询条件
	 */
	protected String eventChannelId;
	/**
	 * 营业部Id
	 */
	protected String edwDeptId;
	/**
	 * 结束时间
	 */
	protected String endTime;
	/**
	 * 结束日期
	 */
	protected Timestamp endDate;
	
	/**
	 * 事件详细信息Id
	 */
	protected String eventDetailId;
	/**
	 * 事件Id
	 */
	protected String eventId;
	/**
	 * 事件类型
	 */
	protected String eventType;
	/**
	 * 事件类型
	 */
	protected String eventDetailType;
	/**
	 * 事件代码
	 */
	protected String eventParCode;
	/**
	 * 码表英文名
	 */
	protected String fieldEnName;
	/**
	 * 码表中文名
	 */
	protected String fieldCnName;
	/**
	 * 码表描述
	 */
	protected String fieldDesc;
	/**
	 * 码表描述和选项值
	 */
	protected String fieldValueDesc;
	/**
	 * 选项值
	 */
	protected String fieldValue;
	/**
	 * 订购量的天数(15天)
	 */
	protected String fifthDay;
	/**
	 * 物理网格ID
	 */
	protected String gridId;
	/**
	 * 网格编码
	 */
	protected String groupCode;
	/**
	 * 组织Id
	 */
	protected String groupId;
	/**
	 * 用户ID
	 */
	protected String idNo;
	/**
	 * 查询关键字
	 */
	protected List<String> keyWords;
	/**
	 * 加载营销案缓存标示
	 */
	protected String loadMarketCaseCache;
	/**
	 * 工号
	 */
	protected String loginNo;
	/**
	 * 工号姓名
	 */
	protected String loginName;
	/**
	 * 营销案缓存中的Key
	 */
	protected String marketCaseCacheKey;
	/**
	 * 营销案ID
	 */
	protected String marketCaseId;
	/**
	 * 营销案级别
	 */
	protected String marketCaseLevel;
	/**
	 * 营销案名称
	 */
	protected String marketCaseName;
	/**
	 * 营销案信息查询标志
	 */
	protected String marketCaseQueryFlagByPermission;
	/**
	 * 营销案开始时间
	 */
	protected String marketCaseStartDate;
	/**
	 * 营销案结束时间
	 */
	protected String marketCaseEndDate;
	/**
	 * 营销案创建工号
	 */
	protected String marketCaseCreateLoginNo;
	/**
	 * 营销案类型
	 */
	protected String marketCaseType;
	/**
	 * 营销案业务类型
	 */
	protected String marketCaseBusiType;
	/**
	 * 营销案状态
	 */
	protected String marketStatusCode;
	/**
	 * 营销案生效数据
	 */
	protected String marketCaseValidDate;
	/**
	 * 菜单名称
	 */
	protected String menuName;
	/**
	 * 公告名称
	 */
	protected String noticeName;
	/**
	 * 登陆首页时密码管理字段
	 */
	protected String oldLoginPassword;
	/**
	 * 操作人姓名
	 */
	protected String operName;
	/**
	 * 操作人工号
	 */
	protected String operNo;
	/**
	 * 选项值
	 */
	protected String optionValue;
	/**
	 * 操作时间
	 */
	protected Timestamp operTime;
	/**
	 * 操作时间开始
	 */
	protected Timestamp operTimeStart;
	/**
	 * 操作时间结束
	 */
	protected Timestamp operTimeEnd;
	/**
	 * 手机号码
	 */
	protected String phoneNo;
	/**
	 * 父组件类型
	 */
	protected String parentComponentType;
	/**
	 * 父关系Id
	 */
	protected String parentRelId;
	/**
	 * 父组件Id
	 */
	protected String parentComponentId;
	/**
	 * 运营位Id
	 */
	protected String positionId;
	/**
	 * 运营位类型
	 */
	protected String positionType;
	/**
	 * 产品Id
	 */
	protected String productId;
	/**
	 * 主产品实例
	 */
	protected String prdInstId;
	/**
	 * 产品名称
	 */
	protected String productName;
	/**
	 * 进程No
	 */
	protected String processNo;
	/**
	 * 产品类型
	 */
	protected String productType;
	/**
	 * 产商品编码
	 */
	protected String productCommodityId;
	/**
	 * 产商品名称
	 */
	protected String productCommodityName;
	/**
	 * 产商品报表地市
	 */
	protected String cityId;
	/**
	 * 查询条件的营销案范围开始日期数据
	 */
	protected String rangeStartDate;
	/**
	 * 问卷ID
	 */
	protected String questionId;
	/**
	 * 查询条件的营销案范围结束日期数据
	 */
	protected String rangeEndDate;
	/**
	 * 接触时间区间
	 */
	protected String recommonedStartTime;
	/**
	 * 接触时间区间
	 */
	protected String recommonedEndTime;
	/**
	 * 地市编码
	 */
	protected String regionCode;
	/**
	 * 多个地市编码
	 */
	protected List<String> regionCodeArray;
	/**
	 * 关系Id
	 */
	protected String relId;
	/**
	 * 统计时间
	 */
	protected String reportDate;
	/**
	 * 角色Id
	 */
	protected String roleId;
	/**
	 * 角色名称
	 */
	protected String roleName;
	/**
	 * 角色类型
	 */
	protected String roleType;
	/**
	 * 规则Id
	 */
	protected String ruleId;
	/**
	 * 规则详细信息Id
	 */
	protected String ruleDetailId;
	/**
	 * 规则类型
	 */
	protected String ruleDetailType;
	/**
	 * 规则详情类型
	 */
	protected String ruleParCode;
	/**
	 * 服务号码
	 */
	protected String serviceNbr;
	/**
	 * 客户经理工号
	 */
	protected String serviceNo;
	/**
	 * 订购量的天数(7天)
	 */
	protected String sevenDay;
	/**
	 * 服务类型
	 */
	protected String serType;
	/**
	 * push短信的发送日期
	 */
	protected String sendDate;
	/**
	 * 状态
	 */
	protected String statusCode;
	/**
	 * 系统时间
	 */
	protected Timestamp sysDate;
	/**
	 * 批量PUSH任务生成时间
	 */
	protected String sendTime;
	/**
	 * 开始时间
	 */
	protected String startTime;
	/**
	 * 开始日期 
	 */
	protected Timestamp startDate;
	
	/**
	 * 调配Id
	 */
	protected String taskadjustId;
	/**
	 * 任务名称
	 */
	protected String taskName;
	
	/**
	 * 触发类型
	 */
	protected String triggerMode;
	/**
	 * 模板Id
	 */
	protected String templateId;
	/**
	 * 模板名称
	 */
	protected String templateName;
	/**
	 * 模板类型
	 */
	protected String templateType;
	/**
	 * 订购量的天数(3天)
	 */
	protected String threeDay;
	/**
	 * 更新时间
	 */
	protected Timestamp updateTime;
	/**
	 * 拨号帐户
	 */
	protected String userAccount;
	/**
	 * 标签名称
	 */
	protected String userLabelName;
	/**
	 * 标签号码
	 */
	protected String userLabelCode;
	
	/**
	 * 是否黑名单
	 */
	protected String withoutBlack;
	
	/**
	 * 
	 * @date: 2016-10-21
	 * @author: wangth
	 * @Title: getActDemandId
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getActDemandId() {
		return actDemandId;
	}

	/**
	 * 
	 * @date: 2016-10-21
	 * @author: wangth
	 * @Title: setActDemandId
	 * @param actDemandId
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setActDemandId(String actDemandId) {
		this.actDemandId = actDemandId;
	}

	/**
	 * 
	 * @date: 2016-10-28
	 * @author: tangaq
	 * @title: getActDemandClass
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getActDemandClass() {
		return actDemandClass;
	}

	/**
	 * 
	 * @date: 2016-10-28
	 * @author: tangaq
	 * @title: setActDemandClass
	 * @param actDemandClass
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setActDemandClass(String actDemandClass) {
		this.actDemandClass = actDemandClass;
	}

	/**
	 * 
	 * @date: 2016-10-28
	 * @author: tangaq
	 * @title: getActDemandType
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getActDemandType() {
		return actDemandType;
	}

	/**
	 * 
	 * @date: 2016-10-28
	 * @author: tangaq
	 * @title: setActDemandType
	 * @param actDemadType
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setActDemandType(String actDemandType) {
		this.actDemandType = actDemandType;
	}

	/**
	 * 
	 * @date: 2016-10-28
	 * @author: tangaq
	 * @title: getActDemandName
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getActDemandName() {
		return actDemandName;
	}

	/**
	 * 
	 * @date: 2016-10-28
	 * @author: tangaq
	 * @title: setActDemandName
	 * @param actDemaName
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setActDemandName(String actDemandName) {
		this.actDemandName = actDemandName;
	}

	/**
	 * 
	 * @date: 2016-10-19
	 * @author: wangth
	 * @Title: getAccessCode
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getAccessCode() {
		return accessCode;
	}

	/**
	 * 
	 * @date: 2016-10-19
	 * @author: wangth
	 * @Title: setAccessCode
	 * @param accessCode
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setAccessCode(String accessCode) {
		this.accessCode = accessCode;
	}

	/**
	 * 
	 * @date: 2016-10-19
	 * @author: wangth
	 * @Title: getAccessCodeServiceType
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getAccessCodeServiceType() {
		return accessCodeServiceType;
	}

	/**
	 * 
	 * @date: 2016-10-19
	 * @author: wangth
	 * @Title: setAccessCodeServiceType
	 * @param accessCodeServiceType
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setAccessCodeServiceType(String accessCodeServiceType) {
		this.accessCodeServiceType = accessCodeServiceType;
	}

	/** 
	 * @date: 2017-3-9 
	 * @author: wangpei
	 * @title: getAcctId 
	 * @return the acctId
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	@Override
	public String getAcctId() {
		return acctId;
	}

	/** 
	* @date: 2017-3-9 
	* @author: wangpei
	* @title: setAcctId 
	* @param acctId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	/**
	 * 
	 * @date: 2016-12-23
	 * @author: zhangjj_crmpd
	 * @title: getActId
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getActId() {
		return actId;
	}

	/**
	 * 
	 * @date: 2016-12-23
	 * @author: zhangjj_crmpd
	 * @title: setActId
	 * @param actId
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setActId(String actId) {
		this.actId = actId;
	}
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: getApplyRegionCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getApplyRegionCode() {
		return applyRegionCode;
	}

	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: setApplyRegionCode 
	* @param applyRegionCode 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setApplyRegionCode(String applyRegionCode) {
		this.applyRegionCode = applyRegionCode;
	}

	/**
	 * 
	 * @date: 2016-10-15
	 * @author: wangth
	 * @Title: getAuditNo
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getAuditNo() {
		return auditNo;
	}

	/**
	 * 
	 * @date: 2016-10-15
	 * @author: wangth
	 * @Title: setAuditNo
	 * @param auditNo
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setAuditNo(String auditNo) {
		this.auditNo = auditNo;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getAuditOrder
	 * @return the auditOrder
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getAuditOrder() {
		return auditOrder;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setAuditOrder
	 * @param auditOrder
	 *            the auditOrder to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setAuditOrder(String auditOrder) {
		this.auditOrder = auditOrder;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getAuditRecordId
	 * @return the auditRecordId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getAuditRecordId() {
		return auditRecordId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setAuditRecordId
	 * @param auditRecordId
	 *            the auditRecordId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setAuditRecordId(String auditRecordId) {
		this.auditRecordId = auditRecordId;
	}

	/**
	 * 
	 * @date: 2016-10-18
	 * @author: wangth
	 * @Title: getAuditStatus
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getAuditStatus() {
		return auditStatus;
	}

	/**
	 * 
	 * @date: 2016-10-18
	 * @author: wangth
	 * @Title: setAuditStatus
	 * @param auditStatus
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setAuditStatus(String auditStatus) {
		this.auditStatus = auditStatus;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getAuditType
	 * @return the auditType
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getAuditType() {
		return auditType;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setAuditType
	 * @param auditType
	 *            the auditType to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setAuditType(String auditType) {
		this.auditType = auditType;
	}

	/**
	 * 
	 * @date: 2016-12-21
	 * @author: zhangjj_crmpd
	 * @title: getBatchNo
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getBatchNo() {
		return batchNo;
	}

	/**
	 * 
	 * @date: 2016-12-21
	 * @author: zhangjj_crmpd
	 * @title: setBatchNo
	 * @param batchNo
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getBusiId
	 * @return the busiId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getBusiId() {
		return busiId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setBusiId
	 * @param busiId
	 *            the busiId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setBusiId(String busiId) {
		this.busiId = busiId;
	}

	/**
	 * @date: 2016-10-18
	 * @author: wangpei
	 * @title: getBusiType
	 * @return the busiType
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getBusiType() {
		return busiType;
	}

	/**
	 * @date: 2016-10-18
	 * @author: wangpei
	 * @title: setBusiType
	 * @param busiType
	 *            the busiType to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}

	/**
	 * @date: 2016-10-27
	 * @author: xiongxq
	 * @Title: getCategroy
	 * @return the categroy
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCategroy() {
		return categroy;
	}

	/**
	 * @date: 2016-10-27
	 * @author: xiongxq
	 * @Title: setCategroy
	 * @param categroy
	 *            the categroy to set
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setCategroy(String categroy) {
		this.categroy = categroy;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getChannelId
	 * @return the channelId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getChannelId() {
		return channelId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setChannelId
	 * @param channelId
	 *            the channelId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getChannelIdArray
	 * @return the channelIdArray
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<String> getChannelIdArray() {
		return channelIdArray;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setChannelIdArray
	 * @param channelIdArray
	 *            the channelIdArray to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setChannelIdArray(List<String> channelIdArray) {
		this.channelIdArray = channelIdArray;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getChannelName
	 * @return the channelName
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getChannelName() {
		return channelName;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setChannelName
	 * @param channelName
	 *            the channelName to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getChannelType
	 * @return the channelType
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getChannelType() {
		return channelType;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setChannelType
	 * @param channelType
	 *            the channelType to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getCustGroupCreateLoginNo
	 * @return the custGroupCreateLoginNo
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCustGroupCreateLoginNo() {
		return custGroupCreateLoginNo;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setCustGroupCreateLoginNo
	 * @param custGroupCreateLoginNo
	 *            the custGroupCreateLoginNo to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setCustGroupCreateLoginNo(String custGroupCreateLoginNo) {
		this.custGroupCreateLoginNo = custGroupCreateLoginNo;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getCustGroupEndDate
	 * @return the custGroupEndDate
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public String getCustGroupEndDate() {
		return custGroupEndDate;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setCustGroupEndDate
	 * @param custGroupEndDate
	 *            the custGroupEndDate to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public void setCustGroupEndDate(String custGroupEndDate) {
		this.custGroupEndDate = custGroupEndDate;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getCustGroupId
	 * @return the custGroupId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public String getCustGroupId() {
		return custGroupId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setCustGroupId
	 * @param custGroupId
	 *            the custGroupId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public void setCustGroupId(String custGroupId) {
		this.custGroupId = custGroupId;
	}

	/**
	 * @date: 2016-12-21
	 * @author: wangpei
	 * @title: getCustId
	 * @return the custId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getCustId() {
		return custId;
	}

	/**
	 * @date: 2016-12-21
	 * @author: wangpei
	 * @title: setCustId
	 * @param custId
	 *            the custId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}

	/**
	 * 
	 * @date: 2016-11-11
	 * @author: fangyuan_crmpd
	 * @title: getCustName
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getCustName() {
		return custName;
	}

	/**
	 * 
	 * @date: 2016-11-11
	 * @author: fangyuan_crmpd
	 * @title: setCustName
	 * @param custName
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setCustName(String custName) {
		this.custName = custName;
	}

	/**
	 * 
	 * @date: 2016-11-11
	 * @author: fangyuan_crmpd
	 * @title: getCustNameOrServiceNbr
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getCustNameOrServiceNbr() {
		return custNameOrServiceNbr;
	}

	/**
	 * 
	 * @date: 2016-11-11
	 * @author: fangyuan_crmpd
	 * @title: setCustNameOrServiceNbr
	 * @param custNameOrServiceNbr
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setCustNameOrServiceNbr(String custNameOrServiceNbr) {
		this.custNameOrServiceNbr = custNameOrServiceNbr;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getCustGroupName
	 * @return the custGroupName
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public String getCustGroupName() {
		return custGroupName;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setCustGroupName
	 * @param custGroupName
	 *            the custGroupName to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public void setCustGroupName(String custGroupName) {
		this.custGroupName = custGroupName;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getCustGroupStartDate
	 * @return the custGroupStartDate
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public String getCustGroupStartDate() {
		return custGroupStartDate;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setCustGroupStartDate
	 * @param custGroupStartDate
	 *            the custGroupStartDate to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public void setCustGroupStartDate(String custGroupStartDate) {
		this.custGroupStartDate = custGroupStartDate;
	}

	/**
	 * 
	 * @date: 2016-10-16
	 * @author: wangth
	 * @Title: getCustGroupType
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public String getCustGroupType() {
		return custGroupType;
	}

	/**
	 * 
	 * @date: 2016-10-16
	 * @author: wangth
	 * @Title: setCustGroupType
	 * @param custGroupType
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupType(String custGroupType) {
		this.custGroupType = custGroupType;
	}

	/**
	 * 
	 * @date: 2016-10-16
	 * @author: wangth
	 * @Title: getCustGroupOperTime
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public String getCustGroupOperTime() {
		return custGroupOperTime;
	}

	/**
	 * 
	 * @date: 2016-10-16
	 * @author: wangth
	 * @Title: setCustGroupOperTime
	 * @param custGroupOperTime
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupOperTime(String custGroupOperTime) {
		this.custGroupOperTime = custGroupOperTime;
	}

	/**
	 * 
	 * @date: 2016-10-31
	 * @author: tangaq
	 * @title: getCustGroupDetailFileName
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getCustGroupDetailFileName() {
		return custGroupDetailFileName;
	}

	/**
	 * 
	 * @date: 2016-10-31
	 * @author: tangaq
	 * @title: setCustGroupDetailFileName
	 * @param custGroupDetailFileName
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupDetailFileName(String custGroupDetailFileName) {
		this.custGroupDetailFileName = custGroupDetailFileName;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getContentId
	 * @return the contentId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public String getContentId() {
		return contentId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setContentId
	 * @param contentId
	 *            the contentId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getContentDetailId
	 * @return the contentDetailId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public String getContentDetailId() {
		return contentDetailId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setContentDetailId
	 * @param contentDetailId
	 *            the contentDetailId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public void setContentDetailId(String contentDetailId) {
		this.contentDetailId = contentDetailId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getContentName
	 * @return the contentName
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public String getContentName() {
		return contentName;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setContentName
	 * @param contentName
	 *            the contentName to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public void setContentName(String contentName) {
		this.contentName = contentName;
	}

	/**
	 * 
	 * @date: 2016-12-22
	 * @author: yuanliang
	 * @title: getContentParCode
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getContentParCode() {
		return contentParCode;
	}

	/**
	 * 
	 * @date: 2016-12-22
	 * @author: yuanliang
	 * @title: setContentParCode
	 * @param contentParCode
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setContentParCode(String contentParCode) {
		this.contentParCode = contentParCode;
	}

	/**
	 * 
	* @date: 2017-4-4 
	* @author: sunyuan
	* @title: getContentParValue 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getContentParValue() {
		return contentParValue;
	}

	/**
	 * 
	* @date: 2017-4-4 
	* @author: sunyuan
	* @title: setContentParValue 
	* @param contentParValue 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setContentParValue(String contentParValue) {
		this.contentParValue = contentParValue;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getComponentId
	 * @return the componentId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public String getComponentId() {
		return componentId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setComponentId
	 * @param componentId
	 *            the componentId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public void setComponentId(String componentId) {
		this.componentId = componentId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getComponentType
	 * @return the componentType
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public String getComponentType() {
		return componentType;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setComponentType
	 * @param componentType
	 *            the componentType to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public void setComponentType(String componentType) {
		this.componentType = componentType;
	}

	/**
	 * 
	 * @date: 2016-10-27
	 * @author: yuanliang
	 * @title: getDbType
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getDbType() {
		return dbType;
	}

	/**
	 * 
	 * @date: 2016-10-27
	 * @author: yuanliang
	 * @title: setDbType
	 * @param dbType
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setDbType(String dbType) {
		this.dbType = dbType;
	}

	/**
	 * 
	* @date: 2017-3-29 
	* @author: yuanchun
	* @title: getEventChannelId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getEventChannelId() {
		return eventChannelId;
	}

	/**
	 * 
	* @date: 2017-3-29 
	* @author: yuanchun
	* @title: setEventChannelId 
	* @param eventChannelId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventChannelId(String eventChannelId) {
		this.eventChannelId = eventChannelId;
	}

	/**
	 * @date: 2016-12-21
	 * @author: wangpei
	 * @title: getEdwDeptId
	 * @return the edwDeptId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getEdwDeptId() {
		return edwDeptId;
	}

	/**
	 * @date: 2016-12-21
	 * @author: wangpei
	 * @title: setEdwDeptId
	 * @param edwDeptId
	 *            the edwDeptId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setEdwDeptId(String edwDeptId) {
		this.edwDeptId = edwDeptId;
	}

	/**
	 * @date: 2016-11-23
	 * @author: xiongxq
	 * @Title: getEndTime
	 * @return
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getEndTime() {
		return endTime;
	}

	/**
	 * @date: 2016-11-23
	 * @author: xiongxq
	 * @Title: setEndTime
	 * @param endTime
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: getEndDate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Timestamp getEndDate() {
		return endDate;
	}
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: setEndDate 
	* @param endDate 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getEventDetailId
	 * @return the eventDetailId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public String getEventDetailId() {
		return eventDetailId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setEventDetailId
	 * @param eventDetailId
	 *            the eventDetailId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public void setEventDetailId(String eventDetailId) {
		this.eventDetailId = eventDetailId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getEventId
	 * @return the eventId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public String getEventId() {
		return eventId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setEventId
	 * @param eventId
	 *            the eventId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setEventId(String eventId) {
		this.eventId = eventId;
	}
	
	/**
	 * 
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: getEventType 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getEventType() {
		return eventType;
	}

	/**
	 * 
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: setEventType 
	* @param eventType 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	/**
	 * 
	 * @date: 2016-11-24
	 * @author: yuanliang
	 * @title: getEventDetailType
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getEventDetailType() {
		return eventDetailType;
	}

	/**
	 * 
	 * @date: 2016-11-24
	 * @author: yuanliang
	 * @title: setEventDetailType
	 * @param eventDetailType
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setEventDetailType(String eventDetailType) {
		this.eventDetailType = eventDetailType;
	}

	/**
	 * 
	 * @date: 2016-11-24
	 * @author: yuanliang
	 * @title: getEventParCode
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getEventParCode() {
		return eventParCode;
	}

	/**
	 * 
	 * @date: 2016-11-24
	 * @author: yuanliang
	 * @title: setEventParCode
	 * @param eventParCode
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setEventParCode(String eventParCode) {
		this.eventParCode = eventParCode;
	}

	/**
	 * 
	 * @date: 2016-11-14
	 * @author: fangyuan_crmpd
	 * @title: getFieldEnName
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getFieldEnName() {
		return fieldEnName;
	}

	/**
	 * 
	 * @date: 2016-10-31
	 * @author: wangth
	 * @Title: setFieldEnName
	 * @param fieldEnName
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setFieldEnName(String fieldEnName) {
		this.fieldEnName = fieldEnName;
	}

	/**
	 * 
	* @date: 2017-3-9 
	* @author: yuanchun
	* @title: getFieldDesc 
	* @return 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getFieldDesc() {
		return fieldDesc;
	}

	/**
	 * 
	* @date: 2017-3-9 
	* @author: yuanchun
	* @title: setFieldDesc 
	* @param fieldDesc 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setFieldDesc(String fieldDesc) {
		this.fieldDesc = fieldDesc;
	}
	
	/**
	 * 
	* @date: 2017-4-14 
	* @author: dongyh
	* @title: getFieldValueDesc 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getFieldValueDesc() {
		return fieldValueDesc;
	}
	
	/**
	 * 
	* @date: 2017-4-14 
	* @author: dongyh
	* @title: setFieldValueDesc 
	* @param fieldValueDesc 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setFieldValueDesc(String fieldValueDesc) {
		this.fieldValueDesc = fieldValueDesc;
	}

	/**
	 * 
	 * @date: 2016-10-31
	 * @author: wangth
	 * @Title: setFieldCnName
	 * @param fieldCnName
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setFieldCnName(String fieldCnName) {
		this.fieldCnName = fieldCnName;
	}

	/**
	 * 
	 * @date: 2016-11-14
	 * @author: fangyuan_crmpd
	 * @title: getFieldValue
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getFieldValue() {
		return fieldValue;
	}

	/**
	 * 
	 * @date: 2016-11-14
	 * @author: fangyuan_crmpd
	 * @title: setFieldValue
	 * @param fieldValue
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

	/**
	 * @date: 2016-11-26
	 * @author: xiongxq
	 * @Title: getFifthDay
	 * @return
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getFifthDay() {
		return fifthDay;
	}

	/**
	 * @date: 2016-11-26
	 * @author: xiongxq
	 * @Title: setFifthDay
	 * @param fifthDay
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setFifthDay(String fifthDay) {
		this.fifthDay = fifthDay;
	}

	/**
	 * @date: 2016-12-21
	 * @author: wangpei
	 * @title: getGridId
	 * @return the gridId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getGridId() {
		return gridId;
	}

	/**
	 * @date: 2016-12-21
	 * @author: wangpei
	 * @title: setGridId
	 * @param gridId
	 *            the gridId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setGridId(String gridId) {
		this.gridId = gridId;
	}
	
	/**
	 * 
	* @date: 2017-1-11 
	* @author: tangaq
	* @title: getGroupCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getGroupCode() {
		return groupCode;
	}

	/**
	 * 
	* @date: 2017-1-11 
	* @author: tangaq
	* @title: setGroupCode 
	* @param groupCode 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setGroupCode(String groupCode) {
		this.groupCode = groupCode;
	}

	/**
	 * 
	 * @date: 2016-10-14
	 * @author: wangth
	 * @Title: getGroupId
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * 
	 * @date: 2016-10-14
	 * @author: wangth
	 * @Title: setGroupId
	 * @param groupId
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getIdNo
	 * @return the idNo
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public String getIdNo() {
		return idNo;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setIdNo
	 * @param idNo
	 *            the idNo to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */

	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getKeyWords
	 * @return the keyWords
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public List<String> getKeyWords() {
		return keyWords;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setKeyWords
	 * @param keyWords
	 *            the keyWords to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setKeyWords(List<String> keyWords) {
		this.keyWords = keyWords;
	}

	/**
	 * 
	 * @date: 2016-10-27
	 * @author: yangwl
	 * @title: getLoadMarketCaseCache
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getLoadMarketCaseCache() {
		return loadMarketCaseCache;
	}

	/**
	 * 
	 * @date: 2016-10-27
	 * @author: yangwl
	 * @title: setLoadMarketCaseCache
	 * @param loadMarketCaseCache
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setLoadMarketCaseCache(String loadMarketCaseCache) {
		this.loadMarketCaseCache = loadMarketCaseCache;
	}

	/**
	 * @date: 2016-10-27
	 * @author: xiongxq
	 * @Title: getLoginName
	 * @return the loginName
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public String getLoginName() {
		return loginName;
	}

	/**
	 * @date: 2016-10-27
	 * @author: xiongxq
	 * @Title: setLoginName
	 * @param loginName
	 *            the loginName to set
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	/**
	 * @date: 2016-10-27
	 * @author: wangpei
	 * @title: getLoginNo
	 * @return the loginNo
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getLoginNo() {
		return loginNo;
	}

	/**
	 * @date: 2016-10-27
	 * @author: wangpei
	 * @title: setLoginNo
	 * @param loginNo
	 *            the loginNo to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setLoginNo(String loginNo) {
		this.loginNo = loginNo;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getMarketCaseCacheKey
	 * @return the marketCaseCacheKey
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseCacheKey() {
		return marketCaseCacheKey;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setMarketCaseCacheKey
	 * @param marketCaseCacheKey
	 *            the marketCaseCacheKey to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseCacheKey(String marketCaseCacheKey) {
		this.marketCaseCacheKey = marketCaseCacheKey;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getMarketCaseId
	 * @return the marketCaseId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseId() {
		return marketCaseId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setMarketCaseId
	 * @param marketCaseId
	 *            the marketCaseId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseId(String marketCaseId) {
		this.marketCaseId = marketCaseId;
	}

	/**
	 * 
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: getMarketCaseLevel 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseLevel() {
		return marketCaseLevel;
	}

	/**
	 * 
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: setMarketCaseLevel 
	* @param marketCaseLevel 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseLevel(String marketCaseLevel) {
		this.marketCaseLevel = marketCaseLevel;
	}
	
	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getMarketCaseName
	 * @return the marketCaseName
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseName() {
		return marketCaseName;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setMarketCaseName
	 * @param marketCaseName
	 *            the marketCaseName to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseName(String marketCaseName) {
		this.marketCaseName = marketCaseName;
	}

	/**
	 * 
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: getMarketCaseQueryFlagByPermission 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseQueryFlagByPermission() {
		return marketCaseQueryFlagByPermission;
	}

	/**
	 * 
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: setMarketCaseQueryFlagByPermission 
	* @param marketCaseQueryFlagByPermission 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseQueryFlagByPermission(
			String marketCaseQueryFlagByPermission) {
		this.marketCaseQueryFlagByPermission = marketCaseQueryFlagByPermission;
	}

	
	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getMarketCaseStartDate
	 * @return the marketCaseStartDate
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseStartDate() {
		return marketCaseStartDate;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setMarketCaseStartDate
	 * @param marketCaseStartDate
	 *            the marketCaseStartDate to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseStartDate(String marketCaseStartDate) {
		this.marketCaseStartDate = marketCaseStartDate;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getMarketCaseEndDate
	 * @return the marketCaseEndDate
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseEndDate() {
		return marketCaseEndDate;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setMarketCaseEndDate
	 * @param marketCaseEndDate
	 *            the marketCaseEndDate to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseEndDate(String marketCaseEndDate) {
		this.marketCaseEndDate = marketCaseEndDate;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getMarketCaseCreateLoginNo
	 * @return the marketCaseCreateLoginNo
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseCreateLoginNo() {
		return marketCaseCreateLoginNo;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setMarketCaseCreateLoginNo
	 * @param marketCaseCreateLoginNo
	 *            the marketCaseCreateLoginNo to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseCreateLoginNo(String marketCaseCreateLoginNo) {
		this.marketCaseCreateLoginNo = marketCaseCreateLoginNo;
	}

	
	
	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getMarketCaseType
	 * @return the marketCaseType
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseType() {
		return marketCaseType;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setMarketCaseType
	 * @param marketCaseType
	 *            the marketCaseType to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseType(String marketCaseType) {
		this.marketCaseType = marketCaseType;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getMarketCaseBusiType
	 * @return the marketCaseBusiType
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseBusiType() {
		return marketCaseBusiType;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setMarketCaseBusiType
	 * @param marketCaseBusiType
	 *            the marketCaseBusiType to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseBusiType(String marketCaseBusiType) {
		this.marketCaseBusiType = marketCaseBusiType;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getMarketStatusCode
	 * @return the marketStatusCode
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getMarketStatusCode() {
		return marketStatusCode;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setMarketStatusCode
	 * @param marketStatusCode
	 *            the marketStatusCode to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setMarketStatusCode(String marketStatusCode) {
		this.marketStatusCode = marketStatusCode;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getMarketCaseValidDate
	 * @return the marketCaseValidDate
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getMarketCaseValidDate() {
		return marketCaseValidDate;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setMarketCaseValidDate
	 * @param marketCaseValidDate
	 *            the marketCaseValidDate to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseValidDate(String marketCaseValidDate) {
		this.marketCaseValidDate = marketCaseValidDate;
	}

	/**
	 * 
	 * @date: 2016-11-4
	 * @author: tangaq
	 * @title: getMenuName
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getMenuName() {
		return menuName;
	}

	/**
	 * 
	 * @date: 2016-11-4
	 * @author: tangaq
	 * @title: setMenuName
	 * @param menuName
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	/**
	 * 
	* @date: 2017-2-28 
	* @author: yexr
	* @title: setNoticeName 
	* @param noticeName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setNoticeName(String noticeName) {
		this.noticeName = noticeName;
	}
	/**
	 * 
	* @date: 2017-2-28 
	* @author: yexr
	* @title: getNoticeName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getNoticeName() {
		return noticeName;
	}
	/**
	 * @date: 2016-12-2
	 * @author: xiongxq
	 * @Title: getOldLoginPassword
	 * @return
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getOldLoginPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @date: 2016-12-2
	 * @author: xiongxq
	 * @Title: setOldLoginPassword
	 * @param oldLoginPassword
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setOldLoginPassword(String oldLoginPassword) {
		// TODO Auto-generated method stub

	}

	/**
	 * @date: 2016-10-27
	 * @author: xiongxq
	 * @Title: getOptionValue
	 * @return the optionValue
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public String getOptionValue() {
		return optionValue;
	}

	/**
	 * @date: 2016-10-27
	 * @author: xiongxq
	 * @Title: setOptionValue
	 * @param optionValue
	 *            the optionValue to set
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	/**
	 * @date: 2016-10-26
	 * @author: wangpei
	 * @title: getOperName
	 * @return the operName
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getOperName() {
		return operName;
	}

	/**
	 * @date: 2016-10-26
	 * @author: wangpei
	 * @title: setOperName
	 * @param operName
	 *            the operName to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setOperName(String operName) {
		this.operName = operName;
	}

	/**
	 * @date: 2016-10-26
	 * @author: wangpei
	 * @title: getOperNo
	 * @return the operNo
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getOperNo() {
		return operNo;
	}

	/**
	 * @date: 2016-10-26
	 * @author: wangpei
	 * @title: setOperNo
	 * @param operNo
	 *            the operNo to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setOperNo(String operNo) {
		this.operNo = operNo;
	}

	/**
	 * @date: 2016-10-26
	 * @author: wangpei
	 * @title: getOperTime
	 * @return the operTime
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public Timestamp getOperTime() {
		return operTime;
	}

	/**
	 * @date: 2016-10-26
	 * @author: wangpei
	 * @title: setOperTime
	 * @param operTime
	 *            the operTime to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setOperTime(Timestamp operTime) {
		this.operTime = operTime;
	}

	/**
	 * @date: 2016-10-26
	 * @author: wangpei
	 * @title: getOperTimeStart
	 * @return the operTimeStart
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public Timestamp getOperTimeStart() {
		return operTimeStart;
	}

	/**
	 * @date: 2016-10-26
	 * @author: wangpei
	 * @title: setOperTimeStart
	 * @param operTimeStart
	 *            the operTimeStart to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setOperTimeStart(Timestamp operTimeStart) {
		this.operTimeStart = operTimeStart;
	}

	/**
	 * @date: 2016-10-26
	 * @author: wangpei
	 * @title: getOperTimeEnd
	 * @return the operTimeEnd
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public Timestamp getOperTimeEnd() {
		return operTimeEnd;
	}

	/**
	 * @date: 2016-10-26
	 * @author: wangpei
	 * @title: setOperTimeEnd
	 * @param operTimeEnd
	 *            the operTimeEnd to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setOperTimeEnd(Timestamp operTimeEnd) {
		this.operTimeEnd = operTimeEnd;
	}

	/**
	 * 
	 * @date: 2016-12-6
	 * @author: zhangjj_crmpd
	 * @title: getPrdInstId
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getPrdInstId() {
		return prdInstId;
	}

	/**
	 * 
	 * @date: 2016-12-6
	 * @author: zhangjj_crmpd
	 * @title: setPrdInstId
	 * @param prdInstId
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setPrdInstId(String prdInstId) {
		this.prdInstId = prdInstId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getPositionId
	 * @return the positionId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getPositionId() {
		return positionId;
	}
	
	/**
	* @date: 2017-4-8 
	* @author: dongyh
	* @title: getPositionType 
	* @return 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getPositionType() {
		return positionType;
	}
	
	/**
	* @date: 2017-4-8 
	* @author: dongyh
	* @title: setPositionType 
	* @param positionType 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPositionType(String positionType) {
		this.positionType = positionType;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getPhoneNo
	 * @return the phoneNo
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getPhoneNo() {
		return phoneNo;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setPhoneNo
	 * @param phoneNo
	 *            the phoneNo to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setPositionId
	 * @param positionId
	 *            the positionId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getParentComponentType
	 * @return the parentComponentType
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getParentComponentType() {
		return parentComponentType;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setParentComponentType
	 * @param parentComponentType
	 *            the parentComponentType to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setParentComponentType(String parentComponentType) {
		this.parentComponentType = parentComponentType;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getParentRelId
	 * @return the parentRelId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getParentRelId() {
		return parentRelId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setParentRelId
	 * @param parentRelId
	 *            the parentRelId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setParentRelId(String parentRelId) {
		this.parentRelId = parentRelId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getParentComponentId
	 * @return the parentComponentId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getParentComponentId() {
		return parentComponentId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setParentComponentId
	 * @param parentComponentId
	 *            the parentComponentId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setParentComponentId(String parentComponentId) {
		this.parentComponentId = parentComponentId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getProductId
	 * @return the productId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setProductId
	 * @param productId
	 *            the productId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getProductName
	 * @return the productName
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setProductName
	 * @param productName
	 *            the productName to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getProductType
	 * @return the productType
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setProductType
	 * @param productType
	 *            the productType to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * 
	* @date: 2017-1-25 
	* @author: zhangjj_crmpd
	* @title: getProcessNo 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getProcessNo() {
		return processNo;
	}
	
	/**
	 * 
	 * @date: 2016-11-14
	 * @author: zhangjj_crmpd
	 * @title: setProcessNo
	 * @param processNo
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setProcessNo(String processNo) {
		this.processNo = processNo;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getProductCommodityId
	 * @return the productCommodityId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getProductCommodityId() {
		return productCommodityId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setProductCommodityId
	 * @param productCommodityId
	 *            the productCommodityId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setProductCommodityId(String productCommodityId) {
		this.productCommodityId = productCommodityId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getProductCommodityName
	 * @return the productCommodityName
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getProductCommodityName() {
		return productCommodityName;
	}
	/** 
	* @date: 2017-2-24 
	* @author: hannn
	* @title: getCityId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getCityId() {
		return cityId;
	}
    /** 
    * @date: 2017-2-24 
    * @author: hannn
    * @title: setCityId 
    * @param cityId 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public void setCityId(String cityId) {
		this.cityId = cityId;
	}
	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setProductCommodityName
	 * @param productCommodityName
	 *            the productCommodityName to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setProductCommodityName(String productCommodityName) {
		this.productCommodityName = productCommodityName;
	}

	/**
	 * 
	 * @date: 2016-12-1
	 * @author: zhangqia
	 * @title: getQuestionId
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getQuestionId() {
		return questionId;
	}

	/**
	 * 
	 * @date: 2016-12-1
	 * @author: zhangqia
	 * @title: setQuestionId
	 * @param triggerMode
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setQuestionId(String questionId) {
		this.questionId = questionId;
	}

	/**
	 * 
	 * @date: 2016-11-16
	 * @author: yuanliang
	 * @title: getRangeStartDate
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getRangeStartDate() {
		return rangeStartDate;
	}

	/**
	 * 
	 * @date: 2016-11-16
	 * @author: yuanliang
	 * @title: setRangeStartDate
	 * @param rangeStartDate
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setRangeStartDate(String rangeStartDate) {
		this.rangeStartDate = rangeStartDate;
	}

	/**
	 * 
	 * @date: 2016-11-16
	 * @author: yuanliang
	 * @title: getRangeEndDate
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getRangeEndDate() {
		return rangeEndDate;
	}

	/**
	 * 
	 * @date: 2016-11-16
	 * @author: yuanliang
	 * @title: setRangeEndDate
	 * @param rangeEndDate
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setRangeEndDate(String rangeEndDate) {
		this.rangeEndDate = rangeEndDate;
	}

	/**
	 * 
	 * @date: 2017-1-6
	 * @author: liuqi
	 * @title: getRecommonedStartTime
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getRecommonedStartTime() {
		return recommonedStartTime;
	}

	/**
	 * 
	 * @date: 2017-1-6
	 * @author: liuqi
	 * @title: setRecommonedStartTime
	 * @param recommonedStartTime
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setRecommonedStartTime(String recommonedStartTime) {
		this.recommonedStartTime = recommonedStartTime;
	}

	/**
	 * 
	 * @date: 2017-1-6
	 * @author: liuqi
	 * @title: getRecommonedEndTime
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getRecommonedEndTime() {
		return recommonedEndTime;
	}

	/**
	 * 
	 * @date: 2017-1-6
	 * @author: liuqi
	 * @title: setRecommonedEndTime
	 * @param recommonedEndTime
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setRecommonedEndTime(String recommonedEndTime) {
		this.recommonedEndTime = recommonedEndTime;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getRegionCode
	 * @return the regionCode
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getRegionCode() {
		return regionCode;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setRegionCode
	 * @param regionCode
	 *            the regionCode to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setRegionCode(String regionCode) {
		this.regionCode = regionCode;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getRegionCodeArray
	 * @return the regionCodeArray
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public List<String> getRegionCodeArray() {
		return regionCodeArray;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setRegionCodeArray
	 * @param regionCodeArray
	 *            the regionCodeArray to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setRegionCodeArray(List<String> regionCodeArray) {
		this.regionCodeArray = regionCodeArray;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getRelId
	 * @return the relId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getRelId() {
		return relId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setRelId
	 * @param relId
	 *            the relId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setRelId(String relId) {
		this.relId = relId;
	}

	/**
	 * @date: 2016-11-26
	 * @author: xiongxq
	 * @Title: getReportDate
	 * @return
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getReportDate() {
		return reportDate;
	}

	/**
	 * @date: 2016-11-26
	 * @author: xiongxq
	 * @Title: setReportDate
	 * @param reportDate
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	/**
	 * 
	 * @date: 2016-10-27
	 * @author: wangth
	 * @Title: getRoleId
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public String getRoleId() {
		return roleId;
	}

	/**
	 * 
	 * @date: 2016-10-27
	 * @author: wangth
	 * @Title: setRoleId
	 * @param roleId
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getRuleId
	 * @return the ruleId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getRuleId() {
		return ruleId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setRuleId
	 * @param ruleId
	 *            the ruleId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
	}

	/**
	 * 
	 * @date: 2016-12-21
	 * @author: zhangjj_crmpd
	 * @title: getRuleDetailType
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getRuleDetailType() {
		return ruleDetailType;
	}

	/**
	 * 
	 * @date: 2016-12-21
	 * @author: zhangjj_crmpd
	 * @title: setRuleDetailType
	 * @param ruleDetailType
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setRuleDetailType(String ruleDetailType) {
		this.ruleDetailType = ruleDetailType;
	}

	/**
	 * 
	 * @date: 2016-12-22
	 * @author: zhangjj_crmpd
	 * @title: getRuleParCode
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getRuleParCode() {
		return ruleParCode;
	}

	/**
	 * 
	 * @date: 2016-12-22
	 * @author: zhangjj_crmpd
	 * @title: setRuleParCode
	 * @param ruleParCode
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setRuleParCode(String ruleParCode) {
		this.ruleParCode = ruleParCode;
	}

	/**
	 * 
	 * @date: 2016-10-27
	 * @author: wangth
	 * @Title: getRoleName
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * 
	 * @date: 2016-10-27
	 * @author: wangth
	 * @Title: setRoleName
	 * @param roleName
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * 
	 * @date: 2016-10-27
	 * @author: wangth
	 * @Title: getRoleType
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public String getRoleType() {
		return roleType;
	}

	/**
	 * 
	 * @date: 2016-10-27
	 * @author: wangth
	 * @Title: setRoleType
	 * @param roleType
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: getRuleDetailId
	 * @return the ruleDetailId
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getRuleDetailId() {
		return ruleDetailId;
	}

	/**
	 * @date: 2016-10-12
	 * @author: wangpei
	 * @title: setRuleDetailId
	 * @param ruleDetailId
	 *            the ruleDetailId to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setRuleDetailId(String ruleDetailId) {
		this.ruleDetailId = ruleDetailId;
	}

	/**
	 * @date: 2016-11-23
	 * @author: xiongxq
	 * @Title: getStartTime
	 * @return
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getStartTime() {
		return startTime;
	}

	/**
	 * @date: 2016-11-23
	 * @author: xiongxq
	 * @Title: setStartTime
	 * @param startTime
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: getStartDate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Timestamp getStartDate() {
		return startDate;
	}

	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: setStartDate 
	* @param startDate 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	/**
	 * @date: 2016-10-26
	 * @author: wangpei
	 * @title: getSysDate
	 * @return the sysDate
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public Timestamp getSysDate() {
		return sysDate;
	}

	/**
	 * @date: 2016-10-26
	 * @author: wangpei
	 * @title: setSysDate
	 * @param sysDate
	 *            the sysDate to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setSysDate(Timestamp sysDate) {
		this.sysDate = sysDate;
	}

	/**
	 * 
	 * @date: 2016-11-11
	 * @author: fangyuan_crmpd
	 * @title: getServiceNbr
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getServiceNbr() {
		return serviceNbr;
	}

	/**
	 * 
	 * @date: 2016-11-11
	 * @author: fangyuan_crmpd
	 * @title: setServiceNbr
	 * @param serviceNbr
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setServiceNbr(String serviceNbr) {
		this.serviceNbr = serviceNbr;
	}

	/**
	 * @date: 2016-12-21
	 * @author: wangpei
	 * @title: getServiceNo
	 * @return the serviceNo
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getServiceNo() {
		return serviceNo;
	}

	/**
	 * @date: 2016-12-21
	 * @author: wangpei
	 * @title: setServiceNo
	 * @param serviceNo
	 *            the serviceNo to set
	 * @version 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	/**
	 * @date: 2016-11-26
	 * @author: xiongxq
	 * @Title: getSevenDay
	 * @return
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSevenDay() {
		return sevenDay;
	}

	/**
	 * @date: 2016-11-26
	 * @author: xiongxq
	 * @Title: setSevenDay
	 * @param sevenDay
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setSevenDay(String sevenDay) {
		this.sevenDay = sevenDay;
	}

	/**
	 * 
	 * @date: 2016-11-23
	 * @author: fangyuan_crmpd
	 * @title: getSerType
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getSerType() {
		return serType;
	}

	/**
	 * 
	 * @date: 2016-11-23
	 * @author: fangyuan_crmpd
	 * @title: setSerType
	 * @param serType
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setSerType(String serType) {
		this.serType = serType;
	}

	/**
	 * 
	 * @date: 2016-11-26
	 * @author: yuanliang
	 * @title: getSendDate
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getSendDate() {
		return sendDate;
	}

	/**
	 * 
	 * @date: 2016-11-26
	 * @author: yuanliang
	 * @title: setSendDate
	 * @param sendDate
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setSendDate(String sendDate) {
		this.sendDate = sendDate;
	}
	
	/**
	 * 
	* @date: 2017-1-25 
	* @author: zhangjj_crmpd
	* @title: getStatusCode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * 
	 * @date: 2016-11-14
	 * @author: zhangjj_crmpd
	 * @title: setStatusCode
	 * @param statusCode
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * 
	 * @date: 2016-10-20
	 * @author: zhangqia
	 * @title: getSendTime
	 * @param
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getSendTime() {
		return sendTime;
	}

	/**
	 * 
	 * @date: 2016-10-20
	 * @author: zhangqia
	 * @title: setSendTime
	 * @param sendTime
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setSendTime(String sendTime) {
		this.sendTime = sendTime;
	}

	/**
	 * 
	 * @date: 2016-12-21
	 * @author: zhangjj_crmpd
	 * @title: getTaskadjustId
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getTaskadjustId() {
		return taskadjustId;
	}

	/**
	 * 
	 * @date: 2016-12-21
	 * @author: zhangjj_crmpd
	 * @title: setTaskadjustId
	 * @param taskadjustId
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setTaskadjustId(String taskadjustId) {
		this.taskadjustId = taskadjustId;
	}
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: getTaskName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getTaskName() {
		return taskName;
	}

	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: setTaskName 
	* @param taskName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	/**
	 * 
	 * @date: 2016-12-1
	 * @author: hannn
	 * @title: getTriggerMode
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getTriggerMode() {
		return triggerMode;
	}

	/**
	 * 
	 * @date: 2016-12-1
	 * @author: hannn
	 * @title: setTriggerMode
	 * @param triggerMode
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setTriggerMode(String triggerMode) {
		this.triggerMode = triggerMode;
	}

	/**
	 * 
	 * @date: 2016-10-20
	 * @author: zhangjj_crmpd
	 * @title: getTemplateId
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getTemplateId() {
		return templateId;
	}

	/**
	 * 
	 * @date: 2016-10-20
	 * @author: zhangjj_crmpd
	 * @title: setTemplateId
	 * @param templateId
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	/**
	 * 
	 * @date: 2016-10-27
	 * @author: tangaq
	 * @title: getTemplateName
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * 
	 * @date: 2016-10-27
	 * @author: tangaq
	 * @title: setTemplateName
	 * @param templateName
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	/**
	 * 
	 * @date: 2016-11-11
	 * @author: tangaq
	 * @title: getTemplateType
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getTemplateType() {
		return templateType;
	}

	/**
	 * 
	 * @date: 2016-11-11
	 * @author: tangaq
	 * @title: setTemplateType
	 * @param templateType
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setTemplateType(String templateType) {
		this.templateType = templateType;
	}

	/**
	 * @date: 2016-11-26
	 * @author: xiongxq
	 * @Title: getThreeDay
	 * @return
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getThreeDay() {
		return threeDay;
	}

	/**
	 * @date: 2016-11-26
	 * @author: xiongxq
	 * @Title: setThreeDay
	 * @param threeDay
	 * @exception:
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public void setThreeDay(String threeDay) {
		this.threeDay = threeDay;
	}

	/**
	 * 
	 * @date: 2016-11-7
	 * @author: sunliang
	 * @title: getUpdateTime
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public Timestamp getUpdateTime() {
		return updateTime;
	}

	/**
	 * 
	 * @date: 2016-12-6
	 * @author: zhangjj_crmpd
	 * @title: getUserAccount
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getUserAccount() {
		return userAccount;
	}

	/**
	 * 
	 * @date: 2016-12-6
	 * @author: zhangjj_crmpd
	 * @title: setUserAccount
	 * @param userAccount
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}

	/**
	 * 
	 * @date: 2016-11-7
	 * @author: sunliang
	 * @title: setUpdateTime
	 * @param updateTime
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * 
	 * @date: 2016-10-20
	 * @author: tangaq
	 * @title: getUserLabelName
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getUserLabelName() {
		return userLabelName;
	}

	/**
	 * 
	 * @date: 2016-10-20
	 * @author: tangaq
	 * @title: getUserLabelCode
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public String getUserLabelCode() {
		return userLabelCode;
	}

	/**
	 * 
	 * @date: 2016-10-20
	 * @author: tangaq
	 * @title: setUserLabelName
	 * @param userLabelName
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setUserLabelName(String userLabelName) {
		this.userLabelName = userLabelName;
	}

	/**
	 * 
	 * @date: 2016-10-20
	 * @author: tangaq
	 * @title: setUserLabelCode
	 * @param userLabelCode
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	public void setUserLabelCode(String userLabelCode) {
		this.userLabelCode = userLabelCode;
	}
	
	/**
	 * 
	 */
	@Override
	public String getWithoutBlack(){
		return withoutBlack;
	}
	
	@Override
	public void setWithoutBlack(String withoutBlack){
		this.withoutBlack = withoutBlack;
	}
}
