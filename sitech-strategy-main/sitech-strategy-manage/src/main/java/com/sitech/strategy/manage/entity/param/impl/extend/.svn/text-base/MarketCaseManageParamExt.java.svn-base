package com.sitech.strategy.manage.entity.param.impl.extend;

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
import com.sitech.strategy.manage.entity.param.impl.MarketCaseManageParam;

/**
 * 湖北参数转换
* @date: 2016-9-15 
* @author: tangaq
* @title: HbMarketCaseManageParam 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class MarketCaseManageParamExt extends MarketCaseManageParam {
	
	/**
	 * 将客户群Id大小写转换
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: marketCaseIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> marketCaseIdInParam(InDTO inDTO){
		MBean mbean = inDTO.getMbean();
		Map<String,Object> marketCaseId = (Map<String,Object>)mbean.getBody();
		Map<String,Object> marketCaseIdMap = new HashMap<String,Object>();
		marketCaseIdMap.put("marketCaseId", marketCaseId.get("MARKET_CASE_ID"));
		return marketCaseIdMap;
	}

	/**
	 * marketCaseDetail出参处理
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: marketCaseOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO marketCaseDetailOutParam(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		//marketCaseBasic
		Map<String,Object> marketCaseBasicMap = super.marketCaseBasicMapOutParam(outParam);
		
		//CustGroupList
		List<Map<String,Object>> custGoupNewList = this.custGroupNewListOutParam(outParam);
		
		//ChannelList
		List<Map<String,Object>> channelList = this.channelNewListOutParam(outParam);
		
		//ContentDetailList
		List<Map<String,Object>> contentDetailList = this.contentDetailNewListOutParam(outParam);
		
		//RuleDetailList
		List<Map<String,Object>> ruleDetailList = this.ruleDetailNewListOutParam(outParam);
		
		standardOutDTO = this.MarketCaseOutParam(marketCaseBasicMap,custGoupNewList,channelList,contentDetailList,ruleDetailList);
		
	    return standardOutDTO;
	}

	/**
	 * 查询营销案列表入参大小写转换
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: marketCaseListInParam 
	* @param basic
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> marketCaseListInParam(InDTO inDTO){
		MBean inBean = inDTO.getMbean();
		Map<String,Object> basic = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("keyWords", basic.get("KEY_WORDS"));
		outMap.put("marketCaseType", basic.get("MARKET_CASE_TYPE"));
		outMap.put("busiType", basic.get("BUSI_TYPE"));
		outMap.put("position", basic.get("POSITION_ID"));
		outMap.put("statusCode", basic.get("STATUS_CODE"));
		outMap.put("regionCode", basic.get("REGION_CODE"));
		outMap.put("sortFalg", basic.get("SORT_FLAG"));
		outMap.put("sortField", basic.get("SORT_FIELD"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_MC);
		outMap.put("currentPageCode", basic.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", basic.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", basic.get("TOTAL_RECORD_COUNT"));
		outMap.put("isPage", basic.get("IS_PAGE"));
		outMap.put("isSort", basic.get("IS_Sort"));
		outMap.put("loginNo", basic.get("LOGIN_NO"));
		
		return outMap;
	}

	/**
	 * 查询营销案列表出参大小写转换
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: marketCaseListOutParam 
	* @param basic
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO marketCaseListOutParam(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		
		List<Map<String,Object>> inList = (List<Map<String, Object>>) outParam.get("marketCaseList");
		List<Map<String,Object>> marketCaseNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		for(Map<String,Object> basic:inList){
		Map<String,Object> noMap = new HashMap<String,Object>();
		
		noMap.put("MARKET_CASE_NAME", basic.get("marketCaseName"));
		noMap.put("MARKET_CASE_TYPE", basic.get("marketCaseType"));
		noMap.put("MARKET_CASE_TYPE_NAME", basic.get("marketCaseTypeName"));
		noMap.put("MARKET_CASE_BUSI_TYPE", basic.get("marketCaseBusiType"));
		noMap.put("MARKET_CASE_BUSI_TYPE_NAME", basic.get("marketCaseBusiTypeName"));
		noMap.put("REGION_CODE", basic.get("regionCode"));
		noMap.put("CHANNEL_TYPE", basic.get("channelType"));
		noMap.put("POSITION_ID", basic.get("position"));
		noMap.put("STATUS_CODE", basic.get("statusCode"));
		noMap.put("OPER_NO", basic.get("operNo"));
		noMap.put("OPER_TIME", basic.get("operTime"));
		marketCaseNewList.add(noMap);
		}
		
		outMap.put("MARKET_CASE_LIST", marketCaseNewList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 保存营销案详细信息入参参数处理
	* @date: 2016-9-5 
	* @author: xiongxq
	* @Title: marketCaseDetailInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> saveMarketCaseDetailInParam(InDTO inDTO) {
		
		//marketCaseBasic
		Map<String,Object> marketCaseBasicMap = super.marketCaseBasicMapInParam(inDTO);
		
		//CustGroupList
		List<Map<String,Object>> custGoupNewList = this.custGroupNewListInParam(inDTO);
		
		//marketCaseDetail
		Map<String,Object> marketCaseDetailMap = this.marketCaseDetailMapInParam(inDTO);
		
		Map<String,Object> outMap = this.marketCaseInParam(marketCaseBasicMap,custGoupNewList,marketCaseDetailMap);
		
		return outMap;
		
	}

	/**
	 * positionList入参参数处理
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: positionNewListInParam 
	* @param positionList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> positionNewListInParam(List<Map<String,Object>>  positionList){
		List<Map<String,Object>> positionNewList = new ArrayList<Map<String,Object>>();
		for(Map<String,Object> positionMap:positionList){
			Map<String,Object> positionNewMap = new HashMap<String, Object>();
			positionNewMap.put("positionId", positionMap.get("POSITION_ID"));
			positionNewList.add(positionNewMap);
		}
		return positionNewList;
		
	}

	/**
	 * position出参参数处理
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: positionNewListOutParam 
	* @param positionList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> positionNewListOutParam(List<Map<String,Object>>  positionList){
	    
		for(Map<String,Object> positionMap:positionList){
			Map<String,Object> positionNewMap = new HashMap<String, Object>();
			positionNewMap.put("POSITION_ID", positionMap.get("positionId"));
			positionList.add(positionNewMap);
		}
		return positionList;
		
	}

	/**
	 * 获取详细信息
	* @date: 2016-9-23 
	* @author: zhangjj_crmpd
	* @title: marketCaseDetailMapInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> marketCaseDetailMapInParam(InDTO inDTO){
		MBean mbean = inDTO.getMbean();
		Map<String,Object> inParam = (Map<String,Object>)mbean.getBody();
		Map<String,Object> detail = (Map<String,Object>)inParam.get("MARKET_CASE_DETAIL");
		Map<String,Object> outDetail = new HashMap<String, Object>();
		//渠道信息
		getChannelByDetail(outDetail,detail);
		//产商品信息
		
		outDetail.put("positionList", getPositionByDetail(detail));
		
		return outDetail;
	}
	/**
	 * 从详细信息里获取运营位详细信息
	* @date: 2016-9-23 
	* @author: zhangjj_crmpd
	* @title: getPositionByDetail 
	* @param outDetail
	* @param detail 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> getPositionByDetail(
			Map<String, Object> detail) {
		List<Map<String,Object>> outPositionList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> positionList = (List<Map<String, Object>>) detail.get("POSITION_LIST");
		if(!CommonUtils.objectIsNull(positionList)){
			for(Map<String,Object> position: positionList){
				outPositionList.add(getPositionByList(position));
			}
		}
		return outPositionList;
		
	}

	/**
	 * 从渠道列表中获取渠道信息
	* @date: 2016-9-23 
	* @author: zhangjj_crmpd
	* @title: getPositionByList 
	* @param position 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> getPositionByList(Map<String, Object> position) {
		Map<String, Object> outPosition = new HashMap<String, Object>();
		outPosition.put("positionId", position.get("POSITION_ID"));
		outPosition.put("contentInfo", getContentByPosition(position)) ;
		outPosition.put("ruleList", getRuleByPosition(position));
		return outPosition;
	}

	/**
	 * 从运营位中获取内容信息
	* @date: 2016-10-11 
	* @author: zhangjj_crmpd
	* @title: getContentByPosition 
	* @param position
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> getContentByPosition(Map<String, Object> position){
		Map<String, Object> outContent = new HashMap<String, Object>();
		Map<String, Object> content = (Map<String, Object>) position.get("CONTENT_INFO");
		outContent.put("contentInfo", getContentDetailListByContent(content));
		return null;
	}
	
	
	protected List<Map<String,Object>> getRuleByPosition(Map<String, Object> position) {
		List<Map<String,Object>> outRuleList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> ruleList = (List<Map<String, Object>>) position.get("RULE_LIST");
		if(ruleList!=null && ruleList.size()>0){
			for(Map<String,Object> rule : ruleList){
				outRuleList.add(getRuleContentByList(rule));
			}
		}
		
		return outRuleList;
	}

	protected Map<String,Object> getRuleContentByList(Map<String, Object> rule) {
		Map<String,Object> outRule = new HashMap<String,Object>();
		List<Map<String,Object>> outRuleDetailList = new ArrayList<Map<String,Object>>();
		outRule.put("ruleType", rule.get("RULE_TYPE"));
		List<Map<String,Object>> ruleDetailList = (List<Map<String, Object>>) rule.get("RULE_DETAIL_LIST");
		if(ruleDetailList!=null && ruleDetailList.size()>0){
			for(Map<String,Object> ruleDetail : ruleDetailList){
				outRuleDetailList.add(getRuleDetailByList(ruleDetail));
			}
		}
		outRule.put("ruleDetailList", outRuleDetailList);
		return outRule;
	}

	protected Map<String, Object> getRuleDetailByList(
			Map<String, Object> ruleDetail) {
		Map<String,Object> outRuleDetail = new HashMap<String,Object>();
		outRuleDetail.put("ruleParValue", ruleDetail.get("RULE_PAR_VALUE"));
		outRuleDetail.put("ruleDetailType", ruleDetail.get("RULE_DETAIL_TYPE"));
		outRuleDetail.put("ruleParCode", ruleDetail.get("RULE_PAR_CODE"));
		outRuleDetail.put("ruleParName", ruleDetail.get("RULE_PAR_NAME"));
		return outRuleDetail;
	}

	/**
	 * 从内容里获取详细信息
	* @date: 2016-10-11 
	* @author: zhangjj_crmpd
	* @title: getContentDetailListByContent 
	* @param content
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getContentDetailListByContent(Map<String, Object> content) {
		Map<String,Object> outContentInfo = new HashMap<String, Object>();
		List<Map<String,Object>> outContentDetailList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> contentDetailList = (List<Map<String, Object>>) content.get("CONTENT_DETAIL_LIST");
		if(!CommonUtils.objectIsNull(contentDetailList)){
			for(Map<String,Object> contentDetail: contentDetailList){
				outContentDetailList.add(getContentDetailByList(contentDetail));
			}
		}
		outContentInfo.put("contentDetailList", outContentDetailList);
		return outContentInfo;
	}

	/**
	 * 从列表中获取内容详细信息
	* @date: 2016-10-11 
	* @author: zhangjj_crmpd
	* @title: getContentDetailByList 
	* @param contentDetail
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getContentDetailByList(Map<String,Object> contentDetail) {
		Map<String,Object> outContentDetail = new HashMap<String,Object>();
		outContentDetail.put("contentDetailType", contentDetail.get("CONTENT_DETAIL_TYPE"));
		outContentDetail.put("contentParName", contentDetail.get("CONTENT_PAR_NAME"));
		outContentDetail.put("contentParValue", contentDetail.get("CONTENT_PAR_VALUE"));
		outContentDetail.put("contentParCode", contentDetail.get("CONTENT_PAR_CODE"));
		return outContentDetail;
	}

	/**
	 * 从详细信息里获取渠道信息
	* @date: 2016-9-23 
	* @author: zhangjj_crmpd
	* @title: getChannelByDetail 
	* @param outDetail
	* @param detail 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void getChannelByDetail(Map<String, Object> outDetail,
			Map<String, Object> detail) {
		List<Map<String,Object>> channelList = (List<Map<String, Object>>) detail.get("CHANNEL_LIST");
		List<Map<String,Object>> outChannelList = new ArrayList<Map<String,Object>>();
		
		if(!CommonUtils.objectIsNull(channelList)){
			for(Map<String,Object> channel: channelList){
				Map<String,Object> outChannel = new HashMap<String, Object>();
				outChannel.put("channelId", detail.get("CHANNEL_ID"));
				outChannel.put("POSITION_LIST", getPositionByDetail(detail));
				outChannelList.add(outChannel);
			}
		}
	}

	/**
	 * marketCaseBasic入参大小写转换
	* @date: 2016-9-23
	* @author: zhangjj_crmpd
	* @title: marketCaseBasicMapInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> marketCaseBasicMapInParam(InDTO inDTO){
		MBean mbean = inDTO.getMbean();
		Map<String,Object> marketCase= (Map<String,Object>)mbean.getBody();
		Map<String,Object> marketCaseBasic = (Map<String,Object>)marketCase.get("MARKET_CASE_BASIC");
		Map<String,Object> marketCaseBasicMap = new HashMap<String,Object>();
		
		marketCaseBasicMap.put("marketCaseClass", marketCaseBasic.get("MARKET_CASE_CLASS"));
		marketCaseBasicMap.put("marketCaseLevel", marketCaseBasic.get("MARKET_CASE_LEVEL"));
		marketCaseBasicMap.put("marketCaseId", marketCaseBasic.get("MARKET_CASE_ID"));
		marketCaseBasicMap.put("marketCaseName", marketCaseBasic.get("MARKET_CASE_NAME"));
		marketCaseBasicMap.put("marketCaseType", marketCaseBasic.get("MARKET_CASE_TYPE"));
		marketCaseBasicMap.put("marketCaseBusiType", marketCaseBasic.get("MARKET_CASE_BUSI_TYPE"));
		marketCaseBasicMap.put("statusCode", marketCaseBasic.get("STATUS_CODE"));
		marketCaseBasicMap.put("regionCode", marketCaseBasic.get("REGION_CODE"));
		marketCaseBasicMap.put("groupId", marketCaseBasic.get("GROUP_ID"));
		marketCaseBasicMap.put("marketCaseDesc", marketCaseBasic.get("MARKET_CASE_DESC"));
		marketCaseBasicMap.put("operNo", marketCaseBasic.get("OPER_NO"));
		marketCaseBasicMap.put("operName", marketCaseBasic.get("OPER_NAME"));
		marketCaseBasicMap.put("updateNo", marketCaseBasic.get("UPDATE_NO"));
		marketCaseBasicMap.put("updateName", marketCaseBasic.get("UPDATE_NAME"));
		
		
		String stTime = (String)marketCaseBasic.get("START_TIME");
		String edTime = (String)marketCaseBasic.get("END_TIME");
		String opTime = (String)marketCaseBasic.get("OPER_TIME");
		if(CommonUtils.objectIsNull(stTime) == false){
	         String startTime = DateUtil.stringToString(this.timeConvert(stTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		     marketCaseBasicMap.put("startTime", startTime);
		}
		if(CommonUtils.objectIsNull(edTime) == false){
		     String endTime = DateUtil.stringToString(this.timeConvert(edTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
		     marketCaseBasicMap.put("endTime", endTime);	
		}
		if(CommonUtils.objectIsNull(opTime) == false){
			 String operTime = DateUtil.stringToString(this.timeConvert(opTime), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3);
			 marketCaseBasicMap.put("operTime", operTime);	
		}
		
		
		return marketCaseBasicMap;
	}
	
     /**
    * 营销案入参处理
    * @date: 2016-9-15 
    * @author: tangaq
    * @title: marketCaseInParam 
    * @param marketCaseBasicMap
    * @param custGoupList
    * @param channelList
    * @param contentDetailList
    * @param ruleDetailList
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
    */
	protected Map<String, Object> marketCaseInParam(
			Map<String, Object> marketCaseBasicMap,
			List<Map<String, Object>> custGoupList,
			Map<String, Object> marketCaseDetailMap) {
		
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("marketCaseBasic", marketCaseBasicMap);
		outMap.put("custGroupList", custGoupList);
		outMap.put("marketCaseDetail", marketCaseDetailMap);
		return outMap;
	}

	/**
	 * RuleDetailList入参参数转换
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: ruleDetailNewListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> ruleDetailNewListInParam(InDTO inDTO) {
         MBean outBean=inDTO.getMbean();
		 
		 List<Map<String,Object>> ruleDetailList = (List<Map<String,Object>>)outBean.getBodyList("RULE_DETAIL_LIST");
		 List<Map<String,Object>> ruleDetailNewList = new ArrayList<Map<String,Object>>();
		 
		 for(Map<String,Object> ruleDetailMap:ruleDetailList){
			 Map<String,Object> ruleDetailNewMap = new HashMap<String, Object>();
			
			 ruleDetailNewMap.put("ruleDetailType", ruleDetailMap.get("RULE_DETAIL_TYPE"));
			 ruleDetailNewMap.put("ruleParCode", ruleDetailMap.get("RULE_PAR_CODE"));
			 ruleDetailNewMap.put("ruleParName", ruleDetailMap.get("RULE_PAR_NAME"));
			 ruleDetailNewMap.put("ruleParValue", ruleDetailMap.get("RULE_PAR_VALUE"));
			 
			 ruleDetailNewList.add(ruleDetailNewMap);
		 }
		 
		return ruleDetailNewList;
	}

	/**
	 * ContentDetailList入参参数转换
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: contentDetailNewListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> contentDetailNewListInParam(InDTO inDTO) {
		 MBean outBean=inDTO.getMbean();
		 
		 List<Map<String,Object>> contentDetailList = (List<Map<String,Object>>)outBean.getBodyList("CONTENT_DETAIL_LIST");
		 List<Map<String,Object>> contentDetailNewList = new ArrayList<Map<String,Object>>();
		 
		 for(Map<String,Object> contentDetailMap:contentDetailList){
			 Map<String,Object> contentDetailNewMap = new HashMap<String, Object>();
			 contentDetailNewMap.put("contentDetailType", contentDetailMap.get("CONTENT_DETAIL_TYPE"));
			 contentDetailNewMap.put("contentParCode", contentDetailMap.get("CONTENT_PAR_CODE"));
			 contentDetailNewMap.put("contentParName", contentDetailMap.get("CONTENT_PAR_NAME"));
			 contentDetailNewMap.put("contentParValue", contentDetailMap.get("CONTENT_PAR_VALUE"));
			 
			 contentDetailNewList.add(contentDetailNewMap);
		 }
		return contentDetailNewList;
	}

	/**
	 * Channel入参参数处理
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: channelNewListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
    protected List<Map<String, Object>> channelNewListInParam(InDTO inDTO) {
        MBean outBean=inDTO.getMbean();
		
		List<Map<String,Object>> channelList = (List<Map<String,Object>>)outBean.getBodyList("CHANNEL_LIST");
		List<Map<String,Object>> channelNewList = new ArrayList<Map<String,Object>>();
		
		for(Map<String,Object> channelMap:channelList){
			Map<String,Object> channelNewMap = new HashMap<String,Object>();
			channelMap.get("POSITION_LIST");
			List<Map<String,Object>> positionList = (List<Map<String, Object>>) channelMap.get("POSITION_LIST");
			List<Map<String,Object>> positionNewList = this.positionNewListInParam(positionList);
			
			channelNewMap.put("channelId", channelMap.get("CHANNEL_ID"));
			channelNewMap.put("positionList", positionNewList);
			channelNewList.add(channelNewMap);
		}
		
		return channelNewList;
	}
    
    /**
     * custGroup入参参数处理
    * @date: 2016-10-11 
    * @author: zhangjj_crmpd
    * @title: custGroupNewListInParam 
    * @param inDTO
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	protected List<Map<String, Object>> custGroupNewListInParam(InDTO inDTO) {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> inParam = (Map<String,Object>)mbean.getBody();
		List<Map<String,Object>> custGroupList = (List<Map<String,Object>>)inParam.get("CUST_GROUP_LIST");
		List<Map<String,Object>> custGoupNewList = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(custGroupList)){
			for(Map<String,Object> custGroupMap:custGroupList){
				Map<String,Object> custGroupNewMap = new HashMap<String,Object>();
				custGroupNewMap.put("custGroupId", custGroupMap.get("CUST_GROUP_ID"));
				custGoupNewList.add(custGroupNewMap);
			}
			
		}
		
		return custGoupNewList;
	}
	
	/**
	 * 营销案出参处理
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: saveMarketCaseOutParam 
	* @param marketCaseBasicMap
	* @param custGoupNewList
	* @param channelList
	* @param contentDetailList
	* @param ruleDetailList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected StandardOutDTO MarketCaseOutParam(
			Map<String, Object> marketCaseBasicMap,
			List<Map<String, Object>> custGoupNewList,
			List<Map<String, Object>> channelList,
			List<Map<String, Object>> contentDetailList,
			List<Map<String, Object>> ruleDetailList) {
		
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("MARKET_CASE_BASIC", marketCaseBasicMap);
		outMap.put("CUST_GROUP_LIST", custGoupNewList);
		outMap.put("CHANNEL_LIST", channelList);
		outMap.put("CONTENT_DETAIL_LIST", contentDetailList);
		outMap.put("RULE_DETAIL_LIST", ruleDetailList);
		
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		
		return standardOutDTO;
	}

	/**
	 * RuleDetailList出参参数转换
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: ruleDetailNewList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> ruleDetailNewListOutParam(Map<String,Object> inMap) {
		 
		 List<Map<String,Object>> ruleDetailList = (List<Map<String,Object>>)inMap.get("ruleDetailList");
		 List<Map<String,Object>> ruleDetailNewList = new ArrayList<Map<String,Object>>();
		 
		 for(Map<String,Object> ruleDetailMap:ruleDetailList){
			 Map<String,Object> ruleDetailNewMap = new HashMap<String, Object>();
			
			 ruleDetailNewMap.put("RULE_DETAIL_TYPE", ruleDetailMap.get("ruleDetailType"));
			 ruleDetailNewMap.put("RULE_PAR_CODE", ruleDetailMap.get("ruleParCode"));
			 ruleDetailNewMap.put("RULE_PAR_NAME", ruleDetailMap.get("ruleParName"));
			 ruleDetailNewMap.put("RULE_PAR_VALUE", ruleDetailMap.get("ruleParValue"));
			 
			 ruleDetailNewList.add(ruleDetailNewMap);
		 }
		 
		return ruleDetailNewList;
	}

	/**
	 * ContentDetailList出参参数转换
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: contentDetailNewList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> contentDetailNewListOutParam(Map<String,Object> inMap) {
		 
		 List<Map<String,Object>> contentDetailList = (List<Map<String,Object>>)inMap.get("contentDetailList");
		 List<Map<String,Object>> contentDetailNewList = new ArrayList<Map<String,Object>>();
		 
		 for(Map<String,Object> contentDetailMap:contentDetailList){
			 Map<String,Object> contentDetailNewMap = new HashMap<String, Object>();
			 contentDetailNewMap.put("CONTENT_DETAIL_TYPE", contentDetailMap.get("contentDetailType"));
			 contentDetailNewMap.put("CONTENT_PAR_CODE", contentDetailMap.get("contentParCode"));
			 contentDetailNewMap.put("CONTENT_PAR_NAME", contentDetailMap.get("contentParName"));
			 contentDetailNewMap.put("CONTENT_PAR_VALUE", contentDetailMap.get("contentParValue"));
			 
			 contentDetailNewList.add(contentDetailNewMap);
		 }
		return contentDetailNewList;
	}

	/**
	 * Channel出参参数处理
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: channelNewListOutParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
    protected List<Map<String, Object>> channelNewListOutParam(Map<String,Object> inMap) {
		
		List<Map<String,Object>> channelList = (List<Map<String,Object>>)inMap.get("channelList");
		List<Map<String,Object>> channelNewList = new ArrayList<Map<String,Object>>();
		
		for(Map<String,Object> channelMap:channelList){
			Map<String,Object> channelNewMap = new HashMap<String,Object>();
			List<Map<String,Object>> positionList = (List<Map<String, Object>>) channelMap.get("positionList");
			List<Map<String,Object>> positionNewList = this.positionNewListOutParam(positionList);
			
			channelNewMap.put("CHANNEL_ID", channelMap.get("channelId"));
			channelNewMap.put("POSITION_LIST", positionNewList);
			channelNewList.add(channelNewMap);
		}
		
		return channelNewList;
	}
    
    /**
     * custGroup出参参数处理	
    * @date: 2016-9-15 
    * @author: tangaq
    * @title: HbCustGroupNewListOutParam 
    * @param inDTO
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	protected List<Map<String, Object>> custGroupNewListOutParam(Map<String,Object> inMap) {
		
		List<Map<String,Object>> custGroupList = (List<Map<String,Object>>)inMap.get("custGroupList");
		List<Map<String,Object>> custGoupNewList = new ArrayList<Map<String,Object>>();
		
		for(Map<String,Object> custGroupMap:custGroupList){
			Map<String,Object> custGroupNewMap = new HashMap<String,Object>();
			custGroupNewMap.put("CUST_GROUP_ID", custGroupMap.get("custGroupId"));
			custGoupNewList.add(custGroupNewMap);
		}
		
		return custGoupNewList;
	}
	

}
