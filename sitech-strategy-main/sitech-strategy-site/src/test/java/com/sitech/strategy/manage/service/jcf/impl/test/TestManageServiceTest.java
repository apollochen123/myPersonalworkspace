package com.sitech.strategy.manage.service.jcf.impl.test;

import com.sitech.jcfx.util.HttpUtil;
import com.sitech.strategy.persist.utils.ServiceUtil;

public class TestManageServiceTest {	
	public static void main(String[] args) {
		TestManageServiceTest testManageServiceTest=new TestManageServiceTest();
		testManageServiceTest.testService();
	}
	public void testService(){
		HttpUtil.setCharset("UTF-8");
		String serName="com_sitech_strategy_manage_service_jcf_inter_test_ITestManageServiceSvc_testManageService";
		String pin= "{\"ROOT\":{\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"\",\"ROUTE_VALUE\":\"\"}},\"BODY\":{\"prod1\":\"aaa\",\"prod2\":\"bbb\"}}}"; 
		String result = ServiceUtil.callService("http://127.0.0.1:8080/sitech-strategy-site/rs/service/"+serName, pin); 
	}
}
