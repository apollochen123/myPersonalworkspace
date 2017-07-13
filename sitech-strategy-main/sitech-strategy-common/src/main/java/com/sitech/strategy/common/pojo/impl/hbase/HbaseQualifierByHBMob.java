package com.sitech.strategy.common.pojo.impl.hbase;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.hbase.IHbaseQualifier;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * hbase 限定符
* @date: 2017-1-13 
* @author: sunliang 
* @title: HbaseQualifier 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class HbaseQualifierByHBMob extends HbaseQualifier implements IHbaseQualifier,Serializable{
	/**
	 * 增加用户接触记录表限定符处理
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getAddContactRecordQualifier 
	* @param inParam
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, String> getAddContactRecordQualifier(Map<String,Object> inParam,Map<String,Object> tempInParam) {
		Map<String,String> param = new HashMap<String, String>();
		param.put("SEQ_ID", (String) CommonUtils.replaceNull(inParam.get("seqId")));
		param.put("PHONE_NO", (String) CommonUtils.replaceNull(tempInParam.get("phoneNo")));
		param.put("REGION_CODE", (String) CommonUtils.replaceNull(inParam.get("regionCode")));
		param.put("CHANNEL_ID", (String) CommonUtils.replaceNull(inParam.get("channelId")));
		param.put("POSITION_ID", (String) CommonUtils.replaceNull(inParam.get("positionId")));
		param.put("OPER_NO", (String) CommonUtils.replaceNull(inParam.get("operNo")));
		param.put("OPER_NAME", (String) CommonUtils.replaceNull(inParam.get("operName")));
		param.put("NUM_TYPE", (String) CommonUtils.replaceNull(inParam.get("numType")));
		param.put("NUM_VALUE", (String) CommonUtils.replaceNull(inParam.get("numValue")));
		param.put("CONTACT_TIME", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
		return param;
	}
	/**
	 * 处理批量push内容参数
	* @date: 2016-10-18 
	* @author: sunliang 
	* @title: getBatchPushTaskQualifier 
	* @param tempInParam
	* @param contentDetailList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,String> getBatchPushTaskQualifier(Map<String,Object> tempInParam){
		
		List<Map<String,Object>> contentDetailList = (List<Map<String,Object>>)tempInParam.get("contentDetailList");
		List<Map<String,Object>> ruleDetailList = (List<Map<String,Object>>)tempInParam.get("ruleDetailList");
		Map<String,String> paramMap = new HashMap<String,String>();
		
		paramMap.put("PHONE_NO", (String)tempInParam.get("phoneNo"));
		paramMap.put("CHANNEL_ID", (String)tempInParam.get("channelId"));
		paramMap.put("POSITION_ID", (String)tempInParam.get("positionId"));
		paramMap.put("REGION_CODE", (String)tempInParam.get("regionCode"));
		paramMap.put("MARKET_CASE_NAME", (String)tempInParam.get("marketCaseName"));
		paramMap.put("END_TIME", (String)tempInParam.get("endTime"));
		paramMap.put("TASK_ID", (String)tempInParam.get("taskId"));
		paramMap.put("PRODUCT_COMMODITY_ID", (String)tempInParam.get("productCommodityId"));
		paramMap.put("MARKET_CASE_ID", (String)tempInParam.get("marketCaseId"));
		paramMap.put("CREATE_TIME", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));
		
		for(Map<String,Object> contentDetailMap : contentDetailList){
			List<Map<String,String>> paramsList = (List<Map<String,String>>)contentDetailMap.get("params");
			for(Map<String,String> param: paramsList){
				if("smsContent".equals(param.get("contentParCode"))){
					paramMap.put("SEND_CONTENT", param.get("contentParValue"));
				}
			}
		}
		for(Map<String,Object> ruleDetailMap : ruleDetailList){
			List<Map<String,String>> paramsList = (List<Map<String,String>>)ruleDetailMap.get("params");
			for(Map<String,String> param: paramsList){
				if("sendPort".equals(param.get("ruleParCode"))){
					paramMap.put("SEND_PORT", param.get("ruleParValue"));
				}
			}
		}
		return paramMap;
	}
	/** 获取批量任务查询限定字段
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: getSelectBatchPushTaskByIdQualifier 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Set<String> getSelectBatchPushTaskByIdQualifier() {
		Set<String> set = new HashSet<String>();
		set.add("CHANNEL_ID");
		set.add("CREATE_TIME");
		set.add("END_TIME");
		set.add("MARKET_CASE_ID");
		set.add("MARKET_CASE_NAME");
		set.add("PHONE_NO");
		set.add("POSITION_ID");
		set.add("PRODUCT_COMMODITY_ID");
		set.add("REGION_CODE");
		set.add("SEND_CONTENT");
		set.add("SEND_PORT");
		set.add("TASK_ID");
		return set;
	}
}
