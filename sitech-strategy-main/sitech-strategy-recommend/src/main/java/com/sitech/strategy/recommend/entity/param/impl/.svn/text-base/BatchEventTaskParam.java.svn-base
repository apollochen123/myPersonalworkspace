package com.sitech.strategy.recommend.entity.param.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.recommend.base.BaseRecommendEntity;
import com.sitech.strategy.recommend.entity.param.inter.IBatchEventTaskParam;

/**
 * 批量事件任务参数处理
* @date: 2017-2-8 
* @author: sunliang 
* @title: BatchEventTaskParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class BatchEventTaskParam extends BaseRecommendEntity implements IBatchEventTaskParam {

	/**
	 * 发送批量事件任务入参处理
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: getSendBatchEventTaskInParam 
	* @param processId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getSendBatchEventTaskInParam(String processId) {
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("processId", processId);
		inParam.put("sendDate", DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1));
		return inParam;
	}

}
