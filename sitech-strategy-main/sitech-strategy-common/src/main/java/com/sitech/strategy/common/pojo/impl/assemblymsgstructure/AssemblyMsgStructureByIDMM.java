package com.sitech.strategy.common.pojo.impl.assemblymsgstructure;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.IMarketCasePacketPojo;
import com.sitech.strategy.common.pojo.inter.assemblymsgstructure.IAssemblyMsgStructure;
import com.sitech.strategy.common.pojo.inter.route.IRoutePojo;
import com.sitech.strategy.common.pojo.inter.shortmsg.IShortMsgPojo;
import com.sitech.strategy.common.pojo.inter.topic.ITopic;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.common.utils.SequenceUtil;


public class AssemblyMsgStructureByIDMM extends BaseClass implements
				IAssemblyMsgStructure , Serializable{

	/**
	 * 短信pojo
	 * */
	private IShortMsgPojo shortMsgPojo;
	
	/**
	 * 路由pojo
	 * */
	private IRoutePojo routePojo;
			
	/**
	 * 消息主题
	 */
	private ITopic msgTopic;
	
	

	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: setMsgTopic 
	* @param msgTopic 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMsgTopic(ITopic msgTopic) {
		this.msgTopic = msgTopic;
	}

	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: getBatchPushMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getBatchPushMsgStructure(
			Map<String, Object> tempInParam) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	* @date: 2017-2-28
	* @author: luogj
	* @title: setRoutePojo 
	* @param routePojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */	
	public void setRoutePojo(IRoutePojo routePojo) {
		this.routePojo = routePojo;
	}
	
	/**
	 * 
	* @date: 2017-2-28
	* @author: luogj
	* @title: setShortMsgPojo 
	* @param shortMsgPojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */	
	public void setShortMsgPojo(IShortMsgPojo shortMsgPojo) {
		this.shortMsgPojo = shortMsgPojo;
	}	
	
	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: getChannelTaskMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getChannelTaskMsgStructure(
			Map<String, Object> tempInParam) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: getChannelTaskCloseMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getChannelTaskCloseMsgStructure(
			Map<String, Object> tempInParam) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/** 
	* @date: 2017-3-10 
	* @author: wangpei
	* @title: getChannelTaskNoticeMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> getChannelTaskNoticeMsgStructure(
			Map<String, Object> tempInParam) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: getGroupMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getGroupMsgStructure(
			Map<String, Object> tempInParam) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: getSendGiveFeeMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-27 luogj 修改报文转换逻辑，增加入参
	 */
	@Override
	public String getSendGiveFeeMsgStructure(Map<String, Object> inParam, Map<String, Object> tempInParam) {
		
		Map<String,Object> userMap = (Map<String,Object>)tempInParam.get("userMap");
		IMarketCasePacketPojo marketCasePacketPojo = (IMarketCasePacketPojo)tempInParam.get("marketCasePacketPojo");
		Map<String,Object> contentMap = marketCasePacketPojo.getContentMap() == null ? new HashMap<String,Object>() : marketCasePacketPojo.getContentMap();
		log.debug("getSendGiveFeeMsgStructure.contentMap", contentMap);
		
		Map<String,Object> marketCaseContent0 = ((List<Map<String,Object>>)contentMap.get("marketCaseContent")).get(0);
		List<Map<String,Object>> paramsList = (List<Map<String,Object>>)marketCaseContent0.get("params");		
		log.debug("getSendGiveFeeMsgStructure.paramsList", paramsList);
		
		String feeMoney = "";
		for(Map<String, Object> entry: paramsList){
			if("offerMoney".equals((String)entry.get("contentParCode"))){
				feeMoney = (String)entry.get("contentParValue");
				break;
			}
		}
		log.debug("getSendGiveFeeMsgStructure.feeMoney", feeMoney);
		
		String curTime = DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3);
		Map<String,Object> oprInfoMap = new HashMap<String,Object>();
		oprInfoMap.put("OP_CODE", Const.RM_OP_CODE);
		oprInfoMap.put("OP_TIME", curTime);
		oprInfoMap.put("LOGIN_NO", "system");
		oprInfoMap.put("ORDER_LINE_ID", SequenceUtil.getSequence().substring(3, 23));		
		
		Map<String,Object> busiInfoMap = new HashMap<String,Object>();
		busiInfoMap.put("INTERVAL_MONTH", "1");
		busiInfoMap.put("FIRST_EFF", curTime);
		busiInfoMap.put("FEE_CODE", "NNNN");
		busiInfoMap.put("RULE_ID", "01");
		busiInfoMap.put("PAY_PATH", "98");
		busiInfoMap.put("ACT_ID", "0");
		busiInfoMap.put("ACT_TYPE", "2");
		busiInfoMap.put("RETURN_MONTH", "1");
		busiInfoMap.put("FEE_TYPE", "0");
		busiInfoMap.put("ID_NO", (String)userMap.get("idNo"));
		busiInfoMap.put("EXP_DATE", "20991231235959");
		busiInfoMap.put("PHONE_NO", (String)userMap.get("phoneNo"));
		busiInfoMap.put("PAY_TYPE", "8");
		busiInfoMap.put("MEANS_ID", "0");
		busiInfoMap.put("EXP_FLAG", "0");
		busiInfoMap.put("IS_PRINT", "N");
		busiInfoMap.put("PAY_METHOD", "8");
		busiInfoMap.put("RETURN_FEE", feeMoney);
		busiInfoMap.put("CONTRACT_NO", inParam.get("contractNo"));
		
		Map<String,Object> bodyMap = new HashMap<String,Object>();
		bodyMap.put("OPR_INFO", oprInfoMap);
		bodyMap.put("BUSI_CODE", "YXFYHB");
		bodyMap.put("BUSI_INFO", busiInfoMap);
		
		Map<String,Object> headerMap = new HashMap<String,Object>();
		headerMap.put("DB_ID", routePojo.getDBIdByIdNo((String)userMap.get("idNo")));
		
		Map<String,Object> rootMap = new HashMap<String,Object>();
		rootMap.put("HEADER", headerMap);
		rootMap.put("BODY", bodyMap);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("ROOT", rootMap);
		
		String str = JsonUtil.objectToJsonStr(resultMap);
		log.debug("getSendGiveFeeMsgStructure.str", str);
		return str;
	}

	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: getSendGiveProdMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-27 luogj 改名：getSendGiveProdMsgStructure,增加入参
	 */
	@Override
	public String getSendGiveProdMsgStructure(Map<String, Object> inParam, Map<String, Object> tempInParam) {
		
		Map<String,Object> userMap = (Map<String,Object>)tempInParam.get("userMap");
		Map<String,Object> userInfoMap = (Map<String,Object>)tempInParam.get("userInfoMap");
		IMarketCasePacketPojo marketCasePacketPojo = (IMarketCasePacketPojo)tempInParam.get("marketCasePacketPojo");
		Map<String,Object> contentMap = marketCasePacketPojo.getContentMap() == null ? new HashMap<String,Object>() : marketCasePacketPojo.getContentMap();
		log.debug("getSendGiveProdMsgStructure.contentMap", contentMap);
		
		Map<String,Object> marketCaseContent0 = ((List<Map<String,Object>>)contentMap.get("marketCaseContent")).get(0);
		List<Map<String,Object>> paramsList = (List<Map<String,Object>>)marketCaseContent0.get("params");	
		log.debug("getSendGiveProdMsgStructure.paramsList", paramsList);
		
		String prodPrcid = "";
		String effType = ""; //生效方式
		int productMonth = 0; //赠送月数
		for(Map<String, Object> entry: paramsList){
			String contentParCode = (String)entry.get("contentParCode");
			
			if("offerProductId".equals( contentParCode )){
				prodPrcid = (String)entry.get("contentParValue");				
			}else if("offerProductEffect".equals(contentParCode)){
				effType = (String)entry.get("contentParValue");				
			}else if("offerProductMonth".equals(contentParCode)){
				productMonth = Integer.valueOf((String) entry.get("contentParValue"));
			}		
		}
		
		//计算生效时间、失效时间
		String effDate = "";
		String expDate = "";
		if( Const.PROD_EFFECT_TYPE_CUR_DAY.equals(effType) ){
			effDate = DateUtil.DateToString(new Date(), "yyyyMMddHHmmss");
			expDate = DateUtil.getLashDayOfMonth18String(productMonth-1);
		}else if( Const.PROD_EFFECT_TYPE_NEXT_MONTH.equals(effType) ){
			effDate = DateUtil.getNextMonthFirstDate();
			expDate = DateUtil.getLashDayOfMonth18String(productMonth);
		}		
		
		List<Map<String,Object>> productList = new ArrayList<Map<String,Object>>();
		Map<String,Object> productMap = new HashMap<String,Object>();
		productMap.put("OPERATE_TYPE", "A");
		productMap.put("PROD_PRCID", prodPrcid);
		productMap.put("EFF_DATE", effDate);
		productMap.put("EXP_DATE", expDate);
		productList.add(productMap);
		
		Map<String,Object> busiInfoMap = new HashMap<String,Object>();
		busiInfoMap.put("PRODUCT_LIST", productList);
		busiInfoMap.put("PHONE_NO", (String)userMap.get("phoneNo"));
		busiInfoMap.put("CHECK_REPEAT", "Y");
		busiInfoMap.put("AUTO_CONFIRM", "Y");
		busiInfoMap.put("CHN_FLAG", "3");
		busiInfoMap.put("ACTION_ID", "");
		
		Map<String,Object> oprInfoMap = new HashMap<String,Object>();
		oprInfoMap.put("REGION_ID", userInfoMap.get("regionCode"));
		oprInfoMap.put("OP_CODE", Const.RM_OP_CODE);
		oprInfoMap.put("LOGIN_NO", "system");
		oprInfoMap.put("OP_NOTE", "实时营销赠套餐");
		oprInfoMap.put("CONTACT_ID", "-1");
		
		Map<String,Object> bodyMap = new HashMap<String,Object>();
		bodyMap.put("OPR_INFO", oprInfoMap);		
		bodyMap.put("BUSI_INFO", busiInfoMap);
		
		Map<String,Object> routingMap = new HashMap<String,Object>();
		routingMap.put("ROUTE_KEY", routePojo.getRouteKeyPhoneNo());
		routingMap.put("ROUTE_VALUE", (String)userMap.get("phoneNo"));
		
		Map<String,Object> headerMap = new HashMap<String,Object>();
		headerMap.put("ROUTING", routingMap);
		headerMap.put("TRACE_ID", inParam.get("seqId"));
		headerMap.put("CHANNEL_ID", "18");
		
		Map<String,Object> rootMap = new HashMap<String,Object>();
		rootMap.put("HEADER", headerMap);
		rootMap.put("BODY", bodyMap);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("ROOT", rootMap);
		
		String str = JsonUtil.objectToJsonStr(resultMap);
		return str;
	}
	
	/**
	 * 获取发送推荐短信消息结构
	* @date: 2017-2-27 
	* @author: sunliang 
	* @title: getSendRecommendMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-27 luogj 修改报文转换逻辑，增加入参
	 */
	@Override
	public String getSendRecommendMsgStructure(Map<String, Object> inParam, Map<String, Object> tempInParam) {
		Map<String,Object> userMap = (Map<String,Object>)tempInParam.get("userMap");
		Map<String,Object> userLabelMap = (Map<String,Object>)tempInParam.get("userLabelMap");
		IMarketCasePacketPojo marketCasePacketPojo = (IMarketCasePacketPojo)tempInParam.get("marketCasePacketPojo");
		Map<String,Object> contentMap = marketCasePacketPojo.getContentMap() == null ? new HashMap<String,Object>() : marketCasePacketPojo.getContentMap();
		log.debug("getSendRecommendMsgStructure.contentMap", contentMap);
		
		Map<String,Object> marketCaseContent0 = ((List<Map<String,Object>>)contentMap.get("marketCaseContent")).get(0);
		Map<String,Object> param0 = ((List<Map<String,Object>>)marketCaseContent0.get("params")).get(0);		
		log.debug("getSendRecommendMsgStructure.param0", param0);		

		Map<String,Object> paramsMap = new HashMap<String,Object>();
		//新增短信标签变量转换
		String MSG = (String) param0.get("contentParValue");
		if(MSG.indexOf("L")!=-1){
			for (Entry<String, Object> entry : userLabelMap.entrySet()) {
				 if(MSG.indexOf(entry.getKey())!=-1){
					 MSG = MSG.replaceAll (entry.getKey(), (String)entry.getValue());
					 System.out.println("-------MSG---"+MSG);
				 }
			}
		}
		
		paramsMap.put("MSG", MSG);//CONTENT_PAR_VALUE
		
		String now = DateUtil.DateToString(new Date(), "yyyyMMddHHmmss");
		DecimalFormat df = new DecimalFormat("000000");
		int a = new Random().nextInt(1000000);
		String seq = "2116" + now + df.format(a);
		
		Map<String,Object> bodyMap = new HashMap<String,Object>();
		bodyMap.put("SYSID", "2");
		bodyMap.put("SEQ", seq);
		bodyMap.put("TEMPLATEID", shortMsgPojo.getTemplateId()); 
		bodyMap.put("PARAMS", paramsMap);
		bodyMap.put("SERVICENO", "");
		bodyMap.put("PHONENO", (String)userMap.get("phoneNo"));
		bodyMap.put("LOGINNO", "system");
		bodyMap.put("SERVNO", "");
		bodyMap.put("SERVNAME", "");
		bodyMap.put("SUBPHONESEQ", "");
		bodyMap.put("SENDTIME", now.substring(0, 12));
		bodyMap.put("HOLD1", "0");
		bodyMap.put("HOLD2", "1000");
		bodyMap.put("HOLD3", "");
		bodyMap.put("HOLD4", "");
		bodyMap.put("HOLD5", "");
		
		Map<String,Object> routingMap = new HashMap<String,Object>();
		routingMap.put("ROUTE_KEY", routePojo.getRouteKeyPhoneNo());
		routingMap.put("ROUTE_VALUE", (String)userMap.get("phoneNo"));
		
		Map<String,Object> headerMap = new HashMap<String,Object>();
		headerMap.put("ROUTING", routingMap);
		
		Map<String,Object> rootMap = new HashMap<String,Object>();
		rootMap.put("HEADER", headerMap);
		rootMap.put("BODY", bodyMap);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("ROOT", rootMap);
		
		String str = JsonUtil.objectToJsonStr(resultMap);
		log.debug("getSendRecommendMsgStructure.str", str);
		return str;		
	}
	
	
	/**
	 * 获取事件触发推送消息结构
	* @date: 2017-2-21 
	* @author: sunyuan
	* @title: getSendTriggerMsgEventStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-3-1 luogj 获取事件ID，key值由eventID改为eventId；
	* 			增加发送CONTRACT_NO参数；
	* 			删除region_code参数；
	* 			增加发送seq_id参数
	 */
	@Override
	public Map<String, Object> getSendTriggerMsgEventStructure(
			Map<String, Object> tempInParam) {
		Map<String,Object> param = new HashMap<String, Object>();
		List<String> eventIdList = (List<String>) (CommonUtils.objectIsNull(tempInParam.get("eventIdList"))?null:tempInParam.get("eventIdList"));
		param.put("EVENT_ID_LIST", eventIdList);
		String phone = (String) (CommonUtils.objectIsNull(tempInParam.get("phoneNo"))?"":tempInParam.get("phoneNo"));
		param.put("PHONE_NO", phone);
		param.put("CONTRACT_NO", CommonUtils.objectIsNull(tempInParam.get("contractNo"))?"":tempInParam.get("contractNo"));
		param.put("SEQ_ID", CommonUtils.objectIsNull(tempInParam.get("seqId"))?"":tempInParam.get("seqId"));
		Map<String,Object> retParam = new HashMap<String, Object>();
		retParam.put("phoneNo", phone);
		retParam.put("msg", JsonUtil.objectToJsonStr(param));
		retParam.put("topic", msgTopic.getProducerTopicTriggermsgevent());
		return retParam;
	}

}
