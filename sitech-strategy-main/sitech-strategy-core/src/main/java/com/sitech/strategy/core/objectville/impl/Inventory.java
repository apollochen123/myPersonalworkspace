package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IEvent;
import com.sitech.strategy.core.objectville.inter.IInventory;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;


public class Inventory extends BaseClass implements IInventory, Serializable {
	
	/**
	 * 清单插入对象
	 */
	protected IDataInsertor.IInventoryInsertor inventoryInsertor;
	/**
	 * 清单删除对象
	 */
	protected IDataSelector.IInventorySelector inventorySelector;
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: setInventoryInsertor 
	* @param inventoryInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setInventoryInsertor(
			IDataInsertor.IInventoryInsertor inventoryInsertor) {
		this.inventoryInsertor = inventoryInsertor;
	}

	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: setInventorySelector 
	* @param inventorySelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setInventorySelector(
			IDataSelector.IInventorySelector inventorySelector) {
		this.inventorySelector = inventorySelector;
	}

	/**
	 * 分页查询清单列表
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: queryInventoryListByPage 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryInventoryListByPage(
			Map<String, Object> inParam)
			throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.putAll(inParam);
		PagingDevice pageDevice = new PagingDevice();
		Integer currentPageCode =Integer.parseInt(CommonUtils.toString(tempInParam.get("currentPageCode")));
		tempInParam.put("startPage", currentPageCode);
		tempInParam.put("limit", pageDevice.getPerRecordCount());
		Map<String, Object> outMap = inventorySelector.selectInventoryInfoListByPage(inParam, tempInParam);
		outMap.put("currentPageCode", currentPageCode.toString());
		return outMap;
	}
	
	/**
	 * 保存清单信息
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: saveInventoryInfo 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> saveInventoryInfo(Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.putAll(inParam);
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("operTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));
		tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_DEFAULT);
		inventoryInsertor.insertInventoryInfo(inParam, tempInParam);
		return tempInParam;
	}
	

}
