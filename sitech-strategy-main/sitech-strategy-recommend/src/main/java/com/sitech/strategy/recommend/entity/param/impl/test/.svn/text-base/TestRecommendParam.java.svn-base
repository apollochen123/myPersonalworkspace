package com.sitech.strategy.recommend.entity.param.impl.test;

import java.util.HashMap;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.recommend.base.BaseRecommendEntity;
import com.sitech.strategy.recommend.base.basedto.StandardOutDTO;
import com.sitech.strategy.recommend.entity.param.inter.test.ITestRecommendParam;

/**
 * 测试服务参数转换类
* @date: 2016-11-20 
* @author: sunliang 
* @title: TestRecommendParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class TestRecommendParam extends BaseRecommendEntity implements
		ITestRecommendParam {

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
	@Override
	public Map<String, Object> testRecommendServiceInParam(InDTO inDTO)
			throws StrategyError {
		
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put(Const.NOSQL_ROWKEY,inMap.get("rowkey"));
		outMap.put("test1",inMap.get("test1"));
		outMap.put("test2",inMap.get("test2"));
		return outMap;
		
	}

	/**
	 * testRecommendService出参转换
	* @date: 2016-11-20 
	* @author: sunliang 
	* @title: testRecommendServiceOutParam 
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO testRecommendServiceOutParam() throws StrategyError {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}

}
