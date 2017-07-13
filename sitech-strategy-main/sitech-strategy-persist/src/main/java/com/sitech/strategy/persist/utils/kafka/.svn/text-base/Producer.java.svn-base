package com.sitech.strategy.persist.utils.kafka;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

/**
 * 生产者
* @date: 2016-9-8 
* @author: sunliang 
* @title: Producer 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class Producer {
	
	/**
	 * kafka生产者对象
	 */
	private final kafka.javaapi.producer.Producer<Integer, String> producer;
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
	* @param topic
	* @param brokerlist 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Producer(String topic,String brokerList ) {
		
		props.put("serializer.class", "kafka.serializer.StringEncoder");
		props.put("metadata.broker.list", brokerList);
		
		// Use random partitioner. Don't need the key type. Just set it to Integer.
		// The message is of type String.
		producer = new kafka.javaapi.producer.Producer<Integer, String>(new ProducerConfig(props));
		
		this.topic = topic;
		this.brokerList = brokerList;
	}
	
	/**
	 * 发送消息
	* @date: 2016-9-8 
	* @author: sunliang 
	* @title: write 
	* @param messageStr
	* @throws InterruptedException 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void write(String messageStr) throws InterruptedException {
  
		try{
			producer.send(new KeyedMessage<Integer, String>(topic, messageStr));
		}catch(Exception e){
			TimeUnit.SECONDS.sleep(2);
			producer.send(new KeyedMessage<Integer, String>(topic, messageStr));
		}

	}

}
