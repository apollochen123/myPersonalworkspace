package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 模板对象
* @date: 2016-9-9 
* @author: wangth
* @Title: ITemplate 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface ITemplate {
	
	/**
	 * 查询模板列表
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryTemplateList 
	* @param queryFilter
	* @param sortParamer
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author:zhangjj_crmpd update_note:
	 */
	public List<Map<String,Object>> queryTemplateList(Map<String,Object> inParam,IQueryFilter queryFilter, ISortParamer sortParamer) throws StrategyError;
	
	/**
	 * 查询模板信息
	* @date: 2016-10-19 
	* @author: zhangjj_crmpd
	* @title: queryTemplateInfo 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryTemplateInfo(Map<String,Object> inParam,IQueryFilter queryFilter, ISortParamer sortParamer) throws StrategyError;
	
	/**
	 * 查询模板关系信息
	* @date: 2016-11-11 
	* @author: tangaq
	* @title: queryTemplateRelationInfo 
	* @param inParam
	* @param queryFilter
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryTemplateRelationInfo(Map<String,Object> inParam,IQueryFilter queryFilter)  throws StrategyError ;
	
	/**
	 * 删除模板
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: deleteTemplate 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeTemplate(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 添加模板
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: saveTemplate 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author:zhangjj_crmpd update_note:
	 */
	public Map<String,Object> saveTemplate(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 更新模板信息
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: updateTemplate 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateTemplate(Map<String,Object> inParam) throws StrategyError;
}
