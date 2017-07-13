package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 规则对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: IRule 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IRule {
	
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
	public void addCloseRuleToCache(Map.Entry<String, Object> closeRule) throws StrategyError;
	
	/**
	 * 加载评估规则到缓存
	* @date: 2017-4-6 
	* @author: sunyuan
	* @title: addEvaluateRuleToCache 
	* @param evaluateRule
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addEvaluateRuleToCache(Map.Entry<String, Object> evaluateRule) throws StrategyError;
	
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
	public void addGlobalRuleToCache(Map<String, Object> globalRuleDetailMap) throws StrategyError;
	
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
	public void addMutexRuleToCache(Map.Entry<String, Object> mutexRuleDetailMap) throws StrategyError;
	
	/**
	 * 添加全局变量配置
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
	public void addGlobalStrategyConfig(Map<String,Object>inParam) throws StrategyError;
	
	/**
	 * 增加接触控制记录
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: addGolbalTouchControlRecord 
	* @param inParam
	* @param marketCaseParketPojoList 
	* @exception: 
	* @version: 1.0 
	* @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addTouchControlRecord(Map<String, Object> inParam,List<Map<String, Object>> marketCaseParketPojoList) throws StrategyError;
	
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
	public void addRuleInfo(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	
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
	public void addRuleDetail(Map<String,Object> inParam,Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 根据客户群及(渠道或事件)添加规则
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
	public Map<String,Object> addRuleDetailByCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/** 根据客户群及渠道添加规则
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: addRuleDetailByCustGroupAndChannel 
	* @param inParam
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> addRuleDetailByCustGroupAndChannel(Map<String,Object> inParam) throws StrategyError;
	
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
	public void addRuleDetailByTaskAdjust(String ruleId,String taskAdjustId,Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 校验调配规则
	* @date: 2016-12-21 
	* @author: zhangjj_crmpd
	* @title: checkTaskAdjustRule 
	* @param tempInParam 
	* @exception: 
	* @version: 1.0 
	 * @return 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> checkTaskAdjustRule(Map<String, Object> tempInParam) throws StrategyError;
	
	/**
	 * 校验接触规则
	* @date: 2016-12-24 
	* @author: sunliang 
	* @title: checkTouchRule 
	* @param touchRuleTimeMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean checkTouchRule(Map<String,Object> touchRuleTimeMap);
	
	/** 获取渠道推荐控制参数
	* @date: 2017-2-22 
	* @author: wangpei
	* @title: dealFrequencyRuleInTouchResult 
	* @param control
	* @param flag
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> dealFrequencyRuleInTouchResult(Map<String,Object> control,int flag);
	
	
	/**
	 * 通过缓存获取全局规则
	* @date: 2016-11-15 
	* @author: yangwl
	* @title: getGlobalRuleByCache 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getGlobalRuleByCache() throws StrategyError;
	
	/**
	 * 查询互斥规则
	* @date: 2017-4-4 
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
	public List<String> getMutexRuleInfoByMarketCase(IMarketCaseCachePojo marketCaseCachePojo) throws StrategyError;
	
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
	public Map<String,Object> getTouchRuleStartEndTime (Map<String,Object> tempInParam) throws StrategyError;
	
	/** 获取全局频控数据
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
	public Map<String, Object> getGlobalRecommendControlAndRule(Map<String, Object> inParam,Map<String,Object> userMap,Map<String, Object> globalRuleMap);
	
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
	public Map<String, Object> getUserRecommendControlByChannel(Map<String,Object> inParam, Map<String,Object> userMap,Map<String,Object> marketCaseBaseMap);
	
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
	public Map<String, Object> isFilterRule(Map<String, Object> inParam,Map<String, Object> userMap,String componentIdBaseContent,IMarketCaseCachePojo marketCaseCachePojo,Map<String, Object> positionInfoMap,Map<String,Object> channelInfoMap) throws StrategyError;
	
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
	public Map<String,Object> isPassGlobalRule(Map<String,Object> inParam,Map<String,Object> userMap, Map<String,Object> marketCaseBaseMap, Map<String, Object> globalRuleMap) throws StrategyError;

	/** 校验黑名单
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
	public boolean isPassGrey(Map<String,Object> inParam,Map<String, Object> userMap, Map<String,Object> marketCaseBaseMap) throws StrategyError;
	
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
	public boolean isPassGrey(Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 校验规则是否通过
	* @date: 2016-9-26 
	* @author: sunliang 
	* @title: isPassRule 
	* @param inParam
	* @param ruleDetailMap
	* @param positionInfoMap
	* @param marketCaseRel
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> isPassRule(Map<String,Object> inParam, Map<String, Object> userMap,Map<String,Object> marketCaseBaseMap ,Map<String,Object> ruleDetailMap,Map<String, Object> positionInfoMap,Map<String,Object> marketCaseRel,Map<String,Object> channelInfoMap) throws StrategyError;
	/**
	 * 是否任务关闭
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
	public boolean isRecommonedClose(Map<String,Object> inParam,Map<String,Object> userMap,Map<String, Object> tempInParam) throws StrategyError;

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
	public boolean isWaitToDayBatchPush(Map<String,Object> inParam) throws StrategyError;
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
	public boolean itHasBatchPushJob(Map<String,Object> inParam,String position) throws StrategyError;
	
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
	public boolean isHasCallTask(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 解析缴费事件ID和规则明细
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: parsePayFeeEventIdAndMarketCaseIdRelAndRuleDetail 
	* @param payFeeEventIdAndMarketCaseIdReAndContentDetail
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,List<Map<String,Object>>> parsePayFeeEventIdAndMarketCaseIdRelAndRuleDetail(List<Map<String,Object>> payFeeEventIdAndMarketCaseIdReAndContentDetail) throws StrategyError;
	
	/**
	 * 查询全局策略配置列表
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
	public List<Map<String,Object>> queryGlobalStrategyConfigList(Map<String,Object>inParam,IQueryFilter queryFilter)throws StrategyError;
	
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
	public Map<String, Object> queryGlobalRuleDetail(List<Map<String, Object>> globalRuleTypeList)throws StrategyError;
	
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
	public Map<String,Object> queryMarketCaseByRuleId(List<Map<String,Object>> ruleIdList)throws StrategyError;
	
	/**
	 * 查询互斥规则详细信息
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: queryMutexRuleDetail 
	* @param mutexRuleInfoList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryMutexRuleDetail(List<Map<String,Object>> ruleInfoList)throws StrategyError;
	
	/**
	 * 查询规则信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryRuleById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryRuleInfo(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 *查询规则详细信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryRuleDetail 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Deprecated
	public List<Map<String,Object>> queryRuleDetail(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 查询规则详细信息(新)
	* @date: 2017-3-29 
	* @author: sunyuan
	* @title: queryRuleDetail 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryRuleDetail(Map<String,Object> inParam)throws StrategyError;
	
	/**
	 * 查询规则详细信息Id
	* @date: 2016-10-7 
	* @author: wangth
	* @Title: queryRuleDetail 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryRuleDetailId(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
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
	public List<Map<String,Object>> queryRuleDetailByParentComponentId(Map<String,Object> inParam) throws StrategyError;
	
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
	public void removeGlobalStrategyConfig(Map<String,Object>inParam) throws StrategyError;
	
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
	public void removeRuleById(Map<String,Object> inParam) throws StrategyError;
	
	/** 删除规则明细
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
	public void removeRuleDetailByDetailId(Map<String,Object> inParam) throws StrategyError;

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
	public void updateRuleById(Map<String,Object> inParam) throws StrategyError;


}
