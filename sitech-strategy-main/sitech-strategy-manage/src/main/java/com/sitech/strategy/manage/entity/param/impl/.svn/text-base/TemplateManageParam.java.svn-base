package com.sitech.strategy.manage.entity.param.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.ITemplateManageParam;

/**
 * 模板参数处理
* @date: 2016-10-6 
* @author: zhangjj_crmpd
* @title: TemplateManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class TemplateManageParam  extends BaseManageEntity  implements
		ITemplateManageParam {

	
	
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
	@Override
	public StandardOutDTO removeTemplateOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}

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
	@Override
	public StandardOutDTO saveTemplateOutParam(Map<String,Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("TEMPLATE_ID", outParam.get("templateId"));
		MBean outBean = new MBean();
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}

	/**
	 * 模板入参处理
	* @date: 2016-10-22 
	* @author: zhangjj_crmpd
	* @title: templateInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> templateInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> basic = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_TEMPLATE);
		outMap.put("sortFlag", basic.get("SORT_FLAG"));
		outMap.put("sortField", basic.get("SORT_FIELD"));
		outMap.put("queryId", basic.get("QUERY_ID"));
		outMap.put("currentPageCode", basic.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", basic.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", basic.get("TOTAL_RECORD_COUNT"));
		
		outMap.put("templateId", basic.get("TEMPLATE_ID")==null?"":basic.get("TEMPLATE_ID"));
		outMap.put("templateType",basic.get("TEMPLATE_TYPE")==null?"":basic.get("TEMPLATE_TYPE"));
		outMap.put("templateName", basic.get("TEMPLATE_NAME")==null?"":basic.get("TEMPLATE_NAME"));
		outMap.put("templateDesc", basic.get("TEMPLATE_DESC")==null?"":basic.get("TEMPLATE_DESC"));
		outMap.put("operNo", basic.get("OPER_NO")==null?"":basic.get("OPER_NO"));
		outMap.put("templateContent", basic.get("TEMPLATE_CONTENT")==null?"":basic.get("TEMPLATE_CONTENT").toString().replaceAll("null", "").replaceAll("undefined", ""));
		outMap.put("outMap", basic.get("outMap") == null?"":basic.get("outMap"));
		outMap.put("operName", basic.get("OPER_NAME")== null?"":basic.get("OPER_NAME").toString().replaceAll("null", "").replaceAll("undefined", ""));
		outMap.put("keyWords", basic.get("KEY_WORDS")== null?"":basic.get("KEY_WORDS"));
		outMap.put("marketCaseId",basic.get("MARKET_CASE_ID") == null?"":basic.get("MARKET_CASE_ID"));
		outMap.put("custGroupId", basic.get("CUST_GROUP_ID") == null?"":basic.get("CUST_GROUP_ID"));

		return outMap;
	}

	/**
	 * 模板列表出参
	* @date: 2016-10-22 
	* @author: zhangjj_crmpd
	* @title: templateListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO templateListOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		
		List<Map<String,Object>> templateNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> templateList = (List<Map<String, Object>>) outParam.get("templateList");
		
		
		if(!CommonUtils.objectIsNull(templateList)){
		  for(Map<String,Object> basic:templateList){
		    Map<String,Object> templateMap = new HashMap<String,Object>();
		    templateMap.put("TEMPLATE_ID", basic.get("templateId"));
		    templateMap.put("TEMPLATE_TYPE", basic.get("templateType"));
		    templateMap.put("TEMPLATE_NAME", basic.get("templateName"));
		    templateMap.put("OPER_NO", basic.get("operNo"));
		    templateMap.put("OPER_TIME", basic.get("operTime"));
		    templateMap.put("TEMPLATE_CONTENT", basic.get("templateContent"));
		    templateMap.put("TEMPLATE_DESC", basic.get("templateDesc"));
		    templateMap.put("OPER_NAME", basic.get("operName"));
			templateNewList.add(templateMap);
		
		   }
		}
		
		outMap.put("TEMPLATE_LIST", templateNewList);
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 模板信息出参
	* @date: 2016-10-22 
	* @author: zhangjj_crmpd
	* @title: templateInfoOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO templateInfoOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
        Map<String,Object> outMap = new HashMap<String,Object>();
        Map<String,Object> templateMap = (Map<String,Object>)outParam.get("templateInfo");
        Map<String,Object> relationMap = (Map<String,Object>)outParam.get("relationMap");
        outMap.put("MARKET_CASE_ID",relationMap.get("parentComponentId"));
        outMap.put("CUST_GROUP_ID", relationMap.get("parentRelId"));
        if(CommonUtils.objectIsNull(templateMap)==false){
	        outMap.put("TEMPLATE_ID",templateMap.get("templateId"));
	        outMap.put("TEMPLATE_TYPE",templateMap.get("templateType"));
	        outMap.put("TEMPLATE_NAME",templateMap.get("templateName"));
	        outMap.put("OPER_NO",templateMap.get("operNo"));
	        outMap.put("OPER_TIME",templateMap.get("operTime"));
	        outMap.put("TEMPLATE_CONTENT",templateMap.get("templateContent"));
	        outMap.put("TEMPLATE_DESC",templateMap.get("templateDesc"));
	        outMap.put("OPER_NAME",templateMap.get("operName"));
        }
        outBean.setBody(outMap);
        standardOutDTO.setBean(outBean);
        return standardOutDTO;
	}

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
	@Override
	public StandardOutDTO updateTemplateOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
}

