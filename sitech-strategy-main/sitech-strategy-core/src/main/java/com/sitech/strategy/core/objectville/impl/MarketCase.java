package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.sitech.strategy.common.pojo.impl.MarketCaseDetailPojo;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseDetailPojo;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IAttach;
import com.sitech.strategy.core.objectville.inter.IAudit;
import com.sitech.strategy.core.objectville.inter.IChannel;
import com.sitech.strategy.core.objectville.inter.IContent;
import com.sitech.strategy.core.objectville.inter.ICustGroup;
import com.sitech.strategy.core.objectville.inter.IEvent;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.objectville.inter.IPosition;
import com.sitech.strategy.core.objectville.inter.IProductCommodity;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 营销案对象
* @date: 2016-12-9 
* @author: wangth
* @Title: MarketCase 
* @version 1.0 
* @Description：
* update_version: update_date: update_author: update_note:
 */
public class MarketCase extends BaseClass implements IMarketCase, Serializable {
	
	/**
	 * 添加参数处理内部类
	 */
	protected AddParamSettle addParamSettle = new AddParamSettle();
	/**
	 * 附件对象
	 */
	protected IAttach attach;
	/**
	 * 审批对象
	 */
	protected IAudit audit;
	/**
	 * 内容对象
	 */
	protected IContent content;
	/**
	 * 客户群对象
	 */
	protected ICustGroup custGroup;
	/**
	 * 触点对象
	 */
	protected IChannel channel;
	/**
	 * 事件对象
	 */
	protected IEvent event;
	/**
	 * 事件查询对象
	 */
	protected IDataSelector.IEventSelector eventSelector;
	/**
	 * 营销案删除对象
	 */
	protected IDataDeleter.IMarketCaseDeleter marketCaseDeleter;
	/**
	 * 营销案明细对象
	 */
	protected IMarketCaseDetailPojo marketCaseDetailPojo;
	/**
	 * 营销案插入对象
	 */
	protected IDataInsertor.IMarketCaseInsertor marketCaseInsertor;
	/**
	 * 营销案查询对象
	 */
	protected IDataSelector.IMarketCaseSelector marketCaseSelector;
	/**
	 * 营销案修改对象
	 */
	protected IDataUpdater.IMarketCaseUpdater marketCaseUpdater;
	/**
	 * 运营位对象
	 */
	protected IPosition position;
	/**
	 * 优先级列表对象
	 */
	protected IDataSelector.IPrioritySelector prioritySelector;
	/**
	 * 产商品对象
	 */
	protected IProductCommodity productCommodity;
	/**
	 * 查询参数处理内部类
	 */
	protected QueryParamSettle queryParamSettle = new QueryParamSettle();
	/**
	 * 关系删除对象
	 */
	protected IDataDeleter.IRelationDeleter relationDeleter;
	/**
	 * 规则对象
	 */
	protected IRule rule;
	/**
	 * 系统处理数据更新对象
	 */
	protected IDataUpdater.ISystemDealUpdater systemDealUpdater;

	/** 
	 * @date: 2016-11-10 
	 * @author: xiongxq
	 * @Title: setAddParamSettle 
	 * @param addParamSettle the addParamSettle to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setAddParamSettle(AddParamSettle addParamSettle) {
		this.addParamSettle = addParamSettle;
	}

	/** 
	 * @date: 2016-11-10 
	 * @author: xiongxq
	 * @Title: setAttach 
	 * @param attach the attach to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setAttach(IAttach attach) {
		this.attach = attach;
	}

	/**
	 * 
	* @date: 2016-9-27 
	* @author: wangth
	* @Title: setAudit 
	* @param audit 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAudit(IAudit audit) {
		this.audit = audit;
	}

	/**
	 * 
	* @date: 2016-9-7 
	* @author: wangth
	* @Title: setChannel 
	* @param channel 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannel(IChannel channel) {
		this.channel = channel;
	}

	/**
	 * 
	* @date: 2016-9-7 
	* @author: wangth
	* @Title: setContent 
	* @param content 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setContent(IContent content) {
		this.content = content;
	}

	/**
	 * 
	* @date: 2016-9-7 
	* @author: wangth
	* @Title: setCustGroup 
	* @param custGroup 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroup(ICustGroup custGroup) {
		this.custGroup = custGroup;
	}
	
	/**
	 * 
	* @date: 2016-9-12 
	* @author: wangth
	* @Title: setEvent 
	* @param event 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEvent(IEvent event) {
		this.event = event;
	}
	
	/**
	 * 
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: setEventSelector 
	* @param eventSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventSelector(IDataSelector.IEventSelector eventSelector) {
		this.eventSelector = eventSelector;
	}

	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setMarketCaseDeleter 
	* @param marketCaseDeleter 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseDeleter(
			IDataDeleter.IMarketCaseDeleter marketCaseDeleter) {
		this.marketCaseDeleter = marketCaseDeleter;
	}

	/** 
	 * @date: 2016-11-10 
	 * @author: xiongxq
	 * @Title: setMarketCaseDetailPojo 
	 * @param marketCaseDetailPojo the marketCaseDetailPojo to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setMarketCaseDetailPojo(IMarketCaseDetailPojo marketCaseDetailPojo) {
		this.marketCaseDetailPojo = marketCaseDetailPojo;
	}

	/**
	 * 
	* @date: 2016-9-12 
	* @author: wangth
	* @Title: setMarketCaseDetailPojo 
	* @param marketCaseDetailPojo 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseDetailPojo(MarketCaseDetailPojo marketCaseDetailPojo) {
		this.marketCaseDetailPojo = marketCaseDetailPojo;
	}

	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setMarketCaseInsertor 
	* @param marketCaseInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseInsertor(
			IDataInsertor.IMarketCaseInsertor marketCaseInsertor) {
		this.marketCaseInsertor = marketCaseInsertor;
	}

	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setMarketCaseSelector 
	* @param marketCaseSelector 
	* @version 1.0 
	* @Description: 
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
	* @Title: setMarketCaseUpdater 
	* @param marketCaseUpdater 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseUpdater(
			IDataUpdater.IMarketCaseUpdater marketCaseUpdater) {
		this.marketCaseUpdater = marketCaseUpdater;
	}

	/**
	 * 
	* @date: 2016-9-7 
	* @author: wangth
	* @Title: setPosition 
	* @param position 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPosition(IPosition position) {
		this.position = position;
	}
	
	/**
	 * 
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: setPrioritySelector 
	* @param prioritySelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPrioritySelector(IDataSelector.IPrioritySelector prioritySelector) {
		this.prioritySelector = prioritySelector;
	}

	/**
	 * 
	* @date: 2016-10-12 
	* @author: wangth
	* @Title: setProductCommodity 
	* @param productCommodity 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setProductCommodity(IProductCommodity productCommodity) {
		this.productCommodity = productCommodity;
	}

	/** 
	 * @date: 2016-11-10 
	 * @author: xiongxq
	 * @Title: setQueryParamSettle 
	 * @param queryParamSettle the queryParamSettle to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setQueryParamSettle(QueryParamSettle queryParamSettle) {
		this.queryParamSettle = queryParamSettle;
	}

	/**
	 * 
	* @date: 2016-10-21 
	* @author: zhangjj_crmpd
	* @title: setRelationDeleter 
	* @param relationDeleter 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRelationDeleter(IDataDeleter.IRelationDeleter relationDeleter) {
		this.relationDeleter = relationDeleter;
	}

	/**
	 * 
	* @date: 2016-9-7 
	* @author: wangth
	* @Title: setRule 
	* @param rule 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRule(IRule rule) {
		this.rule = rule;
	}

	/**
	 * 
	* @date: 2016-12-30 
	* @author: sunliang 
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
	 * 保存附件上传
	* @date: 2016-11-14 
	* @author: xiongxq
	* @Title: addAttach 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addAttach(Map<String,Object> inParam,String marketCaseId) throws StrategyError {
		List<Map<String,Object>> inList = this.addAttachSettleParam(inParam,marketCaseId);
		attach.addBatchAttach(inList);
	}
	
/*	*//**
	 * 加载批量push营销案下发状态到缓存中
	* @date: 2016-9-29 
	* @author: wangth
	* @Title: addMarketCaseTaskStatusCodeToCache 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	@Override
	public void addBatchPushTaskStatusCodeToCache(Map<String, Object> inParam)
			throws StrategyError {
		
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		for(Entry<String, Object> entry:inParam.entrySet()){
			tempInParam.put("key", Const.CACHE_DATATYPE_MARKETCASE_RECOMMENDSTATUS +entry.getKey());
			tempInParam.put("value", (String) entry.getValue());
		}
		marketCaseInsertor.addBatchPushTaskStatusCodeToCache(inParam,tempInParam);
	}*/
	
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
	@Override
	public void addChannelTriggerMarketCaseToCache(String regionCode,Entry<String, Object> entry)
			throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("regionCode", regionCode);
		tempInParam.put("positionId", entry.getKey());
		tempInParam.put("channelTriggerMarketCaseCache", (List<Map<String, Object>>)entry.getValue());
		marketCaseInsertor.addChannelTriggerMarketCaseToCache(tempInParam);	
	}
	
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
	@Override
	public void addEventTriggerMarketCaseToCache(Entry<String, Object> entry)
			throws StrategyError {
		String key = entry.getKey();
		List<Map<String, Object>> value = (List<Map<String, Object>>)entry.getValue();
		
		Map<String, Object> tempParam = new HashMap<String, Object>();
		tempParam.put("event", key);
		tempParam.put("marketCase", value);
		
		marketCaseInsertor.addEventTriggerMarketCaseToCache(tempParam);
	}

	/**
	 *  添加营销案基本信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: addMarketCaseBasic 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String addMarketCaseBasic(Map<String,Object> inParam) throws StrategyError {
		Map<String,Object> marketCaseBasicMap = addParamSettle.marketCaseBasicSettleParam(inParam);
		marketCaseInsertor.insertMarketCase(inParam,marketCaseBasicMap);
		String marketCaseId = (String) marketCaseBasicMap.get("marketCaseId");
		return marketCaseId;
	}

	/**
	 * 添加营销案与渠道的关联关系
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: addMarketCaseChannelRelation 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addMarketCaseChannelRelation(
			Map<String, Object> inParam) throws StrategyError {
		marketCaseInsertor.insertRelationInfo(inParam);
	}

	/**
	 * 添加营销案与内容的关联关系
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: addMarketCaseContentRelation 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addMarketCaseContentRelation(
			Map<String, Object> inParam) throws StrategyError {
		marketCaseInsertor.insertRelationInfo(inParam);
	}
	
	/**
	 * 添加营销案与客户群的关联关系
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: addMarketCaseCustGroupRelation 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addMarketCaseCustGroupRelation(
			Map<String, Object> inParam) throws StrategyError {
		marketCaseInsertor.insertRelationInfo(inParam);
	}

	/**
	 * 保存营销案的详细信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: addMarketCaseDetail 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String addMarketCaseDetail(Map<String,Object> inParam) throws StrategyError {
		Map<String,Object> marketCaseMap = (Map<String, Object>) inParam.get("marketCaseBasic");
		if(!CommonUtils.objectIsNull(marketCaseMap.get("marketCaseId"))){
			String marketCaseId = marketCaseMap.get("marketCaseId").toString();
			Map<String, Object> inMap = new HashMap<String, Object>();
			inMap.put("marketCaseId", marketCaseId);
			updateMarketCaseBasicById(marketCaseMap);
			removeMarketCaseDetailById(inMap);
			saveDetail(marketCaseId,(Map<String, Object>) inParam.get("marketCaseDetail"));
			return marketCaseId;
		}
		String marketCaseId = this.addSettleMarketCaseParam(inParam);
		List<Map<String,Object>> inList = (List<Map<String,Object>>)inParam.get("fileMap");
		if( inList != null && inList.size()>0  ){
			addAttach(inParam,marketCaseId);
		}
		return marketCaseId;
	}

	/**
	 * 添加营销案与事件的关联关系
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: addMarketCaseEventRelation 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addMarketCaseEventRelation(
			Map<String, Object> inParam) throws StrategyError {
		marketCaseInsertor.insertRelationInfo(inParam);
	}

	/**
	 * 添加营销案与运营位的关联关系
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: addMarketCasePositionRelation 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addMarketCasePositionRelation(
			Map<String, Object> inParam) throws StrategyError {
		marketCaseInsertor.insertRelationInfo(inParam);
	}
	
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
	@Override
	public void addMarketCaseProductCommodityRelation(Map<String, Object> inParam) throws StrategyError {
		marketCaseInsertor.insertRelationInfo(inParam);
	}
	
	/**
	 * 添加营销案与规则的关联关系
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: addMarketCaseRuleRelation 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addMarketCaseRuleRelation(
			Map<String, Object> inParam) throws StrategyError {
		marketCaseInsertor.insertRelationInfo(inParam);
	}
	
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
	public Map<String,Object> getChannelIdFromMarketCaseRel(Map<String,Object> tempInParam,Map<String,Object> marketCaseRelMap) throws StrategyError {
		Map<String,Object> marketCaseDetailRelMap = (Map<String,Object>)marketCaseRelMap.get(tempInParam.get("marketCaseId"));
		Map<String,Object> custGroupRelMap = (Map<String,Object>)((Map<String,Object>)marketCaseDetailRelMap.get(Const.COMPONENT_TYPE_CUSTGROUP)).get(tempInParam.get("custGroupId"));
		Map<String,Object> channelRelMap = (Map<String,Object>)custGroupRelMap.get(Const.COMPONENT_TYPE_CHANNEL);
		
		return channelRelMap;
	}
	
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
	 * @return 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Map<String, String>> getChannelTaskMarketCaseLabelFormulaFromCache() throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("key", Const.CACHE_DATATYPE_MARKETCASE_CHANNELTASK_WAITCREATE);
		tempInParam.put("direction", "");
		return marketCaseSelector.getChannelTaskMarketCaseLabelFormulaFromCache(tempInParam);
		
	}
	
	/**
	 * 根据组件ID返回内容
	* @date: 2016-9-16 
	* @author: sunliang 
	* @title: getContentMapByComponentId 
	* @param componentId
	* @param marketCaseCachePojo
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> getContentMapByComponentId(Map<String,Object> inParam,String componentId,
			IMarketCaseCachePojo marketCaseCachePojo,String positionId) throws StrategyError {
		
		Map<String,Object> marketCaseRel = marketCaseCachePojo.getMarketCaseRel();
		String marketCaseId = (String)(marketCaseCachePojo.getMarketCaseMap()).get("marketCaseId");
		Map<String, Object> marketCaseInfoRel = (Map<String, Object>)((Map<String, Object>)marketCaseRel.get(Const.COMPONENT_TYPE_MARKETCASE)).get(marketCaseId);
		Map<String,Object> marketCaseContent = marketCaseCachePojo.getContentMap();
		Map<String,Object> channelMap = (Map<String,Object>)((Map<String,Object>)marketCaseInfoRel.get(Const.COMPONENT_TYPE_CUSTGROUP)).get(componentId);
		Map<String,Object> positionMap = (Map<String,Object>)((Map<String,Object>)channelMap.get(Const.COMPONENT_TYPE_CHANNEL)).get((String)inParam.get("channelId"));
		Map<String,Object> contentMap =(Map<String,Object>)((Map<String,Object>)positionMap.get(Const.COMPONENT_TYPE_POSITION)).get(positionId);
		List<String> contentIdList = new ArrayList<String>();
		Map<String,Object> marketCaseMap = new HashMap<String,Object>();
		if(!CommonUtils.objectIsNull(contentMap)){
			contentIdList = (List<String>)contentMap.get(Const.COMPONENT_TYPE_CONTENT);
			marketCaseMap.put("marketCaseContent", marketCaseContent.get(contentIdList.get(0)));
			marketCaseMap.put("contentId",contentIdList.get(0));
		}
		
		return marketCaseMap;
	}
	
	/**
	 * 根据组件ID返回内容
	* @date: 2016-9-16 
	* @author: sunliang 
	* @title: getContentMapByComponentIdByEvent 
	* @param componentId
	* @param marketCaseCachePojo
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> getContentMapByComponentIdByEvent(Map<String,Object> inParam,String componentId,
			IMarketCaseCachePojo marketCaseCachePojo,String positionId) throws StrategyError {
		
		Map<String,Object> marketCaseRel = marketCaseCachePojo.getMarketCaseRel();
		log.debug("getContentMapByComponentId.marketCaseRel()", marketCaseRel);
		String marketCaseId = (String)(marketCaseCachePojo.getMarketCaseMap()).get("marketCaseId");
		log.debug("getContentMapByComponentId.marketCaseId", marketCaseId);
		Map<String, Object> marketCaseInfoRel = (Map<String, Object>)((Map<String, Object>)marketCaseRel.get(Const.COMPONENT_TYPE_MARKETCASE)).get(marketCaseId);
		log.debug("getContentMapByComponentId.marketCaseInfoRel", marketCaseInfoRel);
		Map<String,Object> marketCaseContent = marketCaseCachePojo.getContentMap();
		log.debug("getContentMapByComponentId.marketCaseContent", marketCaseContent);
		Map<String,Object> eventMap = (Map<String,Object>)((Map<String,Object>)marketCaseInfoRel.get(Const.COMPONENT_TYPE_CUSTGROUP)).get(componentId);
		log.debug("getContentMapByComponentId.eventMap", eventMap);
		log.debug("getContentMapByComponentId.(String)inParam.get(eventId)", (String)inParam.get("eventId"));
		Map<String,Object> positionMap = (Map<String,Object>)((Map<String,Object>)eventMap.get(Const.COMPONENT_TYPE_EVENT)).get((String)inParam.get("eventId"));
		log.debug("getContentMapByComponentId.positionMap", positionMap);
		log.debug("getContentMapByComponentId.positionId", positionId);
		Map<String,Object> contentMap =(Map<String,Object>)((Map<String,Object>)positionMap.get(Const.COMPONENT_TYPE_POSITION)).get(positionId);
		log.debug("getContentMapByComponentId.contentMap", contentMap);
		List<String> contentIdList = new ArrayList<String>();
		Map<String,Object> marketCaseMap = new HashMap<String,Object>();
		if(!CommonUtils.objectIsNull(contentMap)){
			contentIdList = (List<String>)contentMap.get(Const.COMPONENT_TYPE_CONTENT);
			marketCaseMap.put("marketCaseContent", marketCaseContent.get(contentIdList.get(0)));
			marketCaseMap.put("contentId",contentIdList.get(0));
		}
		log.debug("getContentMapByComponentId.marketCaseMap", marketCaseMap);
		return marketCaseMap;
	}
	
	/**
	 * 根据基于内容的组件ID获取目标客户群ID
	* @date: 2016-9-15 
	* @author: sunliang 
	* @title: getCustGroupIdByComponentIdBaseContent 
	* @param ComponentIdBaseContent
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Map<String,List<String>> getCustGroupIdByComponentIdBaseContent(
			String componentIdBaseContent,IMarketCaseCachePojo marketCaseCachePojo) throws StrategyError {
		//componentIdBaseContent是custGroupId
		Map<String,List<String>> custGroupKindMap = new HashMap<String,List<String>>();
		Map<String,Object> custGroupMap = marketCaseCachePojo.getCustGroupMap();
		log.debug("===========getCustGroupIdByComponentIdBaseContent=====custGroupMap=====", custGroupMap);

		String custGroupId = componentIdBaseContent;
		Map<String,Object> custGroupAttrMap = (Map<String,Object>)custGroupMap.get(custGroupId);
		//得到custGroupId和custGroupType
		String custGroupType = (String)custGroupAttrMap.get("custGroupType");
		
		List<String> custGroupIdList = new ArrayList<String>();
		custGroupIdList.add(custGroupId);
		
		custGroupKindMap.put(custGroupType, custGroupIdList);
		return custGroupKindMap;
	}

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
	@Override
	public Map<String, Object> getMarketCaseBasicMapByComponentId(
			String componentId, IMarketCaseCachePojo marketCaseCachePojo)
			throws StrategyError {
		
		Map<String,Object> marketCaseMap = new HashMap<String,Object>();
		Map<String,Object> marketCaseBasic = (Map<String,Object>)marketCaseCachePojo.getMarketCaseMap();
		marketCaseMap.put("marketCaseBasic", marketCaseBasic);
		return marketCaseMap;
	}
	
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
	public Map<String, Object> getStatisticsMarketCaseDetail(Map<String, Object> inParam) throws StrategyError{
		//查询统计报表营销案详情入参处理
		IQueryFilter queryFilter = queryParamSettle.settleStatisticsMarketCaseDetailFilter(inParam);
		//查询统计报表营销案详情
		Map<String, Object> marketCaseBasicMap = this.queryMarketCaseBasicById(inParam,queryFilter);
		//查询统计报表营销案详情出参处理
		Map<String, Object> outParam = addParamSettle.settleStatisticsMarketCaseDetailOutParam(inParam,marketCaseBasicMap);
		
		return outParam;
	}
	
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
	@Override
	public void marketCasePermissionOperById(Map<String,Object> inParam) throws StrategyError{
		Map<String, Object> tempInParam = inParam;
		tempInParam.put("updateTime", new Date());
		marketCaseUpdater.updateMarketCase(tempInParam);
	}
	
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
	@Override
	public Map<String, IMarketCaseCachePojo> parseMarketCaseCache(
			Map<String, IMarketCaseDetailPojo> marketCaseDetailPojoMap)
			throws StrategyError {
		
		Map<String,IMarketCaseCachePojo>  MarketCaseCachePojoMap = new HashMap<String,IMarketCaseCachePojo>();
		
		for(Map.Entry<String,IMarketCaseDetailPojo> m : marketCaseDetailPojoMap.entrySet()){
			String marketCaseId = m.getKey();
			IMarketCaseDetailPojo marketCaseDetailPojoTmp = m.getValue();
			IMarketCaseCachePojo marketCaseCachePojoTmp  = marketCaseDetailPojoTmp.toMarketCaseCachePojo(marketCaseDetailPojoTmp.getDetailMap());
			MarketCaseCachePojoMap.put(marketCaseId, marketCaseCachePojoTmp);
		}
		return MarketCaseCachePojoMap;
	}
	
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
	@Override
	public List<Map<String, Object>> parsePayFeeEventIdAndMarketCaseIdRel(
			List<Map<String,Object>> eventIdList) throws StrategyError {
		List<Map<String,Object>> retList = new ArrayList<Map<String,Object>>();
		Map<String,Object> tempParam = new HashMap<String,Object>();
		for(Map<String,Object> eventIdMap : eventIdList){
			tempParam.put("eventId", eventIdMap.get("eventId"));
			log.debug("parsePayFeeEventIdAndMarketCaseIdRel.eventId", tempParam);
			List<Map<String,Object>> eventIdAndMarketCaseId = marketCaseSelector.selectMarketCaseIdByEventId(tempParam);
			log.debug("parsePayFeeEventIdAndMarketCaseIdRel.eventIdAndMarketCaseId", eventIdAndMarketCaseId);
			for(Map<String,Object> m : eventIdAndMarketCaseId){
				Map<String,Object> map = new HashMap<String,Object>();
				map.put((String)m.get("eventId"), m.get("marketCaseId"));
				retList.add(map);
			}
		}
		
		return retList;
	}
	
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
	@Override
	public Map<String,Object> queryMarketCaseBasicById(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		Map<String,Object> marketCaseBasicMap = new HashMap<String,Object>();
		List<Map<String,Object>> marketCaseList = (List<Map<String,Object>>)marketCaseSelector.selectMarketCaseList(inParam,queryFilter);
		if(!CommonUtils.objectIsNull(marketCaseList)){
			marketCaseBasicMap=marketCaseList.get(0);
			
		}
		log.debug("queryMarketCaseBasicById.marketCaseBasicMap", marketCaseBasicMap);
		return marketCaseBasicMap;
	}
	
	/**
	 * 查询营销案信息（整个营销案的状态，操作时间等）
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryMarketCaseById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Map<String, Object> queryMarketCaseById(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		Map<String,Object> marketCaseMap = (Map<String, Object>) marketCaseSelector.selectMarketCaseList(inParam,queryFilter);
		return marketCaseMap;
	}
	
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
	@Override
	public List<String> queryMarketCaseIDByEventID(
			Map<String, Object> tempInParam) throws StrategyError {
		String regionCode = (String) tempInParam.get("regionCode");
		String eventID = (String) tempInParam.get("eventID");
		Map<String, Object> tempParam = new HashMap<String, Object>();
		List<String> marketCaseIDList = new ArrayList<String>();
		try {
			tempInParam.put("key", Const.CACHE_DATATYPE_MARKETCASE_EVENTTRIGGER);
			if (null != regionCode && null != eventID) {
				tempInParam.put("key", Const.CACHE_DATATYPE_MARKETCASE_EVENTTRIGGER+regionCode+Const.SEPARATOR_COLON+eventID);
			}
			tempInParam.put("start", "0");
			tempInParam.put("end", "-1");
			tempInParam.put("direction", "1");
			marketCaseIDList = eventSelector.selectEventIdByProdIdFromCache(tempParam);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
		return marketCaseIDList;
	}

	/**
	 * 查询营销案列表详细信息(每一条list里面的详细信息)
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryMarketCaseDetail 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<IMarketCaseDetailPojo> queryMarketCaseDetail(Map<String, Object> inParam,IQueryFilter queryFilter,ISortParamer sortParamer) throws StrategyError {
		List<Map<String,Object>> marketCaseList = this.queryMarketCaseList( inParam, queryFilter,sortParamer);
		List<IMarketCaseDetailPojo> marketCasePojoList = new ArrayList<IMarketCaseDetailPojo>();
		//根据Id查询营销案详细信息
		for(Map<String,Object> pojoMap:marketCaseList){
			IQueryFilter queryFilterInfo = new QueryFilter();
			queryFilterInfo.setMarketCaseId((String)pojoMap.get("marketCaseId"));
			marketCaseDetailPojo = this.queryMarketCaseDetailById(inParam,queryFilterInfo);
			marketCasePojoList.add(marketCaseDetailPojo);
		}
		return marketCasePojoList;
	}
	
	/**
	 * 查询营销案详细信息,返回map结构
	* @date: 2016-11-6 
	* @author: sunliang 
	* @title: queryMarketCaseDetailForMap 
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,IMarketCaseDetailPojo> queryMarketCaseDetailForMap(Map<String,Object> tempInParam) throws StrategyError {
		
		List<Map<String,Object>> marketCaseIdList = this.queryMarketCaseIdList(tempInParam);
		Map<String,IMarketCaseDetailPojo> marketCaseMap = new HashMap<String,IMarketCaseDetailPojo>();
		log.info("queryMarketCaseDetailForMapmarketCaseList.marketCaseIdList", marketCaseIdList);
		
		//根据Id查询营销案详细信息
		for(Map<String,Object> marketCaseIdMap : marketCaseIdList){
			IQueryFilter queryFilterInfo = new QueryFilter();
			String marketCaseId = (String)marketCaseIdMap.get("marketCaseId");
			log.info("queryMarketCaseDetailForMapmarketCaseList.marketCaseId", marketCaseId);
			queryFilterInfo.setMarketCaseId(marketCaseId);
			IMarketCaseDetailPojo marketCaseDetailPojo = this.queryMarketCaseDetailById(null,queryFilterInfo);
			log.info("queryMarketCaseDetailForMapmarketCaseList.marketCaseDetailPojo.getMarketCaseId()", marketCaseDetailPojo.getMarketCaseId());
			log.info("queryMarketCaseDetailForMapmarketCaseList.marketCaseDetailPojo.getDetailMap()", marketCaseDetailPojo.getDetailMap());
			marketCaseMap.put(marketCaseId, marketCaseDetailPojo);
		}
		return marketCaseMap;
	}

	/**
	 *查询营销案详细信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryMarketCaseDetailById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IMarketCaseDetailPojo queryMarketCaseDetailById(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		Map<String,Object> marketCaseMap = new HashMap<String,Object>();
		IMarketCaseDetailPojo marketCaseDetailPojo = new MarketCaseDetailPojo();
		
		marketCaseMap.put("marketCaseBasic",(Map<String,Object>) this.queryMarketCaseBasicById(inParam,queryFilter));
		marketCaseMap.put("marketCaseDetail", (Map<String,Object>)this.queryMarketCasePacketParam(inParam,queryFilter));
		
		marketCaseDetailPojo.setMarketCaseId(queryFilter.getMarketCaseId());
		marketCaseDetailPojo.setDetailMap(marketCaseMap);
		
		return marketCaseDetailPojo;
	}
	
	/**
	 * 查询营销案列表
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryMarketCaseList 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String,Object>> queryMarketCaseList(Map<String,Object> inParam,IQueryFilter queryFilter, ISortParamer sortParamer) throws StrategyError {
		List<Map<String,Object>> marketCaseList = new ArrayList<Map<String, Object>>();
		marketCaseList = marketCaseSelector.selectMarketCaseList(inParam,queryFilter);
		return marketCaseList;
	}
	
	/**
	 * 
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
	@Override
	public List<Map<String,Object>> queryMarketCaseList(Map<String,Object> tempInParam) throws StrategyError {
		List<Map<String,Object>> marketCaseList = new ArrayList<Map<String, Object>>();
		marketCaseList = marketCaseSelector.selectMarketCaseList(tempInParam);
		return marketCaseList;
	}

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
	@Override
	public Map<String, Object> queryMarketCaseListByPage(
			Map<String, Object> inParam, IQueryFilter queryFilter, int start,int limit) throws StrategyError {
		return marketCaseSelector.selectMarketCaseListForPage(queryFilter,start,limit);
	}

	/**
	 * 查询营销案报表统计
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
	@Override
	public Map<String, Object> queryMarketCaseReportFormList(Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> marketCaseReportFormMap = new HashMap<String, Object>();
		//获取执行中的营销案
		Map<String, Object> marketCaseMap = marketCaseSelector.selectMarketCaseReportFormList(inParam);
		List<Map<String,Object>> marketCaseList = (List<Map<String, Object>>) marketCaseMap.get("marketCaseList");
		List<Map<String,Object>> newMarketCaseList = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(marketCaseList)){
			for (Map<String,Object> marketCase :marketCaseList) {
				Map<String,Object> newMarketCaseMap = new HashMap<String, Object>();
				//查询营销案下的目标客户群数和类型
				Map<String, Object> targetCustMap = marketCaseSelector.selectMarketCaseTargetCustCount(marketCase);
				log.debug("queryMarketCaseReportFormList.targetCustMap", targetCustMap);
				
				//查询推荐量      批量01是从服务取，实时02从缓存取
				Map<String, Object> recommendCount = this.queryMarketCaseRecommendCount(marketCase);
				String recommendCountStr = (String) recommendCount.get("recommendCount");
				log.debug("queryMarketCaseReportFormList.recommendCountStr", recommendCountStr);
				
				//查询转化量（取月转化量）
				Map<String, Object> orderCount = this.queryMarketCaseOrderCount(marketCase);
				String orderCountStr = (String) orderCount.get("orderCountByMonth");
				log.debug("queryMarketCaseReportFormList.orderCountStr", orderCountStr);
				
				//计算转化率
				String conversionPercentStr = "0.00";
				if(!(Const.FLASE_INT.equals(recommendCountStr)||Const.FLASE_INT.equals(orderCountStr))){
					int recommendCountInt = Integer.valueOf((String) recommendCountStr);
					int orderCountInt = Integer.valueOf((String) orderCountStr);
					float conversionPercent = ((float)orderCountInt/(float)recommendCountInt)*100;
					DecimalFormat df = new DecimalFormat("0.00000");
					conversionPercentStr = df.format(conversionPercent);
					log.debug("queryMarketCaseReportFormList.conversionPercentStr", conversionPercentStr);
				}
				newMarketCaseMap.put("marketCaseName", marketCase.get("marketCaseName"));
				newMarketCaseMap.put("marketCaseId", marketCase.get("marketCaseId"));
				newMarketCaseMap.put("targetCustCount", targetCustMap.get("targetCustCount"));
				newMarketCaseMap.put("custGroupType", targetCustMap.get("custGroupType"));
				newMarketCaseMap.put("custGroupTypeName", targetCustMap.get("custGroupTypeName"));
				newMarketCaseMap.put("recommendCount",recommendCountStr);
				newMarketCaseMap.put("orderCount", orderCountStr);
				newMarketCaseMap.put("conversionPercent", conversionPercentStr);
				newMarketCaseList.add(newMarketCaseMap);
			}
			marketCaseReportFormMap.put("marketCaseList", newMarketCaseList);
			marketCaseReportFormMap.put("currentPageCode", marketCaseMap.get("currentPageCode"));
			marketCaseReportFormMap.put("perRecordCount", marketCaseMap.get("perRecordCount"));
			marketCaseReportFormMap.put("totalRecordCount", marketCaseMap.get("totalRecordCount"));
		}
		log.debug("queryMarketCaseReportFormList.marketCaseReportFormMap", marketCaseReportFormMap);
		return marketCaseReportFormMap;
	}

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
	@Override
	public List<Map<String, Object>> queryMarketCaseIdList(Map<String,Object> tempInParam) throws StrategyError {
		List<Map<String, Object>> marketCaseIdList = marketCaseSelector.selectMarketCaseIdList(tempInParam);
		return marketCaseIdList;
	}
	
	/**
	 * 查询营销案关系
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: queryMarketCaseRelation 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> queryMarketCaseRelation(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		 List<Map<String,Object>> queryMarketCaseRelationList = (List<Map<String, Object>>) marketCaseSelector.selectRelationList(inParam,queryFilter);
		return queryMarketCaseRelationList;
	}
	
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
	@Override
	public List<Map<String, Object>> queryChannelIdByMarketCaseId(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		queryFilter.setParentComponentId((String)inParam.get("marketCaseId"));
		List<Map<String,Object>> custGroupRelList = (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
		List<Map<String,Object>> channelIdList = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(custGroupRelList)){
			for(Map<String,Object> groupMap:custGroupRelList){
				 queryParamSettle.settleSpliceCustGroupParam(inParam,groupMap, queryFilter);
				 List<Map<String,Object>> channelRelList = (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
				 if(!CommonUtils.objectIsNull(channelRelList)){
					 for(Map<String,Object> channelTemMap:channelRelList){
						    //update by yuanchun 因为查询审批人列表时，需要审批人满足和登录者相同的渠道条件，由于吉林入客户群事件关系时componentId存入的是事件Id，
						 	String channelType = (String) channelTemMap.get("componentType");
						 	String channelId ="";
						 	if (Const.COMPONENT_TYPE_EVENT.equals(channelType)) {
						 		channelId = Const.CHANNEL_ID_EVENT;
							}else{
								channelId = (String) channelTemMap.get("componentId");
							}
							Map<String,Object> channelMap = new HashMap<String,Object>();
							channelMap.put("channelId", channelId);
							channelIdList.add(channelMap);
						}
				   }
			  }
		}
		return channelIdList;
	}
	
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
	@Override
	public List<Map<String, Object>> queryPriorityConfigList(
			Map<String, Object> inParam, IQueryFilter queryFilter)
			throws StrategyError {
		List<Map<String,Object>> list = prioritySelector.selectAreaPriorityRelMarketCaseList(inParam, queryFilter);
		return list;
	}
	
/*	*//**
	 * 批量push暂停恢复时移除缓存中数据
	* @date: 2016-9-29 
	* @author: wangth
	* @Title: removeMarketCaseTaskStatusCodeToCache 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 *//*
	@Override
	public void removeBatchPushTaskStatusCodeFromCache(
			Map<String, Object> inParam) throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		for(Entry<String, Object> entry:inParam.entrySet()){
			tempInParam.put("key", Const.CACHE_DATATYPE_MARKETCASE_RECOMMENDSTATUS +entry.getKey());
		}
		marketCaseDeleter.removeBatchPushTaskStatusCodeFromCache(tempInParam);
		
	}*/

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
	@Override
	public void removeMarketCaseById(Map<String,Object> inParam) throws StrategyError {
		//删除基本信息
		removeMarketCaseBasicById(inParam);
		//删除详细信息
		removeMarketCaseDetailById(inParam);
		
	}

	/**
	 * 根据Id删除营销案详细信息
	* @date: 2016-10-17 
	* @author: zhangjj_crmpd
	* @title: removeMarketCaseDetailById 
	* @param marketCaseId 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeMarketCaseDetailById(Map<String,Object> inParam) throws StrategyError {
		String marketCaseId = inParam.get("marketCaseId").toString();
//		Map<String,Object> in = new HashMap<String,Object>();
//		in.put("componentId", marketCaseId);
//		in.put("relId", "");
		//查询客户群关系
		queryCustGroupRelationById(marketCaseId);
		//查询全局规则关系
		//queryWholeRuleRelation(in);
		//产商品关系
		//removeProductCommodityRelationById(marketCaseId);
	}

	/**
	 * 根据Id删除营销案基本信息
	* @date: 2016-10-17 
	* @author: zhangjj_crmpd
	* @title: removeMarketCaseBasicById 
	* @param marketCaseId 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeMarketCaseBasicById(Map<String,Object> inParam) {
		marketCaseDeleter.deleteMarketCaseById(inParam);
		
	}

	/** 
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
	
	@Override
	public void removeMarketCaseCustGroupRelation(Map<String, Object> inParam)
			throws StrategyError {
		marketCaseDeleter.removeMaketCaseCustGroupRelation(inParam);
		
	}

	/**
	 * 更新营销案基本信息
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: updateMarketCaseBasicById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateMarketCaseBasicById(Map<String,Object> inParam) throws StrategyError {
		marketCaseUpdater.updateMarketCase(inParam);
	}
	
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
	@Override
	public void updateMarketCaseDetailByTempalte(Map<String, Object> inParam)
			throws StrategyError {
		List<Map<String,Object>> custGroupNewList = (List<Map<String,Object>>)inParam.get("relList");
		List<Map<String,Object>> channelList = (List<Map<String,Object>>)inParam.get("channelList");
	
		if(!CommonUtils.objectIsNull(custGroupNewList)){
			for(Map<String,Object> relMap:custGroupNewList){
				String relId = (String)relMap.get("relId");
				String custGroupId = (String)relMap.get("custGroupId");
				Map<String,Object> inMap = new HashMap<String,Object>();
				inMap.put("parentRelId",relId);
				inMap.put("parentComponentId",custGroupId);
				inMap.put("parentComponentType", Const.COMPONENT_TYPE_CUSTGROUP);
				inMap.put("componentType", Const.COMPONENT_TYPE_CHANNEL);
				relationDeleter.deleteRelation(inMap);
				
				if(!CommonUtils.objectIsNull(channelList)){
					for(Map<String,Object> map:channelList){
						String channelId = (String)map.get("channelId");
						String custGroupChannelRelId = (String)map.get("custGroupChannelRelId");
						Map<String,Object> param = new HashMap<String, Object>();
						param.put("marketCaseCustGrouprelId", relId);
						param.put("custGroupId", custGroupId);
						param.put("channelId", channelId);
						param.put("custGroupChannelRelId",custGroupChannelRelId);
						this.updateCustGroupAndChannelRelation(param);
					}
				}
			}
		}
		
	}
	
	/**
	 * 根据客户群Id更新进程表中营销案的状态
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
	@Override
	public void updateMarketCaseShellProcessByCustGroupId(Map<String, Object> inParam,
			Map<String, Object> tempInParam) throws StrategyError {
		List<Map<String, Object>> marketCaseList=  queryMarketCaseListByCustGroupId(tempInParam);
		if(CommonUtils.objectIsNull(marketCaseList)){
			return ;
		}
		Map<String, Object> shellInParam  = null;
		for(Map<String, Object> marketCase: marketCaseList){
			shellInParam = new HashMap<String, Object>();
			shellInParam.put("busiId", marketCase.get("parentComponentId"));
			shellInParam.put("statusCode", Const.MARKET_CASE_STATUS_DEFAULT);
			shellInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE);
			// TODO Auto-generated method stub
			systemDealUpdater.updateShellProcessExecuteInfo(tempInParam);
		}
		
	}
	
	/**
	 * 根据营销案Id更新营销案状态(暂停和启动)
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: updateMarketCaseStatusById 
	* @param inParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateMarketCaseStatusById(Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> tempInParam = inParam;
		tempInParam.put("updateTime", new Date());
		marketCaseUpdater.updateMarketCase(inParam);
	}	
	
	/**
	 * 保存附件上传的参数处理
	* @date: 2016-11-14 
	* @author: xiongxq
	* @Title: addAttachSettleParam 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> addAttachSettleParam(Map<String,Object> inParam,String marketCaseId)throws StrategyError{
		List<Map<String,Object>> fileList = (List<Map<String,Object>>)inParam.get("fileMap");
		
		Map<String,Object> marketCaseBasic = (Map<String,Object>)inParam.get("marketCaseBasic");
		
		List<Map<String,Object>> fileNewList = new ArrayList<Map<String,Object>>();
		for(Map<String,Object> fileMap:fileList){
			Map<String,Object> fileNewMap = new HashMap<String,Object>();
			fileNewMap.put("operNo", marketCaseBasic.get("operNo"));
			fileNewMap.put("operName", marketCaseBasic.get("operName"));
			fileNewMap.put("operDate", new Date());
			fileNewMap.put("systemName", fileMap.get("systemName"));
			fileNewMap.put("attachType", Const.ATTACH_FILE_TYPE_ACTCONFIG);
			fileNewMap.put("attachName", fileMap.get("fileName"));
			fileNewMap.put("serialId", SequenceUtil.getSequence());
			fileNewMap.put("busiId",marketCaseId);
			fileNewList.add(fileNewMap);
		}
			return fileNewList;
	}

	/**
	 * 添加内容详细元素
	* @date: 2016-9-11 
	* @author: wangth
	* @Title: addContentParamSettle  
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void addContentDetailParam(Map<String,Object> inParam,Map<String,Object> tempInParam,Map<String,Object> positionMap) throws StrategyError{
		String contentId = (String) tempInParam.get("contentId");
		//添加内容基本信息
		content.addContentInfo(inParam,tempInParam);
		List<Map<String,Object>> contentDetailList = (List<Map<String, Object>>) ((Map<String, Object>) positionMap.get("contentInfo")).get("contentDetailList");
		
		if(!CommonUtils.objectIsNull(contentDetailList)){
			for(Map<String,Object> contentDetailMap:contentDetailList){
				String contentDetailId = SequenceUtil.getSequence();
				this.addContentDetailParamsParam(inParam,contentId,contentDetailId,contentDetailMap);
			}
		}
	}
	
	/**
	 * 添加内容详细信息里的参数处理
	* @date: 2016-10-6 
	* @author: wangth
	* @Title: addContentDetailParamsParam 
	* @param inParam
	* @param contentId
	* @param contentDetailId
	* @param contentDetailMap
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void addContentDetailParamsParam(Map<String,Object> inParam,String contentId,String contentDetailId,Map<String,Object> contentDetailMap) throws StrategyError{
		List<Map<String,Object>> paramsList = (List<Map<String, Object>>) contentDetailMap.get("params");
		
		for(Map<String,Object> paramsMap:paramsList){
			content.addContentDetail(inParam,addParamSettle.settleContentDetailParam(contentId,contentDetailId,paramsMap));
		}
	}
	
	/**
	 * 添加事件详细元素
	* @date: 2016-9-11 
	* @author: wangth
	* @Title: addEventDetailParam 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void addEventDetailParam(Map<String,Object> inParam,Map<String,Object> tempInParam,Map<String,Object> eventMap) throws StrategyError{		
		event.addEventInfo(inParam,tempInParam);

		List<Map<String,Object>> eventDetailList = (List<Map<String, Object>>) eventMap.get("eventDetailList");
		String eventId = (String) tempInParam.get("eventId"); 
		
		if(!CommonUtils.objectIsNull(eventDetailList)){
			for(Map<String,Object> eventDetailMap:eventDetailList){
				String eventDetailId = SequenceUtil.getSequence(); 
				this.addEventDetailParamsParam(inParam,eventId,eventDetailId,eventDetailMap);
			}
		}
	}
	
	/**
	 * 添加事件详情参数处理
	* @date: 2016-11-23 
	* @author: mengxi
	* @title: addEventDetailParamsParam 
	* @param inParam
	* @param eventId
	* @param eventDetailId
	* @param eventDetailType
	* @param eventDetailMap
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void addEventDetailParamsParam(Map<String,Object> inParam,String eventId,String eventDetailId,Map<String,Object> eventDetailMap) throws StrategyError{
		List<Map<String,Object>> paramsList = (List<Map<String, Object>>) eventDetailMap.get("params");
		
		for(Map<String,Object> paramsMap:paramsList){
			event.addEventDetail(inParam,addParamSettle.settleEventDetailParam(eventId,eventDetailId,paramsMap));
		}
		
	}
	
	/**
	 * 添加规则详细元素
	* @date: 2016-9-11 
	* @author: wangth
	* @Title: addRuleDetailParam
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings({"unchecked"})
	protected void addRuleDetailParam(Map<String,Object> inParam,Map<String,Object> tempInParam,Map<String,Object> ruleMap) throws StrategyError{		
		String ruleId = (String) tempInParam.get("ruleId"); 
		rule.addRuleInfo(inParam,tempInParam);
		List<Map<String,Object>> ruleDetailList = (List<Map<String, Object>>) ruleMap.get("ruleDetailList");
		
		if(!CommonUtils.objectIsNull(ruleDetailList)){
			for(Map<String,Object> ruleDetailMap:ruleDetailList){
				String ruleDetailType = (String) ruleDetailMap.get("ruleDetailType"); 
				String ruleDetailId = SequenceUtil.getSequence(); 
				this.addRuleDetailParamsParam(inParam,ruleId,ruleDetailId,ruleDetailType,ruleDetailMap);
			}
		}
	}
	
	/**
	 * 
	* @date: 2016-10-6
	* @author: wangth
	* @Title: addRuleDetailParamsParam 
	* @param inParam
	* @param ruleId
	* @param ruleDetailId
	* @param ruleType
	* @param ruleDetailMap
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void addRuleDetailParamsParam(Map<String,Object> inParam,String ruleId,String ruleDetailId,String ruleDetailType,Map<String,Object> ruleDetailMap) throws StrategyError{
		List<Map<String,Object>> paramsList = (List<Map<String, Object>>) ruleDetailMap.get("params");
		
		for(Map<String,Object> paramsMap:paramsList){
			rule.addRuleDetail(inParam,addParamSettle.settleRuleDetailParam(ruleId,ruleDetailId,ruleDetailType,paramsMap));
		}
		
	}
	
	/**
	 * 添加处理渠道参数
	* @date: 2016-9-11 
	* @author: wangth
	* @Title: parseChannelParamSettle  
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void addSettleChannelParam(Map<String,Object> tempInParam) throws StrategyError{
		Map <String,Object> custGroupMap = (Map<String, Object>) tempInParam.get("custGroupMap");
		String custGroupId=(String)custGroupMap.get("custGroupId");
		List<Map<String,Object>> channelList = (List<Map<String,Object>>)custGroupMap.get("channelList");
		
		if(!CommonUtils.objectIsNull(channelList)){
			
			for(Map<String,Object> channelMap:channelList){
				Map<String,Object> custGroupChannelMap = addParamSettle.settleChannelRelParam(tempInParam,channelMap,custGroupId);
				this.addMarketCaseChannelRelation(custGroupChannelMap);
				
				Map<String,Object> tempParamMap = addParamSettle.settleChannelPacketParam(custGroupChannelMap,channelMap);
				//position
				this.addSettlePositionParam(tempParamMap);
				//rule
				this.addSettleChannelRuleParam(tempParamMap);
				//event
				//this.parseEventParamSettle(tempParamMap);
			}
		}
	}

	/**
	 * 添加处理渠道下的规则参数
	* @date: 2016-9-10 
	* @author: wangth
	* @Title: addSettleChannelRuleParam 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void addSettleChannelRuleParam(Map<String,Object> inParam) throws StrategyError{
		 
		 Map <String,Object> channelMap = (Map<String, Object>) inParam.get("channelMap");
		 String channelId=(String)channelMap.get("channelId");
		 Map<String,Object> ruleInfo=(Map<String,Object>)channelMap.get("ruleInfo");
		 if(!CommonUtils.objectIsNull(ruleInfo)){
			 Map<String,Object> channelRuleMap = addParamSettle.settleChannelRuleRelParam(inParam, channelId);
			 this.addMarketCaseRuleRelation(channelRuleMap);
			 
			 Map<String,Object> tempParamMap = addParamSettle.settleRulePacketParam(channelRuleMap);
			 this.addRuleDetailParam(inParam,tempParamMap,ruleInfo);
		 }
	}

	/**
	 * 添加处理事件参数
	* @date: 2016-9-10 
	* @author: wangth
	* @Title: parseEventParamSettle 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date:2016-11-23 update_author:mengxi update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void addSettleEventParam(Map<String,Object> inParam,String marketCaseId) throws StrategyError{
		 Map<String,Object> eventInfo = (Map<String, Object>) inParam.get("eventInfo");
		 log.info("addSettleEventParam:", eventInfo);
		 if(!CommonUtils.objectIsNull(eventInfo)){
			 Map<String,Object> marketCaseEventMap = addParamSettle.settleEventRelParam(inParam, marketCaseId);
			 this.addMarketCaseEventRelation(marketCaseEventMap);
			 
			 Map<String,Object> tempParamMap = addParamSettle.settleEventPacketParam(marketCaseEventMap);
			 this.addEventDetailParam(inParam,tempParamMap,eventInfo);
		 }
	}
	
	/**
	 * 添加处理营销案参数
	* @date: 2016-9-9 
	* @author: wangth
	* @Title: parseMarketCaseSettleParam 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected String addSettleMarketCaseParam(Map<String,Object> tempInParam) throws StrategyError{
		String marketCaseId = this.addMarketCaseBasic(tempInParam);
		Map<String,Object> marketCaseDetail = (Map<String,Object>) tempInParam.get("marketCaseDetail");
		saveDetail(marketCaseId,marketCaseDetail);
		return marketCaseId;
	}
	
	/**
	 * 添加处理营销案下的规则参数
	* @date: 2016-9-10 
	* @author: wangth
	* @Title: addSettleMarketCaseRuleParam 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void addSettleMarketCaseRuleParam(Map<String,Object> inParam,String marketCaseId) throws StrategyError{
		Map<String,Object> ruleInfo = (Map<String, Object>) inParam.get("ruleInfo");
		 if(!CommonUtils.objectIsNull(ruleInfo)){
			 Map<String,Object> marketCaseRuleMap = addParamSettle.settleMarketCaseRuleRelParam(inParam, marketCaseId);
			 this.addMarketCaseRuleRelation(marketCaseRuleMap);
			 
			 Map<String,Object> tempParamMap = addParamSettle.settleRulePacketParam(marketCaseRuleMap);
			 this.addRuleDetailParam(inParam,tempParamMap,ruleInfo);
		 }
	}

	/**
	 * 添加处理运营位参数
	* @date: 2016-9-10 
	* @author: wangth
	* @Title: parsePositionParamSettle 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void addSettlePositionParam(Map<String,Object> tempInParam) throws StrategyError{
		 Map <String,Object> channelMap = (Map<String, Object>) tempInParam.get("channelMap");
		 String channelId=(String)channelMap.get("channelId");
		 List<Map<String,Object>> positionList =(List<Map<String,Object>>)channelMap.get("positionList");
		 
		 if(!CommonUtils.objectIsNull(positionList)){
			 for(Map<String,Object> positionMap : positionList ){
				 Map<String,Object> channelPositionMap = addParamSettle.settleChannelPostionRelParam(tempInParam,positionMap,channelId);
				 this.addMarketCasePositionRelation(channelPositionMap);
				 
				 this.addSettlePositionRuleParam(channelPositionMap);
				 Map<String,Object> postitionContentMap = addParamSettle.settleContentRelParam(channelPositionMap);
				 this.addMarketCaseContentRelation(postitionContentMap);
				 
				 Map<String,Object> tempParamMap = addParamSettle.settlePostionPacketParam(postitionContentMap);
				 this.addContentDetailParam(new HashMap<String, Object>(),tempParamMap,positionMap);
			 }
		 }
	}

	/**
	 * 添加处理运营位下的规则参数
	* @date: 2016-9-10 
	* @author: wangth
	* @Title: addSettlePositionRuleParam 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected void addSettlePositionRuleParam(Map<String,Object> inParam) throws StrategyError{
		 
		 Map <String,Object> positionMap = (Map<String, Object>) inParam.get("positionMap");
		 String positionId=(String)positionMap.get("positionId");
		 Map<String,Object> ruleInfo=(Map<String,Object>)positionMap.get("ruleInfo");
		 if(!CommonUtils.objectIsNull(ruleInfo)){
			 Map<String,Object> positionRuleMap = addParamSettle.settlePositionRuleRelParam(inParam, positionId);
			 this.addMarketCaseRuleRelation(positionRuleMap);
			 
			 Map<String,Object> tempParamMap = addParamSettle.settleRulePacketParam(positionRuleMap);
			 this.addRuleDetailParam(inParam,tempParamMap,ruleInfo);
		 }
	}

	/**
	 * 添加 处理营销案和产商品参数
	* @date: 2016-10-12 
	* @author: wangth
	* @Title: settleProductCommodityRelParam 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected Map<String,Object> addSettleProductCommodityParam(Map<String,Object> inParam,String marketCaseId) throws StrategyError{
		List<Map<String,Object>> productCommodityList = (List<Map<String, Object>>) inParam.get("productCommodityList");
		if(!CommonUtils.objectIsNull(productCommodityList)){
			for(Map<String,Object> productMap:productCommodityList){
				 Map<String,Object> productCommodityMap = addParamSettle.settleProductCommodityRelParam(productMap,marketCaseId);
				 this.addMarketCaseProductCommodityRelation(productCommodityMap);
			}
		}
		return null;
	}

	/**
	 * 查询批量营销案推荐量
	* @date: 2017-4-18 
	* @author: yuanchun
	* @title: queryBatchMarketCaseRecommendCount 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected String queryBatchMarketCaseRecommendCount(
			Map<String, Object> inParam)  throws StrategyError {
		Map<String, Object> tempParamMap = queryParamSettle.settleRecommendCountParam(inParam);
		
		String recommendCount = marketCaseSelector.selectBatchMarketCaseRecommendCount(tempParamMap);
		log.info("queryBatchMarketCaseRecommendCount.recommendCount", recommendCount);
		
		String marketCaseRecommendCount = addParamSettle.settleRecommendCountParam(recommendCount);
		log.info("queryBatchMarketCaseRecommendCount.marketCaseRecommendCount", marketCaseRecommendCount);
		
		return marketCaseRecommendCount;
	}
	
	/**
	 * 保存详细信息
	* @date: 2016-10-21 
	* @author: zhangjj_crmpd
	* @title: saveMarketCaseDetail 
	* @param marketCaseId
	* @param marketCaseDetail 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void saveDetail(String marketCaseId,Map<String, Object> marketCaseDetail) throws StrategyError {
		this.addSettleProductCommodityParam(marketCaseDetail,marketCaseId);
		this.addSettleMarketCaseRuleParam(marketCaseDetail,marketCaseId);
		List<Map<String,Object>> custGrouplList = (List<Map<String,Object>>) marketCaseDetail.get("custGroupList");
		if(!CommonUtils.objectIsNull(custGrouplList)){
			for(Map<String,Object> map:custGrouplList){
				Map<String,Object> marketCaseCustGroupMap = addParamSettle.settleCustGroupRelParam(map,marketCaseId);
				this.addMarketCaseCustGroupRelation(marketCaseCustGroupMap);
				
				Map<String,Object> tempParamMap = addParamSettle.settleCustGroupPacketParam(marketCaseCustGroupMap,map);
				this.addSettleChannelParam(tempParamMap);
			}
		}
		this.addSettleEventParam(marketCaseDetail,marketCaseId);
	}

	/**
	 * 查询关联的渠道
	* @date: 2016-10-21 
	* @author: zhangjj_crmpd
	* @title: queryChannelRelation 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void queryChannelRelation(Map<String, Object> inParam) throws StrategyError {
		StringBuilder parentRelId = new StringBuilder();
		StringBuilder parentComponentId = new StringBuilder();
		parentRelId.append(inParam.get("relId"));
		parentComponentId.append(inParam.get("componentId"));
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentId(parentComponentId.toString());
		queryFilter.setParentRelId(parentRelId.toString());
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_CUSTGROUP);
		queryFilter.setComponentType(Const.COMPONENT_TYPE_CHANNEL);
		List<Map<String, Object>> relationList = marketCaseSelector.selectRelationList(new HashMap<String, Object>(), queryFilter);
		if(!CommonUtils.objectIsNull(relationList)){
			for(Map<String, Object> relationMap :relationList){
				//查询运营位关系
				queryPositionRelation(relationMap);
				//查询规则关联
				queryChannelRuleRelation(relationMap);
			}
		}
		removeRelation(parentRelId.toString(),parentComponentId.toString(),Const.COMPONENT_TYPE_CUSTGROUP,Const.COMPONENT_TYPE_CHANNEL);
	}
	
	/**
	 * 查询关联的事件
	* @date: 2017-4-24 
	* @author: dongyh
	* @title: queryEventRelation 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void queryEventRelation(Map<String, Object> inParam) throws StrategyError {
		StringBuilder parentRelId = new StringBuilder();
		StringBuilder parentComponentId = new StringBuilder();
		parentRelId.append(inParam.get("relId"));
		parentComponentId.append(inParam.get("componentId"));
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentId(parentComponentId.toString());
		queryFilter.setParentRelId(parentRelId.toString());
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_CUSTGROUP);
		queryFilter.setComponentType(Const.COMPONENT_TYPE_EVENT);
		List<Map<String, Object>> relationList = marketCaseSelector.selectRelationList(new HashMap<String, Object>(), queryFilter);
		if(!CommonUtils.objectIsNull(relationList)){
			for(Map<String, Object> relationMap :relationList){
				//查询运营位关系
				queryEventPositionRelation(relationMap);
				//查询规则关联
				queryEventRuleRelation(relationMap);
			}
		}
		removeRelation(parentRelId.toString(),parentComponentId.toString(),Const.COMPONENT_TYPE_CUSTGROUP,Const.COMPONENT_TYPE_EVENT);
	}

	protected void queryChannelRuleRelation(Map<String, Object> inParam) throws StrategyError {
		String parentComponentId = inParam.get("componentId").toString();
		String parentRelId = inParam.get("relId").toString();
		Map<String, Object> delMap = new HashMap<String, Object>();
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentId(parentComponentId);
		queryFilter.setParentRelId(parentRelId);
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_CHANNEL);
		queryFilter.setComponentType(Const.COMPONENT_TYPE_RULE);
		List<Map<String, Object>> relationList = marketCaseSelector.selectRelationList(new HashMap<String, Object>(), queryFilter);
		if(!CommonUtils.objectIsNull(relationList)){
			for(Map<String, Object> relationMap :relationList){
				delMap.put("ruleId", relationMap.get("componentId"));
				rule.removeRuleById(delMap);
			}
		}
		removeRelation(parentRelId.toString(),parentComponentId.toString(),Const.COMPONENT_TYPE_CHANNEL,Const.COMPONENT_TYPE_RULE);
		
	}
	
	/**
	 * 查询事件关联的规则
	* @date: 2017-4-24 
	* @author: dongyh
	* @title: queryEventRuleRelation 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void queryEventRuleRelation(Map<String, Object> inParam) throws StrategyError {
		String parentComponentId = inParam.get("componentId").toString();
		String parentRelId = inParam.get("relId").toString();
		Map<String, Object> delMap = new HashMap<String, Object>();
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentId(parentComponentId);
		queryFilter.setParentRelId(parentRelId);
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_EVENT);
		queryFilter.setComponentType(Const.COMPONENT_TYPE_RULE);
		List<Map<String, Object>> relationList = marketCaseSelector.selectRelationList(new HashMap<String, Object>(), queryFilter);
		if(!CommonUtils.objectIsNull(relationList)){
			for(Map<String, Object> relationMap :relationList){
				delMap.put("ruleId", relationMap.get("componentId"));
				rule.removeRuleById(delMap);
			}
		}
		removeRelation(parentRelId.toString(),parentComponentId.toString(),Const.COMPONENT_TYPE_EVENT,Const.COMPONENT_TYPE_RULE);
	}

	/**
	 * 查询渠道和事件的报文拼接
	* @date: 2016-9-11 
	* @author: wangth
	* @Title: ChannelEventQueryParamSettle 
	* @param inParam 
	* @version 1.0 
	 * @return 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryChannelEventPacketParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		List<Map<String,Object>> eventList = new ArrayList<Map<String,Object>>();
		queryParamSettle.clearQueryFilter(queryFilter);
		queryFilter.setComponentType(Const.COMPONENT_TYPE_EVENT);
		
		queryParamSettle.settleRelParam(inParam, queryFilter);
		List<Map<String,Object>> positionRuleEventRelList = (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
		
		for(Map<String,Object> eventTemMap:positionRuleEventRelList){
			Map<String,Object> eventMap = queryParamSettle.settleSpliceEventParam(eventTemMap,queryFilter);
			eventList.add(eventMap);
		}
		return eventList;
	}

	/**
	 * 查询渠道和运营位的报文拼接
	* @date: 2016-9-11 
	* @author: wangth
	* @Title: ChannelPositionQueryParamSettle 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryChannelPositionPacketParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		List<Map<String,Object>> positionList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> contentDetailList = new ArrayList<Map<String,Object>>();
		queryFilter.setComponentType(Const.COMPONENT_TYPE_POSITION);
	
		queryParamSettle.settleRelParam(inParam, queryFilter);
		List<Map<String,Object>> positionRuleEventRelList= (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
		
		for(Map<String,Object> positionTemMap:positionRuleEventRelList){
			Map<String,Object> positionMap = queryParamSettle.settleSplicePositionParam(positionTemMap, queryFilter);
			
			//整理内容详细信息
			queryParamSettle.settleConetentDtailParam(positionMap,queryFilter);
			Map<String,Object> contentInfo = new HashMap<String,Object>();
			List<Map<String, Object>> relationList = queryMarketCaseRelation(inParam,queryFilter);
			if (!CommonUtils.objectIsNull(relationList)) {
				String contentId = (String) relationList.get(0).get("componentId");
				queryFilter.setContentDetailId("");
				queryFilter.setContentId(contentId);
				contentDetailList = this.queryPositionConetentPacketParam(inParam,queryFilter);
				
				Map<String,Object> ruleInfo = this.queryPositionRulePacketParam(inParam,queryFilter);
				
				contentInfo.put("contentId", contentId);         
				contentInfo.put("contentDetailList", contentDetailList);
				positionMap.put("contentInfo", contentInfo);
				positionMap.put("ruleInfo", ruleInfo);
				positionList.add(positionMap);
			}
		}
		return positionList;
	}
	
	/**
	 * 查询事件下运营位报文拼接
	* @date: 2017-2-25 
	* @author: yuanchun
	* @title: queryEventPositionPacketParam 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryEventPositionPacketParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		List<Map<String,Object>> positionList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> contentDetailList = new ArrayList<Map<String,Object>>();
		queryFilter.setComponentType(Const.COMPONENT_TYPE_POSITION);
	
		queryParamSettle.settleRelParam(inParam, queryFilter);
		List<Map<String,Object>> positionRuleList= (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
		
		for(Map<String,Object> positionTemMap:positionRuleList){
			Map<String,Object> positionMap = queryParamSettle.settleSplicePositionParam(positionTemMap, queryFilter);
			
			//整理内容详细信息
			queryParamSettle.settleConetentDtailParam(positionMap,queryFilter);
			Map<String,Object> contentInfo = new HashMap<String,Object>();
			List<Map<String, Object>> relationList = queryMarketCaseRelation(inParam,queryFilter);
			if (!CommonUtils.objectIsNull(relationList)) {
				String contentId = (String) relationList.get(0).get("componentId");
				queryFilter.setContentDetailId("");
				queryFilter.setContentId(contentId);
				contentDetailList = this.queryPositionConetentPacketParam(inParam,queryFilter);
				
				Map<String,Object> ruleInfo = this.queryPositionRulePacketParam(inParam,queryFilter);
				
				contentInfo.put("contentId", contentId);         
				contentInfo.put("contentDetailList", contentDetailList);
				positionMap.put("contentInfo", contentInfo);
				positionMap.put("ruleInfo", ruleInfo);
				positionList.add(positionMap);
			}
		}
		return positionList;
	}
	

	/**
	 * 查询渠道和规则的报文拼接
	* @date: 2016-9-11 
	* @author: wangth
	* @Title: ChannelRuleQueryParamSettle 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> queryChannelRulePacketParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		Map<String,Object> ruleMap = new HashMap<String,Object>();
		queryFilter.setComponentType(Const.COMPONENT_TYPE_RULE);
		
		queryParamSettle.settleRelParam(inParam, queryFilter);
		List<Map<String,Object>> positionRuleEventRelList = (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
		
		if(!CommonUtils.objectIsNull(positionRuleEventRelList)){
			for(Map<String,Object> tempRuleMap:positionRuleEventRelList){
				 ruleMap = queryParamSettle.settleSpliceRuleParam(tempRuleMap,queryFilter);
			}
		}
		return ruleMap;
	}
	
	/**
	 * 查询事件下规则报文拼接
	* @date: 2017-2-25 
	* @author: yuanchun
	* @title: queryEventRulePacketParam 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> queryEventRulePacketParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		Map<String,Object> ruleMap = new HashMap<String,Object>();
		queryFilter.setComponentType(Const.COMPONENT_TYPE_RULE);
		
		queryParamSettle.settleRelParam(inParam, queryFilter);
		List<Map<String,Object>> positionRuleRelList = (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
		
		if(!CommonUtils.objectIsNull(positionRuleRelList)){
			for(Map<String,Object> tempRuleMap:positionRuleRelList){
				 ruleMap = queryParamSettle.settleSpliceRuleParam(tempRuleMap,queryFilter);
			}
		}
		return ruleMap;
	}

	/**
	 * 查询内容关系
	* @date: 2016-10-21 
	* @author: zhangjj_crmpd
	* @title: queryContentRelation 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void queryContentRelation(Map<String, Object> inParam) throws StrategyError {
		String parentComponentId = inParam.get("componentId").toString();
		String parentRelId = inParam.get("relId").toString();
		Map<String, Object> delMap = new HashMap<String, Object>();
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentId(parentComponentId);
		queryFilter.setParentRelId(parentRelId);
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_POSITION);
		queryFilter.setComponentType(Const.COMPONENT_TYPE_CONTENT);
		List<Map<String, Object>> relationList = marketCaseSelector.selectRelationList(new HashMap<String, Object>(), queryFilter);
		if(!CommonUtils.objectIsNull(relationList)){
			for(Map<String, Object> relationMap :relationList){
				delMap.put("contentId", relationMap.get("componentId"));
				content.removeContentById(delMap);
			}
		}
		removeRelation(parentRelId.toString(),parentComponentId.toString(),Const.COMPONENT_TYPE_POSITION,Const.COMPONENT_TYPE_CONTENT);
		
	}

	/**
	 * 查询客户群和渠道的报文拼接
	* @date: 2016-9-11 
	* @author: wangth
	* @Title: custGroupChannelQueryParamSettle 
	* @param inParam 
	* @version 1.0 
	 * @return 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryCustGroupChannelPacketParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		List<Map<String,Object>> channelList = new ArrayList<Map<String,Object>>();
		queryFilter.setComponentType(Const.COMPONENT_TYPE_CHANNEL);
		List<Map<String,Object>> channelRelList = (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
		
		if(!CommonUtils.objectIsNull(channelRelList)){
			for(Map<String,Object> channelTemMap:channelRelList){
				Map<String,Object> channelMap = queryParamSettle.settleSpliceChannelParam(inParam,channelTemMap, queryFilter);
				//渠道下的rule,event,position
				List<Map<String,Object>> positionList = this.queryChannelPositionPacketParam(channelTemMap,queryFilter);
				Map<String,Object> ruleInfo = this.queryChannelRulePacketParam(channelTemMap,queryFilter);
				//List<Map<String,Object>> eventList = this.channelEventQueryParamSettle(inParam,queryFilter);
				
				channelMap.put("positionList", positionList);
				channelMap.put("ruleInfo", ruleInfo);
				//channelMap.put("eventList", eventList);
				channelList.add(channelMap);
			}
		}
		return channelList;
	}
	
	/**
	 * 查询客户群和事件的报文拼接
	* @date: 2017-2-22 
	* @author: yuanchun
	* @title: queryCustGroupEventPacketParam 
	* @param inParam
	* @param groupMap
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryCustGroupEventPacketParam(Map<String, Object> inParam,
			Map<String, Object> groupMap, IQueryFilter queryFilter)  throws StrategyError{
		List<Map<String,Object>> eventList = new ArrayList<Map<String,Object>>();
		
		queryParamSettle.clearQueryFilter(queryFilter);
		queryFilter.setParentRelId((String)groupMap.get("relId"));
		queryFilter.setParentComponentId((String) groupMap.get("componentId"));
		queryFilter.setComponentType(Const.COMPONENT_TYPE_EVENT);
		//客户群事件关系列表     relId可以查事件下的信息
		List<Map<String,Object>> eventRelList = (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
		
		for(Map<String,Object> eventTemMap:eventRelList){
			//查询出事件relId,eventDetailList
			Map<String,Object> eventMap = queryParamSettle.settleSpliceEventParam(inParam,eventTemMap,queryFilter);
			
			//事件下的运营位，规则
			List<Map<String,Object>> positionList = this.queryEventPositionPacketParam(eventTemMap,queryFilter);
			Map<String,Object> ruleInfo = this.queryEventRulePacketParam(eventTemMap,queryFilter);
			
			eventMap.put("positionList", positionList);
			eventMap.put("ruleInfo", ruleInfo);
			
			
			eventList.add(eventMap);
		}
		return eventList;
	}
	
	/**
	 * 根据MarketCaseId查询客户群关系
	* @date: 2016-10-21 
	* @author: zhangjj_crmpd
	* @title: queryCustGroupRelationById 
	* @param marketCaseId 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void queryCustGroupRelationById(String marketCaseId) throws StrategyError {
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentId(marketCaseId);
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_MARKETCASE);
		queryFilter.setComponentType(Const.COMPONENT_TYPE_CUSTGROUP);
		List<Map<String, Object>> relationList = marketCaseSelector.selectRelationList(new HashMap<String, Object>(), queryFilter);
		if(!CommonUtils.objectIsNull(relationList)){
			for(Map<String, Object> relationMap :relationList){
				//查询关联的渠道
				queryChannelRelation(relationMap);
				//查询关联的事件
				queryEventRelation(relationMap);
			}
		}
		removeCustGroupRelationById(marketCaseId);
	}

	/**
	 * 查询客户群报文拼接
	* @date: 2016-10-12 
	* @author: wangth
	* @Title: queryCustGroupPacketParam 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryCustGroupPacketParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		queryFilter.setComponentType(Const.COMPONENT_TYPE_CUSTGROUP);
		List<Map<String,Object>> custGroupList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> channelList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> eventList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> custGroupRelList = (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
		
		for(Map<String,Object> groupMap:custGroupRelList){
			Map<String,Object> custGroupMap = queryParamSettle.settleSpliceCustGroupParam(inParam,groupMap, queryFilter);
			//查询客户群下渠道
			channelList = this.queryCustGroupChannelPacketParam(inParam,queryFilter);
			log.debug("marketCase.queryCustGroupPacketParam.channelList", channelList);
			//查询客户群下的事件
			eventList = this.queryCustGroupEventPacketParam(inParam,groupMap,queryFilter);
			log.debug("marketCase.queryCustGroupPacketParam.eventList", eventList);
			
			queryParamSettle.clearQueryFilter(queryFilter);
			custGroupMap.put("channelList", channelList);
			custGroupMap.put("eventList", eventList);
			custGroupList.add(custGroupMap);
		}
		return custGroupList;
	}
	
	/**
	 * 根据客户群Id查询营销案Id
	* @date: 2017-3-10 
	* @author: zhangjj_crmpd
	* @title: queryMarketCaseListByCustGroupId 
	* @param tempInParam
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryMarketCaseListByCustGroupId(
			Map<String, Object> tempInParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setComponentId(CommonUtils.toString(tempInParam.get("custGroupId")));
		queryFilter.setComponentType(Const.COMPONENT_TYPE_CUSTGROUP);
		return marketCaseSelector.selectRelationList(tempInParam, queryFilter);
	}


	/**
	 * 查询事件规则报文拼接
	* @date: 2016-12-2 
	* @author: mengxi
	* @title: queryMarketCaseEventPacketParam 
	* @param inParam
	* @param queryFilter
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> queryMarketCaseEventPacketParam(Map<String, Object> inParam, IQueryFilter queryFilter) throws StrategyError{
		Map<String,Object> eventMap = new HashMap<String,Object>();
		queryFilter.setComponentType(Const.COMPONENT_TYPE_EVENT);
		queryFilter.setParentComponentId(queryFilter.getMarketCaseId());
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_MARKETCASE);
		
		List<Map<String,Object>> eventRelList = (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
		log.info("queryMarketCaseEventPacketParam:eventRelList", eventRelList);
		
		for(Map<String,Object> tempEventMap:eventRelList){
			eventMap = queryParamSettle.settleEventParam(tempEventMap,queryFilter);
		}
		return eventMap;
	}
	
	/**
	 * 查询营销案转化量
	* @date: 2017-4-18 
	* @author: yuanchun
	* @title: queryMarketCaseOrderCount 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> queryMarketCaseOrderCount(
			Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> orderCountMap = marketCaseSelector.selectMarketCaseOrderCount(inParam);
		log.debug("queryMarketCaseOrderCount.orderCountMap", orderCountMap);
		return orderCountMap;
	}
	
	/**
	 * 查询营销案和客户群报文的拼接
	* @date: 2016-9-9 
	* @author: wangth
	* @Title: marketCaseQueryParamSettle 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> queryMarketCasePacketParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		Map<String,Object> marketCaseMap = new HashMap<String,Object>();
		
		queryParamSettle.clearQueryFilter(queryFilter);
		queryFilter.setParentComponentId(queryFilter.getMarketCaseId());
		log.debug("queryMarketCasePacketParam. queryFilter.getParentComponentId()", queryFilter.getParentComponentId());
		
		List<Map<String,Object>> custGroupList = this.queryCustGroupPacketParam(inParam, queryFilter);
		marketCaseMap.put("custGroupList", custGroupList);
		log.debug("queryMarketCasePacketParam.custGroupList", custGroupList);
		
		List<Map<String,Object>> productCommodityList = this.queryProductCommodityPacketParam(inParam,queryFilter);
		marketCaseMap.put("productCommodityList", productCommodityList);
		log.debug("queryMarketCasePacketParam.productCommodityList", productCommodityList);
		
		Map<String,Object> ruleInfo = this.queryMarketCaseRulePacketParam(inParam,queryFilter);
		marketCaseMap.put("ruleInfo", ruleInfo);
		log.debug("queryMarketCasePacketParam.ruleInfo", ruleInfo);
		
		Map<String,Object> eventInfo = this.queryMarketCaseEventPacketParam(inParam,queryFilter);
		marketCaseMap.put("eventInfo", eventInfo);
		log.debug("queryMarketCasePacketParam.eventInfo", eventInfo);
		
		log.debug("queryMarketCasePacketParam.marketCaseMap", marketCaseMap);
		return marketCaseMap;
	}
	
	/**
	 * 查询渠道和规则的报文拼接
	* @date: 2016-9-11 
	* @author: wangth
	* @Title: ChannelRuleQueryParamSettle 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> queryMarketCaseRulePacketParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		Map<String,Object> ruleMap = new HashMap<String,Object>();
		queryFilter.setComponentType(Const.COMPONENT_TYPE_RULE);
		queryFilter.setParentComponentId(queryFilter.getMarketCaseId());
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_MARKETCASE);
		
		List<Map<String,Object>> positionRuleEventRelList = (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
		
		for(Map<String,Object> tempRuleMap:positionRuleEventRelList){
			 ruleMap = queryParamSettle.settleSpliceRuleParam(tempRuleMap,queryFilter);
		}
		return ruleMap;
	}
	
	/**
	 * 查询营销案推荐量
	* @date: 2017-4-18 
	* @author: yuanchun
	* @title: queryMarketCaseRecommendCount 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> queryMarketCaseRecommendCount(
			Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> mrketCaseRecommendCount = new HashMap<String, Object>();
		String marketCaseType = (String) inParam.get("marketCaseType");
		log.info("queryMarketCaseRecommendCount.marketCaseType", marketCaseType);
		
		String recommendCount = "0";
		if (Const.MARKET_CASE_TYPE_BATCH.equals(marketCaseType)) {
			recommendCount = this.queryBatchMarketCaseRecommendCount(inParam);
			log.info("MARKET_CASE_TYPE_BATCH.recommendCount", recommendCount);
		}else if(Const.MARKET_CASE_TYPE_REAL.equals(marketCaseType)){
			recommendCount = marketCaseSelector.selectMarketCaseRecommendCount(inParam);
			recommendCount = recommendCount==null?"0":recommendCount;
			log.info("MARKET_CASE_TYPE_REAL.recommendCount", recommendCount);
		}
		
		mrketCaseRecommendCount.put("recommendCount", recommendCount);
		log.debug("queryMarketCaseRecommendCount.mrketCaseRecommendCount", mrketCaseRecommendCount);
		return mrketCaseRecommendCount;
	}

	/**
	 * 查询运营位和内容的报文拼接
	* @date: 2016-9-11 
	* @author: wangth
	* @Title: PositionConetentQueryParamSettle 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String, Object>> queryPositionConetentPacketParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		List<Map<String,Object>> contentDetailIdList = (List<Map<String, Object>>) content.queryContentDetailId(inParam,queryFilter);
		List<Map<String,Object>> contentDetailList = new ArrayList<Map<String,Object>>();
		
		if(!CommonUtils.objectIsNull(contentDetailIdList)){
			for(Map<String,Object> contentDetailIdMap:contentDetailIdList){
				Map<String,Object> tempContentMap = new HashMap<String,Object>();
				
				String contentDetailId = (String)contentDetailIdMap.get("contentDetailId");
				queryFilter.setContentDetailId(contentDetailId);
				List<Map<String,Object>> contentParams =(List<Map<String, Object>>) content.queryContentDetail(inParam,queryFilter);
				
				tempContentMap.put("contentDetailId", contentDetailId);
				tempContentMap.put("params", contentParams);
				contentDetailList.add(tempContentMap);
			}
		}
		return contentDetailList;
	}

	/**
	 * 查询关联的运营位
	* @date: 2016-10-21 
	* @author: zhangjj_crmpd
	* @title: queryPositionRelation 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void queryPositionRelation(Map<String, Object> inParam) throws StrategyError {
		String parentComponentId = inParam.get("componentId").toString();
		String parentRelId = inParam.get("relId").toString();
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentId(parentComponentId);
		queryFilter.setParentRelId(parentRelId);
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_CHANNEL);
		queryFilter.setComponentType(Const.COMPONENT_TYPE_POSITION);
		List<Map<String, Object>> relationList = marketCaseSelector.selectRelationList(new HashMap<String, Object>(), queryFilter);
		if(!CommonUtils.objectIsNull(relationList)){
			for(Map<String, Object> relationMap :relationList){
				//查询内容关系
				queryContentRelation(relationMap);
				//查询规则关系
				//queryPositionRuleRelation(relationMap);
			}
		}
		removeRelation(parentRelId.toString(),parentComponentId.toString(),Const.COMPONENT_TYPE_CHANNEL,Const.COMPONENT_TYPE_POSITION);
		
	}
	
	/**
	 * 查询事件关联的运营位
	* @date: 2017-4-24 
	* @author: dongyh
	* @title: queryEventPositionRelation 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void queryEventPositionRelation(Map<String, Object> inParam) throws StrategyError {
		String parentComponentId = inParam.get("componentId").toString();
		String parentRelId = inParam.get("relId").toString();
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentId(parentComponentId);
		queryFilter.setParentRelId(parentRelId);
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_EVENT);
		queryFilter.setComponentType(Const.COMPONENT_TYPE_POSITION);
		List<Map<String, Object>> relationList = marketCaseSelector.selectRelationList(new HashMap<String, Object>(), queryFilter);
		if(!CommonUtils.objectIsNull(relationList)){
			for(Map<String, Object> relationMap :relationList){
				//查询内容关系
				queryContentRelation(relationMap);
			}
		}
		removeRelation(parentRelId.toString(),parentComponentId.toString(),Const.COMPONENT_TYPE_EVENT,Const.COMPONENT_TYPE_POSITION);
	}

	/**
	 * 查询渠道和规则的报文拼接
	* @date: 2016-9-11 
	* @author: wangth
	* @Title: ChannelRuleQueryParamSettle 
	* @param inParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> queryPositionRulePacketParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		
		Map<String,Object> ruleMap = new HashMap<String,Object>();
		queryFilter.setComponentType(Const.COMPONENT_TYPE_RULE);
		String parentPositionComponentId = (String) queryFilter.getPositionId();
		queryFilter.setParentComponentId(parentPositionComponentId);
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_POSITION);
		
		List<Map<String,Object>> positionRuleRelList = (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
		
		if(!CommonUtils.objectIsNull(positionRuleRelList)){
			for(Map<String,Object> tempRuleMap:positionRuleRelList){
				 ruleMap = queryParamSettle.settleSpliceRuleParam(tempRuleMap,queryFilter);
			}
		}
		return ruleMap;
	}
	
	/**
	 * 查询运营位规则关系
	* @date: 2016-10-21 
	* @author: zhangjj_crmpd
	* @title: queryPositionRuleRelation 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void queryPositionRuleRelation(Map<String, Object> inParam) throws StrategyError {
		String parentComponentId = inParam.get("componentId").toString();
		String parentRelId = inParam.get("relId").toString();
		Map<String, Object> delMap = new HashMap<String, Object>();
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentId(parentComponentId);
		queryFilter.setParentRelId(parentRelId);
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_POSITION);
		queryFilter.setComponentType(Const.COMPONENT_TYPE_RULE);
		List<Map<String, Object>> relationList = marketCaseSelector.selectRelationList(new HashMap<String, Object>(), queryFilter);
		if(!CommonUtils.objectIsNull(relationList)){
			for(Map<String, Object> relationMap :relationList){
				delMap.put("ruleId", relationMap.get("componentId"));
				rule.removeRuleById(delMap);
			}
		}
		removeRelation(parentRelId.toString(),parentComponentId.toString(),Const.COMPONENT_TYPE_POSITION,Const.COMPONENT_TYPE_RULE);
	}
	
	/**
	 * 查询产商品报文拼接
	* @date: 2016-10-12 
	* @author: wangth
	* @Title: queryProductCommodityPacketParam 
	* @param inParam
	* @param queryFilter
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> queryProductCommodityPacketParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{		
		queryFilter.setComponentType(Const.COMPONENT_TYPE_PRODUCTCOMMODITY);
		queryFilter.setParentComponentId(queryFilter.getMarketCaseId());
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_MARKETCASE);		
		List<Map<String,Object>> productCommodityList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> productCommodityRelList = (List<Map<String, Object>>) queryMarketCaseRelation(inParam,queryFilter);
		
		if(!CommonUtils.objectIsNull(productCommodityRelList)){
			for(Map<String,Object> productMap:productCommodityRelList){
				Map<String,Object> productCommodityMap = new HashMap<String,Object>();
				//查询产商品 
				queryFilter.setProductCommodityId(productMap.get("componentId").toString());
				productCommodityMap = productCommodity.queryProductCommodity(inParam, queryFilter);
				productCommodityList.add(productCommodityMap);
			}
		}
		return productCommodityList;
	}

	/**
	 * 查询全局规则关系
	* @date: 2016-10-21 
	* @author: zhangjj_crmpd
	* @title: queryWholeRuleRelation 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void queryWholeRuleRelation(Map<String, Object> inParam) throws StrategyError {
		String parentComponentId = inParam.get("componentId").toString();
		String parentRelId = inParam.get("relId").toString();
		Map<String, Object> delMap = new HashMap<String, Object>();
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentId(parentComponentId);
		queryFilter.setParentRelId(parentRelId);
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_MARKETCASE);
		queryFilter.setComponentType(Const.COMPONENT_TYPE_RULE);
		List<Map<String, Object>> relationList = marketCaseSelector.selectRelationList(new HashMap<String, Object>(), queryFilter);
		if(!CommonUtils.objectIsNull(relationList)){
			for(Map<String, Object> relationMap :relationList){
				delMap.put("ruleId", relationMap.get("componentId"));
				rule.removeRuleById(delMap);
			}
		}
		removeRelation(parentRelId.toString(),parentComponentId.toString(),Const.COMPONENT_TYPE_MARKETCASE,Const.COMPONENT_TYPE_RULE);
	}
	
	/**
	 * 删除客户群关系
	* @date: 2016-10-21 
	* @author: zhangjj_crmpd
	* @title: removeCustGroupRelationById 
	* @param marketCaseId 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void removeCustGroupRelationById(String marketCaseId) throws StrategyError {
		Map<String,Object> inMap  = new HashMap<String,Object>();
		inMap.put("parentComponentId", marketCaseId);
		inMap.put("parentComponentType", Const.COMPONENT_TYPE_MARKETCASE);
		inMap.put("componentType", Const.COMPONENT_TYPE_CUSTGROUP);
		relationDeleter.deleteRelation(inMap);
		
	}

	/**
	 * 删除产商品关系
	* @date: 2016-10-21 
	* @author: zhangjj_crmpd
	* @title: removeProductCommodityRelationById 
	* @param marketCaseId 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void removeProductCommodityRelationById(String marketCaseId) throws StrategyError {
		Map<String,Object> inMap  = new HashMap<String,Object>();
		inMap.put("parentComponentId", marketCaseId);
		inMap.put("parentComponentType", Const.COMPONENT_TYPE_MARKETCASE);
		inMap.put("componentType", Const.COMPONENT_TYPE_PRODUCTCOMMODITY);
		relationDeleter.deleteRelation(inMap);
	}

	/**
	 * 删除关系
	* @date: 2016-10-21 
	* @author: zhangjj_crmpd
	* @title: removeRelation 
	* @param parentRelId
	* @param parentComponentId
	* @param parentComponentType
	* @param componentType
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void removeRelation(String parentRelId,String parentComponentId,String parentComponentType,String componentType) throws StrategyError {
		Map<String,Object> inMap  = new HashMap<String,Object>();
		inMap.put("parentRelId", parentRelId);
		inMap.put("parentComponentId", parentComponentId);
		inMap.put("parentComponentType", parentComponentType);
		inMap.put("componentType", componentType);
		relationDeleter.deleteRelation(inMap);
	}
	
	/**
	 * 修改营销案下客户群和渠道关系
	* @date: 2016-11-15 
	* @author: tangaq
	* @title: updateCustGroupAndChannelRelation 
	* @param param 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void updateCustGroupAndChannelRelation(Map<String,Object> inParam) throws StrategyError{
		String marketCaseCustGrouprelId = (String) inParam.get("marketCaseCustGrouprelId");
		String custGroupId = (String) inParam.get("custGroupId");
		String channelId = (String) inParam.get("channelId");
		String custGroupChannelRelId = (String) inParam.get("custGroupChannelRelId");
		
		Map<String,Object> newInParam = new HashMap<String, Object>();
		newInParam.put("parentRelId", marketCaseCustGrouprelId);
		newInParam.put("parentComponentId", custGroupId);
		newInParam.put("parentComponentType", Const.COMPONENT_TYPE_CUSTGROUP);
		newInParam.put("componentId", channelId);
		newInParam.put("componentType", Const.COMPONENT_TYPE_CHANNEL);
		newInParam.put("relId",custGroupChannelRelId);
		
		marketCaseInsertor.insertRelationInfo(newInParam);
	}
	
	

	/**
	 * 添加参数整理类
	* @date: 2016-9-13 
	* @author: wangth
	* @Title: paramSettle 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	protected class AddParamSettle implements Serializable{
		
		/**
		 * 营销案基本信息参数处理
		* @date: 2016-9-9 
		* @author: wangth
		* @Title: marketCaseSettleParam 
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@SuppressWarnings("unchecked")
		protected Map<String,Object> marketCaseBasicSettleParam(Map<String,Object> inParam) throws StrategyError{
			//获取营销案的基本信息
			Map<String,Object> marketCaseMap = (Map<String, Object>) inParam.get("marketCaseBasic");
			marketCaseMap.put("marketCaseId", SequenceUtil.getSequence());
			marketCaseMap.put("operTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
			marketCaseMap.put("updateTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
			settleStatusCodeParam(marketCaseMap);
			return marketCaseMap;
		}

		/**
		 * 整理渠道的报文参数
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: settleChannelPacketParam 
		* @param inParam
		* @param channelMap
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleChannelPacketParam(Map<String,Object> tempInParam,Map<String,Object> channelMap){
			Map<String,Object> tempParamMap = new HashMap<String,Object>();
			
			tempParamMap.put("relId", (String)tempInParam.get("relId"));
			tempParamMap.put("channelMap", channelMap);
			
			return tempParamMap;
		}

		/**
		 * 渠道和运营位的关系
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: settlePostionRelParam 
		* @param inParam
		* @param channelId
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleChannelPostionRelParam(Map<String, Object> tempInParam,Map<String,Object> positionMap,String channelId){
			Map<String,Object> channelPositionMap = new HashMap<String,Object>();
			String parentRelId =(String) tempInParam.get("relId");
			String relPositionId=SequenceUtil.getSequence();//重新生成渠道和运营位的关系Id
			String positionId =(String)positionMap.get("positionId");
			//解析渠道和运营位的关系参数
			channelPositionMap.put("parentComponentId", channelId);
			channelPositionMap.put("componentId", positionId);
			channelPositionMap.put("relId", relPositionId);
			channelPositionMap.put("parentRelId", parentRelId);
			channelPositionMap.put("componentType", Const.COMPONENT_TYPE_POSITION);
			channelPositionMap.put("parentComponentType", Const.COMPONENT_TYPE_CHANNEL);
			channelPositionMap.put("positionMap", positionMap);
			
			return channelPositionMap;
		}

		/**
		 * 渠道下规则关系处理
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: settleChannelRuleRelParam 
		* @param inParam
		* @param ruleMap
		* @param channelId
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleChannelRuleRelParam (Map<String,Object> inParam,String channelId){
			 Map<String,Object> channelRuleMap = new HashMap<String,Object>();
			 String parentRelId = (String) inParam.get("relId");
			 String relRuleId=SequenceUtil.getSequence();//生成渠道和规则关系Id
			 String ruleId=SequenceUtil.getSequence();//生成规则Id
			 channelRuleMap.put("parentComponentId",channelId);
			 channelRuleMap.put("componentId", ruleId);
			 channelRuleMap.put("relId", relRuleId);
			 channelRuleMap.put("parentRelId", parentRelId);
			 channelRuleMap.put("componentType", Const.COMPONENT_TYPE_RULE);
			 channelRuleMap.put("parentComponentType", Const.COMPONENT_TYPE_CHANNEL);
			 
			 return channelRuleMap;
		}

		/**
		 * 客户群和渠道的关系
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: settleChannelRelParam 
		* @param inParam
		* @param channelMap
		* @param custGroupId
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleChannelRelParam(Map<String,Object> tempInParam,Map<String,Object> channelMap,String custGroupId){
			Map<String,Object> custGroupChannelMap = new HashMap<String,Object>();
			
			String parentRelId=(String) tempInParam.get("relId");
			String relId=SequenceUtil.getSequence();//重新生成客户群和渠道的关系Id
			String channelId=(String)channelMap.get("channelId");
			
			custGroupChannelMap.put("parentComponentId", custGroupId);
			custGroupChannelMap.put("componentId", channelId);
			custGroupChannelMap.put("relId", relId);
		    custGroupChannelMap.put("parentRelId", parentRelId);
		    custGroupChannelMap.put("componentType", Const.COMPONENT_TYPE_CHANNEL);
		    custGroupChannelMap.put("parentComponentType", Const.COMPONENT_TYPE_CUSTGROUP);
		    
			return custGroupChannelMap;
		}

		/**
		 * 内容的基本信息参数处理
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: getContentDetailParam 
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleContentDetailParam(String contentId,String contentDetailId,Map<String,Object> tempInParam){
			Map<String,Object> contentInfoMap = new HashMap<String,Object>();
			//内容基本信息
			contentInfoMap.put("contentParCode", (String)tempInParam.get("contentParCode"));
			contentInfoMap.put("contentParValue", (String) tempInParam.get("contentParValue"));
			contentInfoMap.put("contentParName", (String) tempInParam.get("contentParName"));
			contentInfoMap.put("batchNo", (String) tempInParam.get("batchNo"));
			contentInfoMap.put("contentDetailId", contentDetailId);
			contentInfoMap.put("contentId", contentId);
			contentInfoMap.put("serialId", SequenceUtil.getSequence());
			return contentInfoMap;
		}

		/**
		 * 内容和运营位的关系
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: settleContentRelParam 
		* @param inParam
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleContentRelParam(Map<String,Object> tempInParam){
			
			Map<String,Object> postitionContentMap = new HashMap<String,Object>();
			String relContentId=SequenceUtil.getSequence();//生成运营位和内容关系Id
			String contentId =SequenceUtil.getSequence(); //生成contentId
			//解析运营位和内容的关系参数
			postitionContentMap.put("parentComponentId", tempInParam.get("componentId"));
			postitionContentMap.put("componentId", contentId);
			postitionContentMap.put("relId", relContentId);
			postitionContentMap.put("parentRelId", tempInParam.get("relId"));
			postitionContentMap.put("componentType", Const.COMPONENT_TYPE_CONTENT);
			postitionContentMap.put("parentComponentType", Const.COMPONENT_TYPE_POSITION);
			
			return postitionContentMap;
			
		}

		/**
		 * 整理客户群的报文参数
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: settleCustGroupPacketParam 
		* @param inParam
		* @param custGroupMap
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleCustGroupPacketParam(Map<String,Object> tempInParam,Map<String,Object> custGroupMap){
			Map<String,Object> tempParamMap = new HashMap<String,Object>();
			
			tempParamMap.put("relId",(String)tempInParam.get("relId"));
			tempParamMap.put("custGroupMap", custGroupMap);
			
			return tempParamMap;
		}
		
		/**
		 * 客户群和营销案关系处理
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: settleCustGroupRelParam 
		* @param inParam
		* @param marketCaseId
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleCustGroupRelParam(Map<String,Object> inParam,String marketCaseId){
			Map<String,Object> marketCaseCustGroupMap = new HashMap<String,Object>();
			
			String relId = SequenceUtil.getSequence();//工具类生成序列营销案与客户群Id
			marketCaseCustGroupMap.put("parentComponentId", marketCaseId);
			marketCaseCustGroupMap.put("componentId",(String)inParam.get("custGroupId"));
			marketCaseCustGroupMap.put("relId", relId);
			marketCaseCustGroupMap.put("componentType", Const.COMPONENT_TYPE_CUSTGROUP);
			marketCaseCustGroupMap.put("parentComponentType", Const.COMPONENT_TYPE_MARKETCASE);
			
			return marketCaseCustGroupMap;
		}

		/**
		 * 事件基本信息参数整理
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: getEventParam 
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleEventDetailParam(String eventId,String eventDetailId,Map<String,Object> inParam){
			Map<String,Object> eventInfoMap = new HashMap<String,Object>();
			//事件基本信息
			eventInfoMap.put("eventParName",(String)inParam.get("eventParName"));
			eventInfoMap.put("eventParValue",(String)inParam.get("eventParValue"));
			eventInfoMap.put("eventParCode",(String)inParam.get("eventParCode"));
			eventInfoMap.put("batchNo",(String)inParam.get("batchNo"));
			eventInfoMap.put("eventId", eventId);
			eventInfoMap.put("eventDetailType", (String)inParam.get("eventDetailType"));
			eventInfoMap.put("eventDetailId", eventDetailId);
			eventInfoMap.put("serialId", SequenceUtil.getSequence());
			log.info("settleEventDetailParam:", eventInfoMap);
			
			return eventInfoMap;
		}
		
		/**
		 * 整理事件报文参数
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: settleEventPacketParam 
		* @param inParam
		* @param eventMap
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleEventPacketParam(Map<String,Object> inParam){
			Map<String,Object> tempParamMap = new HashMap<String,Object>();
			tempParamMap.put("eventId", (String)inParam.get("componentId"));
			tempParamMap.put("eventType", (String)inParam.get("componentType"));
			tempParamMap.put("serialId", SequenceUtil.getSequence());
			
			return tempParamMap;
		}
		
		/**
		 * 事件关系处理
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: settleEventRelParam 
		* @param inParam
		* @param channelId
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleEventRelParam(Map<String,Object> inParam,String marketCaseId){
			 Map<String,Object> eventMap =  new HashMap<String,Object>();
			 
			 String relEventId=SequenceUtil.getSequence();//生成事件规则关系Id
			 String eventId=SequenceUtil.getSequence();//生成事件规则Id
			 eventMap.put("parentComponentId", marketCaseId);
			 eventMap.put("componentId", eventId);
			 eventMap.put("relId", relEventId);
			 eventMap.put("componentType", Const.COMPONENT_TYPE_EVENT);
			 eventMap.put("parentComponentType", Const.COMPONENT_TYPE_MARKETCASE);
			 
			 return eventMap;
		}
		
		/**
		 * 营销案下规则关系处理
		* @date: 2016-10-12 
		* @author: wangth
		* @Title: settleMarketCaseRuleRelParam 
		* @param inParam
		* @param ruleMap
		* @param channelId
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleMarketCaseRuleRelParam (Map<String,Object> inParam,String marketCaseId){
			 Map<String,Object> marketCaseRuleMap = new HashMap<String,Object>();
			 String parentRelId = (String) inParam.get("relId");
			 String relId=SequenceUtil.getSequence();//生成渠道和规则关系Id
			 String ruleId=SequenceUtil.getSequence();//生成规则Id
			 marketCaseRuleMap.put("parentComponentId",marketCaseId);
			 marketCaseRuleMap.put("componentId", ruleId);
			 marketCaseRuleMap.put("relId", relId);
			 marketCaseRuleMap.put("parentRelId", parentRelId);
			 marketCaseRuleMap.put("componentType", Const.COMPONENT_TYPE_RULE);
			 marketCaseRuleMap.put("parentComponentType", Const.COMPONENT_TYPE_MARKETCASE);
			 
			 return marketCaseRuleMap;
		}
		
		/**
		 * 处理批量营销案推荐量参数
		* @date: 2017-4-18 
		* @author: yuanchun
		* @title: settleRecommendCountParam 
		* @param recommendCount
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected String settleRecommendCountParam(String recommendCount) {
			Map<String,Object> recommendCountMap = JsonUtil.JsonStrToMap(recommendCount);
			log.debug("settleRecommendCountParam.recommendCountMap", recommendCountMap);
			String count = "0";
			if(!CommonUtils.objectIsNull(recommendCountMap)){
				List<Map<String,Object>> inList = (List<Map<String, Object>>) JsonUtil.getObject(recommendCountMap, "ROOT.BODY.OUT_DATA.RESULT_LIST");
				if (!CommonUtils.objectIsNull(inList)){
					for(Map<String,Object> map:inList){
						int custNum = Integer.valueOf(map.get("CUST_NUM")==null?"0":(String)map.get("CUST_NUM"));
						int stopSentNum = Integer.valueOf(map.get("STOP_SENT")==null?"0":(String)map.get("STOP_SENT"));
						int waitSentNum = Integer.valueOf(map.get("TO_BE_SENT")==null?"0":(String)map.get("TO_BE_SENT"));
						int recommendCountInt = (custNum - stopSentNum - waitSentNum);
						log.debug("settleRecommendCountParam.recommendCountInt", recommendCountInt);
						count = recommendCountInt+"";
					}
				}
			
			}
			
			return count;
		}
		
		/**
		 * 整理运营位报文参数
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: settlePostionPacketParam 
		* @param inParam
		* @param positionMap
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settlePostionPacketParam(Map<String,Object> inParam){
			Map<String,Object> tempParamMap = new HashMap<String,Object>();
			
			tempParamMap.put("contentId", (String)inParam.get("componentId"));
			tempParamMap.put("serialId", SequenceUtil.getSequence());
			
			return tempParamMap;
		}
		
		/**
		 *运营位下规则关系处理
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: settlePositionRuleRelParam 
		* @param inParam
		* @param ruleMap
		* @param channelId
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settlePositionRuleRelParam (Map<String,Object> inParam,String positionId){
			 Map<String,Object> positionRuleMap = new HashMap<String,Object>();
			 String parentRelId = (String) inParam.get("relId");
			 String relRuleId=SequenceUtil.getSequence();//生成渠道和规则关系Id
			 String ruleId=SequenceUtil.getSequence();//生成规则Id
			 positionRuleMap.put("parentComponentId",positionId);
			 positionRuleMap.put("componentId", ruleId);
			 positionRuleMap.put("relId", relRuleId);
			 positionRuleMap.put("parentRelId", parentRelId);
			 positionRuleMap.put("componentType", Const.COMPONENT_TYPE_RULE);
			 positionRuleMap.put("parentComponentType", Const.COMPONENT_TYPE_POSITION);
			 
			 return positionRuleMap;
		}
		
		/**
		 * 处理产商品和营销案关系参数
		* @date: 2016-10-12 
		* @author: wangth
		* @Title: settleProductCommodityRelParam 
		* @param inParam
		* @param marketCaseId
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleProductCommodityRelParam(Map<String,Object> inParam,String marketCaseId){
			 Map<String,Object> productCommodityMap = new HashMap<String,Object>();
			 String relId=SequenceUtil.getSequence();//生成渠道和规则关系Id
			 String productCommodityId=(String) inParam.get("productCommodityId");//生成规则Id
			 productCommodityMap.put("parentComponentId",marketCaseId);
			 productCommodityMap.put("componentId", productCommodityId);
			 productCommodityMap.put("relId", relId);
			 productCommodityMap.put("componentType", Const.COMPONENT_TYPE_PRODUCTCOMMODITY);
			 productCommodityMap.put("parentComponentType", Const.COMPONENT_TYPE_MARKETCASE);
			return productCommodityMap;
		}
		
		/**
		 * 整理规则报文参数
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: settleRulePacketParam 
		* @param inParam
		* @param ruleMap
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleRulePacketParam(Map<String,Object> inParam){
			 Map<String,Object> tempParamMap = new HashMap<String,Object>();
			
			 tempParamMap.put("ruleId", (String)inParam.get("componentId"));
			 tempParamMap.put("serialId", SequenceUtil.getSequence());
			 return tempParamMap;
		}
		
		/**
		 * 
		* @date: 2016-9-14 
		* @author: wangth
		* @Title: settleRuleDetailParam 
		* @param RuleId
		* @param inParam
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleRuleDetailParam(String ruleId,String ruleDetailId,String ruleDetailType,Map<String,Object> inParam) throws StrategyError{
			Map<String,Object> ruleInfoMap = new HashMap<String,Object>();
			//事件基本信息
			ruleInfoMap.put("ruleParName",(String)inParam.get("ruleParName"));
			ruleInfoMap.put("ruleParValue",(String)inParam.get("ruleParValue"));
			ruleInfoMap.put("ruleParCode",(String)inParam.get("ruleParCode"));
			ruleInfoMap.put("batchNo",(String)inParam.get("batchNo"));
			ruleInfoMap.put("ruleId", ruleId);
			ruleInfoMap.put("ruleDetailType", ruleDetailType);
			ruleInfoMap.put("ruleDetailId", ruleDetailId);
			ruleInfoMap.put("serialId", SequenceUtil.getSequence());
			return ruleInfoMap;
		}
		
		/**
		 * 查询统计报表营销案详情出参处理
		* @date: 2016-11-26 
		* @author: mengxi
		* @title: settleStatisticsMarketCaseDetailOutParam 
		* @param inParam
		* @param marketCaseBasicMap
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleStatisticsMarketCaseDetailOutParam(Map<String,Object> inParam,Map<String,Object> marketCaseBasicMap) throws StrategyError{
			Map<String, Object> outParam = new HashMap<String, Object>();
			
			outParam.put("marketCaseId", inParam.get("marketCaseId"));
			outParam.put("marketCaseName", marketCaseBasicMap.get("marketCaseName"));
			outParam.put("sendDate",inParam.get("sendDate"));
			outParam.put("reportDate",inParam.get("reportDate"));
			outParam.put("orderNum", inParam.get("orderNum"));
			outParam.put("sendNum", inParam.get("sendNum"));
			outParam.put("contactNum", inParam.get("contactNum"));
			
			return outParam;
		}
		
		/**
		 * 在提交营销案入库的时候，如果是临时保存，则是草稿状态，如果是提交审核，则是新建待审核状态。
		* @date: 2017-2-24 
		* @author: yuanliang
		* @title: settleStatusCodeParam 
		* @param tempInParam
		* @return 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleStatusCodeParam(Map<String,Object> tempInParam){
			//处理是否草稿状态 
			String isDraft="x";
			if(!CommonUtils.objectIsNull(tempInParam.get("isDraft"))){
				isDraft=(String) tempInParam.get("isDraft");
			}
			if(isDraft.equals(Const.IS_DRAFT)){
				tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_DRAFT);
			}else{
				tempInParam.put("statusCode", Const.MARKET_CASE_STATUS_NEW);
			}			
			return tempInParam;
		}
		
	}

	/**
	 * 查询参数整理
	* @date: 2016-9-13 
	* @author: wangth
	* @Title: QueryParamSettle 
	* @version 1.0 
	* @Description： 
	* update_version: update_date: update_author: update_note:
	 */
	protected class QueryParamSettle implements Serializable{
		
		/**
		 * 清空queryFilter 关系参数
		* @date: 2016-9-21 
		* @author: wangth
		* @Title: clearQueryFilter 
		* @param queryFilter 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected void clearQueryFilter(IQueryFilter queryFilter){
			queryFilter.setParentComponentId("");
			queryFilter.setComponentId("");
			queryFilter.setComponentType("");
			queryFilter.setParentComponentType("");
			queryFilter.setRelId("");
			queryFilter.setParentRelId("");
		}

		/**
		 * 查询内容参数整理
		* @date: 2016-9-20 
		* @author: wangth
		* @Title: settleConetentDtailParam 
		* @param queryFilter 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected void settleConetentDtailParam(Map<String,Object> positionMap,IQueryFilter queryFilter){
			queryFilter.setParentComponentType(Const.COMPONENT_TYPE_POSITION);
			queryFilter.setComponentType(Const.COMPONENT_TYPE_CONTENT);
		}
		
		/**
		 * 事件规则拼接报文参数整理
		* @date: 2016-12-2 
		* @author: mengxi
		* @title: settleEventParam 
		* @param eventTemMap
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleEventParam(Map<String,Object> eventTemMap,IQueryFilter queryFilter) throws StrategyError{
			String eventId = (String) eventTemMap.get("componentId");
			queryFilter.setEventId(eventId);
			List<Map<String,Object>> eventDetailList = this.settleSpliceEventDetailListParam(eventTemMap,queryFilter);
			Map<String,Object> eventMap = new HashMap<String,Object>();
			eventMap.put("eventId", eventId);
			eventMap.put("eventDetailList", eventDetailList);
			return eventMap;
		}
		
		/**
		 * 查询统计报表营销案详情入参处理
		* @date: 2016-11-26 
		* @author: mengxi
		* @title: settleStatisticsMarketCaseDetailFilter 
		* @param inMap
		* @param queryFilter 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected IQueryFilter settleStatisticsMarketCaseDetailFilter(Map<String,Object> inMap){
			IQueryFilter queryFilter = new QueryFilter();
			queryFilter.setMarketCaseId((String)inMap.get("marketCaseId"));
			return queryFilter;
		}
		

		/**
		 * 关系参数处理
		* @date: 2016-9-13 
		* @author: wangth
		* @Title: settleRelParam 
		* @param inParam
		* @param queryFilter 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected void settleRelParam(Map<String,Object> inParam,IQueryFilter queryFilter){
			String parentComponentId = (String) queryFilter.getChannelId();
			if (CommonUtils.objectIsNull(parentComponentId)) {
				//查询事件下的运营位，规则(吉林)
				queryFilter.setParentComponentId((String) queryFilter.getEventId());
				queryFilter.setParentComponentType(Const.COMPONENT_TYPE_EVENT);
			}else{
				//查询渠道下的运营位，规则
				queryFilter.setParentComponentId(parentComponentId);
				queryFilter.setParentComponentType(Const.COMPONENT_TYPE_CHANNEL);
			}
			String parentRelId = (String) inParam.get("relId");
			queryFilter.setParentRelId(parentRelId);
		}
		
		/**
		 * 查询批量营销案推荐量参数处理
		* @date: 2017-4-18 
		* @author: yuanchun
		* @title: settleRecommendCountParam 
		* @param inParam
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String, Object> settleRecommendCountParam(
				Map<String, Object> inParam) throws StrategyError {
			log.info("settleRecommendCountParam.inParam", inParam);
			Map<String, Object> outParam = new HashMap<String, Object>();
			String LOGIN_NO = (String) inParam.get("operNo");
			String regionCode = (String) inParam.get("regionCode");
			String actionId = (String) inParam.get("marketCaseId");
			String pin = "{\"ROOT\":{\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"\",\"ROUTE_VALUE\":\"\"},\"TRACE_ID\": \"-1\",\"CHANNEL_ID\": \"11\"},\"BODY\":{\"LOGIN_NO\":\""+LOGIN_NO+"\",\"regionCode\":\""+regionCode+"\",\"actionId\":\""+actionId+"\"}}}"; 
			outParam.put("pin", pin);
			log.info("settleRecommendCountParam.pin", pin);
			return outParam;
		}
		
		/**
		 * 渠道拼接报文参数整理
		* @date: 2016-9-14 
		* @author: wangth
		* @Title: settleSpliceChannelParam 
		* @param channelTemMap
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleSpliceChannelParam(Map<String,Object> inParam,Map<String,Object> channelTemMap,IQueryFilter queryFilter) throws StrategyError{
			String channelId = (String) channelTemMap.get("componentId");
			String custGroupChannelRelId = (String) channelTemMap.get("relId");
			Map<String,Object> channelMap = new HashMap<String,Object>();
			queryFilter.setChannelId(channelId);
			//查询渠道基本信息
			channelMap = channel.queryChannelById(inParam,queryFilter);
			channelMap.put("channelId", channelId);
			channelMap.put("relId", custGroupChannelRelId);
			
			//将查出来的关系Id赋给父关系Id查询渠道下的运营位、规则、事件
			queryParamSettle.clearQueryFilter(queryFilter);
			queryFilter.setParentRelId(custGroupChannelRelId);
			queryFilter.setParentComponentId(channelId);
			
			return channelMap;
		}
		
		/**
		 * 事件拼接报文参数整理
		* @date: 2017-2-25 
		* @author: yuanchun
		* @title: settleSpliceEventParam 
		* @param inParam
		* @param eventTemMap
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleSpliceEventParam(Map<String,Object> inParam,Map<String,Object> eventTemMap,IQueryFilter queryFilter) throws StrategyError{
			String eventId = (String) eventTemMap.get("componentId");
			String custGroupEventRelId = (String) eventTemMap.get("relId");
			queryFilter.setEventId(eventId);
			List<Map<String,Object>> eventDetailList = this.settleSpliceEventDetailListParam(eventTemMap,queryFilter);
			Map<String,Object> eventMap = new HashMap<String,Object>();
			eventMap.put("eventId", eventId);
			eventMap.put("relId", custGroupEventRelId);
			eventMap.put("eventDetailList", eventDetailList);
			
			//将查出来的关系Id赋给父关系Id查询事件下的运营位、规则
			queryParamSettle.clearQueryFilter(queryFilter);
			queryFilter.setParentRelId(custGroupEventRelId);
			queryFilter.setParentComponentId(eventId);
			
			return eventMap;
		}

		/**
		 * 客户群拼接报文参数整理
		* @date: 2016-9-14 
		* @author: wangth
		* @Title: settleSpliceCustGroupParam 
		* @param groupMap
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleSpliceCustGroupParam(Map<String,Object> inParam,Map<String,Object> groupMap,IQueryFilter queryFilter)throws StrategyError {
			String custGroupId = (String) groupMap.get("componentId");
			String relId = (String)groupMap.get("relId");
			queryFilter.setCustGroupId(custGroupId);
			//此时只是for循环里的一个客户群
			Map<String,Object> custGroupMap = custGroup.queryCustGroupById(groupMap,queryFilter);
			custGroupMap.put("relId", relId);
			queryParamSettle.clearQueryFilter(queryFilter);
			queryFilter.setParentRelId(relId);
			queryFilter.setParentComponentId(custGroupId);
			return custGroupMap;
		}
		
		/**
		 * 处理 拼接事件规则详细列表参数
		* @date: 2016-12-2 
		* @author: mengxi
		* @title: settleSpliceEventDetailListParam 
		* @param inParam
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @exception: 
		* @version: 1.0 
		* @description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected List<Map<String,Object>> settleSpliceEventDetailListParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
			queryFilter.setEventDetailId("");
			List<Map<String,Object>> eventDetailIdList = (List<Map<String, Object>>) event.queryEventDetailId(inParam,queryFilter);
			List<Map<String,Object>> eventDetailList = new ArrayList<Map<String,Object>>();
			
			if(!CommonUtils.objectIsNull(eventDetailIdList)){
				for(Map<String,Object> eventDetailIdMap:eventDetailIdList){
					Map<String,Object> tempEventMap = new HashMap<String,Object>();
					String eventDetailId = (String)eventDetailIdMap.get("eventDetailId");
					queryFilter.setEventDetailId(eventDetailId);
					List<Map<String,Object>> eventParams =(List<Map<String, Object>>) event.queryEventDetail(inParam,queryFilter);
					
					tempEventMap.put("eventDetailId", eventDetailId);
					tempEventMap.put("eventDetailType",(String)eventDetailIdMap.get("eventDetailType"));
					tempEventMap.put("params", eventParams);
					eventDetailList.add(tempEventMap);
				}
			}
			return eventDetailList;
		}

		/**
		 * 事件拼接报文参数整理
		* @date: 2016-9-14 
		* @author: wangth
		* @Title: settleSpliceEventParam 
		* @param ruleTemMap
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@SuppressWarnings("unchecked")
		protected Map<String,Object> settleSpliceEventParam(Map<String,Object> eventTemMap,IQueryFilter queryFilter) throws StrategyError{
			String eventId = (String) eventTemMap.get("componentId");
			String eventDetailId = "";
			queryFilter.setEventId(eventId);
			//查询事件的基本信息
			Map<String,Object> eventMap = event.queryEvent(null,queryFilter);
			List<Map<String,Object>> eventDetailList = (List<Map<String, Object>>) eventTemMap.get("eventDetailList");
			if(!CommonUtils.objectIsNull(eventDetailList)){
				for(Map<String,Object> eventDetailIdMap:eventDetailList){
					eventDetailId = (String) eventDetailIdMap.get("eventDetailId");
				}
			}
			eventMap.put("eventDetailId", eventDetailId);
			
			return eventMap;
		}
		
		/**
		 * 运营位报文参数拼接
		* @date: 2016-9-14 
		* @author: wangth
		* @Title: settleSplicePositionParam 
		* @param positionTemMap
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleSplicePositionParam(Map<String,Object> positionTemMap,IQueryFilter queryFilter) throws StrategyError{
			String positionId = (String) positionTemMap.get("componentId");
			String positionRelId = (String) positionTemMap.get("relId");
			Map<String,Object> positionMap = new HashMap<String,Object>();
			queryFilter.setPositionId(positionId);
			//查询运营位的基本信息
			positionMap = position.queryPositionById(null,queryFilter);
			positionMap.put("positionId", positionId);
			
			queryFilter.setParentRelId(positionRelId);
			queryFilter.setParentComponentId(positionId);
			
			return positionMap;
		}
		
		/**
		 * 
		* @date: 2016-10-12 
		* @author: wangth
		* @Title: settleSpliceProductCommodityParam 
		* @return 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		@SuppressWarnings("unchecked")
		protected Map<String,Object> settleSpliceProductCommodityParam(Map<String,Object> inParam,Map<String,Object> productMap,IQueryFilter queryFilter) throws StrategyError{
			String productCommodityId = (String) productMap.get("componentId");
			queryFilter.setProductCommodityId(productCommodityId);

			Map<String,Object> productCommodityMap = productCommodity.queryProductCommodityList(inParam, queryFilter, null);
			return ((List<Map<String, Object>>) productCommodityMap.get("productCommodityList")).get(0);
		}
			
		
		/**
		 * 规则拼接报文参数整理
		* @date: 2016-9-14 
		* @author: wangth
		* @Title: settleSpliceRuleParam 
		* @param ruleTemMap
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected Map<String,Object> settleSpliceRuleParam(Map<String,Object> ruleTemMap,IQueryFilter queryFilter) throws StrategyError{
			String ruleId = (String) ruleTemMap.get("componentId");
			queryFilter.setRuleId(ruleId);
			List<Map<String,Object>> ruleDetailList = this.settleSpliceRuleDetailListParam(ruleTemMap,queryFilter);
			Map<String,Object> ruleMap = new HashMap<String,Object>();
			ruleMap.put("ruleId", ruleId);
			ruleMap.put("ruleDetailList", ruleDetailList);
			return ruleMap;
		}
		
		/**
		 * 处理 拼接规则详细列表参数
		* @date: 2016-10-7 
		* @author: wangth
		* @Title: settleSpliceRuleDetailListParam 
		* @param ruleTemMap
		* @param queryFilter
		* @return
		* @throws StrategyError 
		* @version 1.0 
		* @Description: 
		* update_version: update_date: update_author: update_note:
		 */
		protected List<Map<String,Object>> settleSpliceRuleDetailListParam(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
			queryFilter.setRuleDetailId("");
			queryFilter.setChannelId("");
			IQueryFilter newQueryFilter = new QueryFilter();
			newQueryFilter.setRuleId(queryFilter.getRuleId());
			//从规则详情表查询出规则ruleDetailId，ruleDetailType。   ruleDetailId用于查询对应的  params[]
			List<Map<String,Object>> ruleDetailIdList = (List<Map<String, Object>>) rule.queryRuleDetailId(inParam,newQueryFilter);
			List<Map<String,Object>> ruleDetailList = new ArrayList<Map<String,Object>>();
			
			if(!CommonUtils.objectIsNull(ruleDetailIdList)){
				for(Map<String,Object> ruleDetailIdMap:ruleDetailIdList){
					Map<String,Object> tempRuleMap = new HashMap<String,Object>();
					
					String ruleDetailId = (String)ruleDetailIdMap.get("ruleDetailId");
					queryFilter.setRuleDetailId(ruleDetailId);
					//之前使用newQueryFilter，现改为queryFilter  渠道触发时查询条件为(ruleId)  事件触发时查询条件(ruleId,ruleDetailId)
					List<Map<String,Object>> ruleParams =(List<Map<String, Object>>) rule.queryRuleDetail(inParam,queryFilter);
					
					tempRuleMap.put("ruleDetailId", ruleDetailId);
					tempRuleMap.put("ruleDetailType", (String)ruleDetailIdMap.get("ruleDetailType"));
					tempRuleMap.put("params", ruleParams);
					ruleDetailList.add(tempRuleMap);
				}
			}
			return ruleDetailList;
		}
	}

	/**
	 * 批量发送任务营销案缓存意外终止队列恢复
	* @date: 2017-5-4 
	* @author: chenhao
	* @title: MarketCaseRpoplpushRecover 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void MarketCaseRpoplpushRecover(String taskType) throws StrategyError {
		//查询待生成push营销案tmp缓存
		log.info("====TmpListTaskType=====", taskType);
		List<Map<String, Object>> TmpList = marketCaseSelector.getWaitCreateBatchPushMarketCaseFromTmpCache(taskType);
		log.info("=====TmpList=====", TmpList);
		//判断tmp缓存是否拥有失败任务
		if(!CommonUtils.objectIsNull(TmpList)){
			//失败任务恢复至push营销案缓存
			Map<String,Object> tempMap = new HashMap<String,Object>();
			if(Const.BATCHPUSHMSG.equals(taskType)) 
				tempMap.put("waitCreateBatchPushMsgMarketCase", TmpList);
			else if(Const.BATCHPUSHPROD.equals(taskType))
				tempMap.put("waitCreateBatchPushProdMarketCase", TmpList);
			marketCaseInsertor.addWaitCreateBatchPushMarketCaseToCache(tempMap,taskType);
			log.info("addWaitCreateBatchPushMarketCaseToCache", tempMap);
			//删除Tmplist缓存
			marketCaseDeleter.rmWaitCreateBatchPushMarketCaseTmpList(taskType);
			log.info("rmWaitCreateBatchPushMarketCaseTmpList", taskType);
		}
	}

}
