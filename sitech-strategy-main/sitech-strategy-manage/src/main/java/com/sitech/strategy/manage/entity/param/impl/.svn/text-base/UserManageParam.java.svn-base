package com.sitech.strategy.manage.entity.param.impl;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IUserManageParam;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 用户参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: UserManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class UserManageParam implements IUserManageParam{
	/**
	 * 用户查询
	 */
	protected IDataSelector.IUserSelector userSelector;
	
	/**
	 * 
	* @date: 2017-2-16 
	* @author: wuJiaFu
	* @title: setUserSelector 
	* @param userSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUserSelector(IDataSelector.IUserSelector userSelector) {
		this.userSelector = userSelector;
	}

	/**
	 * 查询异网号码池列表入参处理  
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: queryDifferentNetPhonePoolListInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryDifferentNetPhonePoolListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_DNPP);
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("phoneNo", inMap.get("PHONE_NO"));
		return outMap;
	}

	/** 
	 * 查询异网号码池列表出参处理 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: queryDifferentNetPhonePoolListOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryDifferentNetPhonePoolListOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> outList = (List<Map<String,Object>>)outParam.get("differentNetPhonePoolList");
		List<Map<String,Object>> outNewList = new ArrayList<Map<String,Object>>();
		
		if(!CommonUtils.objectIsNull(outList)){
			for(Map<String,Object> map :outList){
				Map<String,Object> noMap = new HashMap<String,Object>();
				noMap.put("PHONE_NO", (String)map.get("phoneNo"));
				noMap.put("OPER_NO", (String)map.get("operNo"));
				noMap.put("OPER_NAME", (String)map.get("operName"));
				noMap.put("NOTE", (String)map.get("note"));
				noMap.put("SERIAL_ID", (String)map.get("serialId"));
				
				String stTime = (String)map.get("startTime");
				if(CommonUtils.objectIsNull(stTime) == false){
					noMap.put("START_TIME", DateUtil.stringToString(stTime,DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
				}
				
				String edTime = (String)map.get("endTime");
				if(CommonUtils.objectIsNull(edTime) == false){
					noMap.put("END_TIME", DateUtil.stringToString(edTime,DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
				}
				
				String opTime = (String)map.get("operTime");
				if(CommonUtils.objectIsNull(opTime) == false){
					noMap.put("OPER_TIME", DateUtil.stringToString(opTime,DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
				}
				outNewList.add(noMap);
			}
		}
		outMap.put("DIFFERENT_NET_PHONE_POOL_LIST", outNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(outMap);
		
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 查询灰名单入参处理 
	* @date: 2016-10-15 
	* @author: xiongxq
	* @Title: queryGreyListInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryGreyListInParam(InDTO inDTO) {
		
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("regionCode", inMap.get("REGION_CODE"));
		outMap.put("channelId", inMap.get("CHANNEL_ID"));
		outMap.put("phoneNo", inMap.get("PHONE_NO"));
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_GREY);
		return outMap;
	}

	/** 查询灰名单列表出参处理
	* @date: 2016-10-15 
	* @author: xiongxq
	* @Title: queryGreyListOutParam 
	* @param inMap
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryGreyListOutParam(Map<String, Object> inMap) {
		
//		List<Map<String,Object>> greyList = new ArrayList<Map<String,Object>>();
//		greyList = (List<Map<String,Object>>)inMap.get("greyList");
//		Map<String,Object> outMap = new HashMap<String,Object>();
//		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
//		if(CommonUtils.objectIsNull(greyList) == false){	
//			for(Map<String,Object> innerMap:greyList){
//				Map<String,Object> greyMap = new HashMap<String,Object>();
//				greyMap.put("REGION_CODE", innerMap.get("regionCode"));
//				greyMap.put("REGION_NAME", innerMap.get("regionName"));
//				greyMap.put("PHONE_NO", innerMap.get("phoneNo"));
//				greyMap.put("BLACK_TYPE", innerMap.get("blackType"));
//				greyMap.put("MARKET_CASE_TYPE", innerMap.get("marketCaseType"));
//				greyMap.put("CHANNEL_ID", innerMap.get("channelId"));
//				greyMap.put("CHANNEL_NAME", innerMap.get("channelName"));
//				greyMap.put("MARKET_CASE_ID", innerMap.get("marketCaseId"));
//				greyMap.put("FROM_TEL",innerMap.get("fromTel"));
//				greyMap.put("NOTE",innerMap.get("note"));
//				greyMap.put("SERIAL_ID",innerMap.get("serialId"));
//				
//				String stTime = (String)innerMap.get("startDate");
//				if(CommonUtils.objectIsNull(stTime) == false){
//					greyMap.put("START_DATE", DateUtil.stringToString(stTime,DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
//				}
//				
//				String edTime = (String)innerMap.get("endDate");
//				if(CommonUtils.objectIsNull(edTime) == false){
//					greyMap.put("END_DATE", DateUtil.stringToString(edTime,DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD2));
//				}
//				outList.add(greyMap);
//			}
//		}	
//		outMap.put("GREY_LIST", outList);
//		outMap.put("PER_RECORD_COUNT", inMap.get("perRecordCount")==null?0:inMap.get("perRecordCount"));
//		outMap.put("CURRENT_PAGE_CODE", inMap.get("currentPageCode") == null?0:inMap.get("currentPageCode"));
//		outMap.put("TOTAL_RECORD_COUNT", inMap.get("totalRecordCount")==null?0:inMap.get("totalRecordCount"));
//		outMap.put("QUERY_ID", inMap.get("queryId"));
//		
//		MBean outMbean = new MBean();
//		outMbean.setBody(outMap);
//		StandardOutDTO standardOutDTO = new StandardOutDTO();
//		standardOutDTO.setBean(outMbean);
//		return standardOutDTO;
		Map<String,Object> outMap = new HashMap<String,Object>();
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> greyList = inMap.get("result") == null?new ArrayList<Map<String,Object>>():
			(List<Map<String,Object>>)inMap.get("result");
		if(CommonUtils.objectIsNull(greyList) == false){	
		for(Map<String,Object> innerMap:greyList){
			Map<String,Object> greyMap = new HashMap<String,Object>();
			greyMap.put("REGION_CODE", innerMap.get("regionCode"));
			greyMap.put("REGION_NAME", innerMap.get("regionName"));
			greyMap.put("PHONE_NO", innerMap.get("phoneNo"));
			greyMap.put("BLACK_TYPE", innerMap.get("blackType"));
			greyMap.put("BLACK_NAME", innerMap.get("blackName"));
			greyMap.put("MARKET_CASE_TYPE", innerMap.get("marketCaseType"));
			greyMap.put("CHANNEL_ID", innerMap.get("channelId"));
			greyMap.put("CHANNEL_NAME", innerMap.get("channelName"));
			greyMap.put("MARKET_CASE_ID", innerMap.get("marketCaseId"));
			greyMap.put("FROM_TEL",innerMap.get("fromTel"));
			greyMap.put("NOTE",innerMap.get("note"));
			greyMap.put("SERIAL_ID", innerMap.get("serialId"));
			Date date =(Date) innerMap.get("startDate");			
			greyMap.put("START_DATE",DateUtil.DateToString(date,DateUtil.DATE_FROMAT_YYYYMMDD2));
			date =(Date)innerMap.get("endDate");
			greyMap.put("END_DATE",DateUtil.DateToString(date,DateUtil.DATE_FROMAT_YYYYMMDD2));
			greyMap.put("OPER_NO",innerMap.get("operNo"));
			date =(Date)innerMap.get("operTime");
			greyMap.put("OPER_TIME",DateUtil.DateToString(date,DateUtil.DATE_FROMAT_YYYYMMDD2));
			outList.add(greyMap);		
		}
		}
		outMap.put("GREY_LIST", outList);
		outMap.put("PER_RECORD_COUNT", inMap.get("perRecordCount")==null?0:inMap.get("perRecordCount"));
		outMap.put("CURRENT_PAGE_CODE", inMap.get("currentPageCode") == null?0:inMap.get("currentPageCode"));
		outMap.put("TOTAL_RECORD_COUNT", inMap.get("sum")==null?0:inMap.get("sum"));	
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
		
	}
	
	
	/**
	 * 查询用户回单记录入参处理
	* @date: 2017-3-12 
	* @author: wuJiaFu
	* @title: queryReceiptRecordListInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryReceiptRecordListInParam(InDTO inDTO)
			throws StrategyError {
		MBean inBean = inDTO.getMbean();
		
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("NUM_TYPE", inMap.get("NUM_TYPE"));
		outMap.put("serviceNbr", inMap.get("NUM_VALUE"));
		outMap.put("CHANNEL_ID",inMap.get("CHANNEL_ID"));//inMap.get("CHANNEL_ID")
		outMap.put("RECOMMONED_START_TIME", inMap.get("RECOMMONED_START_TIME"));
		outMap.put("RECOMMONED_END_TIME", inMap.get("RECOMMONED_END_TIME"));
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		return outMap;
	}
	
	/**
	 * 查询用户回单记录出参处理
	* @date: 2017-3-12 
	* @author: wuJiaFu
	* @title: queryReceiptRecordListOutParam 
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryReceiptRecordListOutParam(
			Map<String, Object> outParam) {
		List<Map<String, Object>> recormendRecordInList = (List<Map<String, Object>>) outParam.get("receiptRecordOutList");
		List<Map<String, Object>> recormendRecordOutList = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> greyListOutList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(recormendRecordInList) == false){
			for(Map<String, Object> inMap : recormendRecordInList){
				Map<String, Object> outMap = new HashMap<String, Object>();
				outMap.put("ACCEPT_CODE", inMap.get("acceptCode"));
				outMap.put("MARKET_CASE_ID", inMap.get("marketCaseId"));
				outMap.put("OPER_NAME", inMap.get("operName"));
				outMap.put("OPER_NO", inMap.get("operNo"));
				outMap.put("POSITION_NAME", inMap.get("positionName"));
				outMap.put("RESULTS_CODE", inMap.get("resultsCode"));
				outMap.put("SEQ_ID", inMap.get("seqId"));
				outMap.put("METHOD_CODE", inMap.get("methodCode"));
				outMap.put("CHANNEL_NAME", inMap.get("channelName"));
				outMap.put("ID_NO", inMap.get("idNo"));
				outMap.put("MARKET_CASE_NAME", inMap.get("activeName"));
				outMap.put("STATUS_CODE", inMap.get("statusCode"));
				outMap.put("TASK_ID", inMap.get("taskId"));
				recormendRecordOutList.add(outMap);
			}
		}
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("QUERY_RECOMMEND_RECORD_LIST", recormendRecordOutList);
		map.put("QUERY_GREY_LIST", greyListOutList);
		map.put("PER_RECORD_COUNT", outParam.get("perRecordCount")==null?0:outParam.get("perRecordCount"));
		map.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		map.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount")==null?0:outParam.get("totalRecordCount"));
		map.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		System.out.println("queryRecommendRecordListOutParam map"+map);
		outBean.setBody(map);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 查询用户推荐记录信息入参处理
	* @date: 2017-2-13 
	* @author: wuJiaFu
	* @title: queryRecommendRecordListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryRecommendRecordListInParam(InDTO inDTO) throws StrategyError {
		MBean inBean = inDTO.getMbean();
		
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		//String numType = CommonUtils.objectIsNull(inMap.get("NUM_TYPE")) ? "" : (String)inMap.get("NUM_TYPE");
		//String numValue = CommonUtils.objectIsNull(inMap.get("NUM_VALUE")) ? "" : (String)inMap.get("NUM_VALUE");
		//String idNos = userSelector.selectIdNoByServiceNo(numValue+numType);
		outMap.put("regionCode", inMap.get("REGION_CODE"));
		//outMap.put("idNo","564179009968" );//inMap.get("ID_NO")
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("NUM_TYPE", inMap.get("NUM_TYPE"));
		outMap.put("NUM_VALUE", inMap.get("NUM_VALUE"));
		outMap.put("CHANNEL_ID",inMap.get("CHANNEL_ID"));//inMap.get("CHANNEL_ID")
		outMap.put("RECOMMONED_START_TIME", inMap.get("RECOMMONED_START_TIME"));
		outMap.put("RECOMMONED_END_TIME", inMap.get("RECOMMONED_END_TIME"));
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		return outMap;
	}
	
	/**
	 * 查询用户推荐记录信息出参处理
	* @date: 2017-2-13 
	* @author: wuJiaFu
	* @title: queryRecommendRecordListOutParam 
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryRecommendRecordListOutParam(
			Map<String, Object> outParam) {
		List<Map<String, Object>> greyListInList = (List<Map<String, Object>>) outParam.get("greyListOutList");
		List<Map<String, Object>> recormendRecordInList = (List<Map<String, Object>>) outParam.get("recommendRecordOutList");
		List<Map<String, Object>> recormendRecordOutList = new ArrayList<Map<String, Object>>();
		List<Map<String, Object>> greyListOutList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(recormendRecordInList) == false){
			for(Map<String, Object> inMap : recormendRecordInList){
				Map<String, Object> outMap = new HashMap<String, Object>();
				outMap.put("ID_NO", inMap.get("idNo"));
				outMap.put("MARKET_CASE_ID", inMap.get("marketCaseId"));
				outMap.put("OPER_NAME", inMap.get("operName"));
				outMap.put("OPER_NO", inMap.get("operNo"));
				outMap.put("MARKET_CASE_TYPE", inMap.get("marketCaseType"));
				outMap.put("ACT_START_TIME", inMap.get("actStartTime"));
				outMap.put("STATUS_CODE", inMap.get("statusCode"));
				outMap.put("ACT_END_TIME", inMap.get("actEndTime"));
				outMap.put("CHANNEL_NAME", inMap.get("channelName"));
				outMap.put("REGION_CODE_NAME", inMap.get("regionCodeName"));
				outMap.put("MARKET_CASE_NAME", inMap.get("marketCaseName"));
				outMap.put("RECOMMONED_TIME", inMap.get("recommonedTime"));
				outMap.put("MARKET_CASE_TYPE", inMap.get("marketCaseType"));
				outMap.put("MARKETCASE_DESC", inMap.get("marketDesc"));
				recormendRecordOutList.add(outMap);
			}
		}
		if(CommonUtils.objectIsNull(greyListInList) == false){
			for(Map<String, Object> inMap : greyListInList){
				Map<String, Object> outMap = new HashMap<String, Object>();
				outMap.put("ID_NO", inMap.get("idNo"));
				outMap.put("START_DATE", inMap.get("startDate"));
				outMap.put("OPER_NAME", inMap.get("operName"));
				outMap.put("OPER_NO", inMap.get("operNo"));
				outMap.put("END_DATE", inMap.get("endDate"));
				outMap.put("OPER_TIME", inMap.get("operTime"));
				greyListOutList.add(outMap);
			}
		}
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String, Object> map = new HashMap<String, Object>();
		if(CommonUtils.objectIsNull(greyListInList) == false){
			map.put("IS_GREY_USER", "是");
		}else{
			map.put("IS_GREY_USER", "否");
		}
		map.put("QUERY_RECOMMEND_RECORD_LIST", recormendRecordOutList);
		map.put("QUERY_GREY_LIST", greyListOutList);
		map.put("PER_RECORD_COUNT", outParam.get("perRecordCount")==null?0:outParam.get("perRecordCount"));
		map.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		map.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount")==null?0:outParam.get("totalRecordCount"));
		map.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(map);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 查询用户资料入参处理
	* @date: 2016-11-7 
	* @author: fangyuan_crmpd
	* @title: queryUserDataListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryUserDataListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("custNameOrServiceNbr", inMap.get("CUST_NAME_OR_SERVICE_NBR"));
		inParam.put("sortFlag", inMap.get("SORT_FLAG"));
		inParam.put("sortField", inMap.get("SORT_FIELD"));
		inParam.put("queryId", inMap.get("QUERY_ID"));
		inParam.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		inParam.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		inParam.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		inParam.put("queryListType", Const.QUERY_LIST_TYPE_UD);
		return inParam;
	}

	/**
	 * 查询用户资料出参处理
	* @date: 2016-11-7 
	* @author: fangyuan_crmpd
	* @title: queryUserDataListOutParam 
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryUserDataListOutParam(Map<String, Object> outParam) {
		List<Map<String, Object>> inList = (List<Map<String, Object>>) outParam.get("queryUserDataList");
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String, Object> inMap : inList){
				Map<String, Object> outMap = new HashMap<String, Object>();
				//outMap.put("REGION_NAME", inMap.get("regionName"));
				//outMap.put("BUSI_NO", inMap.get("busiNo"));
				//outMap.put("USER_NAME", inMap.get("userName"));
				//outMap.put("STATUS", inMap.get("status"));
				//outMap.put("DATA_FLOW", inMap.get("dataFlow"));
				//outMap.put("PHONE_CHARGES", inMap.get("phoneCharges"));
				//outMap.put("HANDLE_TYPE", inMap.get("handleType"));
				//outMap.put("MARKET_CASE_URL", inMap.get("marketCaseUrl"));
				//outMap.put("PHOTO_URL", inMap.get("photoUrl"));
				//outMap.put("SHORT_MESSAGE_RECOMMEND_TYPE", inMap.get("shortMessageRecommendType"));
				//outMap.put("SHORT_MESSAGE_RECOMMEND_URL", inMap.get("shortMessageRecommendUrl"));
				//outMap.put("MARKET_CASE_TERMS", inMap.get("marketCaseTerms"));
				//outMap.put("POLICY_CONFIG", inMap.get("policyConfig"));
				//outMap.put("DETAIL_CONFIG", inMap.get("detailConfig"));
				//outMap.put("ALLOCATION_RULE", inMap.get("allocationRule"));
				//outMap.put("OUT_BOUND_PLATFORM", inMap.get("outBoundPlatform"));
				//outMap.put("EJECT_TYPE", inMap.get("ejectType"));
				//outMap.put("ACCESS_CODE", inMap.get("accessCode"));
				//outMap.put("SEND_TIME", inMap.get("sendTime"));
				//outMap.put("SEND_TYPE", inMap.get("sendType"));
				//outMap.put("TRIGGER_PERSON", inMap.get("triggerPerson"));
				outMap.put("LATN_NAME", inMap.get("latnName"));
				outMap.put("CUST_NAME", inMap.get("custName"));
				outMap.put("SERVICE_NBR", inMap.get("serviceNbr"));
				outMap.put("CHRG_LEVEL", inMap.get("chrgLevel"));
				outMap.put("IF_PREPAY", inMap.get("ifPrepay"));
				outMap.put("EMPEE_ID", inMap.get("empeeId"));
				outMap.put("DEVELOPER", inMap.get("developer"));
				outMap.put("DEV_NAME", inMap.get("devName"));
				outMap.put("DEPT_NAME", inMap.get("deptName"));
				outMap.put("EXTEND_PAYMETHOD_NAME", inMap.get("extendPaymethodName"));
				outMap.put("OWE_CHARGE", inMap.get("oweCharge"));
				outMap.put("EDW_MKT_AREA_NAME", inMap.get("edwMktAreaName"));
				outMap.put("EDW_DEPT_NAME", inMap.get("edwDeptName"));
				outMap.put("EDW_DUTY_ZONE_NAME", inMap.get("edwDutyZoneName"));
				outMap.put("EDW_REGION_NAME", inMap.get("edwRegionName"));
				outMap.put("USER_ACCOUNT", inMap.get("userAccount"));
				outMap.put("REGION_CODE", inMap.get("regionCode"));
				outMap.put("PRD_INST_STAS_NAME", inMap.get("prdInstStasName"));
				outMap.put("OFR_INST_STAS_NAME", inMap.get("ofrInstStasName"));
				outMap.put("ID_NO", inMap.get("idNo"));
				outList.add(outMap);
			}
		}
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("QUERY_USER_DATA_LIST", outList);
		map.put("PER_RECORD_COUNT", outParam.get("perRecordCount")==null?0:outParam.get("perRecordCount"));
		map.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		map.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount")==null?0:outParam.get("totalRecordCount"));
		map.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(map);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 查询标签列表入参处理
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: queryUserLabelListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryUserLabelListInParam(InDTO inDTO){
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("userLabelName", inMap.get("USER_LABEL_NAME"));
		outMap.put("userLabelCode", inMap.get("USER_LABEL_CODE"));
		outMap.put("custGroupId", inMap.get("CUST_GROUP_ID"));
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_TL);
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("isSort", inMap.get("IS_SORT"));
		outMap.put("loginNo", inMap.get("LOGIN_NO"));
		return outMap;
	}
	
	/**
	 * 查询标签表列表出参处理
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: queryUserLabelListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryUserLabelListOutParam(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> tempLableList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		List<Map<String,Object>> inList = (List<Map<String, Object>>) outParam.get("result");
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String,Object> labelMap :inList){
				Map<String,Object> labelNewMap = new HashMap<String,Object>();
				labelNewMap.put("SERIAL_ID", labelMap.get("serialId"));
				labelNewMap.put("USER_LABEL_NAME", labelMap.get("userLabelName"));
				labelNewMap.put("USER_LABEL_CODE", labelMap.get("userLabelKey"));
				labelNewMap.put("USER_LABEL_KEY", labelMap.get("userLabelKey"));
				labelNewMap.put("USER_LABEL_TYPE", labelMap.get("userLabelType"));
				labelNewMap.put("DISPLAY_ORDER", labelMap.get("displayOrder"));
				labelNewMap.put("USER_LABEL_SOURCE", labelMap.get("userLabelSource"));
				labelNewMap.put("BUSI_CALIBER", labelMap.get("busiCaliber"));
				labelNewMap.put("UPDATE_FREQ", labelMap.get("updateFreq"));
				labelNewMap.put("CONTACT", labelMap.get("contact"));
				labelNewMap.put("MANUFACTOR", labelMap.get("manufactor"));
				String beginDate = DateUtil.timestamp2String((Timestamp) labelMap.get("beginDate"), DateUtil.DATE_FROMAT_YYYYMMDD2);
				String endDate = DateUtil.timestamp2String((Timestamp) labelMap.get("endDate"), DateUtil.DATE_FROMAT_YYYYMMDD2);
				if(CommonUtils.objectIsNull(beginDate) == false){
					 labelNewMap.put("BEGIN_DATE", beginDate);
				}
				if(CommonUtils.objectIsNull(endDate) == false){
					 labelNewMap.put("END_DATE", endDate);
				}
				labelNewMap.put("APP_RANGE", labelMap.get("appRange"));
				labelNewMap.put("LABEL_WHERE", labelMap.get("labelWhere"));
				labelNewMap.put("USER_LABEL_BOXTYPE", labelMap.get("userLabelBoxtype"));
				tempLableList.add(labelNewMap);
			}
		}
		
		outMap.put("USER_LABEL_LIST", tempLableList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("sum") == null?0:outParam.get("sum"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/** 
	 *  删除异网号码池入参处理
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: removeDifferentNetPhonePoolInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> removeDifferentNetPhonePoolInParam(InDTO inDTO) {
		MBean outBean = inDTO.getMbean();
		Map<String,Object> inMap = outBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("serialId", inMap.get("SERIAL_ID"));
		return outMap;
	}

	/**
	 *  删除异网号码池出参处理 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: removeDifferentNetPhonePoolOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO removeDifferentNetPhonePoolOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}

	/** 
	 * 删除灰名单入参处理
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: removeGreyInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> removeGreyInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("serialId", inMap.get("SERIAL_ID"));
		return outMap;
	}

	/** 
	 * 删除灰名单出参处理
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: removeGreyOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO removeGreyOutParam() {
		MBean outMbean = new MBean();
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(outMbean);
		return standardOutDTO;
	}
	
	/**
	 * 删除用户标签入参处理
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: removeUserLabelInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removeUserLabelInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("serialId", inMap.get("SERIAL_ID"));
		outMap.put("custGroupId",inMap.get("CUST_GROUP_ID"));
		return outMap;
	}

	/**
	 * 删除用户标签出参处理
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: removeUserLabelOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeUserLabelOutParam() {
		MBean outMbean = new MBean();
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(outMbean);
		return standardOutDTO;
	}

	/**
	 * 批量保存灰名单入参处理 
	* @date: 2016-10-17 
	* @author: xiongxq
	* @Title: saveBatchGreyInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> saveBatchGreyInParam(InDTO inDTO) {
		return null;
	}

	/** 
	 * 批量保存灰名单出参处理
	* @date: 2016-10-17 
	* @author: xiongxq
	* @Title: saveBatchGreyOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO saveBatchGreyOutParam() {
		MBean mBean = new MBean();
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(mBean);
		return standardOutDTO;
	}
	
	/**
	 * 保存异网号码池  入参处理 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: saveDifferentNetPhonePoolInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> saveDifferentNetPhonePoolInParam(InDTO inDTO) {
		MBean outBean = inDTO.getMbean();
		Map<String,Object> inMap = outBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("serialId", SequenceUtil.getSequence());
		outMap.put("phoneNo", inMap.get("PHONE_NO"));
		outMap.put("operNo",inMap.get("OPER_NO"));
		outMap.put("operName", inMap.get("OPER_NAME"));
		outMap.put("note", inMap.get("NOTE"));
		
		String edTime = (String)inMap.get("END_TIME");
		String stTime = (String)inMap.get("START_TIME");
		String opTime = (String)inMap.get("OPER_TIME");
		if(!"".equals(stTime) && stTime != null) {
		  String startTime = DateUtil.stringToString(this.timeConvert(stTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  outMap.put("startTime", startTime);	
		}
		if(!"".equals(edTime) && edTime != null){
		  String endTime = DateUtil.stringToString(this.timeConvert(edTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  outMap.put("endTime", endTime);	
		}
		if(!"".equals(opTime) && opTime != null){
		  String oprTime = DateUtil.stringToString(this.timeConvert(opTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  outMap.put("operTime", oprTime);	
		}
		
		return outMap;
	}

	/**
	 * 保存异网号码池 出参处理 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: saveDifferentNetPhonePoolOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO saveDifferentNetPhonePoolOutParam() {
		MBean mBean = new MBean();
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(mBean);
		return standardOutDTO;
	}

	/**保存单个灰名单入参处理 
	* @date: 2016-10-17 
	* @author: xiongxq
	* @Title: saveSingleGreyInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> saveSingleGreyInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> auditMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("blackType", auditMap.get("BLACK_TYPE"));
		outMap.put("regionCode", auditMap.get("REGION_CODE"));
		outMap.put("marketCaseType", auditMap.get("MARKET_CASE_TYPE"));
		outMap.put("phoneNo",auditMap.get("PHONE_NO"));
		outMap.put("channelId",auditMap.get("CHANNEL_ID"));
		outMap.put("channelName", auditMap.get("CHANNEL_NAME"));
		outMap.put("marketCaseId",auditMap.get("MARKET_CASE_ID"));
		outMap.put("operNo", auditMap.get("OPER_NO"));
		outMap.put("operName", auditMap.get("OPER_NAME"));
		outMap.put("serialId",SequenceUtil.getSequence());
		
		String edTime = (String)auditMap.get("END_DATE");
		String stTime = (String)auditMap.get("START_DATE");
		String opTime = (String)auditMap.get("OPER_TIME");
		if(!"".equals(stTime) && stTime != null) {
		  String startTime = DateUtil.stringToString(this.timeConvert(stTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  outMap.put("startDate", startTime);	
		}
		if(!"".equals(edTime) && edTime != null){
		  String endTime = DateUtil.stringToString(this.timeConvert(edTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  outMap.put("endDate", endTime);	
		}
		if(!"".equals(opTime) && opTime != null){
		  String oprTime = DateUtil.stringToString(this.timeConvert(opTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  outMap.put("operTime", oprTime);	
		}
		
		outMap.put("fromTel",auditMap.get("FROM_TEL"));
		outMap.put("note",auditMap.get("NOTE"));
		return outMap;
	}

	/**
	 * 保存单个灰名单出参处理  
	* @date: 2016-10-17 
	* @author: xiongxq
	* @Title: saveSingleGreyOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO saveSingleGreyOutParam() {
		MBean mBean = new MBean();
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(mBean);
		return standardOutDTO;
	}
	
	/**
	 * 新增用户标签入参处理
	* @date: 2016-10-24 
	* @author: fangyuan_crmpd
	* @title: saveUserLabelInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveUserLabelInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("serialId", SequenceUtil.getSequence());
		inParam.put("userLabelCode", inMap.get("USER_LABEL_CODE"));
		inParam.put("userLabelType", inMap.get("USER_LABEL_TYPE"));
		inParam.put("userLabelName", inMap.get("USER_LABEL_NAME"));
		inParam.put("userLabelKey", inMap.get("USER_LABEL_KEY"));
		inParam.put("userLabelSource", inMap.get("USER_LABEL_SOURCE"));
		inParam.put("displayOrder", inMap.get("DISPLAY_ORDER"));
		inParam.put("busiCaliber", inMap.get("BUSI_CALIBER"));
		inParam.put("updateFreq", inMap.get("UPDATE_FREQ"));
		inParam.put("contact", inMap.get("CONTACT"));
		inParam.put("manufactor", inMap.get("MANUFACTOR"));
		inParam.put("custGroupId", inMap.get("CUST_GROUP_ID"));
		String beginDate = (String) inMap.get("BEGIN_DATE");
		String endDate = (String) inMap.get("END_DATE");
		if(CommonUtils.objectIsNull(beginDate) == false){
			  String beginDates = DateUtil.stringToString(this.timeConvert(beginDate), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
			  inParam.put("beginDate", beginDates);	
		}
		if(CommonUtils.objectIsNull(endDate) == false){
			  String endDates = DateUtil.stringToString(this.timeConvert(endDate), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
			  inParam.put("endDate", endDates);	
		}
		inParam.put("appRange", inMap.get("APP_RANGE"));
		inParam.put("labelWhere", inMap.get("LABEL_WHERE"));
		inParam.put("userLabelBoxtype", inMap.get("USER_LABEL_BOXTYPE"));
		return inParam;
	}
	
	/**
	 * 新增用户标签出参处理
	* @date: 2016-10-24 
	* @author: fangyuan_crmpd
	* @title: saveUserLabelOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveUserLabelOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}

	/**修改灰名单入参处理
	* @date: 2016-10-18 
	* @author: xiongxq
	* @Title: updateGreyInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> updateGreyInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String,Object> inMap = bean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("channelId", inMap.get("CHANNEL_ID"));
		inParam.put("serialId", inMap.get("SERIAL_ID"));
		inParam.put("regionCode", inMap.get("REGION_CODE"));
		inParam.put("phoneNo", inMap.get("PHONE_NO"));
		inParam.put("marketCaseId", inMap.get("MARKET_CASE_ID"));
		inParam.put("blackType", inMap.get("BLACK_TYPE"));
		inParam.put("marketCaseType", inMap.get("MARKET_CASE_TYPE"));
		inParam.put("channelName", inMap.get("CHANNEL_NAME"));
		
		String edTime = (String)inMap.get("END_DATE");
		String stTime = (String)inMap.get("START_DATE");
		
		if(CommonUtils.objectIsNull(stTime) == false){
		  String startTime = DateUtil.stringToString(this.timeConvert(stTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  inParam.put("startTime", startTime);	
		}
		if(CommonUtils.objectIsNull(edTime) == false){
		  String endTime = DateUtil.stringToString(this.timeConvert(edTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  inParam.put("endTime", endTime);	
		}
	
		inParam.put("fromTel", inMap.get("FROM_TEL"));
		inParam.put("note", inMap.get("NOTE"));
		return inParam;
	}

	/** 修改灰名单出参处理
	* @date: 2016-10-18 
	* @author: xiongxq
	* @Title: updateGreyOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO updateGreyOutParam() {
		MBean mBean = new MBean();
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(mBean);
		return standardOutDTO;
	}
	
	/**
	 * 修改异网号码池入参处理  
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: updateDifferentNetPhonePoolInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> updateDifferentNetPhonePoolInParam(InDTO inDTO) {
		MBean outBean = inDTO.getMbean();
		Map<String,Object> inMap = outBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("serialId", inMap.get("SERIAL_ID"));
		outMap.put("phoneNo", inMap.get("PHONE_NO"));
		outMap.put("operNo",inMap.get("OPER_NO"));
		outMap.put("operName", inMap.get("OPER_NAME"));
		outMap.put("note", inMap.get("NOTE"));
		
		String edTime = (String)inMap.get("END_TIME");
		String stTime = (String)inMap.get("START_TIME");
		String opTime = (String)inMap.get("OPER_TIME");
		if(!"".equals(stTime) && stTime != null) {
		  String startTime = DateUtil.stringToString(this.timeConvert(stTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  outMap.put("startTime", startTime);	
		}
		if(!"".equals(edTime) && edTime != null){
		  String endTime = DateUtil.stringToString(this.timeConvert(edTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  outMap.put("endTime", endTime);	
		}
		if(!"".equals(opTime) && opTime != null){
		  String oprTime = DateUtil.stringToString(this.timeConvert(opTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		  outMap.put("operTime", oprTime);	
		}
		
		return outMap;
	}

	/** 
	 * 修改异网号码池出参处理 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: updateDifferentNetPhonePoolOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO updateDifferentNetPhonePoolOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}
	
	/**
	 * 更新用户标签入参处理
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: updateUserLabelInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updateUserLabelInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("serialId", inMap.get("SERIAL_ID"));
		inParam.put("userLabelCode", inMap.get("USER_LABEL_CODE"));
		inParam.put("userLabelType", inMap.get("USER_LABEL_TYPE"));
		inParam.put("userLabelName", inMap.get("USER_LABEL_NAME"));
		inParam.put("userLabelKey", inMap.get("USER_LABEL_KEY"));
		inParam.put("userLabelSource", inMap.get("USER_LABEL_SOURCE"));
		inParam.put("displayOrder", inMap.get("DISPLAY_ORDER"));
		inParam.put("busiCaliber", inMap.get("BUSI_CALIBER"));
		inParam.put("updateFreq", inMap.get("UPDATE_FREQ"));
		inParam.put("contact", inMap.get("CONTACT"));
		inParam.put("manufactor", inMap.get("MANUFACTOR"));
		String beginDate = (String) inMap.get("BEGIN_DATE");
		String endDate = (String) inMap.get("END_DATE");
		if(CommonUtils.objectIsNull(beginDate) == false){
			  String beginDates = DateUtil.stringToString(this.timeConvert(beginDate), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
			  inParam.put("beginDate", beginDates);	
		}
		if(CommonUtils.objectIsNull(endDate) == false){
			  String endDates = DateUtil.stringToString(this.timeConvert(endDate), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
			  inParam.put("endDate", endDates);	
		}
		inParam.put("appRange", inMap.get("APP_RANGE"));
		inParam.put("labelWhere", inMap.get("LABEL_WHERE"));
		inParam.put("userLabelBoxtype", inMap.get("USER_LABEL_BOXTYPE"));
		return inParam;
	}

	/**
	 * 更新用户标签出参处理
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: updateUserLabelOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO updateUserLabelOutParam() {
		MBean mBean = new MBean();
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(mBean);
		return standardOutDTO;
	}

	/**
	 * 时间格式转换
	* @date: 2016-10-21 
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
}
