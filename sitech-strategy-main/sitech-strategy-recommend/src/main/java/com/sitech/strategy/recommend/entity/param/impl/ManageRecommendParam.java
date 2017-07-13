package com.sitech.strategy.recommend.entity.param.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.recommend.base.BaseRecommendEntity;
import com.sitech.strategy.recommend.base.basedto.StandardOutDTO;
import com.sitech.strategy.recommend.entity.param.inter.IManageRecommendParam;

/**
 * 管理服务参数
* @date: 2016-10-15 
* @author: yangwl
* @title: ManageRecommendParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ManageRecommendParam extends BaseRecommendEntity implements IManageRecommendParam{
	
	/**
	 * 解析客户列表入参
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: parseCustListInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> parseCustListInParam(InDTO inDTO) throws StrategyError {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> inParam = new HashMap<String,Object>();
		List<Map<String, Object>> positionIdList = new ArrayList<Map<String, Object>>();
		inParam.put("callTime", new Date());
		inParam.put("serviceName", "queryCustList");
		inParam.put("systemId", mbean.getBodyStr("COMMON_INFO.SYSTEM_ID"));
		inParam.put("channelId", mbean.getBodyStr("CHANNEL_ID"));
		inParam.put("operNo", mbean.getBodyStr("OPER_NO"));
		inParam.put("operName", mbean.getBodyStr("OPER_NAME"));
		inParam.put("regionCode", mbean.getBodyStr("REGION_CODE"));
		inParam.put("numType", mbean.getBodyStr("NUM_TYPE"));
		inParam.put("numValue", mbean.getBodyStr("NUM_VALUE"));
		inParam.put("positionList", positionIdList);
		for(Map<String,Object> positionMap: (List<Map<String,Object>>)mbean.getBodyList("POSITION_INFO_LIST")){
			Map<String, Object> positionInfo = new HashMap<String, Object>();
			positionInfo.put("positionId", positionMap.get("POSITION_ID"));
			positionInfo.put("marketCaseId", positionMap.get("ACT_ID"));
			positionIdList.add(positionInfo);
		}
		
		if (CommonUtils.objectIsNull(inParam.get("numValue")) || CommonUtils.objectIsNull(inParam.get("numValue"))) {
			throw new StrategyError("","","");
		}
		
		return inParam;
	}

	/**
	 * 解析营销案列表出差参
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: parseMarketCaseListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO parseCustListOutParam(Map<String, Object> outParam) throws StrategyError{
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody(outParam);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}
	
	/**
	 * 解析营销案列表入参
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: parseMarketCaseListInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> parseMarketCaseListInParam(InDTO inDTO) throws StrategyError {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> inParam = new HashMap<String,Object>();
		List<Map<String, Object>> positionIdList = new ArrayList<Map<String, Object>>();
		inParam.put("callTime", new Date());
		inParam.put("serviceName", "queryMarketCaseList");
		inParam.put("systemId", mbean.getBodyStr("COMMON_INFO.SYSTEM_ID"));
		inParam.put("channelId", mbean.getBodyStr("CHANNEL_ID"));
		inParam.put("operNo", mbean.getBodyStr("OPER_NO"));
		inParam.put("operName", mbean.getBodyStr("OPER_NAME"));
		inParam.put("regionCode", mbean.getBodyStr("REGION_CODE"));
		inParam.put("numType", mbean.getBodyStr("NUM_TYPE"));
		inParam.put("numValue", mbean.getBodyStr("NUM_VALUE"));
		inParam.put("positionList", positionIdList);
		for(Map<String,Object> positionMap: (List<Map<String,Object>>)mbean.getBodyList("POSITION_INFO_LIST")){
			Map<String, Object> positionInfo = new HashMap<String, Object>();
			positionInfo.put("positionId", positionMap.get("POSITION_ID"));
			positionInfo.put("marketCaseId", positionMap.get("ACT_ID"));
			positionIdList.add(positionInfo);
		}
		
		return inParam;
	}

	/**
	 * 解析营销案列表出差参
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: parseMarketCaseListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO parseMarketCaseListOutParam(Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody(outParam);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

	/**
	 * 解析任务列表入参
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: parseTaskListInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> parseTaskListInParam(InDTO inDTO) throws StrategyError {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> inParam = new HashMap<String,Object>();
		List<Map<String, Object>> positionIdList = new ArrayList<Map<String, Object>>();
		inParam.put("callTime", new Date());
		inParam.put("serviceName", "queryTaskList");
		inParam.put("systemId", mbean.getBodyStr("COMMON_INFO.SYSTEM_ID"));
		inParam.put("channelId", mbean.getBodyStr("CHANNEL_ID"));
		inParam.put("operNo", mbean.getBodyStr("OPER_NO"));
		inParam.put("operName", mbean.getBodyStr("OPER_NAME"));
		inParam.put("regionCode", mbean.getBodyStr("REGION_CODE"));
		inParam.put("numType", mbean.getBodyStr("NUM_TYPE"));
		inParam.put("numValue", mbean.getBodyStr("NUM_VALUE"));
		inParam.put("positionList", positionIdList);
		for(Map<String,Object> positionMap: (List<Map<String,Object>>)mbean.getBodyList("POSITION_INFO_LIST")){
			Map<String, Object> positionInfo = new HashMap<String, Object>();
			positionInfo.put("positionId", positionMap.get("POSITION_ID"));
			positionInfo.put("marketCaseId", positionMap.get("ACT_ID"));
			positionIdList.add(positionInfo);
		}
		
		return inParam;
	}

	/**
	 * 解析任务列表出参
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: parseTaskListOutParam 
	* @param outParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO parseTaskListOutParam(Map<String, Object> outParam) throws StrategyError {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		outBean.setBody(outParam);
		standardOutDTO.setBean(outBean);
		return standardOutDTO;
	}

}
