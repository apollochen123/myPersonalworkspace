package com.sitech.strategy.common.pojo.impl.topic;

import java.io.Serializable;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.topic.ITopic;

/**
 * 消息主题
* @date: 2017-2-22 
* @author: sunyuan
* @title: Topic 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class TopicByAHTel extends BaseClass implements ITopic,Serializable{
	
	/**
	 * 生产者消息主题
	 */
	public static final String PRODUCER_TOPIC_TEST= new String("RMTTest");
	public static final String PRODUCER_TOPIC_TASKSYN= new String("RMTTaskSyn");
	public static final String PRODUCER_TOPIC_MESSAGEPUSH= new String("RMTMessagePush");
	public static final String PRODUCER_TOPIC_GROUPMSGPUSH= new String("RMTGroupMsgPush");
	public static final String PRODUCER_TOPIC_TRIGGERMSGEVENT= new String("RMTSendTriggerMsg");
	public static final String PRODUCER_TOPIC_GIVEFEE = new String("T166PayBusiOdr");//实时营销送费
	public static final String PRODUCER_TOPIC_GIVEPROD = new String("TProdBusi");//实时营销送套餐
	public static final String PRODUCER_TOPIC_RECOMMENDMSG = new String("");//推荐短信
	
	/**
	 * 消费者消费主题
	 */
	public static final String CONSUMER_TOPIC_TEST = new String("RMTTest");//测试
	public static final String CONSUMER_TOPIC_PRODORDEREVENT = new String("USEREVENT2SALE");//产品订购
	public static final String CONSUMER_TOPIC_ACCEPTCOUPLEBACK = new String("prod_inst_sub");//受理记录反馈
	public static final String CONSUMER_TOPIC_COUPLEBACK = new String("RMTCoupleBack");//反馈记录
	public static final String CONSUMER_TOPIC_GROUPMSGEVENT = new String("RMTGroupMsgReceive");//集团业务
	public static final String CONSUMER_TOPIC_TRIGGERMSGEVENT = new String("RMTTriggerMsgReceive");//接收事件触发消息
	public static final String CONSUMER_TOPIC_FEEEVENT = new String("T109FeeSynDest");//缴费事件
	public static final String CONSUMER_TOPIC_FLOWEVENT = new String("T132GprsSynDest");//流量事件
	public static final String CONSUMER_TOPIC_BUSIEVENT = new String("T106BusiSynDest");//业务受理事件，实时营销接收的主题
	/**
	 * 发送测试消息
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getProducerTopicTest 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getProducerTopicTest() {
		return PRODUCER_TOPIC_TEST;
	}
	/**
	 * 发送业务同步
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getProducerTopicTasksyn 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getProducerTopicTasksyn() {
		return PRODUCER_TOPIC_TASKSYN;
	}
	/**
	 * 短信发送
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getProducerTopicMessagepush 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getProducerTopicMessagepush() {
		return PRODUCER_TOPIC_MESSAGEPUSH;
	}
	/**
	 * 发送集团业务
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getProducerTopicGroupmsgpush 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getProducerTopicGroupmsgpush() {
		return PRODUCER_TOPIC_GROUPMSGPUSH;
	}
	/**
	 * 触发消息事件
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getProducerTopicTriggermsgevent 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getProducerTopicTriggermsgevent() {
		return PRODUCER_TOPIC_TRIGGERMSGEVENT;
	}
	/**
	 * 实时营销送费
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getProducerTopicGivefee 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getProducerTopicGivefee() {
		return PRODUCER_TOPIC_GIVEFEE;
	}
	/**
	 * 实时营销送套餐
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getProducerTopicGiveprod 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getProducerTopicGiveprod() {
		return PRODUCER_TOPIC_GIVEPROD;
	}
	/**
	 * 接收测试消息
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getConsumerTopicTest 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getConsumerTopicTest() {
		return CONSUMER_TOPIC_TEST;
	}
	/**
	 * 接收产品订购事件
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getConsumerTopicProdorderevent 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getConsumerTopicProdorderevent() {
		return CONSUMER_TOPIC_PRODORDEREVENT;
	}
	/**
	 * 接收受理记录反馈
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getConsumerTopicAcceptcoupleback 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getConsumerTopicAcceptcoupleback() {
		return CONSUMER_TOPIC_ACCEPTCOUPLEBACK;
	}
	/**
	 * 接收反馈记录
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getConsumerTopicCoupleback 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getConsumerTopicCoupleback() {
		return CONSUMER_TOPIC_COUPLEBACK;
	}
	/**
	 * 接收集团业务
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getConsumerTopicGroupmsgevent 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getConsumerTopicGroupmsgevent() {
		return CONSUMER_TOPIC_GROUPMSGEVENT;
	}
	/**
	 * 接收事件触发消息
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getConsumerTopicTriggermsgevent 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getConsumerTopicTriggermsgevent() {
		return CONSUMER_TOPIC_TRIGGERMSGEVENT;
	}
	/**
	 * 接收缴费事件
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getConsumerTopicFeeevent 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getConsumerTopicFeeevent() {
		return CONSUMER_TOPIC_FEEEVENT;
	}
	/**
	 * 接收流量事件
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getConsumerTopicFlowevent 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getConsumerTopicFlowevent() {
		return CONSUMER_TOPIC_FLOWEVENT;
	}
	/**
	 * 接收业务受理事件
	* @date: 2017-2-22 
	* @author: sunyuan
	* @title: getConsumerTopicBusievent 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getConsumerTopicBusievent() {
		return CONSUMER_TOPIC_BUSIEVENT;
	}
	/**
	 * 推荐短信
	* @date: 2017-2-27 
	* @author: sunliang 
	* @title: getProducerTopicRecommendMsg 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-28 luogj 增加入参，内部逻辑没改，需要各省自行实现
	 */
	@Override
	public String getProducerTopicRecommendMsg(String shortMsgLevel) {
		return PRODUCER_TOPIC_RECOMMENDMSG;
	}
	
}
