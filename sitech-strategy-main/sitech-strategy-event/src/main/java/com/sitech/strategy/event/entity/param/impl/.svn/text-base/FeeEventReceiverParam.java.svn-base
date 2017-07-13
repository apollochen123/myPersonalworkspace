package com.sitech.strategy.event.entity.param.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.event.base.BaseClass;
import com.sitech.strategy.event.entity.param.inter.IFeeEventReceiverParam;

/**
 * 费用类事件参数处理
* @date: 2017-2-10 
* @author: sunyuan
* @title: FeeEventReceiverParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class FeeEventReceiverParam extends BaseClass implements IFeeEventReceiverParam,Serializable{

	/**
	 * 接收缴费事件参数处理
	* @date: 2017-2-10 
	* @author: sunyuan
	* @title: receiveFeeMsgEventParam 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-3-1 luogj 增加seqId
	 */
	@Override
	public Map<String, Object> receiveFeeEventInParam(Object inParam) {
		Map<String,Object> root = JsonUtil.JsonStrToMap((String)inParam);
		Map<String,Object> res = (Map<String,Object>)root.get("ROOT");
		Map<String,Object> body = (Map<String,Object>)res.get("BODY");
		Map<String,Object> outMap = new HashMap<String,Object>();
		Map<String,Object> commonInfo = (Map<String, Object>) body.get("COMMON_INFO");
		outMap.put("channelId", CommonUtils.objectIsNull(body.get("CHANNEL_ID"))?"":body.get("CHANNEL_ID"));
		outMap.put("phoneNo", CommonUtils.objectIsNull(body.get("PHONE_NO"))?"":body.get("PHONE_NO"));
		outMap.put("regionCode", CommonUtils.objectIsNull(body.get("REGION_CODE"))?"":body.get("REGION_CODE"));
		outMap.put("eventType", CommonUtils.objectIsNull(body.get("EVENT_TYPE"))?"":body.get("EVENT_TYPE"));
		outMap.put("eventClass", CommonUtils.objectIsNull(body.get("EVENT_CLASS"))?"":body.get("EVENT_CLASS"));
		outMap.put("eventId", CommonUtils.objectIsNull(body.get("EVENT_ID"))?"":body.get("EVENT_ID"));
		outMap.put("eventName", CommonUtils.objectIsNull(body.get("PHONE_NO"))?"":body.get("PHONE_NO"));
		outMap.put("eventValue", CommonUtils.objectIsNull(body.get("EVENT_VALUE"))?"":body.get("EVENT_VALUE"));
		outMap.put("eventTriggerChannelId", CommonUtils.objectIsNull(body.get("EVENT_SOURCE"))?"":body.get("EVENT_SOURCE"));
		outMap.put("seqId", CommonUtils.objectIsNull(body.get("SEQ_ID"))?"":body.get("SEQ_ID"));
		outMap.put("contractNo", CommonUtils.objectIsNull(body.get("ACCOUNT_NO"))?"":body.get("ACCOUNT_NO"));
		return outMap;
	}
	
}
