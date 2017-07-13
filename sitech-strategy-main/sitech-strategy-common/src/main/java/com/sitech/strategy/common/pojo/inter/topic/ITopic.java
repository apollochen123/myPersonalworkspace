package com.sitech.strategy.common.pojo.inter.topic;

/**
 * 消息主题
* @date: 2017-2-22 
* @author: sunyuan
* @title: Topic 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ITopic {
	
	public String getProducerTopicTest();
	public String getProducerTopicTasksyn();
	public String getProducerTopicMessagepush();
	public String getProducerTopicGroupmsgpush();
	public String getProducerTopicTriggermsgevent();
	public String getProducerTopicGivefee();
	public String getProducerTopicGiveprod();
	public String getProducerTopicRecommendMsg(String shortMsgLevel);
	public String getConsumerTopicTest();
	public String getConsumerTopicProdorderevent();
	public String getConsumerTopicAcceptcoupleback();
	public String getConsumerTopicCoupleback();
	public String getConsumerTopicGroupmsgevent();
	public String getConsumerTopicTriggermsgevent();
	public String getConsumerTopicFeeevent();
	public String getConsumerTopicFlowevent();
	public String getConsumerTopicBusievent();

}
