package com.sitech.strategy.manage.entity.param.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IEventManageParam;

/**
 * 事件参数转换 
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: EventManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class EventManageParam implements IEventManageParam{
	
	/**
	 * 增加事件明细信息入参
	* @date: 2017-2-14 
	* @author: liuqi
	* @title: saveEventDetailInfoInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveEventDetailInfoInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String, Object> body = bean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		List<Map<String, Object>> custGroupList = (List<Map<String, Object>>) body.get("CUST_GROUP_LIST");
		List<Map<String, Object>> eventDetailList = (List<Map<String, Object>>) body.get("EVENT_DETAIL_LIST");
		List<Map<String, Object>> addCustGroup = new ArrayList<Map<String,Object>>();
		List<Map<String, Object>> addEventDetailInfoList = new ArrayList<Map<String,Object>>();
	
		if (!CommonUtils.objectIsNull(custGroupList)) {
			for (Map<String, Object> map : custGroupList) {
				Map<String, Object> custGroup = new HashMap<String, Object>();
				custGroup.put("relId", map.get("REL_ID"));
				custGroup.put("custGroupId", map.get("CUST_GROUP_ID"));
				custGroup.put("custGroupName", map.get("CUST_GROUP_NAME"));
				addCustGroup.add(custGroup);
			}
		}
		inParam.put("custGroupList", addCustGroup);
		
		if (!CommonUtils.objectIsNull(eventDetailList)) {
			for (Map<String, Object> map : eventDetailList) {
				Map<String, Object> eventDetailInfo = new HashMap<String, Object>();
				eventDetailInfo.put("eventId", map.get("EVENT_ID"));
				eventDetailInfo.put("eventDetailId", map.get("EVENT_DETAIL_ID"));
				//大类型
				eventDetailInfo.put("eventType", map.get("EVENT_TYPE"));
				//小类型
				eventDetailInfo.put("eventDetailType", map.get("EVENT_DETAIL_TYPE"));
				
				List<Map<String, Object>> paramList=(List<Map<String, Object>>) map.get("PARAMS");
				List<Map<String, Object>> newParamList = new ArrayList<Map<String,Object>>();
				if (!CommonUtils.objectIsNull(paramList)) {
				for(int i=0;i<paramList.size();i++){
					Map<String, Object> paramDetail = new HashMap<String, Object>();
					paramDetail.put("eventParValue", paramList.get(i).get("EVENT_PAR_VALUE"));
					paramDetail.put("eventParCode", paramList.get(i).get("EVENT_PAR_CODE"));
					paramDetail.put("eventParDesc", paramList.get(i).get("EVENT_PAR_DESC"));
					paramDetail.put("eventParName", paramList.get(i).get("EVENT_PAR_NAME"));
					newParamList.add(paramDetail);
				}
				eventDetailInfo.put("params", newParamList);
				}
				addEventDetailInfoList.add(eventDetailInfo);
			}
		}
		inParam.put("eventDetailInfoList", addEventDetailInfoList);
		return inParam;
	}
	
	/**
	 * 增加事件明细信息出参
	* @date: 2017-2-14 
	* @author: liuqi
	* @title: saveEventDetailInfoOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveEventDetailInfoOutParam(Map<String, Object> outParam) {
		MBean outBean = new MBean();
		List<Map<String, Object>> outList = (List<Map<String, Object>>) outParam.get("outList");
		List<Map<String, Object>> newOutList = new ArrayList<Map<String,Object>>();
		if (!CommonUtils.objectIsNull(outList)) {
			for (Map<String, Object> map : outList) {
				Map<String, Object> m = new HashMap<String, Object>();
				m.put("CUST_GROUP_ID", map.get("custGroupId"));
				m.put("CUST_GROUP_NAME", map.get("custGroupName"));
				m.put("MARKET_CASE_CUST_GROUP_REL_ID", map.get("marketCaseCustGroupRelId"));
				m.put("CUST_GROUP_EVENT_REL_ID", map.get("custGroupEventRelId"));
				m.put("RULE_ID", map.get("ruleId"));
				m.put("EVENT_ID", map.get("eventId"));
				m.put("RULE_DETAIL_ID", map.get("ruleDetailId"));
				m.put("EVENT_RULE_REL_ID", map.get("eventRuleRelId"));
				m.put("EVENT_ID", map.get("eventId"));
				newOutList.add(m);
			}
		}
		outBean.setBody("OUT_LIST",newOutList);
		StandardOutDTO outDTO = new StandardOutDTO();
		outDTO.setBean(outBean);
		return outDTO;
	}
	/**
	 *  删除事件关系，缴费事件删除事件详情和事件表出参
	* @date: 2017-3-30 
	* @author: chenhao
	* @title: removeMarketCaseEventRelAndDetailByRelIdOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO removeMarketCaseEventRelAndDetailByRelIdOutParam(){
		StandardOutDTO outDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody("result","1");
		outDTO.setBean(outBean);
		return outDTO;
	}
	/**
	 *  删除事件关系，缴费事件删除事件详情和事件表入参
	* @date: 2017-3-30 
	* @author: chenhao
	* @title: removeMarketCaseEventRelAndDetailByRelIdInParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> removeMarketCaseEventRelAndDetailByRelIdInParam(InDTO inDTO){
		MBean bean = inDTO.getMbean();
		Map<String, Object> body = bean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("relId", body.get("REL_ID"));
		inParam.put("eventType", body.get("EVENT_TYPE"));
		return inParam;
	}

}
