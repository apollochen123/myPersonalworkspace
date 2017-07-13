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
import com.sitech.strategy.event.entity.inter.IGroupMsgEventEntity;
import com.sitech.strategy.event.entity.param.inter.IGroupMsgEventReceiverParam;

/**
 * Create on 2017-1-20
 * @author: wangpei
 * @Title:GroupMsgEventReceiver
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class GroupMsgEventReceiver extends BaseClass implements Serializable{
	protected IGroupMsgEventReceiverParam groupMsgEventReceiverParam;
	protected IGroupMsgEventEntity groupMsgEventEntity;
	protected ISparkAppProp sparkAppProp;
	
	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: setGroupMsgEventReceiverParam 
	* @param groupMsgEventReceiverParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setGroupMsgEventReceiverParam(
			IGroupMsgEventReceiverParam groupMsgEventReceiverParam) {
		this.groupMsgEventReceiverParam = groupMsgEventReceiverParam;
	}

	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: setGroupMsgEventEntity 
	* @param groupMsgEventEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setGroupMsgEventEntity(IGroupMsgEventEntity groupMsgEventEntity) {
		this.groupMsgEventEntity = groupMsgEventEntity;
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
	 * 接收宽带密码服务消息
	* @date: 2017-3-10 
	* @author: tangaq
	* @title: broadbandPasswordSerivceRecevicer  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void receiveBroadbandPasswordSerivce(){
		log.info("KafkaReceiver.receiveBroadbandPasswordSerivce", "welcome spark");
		sparkAppProp.setSparkAppProp(Const.SPARK_APPNAME_RECEIVEGROUPMSGEVENT);

		String appName = sparkAppProp.getAppName();
		String zkQuorum = sparkAppProp.getZkQuorum();
		String topic = sparkAppProp.getTopic();
		String group = sparkAppProp.getGroup();
		long durations = Long.parseLong(sparkAppProp.getDurations());

		log.info("KafkaReceiver.receiveBroadbandPasswordSerivce.appName", appName);
		log.info("KafkaReceiver.receiveBroadbandPasswordSerivce.zkQuorum", zkQuorum);
		log.info("KafkaReceiver.receiveBroadbandPasswordSerivce.topic", topic);
		log.info("KafkaReceiver.receiveBroadbandPasswordSerivce.group", group);
		log.info("KafkaReceiver.receiveBroadbandPasswordSerivce.durations", durations);

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
					public void call(String inparam) throws Exception {
						log.info("receiveGroupMsgEvent.braodbandPasswordSerivceRecevicer.s", inparam.toString());
						Map<String, Object> inMap = groupMsgEventReceiverParam.recevicerBroadbandPasswordSerivceInParam(inparam);
						groupMsgEventEntity.receiveBraodbandPasswordSerivce(inMap);
						log.info("receiveGroupMsgEvent.braodbandPasswordSerivceRecevicer", "end");
					}
				});
			}
		});
		//input.print();
		jssc.start();
		jssc.awaitTermination();
		jssc.stop();

	}
	

	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: receiveGroupMsgEvent  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void receiveGroupMsgEvent(){
		log.info("KafkaReceiver.receiveGroupMsgEvent", "welcome spark");
		sparkAppProp.setSparkAppProp(Const.SPARK_APPNAME_RECEIVEGROUPMSGEVENT);

		String appName = sparkAppProp.getAppName();
		String zkQuorum = sparkAppProp.getZkQuorum();
		String topic = sparkAppProp.getTopic();
		String group = sparkAppProp.getGroup();
		long durations = Long.parseLong(sparkAppProp.getDurations());

		log.info("KafkaReceiver.receiveGroupMsgEvent.appName", appName);
		log.info("KafkaReceiver.receiveGroupMsgEvent.zkQuorum", zkQuorum);
		log.info("KafkaReceiver.receiveGroupMsgEvent.topic", topic);
		log.info("KafkaReceiver.receiveGroupMsgEvent.group", group);
		log.info("KafkaReceiver.receiveGroupMsgEvent.durations", durations);

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
					public void call(String inparam) throws Exception {
						log.info("receiveGroupMsgEvent.receiveCoupleBack.s", inparam.toString());
						Map<String, Object> inMap = groupMsgEventReceiverParam.receiveGroupMsgEventParam(inparam);
						groupMsgEventEntity.receiveGroupMsgEvent(inMap);
						log.info("receiveGroupMsgEvent.receiveCoupleBack", "end");
					}
				});
			}
		});
		//input.print();
		jssc.start();
		jssc.awaitTermination();
		jssc.stop();

	}
	
	/** 
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: main 
	* @param args 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static void main(String[] args) {
		if (args.length <= 0) {
			System.err.println("ERROR: please input a param ...");
			System.exit(0);
		}
		String busiType = args[0];
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_EVENT);
		GroupMsgEventReceiver groupMsgEventReceiver = (GroupMsgEventReceiver) springBeanFactory.getBean("groupMsgEventReceiver");
		if ("GroupMsgEvent".equals(busiType)) {
			groupMsgEventReceiver.receiveGroupMsgEvent();
		}else{
			groupMsgEventReceiver.receiveBroadbandPasswordSerivce();
		}
	}
}
