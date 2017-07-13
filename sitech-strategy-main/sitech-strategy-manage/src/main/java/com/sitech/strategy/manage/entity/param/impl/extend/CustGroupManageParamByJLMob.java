package com.sitech.strategy.manage.entity.param.impl.extend;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.impl.CustGroupManageParam;

/**
 * 吉林目标客户群参数处理
* @date: 2017-2-7 
* @author: sunyuan
* @title: CustGroupManageParamExtByJLMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class CustGroupManageParamByJLMob extends CustGroupManageParam {
	
	/**
	 * 查询客户群标签元素入参处理(吉林)
	* @date: 2017-2-9 
	* @author: sunyuan
	* @title: queryCustGroupLabelItemInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryCustGroupLabelItemInParam(InDTO inDTO) {	
		MBean inBean = inDTO.getMbean();
		Map<String,Object> labelMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("userLabelName", labelMap.get("USER_LABEL_NAME"));
		outMap.put("busiType", labelMap.get("BUSI_TYPE"));
		outMap.put("fieldEnName", "userLabelType");
		return outMap;
	}

	
	/**
	 * 查询客户群标签元素出参处理(吉林)
	* @date: 2017-2-7 
	* @author: sunyuan
	* @title: queryCustGroupLabelItemOutParam 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-3-22 luogj 增加二级标签类型输出
	 */
	
	public StandardOutDTO queryCustGroupLabelItemOutParam(List<Map<String,Object>> inParam){
		List<Map<String,Object>> typeList = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(inParam)){
			for(Map<String,Object> typeMap : inParam){
				Map<String,Object> userLabelTypeMap = new HashMap<String,Object>();
				userLabelTypeMap.put("FIELD_DESC", typeMap.get("fieldDesc"));
				
				List<Map<String,Object>> secondTypeList = (List<Map<String, Object>>) typeMap.get("secondTypeList");
				List<Map<String,Object>> outSecondTypeList = new ArrayList<Map<String,Object>>();
				for( Map<String,Object> secondType : secondTypeList ){
					Map<String,Object> map = new HashMap<String,Object>();
					map.put("SECOND_TYPE_DESC", secondType.get("secondTypeDesc"));
					
					List<Map<String,Object>> lableList = (List<Map<String, Object>>) secondType.get("lableList");
					List<Map<String,Object>> outLableList = new ArrayList<Map<String,Object>>();
					for(Map<String,Object> innerMap : lableList){
						Map<String,Object> map2 = new HashMap<String,Object>();
						map2.put("USER_LABEL_NAME", innerMap.get("userLabelName"));
						map2.put("USER_LABEL_KEY", innerMap.get("userLabelKey"));
						map2.put("USER_LABEL_TYPE", innerMap.get("userLabelType"));
						map2.put("USER_LABEL_BOXTYPE", innerMap.get("userLabelBoxtype"));
						map2.put("BUSI_CALIBER", innerMap.get("busiCaliber")==null?"":innerMap.get("busiCaliber"));
						map2.put("LABEL_WHERE", innerMap.get("labelWhere")==null?"":innerMap.get("labelWhere"));
						map2.put("UPDATE_FREQ", innerMap.get("updateFreq"));
						outLableList.add(map2);
					}
					
					map.put("LABEL_LIST", outLableList);
					outSecondTypeList.add(map);
				}
				
				userLabelTypeMap.put("SECOND_TYPE_LIST", outSecondTypeList);
				typeList.add(userLabelTypeMap);
			}
		}
		
		log.error("luogj---queryCustGroupLabelItemOutParam--typeList", typeList);
		
		MBean outMbean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("TYPE_LIST", typeList);
		outMbean.setBody(outMap);
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		standardOutDTO.setBean(outMbean);
		
		return standardOutDTO;
	}
		
}
