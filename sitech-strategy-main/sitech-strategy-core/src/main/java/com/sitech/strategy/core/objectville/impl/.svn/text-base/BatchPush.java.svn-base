package com.sitech.strategy.core.objectville.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.regioncode.IRegionCodePojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.common.utils.SvcConst;
import com.sitech.strategy.core.objectville.inter.IBatchPush;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;
import com.sitech.strategy.persist.capacity.proxy.IMsgSender;
import com.sitech.strategy.persist.utils.ServiceUtil;

/**
 * 批量push业务对象
* @date: 2016-12-28 
* @author: sunliang 
* @title: BatchPush 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class BatchPush extends BaseClass implements IBatchPush {
	/**
	 * CMPP短信下发
	 */
	protected IMsgSender.IBatchPushSender batchPushSender;
	/**
	 * hbase批量push任务查询
	 */
	protected IDataSelector.IBatchPushTaskSelector batchPushTaskSelector;
	/**
	 * 公共数据查询操作接口
	 */
	protected IDataSelector.ICommonSelector commonSelector;
	/**
	 * 反馈插入接口
	 */
	protected IDataInsertor.ICoupleBackInsertor coupleBackInsertor;
	/**
	 * 营销案数据删除操作接口
	 */
	protected IDataDeleter.IMarketCaseDeleter marketCaseDeleter;
	/**
	 * 营销案信息查询
	 */
	protected IDataSelector.IMarketCaseSelector marketCaseSelector;
	/**
	 * 规则对象
	 */
	protected IRule rule;
	/**
	 * 系统处理数据插入对象
	 */
	protected IDataInsertor.ISystemDealInsertor systemDealInsertor;
	/**
	 * 系统处理数据更新对象
	 */
	protected IDataUpdater.ISystemDealUpdater systemDealUpdater;
	/**
	 * hbase push任务索引插入
	 */
	protected IDataDeleter.ITaskDeleter taskDeleter;
	/**
	 * 任务数据插入对象
	 */
	protected IDataInsertor.ITaskInsertor taskInsertor;
	/**
	 * 用户数据插入对象
	 */
	protected IDataInsertor.IUserInsertor userInsertor;
	/**
	 * 地市对象
	 */
	protected IRegionCodePojo regionCodePojo;
	
	/**
	 * 
	* @date: 2017-2-7 
	* @author: sunliang 
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
	* @date: 2016-9-29 
	* @author: yangwl
	* @title: setBatchPushTaskSelector 
	* @param batchPushTaskSelect 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBatchPushTaskSelector(
			IDataSelector.IBatchPushTaskSelector batchPushTaskSelector) {
		this.batchPushTaskSelector = batchPushTaskSelector;
	}
	
	/**
	 * 
	* @date: 2016-10-23 
	* @author: yangwl
	* @title: setCommonSelector 
	* @param commonSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCommonSelector(IDataSelector.ICommonSelector commonSelector) {
		this.commonSelector = commonSelector;
	}
	
	/** 
	* @date: 2017-3-1 
	* @author: wangpei
	* @title: setCoupleBackInsertor 
	* @param coupleBackInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setCoupleBackInsertor(
			IDataInsertor.ICoupleBackInsertor coupleBackInsertor) {
		this.coupleBackInsertor = coupleBackInsertor;
	}

	/**
	 * 
	* @date: 2016-10-9 
	* @author: yangwl
	* @title: setMarketCaseDeleter 
	* @param marketCaseDeleter 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseDeleter(
			IDataDeleter.IMarketCaseDeleter marketCaseDeleter) {
		this.marketCaseDeleter = marketCaseDeleter;
	}
	
	/**
	 * 
	* @date: 2016-9-28 
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
	* @date: 2017-2-8 
	* @author: sunliang 
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
	* @date: 2017-1-9 
	* @author: sunliang 
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
	* @date: 2016-10-14 
	* @author: yangwl
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
	* @date: 2016-12-24 
	* @author: sunliang 
	* @title: setTaskDeleter 
	* @param taskDeleter 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTaskDeleter(IDataDeleter.ITaskDeleter taskDeleter) {
		this.taskDeleter = taskDeleter;
	}

	/** 
	* @date: 2016-10-28 
	* @author: songxj
	* @title: setTaskInsertor 
	* @param taskInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setTaskInsertor(IDataInsertor.ITaskInsertor taskInsertor) {
		this.taskInsertor = taskInsertor;
	}
	
	/** 
	* @date: 2017-3-1 
	* @author: wangpei
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
	* @date: 2017-2-20 
	* @author: zhangjj_crmpd
	* @title: setRegionCodePojo 
	* @param regionCodePojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRegionCodePojo(IRegionCodePojo regionCodePojo) {
		this.regionCodePojo = regionCodePojo;
	}

	/**
	 * 增加当日已处理记录
	* @date: 2017-1-9 
	* @author: sunliang 
	* @title: addCurrentDayProcessedRecord 
	* @param batchPushMarketCaseAndCustGroupList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addCurrentDayProcessedRecord(
			List<Map<String, Object>> batchPushMarketCaseAndCustGroupList,String param)
			throws StrategyError {
		for(Map<String, Object> batchPushMarketCaseAndCustGroup : batchPushMarketCaseAndCustGroupList){
			Map<String,Object> tempParam = new HashMap<String,Object>();
			tempParam.put("serialId", SequenceUtil.getSequence());
			tempParam.put("busiId", batchPushMarketCaseAndCustGroup.get("marketCaseId")) ;
			tempParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE) ;
			if(Const.BATCHPUSHPROD.equals(param)){
				tempParam.put("processName", Const.SHELLPROCESS_NAME_WAITCREATEBATCHPUSHPROD);
				tempParam.put("processNo", Const.SHELLPROCESS_NO_WAITCREATEBATCHPUSHPROD);
			}else if(Const.BATCHPUSHMSG.equals(param)){
				tempParam.put("processName", Const.SHELLPROCESS_NAME_WAITCREATEBATCHPUSHMSG);
				tempParam.put("processNo", Const.SHELLPROCESS_NO_WAITCREATEBATCHPUSHMSG);
			}
			tempParam.put("statusCode", Const.MARKET_CASE_STATUS_EXE) ;
			String dataBaseTime = commonSelector.selectDataBaseSysTime();
			tempParam.put("updateTime", DateUtil.string2Timestamp(dataBaseTime, DateUtil.TIME_FROMAT_SIMPLE3));
			systemDealInsertor.insertShellProcessExecuteInfo(tempParam);
		}
		
	}
	
	/**
	 * 过滤等待下发任务
	* @date: 2017-2-16 
	* @author: zhangjj_crmpd
	* @title: filterWaitSendBatchPushTask 
	* @param tempParam
	* @param waitSendBatchPushTask
	* @return 
	* @exception: 
	* @version: 1.0 
	* @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, String>> filterWaitSendBatchPushTask(Map<String,Object> tempParam,Map<String,Object> globalRule,Map<String, Map<String, Map<String, String>>> waitSendBatchPushTask) throws StrategyError {
		Map<String,Object> tempInParam = getWaitSendRegionCodeAndCount(tempParam);
		List<Map<String, String>> taskList = new ArrayList<Map<String,String>>();
		MarketCaseCachePojo marketCaseCachePojo = marketCaseSelector.getMarketCaseDetailFromCache(tempInParam);
		//计数
		int i = 0;
		for (Map.Entry<String, Map<String, Map<String, String>>> entry : waitSendBatchPushTask.entrySet()) {
			if (!CommonUtils.objectIsNull(tempInParam.get("count")) && i >= Integer.valueOf((String)tempInParam.get("count"))) {
				break;
			}
			Map<String,String> taskIdMap = this.getWaitSendPushTaskId(entry.getKey());
			Map<String, String> taskMap = batchPushTaskSelector.selectBatchPushTaskById(taskIdMap.get("taskId"));
			//地市判断
			if (!isWaitSendRegionCode(tempInParam, taskMap)) {
				continue;
			}
			
			//全局规则判断
			Map<String,Object> userMap = new HashMap<String, Object>();
			userMap.put("idNo", taskMap.get("idNo"));
			Map<String,Object> globalTouchControlAndRule = rule.getGlobalRecommendControlAndRule(tempInParam,userMap, globalRule);
			tempInParam.put("globalTouchControlAndRule", globalTouchControlAndRule);
			Map<String,Object> checkMap  = rule.isPassGlobalRule(tempInParam, userMap, marketCaseCachePojo.getMarketCaseMap(), globalRule);
			boolean checkFlag = (Boolean) checkMap.get("checkFlag");
			//暂不考虑 全局规则
			//boolean checkFlag = true;
			List<Map<String, String>> globalTouchControlList = (List<Map<String, String>>) checkMap.get("globalTouchControl");
			if (checkFlag) {
				taskList.add(taskMap);
				addUserTouchControl(userMap, globalTouchControlList);
				i++;
			}
		}
		return taskList;
		
	}
	
	/**
	 * 获取待发送批量事件任务
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: getWaitSendBatchEventTask 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Map<String, Map<String, String>>> getWaitSendBatchEventTask(
			Map<String, Object> tempInParam) throws StrategyError {
		return batchPushTaskSelector.selectWaitSendBatchEventTask(tempInParam);
	}
	
	/**
	 * 获取待发送批量push任务
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: getWaitSendBatchPushTask 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Map<String, Map<String, String>>> getWaitSendBatchPushTask(
			Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError {
		return batchPushTaskSelector.selectWaitSendBatchPushTask(inParam,tempInParam);
	}
	
	/**
	 * 得到待发送批量push营销案Id
	* @date: 2016-12-24 
	* @author: sunliang 
	* @title: getWaitSendBatchPushMarketCase 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> getWaitSendBatchPushMarketCaseId(Map<String,Object> tempInParam){
		Map<String, Object> tempParam = new HashMap<String, Object>();
		try {
			String waitSendBatchPushMarketCaseId = marketCaseSelector.getWaitSendBatchPushMarketCaseFromCache(tempInParam);
			if(!CommonUtils.objectIsNull(waitSendBatchPushMarketCaseId)){
				tempParam.put("marketCaseId", waitSendBatchPushMarketCaseId);
			}
			marketCaseDeleter.removeWaitSendBatchPushMarketCaseFromCache(tempParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
		return tempParam;
	}
	
	/**
	 * 得到待发送批量push营销案Id和发送日期
	* @date: 2016-2-28 
	* @author: zhangqia 
	* @title: getWaitSendBatchPushMarketCaseIdAndSendDate 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> getWaitSendBatchPushMarketCaseIdAndSendDate(Map<String,Object> tempInParam){
		Map<String, Object> tempParam = new HashMap<String, Object>();
		try {
			String waitSendBatchPushMarketCaseId = marketCaseSelector.getWaitSendBatchPushMarketCaseFromCache(tempInParam);
			String marketCaseIdAndSendDate []=waitSendBatchPushMarketCaseId.split(Const.SEPARATOR_COLON);
			if(!CommonUtils.objectIsNull(waitSendBatchPushMarketCaseId)){
				tempParam.put("marketCaseId", waitSendBatchPushMarketCaseId);
				tempParam.put("processId", (String)tempInParam.get("processId"));
			}
			marketCaseDeleter.removeWaitSendBatchPushMarketCaseFromCache(tempParam);
			if(marketCaseIdAndSendDate.length>1){
				tempParam.put("marketCaseId", marketCaseIdAndSendDate[0]);
				tempParam.put("sendDate", marketCaseIdAndSendDate[1]);
			}
		} catch (StrategyError e) {
			e.printStackTrace();
		}
		return tempParam;
	}
	/**
	 * 解析待生成批量push营销案缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: parseWaitCreateBatchPushMarketCase 
	* @param batchPushMarketCaseAndCustGroupList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> parseWaitCreateBatchPushMarketCase(
			List<Map<String, Object>> batchPushMarketCaseAndCustGroupList)
			throws StrategyError {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		//待生成批量push短信营销案缓存
		List<Map<String, Object>> waitCreateBatchPushMsgMarketCase = new ArrayList<Map<String, Object>>();
		//待生成批量push套餐营销案缓存
		List<Map<String, Object>> waitCreateBatchPushProdMarketCase = new ArrayList<Map<String, Object>>();
		
		for(Map<String,Object> marketCaseAndCustGroup : batchPushMarketCaseAndCustGroupList){
			Map<String,Object> custGroupMap = new HashMap<String, Object>();
			String custGroupType = CommonUtils.toString(marketCaseAndCustGroup.get("custGroupType")) ;
			log.info("---------------------custGroupType---------------------", custGroupType);
			if(Const.CUSTGROUP_TYPE_LOAD.equals(custGroupType)) {
				String labelFormula =  CommonUtils.toString(marketCaseAndCustGroup.get("label_formula_restrict"));
				if(!CommonUtils.objectIsNull(labelFormula)){
					String sql = "select a.id_no,a.phone_no,a.region_code from rm_custgroup_"+(String)marketCaseAndCustGroup.get("custGroupId")+"_detail_info_hive a,(select id_no from clzxdb.rm_userlabel_info_hive where "+labelFormula+") b where a.id_no = b.id_no";
					custGroupMap.put(custGroupType, sql);
				}else{
					custGroupMap.put(custGroupType, "select id_no,phone_no,region_code from RM_CUSTGROUP_"+(String)marketCaseAndCustGroup.get("custGroupId")+"_DETAIL_INFO_HIVE");
				}
			}else if(Const.CUSTGROUP_TYPE_DB.equals(custGroupType)) {
				custGroupMap.put(custGroupType, "RM_CUSTGROUP_"+(String)marketCaseAndCustGroup.get("custGroupId")+"_DETAIL_INFO_HIVE");
			}else if(Const.CUSTGROUP_TYPE_LABEL.equals(custGroupType)) {
				custGroupMap.put(custGroupType, "select id_no,L001017008,L001002004 from rm_userlabel_info_hive where "+marketCaseAndCustGroup.get("labelFormula").toString());
			}else if(Const.CUSTGROUP_TYPE_LABEL_STATIC.equals(custGroupType)){
				custGroupMap.put(custGroupType, "select id_no,phone_no,region_code from RM_CUSTGROUP_"+(String)marketCaseAndCustGroup.get("custGroupId")+"_DETAIL_INFO_HIVE");
			}else{
				custGroupMap.put((String)marketCaseAndCustGroup.get("custGroupType"), (String)marketCaseAndCustGroup.get("relatedDataSourceName"));
			}
			log.info("--------------------------custGroupMap----------------------", custGroupMap);
			
			Map<String,Object> marketCaseAndCustGroupMap = new HashMap<String,Object>();
			String marketCaseId = (String)marketCaseAndCustGroup.get("marketCaseId");
			String custGroupId =(String)marketCaseAndCustGroup.get("custGroupId");
			
			Map<String,Object> m = new HashMap<String,Object>();
			m.put("marketCaseId", marketCaseId);
			MarketCaseCachePojo marketCaseCachePojo= marketCaseSelector.getMarketCaseDetailFromCache(m);
			List<String> positionList = (List) marketCaseCachePojo.getPositionMap().get("04");
			log.info("getThePostion", positionList);
			for(String position:positionList){
				marketCaseAndCustGroupMap.put(marketCaseId+ Const.SEPARATOR_COLON +custGroupId, custGroupMap);
				if(position.equals(Const.POSITION_02_01)){
					waitCreateBatchPushMsgMarketCase.add(marketCaseAndCustGroupMap);
					}else if(position.equals(Const.POSITION_01_02)){
					waitCreateBatchPushProdMarketCase.add(marketCaseAndCustGroupMap);
					}
			}
		}
		
		
		resultMap.put("waitCreateBatchPushMsgMarketCase", waitCreateBatchPushMsgMarketCase);//批量短信
		resultMap.put("waitCreateBatchPushProdMarketCase",waitCreateBatchPushProdMarketCase);//批量套餐
		log.info("------------------------resultMap------------------", resultMap);
		return resultMap;
	}

	/**
	 * 解析待发送批量push营销案缓存
	* @date: 2016-12-28 
	* @author: sunliang 
	* @title: parseWaitSendBatchPushMarketCase 
	* @param batchPushMarketCaseAndCustGroupList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,List<Map<Object, Object>>> parseWaitSendBatchPushMarketCase(
			List<Map<String, Object>> batchPushMarketCaseAndCustGroupList)
			throws StrategyError {
		List<Map<Object, Object>> waitSendBatchPushMarketCaseList = new ArrayList<Map<Object, Object>>();
		Map<String,List<Map<Object, Object>>> resultMap = new HashMap<String,List<Map<Object, Object>>>();
		
		for(Map<String, Object> batchPushMarketCaseAndCustGroup : batchPushMarketCaseAndCustGroupList){
			Map<Object, Object> waitSendBatchPushMarketCaseCache = new HashMap<Object, Object>();
			String marketCaseId = (String)batchPushMarketCaseAndCustGroup.get("marketCaseId");
			String key = marketCaseId + Const.SEPARATOR_COLON + DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1);
			double value = Double.parseDouble(DateUtil.stringToString((String)batchPushMarketCaseAndCustGroup.get("operTime"), DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.TIME_FROMAT_SIMPLE3));
			waitSendBatchPushMarketCaseCache.put(key, value);
			waitSendBatchPushMarketCaseList.add(waitSendBatchPushMarketCaseCache);
		}
		for(int i=0;i<10;i++){
			resultMap.put(Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITSNED + Const.SEPARATOR_COLON + i, waitSendBatchPushMarketCaseList);
		}
		
		return resultMap;
	}
	
	/**
	 * 发送批量事件任务
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: sendBatchEventTask 
	* @param waitSendBatchEventTask
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void sendBatchEventTask(Map<String,Object> inParam,Map<String, Map<String, Map<String, String>>> waitSendBatchEventTask)
			throws StrategyError {

		if (!CommonUtils.objectIsNull(waitSendBatchEventTask)) {
			batchPushSender.openConnect();
			for(Map.Entry<String, Map<String, Map<String, String>>> waitSendBatchEventTaskMap : waitSendBatchEventTask.entrySet()){
				Map<String,String> taskIdAndMarketCaseIdMap = this.getWaitSendEventTaskIdAndMarketCaseId(waitSendBatchEventTaskMap.getKey());
				Map<String, String> taskMap = batchPushTaskSelector.selectBatchPushTaskById(taskIdAndMarketCaseIdMap.get("taskId"));
				this.sendSMPP(inParam,taskMap,taskIdAndMarketCaseIdMap);
			}
			batchPushSender.closeConnect();
		}
	}
	
	/**
	 * 发送批量push任务
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: sendBatchPushTask 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void sendBatchPushTask(Map<String,Object> tempParam,Map<String, Map<String, Map<String, String>>> waitSendBatchPushTask) throws StrategyError {
		
		if (!CommonUtils.objectIsNull(waitSendBatchPushTask)) {
			//全局规则
			Map<String,Object> globalRule = rule.getGlobalRuleByCache();
			List<Map<String, String>> batchPushTaskContentList = filterWaitSendBatchPushTask(tempParam,globalRule,waitSendBatchPushTask);
			//对等待下发任务进行过滤(流量控制)
			this.sendTask(batchPushTaskContentList);
			
		}

	}
	
	/**
	 * 发送批量push任务湖北
	* @date: 2017-2-28 
	* @author: zhangqia 
	* @title: sendBatchPushTaskForHBMob 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void sendBatchPushTaskForHBMob(Map<String,Object> tempParam,Map<String, Map<String, Map<String, String>>> waitSendBatchPushTask) throws StrategyError {
		
		if (!CommonUtils.objectIsNull(waitSendBatchPushTask)) {
			List<Map<String, String>> batchPushTaskContentList = queryBatchPushTaskContentForHBMob(waitSendBatchPushTask);
			//对等待下发任务进行过滤(流量控制)
			//filterWaitSendBatchPushTask(tempParam,batchPushTaskContentList);
			this.sendTaskForHBMob(tempParam,batchPushTaskContentList);
			
		}

	}
	/**
	 * 更新shell进程执行信息表中批量push营销案
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: updateShellProcessExecuteBatchPush 
	* @param tempInParamList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateShellProcessExecuteBatchPush(
			List<Map<String, Object>> tempInParamList) throws StrategyError {
		for(Map<String, Object>  baseInfo:tempInParamList){
			Map<String, Object> tempInParam = new HashMap<String, Object>();
			tempInParam.put("busiId", baseInfo.get("marketCaseId")) ;
			tempInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE) ;
			tempInParam.put("processNo", Const.SHELLPROCESS_NO_WAITCREATEBATCHPUSH) ;
			tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_EXE) ;
			String dataBaseTime = commonSelector.selectDataBaseSysTime();
			tempInParam.put("updateTime", DateUtil.string2Timestamp(dataBaseTime, DateUtil.TIME_FROMAT_SIMPLE3));
			systemDealUpdater.updateShellProcessExecuteInfo(tempInParam);
		}
	}
	
	/** 插入推荐记录
	* @date: 2017-3-1 
	* @author: wangpei
	* @title: addRecommendRecord 
	* @param taskMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected void addRecommendRecord(Map<String, String> taskMap){
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("marketCaseId", taskMap.get("marketCaseId"));
		tempInParam.put("channelId", taskMap.get("channelId"));
		tempInParam.put("positionId", taskMap.get("positionId"));
		tempInParam.put("idNo", taskMap.get("idNo"));
		tempInParam.put("regionCode", taskMap.get("regionCode"));
		tempInParam.put("numType", Const.NUM_TYPE_PHONE_NO);
		tempInParam.put("numValue", taskMap.get("serviceNbr"));
		tempInParam.put("operNo", "system");
		tempInParam.put("operName", "system");
		tempInParam.put("seqId", taskMap.get("seqId"));
		System.out.println("========addRecommendRecord========"+tempInParam);
		coupleBackInsertor.insertRecommendRecord(tempInParam, tempInParam);
	}

	/** 插入全局接触数据
	* @date: 2017-3-1 
	* @author: wangpei
	* @title: addUserTouchControl 
	* @param userMap
	* @param globalTouchControlList 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected void addUserTouchControl(Map<String,Object> userMap,List<Map<String, String>> globalTouchControlList){
		Map<String, Object> globalControl = new HashMap<String, Object>();
		if (!CommonUtils.objectIsNull(globalTouchControlList)) {
			for (Map<String, String> globalTouchControl : globalTouchControlList) {
				globalControl.put(globalTouchControl.get("batchNo"), globalTouchControl);
			}
		}
		if (!CommonUtils.objectIsNull(globalControl)) {
			for (Map.Entry<String, Object> entry : globalControl.entrySet()) {
				Map<String, Object> tempInParam = new HashMap<String,Object>();
				tempInParam.put("idNo", userMap.get("idNo"));
				tempInParam.put("batchNo", entry.getKey());
				tempInParam.putAll((Map<String,Object>) entry.getValue());
				log.debug("====addUserTouchControl=globalControl=tempInParam=", tempInParam);
				userInsertor.insertUserRecommendControl(userMap, tempInParam);
			}
		}
	}

	/**
	 * 检查活动状态和smpp连接
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: checkMarketCaseStatusAndSMPPStatus 
	* @param marketCaseId
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected boolean checkMarketCaseStatusAndConnStatus(String marketCaseId) throws StrategyError {
		boolean flag = true;
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("marketCaseId", marketCaseId);
		String statusCode = marketCaseSelector.getMarketCaseRecommendStatusFromCache(tempInParam);
		if (!(null ==  statusCode || "".equals(statusCode))) {
			flag = false;
		}
		if (0 != batchPushSender.checkConnStatus()) {
			batchPushSender.openConnect();
		}
		return flag;
	}
	
	/**
	 * 从rowkey中解析出任务id和营销案id
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: getWaitSendEventTaskIdAndMarketCaseId 
	* @param rowKey
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,String> getWaitSendEventTaskIdAndMarketCaseId(String rowKey) throws StrategyError{
		String[] taskIdStrings = rowKey.split(Const.SEPARATOR_COLON);
		if (taskIdStrings.length >= 4) {
			
			String marketCaseId = taskIdStrings[2];
			String taskId = taskIdStrings[3];
			Map<String,String> outMap = new HashMap<String,String>();
			outMap.put("marketCaseId", marketCaseId);
			outMap.put("taskId", taskId);
			outMap.put("rowKey", rowKey);
			
			if (!checkMarketCaseStatusAndConnStatus(marketCaseId)){
				throw new StrategyError("","","");
			}
			
			return outMap;
		} else {
			throw new StrategyError("","","");
		}
	}
	
	/**
	 * 从rowkey中解析出任务id
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: getWaitSendPushTaskId 
	* @param rowKey
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,String> getWaitSendPushTaskId(String rowKey) {
		Map<String,String> taskIdMap = new HashMap<String,String>();
		String[] taskIdStrings = rowKey.split(Const.SEPARATOR_COLON);
		String taskId = taskIdStrings[2];
		taskIdMap.put("taskId", taskId);
		return taskIdMap;
	}
	/**
	 * 从rowkey中解析出任务id
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: getWaitSendPushTaskId 
	* @param rowKey
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,String> getWaitSendPushTaskIdForHBMob(String rowKey) {
		Map<String,String> taskIdMap = new HashMap<String,String>();
		String[] taskIdStrings = rowKey.split(Const.SEPARATOR_COLON);
		String taskId = taskIdStrings[4];
		taskIdMap.put("taskId", taskId);
		return taskIdMap;
	}
	/** 获取短信发送限制条件
	* @date: 2017-3-1 
	* @author: wangpei
	* @title: getWaitSendRegionCodeAndCount 
	* @param tempParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String,Object> getWaitSendRegionCodeAndCount(Map<String,Object> tempParam){
		Map<String,Object> tempInParam = new HashMap<String, Object>();
		String marketCaseIdCountAndRegionCode=CommonUtils.toString(tempParam.get("marketCaseId"));
		String[] marketCaseIdCountAndRegionCodes = marketCaseIdCountAndRegionCode.split(Const.SEPARATOR_COLON);
		tempInParam.put("marketCaseId", marketCaseIdCountAndRegionCodes[0]);
		tempInParam.put("channelId", "04");
		if (!"NULL".equals(marketCaseIdCountAndRegionCodes[1])) {
			tempInParam.put("count", marketCaseIdCountAndRegionCodes[1]);
		}
		if (!"NULL".equals(marketCaseIdCountAndRegionCodes[2])) {
			tempInParam.put("regionCode", marketCaseIdCountAndRegionCodes[2]);
		}
		return tempInParam;
	}

	/**
	 * 查询批量任务内容
	* @date: 2017-2-20 
	* @author: zhangjj_crmpd
	* @title: queryBatchPushTaskContent 
	* @param waitSendBatchPushTask
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, String>> queryBatchPushTaskContent(
			Map<String, Map<String, Map<String, String>>> waitSendBatchPushTask) throws StrategyError {
		
		List<Map<String, String>> BatchPushTaskList = new ArrayList<Map<String, String>>();
		for(Map.Entry<String, Map<String, Map<String, String>>> waitSendBatchPushTaskMap : waitSendBatchPushTask.entrySet()){
			Map<String,String> taskIdMap = this.getWaitSendPushTaskId(waitSendBatchPushTaskMap.getKey());
			Map<String, String> taskMap = batchPushTaskSelector.selectBatchPushTaskById(taskIdMap.get("taskId"));
			BatchPushTaskList.add(taskMap);
		}
		return BatchPushTaskList;
	}
	/**
	 * 查询批量任务内容
	* @date: 2017-2-20 
	* @author: zhangjj_crmpd
	* @title: queryBatchPushTaskContent 
	* @param waitSendBatchPushTask
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, String>> queryBatchPushTaskContentForHBMob(
			Map<String, Map<String, Map<String, String>>> waitSendBatchPushTask) throws StrategyError {
		
		List<Map<String, String>> BatchPushTaskList = new ArrayList<Map<String, String>>();
		for(Map.Entry<String, Map<String, Map<String, String>>> waitSendBatchPushTaskMap : waitSendBatchPushTask.entrySet()){
			Map<String,String> taskIdMap = this.getWaitSendPushTaskIdForHBMob(waitSendBatchPushTaskMap.getKey());
			Map<String, String> taskMap = batchPushTaskSelector.selectBatchPushTaskById(taskIdMap.get("taskId"));
			BatchPushTaskList.add(taskMap);
		}
		return BatchPushTaskList;
	}
	/** 是否符合地市限制条件
	* @date: 2017-3-1 
	* @author: wangpei
	* @title: isWaitSendRegionCode 
	* @param tempParam
	* @param taskMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected boolean isWaitSendRegionCode(Map<String,Object> tempParam,Map<String, String> taskMap){
		if (!CommonUtils.objectIsNull(tempParam.get("regionCode")) && !taskMap.get("regionCode").equals(tempParam.get("regionCode"))) {
			return false;
		}
		return true;
	}

	/**
	 * 
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: sendSMPPAndInsertCountAndRecordTable 
	* @param phoneNo
	* @param msg
	* @param sourceAddr
	* @param rowkey
	* @param sendDate
	* @param marketCaseId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void sendSMPP(
			Map<String, Object> inParam, Map<String, String> taskMap,
			Map<String, String> taskIdAndMarketCaseIdMap) {
		
		Map<String, Object> tempParam = new HashMap<String, Object>();
		tempParam.put(Const.NOSQL_ROWKEY, taskIdAndMarketCaseIdMap.get("rowKey"));
		try {
			tempParam.put("message", taskMap.get("MSG"));
			tempParam.put("phoneNo", taskMap.get("PHONE_NO"));
			tempParam.put("sourceAddr", Const.DEFAULT_SOURCE_ADDR);
			batchPushSender.sendBatchPushMsg(tempParam);
			
		} catch (Exception e) {
			e.printStackTrace();
			taskInsertor.insertBatchPushTaskExcep(tempParam);
		} finally {
			taskDeleter.deleteBatchPushTaskIndex(tempParam);
		}
	}
	
	/** 
	 * SMPP短信发送和入统计、记录和删除索引表
	* @date: 2016-11-30 
	* @author: songxj
	* @title: sendSMPPAndInsertCountAndRecordTable 
	* @param phoneNo
	* @param msg
	* @param rowkey
	* @param sendDate
	* @param marketCaseId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected void sendTask(List<Map<String, String>> batchPushTaskContentList) {
		if(CommonUtils.objectIsNull(batchPushTaskContentList)){
			return;
		}
		batchPushSender.openConnect();
		for(Map<String, String> taskMap:batchPushTaskContentList){
			if(CommonUtils.objectIsNull(taskMap)){
				continue;
			}
			Map<String, Object> tempParam = new HashMap<String, Object>();
			for (Map.Entry<String,String> entry: taskMap.entrySet()) {
				tempParam.put(entry.getKey(), entry.getValue());
			}
			try {
				batchPushSender.sendBatchPushMsg(tempParam);
				//插入短信发送记录表
				taskInsertor.insertBatchPushTaskSucc(tempParam);
				//插入推荐记录表
				addRecommendRecord(taskMap);
			} catch (Exception e) {
				e.printStackTrace();
				taskInsertor.insertBatchPushTaskExcep(tempParam);
			} finally {
				taskDeleter.deleteBatchPushTaskIndex(tempParam);
			}
		}
		batchPushSender.closeConnect();
	}
	
	/** 
	 * SMPP短信发送和入统计、记录和删除索引表
	* @date: 2017-2-28 
	* @author: zhangqia
	* @title: sendSMPPAndInsertCountAndRecordTable 
	* @param phoneNo
	* @param msg
	* @param rowkey
	* @param sendDate
	* @param marketCaseId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected void sendTaskForHBMob(Map<String,Object> tempInParam,List<Map<String, String>> batchPushTaskContentList) {
		if(CommonUtils.objectIsNull(batchPushTaskContentList)){
			return;
		}
		batchPushSender.openConnect();
		for(Map<String, String> taskMap:batchPushTaskContentList){
			Map<String, Object> tempParam = new HashMap<String, Object>();
			for (Map.Entry<String,String> entry: taskMap.entrySet()) {
				tempParam.put(entry.getKey(), entry.getValue());
			}
			try {
				batchPushSender.sendBatchPushMsg(tempParam);
				if(batchPushSender.checkConnStatus()==0){
					continue;
				}else{
					batchPushSender.openConnect();
				}
			} catch (Exception e) {
				e.printStackTrace();
				taskInsertor.insertBatchPushTaskExcep(tempParam);
			} finally {
				tempParam.put("currentDate", tempInParam.get("sendDate"));
				tempParam.put("partition", tempInParam.get("processId"));
				taskDeleter.deleteBatchPushTaskIndex(tempParam);
			}
		}
		batchPushSender.closeConnect();
	}

	/**
	 * checkFile入参拼接
	* @date: 2017-4-17 
	* @author: chenhao
	* @title: getBatchPushProdTaskCheckFileParam 
	* @param map
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public MBean getBatchPushProdTaskCheckFileParam(Map<String, Object> map)
			throws StrategyError {
		String fileName = map.get("fileName")==null?"":map.get("fileName").toString();
		String filePath = map.get("filePath")==null?"":map.get("filePath").toString();
		//查询缓存，得到营销案详细信息
		IMarketCaseCachePojo marketCaseCachePojo= marketCaseSelector.getMarketCaseDetailFromCache(map);
		Map<String,Object> MarketCaseMap = marketCaseCachePojo.getMarketCaseMap();
		//operInfoMap
		Map<String,Object> operInfoMap = new HashMap<String,Object>();
		operInfoMap.put("CONTACT_ID", "");
		operInfoMap.put("LOGIN_NO",MarketCaseMap.get("operNo"));
		operInfoMap.put("OP_CODE","5431");
		operInfoMap.put("REGION_ID",MarketCaseMap.get("regionCode"));
		operInfoMap.put("CONTACT_ID", "1");
		//busiInfoMap
		Map<String,Object> busiInfoMap = new HashMap<String,Object>();
		busiInfoMap.put("FILE_ID", "1067");
		busiInfoMap.put("FILE_NAME", fileName);
		busiInfoMap.put("FILE_PATH", filePath);
		busiInfoMap.put("MASTER_SERV_ID", "1001");
		busiInfoMap.put("FUNC_CODE", "1067");
		busiInfoMap.put("FTP_IP", map.get("fipIp"));
		
		Map<String,Object> header = new HashMap<String,Object>();
		Map<String,Object> routingMap = new HashMap<String,Object>();
		String date = DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1);
		String random = Long.toString(System.currentTimeMillis()).substring(Long.toString(System.currentTimeMillis()).length()-6, Long.toString(System.currentTimeMillis()).length());
		String traceId = "11*"+date+"*5431*"+MarketCaseMap.get("operNo")+"*"+random;
		routingMap.put("ROUTE_KEY", "14");
		routingMap.put("ROUTE_VALUE", MarketCaseMap.get("operNo"));
		header.put("CHANNEL_ID", "11");
		header.put("DB_ID", "");
		header.put("KEEP_LIVE", "10.161.200.145");
		header.put("PARENT_CALL_ID", "B10AF6DD548FBEB5B889AC0DBD5C05CD");
		header.put("POOL_ID", "1");
		header.put("ROUTING", routingMap);
		header.put("TRACE_ID", this.getTraceId(MarketCaseMap.get("operNo").toString()));
		
		Map<String, Object> bodyMap = new HashMap<String,Object>();
		bodyMap.put("BUSI_INFO", busiInfoMap);
		bodyMap.put("OPR_INFO", operInfoMap);
		MBean bean = new MBean();
		bean.setBody(bodyMap);
		bean.setHeader(header);
		log.info("---------------checkFileBean----------", bean.toString());
		return bean;
	}

	/**
	 * 批量套餐文件检查参数处理
	* @date: 2017-4-17 
	* @author: chenhao
	* @title: checkFile 
	* @param checkFileBean
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> checkFile(MBean checkFileBean)
			throws StrategyError {
		Map<String,Object> checkResult = batchPushTaskSelector.checkFile(checkFileBean.toString());
		return checkResult;
	}

	/**
	 * 批量套餐添加批量计划参数
	* @date: 2017-4-17 
	* @author: chenhao
	* @title: getBatchPushProdTaskAddBatchExePlanBeanParam 
	* @param checkFileMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public MBean getBatchPushProdTaskAddBatchExePlanBeanParam(
			Map<String, Object> checkFileMap ,Map<String,Object> inParam) throws StrategyError {
		String fileSuccess = checkFileMap.get("FILE_SUCCESS")==null?"":checkFileMap.get("FILE_SUCCESS").toString();
		String fileError = checkFileMap.get("FILE_ERROR")==null?"":checkFileMap.get("FILE_ERROR").toString();
		String fileErrorInfo = checkFileMap.get("FILE_ERROR_INFO")==null?"":checkFileMap.get("FILE_ERROR_INFO").toString();
		String successNumber = checkFileMap.get("SUCCESS_NUMBER")==null?"":checkFileMap.get("SUCCESS_NUMBER").toString();
		//查询缓存，得到营销案详细信息
		IMarketCaseCachePojo marketCaseCachePojo= marketCaseSelector.getMarketCaseDetailFromCache(inParam);
		Map<String,Object> MarketCaseMap = marketCaseCachePojo.getMarketCaseMap();
		Map<String,Object> MarketCaseRelMap = marketCaseCachePojo.getMarketCaseRel();
		Map<String,Object> ContentMap = marketCaseCachePojo.getContentMap();

	    if(!CommonUtils.objectIsNull(fileSuccess)&&(Integer.parseInt(successNumber))>0){
			log.info("----fileSuccess-----", fileSuccess);
			log.info("-------successNumber-----", successNumber);
			//operInfo属性
			Map<String,Object> operInfoMap = new HashMap<String,Object>();
			operInfoMap.put("CONTACT_ID", "");
			operInfoMap.put("LOGIN_NO",MarketCaseMap.get("operNo"));
			operInfoMap.put("OP_CODE","5431");
			operInfoMap.put("REGION_ID",MarketCaseMap.get("regionCode"));
			operInfoMap.put("CONTACT_ID", "1");
			//busiInfoMap
			Map<String,Object> busiInfoMap = new HashMap<String,Object>();
			busiInfoMap.put("FUNC_CODE", "1067");
			busiInfoMap.put("MASTER_SERV_ID", "1001");
			busiInfoMap.put("FILE_ID", "1067");
			busiInfoMap.put("FILE_NAME", fileSuccess);
			busiInfoMap.put("EXE_FILE_NAME", fileSuccess);
			busiInfoMap.put("FTP_IP",inParam.get("ftpIp"));	
			busiInfoMap.put("FILE_PATH",inParam.get("filePath"));
			busiInfoMap.put("PLAN_NUM", successNumber);
			String date = DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1);
			busiInfoMap.put("PLAN_STAR_TIME", date+"000000");
			busiInfoMap.put("PLAN_END_TIME", date+"235959");
			String parameterJson = this.getParameterJson(MarketCaseMap,MarketCaseRelMap,ContentMap).toString();
			log.info("-------parameterJson-----", parameterJson);
			busiInfoMap.put("PARAMETER_JSON",parameterJson);
			busiInfoMap.put("APPLY_ID", "1000019105");
			busiInfoMap.put("NOTICE_PHONE","15044019697");
			
			Map<String,Object> header = new HashMap<String,Object>();
			Map<String,Object> routingMap = new HashMap<String,Object>();
			routingMap.put("ROUTE_KEY", "14");
			routingMap.put("ROUTE_VALUE", MarketCaseMap.get("operNo"));
			header.put("CHANNEL_ID", "11");
			header.put("DB_ID", "A1");
			header.put("KEEP_LIVE", "10.161.200.145");
			header.put("PARENT_CALL_ID", "960161D7CD4A3EBF9D703F2B69415B5D");
			header.put("POOL_ID", "1");
			header.put("ROUTING", routingMap);
			header.put("TRACE_ID",this.getTraceId(MarketCaseMap.get("operNo").toString()));
			header.put("USERNAME", "");
			
			Map<String, Object> bodyMap = new HashMap<String,Object>();
			bodyMap.put("BUSI_INFO", busiInfoMap);
			bodyMap.put("OPR_INFO", operInfoMap);
			MBean bean = new MBean();
			bean.setBody(bodyMap);
			bean.setHeader(header);
			log.info("---------------addBatchExePlanBean----------", bean.toString());
			return bean;
		}else{
			log.info("-------successNumber < 0 is true!----", successNumber);
			return null;
		}
	}

	/**
	 * 取得json的套餐报文参数
	* @date: 2017-4-22 
	* @author: chenhao
	* @title: getParameterJson 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private String getParameterJson(Map<String,Object> MarketCaseMap,Map<String,Object> MarketCaseRelMap,Map<String,Object> ContentMap){
		Map<String,Object> jsonMap = new HashMap<String,Object>();
		String prodPrcid = ""; //赠送套餐的id
		String effType = ""; //生效方式
		int productMonth = 0; //赠送月数
		
		List<String> contentIdList = new ArrayList<String>();
		String marketCaseId = (String) MarketCaseMap.get("marketCaseId");
		System.out.println("==========getBatchPushContentMap.relMap==============" + MarketCaseRelMap); 
		Map<String,Object> custRelMap = (Map<String,Object>)((Map<String,Object>)MarketCaseRelMap.get(Const.COMPONENT_TYPE_MARKETCASE)).get(marketCaseId); 
		System.out.println("==========getBatchPushContentMap.custRelMap==============" + custRelMap); 
		Map<String,Object> custIdMap = (Map<String, Object>) custRelMap.get(Const.COMPONENT_TYPE_CUSTGROUP);
		System.out.println("==========getBatchPushContentMap.custIdMap==============" + custIdMap); 
		for(String key :custIdMap.keySet()){
			Map<String,Object> channelRelMap = (Map<String, Object>) custIdMap.get(key);
			System.out.println("==========getBatchPushContentMap.channelRelMap==============" + channelRelMap); 
			Map<String,Object> channelMap = (Map<String,Object>)((Map<String, Object>) channelRelMap.get(Const.COMPONENT_TYPE_CHANNEL)).get("01");
			System.out.println("==========getBatchPushContentMap.channelMap==============" + channelMap);
			Map<String,Object> positionRelMap = (Map<String, Object>) channelMap.get(Const.COMPONENT_TYPE_POSITION);
			System.out.println("==========getBatchPushContentMap.positionRelMap==============" + positionRelMap);
			for(String key2 :positionRelMap.keySet()){
				Map<String,Object> positionMap = (Map<String, Object>) positionRelMap.get(key2);
				contentIdList = (List<String>) positionMap.get(Const.COMPONENT_TYPE_CONTENT);
			}
		}
		System.out.println("==========contentIdList==============" + contentIdList);
		String contentId = contentIdList.get(0);
		System.out.println("==========contentId==============" + contentId);
		List<Map<String,Object>> list = (List<Map<String, Object>>) ContentMap.get(contentId);
		System.out.println("==========list1271==============" + list);
		Map<String,Object> map1 = list.get(0);
		//取得套餐属性列表
		List<Map<String,Object>> paramList = (List<Map<String, Object>>) map1.get("params");
		for(Map<String,Object> contentMap:paramList){
			if(Const.RULE_CODE_CLOSEPRODUCTID.equals(contentMap.get("contentParCode"))){
				prodPrcid = contentMap.get("contentParValue").toString();
				System.out.println("==========prodPrcid==============" + prodPrcid);
			}else if("offerProductEffect".equals(contentMap.get("contentParCode"))){
				effType = (String)contentMap.get("contentParValue");	
				System.out.println("==========effType==============" + effType);
			}else if("offerProductMonth".equals(contentMap.get("contentParCode"))){
				productMonth = Integer.valueOf((String) contentMap.get("contentParValue"));
				System.out.println("==========productMonth==============" + productMonth);
			}
		}
		
		//计算生效时间、失效时间
		String effDate = "";
		String expDate = "";
		if( Const.PROD_EFFECT_TYPE_CUR_DAY.equals(effType) ){
			effDate = DateUtil.DateToString(new Date(), "yyyyMMddHHmmss");
			expDate = DateUtil.getLashDayOfMonth18String(productMonth-1);
		}else if( Const.PROD_EFFECT_TYPE_NEXT_MONTH.equals(effType) ){
			effDate = DateUtil.getNextMonthFirstDate();
			expDate = DateUtil.getLashDayOfMonth18String(productMonth);
		}
		
		Map<String,Object> productMap = new HashMap<String,Object>();
		productMap.put("EFF_DATE", effDate);
		productMap.put("PROD_PRCID", prodPrcid);
		productMap.put("EXP_DATE", expDate);
		List<Map<String,Object>> productList = new ArrayList<Map<String,Object>>();
		productList.add(productMap);
		jsonMap.put("PRODUCT_LIST", productList);
		jsonMap.put("OPERATE_TYPE", "A");
		jsonMap.put("FUNCTION_CODE", "1067");
		jsonMap.put("TRACE_ID", getTraceId(MarketCaseMap.get("operNo").toString()));
		jsonMap.put("IFNOTE"," 1-->否 ");
		jsonMap.put("APPBUSI_CODE", "APP_1067_002");
		jsonMap.put("LOGIN_NO", MarketCaseMap.get("operNo"));
		String applyTime = DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE1); 
		jsonMap.put("APPLY_TIME", applyTime);
		jsonMap.put("NOTE", "实时营销批量赠套餐");
		jsonMap.put("OP_NOTE", "操作备注测试");
		jsonMap.put("APPLY_ID", "1000019105");
		String str = JsonUtil.objectToJsonStr(jsonMap);
		return str;	
	}
	/**
	 * 取得traceId
	* @date: 2017-4-22 
	* @author: chenhao
	* @title: getTraceId 
	* @param loginNo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private String getTraceId(String loginNo){
		String date = DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3);
		String random = Long.toString(System.currentTimeMillis()).substring(Long.toString(System.currentTimeMillis()).length()-6, Long.toString(System.currentTimeMillis()).length());
		String traceId = "11*"+date+"*5431*"+loginNo+"*"+random;
		return traceId;
	}

	/**
	 * 批量套餐调用
	* @date: 2017-4-17 
	* @author: chenhao
	* @title: addBatchExePlan 
	* @param checkFileBean
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> addBatchExePlan(MBean addBatchExePlanBean)
			throws StrategyError {
		if(addBatchExePlanBean != null){
			Map<String,Object> addBatchExePlan = batchPushTaskSelector.addBatchExePlan(addBatchExePlanBean.toString());
			return addBatchExePlan;
		}else{
			Map<String,Object> result = new HashMap<String,Object>();
			result.put("error","addBatchExePlan is null");
			return result;
		}
	}
}
