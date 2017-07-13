package com.sitech.strategy.event.entity.param.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.event.base.BaseEventEntity;
import com.sitech.strategy.event.entity.param.inter.IProdEventReceiverParam;

/** 
 * 产品事件接收参数处理
* @date: 2016-11-29 
* @author: songxj
* @title: ProdEventReceiverParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note: 
*/
public class ProdEventReceiverParam extends BaseEventEntity implements
		IProdEventReceiverParam, Serializable {

	/** 
	 * 产品订购事件参数处理
	* @date: 2016-11-29 
	* @author: songxj
	* @title: receiveProdOrderEventInParam 
	* @param o
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> receiveProdOrderEventInParam(Object inParam) {
		Map<String,Object> paramMap = new HashMap<String,Object>();
		JSONObject json = JSONObject.parseObject((String) inParam);
		String operType = json.getString("operation_type");
		if ("I".equals(operType)) {
			boolean flag = true;
			List<Map<String, Object>> columnList = (List<Map<String, Object>>) json.get("columnListInfo");
			String queryDate = DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1);
			for(Map<String, Object> columnMap : columnList){
				if (columnMap.containsValue("APPLYDATE")) {
					queryDate = (String) columnMap.get("columnValue");
					flag = DateUtil.checkLatestHours(queryDate, 1);
				} else if (columnMap.containsValue("SUBSID")) {
					paramMap.put("idNo", columnMap.get("columnValue"));
				} else if (columnMap.containsValue("REGION")) {
					paramMap.put("regionCode", columnMap.get("columnValue"));
				} else if (columnMap.containsValue("PRODID")) {
					paramMap.put("prodId", columnMap.get("columnValue"));
				} else if (columnMap.containsValue("OID")) {
					paramMap.put("oId", columnMap.get("columnValue"));
				}
			}
			if (flag) {
				paramMap.put("queryDate", DateUtil.stringToString(queryDate, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD1));
				return paramMap;
			} else {
				paramMap = new HashMap<String,Object>();
			}
		}
		return paramMap;
	}

}
