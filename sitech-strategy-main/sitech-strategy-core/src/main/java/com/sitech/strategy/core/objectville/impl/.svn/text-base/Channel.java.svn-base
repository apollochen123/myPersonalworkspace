package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.regioncode.IRegionCodePojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IChannel;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 渠道对象
* @date: 2016-9-5 
* @author: yangwl
* @title: Channel 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class Channel extends BaseClass implements IChannel, Serializable {
	
	/**
	 * 渠道信息插入对象
	 */
	protected IDataInsertor.IChannelInsertor channelInsertor;
	
	/**
	 * 删除渠道信息对象
	 */
	protected IDataDeleter.IChannelDeleter channelDeleter;
	
	/**
	 * 更新渠道信息对象
	 */
	protected IDataUpdater.IChannelUpdater channelUpdater;
	
	/**
	 * 查询渠道信息对象
	 */
	protected IDataSelector.IChannelSelector channelSelector;
	/**
	 * 获取渠道代码
	 */
	protected IRegionCodePojo regionCodePojo;

	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setChannelInsertor 
	* @param channelInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelInsertor(IDataInsertor.IChannelInsertor channelInsertor) {
		this.channelInsertor = channelInsertor;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setChannelDeleter 
	* @param channelDeleter 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelDeleter(IDataDeleter.IChannelDeleter channelDeleter) {
		this.channelDeleter = channelDeleter;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setChannelUpdater 
	* @param channelUpdater 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelUpdater(IDataUpdater.IChannelUpdater channelUpdater) {
		this.channelUpdater = channelUpdater;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setChannelSelector 
	* @param channelSelector 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelSelector(IDataSelector.IChannelSelector channelSelector) {
		this.channelSelector = channelSelector;
	}
	
	/**
	 * 
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: setRegionCodePojo 
	* @param regionCodePojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRegionCodePojo(IRegionCodePojo regionCodePojo) {
		this.regionCodePojo = regionCodePojo;
	}

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
	@Override
	public void addChannelInfo(Map<String, Object> inParam,Map<String,Object> tempInParam)
			throws StrategyError {
		channelInsertor.insertChannelInfo(inParam,tempInParam);
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
	@Override
	public void addChannelShowNumToCache(Map<String, Object> channelShowNumCache)
			throws StrategyError {
		if(!CommonUtils.objectIsNull(channelShowNumCache)){
			for(Map.Entry<String, Object> channelShowNumMap : channelShowNumCache.entrySet()){
				Map<String, Object> tempParam = new HashMap<String, Object>();
				tempParam.put("channelId", channelShowNumMap.getKey());
				tempParam.put("channelShowNum", channelShowNumMap.getValue());
				channelInsertor.insertChannelShowNumToCache(tempParam);
			}
		}	
	}
	
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
	@Override
	public List<Map<String, Object>> getChannelShowNum(Map<String, Object> inParam)
			throws StrategyError {
		List<Map<String, Object>> channelShowNumList = channelSelector.getChannelShowNumFromCache(inParam);
		return channelShowNumList;
	}
	
	/**
	 * 
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
	@Override
	public boolean isPositionId(Map<String, Object> inParam,
			String componentIdBaseContent, Map<String, Object> positionInfoMap,
			IMarketCaseCachePojo marketCaseCachePojo) {
		Map<String,Object> marketCaseRel = marketCaseCachePojo.getMarketCaseRel();
		String marketCaseId = (String)(marketCaseCachePojo.getMarketCaseMap()).get("marketCaseId");
		Map<String, Object> marketCaseInfoRel = (Map<String, Object>)((Map<String, Object>)marketCaseRel.get(Const.COMPONENT_TYPE_MARKETCASE)).get(marketCaseId);
		Map<String,Object> channelMap = (Map<String,Object>)((Map<String,Object>)marketCaseInfoRel.get(Const.COMPONENT_TYPE_CUSTGROUP)).get(componentIdBaseContent);
		Map<String,Object> positionMap = (Map<String,Object>)((Map<String,Object>)channelMap.get(Const.COMPONENT_TYPE_CHANNEL)).get((String)inParam.get("channelId"));
		Set<String> positioIdSet = new HashSet<String>();
		if(!CommonUtils.objectIsNull(positionMap)){
			positioIdSet = ((Map<String,Object>)positionMap.get(Const.COMPONENT_TYPE_POSITION)).keySet();
			if (!CommonUtils.objectIsNull(positioIdSet)) {
				String positionId = (String)positionInfoMap.get("positionId");
				return positioIdSet.contains(positionId);
			}
		}	
		return false;
	}
	
	/**
	 * 查询渠道信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryChannelById 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryChannelById(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		Map<String,Object> channelBasic = new HashMap<String,Object>();
		List<Map<String,Object>> list = channelSelector.selectChannelInfo(inParam,queryFilter);
		if(!CommonUtils.objectIsNull(list)){
			channelBasic=list.get(0);
		}
		return channelBasic;
	}
	
	/**
	 * 查询渠道显示信息
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
	public List<Map<String,Object>> queryChannelShowList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		List<Map<String,Object>> list = channelSelector.selectChannelShowNum();
		return list;
	}
	
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
	@Override
	public Map<String, Object> parseChannelShowNumCache(
			List<Map<String, Object>> channelShowNumList) throws StrategyError {
		Map<String, Object> ret = new HashMap<String, Object>();
		if(!CommonUtils.objectIsNull(channelShowNumList)){
			//解析渠道set
			Set<String> channelList = new HashSet<String>();
			for(Map<String, Object> channelShow : channelShowNumList){
				channelList.add((String)channelShow.get("channelId"));
			}
			//按照渠道组装
			for(String channelId : channelList){
				List<Map<String, Object>> channelInfoList = new ArrayList<Map<String, Object>>();
				for(Map<String, Object> channelShow : channelShowNumList){
					if(channelId.equals((String)channelShow.get("channelId"))){
						channelInfoList.add(channelShow);
					}
				}
				ret.put(channelId, channelInfoList);
			}
		}	
		return ret;
	}
	
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
	@Override
	public void removeChannelById(Map<String,Object> inParam) throws StrategyError {
		channelDeleter.deleteChannelInfo(inParam);
	}
	
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
	@Override
	public void updateChannelById(Map<String,Object> inParam) throws StrategyError {
		channelUpdater.updateChannelInfo(inParam);
	}

	/** 
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
	@Override
	public void removeCustGroupChannel(Map<String, Object> inParam)
			throws StrategyError {
		channelDeleter.deleteCustGroupChannelRelation(inParam);
	}

}
