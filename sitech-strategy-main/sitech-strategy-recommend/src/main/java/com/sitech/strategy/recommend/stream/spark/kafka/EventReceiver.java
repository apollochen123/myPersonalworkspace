package com.sitech.strategy.recommend.stream.spark.kafka;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.spark.SparkConf;
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
import com.sitech.strategy.recommend.base.BaseClass;
import com.sitech.strategy.recommend.entity.inter.IParseRecommendEntity;
import com.sitech.strategy.recommend.entity.param.inter.IEventReceiverParam;

/** 
 * 事件接收
* @date: 2016-11-29 
* @author: songxj
* @title: EventReceiver 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note: 
*/
public class EventReceiver extends BaseClass implements Serializable{

	/**
	 * 事件接收参数对象
	 */
	protected IEventReceiverParam eventReceiverParam;
	/**
	 * 推荐对象
	 */
	protected IParseRecommendEntity parseRecommendEntity;
	/**
	 * spark应用配置对象
	 */
	protected ISparkAppProp sparkAppProp;
	
	/** 
	* @date: 2016-11-29 
	* @author: songxj
	* @title: setEventReceiverParam 
	* @param eventReceiverParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setEventReceiverParam(IEventReceiverParam eventReceiverParam) {
		this.eventReceiverParam = eventReceiverParam;
	}
	
	/** 
	* @date: 2016-11-29 
	* @author: songxj
	* @title: setParseRecommendEntity 
	* @param parseRecommendEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setParseRecommendEntity(IParseRecommendEntity parseRecommendEntity) {
		this.parseRecommendEntity = parseRecommendEntity;
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
	 * 解析事件触发推荐
	* @date: 2016-11-29 
	* @author: songxj
	* @title: parseEventTriggerRecommend  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void parseEventTriggerRecommend(){
		sparkAppProp.setSparkAppProp(Const.SPARK_APPNAME_RECEIVETRIGGERMSGEVENT);
		
		String appName = sparkAppProp.getAppName();
		String zkQuorum = sparkAppProp.getZkQuorum();
		String topic = sparkAppProp.getTopic();
		String group = sparkAppProp.getGroup();
		long durations = Long.parseLong(sparkAppProp.getDurations());
		
		log.info("KafkaReceiver.receiveProdOrderEvent.appName", appName);
		log.info("KafkaReceiver.receiveProdOrderEvent.zkQuorum", zkQuorum);
		log.info("KafkaReceiver.receiveProdOrderEvent.topic", topic);
		log.info("KafkaReceiver.receiveProdOrderEvent.group", group);
		log.info("KafkaReceiver.receiveProdOrderEvent.durations", durations);
		
	    SparkConf conf = new SparkConf().setAppName(appName).setMaster("local[4]");
		JavaStreamingContext jssc = new JavaStreamingContext(conf, Durations.milliseconds(durations));
		Map<String, Integer> topics = new HashMap<String, Integer>();
		topics.put(topic, 4);
		
		JavaPairDStream<String, String> input = KafkaUtils.createStream(jssc, zkQuorum, group, topics);
		
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
						Map<String, Object> tempParam = eventReceiverParam.parseEventTriggerRecommendParam(inParam);
						parseRecommendEntity.parseEventTriggerRecommend(tempParam);
					}
				});
			}
		});
		
		jssc.start();
		jssc.awaitTermination();
		jssc.stop();
	}
	
	public static void main(String[] args) {
		if (args.length < 0) {
			System.err.println("ERROR: please input a param ...");
			System.exit(0);
		}
		//String busiType = args[0];
		String busiType = "ProdOrderEventReceiver";
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_RECOMMEND);
		EventReceiver eventReceiver = (EventReceiver) springBeanFactory.getBean("eventReceiver");
		if ("ProdOrderEventReceiver".equals(busiType)) {
			eventReceiver.parseEventTriggerRecommend();
		}
	}

}
