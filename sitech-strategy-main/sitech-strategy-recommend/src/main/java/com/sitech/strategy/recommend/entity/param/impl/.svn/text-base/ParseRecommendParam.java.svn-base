package com.sitech.strategy.recommend.entity.param.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.pojo.inter.channel.IChannelPojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IUser;
import com.sitech.strategy.recommend.base.BaseRecommendEntity;
import com.sitech.strategy.recommend.base.basedto.StandardOutDTO;
import com.sitech.strategy.recommend.entity.param.inter.IParseRecommendParam;

/**
 * ParseRecommendService参数处理接口
* @date: 2016-9-14 
* @author: sunliang 
* @title: ParseRecommendServiceParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ParseRecommendParam extends BaseRecommendEntity implements
		IParseRecommendParam {
	
	/**
	 * 渠道pojo
	 */
	protected IChannelPojo channelPojo;
	/**
	 * 用户对象
	 */
	protected IUser user;
	
	/**
	 * 
	* @date: 2016-12-20 
	* @author: sunliang 
	* @title: setChannelPojo 
	* @param channelPojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannelPojo(IChannelPojo channelPojo) {
		this.channelPojo = channelPojo;
	}
	
	/**
	 * 
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: setUser 
	* @param user 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUser(IUser user) {
		this.user = user;
	}

	/**
	 * 客户经理任务解析入参处理
	* @date: 2016-10-20 
	* @author: yangwl
	* @title: parseChannelTaskRecommendInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> parseChannelTaskRecommendInParam(InDTO inDTO)
			throws StrategyError {
		MBean inParamMbean = inDTO.getMbean();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("callTime", new Date());
		inParam.put("serviceName", "parseRecommendContent");
		inParam.put("seqId", SequenceUtil.getSequence());
		log.debug("parseChannelTaskRecommendInParam===seqId===", inParam);
		inParam.put("currentDay", DateUtil.getCurrentDay());
		inParam.put("currentMonth", DateUtil.getCurrentMonth());
		inParam.put("sceneType", channelPojo.getSceneTypeByChannelId(inParamMbean.getBodyStr("CHANNEL_ID")));
		inParam.put("channelId", inParamMbean.getBodyStr("CHANNEL_ID"));
		inParam.put("systemId", inParamMbean.getBodyStr("COMMON_INFO.SYSTEM_ID"));
		inParam.put("operNo", inParamMbean.getBodyStr("OPER_NO"));
		inParam.put("operName", inParamMbean.getBodyStr("OPER_NAME"));
		inParam.put("regionCode", inParamMbean.getBodyStr("REGION_CODE"));
		inParam.put("selInOrgId", inParamMbean.getBodyStr("SEL_IN_ORG_ID"));
		inParam.put("numType", inParamMbean.getBodyStr("NUM_TYPE"));
		inParam.put("numValue", inParamMbean.getBodyStr("NUM_VALUE"));
		inParam.put("keyWork", inParamMbean.getBodyStr("KEYWORD"));
		
		List<Map<String, Object>> positionInfoList = new ArrayList<Map<String, Object>>();
		for(Map<String, Object> positionInfoMap:(List<Map<String, Object>>)inParamMbean.getBodyList("POSITION_INFO_LIST")){
			Map<String, Object> paramMap = new HashMap<String, Object>();
			paramMap.put("positionId", positionInfoMap.get("POSITION_ID"));
			paramMap.put("seqId", positionInfoMap.get("SEQ_ID"));
			paramMap.put("taskId", positionInfoMap.get("TASK_ID"));
			paramMap.put("marketCaseId", positionInfoMap.get("ACT_ID"));
			positionInfoList.add(paramMap);
		}
		inParam.put("positionIdList", positionInfoList);
		
		//查询用户号码信息
		List<Map<String,Object>> userList = user.queryUserNo(inParam);
		inParam.put("userList", userList);
		
		return inParam;
	}

	/**
	 * 客户经理任务解析出参处理
	* @date: 2016-10-20 
	* @author: yangwl
	* @title: parseChannelTaskRecommendOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO parseChannelTaskRecommendOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody(outParam);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * parseRecommendContent入参处理
	* @date: 2016-9-14 
	* @author: sunliang 
	* @title: parseRecommendContentInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> parseRecommendContentInParam(InDTO inDTO) throws StrategyError {
		
		MBean mbean = inDTO.getMbean();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("callTime", new Date());
		inParam.put("serviceName", "parseRecommendContent");
		List<Map<String, Object>> positionInfoList = new ArrayList<Map<String, Object>>();
		inParam.put("seqId", SequenceUtil.getSequence());
		log.debug("parseChannelTaskRecommendInParam===seqId===", inParam);
		inParam.put("currentDay", DateUtil.getCurrentDay());
		inParam.put("currentMonth", DateUtil.getCurrentMonth());
		inParam.put("channelId", mbean.getBodyStr("CHANNEL_ID"));
		inParam.put("systemId", mbean.getBodyStr("COMMON_INFO.SYSTEM_ID"));
		inParam.put("sceneType", channelPojo.getSceneTypeByChannelId(mbean.getBodyStr("CHANNEL_ID")));
		inParam.put("operNo", mbean.getBodyStr("OPER_NO"));
		inParam.put("operName", mbean.getBodyStr("OPER_NAME"));
		inParam.put("regionCode", mbean.getBodyStr("REGION_CODE"));
		inParam.put("selInOrgId", mbean.getBodyStr("SEL_IN_ORG_ID"));
		inParam.put("numType", mbean.getBodyStr("NUM_TYPE"));
		inParam.put("numValue", mbean.getBodyStr("NUM_VALUE"));
		inParam.put("positionIdList", positionInfoList);
		
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
		List<Map<String,Object>> newUserList = new ArrayList<Map<String,Object>>();
		//只取5个用户
		if (userList.size() > 5) {
			for (int i = 0; i < 5; i++) {
				newUserList.add(userList.get(i));
			}
		}else{
			newUserList = userList;
		}
		inParam.put("userList", newUserList);
		
		return inParam;
	}

	/**
	 * parseRecommendContent出参处理
	* @date: 2016-9-14 
	* @author: sunliang 
	* @title: parseRecommendContentOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO parseRecommendContentOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody(outParam);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

}
