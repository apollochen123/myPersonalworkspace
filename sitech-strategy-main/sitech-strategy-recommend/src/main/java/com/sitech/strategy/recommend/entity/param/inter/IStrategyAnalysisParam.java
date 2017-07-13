package com.sitech.strategy.recommend.entity.param.inter;

import java.util.Map;

/**
 * 
* @date: 2017-2-7 
* @author: sunliang 
* @title: IStrategyAnalysisParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IStrategyAnalysisParam {
	
	/**
	 * 
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: analysisStrategyForEBUSInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> analysisStrategyForEBUSInParam(String xmlStr);
	/**
	 * 
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: InfoFeedbackInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> infoFeedbackInParam(String xmlStr);
	/**
	 * 
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: analysisStrategyForEBUSOutParam 
	* @param outParam
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String analysisStrategyForEBUSOutParam(Map<String,Object> outParam,Map<String,Object> inParam);
	/**
	 * 
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: infoFeedbackOutParam 
	* @param outParam
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String infoFeedbackOutParam(Map<String,Object> outParam,Map<String,Object> inParam);

}
