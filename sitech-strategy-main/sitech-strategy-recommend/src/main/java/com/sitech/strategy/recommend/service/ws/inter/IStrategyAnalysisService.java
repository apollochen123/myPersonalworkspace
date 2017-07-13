package com.sitech.strategy.recommend.service.ws.inter;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 营销中心WEBSERVICE服务接口
* @date: 2016年11月16日 
* @author: zhangqia
* @Title: IStrategyAnalysisService 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IStrategyAnalysisService {
	/**
	 * 渠道策略解析服务 对接EBUS平台
	* @date: 2016-11-16 
	* @author: zhangqia
	* @Title: analysisStrategyForEBUS 
	* @param xmlinfo
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	 public String analysisStrategyForEBUS(String xmlinfo) throws StrategyError;
/*		*//**
		 * 渠道策略解析服务 反馈接口
		* @date: 2016-11-16 
		* @author: zhangqia
		* @Title: InfoFeedback 
		* @param xmlinfo
		* @throws StrategyError 
		* @exception:
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 *//*	
	 public String InfoFeedback(String xmlinfo) throws StrategyError;*/
}
