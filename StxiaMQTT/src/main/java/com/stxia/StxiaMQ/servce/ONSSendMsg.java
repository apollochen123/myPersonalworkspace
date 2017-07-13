package com.stxia.StxiaMQ.servce;



import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.Producer;
import com.aliyun.openservices.ons.api.SendResult;
import com.stxia.StxiaMQ.util.StxiaConfig;

public class ONSSendMsg {
	private String tag;
	private String targetClientId;
	private String sendMsg;
	private Producer producer;

//	WebApplicationContext wac = ContextLoader.getCurrentWebApplicationContext();	
	public Producer getProducer() {
		return producer;
	}
	public void setProducer(Producer producer) {
		this.producer = producer;
	}

	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public String getTargetClientId() {
		return targetClientId;
	}
	public void setTargetClientId(String targetClientId) {
		this.targetClientId = targetClientId;
	}
	public String getSendMsg() {
		return sendMsg;
	}
	public void setSendMsg(String sendMsg) {
		this.sendMsg = sendMsg;
	}
	/**
	 * 根据producerId，AK，和SK返回一个装好的properties对象作为Producer的参数
	 * @param producerId
	 * @param accessKey
	 * @param secretKey
	 * @return
	 */

	public String send()throws InterruptedException{
//	   properties.get(PropertyKeyConst.ProducerId);
//	   System.out.println("producer线程启动时间："+new Date(System.currentTimeMillis()));
//     Producer producer=wac.getBean("producer",Producer.class);
	   if(null==producer){
		   System.out.println("producer为空");
		   return "start producer failed";
		}
	   else{
		   producer.start();//启动线程
	   
//	   System.out.println("producer线程启动结束时间："+new Date(System.currentTimeMillis()));
	   byte[] body=sendMsg.getBytes();
		//生成一个消息，用于发送
		final Message msg=new Message(
				StxiaConfig.TOPIC,//MQ消息Topic
				tag,//MQ消息的Tag
				body); //消息体，和MQTT的body对应
        /**
        * 使用MQ客户端给MQTT设备发送P2P消息时，需要在MQ消息中设置mqttSecondTopic属性
        * 设置的值是“/p2p/”+目标ClientID
        */
		msg.putUserProperties("mqttSecondTopic", "/p2p/"+targetClientId);
		//发送消息
//		System.out.println("producer的send时间："+new Date(System.currentTimeMillis()));
		SendResult sendResult=producer.send(msg);
//		System.out.println("producer的send结束时间："+new Date(System.currentTimeMillis()));
	    return sendResult.toString();
	   }
	}
	public void shut(){
	    producer.shutdown();
	}
	
	

}
