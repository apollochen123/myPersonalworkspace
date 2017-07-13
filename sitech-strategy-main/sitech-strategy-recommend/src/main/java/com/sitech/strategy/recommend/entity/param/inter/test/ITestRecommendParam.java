package com.sitech.strategy.recommend.entity.param.inter.test;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.recommend.base.basedto.StandardOutDTO;

/**
 * 测试服务参数类
* @date: 2016-11-20 
* @author: sunliang 
* @title: ITestRecommendParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ITestRecommendParam {
	
	/**
	 * testRecommendService入参转换
	* @date: 2016-11-20 
	* @author: sunliang 
	* @title: testRecommendServiceInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> testRecommendServiceInParam(InDTO inDTO) throws StrategyError;
	
	/**
	 * testRecommendService出参转换
	* @date: 2016-11-20 
	* @author: sunliang 
	* @title: parseCustListOutParam 
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO testRecommendServiceOutParam () throws StrategyError;
	

}
