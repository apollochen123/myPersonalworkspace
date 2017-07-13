package com.sitech.strategy.process.stream.spark.kafka.test;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;

import com.sitech.strategy.common.pojo.impl.SparkAppProp;
import com.sitech.strategy.common.pojo.inter.ISparkAppProp;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.process.base.BaseClass;

/**
 * kafka测试
* @date: 2016-12-1 
* @author: sunliang 
* @title: KafkaTest 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class KafkaTest extends BaseClass implements Serializable{

	/**
	 * spark应用配置对象
	 */
	protected ISparkAppProp sparkAppProp;
	
	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: setSparkAppProp 
	* @param sparkAppProp 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSparkAppProp(ISparkAppProp sparkAppProp) {
		this.sparkAppProp = sparkAppProp;
	}
	
	/**
	 * kafka测试
	* @date: 2016-12-1 
	* @author: sunliang 
	* @title: testKafka  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void testKafka(){
		
		log.info("KafkaTest.testKafka", "welcome");
		sparkAppProp.setSparkAppProp(Const.SPARK_APPNAME_SPARKSTREAMINGTEST);
		
		String appName = sparkAppProp.getAppName();
		String zkQuorum = sparkAppProp.getZkQuorum();
		String topic = sparkAppProp.getTopic();
		String group = sparkAppProp.getGroup();
		long durations = Long.parseLong(sparkAppProp.getDurations());
		
		log.info("SparkStreamingTest.testSparkStreaming.appName", appName);
		log.info("SparkStreamingTest.testSparkStreaming.zkQuorum", zkQuorum);
		log.info("SparkStreamingTest.testSparkStreaming.topic", topic);
		log.info("SparkStreamingTest.testSparkStreaming.group", group);
		log.info("SparkStreamingTest.testSparkStreaming.durations", durations);
	    
	    SparkConf conf = new SparkConf().setAppName(appName);
		JavaStreamingContext jssc = new JavaStreamingContext(conf,Durations.milliseconds(durations));
		Map<String,Integer> topics = new HashMap<String,Integer>();
		topics.put(topic, 1);
		JavaPairDStream<String,String> input = KafkaUtils.createStream(jssc, zkQuorum, group, topics);
		
		log.info("start receipt kafka", "");
		
		input.foreachRDD(
				new VoidFunction<JavaPairRDD<String,String>>(){
					public void call(JavaPairRDD<String,String> x){
						JavaRDD<String> j = x.values();
						log.info("receipting......", "");
						j.foreach(
							new VoidFunction<String>(){
								public void call(String n){
									System.out.println("testSparkStreaming" + n);
								}
							}
						);
					}
				}
			);
		
		input.print();
		
		jssc.start();
		jssc.awaitTermination();
		jssc.stop();
		
	}
	
	public static void main(String[] args) {
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_NOSQL);
		KafkaTest kafkaTest = (KafkaTest)springBeanFactory.getBean("kafkaTest");
		kafkaTest.testKafka();
	}
}
