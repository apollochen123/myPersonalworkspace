package com.sitech.strategy.manage.entity.impl;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IInventory;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IInventoryManageEntity;

/**
 * 清单
* @date: 2017-1-12 
* @author: zhangjj_crmpd
* @title: InventoryManageEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class InventoryManageEntity extends BaseManageEntity implements IInventoryManageEntity{

	/**
	 * 清单对象
	 */
	protected IInventory  inventory;
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: setInventory 
	* @param inventory 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setInventory(IInventory inventory) {
		this.inventory = inventory;
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
			Map<String, Object> inParam) throws StrategyError {
		return inventory.queryInventoryListByPage(inParam);
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
	public Map<String, Object> saveInventoryInfo(Map<String, Object> inParam)
			throws StrategyError {
		return inventory.saveInventoryInfo(inParam);
	}		

}
