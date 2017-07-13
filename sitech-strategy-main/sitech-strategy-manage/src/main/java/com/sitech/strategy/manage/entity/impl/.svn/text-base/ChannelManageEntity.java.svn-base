package com.sitech.strategy.manage.entity.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.SortParamer;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IChannel;
import com.sitech.strategy.core.objectville.inter.IPosition;
import com.sitech.strategy.core.pojo.impl.ResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IChannelManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 渠道实体
* @date: 2016-9-5 
* @author: sunliang
* @title: ChannelManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ChannelManageEntity extends BaseManageEntity implements IChannelManageEntity {
	
	/**
	 * 渠道对象
	 */
	protected IChannel channel;
	/**
	 * 运营位对象
	 */
	protected IPosition position;
	/**
	 * 查询列表对象
	 */
	protected ResultList resultList;
	/**
	 * 渠道查询对象
	 */
	protected IDataSelector.IChannelSelector channelSelector;
	/**
	 * 渠道更新对象
	 */
    protected IDataUpdater.IChannelUpdater channelUpdater;	
	/**
	 * 运营位删除对象
	 */
	protected IDataDeleter.IPositionDeleter positionDeleter;
	/**
	 * 运营位插入对象
	 */
	protected IDataInsertor.IPositionInsertor positionInsertor;
	/**
	 * 运营位查询对象
	 */
	protected IDataSelector.IPositionSelector positionSelector;
	/**
	 * 运营位更新对象
	 */
	protected IDataUpdater.IPositionUpdater positionUpdater;
	/**
	 * 渠道显示插入对象
	 */
	protected IDataInsertor.IChannelShowInsertor channelShowInsertor;
	/**
	 * 渠道显示删除对象
	 */
	protected IDataDeleter.IChannelShowDeleter channelShowDeleter;
	/**
	 * 渠道显示更新对象
	 */
	protected IDataUpdater.IChannelShowUpdater channelShowUpdater;
	
	/**
	 * 
	* @date: 2016-11-17 
	* @author: tangaq
	* @title: setChannelUpdater 
	* @param channelUpdater 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelUpdater(IDataUpdater.IChannelUpdater channelUpdater) {
		this.channelUpdater = channelUpdater;
	}

	/**
	 * 
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: setChannelShowDeleter 
	* @param channelShowDeleter 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelShowDeleter(
			IDataDeleter.IChannelShowDeleter channelShowDeleter) {
		this.channelShowDeleter = channelShowDeleter;
	}
	
	/**
	 * 
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: setChannelShowUpdater 
	* @param channelShowUpdater 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelShowUpdater(
			IDataUpdater.IChannelShowUpdater channelShowUpdater) {
		this.channelShowUpdater = channelShowUpdater;
	}
	
	/**
	 * 
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: setPosition 
	* @param position 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPosition(IPosition position) {
		this.position = position;
	}

	/**
	 * 
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: setResultList 
	* @param resultList 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setResultList(ResultList resultList) {
		this.resultList = resultList;
	}

	/** 
	 * @date: 2016-10-17 
	 * @author: wangpei
	 * @title: setChannel 
	 * @param channel the channel to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setChannel(IChannel channel) {
		this.channel = channel;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: fangyuan_crmpd
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
	 * 
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: setChannelShowInsertor 
	* @param channelShowInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelShowInsertor(
			IDataInsertor.IChannelShowInsertor channelShowInsertor) {
		this.channelShowInsertor = channelShowInsertor;
	}

	/**
	 * 
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: setPositionDeleter 
	* @param positionDeleter 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPositionDeleter(IDataDeleter.IPositionDeleter positionDeleter) {
		this.positionDeleter = positionDeleter;
	}

	/**
	 * 
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: setPositionInsertor 
	* @param positionInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPositionInsertor(IDataInsertor.IPositionInsertor positionInsertor) {
		this.positionInsertor = positionInsertor;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: fangyuan_crmpd
	* @title: setPositionSelector 
	* @param positionSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPositionSelector(IDataSelector.IPositionSelector positionSelector) {
		this.positionSelector = positionSelector;
	}
	
	/**
	 * 
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: setPositionUpdater 
	* @param positionUpdater 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPositionUpdater(IDataUpdater.IPositionUpdater positionUpdater) {
		this.positionUpdater = positionUpdater;
	}

	/**
	 * 查询渠道列表
	* @date: 2016-9-5 
	* @author: fangyuan_crmpd
	* @title: queryChannelList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryChannelList(Map<String, Object> inParam)
			throws StrategyError {
		QueryFilter queryFilter = this.settleChannelListFilter(inParam);
		return channelSelector.selectChannelInfo(inParam,queryFilter);
	}
	
	/**
	 * 查询运营位
	* @date: 2016-9-5 
	* @author: fangyuan_crmpd
	* @title: queryPositionListByChannel 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryPositionListByChannel(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = this.settlePositionListFilter(inParam);
		Map<String, Object> outMap = (Map<String, Object>) positionSelector.selectPositionInfo(inParam,queryFilter);
		return outMap;
	}
	
	/**
	 * 查询运营位列表
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: queryPositionList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryPositionList(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter =this.settlePositionListFilter(inParam);
		IPagingDevice pagingDevice = new PagingDevice();
		ISortParamer sortParamer = new SortParamer();
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice.getInstance(inParam));
		Map<String,Object> outParam = this.getPositionListByPagingDevice(pagingDeviceTmp);
		return outParam;
	}
	
	/**
	 * 查询运营位属性信息
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: queryPositionAttrList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryPositionAttrList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setRelId((String)inParam.get("relId"));
		List<Map<String,Object>> list = positionSelector.selectPositionAttrInfo(inParam, queryFilter);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("positionAttrList", list);
		return map;
	}
	
	/**
	 * 查询渠道显示列表
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: queryChannelShowList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryChannelShowList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = this.settleChannelShowListFilter(inParam);
		ISortParamer sortParamer = this.settleChannelShowListSort(inParam);
		IPagingDevice pagingDevice = this.settleChannelShowListPagingDevice(inParam);
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice);
		Map<String,Object> outParam = this.getChannelShowListByPagingDevice(pagingDeviceTmp);	
		return outParam;
	}
	
	/** 删除客户群渠道
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: removeCustGroupChannelAndDetail 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void removeCustGroupChannelAndDetail(Map<String, Object> inParam)
			throws StrategyError {
		channel.removeCustGroupChannel(inParam);
	}

	/**
	 * 删除渠道显示
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: removeChannelShow 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeChannelShow(Map<String, Object> inParam)
			throws StrategyError {
		channelShowDeleter.deleteChannelShowInfo(inParam);
	}
	
	/**
	 * 移除运营位信息
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: removePosition 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removePosition(Map<String, Object> inParam)
			throws StrategyError {
		position.removePositionById(inParam);
	}
	
	/**
	 * 移除运营位属性信息
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: removePositionAttr 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removePositionAttr(Map<String, Object> inParam)
			throws StrategyError {
		positionDeleter.deletePositionAttrInfo(inParam);
	}
	
	/**
	 * 新增渠道
	* @date: 2016-9-27 
	* @author: fangyuan_crmpd
	* @title: saveChannel 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveChannel(Map<String, Object> inParam) throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.putAll(inParam);
		channel.addChannelInfo(inParam, tempInParam);
	}

	/**
	 * 新增渠道显示
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: saveChannelShow 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveChannelShow(Map<String, Object> inParam)
			throws StrategyError {
		Map<String,Object> tempInParam = this.settleSaveChannelShowMap(inParam);
		channelShowInsertor.insertChannelShowInfo(inParam, tempInParam);	
	}
	
	/**
	 * 添加运营位信息
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: addPosition 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void savePosition(Map<String, Object> inParam) throws StrategyError {
		position.addPositionInfo(inParam);
	}

	/**
	 * 保存运营位属性信息
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: savePositionAttr 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void savePositionAttr(Map<String, Object> inParam)
			throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		positionDeleter.deletePositionAttrInfo(inParam);
		positionInsertor.insertPositionAttrInfo(inParam, tempInParam);
	}
	
	/**
	 * 更新渠道信息
	* @date: 2016-11-17 
	* @author: tangaq
	* @title: updateChannelInfo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateChannelInfo(Map<String, Object> inParam)
			throws StrategyError {
		channelUpdater.updateChannelInfo(inParam);
	}

	/**
	 * 更新渠道显示
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: updateChannelShow 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateChannelShow(Map<String, Object> inParam)
			throws StrategyError {
		channelShowUpdater.updateChannelShowInfo(inParam);	
	}
	
	/**
	 * 更新运营位信息
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: updatePosition 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updatePosition(Map<String, Object> inParam)
			throws StrategyError {
		position.updatePositionById(inParam);
	}
	
	/**
	 * 更新运营位属性信息
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: updatePositionAttr 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updatePositionAttr(Map<String, Object> inParam)
			throws StrategyError {
		positionUpdater.updatePositionAttrInfo(inParam);
	}
	
	/**
	 * 通过分页器获得运营位列表
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: getPositionListByPagingDevice 
	* @param pagingDevice
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getPositionListByPagingDevice(IPagingDevice pagingDevice){
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("currentPageCode", pagingDevice.getCurrentPageCode());
		outParam.put("perRecordCount", pagingDevice.getPerRecordCount());
		outParam.put("totalRecordCount", pagingDevice.getTotalRecordCount());
		outParam.put("positionList", pagingDevice.getPerPageInfo());
		outParam.put("queryId", pagingDevice.getQueryId());
	    return outParam;
	}
	
	/**
	 * 新增触点显示入参转换为Map
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: settlesaveChannelShowMap 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> settleSaveChannelShowMap(Map<String,Object> inParam){
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("channelId", inParam.get("channelId"));
		tempInParam.put("serialId", inParam.get("serialId"));
		tempInParam.put("areaFlag", inParam.get("areaFlag"));
		tempInParam.put("marketCaseType", inParam.get("marketCaseType"));
		tempInParam.put("marketCaseFlag", inParam.get("marketCaseFlag"));
		tempInParam.put("areaNo", inParam.get("areaNo"));
		tempInParam.put("totalNo", inParam.get("totalNo"));
		return tempInParam;
	}

	/**
	 * 查询渠道显示列表入参转换为  IQueryFilter
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: settleChannelShowListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleChannelShowListFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setChannelId((String)inParam.get("channelId"));
		return queryFilter;
	}
	
	/**
	 * 查询渠道显示列表入参转换为 ISortParamer
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: settleChannelShowListSort 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settleChannelShowListSort(Map<String, Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		return sortParamer;
	}
	
	/**
	 *  查询渠道显示列表入参转换为 IPagingDevice
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: settleChannelShowListPagingDevice 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleChannelShowListPagingDevice(Map<String, Object> inParam){
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPageCode = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		pagingDevice.setQueryId((String)inParam.get("queryId"));
		
		if(CommonUtils.objectIsNull(currentPageCode)==true){
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}else{
			pagingDevice.setCurrentPageCode(Integer.parseInt(currentPageCode));
		}
	
		if(CommonUtils.objectIsNull(perRecordCount)==true){
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}else{
			pagingDevice.setPerRecordCount(Integer.parseInt(perRecordCount));
	
		}
		
		if(CommonUtils.objectIsNull(totalRecordCount)==true){
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}else{
			pagingDevice.setTotalRecordCount(Integer.parseInt(totalRecordCount));
	
		}
		return pagingDevice;
	}
	
	/**
	 * 查询渠道显示列表出参转换为 Map
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: getChannelShowListByPagingDevice 
	* @param pagingDevice
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getChannelShowListByPagingDevice(IPagingDevice pagingDevice){
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("currentPageCode", pagingDevice.getCurrentPageCode());
		outParam.put("perRecordCount", pagingDevice.getPerRecordCount());
		outParam.put("totalRecordCount", pagingDevice.getTotalRecordCount());
		outParam.put("channelShowList", pagingDevice.getPerPageInfo());
		outParam.put("queryId", pagingDevice.getQueryId());
	    return outParam;
	}
	
	/**
	 * 形成QueryFilter对象(查询渠道列表)
	* @date: 2016-9-13 
	* @author: fangyuan_crmpd
	* @title: settleChannelListFilter 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected QueryFilter settleChannelListFilter(Map<String,Object> inParam){
		return null;
	}
	
	/**
	 * 形成QueryFilter对象
	* @date: 2016-9-13 
	* @author: wangth
	* @title: settlePositionListFilter 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected IQueryFilter settlePositionListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setPositionId((String)inParam.get("positionId"));
		queryFilter.setChannelId((String)inParam.get("channelId"));
		queryFilter.setPositionType((String)inParam.get("positionType"));
		if(!CommonUtils.objectIsNull(inParam.get("keyWords")) ){
			queryFilter.setKeyWords((List<String>)inParam.get("keyWords"));
		}
		return queryFilter;
	}
}
