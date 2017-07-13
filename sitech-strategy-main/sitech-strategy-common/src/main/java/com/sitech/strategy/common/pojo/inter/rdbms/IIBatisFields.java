package com.sitech.strategy.common.pojo.inter.rdbms;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**关系型数据库限定符处理
 * Create on 2017-2-27
 * @author: wangpei
 * @Title:IIBatisQualifier
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public interface IIBatisFields {
	
	/** 组装渠道任务字段
	* @date: 2017-2-27 
	* @author: wangpei
	* @title: getRmChannelTaskInfoFields 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String, Object> getRmChannelTaskInfoFields(Map<String, Object> tempInParam) throws StrategyError ;

}
