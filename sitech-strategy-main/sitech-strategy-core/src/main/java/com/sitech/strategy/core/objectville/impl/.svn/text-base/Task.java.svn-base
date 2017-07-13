package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.ICustGroup;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.objectville.inter.IProductCommodity;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.core.objectville.inter.ITask;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;
import com.sitech.strategy.persist.capacity.proxy.IMsgSender;

/**渠道任务
 * Create on 2016-11-14
 * @author: wangpei
 * @Title:ChannelTask
 * @Description：
 * @version 1.0
 * update_data: update_author: update_note:
 */
public class Task extends BaseClass implements ITask,Serializable{
	/**
	 * 登录工号查询
	 */
	protected IDataSelector.ILoginSelector loginSelector;
	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * 渠道任务发送
	 */
	protected IMsgSender.IChannelTaskSender channelTaskSender;
	/**
	 * 客户群对象
	 */
	protected ICustGroup custGroup;
	/**
	 * 产商品中心对象
	 */
	protected IProductCommodity productCommodity;
	/**
	 * 进程更新对象
	 */
	protected IDataUpdater.ISystemDealUpdater systemDealUpdater;
	/**
	 * 进程插入对象
	 */
	protected IDataInsertor.ISystemDealInsertor systemDealInsertor;
	/**
	 * 任务数据插入对象
	 */
	protected IDataInsertor.ITaskInsertor taskInsertor;
	/**
	 * 任务数据查询对象
	 */
	protected IDataSelector.ITaskSelector taskSelector;
	/**
	 * 任务数据修改对象
	 */
	protected IDataUpdater.ITaskUpdater taskUpdater;
	/**
	 * 规则
	 */
	protected IRule rule;
	
	/**
	 * 用户数据查询对象
	 */
	protected IDataSelector.IUserSelector userSelector;
	
	/**
	 * 反馈查询对象
	 */
	protected IDataSelector.ICoupleBackSelector coupleBackSelector;
	
	/**
	 * 系统查询
	 */
	protected IDataSelector.ISystemDealSelector systemDealSelector;

	/** 
	 * @date: 2016-11-15 
	 * @author: wangpei
	 * @title: setChannelTaskSender 
	 * @param channelTaskSender the channelTaskSender to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setChannelTaskSender(IMsgSender.IChannelTaskSender channelTaskSender) {
		this.channelTaskSender = channelTaskSender;
	}

	/** 
	* @date: 2017-3-1 
	* @author: wangpei
	* @title: setCustGroup 
	* @param custGroup 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setCustGroup(ICustGroup custGroup) {
		this.custGroup = custGroup;
	}

	/** 
	 * @date: 2016-11-14 
	 * @author: wangpei
	 * @title: setLoginSelector 
	 * @param loginSelector the loginSelector to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setLoginSelector(IDataSelector.ILoginSelector loginSelector) {
		this.loginSelector = loginSelector;
	}

	/** 
	 * @date: 2016-11-14 
	 * @author: wangpei
	 * @title: setMarketCase 
	 * @param marketCase the marketCase to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setMarketCase(IMarketCase marketCase) {
		this.marketCase = marketCase;
	}

	/** 
	* @date: 2017-1-18 
	* @author: wangpei
	* @title: setProductCommodity 
	* @param productCommodity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setProductCommodity(IProductCommodity productCommodity) {
		this.productCommodity = productCommodity;
	}

	/** 
	 * @date: 2016-11-15 
	 * @author: wangpei
	 * @title: setRule 
	 * @param rule the rule to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setRule(IRule rule) {
		this.rule = rule;
	}
	
	/**
	 * 
	* @date: 2016-12-22 
	* @author: zhangjj_crmpd
	* @title: setSystemDealUpdater 
	* @param systemDealUpdater 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSystemDealUpdater(
			IDataUpdater.ISystemDealUpdater systemDealUpdater) {
		this.systemDealUpdater = systemDealUpdater;
	}
	
	/**
	 * 
	* @date: 2016-12-22 
	* @author: zhangjj_crmpd
	* @title: setSystemDealInsertor 
	* @param systemDealInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSystemDealInsertor(
			IDataInsertor.ISystemDealInsertor systemDealInsertor) {
		this.systemDealInsertor = systemDealInsertor;
	}

	/** 
	 * @date: 2016-11-14 
	 * @author: wangpei
	 * @title: setTaskInsertor 
	 * @param taskInsertor the taskInsertor to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setTaskInsertor(IDataInsertor.ITaskInsertor taskInsertor) {
		this.taskInsertor = taskInsertor;
	}

	/** 
	 * @date: 2016-12-1 
	 * @author: wangpei
	 * @title: setTaskSelector 
	 * @param taskSelector the taskSelector to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setTaskSelector(IDataSelector.ITaskSelector taskSelector) {
		this.taskSelector = taskSelector;
	}

	/** 
	 * @date: 2016-12-21 
	 * @author: wangpei
	 * @title: setTaskUpdater 
	 * @param taskUpdater the taskUpdater to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setTaskUpdater(IDataUpdater.ITaskUpdater taskUpdater) {
		this.taskUpdater = taskUpdater;
	}

	/** 
	 * @date: 2016-11-14 
	 * @author: wangpei
	 * @title: setUserSelector 
	 * @param userSelector the userSelector to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setUserSelector(IDataSelector.IUserSelector userSelector) {
		this.userSelector = userSelector;
	}
	
	/**
	 * 
	* @date: 2017-1-19 
	* @author: zhangjj_crmpd
	* @title: setCoupleBackSelector 
	* @param coupleBackSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCoupleBackSelector(
			IDataSelector.ICoupleBackSelector coupleBackSelector) {
		this.coupleBackSelector = coupleBackSelector;
	}
	
	/**
	 * 
	* @date: 2017-1-25 
	* @author: zhangjj_crmpd
	* @title: setSystemDealSelector 
	* @param systemDealSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSystemDealSelector(
			IDataSelector.ISystemDealSelector systemDealSelector) {
		this.systemDealSelector = systemDealSelector;
	}

	/** 
	* @date: 2017-1-17 
	* @author: wangpei
	* @title: addProcessDataByTaskSynCache 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void addProcessDataByTaskSynCache()throws StrategyError {
		String createSeq = null;
		do {
			createSeq = taskSelector.getChannelTaskSynCache();
			if (!CommonUtils.objectIsNull(createSeq)) {
				log.info("=addProcessDataByTaskSynCache==createSeq==", createSeq);
				Map<String, Object> tempInParam = new HashMap<String, Object>();
				tempInParam.put("serialId", SequenceUtil.getSequence());
				tempInParam.put("busiId", createSeq);
				tempInParam.put("busiType", Const.BUSI_TYPE_SEQ);
				tempInParam.put("processNo", Const.SHELLPROCESS_NO_SYNCHANNELTASK);
				tempInParam.put("processName", Const.SHELLPROCESS_NAME_SYNCHANNELTASK);
				tempInParam.put("statusCode", "00");
				tempInParam.put("updateTime", new Date());
				systemDealInsertor.insertShellProcessExecuteInfo(tempInParam);
			}
		}while(!CommonUtils.objectIsNull(createSeq));
		
	}

	/** 关闭推荐任务
	* @date: 2016-12-1 
	* @author: wangpei
	* @title: closeRecommonedTask 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void closeRecommonedTask(Map<String, Object> tempInParam) throws StrategyError {
		if (!CommonUtils.objectIsNull(tempInParam)){
			String marketCaseId = (String) tempInParam.get("marketCaseId");
			String channelId = (String) tempInParam.get("channelId");
			String idNo = (String) tempInParam.get("idNo");
			Map<String, Object> queryParam = new HashMap<String, Object>();
			queryParam.put("idNo", idNo);
			Map<String,String> userMsgMap = userSelector.selectUserInfoByIdNo(queryParam);
			if (CommonUtils.objectIsNull(userMsgMap)) {
				return;
			}
			if ("06".equals(channelId)) {
				Map<String, Object> msgParam = new HashMap<String, Object>();
				msgParam.put("actId", marketCaseId);
				msgParam.put("regionCode", userMsgMap.get("regionCode"));
				msgParam.put("idNo", idNo);
				msgParam.put("channelId", channelId);
				msgParam.put("serviceNbr", userMsgMap.get("serviceNbr"));
				channelTaskSender.sendChannelTaskCloseMsg(msgParam);
			}
			List<String> channelList = Arrays.asList(Const.CHANNEL_GENERATECHANNELTASK);
			if (channelList.contains(channelId)) {
				//修改任务状态
				Map<String, Object> updateParam = new HashMap<String, Object>();
				updateParam.put("statusCode", "06");
				updateParam.put("idNo", idNo);
				updateParam.put("channelId", channelId);
				updateParam.put("marketCaseId", marketCaseId);
				taskUpdater.updateChannelTaskStatus(updateParam);
			}
		}
		
	}

	/** 生成批量push任务
	* @date: 2017-1-18 
	* @author: wangpei
	* @title: generateBatchPushTask 
	* @param tempInParam
	* @param marketCaseCachePojo
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void generateBatchPushTask(Map<String, Object> tempInParam,MarketCaseCachePojo marketCaseCachePojo) throws StrategyError {
		log.info("generateBatchPushTask  marketCaseCachePojo:", marketCaseCachePojo);
		Map<String,Object> marketCaseRelMap = (Map<String,Object>)(marketCaseCachePojo.getMarketCaseRel()).get(Const.COMPONENT_TYPE_MARKETCASE);
		log.info("marketCaseRelMap", marketCaseRelMap);
		Map<String,Object> channelRelMap = marketCase.getChannelIdFromMarketCaseRel(tempInParam,marketCaseRelMap);
		log.info("channelRelMap", channelRelMap);
		Map<String,Object> contentMap = marketCaseCachePojo.getContentMap();
		log.info("contentMap", contentMap);
		Map<String,Object> marketCaseMap = marketCaseCachePojo.getMarketCaseMap();
		log.info("marketCaseMap", marketCaseMap);
		log.info("tempInParam", tempInParam);
		Map<String,String> userInfo = userSelector.selectUserInfoByIdNo(tempInParam);
		//标签数据
		Map<String,String> userLabelInfo = userSelector.selectUserLabelByIdNo(tempInParam);
		//自定义标签
		Map<String,String> custGroupCustomLabel = custGroup.getCustGroupCustomLabel(tempInParam, tempInParam);

		log.info("userInfo", userInfo);
		Map<String,Object> tempParam = this.getTempInParamAtGenerateBatchPushTask(tempInParam,marketCaseCachePojo,contentMap);
		log.info("tempParam", tempParam);
		tempParam.put("marketCaseName", marketCaseMap.get("marketCaseName"));
		String serviceNbr = (String)userInfo.get("serviceNbr");
		if (CommonUtils.objectIsNull(serviceNbr) || serviceNbr.length() != 11) {
			return;
		}
		
		tempParam.put("serviceNbr", serviceNbr);
		tempParam.put("idNo", userInfo.get("idNo"));
		tempParam.put("phoneNo", userInfo.get("phoneNo"));
		tempParam.put("regionCode", userInfo.get("regionCode"));
		List<String> channelList = Arrays.asList(Const.CHANNEL_GENERATEBATCHPUSHTASK);
		for(Map.Entry<String, Object> chEntry : channelRelMap.entrySet()){
			String channelId = chEntry.getKey();
			tempParam.put("channelId", channelId);
			if(!channelList.contains(channelId)){
				continue;
			}
			
			Map<String,Object> positionRelMap = (Map<String,Object>)((Map<String,Object>)channelRelMap.get(channelId)).get(Const.COMPONENT_TYPE_POSITION);
			for(Map.Entry<String, Object> poEntry : positionRelMap.entrySet()){
				String positionId = poEntry.getKey();
				tempParam.put("positionId", positionId);
				List<String> contentIdList = (List<String>)((Map<String,Object>)positionRelMap.get(positionId)).get(Const.COMPONENT_TYPE_CONTENT);
				Map<String, Object> check = rule.isPassRule(new HashMap<String,Object>(),new HashMap<String,Object>(), new HashMap<String,Object>(), new HashMap<String,Object>(),tempParam,new HashMap<String,Object>(),new HashMap<String,Object>());
				boolean checkFlag = (Boolean) check.get("checkFlag");
				if(checkFlag && rule.isPassGrey(tempParam, tempParam, tempParam)){
					for(String contentId : contentIdList){
						
						List<Map<String,Object>> contentDetailList = (List<Map<String,Object>>)contentMap.get(contentId);
						tempParam.put("contentId", contentId);
						String taskId = SequenceUtil.getSequence();
						tempParam.put("taskId", taskId);
						//拼接活动参数
						this.settleContentToBatchTask(tempParam, contentDetailList, userInfo, userLabelInfo, custGroupCustomLabel);
						//插入批量push任务
						this.insertBatchPushTask(tempParam);
						//插入待发送批量push任务
						this.insertWaitSendBatchPushTask(tempParam);
						//插入批量push生成任务数
						this.insertBatchPushCreateTaskCount(tempParam);
						
					}
				}
			}
		}
		
	}
	
	/**
	 * 生成批量push短信任务
	* @date: 2017-4-12 
	* @author: sunliang
	* @title: generateBatchPushMsgTask 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String generateBatchPushMsgTask(Map<String, Object> tempInParam)
			throws StrategyError {
		StringBuffer sb = new StringBuffer();
		
		Map<String,Object> userMap = (Map<String,Object>)tempInParam.get("userMap");
		Map<String,Object> contentMap = (Map<String,Object>)tempInParam.get("contentMap");
		String marketCaseId = (String)contentMap.get("marketCaseId");
		String idNo = (String)userMap.get("idNo");
		String phoneNo = (String)userMap.get("phoneNo");
		String regionCode = (String)userMap.get("regionCode");
		
		sb.append(marketCaseId);
		sb.append(Const.SEPARATOR_16BIT0A);
		sb.append("0");
		sb.append(Const.SEPARATOR_16BIT0A);
		sb.append(phoneNo);
		sb.append(Const.SEPARATOR_16BIT0A);
		sb.append(idNo);
		sb.append(Const.SEPARATOR_16BIT0A);
		sb.append("");
		sb.append(Const.SEPARATOR_16BIT0A);
		sb.append(regionCode);
		sb.append(Const.SEPARATOR_16BIT0A);
		sb.append("000");
		
		return sb.toString();
	}

	/**
	 * 生成批量push套餐任务
	* @date: 2017-4-12 
	* @author: sunliang
	* @title: generateBatchPushProdTask 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String generateBatchPushProdTask(Map<String, Object> tempInParam)
			throws StrategyError {
		StringBuffer sb = new StringBuffer();
		
		Map<String,Object> userMap = (Map<String,Object>)tempInParam.get("userMap");
		String phoneNo = (String)userMap.get("phoneNo");
		sb.append(phoneNo);
		
		return sb.toString();
	}
	
	/**
	 * 生成外呼任务
	* @date: 2017-3-16 
	* @author: sunliang 
	* @title: generateCallTask 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String generateCallTask(Map<String, Object> tempInParam) throws StrategyError {
		
		String phoneNo = (String)tempInParam.get("phoneNo");
		Map<String,Object> contentMap =  (Map<String,Object>)tempInParam.get("contentMap");
		
		StringBuffer sb = new StringBuffer();
		sb.append(phoneNo);
		sb.append("|");
		sb.append(SequenceUtil.getSequence());
		sb.append("|");
		sb.append(contentMap.get("marketCaseId"));
		sb.append("|");
		sb.append(contentMap.get("marketCaseName"));
		sb.append("|");
		sb.append(DateUtil.stringToString((String)contentMap.get("startTime"), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3));
		sb.append("|");
		sb.append(DateUtil.addDays((String)contentMap.get("endTime"), 1, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3));
		sb.append("|");
		sb.append(contentMap.get("marketingTerm"));
		
		return sb.toString();
	}
	
	/** 生成批量push任务
	* @date: 2017-1-18 
	* @author: zhangqia
	* @title: generateBatchPushTaskForHBMob 
	* @param tempInParam
	* @param marketCaseCachePojo
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void generateBatchPushTaskForHBMob(Map<String, Object> tempInParam,MarketCaseCachePojo marketCaseCachePojo) throws StrategyError {
		Map<String,Object> marketCaseRelMap = (Map<String,Object>)(marketCaseCachePojo.getMarketCaseRel()).get(Const.COMPONENT_TYPE_MARKETCASE);
		Map<String,Object> channelRelMap = marketCase.getChannelIdFromMarketCaseRel(tempInParam,marketCaseRelMap);
		Map<String,Object> contentMap = marketCaseCachePojo.getContentMap();
		Map<String,Object> marketCaseMap = marketCaseCachePojo.getMarketCaseMap();
		Map<String,Object> ruleMap =marketCaseCachePojo.getRuleMap();
		Map<String,Object> tempParam = this.getTempInParamAtGenerateBatchPushTask(tempInParam,marketCaseCachePojo,contentMap);
		
		tempParam.put("marketCaseName", marketCaseMap.get("marketCaseName"));
		tempParam.put("regionCode", marketCaseMap.get("regionCode"));
		
		List<String> channelList = Arrays.asList(Const.CHANNEL_GENERATEBATCHPUSHTASK);
		for(Map.Entry<String, Object> chEntry : channelRelMap.entrySet()){
			String channelId = chEntry.getKey();
			tempParam.put("channelId", channelId);
			if(!channelList.contains(channelId)){
				continue;
			}
			
			Map<String,Object> positionRelMap = (Map<String,Object>)((Map<String,Object>)channelRelMap.get(channelId)).get(Const.COMPONENT_TYPE_POSITION);
			for(Map.Entry<String, Object> poEntry : positionRelMap.entrySet()){
				String positionId = poEntry.getKey();
				tempParam.put("positionId", positionId);
				List<String> contentIdList = (List<String>)((Map<String,Object>)positionRelMap.get(positionId)).get(Const.COMPONENT_TYPE_CONTENT);
				List<String> ruleIdList = (List<String>)((Map<String,Object>)positionRelMap.get(positionId)).get(Const.COMPONENT_TYPE_RULE);
				Map<String, Object> check = rule.isPassRule(new HashMap<String,Object>(),new HashMap<String,Object>(), new HashMap<String,Object>(), new HashMap<String,Object>(),tempParam,new HashMap<String,Object>(),new HashMap<String,Object>());
				boolean checkFlag = (Boolean) check.get("checkFlag");
				if(checkFlag){
					List<Map<String,Object>> ruleDetailList=(List<Map<String,Object>>)ruleMap.get(ruleIdList.get(0));
					tempParam.put("ruleDetailList", ruleDetailList);
					for(String contentId : contentIdList){
						
						List<Map<String,Object>> contentDetailList = (List<Map<String,Object>>)contentMap.get(contentId);
						tempParam.put("contentId", contentId);
						tempParam.put("contentDetailList", contentDetailList);
						String taskId = SequenceUtil.getSequence();
						tempParam.put("taskId", taskId);
						
						//插入批量push任务
						this.insertBatchPushTask(tempParam);
						//插入待发送批量push任务
						this.insertWaitSendBatchPushTask(tempParam);
						//插入批量push生成任务数
						this.insertBatchPushCreateTaskCount(tempParam);
						
					}
				}
			}
		}
		
	}
	/** 生成渠道任务
	* @date: 2016-11-14 
	* @author: wangpei
	* @title: generateChannelTask 
	* @param tempInParam
	* @param marketCaseCachePojo 
	* @exception: 
	* @version: 1.0 
	* @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void generateChannelTask(Map<String, Object> tempInParam,MarketCaseCachePojo marketCaseCachePojo) throws StrategyError {
		String idNo = (String) tempInParam.get("idNo");
		//查询用户信息
		Map<String,String> userMsgMap = userSelector.selectUserInfoByIdNo(tempInParam);
		if (CommonUtils.objectIsNull(userMsgMap)) {
			return;
		}
		Map<String,Object> marketCaseRelMap = (Map<String,Object>)(marketCaseCachePojo.getMarketCaseRel()).get(Const.COMPONENT_TYPE_MARKETCASE);
		Map<String,Object> marketCaseBasicMap = marketCaseCachePojo.getMarketCaseMap();
		Map<String,Object> channelRelMap = marketCase.getChannelIdFromMarketCaseRel(tempInParam,marketCaseRelMap);
		if (CommonUtils.objectIsNull(channelRelMap)) {
			return;
		}
		Map<String,Object> contentMap = marketCaseCachePojo.getContentMap();
		Map<String,Object> ruleMap = marketCaseCachePojo.getRuleMap();
		Map<String,Object> tempOutParam = new HashMap<String,Object>();
		tempOutParam.put("idNo", idNo);
		tempOutParam.put("custGroupId", tempInParam.get("custGroupId"));
		tempOutParam.put("marketCaseId", tempInParam.get("marketCaseId"));
		tempOutParam.put("marketCaseType", marketCaseBasicMap.get("marketCaseType"));
		tempOutParam.put("marketCaseBasicMap", marketCaseBasicMap);
		tempOutParam.put("userMsgMap", userMsgMap);
		tempOutParam.put("createSeq", tempInParam.get("createSeq"));
		tempOutParam.put("taskType", tempInParam.get("taskType"));
		addChannelTask(tempOutParam, channelRelMap, contentMap,ruleMap);
		
	}
	
	/**
	 * 获取批量发送内容
	* @date: 2017-4-13 
	* @author: sunliang
	* @title: getBatchPushContentMap 
	* @param marketCaseCachePojo
	* @param marketCaseId
	* @param custGroupId
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getBatchPushContentMap(
			IMarketCaseCachePojo marketCaseCachePojo, String marketCaseId,
			String custGroupId,String taskType) throws StrategyError {
		
		String channelId = "";
		if("batchPushMsg".equals(taskType)){
			channelId = "02";
		} else if("batchPushProd".equals(taskType)) {
			channelId = "01";
		}
		
		System.out.println("==========getBatchPushContentMap.come==============");
		Map<String,Object> retMap = new HashMap<String,Object>();
		Map<String,Object> relMap = (Map<String,Object>)marketCaseCachePojo.getMarketCaseRel();
		Map<String,Object> ruleMap = (Map<String,Object>)marketCaseCachePojo.getRuleMap();
		
		System.out.println("==========getBatchPushContentMap.relMap==============" + relMap);
		Map<String,Object> custRelMap = (Map<String,Object>)((Map<String,Object>)relMap.get(Const.COMPONENT_TYPE_MARKETCASE)).get(marketCaseId);
		System.out.println("==========getBatchPushContentMap.custRelMap==============" + custRelMap);
		Map<String,Object> channelRelMap = (Map<String,Object>)((Map<String,Object>)custRelMap.get(Const.COMPONENT_TYPE_CUSTGROUP)).get(custGroupId);
		System.out.println("==========getBatchPushContentMap.channelRelMap==============" + channelRelMap);
		Map<String,Object> ruleRelMap = (Map<String,Object>)((Map<String,Object>)channelRelMap.get(Const.COMPONENT_TYPE_CHANNEL)).get(channelId);
		System.out.println("==========getBatchPushContentMap.ruleRelMap==============" + ruleRelMap);
		List<String> ruleIdList = (List<String>)ruleRelMap.get(Const.COMPONENT_TYPE_RULE);
		System.out.println("==========getBatchPushContentMap.ruleIdList==============" + ruleIdList.toString());
		
		List<String> selectRuleIdList = new ArrayList<String>();
		for(String ruleId : ruleIdList){
			List<Map<String,Object>> ruleDetailList = (List<Map<String,Object>>)ruleMap.get(ruleId);
			System.out.println("==========getBatchPushContentMap.ruleDetailList==============" + ruleDetailList.toString());
			for(Map<String,Object> ruleDetailMap : ruleDetailList){
				if("unTrouble".equals(ruleDetailMap.get("ruleDetailType"))){
					List<Map<String,String>> paramsList = (List<Map<String,String>>)ruleDetailMap.get("params");
					System.out.println("==========getBatchPushContentMap.paramsList==============" + paramsList.toString());
					for(Map<String,String> param : paramsList){
						if("unTroubleCustType".equals(param.get("ruleParCode"))){
							System.out.println("==========getBatchPushContentMap.param==============" + param.toString());
							selectRuleIdList.add(param.get("ruleParValue"));
						}
					}
				}
			}
		}
		retMap.put("ruleIdList", selectRuleIdList);
		retMap.put("marketCaseId", marketCaseId);
		System.out.println("==========getBatchPushContentMap.end==============" + retMap);
		return retMap;
	}
	
	/**
	 * 获取外呼内容
	* @date: 2017-3-18 
	* @author: sunliang 
	* @title: getCallContentMap 
	* @param marketCaseCachePojo
	* @param marketCaseId
	* @param custGroupId
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getCallContentMap(
			IMarketCaseCachePojo marketCaseCachePojo, String marketCaseId,
			String custGroupId) throws StrategyError {
		Map<String,Object> basicMap = marketCaseCachePojo.getMarketCaseMap();
		
		Map<String,Object> tempParam = new HashMap<String,Object>();
		tempParam.put("channelId", "03");
		String positionId = "POSITION_03_01";
		Map<String,Object> map = marketCase.getContentMapByComponentId(tempParam,custGroupId,marketCaseCachePojo,positionId);
		System.out.println("========getCallContentMap.map========" + map);
		
		Map<String,Object> marketCaseContent0 = ((List<Map<String,Object>>)map.get("marketCaseContent")).get(0);
		Map<String,Object> param0 = ((List<Map<String,Object>>)marketCaseContent0.get("params")).get(0);
		System.out.println("========getCallContentMap.param0.get(contentParValue)========" + param0.get("contentParValue"));

		Map<String,Object> contentMap = new HashMap<String,Object>();
		contentMap.put("marketCaseId", marketCaseId);
		contentMap.put("marketCaseName", basicMap.get("marketCaseName"));
		contentMap.put("startTime", basicMap.get("startTime"));
		contentMap.put("endTime", basicMap.get("endTime"));
		contentMap.put("marketingTerm", param0.get("contentParValue"));
		return contentMap;
	}
	
	/**
	 * 处理调配任务
	* @date: 2016-12-20 
	* @author: zhangjj_crmpd
	* @title: handleTaskAdjust 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> handleTaskAdjust(Map<String, Object> tempInParam)
			throws StrategyError {
		String busiId =  CommonUtils.toString(tempInParam.get("busiId"));
		tempInParam.put("taskAdjustId", busiId.split(Const.SEPARATOR_AND)[0]);
		tempInParam.put("ruleDetailId", busiId.split(Const.SEPARATOR_AND)[1]);
		String taskAdjustId = CommonUtils.toString(tempInParam.get("taskAdjustId"));
		String ruleDetailId = CommonUtils.toString(tempInParam.get("ruleDetailId"));
		//校验规则，校验不通过返回null
		Map<String, Object> ruleDetail = rule.checkTaskAdjustRule(tempInParam);
		if(CommonUtils.objectIsNull(ruleDetail)){
			return null;
		}
		System.out.println("handleTaskAdjust ruleDetail:"+ruleDetail);
		Map<String, Object> adjustInParam = new HashMap<String, Object>();
		//查询调配下发量信息
		ruleDetail.put("parentComponentId", taskAdjustId);
		ruleDetail.put("ruleParCode", CommonUtils.toString(Const.RULE_CODE_TASKADJUST_TOUCHTOTAL));
		ruleDetail.put("ruleDetailId", ruleDetailId);
		List<Map<String, Object>> ruleDetailList = rule.queryRuleDetailByParentComponentId(ruleDetail);
		if(CommonUtils.objectIsNull(ruleDetailList)){
			return null;
		}
		adjustInParam.put("rownum", ruleDetailList.get(0).get("ruleParValue"));
		//查询调配方式
		ruleDetail.clear();
		ruleDetail.put("parentComponentId", taskAdjustId);
		ruleDetail.put("ruleDetailId", ruleDetailId);
		ruleDetail.put("ruleParCode", CommonUtils.toString(Const.RULE_CODE_TASKADJUST_TASKADJUSTTYPE));
		ruleDetailList = rule.queryRuleDetailByParentComponentId(ruleDetail);
		if(CommonUtils.objectIsNull(ruleDetailList)){
			return null;
		}
		adjustInParam.put("serviceNoType", ruleDetailList.get(0).get("ruleParValue"));
		//查询调配信息
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setTaskadjustId(taskAdjustId);
		Map<String, Object> taskAdjust = taskSelector.selectTaskAdjust(tempInParam, queryFilter);
		if(CommonUtils.objectIsNull(taskAdjust)){
			return null;
		}
		//判断按那种调配方式
		if(Const.TASKADJUST_TYPE_TASKID.equals(taskAdjust.get("taskadjustType"))){
			adjustInParam.put("taskIds", CommonUtils.toString(taskAdjust.get("taskadjustContent")));
		}else if(Const.TASKADJUST_TYPE_CONDITION.equals(taskAdjust.get("taskadjustType"))){
			adjustInParam.put("condition", CommonUtils.toString(taskAdjust.get("taskadjustCondition")));
		}else{
			return null;
		}
		System.out.println("handleTaskAdjust adjustInParam:"+adjustInParam);
		taskUpdater.updateChannelTaskServiceNo(adjustInParam);
		tempInParam.put("busiId", taskAdjustId+Const.SEPARATOR_AND+ruleDetailId);
		tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_EXE);
		systemDealUpdater.updateShellProcessExecuteInfo(tempInParam);
		return null;
	}
	
	/**
	 * 查询渠道任务
	* @date: 2016-12-1 
	* @author: zhangjj_crmpd
	* @title: queryChannelTask 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryChannelTask(
			Map<String, Object> tempInParam,IQueryFilter queryFilter) throws StrategyError {
		Map<String,Object> outMap = new HashMap<String, Object>();
		PagingDevice pageDevice = new PagingDevice();
		Integer currentPageCode =Integer.parseInt(CommonUtils.toString(tempInParam.get("currentPageCode")));
		pageDevice.setCurrentPageCode(currentPageCode);
		tempInParam.put("startNum", currentPageCode);
		tempInParam.put("limit", pageDevice.getPerRecordCount());
		Map<String, Object> task = taskSelector.selectChannelTaskListByPage(tempInParam, queryFilter);
		outMap.put("taskList", task.get("result"));
		outMap.put("total",task.get("sum"));
		outMap.put("currentPageCode",currentPageCode);
		return outMap;
	}
	
	/**
	 * 查询营业部任务概况
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: queryDepartmentTaskSurvey 
	* @param inParam
	* @param queryFilter
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryDepartmentTaskSurvey(
			Map<String, Object> tempInParam, IQueryFilter queryFilter) throws StrategyError {
		Map<String,Object> outMap = new HashMap<String, Object>();
		List<Map<String, Object>> task = (List<Map<String, Object>>)taskSelector.selectTaskCountGroupByLoginNo(tempInParam, queryFilter);
		outMap.put("taskList", task);
		return outMap;
	}
	
	/**
	 * 查询调配任务
	* @date: 2017-1-9 
	* @author: zhangjj_crmpd
	* @title: queryTaskAdjustList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryTaskAdjustList(Map<String, Object> inParam,
			IQueryFilter queryFilter) throws StrategyError {
		Map<String, Object> taskAdjustOutParam = new HashMap<String, Object>();
		//查询调配任务表
		List<Map<String, Object>> taskAdjustList = taskSelector.selectTaskAdjustByParam(inParam, queryFilter);
		if(CommonUtils.objectIsNull(taskAdjustList)){
			taskAdjustOutParam.put("taskAdjustList", new ArrayList<Map<String, Object>>());
			return taskAdjustOutParam;
		}
		//查询调配任务规则信息
		queryTaskAdjustAndRule(taskAdjustList);
		taskAdjustOutParam.put("taskAdjustList", taskAdjustList);
		return taskAdjustOutParam;
	}
	
	/**
	 * 查询调配任务进程
	* @date: 2017-1-25 
	* @author: zhangjj_crmpd
	* @title: queryTaskAdjustProcess 
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryTaskAdjustProcess() throws StrategyError {
		//查询进程表数据
		IQueryFilter queryFilter = new QueryFilter();
		Map<String,Object> tempInParam = new HashMap<String, Object>();
		queryFilter.setProcessNo(Const.SHELLPROCESS_NO_TASKADJUST);
		queryFilter.setStatusCode(Const.MARKET_CASE_STATUS_DEFAULT);//状态为未处理的
		return systemDealSelector.selectShellProcessExecuteList(tempInParam, queryFilter);
	}
	
	/**
	 * 任务关闭
	* @date: 2017-1-19 
	* @author: zhangjj_crmpd
	* @title: recommonedTaskClose 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void recommonedTaskClose(Map<String, Object> inParam) throws StrategyError {
		String recommonedClose = null;
		do {
			try {
				recommonedClose = coupleBackSelector.getChannelTaskRecommonedCloseCache();
			} catch (Exception e) {
				log.debug("recommonedClose", "null");
			}
			if (!CommonUtils.objectIsNull(recommonedClose)){
				String closeArr[] = recommonedClose.split(Const.SEPARATOR_COLON);
				if (closeArr.length != 3) continue;
				String marketCaseId = closeArr[0];
				String channelId = closeArr[1];
				String idNo = closeArr[2];
				Map<String, Object> tempInParam = new HashMap<String, Object>();
				tempInParam.put("marketCaseId", marketCaseId);
				tempInParam.put("channelId", channelId);
				tempInParam.put("idNo", idNo);
				closeRecommonedTask(tempInParam);
			}
		} while (!CommonUtils.objectIsNull(recommonedClose));
	}
	
	/**
	 * 保存任务调配信息
	* @date: 2016-12-15 
	* @author: zhangjj_crmpd
	* @title: saveTaskAdjust 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveTaskAdjust(Map<String, Object> inParam)
			throws StrategyError {
		//处理调配表报文
		String taskAdjustId = handleTaskAdjustParam(inParam);
		//处理关系表  调配与规则关系
		String ruleId = handelTaskAjustAndRuleRelation(taskAdjustId,inParam);
		//处理规则信息
		handelTaskAjustRule(ruleId,taskAdjustId,inParam);
		return inParam;
	}
	
	/** 给负责人发通知短信
	* @date: 2017-3-10 
	* @author: wangpei
	* @title: sendNoticeMsgToExector 
	* @param tempOutParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected void sendNoticeMsgToExector(Map<String,Object> tempOutParam) throws StrategyError {
		if (!CommonUtils.objectIsNull(tempOutParam.get("taskExectorNo"))&&!CommonUtils.objectIsNull(tempOutParam.get("taskExectorPhoneNo"))) {
			Map<String,Object> MarketCaseBasicMap = (Map<String,Object>)tempOutParam.get("marketCaseBasicMap");
			Map<String,Object> userMsgMap = (Map<String,Object>)tempOutParam.get("userMsgMap");
			Map<String,Object> tempInParam  = new HashMap<String, Object>();
			tempInParam.put("loginNo",tempOutParam.get("taskExectorNo"));
			tempInParam.put("loginName",tempOutParam.get("taskExectorName"));
			tempInParam.put("phoneNo",tempOutParam.get("taskExectorPhoneNo"));
			tempInParam.put("serviceNbr",userMsgMap.get("serviceNbr"));
			tempInParam.put("marketCaseName",MarketCaseBasicMap.get("marketCaseName"));
			tempInParam.put("marketCaseId",MarketCaseBasicMap.get("marketCaseId"));
			tempInParam.put("regionCode",userMsgMap.get("regionCode"));
			channelTaskSender.sendChannelTaskNoticeMsg(tempInParam);
		}
	}
	/** 获取内容明细参数
	* @date: 2016-11-14 
	* @author: wangpei
	* @title: getPositionContentParams 
	* @param positionContentRel
	* @param contentMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected List<Map<String,Object>> getPositionContentParams(List<String> positionContentId,Map<String,Object> contentMap){
		List<Map<String,Object>> params = new ArrayList<Map<String,Object>>();
		for (String contentId : positionContentId) {
			List<Map<String,Object>> contentDetail = (List<Map<String, Object>>) contentMap.get(contentId);
			for (Map<String, Object> map : contentDetail) {
				List<Map<String, Object>> tempParam = (List<Map<String, Object>>) map.get("params");
				if (!CommonUtils.objectIsNull(tempParam)) {
					params = tempParam;
				}
			}
		}
		return params;
	}
	
	/** 从营销案明细中获取某渠道下配置的运营位
	* @date: 2016-12-1 
	* @author: wangpei
	* @title: getPositionIdByMarketCaseChannelId 
	* @param tempInParam
	* @param marketCaseCachePojo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected List<String> getPositionIdByMarketCaseChannelId(Map<String, Object> tempInParam,MarketCaseCachePojo marketCaseCachePojo){
		String channelId = (String) tempInParam.get("channelId");
		String marketCaseId = (String) tempInParam.get("marketCaseId");
		List<String> channelPositionIds = new ArrayList<String>();
		Map<String, Object> ruleMap = marketCaseCachePojo.getRuleMap();
		Map<String,Object> marketCaseRel = marketCaseCachePojo.getMarketCaseRel();
		if (CommonUtils.objectIsNull(marketCaseRel)) {
			return channelPositionIds;
		}
		Map<String,Object> marketCaseRelMap = (Map<String,Object>)marketCaseRel.get(Const.COMPONENT_TYPE_MARKETCASE);
		if (CommonUtils.objectIsNull(marketCaseRelMap)) {
			return channelPositionIds;
		}
		Map<String,Object> marketCaseDetailRelMap = (Map<String,Object>)marketCaseRelMap.get(marketCaseId);
		if (CommonUtils.objectIsNull(marketCaseDetailRelMap)) {
			return channelPositionIds;
		}
		Map<String,Object> custGroupRelMap = (Map<String, Object>) marketCaseDetailRelMap.get(Const.COMPONENT_TYPE_CUSTGROUP);
		if (CommonUtils.objectIsNull(custGroupRelMap)) {
			return channelPositionIds;
		}
		for (Entry<String, Object> entry : custGroupRelMap.entrySet()) {
			Map<String,Object> custGroupDetailRelMap = (Map<String, Object>) entry.getValue();
			if (CommonUtils.objectIsNull(custGroupDetailRelMap)) {
				continue;
			}
			Map<String,Object> channelRelMap = (Map<String, Object>) custGroupDetailRelMap.get(Const.COMPONENT_TYPE_CHANNEL);
			if (CommonUtils.objectIsNull(channelRelMap)) {
				continue;
			}
			Map<String,Object> channelDetailRelMap = (Map<String, Object>) channelRelMap.get(channelId);
			if (CommonUtils.objectIsNull(channelDetailRelMap)) {
				continue;
			}
			Map<String,Object> positionRelMap = (Map<String, Object>) channelDetailRelMap.get(Const.COMPONENT_TYPE_POSITION);
			if (CommonUtils.objectIsNull(positionRelMap)) {
				continue;
			}
			for (Map.Entry<String,Object> po: positionRelMap.entrySet()) {
				channelPositionIds.add(po.getKey());
			}
		}
		return channelPositionIds;
	}
	
	
	/**
	 * 获取临时参数
	* @date: 2016-12-22 
	* @author: sunliang 
	* @title: getTempInParamAtGenerateBatchPushTask 
	* @param tempInParam
	* @param marketCaseCachePojo
	* @param contentMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> getTempInParamAtGenerateBatchPushTask(
			Map<String, Object> tempInParam,
			MarketCaseCachePojo marketCaseCachePojo,
			Map<String, Object> contentMap) {
		
		Map<String,Object> marketCaseMap = marketCaseCachePojo.getMarketCaseMap();
		String productCommodityId = productCommodity.getProductCommodityIdFromContent(contentMap);
		
		Map<String,Object> tempParam = new HashMap<String,Object>();
		tempParam.put("partition", tempInParam.get("partition"));
		tempParam.put("currentDate", DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1));
		tempParam.put("phoneNo", tempInParam.get("phoneNo"));
		tempParam.put("marketCaseId", tempInParam.get("marketCaseId"));
		tempParam.put("endTime", (String) marketCaseMap.get("endTime"));
		tempParam.put("productCommodityId", productCommodityId);
		
		log.debug("TaskProcessEntity.generateBatchPushTask.tempOutParam", tempParam);
		return tempParam;
	}

	/**
	 * 处理任务调配规则关系
	* @date: 2016-12-19 
	* @author: zhangjj_crmpd
	* @title: handelTaskAjustAndRuleRelation 
	* @param taskAdjustId
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected String handelTaskAjustAndRuleRelation(String taskAdjustId,
			Map<String, Object> inParam) throws StrategyError {
		Map<String, Object>  tempInParam = new HashMap<String, Object>();
		String ruleId = SequenceUtil.getSequence();
		tempInParam.put("parentComponentId", taskAdjustId);
		tempInParam.put("componentId", ruleId);
		tempInParam.put("relId", SequenceUtil.getSequence());
		tempInParam.put("componentType", Const.COMPONENT_TYPE_TASKADJUST);
		tempInParam.put("parentComponentType", Const.COMPONENT_TYPE_RULE);
		taskInsertor.insertTaskAdjustRuleRelation(tempInParam, tempInParam);
		return ruleId;
	}
	
	/**
	 * 处理任务调配表入参报文
	* @date: 2016-12-19 
	* @author: zhangjj_crmpd
	* @title: handleTaskAdjustParam 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected String handleTaskAdjustParam(Map<String, Object> inParam) throws StrategyError {
		String taskAdjustId = SequenceUtil.getSequence();
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("taskadjustId", taskAdjustId);
		tempInParam.put("taskadjustType", inParam.get("taskadjustType"));
		tempInParam.put("taskadjustContent", inParam.get("taskadjustContent"));
		tempInParam.put("taskadjustCondition", inParam.get("taskadjustCondition"));
		tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_DEFAULT);
		tempInParam.put("operNo", inParam.get("operNo"));
		tempInParam.put("operTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1));
		taskInsertor.insertTaskAdjust(inParam, tempInParam);
		return taskAdjustId;
	}
	
	/**
	 * 处理调配规则
	* @date: 2016-12-19 
	* @author: zhangjj_crmpd
	* @title: handelTaskAjustRule 
	* @param ruleId
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void handelTaskAjustRule(String ruleId,String taskAdjustId, Map<String, Object> inParam) throws StrategyError {
		//入规则信息表
		Map<String, Object> ruleInParam = new HashMap<String, Object>();
		ruleInParam.put("ruleId", ruleId);
		ruleInParam.put("serialId", SequenceUtil.getSequence());
		rule.addRuleInfo(inParam, ruleInParam);
		//入规则详细信息
		rule.addRuleDetailByTaskAdjust(ruleId,taskAdjustId,inParam);
	}
	
	/** 校验渠道规则和全局规则
	* @date: 2016-11-15 
	* @author: wangpei
	* @title: isPassRule 
	* @param checkParam
	* @param tempInParam
	* @param ruleMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected boolean isPassRule(Map<String,Object> checkParam,Map<String,Object> tempInParam,Map<String,Object> ruleMap) throws StrategyError{
		//获取全局规则
		Map<String,Object> globalRule = rule.getGlobalRuleByCache();
		checkParam.put("checkType", "channelTask");
		Map<String,Object> marketCaseBaseMap = (Map<String, Object>) tempInParam.get("marketCaseBaseMap");
		//校验全局规则
		/*if (!rule.isPassGlobalRule(checkParam, marketCaseBaseMap, globalRule)) {
			return false;
		}*/
		//校验渠道规则
		String channelId = (String) checkParam.get("channelId");
	
		Map<String,Object> channelRelMap = (Map<String, Object>) checkParam.get("channelRelMap");
		List<String> ruleRelMap = (List<String>)((Map<String,Object>)channelRelMap.get(channelId)).get(Const.COMPONENT_TYPE_RULE);
		if (CommonUtils.objectIsNull(ruleRelMap)) {
			return true;
		}
		for (String ruleId : ruleRelMap) {
			List<Map<String,Object>> ruleDetailList = (List<Map<String,Object>>) ruleMap.get(ruleId);
			if (CommonUtils.objectIsNull(ruleDetailList)) {
				continue;
			}
			if (!isPassRuleDetail(checkParam, tempInParam, ruleDetailList)) {
				return false;
			}
		}
		return true;
	}
	
	/** 校验需要校验的规则明细
	* @date: 2016-11-28 
	* @author: wangpei
	* @title: isPassRuleDetail 
	* @param checkParam
	* @param tempInParam
	* @param ruleMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected boolean isPassRuleDetail(Map<String,Object> checkParam,Map<String,Object> tempInParam,List<Map<String,Object>> ruleDetailList) throws StrategyError{
		boolean greyFlag = true;//是否默认校验黑名单
		Map<String,Object> marketCaseBaseMap = (Map<String, Object>) tempInParam.get("marketCaseBaseMap");
		Map<String,Object> retMap = new HashMap<String, Object>();
		Map<String,Object> userMap = new HashMap<String, Object>();
		userMap.put("idNo", checkParam.get("idNo"));
		for (Map<String, Object> ruleDetail : ruleDetailList) {
			if(Const.RULE_TYPE_MUTEX.equals(ruleDetail.get("ruleDetailType"))) {
				Map<String, Object> check = rule.isPassRule(checkParam,userMap,marketCaseBaseMap,ruleDetail,new HashMap<String,Object>(),new HashMap<String,Object>(),new HashMap<String,Object>());
				boolean checkFlag = (Boolean) check.get("checkFlag");
				if (!checkFlag) {
					return false;
				}
			}else if(Const.RULE_TYPE_UNTROUBLE.equals(ruleDetail.get("ruleDetailType"))){
				//只校验黑名单
				List<Map<String, Object>> RuleParamList = (List<Map<String, Object>>)ruleDetail.get("params");
				List<Map<String, Object>> newRuleParamList = new ArrayList<Map<String,Object>>();
				for (Map<String, Object> RuleParam : RuleParamList) {
					if(Const.RULE_CODE_UNTROUBLE_UNTROUBLECUST.equals((String)RuleParam.get("ruleParCode"))){
						newRuleParamList.add(RuleParam);
					}
				}
				if (!CommonUtils.objectIsNull(newRuleParamList)) {
					greyFlag = false;
					ruleDetail.put("params", newRuleParamList);
					Map<String, Object> check = rule.isPassRule(checkParam,userMap,marketCaseBaseMap,ruleDetail,new HashMap<String,Object>(),new HashMap<String,Object>(),new HashMap<String,Object>());
					boolean checkFlag = (Boolean) check.get("checkFlag");
					if (!checkFlag) {
						return false;
					}
				}
			}
		}
		if (greyFlag && !rule.isPassGrey(checkParam,userMap,marketCaseBaseMap)) {
			return false;
		}
		return true;
	}

	/**
	 * 插入批量push任务
	* @date: 2017-1-9 
	* @author: sunliang 
	* @title: insertBatchPushTask 
	* @param tempParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void insertBatchPushTask(Map<String,Object> tempParam){
		taskInsertor.insertBatchPushTask(tempParam);
	}
	
	/**
	 * 插入待发送批量push任务
	* @date: 2017-1-9 
	* @author: sunliang 
	* @title: insertWaitSendBatchPushTask 
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void insertWaitSendBatchPushTask(Map<String,Object> tempInParam){
		taskInsertor.insertWaitSendBatchPushTask(tempInParam);
	}
	
	/**
	 * 插入批量push生成任务数
	* @date: 2017-1-9 
	* @author: sunliang 
	* @title: insertBatchPushCreateTaskCount 
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void insertBatchPushCreateTaskCount(Map<String,Object> tempInParam){
		taskInsertor.insertBatchPushCreateTaskCount(tempInParam);
	}
	

	/** 根据内容处理参数(任务执行人，外呼类型)
	* @date: 2016-11-14 
	* @author: wangpei
	* @title: processParamByContent 
	* @param tempOutParam
	* @param params 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected void processParamByContent(Map<String,Object> tempOutParam,List<Map<String,Object>> params){
		String allocationType = "";
		String taskExectorField = "";
		Map<String,Object> userMsgMap = (Map<String, Object>) tempOutParam.get("userMsgMap");
		//用户所属维系渠道标识(2,vip,3,vpn,4,公客)
		String holdChn = (String) userMsgMap.get("holdChn");
		for (Map<String, Object> param : params) {
			if ("allocationType".equals(param.get("contentParCode"))) {
				allocationType = (String) param.get("contentParValue");
				if ("0".equals(allocationType) && "2".equals(holdChn)) {
					//VIP经理
					taskExectorField = "serviceNo";
				}else if("1".equals(allocationType) && "3".equals(holdChn)){
					//VPN经理
					taskExectorField = "serviceNo";
				}else if("2".equals(allocationType) && "4".equals(holdChn)){
					//中值经理
					taskExectorField = "serviceNo";
				}else if("3".equals(allocationType)){
					//地市销售部
					taskExectorField = "lentServiceNo";
				}else if("4".equals(allocationType)){
					//区县负责人
					taskExectorField = "mktAreaServiceNo";
				}else if("5".equals(allocationType)){
					//营业部负责人
					taskExectorField = "deptServiceNo";
				}else if("6".equals(allocationType)){
					//包区负责人
					taskExectorField = "dutyZoneServiceNo";
				}else if("7".equals(allocationType)){
					//网格负责人
					taskExectorField = "gridServiceNo";
				}
			}
			if ("callType".equals(param.get("contentParCode"))) {
				tempOutParam.put("callType", param.get("contentParValue"));
			}
		}
		String taskExectorNo = "";
		String taskExectorName = "";
		String taskExectorPhoneNo = "";
		if (!CommonUtils.objectIsNull(taskExectorField)) {
			taskExectorNo = (String) userMsgMap.get(taskExectorField);
			if (!CommonUtils.objectIsNull(taskExectorNo)) {
				Map<String,Object> inParam = new HashMap<String, Object>();
				inParam.put("loginNo", taskExectorNo);
				Map<String,String> loginMsg = loginSelector.selectLoginMsgByLoginNoHbase(inParam);
				if (!CommonUtils.objectIsNull(loginMsg)) {
					taskExectorName = loginMsg.get("loginName");
					taskExectorPhoneNo = loginMsg.get("phone");
				}
			}
			
		}
	
		tempOutParam.put("taskExectorNo", taskExectorNo);
		tempOutParam.put("taskExectorName", taskExectorName);
		tempOutParam.put("taskExectorPhoneNo", taskExectorPhoneNo);
	}

	/**
	 * 查询调配任务与规则
	* @date: 2017-1-9 
	* @author: zhangjj_crmpd
	* @title: queryTaskAdjustAndRule 
	* @param taskAdjustList 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryTaskAdjustAndRule(
			List<Map<String, Object>> taskAdjustList) throws StrategyError {
		List<Map<String, Object>> outList =new ArrayList<Map<String,Object>>();
		Map<String, Object> queryInParam = new HashMap<String, Object>();
		if(CommonUtils.objectIsNull(taskAdjustList)){
			return outList;
		}
		for(Map<String, Object>taskAdjust: taskAdjustList){
			queryInParam.put("parentComponentId", taskAdjust.get("taskAdjustId"));
			queryInParam.put("componentType", Const.COMPONENT_TYPE_RULE);
			taskAdjust.put("ruleList", rule.queryRuleDetailByParentComponentId(queryInParam));
		}
		return taskAdjustList;
	}

	/** 替换变量
	* @date: 2017-3-1 
	* @author: wangpei
	* @title: replaceContentInLable 
	* @param contentInfo
	* @param userLabelMapInfo
	* @param userMsgMap
	* @param custGroupLabel
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected String replaceContentInLable(String contentInfo, Map<String, String> userLabelMapInfo, Map<String, String> userMsgMap,Map<String, String> custGroupLabel){
		if(!CommonUtils.objectIsNull(userLabelMapInfo)){
			for(Map.Entry<String, String> label : userLabelMapInfo.entrySet()){
				contentInfo = contentInfo.replaceAll(label.getKey(), (String)label.getValue());
			}
		}
		if(!CommonUtils.objectIsNull(userMsgMap)){
			for(Map.Entry<String, String> label : userMsgMap.entrySet()){
				String upperKey = CommonUtils.camelToUnderline((String)label.getKey());
				contentInfo = contentInfo.replaceAll(upperKey, (String)label.getValue());
			}
		}
		if(!CommonUtils.objectIsNull(custGroupLabel)){
			for(Map.Entry<String, String> label : custGroupLabel.entrySet()){
				contentInfo = contentInfo.replaceAll(label.getKey(), label.getValue());
			}
		}
		return contentInfo;
	}

	/** 增加渠道任务
	* @date: 2016-11-14 
	* @author: wangpei
	* @title: addChannelTask 
	* @param tempOutParam
	* @param channelRelMap
	* @param contentMap
	* @param ruleMap
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected void addChannelTask(Map<String,Object> tempOutParam,Map<String,Object> channelRelMap,Map<String,Object> contentMap,Map<String,Object> ruleMap) throws StrategyError{
		Set<String> channelIdSet = channelRelMap.keySet();
		//需生成渠道任务的渠道
		List<String> channelList = Arrays.asList(Const.CHANNEL_GENERATECHANNELTASK);
		List<String> extraChannelList = Arrays.asList(Const.CHANNEL_GENERATECHANNELTASK_EXTRA);
		List<String> extraPositionList = Arrays.asList(Const.POSITION_GENERATECHANNELTASK_EXTRA);
		List<String> noticePositionList = Arrays.asList(Const.POSITION_GENERATECHANNELTASK_MSGNOTICE);

		for(String channelId : channelIdSet){
			if (!channelList.contains(channelId) && !extraChannelList.contains(channelId)) {
				continue;
			}
			Map<String,Object> checkParam = new HashMap<String, Object>();
			checkParam.put("idNo", tempOutParam.get("idNo"));
			checkParam.put("channelId", channelId);
			checkParam.put("channelRelMap", channelRelMap);
			//规则校验
			if (!isPassRule(checkParam,tempOutParam, ruleMap)) {
				continue;
			}
			tempOutParam.put("channelId", channelId);
			Map<String,Object> positionRelMap = (Map<String,Object>)((Map<String,Object>)channelRelMap.get(channelId)).get(Const.COMPONENT_TYPE_POSITION);
			if (CommonUtils.objectIsNull(positionRelMap)) {
				continue;
			}
			Set<String> positionIdSet = positionRelMap.keySet();
			for(String positionId : positionIdSet){
				if (!channelList.contains(channelId) && !extraPositionList.contains(positionId)) {
					continue;
				}
				tempOutParam.put("positionId", positionId);
				List<String> positionContentIds = (List<String>) ((Map<String,Object>)positionRelMap.get(positionId)).get(Const.COMPONENT_TYPE_CONTENT);
				if (!CommonUtils.objectIsNull(positionContentIds)) {
					//获取运营位内容
					List<Map<String,Object>> params = getPositionContentParams(positionContentIds, contentMap);
					if (!CommonUtils.objectIsNull(params)) {
						String taskId = SequenceUtil.getSequence();
						tempOutParam.put("taskId", taskId);
						//获取任务执行人，外呼标识
						processParamByContent(tempOutParam, params);
						//插入任务表
						tempOutParam.put("taskId",tempOutParam.get("taskId"));
						taskInsertor.insertChannelTaskHbase(tempOutParam, tempOutParam);
						if ("real".equals(tempOutParam.get("taskType"))) {
							taskInsertor.insertChannelTask(tempOutParam, tempOutParam);
							//发短信给负责人
							if (noticePositionList.contains(positionId)) {
								log.debug("==task===tempOutParam===", tempOutParam);
								this.sendNoticeMsgToExector(tempOutParam);
							}
						}
					}
				}
			}
		}
	}

	/** 处理活动内容参数
	* @date: 2017-3-1 
	* @author: wangpei
	* @title: settleContentToBatchTask 
	* @param tempParam
	* @param contentDetailList
	* @param userInfo
	* @param userLabelInfo
	* @param custGroupCustomLabel 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected void settleContentToBatchTask(Map<String,Object> tempParam,List<Map<String,Object>> contentDetailList,Map<String,String> userInfo,Map<String,String> userLabelInfo,Map<String,String> custGroupCustomLabel){
		
		for(Map<String,Object> contentDetailMap : contentDetailList){
			List<Map<String,String>> paramsList = (List<Map<String,String>>)contentDetailMap.get("params");
			for(Map<String,String> param: paramsList){
				if("sendTime".equals(param.get("contentParCode"))){
					tempParam.put("beginDate", param.get("contentParValue"));
				}else if("marketingTerm".equals(param.get("contentParCode"))){
					String contentInfo = this.replaceContentInLable((String)param.get("contentParValue"), userLabelInfo,userInfo, custGroupCustomLabel);
					tempParam.put("marketingDescription", contentInfo);
					tempParam.put("sendContent", contentInfo);
				}else if("flowCode".equals(param.get("contentParCode"))){
					tempParam.put("fromTel", param.get("contentParValue"));
				}
			}
		}
	}

}
