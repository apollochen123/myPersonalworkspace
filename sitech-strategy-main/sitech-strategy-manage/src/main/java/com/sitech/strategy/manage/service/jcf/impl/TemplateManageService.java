package com.sitech.strategy.manage.service.jcf.impl;

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
import com.sitech.strategy.manage.entity.inter.ITemplateManageEntity;
import com.sitech.strategy.manage.entity.param.inter.ITemplateManageParam;
import com.sitech.strategy.manage.service.jcf.inter.ITemplateManageService;



@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "saveTemplate", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryTemplateInfo", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryTemplateList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeTemplate", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateTemplate", oc = StandardOutDTO.class)
})
/**
 * 模板
* @date: 2016-10-6 
* @author: zhangjj_crmpd
* @title: TemplateManageService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class TemplateManageService extends BaseManageService implements ITemplateManageService{
	
	protected ITemplateManageEntity templateManageEntity;
	
	protected ITemplateManageParam templateManageParam;
	
	/**
	 * 
	* @date: 2016-10-20 
	* @author: zhangjj_crmpd
	* @title: setTemplateManageEntity 
	* @param templateManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTemplateManageEntity(ITemplateManageEntity templateManageEntity) {
		this.templateManageEntity = templateManageEntity;
	}

	/**
	 * 
	* @date: 2016-10-20 
	* @author: zhangjj_crmpd
	* @title: setTemplateManageParam 
	* @param templateManageParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTemplateManageParam(ITemplateManageParam templateManageParam) {
		this.templateManageParam = templateManageParam;
	}

	/**
	 * 添加模板
	* @date: 2016-10-20 
	* @author: zhangjj_crmpd
	* @title: saveTemplate 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveTemplate(InDTO inDTO) {
		
		StandardOutDTO out = new StandardOutDTO();
		
		try {
		
			Map<String,Object> inParam = templateManageParam.templateInParam(inDTO);
			Map<String,Object> outParam = templateManageEntity.saveTemplate(inParam);
			out = templateManageParam.saveTemplateOutParam(outParam); 
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return out;
	}

	/**
	 * 查询模板信息
	* @date: 2016-10-20 
	* @author: zhangjj_crmpd
	* @title: queryTemplateInfo 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryTemplateInfo(InDTO inDTO) {
	
		StandardOutDTO out = new StandardOutDTO();
	
		try {
		
			Map<String,Object> inParam = templateManageParam.templateInParam(inDTO);
			Map<String,Object> outMap = templateManageEntity.queryTemplateInfo(inParam);
			out = templateManageParam.templateInfoOutParam(outMap);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
	
		return out;
	}

	/**
	 * 查询模板列表
	* @date: 2016-10-20 
	* @author: zhangjj_crmpd
	* @title: queryTemplateList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryTemplateList(InDTO inDTO) {
		
		StandardOutDTO out = new StandardOutDTO();
		try {
			
			Map<String,Object> inParam = templateManageParam.templateInParam(inDTO);
			Map<String,Object> outMap = templateManageEntity.queryTemplateList(inParam);
			out = templateManageParam.templateListOutParam(outMap);
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
	
		return out;
	}
	
	/**
	 * 移除模板信息
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: removeTemplate 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeTemplate(InDTO inDTO) {
		
		StandardOutDTO out = new StandardOutDTO();
		
		try {
		
			Map<String,Object> inParam = templateManageParam.templateInParam(inDTO);
			templateManageEntity.removeTemplate(inParam);
	        out = templateManageParam.removeTemplateOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}

		return out;
	}
	
	/**
	 * 更新模板信息
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: updateTemplate 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO updateTemplate(InDTO inDTO) {
		
		StandardOutDTO out = new StandardOutDTO();
		
		try {
	
			Map<String,Object> inParam = templateManageParam.templateInParam(inDTO);
			templateManageEntity.updateTemplate(inParam);
    		out = templateManageParam.updateTemplateOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
	
		return out;
	}
	
}
