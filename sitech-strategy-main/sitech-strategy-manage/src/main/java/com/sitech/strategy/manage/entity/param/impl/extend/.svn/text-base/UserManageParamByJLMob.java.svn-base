package com.sitech.strategy.manage.entity.param.impl.extend;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.impl.UserManageParam;

/**
 * 吉林用户参数处理
* @date: 2017-2-23 
* @author: yuanchun
* @title: UserManageParamByJLMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class UserManageParamByJLMob extends UserManageParam {

	/**
	 * 查询用户标签列表入参
	* @date: 2017-2-24 
	* @author: yuanchun
	* @title: queryUserLabelListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryUserLabelListInParam(InDTO inDTO){
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("userLabelName", inMap.get("USER_LABEL_NAME"));
		outMap.put("sortFlag", inMap.get("SORT_FLAG"));
		outMap.put("sortField", inMap.get("SORT_FIELD"));
		outMap.put("queryLabelArchivesFlag", inMap.get("QUERY_LABELARCHIVES_FLAG"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_TL);
		outMap.put("currentPageCode", inMap.get("CURRENT_PAGE_CODE"));
		outMap.put("perRecordCount", inMap.get("PER_RECORD_COUNT"));
		outMap.put("totalRecordCount", inMap.get("TOTAL_RECORD_COUNT"));
		outMap.put("queryId", inMap.get("QUERY_ID"));
		outMap.put("isSort", inMap.get("IS_SORT"));
		outMap.put("loginNo", inMap.get("LOGIN_NO"));
		return outMap;
	}
	
	/**
	 * 查询用户标签列表出参
	* @date: 2017-2-24 
	* @author: yuanchun
	* @title: queryUserLabelListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryUserLabelListOutParam(Map<String,Object> outParam){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		List<Map<String,Object>> tempLableList = new ArrayList<Map<String,Object>>();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		List<Map<String,Object>> inList = (List<Map<String, Object>>) outParam.get("tempLableList");
		String queryLabelArchivesFlag = (String) outParam.get("queryLabelArchivesFlag");
		
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String,Object> labelMap :inList){
				Map<String,Object> labelNewMap = new HashMap<String,Object>();
				if(CommonUtils.objectIsNull(queryLabelArchivesFlag)){
					labelNewMap.put("SERIAL_ID", labelMap.get("serialId"));
					labelNewMap.put("USER_LABEL_NAME", labelMap.get("userLabelName"));
					labelNewMap.put("USER_LABEL_CODE", labelMap.get("userLabelKey"));
					labelNewMap.put("USER_LABEL_KEY", labelMap.get("userLabelKey"));
					labelNewMap.put("USER_LABEL_TYPE", labelMap.get("userLabelType"));
					labelNewMap.put("DISPLAY_ORDER", labelMap.get("displayOrder"));
					labelNewMap.put("USER_LABEL_SOURCE", labelMap.get("userLabelSource"));
					labelNewMap.put("BUSI_CALIBER", labelMap.get("busiCaliber"));
					labelNewMap.put("UPDATE_FREQ", labelMap.get("updateFreq"));
					labelNewMap.put("CONTACT", labelMap.get("contact"));
					labelNewMap.put("MANUFACTOR", labelMap.get("manufactor"));
					labelNewMap.put("APP_RANGE", labelMap.get("appRange"));
					labelNewMap.put("LABEL_WHERE", labelMap.get("labelWhere"));
					labelNewMap.put("USER_LABEL_BOXTYPE", labelMap.get("userLabelBoxtype"));
					
					String beginDate = DateUtil.timestamp2String((Timestamp) labelMap.get("beginDate"), DateUtil.DATE_FROMAT_YYYYMMDD2);
					String endDate = DateUtil.timestamp2String((Timestamp) labelMap.get("endDate"), DateUtil.DATE_FROMAT_YYYYMMDD2);
					if(CommonUtils.objectIsNull(beginDate) == false){
						 labelNewMap.put("BEGIN_DATE", beginDate);
					}
					if(CommonUtils.objectIsNull(endDate) == false){
						 labelNewMap.put("END_DATE", endDate);
					}
					tempLableList.add(labelNewMap);
				}else{
					labelNewMap.put("DAY_ID", labelMap.get("daiId"));
					labelNewMap.put("LABEL_ID", labelMap.get("labelId"));
					labelNewMap.put("LABEL_NAME", labelMap.get("labelName"));
					labelNewMap.put("LABEL_CYCLE", labelMap.get("labelCycle"));
					labelNewMap.put("LABEL_VALUE_DESC", labelMap.get("labelValue"));
					labelNewMap.put("LABEL_VALUE_UNITS", labelMap.get("labelValueUnits"));
					labelNewMap.put("RULE_DESCRIBE", labelMap.get("ruleDescribe"));
					labelNewMap.put("LABEL_ITEM_SUB", labelMap.get("labelItemSub"));
					labelNewMap.put("ENCODE_TABLE", labelMap.get("encodeTable"));
					labelNewMap.put("ENCODE_COLUMN", labelMap.get("encodeColumn"));
					labelNewMap.put("IS_ACTIVE", labelMap.get("isActive"));
					labelNewMap.put("IS_SENSITIVE", labelMap.get("isSensitive"));
					labelNewMap.put("VERSION_ID", labelMap.get("versionId"));
					labelNewMap.put("APPLY_NO", labelMap.get("applyNo"));
					labelNewMap.put("SUPPORTER_NO", labelMap.get("supporterNo"));
					labelNewMap.put("FIRST_LEVEL_ID", labelMap.get("firstLevelId"));
					labelNewMap.put("FIRST_LEVEL_NAME", labelMap.get("firstLevelName"));
					labelNewMap.put("SECOND_LEVEL_ID", labelMap.get("secondLevelId"));
					labelNewMap.put("SECOND_LEVEL_NAME", labelMap.get("secondLevelName"));
					labelNewMap.put("REMARK", labelMap.get("remark"));
					
					String startDate = DateUtil.timestamp2String((Timestamp) labelMap.get("startDate"), DateUtil.DATE_FROMAT_YYYYMMDD2);
					String endDate = DateUtil.timestamp2String((Timestamp) labelMap.get("endDate"), DateUtil.DATE_FROMAT_YYYYMMDD2);
					String updateDate = DateUtil.timestamp2String((Timestamp) labelMap.get("updateDate"), DateUtil.DATE_FROMAT_YYYYMMDD2);
					if(CommonUtils.objectIsNull(startDate) == false){
						 labelNewMap.put("START_DATE", startDate);
					}
					if(CommonUtils.objectIsNull(endDate) == false){
						 labelNewMap.put("END_DATE", endDate);
					}
					if(CommonUtils.objectIsNull(updateDate) == false){
						 labelNewMap.put("UPDATE_DATE", updateDate);
					}
					tempLableList.add(labelNewMap);
				}
			}
		}
		outMap.put("USER_LABEL_LIST", tempLableList);
		outMap.put("CURRENT_PAGE_CODE", outParam.get("currentPageCode") == null?0:outParam.get("currentPageCode"));
		outMap.put("PER_RECORD_COUNT", outParam.get("perRecordCount") == null?0:outParam.get("perRecordCount"));
		outMap.put("TOTAL_RECORD_COUNT", outParam.get("totalRecordCount") == null?0:outParam.get("totalRecordCount"));
		outMap.put("QUERY_ID", outParam.get("queryId") == null?"":outParam.get("queryId"));
		
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
}
