package com.sitech.strategy.persist.capacity.proxy;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 消息发送器
* @date: 2016-9-12 
* @author: zhaoyue
* @title: IMsgSender 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IMsgSender {
	
	/**
	 * 批量push
	* @date: 2016-10-1 
	* @author: yangwl
	* @title: IBatchPushSender 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IBatchPushSender{
		
		/**
		 * 检查连接状态,返回int=0表示连接正常
		* @date: 2016-12-24 
		* @author: sunliang 
		* @title: checkConnStatus 
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public int checkConnStatus();
		
		/** 
		 * 断开连接 
		* @date: 2016-10-26 
		* @author: songxj
		* @title: unbindLink  
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note: 
		*/
		public void closeConnect();
		
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
		public void openConnect();
		
		/**
		 * 发送批量PUSH信息
		* @date: 2016-10-1 
		* @author: yangwl
		* @title: sendMsg 
		* @param msgContent
		* @param phone_no
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		public void sendBatchPushMsg(Map<String, Object> tempInParam) throws StrategyError;
		
		/**
		 * 模拟发送短信
		* @date: 2017-1-9 
		* @author: tangaq
		* @title: sendMsgSimulation 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
        public void sendMsgSimulation(Map<String,Object> tempInParam) throws StrategyError;
		
	}
	
	/**渠道任务推送
	* Create on 2016-11-15
	* @author: wangpei
	* @Title:IcallTaskSender
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public interface IChannelTaskSender{
		/** 发送外呼任务
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
		public void sendChannelTaskMsg(Map<String, Object> tempInParam) throws StrategyError;
		
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
		public void sendChannelTaskCloseMsg(Map<String, Object> tempInParam) throws StrategyError;
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
		public void sendChannelTaskNoticeMsg(Map<String, Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 赠费
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: IGiveFeeSender 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IGiveFeeSender{
		/**
		 * 赠费
		* @date: 2017-2-22 
		* @author: sunliang 
		* @title: sendGiveFee 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		* 2017-2-27 luogj 增加入参Map<String, Object> inParam, 
		 */
		public void sendGiveFeeMsg(Map<String, Object> inParam, Map<String, Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 赠套餐
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: IGiveProdSender 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IGiveProdSender{
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
		* 2017-2-27 luogj 改名，增加入参Map<String, Object> inParam
		 */
		public void sendGiveProdMsg(Map<String, Object> inParam, Map<String, Object> tempInParam) throws StrategyError;
	}
	
	/**集团事件发送
	* Create on 2017-1-20
	* @author: wangpei
	* @Title:IGroupMsgEventSender
	* @Description：
	* @version 1.0
	* update_data: update_author: update_note:
	*/
	public interface IGroupMsgEventSender{
		/** 发送集团短信
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
		public void sendGroupMsg(Map<String, Object> tempInParam) throws StrategyError;

	}
	
	/**
	 * 实时push发送
	* @date: 2017-2-13 
	* @author: sunliang 
	* @title: IRealTimePushSender 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IRealTimePushSender{
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
		public void sendRealTimeMsg(Map<String, Object> tempInParam) throws StrategyError;
	}
	
	/**
	 * 推荐短信发送
	* @date: 2017-2-27 
	* @author: sunliang 
	* @title: IRecommendMsgSender 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface IRecommendMsgSender{
		
		/**
		 * 
		* @date: 2017-2-27 
		* @author: sunliang 
		* @title: sendRecommendMsg 
		* @param tempInParam
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		* 2017-2-27 luogj 增加入参Map<String, Object> inParam, 
		 */
		public void sendRecommendMsg(Map<String, Object> inParam, Map<String, Object> tempInParam) throws StrategyError;
		
	}
	
	/**
	 * 事件触发发送
	* @date: 2017-2-21 
	* @author: sunyuan
	* @title: ITriggerMsgEventSender 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public interface ITriggerMsgEventSender{
		
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
		public void sendTriggerMsgEvent(Map<String, Object> tempInParam) throws StrategyError;
	}

}
