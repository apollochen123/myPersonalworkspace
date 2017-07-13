package com.sitech.strategy.manage.entity.param.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IInventoryManageParam;

/**
 * 清单参数处理
* @date: 2017-1-12 
* @author: zhangjj_crmpd
* @title: InventoryManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class InventoryManageParam  extends BaseManageEntity  implements
		IInventoryManageParam {

	/**
	 * 查询清单列表入参处理
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: queryInventoryListByPageInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryInventoryListByPageInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String,Object> body = bean.getBody();
		Map<String,Object> outMap = new HashMap<String, Object>();
		outMap.put("currentPageCode", body.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", body.get("PER_RECORD_COUNT"));
		outMap.put("taskName", body.get("TASK_NAME"));
		outMap.put("busiType", body.get("BUSI_TYPE"));
		outMap.put("busiId", body.get("BUSI_ID"));
		outMap.put("operNo", body.get("OPER_NO"));
		outMap.put("operName", body.get("OPER_NAME"));
		outMap.put("applyRegionCode", body.get("APPLY_REGION_CODE"));
		outMap.put("inventoryNum", body.get("INVENTORY_NUM"));
		outMap.put("applyInventoryNum", body.get("APPLY_INVENTORY_NUM"));
		outMap.put("statusCode", body.get("STATUS_CODE"));
		outMap.put("inventoryName", body.get("INVENTORY_NAME"));
		outMap.put("startDate", body.get("START_DATE"));
		outMap.put("endDate", body.get("END_DATE"));
		return outMap;
	}

	/**
	 * 查询清单列表出参处理
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: queryInventoryListByPageOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryInventoryListByPageOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		
		List<Map<String,Object>> inventoryNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> inventoryList = (List<Map<String, Object>>) outParam.get("result");
		
		if(!CommonUtils.objectIsNull(inventoryList)){
		  for(Map<String,Object> inventory:inventoryList){
		    Map<String,Object> inventoryMap = new HashMap<String,Object>();
		    inventoryMap.put("SERIAL_ID", inventory.get("serialId"));
		    inventoryMap.put("TASK_NAME", inventory.get("taskName"));
		    inventoryMap.put("BUSI_TYPE", inventory.get("busiType"));
		    inventoryMap.put("BUSI_ID", inventory.get("busiId"));
		    inventoryMap.put("OPER_NO", inventory.get("operNo"));
		    inventoryMap.put("OPER_NAME", inventory.get("operName"));
		    inventoryMap.put("OPER_TIME", inventory.get("operTime"));
		    inventoryMap.put("APPLY_REGION_CODE", inventory.get("applyRegionCode"));
		    inventoryMap.put("DOWNLOAD_NUM", inventory.get("downloadNum"));
		    inventoryMap.put("INVENTORY_NUM", inventory.get("inventoryNum"));
		    inventoryMap.put("APPLY_INVENTORY_NUM", inventory.get("applyInventoryNum"));
		    inventoryMap.put("STATUS_CODE", inventory.get("statusCode"));
		    inventoryMap.put("INVENTORY_NAME", inventory.get("inventoryName"));
			inventoryNewList.add(inventoryMap);
		
		   }
		}
		
		outMap.put("INVENTORY_LIST", inventoryNewList);
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("sum") == null?0:outParam.get("sum"));
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 保存清单入参参数处理
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: saveInventoryInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveInventoryInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String,Object> body = bean.getBody();
		Map<String,Object> outMap = new HashMap<String, Object>();
		outMap.put("taskName", body.get("TASK_NAME"));
		outMap.put("busiType", body.get("BUSI_TYPE"));
		outMap.put("busiId", body.get("BUSI_ID"));
		outMap.put("operNo", body.get("OPER_NO"));
		outMap.put("operName", body.get("OPER_NAME"));
		outMap.put("applyRegionCode", body.get("APPLY_REGION_CODE"));
		outMap.put("downloadNum", body.get("DOWNLOAD_NUM")==null?"0":body.get("DOWNLOAD_NUM"));
		outMap.put("inventoryNum", body.get("INVENTORY_NUM"));
		outMap.put("applyInventoryNum", body.get("APPLY_INVENTORY_NUM"));
		outMap.put("statusCode", body.get("STATUS_CODE"));
		outMap.put("inventoryName", body.get("INVENTORY_NAME"));
		return outMap;
	}

	/**
	 * 保存清单出参参数处理
	* @date: 2017-1-12 
	* @author: zhangjj_crmpd
	* @title: saveInventoryInfoOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveInventoryInfoOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		Map<String,Object> outMap = new HashMap<String,Object>();
		MBean outBean = new MBean();
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}

}

