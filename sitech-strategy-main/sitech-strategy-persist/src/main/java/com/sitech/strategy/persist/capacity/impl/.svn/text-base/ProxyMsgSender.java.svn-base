package com.sitech.strategy.persist.capacity.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.assemblymsgstructure.IAssemblyMsgStructure;
import com.sitech.strategy.common.pojo.inter.topic.ITopic;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.base.BaseProxyClass;
import com.sitech.strategy.persist.capacity.proxy.IMsgSender;

/**
 * 消息发送器
* @date: 2016-9-12 
* @author: zhaoyue
* @title: ProxyMsgSender 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProxyMsgSender extends BaseProxyClass implements IMsgSender,Serializable {
	/**
	 * 消息组装
	 */
	IAssemblyMsgStructure assemblyMsgStructure;
	/**
	 * 消息操作
	 */
	protected IMsgDML msgDML;
	/**
	 * smpp
	 */
	protected ISMPPDML SMPPDML;
	/**
	 * 消息主题对象
	 */
	protected ITopic msgTopic;

	/**
	 * 
	* @date: 2016-12-25 
	* @author: sunliang 
	* @title: setAssemblyMsgStructure 
	* @param assemblyMsgStructure 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAssemblyMsgStructure(IAssemblyMsgStructure assemblyMsgStructure) {
		this.assemblyMsgStructure = assemblyMsgStructure;
	}

	/** 
	* @date: 2017-2-21 
	* @author: wangpei
	* @title: setMsgDML 
	* @param msgDML 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setMsgDML(IMsgDML msgDML) {
		this.msgDML = msgDML;
	}

	/** 
	* @date: 2017-2-21 
	* @author: wangpei
	* @title: setSMPPDML 
	* @param sMPPDML 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setSMPPDML(ISMPPDML sMPPDML) {
		SMPPDML = sMPPDML;
	}
	
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
	 * 批量push
	* @date: 2016-10-1 
	* @author: yangwl
	* @title: IBatchPushSender 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class BatchPushSender implements IBatchPushSender,Serializable{
		/**
		 * 检查连接状态
		* @date: 2016-12-24 
		* @author: sunliang 
		* @title: checkConnStatus 
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public int checkConnStatus() {
			return 0;
		}

		/**
		 * 关闭连接 
		* @date: 2016-12-24 
		* @author: sunliang 
		* @title: closeConnect  
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void closeConnect() {
		}
		
		/**
		 * 打开连接
		* @date: 2016-12-24 
		* @author: sunliang 
		* @title: openConnect  
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void openConnect() {
		}
		
		/**
		 * 发送批量PUSH信息
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: sendMsg 
		* @param msgContent
		* @param phoneNo
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void sendBatchPushMsg(Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String,Object> sendMap = assemblyMsgStructure.getBatchPushMsgStructure(tempInParam);
			log.info("sending ..", sendMap);
			msgDML.send(sendMap);
		}

		/**
		 * 模拟发送短信
		* @date: 2017-1-25 
		* @author: tangaq
		* @title: sendMsgSimulation 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void sendMsgSimulation(Map<String, Object> tempInParam)
				throws StrategyError {
			msgDML.send(tempInParam);
		}
	}
	
	/**
	* Create on 2017-2-9
	* @author: wangpei
	* @Title:BatchPushSenderBySMPP
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class BatchPushSenderBySMPP extends BatchPushSender implements IBatchPushSender,Serializable{
		/**
		 * 检查连接状态
		* @date: 2016-12-24 
		* @author: sunliang 
		* @title: checkConnStatus 
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public int checkConnStatus() {
			return SMPPDML.checkStatus();
		}

		/**
		 * 关闭连接 
		* @date: 2016-12-24 
		* @author: sunliang 
		* @title: closeConnect  
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void closeConnect() {
			SMPPDML.unbindLink();
		}
		
		/**
		 * 打开连接
		* @date: 2016-12-24 
		* @author: sunliang 
		* @title: openConnect  
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void openConnect() {
			SMPPDML.bindLink();
		}
		
		/**
		 * 发送批量PUSH信息
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: sendMsg 
		* @param msgContent
		* @param phoneNo
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void sendBatchPushMsg(Map<String, Object> tempInParam)throws StrategyError {
			SMPPDML.send(tempInParam);
		}

		/**
		 * 模拟发送短信
		* @date: 2017-1-25 
		* @author: tangaq
		* @title: sendMsgSimulation 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void sendMsgSimulation(Map<String, Object> tempInParam)
				throws StrategyError {
		}
	}
	
	/**渠道任务发送
	* Create on 2016-11-15
	* @author: wangpei
	* @Title:ChannelTaskSender
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class ChannelTaskSender implements IChannelTaskSender, Serializable{
		/** 渠道任务发送
		* @date: 2016-11-15 
		* @author: wangpei
		* @title: sendChannelTaskMsg 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void sendChannelTaskMsg(Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String, Object> param = assemblyMsgStructure.getChannelTaskMsgStructure(tempInParam);
			msgDML.send(param);
		}

		/** 发送任务关闭消息
		* @date: 2017-1-20 
		* @author: wangpei
		* @title: sendChannelTaskCloseMsg 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void sendChannelTaskCloseMsg(Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String, Object> param = assemblyMsgStructure.getChannelTaskCloseMsgStructure(tempInParam);
			msgDML.send(param);
		}

		/** 发送通知短信
		* @date: 2017-3-10 
		* @author: wangpei
		* @title: sendChannelTaskNoticeMsg 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void sendChannelTaskNoticeMsg(Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String, Object> param = assemblyMsgStructure.getChannelTaskNoticeMsgStructure(tempInParam);
			msgDML.send(param);
		}
		
	}
	
	/**
	 * 赠费
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: GiveFeeSender 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class GiveFeeSender implements IGiveFeeSender,Serializable{

		/**
		 * 赠费
		* @date: 2017-2-22 
		* @author: sunliang 
		* @title: sendGiveFeeMsg 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		* 2017-2-27 luogj 增加入参Map<String, Object> inParam, 
		 */
		@Override
		public void sendGiveFeeMsg(Map<String, Object> inParam, Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String,Object> userMap = (Map<String,Object>)tempInParam.get("userMap");
			String msg = assemblyMsgStructure.getSendGiveFeeMsgStructure(inParam, tempInParam);
			String topic = msgTopic.getProducerTopicGivefee();
			String phoneNo = (String)userMap.get("phoneNo");
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put("msg", msg);
			tempParam.put("topic", topic);
			tempParam.put("phoneNo", phoneNo);
			
			log.info("ProxyMsgSender.GiveFeeSender.msg", msg);
			log.info("ProxyMsgSender.GiveFeeSender.topic", topic);
			log.info("ProxyMsgSender.GiveFeeSender.phoneNo", phoneNo);
			
			msgDML.send(tempParam);
		}
		
	}
	
	/**
	 * 赠套餐
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: GiveProdSender 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class GiveProdSender implements IGiveProdSender,Serializable{

		/**
		 * 赠套餐
		* @date: 2017-2-22 
		* @author: sunliang 
		* @title: sendGivePordMsg 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		* 2017-2-27 luogj 改名，增加入参
		 */
		@Override
		public void sendGiveProdMsg(Map<String, Object> inParam, Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String,Object> userMap = (Map<String,Object>)tempInParam.get("userMap");
			String msg = assemblyMsgStructure.getSendGiveProdMsgStructure(inParam, tempInParam);
			String topic = msgTopic.getProducerTopicGiveprod();
			String phoneNo = (String)userMap.get("phoneNo");
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put("msg", msg);
			tempParam.put("topic", topic);
			tempParam.put("phoneNo", phoneNo);
			
			log.info("ProxyMsgSender.sendGiveProdMsg.msg", msg);
			log.info("ProxyMsgSender.sendGiveProdMsg.topic", topic);
			log.info("ProxyMsgSender.sendGiveProdMsg.phoneNo", phoneNo);
			
			msgDML.send(tempParam);
			
		}
		
	}
	
	/**集团事件发送
	* Create on 2017-1-20
	* @author: wangpei
	* @Title:GroupMsgEventSender
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public class GroupMsgEventSender implements IGroupMsgEventSender,Serializable{
		/** 发送集团消息
		* @date: 2017-1-20 
		* @author: wangpei
		* @title: sendGroupMsg 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		@Override
		public void sendGroupMsg(Map<String, Object> tempInParam)throws StrategyError {
			Map<String, Object> param = assemblyMsgStructure.getGroupMsgStructure(tempInParam);
			msgDML.send(tempInParam);
		}
		
	}
	
	/**
	 * 实时push发送
	* @date: 2017-2-13 
	* @author: sunliang 
	* @title: RealTimePushSender 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RealTimePushSender implements IRealTimePushSender, Serializable{

		/**
		 * 发送实时消息
		* @date: 2017-2-21 
		* @author: sunliang 
		* @title: sendRealTimeMsg 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void sendRealTimeMsg(Map<String, Object> tempInParam)
				throws StrategyError {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	/**
	 * 推荐短信发送
	* @date: 2017-2-27 
	* @author: sunliang 
	* @title: RecommendMsgSender 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class RecommendMsgSender implements IRecommendMsgSender, Serializable{
		
		/**
		 * 发送推荐短信
		* @date: 2017-2-27 
		* @author: sunliang 
		* @title: sendRecommendMsg 
		* @param tempInParam 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		* 2017-2-27 luogj 增加入参Map<String, Object> inParam, 
		* 2017-2-28 luogj 修改推荐短信主题获取方法调用
		 */
		public void sendRecommendMsg(Map<String, Object> inParam, Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String,Object> userMap = (Map<String,Object>)tempInParam.get("userMap");
			String msg = assemblyMsgStructure.getSendRecommendMsgStructure(inParam, tempInParam);
			String topic = msgTopic.getProducerTopicRecommendMsg(Const.SHORT_MSG_LEVEL_HIGH);
			String phoneNo = (String)userMap.get("phoneNo");
			
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put("msg", msg);
			tempParam.put("topic", topic);
			tempParam.put("phoneNo", phoneNo);
			
			log.info("ProxyMsgSender.sendRecommendMsg.msg", msg);
			log.info("ProxyMsgSender.sendRecommendMsg.topic", topic);
			log.info("ProxyMsgSender.sendRecommendMsg.phoneNo", phoneNo);
			
			msgDML.send(tempParam);
		}
		
	}
	
	/**
	 * 事件触发发送
	* @date: 2017-2-21 
	* @author: sunyuan
	* @title: EventTriggerSender 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public class TriggerMsgEventSender implements ITriggerMsgEventSender,Serializable{

		/**
		 * 发送事件触发消息
		* @date: 2017-2-21 
		* @author: sunyuan
		* @title: sendTriggerMsgEvent 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		@Override
		public void sendTriggerMsgEvent(Map<String, Object> tempInParam)
				throws StrategyError {
			Map<String, Object> param = assemblyMsgStructure.getSendTriggerMsgEventStructure(tempInParam);
			log.info("ProxyMsgSender.sendTriggerMsgEvent   param-------------------------", param);
			msgDML.send(param);
		}
		
		
	}
	
}
