package com.sitech.strategy.common.pojo.inter.assemblymsgstructure;

import java.util.Map;

/**
 * 组装消息结构
* @date: 2016-12-25 
* @author: sunliang 
* @title: IAssemblyMsgStructure 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IAssemblyMsgStructure {

	/**
	 * 获取批量push业务消息结构
	* @date: 2016-12-25 
	* @author: sunliang 
	* @title: getBatchPushMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> getBatchPushMsgStructure(Map<String,Object> tempInParam);
	
	/**  获取渠道任务推送消息结构
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: getChannelTaskMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> getChannelTaskMsgStructure(Map<String,Object> tempInParam);
	
	/** 获取渠道任务关闭推送消息结构
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: getChannelTaskCloseMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> getChannelTaskCloseMsgStructure(Map<String,Object> tempInParam);
	/** 获取渠道任务通知短信消息结构
	* @date: 2017-3-10 
	* @author: wangpei
	* @title: getChannelTaskNoticeMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> getChannelTaskNoticeMsgStructure(Map<String,Object> tempInParam);

	/** 获取集团短信消息结构
	* @date: 2017-1-20 
	* @author: wangpei
	* @title: getGroupMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String, Object> getGroupMsgStructure(Map<String, Object> tempInParam);
	
	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: getSendGiveFeeMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-27 luogj 增加入参Map<String, Object> inParam, 
	 */
	public String getSendGiveFeeMsgStructure(Map<String, Object> inParam, Map<String,Object> tempInParam);
	
	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: getSendGiveProdMsgStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-27 luogj 改名，增加入参Map<String, Object> inParam
	 */
	public String getSendGiveProdMsgStructure(Map<String, Object> inParam, Map<String,Object> tempInParam);
	
	/**
	 * 获取发送推荐短信消息结构
	* @date: 2017-2-27 
	* @author: sunliang 
	* @title: getSendRecommendMsgStructure 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-2-27 luogj 增加入参Map<String, Object> inParam, 
	 */
	public String getSendRecommendMsgStructure(Map<String, Object> inParam, Map<String,Object> tempInParam);
	
	/**
	 * 获取事件触发推送消息结构
	* @date: 2017-2-21 
	* @author: sunyuan
	* @title: getSendTriggerMsgEventStructure 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> getSendTriggerMsgEventStructure(Map<String,Object> tempInParam);
	
}
