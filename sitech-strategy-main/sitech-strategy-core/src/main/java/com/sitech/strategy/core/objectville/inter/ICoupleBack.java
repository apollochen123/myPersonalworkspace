package com.sitech.strategy.core.objectville.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 反馈对象
* @date: 2016-9-26 
* @author: wangth
* @Title: IFeedback 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface ICoupleBack {

	/**
	  * 保存受理记录
	 * @date: 2017-2-14 
	 * @author: yexr
	 * @title: saveAcceptRecordInfo 
	 * @param inParam
	 * @throws StrategyError 
	 * @exception: 
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note:
	  */
		public void saveAcceptRecordInfo(Map<String, Object> inParam)throws StrategyError;

	/**
	 * 保存渠道外呼接触信息
	* @date: 2016-10-9 
	* @author: zhaoyue
	* @title: saveChannelCallContactInfo 
	* @param inParam
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveChannelCallContactInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;

	/**
	 * 保存渠道短信接触信息
	* @date: 2016-10-9 
	* @author: zhaoyue
	* @title: saveChannelSMSContactInfo 
	* @param inParam
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveChannelSMSContactInfo(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 保存点击记录
	* @date: 2016-10-9 
	* @author: zhaoyue
	* @title: saveClickRecordInfo 
	* @param inParam
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveClickRecordInfo(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 保存订购资费记录
	* @date: 2017-4-6 
	* @author: zhangyw_crmpd
	* @title: savePostageRecordInfo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void savePostageRecordInfo(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 保存到达量
	* @date: 2016-10-9 
	* @author: zhaoyue
	* @title: savePushArriveInfo 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void savePushArriveInfo(Map<String,Object> tempInParam) throws StrategyError;

	/**
	 * 保存回单记录
	* @date: 2016-10-9 
	* @author: zhaoyue
	* @title: saveReceiptRecordInfo 
	* @param inParam
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveReceiptRecordInfo(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 保存推荐成功量
	* @date: 2016-10-9 
	* @author: zhaoyue
	* @title: saveRecomAcceptRecordInfo 
	* @param inParam
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveRecomAcceptRecordInfo(Map<String,Object> inParam,Map<String,Object> tempInParam);

	/**
	 * 保存短信受理记录
	* @date: 2016-10-9 
	* @author: zhaoyue
	* @title: saveSmsAcceptRecordInfo 
	* @param inParam
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveSmsAcceptRecordInfo(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 保存短信上行信息
	* @date: 2016-10-9 
	* @author: zhaoyue
	* @title: saveSMSPullInfo 
	* @param inParam
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveSMSPullInfo(Map<String,Object> inParam) throws StrategyError;

}
