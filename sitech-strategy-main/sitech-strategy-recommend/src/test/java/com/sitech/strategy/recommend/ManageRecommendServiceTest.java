package com.sitech.strategy.recommend;

import com.sitech.jcfx.util.HttpUtil;
import com.sitech.strategy.persist.utils.ServiceUtil; 

//@RunWith(Parameterized.class)
public class ManageRecommendServiceTest {
//	protected IManageRecommendService manageRecommendService ;
//	protected HashMap<String, Object> expectMap ;
//	protected HashMap<String, Object> testMap;
//	protected MBean beanTest = new MBean();
//	protected StandardInDTO standardInDTO = new StandardInDTO();
//	
//	public ManageRecommendServiceTest(HashMap<String, Object> expectMap,HashMap<String, Object> testMap, MBean beanTest, StandardInDTO standardInDTO){
//		this.expectMap = expectMap;
//		this.testMap = testMap;
//		this.beanTest = beanTest;
//		this.standardInDTO = standardInDTO;
//	}
//	
//	@Parameters
//	public static Collection<Object[]> getTestParamters(){
//		Map expectMap1 = new HashMap();
//		Map<String, Object> parMap = new HashMap<String, Object>();
//		MBean bean = new MBean();
//		StandardInDTO InDTO = new StandardInDTO();
//		List<Map<String, Object>> parList = new ArrayList<Map<String, Object>>();
//		
//		parMap.put("CHANNEL_ID", "1");
//		parMap.put("OPER_NO", "1");
//		parMap.put("OPER_NAME", "1");
//		parMap.put("REGION_CODE", "1");
//		parMap.put("NUM_TYPE", "1");
//		parMap.put("NUM_VALUE", "1");
//		
//		for(int i = 0; i < 1; i++){
//			Map<String, Object> positionMap = new HashMap<String, Object>();
//			positionMap.put("POSITION_ID", "1");
//			parList.add(positionMap);
//		}
//		parMap.put("POSITION_INFO_LIST", parList);
//		bean.setBody(parMap);
//		InDTO.setMbean(bean);
//		return Arrays.asList(new Object[][]{
//				{expectMap1, InDTO},
//				
//		});
//	}
	
//	@Before
//	public void before(){
//		String conf = "applicationContext.xml";
//		ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
//		manageRecommendService = ac.getBean("manageRecommendService",ManageRecommendService.class);
//	}
	
	public static void main(String[] args) {
		
		HttpUtil.setCharset("UTF-8");
		//String serName="com_sitech_strategy_recommend_service_jcf_inter_IManageRecommendServiceSvc_queryCustList";
		String serName="com_sitech_strategy_recommend_service_jcf_inter_IManageRecommendServiceSvc_queryMarketCaseList";
		//String serName="com_sitech_strategy_recommend_service_jcf_inter_IManageRecommendServiceSvc_queryTaskList";
		//String pin= "{\"ROOT\":{\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"\",\"ROUTE_VALUE\":\"\"}},\"BODY\":{\"CHANNEL_ID\":\"18\",\"OPER_NO\":\"bbb\",\"OPER_NAME\":\"aaa\",\"REGION_CODE\":\"551\",\"NUM_TYPE\":\"aaa\",\"NUM_VALUE\":\"bbb\", \"POSITION_INFO_LIST\": [ { \"POSITION_ID\": \"POSITION_18_01\", \"ACT_ID\": \"\"}, { \"POSITION_ID\": \"POSITION_04_01\", \"ACT_ID\": \"\"}]}}}"; 
		String pin= "{\"ROOT\":{\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"\",\"ROUTE_VALUE\":\"\"}},\"BODY\":{\"CHANNEL_ID\":\"08\",\"OPER_NO\":\"bbb\",\"OPER_NAME\":\"aaa\",\"REGION_CODE\":\"115\",\"NUM_TYPE\":\"aaa\",\"NUM_VALUE\":\"bbb\", \"POSITION_INFO_LIST\": [ { \"POSITION_ID\": \"POSITION_08_01\", \"ACT_ID\": \"\"}, { \"POSITION_ID\": \"POSITION_01_01\", \"ACT_ID\": \"\"}]}}}"; 
		//String result = ServiceUtil.callService("http://127.0.0.1:8080/sitech-strategy-site/rs/service/"+serName, pin); 
		String result = ServiceUtil.callService("http://134.64.14.138:12000/sitech-strategy-site/rs/service/"+serName, pin); 
		System.out.println("===============" + result);
	}
	
}
