package com.sitech.strategy.recommend.service.jcf.impl.test;

import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.recommend.base.BaseRecommendService;
import com.sitech.strategy.recommend.base.basedto.StandardInDTO;
import com.sitech.strategy.recommend.base.basedto.StandardOutDTO;
import com.sitech.strategy.recommend.entity.inter.test.ITestRecommendEntity;
import com.sitech.strategy.recommend.entity.param.inter.test.ITestRecommendParam;
import com.sitech.strategy.recommend.service.jcf.inter.test.ITestRecommendService;

/**
 * 推荐中心测试服务
* @date: 2016-11-20 
* @author: sunliang 
* @title: TestRecommendService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "testRecommendService", oc = StandardOutDTO.class)
})
public class TestRecommendService extends BaseRecommendService implements
		ITestRecommendService {

	/**
	 * 测试对象
	 */
	protected ITestRecommendEntity testRecommendEntity;
	/**
	 * 测试对象参数对象
	 */
	protected ITestRecommendParam testRecommendParam;
	
	/**
	 * 
	* @date: 2016-11-20 
	* @author: sunliang 
	* @title: setTestRecommendEntity 
	* @param testRecommendEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTestRecommendEntity(ITestRecommendEntity testRecommendEntity) {
		this.testRecommendEntity = testRecommendEntity;
	}
	
	/**
	 * 
	* @date: 2016-11-20 
	* @author: sunliang 
	* @title: setTestRecommendParam 
	* @param testRecommendParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTestRecommendParam(ITestRecommendParam testRecommendParam) {
		this.testRecommendParam = testRecommendParam;
	}

	/**
	 * 测试方法
	* @date: 2016-11-20 
	* @author: sunliang 
	* @title: testRecommendService 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO testRecommendService(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = testRecommendParam.testRecommendServiceInParam(inDTO);
			testRecommendEntity.testRecommendEntity(inParam);
			standardOutDTO = testRecommendParam.testRecommendServiceOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;	
	}

}
