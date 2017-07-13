package com.sitech.strategy.persist.utils.kafka;

import java.io.Serializable;
import java.util.List;
import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.PropertiesUtil;


/**kafka生产者
 * Create on 2017-1-10
 * @author: wangpei
 * @Title:KafkaProducerUtil
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class KafkaProducerUtil implements Serializable{
	private static KafkaProducer<String, String> kafkaProducer; //生产者
	private static KafkaProducerUtil instance = new KafkaProducerUtil();
	
	/** 构造方法
	* @date: 2017-1-11 
	* @author: wangpei 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	private KafkaProducerUtil(){
	}
	
	static{
		init();
	}
	
	/** 获得实例
	* @date: 2017-1-11 
	* @author: wangpei
	* @title: getInstance 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static KafkaProducerUtil getInstance(){
		return instance;
	}
	
	/** 初始化
	* @date: 2017-1-11 
	* @author: wangpei
	* @title: init  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static void init() {
		if (kafkaProducer == null) {
			Properties props = new Properties();
			String brokerList = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_KAFKA, "kafka.producer.broker.list");
			System.out.println(brokerList);
			props.put("bootstrap.servers", brokerList);
			props.put("acks", "all");
			props.put("retries", 3);
			props.put("batch.size", 16384);
			props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
			props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
			kafkaProducer = new KafkaProducer<String, String>(props);
		}
	}
	
	/** 发送消息随机分区
	* @date: 2017-1-11 
	* @author: wangpei
	* @title: send 
	* @param topic
	* @param message 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void send(String topic,String message){
		ProducerRecord<String, String> record = new ProducerRecord<String, String>(topic, message);
		kafkaProducer.send(record);
		kafkaProducer.flush();
	}
	
	/** 批量发送
	* @date: 2017-1-19 
	* @author: wangpei
	* @title: batchSend 
	* @param topic
	* @param messages 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void batchSend(String topic,List<String> messages){
		for (int i = 0; i < messages.size(); i++) {
			ProducerRecord<String, String> record = new ProducerRecord<String, String>(topic,messages.get(i));
			kafkaProducer.send(record);
			if (i % 1000 == 0) {
				kafkaProducer.flush();
			}
		}
		kafkaProducer.flush();
	}
	/** 
	* @date: 2017-1-11 
	* @author: wangpei
	* @title: main 
	* @param args
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static void main(String[] args) throws Exception {
		//接收到的作为生产者
		KafkaProducerUtil kafkaProducerUtil = KafkaProducerUtil.getInstance();
		int i = 0; //第一条消息
		while (i<1) {
			// 1、"PF"： 消息主题
			// 2、String.valueOf(i)：消息ID
			// 3、"message: 测试发送消息->" + i：消息内容
			String msg = "{\"ROOT\":{\"BODY\":{\"TITLE_TYPE\":\"1002\",\"CHANNEL_ID\":\"06\",\"OPER_TYPE\":\"1001\",\"REGION_CODE\":\"551\",\"POSITION_INFO_LIST\":[{\"POSITION_ID\":\"POSITION_06_01\",\"ACT_ID\":\"20161227141150101527829\",\"TASK_ID\":\"\",\"SERVICE_NBR\":\"IPTV5512016955274\"}]}}}";
			System.out.println("第"+i+"条msg==="+msg);
			kafkaProducerUtil.send("RMTTaskSyn", msg);
			i++;
		}
	}
}
