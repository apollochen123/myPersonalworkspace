package com.sitech.strategy.recommend.entity.param.impl.extend;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.recommend.entity.param.impl.ParseRecommendParam;
import com.sitech.strategy.recommend.entity.param.inter.IParseRecommendParam;

/**
 * parseRecommendContent入参处理
* @date: 2017-2-26 
* @author: sunliang 
* @title: ParseRecommendParamByJLMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ParseRecommendParamByJLMob extends ParseRecommendParam implements
		IParseRecommendParam {
	
	/**
	 * 
	* @date: 2017-2-26 
	* @author: sunliang 
	* @title: parseRecommendContentInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> parseRecommendContentInParam(InDTO inDTO) throws StrategyError {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("callTime", new Date());
		List<Map<String, Object>> positionInfoList = new ArrayList<Map<String, Object>>();
		inParam.put("seqId", SequenceUtil.getSequence());
		log.debug("ParseRecommendParamByJLMob.parseChannelTaskRecommendInParam.seqId", inParam);
		inParam.put("currentDay", DateUtil.getCurrentDay());
		inParam.put("currentMonth", DateUtil.getCurrentMonth());
		inParam.put("channelId", mbean.getBodyStr("CHANNEL_ID"));
		inParam.put("operNo", mbean.getBodyStr("OPER_NO"));
		inParam.put("operName", mbean.getBodyStr("OPER_NAME"));
		inParam.put("regionCode", mbean.getBodyStr("REGION_CODE"));
		inParam.put("selInOrgId", mbean.getBodyStr("SEL_IN_ORG_ID"));
		inParam.put("numType", "1001");
		inParam.put("numValue", mbean.getBodyStr("PHONE_NO"));
		inParam.put("positionIdList", positionInfoList);
		inParam.put("flag", "channel");
		
		Map<String, Object> positions = new HashMap<String, Object>();
		for(Map<String,Object> positionMap: (List<Map<String,Object>>)mbean.getBodyList("POSITION_INFO_LIST")){
			String positionId = (String)positionMap.get("POSITION_ID");
			Map<String, Object> position = (Map<String, Object>) positions.get(positionId);
			if (position == null) {
				position = new HashMap<String, Object>();
				positions.put(positionId, position);
			}
			position.put("positionId", positionMap.get("POSITION_ID"));
			position.put("seqId", positionMap.get("SEQ_ID"));
			Set<String> actList = (Set<String>) position.get("actList");
			if (actList == null) {
				actList = new HashSet<String>();
				position.put("actList", actList);
			}
			if (!CommonUtils.objectIsNull(positionMap.get("ACT_ID"))) {
				actList.add((String) positionMap.get("ACT_ID"));
			}
		}
		for (Map.Entry<String, Object> entry : positions.entrySet()) {
			positionInfoList.add((Map<String, Object>) entry.getValue());
		}
		
		//查询用户号码信息
		List<Map<String,Object>> userList = user.queryUserNo(inParam);
		inParam.put("userList", userList);
		
		log.debug("ParseRecommendParamByJLMob.parseChannelTaskRecommendInParam.inParam", inParam);
		
		return inParam;
	}

}
