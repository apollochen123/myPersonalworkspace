package com.sitech.strategy.manage.entity.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IContent;
import com.sitech.strategy.core.pojo.impl.ResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IContentManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 内容实体
* @date: 2016-9-5 
* @author: sunliang
* @title: ContentManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ContentManageEntity extends BaseManageEntity implements IContentManageEntity {
	
	/**
	 * 内容对象
	 */
	protected IContent content;
	/**
	 * 内容查询对象
	 */
	protected IDataSelector.IContentSelector contentSelector;
	/**
	 * 调查问卷查询
	 */
	protected IDataSelector.IQuestionNaireSelector questionNaireSelector;
	/**
	 * 模板查询对象
	 */
	protected IDataInsertor.ITemplateInsertor templateInsertor;	
	/**
	 * 查询列表对象
	 */
	protected ResultList resultList;	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: setContentSelector 
	* @param contentSelector 
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setContentSelector(IDataSelector.IContentSelector contentSelector) {
		this.contentSelector = contentSelector;
	}
	/**
	 * 
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: setQuestionNaireSelector 
	* @param questionNaireSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setQuestionNaireSelector(
			IDataSelector.IQuestionNaireSelector questionNaireSelector) {
		this.questionNaireSelector = questionNaireSelector;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: setTemplateInsertor 
	* @param templateInsertor 
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTemplateInsertor(IDataInsertor.ITemplateInsertor templateInsertor) {
		this.templateInsertor = templateInsertor;
	}
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: setContent 
	* @param content 
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setContent(IContent content) {
		this.content = content;
	}

	/**
	 * 
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: setResultList 
	* @param resultList 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setResultList(ResultList resultList) {
		this.resultList = resultList;
	}

	/** 
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: queryContentDetailByDetailId 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> queryContentDetailByDetailId(Map<String, Object> inParam) throws StrategyError {
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setContentId((String) inParam.get("contentId"));
		queryFilter.setContentDetailId((String) inParam.get("contentDetailId"));
		List<Map<String, Object>> params = content.queryContentDetail(inParam, queryFilter);
		Map<String, Object> outParam = new HashMap<String, Object>();
		outParam.put("params", params);
		outParam.put("contentId", (String) inParam.get("contentId"));
		outParam.put("contentDetailId", (String) inParam.get("contentDetailId"));
		return outParam;
	}

	/**
	 * 查询营销用语模板列表
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryMarketTermTempList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketTermTempList(Map<String, Object> inParam)
			throws StrategyError {
		QueryFilter queryFilter = this.settleMarketTermTempListFilter(inParam);
		Map<String, Object> outMap = (Map<String,Object>) contentSelector.selectMarketCaseTermList(inParam,queryFilter);
		return outMap;
	}

	/**
	 * 查询产品列表
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryProdList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryProdList(Map<String, Object> inParam)
			throws StrategyError {
		Map<String, Object> outMap = content.queryProdList(inParam);
		return outMap;
	}
	
	/**
	 * 查询问卷调查列表
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: queryQuestionNaireList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryQuestionNaireList(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = this.settleQuestionNaireListFilter(inParam);

		IPagingDevice pagingDevice = this.settleQuestionNaireListPagingDevice(inParam);
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter, null, pagingDevice);
		Map<String,Object> outMap = this.getQuestionNaireListByPagingDevice(pagingDeviceTmp);		
		return outMap;
	}
	/**
	 * 根据主键查询问卷调查信息
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: queryQuestionNaireById 
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
	public Map<String,Object> queryQuestionNaireById(Map<String,Object> inParam)throws StrategyError{
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setQuestionId((String) inParam.get("questionId"));		
		return questionNaireSelector.selectQuestionNaireById(inParam, queryFilter);
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
	public void removePositionAndContent(Map<String, Object> inParam)
			throws StrategyError {
		content.removePositionAndContent(inParam);
	}

	/** 
	* @date: 2016-10-18 
	* @author: wangpei
	* @title: saveContentInfoByPosition 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> saveContentInfoByPosition(Map<String, Object> inParam) throws StrategyError {
		return content.addContentInfoByPosition(inParam);
	}

	/**
	 * 保存事件或渠道下的运营位信息
	* @date: 2017-2-23 
	* @author: zhangyw_crmpd
	* @title: saveContentInfoForEventOrChannel 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> saveContentInfoForEventOrChannel(Map<String, Object> inParam) throws StrategyError {
		return content.addContentInfoForEventOrChannel(inParam);
	}
	
	/**
	 * 保存营销用语模板
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: saveMarketTermTemp 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveMarketTermTemp(Map<String, Object> inParam)
			throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		templateInsertor.insertTemplate(inParam,tempInParam);
	}
	
	/**
	 * PagingDevice取出结果放入Map
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: getMarketCaseAuditListByPagingDevice 
	* @param pagingDeviceTmp
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getQuestionNaireListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("questionNaireList", pagingDeviceTmp.getPerPageInfo());
		outMap.put("queryId", pagingDeviceTmp.getQueryId());
		return outMap;
	}

	/**
	 * 形成QueryFilter对象
	* @date: 2016-10-6 
	* @author: tangaq
	* @title: settleMarketTermTempListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected QueryFilter settleMarketTermTempListFilter(Map<String, Object> inParam){
		return null;
	}
	
	/**
	 * 形成QueryFilter对象
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: settleProdListFilter 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected QueryFilter settleProdListFilter(Map<String, Object> inParam){
		return null;
	}

	/**
	 * 生成IQueryFilter对象
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: settleQuestionNaireListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleQuestionNaireListFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setKeyWords((List<String>)inParam.get("keyWords"));
		queryFilter.setChannelType((String) inParam.get("channelType"));

		return queryFilter;
	}
	/**
	 * 分页信息
	* @date: 2016-12-21 
	* @author: yuanliang
	* @title: settleMarketCaseAuditListPagingDevice 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleQuestionNaireListPagingDevice(Map<String, Object> inParam){
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPageCode = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		pagingDevice.setQueryId((String)inParam.get("queryId"));
		
		if(CommonUtils.objectIsNull(currentPageCode)==true){
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}else{
			pagingDevice.setCurrentPageCode(Integer.parseInt(currentPageCode));
		}
	
		if(CommonUtils.objectIsNull(perRecordCount)==true){
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}else{
			pagingDevice.setPerRecordCount(Integer.parseInt(perRecordCount));
	
		}
		
		if(CommonUtils.objectIsNull(totalRecordCount)==true){
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}else{
			pagingDevice.setTotalRecordCount(Integer.parseInt(totalRecordCount));
	
		}
		return pagingDevice;
	}
	
} 
