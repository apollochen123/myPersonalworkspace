package com.sitech.strategy.common.pojo.impl.hbase;

import java.io.Serializable;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.hbase.IHbaseTableName;

/**
 * 基于命名空间的表名称
* @date: 2016-11-22 
* @author: sunliang 
* @title: HbaseTableNameByNameSpace 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class HbaseTableNameByStraOpr extends BaseClass implements IHbaseTableName,Serializable {
	
	/**
	 * 受理记录表
	 */
	public final String acceptRecord = new String("stra_opr:RM_ACCEPTRECORD_INFO");
	/**
	 * 批量push任务表
	 */
	public final String batchPushTask = new String("stra_opr:RM_BATCHPUSHTASK_INFO");
	/**
	 * 批量push任务异常表
	 */
	public final String batchPushTaskExcep = new String("stra_opr:RM_BATCHPUSHTASKEXCEP_INFO");
	/**
	 * 批量push任务成功表
	 */
	public final String batchPushTaskSuccInfo = new String("stra_opr:RM_BATCHPUSHTASKSUCC_INFO");
	/**
	 * 渠道外呼接触表
	 */
	public final String channelCallContact = new String("stra_opr:RM_CHANNELCALLCONTACT_INFO");
	/**
	 * 渠道短信接触表
	 */
	public final String channelSMSContact = new String("stra_opr:RM_CHANNELSMSCONTACT_INFO");
	/**
	 * 渠道任务表
	 */
	public final String channelTask = new String("stra_opr:RM_CHANNELTASK_INFO");
	/**
	 * 点击记录表
	 */
	public final String clickRecord = new String("stra_opr:RM_CLICKRECORD_INFO");
	/**
	 * COC客户群明细表
	 */
	public String cocCustomerGroup;
	/**
	 * COC客户群明细表列簇
	 */
	public String cocCustomerGroupFamily = new String("F");
	/**
	 * 接触记录表
	 */
	public final String contactRecord = new String("stra_opr:RM_CONTACTRECORD_INFO");
	/**
	 * 客户群明细表
	 */
	public String custGroupDetail;
	/**
	 * 客户群标签表
	 */
	public String custGroupLabel;
	/**
	 * 灰名单表
	 */
	public final String grey = new String("stra_opr:RM_GREY_INFO");
	/**
	 * hbase测试表
	 */
	public final String hbaseTest = new String("stra_opr:RM_HBASETEST_INFO");
	/**
	 * 工号信息表
	 */
	public final String loginMsg = new String("stra_opr:RM_LOGINMSG_INFO");
	/**
	 * 操作日志信息表
	 */
	public final String operLogInfo = new String("stra_opr:RM_OPERLOG_INFO");	
	/**
	 * 推送到达表
	 */
	public final String pushArrive = new String("stra_opr:RM_PUSHARRIVE_INFO");
	/**
	 * 回单记录表
	 */
	public final String receiptRecord = new String("stra_opr:RM_RECEIPTRECORD_INFO");
	/**
	 * 推荐受理记录表
	 */
	public final String recommendAcceptRecord = new String("stra_opr:RM_RECOMMENDACCEPTRECORD_INFO");
	/**
	 * 推荐关闭表
	 */
	public final String recommendClose = new String("stra_opr:RM_RECOMMENDCLOSE_INFO");
	/**
	 * 推荐记录表
	 */
	public final String recommendReord = new String("stra_opr:RM_RECOMMENDRECORD_INFO");
	/**
	 * 短信受理记录表
	 */
	public final String smsAcceptRecord = new String("stra_opr:RM_SMSACCEPTRECORD_INFO");
	/**
	 * 短信上行记录表
	 */
	public final String smsPull = new String("stra_opr:RM_SMSPULL_INFO");
	/**
	 * 用户信息表
	 */
	public final String user = new String("stra_opr:RM_USER_INFO");
	/**
	 * 用户受理营销案表
	 */
	public final String userAcceptMarketCase = new String("stra_opr:RM_USERACCEPTMARKETCASE_INFO");
	/**
	 * 用户标签表
	 */
	public final String userLabel = new String("stra_opr:RM_USERLABEL_INFO");
	/**
	 * 用户推荐控制表
	 */
	public final String userRecommendControl = new String("stra_opr:RM_USERRECOMMENDCONTROL_INFO");
	/**
	 * 用户推荐营销案表
	 */
	public final String userRecommendMarketCase = new String("stra_opr:RM_USERRECOMMENDMARKETCASE_INFO");
	/**
	 * 用户转换关系表
	 */
	public final String userRel = new String("stra_opr:RM_USERREL_INFO");
	/**
	 * 待发送批量push任务表
	 */
	public final String waitSendBatchPushTask = new String("stra_opr:RM_WAITSENDBATCHPUSHTASK_INFO");
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getAcceptRecord 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getAcceptRecord() {
		return acceptRecord;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getBatchPushTask 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getBatchPushTask() {
		return batchPushTask;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getBatchPushTaskCount 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
/*	@Override
	public String getBatchPushTaskCount() {
		return batchPushTaskCount;
	}*/
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getBatchPushTaskIndex 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
/*	@Override
	public String getBatchPushTaskIndex() {
		return batchPushTaskIndex;
	}*/
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getBatchPushTaskExcep 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getBatchPushTaskExcep() {
		return batchPushTaskExcep;
	}
	
	/**
	 * 
	* @date: 2017-2-27 
	* @author: zhangjj_crmpd
	* @title: getRmBatchPushTaskSuccInfo 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getRmBatchPushTaskSuccInfo() {
		return batchPushTaskSuccInfo;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getChannelCallContact 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getChannelCallContact() {
		return channelCallContact;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getChannelSMSContact 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getChannelSMSContact() {
		return channelSMSContact;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getChannelTask 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getChannelTask() {
		return channelTask;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getClickRecord 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getClickRecord() {
		return clickRecord;
	}
	
	/**
	 * 
	* @date: 2016-11-23 
	* @author: yangwl
	* @title: getCocCustomerGroup 
	* @param custGroupId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCocCustomerGroup(String fromat) {
		cocCustomerGroup = "stra_opr:COC_CUSTOMER_GROUP_" + fromat;
		return cocCustomerGroup;
	}
	
	/**
	 * 
	* @date: 2016-11-23 
	* @author: yangwl
	* @title: getCocCustomerGroupFamily 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCocCustomerGroupFamily() {
		return cocCustomerGroupFamily;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getContactRecord 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getContactRecord() {
		return contactRecord;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getCustGroupDetail 
	* @param custGroupId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getCustGroupDetail(String custGroupId) {
		custGroupDetail = "stra_opr:RM_CUSTGROUP_" + custGroupId + "_DETAIL_INFO";
		return custGroupDetail;
	}
	
	/** 
	* @date: 2017-2-21 
	* @author: wangpei
	* @title: getCustGroupLabel 
	* @param custGroupId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public String getCustGroupLabel(String custGroupId) {
		custGroupDetail = "stra_opr:RM_CUSTGROUP_" + custGroupId + "_LABEL_INFO";
		return custGroupDetail;
	}

	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getGrey 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getGrey() {
		return grey;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getHbaseTest 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getHbaseTest() {
		return hbaseTest;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getLoginMsg 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getLoginMsg() {
		return loginMsg;
	}
	
	/** 
	 * @date: 2017-3-10 
	 * @author: yueyi
	 * @title: getOperLogInfo 
	 * @return the operLogInfo
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public String getOperLogInfo() {
		return operLogInfo;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getMarketCaseRecommendtotal 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
/*	@Override
	public String getMarketCaseRecommendtotal() {
		return marketCaseRecommendtotal;
	}*/
	
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getPushArrive 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getPushArrive() {
		return pushArrive;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getReceiptRecord 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getReceiptRecord() {
		return receiptRecord;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getRecommendAcceptRecord 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getRecommendAcceptRecord() {
		return recommendAcceptRecord;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getRecommendClose 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getRecommendClose() {
		return recommendClose;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getRecommendReord 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getRecommendReord() {
		return recommendReord;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getSmsAcceptRecord 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSmsAcceptRecord() {
		return smsAcceptRecord;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getSmsPull 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSmsPull() {
		return smsPull;
	}
	
	
	/** 
	 * @date: 2016-12-6 
	 * @author: wangpei
	 * @title: getTaskServiceNo 
	 * @return the taskServiceNo
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
/*	@Override
	public String getTaskServiceNo() {
		return taskServiceNo;
	}*/

	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getUser 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getUser() {
		return user;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getUserAcceptMarketCase 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getUserAcceptMarketCase() {
		return userAcceptMarketCase;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getUserLabel 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getUserLabel() {
		return userLabel;
	}
	
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getUserRecommendControl 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getUserRecommendControl() {
		return userRecommendControl;
	}
	
	/**
	 * 
	* @date: 2017-4-10 
	* @author: zhangyw_crmpd
	* @title: getUserRecommendMarketCase 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getUserRecommendMarketCase() {
		return userRecommendMarketCase;
	}
	/**
	 * 
	* @date: 2016-11-22 
	* @author: sunliang 
	* @title: getUserRel 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getUserRel() {
		return userRel;
	}
	
	/**
	 * 
	* @date: 2017-1-10 
	* @author: sunliang 
	* @title: getWaitSendBatchPushTask 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getWaitSendBatchPushTask() {
		return waitSendBatchPushTask;
	}

}
