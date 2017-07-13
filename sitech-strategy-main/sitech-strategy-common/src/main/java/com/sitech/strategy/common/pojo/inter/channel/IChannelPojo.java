package com.sitech.strategy.common.pojo.inter.channel;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 渠道pojo
* @date: 2016-12-20 
* @author: sunliang 
* @title: IChannelPojo 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IChannelPojo {
	
	/**
	 * 通过渠道ID得到场景类型
	* @date: 2016-12-20 
	* @author: sunliang 
	* @title: getSceneTypeByChannelId 
	* @param channelId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getSceneTypeByChannelId(String channelId);
	
	/**
	 * 得到渠道展示数量
	* @date: 2017-2-28 
	* @author: sunliang 
	* @title: channelShowNumList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getChannelShowNum(Map<String,Object> inParam,List<Map<String, Object>> channelShowNumList);
	
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
	public int isChannelShowNum(Map<String, Object> marketCaseBasicMap,
			Map<String, Object> showNumMap) throws StrategyError;

}
