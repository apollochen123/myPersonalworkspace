package com.sitech.strategy.recommend.entity.param.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.recommend.base.BaseRecommendEntity;
import com.sitech.strategy.recommend.entity.param.inter.IBatchPushProdTaskParam;

public class BatchPushProdTaskParam extends BaseRecommendEntity implements IBatchPushProdTaskParam{

	/**
	 * 批量送套餐接口入参
	* @date: 2017-4-17 
	* @author: chenhao
	* @title: getSendBatchPushProdTaskInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getSendBatchPushProdTaskInParam(Map<String,Object> map) {
		Map<String,Object> resultMap = new HashMap<String, Object>();
		Integer a = DateUtil.getDayOfMonth();
		String month = DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMM);
		String filePath = "/CRM/"+month+"/"+a.toString()+"/jiangxl";
		String marketCaseId = map.get("fileName").toString().replace(".txt", "");
		resultMap.put("marketCaseId",marketCaseId);
		resultMap.put("fileName", map.get("fileName"));
		resultMap.put("filePath",filePath);
		resultMap.put("fipIp", map.get("fipIp"));
		return resultMap;
	}
	

}
