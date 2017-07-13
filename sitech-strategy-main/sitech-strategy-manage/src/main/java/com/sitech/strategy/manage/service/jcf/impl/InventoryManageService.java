package com.sitech.strategy.manage.service.jcf.impl;

import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageService;
import com.sitech.strategy.manage.base.basedto.StandardInDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.inter.IInventoryManageEntity;
import com.sitech.strategy.manage.entity.inter.ITaskManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IInventoryManageParam;
import com.sitech.strategy.manage.entity.param.inter.ITaskManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IInventoryManageService;
import com.sitech.strategy.manage.service.jcf.inter.ITaskManageService;

@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryInventoryListByPage", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveInventoryInfo", oc = StandardOutDTO.class)
})
/**
 * 任务
* @date: 2016-12-14 
* @author: zhangjj_crmpd
* @title: TaskManageService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class InventoryManageService extends BaseManageService implements IInventoryManageService {

	protected IInventoryManageEntity inventoryManageEntity;
	
	protected IInventoryManageParam inventoryManageParam;

	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: setInventoryManageEntity 
	* @param inventoryManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setInventoryManageEntity(
			IInventoryManageEntity inventoryManageEntity) {
		this.inventoryManageEntity = inventoryManageEntity;
	}

	/**
	 * 
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: setInventoryManageParam 
	* @param inventoryManageParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setInventoryManageParam(IInventoryManageParam inventoryManageParam) {
		this.inventoryManageParam = inventoryManageParam;
	}

	/**
	 * 分页查询清单列表
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: queryInventoryListByPage 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryInventoryListByPage(InDTO inDTO) {
		StandardOutDTO out = new StandardOutDTO();
		try {
			Map<String,Object> inParam =inventoryManageParam.queryInventoryListByPageInParam(inDTO);
			Map<String,Object> outParam = inventoryManageEntity.queryInventoryListByPage(inParam);
			out = inventoryManageParam.queryInventoryListByPageOutParam(outParam); 
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return out;
	}

	/**
	 * 保存清单信息
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: saveInventoryInfo 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveInventoryInfo(InDTO inDTO) {
		StandardOutDTO out = new StandardOutDTO();
		try {
			Map<String,Object> inParam =inventoryManageParam.saveInventoryInParam(inDTO);
			Map<String,Object> outParam = inventoryManageEntity.saveInventoryInfo(inParam);
			out = inventoryManageParam.saveInventoryInfoOutParam(outParam);  
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return out;
	}
	


}
