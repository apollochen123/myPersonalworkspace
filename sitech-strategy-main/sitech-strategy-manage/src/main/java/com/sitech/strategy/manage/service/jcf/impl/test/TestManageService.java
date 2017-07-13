package com.sitech.strategy.manage.service.jcf.impl.test;

import java.util.HashMap;
import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageService;
import com.sitech.strategy.manage.base.basedto.StandardInDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.inter.test.ITestManageEntity;
import com.sitech.strategy.manage.service.jcf.inter.test.ITestManageService;

/**
 * 测试服务
* @date: 2016-9-5 
* @author: tangaq
* @title: TestManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "testManageService", oc = StandardOutDTO.class)
})
public class TestManageService extends BaseManageService implements ITestManageService{
	
	/**
	 * 测试对象
	 */
	protected ITestManageEntity testManageEntity;

	/**
	 * 
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: setTestManageEntity 
	* @param testManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTestManageEntity(ITestManageEntity testManageEntity) {
		this.testManageEntity = testManageEntity;
	}

	/**
	 * 测试
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: testManageService 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO testManageService(InDTO inDTO) {
		StandardOutDTO sod = new StandardOutDTO();
		MBean bean = new MBean();
		MBean inBean = inDTO.getMbean();
		try {
			testManageEntity.testManageEntity(this.testManageServiceInParam(inDTO));
		} catch (StrategyError e) {
			e.processExcepByJCF();
			e.printStackTrace();
		}
		bean.setBody("RETURN_MSG", inBean.getBodyStr("param2"));
		sod.setBean(bean);
		return sod;
	}
	
	/**
	 * 参数转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: testManageServiceInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> testManageServiceInParam(InDTO inDTO) {
		Map<String,Object> inParam = new HashMap<String,Object>();
		MBean bean = inDTO.getMbean();
		
		System.out.println("bean.getBodyStr(prod1)" + bean.getBodyStr("prod1"));
		System.out.println("bean.getBodyStr(prod2)" + bean.getBodyStr("prod2"));
		
		final String prod1 = bean.getBodyStr("prod1");
		final String prod2 = bean.getBodyStr("prod2");
		
		inParam.put("prod1", prod1);
		inParam.put("prod2", prod2);
		
		return inParam;
	}

}
