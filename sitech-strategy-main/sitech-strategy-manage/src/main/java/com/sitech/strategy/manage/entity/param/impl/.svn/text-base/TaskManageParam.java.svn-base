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
import com.sitech.strategy.manage.entity.param.inter.ITaskManageParam;
import com.sitech.strategy.manage.entity.param.inter.ITemplateManageParam;

/**
 * 
* @date: 2016-12-14 
* @author: zhangjj_crmpd
* @title: TaskManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class TaskManageParam  extends BaseManageEntity  implements
		ITaskManageParam {
	
	/**
	 * 查询营业部任务概况入参处理
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: queryDepartmentTaskSurveyInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryDepartmentTaskSurveyInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> basic = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("operNo", CommonUtils.toString(basic.get("OPER_NO")));
		outMap.put("groupCode", CommonUtils.toString(basic.get("GROUP_CODE")));
		return outMap;
	}

	/**
	 * 查询营业部任务概况出参处理
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: queryDepartmentTaskSurveyOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryDepartmentTaskSurveyOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		
		List<Map<String,Object>> taskNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> taskList = (List<Map<String, Object>>) outParam.get("taskList");
	
		if(!CommonUtils.objectIsNull(taskList)){
			for(Map<String,Object> taskMap:taskList){
				Map<String,Object> newMap = new HashMap<String,Object>();
				newMap.put("SERVICE_NAME", taskMap.get("serviceName"));
				newMap.put("TOTAL_NUM", taskMap.get("totalNum"));
				newMap.put("EXIST_NUM", taskMap.get("existNum"));
				newMap.put("COUNT_NUM", taskMap.get("countNum"));
				newMap.put("SERVICE_NO", taskMap.get("serviceNo"));
				taskNewList.add(newMap);
			}
		}
		outMap.put("TASK_LIST", taskNewList);
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 调配任务入参处理
	* @date: 2016-12-19 
	* @author: zhangjj_crmpd
	* @title: saveTaskAdjustInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveTaskAdjustInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String,Object> body = bean.getBody();
		Map<String,Object> outMap = new HashMap<String, Object>();
		outMap.put("taskadjustType", body.get("TASKADJUST_TYPE"));
		outMap.put("taskadjustContent", body.get("TASKADJUST_CONTENT"));
		outMap.put("taskadjustCondition", body.get("TASKADJUST_CONDITION"));
		outMap.put("ruleList", handleTaskAdjustRuleListInParam(body,outMap));
		return outMap;
	}
	
	/**
	 * 调配任务出参处理
	* @date: 2016-12-20 
	* @author: zhangjj_crmpd
	* @title: saveTaskAdjustOutParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveTaskAdjustOutParam(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		Map<String,Object> outMap = new HashMap<String,Object>();
		MBean outBean = new MBean();
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;	
	}
	
	/**
	 * 任务调配查询入参
	* @date: 2017-1-9 
	* @author: zhangjj_crmpd
	* @title: taskAdjustInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> taskAdjustInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> basic = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("taskIds", CommonUtils.toString(basic.get("TASKIDS")));
		return outMap;
	}
	
	/**
	 * 任务调配查询出参
	* @date: 2017-1-9 
	* @author: zhangjj_crmpd
	* @title: taskAdjustListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO taskAdjustListOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		
		List<Map<String,Object>> taskNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> taskAdjustList = (List<Map<String, Object>>) outParam.get("taskAdjustList");
		
		
		if(!CommonUtils.objectIsNull(taskAdjustList)){
		  for(Map<String,Object> taskAdjust:taskAdjustList){
		    Map<String,Object> taskMap = new HashMap<String,Object>();
		    taskMap.put("task_ID", taskAdjust.get("taskId"));
		    taskMap.put("ACT_ID", taskAdjust.get("actId"));
		    taskMap.put("ACT_NAME", taskAdjust.get("actName"));
		    taskMap.put("CUST_NAME", taskAdjust.get("custName"));
		    taskMap.put("CUST_ID", taskAdjust.get("custId"));
		    taskMap.put("CHANNEL_ID", taskAdjust.get("channelId"));
		    taskMap.put("CHANNEL_NAME", taskAdjust.get("channelName"));
		    taskMap.put("REGION_CODE", taskAdjust.get("regionCode"));
		    taskMap.put("REGION_NAME", taskAdjust.get("regionName"));
		    taskMap.put("SERVICE_NBR", taskAdjust.get("serviceNbr"));
		    taskMap.put("START_DATE", taskAdjust.get("startDate"));
		    taskMap.put("END_DATE", taskAdjust.get("endDate"));
		    taskMap.put("GRID_NAME", taskAdjust.get("gridName"));
		    taskMap.put("SERVICE_NO", taskAdjust.get("serviceNo"));
		    taskMap.put("SERVICE_NAME", taskAdjust.get("serviceName"));
			taskNewList.add(taskMap);
		
		   }
		}
		
		outMap.put("task_LIST", taskNewList);
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("total") == null?0:outParam.get("total"));
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 任务参数处理入参
	* @date: 2016-12-15 
	* @author: zhangjj_crmpd
	* @title: taskInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> taskInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> basic = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", basic.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", basic.get("PER_RECORD_COUNT"));
		
		outMap.put("channelId", CommonUtils.toString(basic.get("CHANNEL_ID")));
		outMap.put("regionCode",CommonUtils.toString(basic.get("REGION_CODE")));
		outMap.put("startDate", CommonUtils.toString(basic.get("START_DATE")));
		outMap.put("endDate", CommonUtils.toString(basic.get("END_DATE")));
		outMap.put("marketCaseId", CommonUtils.toString(basic.get("MARKET_CASE_ID")));
		outMap.put("serviceNo", CommonUtils.toString(basic.get("SERVICE_NO")));
		outMap.put("statusCode", CommonUtils.toString(basic.get("STATUS_CODE")));

		return outMap;
	}

	/**
	 * 任务列表查询出参
	* @date: 2016-12-15 
	* @author: zhangjj_crmpd
	* @title: taskListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO taskListOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		
		List<Map<String,Object>> taskNewList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		List<Map<String,Object>> taskList = (List<Map<String, Object>>) outParam.get("taskList");
		
		
		if(!CommonUtils.objectIsNull(taskList)){
		  for(Map<String,Object> basic:taskList){
		    Map<String,Object> taskMap = new HashMap<String,Object>();
		    taskMap.put("task_ID", basic.get("taskId"));
		    taskMap.put("ACT_ID", basic.get("actId"));
		    taskMap.put("ACT_NAME", basic.get("actName"));
		    taskMap.put("CUST_NAME", basic.get("custName"));
		    taskMap.put("CUST_ID", basic.get("custId"));
		    taskMap.put("CHANNEL_ID", basic.get("channelId"));
		    taskMap.put("CHANNEL_NAME", basic.get("channelName"));
		    taskMap.put("REGION_CODE", basic.get("regionCode"));
		    taskMap.put("REGION_NAME", basic.get("regionName"));
		    taskMap.put("SERVICE_NBR", basic.get("serviceNbr"));
		    taskMap.put("START_DATE", basic.get("startDate"));
		    taskMap.put("END_DATE", basic.get("endDate"));
		    taskMap.put("GRID_NAME", basic.get("gridName"));
		    taskMap.put("SERVICE_NO", basic.get("serviceNo"));
		    taskMap.put("SERVICE_NAME", basic.get("serviceName"));
			taskNewList.add(taskMap);
		
		   }
		}
		
		outMap.put("task_LIST", taskNewList);
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("total") == null?0:outParam.get("total"));
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 任务信息查询出参
	* @date: 2016-12-15 
	* @author: zhangjj_crmpd
	* @title: taskInfoOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO taskInfoOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 处理调配规则入参
	* @date: 2016-12-19 
	* @author: zhangjj_crmpd
	* @title: handleTaskAdjustRuleListInParam 
	* @param body
	* @param outMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> handleTaskAdjustRuleListInParam(Map<String, Object> body,
			Map<String, Object> outMap) {
		List<Map<String, Object>> ruleList =  (List<Map<String, Object>>) body.get("RULE_LIST");
		List<Map<String, Object>> outRuleList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(ruleList)){
			return outRuleList;
		}
		for(Map<String, Object> ruleInfo : ruleList){
			Map<String,Object> outRuleMap = new HashMap<String,Object>();
			outRuleMap.put("ruleType", ruleInfo.get("RULE_TYPE"));
			outRuleMap.put("ruleDetailList", handleTaskAdjustRuleContentListInParam(ruleInfo,outRuleMap)) ;
			outRuleList.add(outRuleMap);
		}
		return outRuleList;
	}

	/**
	 * 处理调配规则内容信息入参
	* @date: 2016-12-19 
	* @author: zhangjj_crmpd
	* @title: handleTaskAdjustRuleContentListInParam 
	* @param ruleInfo
	* @param outRuleMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> handleTaskAdjustRuleContentListInParam(
			Map<String, Object> ruleInfo, Map<String, Object> outRuleMap) {
		List<Map<String, Object>> ruleDetailList = (List<Map<String, Object>>) ruleInfo.get("RULE_DETAIL_LIST");
		List<Map<String, Object>> ruleContentOutList = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(ruleDetailList)){
			for(Map<String, Object> ruleDetail : ruleDetailList){
				Map<String, Object> ruleDetailOut= new HashMap<String, Object>();
				ruleDetailOut.put("param",handleTaskAdjustRuleDetail(ruleDetail,ruleDetailOut));
				ruleContentOutList.add(ruleDetailOut);
			}
		}
		return ruleContentOutList;
	}
	
	/**
	 * 处理调配规则详细信息入参
	* @date: 2016-12-19 
	* @author: zhangjj_crmpd
	* @title: handleTaskAdjustRuleDetail 
	* @param ruleDetail
	* @param ruleDetailOut 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> handleTaskAdjustRuleDetail(Map<String, Object> ruleDetail,
			Map<String, Object> ruleDetailOut) {
		List<Map<String, Object>> paramList = (List<Map<String, Object>>) ruleDetail.get("PARAM");
		List<Map<String, Object>> paramOutList = new  ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(paramList)){
			for(Map<String, Object> param : paramList){
				Map<String, Object> outParam = new HashMap<String, Object>();
				outParam.put("ruleParValue", param.get("RULE_PAR_VALUE"));
				outParam.put("ruleDetailType", param.get("RULE_DETAIL_TYPE"));
				outParam.put("ruleParCode", param.get("RULE_PAR_CODE"));
				outParam.put("ruleParName", param.get("RULE_PAR_NAME"));
				paramOutList.add(outParam);
			}
		}
		return paramOutList;
		
	}

}

