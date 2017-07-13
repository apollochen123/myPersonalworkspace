package com.sitech.strategy.process.stream.spark.kafka;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.api.java.function.VoidFunction;
import org.apache.spark.streaming.Durations;
import org.apache.spark.streaming.api.java.JavaDStream;
import org.apache.spark.streaming.api.java.JavaPairDStream;
import org.apache.spark.streaming.api.java.JavaStreamingContext;
import org.apache.spark.streaming.kafka.KafkaUtils;

import scala.Tuple2;

import com.sitech.strategy.common.pojo.impl.SparkAppProp;
import com.sitech.strategy.common.pojo.inter.ISparkAppProp;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.base.BaseClass;
import com.sitech.strategy.process.entity.inter.ICoupleBackProcessEntity;
import com.sitech.strategy.process.entity.param.inter.ICoupleBackReceiverParam;

/**
 * kafka消息接收器
* @date: 2016-9-8 
* @author: sunliang 
* @title: KafkaReceiver 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class CoupleBackReceiver extends BaseClass implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5141655933678144586L;
	/**
	 * 反馈处理实体
	 */
	protected ICoupleBackProcessEntity coupleBackProcessEntity;
	/**
	 * 反馈参数处理实体
	 */
	protected ICoupleBackReceiverParam coupleBackReceiverParam;
	/**
	 * spark应用配置对象
	 */
	protected ISparkAppProp sparkAppProp;
	
	
	/**
	 * 
	* @date: 2016-11-26 
	* @author: sunliang 
	* @title: setCoupleBackReceiverParam 
	* @param coupleBackReceiverParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCoupleBackReceiverParam(
			ICoupleBackReceiverParam coupleBackReceiverParam) {
		this.coupleBackReceiverParam = coupleBackReceiverParam;
	}

	/**
	 * 
	* @date: 2016-10-20 
	* @author: sunliang 
	* @title: setCoupleBackProcessEntity 
	* @param coupleBackProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCoupleBackProcessEntity(
			ICoupleBackProcessEntity coupleBackProcessEntity) {
		this.coupleBackProcessEntity = coupleBackProcessEntity;
	}
	
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
	 * 接收反馈数据
	* @date: 2016-9-8 
	* @author: sunliang 
	* @title: receiveCoupleBack  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void receiveCoupleBack(){
	    
		log.info("CoupleBackReceiver.receiveCoupleBack", "welcome spark");
		sparkAppProp.setSparkAppProp(Const.SPARK_APPNAME_RECEIVECOUPLEBACK);
		
		String appName = sparkAppProp.getAppName();
		String zkQuorum = sparkAppProp.getZkQuorum();
		String topic = sparkAppProp.getTopic();
		String group = sparkAppProp.getGroup();
		long durations = Long.parseLong(sparkAppProp.getDurations());
		
		log.info("KafkaReceiver.receiveCoupleBack.appName", appName);
		log.info("KafkaReceiver.receiveCoupleBack.zkQuorum", zkQuorum);
		log.info("KafkaReceiver.receiveCoupleBack.topic", topic);
		log.info("KafkaReceiver.receiveCoupleBack.group", group);
		log.info("KafkaReceiver.receiveCoupleBack.durations", durations);
	    
	    SparkConf conf = new SparkConf().setAppName(appName);
		JavaStreamingContext jssc = new JavaStreamingContext(conf,Durations.milliseconds(durations));
		Map<String,Integer> topics = new HashMap<String,Integer>();
		topics.put(topic, 1);
		JavaPairDStream<String,String> input = KafkaUtils.createStream(jssc, zkQuorum, group, topics);
		
		input.foreachRDD(
				new VoidFunction<JavaPairRDD<String,String>>(){
					public void call(JavaPairRDD<String,String> x){
						JavaRDD<String> j = x.values();
						
						j.foreach(
							new VoidFunction<String>(){
								public void call(String s){
									try {
										log.info("CoupleBackReceiver.receiveCoupleBack.s", s.toString());
										Map<String,Object> inParam = coupleBackReceiverParam.receiveCoupleBackInParam(s);
										coupleBackProcessEntity.receiveCoupleBack(inParam);
										log.info("CoupleBackReceiver.receiveCoupleBack", "end");
									} catch (StrategyError e) {
										e.printStackTrace();
									}
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
	
	
	/**
	 * 接收受理反馈记录
	* @date: 2017-2-14 
	* @author: yexr
	* @title: receiveAcceptCoupleBack  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void receiveAcceptCoupleBack() {
		log.info("KafkaReceiver.receive	Accept", "welcome spark");
		sparkAppProp.setSparkAppProp(Const.SPARK_APPNAME_RECEIVEACCEPTCOUPLEBACK);

		String appName = sparkAppProp.getAppName();
		String zkQuorum = sparkAppProp.getZkQuorum();
		String topic = sparkAppProp.getTopic();
		String group = sparkAppProp.getGroup();
		long durations = Long.parseLong(sparkAppProp.getDurations());

		log.info("KafkaReceiver.receiveAcceptCoupleBack.appName", appName);
		log.info("KafkaReceiver.receiveAcceptCoupleBack.zkQuorum", zkQuorum);
		log.info("KafkaReceiver.receiveAcceptCoupleBack.topic", topic);
		log.info("KafkaReceiver.receiveAcceptCoupleBack.group", group);
		log.info("KafkaReceiver.receiveAcceptCoupleBack.durations", durations);

		SparkConf conf = new SparkConf().setAppName(appName);
		JavaStreamingContext jssc = new JavaStreamingContext(conf,Durations.milliseconds(durations));
		Map<String, Integer> topics = new HashMap<String, Integer>();
		topics.put(topic, 1);
		JavaPairDStream<String, String> input = KafkaUtils.createStream(jssc,zkQuorum, group, topics);
		JavaDStream<String> lines = input
				.map(new Function<Tuple2<String, String>, String>() {
					@Override
					public String call(Tuple2<String, String> tuple2) {
						return tuple2._2();
					}
				});

		lines.foreachRDD(new VoidFunction() {
			@Override
			public void call(Object arg0) throws Exception {
				JavaRDD<String> inparamRDD = (JavaRDD<String>) arg0;
				inparamRDD.foreach(new VoidFunction<String>() {
					@Override
					public void call(String inParam) throws Exception {						
						Map<String, Object> inMap = coupleBackReceiverParam.receiveAcceptCoupleBackInParam(inParam);
						coupleBackProcessEntity.receiveAcceptCoupleBack(inMap);						
					}
				});
			}
		});
		//input.print();
		jssc.start();
		jssc.awaitTermination();
		jssc.stop();
	}
	
	
	public static void main(String[] args) {
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_NOSQL);
		CoupleBackReceiver coupleBackReceiver = (CoupleBackReceiver)springBeanFactory.getBean("coupleBackReceiver");
		if("ReceiveAcceptCoupleBack".equals(args[0])){
			coupleBackReceiver.receiveAcceptCoupleBack();
		}else if ("ReceiveCoupleBack".equals(args[0])) {
			coupleBackReceiver.receiveCoupleBack();
		}			
	}
}
