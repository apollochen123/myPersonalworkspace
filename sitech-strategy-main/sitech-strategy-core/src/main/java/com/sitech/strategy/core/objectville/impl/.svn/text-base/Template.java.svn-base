package com.sitech.strategy.core.objectville.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.ITemplate;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 模板对象
* @date: 2016-9-9 
* @author: wangth
* @Title: Template 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class Template extends BaseClass implements ITemplate {
	
	/**
	 * 模板删除对象
	 */
	protected IDataDeleter.ITemplateDeleter templateDeleter;
	/**
	 * 模板插入对象
	 */
	protected IDataInsertor.ITemplateInsertor templateInsertor;
	
	/**
	 * 模板查询对象
	 */
	protected IDataSelector.ITemplateSelector templateSelector;
	/**
	 * 模板更新对象
	 */
	protected IDataUpdater.ITemplateUpdater templateUpdater;
	
	/**
	 * 
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: setTemplateDeleter 
	* @param templateDeleter 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTemplateDeleter(IDataDeleter.ITemplateDeleter templateDeleter) {
		this.templateDeleter = templateDeleter;
	}
	
	/**
	 * 
	* @date: 2016-10-19 
	* @author: zhangjj_crmpd
	* @title: setTemplateInsertor 
	* @param templateInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTemplateInsertor(IDataInsertor.ITemplateInsertor templateInsertor) {
		this.templateInsertor = templateInsertor;
	}

	/**
	 * 
	* @date: 2016-10-19 
	* @author: zhangjj_crmpd
	* @title: setTemplateSelector 
	* @param templateSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTemplateSelector(IDataSelector.ITemplateSelector templateSelector) {
		this.templateSelector = templateSelector;
	}
	

	/**
	 * 
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: setTemplateUpdater 
	* @param templateUpdater 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTemplateUpdater(IDataUpdater.ITemplateUpdater templateUpdater) {
		this.templateUpdater = templateUpdater;
	}

	/**
	 * 查询模板列表
	* @date: 2016-10-20 
	* @author: zhangjj_crmpd
	* @title: queryTemplateList 
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
	@SuppressWarnings("unchecked")
	@Override
	public List<Map<String, Object>> queryTemplateList(
			Map<String, Object> inParam, IQueryFilter queryFilter,
			ISortParamer sortParamer) throws StrategyError {
		if(!CommonUtils.objectIsNull(inParam.get("keyWords"))){
			List<String> keyWords = (List<String>) inParam.get("keyWords");
			queryFilter.setKeyWords(keyWords);
		}
		return templateSelector.selectTemplateList(inParam, queryFilter);
	}
	
	/**
	 * 查询模板信息
	* @date: 2016-10-20 
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
	@Override
	public Map<String, Object> queryTemplateInfo(
			Map<String, Object> inParam, IQueryFilter queryFilter,
			ISortParamer sortParamer) throws StrategyError {
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("templateInfo", templateSelector.selectTemplateInfo(inParam, queryFilter));
		return outMap;
	}
	
	/**
	 * 查询模板关系信息
	* @date: 2016-11-11 
	* @author: tangaq
	* @title: queryTemplateRelationInfo 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryTemplateRelationInfo(
			Map<String, Object> inParam,IQueryFilter queryFilter)  throws StrategyError {
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("relationMap", templateSelector.selectRelationInfo(inParam,queryFilter));
		return outMap;
	}

	/**
	 * 删除模板基本信息
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: deleteTemplate 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeTemplate(Map<String, Object> inParam) throws StrategyError {
		templateDeleter.deleteTemplate(inParam);
	}
	
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
	@Override
	public Map<String,Object> saveTemplate(Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> tempInParam = inParam;//以后可能会有业务处理
		tempInParam.put("templateId", SequenceUtil.getSequence());
		tempInParam.put("operTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));
		templateInsertor.insertTemplate(inParam, tempInParam);
	
		if(Const.TEMPLATE_TYPE_MARKETCASE.equals(inParam.get("templateType"))){
			Map<String,Object> inMap = new HashMap<String,Object>();
			inMap.put("parentComponetType",Const.COMPONENT_TYPE_MARKETCASE);
			inMap.put("componetType",Const.COMPONENT_TYPE_TEMPLATE);
			inMap.put("relId",SequenceUtil.getSequence());
			inMap.put("componentId",tempInParam.get("templateId"));
			inMap.put("parentComponentId",inParam.get("marketCaseId"));
			templateInsertor.insertRelationInfo(inMap);
		}
	
		if(Const.TEMPLATE_TYPE_CUSTGROUP.equals(inParam.get("templateType"))){
		   Map<String,Object> inMap = new HashMap<String,Object>();
		   inMap.put("parentComponetType", Const.COMPONENT_TYPE_CUSTGROUP);
		   inMap.put("componetType", Const.COMPONENT_TYPE_TEMPLATE);
		   inMap.put("relId", SequenceUtil.getSequence());
		   inMap.put("componentId", tempInParam.get("templateId"));
		   inMap.put("parentComponentId", inParam.get("marketCaseId"));
		   inMap.put("parentRelId", inParam.get("custGroupId"));
		   templateInsertor.insertRelationInfo(inMap);
		}
		
		return tempInParam;
	
	}
	
	/**
	 * 更新模板基本信息
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: updateTemplate 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateTemplate(Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> tempInParam = inParam;//以后可能会有业务处理
		tempInParam.put("operTime", new Date());
		templateUpdater.updateTemplate(tempInParam);
	}
	
}
