package com.sitech.strategy.common.pojo.impl;

import java.io.Serializable;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.ISparkAppProp;
import com.sitech.strategy.common.pojo.inter.topic.ITopic;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.PropertiesUtil;

/**
 * spark应用配置对象
* @date: 2016-9-12 
* @author: sunliang 
* @title: SparkStreamingAppProp 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class SparkAppProp extends BaseClass implements ISparkAppProp,Serializable{
	
	/**
	 * 消息主题对象
	 */
	protected ITopic msgTopic;
	/**
	 * 应用名
	 */
	protected String appName;
	/**
	 * kafka连接zk地址
	 */
	protected String zkQuorum;
	/**
	 * 消息主题
	 */
	protected String topic;
	/**
	 * group名
	 */
	protected String group;
	/**
	 * spark接收数据间隔时间
	 */
	protected String durations;
	/**
	 * providerUrl
	 */
	protected String providerUrl;
	/**
	 * initialContextFactory
	 */
	protected String initialContextFactory;
	/**
	 * urlPkgPrefixes
	 */
	protected String urlPkgPrefixes;
	/**
	 * ConnectionFactory
	 */
	protected String connectionFactory;
	/**
	 * queue
	 */
	protected String queue;
	/**
	 * idmmAddr
	 */
	protected String idmmAddr;
	/**
	 * idmmTopicId
	 */
	protected String idmmTopicId;
	/**
	 * idmmClientId
	 */
	protected String idmmClientId;
	/**
	 * idmmProcessTime
	 */
	protected int idmmProcessTime;
	
	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: setMsgTopic 
	* @param msgTopic 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMsgTopic(ITopic msgTopic) {
		this.msgTopic = msgTopic;
	}
	
	/**
	 * 设置spark应用参数
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: setSparkAppProp 
	* @param appName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSparkAppProp(String appName){
		
		if(Const.SPARK_APPNAME_SPARKSTREAMINGTEST.equals(appName)){
			this.appName = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.sparkStreamingTest.appName");
			this.zkQuorum = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.sparkStreamingTest.kafka.zkQuorum");
			this.topic = msgTopic.getConsumerTopicTest();
			this.group = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.sparkStreamingTest.group");
			this.durations = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.sparkStreamingTest.durations.milliseconds");
		}else if(Const.SPARK_APPNAME_RECEIVEACCEPTCOUPLEBACK.equals(appName)){
			this.appName = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveAcceptCoupleBack.appName");
			this.idmmAddr = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveAcceptCoupleBack.idmmAddr");
			this.idmmTopicId = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveAcceptCoupleBack.idmmTopicId");
			this.idmmClientId = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveAcceptCoupleBack.idmmClientId");
			this.idmmProcessTime = Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveAcceptCoupleBack.idmmProcessTime"));
			this.durations = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveAcceptCoupleBack.durations.milliseconds");
		}else if(Const.SPARK_APPNAME_RECEIVECOUPLEBACK.equals(appName)){
			this.appName = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveCoupleBack.appName");
			this.idmmAddr = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveCoupleBack.idmmAddr");
			this.idmmTopicId = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveCoupleBack.idmmTopicId");
			this.idmmClientId = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveCoupleBack.idmmClientId");
			this.idmmProcessTime = Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveCoupleBack.idmmProcessTime"));
			this.durations = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveCoupleBack.durations.milliseconds");
		}else if(Const.SPARK_APPNAME_RECEIVEPRODORDER.equals(appName)){
			this.appName = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveProdOrder.appName");
			this.idmmAddr = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveProdOrder.idmmAddr");
			this.idmmTopicId = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveProdOrder.idmmTopicId");
			this.idmmClientId = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveProdOrder.idmmClientId");
			this.idmmProcessTime = Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveProdOrder.idmmProcessTime"));
			this.durations = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveProdOrder.durations.milliseconds");
		}else if(Const.SPARK_APPNAME_RECEIVEFLOW.equals(appName)){
			this.appName = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveFlow.appName");
			this.idmmAddr = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveFlow.idmmAddr");
			this.idmmTopicId = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveFlow.idmmTopicId");
			this.idmmClientId = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveFlow.idmmClientId");
			this.idmmProcessTime = Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveFlow.idmmProcessTime"));
			this.durations = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveFlow.durations.milliseconds");
		}else if(Const.SPARK_APPNAME_RECEIVEFEE.equals(appName)){
			this.appName = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveFee.appName");
			this.idmmAddr = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveFee.idmmAddr");
			this.idmmTopicId = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveFee.idmmTopicId");
			this.idmmClientId = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveFee.idmmClientId");
			this.idmmProcessTime = Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveFee.idmmProcessTime"));
			this.durations = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveFee.durations.milliseconds");
		}else if(Const.SPARK_APPNAME_RECEIVEBUSI.equals(appName)){
			this.appName = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveBusi.appName");
			this.idmmAddr = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveBusi.idmmAddr");
			this.idmmTopicId = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveBusi.idmmTopicId");
			this.idmmClientId = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveBusi.idmmClientId");
			this.idmmProcessTime = Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveBusi.idmmProcessTime"));
			this.durations = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.receiveBusi.durations.milliseconds");
		}else if(Const.SPARK_APPNAME_GENERATEBATCHPUSHTASK.equals(appName)){
			this.appName = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.batchPush.appName");
		}else if(Const.SPARK_APPNAME_GENERATECALLTASK.equals(appName)){
			this.appName = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.callTask.appName");
		}else if(Const.SPARK_APPNAME_LOADCALLCOUPLEBACK.equals(appName)){
			this.appName = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARKAPP,"spark.callCoupleBack.appName");
		}else{
			this.appName = null;
		}
		
	}
	
	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getAppName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getAppName() {
		return appName;
	}
	
	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getZkQuorum 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getZkQuorum() {
		return zkQuorum;
	}
	
	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getTopic 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getTopic() {
		return topic;
	}
	
	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getGroup 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getGroup() {
		return group;
	}
	
	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getDurations 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getDurations() {
		return durations;
	}
	
	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getProviderUrl 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getProviderUrl() {
		return providerUrl;
	}

	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getInitialContextFactory 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getInitialContextFactory() {
		return initialContextFactory;
	}

	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getUrlPkgPrefixes 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getUrlPkgPrefixes() {
		return urlPkgPrefixes;
	}

	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getConnectionFactory 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getConnectionFactory() {
		return connectionFactory;
	}

	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getQueue 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getQueue() {
		return queue;
	}
	
	/**
	 * 
	* @date: 2017-4-1 
	* @author: sunliang
	* @title: getIdmmAddr 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getIdmmAddr() {
		return idmmAddr;
	}
	
	/**
	 * 
	* @date: 2017-4-1 
	* @author: sunliang
	* @title: getIdmmTopicId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getIdmmTopicId() {
		return idmmTopicId;
	}
	
	/**
	 * 
	* @date: 2017-4-1 
	* @author: sunliang
	* @title: getIdmmClientId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getIdmmClientId() {
		return idmmClientId;
	}
	
	/**
	 * 
	* @date: 2017-4-1 
	* @author: sunliang
	* @title: getIdmmProcessTime 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getIdmmProcessTime() {
		return idmmProcessTime;
	}


}
