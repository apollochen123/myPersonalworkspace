package com.sitech.strategy.manage.entity.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.SortParamer;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.ICustGroup;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.objectville.inter.ITemplate;
import com.sitech.strategy.core.pojo.impl.ResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.ITemplateManageEntity;



/**
 * 模板实体
* @date: 2016-10-20 
* @author: zhangjj_crmpd
* @title: TemplateManageEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class TemplateManageEntity extends BaseManageEntity implements ITemplateManageEntity {
	/**
     * 查询列表对象
     */
	protected ResultList resultList;
	
	/**
	 * 营销案模板对象
	 */
	protected ITemplate template;
	
	/**
	 * 
	* @date: 2016-10-10 
	* @author: fangyuan_crmpd
	* @title: setResultList 
	* @param resultList 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setResultList(ResultList resultList) {
		this.resultList = resultList;
	}	
	
	/** 
	 * @date: 2016-9-5 
	 * @author: xiongxq
	 * @title: setTemplate 
	 * @param template the template to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setTemplate(ITemplate template) {
		this.template = template;
	}

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
	@Override
	public Map<String, Object> queryTemplateInfo(Map<String, Object> inParam)
			throws StrategyError {
		QueryFilter queryFilter = settleTemplateQueryFilter(inParam);
		Map<String,Object> relationMap = new HashMap<String,Object>();
		if(Const.TEMPLATE_TYPE_MARKETCASE.equals(inParam.get("templateType"))){
			relationMap=template.queryTemplateRelationInfo(inParam, queryFilter);
		}
		if(Const.TEMPLATE_TYPE_CUSTGROUP.equals(inParam.get("templateType"))){
			relationMap = template.queryTemplateRelationInfo(inParam, queryFilter);
		}
		Map<String,Object> templateMap = template.queryTemplateInfo(inParam, queryFilter, null);
		templateMap.put("relationMap",relationMap.get("relationMap")==null?new HashMap<String,Object>():relationMap.get("relationMap"));
		
		return templateMap;
	}

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
	@Override
	public Map<String, Object> queryTemplateList(
			Map<String, Object> inParam) throws StrategyError {
		QueryFilter queryFilter = settleTemplateQueryFilter(inParam);
		IPagingDevice pagingDevice = new PagingDevice();
		ISortParamer sortParamer = new SortParamer();
		/*Map<String, Object> outMap = new HashMap<String, Object>();
		outMap.put("templateList", template.queryTemplateList(inParam, queryFilter, null));*/
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice.getInstance(inParam));
		Map<String,Object> outParam = this.getTemplateListByPagingDevice(pagingDeviceTmp);
		return outParam;
	}
	
	/**
	 * 移除模板列表
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: removeTemplate 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeTemplate(Map<String, Object> inParam)
			throws StrategyError {
		template.removeTemplate(inParam);
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
		return template.saveTemplate(inParam);
		
	}

	/**
	 * 更新模板列表
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: updateTemplate 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateTemplate(Map<String, Object> inParam)
			throws StrategyError {
		template.updateTemplate(inParam);
	}
	
	/**
	 * 处理查询模板参数
	* @date: 2016-10-20 
	* @author: zhangjj_crmpd
	* @title: settleTemplateQueryFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected QueryFilter settleTemplateQueryFilter(Map<String, Object> inParam) {
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setTemplateId(inParam.get("templateId").toString());
		queryFilter.setTemplateName(inParam.get("templateName").toString());
		queryFilter.setComponentId(inParam.get("templateId").toString());
		queryFilter.setTemplateType(inParam.get("templateType").toString());
		return queryFilter;
	}

	/**
	 * 将对象PagingDevice中数据放到Map中
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: getShortMessageAccessCodeListByPagingDevice 
	* @param pagingDeviceTmp
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getTemplateListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("templateList", pagingDeviceTmp.getPerPageInfo());
		outMap.put("queryId", pagingDeviceTmp.getQueryId());
		return outMap;
	}
}