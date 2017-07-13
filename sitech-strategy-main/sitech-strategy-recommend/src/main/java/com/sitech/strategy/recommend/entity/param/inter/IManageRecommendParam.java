package com.sitech.strategy.recommend.entity.param.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.recommend.base.basedto.StandardOutDTO;

/**
 * 管理服务参数
* @date: 2016-10-15 
* @author: yangwl
* @title: IManageRecommendParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IManageRecommendParam {

	/**
	 * 解析客户列表入参
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: parseCustListInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> parseCustListInParam(InDTO inDTO) throws StrategyError;
	
	/**
	 * 解析客户列表出参
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: parseCustListOutParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO parseCustListOutParam (Map<String,Object> outParam) throws StrategyError;
	
	/**
	 * 解析营销案列表入参
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: parseMarketCaseListInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> parseMarketCaseListInParam(InDTO inDTO) throws StrategyError;
	
	/**
	 * 解析营销案列表出参
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: parseMarketCaseListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO parseMarketCaseListOutParam(Map<String,Object> outParam);
	
	/**
	 * 解析任务列表入参
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: parseTaskListInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> parseTaskListInParam(InDTO inDTO) throws StrategyError;
	
	/**
	 *  解析任务列表出参
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: parseTaskListOutParam 
	* @param outParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO parseTaskListOutParam (Map<String,Object> outParam) throws StrategyError;
}
