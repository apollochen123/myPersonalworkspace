package com.sitech.strategy.common.pojo.impl.assemblyservicestructure;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.IMarketCasePacketPojo;
import com.sitech.strategy.common.pojo.inter.assemblyservicestructure.IAssemblyServiceStructure;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 组装服务报文结构Json实现
* @date: 2017-1-12 
* @author: sunliang 
* @title: AssemblyServiceStructureByJson 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class AssemblyServiceStructureByJson extends BaseClass implements IAssemblyServiceStructure,Serializable {
	
	/**
	 * 
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: assemblyChannelTaskPacket 
	* @param packetMarkCaseList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> assemblyChannelTaskPacket(
			List<Map<String, Object>> packetMarkCaseList) {
		return this.assemblyChannelTriggerPacket(packetMarkCaseList);
	}
	
	/**
	 * 组装渠道触发报文
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: assemblyChannelTriggerPacket 
	* @param packetMarkCaseList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> assemblyChannelTriggerPacket(
			List<Map<String, Object>> packetMarkCaseList) {
		Map<String, Object> outParam = new HashMap<String, Object>();
		List<Map<String, Object>> positionInfoList = new ArrayList<Map<String, Object>>();
		Set<String> posiIds = new HashSet<String>();
		//查询运营位Set
		for(Map<String, Object> packetMarkCase: packetMarkCaseList){
			List<Map<String, Object>> positionList = (List<Map<String, Object>>)packetMarkCase.get(Const.PACKET_PARAM_NODE_POSITION_INFO_LIST);
			for(Map<String, Object> position : positionList){
				posiIds.add((String)position.get(Const.PACKET_PARAM_NODE_POSITION_ID));
			}
		}
		//根据运营位Set拼报文
		for(String posiId : posiIds){
			List<Map<String, Object>> marketCaseInfoList = new ArrayList<Map<String, Object>>();
			Map<String, Object> positionInfoMap = new HashMap<String, Object>();
			for(Map<String, Object> packetMarkCase: packetMarkCaseList){
				List<Map<String, Object>> positionList = (List<Map<String, Object>>)packetMarkCase.get(Const.PACKET_PARAM_NODE_POSITION_INFO_LIST);
				for(Map<String, Object> positionInfo : positionList){
					if(posiId.equals((String)positionInfo.get(Const.PACKET_PARAM_NODE_POSITION_ID))){
						if(!CommonUtils.objectIsNull((List<Map<String, Object>>)positionInfo.get(Const.PACKET_PARAM_NODE_ACT_LIST))){
							for(Map<String, Object> marketCase : (List<Map<String, Object>>)positionInfo.get(Const.PACKET_PARAM_NODE_ACT_LIST)){
								marketCaseInfoList.add(marketCase);
							}
							//marketCaseInfoList.add((List<Map<String, Object>>)positionInfo.get(Const.PACKET_PARAM_NODE_ACT_LIST));
						}
					}
				}
			}
			positionInfoMap.put(Const.PACKET_PARAM_NODE_POSITION_ID, posiId);
			positionInfoMap.put(Const.PACKET_PARAM_NODE_ACT_LIST, marketCaseInfoList);
			positionInfoList.add(positionInfoMap);
		}
		outParam.put(Const.PACKET_PARAM_NODE_POSITION_INFO_LIST, positionInfoList);
		outParam.put(Const.PACKET_PARAM_NODE_TOUCH_HIS_LIST, new ArrayList<Map<String, Object>>());
		return outParam;
	}
	
	/**
	 * 渠道任务下的客户列表转为报文
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: toPacketCustListFromChannelTask 
	* @param marketCaseMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> toPacketCustListFromChannelTask(Map<String, Object> marketCaseMap) throws StrategyError {
		Map<String, Object> packetParamMap = this.toJsonCustListFromChannelTask(marketCaseMap);
		return packetParamMap;
	}
	
	/**
	 * 营销案内容转为报文
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: toPacketFromMarketCase 
	* @param inParam
	* @param marketCasePacketPojoMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> toPacketFromMarketCase(Map<String, Object> inParam,Map<String, Object> marketCasePacketPojoMap) throws StrategyError{
		Map<String, Object> packetParamMap = this.toJsonFromMarketCase(inParam,marketCasePacketPojoMap);
		return packetParamMap;
	}
	
	/**
	 * 渠道任务营销案列表转为报文
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: toPacketMarketCaseListFromChannelTask 
	* @param marketCaseList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> toPacketMarketCaseListFromChannelTask(Map<String, Object> marketCaseMap) throws StrategyError{
		Map<String, Object> packetParamMap = this.toJsonMarketCaseListFromChannelTask(marketCaseMap);
		return packetParamMap;
	}
	
	/**
	 * 渠道任务任务列表转为报文
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: toPacketTaskListFromChannelTask 
	* @param marketCaseMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> toPacketTaskListFromChannelTask(Map<String, Object> marketCaseMap) throws StrategyError {
		Map<String, Object> packetParamMap = this.toJsonTaskListFromChannelTask(marketCaseMap);
		return packetParamMap;
	}
	
	/**
	 * 统计运营位任务总数
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: countPositionTaskNum 
	* @param channelTaskList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected long countPositionTaskNum(List<Map<String,Object>> channelTaskList){
		long positionTotalTask = 0;
		for(Map<String, Object> channelTask:channelTaskList){
			positionTotalTask = positionTotalTask + Long.parseLong(channelTask.get("taskNum")+"");
		}
		return positionTotalTask;
	}
	/**
	 * 组装内容详情报文
	* @date: 2016-10-1 
	* @author: zhaoyue 
	* @title: packetContentDetailList 
	* @param marketContentList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> packetContentDetailList(List<Map<String,Object>> marketContentList, Map<String, Object> userLabelMapInfo, Map<String, Object> userMsgMap,Map<String, String> custGroupLabel){
		List<Map<String,Object>> contentDetailList = new ArrayList<Map<String,Object>>();
		Map<String,Object> contentDetailMap = new HashMap<String,Object>();
		List<Map<String,Object>> paramList = new ArrayList<Map<String,Object>>();
		//组装营销案内容信息
		for(Map<String,Object> marketContentMap:marketContentList){
			List<Map<String, Object>> params = (List<Map<String, Object>>)marketContentMap.get("params");
			//重组参数
			Map<String, Object> newParams =  this.packetNewParamsByBatchNo(params);
			//组装paramlist
			paramList = this.packetParamList(newParams, userLabelMapInfo, userMsgMap,custGroupLabel);
		}
		contentDetailMap.put(Const.PACKET_PARAM_NODE_PARAM_LIST, paramList);
		contentDetailList.add(contentDetailMap);
		
		return contentDetailList;
	}
	
	/**
	 * 组装营销案节点报文
	* @date: 2016-10-1 
	* @author: zhaoyue 
	* @title: packetMarketCaseInfo 
	* @param key
	* @param marketCasePacketPojoMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> packetMarketCaseInfo(Map<String, Object> inParam,String key,Map<String, Object> marketCasePacketPojoMap, Map<String, Object> userLabelMap, Map<String, Object> userMsgMap){

		List<Map<String,Object>> marketCaseList = new ArrayList<Map<String,Object>>();
		List<IMarketCasePacketPojo> marketCasePacketPojoList = (List<IMarketCasePacketPojo>)marketCasePacketPojoMap.get(key);
		int orderNo = 0;
		for(IMarketCasePacketPojo marketCasePacketPojo:marketCasePacketPojoList){
			Map<String,Object> marketCaseInfo = new HashMap<String,Object>();
			//组装营销案基本信息
			Map<String, Object> marketBasicMap = (Map<String,Object>)marketCasePacketPojo.getMarketCaseBasic().get("marketCaseBasic");
			marketCaseInfo.put(Const.PACKET_PARAM_NODE_START_DATE, (String)marketBasicMap.get("startTime"));
			marketCaseInfo.put(Const.PACKET_PARAM_NODE_ACT_NAME, (String)marketBasicMap.get("marketCaseName"));
			marketCaseInfo.put(Const.PACKET_PARAM_NODE_ACT_BUSI_TYPE, (String)marketBasicMap.get("marketCaseBusiType"));
			marketCaseInfo.put(Const.PACKET_PARAM_NODE_ACT_ID, (String)marketBasicMap.get("marketCaseId"));
			marketCaseInfo.put(Const.PACKET_PARAM_NODE_SERVICE_NBR, (String)userMsgMap.get("serviceNbr"));
			marketCaseInfo.put(Const.PACKET_PARAM_NODE_END_DATE, (String)marketBasicMap.get("endTime"));
			marketCaseInfo.put(Const.PACKET_PARAM_NODE_END_DATE, (String)marketBasicMap.get("endTime"));
			marketCaseInfo.put(Const.PACKET_PARAM_NODE_ORDER_NO, ++orderNo);
			if(!CommonUtils.objectIsNull(marketCasePacketPojo.getMarketCaseBasic().get("seqId"))){
				marketCaseInfo.put(Const.PACKET_PARAM_NODE_SEQ_ID, (String)marketCasePacketPojo.getMarketCaseBasic().get("seqId"));
			}else{
				marketCaseInfo.put(Const.PACKET_PARAM_NODE_SEQ_ID, inParam.get("seqId"));
			}
			marketCaseInfo.put(Const.PACKET_PARAM_NODE_ACT_DESC, (String)marketBasicMap.get("marketCaseDesc"));
			//组装标签信息
			marketCaseInfo.put(Const.PACKET_PARAM_NODE_USER_LABEL_LIST, this.packetUserLabel(marketCasePacketPojo, userLabelMap, userMsgMap));
			//组装营销案内容报文
			marketCaseInfo.put(Const.PACKET_PARAM_NODE_CONTENT_LIST, this.pactketMarketcaseContent(marketCasePacketPojo, userLabelMap, userMsgMap));
			marketCaseList.add(marketCaseInfo);
		}
		return marketCaseList;
		
	}
	
	/**
	 * 组装营销案内容信息
	* @date: 2016-10-1 
	* @author: zhaoyue 
	* @title: pactketMarketcaseContent 
	* @param marketCasePacketPojo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> pactketMarketcaseContent(IMarketCasePacketPojo marketCasePacketPojo, Map<String, Object> userLabelMapInfo, Map<String, Object> userMsgMap){
		List<Map<String,Object>> marketContentList = (List<Map<String,Object>>)marketCasePacketPojo.getContentMap().get("marketCaseContent");
		String contentId = (String)marketCasePacketPojo.getContentMap().get("contentId");
		Map<String,String> custGroupLabel = marketCasePacketPojo.getLabelInfo();
		List<Map<String,Object>> returnMarketContentList = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(marketContentList)){
			Map<String,Object> returnContentMap = new HashMap<String,Object>();
			returnContentMap.put(Const.PACKET_PARAM_NODE_CONTENT_ID, contentId);
			returnContentMap.put(Const.PACKET_PARAM_NODE_ORDER_NO, "1");
			returnContentMap.put(Const.PACKET_PARAM_NODE_CONTENT_DETAIL_LIST, packetContentDetailList(marketContentList, userLabelMapInfo, userMsgMap,custGroupLabel));
			returnMarketContentList.add(returnContentMap);
		}
		return returnMarketContentList;
	}
	
	/**
	 * 按照批次号对内容参数重新分组
	* @date: 2016-10-28 
	* @author: yangwl
	* @title: packetNewParamsByBatchNo 
	* @param params
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> packetNewParamsByBatchNo(List<Map<String, Object>> params){
		Map<String, Object> batchNoMap = new HashMap<String, Object>();
		Set<String> batachNo = new HashSet();
		for(Map<String, Object> param:params){
			batachNo.add((String)param.get("batchNo"));
		}
		for(String no:batachNo){
			List<Map<String, Object>> tempList = new ArrayList<Map<String, Object>>();
			for(Map<String, Object> param:params){
				if(no.equals((String)param.get("batchNo"))){
					tempList.add(param);
				}
			}
			batchNoMap.put(no, tempList);
		}
		return batchNoMap;
	}
	
	/**
	 * 组装paramlist
	* @date: 2016-10-28 
	* @author: yangwl
	* @title: packetParamList 
	* @param newParams
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> packetParamList(Map<String, Object> newParams, Map<String, Object> userLabelMapInfo, Map<String, Object> userMsgMap,Map<String, String> custGroupLabel){
		List<Map<String, Object>> commonParamList = new ArrayList<Map<String, Object>>();
		log.debug("========packetParamList===newParams===", newParams);
		if(!CommonUtils.objectIsNull(newParams)){
			Set<String> BatachNo = newParams.keySet();
			List<Map<String, Object>> contentParamList = new ArrayList<Map<String, Object>>();
			Map<String, Object> contentMap = new HashMap<String, Object>();
			for(String no:BatachNo){
				Map<String, Object> contentParamMap = new HashMap<String, Object>();
				List<Map<String, Object>> paramList = (List<Map<String, Object>>)newParams.get(no);
				log.debug("========packetParamList===paramList===", paramList);
				for(Map<String, Object> paramMap:paramList){
					Map<String, Object> commonParamMap = new HashMap<String, Object>();
					if("marketingTerm".equals(paramMap.get("contentParCode"))){
						commonParamMap.put("CONTENT_KEY", "MARKETING_DESCRIPTION");
						String contentInfo = this.replaceContentInLable((String)paramMap.get("contentParValue"), userLabelMapInfo,userMsgMap, custGroupLabel);
						commonParamMap.put("CONTENT_VALUE", contentInfo);
					}
					if("msgUrl".equals(paramMap.get("contentParCode"))){
						commonParamMap.put("CONTENT_KEY", "SMS_URL");
						commonParamMap.put("CONTENT_VALUE", paramMap.get("contentParValue"));
					}
					if("imgUrl".equals(paramMap.get("contentParCode"))){
						commonParamMap.put("CONTENT_KEY", "IMAGE_URL");
						commonParamMap.put("CONTENT_VALUE", paramMap.get("contentParValue"));
					}
					if("actUrl".equals(paramMap.get("contentParCode"))){
						commonParamMap.put("CONTENT_KEY", "ACT_URL");
						commonParamMap.put("CONTENT_VALUE", paramMap.get("contentParValue"));
					}
					if("transactionType".equals(paramMap.get("contentParCode"))){
						commonParamMap.put("CONTENT_KEY", "ACT_REDIRECT_TYPE");
						commonParamMap.put("CONTENT_VALUE", paramMap.get("contentParValue"));
					}
					if("msgRecommendType".equals(paramMap.get("contentParCode"))){
						commonParamMap.put("CONTENT_KEY", "SMS_REDIRECT_TYPE");
						commonParamMap.put("CONTENT_VALUE", paramMap.get("contentParValue"));
					}
					if("popType".equals(paramMap.get("contentParCode"))){
						commonParamMap.put("CONTENT_KEY", "TIP_POSTION");
						commonParamMap.put("CONTENT_VALUE", paramMap.get("contentParValue"));
					}
					if(!CommonUtils.objectIsNull(paramMap.get("contentDetailType")) && "policy".equals(paramMap.get("contentDetailType"))){
						if("offerProduct".equals(paramMap.get("contentParCode"))){
							contentParamMap.put("PROD_OFFER_ID", paramMap.get("contentParValue"));
							contentParamMap.put("PROD_OFFER_NAME", paramMap.get("contentParDesc"));
							contentParamMap.put("PROD_MONEY", "");
							contentParamMap.put("PROD_MONTHS", "");
							contentParamMap.put("PRE_PRESTORE_MONEY", "");
							contentParamMap.put("PRE_GIVE_MONEY", "");
						}
						if("offerProductId".equals(paramMap.get("contentParCode"))){
							contentParamMap.put("PROD_OFFER_ID", paramMap.get("contentParValue"));
						}
						if("offerProductName".equals(paramMap.get("contentParCode"))){
							contentParamMap.put("PROD_OFFER_NAME", paramMap.get("contentParValue"));
						}
						if("ruleProduct".equals(paramMap.get("contentParCode"))){
							contentParamMap.put("PRE_RULE_ID", paramMap.get("contentParValue"));
							contentParamMap.put("PRE_RULE_NAME", paramMap.get("contentParDesc"));
							contentParamMap.put("PRE_MONEY", "");
							contentParamMap.put("PRE_MONTHS", "");
							contentParamMap.put("PRE_PRESTORE_MONEY", "");
							contentParamMap.put("PRE_GIVE_MONEY", "");
						}
						if("groupProduct".equals(paramMap.get("contentParCode"))){
							contentParamMap.put("GROUP_ID", paramMap.get("contentParValue"));
							contentParamMap.put("GROUP_NAME", paramMap.get("contentParDesc"));
							contentParamMap.put("GROUP_MONEY", "");
							contentParamMap.put("GROUP_MONTHS", "");
							contentParamMap.put("GROUP_PRESTORE_MONEY", "");
							contentParamMap.put("GROUP_GIVE_MONEY", "");
						}
					}
					if(!CommonUtils.objectIsNull(commonParamMap)){
						commonParamList.add(commonParamMap);
					}
				}
				if(!CommonUtils.objectIsNull(contentParamMap)){
					contentParamList.add(contentParamMap);
				}
			}
			if(!CommonUtils.objectIsNull(contentParamList)){
				contentMap.put("CONTENT_KEY", "POLICY_LIST");
				contentMap.put("CONTENT_VALUE", contentParamList);
				commonParamList.add(contentMap);
			}
		}	
		return commonParamList;
	}
	
	/**
	 * 组装运营位节点报文
	* @date: 2016-10-1 
	* @author: zhaoyue 
	* @title: packetPositionInfo 
	* @param marketCasePacketPojoMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> packetPositionInfo(
			Map<String, Object> inParam,Map<String, Object> marketCasePacketPojoMap, Map<String, Object> userLabelMap, Map<String, Object> userMsgMap){
	   
		List<Map<String,Object>> positionList = new ArrayList<Map<String,Object>>();
		//组装营销案报文
		for(String key:marketCasePacketPojoMap.keySet()){
			Map<String,Object> marketCaseMap = new HashMap<String,Object>();
			marketCaseMap.put(Const.PACKET_PARAM_NODE_ACT_LIST, this.packetMarketCaseInfo(inParam,key, marketCasePacketPojoMap, userLabelMap, userMsgMap));
			marketCaseMap.put(Const.PACKET_PARAM_NODE_POSITION_ID,key);
			positionList.add(marketCaseMap);
		}
		return positionList;
	}
	
	/** 转换参数列表
	* @date: 2016-12-3 
	* @author: wangpei
	* @title: packetCustTaskList 
	* @param channelTaskList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected List<Map<String, Object>> packetReturnList(List<Map<String,Object>> channelTaskList){
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		if (!CommonUtils.objectIsNull(channelTaskList)) {
			for (Map<String, Object> map : channelTaskList) {
				Map<String, Object> o = new HashMap<String, Object>();
				for(Map.Entry<String, Object> e:map.entrySet()){
					o.put(CommonUtils.camelToUnderline(e.getKey()), e.getValue());
				}
				outList.add(o);
			}
		}
		return outList;
	}

	/**
	 * 组装用户标签
	* @date: 2016-10-28 
	* @author: yangwl
	* @title: packetUserLabel 
	* @param marketCasePacketPojo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> packetUserLabel(IMarketCasePacketPojo marketCasePacketPojo, Map<String, Object> userLabelMapInfo, Map<String, Object> userMsgMap){
		List<Map<String,Object>> marketContentList = (List<Map<String,Object>>)marketCasePacketPojo.getContentMap().get("marketCaseContent");
		Map<String, Object> userLabelInfo = userLabelMapInfo;
		Map<String, String> custGroupLabel = marketCasePacketPojo.getLabelInfo();
		List<Map<String,Object>> userMapList = new ArrayList<Map<String, Object>>();
		log.debug("====packetUserLabel===userMsgMap=", userMsgMap);
		log.debug("====packetUserLabel===userLabelMapInfo=", userLabelMapInfo);
		//组装标签信息
		if(!CommonUtils.objectIsNull(marketContentList) ){
			for(Map<String,Object> marketContentMap:marketContentList){
				log.debug("====packetUserLabel===marketContentMap==", marketContentMap);
				List<Map<String, Object>> paramsList = (List<Map<String, Object>>)marketContentMap.get("params");
				log.debug("====packetUserLabel===paramsList==", paramsList);
				for(Map<String, Object> paramMap:paramsList){
					log.debug("====packetUserLabel===paramMap==", paramMap);
					if("showLabel".equals(paramMap.get("contentParCode"))){
						Map<String, Object> userLabelMap = new HashMap<String, Object>();
						String key = (String)paramMap.get("contentParValue");
						userLabelMap.put("ORDER_NO", (String)paramMap.get("batchNo"));
						userLabelMap.put("USER_LABEL_KEY", key);
						userLabelMap.put("USER_LABEL_NAME", paramMap.get("contentParDesc"));
						if (!CommonUtils.objectIsNull(custGroupLabel) && !CommonUtils.objectIsNull(custGroupLabel.get(key))) {
							userLabelMap.put("USER_LABEL_VALUE", custGroupLabel.get(key));
						}else if(userLabelInfo!=null && !CommonUtils.objectIsNull(userLabelInfo.get(key))){
							userLabelMap.put("USER_LABEL_VALUE", userLabelInfo.get(key));
						}else if(userMsgMap!=null){
							String camelValue = CommonUtils.toCamelModel(key);
							String userMsgLabel = (String)userMsgMap.get(camelValue);
							if(!CommonUtils.objectIsNull(userMsgLabel)){
								userLabelMap.put("USER_LABEL_VALUE", userMsgLabel);
							}else{
								userLabelMap.put("USER_LABEL_VALUE", "");
							}
						}else{
							userLabelMap.put("USER_LABEL_VALUE", "");
						}
						log.debug("====packetUserLabel===userLabelMap==", userLabelMap);
						userMapList.add(userLabelMap);
					}
				}	
			}
		}	
		return userMapList;
	}

	/**
	 * 替换内容中的标签数据
	* @date: 2016-11-22 
	* @author: yangwl
	* @title: replaceContentInLable 
	* @param contentInfo
	* @param userLabelMapInfo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected String replaceContentInLable(String contentInfo, Map<String, Object> userLabelMapInfo, Map<String, Object> userMsgMap,Map<String, String> custGroupLabel){
		if(!CommonUtils.objectIsNull(userLabelMapInfo)){
			for(Map.Entry<String, Object> label : userLabelMapInfo.entrySet()){
				contentInfo = contentInfo.replaceAll((String)label.getKey(), (String)label.getValue());
			}
		}
		if(!CommonUtils.objectIsNull(userMsgMap)){
			for(Map.Entry<String, Object> label : userMsgMap.entrySet()){
				String upperKey = CommonUtils.camelToUnderline((String)label.getKey());
				contentInfo = contentInfo.replaceAll(upperKey, (String)label.getValue());
			}
		}
		if(!CommonUtils.objectIsNull(custGroupLabel)){
			for(Map.Entry<String, String> label : custGroupLabel.entrySet()){
				contentInfo = contentInfo.replaceAll((String)label.getKey(), label.getValue());
			}
		}
		return contentInfo;
	}

	/**
	 * 渠道任务客户列表转换为JSON报文
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: toJsonCustListFromChannelTask 
	* @param marketCaseMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> toJsonCustListFromChannelTask(Map<String, Object> marketCaseMap) throws StrategyError {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		List<Map<String, Object>> positionInfoList = new ArrayList<Map<String, Object>>();
		
		Set<String> positionIdSet = marketCaseMap.keySet();
		Iterator<String> it	= positionIdSet.iterator(); 
		while(it.hasNext()){
			Map<String, Object> positionInfoMap = new HashMap<String, Object>();
			String key = it.next();
			List<Map<String, Object>> channelTaskList = (List<Map<String, Object>>)marketCaseMap.get(key);
			positionInfoMap.put("POSITION_ID", key);
			if(!CommonUtils.objectIsNull(channelTaskList) && channelTaskList.size() > 0){
				positionInfoMap.put("TASK_NUM", Long.toString(this.countPositionTaskNum(channelTaskList)) );
				positionInfoMap.put("CUST_NUM", channelTaskList.size()+"");
				positionInfoMap.put("CUST_LIST",  this.packetReturnList(channelTaskList));
			}else{
				positionInfoMap.put("TASK_NUM", "0" );
				positionInfoMap.put("CUST_LIST",  new ArrayList<Map<String, Object>>());
			}
			positionInfoList.add(positionInfoMap);
		}
		returnMap.put("POSITION_INFO_LIST", positionInfoList);
		
		return returnMap;
	}

	/**
	 * 营销案内容转json字符串报文
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: toJsonFromMarketCase 
	* @param inParam
	* @param marketCasePacketPojoMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> toJsonFromMarketCase(Map<String, Object> inParam,Map<String, Object> marketCasePacketPojoMap) throws StrategyError{
		Map<String,Object> returnMap = new HashMap<String,Object>();
		//组装运营位报文
		returnMap.put(Const.PACKET_PARAM_NODE_POSITION_INFO_LIST, this.packetPositionInfo(inParam,(Map<String, Object>)marketCasePacketPojoMap.get("positionInfoMap"), (Map<String, Object>)marketCasePacketPojoMap.get("userLabelMap"),(Map<String, Object>)marketCasePacketPojoMap.get("userInfoMap")));
		//组装用户接触记录  marketCasePacketPojoMap.get(Const.PACKET_PARAM_NODE_TOUCH_HIS_LIST)
		returnMap.put(Const.PACKET_PARAM_NODE_TOUCH_HIS_LIST, new ArrayList<Map<String, Object>>());
		return returnMap;
	}

	/**
	 * 渠道任务营销案列表转换为JSON报文
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: toJsonMarketCaseListFromChannelTask 
	* @param marketCaseList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> toJsonMarketCaseListFromChannelTask(Map<String, Object> marketCaseMap) throws StrategyError{
		Map<String, Object> returnMap = new HashMap<String, Object>();
		List<Map<String, Object>> positionInfoList = new ArrayList<Map<String, Object>>();
		
		for(Map.Entry<String, Object> map : marketCaseMap.entrySet()){
			Map<String, Object> positionInfoMap = new HashMap<String, Object>();
			String key = map.getKey();
			List<Map<String, Object>> channelTaskList = (List<Map<String, Object>>)map.getValue();
			positionInfoMap.put("POSITION_ID", key);
			if(!CommonUtils.objectIsNull(channelTaskList) && channelTaskList.size() > 0){
				positionInfoMap.put("TASK_NUM", Long.toString(this.countPositionTaskNum(channelTaskList)) );
				positionInfoMap.put("ACT_LIST",  this.packetReturnList(channelTaskList));
			}else{
				positionInfoMap.put("TASK_NUM", "0");
				positionInfoMap.put("ACT_LIST",  new ArrayList<Map<String, Object>>());
			}
			
			positionInfoList.add(positionInfoMap);
		}
		
		returnMap.put("POSITION_INFO_LIST", positionInfoList);
		
		return returnMap;
	}

	/**
	 * 渠道任务任务列表转换为JSON报文
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: toJsonTaskListFromChannelTask 
	* @param marketCaseMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> toJsonTaskListFromChannelTask(Map<String, Object> marketCaseMap) throws StrategyError {
		Map<String, Object> returnMap = new HashMap<String, Object>();
		List<Map<String, Object>> positionInfoList = new ArrayList<Map<String, Object>>();
		
		Set<String> positionIdSet = marketCaseMap.keySet();
		Iterator<String> it	= positionIdSet.iterator(); 
		while(it.hasNext()){
			Map<String, Object> positionInfoMap = new HashMap<String, Object>();
			String key = it.next();
			List<Map<String, Object>> channelTaskList = (List<Map<String, Object>>)marketCaseMap.get(key);
			positionInfoMap.put("POSITION_ID", key);
			if(!CommonUtils.objectIsNull(channelTaskList) && channelTaskList.size() > 0){
				positionInfoMap.put("TASK_NUM",  Integer.toString(channelTaskList.size()) );
				positionInfoMap.put("TASK_LIST",  this.packetReturnList(channelTaskList));
			}else{
				positionInfoMap.put("TASK_NUM", "0");
				positionInfoMap.put("TASK_LIST",  new ArrayList<Map<String, Object>>());
			}
			positionInfoList.add(positionInfoMap);
		}
		returnMap.put("POSITION_INFO_LIST", positionInfoList);
		
		return returnMap;
	}

}
