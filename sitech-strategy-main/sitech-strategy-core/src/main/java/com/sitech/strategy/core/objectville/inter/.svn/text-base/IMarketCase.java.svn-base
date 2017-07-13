package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseDetailPojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 营销案对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: IMarketCase 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IMarketCase {
	
	/**
	 * 保存附件上传
	* @date: 2016-11-15 
	* @author: xiongxq
	* @Title: addAttach 
	* @param inParam
	* @param marketCaseId
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addAttach(Map<String,Object> inParam,String marketCaseId)throws StrategyError;
	
/*	*//**
	 * 添加批量下发营销案状态到缓存
	* @date: 2016-9-29 
	* @author: wangth
	* @Title: addMarketCaseTaskStatusCodeToCache 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	public void addBatchPushTaskStatusCodeToCache(Map<String,Object> inParam) throws StrategyError;*/
	
	/**
	 * 加载渠道触发营销案信息到缓存
	* @date: 2016-11-21 
	* @author: yangwl
	* @title: addChannelTriggerMarketCaseToCache 
	* @param marketCaseRelCustGroupTypeFormulaCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addChannelTriggerMarketCaseToCache(String regionCode,Map.Entry<String, Object> entry) throws StrategyError;
	
	/**
	 * 加载事件触发营销案
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: addEventTriggerMarketCaseToCache 
	* @param evnetTriggerMarketCaseCache
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addEventTriggerMarketCaseToCache(Map.Entry<String, Object> entry) throws StrategyError;

	/**
	 * 添加营销案基本信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addMarketCaseBasic 
	* @param inParam
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String addMarketCaseBasic(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 添加营销案与客户群的关联关系
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addMarketCaseCustGroupRelation 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addMarketCaseCustGroupRelation(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 添加营销案与渠道的关联关系
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addMarketCaseChannelRelation 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addMarketCaseChannelRelation(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 添加营销案与内容的关联关系
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addMarketCaseContentRelation 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addMarketCaseContentRelation(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 添加营销案详细信息
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addMarketCaseDetail 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_authoaddBatchPushTaskStatusCodeToCacher: update_note:
	 */
	public String addMarketCaseDetail(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 添加营销案与事件的关联关系
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addMarketCaseEventRelation 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addMarketCaseEventRelation(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 添加营销案与运营位的关联关系
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addMarketCasePositionRelation 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addMarketCasePositionRelation(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 添加营销案和产商品关联关系
	* @date: 2016-10-12 
	* @author: wangth
	* @Title: addMarketCaseProductCommodityRelation 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addMarketCaseProductCommodityRelation(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 添加营销案与规则的关联关系
	* @date: 2016-10-1 
	* @author: wangth
	* @Title: addMarketCaseRuleRelation 
	* @param inParam
	* @param tempInParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addMarketCaseRuleRelation(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 从关系中获取渠道ID
	* @date: 2016-10-17 
	* @author: sunliang 
	* @title: getChannelIdFromMarketCaseRel 
	* @param tempInParam
	* @param marketCaseRelMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> getChannelIdFromMarketCaseRel(Map<String,Object> tempInParam,Map<String,Object> marketCaseRelMap) throws StrategyError;
	
	/**
	 * 从缓存查询渠道任务的营销案下的目标客户群类型和目标客户群标签表达式
	* @date: 2016-10-12 
	* @author: yangwl
	* @title: getChannelTaskMarketCaseLabelFormulaFromCache 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Map<String, String>> getChannelTaskMarketCaseLabelFormulaFromCache() throws StrategyError;
	
	/**
	 * 根据组件ID返回内容
	* @date: 2016-9-16 
	* @author: sunliang 
	* @title: getContentMapByComponentId 
	* @param componentId
	* @param marketCaseCachePojo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> getContentMapByComponentId(Map<String,Object> inParam,String componentId,IMarketCaseCachePojo marketCaseCachePojo,String positionId) throws StrategyError;

	/**
	 * 
	* @date: 2017-2-26 
	* @author: sunliang 
	* @title: getContentMapByComponentIdByEvent 
	* @param inParam
	* @param componentId
	* @param marketCaseCachePojo
	* @param positionId
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> getContentMapByComponentIdByEvent(Map<String,Object> inParam,String componentId,IMarketCaseCachePojo marketCaseCachePojo,String positionId) throws StrategyError;
	
	/**
	 * 根据基于内容的组件ID获取目标客户群ID
	* @date: 2016-9-16 
	* @author: sunliang 
	* @title: getCustGroupIdByComponentIdBaseContent 
	* @param componentIdBaseContent
	* @param marketCaseCachePojo
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,List<String>> getCustGroupIdByComponentIdBaseContent(String componentIdBaseContent,IMarketCaseCachePojo marketCaseCachePojo) throws StrategyError;
	
	/**
	 * 根据组件id返回营销案基本信息
	* @date: 2016-9-20 
	* @author: zhaoyue
	* @title: getMarketCaseBasicMapByComponentId 
	* @param componentId
	* @param marketCaseCachePojo
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> getMarketCaseBasicMapByComponentId(String componentId,IMarketCaseCachePojo marketCaseCachePojo) throws StrategyError;
	
	/**
	 * 获取统计报表营销案详情
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: getStatisticsMarketCaseDetail 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getStatisticsMarketCaseDetail(Map<String, Object> inParam) throws StrategyError;
	
	
	/**
	 * 营销案权限操作
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: marketCasePermissionOperById 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void marketCasePermissionOperById(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 
	* @date: 2016-12-30 
	* @author: sunliang 
	* @title: parseMarketCaseCache 
	* @param marketCaseDetailPojoMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,IMarketCaseCachePojo> parseMarketCaseCache(Map<String,IMarketCaseDetailPojo> marketCaseDetailPojoMap) throws StrategyError;
	
	/**
	 * 解析缴费事件ID和营销案ID关系
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: getMarketCaseIdByEventId 
	* @param eventIdList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> parsePayFeeEventIdAndMarketCaseIdRel(List<Map<String,Object>> eventIdList) throws StrategyError;
	
	/**
	 * 根据营销案Id查询渠道Id
	* @date: 2016-10-12 
	* @author: wangth
	* @Title: queryChannelIdByMarketCaseId 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> queryChannelIdByMarketCaseId(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;

	/**
	 * 查询营销案基本信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryMarketCaseBasicById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseBasicById(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;

	/**
	 * 查询营销案信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryMarketCaseById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseById(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 通过事件ID查询营销案ID
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: queryMarketCaseIDByEventID 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<String> queryMarketCaseIDByEventID(Map<String, Object> tempInParam) throws StrategyError;

	/**
	 * 查询营销案详细信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryMarketCaseDetail 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<IMarketCaseDetailPojo> queryMarketCaseDetail(Map<String, Object> inParam,IQueryFilter queryFilter, ISortParamer sortParamer) throws StrategyError;

	/**
	 * 通过Id查询营销案详细信息（整个营销案的状态，操作时间等）
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryMarketCaseDetailById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IMarketCaseDetailPojo queryMarketCaseDetailById(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;

	/**
	 * 查询营销案详细信息
	* @date: 2016-11-6 
	* @author: sunliang 
	* @title: queryMarketCaseDetailForMap 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,IMarketCaseDetailPojo> queryMarketCaseDetailForMap(Map<String,Object> tempInParam) throws StrategyError;

	/**
	 * 查询营销案ID列表
	* @date: 2016-11-7 
	* @author: sunliang 
	* @title: queryMarketCaseIdList 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> queryMarketCaseIdList(Map<String,Object> tempInParam) throws StrategyError;

	/**
	 *  查询营销案列表
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryMarketCaseList 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryMarketCaseList(Map<String,Object> inParam,IQueryFilter queryFilter, ISortParamer sortParamer) throws StrategyError;
	
	/**
	 * 查询营销案列表(临时，使用tempInParam作为入参，功能与queryMarketCaseList一样，只是入参不同)
	* @date: 2016-12-30 
	* @author: sunliang 
	* @title: queryMarketCaseList 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryMarketCaseList(Map<String,Object> tempInParam) throws StrategyError;
	

	/**
	 * 根据权限查询营销案列表
	* @date: 2017-1-5 
	* @author: yuanchun
	* @title: queryMarketCaseListByPage
	* @param inParam
	* @param queryFilter
	* @param start
	* @param limit
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryMarketCaseListByPage(Map<String, Object> inParam, IQueryFilter queryFilter, int start,int limit)throws StrategyError;
	
	/**
	 * 查询营销案统计列表
	* @date: 2017-4-17 
	* @author: yuanchun
	* @title: queryMarketCaseReportFormList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryMarketCaseReportFormList(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 优先级主页面查询列表
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: queryPriorityConfigList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryPriorityConfigList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
/*	*//**
	 * 恢复批量push营销案时从缓存中移除数据
	* @date: 2016-9-29 
	* @author: wangth
	* @Title: removeMarketCaseTaskStatusCodeToCache 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	public void removeBatchPushTaskStatusCodeFromCache(Map<String,Object> inParam) throws StrategyError;*/
	
	/**
	 * 移除营销案信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: removeMarketCaseById 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeMarketCaseById(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 根据Id删除营销案基本信息
	* @date: 2016-10-17 
	* @author: zhangjj_crmpd
	* @title: removeMarketCaseBasicById 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeMarketCaseBasicById(Map<String, Object> inParam);

	/** 删除营销案客户群关系
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: removeMarketCaseCustGroupRelation 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void removeMarketCaseCustGroupRelation(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 根据Id删除营销案详细信息
	* @date: 2016-10-17 
	* @author: zhangjj_crmpd
	* @title: removeMarketCaseDetailById 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeMarketCaseDetailById(Map<String, Object> inParam) throws StrategyError;

	/**
	 * 更新营销案
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: updateMarketCaseBasicById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateMarketCaseBasicById(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 根据模板修改营销案详细信息
	* @date: 2016-11-15 
	* @author: tangaq
	* @title: updateMarketCaseDetailByTempalte 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateMarketCaseDetailByTempalte(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 更新进程表中营销案的状态
	* @date: 2017-3-10 
	* @author: zhangjj_crmpd
	* @title: updateMarketCaseShellProcess 
	* @param tempInParam
	* @param countParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateMarketCaseShellProcessByCustGroupId(Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError;

	/**
	 * 更新营销案状态
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: updateMarketCaseStatusById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateMarketCaseStatusById(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 生成批量发送任务营销案缓存意外终止队列恢复
	* @date: 2017-5-4 
	* @author: chenhao
	* @title: MarketCaseRpoplpushRecover  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void MarketCaseRpoplpushRecover(String taskType) throws StrategyError;
	
}
