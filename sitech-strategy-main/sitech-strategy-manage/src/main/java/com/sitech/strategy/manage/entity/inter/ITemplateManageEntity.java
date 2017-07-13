package com.sitech.strategy.manage.entity.inter;

import java.util.List;
import java.util.Map;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 模板实体
* @date: 2016-10-20 
* @author: zhangjj_crmpd
* @title: ITemplateManageEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ITemplateManageEntity {
	
	/**
	 * 查询模板信息
	* @date: 2016-10-20 
	* @author: zhangjj_crmpd
	* @title: queryTemplateInfo 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryTemplateInfo(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 查询模板列表
	* @date: 2016-10-20 
	* @author: zhangjj_crmpd
	* @title: queryTemplateList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryTemplateList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 移除模板信息
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: removeTemplate 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeTemplate(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 添加模板
	* @date: 2016-10-20 
	* @author: zhangjj_crmpd
	* @title: saveTemplate 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveTemplate(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 更新模板信息
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: updateTemplate 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateTemplate(Map<String,Object> inParam) throws StrategyError;
}
