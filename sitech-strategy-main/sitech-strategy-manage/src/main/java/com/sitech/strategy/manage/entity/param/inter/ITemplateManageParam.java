package com.sitech.strategy.manage.entity.param.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;

/**
 * 模板参数处理
* @date: 2016-9-27 
* @author: zhangjj_crmpd
* @title: ITemplateManageParam
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ITemplateManageParam {

	/**
	 * 模板参数处理入参
	* @date: 2016-10-20 
	* @author: zhangjj_crmpd
	* @title: templateInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	Map<String, Object> templateInParam(InDTO inDTO);
	
	/**
	 * 模板列表查询出参
	* @date: 2016-10-20 
	* @author: zhangjj_crmpd
	* @title: templateListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	StandardOutDTO templateListOutParam(Map<String, Object> outParam);
	
	/**
	 * 模板信息查询出参
	* @date: 2016-10-20 
	* @author: zhangjj_crmpd
	* @title: templateInfoOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	StandardOutDTO templateInfoOutParam(Map<String, Object> outParam);

	/**
	 * 移除模板出参处理
	* @date: 2016-11-9 
	* @author: tangaq
	* @title: removeTemplateOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	StandardOutDTO removeTemplateOutParam();

	/**
	 * 保存模板出参处理
	* @date: 2016-11-9 
	* @author: tangaq
	* @title: saveTemplateOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	StandardOutDTO saveTemplateOutParam(Map<String,Object> outParam);
	
	/**
	 * 更新模板出参处理
	* @date: 2016-11-9 
	* @author: tangaq
	* @title: updateTemplateOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	StandardOutDTO updateTemplateOutParam();

}
