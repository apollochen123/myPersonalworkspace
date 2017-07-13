package com.sitech.strategy.manage.entity.param.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
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
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IWorkBenchManageParam;

/**
 * 工作台参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: WorkBenchManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class WorkBenchManageParam extends BaseManageEntity implements IWorkBenchManageParam {

	@Override
	public Map<String, Object> queryChannelMarketCaseOrderReportInfoInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		return outMap;
	}


	@Override
	public StandardOutDTO queryChannelMarketCaseOrderReportInfoOutParam(
			List<Map<String,Object>>  outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outMbean = new MBean();
		List<Map<String,Object>> statisticsList = new ArrayList<Map<String,Object>>();
	    Map<String,Object> outMap = new HashMap<String,Object>();
		
		List<Map<String,Object>> inList = outParam;
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String,Object> basic:inList){
				Map<String,Object> statisticsMap = new HashMap<String,Object>();
				statisticsMap.put("CHANNEL_ID", basic.get("channelId"));
				statisticsMap.put("TOTAL_SEND_NUM", basic.get("totalSendNum"));
				statisticsMap.put("TOTAL_CONTACT_NUM", basic.get("totalContactNum"));
				statisticsMap.put("TOTAL_ORDER_NUM", basic.get("totalOrderNum"));
				 
				statisticsList.add(statisticsMap);
			}
		}
		
		outMap.put("ORDER_STATISTICS_LIST", statisticsList);
		
		outMbean.setBody(outMap);
		standardOutDTO.setBean(outMbean);
		return standardOutDTO;
	}

	/** 
	 * 根据地市查询某个触点下的接触量的入参处理
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryChannelTouchNumByRegionCodeInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryChannelTouchNumByRegionCodeInParam(
			InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String nowDay = sdf.format(new Date());
        outMap.put("nowDay", nowDay);
		outMap.put("regionCode", inMap.get("REGION_CODE"));
		outMap.put("channelType", inMap.get("CHANNEL_TYPE"));
		return outMap;
	}

	/** 
	 * 根据地市查询某个触点下的接触量的出参处理
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryChannelTouchNumByRegionCodeOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryChannelTouchNumByRegionCodeOutParam(
			Map<String,Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,String> m = new HashMap<String,String>();
		int count01 = 0;
		int count02 = 0;
		int count03 = 0;
		int count04 = 0;
		int count05 = 0;
		int count06 = 0;
		
		List<Map<String,Object>> marketCaseNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> inList = (List<Map<String,Object>>)outParam.get("channelTouchNumList");
		if(CommonUtils.objectIsNull(inList) == false){
		  for(Map<String,Object> basic:inList){
			count01 +=  Integer.valueOf((String)basic.get("01"))==null?0:Integer.valueOf((String)basic.get("01"));
			count02 +=  Integer.valueOf((String)basic.get("02"))==null?0:Integer.valueOf((String)basic.get("02"));
			count03 +=  Integer.valueOf((String)basic.get("03"))==null?0:Integer.valueOf((String)basic.get("03"));
			count04 +=  Integer.valueOf((String)basic.get("04"))==null?0:Integer.valueOf((String)basic.get("04"));
			count05 +=  Integer.valueOf((String)basic.get("05"))==null?0:Integer.valueOf((String)basic.get("05"));
			count06 +=  Integer.valueOf((String)basic.get("06"))==null?0:Integer.valueOf((String)basic.get("06"));

		   }
		}
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		List<Map<String,Object>> recomList = (List<Map<String,Object>>)outParam.get("channelRecommendNumList");
		if(CommonUtils.objectIsNull(recomList) == false){
			  for(Map<String,Object> basic:recomList){
				count1 +=  Integer.valueOf((String)basic.get("01"))==null?0:Integer.valueOf((String)basic.get("01"));
				count2 +=  Integer.valueOf((String)basic.get("02"))==null?0:Integer.valueOf((String)basic.get("02"));
				count3 +=  Integer.valueOf((String)basic.get("03"))==null?0:Integer.valueOf((String)basic.get("03"));
				count4 +=  Integer.valueOf((String)basic.get("04"))==null?0:Integer.valueOf((String)basic.get("04"));
				count5 +=  Integer.valueOf((String)basic.get("05"))==null?0:Integer.valueOf((String)basic.get("05"));
				count6 +=  Integer.valueOf((String)basic.get("06"))==null?0:Integer.valueOf((String)basic.get("06"));

			   }
			}
		
		int countAcceptOne = 0;
		int countAcceptTwo = 0;
		int countAcceptThree = 0;
		int countAcceptFour = 0;
		int countAcceptFive = 0;
		int countAcceptSix = 0;
		List<Map<String,Object>> acceptList = (List<Map<String,Object>>)outParam.get("accpetList");
		if(CommonUtils.objectIsNull(recomList) == false){
			  for(Map<String,Object> basic:acceptList){
				countAcceptOne +=  Integer.valueOf((String)basic.get("01"))==null?0:Integer.valueOf((String)basic.get("01"));
				countAcceptTwo +=  Integer.valueOf((String)basic.get("02"))==null?0:Integer.valueOf((String)basic.get("02"));
				countAcceptThree +=  Integer.valueOf((String)basic.get("03"))==null?0:Integer.valueOf((String)basic.get("03"));
				countAcceptFour +=  Integer.valueOf((String)basic.get("04"))==null?0:Integer.valueOf((String)basic.get("04"));
				countAcceptFive +=  Integer.valueOf((String)basic.get("05"))==null?0:Integer.valueOf((String)basic.get("05"));
				countAcceptSix +=  Integer.valueOf((String)basic.get("06"))==null?0:Integer.valueOf((String)basic.get("06"));

			   }
			}
		
		
		
		Map<String,Object> marketCaseMapOne = new HashMap<String,Object>();
		marketCaseMapOne.put("CHANNEL_TYPE", "01");
		marketCaseMapOne.put("TOUCH_NUM",count01);
		marketCaseMapOne.put("RECOM_NUM",count1);
		marketCaseMapOne.put("ACCEPT_NUM",countAcceptOne);
		marketCaseNewList.add(marketCaseMapOne);
		Map<String,Object> marketCaseMapTwo = new HashMap<String,Object>();
		marketCaseMapTwo.put("CHANNEL_TYPE", "02");
		marketCaseMapTwo.put("TOUCH_NUM",count02);
		marketCaseMapTwo.put("RECOM_NUM",count2);
		marketCaseMapOne.put("ACCEPT_NUM",countAcceptTwo);
	    marketCaseNewList.add(marketCaseMapTwo);
	    Map<String,Object> marketCaseMapThree = new HashMap<String,Object>();
	    marketCaseMapThree.put("CHANNEL_TYPE", "03");
	    marketCaseMapThree.put("TOUCH_NUM",count03);
	    marketCaseMapThree.put("RECOM_NUM",count3);
	    marketCaseMapOne.put("ACCEPT_NUM",countAcceptThree);
	    marketCaseNewList.add(marketCaseMapThree);
	    Map<String,Object> marketCaseMapFour = new HashMap<String,Object>();
	    marketCaseMapFour.put("CHANNEL_TYPE", "04");
	    marketCaseMapFour.put("TOUCH_NUM",count04);
	    marketCaseMapFour.put("RECOM_NUM",count4);
	    marketCaseMapOne.put("ACCEPT_NUM",countAcceptFour);
	    marketCaseNewList.add(marketCaseMapFour);
	    Map<String,Object> marketCaseMapFive = new HashMap<String,Object>();
	    marketCaseMapFive.put("CHANNEL_TYPE", "05");
	    marketCaseMapFive.put("TOUCH_NUM",count05);
	    marketCaseMapFive.put("RECOM_NUM",count5);
	    marketCaseMapOne.put("ACCEPT_NUM",countAcceptFive);
	    marketCaseNewList.add(marketCaseMapFive);
	    Map<String,Object> marketCaseMapSix = new HashMap<String,Object>();
	    marketCaseMapSix.put("CHANNEL_TYPE", "06");
	    marketCaseMapSix.put("TOUCH_NUM",count06);
	    marketCaseMapSix.put("RECOM_NUM",count6);
	    marketCaseMapOne.put("ACCEPT_NUM",countAcceptSix);
	    marketCaseNewList.add(marketCaseMapSix);
		
		outMap.put("CHANNEL_TOUCH_NUM_LIST", marketCaseNewList);
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 根据地市查询某个营销案大类下面的接触量的入参转换 
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryMarketCaseTouchNumByRegionCodeInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryMarketCaseTouchNumByRegionCodeInParam(
			InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String nowDay = sdf.format(new Date());
		
        outMap.put("nowDay", nowDay);
		outMap.put("regionCode", inMap.get("REGION_CODE"));
		outMap.put("busiType", inMap.get("BUSI_TYPE"));
		return outMap;
	}

	/**
	 * 根据地市查询某个营销案大类下面的接触量的出参转换 
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryMarketCaseTouchNumByRegionCodeOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryMarketCaseTouchNumByRegionCodeOutParam(
			Map<String,Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		int count01 = 0;
		int count02 = 0;
		int count03 = 0;
		int count04 = 0;
		int count05 = 0;
		int count06 = 0;
		int count07 = 0;
		int count08 = 0;
		int count09 = 0;
		int count10 = 0;
		int count11 = 0;
		int count12 = 0;
		int count13 = 0;
		int count14 = 0;

		List<Map<String,Object>> marketCaseNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> inList = (List<Map<String,Object>>)outParam.get("marketCaseTouchNumList");
		if(CommonUtils.objectIsNull(inList) == false){
		  for(Map<String,Object> basic:inList){
			    count01 +=  Integer.valueOf((String)basic.get("01"))==null?0:Integer.valueOf((String)basic.get("01"));
				count02 +=  Integer.valueOf((String)basic.get("02"))==null?0:Integer.valueOf((String)basic.get("02"));
				count03 +=  Integer.valueOf((String)basic.get("03"))==null?0:Integer.valueOf((String)basic.get("03"));
				count04 +=  Integer.valueOf((String)basic.get("04"))==null?0:Integer.valueOf((String)basic.get("04"));
				count05 +=  Integer.valueOf((String)basic.get("05"))==null?0:Integer.valueOf((String)basic.get("05"));
				count06 +=  Integer.valueOf((String)basic.get("06"))==null?0:Integer.valueOf((String)basic.get("06"));
				count07 +=  Integer.valueOf((String)basic.get("07"))==null?0:Integer.valueOf((String)basic.get("07"));
				count08 +=  Integer.valueOf((String)basic.get("08"))==null?0:Integer.valueOf((String)basic.get("08"));
				count09 +=  Integer.valueOf((String)basic.get("09"))==null?0:Integer.valueOf((String)basic.get("09"));
				count10 +=  Integer.valueOf((String)basic.get("10"))==null?0:Integer.valueOf((String)basic.get("10"));
				count11 +=  Integer.valueOf((String)basic.get("11"))==null?0:Integer.valueOf((String)basic.get("11"));
				count12 +=  Integer.valueOf((String)basic.get("12"))==null?0:Integer.valueOf((String)basic.get("12"));
				count13 +=  Integer.valueOf((String)basic.get("13"))==null?0:Integer.valueOf((String)basic.get("13"));
				count14 +=  Integer.valueOf((String)basic.get("14"))==null?0:Integer.valueOf((String)basic.get("14"));
		   }
		}
		
		int countAccept01 = 0;
		int countAccept02 = 0;
		int countAccept03 = 0;
		int countAccept04 = 0;
		int countAccept05 = 0;
		int countAccept06 = 0;
		int countAccept07 = 0;
		int countAccept08 = 0;
		int countAccept09 = 0;
		int countAccept10 = 0;
		int countAccept11 = 0;
		int countAccept12 = 0;
		int countAccept13 = 0;
		int countAccept14 = 0;
		
		List<Map<String,Object>> acceptList = (List<Map<String,Object>>)outParam.get("acceptList");
		if(CommonUtils.objectIsNull(acceptList) == false){
			  for(Map<String,Object> basic:acceptList){
				    countAccept01 +=  Integer.valueOf((String)basic.get("01"))==null?0:Integer.valueOf((String)basic.get("01"));
					countAccept02 +=  Integer.valueOf((String)basic.get("02"))==null?0:Integer.valueOf((String)basic.get("02"));
					countAccept03 +=  Integer.valueOf((String)basic.get("03"))==null?0:Integer.valueOf((String)basic.get("03"));
					countAccept04 +=  Integer.valueOf((String)basic.get("04"))==null?0:Integer.valueOf((String)basic.get("04"));
					countAccept05 +=  Integer.valueOf((String)basic.get("05"))==null?0:Integer.valueOf((String)basic.get("05"));
					countAccept06 +=  Integer.valueOf((String)basic.get("06"))==null?0:Integer.valueOf((String)basic.get("06"));
					countAccept07 +=  Integer.valueOf((String)basic.get("07"))==null?0:Integer.valueOf((String)basic.get("07"));
					countAccept08 +=  Integer.valueOf((String)basic.get("08"))==null?0:Integer.valueOf((String)basic.get("08"));
					countAccept09 +=  Integer.valueOf((String)basic.get("09"))==null?0:Integer.valueOf((String)basic.get("09"));
					countAccept10 +=  Integer.valueOf((String)basic.get("10"))==null?0:Integer.valueOf((String)basic.get("10"));
					countAccept11 +=  Integer.valueOf((String)basic.get("11"))==null?0:Integer.valueOf((String)basic.get("11"));
					countAccept12 +=  Integer.valueOf((String)basic.get("12"))==null?0:Integer.valueOf((String)basic.get("12"));
					countAccept13 +=  Integer.valueOf((String)basic.get("13"))==null?0:Integer.valueOf((String)basic.get("13"));
					countAccept14 +=  Integer.valueOf((String)basic.get("14"))==null?0:Integer.valueOf((String)basic.get("14"));
			   }
			}
		
		
		Map<String,Object> marketCaseMap1 = new HashMap<String,Object>();
	    marketCaseMap1.put("BUSI_TYPE","01");
	    marketCaseMap1.put("TOUCH_NUM", count01);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept01);
		marketCaseNewList.add(marketCaseMap1);
		Map<String,Object> marketCaseMap2 = new HashMap<String,Object>();
		marketCaseMap2.put("BUSI_TYPE","02");
	    marketCaseMap2.put("TOUCH_NUM", count02);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept02);
	    marketCaseNewList.add(marketCaseMap2);
	    Map<String,Object> marketCaseMap3 = new HashMap<String,Object>();
	    marketCaseMap3.put("BUSI_TYPE","03");
	    marketCaseMap3.put("TOUCH_NUM", count03);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept03);
	    marketCaseNewList.add(marketCaseMap3);
	    Map<String,Object> marketCaseMap4 = new HashMap<String,Object>();
		marketCaseMap4.put("BUSI_TYPE","04");
	    marketCaseMap4.put("TOUCH_NUM", count04);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept04);
	    marketCaseNewList.add(marketCaseMap4);
	    Map<String,Object> marketCaseMap5 = new HashMap<String,Object>();
	    marketCaseMap5.put("BUSI_TYPE","05");
	    marketCaseMap5.put("TOUCH_NUM", count05);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept05);
	    marketCaseNewList.add(marketCaseMap5);
	    Map<String,Object> marketCaseMap6 = new HashMap<String,Object>();
	    marketCaseMap6.put("BUSI_TYPE","06");
	    marketCaseMap6.put("TOUCH_NUM", count06);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept06);
	    marketCaseNewList.add(marketCaseMap6);
	    Map<String,Object> marketCaseMap7 = new HashMap<String,Object>();
	    marketCaseMap7.put("BUSI_TYPE","07");
	    marketCaseMap7.put("TOUCH_NUM", count07);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept07);
	    marketCaseNewList.add(marketCaseMap7);
	    Map<String,Object> marketCaseMap8 = new HashMap<String,Object>();
		marketCaseMap8.put("BUSI_TYPE","08");
	    marketCaseMap8.put("TOUCH_NUM", count08);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept08);
	    marketCaseNewList.add(marketCaseMap8);
	    Map<String,Object> marketCaseMap9 = new HashMap<String,Object>();
		marketCaseMap9.put("BUSI_TYPE","09");
	    marketCaseMap9.put("TOUCH_NUM", count09);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept09);
	    marketCaseNewList.add(marketCaseMap9);
	    Map<String,Object> marketCaseMap10 = new HashMap<String,Object>();
	    marketCaseMap10.put("BUSI_TYPE","10");
	    marketCaseMap10.put("TOUCH_NUM", count10);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept10);
	    marketCaseNewList.add(marketCaseMap10);
	    Map<String,Object> marketCaseMap11 = new HashMap<String,Object>();
	    marketCaseMap11.put("BUSI_TYPE","11");
	    marketCaseMap11.put("TOUCH_NUM", count11);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept11);
	    marketCaseNewList.add(marketCaseMap11);
	    Map<String,Object> marketCaseMap12 = new HashMap<String,Object>();
	    marketCaseMap12.put("BUSI_TYPE","12");
	    marketCaseMap12.put("TOUCH_NUM", count12);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept12);
	    marketCaseNewList.add(marketCaseMap12);
	    Map<String,Object> marketCaseMap13 = new HashMap<String,Object>();
	    marketCaseMap13.put("BUSI_TYPE","13");
	    marketCaseMap13.put("TOUCH_NUM", count13);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept13);
	    marketCaseNewList.add(marketCaseMap13);
	    Map<String,Object> marketCaseMap14 = new HashMap<String,Object>();
	    marketCaseMap14.put("BUSI_TYPE","14");
	    marketCaseMap14.put("TOUCH_NUM", count14);
	    marketCaseMap1.put("ACCEPT_NUM", countAccept14);
	    marketCaseNewList.add(marketCaseMap14);

		
		outMap.put("MARKET_CASE_TOUCH_NUM_LIST", marketCaseNewList);
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 查询营销案审批数量入参处理
	* @date: 2016-11-4 
	* @author: mengxi
	* @title: qureyMarketCaseAuditNumInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> qureyMarketCaseAuditNumInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("auditNo", inMap.get("AUDIT_NO"));
		outMap.put("auditStatus", inMap.get("AUDIT_STATUS"));
		return outMap;
	}
	
	
	/**
	 * 查询营销案审批数量出参处理
	* @date: 2016-11-4 
	* @author: mengxi
	* @title: qureyMarketCaseAuditNumOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO qureyMarketCaseAuditNumOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("AUDIT_RECORD_NUM", outParam.get("auditRecordNum") == null?"":outParam.get("auditRecordNum"));
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 查询营销案数量入参处理
	* @date: 2016-11-8 
	* @author: mengxi
	* @title: qureyMarketCaseNumInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> qureyMarketCaseNumInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("operNo", inMap.get("OPER_NO"));
		outMap.put("marketStatusCode", inMap.get("MARKET_STATUS_CODE"));
		outMap.put("regionCode", inMap.get("REGION_CODE"));
		return outMap;
	}
	
	/**
	 * 查询营销案数量出参处理
	* @date: 2016-11-8 
	* @author: mengxi
	* @title: qureyMarketCaseNumOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO qureyMarketCaseNumOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("MARKET_CASE_NUM", outParam.get("marketCaseNum") == null?"":outParam.get("marketCaseNum"));
		
		List<Map<String,Object>> marketCaseList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> outList = (List<Map<String,Object>>) outParam.get("marketCaseList");
		if(!CommonUtils.objectIsNull(outList)){
			for(Map<String,Object> out:outList){
				Map<String,Object> map = new HashMap<String,Object>();
				map.put("MARKET_CASE_COUNT", out.get("marketCaseCount"));
				map.put("STATUS_CODE", out.get("statusCode"));
				marketCaseList.add(map);
			}
		}
		outMap.put("MARKET_CASE_LIST", marketCaseList);
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}


	@Override
	public Map<String, Object> queryMarketCaseOrderReportSendNumInParam(
			InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("sendDate", inMap.get("SEND_DATE"));
		return outMap;
	}


	@Override
	public StandardOutDTO queryMarketCaseOrderReportSendNumOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("TOTAL_SEND_NUM", outParam.get("totalSendNum") == null?"":outParam.get("totalSendNum"));
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	

/**
	 * 查询公告表入参处理
	* @date: 2017-2-27 
	* @author: yexr
	* @title: queryNoticeListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryNoticeListInParam(InDTO inDTO){
		MBean inBean = inDTO.getMbean();
		Map<String, Object> inMap = inBean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("noticeName", inMap.get("NOTICE_NAME"));
		inParam.put("sortFlag", inMap.get("SORT_FLAG"));
		inParam.put("sortField", inMap.get("SORT_FIELD"));
		inParam.put("queryId", inMap.get("QUERY_ID"));
		inParam.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		inParam.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		inParam.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		return inParam;
	}
	
	/**
	 * 查询公告表出参处理
	* @date: 2017-2-27 
	* @author: yexr
	* @title: queryNoticeListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryNoticeListOutParam(Map<String, Object> outParam) {
		List<Map<String, Object>> inList = (List<Map<String, Object>>) outParam.get("noticeList");
		List<Map<String, Object>> outList = new ArrayList<Map<String, Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String, Object> inMap : inList){
				Map<String, Object> outMap = new HashMap<String, Object>();				
				outMap.put("SERIAL_ID", inMap.get("serialId"));
				outMap.put("NOTICE_NAME", inMap.get("noticeName"));
				outMap.put("REGION_CODE", inMap.get("regionCode"));
				outMap.put("OPER_NO", inMap.get("operNo"));
				outMap.put("OPER_NAME", inMap.get("operName"));
				outMap.put("SHOW_FLAG", inMap.get("showFlag"));
				String createTime =DateUtil.timestamp2String((Timestamp) inMap.get("createTime"),DateUtil.TIME_FROMAT_SIMPLE2);
//				String crTime = (String)inMap.get("createTime");
//				if(CommonUtils.objectIsNull(crTime) == false){
//					 String createTime = DateUtil.stringToString(crTime, DateUtil.TIME_FROMAT_SIMPLE2, DateUtil.TIME_FROMAT_SIMPLE3);
//					 outMap.put("CREATE_TIME", createTime);
//				}
				outMap.put("CREATE_TIME", createTime);
				outMap.put("NOTICE_DESC", inMap.get("noticeDesc"));		 		
				outList.add(outMap);
			}
		}
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("QUERY_NOTICE_LIST", outList);
		map.put("PER_RECORD_COUNT", outParam.get("perRecordCount")==null?0:outParam.get("perRecordCount"));
		map.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		map.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount")==null?0:outParam.get("totalRecordCount"));
		map.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outBean.setBody(map);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 查询产商品信息报表入参
	* @date: 2017-2-22 
	* @author: hannn
	* @title: queryProductCommodityReportInfoListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override	
    public Map<String, Object> queryProductCommodityReportInfoListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> basic = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		Object keyWords=basic.get("KEY_WORDS");
		if(CommonUtils.objectIsNull(keyWords)==false){
			outMap.put("keyWords", basic.get("KEY_WORDS"));
			outMap.put("productCommodityId", basic.get("PRODUCTCOMMODITY_ID"));
			outMap.put("productCommodityName", basic.get("PRODUCTCOMMODITY_NAME"));
			outMap.put("cityId", basic.get("CITY_ID"));
			outMap.put("reportDate", basic.get("REPORT_DATE").toString().replace("-", ""));
		}else{
			outMap.put("productCommodityId", basic.get("KEYS"));
			outMap.put("productCommodityName", basic.get("KEYS"));		
			outMap.put("cityId", basic.get("KEYS"));
			outMap.put("reportDate", basic.get("KEYS"));		
		}
		outMap.put("startNum", basic.get("STARTNUM"));
		outMap.put("endNum", basic.get("ENDNUM"));
		return outMap;
	}

   /**
    * 产商品信息报表出参
   * @date: 2017-2-22 
   * @author: hannn
   * @title: queryProductCommodityReportInfoListOutParam 
   * @param outParam
   * @return 
   * @exception: 
   * @version: 1.0 
   * @description: 
   * update_version: update_date: update_author: update_note:
    */
	@Override
	public StandardOutDTO queryProductCommodityReportInfoListOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> productCommodityNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> productCommodityReportInfoList = (List<Map<String, Object>>) outParam.get("productCommodityReportInfoList");
		if(!CommonUtils.objectIsNull(productCommodityReportInfoList)){
		  for(Map<String,Object> basic:productCommodityReportInfoList){
		    Map<String,Object> productCommodityReportInfoMap = new HashMap<String,Object>();
		    productCommodityReportInfoMap.put("PRODUCTCOMMODITY_TYPE", basic.get("productcommodityType"));
			productCommodityReportInfoMap.put("PRODUCTCOMMODITY_ID", basic.get("productCommodityId"));
			productCommodityReportInfoMap.put("PRODUCTCOMMODITY_NAME", basic.get("productCommodityName"));
			Timestamp effTime = (Timestamp)basic.get("effTime");
			if(effTime !=null && !"".equals(effTime)){
				String effTimes = DateUtil.timestamp2String(effTime, DateUtil.TIME_FROMAT_SIMPLE1);
				productCommodityReportInfoMap.put("EFF_TIME", effTimes);
			}else{
				productCommodityReportInfoMap.put("EFF_TIME", "");
			}
			productCommodityReportInfoMap.put("CITY_ID", basic.get("cityIdName"));
			productCommodityReportInfoMap.put("REACH_NUM", basic.get("reachNum"));
			productCommodityReportInfoMap.put("ORDER_NUM_D", basic.get("orderNumD"));
			productCommodityReportInfoMap.put("ORDER_NUM_M", basic.get("orderNumM"));
			productCommodityReportInfoMap.put("REPORT_DATE", basic.get("reportDate"));
			productCommodityNewList.add(productCommodityReportInfoMap);
		
		   }
		}
		outMap.put("QUERY_PRODUCTCOMMONREPORT_LIST", productCommodityNewList);
		outMap.put("TOTALRECORD", outParam.get("totalRecord"));
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	/**
	 * 查询各个地市的转化率的入参转换 
	* @date: 2016-12-7 
	* @author: tangaq
	* @Title: queryRegionCodeConvertRateInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryRegionCodeConvertRateInParam(
			InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("regionCode", inMap.get("REGION_CODE"));
		return outMap;
	}


	/** 
	 * 查询各个地市的转化率的出参转换
	* @date: 2016-12-7 
	* @author: tangaq
	* @Title: queryRegionCodeConvertRateOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryRegionCodeConvertRateOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> marketCaseNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> inList = (List<Map<String,Object>>)outParam.get("convertRateList");
		if(CommonUtils.objectIsNull(inList) == false){
		  for(Map<String,Object> basic:inList){
			Map<String,Object> marketCaseMap = new HashMap<String,Object>();
		    marketCaseMap.put("TOUCH_COUNT", basic.get("touchNum"));
		    marketCaseMap.put("TOUCH_DAY", basic.get("touchDay"));
		    marketCaseMap.put("EXEC_COUNT", basic.get("execNum"));
		    marketCaseMap.put("REGION_CODE", basic.get("regionCode"));
		    
			marketCaseNewList.add(marketCaseMap);
		
		   }
		}
		
		outMap.put("CONVERT_RATE_LIST", marketCaseNewList);
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}


	/** 
	 * 根据地市查询用户接触量入参处理 
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryUserTouchNumByRegionCodeInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryUserTouchNumByRegionCodeInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMM");
		String nowMonth = df.format(new Date());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        String nowDay = sdf.format(new Date());
		
        outMap.put("nowDay", nowDay);
        outMap.put("nowMonth", nowMonth);
		outMap.put("regionCode", inMap.get("REGION_CODE"));
		return outMap;
	}

	/** 
	 * 根据地市查询用户接触量出参处理
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryUserTouchNumByRegionCodeInParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO queryUserTouchNumByRegionCodeOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		int countDay = 0;
		int countMonth = 0;
		List<Map<String,Object>> marketCaseNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> inList = (List<Map<String,Object>>)outParam.get("userTouchNumList");
		Map<String,Object> marketCaseMap = new HashMap<String,Object>();
		if(CommonUtils.objectIsNull(inList) == false){
		  for(Map<String,Object> basic:inList){
			countDay +=Integer.valueOf((String)basic.get("DayNum"))==null?0:Integer.valueOf((String)basic.get("DayNum"));
			countMonth +=Integer.valueOf((String)basic.get("MonthNum"))==null?0:Integer.valueOf((String)basic.get("MonthNum"));
		   }
		}
		    marketCaseMap.put("TOUCH_NUM", countDay);
		    marketCaseMap.put("EXEC_NUM", countMonth);
		    
			marketCaseNewList.add(marketCaseMap);
		
		outMap.put("USER_TOUCH_NUM_LIST", marketCaseNewList);
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	
	/**
	 * 新增公告入参处理
	* @date: 2017-3-1 
	* @author: yexr
	* @title: saveNoticeInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveNoticeInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("serialId", SequenceUtil.getSequence());
		inParam.put("noticeName", inMap.get("NOTICE_NAME"));
		inParam.put("showFlag", inMap.get("SHOW_FLAG"));
		inParam.put("noticeDesc", inMap.get("NOTICE_DESC"));
		inParam.put("createTime",inMap.get("CREATE_TIME"));
		inParam.put("operNo", inMap.get("OPER_NO"));
		inParam.put("operName", inMap.get("OPER_NAME"));
		return inParam;
	}
	
	/**
	 * 新增公告出参处理
	* @date: 2017-3-1 
	* @author: yexr
	* @title: saveNoticeOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveNoticeOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}
	
	
	/**
	 *  删除公告入参处理
	* @date: 2017-3-1 
	* @author: yexr
	* @title: removeNoticeInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removeNoticeInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String,Object> inMap = bean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("serialId", inMap.get("SERIAL_ID"));
		return inParam;
	}

	/**
	 * 删除公告出参处理
	* @date: 2017-3-1 
	* @author: yexr
	* @title: removeNoticeOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeNoticeOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}
	
	
	/**
	 * 修改公告入参处理
	* @date: 2017-3-1 
	* @author: yexr
	* @title: updateNoticeInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updateNoticeInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("serialId", inMap.get("SERIAL_ID"));
		inParam.put("noticeName", inMap.get("NOTICE_NAME"));
		inParam.put("showFlag", inMap.get("SHOW_FLAG"));
		inParam.put("noticeDesc", inMap.get("NOTICE_DESC"));
		inParam.put("createTime",inMap.get("CREATE_TIME"));
		inParam.put("operNo", inMap.get("OPER_NO"));
		inParam.put("operName", inMap.get("OPER_NAME"));
		return inParam;
	}
	

	/**
	 * 修改公告出参处理
	* @date: 2017-3-1 
	* @author: yexr
	* @title: updateNoticeOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO updateNoticeOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}
	
}
