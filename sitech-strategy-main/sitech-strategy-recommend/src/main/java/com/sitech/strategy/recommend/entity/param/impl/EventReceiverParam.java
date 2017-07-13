package com.sitech.strategy.recommend.entity.param.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IUser;
import com.sitech.strategy.recommend.base.BaseRecommendEntity;
import com.sitech.strategy.recommend.entity.param.inter.IEventReceiverParam;

/** 
 * 事件接收参数处理
* @date: 2016-11-29 
* @author: songxj
* @title: EventReceiverParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note: 
*/
public class EventReceiverParam extends BaseRecommendEntity implements
		IEventReceiverParam, Serializable {
	
	/**
	 * 用户对象
	 */
	protected IUser user;

	/**
	 * 
	* @date: 2017-2-13 
	* @author: sunliang 
	* @title: setUser 
	* @param user 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUser(IUser user) {
		this.user = user;
	}

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
		Map<String, Object> outParam = new HashMap<String, Object>();
		outParam.put("eventID", eventReceiverMsg.get("eventID"));
		outParam.put("idNo", eventReceiverMsg.get("idNo"));
		outParam.put("regionCode", eventReceiverMsg.get("regionCode"));
		outParam.put("prodId", eventReceiverMsg.get("prodId"));
		outParam.put("oId", eventReceiverMsg.get("oId"));
		outParam.put("queryDate", eventReceiverMsg.get("queryDate"));
		
		Map<String,Object> tempParam = new HashMap<String,Object>();
		tempParam.put("numType", "1002");
		tempParam.put("numValue", eventReceiverMsg.get("idNo"));
		
		//查询用户号码信息
		List<Map<String,Object>> userList = user.queryUserNo(tempParam);
		outParam.put("userList", userList);
		
		return outParam;
	}

}
