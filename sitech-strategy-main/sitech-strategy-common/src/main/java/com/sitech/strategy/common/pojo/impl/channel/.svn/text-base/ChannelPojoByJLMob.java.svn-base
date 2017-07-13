package com.sitech.strategy.common.pojo.impl.channel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.channel.IChannelPojo;
import com.sitech.strategy.common.utils.StrategyError;

/**
 *  渠道pojo
* @date: 2017-2-28 
* @author: sunliang 
* @title: ChannelPojoByJLMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ChannelPojoByJLMob extends ChannelPojo implements IChannelPojo {
	
	/**
	 * 得到渠道展示数量
	* @date: 2017-2-28 
	* @author: sunliang 
	* @title: getChannelShowNum 
	* @param channelShowNumList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getChannelShowNum(Map<String,Object> inParam,List<Map<String, Object>> channelShowNumList) {
		Map<String,Object> channelShowNumMap = new HashMap<String,Object>();
		channelShowNumMap.put("totalShowNum", "3");
		channelShowNumMap.put("checkShowNum", "0");
		return channelShowNumMap;
	}
	
	/**
	 * 校验展示数量
	* @date: 2017-2-28 
	* @author: sunliang 
	* @title: isChannelShowNum 
	* @param marketCaseBasicMap
	* @param showNumMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public int isChannelShowNum(Map<String, Object> marketCaseBasicMap,
			Map<String, Object> showNumMap) throws StrategyError {
		log.debug("isChannelShowNum end", showNumMap);
		int flag = 1;//0-活动不展示服务返回，1-活动展示服务继续
		int totalShowNum = Integer.parseInt((String)showNumMap.get("totalShowNum"));
		int checkShowNum = Integer.parseInt((String)showNumMap.get("checkShowNum"));
		if(totalShowNum > checkShowNum){
			checkShowNum = checkShowNum + 1;
			showNumMap.put("checkShowNum", checkShowNum + "");
		}else {
			flag = 0;
		}
		log.debug("isChannelShowNum end", showNumMap);
		return flag;
	}

}
