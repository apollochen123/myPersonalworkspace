package com.sitech.strategy.recommend.entity.param.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.recommend.base.basedto.StandardOutDTO;

/**
 * ParseRecommendService参数处理接口
* @date: 2016-9-14 
* @author: sunliang 
* @title: IParseRecommendParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IParseRecommendParam {
	
	/**
	 * 客户经理任务解析入参处理
	* @date: 2016-10-20 
	* @author: yangwl
	* @title: parseChannelTaskRecommendInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> parseChannelTaskRecommendInParam(InDTO inDTO) throws StrategyError;
	
	/**
	 * 客户经理任务解析出参处理
	* @date: 2016-10-20 
	* @author: yangwl
	* @title: parseChannelTaskRecommendOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO parseChannelTaskRecommendOutParam(Map<String,Object> outParam);
	
	/**
	 * parseRecommendContent入参处理
	* @date: 2016-9-14 
	* @author: sunliang 
	* @title: parseRecommendContentInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> parseRecommendContentInParam(InDTO inDTO) throws StrategyError;
	
	/**
	 * parseRecommendContent出参处理
	* @date: 2016-9-14 
	* @author: sunliang 
	* @title: parseRecommendContentInParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO parseRecommendContentOutParam(Map<String,Object> outParam);

}
