package com.sitech.strategy.recommend.entity.param.impl.extend;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.recommend.entity.param.impl.BatchPushTaskParam;
import com.sitech.strategy.recommend.entity.param.inter.IBatchPushTaskParam;

/**
 * 
* @date: 2017-2-9 
* @author: sunliang 
* @title: BatchPushTaskParamByHBMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class BatchPushTaskParamByHBMob extends BatchPushTaskParam implements
		IBatchPushTaskParam {
	
	/**
	 * 发送批量事件任务入参处理
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: getSendBatchPushTaskInParam 
	* @param processId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getSendBatchPushTaskInParam(String processId) {
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("processId", processId);
		inParam.put("sendDate", DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1));
		return inParam;
	}

}
