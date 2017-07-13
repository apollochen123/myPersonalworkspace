package com.sitech.strategy.recommend.entity.param.impl.extend;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.recommend.entity.param.impl.EventReceiverParam;
import com.sitech.strategy.recommend.entity.param.inter.IEventReceiverParam;

/**
 * 事件接收参数处理
* @date: 2017-2-26 
* @author: sunliang 
* @title: EventReceiverParamByJLMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class EventReceiverParamByJLMob extends EventReceiverParam implements
		IEventReceiverParam {
	
	/**
	 * 解析事件触发推荐参数
	* @date: 2017-2-14 
	* @author: sunliang 
	* @title: parseEventTriggerRecommendParam 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> parseEventTriggerRecommendParam(Object inParam) throws StrategyError{
		JSONObject eventReceiverMsg = JSONObject.parseObject((String) inParam);
		Map<String, Object> newParam = new HashMap<String, Object>();
		newParam.put("eventIdList", eventReceiverMsg.get("EVENT_ID_LIST"));
		newParam.put("phoneNo", eventReceiverMsg.get("PHONE_NO"));
		log.info("-----------------phone-------------------", eventReceiverMsg.get("PHONE_NO"));
		newParam.put("evnetTriggerChannelId", eventReceiverMsg.get("EVENT_TRIGGER_CHANNEL_ID"));
		newParam.put("contractNo", eventReceiverMsg.get("CONTRACT_NO"));
		newParam.put("seqId", eventReceiverMsg.get("SEQ_ID"));
		newParam.put("flag", "event");
		newParam.put("channelId","11");

		Map<String,Object> tempParam = new HashMap<String,Object>();
		tempParam.put("numType", Const.NUM_TYPE_PHONE_NO);
		tempParam.put("numValue", newParam.get("phoneNo"));
		
		System.out.println("==============parseEventTriggerRecommendParam.numType============" + tempParam.get("numType"));
		System.out.println("==============parseEventTriggerRecommendParam.numValue===========" + tempParam.get("numValue"));
		
		//查询用户号码信息
		List<Map<String,Object>> userList = user.queryUserNo(tempParam);
		newParam.put("userList", userList);
		
		System.out.println("==============parseEventTriggerRecommendParam.newParam============" + newParam);
		
		return newParam;
	}

}
