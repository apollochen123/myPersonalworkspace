package com.sitech.strategy.common.pojo.impl.hbase;

import java.io.Serializable;
import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.hbase.IHbaseRowKey;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.MD5RowKeyGenerator;

/**
 * hbase rowkey
* @date: 2016-12-29 
* @author: zhangjj_crmpd
* @title: HbaseTableRowKey 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class HbaseRowKey extends BaseClass implements IHbaseRowKey,Serializable {
	
	/**
	 * 
	* @date: 2017-4-8 
	* @author: zhangyw_crmpd
	* @title: getUserAcceptMarketcase 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getUserAcceptMarketcaseRowkey(Map<String, Object> tempInParam) {
		String idNo = (String)tempInParam.get("ID_NO");
		String marketCaseId = (String)tempInParam.get("MARKETCASE_ID");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo+Const.SEPARATOR_COLON+marketCaseId;
		return rowKey;
	}
	/**
	 * 
	* @date: 2017-4-10 
	* @author: zhangyw_crmpd
	* @title: getUserRecommendMarketCaseRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getUserRecommendMarketCaseRowkey(Map<String, Object> tempInParam) {
		String idNo = (String)tempInParam.get("idNo");
		String marketCaseId = (String)tempInParam.get("marketCaseId");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo + Const.SEPARATOR_COLON + marketCaseId;
		return rowKey;
	}
	
	/**
	 * 
	* @date: 2017-3-6 
	* @author: tangaq
	* @title: getAcceptRecordRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getAcceptRecordRowkey(Map<String, Object> tempInParam) {
		String idNo = (String)tempInParam.get("ID_NO");
		String seqId = (String)tempInParam.get("SEQ_ID");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo+Const.SEPARATOR_COLON+seqId;
		return rowKey;
	}

	/** 
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: getBatchPushTaskExcepRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public String getBatchPushTaskExcepRowkey(Map<String, Object> tempInParam) {
		String taskId = (String)tempInParam.get("taskId");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(taskId);
		String rowKey = hash + Const.SEPARATOR_COLON + taskId;
		return rowKey;
	}

	/** 
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: getBatchPushTaskRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public String getBatchPushTaskRowkey(Map<String, Object> tempInParam) {
		String taskId = (String)tempInParam.get("taskId");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(taskId);
		String rowKey = hash + Const.SEPARATOR_COLON + taskId;
		return rowKey;
	}
	
	/**
	 * 
	* @date: 2017-2-27 
	* @author: zhangjj_crmpd
	* @title: getBatchPushTaskSuccRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getBatchPushTaskSuccRowkey(Map<String, Object> tempInParam) {
		String taskId = (String)tempInParam.get("taskId");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(taskId);
		String rowKey = hash + Const.SEPARATOR_COLON + taskId;
		return rowKey;
	}

	/** 
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: getBatchPushTaskVerifyRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public String getBatchPushTaskVerifyRowkey(Map<String, Object> tempInParam) {
		String taskId = (String)tempInParam.get("taskId");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(taskId);
		String rowKey = hash + Const.SEPARATOR_COLON + taskId;
		return rowKey;
	}

	/**
	 * 得到渠道外呼接触rowkey
	* @date: 2017-2-21 
	* @author: tangaq
	* @title: getChannelCallContactRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getChannelCallContactRowkey(Map<String, Object> tempInParam) {
		String idNo = (String)tempInParam.get("ID_NO");
		String seqId = (String)tempInParam.get("SEQ_ID");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo + Const.SEPARATOR_COLON + seqId;
		return rowKey;
	}

	/** 
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: getChannelTaskRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public String getChannelTaskRowkey(Map<String, Object> tempInParam) {
		String taskId = (String) tempInParam.get("taskId");
		String hash = (String) MD5RowKeyGenerator.generatePrefix(taskId);
		String rowKey = hash + Const.SEPARATOR_COLON + taskId;
		return rowKey;
	}

	/**
	 * 得到渠道短信接触rowkey
	* @date: 2017-2-22 
	* @author: tangaq
	* @title: getChannelSMSContactRowKey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getChannelSMSContactRowKey(Map<String, Object> tempInParam) {
		String idNo = (String)tempInParam.get("ID_NO");
		String seqId = (String)tempInParam.get("SEQ_ID");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo + Const.SEPARATOR_COLON + seqId;
		return rowKey;
	}

	/**
	 * 获取点击记录rowkey
	* @date: 2017-2-21 
	* @author: tangaq
	* @title: getClickRecordRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getClickRecordRowkey(Map<String, Object> tempInParam) {
		String idNo = (String)tempInParam.get("ID_NO");
		String seqId = (String)tempInParam.get("SEQ_ID");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo + Const.SEPARATOR_COLON + seqId;
		return rowKey;
	}

	/** 
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: getContactRecordRowkey 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public String getContactRecordRowkey(Map<String, Object> inParam) {
		String idNo = (String)inParam.get("idNo");
		String seqId = (String)inParam.get("seqId");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo + Const.SEPARATOR_COLON + seqId;
		return rowKey;
	}

	/** 
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: getEventTaskRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public String getEventTaskRowkey(Map<String, Object> tempInParam) {
		String rowKey = (String) tempInParam.get("currentDate")
				+ Const.SEPARATOR_COLON
				+ (String) tempInParam.get("partition")
				+ Const.SEPARATOR_COLON
				+ (String) tempInParam.get("marketCaseId")
				+ Const.SEPARATOR_COLON
				+ (String) tempInParam.get("taskId");
		return rowKey;
	}

	/**
	 * 获取灰名单rowkey
	* @date: 2016-12-29 
	* @author: zhangjj_crmpd
	* @title: getGreyRowKey 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getGreyRowKey(Map<String, Object> inParam) {
		String idNo = CommonUtils.toString(inParam.get("idNo"));
		//return MD5RowKeyGenerator.generatePrefix(idNo)+":"+idNo+":"+CommonUtils.toString(inParam.get("channelId"));
		return idNo;
	}
	
	/** 
	 * 获取操作日志rowkey
	* @date: 2017-3-10 
	* @author: yueyi
	* @title: getOperLogInfoRowKey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/	
	@Override
	public String getOperLogInfoRowKey(Map<String, Object> inParam) {
		String seqId = (String) inParam.get("serialId");
		String operNo = (String) inParam.get("operNo");
		String hash = (String) MD5RowKeyGenerator.generatePrefix(operNo);	
		String rowKey = operNo + Const.SEPARATOR_COLON + hash + Const.SEPARATOR_COLON + seqId;			
		return rowKey;
	}

	/**
	 * 得到短信推送到达rowkey
	* @date: 2017-2-22 
	* @author: tangaq
	* @title: getPushArriveRowKey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getPushArriveRowKey(Map<String, Object> tempInParam) {
		String idNo = (String)tempInParam.get("ID_NO");
		String seqId = (String)tempInParam.get("SEQ_ID");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo + Const.SEPARATOR_COLON + seqId;
		return rowKey;
	}

	/**
	 * 
	* @date: 2017-1-9 
	* @author: sunliang 
	* @title: getWaitSendBatchPushTaskRowKey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getWaitSendBatchPushTaskRowKey(Map<String, Object> tempInParam) {
		String marketCaseId = (String)tempInParam.get("marketCaseId");
		String taskId = (String)tempInParam.get("taskId");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(taskId);
		
		String rowKey = marketCaseId+ Const.SEPARATOR_COLON
				+ hash + Const.SEPARATOR_COLON
				+ taskId;
		return rowKey;
	}

	/** 
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: getReceiptRecordRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public String getReceiptRecordRowkey(Map<String, Object> tempInParam) {
		String idNo = (String)tempInParam.get("ID_NO");
		String seqId = (String)tempInParam.get("SEQ_ID");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo + Const.SEPARATOR_COLON + seqId;
		return rowKey;
	}

	/** 推荐关闭表rowKey
	* @date: 2017-1-16 
	* @author: wangpei
	* @title: getRecommendCloseRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public String getRecommendCloseRowkey(Map<String, Object> tempInParam) {
		String idNo= (String) tempInParam.get("idNo");
		String marketCaseId= (String) tempInParam.get("marketCaseId");
		String channelId = (String) tempInParam.get("channelId");
		String hash = (String) MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo + Const.SEPARATOR_COLON + marketCaseId + Const.SEPARATOR_COLON+ channelId;
		return rowKey;
	}

	/** 获取推荐记录表rowKey
	* @date: 2017-1-16 
	* @author: wangpei
	* @title: getRecommendRecordRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public String getRecommendRecordRowkey(Map<String, Object> tempInParam) {
		String idNo = (String)tempInParam.get("idNo");
		String seqId = (String)tempInParam.get("seqId");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo + Const.SEPARATOR_COLON + seqId;
		return rowKey;
	}
	
    /**
     * 获取短信上行信息
    * @date: 2017-2-22 
    * @author: tangaq
    * @title: getSMSPullRowkey 
    * @param tempInParam
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	@Override
	public String getSMSPullRowkey(Map<String, Object> tempInParam) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	* @date: 2017-4-1 
	* @author: sunyuan
	* @title: getUserAcceptMarketCaseRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getUserAcceptMarketCaseRowkey(Map<String,Object> tempInParam){
		String idNo = (String)tempInParam.get("idNo");
		String marketCaseId = (String)tempInParam.get("marketCaseId");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo + Const.SEPARATOR_COLON + marketCaseId;
		log.debug("===HbaseRowKey.getUserAcceptMarketCaseRowkey.rowKey===", rowKey);
		return rowKey;
	}
	
	/** 
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: getUserRecommendControlByBatchNoRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public String getUserRecommendControlByBatchNoRowkey(Map<String, Object> tempInParam) {
		String idNo = (String)tempInParam.get("idNo");
		String batchNo = (String)tempInParam.get("batchNo");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo + Const.SEPARATOR_COLON + batchNo;
		return rowKey;
	}

	/** 
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: getUserRecommendControlByChannelRowkey 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public String getUserRecommendControlByChannelRowkey(
			Map<String, Object> tempInParam) {
		String idNo = (String)tempInParam.get("idNo");
		String marketCaseId = (String)tempInParam.get("marketCaseId");
		String channelId = (String)tempInParam.get("channelId");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(idNo);
		String rowKey = hash + Const.SEPARATOR_COLON + idNo + Const.SEPARATOR_COLON + marketCaseId + Const.SEPARATOR_COLON + channelId;
		return rowKey;
	}

	
	/**
	 * 
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: getSelectWaitSendBatchPushTaskRowKey 
	* @param inParam
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getSelectWaitSendBatchPushTaskRowKey(
			Map<String, Object> inParam, Map<String, Object> tempInParam) {
		String marketCaseIdAndCount = (String)tempInParam.get("marketCaseId");
		
		String prefixRowkey = marketCaseIdAndCount==null?null:marketCaseIdAndCount.split(Const.SEPARATOR_COLON)[0];
		return prefixRowkey;
	}

}
