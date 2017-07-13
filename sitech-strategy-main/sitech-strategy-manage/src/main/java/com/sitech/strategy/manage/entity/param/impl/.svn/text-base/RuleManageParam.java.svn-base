package com.sitech.strategy.manage.entity.param.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.param.inter.IRuleManageParam;

/**
 * 规则参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: RuleManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class RuleManageParam implements IRuleManageParam{
	
	/**
	 * 查询全局策略配置列表入参转换
	* @date: 2016-10-8 
	* @author: xiongxq
	* @title: queryGlobalStrategyConfigListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryGlobalStrategyConfigListInParam(InDTO inDTO) {
		MBean inBean = inDTO.getMbean();
		Map<String,Object> inMap = inBean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();

		outMap.put("ruleId", inMap.get("RULE_ID"));
		outMap.put("ruleDetailId", inMap.get("RULE_DETAIL_ID"));
		outMap.put("channelId", inMap.get("CHANNEL_ID"));
		outMap.put("queryListType", Const.QUERY_LIST_TYPE_GSC);
		return outMap;
		
	}

	/**
	 * 查询全局策略配置列表出参转换
	* @date: 2016-10-8 
	* @author: xiongxq
	* @title: queryGlobalStrategyConfigListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO queryGlobalStrategyConfigListOutParam(
			Map<String, Object> outParam) {
		List<Map<String,Object>> inList = (List<Map<String, Object>>) outParam.get("globalStrategyConfigList");
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(inList) == false){
			for(Map<String,Object> inMap : inList){
				Map<String,Object> noDisturbMap = new HashMap<String,Object>();
				noDisturbMap.put("RULE_PAR_DESC", inMap.get("ruleParDesc"));
				noDisturbMap.put("RULE_PAR_CODE", inMap.get("ruleParCode"));
				noDisturbMap.put("RULE_PAR_NAME", inMap.get("ruleParName"));
				noDisturbMap.put("RULE_PAR_VALUE", inMap.get("ruleParValue"));
				noDisturbMap.put("BATCH_NO", inMap.get("batchNo"));
				noDisturbMap.put("RULE_DETAIL_ID", inMap.get("ruleDetailId"));
				outList.add(noDisturbMap);
			}
		}
		
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("GLOBAL_STRATEGY_CONFIG_LIST", outList);
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean bean = new MBean();
		bean.setBody(outMap);
		standardOutDTO.setBean(bean);
		return standardOutDTO;
	}

	/** 
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: queryRuleDetailByDetailIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> queryRuleDetailByDetailIdInParam(InDTO inDTO) {
		Map<String, Object> body = inDTO.getMbean().getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("ruleDetailId", body.get("RULE_DETAIL_ID"));
		return inParam;
	}

	/** 
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: queryRuleDetailByDetailIdOutParam 
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public StandardOutDTO queryRuleDetailByDetailIdOutParam(
			Map<String, Object> inMap) {
		List<Map<String, Object>> ruleDetail = (List<Map<String, Object>>)inMap.get("ruleDetail");
		List<Map<String, Object>> params = new ArrayList<Map<String,Object>>();
		String ruleDetailType = "";
		if (!CommonUtils.objectIsNull(ruleDetail)) {
			for (Map<String, Object> map : ruleDetail) {
				ruleDetailType = (String) map.get("ruleDetailType");
				Map<String, Object> param = new HashMap<String, Object>();
				param.put("RULE_PAR_CODE", map.get("ruleParCode"));
				param.put("RULE_PAR_NAME", map.get("ruleParName"));
				param.put("RULE_PAR_VALUE", map.get("ruleParValue"));
				param.put("RULE_PAR_DESC", map.get("ruleParDesc"));
				param.put("BATCH_NO", map.get("batchNo"));
				params.add(param);
			}
		}
		MBean bean = new MBean();
		bean.setBody("RULE_DETAIL_TYPE",ruleDetailType);
		bean.setBody("PARAMS",params);
		StandardOutDTO outDTO = new StandardOutDTO();
		outDTO.setBean(bean);
		return outDTO;
	}

	
	/**
	 * 删除全局策略配置入参转换    
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: removeGlobalStrategyConfigInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> removeGlobalStrategyConfigInParam(InDTO inDTO) {
		MBean inMbean = inDTO.getMbean();
		Map<String,Object> inMap = inMbean.getBody();
		Map<String,Object> outMap = new HashMap<String,Object>();
		
		outMap.put("batchNo",inMap.get("BATCH_NO"));
		outMap.put("ruleDetailId",inMap.get("RULE_DETAIL_ID"));
		System.out.println(outMap);
		return outMap;
	}

	/** 
	 * 删除全局策略配置中出参转换   
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: removeGlobalStrategyConfigOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO removeGlobalStrategyConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}

	/** 
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: removeRuleDetailByDetailIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> removeRuleDetailByDetailIdInParam(InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String, Object> body = bean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		inParam.put("ruleDetailId",body.get("RULE_DETAIL_ID"));
		return inParam;
	}

	/** 
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: removeRuleDetailByDetailId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public StandardOutDTO removeRuleDetailByDetailIdOutParam() {
		MBean bean = new MBean();
		StandardOutDTO outDTO = new StandardOutDTO();
		outDTO.setBean(bean);
		return outDTO;
	}

	/**
	 * 新增全局策略配置入参转换
	* @date: 2016-10-8 
	* @author: xiongxq
	* @title: saveGlobalStrategyConfigInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveGlobalStrategyConfigInParam(InDTO inDTO) {
		List<Map<String,Object>> params = this.globalStrategyConfigInParam(inDTO);
		Map<String,Object> globalStrategyMap = this.globalStrategyCongfigMapInparam(inDTO);
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("params", params);
		outMap.put("globalStrategyMap", globalStrategyMap);
		return outMap;
	}

	/**
	 * 新增全局策略配置出参转换
	* @date: 2016-10-8 
	* @author: xiongxq
	* @title: saveGlobalStrategyConfigOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO saveGlobalStrategyConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}
	
	/**
	 * 保存规则明细入参处理JL
	* @date: 2017-2-21 
	* @author: zhangyw_crmpd
	* @title: saveRuleDetailByCustGroupInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveRuleDetailByCustGroupInParam(
			InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String, Object> body = bean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		List<Map<String, Object>> custGroupList = (List<Map<String, Object>>) body.get("CUST_GROUP_LIST");
		List<Map<String, Object>> eventList = (List<Map<String, Object>>) body.get("EVENT_LIST");
		List<Map<String, Object>> channelList = (List<Map<String, Object>>) body.get("CHANNEL_LIST");
		Map<String, Object> ruleDetail = (Map<String, Object>)body.get("RULE_DETAIL_INFO");
		List<Map<String, Object>> addCustGroup = new ArrayList<Map<String,Object>>();
		List<Map<String, Object>> addChannel = new ArrayList<Map<String,Object>>();
		List<Map<String, Object>> addEvent = new ArrayList<Map<String,Object>>();
		Map<String, Object> addRuleDetail = new HashMap<String, Object>();
		if (!CommonUtils.objectIsNull(custGroupList)) {
			for (Map<String, Object> map : custGroupList) {
				Map<String, Object> custGroup = new HashMap<String, Object>();
				custGroup.put("relId", map.get("REL_ID"));
				custGroup.put("custGroupId", map.get("CUST_GROUP_ID"));
				addCustGroup.add(custGroup);
			}
		}
		inParam.put("custGroupList", addCustGroup);
		if (!CommonUtils.objectIsNull(eventList)) {
			for (Map<String, Object> map : eventList) {
				Map<String, Object> event = new HashMap<String, Object>();
				event.put("eventId", map.get("EVENT_ID"));
				addEvent.add(event);
			}
		}
		inParam.put("eventList", addEvent);
		if (!CommonUtils.objectIsNull(channelList)) {
			for (Map<String, Object> map : channelList) {
				Map<String, Object> channel = new HashMap<String, Object>();
				channel.put("channelId", map.get("CHANNEL_ID"));
				addChannel.add(channel);
			}
		}
		inParam.put("channelList", addChannel);
		if (!CommonUtils.objectIsNull(ruleDetail)) {
			addRuleDetail.put("ruleId", ruleDetail.get("RULE_ID"));
			addRuleDetail.put("ruleDetailId", ruleDetail.get("RULE_DETAIL_ID"));
			addRuleDetail.put("ruleDetailType", ruleDetail.get("RULE_DETAIL_TYPE"));
			List<Map<String, Object>> params = (List<Map<String, Object>>) ruleDetail.get("PARAMS");
			List<Map<String, Object>> newParams = new ArrayList<Map<String,Object>>();
			if (!CommonUtils.objectIsNull(params)) {
				for (Map<String, Object> map : params) {
					Map<String, Object> param = new HashMap<String, Object>();
					param.put("ruleParCode", map.get("RULE_PAR_CODE"));
					param.put("ruleParName", map.get("RULE_PAR_NAME"));
					param.put("ruleParValue", map.get("RULE_PAR_VALUE"));
					param.put("ruleParDesc", map.get("RULE_PAR_DESC"));
					param.put("batchNo", map.get("BATCH_NO"));
					newParams.add(param);
				}
			}
			addRuleDetail.put("params", newParams);
		}
		inParam.put("ruleDetailInfo", addRuleDetail);
		return inParam;
	}
	
	/** 保存规则明细入参处理
	* @date: 2016-10-15 
	* @author: wangpei
	* @title: saveRuleDetailByCustGroupAndChannelInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> saveRuleDetailByCustGroupAndChannelInParam(
			InDTO inDTO) {
		MBean bean = inDTO.getMbean();
		Map<String, Object> body = bean.getBody();
		Map<String, Object> inParam = new HashMap<String, Object>();
		List<Map<String, Object>> custGroupList = (List<Map<String, Object>>) body.get("CUST_GROUP_LIST");
		List<Map<String, Object>> channelList = (List<Map<String, Object>>) body.get("CHANNEL_LIST");
		Map<String, Object> ruleDetail = (Map<String, Object>)body.get("RULE_DETAIL_INFO");
		List<Map<String, Object>> addCustGroup = new ArrayList<Map<String,Object>>();
		List<Map<String, Object>> addChannel = new ArrayList<Map<String,Object>>();
		Map<String, Object> addRuleDetail = new HashMap<String, Object>();
		if (!CommonUtils.objectIsNull(custGroupList)) {
			for (Map<String, Object> map : custGroupList) {
				Map<String, Object> custGroup = new HashMap<String, Object>();
				custGroup.put("relId", map.get("REL_ID"));
				custGroup.put("custGroupId", map.get("CUST_GROUP_ID"));
				addCustGroup.add(custGroup);
			}
		}
		inParam.put("custGroupList", addCustGroup);
		if (!CommonUtils.objectIsNull(channelList)) {
			for (Map<String, Object> map : channelList) {
				Map<String, Object> channel = new HashMap<String, Object>();
				channel.put("channelId", map.get("CHANNEL_ID"));
				addChannel.add(channel);
			}
		}
		inParam.put("channelList", addChannel);
		if (!CommonUtils.objectIsNull(ruleDetail)) {
			addRuleDetail.put("ruleId", ruleDetail.get("RULE_ID"));
			addRuleDetail.put("ruleDetailId", ruleDetail.get("RULE_DETAIL_ID"));
			addRuleDetail.put("ruleDetailType", ruleDetail.get("RULE_DETAIL_TYPE"));
			List<Map<String, Object>> params = (List<Map<String, Object>>) ruleDetail.get("PARAMS");
			List<Map<String, Object>> newParams = new ArrayList<Map<String,Object>>();
			if (!CommonUtils.objectIsNull(params)) {
				for (Map<String, Object> map : params) {
					Map<String, Object> param = new HashMap<String, Object>();
					param.put("ruleParCode", map.get("RULE_PAR_CODE"));
					param.put("ruleParName", map.get("RULE_PAR_NAME"));
					param.put("ruleParValue", map.get("RULE_PAR_VALUE"));
					param.put("ruleParDesc", map.get("RULE_PAR_DESC"));
					param.put("batchNo", map.get("BATCH_NO"));
					newParams.add(param);
				}
			}
			addRuleDetail.put("params", newParams);
		}
		inParam.put("ruleDetailInfo", addRuleDetail);

		return inParam;
	}

	/** 保存规则明细出参处理
	* @date: 2016-10-15 
	* @author: wangpei
	* @title: saveRuleDetailByCustGroupAndChannelOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO saveRuleDetailByCustGroupAndChannelOutParam(Map<String, Object> outParam) {
		MBean outBean = new MBean();
		List<Map<String, Object>> outList = (List<Map<String, Object>>) outParam.get("outList");
		List<Map<String, Object>> newOutList = new ArrayList<Map<String,Object>>();
		if (!CommonUtils.objectIsNull(outList)) {
			for (Map<String, Object> map : outList) {
				Map<String, Object> m = new HashMap<String, Object>();
				m.put("CUST_GROUP_ID", map.get("custGroupId"));
				m.put("MARKET_CASE_CUST_GROUP_REL_ID", map.get("marketCaseCustGroupRelId"));
				m.put("CUST_GROUP_CHANNEL_REL_ID", map.get("custGroupChannelRelId"));
				m.put("EVENT_ID", map.get("eventId"));
				m.put("CHANNEL_ID", map.get("channelId"));
				m.put("RULE_ID", map.get("ruleId"));
				m.put("RULE_DETAIL_ID", map.get("ruleDetailId"));
				newOutList.add(m);
			}
		}
		outBean.setBody("OUT_LIST",newOutList);
		StandardOutDTO outDTO = new StandardOutDTO();
		outDTO.setBean(outBean);
		return outDTO;
	}

	/** 
	 * 全局策略配置中修改免打扰配置的入参转换    
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateNoDisturbConfigInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> updateNoDisturbConfigInParam(InDTO inDTO) {
		return null;
	}

	/**
	 * 全局策略配置中修改免打扰配置的出参转换   
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateNoDisturbConfigOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO updateNoDisturbConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}

	/**
	 * 更新短信推送流量入参转换
	* @date: 2016-10-8 
	* @author: xiongxq
	* @title: updateShortMsgMoveTrafficInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> updateShortMsgMoveTrafficInParam(InDTO inDTO) {
		return null;
	}

	/**
	 * 更新短信推送流量出参转换
	* @date: 2016-10-8 
	* @author: xiongxq
	* @title: updateShortMsgMoveTrafficOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public StandardOutDTO updateShortMsgMoveTrafficOutParam() {
		return null;
	}

	/** 
	 * 全局策略配置中修改次数配置的入参转换  
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateTouchCountConfigInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> updateTouchCountConfigInParam(InDTO inDTO) {
		return null;
	}

	/**
	 * 全局策略配置中修改次数配置的出参转换    
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateTouchCountConfigOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO updateTouchCountConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}

	/** 
	 * 全局策略配置中修改时间配置的入参转换 
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateTouchTimeConfigInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> updateTouchTimeConfigInParam(InDTO inDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 全局策略配置中修改时间配置的出参转换  
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateTouchTimeConfigOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public StandardOutDTO updateTouchTimeConfigOutParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = new MBean();
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}
	
	/**
	 *params入参转换 
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: GlobalStrategyConfigInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> globalStrategyConfigInParam(InDTO inDTO){
		MBean outBean = inDTO.getMbean();
		List<Map<String,Object>> globalStrategyList = (List<Map<String, Object>>) outBean.getBodyList("PARAMS");
		List<Map<String,Object>> globalStrategyNewList = this.globalStrategyListInparam(globalStrategyList);
		return globalStrategyNewList;
	}
	
	/**
	 * globalStrategyMap入参转换
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: GlobalStrategyCongifMapInparam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> globalStrategyCongfigMapInparam(InDTO inDTO){
		MBean inbean = inDTO.getMbean();
		Map<String,Object> globalStrategyMap = inbean.getBody();
		Map<String,Object> globalStrategyBasicMap = new HashMap<String,Object>();
		globalStrategyBasicMap.put("ruleId", globalStrategyMap.get("RULE_ID"));
		globalStrategyBasicMap.put("ruleDetailId", globalStrategyMap.get("RULE_DETAIL_ID"));
		globalStrategyBasicMap.put("ruleDetailType", globalStrategyMap.get("RULE_DETAIL_TYPE"));
		
		return globalStrategyBasicMap;
	}
	
	/**
	 * globalStrategyList入参转换
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: globalStrategyListInparam 
	* @param globalStrategyList
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> globalStrategyListInparam(List<Map<String,Object>> globalStrategyList){
		List<Map<String,Object>> globalStrategyNewList = new ArrayList<Map<String,Object>>();
		if(CommonUtils.objectIsNull(globalStrategyList) == false){
			for(Map<String,Object> globalStrategyMap:globalStrategyList){
				Map<String,Object> globalStrategyNewMap = new HashMap<String,Object>();
				globalStrategyNewMap.put("ruleParCode", globalStrategyMap.get("RULE_PAR_CODE"));
				globalStrategyNewMap.put("ruleParName", globalStrategyMap.get("RULE_PAR_NAME"));
				globalStrategyNewMap.put("ruleParValue", globalStrategyMap.get("RULE_PAR_VALUE"));
				globalStrategyNewMap.put("ruleParDesc", globalStrategyMap.get("RULE_PAR_DESC"));
				globalStrategyNewList.add(globalStrategyNewMap);
			}
		}
		return globalStrategyNewList;
	}
	
}
