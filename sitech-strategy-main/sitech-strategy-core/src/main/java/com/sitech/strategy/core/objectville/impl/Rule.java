package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCasePacketPojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 规则对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: Rule 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 * @param <return_type>
 */
public class Rule<return_type> extends BaseClass implements IRule, Serializable {
	/**
	 * 客户群查询对象
	 */
	protected IDataSelector.ICustGroupSelector custGroupSelector;
	/**
	 * 营销案信息
	 */
	protected IDataSelector.IMarketCaseSelector  marketCaseSelector;
	/**
	 * 规则删除对象
	 */
	protected IDataDeleter.IRuleDeleter ruleDeleter;
	/**
	 * 规则插入对象
	 */
	protected IDataInsertor.IRuleInsertor ruleInsertor;
	/**
	 * 规则查询对象
	 */
	protected IDataSelector.IRuleSelector ruleSelector;
	/**
	 * 规则修改对象
	 */
	protected IDataUpdater.IRuleUpdater ruleUpdater;
	/**
	 * 进程插入对象
	 */
	protected IDataInsertor.ISystemDealInsertor systemDealInsertor;
	/**
	 * 进程查询对象
	 */
	protected IDataSelector.ISystemDealSelector systemDealSelector;
	

	/**
	 * 用户信息插入
	 */
	protected IDataInsertor.IUserInsertor userInsertor;
	/**
	 * 用户信息查询
	 */
	protected IDataSelector.IUserSelector userSelector;
	
	/**
	 * 
	* @date: 2017-4-7 
	* @author: sunyuan
	* @title: setCustGroupSelector 
	* @param custGroupSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupSelector(
			IDataSelector.ICustGroupSelector custGroupSelector) {
		this.custGroupSelector = custGroupSelector;
	}

	/**
	 * 
	* @date: 2016-11-16 
	* @author: yangwl
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
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setRuleDeleter 
	* @param ruleDeleter 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRuleDeleter(IDataDeleter.IRuleDeleter ruleDeleter) {
		this.ruleDeleter = ruleDeleter;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setRuleInsertor 
	* @param ruleInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRuleInsertor(IDataInsertor.IRuleInsertor ruleInsertor) {
		this.ruleInsertor = ruleInsertor;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setRuleSelector 
	* @param ruleSelector 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRuleSelector(IDataSelector.IRuleSelector ruleSelector) {
		this.ruleSelector = ruleSelector;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setRuleUpdater 
	* @param ruleUpdater 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRuleUpdater(IDataUpdater.IRuleUpdater ruleUpdater) {
		this.ruleUpdater = ruleUpdater;
	}
	
	/**
	 * 
	* @date: 2017-1-9 
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
	 * 
	* @date: 2017-2-14 
	* @author: zhangqia
	* @title: setSystemDealInsertor 
	* @param setSystemDealSelector 
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
	 * 
	* @date: 2016-11-15 
	* @author: yangwl
	* @title: setUserInsertor 
	* @param userInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUserInsertor(IDataInsertor.IUserInsertor userInsertor) {
		this.userInsertor = userInsertor;
	}

	/**
	 * 
	* @date: 2016-11-15 
	* @author: yangwl
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
	 * 加载关闭规则到缓存
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: addCloseRuleToCache 
	* @param closeRuleDetailMap
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addCloseRuleToCache(Map.Entry<String,Object> closeRule)throws StrategyError{
		Map<String,Object> tempParam = new HashMap<String,Object>();
		String key = closeRule.getKey();
		List<String> value = (List<String>) closeRule.getValue();
		tempParam.put("prodId", key);
		tempParam.put("ruleDetail", value);
		ruleInsertor.addCloseRuleToCache(tempParam);
	}
	
	/**
	 * 加载评估规则到缓存
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: addEvaluateRuleToCache 
	* @param closeRule
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addEvaluateRuleToCache(Map.Entry<String,Object> evaluateRule)throws StrategyError{
		Map<String,Object> tempParam = new HashMap<String,Object>();
		String key = evaluateRule.getKey();
		List<String> value = (List<String>) evaluateRule.getValue();
		tempParam.put("prodId", key);
		tempParam.put("ruleDetail", value);
		ruleInsertor.addEvaluateRuleToCache(tempParam);
	}
	
	/**
	 * 加载全局规则缓存
	* @date: 2016-11-19 
	* @author: yangwl
	* @title: addGlobalRuleToCache 
	* @param marketCaseRelCustGroupTypeFormulaCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addGlobalRuleToCache(Map<String, Object> globalRuleDetailMap) throws StrategyError {
		Map<String, Object> tempParam = new HashMap<String, Object>();
		tempParam.put("globalRuelDetailMap", globalRuleDetailMap);
		ruleInsertor.addGlobalRuleToCache(tempParam);
	}

	/**
	 * 加载互斥规则缓存
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: addMutexRuleToCache 
	* @param mutexRuleDetailMap
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addMutexRuleToCache(Map.Entry<String, Object> mutexRuleDetailMap) throws StrategyError {
		String key = mutexRuleDetailMap.getKey();
		List<String> value = (List<String>) mutexRuleDetailMap.getValue();
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("marketCaseId", key);
		tempInParam.put("mutexRuleDetail", value);
		ruleInsertor.addMutexRuleToCache(tempInParam);
	}
	
	/**
	 * 添加全局策略配置
	* @date: 2016-10-14 
	* @author: xiongxq
	* @Title: addGlobalStrategyConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addGlobalStrategyConfig(Map<String,Object>inParam) throws StrategyError{
		List<Map<String, Object>> globalStrategyConfigList = (List<Map<String,Object>>)inParam.get("params");
		Map<String,Object> globalStrategyConfigMap = (Map<String,Object>)inParam.get("globalStrategyMap");
		String batchNo = SequenceUtil.getSequence();
		if (!CommonUtils.objectIsNull(globalStrategyConfigList)) {
			for (Map<String, Object> inMap : globalStrategyConfigList) {
				Map<String,Object> serialMap = new HashMap<String,Object>();
				serialMap.put("batchNo", batchNo);
				serialMap.put("serialId",SequenceUtil.getSequence());
				serialMap.put("ruleDetailId", globalStrategyConfigMap.get("ruleDetailId"));
				serialMap.put("ruleId",  globalStrategyConfigMap.get("ruleId"));
				serialMap.put("ruleDetailType",  globalStrategyConfigMap.get("ruleDetailType"));
				serialMap.put("ruleParName", inMap.get("ruleParName"));
				serialMap.put("ruleParValue", inMap.get("ruleParValue"));
				serialMap.put("ruleParCode", inMap.get("ruleParCode"));
				serialMap.put("ruleParDesc", inMap.get("ruleParDesc"));
				ruleInsertor.insertGlobalRule(serialMap);
			}
		}
	}
	
	/**
	 * 增加全局接触控制记录
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: addGolbalTouchControlRecord 
	* @param inParam
	* @param marketCaseParketPojoList 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addTouchControlRecord(Map<String, Object> inParam,List<Map<String, Object>> marketCasePacketPojoMapList) throws StrategyError{
		for (Map<String, Object> marketCasePacketPojoMap:marketCasePacketPojoMapList) {
			Map<String, Object> globalControl = new HashMap<String, Object>();
			Map<String, Object> userMap = (Map<String, Object>) marketCasePacketPojoMap.get("userMap");
			if(!CommonUtils.objectIsNull(marketCasePacketPojoMap.get("positionInfoMap"))){
				Map<String,Object> positionInfoMap = (Map<String,Object>)marketCasePacketPojoMap.get("positionInfoMap");
				for(Map.Entry<String, Object> entry : positionInfoMap.entrySet()){
					List<IMarketCasePacketPojo> marketCasePacketPojoList = (List<IMarketCasePacketPojo>)entry.getValue();
					for(IMarketCasePacketPojo marketCasePacketPojo : marketCasePacketPojoList){
						Map<String,Object> marketCaseBasicMap = (Map<String,Object>)marketCasePacketPojo.getMarketCaseBasic().get("marketCaseBasic");
						Map<String, Object> marketCaseTouchControl = marketCasePacketPojo.getChannelTouchControl();
						List<Map<String, String>> globalTouchControlList = marketCasePacketPojo.getGlobalTouchControl();
						if (!CommonUtils.objectIsNull(marketCaseTouchControl)) {
							Map<String, Object> tempInParam = new HashMap<String,Object>();
							tempInParam.put("idNo", userMap.get("idNo"));
							tempInParam.put("channelId", CommonUtils.objectIsNull(inParam.get("channelId"))?entry.getKey():inParam.get("channelId"));
							tempInParam.put("marketCaseId", marketCaseBasicMap.get("marketCaseId"));
							tempInParam.putAll(marketCaseTouchControl);
							log.debug("====addTouchControlRecord==tempInParam=", tempInParam);
							userInsertor.insertUserRecommendControlByChannel(inParam, tempInParam);
						}
							log.debug("====addTouchControlRecord==globalTouchControlList=", globalTouchControlList);
						if (!CommonUtils.objectIsNull(globalTouchControlList)) {
							for (Map<String, String> globalTouchControl : globalTouchControlList) {
								globalControl.put(globalTouchControl.get("batchNo"), globalTouchControl);
							}
						}
					}
				}
			}
			if (!CommonUtils.objectIsNull(globalControl)) {
				for (Map.Entry<String, Object> entry : globalControl.entrySet()) {
					Map<String, Object> tempInParam = new HashMap<String,Object>();
					tempInParam.put("idNo", userMap.get("idNo"));
					tempInParam.put("batchNo", entry.getKey());
					tempInParam.putAll((Map<String,Object>) entry.getValue());
					log.debug("====addTouchControlRecord=globalControl=tempInParam=", tempInParam);
					userInsertor.insertUserRecommendControl(inParam, tempInParam);
				}
			}
		}
	}
	
	/**
	 * 添加规则基本信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addRuleInfo 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addRuleInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
		ruleInsertor.insertRuleInfo(inParam,tempInParam);
	}
	
	/**
	 * 添加规则详细信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addRuleDetail 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addRuleDetail(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
		ruleInsertor.insertRuleDetailInfo(inParam,tempInParam);
	}
	
	/**
	 * 根据客户群和（事件或渠道）
	* @date: 2017-2-21 
	* @author: zhangyw_crmpd
	* @title: addRuleDetailByCustGroup 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> addRuleDetailByCustGroup(Map<String, Object> inParam) throws StrategyError {
		List<Map<String, Object>> custGroupList = (List<Map<String, Object>>) inParam.get("custGroupList");
		List<Map<String, Object>> channelList = (List<Map<String, Object>>) inParam.get("channelList");
		List<Map<String, Object>> eventList = (List<Map<String, Object>>) inParam.get("eventList");
		Map<String, Object>  ruleDetailInfo = (Map<String, Object>) inParam.get("ruleDetailInfo");
		List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
		if (!CommonUtils.objectIsNull(custGroupList)) {
			for (Map<String, Object> custGroup : custGroupList) {
				String marketCaseCustGrouprelId = (String)custGroup.get("relId");
				String custGroupId = (String)custGroup.get("custGroupId");
				if (!CommonUtils.objectIsNull(channelList)) {
					for (Map<String, Object> channel : channelList) {
						String channelId = (String)channel.get("channelId");
						Map<String,Object> param = new HashMap<String, Object>();
						param.put("marketCaseCustGrouprelId", marketCaseCustGrouprelId);
						param.put("custGroupId", custGroupId);
						param.put("channelId", channelId);
						Map<String,Object> out = this.addCustOrEventRuleDetail(param, ruleDetailInfo);
						outList.add(out);
					}
				}
				if (!CommonUtils.objectIsNull(eventList)) {
					for (Map<String, Object> event : eventList) {
						String eventId = (String)event.get("eventId");
						Map<String,Object> param = new HashMap<String, Object>();
						param.put("marketCaseCustGrouprelId", marketCaseCustGrouprelId);
						param.put("custGroupId", custGroupId);
						param.put("eventId", eventId);
						Map<String,Object> out = this.addCustOrEventRuleDetail(param, ruleDetailInfo);
						outList.add(out);
					}
				}
			}
		}
		Map<String,Object> outMap = new HashMap<String, Object>();
		outMap.put("outList", outList);
		return outMap;
	}
	
	/** 
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: addRuleDetailByCustGroupAndChannel 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> addRuleDetailByCustGroupAndChannel(Map<String, Object> inParam) throws StrategyError {
		List<Map<String, Object>> custGroupList = (List<Map<String, Object>>) inParam.get("custGroupList");
		List<Map<String, Object>> channelList = (List<Map<String, Object>>) inParam.get("channelList");
		Map<String, Object>  ruleDetailInfo = (Map<String, Object>) inParam.get("ruleDetailInfo");
		List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
		if (!CommonUtils.objectIsNull(custGroupList)) {
			for (Map<String, Object> custGroup : custGroupList) {
				String marketCaseCustGrouprelId = (String)custGroup.get("relId");
				String custGroupId = (String)custGroup.get("custGroupId");
				if (!CommonUtils.objectIsNull(channelList)) {
					for (Map<String, Object> channel : channelList) {
						String channelId = (String)channel.get("channelId");
						Map<String,Object> param = new HashMap<String, Object>();
						param.put("marketCaseCustGrouprelId", marketCaseCustGrouprelId);
						param.put("custGroupId", custGroupId);
						param.put("channelId", channelId);
						Map<String,Object> out = this.addChannelAndRuleDetail(param, ruleDetailInfo);
						outList.add(out);
					}
				}
			}
		}
		Map<String,Object> outMap = new HashMap<String, Object>();
		outMap.put("outList", outList);
		return outMap;
	}
	
	/**
	 * 根据调配信息添加规则详情
	* @date: 2016-12-19 
	* @author: zhangjj_crmpd
	* @title: addRuleDetailByTaskAdjust 
	* @param ruleId
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addRuleDetailByTaskAdjust(String ruleId,String taskAdjustId,
			Map<String, Object> inParam) throws StrategyError {
		List<Map<String, Object>> ruleList = (List<Map<String, Object>>) inParam.get("ruleList");
		if(CommonUtils.objectIsNull(ruleList)){
			return;
		}
		for(Map<String,Object> ruleInfo:ruleList ){
			handleTaskAdjustRuleParam(ruleId,taskAdjustId,ruleInfo);
		}
	}
	
	/**
	 * 校验调配规则
	* @date: 2016-12-21 
	* @author: zhangjj_crmpd
	* @title: checkTaskAdjustRule 
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> checkTaskAdjustRule(Map<String, Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentId(CommonUtils.toString(tempInParam.get("taskAdjustId")));
		queryFilter.setRuleParCode(Const.RULE_CODE_TASKADJUST_FREQUENCYTYPE);
		queryFilter.setRuleDetailId(CommonUtils.toString(tempInParam.get("ruleDetailId")));
		List<Map<String,Object>> ruleDetailList = ruleSelector.selectRuleDetailByParentComponentId(tempInParam, queryFilter);
		log.info("checkTaskAdjustRule ruleDetailList:", ruleDetailList);
		if(CommonUtils.objectIsNull(ruleDetailList)){
			return null;
		}
		for(Map<String,Object> ruleDetail : ruleDetailList){
			String times = CommonUtils.toString(ruleDetail.get("ruleParValue"));
			if(checkCurrentDateInTimes(times)){
				return ruleDetail;
			}
				
		}
		return null;
		
	}
	
	/** 
	 * 校验接触规则
	* @date: 2016-11-10 
	* @author: songxj
	* @title: touchRuleCheck 
	* @param startend
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public boolean checkTouchRule(Map<String,Object> touchRuleTimeMap) {
		String touchRuleTime = (String) touchRuleTimeMap.get(Const.RULE_CODE_STARTEND);
		String[] touchTime = touchRuleTime.split(Const.SEPARATOR_SUBSTRACTKEY);
		
		String nowDay = DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD2);
		String nowDateString = DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1);
		Date nowDate = DateUtil.StringToDate(nowDateString, DateUtil.TIME_FROMAT_SIMPLE1);
		Date startDate = DateUtil.StringToDate(nowDay + " "+touchTime[0], DateUtil.TIME_FROMAT_SIMPLE1);
		Date endDate = DateUtil.StringToDate(nowDay + " " +touchTime[1], DateUtil.TIME_FROMAT_SIMPLE1);
		if (startDate.before(nowDate) && endDate.after(nowDate)) {
			return true;
		}
		return false;
	}
	
	/** 处理营销案接触控制数据
	* @date: 2017-2-22 
	* @author: wangpei
	* @title: dealFrequencyRuleInTouchReult 
	* @param control
	* @param flag
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String,Object> dealFrequencyRuleInTouchResult(Map<String,Object> control,int flag){
		log.debug("===dealFrequencyRuleInTouchResult= control=", control);
		Date now = new Date();
		Map<String,Object> controlResult = new HashMap<String, Object>();
		String sysTime = DateUtil.DateToString(now, DateUtil.TIME_FROMAT_SIMPLE1);
		String firstRecommendTime = CommonUtils.objectIsNull(control.get("firstRecommendTime"))?sysTime:(String)control.get("firstRecommendTime");
		String forwardRecommendTime = CommonUtils.objectIsNull(control.get("forwardRecommendTime"))?sysTime:(String)control.get("forwardRecommendTime");
		String recommendCount = CommonUtils.objectIsNull(control.get("recommendCount"))?"0":(String)control.get("recommendCount");
		String count = CommonUtils.objectIsNull(control.get("count"))?"0":(String)control.get("count");
		String dayCount = CommonUtils.objectIsNull(control.get("dayCount"))?"0":(String)control.get("dayCount");
		
		count = String.valueOf(Integer.valueOf(count) + 1); 
		if (DateUtil.DateToString(now, DateUtil.DATE_FROMAT_YYYYMMDD1).equals(DateUtil.stringToString(forwardRecommendTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD1))) {
			dayCount = String.valueOf(Integer.valueOf(dayCount) + 1);
		}else{
			dayCount = "1";
		}
		controlResult.put("dayCount", dayCount);
		controlResult.put("count", count);
		if (flag == 1) {
			controlResult.put("firstRecommendTime", firstRecommendTime);
			controlResult.put("forwardRecommendTime", sysTime);
			controlResult.put("recommendCount", String.valueOf(Integer.valueOf(recommendCount)+1));
		}else if (flag == 0) {
			controlResult.put("firstRecommendTime", forwardRecommendTime);
			controlResult.put("forwardRecommendTime", sysTime);
			controlResult.put("recommendCount", "2");
		}else if (flag == 3) {
			controlResult.put("firstRecommendTime", sysTime);
			controlResult.put("forwardRecommendTime", sysTime);
			controlResult.put("recommendCount", "1");
		}
		
		return controlResult;
	}

	
	/**
	 * 通过缓存获取全局规则
	* @date: 2016-11-15 
	* @author: yangwl
	* @title: getGlobalRuleByCache 
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getGlobalRuleByCache() throws StrategyError{
		return ruleSelector.selectGlobalRuleFromCache();
	}
	
	/** 获取全局频控数据和规则
	* @date: 2017-2-13 
	* @author: wangpei
	* @title: getGlobalRecommendControlAndRule 
	* @param inParam
	* @param globalRuleMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> getGlobalRecommendControlAndRule(Map<String, Object> inParam,Map<String,Object> userMap,Map<String, Object> globalRuleMap){
		Map<String,Object> retMap = new HashMap<String, Object>();
		Map<String,Object> controlMap = new HashMap<String, Object>();
		Map<String,Object> ruleMap = new HashMap<String, Object>();
		List<Map<String, Object>> touchCountRuleList =  (List<Map<String, Object>>)globalRuleMap.get(Const.RULE_TYPE_GLOBALRULE_TOUCHCOUNT);
		//按照批次号分组
		List<List<Map<String, Object>>> touchCountBatchNoList = this.groupByBatchNo(touchCountRuleList);
		log.debug("===getGlobalRecommendControlAndRule====touchCountBatchNoList======", touchCountBatchNoList);
		//按照批次校验
		if(!CommonUtils.objectIsNull(touchCountBatchNoList)){
			for(List<Map<String, Object>> touchCountBatchNo : touchCountBatchNoList){
				Map<String, Object>  touchCountRuleMap = new HashMap<String, Object>();
				for(Map<String, Object>  touchCountRule : touchCountBatchNo){
					touchCountRuleMap.put((String)touchCountRule.get("ruleParCode"), touchCountRule.get("ruleParValue"));
					touchCountRuleMap.put("batchNo", touchCountRule.get("batchNo"));
				}
				log.debug("===getGlobalRecommendControlAndRule====touchCountRuleMap======", touchCountRuleMap);
				String batchNo = (String) touchCountRuleMap.get("batchNo");
				String channelId = (String) touchCountRuleMap.get("channelName");
				if (channelId.equals(inParam.get("channelId"))) {
					ruleMap.put(batchNo, touchCountRuleMap);
					Map<String, Object> userRecommendControl = getUserRecommendControlByBatchNo(userMap, batchNo);
					log.debug("===getGlobalRecommendControlAndRule====userRecommendControl======", userRecommendControl);
					controlMap.put(batchNo, userRecommendControl);
				}
				
			}	
		}
		retMap.put("globalTouchControl", controlMap);
		retMap.put("globalTouchRule", ruleMap);
		return retMap;
	}

	/**
	 * 查询互斥规则
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: getMutexRuleInfoByMarketCase 
	* @param marketCaseCachePojo
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<String> getMutexRuleInfoByMarketCase(IMarketCaseCachePojo marketCaseCachePojo) throws StrategyError {
		Map<String,Object> tempParam = new HashMap<String,Object>();
		Map<String,Object> marketCaseMap = marketCaseCachePojo.getMarketCaseMap();
		log.debug("===Rule.getMutexRuleInfoByMarketCase.marketCaseMap===", marketCaseMap);
		String marketCaseId = (String) marketCaseMap.get("marketCaseId");
		log.debug("===Rule.getMutexRuleInfoByMarketCase.marketCaseId===", marketCaseId);
		tempParam.put("marketCaseId", marketCaseId);
		return ruleSelector.getMutexRuleFromCache(tempParam);
	}
	
	/**
	 * 获取营销案中接触规则
	* @date: 2016-12-24 
	* @author: sunliang 
	* @title: getTouchRuleStartEndTime 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> getTouchRuleStartEndTime (Map<String,Object> tempInParam) throws StrategyError{
		String marketCaseId = (String)tempInParam.get("marketCaseId");
		Map<String,Object> ruleInParam = new HashMap<String,Object>();
		ruleInParam.put("marketCaseId", marketCaseId);
		Map<String, Object> ruleMap = marketCaseSelector.getMarketCaseDetailFromCache(ruleInParam).getRuleMap();
		if (!ruleMap.isEmpty()) {
			Iterator<String> iterator = ruleMap.keySet().iterator();
			while (iterator.hasNext()) {
				String ruleId = (String) iterator.next();
				List ruleList = (List) ruleMap.get(ruleId);
				for (int i = 0; i < ruleList.size(); i++) {
					Map<String, Object> ruleDetailMap = (Map<String, Object>) ruleList.get(i);
					if (ruleDetailMap.containsKey("params")) {
						List ruleDetailList = (List) ruleDetailMap.get("params");
						for (int j = 0; j < ruleDetailList.size(); j++) {
							Map innerMap = (Map) ruleDetailList.get(j);
							if (innerMap.containsValue(Const.RULE_CODE_STARTEND)) {
								ruleInParam.put(Const.RULE_CODE_STARTEND, innerMap.get("ruleParValue"));
								return ruleInParam;
							}
						}
					}
				}
			}
		}
		ruleInParam.put(Const.RULE_CODE_STARTEND, "09:00:00-20:00:00");
		return ruleInParam;
	}
	
	/** 获取用户营销案渠道推荐控制信息
	* @date: 2017-2-13 
	* @author: wangpei
	* @title: getUserRecommendControlByChannel 
	* @param inParam
	* @param marketCaseBaseMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> getUserRecommendControlByChannel(Map<String,Object> inParam,Map<String,Object> userMap, Map<String,Object> marketCaseBaseMap){
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		Map<String, Object> ret = null;
		tempInParam.put("idNo", userMap.get("idNo"));
		Set<String> fields = new HashSet<String>();
		fields.add("FIRST_RECOMMEND_TIME");
		fields.add("FORWARD_RECOMMEND_TIME");
		fields.add("RECOMMEND_COUNT");
		fields.add("FORWARD_RECOMMEND_TIME");
		fields.add("DAY_COUNT");
		fields.add("COUNT");
		tempInParam.put("marketCaseId", marketCaseBaseMap.get("marketCaseId"));
		tempInParam.put("channelId", inParam.get("channelId"));
		ret = userSelector.selectUserRecommendControlByChannel(tempInParam, fields);
		return ret;
	}

	/**
	 * 校验规则
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: isFilterRule 
	* @param inParam
	* @param componentIdBaseContent
	* @param marketCaseCachePojo
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> isFilterRule(Map<String, Object> inParam,Map<String, Object> userMap,
			String componentIdBaseContent,
			IMarketCaseCachePojo marketCaseCachePojo,Map<String, Object> positionInfoMap,
			Map<String,Object> channelInfoMap) throws StrategyError {
		log.debug("===Rule.isFilterRule.all===", "inParam:"+inParam+",userMap:"+userMap+",componentIdBaseContent:"+componentIdBaseContent+",marketCaseCachePojo:"+marketCaseCachePojo+",positionInfoMap:"+positionInfoMap+"channelInfoMap:"+channelInfoMap);
		boolean greyFlag = true;//是否默认校验黑名单
		Map<String, Object> checkParam = new HashMap<String, Object>();
		Map<String,Object> marketCaseRel = marketCaseCachePojo.getMarketCaseRel();
		log.debug("===Rule.isFilterRule.marketCaseRel===", marketCaseRel);
		
		String marketCaseId = (String)(marketCaseCachePojo.getMarketCaseMap()).get("marketCaseId");
		log.debug("===Rule.isFilterRule.marketCaseId===", marketCaseId);
		
		Map<String, Object> marketCaseInfoRel = (Map<String, Object>)((Map<String, Object>)marketCaseRel.get(Const.COMPONENT_TYPE_MARKETCASE)).get(marketCaseId);
		log.debug("===Rule.isFilterRule.marketCaseInfoRel===", marketCaseInfoRel);
		
		Map<String,Object> custGroupRelMap = (Map<String,Object>)((Map<String,Object>)marketCaseInfoRel.get(Const.COMPONENT_TYPE_CUSTGROUP)).get(componentIdBaseContent);
		log.debug("===Rule.isFilterRule.custGroupRelMap===", custGroupRelMap);
		
		List<String> ruleIdList = new ArrayList<String>();
		
		if("event".equals(inParam.get("flag"))){
			Map<String,Object> EventRelMap = (Map<String,Object>)((Map<String,Object>)custGroupRelMap.get(Const.COMPONENT_TYPE_EVENT)).get((String)inParam.get("eventId"));
			log.debug("===Rule.isFilterRule.EventRelMap===", EventRelMap);
			
			ruleIdList = (List<String>)EventRelMap.get(Const.COMPONENT_TYPE_RULE);
		}else if("channel".equals(inParam.get("flag"))){
			Map<String,Object> channelRelMap = (Map<String,Object>)((Map<String,Object>)custGroupRelMap.get(Const.COMPONENT_TYPE_CHANNEL)).get((String)inParam.get("channelId"));
			ruleIdList = (List<String>)channelRelMap.get(Const.COMPONENT_TYPE_RULE);
		}

		Map<String,Object> ruleMap = marketCaseCachePojo.getRuleMap();

//		if(!CommonUtils.objectIsNull(mutexRuleInfoList)){
//			if(CommonUtils.objectIsNull(ruleIdList)){
//				ruleIdList = new ArrayList<String>();
//			}
//			for(String mutexMarketCaseId : mutexRuleInfoList){
//				//由于互斥规则缓存中只存储互斥的营销案的缓存，故再次只能将互斥的营销案id做为ruleId传入
//				ruleIdList.add(mutexMarketCaseId);
//				//转成ruleMap内的结构
//				List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
//				Map<String,Object> map = new HashMap<String,Object>();
//				map.put("ruleParValue", mutexMarketCaseId);
//				map.put("ruleDetailType", Const.RULE_TYPE_MUTEX);
//				list.add(map);
//				ruleMap.put(mutexMarketCaseId, list);
//			}
//		}
		
		log.debug("===Rule.isFilterRule.ruleIdList===", ruleIdList);
		log.debug("===Rule.isFilterRule.ruleMap===", ruleMap);
		if(!CommonUtils.objectIsNull(ruleIdList)){
			for(String ruleId : ruleIdList){
				if(!CommonUtils.objectIsNull(ruleId)){
					List<Map<String,Object>> ruleDetailList = (List<Map<String,Object>>)ruleMap.get(ruleId);
					for(Map<String,Object> ruleDetailMap:ruleDetailList){
						log.info("===========isFilterRule.ruleDetailMap=======", ruleDetailMap);

						Map<String,Object> ruleCheckParam = this.isPassRule(inParam,userMap, (Map<String, Object>)marketCaseCachePojo.getMarketCaseMap(), ruleDetailMap,positionInfoMap,marketCaseCachePojo.getMarketCaseRel(),channelInfoMap);
						boolean ruleCheckFlag = (Boolean)ruleCheckParam.get("checkFlag");
						if(!ruleCheckFlag){
							checkParam.put("checkFlag", false);
							return checkParam;
						}else if (Const.RULE_TYPE_FREQUENCY.equals(ruleDetailMap.get("ruleDetailType"))) {
							checkParam.put("marketCaseTouchControl", ruleCheckParam.get("marketCaseTouchControl"));
						}
					}
				}	
			}
		}
		
		checkParam.put("checkFlag", true);
		return checkParam;
	}
	
	/**
	 * 全局规则校验是否通过
	* @date: 2016-11-14 
	* @author: yangwl
	* @title: isPassGlobalRule 
	* @param inParam
	* @param ruleDetailMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> isPassGlobalRule(Map<String,Object> inParam,Map<String,Object> userMap, Map<String,Object> marketCaseBaseMap, Map<String, Object> globalRuleMap) throws StrategyError{
		log.debug("===Rule.isPassGlobalRule.globalRuleMap===", globalRuleMap);
		Map<String,Object> retMap = new HashMap<String, Object>();
		boolean touchTimeFlag = true;
		boolean noDisturbDateFlag = true;
		boolean touchCountFlag = true;
		if(!CommonUtils.objectIsNull(globalRuleMap)){
			//判断接触时间
			touchTimeFlag = this.isTouchTimeGlobalRule(inParam, globalRuleMap, marketCaseBaseMap);
			log.debug("===Rule.isPassGlobalRule.touchTimeFlag===", touchTimeFlag);
			if (!touchTimeFlag) {
				retMap.put("checkFlag", false);
				return retMap;
			}
			//判断免打扰时段（日期）
			noDisturbDateFlag = this.isNoDisturbDateGlobalRule(inParam, globalRuleMap, marketCaseBaseMap);
			log.debug("===Rule.isPassGlobalRule.noDisturbDateFlag===", noDisturbDateFlag);
			if (!noDisturbDateFlag) {
				retMap.put("checkFlag", false);
				return retMap;
			}
			//判断接触次数
			Map<String,Object> checkParam = this.isTouchCountGlobalRule(inParam,userMap, globalRuleMap, marketCaseBaseMap);
			touchCountFlag = (Boolean) checkParam.get("checkFlag");
			log.debug("===Rule.isPassGlobalRule.touchCountFlag===", touchCountFlag);
			retMap.put("globalTouchControl", checkParam.get("globalTouchControl"));
		}
		retMap.put("checkFlag", touchTimeFlag&&noDisturbDateFlag&&touchCountFlag);
		
		return retMap;
	}
	
	/** 
	* @date: 2016-12-9 
	* @author: wangpei
	* @title: isPassGrey 
	* @param inParam
	* @param marketCaseBaseMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public boolean isPassGrey(Map<String, Object> inParam,Map<String, Object> userMap,Map<String, Object> marketCaseBaseMap) throws StrategyError {
		return this.checkUnTroubleUser(inParam,userMap, marketCaseBaseMap,"");
	}
	
	/**
	 * 黑名单校验
	* @date: 2017-4-13 
	* @author: sunliang
	* @title: isPassGrey 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public boolean isPassGrey(Map<String,Object> tempInParam) throws StrategyError {
		boolean isPass = true;
		
		Map<String,Object> userMap = (Map<String,Object>)tempInParam.get("userMap");
		List<String> unTroubleCustIdList = (List<String>)tempInParam.get("unTroubleCustIdList");
		Map<String, Object> tempParam = new HashMap<String, Object>();
		tempParam.put("idNo", userMap.get("idNo"));
		IQueryFilter queryFilter = new QueryFilter();
		
		for(String unTroubleCustId : unTroubleCustIdList){

			Map<String, String> blackUser = new HashMap<String,String>();
			queryFilter.setCustGroupId(unTroubleCustId);
			
			System.out.println("================isPassGrey.unTroubleCustId================" + unTroubleCustId);
			if(!CommonUtils.objectIsNull(unTroubleCustId) && !Const.GREY_CUST_ID.equals(unTroubleCustId)){
				blackUser = custGroupSelector.selectCustGroupDetailByIdNo(tempParam,queryFilter);
				System.out.println("================isPassGrey.blackUser================" + blackUser);
			}
			if(!CommonUtils.objectIsNull(blackUser)){
				isPass = false;
				break;
			}
			
			Set<String> fields = new HashSet<String>();
			Map<String, Object> greyUser = new HashMap<String,Object>();
			if(!CommonUtils.objectIsNull(unTroubleCustId) && Const.GREY_CUST_ID.equals(unTroubleCustId)){
				greyUser = userSelector.selectGreyInfoByRowKey(tempParam, fields);
				System.out.println("================isPassGrey.greyUser================" + greyUser);
			}

			if(!CommonUtils.objectIsNull(greyUser)){
				isPass = false;
				break;
			}
		}
		
		return isPass;
	}

	/**
	 * 校验规则是否通过
	* @date: 2016-9-26 
	* @author: sunliang 
	* @title: isPassRule 
	* @param inParam
	* @param ruleDetailMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> isPassRule(
			Map<String, Object> inParam,Map<String, Object> userMap, 
			Map<String,Object> marketCaseBaseMap, Map<String, Object> ruleDetailMap,
			Map<String, Object> positionInfoMap,Map<String,Object> marketCaseRel,
			Map<String,Object> channelInfoMap) throws StrategyError {
		log.debug("===Rule.isPassRule.ruleDetailMap===", ruleDetailMap);
		Map<String, Object> checkParam = new HashMap<String, Object>();
		//频控规则
		if(Const.RULE_TYPE_FREQUENCY.equals(ruleDetailMap.get("ruleDetailType"))){
			checkParam.putAll(this.isFrequencyRule(inParam, ruleDetailMap, marketCaseBaseMap));
			return checkParam;
		}
		//互斥规则
		/*if(Const.RULE_TYPE_MUTEX.equals(ruleDetailMap.get("ruleDetailType"))){
			checkParam.put("checkFlag", this.isMutexRule(inParam, ruleDetailMap));
			return checkParam;
		}*/
		//免打扰
		if(Const.RULE_TYPE_UNTROUBLE.equals(ruleDetailMap.get("ruleDetailType"))){
			checkParam.put("checkFlag", this.isUnTroubleRule(inParam,userMap, ruleDetailMap, marketCaseBaseMap,positionInfoMap));
			log.debug("===Rule.isPassRule.isUnTroubleRule.checkParam===", checkParam);
			return checkParam;
		}
		//协同规则
		/*if(Const.RULE_TYPE_EVENT_SYNERGY.equals(ruleDetailMap.get("ruleDetailType"))){
			checkParam.put("checkFlag", this.isSynergyRule(userMap, ruleDetailMap, marketCaseBaseMap, channelInfoMap));
			return checkParam;
		}*/
		//关闭规则
		if(Const.RULE_TYPE_CLOSE.equals(ruleDetailMap.get("ruleDetailType"))){
			checkParam.put("checkFlag", this.isCloseRule(inParam,userMap, ruleDetailMap,marketCaseBaseMap,channelInfoMap));
			log.debug("===Rule.isPassRule.isCloseRule.checkParam===", checkParam);
			return checkParam;
		}
		checkParam.put("checkFlag",true);
		return checkParam;
	}
	
	/**
	 * 是否推荐关闭
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: isRecommonedClose 
	* @param inParam
	* @param userMap
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public boolean isRecommonedClose(Map<String, Object> inParam,Map<String, Object> userMap,Map<String, Object> tempInParam)throws StrategyError {
		Map<String, Object> tempParam = new HashMap<String, Object>();
		tempParam.put("idNo", userMap.get("idNo"));
		tempParam.put("marketCaseId", tempInParam.get("marketCaseId"));
		tempParam.put("channelId", inParam.get("channelId"));
		Map<String, Object> recommendClose = marketCaseSelector.selectRecommendCloseByRowKey(tempParam);
		log.debug("isRecommonedClose.recommendClose", recommendClose);
		if(!CommonUtils.objectIsNull(recommendClose)){
			return false;
		}
		return true;
	}

	/**
	 * 判断是否是今日要批量下发的营销案
	* @date: 2016-11-8 
	* @author: zhangjj_crmpd
	* @title: isWaitToDayBatchPush 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public boolean isWaitToDayBatchPush(Map<String,Object> inParam) throws StrategyError{
		QueryFilter queryFilter = new QueryFilter();
		Map<String,Object> batchPushInfo = new HashMap<String, Object>();
		Boolean isBatchPush = false;
		Boolean isWaitToday = false;
		if(CommonUtils.objectIsNull(inParam)){
			return false;
		}
		queryFilter.setParentComponentId(inParam.get("marketCaseId").toString());
		//根据push营销案的id查询到规则
		List<Map<String,Object>> ruleDetailList = ruleSelector.selectRuleDetailByMarketCaseId(inParam, queryFilter);
		log.info("------------------ruleDetailList:-------------------", ruleDetailList);
		
		if(!CommonUtils.objectIsNull(ruleDetailList)){
			for(Map<String,Object> ruleDetail: ruleDetailList){
				if(!isBatchPush){
					isBatchPush =isBatchPushMarketCase(isBatchPush,ruleDetail,batchPushInfo);
				}else{
					isBatchPushMarketCase(isBatchPush,ruleDetail,batchPushInfo);
				}
			}
			log.info("isBatchPush", isBatchPush);
			isWaitToday = isWaitTodayMarketCase(batchPushInfo);
		}
		log.info("isWaitToday:", isWaitToday);
		if( isBatchPush && isWaitToday){
			return true;
		}
		return false;
	}
	
	/**
	 * 判断是否是已经生成外呼任务
	* @date: 2017-4-22 
	* @author: yuanchun
	* @title: isHasCallTask 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public boolean isHasCallTask(Map<String, Object> inParam)throws StrategyError {
		
		IQueryFilter queryFilter = new QueryFilter();
		String marketCaseId =(String) inParam.get("marketCaseId");
		queryFilter.setBusiId(marketCaseId);
		//只用于查看日志
		Boolean isAdd = false;
		//根据marketCaseId查询是否已经生成任务
		List<Map<String,Object>> callTaskControlList = systemDealSelector.selectShellProcessExecuteById(queryFilter);
		log.debug("isHasCallTask.callTaskControlList",callTaskControlList);
		if(!CommonUtils.objectIsNull(callTaskControlList)){
			//筛选出已生成任务的营销案
			for(Map<String,Object> callTask:callTaskControlList){
				if(marketCaseId.equals(callTask.get("busiId"))
						&&Const.MARKET_CASE_STATUS_EXE.equals(callTask.get("statusCode"))
						&&Const.SHELLPROCESS_NO_WAITCREATECALLTASK.equals(callTask.get("processNo"))){
					isAdd=true;
					log.debug("isHasCallTask.isJobToday", isAdd);
					return false;
				}
			}
		}
		
		return true;
	}
	
	/**
	 * 判断今日是否已经生成了主动PUSH营销案任务
	* @date: 2016-11-29 
	* @author: zhangqia
	* @title: isHaveCachedBatchPush 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public boolean itHasBatchPushJob(Map<String,Object> inParam,String position) throws StrategyError{
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setUpdateTime(DateUtil.string2Timestamp(DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD2), DateUtil.DATE_FROMAT_YYYYMMDD2));
		Boolean isJobToday = false;
		//查询今日是否有营销案PUSH任务 已生成
		List<Map<String,Object>> waitSendTaskControlList = systemDealSelector.selectShellProcessExecuteList(inParam, queryFilter);
		log.info("---------------waitSendTaskControlList----------", waitSendTaskControlList);
		String currentMarketCaseId =inParam.get("marketCaseId").toString();
		//遍历当日批量任务列表 筛选出已生成任务的营销案
		for(Map<String,Object> ruleBatchPushRecord:waitSendTaskControlList){
			if(currentMarketCaseId.equals(ruleBatchPushRecord.get("busiId"))&&Const.MARKET_CASE_STATUS_EXE.equals(ruleBatchPushRecord.get("statusCode"))){
				if(Const.POSITION_02_01.equals(position)&& Const.SHELLPROCESS_NO_WAITCREATEBATCHPUSHMSG.equals(ruleBatchPushRecord.get("processNo"))){
					isJobToday=true;
					log.info("isJobToday", isJobToday);
					return false;
				}else if(Const.POSITION_01_02.equals(position)&& Const.SHELLPROCESS_NO_WAITCREATEBATCHPUSHPROD.equals(ruleBatchPushRecord.get("processNo"))){
					isJobToday=true;
					log.info("isJobToday", isJobToday);
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * 解析缴费事件ID和规则明细
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: parsePayFeeEventIdAndMarketCaseIdRelAndRuleDetail 
	* @param payFeeEventIdAndMarketCaseIdRelAndEventDetail
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,List<Map<String, Object>>> parsePayFeeEventIdAndMarketCaseIdRelAndRuleDetail(
			List<Map<String, Object>> payFeeEventIdAndMarketCaseIdRelAndEventDetailList)
			throws StrategyError {
		
		Map<String,List<Map<String,Object>>> payFeeEventAndMarketCaseRelCache = new HashMap<String,List<Map<String,Object>>>();
		Map<String,Object> tempParam = new HashMap<String,Object>();
		
		for(Map<String, Object> map : payFeeEventIdAndMarketCaseIdRelAndEventDetailList){
			tempParam.put("eventId", map.get("eventId"));
			tempParam.put("marketCaseId", map.get("marketCaseId"));
			log.debug("parsePayFeeEventIdAndMarketCaseIdRelAndRuleDetail", tempParam);
			List<Map<String,Object>> ruleList = ruleSelector.selectRuleDetailsByEventIdAndMarketCaseId(tempParam);
			log.debug("parsePayFeeEventIdAndMarketCaseIdRelAndRuleDetail", ruleList);
			
			String key = "";
			for(Map<String,Object> ruleDetailMap : ruleList){
				if("eventTriggerChannel".equals((String)ruleDetailMap.get("ruleParCode"))){
					key = Const.CACHE_DATATYPE_EVENT_FEE + (String)ruleDetailMap.get("ruleParValue");
				}
			
				if(payFeeEventAndMarketCaseRelCache.get(key) == null){
					List<Map<String, Object>> retList = new ArrayList<Map<String,Object>>();
					Map<String,Object> retMap = new HashMap<String,Object>();
					retMap.put(map.get("feePayStart") + Const.SEPARATOR_COLON + map.get("feePayEnd") + Const.SEPARATOR_COLON + map.get("eventId"), Double.parseDouble((String)map.get("offerMoney"))*(-1));
					retList.add(retMap);
					payFeeEventAndMarketCaseRelCache.put(key, retList);
				}else{
					List<Map<String,Object>> retList = payFeeEventAndMarketCaseRelCache.get(key);
					Map<String,Object> retMap = new HashMap<String,Object>();
					retMap.put(map.get("feePayStart") + Const.SEPARATOR_COLON + map.get("feePayEnd") + Const.SEPARATOR_COLON + map.get("eventId"), Double.parseDouble((String)map.get("offerMoney"))*(-1));
					retList.add(retMap);
					payFeeEventAndMarketCaseRelCache.put(key, retList);
				}
			}
		}
		
		return payFeeEventAndMarketCaseRelCache;
	}

	/** 
	 *查询全局策略配置列表
	* @date: 2016-10-15 
	* @author: xiongxq
	* @Title: queryGlobalStrategyConfigList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public List<Map<String, Object>> queryGlobalStrategyConfigList(
			Map<String, Object> inParam, IQueryFilter queryFilter)
			throws StrategyError {
		List<Map<String,Object>> outLlist = ruleSelector.selectGlobalRule(inParam, queryFilter);
		return outLlist;
	}
	
	/**
	 * 查询全局规则详细信息
	* @date: 2016-12-29 
	* @author: sunliang 
	* @title: queryGlobalRuleDetail 
	* @param globalRuleTypeList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryGlobalRuleDetail(
			List<Map<String, Object>> globalRuleTypeList) throws StrategyError {
		
		Map<String, Object> globalRuelDetailMap = new HashMap<String, Object>();
		if(!CommonUtils.objectIsNull(globalRuleTypeList)){
			for(Map<String, Object> globalRuleTypeMap : globalRuleTypeList){
				String globalRuleType = (String)globalRuleTypeMap.get("ruleDetailType");
				String globalRuleDetailId = (String)globalRuleTypeMap.get("ruleDetailId");
				Map<String,Object> tempParam = new HashMap<String,Object>();
				tempParam.put("globalRuleDetailId", globalRuleDetailId);
				List<Map<String, Object>> globalRuleDetailList = ruleSelector.selectGlobalRuleDetailById(tempParam);
				globalRuelDetailMap.put(globalRuleType, globalRuleDetailList);
			}
		}
		return globalRuelDetailMap;
	}

	/**
	 * 根据规则id查询营销案
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: queryMarketCaseByRuleId 
	* @param ruleIdList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseByRuleId(List<Map<String,Object>> ruleIdList)throws StrategyError{
		Map<String,Object> marketCaseInfoMap = new HashMap<String,Object>();
		for(Map<String,Object> ruleInfo : ruleIdList){
			String prodId = (String) ruleInfo.get("ruleParValue");
			String ruleId = (String) ruleInfo.get("ruleId");
			Map<String,Object> tempInParam = new HashMap<String,Object>();
			tempInParam.put("ruleId", ruleId);
			Map<String,Object> marketCaseInfo = marketCaseSelector.selectMarketCaseIdByCloseRuleId(tempInParam);
			log.debug("===Rule.queryMarketCaseByRuleId.marketCaseInfo===", marketCaseInfo);
			
			if(!CommonUtils.objectIsNull(marketCaseInfo)){
				String marketCaseId = (String) marketCaseInfo.get("parentComponentId");
				Map<String,Object> tempParam = new HashMap<String,Object>();
				tempParam.put("marketCaseId", marketCaseId);
				Map<String,Object> marketCaseDetailMap = marketCaseSelector.selectMarketCaseInfoById(tempParam);
				
				//查询营销案状态
				String statusCode = (String) marketCaseDetailMap.get("statusCode");
				if(!Const.MARKET_CASE_STATUS_EXE.equals(statusCode)){
					continue;
				}
				
				if(marketCaseInfoMap.containsKey(prodId)){
					List<String> marketCaseIdList = (List<String>) marketCaseInfoMap.get(prodId);
					marketCaseIdList.add(marketCaseId);
					marketCaseInfoMap.put(prodId,marketCaseIdList);
				}else{
					List<String> marketCaseIdList = new ArrayList<String>();
					marketCaseIdList.add(marketCaseId);
					marketCaseInfoMap.put(prodId, marketCaseIdList);
				}
			}
			
		}
		log.debug("===Rule.queryMarketCaseByRuleId.marketCaseInfoMap===", marketCaseInfoMap);
		
		return marketCaseInfoMap;
	}
	
	/**
	 * 查询互斥规则详细信息
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: queryMutexRuleDetail 
	* @param ruleInfoList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryMutexRuleDetail(List<Map<String,Object>> ruleInfoList)throws StrategyError{
		Map<String,Object> mutexMarketCaseMap = new HashMap<String,Object>();
		
		if(!CommonUtils.objectIsNull(ruleInfoList)){
			for(Map<String,Object> ruleInfo : ruleInfoList){
				Map<String,Object> ruleIdMap = new HashMap<String,Object>();
				String inParamRuleId = (String)ruleInfo.get("ruleId");
				ruleIdMap.put("ruleId", inParamRuleId);
				ruleIdMap.put("ruleParCode", Const.RULE_CODE_MUTEXRULE_MUTEXMARKETCASE);
				log.debug("===Rule.queryMutexRuleDetail.ruleId===", inParamRuleId);
				
				//从规则详情表中过滤出互斥规则
				List<Map<String,Object>> ruleDetailList = this.queryRuleDetail(ruleIdMap);
				log.debug("===Rule.queryMutexRuleDetail.ruleDetailList===", ruleDetailList);
				
				if(!CommonUtils.objectIsNull(ruleDetailList)){
					for(Map<String,Object> ruleDetail : ruleDetailList){
						String mutexRuleId = (String) ruleDetail.get("ruleId");
						String marketCaseIdB = (String) ruleDetail.get("ruleParValue");
						Map<String,Object> selectMarketCaseInParam = new HashMap<String,Object>();
						selectMarketCaseInParam.put("ruleId", mutexRuleId);
						//根据规则Id查询营销案A
						Map<String,Object> marketCaseRel = ruleSelector.selectMarketCaseIdByRuleId(selectMarketCaseInParam);
						log.debug("===Rule.queryMutexRuleDetail.marketCaseRel===", marketCaseRel);
						
						if(CommonUtils.objectIsNull(marketCaseRel)){
							continue;
						}
						String marketCaseIdA = (String) marketCaseRel.get("parentComponentId");
						Map<String,Object> selectMarketCaseInfoInParam = new HashMap<String,Object>();
						
						//根据营销案A的id查询营销案A状态
						selectMarketCaseInfoInParam.put("marketCaseId", marketCaseIdA);
						Map<String,Object> marketCaseInfoA = marketCaseSelector.selectMarketCaseInfoById(selectMarketCaseInfoInParam);
						log.debug("===Rule.queryMutexRuleDetail.marketCaseInfoA===", marketCaseInfoA);
						//营销案A状态
						String statusCodeA = (String) marketCaseInfoA.get("statusCode");
						log.debug("===Rule.queryMutexRuleDetail.statusCodeA===", statusCodeA);
						System.out.println("===Rule.queryMutexRuleDetail.statusCodeA==="+statusCodeA);
						if(!Const.MARKET_CASE_STATUS_EXE.equals(statusCodeA)){
							continue;
						}
						
						//根据营销案B的id查询营销案B状态
						selectMarketCaseInfoInParam.put("marketCaseId", marketCaseIdB);
						Map<String,Object> marketCaseInfoB = marketCaseSelector.selectMarketCaseInfoById(selectMarketCaseInfoInParam);
						log.debug("===Rule.queryMutexRuleDetail.marketCaseInfoB===", marketCaseInfoB);
						//营销案B状态
						String statusCodeB = (String) marketCaseInfoB.get("statusCode");
						log.debug("===Rule.queryMutexRuleDetail.statusCodeB===", statusCodeB);
						System.out.println("===Rule.queryMutexRuleDetail.statusCodeB==="+statusCodeB);
						if(!Const.MARKET_CASE_STATUS_EXE.equals(statusCodeB)){
							continue;
						}
						
						//一条互斥规则会入两条缓存，A-B
						if(mutexMarketCaseMap.containsKey(marketCaseIdA)){
							List<String> mutexList = (List<String>) mutexMarketCaseMap.get(marketCaseIdA);
							mutexList.add(marketCaseIdB);
							
							mutexMarketCaseMap.put(marketCaseIdA, mutexList);
						}else{
							List<String> mutexList = new ArrayList<String>();
							mutexList.add(marketCaseIdB);
							
							mutexMarketCaseMap.put(marketCaseIdA, mutexList);
						}
						//B-A
						if(mutexMarketCaseMap.containsKey(marketCaseIdB)){
							List<String> mutexList = (List<String>) mutexMarketCaseMap.get(marketCaseIdB);
							mutexList.add(marketCaseIdA);
							
							mutexMarketCaseMap.put(marketCaseIdB, mutexList);
						}else{
							List<String> mutexList = new ArrayList<String>();
							mutexList.add(marketCaseIdA);
							
							mutexMarketCaseMap.put(marketCaseIdB, mutexList);
						}
					}
				}
			}
			log.debug("===Rule.queryMutexRuleDetail.mutexMarketCaseMap===", mutexMarketCaseMap);
		}
		return mutexMarketCaseMap;
	}
	
	/**
	 * 查询规则基本信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryRuleById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryRuleInfo(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		return (Map<String, Object>) ruleSelector.selectRuleInfo(inParam,queryFilter);
	}
	
	/**
	 * 查询规则详细信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryRuleDetail 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Deprecated
	@Override
	public List<Map<String,Object>> queryRuleDetail(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		List<Map<String,Object>> ruleDetailList = ruleSelector.selectRuleDetailList(inParam,queryFilter);
		return ruleDetailList;
	}
	
	/**
	 * 查询规则详细(新)
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: queryRuleDetail 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryRuleDetail(Map<String,Object> inParam)throws StrategyError{
		return ruleSelector.selectRuleDetailList(inParam);
	}
	
	/**
	 * 查询规则详情Id
	* @date: 2016-10-7 
	* @author: wangth
	* @Title: queryRuleDetailId 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryRuleDetailId(
			Map<String, Object> inParam, IQueryFilter queryFilter)
			throws StrategyError {
		List<Map<String,Object>> ruleDetailIdList = ruleSelector.selectRuleDetailId(inParam,queryFilter);
		return ruleDetailIdList;
	}
	
	/**
	 * 根据关系id查询规则详情
	* @date: 2016-12-21 
	* @author: zhangjj_crmpd
	* @title: queryRuleDetailByParentComponentId 
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
	public List<Map<String, Object>> queryRuleDetailByParentComponentId(
			Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentId(CommonUtils.toString(inParam.get("parentComponentId")));
		queryFilter.setComponentType(CommonUtils.toString(inParam.get("componentType")));
		queryFilter.setRuleParCode(CommonUtils.toString(inParam.get("ruleParCode")));
		queryFilter.setBatchNo(CommonUtils.toString(inParam.get("batchNo")));
		queryFilter.setRuleDetailId(CommonUtils.toString(inParam.get("ruleDetailId")));
		return ruleSelector.selectRuleDetailByParentComponentId(inParam, queryFilter);
	}

	/**
	 *删除全局策略配置 
	* @date: 2016-10-14 
	* @author: xiongxq
	* @Title: removeGlobalStrategyConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeGlobalStrategyConfig(Map<String,Object>inParam) throws StrategyError{
		ruleDeleter.deleteGlobalRule(inParam);
	}
	
	/**
	 * 移除规则信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: removeRuleById 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeRuleById(Map<String,Object> inParam) throws StrategyError {
		this.removeRuleInfo(inParam);
		this.removeRuleDetail(inParam);
	}

	/** 
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: removeRuleDetailByDetailId 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public void removeRuleDetailByDetailId(Map<String, Object> inParam)
			throws StrategyError {
		this.removeRuleDetail(inParam);
	}

	/**
	 * 更新规则信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: updateRuleById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateRuleById(Map<String,Object> inParam) throws StrategyError {
		this.updateRuelInfo(inParam);
		this.updateRuelDetail(inParam);
	}
	
	/**
	 * 添加事件或渠道的规则
	* @date: 2017-2-21 
	* @author: zhangyw_crmpd
	* @title: addCustOrEventRuleDetail 
	* @param inParam
	* @param ruleDetailInfo
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> addCustOrEventRuleDetail(Map<String,Object> inParam,Map<String,Object> ruleDetailInfo) throws StrategyError {
		String marketCaseCustGrouprelId = (String) inParam.get("marketCaseCustGrouprelId");
		String custGroupId = (String) inParam.get("custGroupId");
		String channelId = (String) inParam.get("channelId");
		String eventId = (String) inParam.get("eventId");
		System.out.println("eventId====rule============="+eventId);
		String custGroupAndChannelOrEventRelId = "";
		String ruleId = "";
		Map<String,Object> newInParam = new HashMap<String, Object>();
		newInParam.put("parentRelId", marketCaseCustGrouprelId);
		newInParam.put("parentComponentId", custGroupId);
		newInParam.put("parentComponentType", Const.COMPONENT_TYPE_CUSTGROUP);
		if(CommonUtils.objectIsNull(eventId)){
			newInParam.put("componentId", channelId);
			newInParam.put("componentType", Const.COMPONENT_TYPE_CHANNEL);
		}else{
			newInParam.put("componentId", eventId);
			newInParam.put("componentType", Const.COMPONENT_TYPE_EVENT);
		}
		
		//查询客户群是否已关联此渠道或事件
		Map<String,Object> custGroupAndChannelOrEventRel = this.queryRelation(newInParam);
		if (CommonUtils.objectIsNull(custGroupAndChannelOrEventRel)) {
			custGroupAndChannelOrEventRelId = SequenceUtil.getSequence();
			newInParam.put("relId", custGroupAndChannelOrEventRelId);
			ruleInsertor.insertRelationInfo(newInParam);
		}else{
			custGroupAndChannelOrEventRelId = (String)custGroupAndChannelOrEventRel.get("relId");
		}
		
		newInParam = new HashMap<String, Object>();
		newInParam.put("parentRelId", custGroupAndChannelOrEventRelId);
		if(CommonUtils.objectIsNull(eventId)){
			newInParam.put("parentComponentId", channelId);
			newInParam.put("parentComponentType", Const.COMPONENT_TYPE_CHANNEL);
		}else{
			newInParam.put("parentComponentId", eventId);
			newInParam.put("parentComponentType", Const.COMPONENT_TYPE_EVENT);
		}
		newInParam.put("componentType", Const.COMPONENT_TYPE_RULE);
		Map<String,Object> channelOrEventRuleRel = this.queryRelation(newInParam);
		//判断渠道或事件是否已关联规则
		if (CommonUtils.objectIsNull(channelOrEventRuleRel)) {
			ruleId = SequenceUtil.getSequence();
			newInParam.put("componentId", ruleId);
			newInParam.put("relId", SequenceUtil.getSequence());
			ruleInsertor.insertRelationInfo(newInParam);
			Map<String,Object> tempInParam = new HashMap<String, Object>();
			tempInParam .put("serialId", SequenceUtil.getSequence());
			tempInParam .put("ruleId", ruleId);
			ruleInsertor.insertRuleInfo(inParam, tempInParam);
		}else{
			ruleId = (String) channelOrEventRuleRel.get("componentId");
		}
		String ruleDetailId = (String) ruleDetailInfo.get("ruleDetailId");
		if (!CommonUtils.objectIsNull(ruleDetailId)) {
			Map<String,Object> in = new HashMap<String, Object>();
			in.put("ruleDetailId", ruleDetailId);
			ruleDeleter.deleteRuleDetailInfo(in);
		}else{
			ruleDetailId = SequenceUtil.getSequence();
		}
		String ruleDetailType = (String) ruleDetailInfo.get("ruleDetailType");
		List<Map<String,Object>> params = (List<Map<String, Object>>) ruleDetailInfo.get("params");
		for (Map<String, Object> map : params) {
			map.put("serialId", SequenceUtil.getSequence());
			map.put("ruleId", ruleId);
			map.put("ruleDetailId", ruleDetailId);
			map.put("ruleDetailType", ruleDetailType);
			ruleInsertor.insertRuleDetailInfo(map, map);
		}
		//增加规则明细
		Map<String,Object> out = new HashMap<String, Object>();
		out.put("marketCaseCustGroupRelId", marketCaseCustGrouprelId);
		out.put("custGroupChannelRelId", custGroupAndChannelOrEventRelId);
		out.put("custGroupId", custGroupId);
		out.put("eventId", eventId);
		out.put("channelId", channelId);
		out.put("ruleId", ruleId);
		out.put("ruleDetailId", ruleDetailId);
		return out;
	}
	
	/** 增加渠道规则
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: addChannelAndRuleDetail 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String,Object> addChannelAndRuleDetail(Map<String,Object> inParam,Map<String,Object> ruleDetailInfo) throws StrategyError {
		String marketCaseCustGrouprelId = (String) inParam.get("marketCaseCustGrouprelId");
		String custGroupId = (String) inParam.get("custGroupId");
		String channelId = (String) inParam.get("channelId");
		String custGroupChannelRelId = "";
		String ruleId = "";
		Map<String,Object> newInParam = new HashMap<String, Object>();
		newInParam.put("parentRelId", marketCaseCustGrouprelId);
		newInParam.put("parentComponentId", custGroupId);
		newInParam.put("parentComponentType", Const.COMPONENT_TYPE_CUSTGROUP);
		newInParam.put("componentId", channelId);
		newInParam.put("componentType", Const.COMPONENT_TYPE_CHANNEL);
		//查询客户群是否已关联此渠道
		Map<String,Object> custGroupChannelRel = this.queryRelation(newInParam);
		if (CommonUtils.objectIsNull(custGroupChannelRel)) {
			custGroupChannelRelId = SequenceUtil.getSequence();
			newInParam.put("relId", custGroupChannelRelId);
			ruleInsertor.insertRelationInfo(newInParam);
		}else{
			custGroupChannelRelId = (String)custGroupChannelRel.get("relId");
		}
		
		newInParam = new HashMap<String, Object>();
		newInParam.put("parentRelId", custGroupChannelRelId);//吉林需要替换成custGroupEventRelId
		newInParam.put("parentComponentId", channelId);
		newInParam.put("parentComponentType", Const.COMPONENT_TYPE_CHANNEL);
		newInParam.put("componentType", Const.COMPONENT_TYPE_RULE);
		Map<String,Object> channelRuleRel = this.queryRelation(newInParam);
		//判断渠道是否已关联规则
		if (CommonUtils.objectIsNull(channelRuleRel)) {
			ruleId = SequenceUtil.getSequence();
			newInParam.put("componentId", ruleId);
			newInParam.put("relId", SequenceUtil.getSequence());
			ruleInsertor.insertRelationInfo(newInParam);
			Map<String,Object> tempInParam = new HashMap<String, Object>();
			tempInParam .put("serialId", SequenceUtil.getSequence());
			tempInParam .put("ruleId", ruleId);
			ruleInsertor.insertRuleInfo(inParam, tempInParam);
		}else{
			ruleId = (String) channelRuleRel.get("componentId");
		}
		String ruleDetailId = (String) ruleDetailInfo.get("ruleDetailId");
		if (!CommonUtils.objectIsNull(ruleDetailId)) {
			Map<String,Object> in = new HashMap<String, Object>();
			in.put("ruleDetailId", ruleDetailId);
			ruleDeleter.deleteRuleDetailInfo(in);
		}else{
			ruleDetailId = SequenceUtil.getSequence();
		}
		String ruleDetailType = (String) ruleDetailInfo.get("ruleDetailType");
		List<Map<String,Object>> params = (List<Map<String, Object>>) ruleDetailInfo.get("params");
		for (Map<String, Object> map : params) {
			map.put("serialId", SequenceUtil.getSequence());
			map.put("ruleId", ruleId);
			map.put("ruleDetailId", ruleDetailId);
			map.put("ruleDetailType", ruleDetailType);
			ruleInsertor.insertRuleDetailInfo(map, map);
		}
		//增加规则明细
		Map<String,Object> out = new HashMap<String, Object>();
		out.put("marketCaseCustGroupRelId", marketCaseCustGrouprelId);
		out.put("custGroupChannelRelId", custGroupChannelRelId);
		out.put("custGroupId", custGroupId);
		out.put("channelId", channelId);
		out.put("ruleId", ruleId);
		out.put("ruleDetailId", ruleDetailId);
		return out;
	}
	
	/**
	 * 判断当前时间是否在给定的时间段内
	* @date: 2016-12-21 
	* @author: zhangjj_crmpd
	* @title: checkCurrentDateInTimes 
	* @param times
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean checkCurrentDateInTimes(String times) {
		if(CommonUtils.objectIsNull(times)){
			return false;
		}
		Date startDate =DateUtil.StringToDate(times.split(Const.SEPARATOR_AND)[0], DateUtil.DATE_FROMAT_YYYYMMDD2);
		Date endDate =DateUtil.StringToDate(times.split(Const.SEPARATOR_AND)[1], DateUtil.DATE_FROMAT_YYYYMMDD2);
		Date currentDate = new Date();
		return currentDate.after(startDate) && currentDate.before(endDate);
	}
	
	/**
	 * 校验频次规则下的（每天接触的总次数）
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: checkFrequencyRuleInDayTouchNum 
	* @param inParam
	* @param RuleMap
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean checkFrequencyRuleInDayTouchNum(Map<String, Object>inParam, Map<String, Object> RuleMap, Map<String,Object> marketCaseBaseMap) throws StrategyError{
		//查询营销案推荐统计表中当前营销案在此渠道下当天总的执行次数
		Map<String, Object>  control = (Map<String, Object>) inParam.get("marketCaseTouchControl");
		if(!CommonUtils.objectIsNull(control)){
			String dayCount = (String)control.get("dayCount");
			String forwardRecommendTime = (String) control.get("forwardRecommendTime");
			if((!CommonUtils.objectIsNull(dayCount) && !CommonUtils.objectIsNull(forwardRecommendTime))){
				Date now = new Date();
				if (DateUtil.DateToString(now, DateUtil.DATE_FROMAT_YYYYMMDD1).equals(DateUtil.stringToString(forwardRecommendTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD1))) {
					if(Integer.valueOf(dayCount) < Integer.valueOf((String)RuleMap.get(Const.RULE_CODE_FREQUENCYRULE_DAYTOUCHNUM))){
						return true;
					}else{
						return false;
					}
				}
			}
		}
		return true;
	}
	
	/**
	 * 校验频次规则下的（间隔天数）
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: checkFrequencyRuleInIntervalDay 
	* @param inParam
	* @param RuleParam
	* @param marketCaseId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean checkFrequencyRuleInIntervalDay(Map<String, Object>inParam, Map<String, Object> RuleMap, Map<String,Object> marketCaseBaseMap){
		//根据idNo:marketCaseId:channel查询用户推荐控制表
		Map<String, Object> userRecommendControl = (Map<String, Object>) inParam.get("marketCaseTouchControl");
		if(!CommonUtils.objectIsNull(userRecommendControl)){
			String forwardRecommendTime = (String)userRecommendControl.get("forwardRecommendTime");
			DateFormat df = new SimpleDateFormat(DateUtil.DATE_FROMAT_YYYYMMDD2);
			try {
				Date now = new Date();
				Date forward = df.parse(forwardRecommendTime);
				if ((now.getTime()-forward.getTime())/1000/3600/24 <= Integer.valueOf((String)RuleMap.get(Const.RULE_CODE_FREQUENCYRULE_DAYTOUCHNUM))) {
					return true;
				}else{
					return false;
				}
	
			}catch (ParseException e) {
				e.printStackTrace();
			}
		}	
		return true;
	}
	
	/**
	 * 校验频次规则下的接触周期
	* @date: 2016-11-15 
	* @author: yangwl
	* @title: checkFrequencyRuleInTouchDate 
	* @param inParam
	* @param RuleParamList
	* @param dateType
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean checkFrequencyRuleInTouchDate(Map<String, Object>inParam, Map<String, Object> ruleMap, String dateType){
		if(dateType.equals(Const.RULE_VALUE_WEEK)){//接触周期-周
			int weekDay = DateUtil.getDayOfWeek();
			if (!CommonUtils.objectIsNull(ruleMap.get(Const.RULE_CODE_FREQUENCYRULE_WEEKDAY))) {
				String[] weekDays = ((String)ruleMap.get(Const.RULE_CODE_FREQUENCYRULE_WEEKDAY)).split(Const.SEPARATOR_TIPNO);
				return this.isTodayFromWeekOrMonthArr(String.valueOf(weekDay),weekDays);
			}
		}
		if(dateType.equals(Const.RULE_VALUE_MONTH)){//接触周期-月
			int monthDay = DateUtil.getDayOfMonth();
			if (!CommonUtils.objectIsNull(ruleMap.get(Const.RULE_CODE_FREQUENCYRULE_MONTHDAY))) {
				String[] monthDays = ((String)ruleMap.get(Const.RULE_CODE_FREQUENCYRULE_MONTHDAY)).split(Const.SEPARATOR_TIPNO);
				return this.isTodayFromWeekOrMonthArr(String.valueOf(monthDay),monthDays);
			}
		}
		return true;
	}
	
	/**
	 * 校验频次规则下的（总次数）
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: checkFrequencyRuleInTouchTotal 
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> checkFrequencyRuleInTouchTotal(Map<String, Object> inParam, Map<String, Object> ruleMap, Map<String,Object> marketCaseBaseMap) throws StrategyError{
		//0-与周期内第一次推送比超过周期  1-校验通过 2-不通过 3-与周期内上一次推送比超过周期 */
		int flag = 1;
		Map<String, Object> checkParam = new HashMap<String, Object>();
		Map<String, Object>  control = (Map<String, Object>) inParam.get("marketCaseTouchControl");
		String touchPerid = (String) ruleMap.get(Const.RULE_CODE_FREQUENCYRULE_TOUCHPERIDL);
		String touchTotal = (String) ruleMap.get(Const.RULE_CODE_FREQUENCYRULE_TOUCHTOTAL);
		if(!CommonUtils.objectIsNull(control)){
			String firstRecommendTime = (String)control.get("firstRecommendTime");
			String forwardRecommendTime = (String)control.get("forwardRecommendTime");
			String recommendCount = (String)control.get("recommendCount");
			if (!CommonUtils.objectIsNull(touchPerid)) {
				if (CommonUtils.objectIsNull(forwardRecommendTime) || CommonUtils.objectIsNull(firstRecommendTime) || CommonUtils.objectIsNull(recommendCount)) {
					flag = 3;
				}else{
					Date now = new Date();
					Date first = DateUtil.StringToDate(firstRecommendTime, DateUtil.DATE_FROMAT_YYYYMMDD2);
					Date forward = DateUtil.StringToDate(forwardRecommendTime, DateUtil.DATE_FROMAT_YYYYMMDD2);
					if ((now.getTime()-first.getTime())/1000/3600/24 >= Integer.valueOf(touchPerid)) {
						if ((now.getTime()-forward.getTime())/1000/3600/24 >= Integer.valueOf(touchPerid)) {
							//3-与周期内上一次推送比超过周期
							flag = 3;
						}else{
							//0-与周期内第一次推送比超过周期,与周期内上一次推送比未超过周期
							flag = 0;
						}
					}else{
						if(Integer.valueOf(recommendCount) + 1 > Integer.valueOf(touchTotal)){
							//2-不通过
							flag = 2;
						}
					}
				}
			}else{
				String count = CommonUtils.objectIsNull(control.get("count")) ? "0":(String)control.get("count");
				if(Integer.valueOf(count) < Integer.valueOf(touchTotal)){
					flag = 3;
				}else{
					flag = 2;
				}
			}
		}else{
			flag = 3;
		}
		checkParam.put("checkFlag", false);
		log.debug("===checkFrequencyRuleInTouchTotal===flag=", flag);
		if (flag!=2) {
			checkParam.put("checkFlag", true);
			checkParam.put("marketCaseTouchControl", this.dealFrequencyRuleInTouchResult(control, flag));
			log.debug("===checkFrequencyRuleInTouchTotal===checkParam=", checkParam);
		}
		return checkParam;
	}
	
	/**
	 * 校验关闭规则
	* @date: 2017-4-1 
	* @author: sunyuan
	* @title: checkCloseRule 
	* @param inParam
	* @param ruleBatchNoList
	* @param marketCaseBaseMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean checkCloseRule(Map<String, Object>userMap, List<List<Map<String, Object>>> ruleBatchNoList, Map<String, Object> marketCaseBaseMap,Map<String,Object> channelInfoMap) throws StrategyError{
		for(List<Map<String, Object>> ruleBatchNo : ruleBatchNoList){
			for(Map<String, Object> RuleParam:ruleBatchNo){
				if(Const.RULE_CODE_CLOSEPRODUCTID.equals((String)RuleParam.get("ruleParCode"))){
					//查询推荐关闭表
					Map<String, Object> recommendClose = this.getRecommendClose(userMap, channelInfoMap, marketCaseBaseMap);
					log.debug("===Rule.checkCloseRule.recommendClose===", recommendClose);
					if(!CommonUtils.objectIsNull(recommendClose)){
						return false;
					}
				}
			}
		}
		return true;
	}
	
	/**
	 * 校验协同规则
	* @date: 2016-11-28 
	* @author: yangwl
	* @title: checkSynergyRule 
	* @param inParam
	* @param ruleBatchNoList
	* @param marketCaseBaseMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean checkSynergyRule(Map<String, Object> userMap, Map<String, Object> marketCaseBaseMap, Map<String,Object> channelInfoMap) throws StrategyError{
		//查询推荐关闭表(如果反馈时入协同规则的所有渠道，查询当前渠道下是否办理过；如果反馈时只入当前渠道，查询协同的营销案是否办理过)
		Map<String, Object> recommendClose = this.getRecommendClose(userMap, channelInfoMap, marketCaseBaseMap);
		log.debug("===Rule.checkSynergyRule.recommendClose===", recommendClose);
		if(!CommonUtils.objectIsNull(recommendClose)){
			return false;
		}
		return true;
	}
	
	/**
	 * 校验全局规则中的接触次数
	* @date: 2016-11-15 
	* @author: yangwl
	* @title: checkTouchCountGlobalRule 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> checkTouchCountGlobalRule(Map<String, Object> userRecommendControl, Map<String, Object>  touchCountRule){
		Map<String,Object> checkParam = new HashMap<String, Object>();
		Map<String,Object> controlParam = new HashMap<String, Object>();
		if(!CommonUtils.objectIsNull(touchCountRule)){
			Date now = new Date();
			String nowStr = DateUtil.DateToString(now, DateUtil.DATE_FROMAT_YYYYMMDD2);
			if (!CommonUtils.objectIsNull(userRecommendControl)) {
				try {
					String recommendTime = (String)userRecommendControl.get("recommendTime");
					log.debug("===Rule.checkTouchCountGlobalRule.recommendTime===", recommendTime);
					
					if (CommonUtils.objectIsNull(recommendTime)) {
						controlParam.put("recommendTime", nowStr);
						checkParam.put("checkFlag", true);
						checkParam.put("touchControl", controlParam);
						return checkParam;
					}
					//周期
					String perid = (String)touchCountRule.get("days");
					//次数
					String times = (String)touchCountRule.get("times");
					log.debug("===Rule.checkTouchCountGlobalRule.perid===", perid);
					log.debug("===Rule.checkTouchCountGlobalRule.times===", times);
					
					if (CommonUtils.objectIsNull(perid) || CommonUtils.objectIsNull(times)) {
						controlParam.put("recommendTime", nowStr);
						checkParam.put("checkFlag", true);
						checkParam.put("touchControl", controlParam);
						return checkParam;
					}
					String[] recommendTimeArr = recommendTime.split("\\|");
					Date first = DateUtil.StringToDate(recommendTimeArr[0], DateUtil.DATE_FROMAT_YYYYMMDD2);
					if (recommendTimeArr.length < Integer.valueOf(times)) {
						//没有达到次数
						controlParam.put("recommendTime", recommendTime+"|"+nowStr);
						checkParam.put("checkFlag", true);
						checkParam.put("touchControl", controlParam);
						return checkParam;
					}else if ((now.getTime()-first.getTime())/1000/3600/24 >= Integer.valueOf(perid)) {
						//首次时间超过周期
						String newRecommendTime = "";
						if (recommendTimeArr.length <= 1) {
							newRecommendTime = nowStr;
						}else{
							for (int i = recommendTimeArr.length - 1; i > recommendTimeArr.length - Integer.valueOf(times); i--) {
								newRecommendTime = recommendTimeArr[i] + "|" + newRecommendTime;
							}
							newRecommendTime += nowStr;
						}
						controlParam.put("recommendTime", newRecommendTime);
						checkParam.put("checkFlag", true);
						checkParam.put("touchControl", controlParam);
						return checkParam;
					}else{
						checkParam.put("checkFlag", false);
						return checkParam;
					}
				} catch (Exception e) {
					e.printStackTrace();
					checkParam.put("checkFlag", false);
					return checkParam;
				}
			}else{
				controlParam.put("recommendTime", nowStr);
				checkParam.put("checkFlag", true);
				checkParam.put("touchControl", controlParam);
				return checkParam;
			}
		}
		checkParam.put("checkFlag", true);
		return checkParam;
	}
	
	
	/**
	 * 校验免打扰时间段
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: checkUnTroubleTime 
	* @param inParam
	* @param marketCaseBaseMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean checkUnTroubleTime(Map<String, Object> inParam,Map<String,Object> RuleParam){
		String[] unTroubleTimes = ((String)RuleParam.get("ruleParValue")).split(Const.SEPARATOR_TILDE);
		
//		String beforeTime = null;
//		String afterTime = null;
//		Integer length = unTroubleTimes[0].length();
//		//若时间格式为hh:mi  将时间格式转为hh:mi:ss
//		if(length==5){
//			beforeTime = unTroubleTimes[0] + ":00";
//			afterTime = unTroubleTimes[1] + ":00";
//		}else{
//			beforeTime = unTroubleTimes[0];
//			afterTime = unTroubleTimes[1];
//		}
		
		String beforeTime = unTroubleTimes[0];
		String afterTime = unTroubleTimes[1];
		
		log.debug("luogj--checkUnTroubleTime--RuleParam", RuleParam);
		log.debug("luogj--checkUnTroubleTime--RuleParam--ruleParValue", RuleParam.get("ruleParValue"));
		log.debug("luogj--checkUnTroubleTime--unTroubleTimes[0]", unTroubleTimes[0]);
		log.debug("luogj--checkUnTroubleTime--unTroubleTimes[1]", unTroubleTimes[1]);
		log.debug("luogj--checkUnTroubleTime--DateUtil.TIME_FROMAT_HHMMSS", DateUtil.TIME_FROMAT_HHMMSS);
		
		log.debug("===Rule.checkUnTroubleTime.beforeTime===", beforeTime);
		log.debug("===Rule.checkUnTroubleTime.afterTime===", afterTime);
		//判断时间段
		if(DateUtil.isCurrentInTimePeriod(beforeTime, afterTime, DateUtil.TIME_FROMAT_HHMMSS)){
			return false;
		}
		return true;
	}
	/**
	 * 校验免打扰客户
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: checkUnTroubleUser 
	* @param inParam
	* @param marketCaseBaseMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 20170321 luogj 修改逻辑，只判断用户id是否存在
	* 20170407 sunyuan 增加判断黑名单规则
	 */
	protected boolean checkUnTroubleUser(Map<String, Object> inParam,Map<String, Object> userMap,Map<String,Object> marketCaseBaseMap,String unTroubleCustId) throws StrategyError{	
		log.debug("luogj---checkUnTroubleUser--idNo", userMap.get("idNo"));
		log.debug("===Rule.checkUnTroubleUser.unTroubleCust===", unTroubleCustId);
		
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("idNo", userMap.get("idNo"));
		log.debug("luogj---checkUnTroubleUser--tempInParam", tempInParam);
		
		Map<String, String> blackUser = new HashMap<String,String>();
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setCustGroupId(unTroubleCustId);
		//判断用户是否在黑名单客户群中
		if(!CommonUtils.objectIsNull(unTroubleCustId) && !Const.GREY_CUST_ID.equals(unTroubleCustId)){
			blackUser = custGroupSelector.selectCustGroupDetailByIdNo(tempInParam,queryFilter);
		}
		log.debug("===Rule.checkUnTroubleUser.blackUser===", blackUser);
		if(!CommonUtils.objectIsNull(blackUser)){
			return false;
		}
		
		Set<String> fields = new HashSet<String>();
		Map<String, Object> greyUser = new HashMap<String,Object>();
		if(!CommonUtils.objectIsNull(unTroubleCustId) && Const.GREY_CUST_ID.equals(unTroubleCustId)){
			greyUser = userSelector.selectGreyInfoByRowKey(tempInParam, fields);
		}
		log.debug("luogj---checkUnTroubleUser--greyUser", greyUser);
		if(!CommonUtils.objectIsNull(greyUser)){
			return false;
		}
		
		return true;
				
	}
	
	/**
	 * 处理校验全局规则中的接触次数结果并且入用户推荐控制表
	* @date: 2016-11-15 
	* @author: yangwl
	* @title: dealCheckTouchCountGlobalRuleResult 
	* @param inParam
	* @param userRecommendControl
	* @param touchCountRule
	* @param marketCaseBaseMap
	* @param flag 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,String> dealCheckTouchCountGlobalRuleResult(Map<String,Object> inParam, Map<String, Object> userRecommendControl, Map<String, Object> touchCountRule, Map<String,Object> marketCaseBaseMap, int flag,String bantchNo){
		Map<String, String> param = new HashMap<String, String>();
		
		DateFormat df = new SimpleDateFormat(DateUtil.TIME_FROMAT_SIMPLE1);
		Date now = new Date();
		String systemTime = df.format(now);
		
		//第一次
		if(CommonUtils.objectIsNull(userRecommendControl)){
			param.put("firstRecommendTime", systemTime);
			param.put("forwardRecommendTime", systemTime);
			param.put("recommendCount", "1");
			param.put("batchNo", bantchNo);
		}else{
			/*第二次：
			判断周期：当前时间 - 周期内第一次时间 与 规则内配置的周期时间 比较
			周期内：没到最大次数，则加1，将上次推送时间改为当前时间，然后推荐；如达到最大次数，则不推荐；
			周期外：肯定推送，当前时间与上一次推送时间比较，如和上一次比较超过周期，则入：当前时间，当前时间，1
					如和上一次比较没有超过周期，则入：上一次推荐时间，当前时间，1
			0-与周期内第一次推送比超过周期  1-校验通过 2-不通过 3-与周期内上一次推送比超过周期 */
			if(flag == 1){
				int count = Integer.parseInt((String)userRecommendControl.get("recommendCount"));
				param.put("firstRecommendTime", (String)userRecommendControl.get("firstRecommendTime"));
				param.put("forwardRecommendTime", systemTime);
				param.put("recommendCount", String.valueOf(count+1));
				param.put("batchNo", bantchNo);
			}else if(flag == 0){
				param.put("firstRecommendTime", (String)userRecommendControl.get("forwardRecommendTime"));
				param.put("forwardRecommendTime", systemTime);
				param.put("recommendCount", "2");
				param.put("batchNo", bantchNo);
			}else if(flag == 3){
				param.put("firstRecommendTime", systemTime);
				param.put("forwardRecommendTime", systemTime);
				param.put("recommendCount", "1");
				param.put("batchNo", bantchNo);
			}else{
				return param;
			}
		}
		return param;
	}
	
	/**
	 * 获取营销案推荐统计表信息
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: getMarketCaseRecommendTotal 
	* @param inParam
	* @param RuleParam
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> getMarketCaseRecommendTotal(Map<String, Object>inParam, Map<String, Object>RuleParam, Map<String,Object> marketCaseBaseMap) throws StrategyError{
		
		Map<String,Object> tempParam = new HashMap<String, Object>();
		Map<String,Object> outParam = new HashMap<String, Object>();
		String count = "";
		String countByDay = "";
		
		tempParam.put("marketCaseId", (String)marketCaseBaseMap.get("marketCaseId"));
		tempParam.put("channelId", inParam.get("channelId"));
		if(Const.RULE_CODE_FREQUENCYRULE_TOUCHTOTAL.equals(RuleParam.get("ruleParCode"))){//频次规则下总次数
			count = marketCaseSelector.selectMarketCaseRecommendCount(tempParam);
		}
		if(Const.RULE_CODE_FREQUENCYRULE_DAYTOUCHNUM.equals(RuleParam.get("ruleParCode"))){//频次规则下当天总次数
			String nowDay = DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1);
			tempParam.put("currentDay", nowDay);
			countByDay = marketCaseSelector.selectMarketCaseRecommendCount(tempParam);
		}
		
		outParam.put("count", count);
		outParam.put("countByDay", countByDay);

		return outParam;
	}
	
	/**
	 * 获取推荐关闭信息
	* @date: 2016-11-28 
	* @author: yangwl
	* @title: getRecommendClose 
	* @param inParam
	* @param RuleParam
	* @param marketCaseBaseMap
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> getRecommendClose(Map<String, Object> userMap, Map<String, Object> channelInfoMap, Map<String, Object> marketCaseBaseMap) throws StrategyError{
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("idNo", userMap.get("idNo"));
		tempInParam.put("marketCaseId", marketCaseBaseMap.get("marketCaseId"));
		tempInParam.put("channelId", channelInfoMap.get("channelId"));
		return  marketCaseSelector.selectRecommendCloseByRowKey(tempInParam);
	}
	
	/**
	 * 查询用户是否办理过互斥的营销案
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: getUserAcceptMarketCaseInfoByRowKey 
	* @param inParam
	* @param RuleParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> getUserAcceptMarketCaseInfoByRowKey(Map<String, Object> inParam, Map<String, Object> RuleParam){
		log.debug("===Rule.getUserAcceptMarketCaseInfoByRowKey.inParam===", inParam);
		log.debug("===Rule.getUserAcceptMarketCaseInfoByRowKey.RuleParam===", RuleParam);
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		Map<String,Object> userInfoMap = (Map<String, Object>) inParam.get("userInfoMap");
		tempInParam.put("marketCaseId", RuleParam.get("marketCaseId"));
		tempInParam.put("idNo", userInfoMap.get("idNo"));
		
		return userSelector.selectUserAcceptMarketCaseByRowKey(tempInParam);
	}
	
	/**
	 * 获取用户推荐控制信息
	* @date: 2016-11-15 
	* @author: yangwl
	* @title: getUserRecommendControlByBatchNo 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> getUserRecommendControlByBatchNo(Map<String,Object> inParam,String batchNo){
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		Map<String, Object> ret = null;
		tempInParam.put("idNo", inParam.get("idNo"));
		Set<String> fields = new HashSet<String>();
//		fields.add("FIRST_RECOMMEND_TIME");
//		fields.add("FORWARD_RECOMMEND_TIME");
//		fields.add("RECOMMEND_COUNT");
		fields.add("RECOMMEND_TIME");
		tempInParam.put("batchNo", batchNo);
		ret = userSelector.selectUserRecommendControlByRowKey(tempInParam, fields);
		return ret;
	}
	
	/**
	 * 按照批次号进行分组
	* @date: 2016-11-19 
	* @author: yangwl
	* @title: groupByBatchNo 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<List<Map<String, Object>>> groupByBatchNo(List<Map<String, Object>> tempRuleList){
		Set<String> batchNo = new HashSet<String>();
		List<List<Map<String, Object>>> retList = new ArrayList<List<Map<String, Object>>>();
		if(!CommonUtils.objectIsNull(tempRuleList)){
			//获取批次号
			for(Map<String, Object> tempRuleMap : tempRuleList){
				batchNo.add((String)tempRuleMap.get("batchNo"));
			}
			//按照批次号分组
			for(String batch : batchNo){
				List<Map<String, Object>> batchList = new ArrayList<Map<String, Object>>();
				for(Map<String, Object> tempRuleMap : tempRuleList){
					if(batch.equals((String)tempRuleMap.get("batchNo"))){
						batchList.add(tempRuleMap);
					}
				}
				retList.add(batchList);
			}
		}	
		return retList;
	}
	
	/**
	 * 处理调配规则信息
	* @date: 2016-12-19 
	* @author: zhangjj_crmpd
	* @title: handleTaskAdjustRuleParam 
	* @param ruleId
	* @param ruleInfo 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void handleTaskAdjustRuleParam(String ruleId,String taskAdjustId,
			Map<String, Object> ruleInfo) throws StrategyError {
		String ruleType = CommonUtils.toString(ruleInfo.get("RULE_TYPE"));
		List<Map<String, Object>> ruleDetailList = (List<Map<String, Object>>) ruleInfo.get("ruleDetailList");
		if(CommonUtils.objectIsNull(ruleDetailList)){
			return;
		}
		for(Map<String, Object> ruleDetailInfo : ruleDetailList){
			handleTaskAdjustRuleDetailParam(ruleId,taskAdjustId,ruleDetailInfo);
		}
		
	}
	
	/**
	 * 处理调配规则详细信息
	* @date: 2016-12-19 
	* @author: zhangjj_crmpd
	* @title: handleTaskAdjustRuleDetailParam 
	* @param ruleId
	* @param ruleDetailInfo 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void handleTaskAdjustRuleDetailParam(String ruleId,String taskAdjustId,
			Map<String, Object> ruleDetailInfo) throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		String  ruleDetailId =SequenceUtil.getSequence();
		tempInParam.put("ruleId", ruleId);
		tempInParam.put("ruleDetailId", ruleDetailId);
		tempInParam.put("batchNo", SequenceUtil.getSequence());
		List<Map<String, Object>> paramList =  (List<Map<String, Object>>) ruleDetailInfo.get("param");
		if(CommonUtils.objectIsNull(paramList)){
			return;
		}
		for(Map<String, Object> param:paramList){
			tempInParam.put("ruleParName", param.get("ruleParName"));
			tempInParam.put("ruleParValue", param.get("ruleParValue"));
			tempInParam.put("ruleParCode", param.get("ruleParCode"));
			tempInParam.put("ruleDetailType", param.get("ruleDetailType"));
			tempInParam.put("serialId", SequenceUtil.getSequence());
			addRuleDetail(tempInParam, tempInParam);
		}
		tempInParam.put("busiId", taskAdjustId+Const.SEPARATOR_AND+ruleDetailId);
		systemDealInsertor.insertShellProcessExecuteInfo(handleTaskAdjustShellDealParam(tempInParam));
	}
	
	/**
	 * 处理任务调配进程参数
	* @date: 2017-1-10 
	* @author: zhangjj_crmpd
	* @title: handleTaskAdjustShellDealParam 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> handleTaskAdjustShellDealParam(Map<String, Object> tempInParam) throws StrategyError {
		Map<String, Object> shellInParam = new HashMap<String, Object>();
		shellInParam.put("busiId", tempInParam.get("busiId"));
		shellInParam.put("serialId", SequenceUtil.getSequence());
		shellInParam.put("busiType", Const.BUSI_TYPE_TASKADJUST);
		shellInParam.put("processNo", Const.SHELLPROCESS_NO_TASKADJUST);
		shellInParam.put("processName", Const.SHELLPROCESS_NAME_TASKADJUST);
		shellInParam.put("statusCode", Const.MARKET_CASE_STATUS_DEFAULT);
		shellInParam.put("updateTime", new Date());
		return shellInParam;
	}

	/**
	 * 判断是否是批量任务，并将下发信息放入 batchPushInfo
	* @date: 2016-11-8 
	* @author: zhangjj_crmpd
	* @title: isBatchPushMarketCase 
	* @param isBatchPush
	* @param ruleDetail
	* @param batchPushInfo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean isBatchPushMarketCase(Boolean isBatchPush,Map<String, Object> ruleDetail,Map<String, Object> batchPushInfo) {
		if(!CommonUtils.objectIsNull(ruleDetail)){
			log.info("ruleDetailType:", ruleDetail.get("ruleDetailType").toString());
			log.info("is  ruleDetailType:", Const.RULE_TYPE_FREQUENCY.equalsIgnoreCase(ruleDetail.get("ruleDetailType").toString()));
			//判断ruleDetailType是否是frequency
			if(Const.RULE_TYPE_FREQUENCY.equalsIgnoreCase(ruleDetail.get("ruleDetailType").toString())){
				isBatchPush=true;
				String ruleParCode = ruleDetail.get("ruleParCode").toString();
				if(!CommonUtils.objectIsNull(ruleParCode)){
					batchPushInfo.put(ruleParCode,ruleDetail.get("ruleParValue"));
				}
				return true;
			}
		}
		return false;
	}
	
	
	/**
	 * 判断营销案的频次规则
	* @date: 2016-11-15 
	* @author: yangwl
	* @title: isFrequencyRule 
	* @param inParam
	* @param ruleDetailMap
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> isFrequencyRule(Map<String, Object> inParam,Map<String, Object> ruleDetailMap, Map<String,Object> marketCaseBaseMap) throws StrategyError{
		boolean frequencyTypeFlag = true;
		boolean touchTotalFlag = true;
		boolean dayTotalFlag = true;
		boolean daySpaceFlag = true;
		Map<String,Object> checkParam = new HashMap<String, Object>();
		List<Map<String, Object>> RuleParamList = (List<Map<String, Object>>)ruleDetailMap.get("params");
		//按照批次号分组
		List<List<Map<String, Object>>> ruleBatchNoList = this.groupByBatchNo(RuleParamList);
		//按照批次号校验
		if(!CommonUtils.objectIsNull(ruleBatchNoList)){
			for(List<Map<String, Object>> ruleBatchNo : ruleBatchNoList){
				Map<String, Object> ruleMap = new HashMap<String, Object>();
				for(Map<String, Object> RuleParam:ruleBatchNo){
					ruleMap.put((String) RuleParam.get("ruleParCode"), RuleParam.get("ruleParValue"));
				}
				//频控规则（接触周期）
				if (!CommonUtils.objectIsNull(ruleMap.get(Const.RULE_CODE_FREQUENCYRULE_FREQUENCYTYPE))) {
					if(Const.RULE_VALUE_DAY.equals(ruleMap.get(Const.RULE_CODE_FREQUENCYRULE_FREQUENCYTYPE))){
						frequencyTypeFlag = true;
					}else if(Const.RULE_VALUE_WEEK.equals(ruleMap.get(Const.RULE_CODE_FREQUENCYRULE_FREQUENCYTYPE))){
						frequencyTypeFlag = this.checkFrequencyRuleInTouchDate(inParam, ruleMap, Const.RULE_VALUE_WEEK);
					}else if(Const.RULE_VALUE_MONTH.equals(ruleMap.get(Const.RULE_CODE_FREQUENCYRULE_FREQUENCYTYPE))){
						frequencyTypeFlag = this.checkFrequencyRuleInTouchDate(inParam, ruleMap, Const.RULE_VALUE_MONTH);
					}else{
						frequencyTypeFlag = true;
					}
				}
				log.debug("===Rule.isFrequencyRule.frequencyTypeFlag===", frequencyTypeFlag);
				if (!frequencyTypeFlag) {
					checkParam.put("checkFlag", false);
					return checkParam;
				}
				/*if(!CommonUtils.objectIsNull(ruleMap.get(Const.RULE_CODE_FREQUENCYRULE_DAYTOUCHNUM))){
					//频控规则（每日接触的次数）
					dayTotalFlag = this.checkFrequencyRuleInDayTouchNum(inParam, ruleMap, marketCaseBaseMap);
				}
				if (!dayTotalFlag) {
					checkParam.put("checkFlag", false);
					return checkParam;
				}
				if(!CommonUtils.objectIsNull(ruleMap.get(Const.RULE_CODE_FREQUENCYRULE_DAYSPACE))){
					//频控规则（间隔天数）
					daySpaceFlag = this.checkFrequencyRuleInIntervalDay(inParam, ruleMap, marketCaseBaseMap);
				}
				if (!daySpaceFlag) {
					checkParam.put("checkFlag", false);
					return checkParam;
				}
				if(!CommonUtils.objectIsNull(ruleMap.get(Const.RULE_CODE_FREQUENCYRULE_TOUCHTOTAL))){
					//频控规则（总次数）
					Map<String,Object> touchCheckParam = this.checkFrequencyRuleInTouchTotal(inParam, ruleMap, marketCaseBaseMap);
					touchTotalFlag = (Boolean) touchCheckParam.get("checkFlag");
					checkParam.put("marketCaseTouchControl", touchCheckParam.get("marketCaseTouchControl"));
				}*/
			}	
		}	
		checkParam.put("checkFlag", frequencyTypeFlag&&touchTotalFlag&&daySpaceFlag&&dayTotalFlag);
		return checkParam;
	}
	
	/**
	 * 判断营销案互斥规则
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: isMutexRuel 
	* @param inParam
	* @param ruleDetailMap
	* @param marketCaseBaseMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 3.31更改互斥规则校验，从互斥规则缓存中取
	 */
	protected boolean isMutexRule(Map<String, Object> inParam,Map<String, Object> ruleDetailMap) throws StrategyError{
		log.debug("===Rule.isMutexRule.ruleDetailMap===", ruleDetailMap);
		
		if(!CommonUtils.objectIsNull(ruleDetailMap)){
			Map<String,Object> RuleParam = new HashMap<String,Object>();
			String mutexMarketCaseId = (String) ruleDetailMap.get("ruleParValue");
			if(!CommonUtils.objectIsNull(mutexMarketCaseId)){
				RuleParam.put("marketCaseId", mutexMarketCaseId);
				//判断用户是否办理过互斥的营销案
				Map<String, Object> mutexMap =  this.getUserAcceptMarketCaseInfoByRowKey(inParam, RuleParam);
				log.debug("===Rule.isMutexRule.mutexMap===", mutexMap);
				if(!CommonUtils.objectIsNull(mutexMap)){
					return false;
				}
			}
			return true;
		}
		
		return true;
	}
	
	/**
	 * 判断全局规则的免打扰时间段
	* @date: 2016-11-14 
	* @author: yangwl
	* @title: isNoDisturbDateGlobalRule 
	* @param inParam
	* @param globalRuleMap
	* @param marketCaseBaseMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean isNoDisturbDateGlobalRule(Map<String,Object> inParam,Map<String,Object> globalRuleMap, Map<String,Object> marketCaseBaseMap){
		boolean noDisturbDateRuleFlag = true;
		List<Map<String, Object>> noDisturbDateRuleList =  (List<Map<String, Object>>)globalRuleMap.get(Const.RULE_TYPE_GLOBALRULE_NODISTURB);
		//按照批次号分组
		List<List<Map<String, Object>>> noDisturbDateBatchNoList = this.groupByBatchNo(noDisturbDateRuleList);
		log.debug("====isNoDisturbDateGlobalRule==noDisturbDateRuleList==", noDisturbDateRuleList);
		//按照批次校验
		if(!CommonUtils.objectIsNull(noDisturbDateBatchNoList)){
			for(List<Map<String, Object>> noDisturbDateBatchNo : noDisturbDateBatchNoList){
				Map<String, Object>  noDisturbDateRuleMap = new HashMap<String, Object>();
				for(Map<String, Object>  noDisturbDateRule : noDisturbDateBatchNo){
					noDisturbDateRuleMap.put((String)noDisturbDateRule.get("ruleParCode"), noDisturbDateRule.get("ruleParValue"));
					noDisturbDateRuleMap.put("batchNo", noDisturbDateRule.get("batchNo"));
				}
				log.debug("====isNoDisturbDateGlobalRule==noDisturbDateRuleMap==", noDisturbDateRuleMap);
				//判断渠道类型
				if(inParam.get("channelId").equals(noDisturbDateRuleMap.get("channelName"))){
					//判断营销案类型
//					if(marketCaseBaseMap.get("marketCaseType").equals(noDisturbDateRuleMap.get("marketCaseType"))){
					//判断时间段
					String startTime = (String)noDisturbDateRuleMap.get("startTime");
					String endTime = (String)noDisturbDateRuleMap.get("endTime");
					if(DateUtil.isCurrentInTimePeriod(startTime, endTime, DateUtil.DATE_FROMAT_YYYYMMDD2)){
						noDisturbDateRuleFlag = false;
						break;
					}
//					}
				}
			}	
		}
		return noDisturbDateRuleFlag;
	}
	
	/**
	 * 判断关闭规则
	* @date: 2017-4-1 
	* @author: sunyuan
	* @title: isCloseRule 
	* @param inParam
	* @param ruleDetailMap
	* @param marketCaseBaseMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean isCloseRule(Map<String, Object> inParam,Map<String,Object> userMap,Map<String,Object> ruleDetailMap,Map<String,Object> marketCaseBaseMap,Map<String,Object> channelInfoMap) throws StrategyError{
		log.debug("===Rule.isCloseRule.all===", "inParam:"+inParam+"ruleDetailMap:"+ruleDetailMap+"marketCaseBaseMap:"+marketCaseBaseMap+"positionInfoMap:"+channelInfoMap);
		List<Map<String, Object>> RuleParamList = (List<Map<String, Object>>)ruleDetailMap.get("params");
		//按照批次号分组
		List<List<Map<String, Object>>> ruleBatchNoList = this.groupByBatchNo(RuleParamList);
		//按照批次号校验
		if(!CommonUtils.objectIsNull(ruleBatchNoList)){
			for(List<Map<String, Object>> ruleBatchNo : ruleBatchNoList){
				for(Map<String, Object> RuleParam:ruleBatchNo){
					//查询用户推送过营销案
					if(Const.RULE_CODE_CLOSEPRODUCTID.equals((String)RuleParam.get("ruleParCode"))){
						return this.checkCloseRule(userMap, ruleBatchNoList, marketCaseBaseMap,channelInfoMap);
					}
				}
			}	
		}
		return true;
	}
	
	/**
	 * 判断协同规则
	* @date: 2016-11-28 
	* @author: yangwl
	* @title: isSynergyRule 
	* @param inParam
	* @param globalRuleMap
	* @param marketCaseBaseMap
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean isSynergyRule(Map<String, Object> userMap,Map<String,Object> ruleDetailMap, Map<String, Object> marketCaseBaseMap, Map<String,Object> channelInfoMap) throws StrategyError{
		List<Map<String, Object>> RuleParamList = (List<Map<String, Object>>)ruleDetailMap.get("params");
		/*//按照批次号分组
		List<List<Map<String, Object>>> ruleBatchNoList = this.groupByBatchNo(RuleParamList);
		//按照批次号校验
		if(!CommonUtils.objectIsNull(ruleBatchNoList)){
			for(List<Map<String, Object>> ruleBatchNo : ruleBatchNoList){
				for(Map<String, Object> RuleParam:ruleBatchNo){
					//查询用户是否办理过渠道协同营销案
					if(Const.RULE_CODE_SYNERGY_ISCHANNELSYNERGY.equals((String)RuleParam.get("ruleParCode")) && Const.TRUE_INT.equals((String)RuleParam.get("ruleParValue"))){
						return this.checkSynergyRule(userMap, ruleBatchNoList, marketCaseBaseMap, channelInfoMap);
					}
				}
			}	
		}*/
		for(Map<String, Object> RuleParam : RuleParamList){
			if(Const.RULE_CODE_SYNERGY_ISCHANNELSYNERGY.equals((String)RuleParam.get("ruleParCode")) && Const.TRUE_INT.equals((String)RuleParam.get("ruleParValue"))){
				return this.checkSynergyRule(userMap, marketCaseBaseMap, channelInfoMap);
			}
		}
		return true;
	}
	
	/**
	 * 判断入参中的日期或星期数组中是否有今天
	* @date: 2016-11-9 
	* @author: zhangjj_crmpd
	* @title: isWaitBatch 
	* @param today
	* @param sendDates
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean isTodayFromWeekOrMonthArr(String today,String[] sendDates){
		for (int i = 0; i < sendDates.length; i++) {
			if(today.equals(sendDates[i]) || "all".equals(sendDates[i])){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * 判断全局规则的接触次数
	* @date: 2016-11-14 
	* @author: yangwl
	* @title: isTouchCountGlobalRule 
	* @param inParam
	* @param globalRuleMap
	* @param marketCaseBaseMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> isTouchCountGlobalRule(Map<String,Object> inParam,Map<String,Object> userMap,Map<String,Object> globalRuleMap, Map<String,Object> marketCaseBaseMap){
		Map<String,Object> retMap = new HashMap<String, Object>();
		//查询用户推荐记录信息
		boolean touchCountRuleFlag = true;
		Map<String, Object> globalTouchControlAndRule= (Map<String, Object>) inParam.get("globalTouchControlAndRule");
		log.debug("===isTouchCountGlobalRule====globalTouchControlAndRule======", globalTouchControlAndRule);
		Map<String, Object> globalTouchControl = (Map<String, Object>) globalTouchControlAndRule.get("globalTouchControl");
		Map<String, Object> globalTouchRule = (Map<String, Object>) globalTouchControlAndRule.get("globalTouchRule");
		List<Map<String, String>> newGlobalTouchControl = new ArrayList<Map<String,String>>();
		for (Map.Entry<String, Object> entry : globalTouchRule.entrySet()) {
			String batchNo = entry.getKey();
			Map<String,Object> checkParam = this.checkTouchCountGlobalRule((Map<String, Object>)globalTouchControl.get(batchNo), (Map<String, Object>) entry.getValue());
			log.debug("===isTouchCountGlobalRule====checkParam======", checkParam);
			if(!(Boolean)checkParam.get("checkFlag")){
				touchCountRuleFlag = false;
				retMap.put("checkFlag", touchCountRuleFlag);
				return retMap;
			}
			if (!CommonUtils.objectIsNull(checkParam.get("touchControl"))) {
				Map<String, String> touchControl = (Map<String, String>) checkParam.get("touchControl");
				touchControl.put("batchNo", batchNo);
				newGlobalTouchControl.add(touchControl);
			}
		}
		log.debug("===isTouchCountGlobalRule====globalTouchControl======", globalTouchControl);
		retMap.put("globalTouchControl", newGlobalTouchControl);
		retMap.put("checkFlag", touchCountRuleFlag);
		return retMap;
	}
	
	/**
	 * 判断全局规则的接触时间
	* @date: 2016-11-14 
	* @author: yangwl
	* @title: isTouchTimeGlobalRule 
	* @param inParam
	* @param globalRuleMap
	* @param marketCaseBaseMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean isTouchTimeGlobalRule(Map<String,Object> inParam,Map<String,Object> globalRuleMap, Map<String,Object> marketCaseBaseMap){
		boolean touchTimeFlag = true;
		List<Map<String, Object>> touchTimeRuleList =  (List<Map<String, Object>>)globalRuleMap.get(Const.RULE_TYPE_GLOBALRULE_TOUCHTIME);
		//按照批次号分组
		List<List<Map<String, Object>>> touchTimeBatchNoList = this.groupByBatchNo(touchTimeRuleList);
		log.debug("====isTouchTimeGlobalRule==touchTimeBatchNoList==", touchTimeBatchNoList);
		//按照批次校验
		if(!CommonUtils.objectIsNull(touchTimeBatchNoList)){
			for(List<Map<String, Object>> touchTimeBatchNo : touchTimeBatchNoList){
				Map<String, Object>  touchTimeRuleMap = new HashMap<String, Object>();
				for(Map<String, Object>  touchTimeRule : touchTimeBatchNo){
					touchTimeRuleMap.put((String)touchTimeRule.get("ruleParCode"), touchTimeRule.get("ruleParValue"));
					touchTimeRuleMap.put("batchNo", touchTimeRule.get("batchNo"));
				}
				log.debug("====isTouchTimeGlobalRule==touchTimeRuleMap==", touchTimeRuleMap);
				//判断渠道类型
				if(inParam.get("channelId").equals(touchTimeRuleMap.get("channelName"))){
					//判断时间段
					if(DateUtil.isCurrentInTimePeriod((String)touchTimeRuleMap.get("startTime"), (String)touchTimeRuleMap.get("endTime"), DateUtil.TIME_FROMAT_HHMMSS)){
						touchTimeFlag = false;
						break;
					}
				}
			}	
		}
		return touchTimeFlag;
	}
	
	/**
	 * 判断免打扰规则
	* @date: 2016-11-16 
	* @author: yangwl
	* @title: isUnTroubleRule 
	* @param inParam
	* @param marketCaseBaseMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean isUnTroubleRule(Map<String, Object> inParam,Map<String, Object> userMap,Map<String,Object> ruleDetailMap , Map<String, Object> marketCaseBaseMap,Map<String, Object> positionInfoMap)throws StrategyError{
		log.info("===========isUnTroubleRule.positionInfoMap==========", positionInfoMap);

		boolean unTroubleCustFlag = true;
		boolean unTroubleTimeFlag = true;
		List<Map<String, Object>> RuleParamList = (List<Map<String, Object>>)ruleDetailMap.get("params");
		//按照批次号分组
		List<List<Map<String, Object>>> ruleBatchNoList = this.groupByBatchNo(RuleParamList);
		//按照批次号校验
		if(!CommonUtils.objectIsNull(ruleBatchNoList)){
			br:
			for(List<Map<String, Object>> ruleBatchNo : ruleBatchNoList){
				for(Map<String, Object> RuleParam:ruleBatchNo){
					
					log.info("===========isUnTroubleRule.RuleParam==========", RuleParam);
					//免打扰客户
					if(Const.RULE_CODE_UNTROUBLE_UNTROUBLECUSTTYPE.equals((String)RuleParam.get("ruleParCode"))){
						unTroubleCustFlag = this.checkUnTroubleUser(inParam,userMap, marketCaseBaseMap,(String)RuleParam.get("ruleParValue"));
						if(!unTroubleCustFlag){
							return false;
						}
					}
					
					//时间段
					if("POSITION_11_03".equals(positionInfoMap.get("positionId"))){
						if(unTroubleCustFlag){
							if(Const.RULE_CODE_UNTROUBLE_UNTROUBLETIME.equals((String)RuleParam.get("ruleParCode"))){
								unTroubleTimeFlag = this.checkUnTroubleTime(inParam, RuleParam);
								if(!unTroubleTimeFlag){
									break br;
								}
							}
						}
					}
				}
			}	
		}	
		return unTroubleCustFlag&&unTroubleTimeFlag;
	}
	
	/**
	 * 判断是否是今日下发营销案
	* @date: 2016-11-8 
	* @author: zhangjj_crmpd
	* @title: isWaitTodayMarketCase 
	* @param batchPushInfo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* chenhao 修改判断逻辑
	 */
	protected boolean isWaitTodayMarketCase(Map<String, Object> batchPushInfo) {
		log.info("batchPushInfo:", batchPushInfo);
		String ruleParCode = null;
		//此处frequencyType必须放在第一个。详细参看数据库存储数据
		if(!CommonUtils.objectIsNull(batchPushInfo.get("frequencyType"))){
			ruleParCode = new String("frequencyType");
		}
		if(!CommonUtils.objectIsNull(batchPushInfo.get("weekDay"))){
			ruleParCode = new String("weekDay");
		}
		if(!CommonUtils.objectIsNull(batchPushInfo.get("monthDay"))){
			ruleParCode = new String("monthDay");
		}
		if(!CommonUtils.objectIsNull(batchPushInfo.get("dateTime"))){
			ruleParCode = new String("dateTime");
		}
		String ruleParValue = batchPushInfo.get(ruleParCode)==null?"":batchPushInfo.get(ruleParCode).toString();
		String[] ruleParValues = ruleParValue.split(Const.SEPARATOR_TIPNO); 
		log.info("ruleParCode:", ruleParCode);
		log.info("ruleParValue:", ruleParValue);
		if(Const.RULE_PAR_CODE_MONTH.equals(ruleParCode)){//周期每月
			String today = DateUtil.getDayOfMonth().toString();
			log.info("today:", today);
			return isTodayFromWeekOrMonthArr(today,ruleParValues);
		}else if(Const.RULE_PAR_CODE_WEEK.equals(ruleParCode)){//周期每周
			String today = DateUtil.getDayOfWeek().toString();
			log.info("today:", today);
			return isTodayFromWeekOrMonthArr(today,ruleParValues);
		}else if(Const.RULE_PAR_CODE_SOMEDAY.equals(ruleParCode)){//周期某天
			String today = DateUtil.DateToString(new Date(),DateUtil.DATE_FROMAT_YYYYMMDD2);
			log.info("today", today);
			return today.equals(ruleParValue);
		}else if(Const.RULE_PAR_CODE_FRE.equals(ruleParCode)&&ruleParValue.equals("1")){//周期每日
				return true;
		}else if(Const.RULE_PAR_CODE_FRE.equals(ruleParCode)&&ruleParValue.equals("4")){//周期月末
				String today = DateUtil.getDayOfMonth().toString();
				String lastDayOfMonth =	DateUtil.DateToString(DateUtil.getLastDayOfMonth(0), "dd");
				log.info("todayAndlastDayOfMonth", today+" and "+lastDayOfMonth);
				return today.equals(lastDayOfMonth);
		}else{
			return false;
		}
	}
	
	/** 查询客户群渠道关系
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: queryRelation 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String,Object> queryRelation(Map<String,Object> inParam) throws StrategyError {
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentRelId((String) inParam.get("parentRelId"));
		queryFilter.setParentComponentId((String) inParam.get("parentComponentId"));
		queryFilter.setParentComponentType((String) inParam.get("parentComponentType"));
		queryFilter.setComponentId((String) inParam.get("componentId"));
		queryFilter.setComponentType((String) inParam.get("componentType"));
		return ruleSelector.selectRelation(inParam, queryFilter);
	}
	/**
	 * 移除规则信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: removeRuleInfo  
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void removeRuleInfo(Map<String,Object> inParam) throws StrategyError {
		ruleDeleter.deleteRuleInfo(inParam);
	}
	
	/**
	 * 移除规则详细信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: removeRuleDetail  
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void removeRuleDetail(Map<String,Object> inParam) throws StrategyError {
		ruleDeleter.deleteRuleDetailInfo(inParam);
	}
	
	/**
	 * 更新规则详细信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: updateRuelDetail  
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void updateRuelDetail(Map<String,Object> inParam) throws StrategyError {
		ruleUpdater.updateRuleDetailInfo(inParam);
	}
	
	/**
	 * 更新规则基本信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: updateRuelInfo  
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void updateRuelInfo(Map<String,Object> inParam) throws StrategyError {
		ruleUpdater.updateRuleInfo(inParam);
	}

}