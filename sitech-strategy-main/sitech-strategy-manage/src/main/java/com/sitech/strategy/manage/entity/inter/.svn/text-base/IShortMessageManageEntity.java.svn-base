package com.sitech.strategy.manage.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 短信实体
* @date: 2016-9-5 
* @author: sunliang
* @title: IShortMessageManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IShortMessageManageEntity {
	
	/**
	 * 根据工号查询接入码列表
	* @date: 2016-10-18 
	* @author: xiongxq
	* @Title: queryAccessCodeListByLoginNo 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryAccessCodeListByLoginNo(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询短信接入码列表
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryAccessCodeList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryShortMessageAccessCodeList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 根据日期查询短信推送流量
	* @date: 2016-10-30 
	* @author: fangyuan_crmpd
	* @title: queryShortMsgMoveTrafficByDate 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryShortMsgMoveTrafficByDate(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 根据营销案ID查询短信推送流量
	* @date: 2016-10-30 
	* @author: fangyuan_crmpd
	* @title: queryShortMsgMoveTrafficByMarketCaseId 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryShortMsgMoveTrafficByMarketCaseId(Map<String,Object> inParam) throws StrategyError;
	
	
	/**
	 * 根据工号删除接入码
	* @date: 2016-10-28 
	* @author: xiongxq
	* @Title: removeAccessCodeByLoginNo 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeAccessCodeByLoginNo(Map<String,Object> inParam)throws StrategyError;
	
	/**
	 * 移除短信接入码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: removeShortMessageAccessCode 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> removeShortMessageAccessCode(Map<String,Object> inParam)throws StrategyError;
	
	/**
	 * 给某个工号添加接入码
	* @date: 2016-10-28 
	* @author: xiongxq
	* @Title: saveAccessCodeForLoginNo 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveAccessCodeForLoginNo(Map<String,Object> inParam)throws StrategyError;
	
	/**
	 * 保存短信接入码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: saveShortMessageAccessCode 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> saveShortMessageAccessCode(Map<String,Object> inParam) throws StrategyError; 
	
	/**
	 * 短信模拟发送
	* @date: 2017-1-9 
	* @author: tangaq
	* @title: sendShortMessageSimulation 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> sendShortMessageSimulation(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 更新短信接入码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: updateShortMessageAccessCode 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> updateShortMessageAccessCode(Map<String,Object> inParam) throws StrategyError;
}
