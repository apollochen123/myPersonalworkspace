package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IContent;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 内容对象
* @date: 2016-9-5 
* @author: yangwl
* @title: Content 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class Content extends BaseClass implements IContent, Serializable {
	
	/**
	 * 删除营销案对象
	 */
	protected IDataDeleter.IMarketCaseDeleter marketCaseDeleter;
	
	/**
	 * 插入营销案对象
	 */
	protected IDataInsertor.IMarketCaseInsertor marketCaseInsertor;
	
	/**
	 * 查询营销案对象
	 */
	protected IDataSelector.IMarketCaseSelector marketCaseSelector;
	
	/**
	 * 更新营销案对象
	 */
	protected IDataUpdater.IMarketCaseUpdater marketCaseUpdater;
	
	/**
	 * 内容查询对象
	 */
	protected IDataSelector.IContentSelector contentSelector;
	
	/**
	 * 插入内容对象
	 */
	protected IDataInsertor.IContentInsertor contentInsertor;
	
	/**
	 * 更新内容对象
	 */
	protected IDataUpdater.IContentUpdater contentUpdater;
	
	/**
	 * 删除内容对象
	 */
	protected IDataDeleter.IContentDeleter contentDeleter;

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
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setContentSelector 
	* @param contentSelector 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setContentSelector(IDataSelector.IContentSelector contentSelector) {
		this.contentSelector = contentSelector;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setContentInsertor 
	* @param contentInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setContentInsertor(IDataInsertor.IContentInsertor contentInsertor) {
		this.contentInsertor = contentInsertor;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setContentUpdater 
	* @param contentUpdater 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setContentUpdater(IDataUpdater.IContentUpdater contentUpdater) {
		this.contentUpdater = contentUpdater;
	}
	
	/**
	 * 
	* @date: 2016年9月5日 
	* @author: wangth
	* @Title: setContentDeleter 
	* @param contentDeleter 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setContentDeleter(IDataDeleter.IContentDeleter contentDeleter) {
		this.contentDeleter = contentDeleter;
	}
	
	/**
	 * 添加内容基本信息
	* @date: 2016-9-20 
	* @author: wangth
	* @Title: addContentInfo 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addContentInfo(Map<String, Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
		contentInsertor.insertContentInfo(inParam,tempInParam);
	}
	
	/** 保存运营位内容
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: addContentInfoByPosition 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> addContentInfoByPosition(Map<String, Object> inParam) throws StrategyError {
		List<Map<String, Object>> custGroupList = (List<Map<String, Object>>) inParam.get("custGroupList");
		Map<String, Object>  contentInfo = (Map<String, Object>) inParam.get("contentInfo");
		List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
		if (!CommonUtils.objectIsNull(custGroupList)) {
			for (Map<String, Object> custGroup : custGroupList) {
				String marketCaseCustGrouprelId = (String)custGroup.get("relId");
				String custGroupId = (String)custGroup.get("custGroupId");
				Map<String, Object> param = new HashMap<String, Object>();
				param.put("marketCaseCustGrouprelId", marketCaseCustGrouprelId);
				param.put("custGroupId", custGroupId);
				Map<String,Object> out = this.addPositionAndContent(param, contentInfo);
				outList.add(out);
			}
		}
		Map<String,Object> outMap = new HashMap<String, Object>();
		outMap.put("outList", outList);
		return outMap;
	}
	/**
	 * 保存事件或渠道下运营位信息
	* @date: 2017-2-23 
	* @author: zhangyw_crmpd
	* @title: addContentInfoForEventOrChannel 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> addContentInfoForEventOrChannel(Map<String, Object> inParam) throws StrategyError {
		List<Map<String, Object>> custGroupList = (List<Map<String, Object>>) inParam.get("custGroupList");
		Map<String, Object>  contentInfo = (Map<String, Object>) inParam.get("contentInfo");
		List<Map<String, Object>> outList = new ArrayList<Map<String,Object>>();
		if (!CommonUtils.objectIsNull(custGroupList)) {
			for (Map<String, Object> custGroup : custGroupList) {
				String marketCaseCustGrouprelId = (String)custGroup.get("relId");
				String custGroupId = (String)custGroup.get("custGroupId");
				Map<String, Object> param = new HashMap<String, Object>();
				param.put("marketCaseCustGrouprelId", marketCaseCustGrouprelId);
				param.put("custGroupId", custGroupId);
				Map<String,Object> out = this.addPositionAndContentForEventOrChannel(param, contentInfo);
				outList.add(out);
			}
		}
		Map<String,Object> outMap = new HashMap<String, Object>();
		outMap.put("outList", outList);
		return outMap;
	}
	
	/**
	 *添加内容详细信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryProdList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addContentDetail(Map<String, Object> inParam,Map<String,Object> tempInParam) throws StrategyError {
		contentInsertor.insertContentDetailInfo(inParam,tempInParam);
	}
	
	/**
	 * 解析缴费事件ID和内容明细
	* @date: 2017-3-7 
	* @author: sunliang 
	* @title: parsePayFeeEventIdAndMarketCaseIdReAndContentDetail 
	* @param payFeeEventIdAndMarketCaseIdRelAndEventDetail
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> parsePayFeeEventIdAndMarketCaseIdReAndContentDetail(
			List<Map<String, Object>> payFeeEventIdAndMarketCaseIdRelAndEventDetailList)
			throws StrategyError {
		List<Map<String, Object>> retList = new ArrayList<Map<String,Object>>();
		Map<String,Object> tempParam = new HashMap<String,Object>();
		for(Map<String, Object> map : payFeeEventIdAndMarketCaseIdRelAndEventDetailList){
				
			tempParam.put("eventId", map.get("eventId"));
			tempParam.put("marketCaseId", map.get("marketCaseId"));
			log.debug("parsePayFeeEventIdAndMarketCaseIdReAndContentDetail.tempParam", tempParam);
			List<Map<String,Object>> contentList = contentSelector.selectContentDetailsByEventIdAndMarketCaseId(tempParam);
			log.debug("parsePayFeeEventIdAndMarketCaseIdReAndContentDetail.contentList", contentList);
			
			Map<String,Object> retMap = new HashMap<String,Object>();
			for(Map<String,Object> contentDetailMap : contentList){
				if("offerMoney".equals((String)contentDetailMap.get("contentParCode"))){
					retMap.put("offerMoney", (String)contentDetailMap.get("contentParValue"));
				}
			}
			if(retMap.get("offerMoney") == null){
				retMap.put("offerMoney", "0");
			}
			
			retMap.put("feePayStart", map.get("feePayStart"));
			retMap.put("feePayEnd", map.get("feePayEnd"));
			retMap.put("marketCaseId", map.get("marketCaseId"));
			retMap.put("eventId", map.get("eventId"));
			
			log.debug("parsePayFeeEventIdAndMarketCaseIdReAndContentDetail.retMap", retMap);
			retList.add(retMap);
				
		}
		
		return retList;
	}
	
	/**
	 *查询产品列表 
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryProdList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryProdList(Map<String, Object> inParam) throws StrategyError {
		contentSelector.selectProdList(inParam);
		return null;
	}
	
	/**
	 *查询内容详细信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryProdList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @return 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryContentDetail(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		List<Map<String,Object>> contentDetailList = (List<Map<String, Object>>) contentSelector.selectContentDetailList(inParam,queryFilter);
		return contentDetailList;
	}
	
	/**
	 * 查询内容详细信息Id
	* @date: 2016-10-7 
	* @author: wangth
	* @Title: queryContentDetailId 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> queryContentDetailId(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		List<Map<String,Object>> contentDetailIdList = (List<Map<String, Object>>) contentSelector.selectContentDetailId(inParam,queryFilter);
		return contentDetailIdList;
	}
	
	/**
	 *查询内容信息 
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryContentById 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryContentById(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		//根据内容Id查询内容的详细信息
		Map<String,Object> contentInfoMap = this.queryContentInfo(inParam,queryFilter);
		List<Map<String,Object>> contentDetailList = this.queryContentDetail(inParam,queryFilter);
		
		Map<String,Object> contentMap = new HashMap<String,Object>();
		contentMap.put("contentInfoMap", contentInfoMap);
		contentMap.put("contentDetailList", contentDetailList);
		return contentMap;
	}
	
	/**
	 *  移除内容信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: removeContentById 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeContentById(Map<String,Object> inParam) throws StrategyError {
		this.removeContentInfo(inParam);
		this.removeContentDetail(inParam);
	}

	/** 
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: removePositionAndContent 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public void removePositionAndContent(Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> tempParam = new HashMap<String, Object>();
		tempParam.put("parentComponentId", inParam.get("positionId"));
		tempParam.put("componentId", inParam.get("contentId"));
		tempParam.put("parentComponentType", Const.COMPONENT_TYPE_POSITION);
		tempParam.put("componentType", Const.COMPONENT_TYPE_CONTENT);
		
		Map<String, Object> positionContentRel = this.queryRelation(tempParam);
		if (!CommonUtils.objectIsNull(positionContentRel)) {
			String channelPositionRekId = (String) positionContentRel.get("parentRelId");
			contentDeleter.deleteRelation(tempParam);
			tempParam = new HashMap<String, Object>();
			tempParam.put("relId", channelPositionRekId);
			contentDeleter.deleteRelation(tempParam);
		}
	}

	/**
	 *更新内容信息  
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: updateContentById 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateContentById(Map<String,Object> inParam) throws StrategyError {
		this.updateContentInfo(inParam);
		this.updateContentDetail(inParam);
	}
	
	/** 增加运营位及内容
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: addPositionAndContent 
	* @param inParam
	* @param content
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String,Object> addPositionAndContent(Map<String,Object> inParam,Map<String,Object> content) throws StrategyError{
		
		String marketCaseCustGrouprelId = (String) inParam.get("marketCaseCustGrouprelId");
		String custGroupId = (String) inParam.get("custGroupId");
		String channelId = (String) content.get("channelId");
		String positionId = (String) content.get("positionId");
		String contentDetailId = (String) content.get("contentDetailId");

		String custGroupChannelRelId = "";
		String channelPositionRelId = "";
		String contentId = "";
		
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
			contentInsertor.insertRelation(newInParam, newInParam);
		}else{
			custGroupChannelRelId = (String) custGroupChannelRel.get("relId");
		}
		newInParam = new HashMap<String, Object>();
		newInParam.put("parentRelId", custGroupChannelRelId);
		newInParam.put("parentComponentId", channelId);
		newInParam.put("componentId", positionId);
		newInParam.put("parentComponentType", Const.COMPONENT_TYPE_CHANNEL);
		newInParam.put("componentType", Const.COMPONENT_TYPE_POSITION);
		//查询此渠道是否关联此运营位
		Map<String,Object> channelPositionRel = this.queryRelation(newInParam);
		if (CommonUtils.objectIsNull(channelPositionRel)) {
			channelPositionRelId = SequenceUtil.getSequence();
			newInParam.put("relId", channelPositionRelId);
			contentInsertor.insertRelation(newInParam, newInParam);
		}else{
			channelPositionRelId = (String)channelPositionRel.get("relId");
		}
		
		newInParam = new HashMap<String, Object>();
		newInParam.put("parentRelId", channelPositionRelId);
		newInParam.put("parentComponentId", positionId);
		newInParam.put("parentComponentType", Const.COMPONENT_TYPE_POSITION);
		newInParam.put("componentType", Const.COMPONENT_TYPE_CONTENT);
		//查询词运营位是否关联内容
		Map<String,Object> positionContentRel = this.queryRelation(newInParam);
		if (CommonUtils.objectIsNull(positionContentRel)) {
			contentId = SequenceUtil.getSequence();
			newInParam.put("componentId", contentId);
			newInParam.put("relId", SequenceUtil.getSequence());
			contentInsertor.insertRelation(newInParam, newInParam);
			Map<String,Object> tempInParam = new HashMap<String, Object>();
			tempInParam .put("serialId", SequenceUtil.getSequence());
			tempInParam .put("contentId", contentId);
			contentInsertor.insertContentInfo(tempInParam, tempInParam);
		}else{
			contentId = (String)positionContentRel.get("componentId");
			Map<String,Object> in = new HashMap<String, Object>();
			in.put("contentId", contentId);
			contentDeleter.deleteContentDetailInfo(in);
		}
		if (CommonUtils.objectIsNull(contentDetailId)) {
			contentDetailId = SequenceUtil.getSequence();
		}
		List<Map<String,Object>> params = (List<Map<String, Object>>) content.get("params");
		for (Map<String, Object> map : params) {
			map.put("serialId", SequenceUtil.getSequence());
			map.put("contentId", contentId);
			map.put("contentDetailId", contentDetailId);
			contentInsertor.insertContentDetailInfo(map, map);
		}
		Map<String,Object> out = new HashMap<String, Object>();
		out.put("marketCasecustGroupRelId", marketCaseCustGrouprelId);
		out.put("custGroupChannelRelId", custGroupChannelRelId);
		out.put("custGroupId", custGroupId);
		out.put("channelId", channelId);
		out.put("positionId", positionId);
		out.put("contentId", contentId);
		out.put("contentDetailId", contentDetailId);
		return out;
	}
	
	/**
	 * 保存事件或渠道下运营位信息
	* @date: 2017-2-23 
	* @author: zhangyw_crmpd
	* @title: addPositionAndContentForEventOrChannel 
	* @param inParam
	* @param content
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> addPositionAndContentForEventOrChannel(Map<String,Object> inParam,Map<String,Object> content) throws StrategyError{
		
		String marketCaseCustGrouprelId = (String) inParam.get("marketCaseCustGrouprelId");
		String custGroupId = (String) inParam.get("custGroupId");
		String channelId = (String) content.get("channelId");
		String eventId = (String) content.get("eventId");
		String positionId = (String) content.get("positionId");
		String contentDetailId = (String) content.get("contentDetailId");

		String custGroupChannelRelId = "";
		String channelPositionRelId = "";
		String contentId = "";
		
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
		
		//查询客户群是否已关联此事件或渠道
		Map<String,Object> custGroupChannelRel = this.queryRelation(newInParam);
		if (CommonUtils.objectIsNull(custGroupChannelRel)) {
			custGroupChannelRelId = SequenceUtil.getSequence();
			newInParam.put("relId", custGroupChannelRelId);
			contentInsertor.insertRelation(newInParam, newInParam);
		}else{
			custGroupChannelRelId = (String) custGroupChannelRel.get("relId");
		}
		newInParam = new HashMap<String, Object>();
		newInParam.put("parentRelId", custGroupChannelRelId);
		if(CommonUtils.objectIsNull(eventId)){
			newInParam.put("parentComponentId", channelId);
			newInParam.put("parentComponentType", Const.COMPONENT_TYPE_CHANNEL);
		}else{
			newInParam.put("parentComponentId", eventId);
			newInParam.put("parentComponentType", Const.COMPONENT_TYPE_EVENT);
		}
		newInParam.put("componentId", positionId);
		newInParam.put("componentType", Const.COMPONENT_TYPE_POSITION);
		//查询此渠道是否关联此运营位
		Map<String,Object> channelPositionRel = this.queryRelation(newInParam);
		if (CommonUtils.objectIsNull(channelPositionRel)) {
			channelPositionRelId = SequenceUtil.getSequence();
			newInParam.put("relId", channelPositionRelId);
			contentInsertor.insertRelation(newInParam, newInParam);
		}else{
			channelPositionRelId = (String)channelPositionRel.get("relId");
		}
		
		newInParam = new HashMap<String, Object>();
		newInParam.put("parentRelId", channelPositionRelId);
		newInParam.put("parentComponentId", positionId);
		newInParam.put("parentComponentType", Const.COMPONENT_TYPE_POSITION);
		newInParam.put("componentType", Const.COMPONENT_TYPE_CONTENT);
		//查询词运营位是否关联内容
		Map<String,Object> positionContentRel = this.queryRelation(newInParam);
		if (CommonUtils.objectIsNull(positionContentRel)) {
			contentId = SequenceUtil.getSequence();
			newInParam.put("componentId", contentId);
			newInParam.put("relId", SequenceUtil.getSequence());
			contentInsertor.insertRelation(newInParam, newInParam);
			Map<String,Object> tempInParam = new HashMap<String, Object>();
			tempInParam .put("serialId", SequenceUtil.getSequence());
			tempInParam .put("contentId", contentId);
			contentInsertor.insertContentInfo(tempInParam, tempInParam);
		}else{
			contentId = (String)positionContentRel.get("componentId");
			Map<String,Object> in = new HashMap<String, Object>();
			in.put("contentId", contentId);
			contentDeleter.deleteContentDetailInfo(in);
		}
		if (CommonUtils.objectIsNull(contentDetailId)) {
			contentDetailId = SequenceUtil.getSequence();
		}
		List<Map<String,Object>> params = (List<Map<String, Object>>) content.get("params");
		for (Map<String, Object> map : params) {
			map.put("serialId", SequenceUtil.getSequence());
			map.put("contentId", contentId);
			map.put("contentDetailId", contentDetailId);
			contentInsertor.insertContentDetailInfo(map, map);
		}
		Map<String,Object> out = new HashMap<String, Object>();
		out.put("marketCasecustGroupRelId", marketCaseCustGrouprelId);
		out.put("custGroupChannelRelId", custGroupChannelRelId);
		out.put("custGroupId", custGroupId);
		out.put("channelId", channelId);
		out.put("eventId", eventId);
		out.put("positionId", positionId);
		out.put("contentId", contentId);
		out.put("contentDetailId", contentDetailId);
		return out;
	}
	
	/**
	 *查询内容基本信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryProdList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @return 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> queryContentInfo(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		Map<String,Object> contentInfoMap = contentSelector.selectContentInfo(inParam,queryFilter);
		return contentInfoMap;
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
		return contentSelector.selectRelation(inParam, queryFilter);
	}
	/**
	 *移除内容详细信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryProdList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void removeContentDetail(Map<String,Object> inParam) throws StrategyError {
		contentDeleter.deleteContentDetailInfo(inParam);
	}

	/**
	 *移除内容基本信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryProdList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void removeContentInfo(Map<String,Object> inParam) throws StrategyError {
		contentDeleter.deleteContentInfo(inParam);
	}

	/**
	 *更新内容详细信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryProdList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void updateContentDetail(Map<String, Object> inParam) throws StrategyError {
		contentUpdater.updateContentDetailInfo(inParam);
	}

	/**
	 *更新内容基本信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryProdList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void updateContentInfo(Map<String,Object> inParam) throws StrategyError {
		contentUpdater.updateContentInfo(inParam);
	}

}
