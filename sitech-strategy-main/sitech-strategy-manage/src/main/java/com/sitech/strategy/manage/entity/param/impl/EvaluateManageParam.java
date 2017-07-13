package com.sitech.strategy.manage.entity.param.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IEvaluateManageParam;

/**
 * 评估(查询、报表)参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: EvaluateManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class EvaluateManageParam implements IEvaluateManageParam {
	
	/**
	 * 查询区域市场空间数据入参处理
	* @date: 2016-11-9 
	* @author: fangyuan_crmpd
	* @title: queryAreaMarketSpaceDataInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryAreaMarketSpaceDataInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("levelCode", inMap.get("LEVEL_CODE"));
		inParam.put("gridId", inMap.get("GRID_ID"));
		return inParam;
	}

	/**
	 * 查询区域市场空间数据出参处理
	* @date: 2016-11-9 
	* @author: fangyuan_crmpd
	* @title: queryAreaMarketSpaceDataOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryAreaMarketSpaceDataOutParam(
			Map<String, Object> outParam) {
		Map<String, Object> outMap = new HashMap<String, Object>();
		outMap.put("CMCC_ITV_NUM", outParam.get("cmccItvNum"));
		outMap.put("CUCC_ITV_NUM", outParam.get("cuccItvNum"));
		outMap.put("CTCC_ITV_NUM", outParam.get("ctccItvNum"));
		outMap.put("CMCC_MOBILE_NUM", outParam.get("cmccMobileNum"));
		outMap.put("CUCC_MOBILE_NUM", outParam.get("cuccMobileNum"));
		outMap.put("CTCC_MOBILE_NUM", outParam.get("ctccMobileNum"));
		outMap.put("CMCC_BROADBAND_NUM", outParam.get("cmccBroadbandNum"));
		outMap.put("CUCC_BROADBAND_NUM", outParam.get("cuccBroadbandNum"));
		outMap.put("CTCC_BROADBAND_NUM", outParam.get("ctccBroadbandNum"));
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody("QUERY_AREA_MARKET_SPACE_DATA",outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 查询营销案客户关系列表入参处理
	* @date: 2016-10-17 
	* @author: fangyuan_crmpd
	* @title: queryMarketCaseRelCustListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseRelCustListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("marketCaseName", inMap.get("MARKET_CASE_NAME"));
		inParam.put("busiNo", inMap.get("BUSI_NO"));
		inParam.put("channelId", inMap.get("CHANNEL_ID"));
		inParam.put("regionCode", inMap.get("REGION_CODE"));
		inParam.put("taskStatus", inMap.get("TASK_STATUS"));
		//inParam.put("queryListType", Const.QUERY_LIST_TYPE_DNPP);
		inParam.put("sortFlag", inMap.get("SORT_FLAG"));
		inParam.put("sortField", inMap.get("SORT_FIELD"));
		inParam.put("queryId", inMap.get("QUERY_ID"));
		inParam.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		inParam.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		inParam.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		return inParam;
	}
	
	/**
	 * 查询营销案客户关系列表出参处理
	* @date: 2016-10-17 
	* @author: fangyuan_crmpd
	* @title: queryMarketCaseRelCustListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryMarketCaseRelCustListOutParam(
			Map<String, Object> outParam) {
		List<Map<String, Object>> inList = (List<Map<String, Object>>) outParam.get("queryCustList");
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String, Object> inMap : inList){
				Map<String, Object> outMap = new HashMap<String, Object>();
				outMap.put("MARKET_CASE_ID", inMap.get("marketCaseId"));
				outMap.put("MARKET_CASE_NAME", inMap.get("marketCaseName"));
				outMap.put("USER_NAME", inMap.get("userName"));
				outMap.put("BUSI_NO", inMap.get("busiNo"));
				outMap.put("CHANNEL_ID", inMap.get("channelId"));
				outMap.put("CHANNEL_NAME", inMap.get("channelName"));
				outMap.put("TASK_STATUS", inMap.get("taskStatus"));
				String stTime = (String) inMap.get("startTime");
				String edTime = (String) inMap.get("endTime");
				if(CommonUtils.objectIsNull(stTime) == false){
					  String startTime = DateUtil.stringToString(stTime,DateUtil.TIME_FROMAT_SIMPLE3, DateUtil.TIME_FROMAT_SIMPLE1);
					  outMap.put("START_TIME", startTime);	
				}
				if(CommonUtils.objectIsNull(edTime) == false){
					  String endTime = DateUtil.stringToString(edTime,DateUtil.TIME_FROMAT_SIMPLE3, DateUtil.TIME_FROMAT_SIMPLE1);
					  outMap.put("END_TIME", endTime);	
				}
				outList.add(outMap);
			}
		}
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("QUERY_MARKET_CASE_REL_CUST_LIST", outList);
		map.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		map.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		map.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		map.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		bean.setBody(map);
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}
	
	/** 
	 * 营销案push任务统计入参处理
	* @date: 2016-10-29 
	* @author: songxj
	* @title: queryPushTaskStatisticsParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryPushTaskStatisticsInParam(InDTO inDTO) {
		MBean inParamMbean = inDTO.getMbean();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("marketCaseId", inParamMbean.getBodyStr("MARKET_CASE_ID"));
		inParam.put("marketCaseName", inParamMbean.getBodyStr("MARKET_CASE_NAME"));
		inParam.put("startTime", inParamMbean.getBodyStr("START_TIME"));
		inParam.put("endTime", inParamMbean.getBodyStr("END_TIME"));
		inParam.put("queryType", inParamMbean.getBodyStr("QUERY_TYPE"));
		return inParam;
	}

	/** 
	 * 营销案push任务统计出参处理
	* @date: 2016-10-29 
	* @author: songxj
	* @title: queryPushTaskStatisticsOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryPushTaskStatisticsOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("MARKET_CASE_ID", outParam.get("marketCaseId"));
		outMap.put("MARKET_CASE_NAME", outParam.get("marketCaseName"));
		outMap.put("SEND", outParam.get("send"));
		outMap.put("REST", outParam.get("rest"));
		outMap.put("TOTAL", outParam.get("total"));
		
		Map<String,Object> batchPushCount = new HashMap<String,Object>();
		batchPushCount = (Map<String,Object>)outParam.get("batchPushCount");
		Map<String,Object> marketCasePushCount = new HashMap<String, Object>();
		if(!CommonUtils.objectIsNull(batchPushCount)){
			marketCasePushCount.put("TO_PUSH", batchPushCount.get("waitSendCount"));
			marketCasePushCount.put("PUSHED", batchPushCount.get("succSendCount"));
			marketCasePushCount.put("FAILED", batchPushCount.get("excSendCount"));
			marketCasePushCount.put("MARKET_CASE_ID", outParam.get("marketCaseId"));
			marketCasePushCount.put("TASK_NAME",  outParam.get("marketCaseName"));
		}

		
		outMap.put("BATCH_PUSH_COUNT",marketCasePushCount);
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/** 
	 * 查询报表列表入参处理
	* @date: 2016-11-21 
	* @author: xiongxq
	* @Title: queryReportFormListInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryReportFormListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		//String startTime = (String)inMap.get("START_TIME");
		//String endTime = (String)inMap.get("END_TIME");
		inParam.put("startTime",inMap.get("START_TIME"));
		inParam.put("endTime", inMap.get("END_TIME"));
		inParam.put("marketCaseName",inMap.get("MARKET_CASE_NAME"));
		inParam.put("queryListType", Const.QUERY_LIST_TYPE_REPORTFORM);
		inParam.put("threeDay", Const.ORDER_NUM_THREE);
		inParam.put("sevenDay", Const.ORDER_NUM_SEVEN);
		inParam.put("fifthDay", Const.ORDER_NUM_FIFTH);
		
		inParam.put("HalOrderNum", inMap.get("ORDER_NUM"));
		inParam.put("SmsOrderNum", inMap.get("ORDER_NUM"));
		inParam.put("WapOrderNum", inMap.get("ORDER_NUM"));
		inParam.put("KfOrderNum", inMap.get("ORDER_NUM"));
		inParam.put("OtherOrderNum", inMap.get("ORDER_NUM"));
		
		inParam.put("queryId", inMap.get("QUERY_ID"));
		inParam.put("currentPageCode", inMap.get("CURRENT_PAGE"));
		inParam.put("perRecordCount", inMap.get("PER_RECORDS_COUNT"));
		inParam.put("totalRecordCount", inMap.get("TOTAL_RECORDS"));
		return inParam;
	}

	/**
	 * 查询报表列表出参处理 
	* @date: 2016-11-21 
	* @author: xiongxq
	* @Title: queryReportFormListOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryReportFormListOutParam(
			Map<String, Object> outParam) {
		List<Map<String, Object>> inList = (List<Map<String, Object>>) outParam.get("reportFormList");
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		for(Map<String,Object> inMap:inList){
			for (Map.Entry entry : inMap.entrySet()) {
				outList.add((Map)entry.getValue());
			}
		}		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("REPORT_FORM_LIST", outList);
		map.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		map.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		map.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		//update by yl at 2017-1-11. queryId分页使用，不要删除了。
		map.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		bean.setBody(map);
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}

	/**
	 * 查询营销案报表统计入参处理
	* @date: 2017-4-17 
	* @author: yuanchun
	* @title: queryReportFormStatisticsInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryReportFormStatisticsInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		
		inParam.put("marketCaseName",inMap.get("MARKET_CASE_NAME"));
		inParam.put("regionCode",inMap.get("REGION_CODE"));
		inParam.put("operNo",inMap.get("OPER_NO"));
		
		inParam.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		inParam.put("perRecordCount", inMap.get("PER_RECORDS_COUNT"));
		inParam.put("totalRecordCount", inMap.get("TOTAL_RECORDS"));
		return inParam;
	}
	
	/**
	 * 查询营销案报表统计出参处理
	* @date: 2017-4-17 
	* @author: yuanchun
	* @title: queryReportFormStatisticsOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryReportFormStatisticsOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		Map<String, Object> map = new HashMap<String, Object>();
		
		List<Map<String, Object>> inList = (List<Map<String, Object>>) outParam.get("marketCaseList");
		List<Map<String, Object>> marketCaseList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String, Object> inMap : inList){
				Map<String, Object> outMap = new HashMap<String, Object>();
				outMap.put("CONVERSION_PERCENT", inMap.get("conversionPercent"));
				outMap.put("TARGET_CUST_COUNT", inMap.get("targetCustCount"));
				outMap.put("CUST_GRUOP_TYPE", inMap.get("custGroupType"));
				outMap.put("CUST_GRUOP_TYPE_NAME", inMap.get("custGroupTypeName"));
				outMap.put("RECOMMEND_COUNT", inMap.get("recommendCount"));
				outMap.put("ORDER_COUNT", inMap.get("orderCount"));
				outMap.put("MARKET_CASE_ID", inMap.get("marketCaseId"));
				outMap.put("MARKET_CASE_NAME", inMap.get("marketCaseName"));
				marketCaseList.add(outMap);
			}
		}
		
		map.put("REPORT_FORM_LIST", marketCaseList);
		map.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		map.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		map.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		bean.setBody(map);
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}
	
	
	/**
	 * 查询用户接触视图列表入参处理
	* @date: 2017-1-8 
	* @author: liuqi
	* @title: queryUserTouchViewListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryUserTouchViewListInParam(InDTO inDTO){
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("channelId",inMap.get("CHANNEL_ID"));
		inParam.put("idNo",inMap.get("ID_NO"));
		inParam.put("recommonedStartTime",inMap.get("RECOMMONED_START_TIME"));
		inParam.put("recommonedEndTime",inMap.get("RECOMMONED_END_TIME"));
		inParam.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		inParam.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		inParam.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		//inParam.put("queryListType", Const.);
		return inParam;
	}

	/**
	 * 查询用户接触视图列表出参处理
	* @date: 2017-1-8 
	* @author: liuqi
	* @title: queryUserTouchViewListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryUserTouchViewListOutParam(Map<String,Object> outParam){
		List<Map<String, Object>> inList = (List<Map<String, Object>>) outParam.get("userTouchViewList");
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String, Object> inMap : inList){
				Map<String, Object> outMap = new HashMap<String, Object>();
				outMap.put("CHANNEL_NAME", inMap.get("channelName"));
				outMap.put("ID_NO", inMap.get("idNo"));
				outMap.put("MARKET_CASE_ID", inMap.get("marketCaseId"));
				outMap.put("MARKET_CASE_NAME", inMap.get("marketCaseName"));
				outMap.put("NUM_TYPE", inMap.get("numType"));
				outMap.put("NUM_VALUE", inMap.get("numValue"));
				outMap.put("OPER_NAME", inMap.get("operName"));
				outMap.put("OPER_NO", inMap.get("operNo"));
				outMap.put("RECOMMONED_TIME", inMap.get("recommonedTime"));
				outMap.put("REGION_CODE_NAME", inMap.get("regionCodeName"));
				outList.add(outMap);
			}
		}
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("USER_TOUCH_VIEW_LIST", outList);
		map.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		map.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		map.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		map.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(map);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 时间格式转换
	* @date: 2016-11-22 
	* @author: xiongxq
	* @Title: timeConvert 
	* @param formTime
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected String timeConvert(String formTime){
		if(formTime.indexOf(":") < Integer.valueOf(Const.FLASE_INT)){
			return formTime+" 00:00:00";
		}
		return formTime;
	}
	
	/**
	* 查询用户回单反馈入参处理
	* @date: 2017-1-9 
	* @author: liuqi
	* @title: queryUserReceiptRecordListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryUserReceiptRecordListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("channelId",inMap.get("CHANNEL_ID"));
		inParam.put("idNo",inMap.get("ID_NO"));
		inParam.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		inParam.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		inParam.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		return inParam;
	}
	
	/**
	 * 查询用户回单反馈出参处理	
	* @date: 2017-1-9 
	* @author: liuqi
	* @title: queryUserReceiptRecordListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryUserReceiptRecordListOutParam(Map<String, Object> outParam) {
		List<Map<String, Object>> inList = (List<Map<String, Object>>) outParam.get("userReceiptRecordList");
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String, Object> inMap : inList){
				Map<String, Object> outMap = new HashMap<String, Object>();
				outMap.put("ACCEPT_CODE", inMap.get("acceptCode"));
				outMap.put("ACTIVE_NAME", inMap.get("activeName"));
				outMap.put("CHANNEL_NAME",inMap.get("channelName"));
				outMap.put("CONTACT_FLAG", inMap.get("contactFlag"));
				outMap.put("ID_NO",inMap.get("idNo"));
				outMap.put("METHOD_CODE", inMap.get("methodCode"));
				outMap.put("NOTE", inMap.get("note"));
				outMap.put("NUM_TYPE", inMap.get("numType"));
				outMap.put("NUM_VALUE", inMap.get("numValue"));
				outMap.put("OPER_NAME", inMap.get("operName"));
				outMap.put("OPER_NO", inMap.get("operNo"));
				outMap.put("POSITION_NAME", inMap.get("positionName"));
				outMap.put("RESULTS_CODE", inMap.get("resultsCode"));
				outMap.put("SEQ_ID", inMap.get("seqId"));
				outMap.put("REGION_CODE_NAME", inMap.get("regionCodeName"));
				outMap.put("STATUS_CODE", inMap.get("statusCode"));
				outMap.put("SYSTEM_ID", inMap.get("systemId"));
				outMap.put("TASK_ID", inMap.get("taskId"));
				outList.add(outMap);
			}
		}
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("USER_RECEIPT_RECORD_LIST", outList);
		map.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		map.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		map.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outBean.setBody(map);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

}
