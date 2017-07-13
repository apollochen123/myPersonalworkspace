package com.sitech.strategy.process.entity.impl;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IChannel;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.inter.IChannelProcessEntity;

/**
 * 渠道实体
* @date: 2016-11-29 
* @author: yangwl
* @title: ChannelProcessEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ChannelProcessEntity extends BaseProcessEntity implements IChannelProcessEntity{

	/**
	 * 渠道对象
	 */
	protected IChannel channel;
	/**
	 * 渠道插入操作接口
	 */
	protected IDataInsertor.IChannelInsertor channelInsertor;
	/**
	 * 渠道查询操作接口
	 */
	protected IDataSelector.IChannelSelector channelSelector;
	
	/**
	 * 
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: setChannel 
	* @param channel 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannel(IChannel channel) {
		this.channel = channel;
	}
	
	/**
	 * 
	* @date: 2016-11-29 
	* @author: yangwl
	* @title: setChannelInsertor 
	* @param channelInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelInsertor(IDataInsertor.IChannelInsertor channelInsertor) {
		this.channelInsertor = channelInsertor;
	}
	
	/**
	 * 
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: setChannelSelector 
	* @param channelSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelSelector(IDataSelector.IChannelSelector channelSelector) {
		this.channelSelector = channelSelector;
	}

	/**
	 * 加载渠道展示数量到缓存
	* @date: 2016-11-29 
	* @author: yangwl
	* @title: loadChannelShowToCache 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void loadChannelShowNumToCache()throws StrategyError{

		//查询渠道展示数量
		List<Map<String, Object>> channelShowNumList = channelSelector.selectChannelShowNum();
		//解析渠道展示数量缓存
		Map<String, Object> channelShowNumCache = this.parseChannelShowNumCache(channelShowNumList);
		//加载渠道展示数量缓存
		this.addChannelShowNumToCache(channelShowNumCache);
	}
	
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
	protected void addChannelShowNumToCache(Map<String, Object> channelShowNumCache) throws StrategyError{
		channel.addChannelShowNumToCache(channelShowNumCache);
	}
	
	/**
	 * 解析渠道展示数据缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: parseChannelShowNumCache 
	* @param channelShowNumList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> parseChannelShowNumCache(List<Map<String,Object>> channelShowNumList) throws StrategyError{
		return channel.parseChannelShowNumCache(channelShowNumList);
	}
}
