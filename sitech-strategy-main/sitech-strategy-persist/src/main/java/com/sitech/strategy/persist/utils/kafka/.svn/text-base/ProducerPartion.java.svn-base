package com.sitech.strategy.persist.utils.kafka;

import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.PropertiesUtil;

/**
 * 分区生产者
* @date: 2016-9-8 
* @author: sunliang 
* @title: ProducerPartion 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProducerPartion {
	
	/**
	 * 生产者对象
	 */
	private final Producer<String, String> producer;
	/**
	 * 配置对象
	 */
	private final Properties props = new Properties();
	/**
	 * 主题
	 */
	private final String topic;
	/**
	 * brokerList列表
	 */
	private final String brokerList;
	
	/**
	 * 构造方法
	* @date: 2016-9-8 
	* @author: sunliang 
	* @param propContenHead 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public ProducerPartion(String topic) {
	  
		this.topic =  topic;
		this.brokerList = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_KAFKA, "kafka.producer.broker.list");
		
		System.out.println("======topic======" + this.topic);
		System.out.println("======brokerList=" + this.brokerList);
		
		props.put("serializer.class", "kafka.serializer.StringEncoder");
		props.put("key.serializer.class", "kafka.serializer.StringEncoder");
		props.put("partitioner.class", "com.sitech.strategy.persist.utils.kafka.SimplePartitioner");
		props.put("metadata.broker.list", this.brokerList);
		
		// Use random partitioner. Don't need the key type. Just set it to Integer.
		// The message is of type String.
		producer = new kafka.javaapi.producer.Producer<String, String>(new ProducerConfig(props));

	}
	
	/**
	 * 发送消息
	* @date: 2016-9-8 
	* @author: sunliang 
	* @title: write 
	* @param messageStr 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void write(String messageStr) {
		producer.send(new KeyedMessage<String, String>(topic, messageStr));
	}
	
	/**
	 * 关闭生产者对象
	* @date: 2016-9-8 
	* @author: sunliang 
	* @title: close  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void close(){
		try{
			producer.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	/**
	 * 测试
	* @date: 2016-9-8 
	* @author: sunliang 
	* @title: main 
	* @param args 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void main(String []args){
		//ProducerPartion producer = new ProducerPartion("RMTCoupleBack");
		ProducerPartion producer = new ProducerPartion("RMTTest");
		System.out.println("======send message start======");
		for(int i = 0 ;i<1;i++){
			try{
				//String msg = "{\"ROOT\":{\"BODY\":{\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"\",\"ROUTE_VALUE\":\"\"}},\"COMMON_INFO\":{\"BUSI_APP_ID\":\"\",\"SYSTEM_ID\":\"SYSTEM_03\"},\"TITLE_TYPE\":\"1002\",\"SEQ_ID\":\"20161115101709102100069\",\"CHANNEL_ID\":\"03\",\"OPER_NO\":\"\",\"OPER_NAME\":\"\",\"REGION_CODE\":\"550\",\"NUM_TYPE\":\"1002\",\"NUM_VALUE\":\"05505019304\",\"METHOD_CODE\":\"1001\",\"CONTACT_FLAG\":\"0\",\"STATUS_CODE\":\"1001\",\"OPER_TIME\":\"2016-12-0721:00:00\",\"ACCEPT_CODE\":\"1008\",\"NOTE\":\"\",\"POSITION_INFO_LIST\":[{\"POSITION_ID\":\"POSITION_03_02\",\"TASK_ID\":\"\",\"ACT_ID\":\"20161115101755102100075\"}]}}}";
				String msg = "{\"ROOT\":{\"BUSINESS_ID\":\"5350\",\"GET_FLAG\":\"1\",\"CREATE_TIME\":\"2017-01-05 20:48:41\",\"CHANNEL_ID\":\"04\",\"ACT_ID\":\"20161227161749101100206\",\"FLOW_CODE\":\"535020170105203739999100001\",\"END_DATE\":\"2017-2-28 17:18:49\",\"BEGIN_DATE\":\"2016-12-27 17:18:49\",\"TASK_ID\":\"20170105203739999100001\",\"SERVICE_NBR\":\"18955103457\",\"TITLE_TYPE\":\"1002\",\"SEND_CONTENT\":\"短厅-策略平台测试\",\"SENTTYPE\":\"1\",\"FROM_TEL\":\"100016\",\"RESERVE\":\"ln\",\"GET_TIME\":\"2017-01-05 20:48:41\",\"COMMON_INFO\":{\"SYSTEM_ID\":\"SYSTEM_04\",\"BUSI_APP_ID\":\"1\"},\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"1\",\"ROUTE_VALUE\":\"1\"}},\"SEQ_ID\":\"20170105203739999100001\",\"REGION_CODE\":\"0\",\"POSITION_ID\":\"POSITION_04_01\",\"MARKETING_DESCRIPTION\":\"短厅-策略平台测试\",\"PARAMS\":\"\"}}";
				String msg1 = "{\"ROOT\": {\"BODY\": {\"HEADER\": {\"ROUTING\": {\"ROUTE_KEY\": \"1\",\"ROUTE_VALUE\": \"1\"}},\"COMMON_INFO\": {\"BUSI_APP_ID\": \"1\",\"SYSTEM_ID\": \"SYSTEM_04\"},\"TITLE_TYPE\": \"1002\",\"CHANNEL_ID\": \"04\",\"POSITION_ID\": \"1\",\"SEQ_ID\": \"2339433\",\"TASK_ID\": \"56138380\",\"ACT_ID\": \"1\",\"SERVICE_NBR\": \"15309697580\",\"REGION_CODE\": \"551\",\"ACT_NAME\": \"21test\",\"MARKETING_DESCRIPTION\": \"hello baby\",\"CREATE_TIME\": \"2016-11-20 17:12:04\",\"BEGIN_DATE\": \"2016-11-20 17:12:04\",\"END_DATE\": \"2017-2-26 17:12:04\",\"GET_TIME\": \"2016-11-20 17:12:04\",\"SEND_CONTENT\": \"KAFKA短信测试123\",\"FROM_TEL\": \"10000\",\"GET_FLAG\": \"1\",\"PARAMS\": \"\",\"SENTTYPE\": \"1\",\"RESERVE\": \"ln\",\"BUSINESS_ID\": \"5350\"}}}";


				//String msg = PropertiesUtil.getProperty("message.properties", "msg");
				System.out.println("======send message start======");
				producer.write(msg);	
				System.out.println("======send message1======"+msg);

				producer.write(msg1);
				System.out.println("======send message2======"+msg1);

				System.out.println("======send message end======");
			}catch(Exception e){
				e.printStackTrace();
			}
		}	
		System.out.println("======send message end======");
	}
	
}
