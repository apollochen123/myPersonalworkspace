package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 渠道对象
* @date: 2016-9-5 
* @author: yangwl
* @title: IChannel 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IChannel {
	
	/**
	 * 添加渠道基本信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addChannelInfo 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addChannelInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 加载渠道展示数量到缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: addChannelShowNumToCache 
	* @param channelShowNumCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addChannelShowNumToCache(Map<String, Object> channelShowNumCache) throws StrategyError;
	
	/**
	 * 
	* @date: 2017-2-28 
	* @author: sunliang 
	* @title: getChannelShowNum 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> getChannelShowNum(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 校验运营位
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: isPositionId 
	* @param inParam
	* @param componentIdBaseContent
	* @param positionInfoMap
	* @param marketCaseCachePojo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean isPositionId(Map<String, Object> inParam,
			String componentIdBaseContent, Map<String, Object> positionInfoMap,
			IMarketCaseCachePojo marketCaseCachePojo);
	
	/**
	 * 解析渠道展示数量缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: parseChannelShowNumCache 
	* @param channelShowNumList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> parseChannelShowNumCache(List<Map<String,Object>> channelShowNumList) throws StrategyError;
	
	/**
	 * 查询渠道信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: queryChannelById 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryChannelById(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 查询渠道显示列表
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: queryChannelShowList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryChannelShowList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;  
	
	/**
	 * 移除除渠道信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: removeChannelById 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeChannelById(Map<String,Object> inParam) throws StrategyError;
	
	/** 删除客户群下渠道
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: removeCustGroupChannel 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void removeCustGroupChannel(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 更新渠道信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: updateChannelById 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateChannelById(Map<String,Object> inParam) throws StrategyError;
	
}
