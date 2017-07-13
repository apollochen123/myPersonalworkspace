package com.sitech.strategy.recommend.entity.param.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Element;
import org.dom4j.Document;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.WSUtil;
import com.sitech.strategy.recommend.base.BaseRecommendEntity;
import com.sitech.strategy.recommend.entity.param.inter.IStrategyAnalysisParam;

/**
 * 
* @date: 2017-2-7 
* @author: sunliang 
* @title: StrategyAnalysisParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class StrategyAnalysisParam extends BaseRecommendEntity implements IStrategyAnalysisParam {

	/**
	 * 
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: analysisStrategyForEBUSInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> analysisStrategyForEBUSInParam(String xmlStr) {
		Document doc=WSUtil.parseToDocument(xmlStr);
		Map<String,Object> inParam = new HashMap<String,Object>();
		List<Map<String, Object>> positionIdList = new ArrayList<Map<String, Object>>();
		//获取BOBY节点
		Element bobyNode=doc.getRootElement().element("BODY");
		//获取HEADER节点
		Element headerNode=doc.getRootElement().element("HEADER");
		//获取 POSITION_INFO_LIST节点
		Element listNode=bobyNode.element("POSITION_INFO_LIST");
		//获取请求参数值
		String seqId=bobyNode.element("SEQ_ID").getText();
		String numValue=bobyNode.element("NUM_VALUE").getText();
		String numType=bobyNode.element("NUM_TYPE").getText();
		String operNo=bobyNode.element("OPER_NO").getText();
		String operName=bobyNode.element("OPER_NAME").getText();
		String selInOrgId=bobyNode.element("SEL_IN_ORG_ID").getText();
		String regionCode=bobyNode.element("REGION_CODE").getText();
		String channelId=bobyNode.element("CHANNEL_ID").getText();
		List<Element> positionIds=listNode.elements("POSITION_ID");

		for(Element positionId:positionIds){
			Map<String, Object> positionInfo = new HashMap<String, Object>();
			positionInfo.put("positionId", positionId.getText());
			positionIdList.add(positionInfo);
		}
		inParam.put("channelId", channelId);
		inParam.put("operNo", operNo);
		inParam.put("operName", operName);
		inParam.put("regionCode", regionCode);
		inParam.put("selInOrgId", selInOrgId);
		inParam.put("numType", numType);
		inParam.put("phoneNo", numValue);
		inParam.put("idNo", "");
		inParam.put("seqId", seqId);
		inParam.put("numValue", numValue);
		inParam.put("positionIdList", positionIdList);
		String queryDate = DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1);
		inParam.put("queryDate",queryDate);
		return inParam;
	}

	/**
	 * 
	* @date: 2017-2-8 
	* @author: zhangqia 
	* @title: infoFeedbackInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> infoFeedbackInParam(String xmlStr) {
		Document doc=WSUtil.parseToDocument(xmlStr);
		Map<String,Object> inParam = new HashMap<String,Object>();
		//获取BOBY节点
		Element bobyNode=doc.getRootElement().element("BODY");
		//获取HEADER节点
		Element headerNode=doc.getRootElement().element("HEADER");
		//获取 POSITION_INFO_LIST节点
		Element listNode=bobyNode.element("POSITION_INFO_LIST");
		//获取请求参数值
		String seqId=bobyNode.element("SEQ_ID").getText();
		String numValue=bobyNode.element("NUM_VALUE").getText();
		String numType=bobyNode.element("NUM_TYPE").getText();
		String operNo=bobyNode.element("OPER_NO").getText();
		String operName=bobyNode.element("OPER_NAME").getText();
		String selInOrgId=bobyNode.element("SEL_IN_ORG_ID").getText();
		String regionCode=bobyNode.element("REGION_CODE").getText();
		String channelId=bobyNode.element("CHANNEL_ID").getText();
		String positionId=listNode.element("POSITION_ID").getText();
		String positionContent=listNode.element("POSITION_CONTENT").getText();
		String orderNo=listNode.element("ORDER_NO").getText();
		inParam.put("channelId", channelId);
		inParam.put("operNo", operNo);
		inParam.put("operName", operName);
		inParam.put("regionCode", regionCode);
		inParam.put("selInOrgId", selInOrgId);
		inParam.put("numType", numType);
		inParam.put("phoneNo", numValue);
		inParam.put("idNo", "");
		inParam.put("seqId", seqId);
		inParam.put("numValue", numValue);
		inParam.put("positionId", positionId);
		inParam.put("positionContent", positionContent);
		inParam.put("orderNo", orderNo);
		String queryDate = DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1);
		inParam.put("queryDate",queryDate);
		return inParam;
	}
	/**
	 * 
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: analysisStrategyForEBUSOutParam 
	* @param outParam
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String analysisStrategyForEBUSOutParam(Map<String,Object> outParam,Map<String,Object> inParam) {
		String seqId = (String)inParam.get("seqId");
		String numValue = (String)inParam.get("numValue");
		
		//报文组合返回
		String result="";
		List<String> positionInfoList = (List<String>) outParam.get(Const.PACKET_PARAM_NODE_POSITION_INFO_LIST);
		for(String positionInfo:positionInfoList){
			result+=WSUtil.getSoapContent(positionInfo,"contentParValue");
		}
		return WSUtil.getSoapBoby(seqId, numValue, result);
	}
	/**
	 * 
	* @date: 2017-2-8 
	* @author: zhangqia 
	* @title: infoFeedbackOutParam 
	* @param outParam
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String infoFeedbackOutParam(Map<String,Object> outParam,Map<String,Object> inParam) {
		return WSUtil.return_success;
	}
}
