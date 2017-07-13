package com.sitech.strategy.common.pojo.impl.hbase;

import java.util.Map;

import com.sitech.strategy.common.pojo.inter.hbase.IHbaseRowKey;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.MD5RowKeyGenerator;

/**
 * hbase rowkeyr
* @date: 2017-1-9 
* @author: sunliang 
* @title: HbaseTablePojoByHBMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class HbaseRowKeyByHBMob extends HbaseRowKey implements IHbaseRowKey {
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
		String currentDate = (String)tempInParam.get("currentDate");
		String partition = tempInParam.get("partition")+"";
		String taskId = (String)tempInParam.get("taskId");
		String hash = (String)MD5RowKeyGenerator.generatePrefix(taskId);
		
		String rowKey = marketCaseId+ Const.SEPARATOR_COLON
				+ currentDate + Const.SEPARATOR_COLON
				+ partition + Const.SEPARATOR_COLON
				+ hash + Const.SEPARATOR_COLON
				+ taskId;
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
		String marketCaseId = (String)tempInParam.get("marketCaseId");
		String sendDate = (String)tempInParam.get("sendDate");
		String processId = (String)inParam.get("processId");
		String prefixRowkey = marketCaseId + Const.SEPARATOR_COLON +sendDate+Const.SEPARATOR_COLON+ processId;
		return prefixRowkey;
	}

}
