package com.sitech.strategy.manage.entity.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;

import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.partition.IPartitionPojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IEvaluateManageEntity;
import com.sitech.strategy.manage.entity.inter.IExecuteManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 
* @date: 2016-9-28 
* @author: wangth
* @Title: ExecuteManageEntity 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class ExecuteManageEntity extends BaseManageEntity implements IExecuteManageEntity{

	/**
	 * 评估(查询)对象
	 */
	protected IEvaluateManageEntity evaluateManageEntity;		
	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * 营销案插入对象
	 */
	protected IDataInsertor.IMarketCaseInsertor marketCaseInsertor;
	/**
	 * 营销案查询对象
	 */
	protected IDataSelector.IMarketCaseSelector marketCaseSelector;	
	/**
	 * 营销案删除对象
	 */
	protected IDataDeleter.IMarketCaseDeleter marketCaseDeleter;	
	/**
	 * 任务数据插入对象
	 */
	protected IDataInsertor.ITaskInsertor taskInsertor;
	/**
	 * 操作日志插入对象
	 */
	protected IDataInsertor.IOperationLogInsertor operLogInsertor;
	/**
	 * 分区pojo对象
	 */
	protected IPartitionPojo partitionPojo;
	
	/**
	 * 
	* @date: 2016-11-16 
	* @author: yuanliang
	* @title: setEvaluateManageEntity 
	* @param evaluateManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEvaluateManageEntity(IEvaluateManageEntity evaluateManageEntity) {
		this.evaluateManageEntity = evaluateManageEntity;
	}

	/**
	 * 
	* @date: 2016-9-28 
	* @author: wangth
	* @Title: setMarketCase 
	* @param marketCase 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCase(IMarketCase marketCase) {
		this.marketCase = marketCase;
	}
	
	/**
	 * 
	* @date: 2017-2-7 
	* @author: sunliang 
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
	* @date: 2017-2-17 
	* @author: yuanliang
	* @title: setPartitionPojo 
	* @param partitionPojo 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPartitionPojo(IPartitionPojo partitionPojo) {
		this.partitionPojo = partitionPojo;
	}
	
	/** 
	* @date: 2016-10-31 
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
	 * 
	* @date: 2017-3-7 
	* @author: wuJiaFu
	* @title: setOperLogInsertor 
	* @param operLogInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setOperLogInsertor(
			IDataInsertor.IOperationLogInsertor operLogInsertor) {
		this.operLogInsertor = operLogInsertor;
	}

	/**
	 * 注入spring bean
	* @date: 2016-11-7 
	* @author: yuanliang
	* @title: setMarketCaseInsertor 
	* @param marketCaseInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseInsertor(
			IDataInsertor.IMarketCaseInsertor marketCaseInsertor) {
		this.marketCaseInsertor = marketCaseInsertor;
	}
	/**
	 * 
	* @date: 2016-11-16 
	* @author: yuanliang
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
	
/*	*//**
	 * 往缓存中添加营销案状态（暂停）
	* @date: 2016-9-28 
	* @author: wangth
	* @Title: addMarketCaseTaskStatusCodeToCache 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	@Override
	public void addBatchPushTaskStatusCodeToCache(Map<String, Object> inParam) throws StrategyError{
		marketCase.addBatchPushTaskStatusCodeToCache(inParam);
	}*/
	
	/**
	 * 暂停营销案推荐
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: pauseMarketCaseRecommend 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void pauseMarketCaseRecommend(Map<String, Object> inParam)
			throws StrategyError {
		marketCaseInsertor.addMarketCaseRecommendStatusToCache(inParam);
	}
	

	/**
	 * 营销案测试时，往优先级缓存添加测试数据
	* @date: 2016-11-7 
	* @author: yuanliang
	* @title: addBatchPushMarketCasePriorityForTestToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addTestWaitSendBatchPushMarketCaseToCache(
			Map<String, Object> inParam) throws StrategyError {
		Map<String,List<Map<Object, Object>>> resultMap = new HashMap<String,List<Map<Object, Object>>>();
		List<Map<Object, Object>> resultList = new ArrayList<Map<Object,Object>>();
		Map<Object, Object> tmpMap = new HashMap<Object, Object>();
		
		String marketCaseId=(String) inParam.get("marketCaseId");
		String sendDate=(String) inParam.get(Const.RULE_CODE_SENDDATE);
		//member的值是 营销案ID:yyyyMMdd
		String member=marketCaseId+Const.SEPARATOR_COLON+sendDate;
		/**
		 * score的值目前的算法：Double.parseDouble(marketCaseLevel+ “yyyyMMddHHmmss”）,
		 * ,而测试要优先级最高， 但是使用的redis的算法是zrange，是按照其分数从低到高的顺序返回。因此使用0为最小值吧。
		 */
		double score = 0;
		//测试指定一个固定0分区
		tmpMap.put(member,score);
		resultList.add(tmpMap);
		resultMap.put(Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITSNED+Const.SEPARATOR_COLON+"0", resultList);
		marketCaseInsertor.addWaitSendBatchPushMarketCaseToCache(resultMap);
	}

	/**
	 * 往批量push营销案待发送营销案列表缓存添加补发数据
	* @date: 2016-11-11 
	* @author: yuanliang
	* @title: addRepairWaitSendBatchPushMarketCaseToCache 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addRepairWaitSendBatchPushMarketCaseToCache(
			Map<String, Object> inParam) throws StrategyError {
		//resultMap数据结构:key是10个分区，值是list，其中list中的值是个map，map中key是zdd命令的member，map中的value是zdd命令中的score.
		Map<String,List<Map<Object, Object>>> resultMap = new HashMap<String,List<Map<Object, Object>>>();
		List<Map<Object, Object>> waitSendBatchPushMarketCaseList = new ArrayList<Map<Object, Object>>();
		List<Map<String, Object>> repairMarketCasesList =(List<Map<String, Object>>) inParam.get("repairMarketCases");
		for(Map<String, Object> map:repairMarketCasesList){
			Map<Object, Object> waitSendBatchPushMarketCaseCache = new HashMap<Object, Object>();
			String marketCaseId = (String)map.get("marketCaseId");
			String sendDate = (String) map.get(Const.RULE_CODE_SENDDATE);
			//后续 ZADD key score member 使用
			String member = marketCaseId + Const.SEPARATOR_COLON + sendDate;
			double score = Double.parseDouble(DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
			waitSendBatchPushMarketCaseCache.put(member, score);
			waitSendBatchPushMarketCaseList.add(waitSendBatchPushMarketCaseCache);			
		}

		int partitionNum = partitionPojo.getBatchPushSendPartitionNum();
		for(int i=0;i<partitionNum;i++){
			resultMap.put(Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITSNED + Const.SEPARATOR_COLON + i, waitSendBatchPushMarketCaseList);
		}
		
		//复用已经有的批量操作优先级缓存persist
		marketCaseInsertor.addWaitSendBatchPushMarketCaseToCache(resultMap);
	}
	
	/**
	 * 获得补发的营销案
	* @date: 2016-11-16 
	* @author: yuanliang
	* @title: getRepairWaitSendBatchPushMarketCase 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String,Object>> getRepairWaitSendBatchPushMarketCase(Map<String, Object> inParam)
			throws StrategyError {
		List<Map<String,Object>> marketCaseList = new ArrayList<Map<String, Object>>();
		IQueryFilter queryFilter=new QueryFilter();
		queryFilter.setMarketStatusCode((String)inParam.get("statusCode"));
		String sysDate=DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3);
		queryFilter.setSysDate(DateUtil.string2Timestamp(sysDate, DateUtil.TIME_FROMAT_SIMPLE3));
				
		/**
		 *将数据库查询的list结果进行数据转换，转换成两个数据结构：
		 * 1、按照marketCaseId分组后的规则明细map
		 * 此map是将数据库表按照marketCaseId分组进行转换，是个嵌套map。
		 * key是marketCaseId，value是map，此map的key是ruleDetailType+ruleParCode，value是ruleParValue。
		 * 2、营销案的基本信息map，为返回前台界面展示营销案基本信息
		 */
		Map<String,Map> ruleMap=new HashMap();
		Map<String,Map> marketCaseBasicMap=new HashMap();
		marketCaseList = marketCaseSelector.selectMarketCaseAndWholeRuleDetail(queryFilter);
		for(Map map:marketCaseList){
			String marketCaseId=(String) map.get("marketCaseId");
			String marketCaseName=(String) map.get("marketCaseName");
			String ruleDetailType=(String) map.get("ruleDetailType");
			String ruleParCode=(String) map.get("ruleParCode");
			String ruleParValue=(String) map.get("ruleParValue");
			marketCaseBasicMap.put(marketCaseId, map);
			
			if(ruleMap.containsKey(marketCaseId)){
				Map ruleParMap=ruleMap.get(marketCaseId);
				String key=ruleDetailType+ruleParCode;
				ruleParMap.put(key, ruleParValue);
				
				ruleMap.put(marketCaseId, ruleParMap);		
			}else{
				Map ruleParMap= new HashMap();
				String key=ruleDetailType+ruleParCode;
				ruleParMap.put(key, ruleParValue);
				
				ruleMap.put(marketCaseId, ruleParMap);
			}

		}//end for
		
		String filterDays=(String)inParam.get("filterDays");
		List<Map<String,Object>> resultList = getPushTaskStatistics(filterDays,ruleMap, marketCaseBasicMap);

		return resultList;
	}
	
	/** 
	 * 验证营销案
	* @date: 2016-10-31 
	* @author: songxj
	* @title: marketCaseVerify 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> marketCaseVerify(Map<String, Object> inParam)
			throws StrategyError {
		
		Map<String,Object> tempParam = new HashMap<String,Object>();
		tempParam.put("phoneNo", tempParam.get("phoneNo"));
		tempParam.put("marketCaseId", tempParam.get("marketCaseId"));
		tempParam.put("currentDate", tempParam.get("currentDate"));
		tempParam.put("msg", tempParam.get("msg"));
		tempParam.put("partition", "0");
		tempParam.put("taskId", SequenceUtil.getSequence());
		
		//插入任务明细表
		taskInsertor.insertBatchPushTaskVerify(tempParam);
		
		//插入任务索引表
		taskInsertor.insertWaitSendBatchPushTask(tempParam);
		
		//插入任务统计表
		taskInsertor.insertBatchPushCreateTaskCount(tempParam);
		return tempParam;
	}



/*	*//**
	 * 恢复活动时从缓存中移除数据
	* @date: 2016-9-28 
	* @author: wangth
	* @Title: removeMarketCaseTaskStatusCodeToCache 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	@Override
	public void removeBatchPushTaskStatusCodeFromCache(Map<String, Object> inParam) throws StrategyError {
		marketCase.removeBatchPushTaskStatusCodeFromCache(inParam);
	}*/
	
	/**
	 * 恢复营销案推荐暂停
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: recoverMarketCaseRecommendPause 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void recoverMarketCaseRecommendPause(Map<String,Object> inParam) throws StrategyError {
		marketCaseDeleter.removeMarketCaseRecommendStatusFromCache(inParam);
	}
	
	/**
	 * 发送营销案ID
	* @date: 2016-12-16 
	* @author: yuanchun
	* @Title: sendMarketIdToCache 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0    
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void sendMarketIdToCache(Map<String, Object> inParam) throws StrategyError {
		//缓存结构为List<Map<Object, Object>>
		Map<String,Object> inParamOfOracle = new HashMap<String,Object>();
		Map<String,List<Map<Object, Object>>> resultMap = new HashMap<String,List<Map<Object, Object>>>();
		List<Map<Object, Object>> resultList = new ArrayList<Map<Object,Object>>();
		Map<Object, Object> tmpMap = new HashMap<Object, Object>();
		String marketCaseId=(String) inParam.get("marketCaseId");
		String[] params = marketCaseId.split(":");
		inParamOfOracle.put("marketCaseId", params[0]);
		inParamOfOracle.put("triggerNumber", params[1]);
		inParamOfOracle.put("regionCode", params[2]);
		inParamOfOracle.put("operTime", new Date());
		inParamOfOracle.put("operNo", inParam.get("operNo"));
		//member的值是 营销案ID
		String member=marketCaseId;
		/**
		 * score的值目前的算法：Double.parseDouble(marketCaseLevel+ “yyyyMMddHHmmss”）,
		 * ,而测试要优先级最高， 但是使用的redis的算法是zrange，是按照其分数从低到高的顺序返回。因此使用0为最小值吧。
		 */
		Double score=0.0;
		//测试指定一个固定0分区
		/*resultMap.put("key", Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITSNED);
		resultMap.put("score", score);		
		resultMap.put("member", member);*/
		tmpMap.put(member,score);
		resultList.add(tmpMap);
		resultMap.put(Const.CACHE_DATATYPE_MARKETCASE_BATCHPUSH_WAITSNED, resultList);
		marketCaseInsertor.addWaitSendBatchPushMarketCaseToCache(resultMap);
		operLogInsertor.insertMessageTriggerLogInfo(inParamOfOracle);
	}


	
	//============private===========
	/**
	 * 调用营销案push任务统计查询
	* @date: 2016-11-16 
	* @author: yuanliang
	* @title: getPushTaskStatistics 
	* @param filterDays
	* @param ruleMap
	* @param marketCaseBasicMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private List<Map<String,Object>> getPushTaskStatistics(String filterDays,Map<String,Map> ruleMap, Map<String,Map> marketCaseBasicMap) throws StrategyError{
		List<Map<String,Object>> resultList = new ArrayList<Map<String, Object>>();
		Iterator<String> iterator = ruleMap.keySet().iterator();
		while (iterator.hasNext()) {
			String marketCaseId = (String) iterator.next();
			Map ruleParMap = (Map) ruleMap.get(marketCaseId);
			String key=Const.RULE_TYPE_TRIGGERRULE+Const.RULE_CODE_TOUCHPERID;
			if(ruleParMap.containsKey(key)){
				String value=(String) ruleParMap.get(key);
				if(Const.RULE_VALUE_MONTH.equals(value)){
					key=Const.RULE_TYPE_TRIGGERRULE+Const.RULE_CODE_SENDDATE;
					String ruleParValue=(String) ruleParMap.get(key);
					if(CommonUtils.objectIsNull(value)==false){
						String[] sendDates = ruleParValue.split(Const.SEPARATOR_COMMA);
						//调用当月触发时间
						String currentMonth=DateTime.now().toString("yyyy-MM");
						int currentDay=DateTime.now().getDayOfMonth();
						for(String day:sendDates){
							//当前天小于等于触发配置的天，避免无谓的统计及查询
							if(currentDay>=Integer.parseInt(day)){
								//add by yl at 2017-2-21.增加对前台选择触发时间的过滤
								String[] filterDayArr=filterDays.split(Const.SEPARATOR_COMMA);
								for(String filterDay:filterDayArr){
									if(Integer.parseInt(day)==Integer.parseInt(filterDay)){
										String triggerDay=currentMonth+"-"+day;
										String triggerDateTime=currentMonth+"-"+day+" 00:00:00";//"yyyy-MM-dd HH:mm:ss"
										System.out.println("========triggerDateTime="+triggerDateTime);
										
										Map<String, Object> statisticsParam = new HashMap<String, Object>();
										statisticsParam.put("marketCaseId", marketCaseId);
										statisticsParam.put("startTime", triggerDateTime);
										statisticsParam.put("endTime", triggerDateTime);							
										Map<String,Object> statisticsMap=evaluateManageEntity.queryPushTaskStatistics(statisticsParam);
										
										statisticsMap.putAll(marketCaseBasicMap.get(marketCaseId));//增加营销案基本信息
										statisticsMap.put("triggerDay", triggerDay);//增加触发时间
										resultList.add(statisticsMap);										
									}
								}
	
							}
							
						}
						
					}
				}
			}			
		}//while
		
		return resultList;
	}

}
