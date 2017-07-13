package com.sitech.strategy.event.message.spark.kafka;

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
import com.sitech.strategy.event.base.BaseClass;
import com.sitech.strategy.event.entity.inter.IProdEventEntity;
import com.sitech.strategy.event.entity.param.inter.IProdEventReceiverParam;

/** 
 * 事件消息接收
* @date: 2016-11-23 
* @author: songxj
* @title: ProdEventReceiver 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note: 
*/
public class ProdEventReceiver extends BaseClass implements Serializable {
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 5141655933678144586L;
	/**
	 * 事件解析实体对象
	 */
	protected IProdEventEntity prodEventEntity;
	/**
	 * 产品事件接收参数对象
	 */
	protected IProdEventReceiverParam prodEventReceiverParam;
	/**
	 * spark应用配置对象
	 */
	protected ISparkAppProp sparkAppProp;
	
	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: setProdEventEntity 
	* @param prodEventEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setProdEventEntity(IProdEventEntity prodEventEntity) {
		this.prodEventEntity = prodEventEntity;
	}

	/** 
	* @date: 2016-11-29 
	* @author: songxj
	* @title: setProdEventReceiverParam 
	* @param prodEventReceiverParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setProdEventReceiverParam(
			IProdEventReceiverParam prodEventReceiverParam) {
		this.prodEventReceiverParam = prodEventReceiverParam;
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
	 * 产品订购事件
	* @date: 2016-11-23 
	* @author: songxj
	* @title: receiveProdOrderEvent  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void receiveProdOrderEvent(){
	    
		log.info("KafkaReceiver.receiveProdOrderEvent", "welcome spark");
		sparkAppProp.setSparkAppProp(Const.SPARK_APPNAME_RECEIVEPRODORDER);
		
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
					public void call(String inparam) throws Exception {
						Map<String, Object> inMap = prodEventReceiverParam.receiveProdOrderEventInParam(inparam);
						prodEventEntity.receiveProdOrderEvent(inMap);
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
		String busiType = "ProdOrderEvent";
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_EVENT);
		ProdEventReceiver prodEventReceiver = (ProdEventReceiver) springBeanFactory.getBean("prodEventReceiver");
		if ("ProdOrderEvent".equals(busiType)) {
			prodEventReceiver.receiveProdOrderEvent();
		}
	}
}
