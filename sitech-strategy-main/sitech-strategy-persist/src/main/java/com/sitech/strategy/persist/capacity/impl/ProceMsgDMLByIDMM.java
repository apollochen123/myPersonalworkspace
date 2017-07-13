package com.sitech.strategy.persist.capacity.impl;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.persist.base.BaseMessageDB;
import com.sitech.strategy.persist.utils.idmm.DmmProducer;

/**
 * Create on 2017-1-20
 * @author: wangpei
 * @Title:ProceMsgDMLByIDMM
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class ProceMsgDMLByIDMM extends BaseMessageDB implements IMsgDML,Serializable {

	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: send 
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void send(Map<String, Object> tempInParam) {
		String topic = (String)tempInParam.get("topic");
		String msg = (String)tempInParam.get("msg");
		String phoneNo = (String)tempInParam.get("phoneNo");
		log.info("-------------------ProceMsgDMLByIDMM.send.msg------------------------------", msg);
		log.info("-------------------ProceMsgDMLByIDMM.send.topic------------------------------", topic);
		log.info("-------------------ProceMsgDMLByIDMM.send.phoneNo------------------------------", phoneNo);
		String result = DmmProducer.send(topic, msg, phoneNo, true);
		log.info("ProceMsgDMLByIDMM.send.result------------------------------", result);
		
	}

	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: batchSend 
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void batchSend(Map<String, Object> tempInParam) {
		// TODO Auto-generated method stub
		
	}
	
	//luogj---test
	public static void main(String[] args){
		flowY(); //发送ok、接收ok、再发送ok
		//flowM(); //发送ok、接收ok、再发送ok
		//fee();
		//busi(); //发送ok、接收ok、再发送ok
	}
	
	/**
	 * 流量超出多少元--ok
	 * */
	public static void flowY(){
//		EVENT_TYPE=1002，EVENT_CLASS=10020001,event_id=10020001002 
		
		String phoneNo = "17843124020";
		String topic = "T132GprsSyn";
		String param = "{\"ROOT\":{\"BODY\":{\"EVENT_NAME\":\"\",\"EVENT_TYPE\":\"1002\",\"EVENT_CLASS\":\"10020001\",\"ACCOUNT_NO\":\"\",\"CHANNEL_ID\":\"11\",\"TITLE_TYPE\":\"1001\",\"OPER_NO\":\"\",\"ID_NO\":\"\",\"EVENT_SOURCE\":\"\",\"EVENT_VALUE\":\"\",\"PHONE_NO\":\"17843124020\",\"CUST_ID\":\"\",\"EVENT_ID\":\"10020001001\",\"COMMON_INFO\":{\"SYSTEM_ID\":\"SYSTEM_11\"},\"SQL_ID\":\"268819664\",\"REGION_CODE\":\"\",\"OPER_NAME\":\"\",\"SEL_IN_ORG_ID\":\"\"}}}";
						
		String result = DmmProducer.send(topic, param, phoneNo, true);
		System.out.println("DmmProducer--Pub132	T132GprsSyn--配置=[" + DmmProducer.brokerURL + "," + DmmProducer.clientID + "," + topic);
		System.out.println("流量超出多少元--flowY--入参=[" + param + "]");
		System.out.println("流量超出多少元--flowY--idmm返回=[" + result + "]");
	}
	
	/**
	 * 流量剩余多少M--ok
	 * 
	 * */
	public static void flowM(){
//		EVENT_TYPE=1001，EVENT_CLASS=10010001，event_id=10010001002 
		
		String phoneNo = "13624314054";
		String topic = "T132GprsSyn";
		String param = "{\"ROOT\":{\"BODY\":{\"EVENT_NAME\":\"\",\"EVENT_TYPE\":\"1001\",\"EVENT_CLASS\":\"10010001\",\"ACCOUNT_NO\":\"\",\"CHANNEL_ID\":\"11\",\"TITLE_TYPE\":\"1001\",\"OPER_NO\":\"\",\"ID_NO\":\"\",\"EVENT_SOURCE\":\"\",\"EVENT_VALUE\":\"\",\"PHONE_NO\":\"13624314054\",\"CUST_ID\":\"\",\"EVENT_ID\":\"10010001001\",\"COMMON_INFO\":{\"SYSTEM_ID\":\"SYSTEM_11\"},\"SEQ_ID\":\"268819664\",\"REGION_CODE\":\"\",\"OPER_NAME\":\"\",\"SEL_IN_ORG_ID\":\"\"}}}";
						
		String result = DmmProducer.send(topic, param, phoneNo, true);
		System.out.println("DmmProducer--Pub132	T132GprsSyn--配置=[" + DmmProducer.brokerURL + "," + DmmProducer.clientID + "," + topic);
		System.out.println("流量剩余多少M--flowM--入参=[" + param + "]");
		System.out.println("流量剩余多少M--flowM--idmm返回=[" + result + "]");
	}
	
	/**
	 * 缴费
	 * */
	public static void fee(){
//		EVENT_TYPE=1002，EVENT_CLASS=10020002，event_id=20170301094102150100253  
		//String phoneNo = "13624314054";
		String phoneNo = "17843124018";
		
		String topic = "T109FeeSyn";
		//String param = "{\"ROOT\":{\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"\",\"ROUTE_VALUE\":\"\"}},\"BODY\":{\"EVENT_TYPE\":\"1002\",\"EVENT_CLASS\":\"10020002\",\"ID_NO\":\"220150200014748525\",\"ACCOUNT_NO\":\"220150200014748528\",\"EVENT_SOURCE\":\"11\",\"EVENT_VALUE\":\"9000\",\"CUST_ID\":\"0\",\"PHONE_NO\":\"13904300001\",\"CHANNEL_ID\":\"11\",\"COMMON_INFO\":{\"SYSTEM_ID\":\"SYSTEM_11\"},\"SEQ_ID\":\"10000413301622\",\"TITLE_TYPE\":\"1001\"}}}";
		String param = "{\"ROOT\":{\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"\",\"ROUTE_VALUE\":\"\"}},\"BODY\":{\"EVENT_TYPE\":\"1002\",\"EVENT_CLASS\":\"10020002\",\"ID_NO\":\"220150200014748525\",\"ACCOUNT_NO\":\"220150200014748528\",\"EVENT_SOURCE\":\"11\",\"EVENT_VALUE\":\"81000\",\"CUST_ID\":\"0\",\"PHONE_NO\":\"17843124018\",\"CHANNEL_ID\":\"11\",\"COMMON_INFO\":{\"SYSTEM_ID\":\"SYSTEM_11\"},\"SEQ_ID\":\"10000413301622\",\"TITLE_TYPE\":\"1001\"}}}";
		
		String result = DmmProducer.send(topic, param, phoneNo, true);
		System.out.println("DmmProducer--Pub109	T109FeeSyn--配置=[" + DmmProducer.brokerURL + "," + DmmProducer.clientID + "," + topic);
		System.out.println("缴费--fee--入参=[" + param + "]");
		System.out.println("缴费--fee--idmm返回=[" + result + "]");
	}
	
	/**
	 * 实名制
	 * */
	public static void busi(){
//		EVENT_TYPE=1002，EVENT_CLASS=10020002，event_id=20170301094102150100253  
		//报文不对
		String phoneNo = "13624314054";
		String topic = "T106BusiSyn";
		String param = "{\"ROOT\": {\"BODY\": {\"EVENT_NAME\": \"\",\"EVENT_TYPE\": \"1003\",\"EVENT_CLASS\": \"10030001\",\"ACCOUNT_NO\": \"\",\"CHANNEL_ID\": \"11\",\"TITLE_TYPE\": \"1002\",\"OPER_NO\": \"\",\"ID_NO\": \"\",\"EVENT_SOURCE\": \"\",\"EVENT_VALUE\": \"\",\"PHONE_NO\": \"13624314054\",\"CUST_ID\": \"\",\"EVENT_ID\": \"10030001001\",\"COMMON_INFO\": {\"SYSTEM_ID\": \"SYSTEM_11\"},\"SEQ_ID\": \"268819664\",\"REGION_CODE\": \"\",\"OPER_NAME\": \"\",\"SEL_IN_ORG_ID\": \"\"}}}";
						
		String result = DmmProducer.send(topic, param, phoneNo, true);
		System.out.println("DmmProducer--Pub106	T106BusiSyn--配置=[" + DmmProducer.brokerURL + "," + DmmProducer.clientID + "," + topic);
		System.out.println("实名制--busi--入参=[" + param + "]");
		System.out.println("实名制--busi--idmm返回=[" + result + "]");
	}
	
	
	public static String getGiveFee(){
		String oprTime = DateUtil.DateToString(new Date(), "yyyyMMddHHmmss");
		Map<String,Object> oprInfoMap = new HashMap<String,Object>();
		oprInfoMap.put("OP_CODE", Const.RM_OP_CODE);
		oprInfoMap.put("OP_TIME", oprTime);
		oprInfoMap.put("LOGIN_NO", "system");
		oprInfoMap.put("ORDER_LINE_ID", "00001111222233");//随机生成序列，按照10031579173830的长度,todo
				
		Map<String,Object> busiInfoMap = new HashMap<String,Object>();
		busiInfoMap.put("INTERVAL_MONTH", "1");
		busiInfoMap.put("FIRST_EFF", oprTime);//取当前时间
		busiInfoMap.put("FEE_CODE", "NNNN");
		busiInfoMap.put("RULE_ID", "01");
		busiInfoMap.put("PAY_PATH", "98");
		busiInfoMap.put("ACT_ID", "0");
		busiInfoMap.put("ACT_TYPE", "2");
		busiInfoMap.put("RETURN_MONTH", "1");
		busiInfoMap.put("FEE_TYPE", "0");
		busiInfoMap.put("ID_NO", "220130120018196375");
		busiInfoMap.put("EXP_DATE", "20991231235959");
		busiInfoMap.put("PHONE_NO", "13500851084");
		busiInfoMap.put("PAY_TYPE", "8");
		busiInfoMap.put("MEANS_ID", "0");
		busiInfoMap.put("EXP_FLAG", "0");
		busiInfoMap.put("IS_PRINT", "N");
		busiInfoMap.put("PAY_METHOD", "8");
		busiInfoMap.put("RETURN_FEE", "123");
		busiInfoMap.put("CONTRACT_NO", "220140101040712476");//sunliang传
		
		Map<String,Object> bodyMap = new HashMap<String,Object>();
		bodyMap.put("OPR_INFO", oprInfoMap);
		bodyMap.put("BUSI_CODE", "YXFYHB");
		bodyMap.put("BUSI_INFO", busiInfoMap);
		
		Map<String,Object> headerMap = new HashMap<String,Object>();
		headerMap.put("DB_ID", "A1");//写工具类，根据idno计算,pojo,todo
		
		Map<String,Object> rootMap = new HashMap<String,Object>();
		rootMap.put("HEADER", headerMap);
		rootMap.put("BODY", bodyMap);		
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("ROOT", rootMap);
		
		String str = JsonUtil.objectToJsonStr(resultMap);
		return str;
	}
	
	public static String getGiveProd(){
		String prodPrcid = "22CAZ04180";
		String effType = Const.PROD_EFFECT_TYPE_CUR_DAY; //生效方式
		int productMonth = 2; //赠送月数
		
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
		busiInfoMap.put("PHONE_NO", "13500851084");
		busiInfoMap.put("CHECK_REPEAT", "Y");
		busiInfoMap.put("AUTO_CONFIRM", "Y");
		busiInfoMap.put("CHN_FLAG", "3");
		busiInfoMap.put("ACTION_ID", "");
		
		Map<String,Object> oprInfoMap = new HashMap<String,Object>();
		oprInfoMap.put("REGION_ID", "2201");//sunliang,手机号归属
		oprInfoMap.put("OP_CODE", Const.RM_OP_CODE);
		oprInfoMap.put("LOGIN_NO", "system");//sunliang,工号
		oprInfoMap.put("OP_NOTE", "实时营销赠套餐");
		oprInfoMap.put("CONTACT_ID", "-1");
		
		Map<String,Object> bodyMap = new HashMap<String,Object>();
		bodyMap.put("OPR_INFO", oprInfoMap);		
		bodyMap.put("BUSI_INFO", busiInfoMap);
		
		Map<String,Object> routingMap = new HashMap<String,Object>();
		routingMap.put("ROUTE_KEY", "10");//sunliang
		routingMap.put("ROUTE_VALUE", "13500851084");//sunliang
		
		Map<String,Object> headerMap = new HashMap<String,Object>();
		headerMap.put("ROUTING", routingMap);
		headerMap.put("TRACE_ID", "1");//----update todo，seq-id
		
		headerMap.put("CHANNEL_ID", "18");
		
		Map<String,Object> rootMap = new HashMap<String,Object>();
		rootMap.put("HEADER", headerMap);
		rootMap.put("BODY", bodyMap);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("ROOT", rootMap);
		
		String str = JsonUtil.objectToJsonStr(resultMap);
		return str;
	}
	
	public static String getRecommondMsg(){
		Map<String,Object> paramsMap = new HashMap<String,Object>();
		paramsMap.put("MSG", "hello message");//CONTENT_PAR_VALUE
		
		String now = DateUtil.DateToString(new Date(), "yyyyMMddHHmmss");
		DecimalFormat df = new DecimalFormat("000000");
		int a = new Random().nextInt(1000000);
		String seq = "2116" + now + df.format(a);
		
		Map<String,Object> bodyMap = new HashMap<String,Object>();
		bodyMap.put("SYSID", "2"); //2
		bodyMap.put("SEQ", seq);
		bodyMap.put("TEMPLATEID", "27777012"); //27777012  常量，放到pojo里
		bodyMap.put("PARAMS", paramsMap);
		bodyMap.put("SERVICENO", "");
		bodyMap.put("PHONENO", "13500851084");
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
		routingMap.put("ROUTE_KEY", "10");
		routingMap.put("ROUTE_VALUE", "13500851084");
		
		Map<String,Object> headerMap = new HashMap<String,Object>();
		headerMap.put("ROUTING", routingMap);
		
		Map<String,Object> rootMap = new HashMap<String,Object>();
		rootMap.put("HEADER", headerMap);
		rootMap.put("BODY", bodyMap);
		
		Map<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("ROOT", rootMap);
		
		String str = JsonUtil.objectToJsonStr(resultMap);
		
		return str;		
	}

}
