package com.sitech.strategy.recommend.service.ws.impl;


import java.util.Map;

import com.sitech.strategy.common.utils.WSUtil;
import com.sitech.strategy.recommend.entity.inter.IParseRecommendEntity;
import com.sitech.strategy.recommend.entity.param.inter.IStrategyAnalysisParam;
import com.sitech.strategy.recommend.service.ws.inter.IStrategyAnalysisService;
/**
 * 营销中心WEBSERVICE服务实现类
* @date: 2016年11月16日 
* @author: zhangqia
* @Title: StrategyAnalysisService 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class StrategyAnalysisService implements IStrategyAnalysisService {

	/**
	 * 推荐实体
	 */
	protected IParseRecommendEntity parseRecommendEntity;
	/**
	 * strategyAnalysisParam对象
	 */
	protected IStrategyAnalysisParam strategyAnalysisParam;
	
	/**
	 * 
	* @date: 2016-11-24 
	* @author: zhangqia 
	* @title: setParseRecommendEntity 
	* @param parseEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setParseRecommendEntity(IParseRecommendEntity parseRecommendEntity) {
		this.parseRecommendEntity = parseRecommendEntity;
	}
	
	/**
	 * 
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: setStrategyAnalysisParam 
	* @param strategyAnalysisParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setStrategyAnalysisParam(
			IStrategyAnalysisParam strategyAnalysisParam) {
		this.strategyAnalysisParam = strategyAnalysisParam;
	}
	
	/**
	 * 渠道策略解析服务 对接EBUS平台DEMO
	* @date: 2016-11-16 
	* @author: zhangqia
	* @Title: analysisStrategyForEBUS 
	* @param xml
	* @throws  
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String analysisStrategyForEBUS(String xmlStr){
		try{
			Map<String,Object> inParam = strategyAnalysisParam.analysisStrategyForEBUSInParam(xmlStr);
			Map<String,Object> outParam = parseRecommendEntity.parseChannelTriggerRecommend(inParam);
			return strategyAnalysisParam.analysisStrategyForEBUSOutParam(outParam,inParam);
		}catch(Exception e){
			return WSUtil.parameter_Illegal;
		}
	}
/*	*//**
	 * 渠道策略解析服务 反馈接口
	* @date: 2016-2-8 
	* @author: zhangqia
	* @Title: InfoFeedback 
	* @param xml
	* @throws  
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	@Override
	public String InfoFeedback(String xmlStr){
		try{
			Map<String,Object> inParam = strategyAnalysisParam.infoFeedbackInParam(xmlStr);
			Map<String,Object> outParam = parseRecommendEntity.channelTriggerRecommendFeedback(inParam);
			return strategyAnalysisParam.infoFeedbackOutParam(outParam,inParam);
		}catch(Exception e){
			return WSUtil.parameter_Illegal;
		}
	}*/
	
}
