package com.sitech.strategy.common.pojo.impl.rdbms;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.rdbms.IIBatisSqlMap;

/**
 * ibatis表pojo对象
* @date: 2016-12-27 
* @author: sunliang 
* @title: IBatisSqlMapByAHTel 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class IBatisSqlMapByAHTel extends BaseClass implements IIBatisSqlMap {
	
	/**
	 * 活动需求表
	 */
	private static final String IBATIS_RMACTDEMANDINFO_DELETE = "RmActdemandInfo.deleteRmActDemandInfo";
	private static final String IBATIS_RMACTDEMANDINFO_INSERT = "RmActdemandInfo.insertRmActDemandInfo";
	private static final String IBATIS_RMACTDEMANDINFO_SELECT = "RmActdemandInfo.selectRmActDemandInfo";
	private static final String IBATIS_RMACTDEMANDINFO_UPDATE = "RmActdemandInfo.updateRmActDemandInfo";
	
	/**
	 * 附件表
	 */
	private static final String IBATIS_RMATTACHINFO_INSERT = "RmAttachInfo.insertRmAttachInfo";
	private static final String IBATIS_RMATTACHINFO_SELECT = "RmAttachInfo.selectRmAttachInfo";
	private static final String IBATIS_RMATTACHINFO_DELETE = "RmAttachInfo.deleteRmAttachInfo";
	
	/**
	 * 属性表
	 */
	private static final String IBATIS_RMATTRIBUTEINFO_INSERT = "RmAttributeInfo.insertRmAttributeInfo";
	private static final String IBATIS_RMATTRIBUTEINFO_SELECT_ = "RmAttributeInfo.selectRmAttributeInfo";
	private static final String IBATIS_RMATTRIBUTEINFO_UPDATE_ = "RmAttributeInfo.updateRmAttributeInfo";
	private static final String IBATIS_RMATTRIBUTEINFO_DELETE_ = "RmAttributeInfo.deleteRmAttributeInfo";
	
	/**
	 * 区域优先级表
	 */
	private static final String IBATIS_RMAREAPRIORITYINFO_DELETE = "RmAreaPriorityInfo.deleteRmAreaPriorityInfo";
	private static final String IBATIS_RMAREAPRIORITYINFO_INSERT = "RmAreaPriorityInfo.insertRmAreaPriorityInfo";
	private static final String IBATIS_RMAREAPRIORITYINFO_SELECT = "RmAreaPriorityInfo.selectRmAreaPriorityInfo";
	private static final String IBATIS_RMAREAPRIORITYINFO_SELECT_REL = "RmAreaPriorityInfo.selectRmAreaPriorityRelMarketCaseInfo";
	private static final String IBATIS_RMAREAPRIORITYINFO_SELECT_BYMARKETCASEID = "RmAreaPriorityInfo.selectRmAreaPriorityInfoByMarketCaseId";
	
	/**
	 * 审批记录表
	 */
	private static final String IBATIS_RMAUDITRECORDINFO_INSERT = "RmAuditrecordInfo.insertRmAuditRecordInfo";
	private static final String IBATIS_RMAUDITRECORDINFO_SELECT_MARKETCASEAUDITRECORD = "RmAuditrecordInfo.selectRmMarketCaseAuditRecordInfo";
	private static final String IBATIS_RMAUDITRECORDINFO_UPDATE_ = "RmAuditrecordInfo.updateRmAuditRecordInfo";
    private static final String IBATIS_RMAUDITRECORDINFO_SELECT_AUDITRECORDDETAILLIST = "RmAuditrecordInfo.selectRmAuditRecordDetailList";
    private static final String IBATIS_RMAUDITRECORDINFO_SELECT_MARKETCASEAUDITNUM = "RmAuditrecordInfo.selectRmMarketCaseAuditNum";
    
    /**
     * 作废
     */
    private static final String IBATIS_RMAUDITINVENTORYINFO_SELECT = "RmAuditinventoryInfo.selectRmAuditinventoryInfo";
    
    /**
     * 审批人表
     */
	private static final String IBATIS_RMAUDITNOINFO_INSERT = "RmAuditnoInfo.insertRmAuditNoInfo";
	private static final String IBATIS_RMAUDITNOINFO_SELECT = "RmAuditnoInfo.selectRmAuditNoInfo";
	private static final String IBATIS_RMAUDITNOINFO_SELECT_BUSIAUDITNO = "RmAuditnoInfo.selectBusiAuditNoInfo";
	private static final String IBATIS_RMAUDITNOINFO_UPDATE = "RmAuditnoInfo.updateRmAuditNoInfo";
	private static final String IBATIS_RMAUDITNOINFO_DELETE = "RmAuditnoInfo.deleteRmAuditNoInfo";
	
	/**
	 * 批量发送成功表
	 */
	private static final String IBATIS_RMBATCHPUSHSUCC_SELECT = "RmBatchpushsucctaskInfo.selectRmBatchPushSuccTaskInfo";
	/**
	 * 批量发送失败表
	 */
	private static final String IBATIS_RMBATCHPUSHEXCEP_SELECT = "RmBatchpushexceptaskInfo.selectRmBatchPushExcepTaskInfo";
	/**
	 * 批量待发送表
	 */
	private static final String IBATIS_RMBATCHPUSHWAIT_SELECT = "RmWaitsendbatchpushInfo.selectRmWaitSendBatchPushTaskInfo";
	/**
	 * 批量发送任务表
	 */
	private static final String IBATIS_RMBATCHPUSHTASK_SELECT = "RmBatchpushtaskInfo.selectRmBatchPushTaskInfo";
	
	/**
	 * 内容表
	 */
	private static final String IBATIS_RMCONTENTINFO_INSERT_ = "RmContentInfo.insertRmContentInfo";
	private static final String IBATIS_RMCONTENTINFO_SELECT = "RmContentInfo.selectRmContentInfo";
	private static final String IBATIS_RMCONTENTINFO_UPDATE = "RmContentInfo.updateRmContentInfo";
	private static final String IBATIS_RMCONTENTINFO_DELETE = "RmContentInfo.deleteRmContentInfo";
	
	/**
	 * 内容详细表
	 */
	private static final String IBATIS_RMCONTENTDETAIL_INSERT = "RmContentdetailInfo.insertRmContentDetailInfo";
	private static final String IBATIS_RMCONTENTDETAIL_SELECT = "RmContentdetailInfo.selectRmContentDetailInfo";
	private static final String IBATIS_RMCONTENTDETAIL_SELECT_CONTENTDETAILSBYPRODID = "RmContentdetailInfo.selectContentDetailByProdId";
	private static final String IBATIS_RMCONTENTDETAIL_SELECT_CONTENTDETAILID = "RmContentdetailInfo.selectRmContentDetailId";
	private static final String IBATIS_RMCONTENTDETAIL_SELECT_CONTENTDETAILSBYEVENTIDANDMARKETCASEID = "RmContentdetailInfo.selectContentDetailByEventIdAndMarketCaseId";
	private static final String IBATIS_RMCONTENTDETAIL_UPDATE = "RmContentdetailInfo.updateRmContentDetailInfo";
	private static final String IBATIS_RMCONTENTDETAIL_DELETE = "RmContentdetailInfo.deleteRmContentdetailInfo";
	
	/**
	 * 触点商机表
	 */
	private static final String IBATIS_RMCHANNELBUSSINESSINFO_SELECT = "RmChannelBussinessInfo.selectRmChannelBussinessInfo";
	private static final String IBATIS_RMCHANNELBUSSINESSINFO_SELECT_CHANNELBUSSINESSBYREGIONCODE = "RmChannelBussinessInfo.selectRmChannelBussinessInfoByRegionCode";
	
	/**
	 * 渠道表
	 */
	private static final String IBATIS_RMCHANNELINFO_INSERT_ = "RmChannelInfo.insertRmChannelInfo";
	private static final String IBATIS_RMCHANNELINFO_SELECT = "RmChannelInfo.selectRmChannelInfo";
	private static final String IBATIS_RMCHANNELINFO_UPDATE = "RmChannelInfo.updateRmChannelInfo";
	
	/**
	 * 渠道展示表
	 */
	private static final String IBATIS_RMCHANNELSHOWINFO_DELETE = "RmChannelShowInfo.deleteRmChannelShowInfo";
	private static final String IBATIS_RMCHANNELSHOWINFO_INSERT = "RmChannelShowInfo.insertRmChannelShowInfo";
	private static final String IBATIS_RMCHANNELSHOWINFO_SELECT = "RmChannelShowInfo.selectRmChannelShowInfo";
	private static final String IBATIS_RMCHANNELSHOWINFO_UPDATE = "RmChannelShowInfo.updateRmChannelShowInfo";
	
	/**
	 * 渠道任务表
	 */
	private static final String IBATIS_RMCHANNELTASKINFO_INSERT = "RmChanneltaskInfo.insertRmChanneltaskInfo";
	private static final String IBATIS_RMCHANNELTASKINFO_SELECT_MARKETCASELIST = "RmChanneltaskInfo.selectMarketCaseList";
	private static final String IBATIS_RMCHANNELTASKINFO_SELECT_CUSTLIST = "RmChanneltaskInfo.selectCustList";
	private static final String IBATIS_RMCHANNELTASKINFO_SELECT_TASKCOUNTGROUPBYLOGINNO = "RmChanneltaskInfo.selectTaskCountGroupByLoginNo";
	private static final String IBATIS_RMCHANNELTASKINFO_SELECT_TASKLIST = "RmChanneltaskInfo.selectTaskList";
	private static final String IBATIS_RMCHANNELTASKINFO_SELECT_TASKLISTCONDITION = "RmChanneltaskInfo.selectTaskListCondition";
	private static final String IBATIS_RMCHANNELTASKINFO_SELECT_TASKLISTCOUNT = "RmChanneltaskInfo.selectChannelTaskCount";
	private static final String IBATIS_RMCHANNELTASKINFO_SELECT_WAITSENDCHANNELLIST = "RmChanneltaskInfo.selectWaitSendChannelTaskList";
	private static final String IBATIS_RMCHANNELTASKINFO_UPDATE = "RmChanneltaskInfo.updateChannelTask";
	private static final String IBATIS_RMCHANNELTASKINFO_UPDATE_STATUS = "RmChanneltaskInfo.updateTaskStatus";
	private static final String IBATIS_RMCHANNELTASKINFO_UPDATE_SERVICENO = "RmChanneltaskInfo.updateTaskServiceNo";
	
	/**
	 * 客户群属性表
	 */
	private static final String IBATIS_RMCUSTGROUPATTRIBUTEINFO_INSERT = "RmCustGroupAttributeInfo.insertRmCustgroupattributeInfo";
	private static final String IBATIS_RMCUSTGROUPATTRIBUTEINFO_SELECT = "RmCustGroupAttributeInfo.selectRmCustgroupattributeInfo";
	private static final String IBATIS_RMCUSTGROUPATTRIBUTEINFO_UPDATE = "RmCustGroupAttributeInfo.updateRmCustgroupattributeInfo";
	private static final String IBATIS_RMCUSTGROUPATTRIBUTEINFO_DELETE = "RmCustGroupAttributeInfo.deleteRmCustgroupattributeInfo";
	
	/**
	 * 目标客户群表
	 */
	private static final String IBATIS_RMCUSTGROUPINFO_DELETE = "RmCustgroupInfo.deleteRmCustgroupInfoById";
	private static final String IBATIS_RMCUSTGROUPINFO_INSERT = "RmCustgroupInfo.insertRmCustgroupInfo";
	private static final String IBATIS_RMCUSTGROUPINFO_SELECT = "RmCustgroupInfo.selectRmCustgroupInfo";
	private static final String IBATIS_RMCUSTGROUPINFO_UPDATE = "RmCustgroupInfo.updateRmCustgroupInfo";
	private static final String IBATIS_RMCUSTGROUPINFO_UPDATE_CUSTGROUPBYID = "RmCustgroupInfo.updateRmCustgroupInfoById";
	private static final String IBATIS_RMCUSTGROUPINFO_SELECT_WITHOUT_BLACK = "RmCustgroupInfo.selectRmCustgroupInfoWithoutBlack";
	
	/**
	 * 客户群处理记录表
	 */
	private static final String IBATIS_RMCUSTGROUPHANDLERECORDINFO_INSERT = "RmCustgrouphandlerecordInfo.insertRmCustgrouphandlerecordInfo";
	private static final String IBATIS_RMCUSTGROUPHANDLERECORDINFO_SELECT = "RmCustgrouphandlerecordInfo.selectRmCustgrouphandlerecordInfo";
	
	/**
	 * 作废
	 */
	private static final String IBATIS_RMCUSTGROUPFILEINFO_INSERT = "RmCustgroupfileInfo.insertRmCustgroupfileInfo";
	
	/**
	 * 客户群标签表
	 */
	private static final String IBATIS_RMCUSTGROUPLABELINFO_DELETE = "RmCustGroupLabelInfo.deleteRmCustgrouplabelInfo";
	private static final String IBATIS_RMCUSTGROUPLABELINFO_INSERT = "RmCustGroupLabelInfo.insertRmCustgrouplabelInfo";
	private static final String IBATIS_RMCUSTGROUPLABELINFO_SELECT = "RmCustGroupLabelInfo.selectRmCustGroupLabelInfo";
	private static final String IBATIS_RMCUSTGROUPLABELINFO_UPDATE = "RmCustGroupLabelInfo.updateRmCustGroupLabelInfo";
	
	/**
	 * 客户群优先级表
	 */
	private static final String IBATIS_RMCUSTGROUPPRIORITYINFO_SELECT = "RmCustGroupPriorityInfo.selectRmCustGroupPriorityInfo";
	private static final String IBATIS_RMCUSTGROUPPRIORITYINFO_DELETE = "RmCustGroupPriorityInfo.deleteRmCustGroupPriorityInfo";
	private static final String IBATIS_RMCUSTGROUPPRIORITYINFO_INSERT = "RmCustGroupPriorityInfo.insertRmCustGroupPriorityInfo";
	
	/**
	 * 码表
	 */
	private static final String IBATIS_CODENAME_SELECT = "RmCodenameDict.selectRmCodeNameDict";
	private static final String IBATIS_RMCODENAMEDICT_SELECT_ = "RmCodenameDict.selectRmCodeNameDictInfo";
	private static final String IBATIS_RMCODENAMEDICT_DELETE = "RmCodenameDict.deleteRmCodeNameDict";
	private static final String IBATIS_RMCODENAMEDICT_INSERT = "RmCodenameDict.insertRmCodeNameDictInfo";
	private static final String IBATIS_RMCODENAMEDICT_UPDATE = "RmCodenameDict.updateRmCodeNameDictInfo";
	
	/**
	 * 异网号码池表
	 */
	private static final String IBATIS_RMDIFFERENTNETPHONEPOOLINFO_INSERT = "RmDifferentnetphonepoolInfo.insertRmDifferentNetPhonePoolInfo";
	private static final String IBATIS_RMDIFFERENTNETPHONEPOOLINFO_DELETE = "RmDifferentnetphonepoolInfo.deleteRmDifferentNetPhonePoolInfo";
	private static final String IBATIS_RMDIFFERENTNETPHONEPOOLINFO_SELECT = "RmDifferentnetphonepoolInfo.selectRmDifferentNetPhonePoolInfo";
	private static final String IBATIS_RMDIFFERENTNETPHONEPOOLINFO_UPDATE = "RmDifferentnetphonepoolInfo.updateRmDifferentNetPhonePoolInfo";
	
	/**
	 * dual
	 */
	private static final String IBATIS_DUAL_SELECT_SYSTIMEFROMORACLE = "DataBaseInfo.selectSysTimeFromOracle";
	private static final String IBATIS_DUAL_SELECT_SYSTIMEFROMMYSQL = "DataBaseInfo.selectSysTimeFromMysql";
	
	/**
	 * 事件详细表
	 */
	private static final String IBATIS_RMEVENTDETAILINFO_INSERT = "RmEventdetailInfo.insertRmEventdetailInfo";
	private static final String IBATIS_RMEVENTDETAILINFO_SELECT = "RmEventdetailInfo.selectRmEventdetailInfo";		
	private static final String IBATIS_RMEVENTDETAILINFO_UPDATE = "RmEventdetailInfo.updateRmEventdetailInfo";	
	private static final String IBATIS_RMEVENTDETAILINFO_DELETE = "RmEventdetailInfo.deleteRmEventdetailInfo";	
	private static final String IBATIS_RMEVENTDETAILINFO_SELECT_EVENTDETAILID = "RmEventdetailInfo.selectRmEventdetailId";
	
	/**
	 * 事件表
	 */
	private static final String IBATIS_RMEVENTINFO_INSERT = "RmEventInfo.insertRmEventInfo";
	private static final String IBATIS_RMEVENTINFO_SELECT = "RmEventInfo.selectRmEventInfo";
	private static final String IBATIS_RMEVENTINFO_SELECT_PAYFEEEVENTID = "RmEventInfo.selectPayFeeEventId";
	private static final String IBATIS_RMEVENTINFO_UPDATE = "RmEventInfo.updateRmEventInfo";
	private static final String IBATIS_RMEVENTINFO_DELETE = "RmEventInfo.deleteRmEventInfo";
	
	/**
	 * 灰名单表
	 */
	private static final String IBATIS_RMGREYINFO_INSERT = "RmGreyInfo.insertRmGreyInfo";																
	private static final String IBATIS_RMGREYINFO_SELECT = "RmGreyInfo.selectRmGreyDetailInfo";
	private static final String IBATIS_RMGREYINFO_DELETE = "RmGreyInfo.deleteRmGreyInfo";
	private static final String IBATIS_RMGREYINFO_UPDATE = "RmGreyInfo.updateRmGreyInfo";
	
	/**
	 * 清单表
	 */
	private static final String IBATIS_RMINVENTORYINFO_INSERT = "RmInventoryInfo.insertRmInventoryInfo";																
	private static final String IBATIS_RMINVENTORYINFO_SELECT = "RmInventoryInfo.selectRmInventoryInfo";
	private static final String IBATIS_RMINVENTORYINFO_DELETE = "RmInventoryInfo.deleteRmInventoryInfo";
	private static final String IBATIS_RMINVENTORYINFO_UPDATE = "RmInventoryInfo.updateRmInventoryInfo";
	
	
	/**
	 * 工号表
	 */
	private static final String IBATIS_RMLOGINUSERINFO_SELECT = "RmLoginmsgInfo.selectRmLoginMsgInfo";
	private static final String IBATIS_RMLOGINUSERINFO_SELECT_LOGINUSERBYID = "RmLoginmsgInfo.selectRmLoginMsgInfoById";
	private static final String IBATIS_RMLOGINUSERINFO_UPDATE = "RmLoginmsgInfo.updateRmLoginUserInfo";
	private static final String IBATIS_RMLOGINMSGINFO_INSERT="RmLoginmsgInfo.insertRmLoginUserInfo";
	
	/**
	 * 营销案属性表
	 */
	private static final String IBATIS_RMMARKETCASEATTRIBUTEINFO_DELETE = "RmMarketCaseAttributeInfo.deleteRmMarketcaseattributeInfoById";
	private static final String IBATIS_RMMARKETCASEATTRIBUTEINFO_INSERT = "RmMarketCaseAttributeInfo.insertRmMarketcaseattributeInfo";
	private static final String IBATIS_RMMARKETCASEATTRIBUTEINFO_UPDATE = "RmMarketCaseAttributeInfo.updateRmMarketcaseattributeInfo";
	
	/**
	 * 营销案表
	 */
	private static final String IBATIS_RMMARKETCASEINFO_SELECT_MARKETCASEID = "RmMarketcaseInfo.selectMarketCaseId";
	private static final String IBATIS_RMMARKETCASEINFO_SELECT_BATCHPUSHMARKETCASEANDCUSTGROUP = "RmMarketcaseInfo.selectBatchPushMarketCaseAndCustGroup";
	private static final String IBATIS_RMMARKETCASEINFO_SELECT_MARKETCASERELCUSTGROUPTYPEANDFORMULA = "RmMarketcaseInfo.selectMarketcaseRelCustGroupTypeAndFormula";
	private static final String IBATIS_RMMARKETCASEINFO_SELECT_MARKETCASERELCALLTASKCUSTGROUPTYPEANDFORMULA = "RmMarketcaseInfo.selectMarketcaseRelCallTaskCustGroupTypeAndFormula";
	private static final String IBATIS_RMMARKETCASEINFO_SELECT_EXECUTEMARKETCASE = "RmMarketcaseInfo.selectExecuteMarketCase";
	private static final String IBATIS_RMMARKETCASEINFO_SELECT_TARGETCUSTCOUNT = "RmMarketcaseInfo.selectTargetCustCount";
	private static final String IBATIS_RMMARKETCASEINFO_SELECT_CHANNELTRIGGERMARKETCASE = "RmMarketcaseInfo.selectChannelTriggerMarketCase";
	private static final String IBATIS_RMMARKETCASEINFO_SELECT_MARKETCASEANDWHOLERULEDETAIL = "RmMarketcaseInfo.selectMarketCaseAndWholeRuleDetail";	
	private static final String IBATIS_RMMARKETCASEINFO_SELECT_EVENTTRIGGERMARKETCASE = "RmMarketcaseInfo.selectEventTriggerMarketCase";
	private static final String IBATIS_RMMARKETCASEINFO_INSERT = "RmMarketcaseInfo.insertRmMarketcaseInfo";
	private static final String IBATIS_RMMARKETCASEINFO_DELETE = "RmMarketcaseInfo.deleteRmMarketcaseInfoById";
	private static final String IBATIS_RMMARKETCASEINFO_SELECT = "RmMarketcaseInfo.selectRmMarketcaseInfo";
	private static final String IBATIS_RMMARKETCASEINFO_SELECT_BYID = "RmMarketcaseInfo.selectRmMarketcaseInfoById";
	private static final String IBATIS_RMMARKETCASEINFO_UPDATE = "RmMarketcaseInfo.updateRmMarketcaseInfo";
    private static final String IBATIS_RMMARKETCASEINFO_SELECT_RMMARKETCASECOUNT = "RmMarketcaseInfo.selectRmMarketCaseCount";
	private static final String IBATIS_RMMARKETCASEINFO_SELECT_RMMARKETCASENUM = "RmMarketcaseInfo.selectRmMarketCaseNum";
	
	/**
	 * 营销案商机表
	 */
	private static final String IBATIS_RMMARKETCASEBUSSINESSINFO_SELECT = "RmMarketCaseBussinessInfo.selectRmMarketCaseBussinessInfo";
	private static final String IBATIS_RMMARKETCASEBUSSINESSINFO_SELECT_MARKETCASEBUSSINESSBYREGIONCODE = "RmMarketCaseBussinessInfo.selectRmMarketCaseBussinessInfoByRegionCode";
	
	/**
	 * 营销案订购统计表
	 */
	private static final String IBATIS_RMMARKETCASEORDERREPORTINFO_SELECT_MARKETCASEORDERREPORTBYTHREE = "RmMarketCaseOrderReportInfo.selectRmMarketCaseOrderReportInfoByThree";
	private static final String IBATIS_RMMARKETCASEORDERREPORTINFO_SELECT_MARKETCASEORDERREPORTBYSEVEN = "RmMarketCaseOrderReportInfo.selectRmMarketCaseOrderReportInfoBySeven";
	private static final String IBATIS_RMMARKETCASEORDERREPORTINFO_SELECT_MARKETCASEORDERREPORTBYFIFTH = "RmMarketCaseOrderReportInfo.selectRmMarketCaseOrderReportInfoByFifth";
	private static final String IBATIS_RMMARKETCASEORDERREPORTINFO_SELECT_MARKETCASEORDERREPORT = "RmMarketCaseOrderReportInfo.selectRmMarketCaseOrderReportInfo";
	private static final String IBATIS_RMMARKETCASEORDERREPORTINFO_SELECT_CHANNELMARKETCASEORDERREPORT = "RmMarketCaseOrderReportInfo.selectChannelMarketCaseOrderReportInfo";
	private static final String IBATIS_RMMARKETCASEORDERREPORTINFO_SELECT_MARKETCASEORDERREPORTSENDNUM = "RmMarketCaseOrderReportInfo.selectMarketCaseOrderReportSendNum";
	private static final String IBATIS_RMMARKETCASEORDERREPORTINFO_INSERT_MARKETCASEORDERREPORT = "RmMarketCaseOrderReportInfo.insertRmMarketCaseOrderReportInfo";
	
	/**
	 * 菜单表
	 */
	private static final String IBATIS_RMMENUINFO_DELETE_ = "RmMenuInfo.deleteRmMenuInfo";
	private static final String IBATIS_RMMENUINFO_INSERT = "RmMenuInfo.insertRmMenuInfo";
	private static final String IBATIS_RMMENUINFO_SELECT = "RmMenuInfo.selectRmMenuInfo";
	private static final String IBATIS_RMMENUINFO_SELECT_MENUBYID = "RmMenuInfo.selectRmMenuInfoById";
	private static final String IBATIS_RMMENUINFO_UPDATE = "RmMenuInfo.updateRmMenuInfo";
	private static final String IBATIS_RMMENUINFO_SELECT_MENUBYLOGINNO = "RmMenuInfo.selectRmMenuInfoByLoginNo";
	
	private static final String IBATIS_RMMESSAGETRIGGERLOGINFO_INSERT = "RmMessageTriggerLogInfo.insertRmMessageTriggerLogInfo";
	private static final String IBATIS_RMMESSAGETRIGGERLOGINFO_SELECT = "RmMessageTriggerLogInfo.selectRmMessageTriggerLogInfoById";
	
	
	/**
	 * 监控告警表
	 */
	private static final String IBATIS_RMMONITORWARNINGINFO_DELETE = "RmMonitorWarningInfo.deleteRmMonitorWarningInfo";
	private static final String IBATIS_RMMONITORWARNINGINFO_INSERT = "RmMonitorWarningInfo.insertRmMonitorWarningInfo";
	private static final String IBATIS_RMMONITORWARNINGINFO_SELECT = "RmMonitorWarningInfo.selectRmMonitorWarningInfo";
	
	/**
	 * 操作日志表
	 */
	private static final String IBATIS_RMOPERLOGINFO_SELECT = "RmOperlogInfo.selectRmOperlogInfo";
	
	/**
	 * 运营位表
	 */
	private static final String IBATIS_RMPOSITIONINFO_INSERT_ = "RmPositionInfo.insertRmPositionInfo";
	private static final String IBATIS_RMPOSITIONINFO_SELECT = "RmPositionInfo.selectRmPositionInfo";
	private static final String IBATIS_RMPOSITIONINFO_UPDATE = "RmPositionInfo.updateRmPositionInfo";
	private static final String IBATIS_RMPOSITIONINFO_DELETE = "RmPositionInfo.deleteRmPositionInfo";
	
	/**
	 * 产商品表
	 */
	private static final String IBATIS_RMPRODUCTCOMMODITYINFO_SELECT = "RmProductcommodityInfo.selectRmProductCommodityInfo";
	private static final String IBATIS_RMPRODUCTCOMMODITYINFO_SELECT_COUNT = "RmProductcommodityInfo.selectRmProductCommodityInfoCount";
	/**
	 * 产商品通用信息报表
	 */
	private static final String IBATIS_RMPRODUCTCOMMODITYREPORTINFO_SELECT = "RmProductCommodityReportInfo.selectRmProductCommodityReportInfo";
	private static final String IBATIS_RMPRODUCTCOMMODITYREPORTINFO_INSERT = "RmProductCommodityReportInfo.insertRmProductCommodityReportInfo";
	private static final String IBATIS_RMPRODUCTCOMMODITYREPORTINFO_SELECT_COUNT = "RmProductCommodityReportInfo.selectRmProductCommodityReportInfoCount";
	private static final String IBATIS_RMPRODUCTCOMMODITYREPORTINFO_SELECT_PROVINCE = "RmProductCommodityReportInfo.selectRmProductCommodityReportInfoByProvince";
	/**
	 * 产品表
	 */
	private static final String IBATIS_RMPRODUCTDICT_SELECT = "RmProductDict.selectRmProductDict";
	
	/**
	 * 关系表
	 */
	private static final String IBATIS_RMRELATIONREL_INSERT = "RmRelationRel.insertRmRelationRel";
	private static final String IBATIS_RMRELATIONREL_SELECT = "RmRelationRel.selectRmRelationRel";
	private static final String IBATIS_RMRELATIONREL_SELECT_CUSTGROUPREL = "RmRelationRel.selectRmCustGroupRelation";
	private static final String IBATIS_RMRELATIONREL_SELECT_MARKETCASEREL = "RmRelationRel.selectRmMarketCaseRelation";
	private static final String IBATIS_RMRELATIONREL_SELECT_MARKETCASERELBYCHANNELREL = "RmRelationRel.selectRmMarketCaseRelationByChannelRel";
	private static final String IBATIS_RMRELATIONREL_SELECT_MARKETCASERELBYRULEID = "RmRelationRel.selectRmMarketCaseRelationByRuleId";
	private static final String IBATIS_RMRELATIONREL_UPDATE = "RmRelationRel.updateRmRelationRel";
	private static final String IBATIS_RMRELATIONREL_DELETE = "RmRelationRel.deleteRmRelationRel";
	
	/**
	 * 角色表
	 */
	private static final String IBATIS_RMROLEINFO_DELETE = "RmRoleInfo.deleteRmRoleInfo";
	private static final String IBATIS_RMROLEINFO_INSERT = "RmRoleInfo.insertRmRoleInfo";
	private static final String IBATIS_RMROLEINFO_SELECT = "RmRoleInfo.selectRmRoleInfo";
	private static final String IBATIS_RMROLEINFO_UPDATE = "RmRoleInfo.updateRmRoleInfo";
	private static final String IBATIS_RMROLEINFO_SELECT_ROLEDETAIL = "RmRoleInfo.selectRmRoleInfoByLoginNo";
	private static final String IBATIS_RMROLEINFO_SELECT_NOTHASROLE = "RmRoleInfo.selectRmRoleInfoByLoginNumber";
	
	/**
	 * 角色菜单关系表
	 */
	private static final String IBATIS_RMROLEMENUREL_INSERT = "RmRolemenuRel.insertRmRoleMenuRel";
	private static final String IBATIS_RMROLEMENUREL_SELECT = "RmRolemenuRel.selectRmRoleMenuRel";
	private static final String IBATIS_RMROLEMENUREL_DELETE = "RmRolemenuRel.deleteRmRoleMenuRel";
	
	/**
	 * 角色用户关系表
	 */
	private static final String IBATIS_RMROLEUSERREL_INSERT = "RmRoleuserRel.insertRmRoleUserRel";
	private static final String IBATIS_RMROLEUSERREL_SELECT = "RmRoleuserRel.selectRmRoleUserRel";
	private static final String IBATIS_RMROLEUSERREL_DELETE = "RmRoleuserRel.deleteRmRoleUserRel";
	
	/**
	 * 规则表
	 */
	private static final String IBATIS_RMRULEINFO_INSERT_ = "RmRuleInfo.insertRmRuleInfo";
	private static final String IBATIS_RMRULEINFO_SELECT = "RmRuleInfo.selectRmRuleInfo";
	private static final String IBATIS_RMRULEINFO_SELECT_LIST = "RmRuleInfo.selectRmRuleInfoList";
	private static final String IBATIS_RMRULEINFO_UPDATE = "RmRuleInfo.updateRmRuleInfo";
	private static final String IBATIS_RMRULEINFO_DELETE = "RmRuleInfo.deleteRmRuleInfo";
	
	/**
	 * 规则详细表
	 */
	private static final String IBATIS_RMRULEDETAILINFO_INSERT = "RmRuledetailInfo.insertRmRuledetailInfo";
	private static final String IBATIS_RMRULEDETAILINFO_SELECT = "RmRuledetailInfo.selectRmRuledetailInfo";
	private static final String IBATIS_RMRULEDETAILINFO_SELECT_RULEDETAILID = "RmRuledetailInfo.selectRmRuledetailId";
	private static final String IBATIS_RMRULEDETAILINFO_SELECT_SELECTWHOLERULEDETAILBYMARKETCASEID = "RmRuledetailInfo.selectWholeRuleDetailByMarketCaseId";
	private static final String IBATIS_RMRULEDETAILINFO_SELECT_SELECTRULEDETAILBATCHNOBYID = "RmRuledetailInfo.selectRuleDetailBatchNoById";
	private static final String IBATIS_RMRULEDETAILINFO_SELECT_SELECTRULEDETAILBYPARENTCOMPONENTID = "RmRuledetailInfo.selectRuleDetailByParentComponentId";
	private static final String IBATIS_RMRULEDETAILINFO_SELECT_SELECTMARKETCASEANDRULELIST = "RmRuledetailInfo.selectMarketCaseAndRuleList";
	private static final String IBATIS_RMRULEDETAILINFO_SELECT_RULEDETAILSBYEVENTIDANDMARKETCASEID = "RmRuledetailInfo.selectRuleDetailByEventIdAndMarketCaseId";
	private static final String IBATIS_RMRULEDETAILINFO_UPDATE = "RmRuledetailInfo.updateRmRuledetailInfo";
	private static final String IBATIS_RMRULEDETAILINFO_DELETE = "RmRuledetailInfo.deleteRmRuledetailInfo";
	private static final String IBATIS_RMRULEDETAILINFO_SELECT_RULEDETAILBYMARKETCASEID = "RmRuledetailInfo.selectRuledetailInfoByMarketCaseId";
	
	/**
	 * 服务监控表
	 */
	private static final String IBATIS_RMSERVICEMONITORINGINFO_INSERT = "RmServicemonitoringInfo.insertRmServicemonitoringInfo";
	private static final String IBATIS_RMSERVICEMONITORINGINFO_SELECT = "RmServicemonitoringInfo.selectRmServicemonitoringInfo";

	/**
	 * 
	 */
	private static final String IBATIS_RMWAITSENDTASKCONTROLINFO_INSERT = "RmWaitSendTaskControlInfo.insertRmWaitSendTaskControlInfo";
	private static final String IBATIS_RMWAITSENDTASKCONTROLINFO_SELECT = "RmWaitSendTaskControlInfo.selectRmWaitSendTaskControlInfoBySendTime";	
	
	/**
	 * 短信表
	 */
	private static final String IBATIS_RMMSGACCESSCODESERINFO_DELETE = "RmMsgaccesscodeserInfo.deleteRmMsgAccessCodeSerInfo";
	private static final String IBATIS_RMMSGACCESSCODESERINFO_INSERT = "RmMsgaccesscodeserInfo.insertRmMsgAccessCodeSerInfo";
	private static final String IBATIS_RMMSGACCESSCODESERINFO_SELECT = "RmMsgaccesscodeserInfo.selectRmMsgAccessCodeSerInfo";
	private static final String IBATIS_RMMSGACCESSCODESERINFO_UPDATE = "RmMsgaccesscodeserInfo.updateRmMsgAccessCodeSerInfo";
	private static final String IBATIS_RMMSGACCESSCODESERINFO_SELECT_MSGACCESSCODESERDETAIL = "RmMsgaccesscodeserInfo.selectRmMsgAccessCodeSerInfoByLoginNo";
	private static final String IBATIS_RMMSGACCESSCODESERINFO_SELECT_MSGACCESSCODESERNOTHAS = "RmMsgaccesscodeserInfo.selectRmMsgAccessCodeSerInfoByLoginNumber";
	
	/**
	 * 公告表
	 */
	private static final String IBATIS_RMNOTICEINFO_SELECT="RmNoticeInfo.selectRmNoticeInfo";
	private static final String IBATIS_RMNOTICEINFO_INSERT="RmNoticeInfo.insertRmNoticeInfo";
	private static final String IBATIS_RMNOTICEINFO_DELETE="RmNoticeInfo.removeRmNoticeInfo";
	private static final String IBATIS_RMNOTICEINFO_UPDATE="RmNoticeInfo.updateRmNoticeInfo";



	/**
	 * 短信推送流量表
	 */
	private static final String IBATIS_SHORTMSGMOVETRAFFICINFO_SELECT_BYDATE_ = "RmShortMsgMoveTrafficInfo.selectRmShortMsgMoveTrafficInfoByDate";
	private static final String IBATIS_SHORTMSGMOVETRAFFICINFO_SELECT_BYMARKETCASEID_ = "RmShortMsgMoveTrafficInfo.selectRmShortMsgMoveTrafficInfoByMarketCaseId";
	
	/**
	 * 调查问卷
	 */
	private static final String IBATIS_RMQUESTIONNAIREINFO_INSERT = "RmQuestionNaireInfo.insertRmQuestionNaireInfo";
	private static final String IBATIS_RMQUESTIONNAIREINFO_SELECT = "RmQuestionNaireInfo.selectRmQuestionNaireInfoById";
	private static final String IBATIS_RMQUESTIONNAIREINFO_SELECT_QUESTIONNAIRELIST = "RmQuestionNaireInfo.selectRmQuestionNaireList";
	private static final String IBATIS_RMQUESTIONNAIREINFO_SELECT_MARKETCASEANDCONTENTLIST = "RmQuestionNaireInfo.selectMarketCaseAndContentList";
	private static final String IBATIS_RMQUESTIONNAIREINFO_UPDATE = "RmQuestionNaireInfo.updateRmQuestionNaireInfo";
	
	/**
	 *  shell进程执行信息表
	 */
	private static final String IBATIS_SHELLPROCESSEXECUTEINFO_INSERT = "RmShellprocessexecuteInfo.insertRmShellprocessexecuteInfo";
	private static final String IBATIS_SHELLPROCESSEXECUTEINFO_UPDATE = "RmShellprocessexecuteInfo.updateRmShellprocessexecuteInfo";
	private static final String IBATIS_SHELLPROCESSEXECUTEINFO_SELECT = "RmShellprocessexecuteInfo.selectRmShellprocessexecuteInfo";
	private static final String IBATIS_SHELLPROCESSEXECUTEINFO_SELECTTODAY = "RmShellprocessexecuteInfo.selectTodayData";
	
	/**
	 * 调配信息表
	 */
	private static final String IBATIS_RMTASKADJUSTINFO_INSERT = "RmTaskadjustInfo.insertRmTaskadjustInfo";
	private static final String IBATIS_RMTASKADJUSTINFO_UPDATE = "RmTaskadjustInfo.updateRmTaskadjustInfo";
	private static final String IBATIS_RMTASKADJUSTINFO_SELECT = "RmTaskadjustInfo.selectRmTaskadjustInfo";
	private static final String IBATIS_RMTASKADJUSTINFO_SELECT_BYPARAM = "RmTaskadjustInfo.selectRmTaskadjustInfoParam";
	private static final String IBATIS_RMTASKADJUSTINFO_DELETE = "RmTaskadjustInfo.deleteRmTaskadjustInfo";
	
	/**
	 * 模板信息表
	 */
	private static final String IBATIS_RMTEMPLATEINFO_INSERT = "RmTemplateInfo.insertRmTemplateInfo";
	private static final String IBATIS_RMTEMPLATEINFO_UPDATE = "RmTemplateInfo.updateRmTemplateInfo";
	private static final String IBATIS_RMTEMPLATEINFO_SELECT = "RmTemplateInfo.selectRmTemplateInfo";
	private static final String IBATIS_RMTEMPLATEINFO_DELETE = "RmTemplateInfo.deleteRmTemplateInfo";
	
	/**
	 * 测试表
	 */
	private static final String IBATIS_TESTTABLE_INSERT = "TestTable.insertValueTest";
	
	/**
	 * 接触量表
	 */
	private static final String IBATIS_RMTOUCHCOUNTINFO_SELECT = "RmTouchCountInfo.selectRmTouchCountInfo";
	private static final String IBATIS_RMTOUCHCOUNTINFO_SELECT_BYREGIONCODE = "RmTouchCountInfo.selectRmTouchCountInfoByRegionCode";
	private static final String IBATIS_RMTOUCHCOUNTINFO_SELECT_CONVERTRATE = "RmTouchCountInfo.selectRmTouchCountInfoConvertRate"; 
	
	/**
	 * 用户临时标签表
	 */
	private static final String IBATIS_RMUSERLABELTMP_SELECT = "RmUserlabelTmp.selectRmUserLabelTmp";
	private static final String IBATIS_RMUSERLABELTMP_INSERT = "RmUserlabelTmp.insertRmUserLabelTmp";
	private static final String IBATIS_RMUSERLABELTMP_DELETE = "RmUserlabelTmp.deleteRmUserLabelTmp";
	private static final String IBATIS_RMUSERLABELTMP_UPDATE = "RmUserlabelTmp.updateRmUserLabelTmp";
	
	/**
	 * 标签码表
	 */
	private static final String IBATIS_RMLABELCODENAMEDICT_SELECT = "RmLabelCodeNameDict.selectRmLabelCodeNameDict";
	
	/**
	 * 用户标签表(吉林)
	 */
	private static final String IBATIS_RMLABELARCHIVESTMP_SELECT = "RmlabelArchivesTmp.selectRmlabelArchivesTmp";
	
	/**
	 * 用户信息表
	 */
	private static final String IBATIS_RMUSERINFO_SELECT = "RmUserInfo.selectRmUserInfo";
	
	/**
	 * 用户推荐表
	 */
	private static final String IBATIS_RMRECOMMENDRECORDINFO_SELECT="RmRecommendRecordInfo.selectRmRecommendRecordInfo";
	
	/**
	 * 用户回单反馈表
	 */
	private static final String IBATIS_RMRECEIPTRECORDINFO_SELECT="RmReceiptRecordInfo.selectRmReceiptRecordInfo";
	
	/**
	 * 作业配置表
	 */
	private static final String IBATIS_RMWORKCONFIGINFO_DELETE = "RmWorkconfigInfo.deleteRmWorkConfigInfo";
	private static final String IBATIS_RMWORKCONFIGINFO_INSERT = "RmWorkconfigInfo.insertRmWorkConfigInfo";
	private static final String IBATIS_RMWORKCONFIGINFO_SELECT = "RmWorkconfigInfo.selectRmWorkConfigInfo";
	private static final String IBATIS_RMWORKCONFIGINFO_UPDATE = "RmWorkconfigInfo.updateRmWorkConfigInfo";
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmactdemandinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmactdemandinfoDelete() {
		return IBATIS_RMACTDEMANDINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmactdemandinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmactdemandinfoInsert() {
		return IBATIS_RMACTDEMANDINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmactdemandinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmactdemandinfoSelect() {
		return IBATIS_RMACTDEMANDINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmactdemandinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmactdemandinfoUpdate() {
		return IBATIS_RMACTDEMANDINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmattachinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmattachinfoInsert() {
		return IBATIS_RMATTACHINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmattachinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmattachinfoSelect() {
		return IBATIS_RMATTACHINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmattachinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmattachinfoDelete() {
		return IBATIS_RMATTACHINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmattributeinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmattributeinfoInsert() {
		return IBATIS_RMATTRIBUTEINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmattributeinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmattributeinfoSelect() {
		return IBATIS_RMATTRIBUTEINFO_SELECT_;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmattributeinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmattributeinfoUpdate() {
		return IBATIS_RMATTRIBUTEINFO_UPDATE_;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmattributeinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmattributeinfoDelete() {
		return IBATIS_RMATTRIBUTEINFO_DELETE_;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmareapriorityinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmareapriorityinfoDelete() {
		return IBATIS_RMAREAPRIORITYINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmareapriorityinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmareapriorityinfoInsert() {
		return IBATIS_RMAREAPRIORITYINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmareapriorityinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmareapriorityinfoSelect() {
		return IBATIS_RMAREAPRIORITYINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2017-2-26 
	* @author: sunyuan
	* @title: getIbatisRmareapriorityinfoByMarketCaseIdSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmareapriorityinfoByMarketCaseIdSelect() {
		return IBATIS_RMAREAPRIORITYINFO_SELECT_BYMARKETCASEID;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmareapriorityinfoSelectRel 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmareapriorityinfoSelectRel() {
		return IBATIS_RMAREAPRIORITYINFO_SELECT_REL;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmauditrecordinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmauditrecordinfoInsert() {
		return IBATIS_RMAUDITRECORDINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmauditrecordinfoSelectMarketcaseauditrecord 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmauditrecordinfoSelectMarketcaseauditrecord() {
		return IBATIS_RMAUDITRECORDINFO_SELECT_MARKETCASEAUDITRECORD;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmauditrecordinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmauditrecordinfoUpdate() {
		return IBATIS_RMAUDITRECORDINFO_UPDATE_;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmauditrecordinfoSelectAuditrecorddetaillist 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmauditrecordinfoSelectAuditrecorddetaillist() {
		return IBATIS_RMAUDITRECORDINFO_SELECT_AUDITRECORDDETAILLIST;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmauditrecordinfoSelectMarketcaseauditnum 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmauditrecordinfoSelectMarketcaseauditnum() {
		return IBATIS_RMAUDITRECORDINFO_SELECT_MARKETCASEAUDITNUM;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmauditinventoryinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmauditinventoryinfoSelect() {
		return IBATIS_RMAUDITINVENTORYINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmauditnoinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmauditnoinfoInsert() {
		return IBATIS_RMAUDITNOINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmauditnoinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmauditnoinfoSelect() {
		return IBATIS_RMAUDITNOINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmauditnoinfoSelectBusiauditno 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmauditnoinfoSelectBusiauditno() {
		return IBATIS_RMAUDITNOINFO_SELECT_BUSIAUDITNO;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmauditnoinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmauditnoinfoUpdate() {
		return IBATIS_RMAUDITNOINFO_UPDATE;
	}
	
    /**
     * 
    * @date: 2017-3-15 
    * @author: tangaq
    * @title: getIbatisRmbatchpushsuccSelect 
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	@Override
    public String getIbatisRmbatchpushsuccSelect(){
		return IBATIS_RMBATCHPUSHSUCC_SELECT;
	}
	
	/**
	 * 
	* @date: 2017-3-15 
	* @author: tangaq
	* @title: getIbatisRmbatchpushexcepSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
    public String getIbatisRmbatchpushexcepSelect(){
		return IBATIS_RMBATCHPUSHEXCEP_SELECT;
	}
	
	/**
	 * 
	* @date: 2017-3-15 
	* @author: tangaq
	* @title: getIbatisRmbatchpushwaitsendSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
    public String getIbatisRmbatchpushwaitsendSelect(){
		return IBATIS_RMBATCHPUSHWAIT_SELECT;
	}
	
	/**
	 * 
	* @date: 2017-3-15 
	* @author: tangaq
	* @title: getIbatisRmbatchpushTaskSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
    public String getIbatisRmbatchpushTaskSelect(){
		return IBATIS_RMBATCHPUSHTASK_SELECT;
	}
	
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmauditnoinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmauditnoinfoDelete() {
		return IBATIS_RMAUDITNOINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcontentinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcontentinfoInsert() {
		return IBATIS_RMCONTENTINFO_INSERT_;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcontentinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcontentinfoSelect() {
		return IBATIS_RMCONTENTINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcontentinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcontentinfoUpdate() {
		return IBATIS_RMCONTENTINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcontentinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcontentinfoDelete() {
		return IBATIS_RMCONTENTINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcontentdetailInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcontentdetailInsert() {
		return IBATIS_RMCONTENTDETAIL_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcontentdetailSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcontentdetailSelect() {
		return IBATIS_RMCONTENTDETAIL_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcontentdetailSelectContentdetailid 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcontentdetailSelectContentdetailid() {
		return IBATIS_RMCONTENTDETAIL_SELECT_CONTENTDETAILID;
	}
	
	/**
	 * 
	* @date: 2017-4-3 
	* @author: sunyuan
	* @title: getIbatisRmcontentdetailSelectContentDetailsByProdId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcontentdetailSelectContentDetailsByProdId(){
		return IBATIS_RMCONTENTDETAIL_SELECT_CONTENTDETAILSBYPRODID;
	}
	
	/**
	 * 
	* @date: 2017-3-8 
	* @author: sunliang 
	* @title: getIbatisRmcontentdetailSelectContentDetailsByEventIdAndMarketCaseId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcontentdetailSelectContentDetailsByEventIdAndMarketCaseId() {
		return IBATIS_RMCONTENTDETAIL_SELECT_CONTENTDETAILSBYEVENTIDANDMARKETCASEID;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcontentdetailUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcontentdetailUpdate() {
		return IBATIS_RMCONTENTDETAIL_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcontentdetailDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcontentdetailDelete() {
		return IBATIS_RMCONTENTDETAIL_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchannelbussinessinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchannelbussinessinfoSelect() {
		return IBATIS_RMCHANNELBUSSINESSINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchannelbussinessinfoSelectChannelbussinessbyregioncode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchannelbussinessinfoSelectChannelbussinessbyregioncode() {
		return IBATIS_RMCHANNELBUSSINESSINFO_SELECT_CHANNELBUSSINESSBYREGIONCODE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchannelinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchannelinfoInsert() {
		return IBATIS_RMCHANNELINFO_INSERT_;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchannelinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchannelinfoSelect() {
		return IBATIS_RMCHANNELINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchannelinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchannelinfoUpdate() {
		return IBATIS_RMCHANNELINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchannelshowinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchannelshowinfoDelete() {
		return IBATIS_RMCHANNELSHOWINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchannelshowinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchannelshowinfoInsert() {
		return IBATIS_RMCHANNELSHOWINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchannelshowinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchannelshowinfoSelect() {
		return IBATIS_RMCHANNELSHOWINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchannelshowinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchannelshowinfoUpdate() {
		return IBATIS_RMCHANNELSHOWINFO_UPDATE;
	}
	
	/** 
	* @date: 2017-2-27 
	* @author: wangpei
	* @title: getIbatisRmchanneltaskInfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public String getIbatisRmchanneltaskInfoInsert() {
		return IBATIS_RMCHANNELTASKINFO_INSERT;
	}
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchanneltaskinfoSelectMarketcaselist 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchanneltaskinfoSelectMarketcaselist() {
		return IBATIS_RMCHANNELTASKINFO_SELECT_MARKETCASELIST;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchanneltaskinfoSelectCustlist 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchanneltaskinfoSelectCustlist() {
		return IBATIS_RMCHANNELTASKINFO_SELECT_CUSTLIST;
	}
	
	/**
	 * 
	* @date: 2017-1-11 
	* @author: tangaq
	* @title: getbatisRmchanneltaskinfoSelectTaskCountGroupByLoginNo 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getbatisRmchanneltaskinfoSelectTaskCountGroupByLoginNo(){
		return IBATIS_RMCHANNELTASKINFO_SELECT_TASKCOUNTGROUPBYLOGINNO;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchanneltaskinfoSelectTasklist 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchanneltaskinfoSelectTasklist() {
		return IBATIS_RMCHANNELTASKINFO_SELECT_TASKLIST;
	}
	
	/**
	 * 
	* @date: 2017-1-5 
	* @author: zhangjj_crmpd
	* @title: getIbatisRmchanneltaskinfoSelectTasklistcondition 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchanneltaskinfoSelectTasklistcondition() {
		return IBATIS_RMCHANNELTASKINFO_SELECT_TASKLISTCONDITION;
	}

	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchanneltaskinfoSelectTasklistcount 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchanneltaskinfoSelectTasklistcount() {
		return IBATIS_RMCHANNELTASKINFO_SELECT_TASKLISTCOUNT;
	}
	
	/** 
	* @date: 2017-3-6 
	* @author: wangpei
	* @title: getIbatisRmchanneltaskinfoSelectWaitSendChannelTasklist 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public String getIbatisRmchanneltaskinfoSelectWaitSendChannelTasklist() {
		return IBATIS_RMCHANNELTASKINFO_SELECT_WAITSENDCHANNELLIST;
	}
	
	/** 
	* @date: 2017-3-6 
	* @author: wangpei
	* @title: getIbatisRmchanneltaskinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public String getIbatisRmchanneltaskinfoUpdate(){
		return IBATIS_RMCHANNELTASKINFO_UPDATE;
	}
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchanneltaskinfoUpdateStatus 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchanneltaskinfoUpdateStatus() {
		return IBATIS_RMCHANNELTASKINFO_UPDATE_STATUS;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmchanneltaskinfoUpdateServiceno 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmchanneltaskinfoUpdateServiceno() {
		return IBATIS_RMCHANNELTASKINFO_UPDATE_SERVICENO;
	}
	
	/**
	 * 
	* @date: 2017-2-10 
	* @author: wuJiaFu
	* @title: getIbatisRmcustgroupinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getIbatisRmcustgroupinfoDelete() {
		return IBATIS_RMCUSTGROUPINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2017-2-9 
	* @author: tangaq
	* @title: getIbatisRmcustgroupattributeinfoinsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgroupattributeinfoinsert(){
		return IBATIS_RMCUSTGROUPATTRIBUTEINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2017-3-6 
	* @author: tangaq
	* @title: getIbatisRmcustgroupattributeinfoselect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgroupattributeinfoselect(){
		return IBATIS_RMCUSTGROUPATTRIBUTEINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: getIbatisRmcustgroupattributeinfoupdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgroupattributeinfoupdate(){
		return IBATIS_RMCUSTGROUPATTRIBUTEINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2017-4-25 
	* @author: zhangzx_crmpd
	* @title: getIbatisRmcustgroupattributeinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgroupattributeinfoDelete() {
		return IBATIS_RMCUSTGROUPATTRIBUTEINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcustgroupinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgroupinfoInsert() {
		return IBATIS_RMCUSTGROUPINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcustgroupinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgroupinfoSelect() {
		return IBATIS_RMCUSTGROUPINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2017-4-17 
	* @author: songhui_crmpd
	* @title: getIbatisRmcustgroupinfoSelectWithOutBlack 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgroupinfoSelectWithOutBlack() {
		return IBATIS_RMCUSTGROUPINFO_SELECT_WITHOUT_BLACK;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcustgroupinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgroupinfoUpdate() {
		return IBATIS_RMCUSTGROUPINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcustgroupinfoUpdateCustgroupbyid 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgroupinfoUpdateCustgroupbyid() {
		return IBATIS_RMCUSTGROUPINFO_UPDATE_CUSTGROUPBYID;
	}
	
	@Override
	public String getIbatisRmcustgrouphandlerecordinfoInsert() {
		return IBATIS_RMCUSTGROUPHANDLERECORDINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: getIbatisRmcustgrouphandlerecordinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgrouphandlerecordinfoSelect() {
		return IBATIS_RMCUSTGROUPHANDLERECORDINFO_SELECT;
	}
	
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcustgroupfileinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgroupfileinfoInsert() {
		return IBATIS_RMCUSTGROUPFILEINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcustgrouplabelinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgrouplabelinfoDelete() {
		return IBATIS_RMCUSTGROUPLABELINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcustgrouplabelinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgrouplabelinfoInsert() {
		return IBATIS_RMCUSTGROUPLABELINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcustgrouplabelinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgrouplabelinfoSelect() {
		return IBATIS_RMCUSTGROUPLABELINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcustgrouplabelinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgrouplabelinfoUpdate() {
		return IBATIS_RMCUSTGROUPLABELINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcustgrouppriorityinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgrouppriorityinfoSelect() {
		return IBATIS_RMCUSTGROUPPRIORITYINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcustgrouppriorityinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgrouppriorityinfoDelete() {
		return IBATIS_RMCUSTGROUPPRIORITYINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcustgrouppriorityinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcustgrouppriorityinfoInsert() {
		return IBATIS_RMCUSTGROUPPRIORITYINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisCodenameSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisCodenameSelect() {
		return IBATIS_CODENAME_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcodenamedictSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcodenamedictSelect() {
		return IBATIS_RMCODENAMEDICT_SELECT_;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcodenamedictDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */	@Override
	public String getIbatisRmcodenamedictDelete() {
		return IBATIS_RMCODENAMEDICT_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcodenamedictInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override 
	public String getIbatisRmcodenamedictInsert() {
		return IBATIS_RMCODENAMEDICT_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmcodenamedictUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmcodenamedictUpdate() {
		return IBATIS_RMCODENAMEDICT_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmdifferentnetphonepoolinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmdifferentnetphonepoolinfoInsert() {
		return IBATIS_RMDIFFERENTNETPHONEPOOLINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmdifferentnetphonepoolinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmdifferentnetphonepoolinfoDelete() {
		return IBATIS_RMDIFFERENTNETPHONEPOOLINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmdifferentnetphonepoolinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmdifferentnetphonepoolinfoSelect() {
		return IBATIS_RMDIFFERENTNETPHONEPOOLINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmdifferentnetphonepoolinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmdifferentnetphonepoolinfoUpdate() {
		return IBATIS_RMDIFFERENTNETPHONEPOOLINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisDualSelectSystimefromoracle 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisDualSelectSystimefromoracle() {
		return IBATIS_DUAL_SELECT_SYSTIMEFROMORACLE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisDualSelectSystimefrommysql 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisDualSelectSystimefrommysql() {
		return IBATIS_DUAL_SELECT_SYSTIMEFROMMYSQL;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmeventdetailinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmeventdetailinfoInsert() {
		return IBATIS_RMEVENTDETAILINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmeventdetailinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmeventdetailinfoSelect() {
		return IBATIS_RMEVENTDETAILINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmeventdetailinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmeventdetailinfoUpdate() {
		return IBATIS_RMEVENTDETAILINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmeventdetailinfoSelectEventdetailid 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmeventdetailinfoSelectEventdetailid() {
		return IBATIS_RMEVENTDETAILINFO_SELECT_EVENTDETAILID;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmeventinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmeventinfoInsert() {
		return IBATIS_RMEVENTINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmeventinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmeventinfoSelect() {
		return IBATIS_RMEVENTINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: getIbatisRmeventinfoSelectPayFeeEventId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmeventinfoSelectPayFeeEventId() {
		return IBATIS_RMEVENTINFO_SELECT_PAYFEEEVENTID;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmeventinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmeventinfoUpdate() {
		return IBATIS_RMEVENTINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmgreyinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmgreyinfoInsert() {
		return IBATIS_RMGREYINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmgreyinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmgreyinfoSelect() {
		return IBATIS_RMGREYINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmgreyinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmgreyinfoDelete() {
		return IBATIS_RMGREYINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmgreyinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmgreyinfoUpdate() {
		return IBATIS_RMGREYINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: getIbatisRminventoryinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRminventoryinfoInsert() {
		return IBATIS_RMINVENTORYINFO_INSERT;
	}

	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: getIbatisRminventoryinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRminventoryinfoSelect() {
		return IBATIS_RMINVENTORYINFO_SELECT;
	}

	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: getIbatisRminventoryinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRminventoryinfoDelete() {
		return IBATIS_RMINVENTORYINFO_DELETE;
	}

	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: getIbatisRminventoryinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRminventoryinfoUpdate() {
		return IBATIS_RMINVENTORYINFO_UPDATE;
	}

	/**
	 * 
	* @date: 2017-3-3 
	* @author: yuanchun
	* @title: getIbatisRmlabelcodenameDictSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmlabelcodenamedictSelect() {
		return IBATIS_RMLABELCODENAMEDICT_SELECT;
	}
	

	/**
	 * 
	* @date: 2017-2-24 
	* @author: yuanchun
	* @title: getIbatisRmlabelarchivestmpSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmlabelarchivestmpSelect() {
		return IBATIS_RMLABELARCHIVESTMP_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmloginuserinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmloginuserinfoSelect() {
		return IBATIS_RMLOGINUSERINFO_SELECT;
	}
	/**
	 * 
	* @date: 2017-1-20 
	* @author: hannn
	* @title: getIbatisRmLoginMsgInfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmLoginMsgInfoInsert() {
		return IBATIS_RMLOGINMSGINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmloginuserinfoSelectLoginuserbyid 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmloginuserinfoSelectLoginuserbyid() {
		return IBATIS_RMLOGINUSERINFO_SELECT_LOGINUSERBYID;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmloginuserinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmloginuserinfoUpdate() {
		return IBATIS_RMLOGINUSERINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2017-3-1 
	* @author: tangaq
	* @title: getIbatisRmmarketcaseattributeinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseattributeinfoInsert() {
		return IBATIS_RMMARKETCASEATTRIBUTEINFO_INSERT;
	}

	/**
	 * 
	* @date: 2017-3-1 
	* @author: tangaq
	* @title: getIbatisRmmarketcaseattributeinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseattributeinfoUpdate() {
		return IBATIS_RMMARKETCASEATTRIBUTEINFO_UPDATE;
	}

	/**
	 * 
	* @date: 2017-3-1 
	* @author: tangaq
	* @title: getIbatisRmmarketcaseattributeinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseattributeinfoDelete() {
		return IBATIS_RMMARKETCASEATTRIBUTEINFO_DELETE;
	}

	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseinfoSelectMarketcaseid 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelectMarketcaseid() {
		return IBATIS_RMMARKETCASEINFO_SELECT_MARKETCASEID;
	}
	
	/**
	 * 
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseinfoSelectBatchpushmarketcaseandcustgroup 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelectBatchpushmarketcaseandcustgroup() {
		return IBATIS_RMMARKETCASEINFO_SELECT_BATCHPUSHMARKETCASEANDCUSTGROUP;
	}
	
	/**
	 * 
	* @date: 2017-3-20 
	* @author: yuanchun
	* @title: getIbatisRmmarketcaseinfoSelectMarketcaserelcalltaskcustgrouptypeandformula 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelectMarketcaserelcalltaskcustgrouptypeandformula() {
		return IBATIS_RMMARKETCASEINFO_SELECT_MARKETCASERELCALLTASKCUSTGROUPTYPEANDFORMULA;
	}

	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseinfoSelectMarketcaserelcustgrouptypeandformula 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelectMarketcaserelcustgrouptypeandformula() {
		return IBATIS_RMMARKETCASEINFO_SELECT_MARKETCASERELCUSTGROUPTYPEANDFORMULA;
	}
	
	/**
	 * 
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseinfoSelectChanneltriggermarketcase 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getIbatisRmmarketcaseinfoSelectChanneltriggermarketcase() {
		return IBATIS_RMMARKETCASEINFO_SELECT_CHANNELTRIGGERMARKETCASE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseinfoSelectMarketcaseandwholeruledetail 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelectMarketcaseandwholeruledetail() {
		return IBATIS_RMMARKETCASEINFO_SELECT_MARKETCASEANDWHOLERULEDETAIL;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoInsert() {
		return IBATIS_RMMARKETCASEINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoDelete() {
		return IBATIS_RMMARKETCASEINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelect() {
		return IBATIS_RMMARKETCASEINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2017-3-30 
	* @author: sunyuan
	* @title: getIbatisRmmarketcaseinfoSelectById 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelectById(){
		return IBATIS_RMMARKETCASEINFO_SELECT_BYID;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoUpdate() {
		return IBATIS_RMMARKETCASEINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2017-1-9 
	* @author: tangaq
	* @title: getIbatisRmmarketcaseinfoSelectRmmarketcasecount 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelectRmmarketcasecount(){
	    return IBATIS_RMMARKETCASEINFO_SELECT_RMMARKETCASECOUNT;
		
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseinfoSelectRmmarketcasenum 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelectRmmarketcasenum() {
		return IBATIS_RMMARKETCASEINFO_SELECT_RMMARKETCASENUM;
	}
	
	/**
	 * 
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseinfoSelectEventtriggermarketcase 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelectEventtriggermarketcase() {
		return IBATIS_RMMARKETCASEINFO_SELECT_EVENTTRIGGERMARKETCASE;
	}
	
	/**
	 * 
	* @date: 2017-4-17 
	* @author: yuanchun
	* @title: getIbatisRmmarketcaseinfoSelectExecuteMarketCase 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelectExecuteMarketCase() {
		return IBATIS_RMMARKETCASEINFO_SELECT_EXECUTEMARKETCASE;
	}
	
	/**
	 * 
	* @date: 2017-4-17 
	* @author: yuanchun
	* @title: getIbatisRmmarketcaseinfoSelectTargetCustCount 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelectTargetCustCount() {
		return IBATIS_RMMARKETCASEINFO_SELECT_TARGETCUSTCOUNT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcasebussinessinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcasebussinessinfoSelect() {
		return IBATIS_RMMARKETCASEBUSSINESSINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcasebussinessinfoSelectMarketcasebussinessbyregioncode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcasebussinessinfoSelectMarketcasebussinessbyregioncode() {
		return IBATIS_RMMARKETCASEBUSSINESSINFO_SELECT_MARKETCASEBUSSINESSBYREGIONCODE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreportbythree 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreportbythree() {
		return IBATIS_RMMARKETCASEORDERREPORTINFO_SELECT_MARKETCASEORDERREPORTBYTHREE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreportbyseven 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreportbyseven() {
		return IBATIS_RMMARKETCASEORDERREPORTINFO_SELECT_MARKETCASEORDERREPORTBYSEVEN;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreportbyfifth 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreportbyfifth() {
		return IBATIS_RMMARKETCASEORDERREPORTINFO_SELECT_MARKETCASEORDERREPORTBYFIFTH;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreport 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreport() {
		return IBATIS_RMMARKETCASEORDERREPORTINFO_SELECT_MARKETCASEORDERREPORT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseorderreportinfoSelectChannelmarketcaseorderreport 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseorderreportinfoSelectChannelmarketcaseorderreport() {
		return IBATIS_RMMARKETCASEORDERREPORTINFO_SELECT_CHANNELMARKETCASEORDERREPORT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreportsendnum 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseorderreportinfoSelectMarketcaseorderreportsendnum() {
		return IBATIS_RMMARKETCASEORDERREPORTINFO_SELECT_MARKETCASEORDERREPORTSENDNUM;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseorderreportinfoInsertMarketcaseorderreport 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseorderreportinfoInsertMarketcaseorderreport() {
		return IBATIS_RMMARKETCASEORDERREPORTINFO_INSERT_MARKETCASEORDERREPORT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmenuinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmenuinfoDelete() {
		return IBATIS_RMMENUINFO_DELETE_;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmenuinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmenuinfoInsert() {
		return IBATIS_RMMENUINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmenuinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmenuinfoSelect() {
		return IBATIS_RMMENUINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmenuinfoSelectMenubyid 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmenuinfoSelectMenubyid() {
		return IBATIS_RMMENUINFO_SELECT_MENUBYID;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmenuinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmenuinfoUpdate() {
		return IBATIS_RMMENUINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmenuinfoSelectMenubyloginno 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmenuinfoSelectMenubyloginno() {
		return IBATIS_RMMENUINFO_SELECT_MENUBYLOGINNO;
	}
	
	
	/**
	 * 
	* @date: 2017-3-7 
	* @author: wuJiaFu
	* @title: getIbatisRmmessagetriggerloginfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmessagetriggerloginfoInsert() {
		return IBATIS_RMMESSAGETRIGGERLOGINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2017-3-7 
	* @author: wuJiaFu
	* @title: getIbatisRmmessagetriggerloginfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmessagetriggerloginfoSelect() {
		return IBATIS_RMMESSAGETRIGGERLOGINFO_SELECT;
	}

	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmonitorwarninginfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmonitorwarninginfoDelete() {
		return IBATIS_RMMONITORWARNINGINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmonitorwarninginfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmonitorwarninginfoInsert() {
		return IBATIS_RMMONITORWARNINGINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmonitorwarninginfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmonitorwarninginfoSelect() {
		return IBATIS_RMMONITORWARNINGINFO_SELECT;
	}
	/**
	 * 
	* @date: 2017-2-28 
	* @author: yexr
	* @title: getIbatisRmnoticeinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmnoticeinfoSelect() {		
		return IBATIS_RMNOTICEINFO_SELECT;
	}
	/**
	 * 
	* @date: 2017-3-1 
	* @author: yexr
	* @title: getIbatisRmnoticeinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmnoticeinfoInsert() {		
		return IBATIS_RMNOTICEINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2017-3-1 
	* @author: yexr
	* @title: getIbatisRmnoticeinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmnoticeinfoUpdate() {		
		return IBATIS_RMNOTICEINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2017-3-1 
	* @author: yexr
	* @title: getIbatisRmnoticeinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmnoticeinfoDelete() {		
		return IBATIS_RMNOTICEINFO_DELETE;
	}
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmoperloginfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmoperloginfoSelect() {
		return IBATIS_RMOPERLOGINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmpositioninfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmpositioninfoInsert() {
		return IBATIS_RMPOSITIONINFO_INSERT_;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmpositioninfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmpositioninfoSelect() {
		return IBATIS_RMPOSITIONINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmpositioninfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmpositioninfoUpdate() {
		return IBATIS_RMPOSITIONINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmpositioninfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmpositioninfoDelete() {
		return IBATIS_RMPOSITIONINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmproductcommodityinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmproductcommodityinfoSelect() {
		return IBATIS_RMPRODUCTCOMMODITYINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmproductcommodityinfoSelectCount 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmproductcommodityinfoSelectCount() {
		return IBATIS_RMPRODUCTCOMMODITYINFO_SELECT_COUNT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmproductdictSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmproductdictSelect() {
		return IBATIS_RMPRODUCTDICT_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmrelationrelInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmrelationrelInsert() {
		return IBATIS_RMRELATIONREL_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmrelationrelSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmrelationrelSelect() {
		return IBATIS_RMRELATIONREL_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmrelationrelSelectCustgrouprel 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmrelationrelSelectCustgrouprel() {
		return IBATIS_RMRELATIONREL_SELECT_CUSTGROUPREL;
	}
	
	/**
	 * 
	* @date: 2017-2-14 
	* @author: sunyuan
	* @title: getIbatisRmrelationrelSelectMarketCaserel 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmrelationrelSelectMarketCaserel() {
		return IBATIS_RMRELATIONREL_SELECT_MARKETCASEREL;
	}
	
	/**
	 * 
	* @date: 2017-4-5 
	* @author: sunyuan
	* @title: getIbatisRmrelationrelSelectMarketCaserelByChannelRel 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmrelationrelSelectMarketCaserelByChannelRel(){
		return IBATIS_RMRELATIONREL_SELECT_MARKETCASERELBYCHANNELREL;
	}
	
	/**
	 * 
	* @date: 2017-3-30 
	* @author: sunyuan
	* @title: getIbatisRmrelationrelSelectMarketCaserelByRuleId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmrelationrelSelectMarketCaserelByRuleId() {
		return IBATIS_RMRELATIONREL_SELECT_MARKETCASERELBYRULEID;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmrelationrelUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmrelationrelUpdate() {
		return IBATIS_RMRELATIONREL_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmrelationrelDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmrelationrelDelete() {
		return IBATIS_RMRELATIONREL_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmroleinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmroleinfoDelete() {
		return IBATIS_RMROLEINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmroleinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmroleinfoInsert() {
		return IBATIS_RMROLEINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmroleinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmroleinfoSelect() {
		return IBATIS_RMROLEINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmroleinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmroleinfoUpdate() {
		return IBATIS_RMROLEINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmroleinfoSelectRoledetail 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmroleinfoSelectRoledetail() {
		return IBATIS_RMROLEINFO_SELECT_ROLEDETAIL;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmroleinfoSelectNothasrole 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmroleinfoSelectNothasrole() {
		return IBATIS_RMROLEINFO_SELECT_NOTHASROLE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmrolemenurelInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmrolemenurelInsert() {
		return IBATIS_RMROLEMENUREL_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmrolemenurelSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmrolemenurelSelect() {
		return IBATIS_RMROLEMENUREL_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmrolemenurelDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmrolemenurelDelete() {
		return IBATIS_RMROLEMENUREL_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmroleuserrelInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmroleuserrelInsert() {
		return IBATIS_RMROLEUSERREL_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmroleuserrelSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmroleuserrelSelect() {
		return IBATIS_RMROLEUSERREL_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmroleuserrelDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmroleuserrelDelete() {
		return IBATIS_RMROLEUSERREL_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmruleinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruleinfoInsert() {
		return IBATIS_RMRULEINFO_INSERT_;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmruleinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruleinfoSelect() {
		return IBATIS_RMRULEINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: getIbatisRmruleinfoListSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getIbatisRmruleinfoListSelect(){
		return IBATIS_RMRULEINFO_SELECT_LIST;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmruleinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruleinfoUpdate() {
		return IBATIS_RMRULEINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmruleinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruleinfoDelete() {
		return IBATIS_RMRULEINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmruledetailinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruledetailinfoInsert() {
		return IBATIS_RMRULEDETAILINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmruledetailinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruledetailinfoSelect() {
		return IBATIS_RMRULEDETAILINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2017-2-28 
	* @author: yuanliang
	* @title: getIbatisRmruledetailinfoSelectSelectmarketcaseandrulelist 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruledetailinfoSelectSelectmarketcaseandrulelist() {
		return IBATIS_RMRULEDETAILINFO_SELECT_SELECTMARKETCASEANDRULELIST;
	}	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmruledetailinfoSelectRuledetailid 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruledetailinfoSelectRuledetailid() {
		return IBATIS_RMRULEDETAILINFO_SELECT_RULEDETAILID;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmruledetailinfoSelectSelectwholeruledetailbymarketcaseid 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruledetailinfoSelectSelectwholeruledetailbymarketcaseid() {
		return IBATIS_RMRULEDETAILINFO_SELECT_SELECTWHOLERULEDETAILBYMARKETCASEID;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmruledetailinfoSelectSelectruledetailbatchnobyid 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruledetailinfoSelectSelectruledetailbatchnobyid() {
		return IBATIS_RMRULEDETAILINFO_SELECT_SELECTRULEDETAILBATCHNOBYID;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmruledetailinfoSelectSelectruledetailbyparentcomponentid 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruledetailinfoSelectSelectruledetailbyparentcomponentid() {
		return IBATIS_RMRULEDETAILINFO_SELECT_SELECTRULEDETAILBYPARENTCOMPONENTID;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmruledetailinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruledetailinfoUpdate() {
		return IBATIS_RMRULEDETAILINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmruledetailinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruledetailinfoDelete() {
		return IBATIS_RMRULEDETAILINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmwaitsendtaskcontrolinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmwaitsendtaskcontrolinfoInsert() {
		return IBATIS_RMWAITSENDTASKCONTROLINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmwaitsendtaskcontrolinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmwaitsendtaskcontrolinfoSelect() {
		return IBATIS_RMWAITSENDTASKCONTROLINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmsgaccesscodeserinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmsgaccesscodeserinfoDelete() {
		return IBATIS_RMMSGACCESSCODESERINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmsgaccesscodeserinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmsgaccesscodeserinfoInsert() {
		return IBATIS_RMMSGACCESSCODESERINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmsgaccesscodeserinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmsgaccesscodeserinfoSelect() {
		return IBATIS_RMMSGACCESSCODESERINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmsgaccesscodeserinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmsgaccesscodeserinfoUpdate() {
		return IBATIS_RMMSGACCESSCODESERINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmsgaccesscodeserinfoSelectMsgaccesscodeserdetail 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmsgaccesscodeserinfoSelectMsgaccesscodeserdetail() {
		return IBATIS_RMMSGACCESSCODESERINFO_SELECT_MSGACCESSCODESERDETAIL;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmmsgaccesscodeserinfoSelectMsgaccesscodesernothas 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmsgaccesscodeserinfoSelectMsgaccesscodesernothas() {
		return IBATIS_RMMSGACCESSCODESERINFO_SELECT_MSGACCESSCODESERNOTHAS;
	}
	/** 
	* @date: 2017-3-8 
	* @author: wangpei
	* @title: getIbatisRmServicemonitoringInfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public String getIbatisRmServicemonitoringInfoInsert(){
		return IBATIS_RMSERVICEMONITORINGINFO_INSERT;
	}
	/**
	 * 
	* @date: 2017-3-10 
	* @author: wuJiaFu
	* @title: getIbatisRmServicemonitoringInfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getIbatisRmServicemonitoringInfoSelect(){
		return IBATIS_RMSERVICEMONITORINGINFO_SELECT;
	}
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisShortmsgmovetrafficinfoSelectBydate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisShortmsgmovetrafficinfoSelectBydate() {
		return IBATIS_SHORTMSGMOVETRAFFICINFO_SELECT_BYDATE_;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisShortmsgmovetrafficinfoSelectBymarketcaseid 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisShortmsgmovetrafficinfoSelectBymarketcaseid() {
		return IBATIS_SHORTMSGMOVETRAFFICINFO_SELECT_BYMARKETCASEID_;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmquestionnaireinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmquestionnaireinfoInsert() {
		return IBATIS_RMQUESTIONNAIREINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmquestionnaireinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmquestionnaireinfoSelect() {
		return IBATIS_RMQUESTIONNAIREINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmquestionnaireinfoSelectQuestionnairelist 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmquestionnaireinfoSelectQuestionnairelist() {
		return IBATIS_RMQUESTIONNAIREINFO_SELECT_QUESTIONNAIRELIST;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmquestionnaireinfoSelectMarketcaseandcontentlist 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmquestionnaireinfoSelectMarketcaseandcontentlist() {
		return IBATIS_RMQUESTIONNAIREINFO_SELECT_MARKETCASEANDCONTENTLIST;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmquestionnaireinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmquestionnaireinfoUpdate() {
		return IBATIS_RMQUESTIONNAIREINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisShellprocessexecuteinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisShellprocessexecuteinfoInsert() {
		return IBATIS_SHELLPROCESSEXECUTEINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisShellprocessexecuteinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisShellprocessexecuteinfoUpdate() {
		return IBATIS_SHELLPROCESSEXECUTEINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisShellprocessexecuteinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisShellprocessexecuteinfoSelect() {
		return IBATIS_SHELLPROCESSEXECUTEINFO_SELECT;
	}
	/**
	 * 
	* @date: 2017-4-14 
	* @author: chenhao
	* @title: getIbatisShellprocessexecuteinfoSelectToday 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisShellprocessexecuteinfoSelectToday(){
		return IBATIS_SHELLPROCESSEXECUTEINFO_SELECTTODAY;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmtaskadjustinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmtaskadjustinfoInsert() {
		return IBATIS_RMTASKADJUSTINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmtaskadjustinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmtaskadjustinfoUpdate() {
		return IBATIS_RMTASKADJUSTINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmtaskadjustinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmtaskadjustinfoSelect() {
		return IBATIS_RMTASKADJUSTINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2017-1-9 
	* @author: zhangjj_crmpd
	* @title: getIbatisRmtaskadjustinfoSelectByParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmtaskadjustinfoSelectByParam() {
		return IBATIS_RMTASKADJUSTINFO_SELECT_BYPARAM;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmtaskadjustinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmtaskadjustinfoDelete() {
		return IBATIS_RMTASKADJUSTINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmtemplateinfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmtemplateinfoInsert() {
		return IBATIS_RMTEMPLATEINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmtemplateinfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmtemplateinfoUpdate() {
		return IBATIS_RMTEMPLATEINFO_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmtemplateinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmtemplateinfoSelect() {
		return IBATIS_RMTEMPLATEINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmtemplateinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmtemplateinfoDelete() {
		return IBATIS_RMTEMPLATEINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisTesttableInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisTesttableInsert() {
		return IBATIS_TESTTABLE_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmtouchcountinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmtouchcountinfoSelect() {
		return IBATIS_RMTOUCHCOUNTINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmtouchcountinfoSelectByregioncode 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmtouchcountinfoSelectByregioncode() {
		return IBATIS_RMTOUCHCOUNTINFO_SELECT_BYREGIONCODE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmtouchcountinfoSelectConvertrate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmtouchcountinfoSelectConvertrate() {
		return IBATIS_RMTOUCHCOUNTINFO_SELECT_CONVERTRATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmuserlabeltmpSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmuserlabeltmpSelect() {
		return IBATIS_RMUSERLABELTMP_SELECT;
	}
	
	/**
	 * 查询用户标签列表(直接分页不加入缓存)
	* @date: 2017-3-14 
	* @author: zhangwie_crmpd_cmi_ah
	* @title: getUserLabelForPageSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getUserLabelForPageSelect() {
		return IBATIS_RMUSERLABELTMP_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmuserlabeltmpInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmuserlabeltmpInsert() {
		return IBATIS_RMUSERLABELTMP_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmuserlabeltmpDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmuserlabeltmpDelete() {
		return IBATIS_RMUSERLABELTMP_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmuserlabeltmpUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmuserlabeltmpUpdate() {
		return IBATIS_RMUSERLABELTMP_UPDATE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmuserinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmuserinfoSelect() {
		return IBATIS_RMUSERINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmworkconfiginfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmworkconfiginfoDelete() {
		return IBATIS_RMWORKCONFIGINFO_DELETE;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmworkconfiginfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmworkconfiginfoInsert() {
		return IBATIS_RMWORKCONFIGINFO_INSERT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmworkconfiginfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmworkconfiginfoSelect() {
		return IBATIS_RMWORKCONFIGINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2016-12-27 
	* @author: sunliang 
	* @title: getIbatisRmworkconfiginfoUpdate 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmworkconfiginfoUpdate() {
		return IBATIS_RMWORKCONFIGINFO_UPDATE;
	}


	/**
	 * 
	* @date: 2017-1-6 
	* @author: liuqi
	* @title: getIbatisRmRecommendRecordInfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmrecommendRecordInfoSelect(){
		return IBATIS_RMRECOMMENDRECORDINFO_SELECT;
	}
	

	/**
	 * 
	* @date: 2017-1-9 
	* @author: liuqi
	* @title: getIbatisRmReceiptRecordInfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmreceiptRecordInfoSelect(){
		return IBATIS_RMRECEIPTRECORDINFO_SELECT;
	}
	/**
	 * 插入产商品信息报表
	* @date: 2017-2-22 
	* @author: mengxi
	* @title: getIbatisRmProductCommodityReportInfoInsert 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmProductCommodityReportInfoInsert() {
		return IBATIS_RMPRODUCTCOMMODITYREPORTINFO_INSERT;
	}
	/**
	 * 查询产商品信息报表
	* @date: 2017-2-21 
	* @author: hannn
	* @title: getIbatisRmProductCommodityReportInfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmProductCommodityReportInfoSelect() {
		return IBATIS_RMPRODUCTCOMMODITYREPORTINFO_SELECT;
	}
	/**
	 * 
	* @date: 2017-2-24 
	* @author: hannn
	* @title: getIbatisRmProductCommodityReportInfoSelectCount 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmProductCommodityReportInfoSelectCount() {
		return IBATIS_RMPRODUCTCOMMODITYREPORTINFO_SELECT_COUNT;
	}
	/**
	 * 查询全省产商品信息报表
	* @date: 2017-2-24 
	* @author: hannn
	* @title: getIbatisRmProductCommodityReportInfoByProvinceSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmProductCommodityReportInfoByProvinceSelect() {
		return IBATIS_RMPRODUCTCOMMODITYREPORTINFO_SELECT_PROVINCE;
	}
	
	/**
	 * 
	* @date: 2017-3-8 
	* @author: sunliang 
	* @title: getIbatisRmruledetailinfoSelectRuleDetailsByEventIdAndMarketCaseId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruledetailinfoSelectRuleDetailsByEventIdAndMarketCaseId() {
		return IBATIS_RMRULEDETAILINFO_SELECT_RULEDETAILSBYEVENTIDANDMARKETCASEID;
	}

	/**
	 * 
	* @date: 2017-3-30 
	* @author: chenhao
	* @title: getIbatisEventinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisEventinfoDelete() {
		return IBATIS_RMEVENTINFO_DELETE;
	}

	/**
	 * 
	* @date: 2017-3-30 
	* @author: chenhao
	* @title: getIbatisEventDetailinfoDelete 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisEventDetailinfoDelete() {
		return IBATIS_RMEVENTDETAILINFO_DELETE;
	}

	/**
	 * 根据push营销案信息查询规则
	* @date: 2017-4-12 
	* @author: chenhao
	* @title: getIbatisRmruledetailinfoSelectRuleDetailByMarketCaseId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmruledetailinfoSelectRuleDetailByMarketCaseId() {
		return IBATIS_RMRULEDETAILINFO_SELECT_RULEDETAILBYMARKETCASEID;
	}
	

}
