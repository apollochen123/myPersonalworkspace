package com.sitech.strategy.recommend;

import com.sitech.jcfx.util.HttpUtil;
import com.sitech.strategy.persist.utils.ServiceUtil; 

public class ParseRecommendServiceTest {
	public static void main(String[] args) {
		
		HttpUtil.setCharset("UTF-8");
		//String serName="com_sitech_strategy_recommend_service_jcf_inter_IParseRecommendServiceSvc_parseCustmMnagerTask";
		String serName="com_sitech_strategy_recommend_service_jcf_inter_IParseRecommendServiceSvc_parseRecommendContent";
		//本机测试127.0.0.1   172.21.2.140
		String pin= "{\"ROOT\":{\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"\",\"ROUTE_VALUE\":\"\"}},\"BODY\":{\"CHANNEL_ID\":\"03\",\"OPER_NO\":\"bbb\",\"OPER_NAME\":\"aaa\",\"REGION_CODE\":\"551\",\"NUM_TYPE\":\"1001\",\"NUM_VALUE\":\"15834198784\", \"POSITION_INFO_LIST\": [ { \"POSITION_ID\": \"POSITION_03_02\"},{ \"POSITION_ID\": \"POSITION_01_01\"}]}}}"; 
		String result = ServiceUtil.callService("http://127.0.0.1:8080/sitech-strategy-site/rs/service/"+serName, pin); 
//		//测试环境测试
//		String pin= "{\"ROOT\":{\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"\",\"ROUTE_VALUE\":\"\"}},\"BODY\":{\"CHANNEL_ID\":\"10\",\"OPER_NO\":\"bbb\",\"OPER_NAME\":\"aaa\",\"REGION_CODE\":\"551\",\"NUM_TYPE\":\"1001\",\"NUM_VALUE\":\"KDYX55020151754056\", \"POSITION_INFO_LIST\": [ { \"POSITION_ID\": \"POSITION_10_01\"},{ \"POSITION_ID\": \"\"}]}}}"; 
//		String result = ServiceUtil.callService("http://134.64.14.138:12000/sitech-strategy-site/rs/service/"+serName, pin); 
		
		System.out.println("===============" + result);
	}
}
