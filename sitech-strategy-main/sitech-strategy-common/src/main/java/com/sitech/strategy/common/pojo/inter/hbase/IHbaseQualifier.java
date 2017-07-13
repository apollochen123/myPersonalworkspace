package com.sitech.strategy.common.pojo.inter.hbase;

import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * hbase qualifier接口
* @date: 2017-1-12 
* @author: sunliang 
* @title: IHbaseTableQualifier 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IHbaseQualifier {
	/** 
	* @date: 2017-1-16 
	* @author: wangpei
	* @title: getBatchPushTaskQualifier 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,String> getBatchPushTaskQualifier(Map<String,Object> tempInParam);

	/** 插入push测试任务字段处理
	* @date: 2017-1-16 
	* @author: wangpei
	* @title: getBatchPushTaskVerifyQualifier 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,String> getBatchPushTaskVerifyQualifier(Map<String,Object> tempInParam);
	/** 插入事件任务字段处理
	* @date: 2017-1-16 
	* @author: wangpei
	* @title: getEventTaskQualifier 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,String> getEventTaskQualifier(Map<String,Object> tempInParam);

	/** 组装hbase渠道任务表字段信息
	* @date: 2017-1-16 
	* @author: wangpei
	* @title: getRmChannelTaskInfoQualifier 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String, String> getRmChannelTaskInfoQualifier(Map<String, Object> tempInParam) throws StrategyError ;
	
	/** 获取批量任务查询限定字段
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: getSelectBatchPushTaskByIdQualifier 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Set<String> getSelectBatchPushTaskByIdQualifier();
	
	/**
	 * 增加用户接触记录表限定符处理
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getAddContactRecordQualifier 
	* @param inParam
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,String> getAddContactRecordQualifier(Map<String,Object> inParam,Map<String,Object> tempInParam);
	
	/**
	 * 
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getInsertRecommendRecordQualifier 
	* @param inParam
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,String> getInsertRecommendRecordQualifier(Map<String,Object> inParam,Map<String,Object> tempInParam);
	
	/**
	 * 
	* @date: 2017-3-31 
	* @author: sunyuan
	* @title: getInsertUserAcceptMarketCaseQualifier 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,String> getInsertUserAcceptMarketCaseQualifier(Map<String,Object> tempInParam);
	
	/**
	 * 
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getInsertUserRecommendControlQualifier 
	* @param inParam
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,String> getInsertUserRecommendControlQualifier(Map<String,Object> inParam,Map<String,Object> tempInParam);
	
	/** 
	* @date: 2017-2-13 
	* @author: wangpei
	* @title: getInsertUserRecommendControlByChannelQualifier 
	* @param inParam
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,String> getInsertUserRecommendControlByChannelQualifier(Map<String,Object> inParam,Map<String,Object> tempInParam);
	
	/**
	 * 
	* @date: 2017-4-10 
	* @author: sunyuan
	* @title: getInsertUserRecommendMarketCaseQualifier 
	* @param inParam
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,String> getInsertUserRecommendMarketCaseQualifier(Map<String,Object> inParam,Map<String,Object> tempInParam);
}
