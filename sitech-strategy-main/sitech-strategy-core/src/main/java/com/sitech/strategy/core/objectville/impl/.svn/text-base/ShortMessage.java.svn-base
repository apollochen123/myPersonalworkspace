package com.sitech.strategy.core.objectville.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.assemblymsgstructure.IAssemblyMsgStructure;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.core.objectville.inter.IShortMessage;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;
import com.sitech.strategy.persist.capacity.proxy.IMsgSender;

/**
 * 短信对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: ShortMessage 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class ShortMessage extends BaseClass implements IShortMessage {
	/**
	 * 组装消息结构对象
	 */
	protected IAssemblyMsgStructure assemblyMsgStructure;
	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * 规则对象
	 */
	protected IRule rule;
	/**
	 * 营销案数据查询对象
	 */
	protected IDataSelector.IMarketCaseSelector marketCaseSelector;
	/**
	 * 消息发送器对象
	 */
	protected IMsgSender.IBatchPushSender batchPushSender;
	/**
	 * 短信删除对象
	 */
	protected IDataDeleter.IShortMessageDeleter ShortMessageDeleter;
	/**
	 *短信插入对象
	 */
	protected IDataInsertor.IShortMessageInsertor ShortMessageInsertor;
	/**
	 *短信选择对象
	 */
	protected IDataSelector.IShortMessageSelector ShortMessageSelector;
	/**
	 *短信修改对象
	 */
	protected IDataUpdater.IShortMessageUpdater ShortMessageUpdater;
	/**
	 * 用户查询
	 */
	protected IDataSelector.IUserSelector userSelector;
	/**
	 * 查询内部类对象
	 */
	protected QueryParamSettle queryParamSettle = new QueryParamSettle();
	
	/**
	 * 
	* @date: 2017-1-16 
	* @author: tangaq
	* @title: setAssemblyMsgStructure 
	* @param assemblyMsgStructure 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAssemblyMsgStructure(IAssemblyMsgStructure assemblyMsgStructure) {
		this.assemblyMsgStructure = assemblyMsgStructure;
	}

	/**
	 * 
	* @date: 2017-1-16 
	* @author: tangaq
	* @title: setBatchPushSender 
	* @param batchPushSender 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBatchPushSender(IMsgSender.IBatchPushSender batchPushSender) {
		this.batchPushSender = batchPushSender;
	}

	/**
	 * 
	* @date: 2017-1-12 
	* @author: tangaq
	* @title: setMarketCase 
	* @param marketCase 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCase(IMarketCase marketCase) {
		this.marketCase = marketCase;
	}
	
	/**
	 * 
	* @date: 2017-1-12 
	* @author: tangaq
	* @title: setMarketCaseSelector 
	* @param marketCaseSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseSelector(
			IDataSelector.IMarketCaseSelector marketCaseSelector) {
		this.marketCaseSelector = marketCaseSelector;
	}

	/**
	 * 
	* @date: 2017-1-12 
	* @author: tangaq
	* @title: setRule 
	* @param rule 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRule(IRule rule) {
		this.rule = rule;
	}

	/**
	 * 
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: setShortMessageDeleter 
	* @param shortMessageDeleter 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setShortMessageDeleter(
			IDataDeleter.IShortMessageDeleter shortMessageDeleter) {
		ShortMessageDeleter = shortMessageDeleter;
	}
	
	/**
	 * 
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: setShortMessageInsertor 
	* @param shortMessageInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setShortMessageInsertor(
			IDataInsertor.IShortMessageInsertor shortMessageInsertor) {
		ShortMessageInsertor = shortMessageInsertor;
	}
	
	/**
	 * 
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: setShortMessageSelector 
	* @param shortMessageSelector 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setShortMessageSelector(
			IDataSelector.IShortMessageSelector shortMessageSelector) {
		ShortMessageSelector = shortMessageSelector;
	}
	
	/**
	 * 
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: setShortMessageUpdater 
	* @param shortMessageUpdater 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setShortMessageUpdater(
			IDataUpdater.IShortMessageUpdater shortMessageUpdater) {
		ShortMessageUpdater = shortMessageUpdater;
	}
	
    /**
     * 
    * @date: 2017-2-28 
    * @author: tangaq
    * @title: setUserSelector 
    * @param userSelector 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public void setUserSelector(IDataSelector.IUserSelector userSelector) {
		this.userSelector = userSelector;
	}

	/**
	 * 添加短信接入码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: addShortMessageAccessCode 
	* @param inParam
	* @param tempInParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addShortMessageAccessCode(Map<String, Object> inParam,
			Map<String, Object> tempInParam) throws StrategyError {
		tempInParam.putAll(inParam);
		ShortMessageInsertor.insertShortMessageAccessCode(inParam, tempInParam);
	}
	
	/**
	 * 查询短信接入码列表
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: selectShortMessageAccessCodeList 
	* @param inParam
	* @param queryFilter
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryShortMessageAccessCodeList(
			Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError{
		queryParamSettle.settleQueryShortMessageAccessCodeListParam(inParam,queryFilter);
		List<Map<String,Object>> shortMessageCodeList = ShortMessageSelector.selectShortMessageAccessCodeList(inParam, queryFilter);
		return shortMessageCodeList;
	}
	
	/**
	 * 移除短信接入码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: removeShortMessageAccessCode 
	* @param inParam
	* @param tempInParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeShortMessageAccessCode(Map<String, Object> inParam,
			Map<String, Object> tempInParam) throws StrategyError{
		tempInParam.putAll(inParam);
		ShortMessageDeleter.deleteShortMessageAccessCode(inParam, tempInParam);
	}
	
	/**
	 * 短信模拟发送
	* @date: 2017-1-12 
	* @author: tangaq
	* @title: sendShortMessageSimulation 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> sendShortMessageSimulation(Map<String, Object> inParam,
			Map<String, Object> tempInParam) throws StrategyError {
		Map<String,Object> outParam = new HashMap<String,Object>();
	    log.info("start sendShortMessageSimulation",inParam);
		Map<String,Object> userMap = this.getUserInfoByServiceNbr(inParam);
	    log.info("show ", userMap);
		if(CommonUtils.objectIsNull(userMap)){
			outParam.put("result", Const.TRUE_INT);
			return outParam;
		}
	
		MarketCaseCachePojo marketCaseCachePojo = marketCaseSelector.getMarketCaseDetailFromCache(inParam);
		Map<String,Object> custGroupMap = (Map<String,Object>)marketCaseCachePojo.getCustGroupMap();
		List<String> sendContentList = new ArrayList<String>();
		if(!CommonUtils.objectIsNull(custGroupMap)){
			for(String custGroupId : custGroupMap.keySet()){
 				inParam.put("custGroupId", ((Map<String,Object>)custGroupMap.get(custGroupId)).get("custGroupId"));
				Map<String,Object> marketCaseCasheMap = this.getMarketCaseInfoFromCashe(inParam, marketCaseCachePojo);
				log.info("show  marketCaseCasheMap", marketCaseCasheMap);
				Boolean flag = false;
				String sendContentStr = (String)marketCaseCasheMap.get("sendContent") == null?"":(String)marketCaseCasheMap.get("sendContent");
				//判断每个客户群下中配的短信内容是否一样
				if(!CommonUtils.objectIsNull(sendContentStr)){
				      for(String str : sendContentList){
						 if(str.equals(sendContentStr)){flag = true;}
					  }
				}
				sendContentList.add(sendContentStr);
				if(flag == false){
					Map<String,Object>  msgMap = this.settleShortMessageSimulationParam(inParam, marketCaseCasheMap);
					msgMap.put("regionCode",(String)userMap.get("userRegionCode"));
					Map<String,Object>  msg = assemblyMsgStructure.getBatchPushMsgStructure(msgMap);
					log.info("message", msg);
					this.settleShortMessageSimulationKafkaParam(msg);
				}
			}
		}
		return outParam;
		
	}
	
	/**
	 * 更新短信接入码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: updateShortMessageAccessCode 
	* @param inParam
	* @param tempInParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateShortMessageAccessCode(Map<String, Object> inParam,
			Map<String, Object> tempInParam) throws StrategyError{
		tempInParam.putAll(inParam);
		ShortMessageUpdater.updateShortMessageAccessCode(inParam, tempInParam);
	}

	/**
	 * 从缓存中获取营销案信息
	* @date: 2017-1-12 
	* @author: tangaq
	* @title: getMarketCaseInfoFromCashe 
	* @param marketCaseCachePojo
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getMarketCaseInfoFromCashe(Map<String,Object> tempInParam,MarketCaseCachePojo marketCaseCachePojo) throws StrategyError{
		Map<String,Object> marketCaseMap =  marketCaseCachePojo.getMarketCaseMap();
		Map<String,Object> contentMap = marketCaseCachePojo.getContentMap();
		Map<String,Object> marketCaseRelMap = (Map<String,Object>)(marketCaseCachePojo.getMarketCaseRel()).get(Const.COMPONENT_TYPE_MARKETCASE);
		Map<String,Object> channelRelMap = marketCase.getChannelIdFromMarketCaseRel(tempInParam,marketCaseRelMap);
		Map<String,Object> tempParam = new HashMap<String,Object>();
	    log.info("marketCaseMap", marketCaseMap);
	    log.info("contentMap", contentMap);
	    log.info("marketCaseRelMap", marketCaseRelMap);
	    log.info("channelRelMap", channelRelMap);
		for(Map.Entry<String, Object> chEntry : channelRelMap.entrySet()){
			String channelId = chEntry.getKey();
			tempParam.put("channelId", channelId);
			Map<String,Object> positionRelMap = (Map<String,Object>)((Map<String,Object>)channelRelMap.get(channelId)).get(Const.COMPONENT_TYPE_POSITION);
			log.info("positionRelMap", positionRelMap);
			for(Map.Entry<String, Object> poEntry : positionRelMap.entrySet()){
				String positionId = poEntry.getKey();
				tempParam.put("positionId", positionId);
				
				List<String> contentIdList = (List<String>)((Map<String,Object>)positionRelMap.get(positionId)).get(Const.COMPONENT_TYPE_CONTENT);
				Map<String, Object> check = rule.isPassRule(new HashMap<String,Object>(),new HashMap<String,Object>(), new HashMap<String,Object>(), new HashMap<String,Object>(),tempParam,new HashMap<String,Object>(),new HashMap<String,Object>());
				boolean checkFlag = (Boolean) check.get("checkFlag");
				if(checkFlag){
					for(String contentId : contentIdList){
						
						List<Map<String,Object>> contentDetailList = (List<Map<String,Object>>)contentMap.get(contentId);
						for(Map<String,Object> contentDetailMap : contentDetailList){
							List<Map<String,String>> paramsList = (List<Map<String,String>>)contentDetailMap.get("params");
							log.info("get paramsList", paramsList);
							for(Map<String,String> param: paramsList){
								if("sendTime".equals(param.get("contentParCode"))){
									tempParam.put("beginDate", param.get("contentParValue"));
								}else if("marketingTerm".equals(param.get("contentParCode"))){
									tempParam.put("marketingDescription", param.get("contentParValue"));
									tempParam.put("sendContent", param.get("contentParValue"));
								}else if("flowCode".equals(param.get("contentParCode"))){
									tempParam.put("fromTel", param.get("contentParValue"));
								}
							}
						}
						tempParam.put("contentId", contentId);
						String taskId = SequenceUtil.getSequence();
						tempParam.put("taskId", taskId);
						
					}
				}
			}
		}
		tempParam.put("serviceNbr", tempInParam.get("phoneNo"));
		tempParam.put("actId", tempInParam.get("marketCaseId"));
		tempParam.putAll(marketCaseMap);
		log.info("get  tempParam", tempParam);
		return tempParam;
	}
	
	/**
	 * 根据服务号码查询用户信息
	* @date: 2017-2-28 
	* @author: tangaq
	* @title: getUserInfoByServiceNbr 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getUserInfoByServiceNbr(Map<String,Object> tempInParam){
		Map<String,Object> outMap = new HashMap<String,Object>();
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setServiceNbr((String)tempInParam.get("phoneNo"));
		List<Map<String,Object>> userInfoList = userSelector.selectUserInfoList(tempInParam,queryFilter);
		String userRegionCode = "";
		if(!CommonUtils.objectIsNull(userInfoList)){
	       for(Map<String,Object> userMap:userInfoList){
	    	   userRegionCode = userMap.get("regionCode").toString();
	    	   outMap.put("userRegionCode", userRegionCode);
	       }
		}
		
		return outMap;
	}
	
	/**
	 * 短信模拟发送kafka消息处理
	* @date: 2017-1-16 
	* @author: tangaq
	* @title: settleShortMessageSimulationKafkaParam 
	* @param msgMap 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void settleShortMessageSimulationKafkaParam(Map<String,Object> msgMap) throws StrategyError{
		log.info("get msg", msgMap);
		batchPushSender.sendMsgSimulation(msgMap);
	}
	
	/**
	 * 模拟发送短信参数处理
	* @date: 2017-1-12 
	* @author: tangaq
	* @title: settleShortMessageSimulationParam 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> settleShortMessageSimulationParam(Map<String,Object> inParam,Map<String,Object> tempInParam){
		log.info("settleShortMessageSimulationParam  get inParam:inParam ", inParam);
		log.info("settleShortMessageSimulationParam get tempInParam", tempInParam);
		String taskId = (String)tempInParam.get("taskId");
		
		tempInParam.put("seqId", taskId);
		tempInParam.put("taskId", taskId);
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.putAll(tempInParam);
		paramMap.put("createTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));
		return paramMap;
	}

	/**
	 * 查询参数整理
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: QueryParamSettle 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	protected class QueryParamSettle{
		/**
		 * 处理，查询客户群列表参数
		* @date: 2016-10-17 
		* @author: wangth
		* @Title: settleQueryshortMessageAccessCodeListParam 
		* @param inParam
		* @param queryFilter 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@SuppressWarnings("unchecked")
		protected void settleQueryShortMessageAccessCodeListParam(Map<String,Object> inParam,IQueryFilter queryFilter){
			queryFilter.setAccessCode((String)inParam.get("accessCode"));
			queryFilter.setAccessCodeServiceType((String)inParam.get("serType"));
			if(!CommonUtils.objectIsNull(((List<String>)inParam.get("keyWords")))){
				List<String> keyWords = ((List<String>)inParam.get("keyWords"));
				queryFilter.setKeyWords(keyWords);
			}
		}
	}
}
