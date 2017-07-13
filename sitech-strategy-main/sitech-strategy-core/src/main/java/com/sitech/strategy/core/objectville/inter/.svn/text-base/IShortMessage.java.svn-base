package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 短信对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: IShortMessage 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IShortMessage {
	
	/**
	 * 添加短信码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: addShortMessageAccessCode 
	* @param inParam
	* @param tempInParam 
	* @version 1.0 
	* @throws StrategyError 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addShortMessageAccessCode(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 查询短信码列表
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: selectShortMessageAccessCodeList 
	* @param inParam
	* @param queryFilter
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryShortMessageAccessCodeList(Map<String,Object> inParam,IQueryFilter queryFilter)throws StrategyError;
	
	/**
	 * 移除短信接入码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: deleteShortMessageAccessCode 
	* @param inParam 
	* @version 1.0 
	* @throws StrategyError 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeShortMessageAccessCode(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 短信模拟发送
	* @date: 2017-1-12 
	* @author: tangaq
	* @title: sendShortMessageSimulation 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> sendShortMessageSimulation(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 更新短信验证码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: updateShortMessageAccessCode 
	* @param inParam
	* @param tempInParam 
	* @version 1.0 
	* @throws StrategyError 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateShortMessageAccessCode(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
}
