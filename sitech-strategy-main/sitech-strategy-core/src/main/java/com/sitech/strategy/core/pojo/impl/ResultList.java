package com.sitech.strategy.core.pojo.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.ResultItemPojo;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IActDemand;
import com.sitech.strategy.core.objectville.inter.IAudit;
import com.sitech.strategy.core.objectville.inter.IChannel;
import com.sitech.strategy.core.objectville.inter.ICustGroup;
import com.sitech.strategy.core.objectville.inter.IEvaluate;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.objectville.inter.IPosition;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.core.objectville.inter.IShortMessage;
import com.sitech.strategy.core.objectville.inter.ITemplate;
import com.sitech.strategy.core.objectville.inter.IUser;
import com.sitech.strategy.core.pojo.inter.IResultList;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 查询结果列表对象
* @date: 2016-9-5 
* @author: sunliang 
* @title: ResultList 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ResultList extends BaseClass implements IResultList{
	/**
	 * 活动需求对象
	 */
	protected IActDemand actDemand;
	/**
	 * 审批对象
	 */
	protected IAudit audit;
	/**
	 * 渠道对象
	 */
	protected IChannel channel;
	/**
	 * 选项配置查询
	 */
	protected IDataSelector.IConfigSelector configSelector;
	/**
	 * 公用数据插入器
	 */
	protected IDataInsertor.ICommonInsertor commonInsertor;
	/**
	 * 公用数据查询器
	 */
	protected IDataSelector.ICommonSelector commonSelector;
	/**
	 * 目标客户群对象
	 */
	protected ICustGroup custGroup;
	/**
	 * 评估(报表)对象
	 */
	protected IEvaluate evaluate;
	/**
	 * 角色查询
	 */
	protected IDataSelector.ILoginSelector loginSelector;
	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * 分页器对象
	 */
	protected IPagingDevice pagingDevice;
	/**
	 * 运营位对象
	 */
	protected IPosition position;
	/**
	 * 产品查询
	 */
	protected IDataSelector.IProductSelector productSelector;
	/**
	 * 调查问卷查询
	 */
	protected IDataSelector.IQuestionNaireSelector questionNaireSelector;	
	/**
	 * 规则配置对象
	 */
	protected IRule rule;
	/**
	 * 短信对象
	 */
	protected IShortMessage shortMessage;
	/**
	 * 模板对象
	 */
	protected ITemplate template;
	/**
	 * 用户对象
	 */
	protected IUser user;
	/**
	 * 作业配置查询
	 */
	protected IDataSelector.IWorkConfigSelector workConfigSelector;
	
	/**
	 * 
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: setActDemand 
	* @param actDemand 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setActDemand(IActDemand actDemand) {
		this.actDemand = actDemand;
	}

	/**
	 * 
	* @title: setAudit 
	* @param audit 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAudit(IAudit audit) {
		 this.audit = audit;
	}

	/**
	 * 
	* @date: 2016-10-21 
	* @author: yangwl
	* @title: setChannel 
	* @param channel 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setChannel(IChannel channel) {
		this.channel = channel;
	}

	/** 
	 * @date: 2016-11-1 
	 * @author: xiongxq
	 * @Title: setConfigSelector 
	 * @param configSelector the configSelector to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setConfigSelector(IDataSelector.IConfigSelector configSelector) {
		this.configSelector = configSelector;
	}

	/**
	 * 
	* @date: 2016-10-21 
	* @author: yangwl
	* @title: setCommonInsertor 
	* @param commonInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCommonInsertor(IDataInsertor.ICommonInsertor commonInsertor) {
		this.commonInsertor = commonInsertor;
	}

	/**
	 * 
	* @date: 2016-10-21 
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
	 * 
	* @date: 2016-10-21 
	* @author: yangwl
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
	 * @date: 2016-11-21 
	 * @author: xiongxq
	 * @Title: setEvaluate 
	 * @param evaluate the evaluate to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setEvaluate(IEvaluate evaluate) {
		this.evaluate = evaluate;
	}

	/** 
	 * @date: 2016-11-1 
	 * @author: xiongxq
	 * @Title: setLoginSelector 
	 * @param loginSelector the loginSelector to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setLoginSelector(IDataSelector.ILoginSelector loginSelector) {
		this.loginSelector = loginSelector;
	}

	/**
	 * 
	* @date: 2016-10-21 
	* @author: yangwl
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
	* @date: 2016-10-21 
	* @author: yangwl
	* @title: setPagingDevice 
	* @param pagingDevice 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPagingDevice(IPagingDevice pagingDevice) {
		this.pagingDevice = pagingDevice;
	}

	/**
	 * 
	* @date: 2016-10-21 
	* @author: yangwl
	* @title: setPosition 
	* @param position 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setPosition(IPosition position) {
		this.position = position;
	}

	/**
	 * 
	* @date: 2016-10-21 
	* @author: yangwl
	* @title: setProductSelector 
	* @param productSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setProductSelector(IDataSelector.IProductSelector productSelector) {
		this.productSelector = productSelector;
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
	* @date: 2016-10-21 
	* @author: yangwl
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
	* @date: 2016-10-21 
	* @author: yangwl
	* @title: setShortMessage 
	* @param shortMessage 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setShortMessage(IShortMessage shortMessage) {
		this.shortMessage = shortMessage;
	}

	/**
	 * 
	* @date: 2016-10-21 
	* @author: yangwl
	* @title: setTemplate 
	* @param template 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTemplate(ITemplate template) {
		this.template = template;
	}

	/**
	 * 
	* @date: 2016-10-21 
	* @author: yangwl
	* @title: setUser 
	* @param user 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUser(IUser user) {
		this.user = user;
	}
	
	/**
	 * 
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: setWorkConfigSelector 
	* @param workConfigSelector 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setWorkConfigSelector(
			IDataSelector.IWorkConfigSelector workConfigSelector) {
		this.workConfigSelector = workConfigSelector;
	}

	/**
	 * 获取查询结果
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: queryResultList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IPagingDevice queryResultList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		return this.queryResultList(inParam,queryFilter,null,null);
	}

	/**
	 * 获取查询结果
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: queryResultList 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @param pagingDevice
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public IPagingDevice queryResultList(Map<String,Object> inParam,IQueryFilter queryFilter,ISortParamer sortParamer,IPagingDevice pagingDeviceTmp) throws StrategyError{
		String queryId = (String)inParam.get("queryId");
		String isSort = (String)inParam.get("isSort");
		IPagingDevice pagingDeviceInfo = null;
		
		if(!CommonUtils.objectIsNull(queryId)){
			pagingDeviceInfo = this.toPage(inParam, pagingDeviceTmp);
		}else if(Const.TRUE_INT.equals(isSort)){
			pagingDeviceInfo = this.toSort(inParam, pagingDeviceTmp);
		}else{
			pagingDeviceInfo = this.firstQueryResultList(inParam, queryFilter, sortParamer, pagingDeviceTmp);
		}
		
		return pagingDeviceInfo;
	}
	
	/**
	 * 第一次查询结果列表
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: firstQueryResultList 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @param pagingDevice
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@SuppressWarnings("unchecked")
	protected IPagingDevice firstQueryResultList(Map<String,Object> inParam,IQueryFilter queryFilter,ISortParamer sortParamer,IPagingDevice pagingDeviceTmp) throws StrategyError{
		//获取结果列表
		List<Map<String,Object>> resultMapList = this.getResultListByType(inParam, queryFilter, sortParamer);
		//转为ResultItemPojoList
		List<ResultItemPojo> resultItemList = this.toResultItemPojo(resultMapList);
		//加载到缓存
		this.loadResultListToCache(inParam,resultItemList,pagingDeviceTmp);
		//返回第一页记录
		IPagingDevice firstPageList = this.returnFirstPageList(resultMapList,pagingDeviceTmp);
		
		return firstPageList;
	}
	
	/**
	 * 获取结果列表
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getResultList 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> getResultListByType(Map<String,Object> inParam,IQueryFilter queryFilter,ISortParamer sortParamer) throws StrategyError{
		List<Map<String,Object>> resultMapList = null;
		String queryListType = (String)inParam.get("queryListType");
		//列表查询
		if(Const.QUERY_LIST_TYPE_MC.equals(queryListType)){
			resultMapList = marketCase.queryMarketCaseList(inParam,queryFilter,sortParamer);
		}else if(Const.QUERY_LIST_TYPE_MCT.equals(queryListType)){
			resultMapList = template.queryTemplateList(inParam,queryFilter, null);
		}else if(Const.QUERY_LIST_TYPE_MC.equals(queryListType)){
			resultMapList = template.queryTemplateList(inParam,queryFilter, null);
		}else if(Const.QUERY_LIST_TYPE_AD.equals(queryListType)){
			resultMapList = audit.queryAuditRecordList(inParam,queryFilter);
		}else if(Const.QUERY_LIST_TYPE_DLAD.equals(queryListType)){
			resultMapList = audit.queryDownLoadAuditRecordList(inParam,queryFilter);	
		}else if(Const.QUERY_LIST_TYPE_ADR.equals(queryListType)){
			resultMapList = audit.queryAuditNoList(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_PROD.equals(queryListType)){
			resultMapList = productSelector.selectProductList(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_SMAC.equals(queryListType)){
			resultMapList = shortMessage.queryShortMessageAccessCodeList(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_GSC.equals(queryListType)){
			resultMapList = rule.queryGlobalStrategyConfigList(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_GREY.equals(queryListType)){
			resultMapList = user.queryGreyList(inParam, queryFilter, sortParamer);
		}else if(Const.QUERY_LIST_TYPE_CS.equals(queryListType)){
			resultMapList = channel.queryChannelShowList(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_POST.equals(queryListType)){
			resultMapList = position.queryPositionList(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_PC.equals(queryListType)){
			resultMapList = marketCase.queryPriorityConfigList(inParam,queryFilter);
		}else if(Const.QUERY_LIST_TYPE_TL.equals(queryListType)){
			resultMapList = user.queryUserLabelList(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_ACT.equals(queryListType)){
			resultMapList = actDemand.queryActDemandList(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_WC.equals(queryListType)){
			resultMapList = workConfigSelector.selectWorkConfigList(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_TEMPLATE.equals(queryListType)){
			resultMapList = template.queryTemplateList(inParam, queryFilter, sortParamer);
		}else if(Const.QUERY_LIST_TYPE_CHOICE.equals(queryListType)){
			resultMapList = configSelector.selectOptionConfigList(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_ROLE.equals(queryListType)){
			resultMapList = loginSelector.select(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_ROLEUSERREL.equals(queryListType)){
			resultMapList = loginSelector.selectRoleUserRel(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_LOGIN.equals(queryListType)){
			resultMapList = loginSelector.select(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_DNPP.equals(queryListType)){
			resultMapList = user.queryDifferentNetPhonePoolList(inParam, queryFilter, sortParamer);
		}else if(Const.QUERY_LIST_TYPE_UD.equals(queryListType)){
			//resultMapList = user.queryUserDataList(inParam, queryFilter);
		}else if(Const.QUERY_LIST_TYPE_REPORTFORM.equals(queryListType)){
			resultMapList = evaluate.queryReportFormList(inParam, queryFilter, sortParamer);
		}else if(Const.QUERY_LIST_TYPE_QUESTION.equals(queryListType)){
			resultMapList = questionNaireSelector.selectQuestionNaireList(inParam, queryFilter);
		}
		return resultMapList;
	}
	
	/**
	 * 查询结果加载到缓存
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: loadResultListToCache 
	* @param inParam
	* @param resultItemList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void loadResultListToCache(Map<String,Object> inParam,List<ResultItemPojo> resultItemList,IPagingDevice pagingDeviceTmp) throws StrategyError{
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		String queryId = SequenceUtil.getSequence();
		tempInParam.put("resultItemList", resultItemList);
		tempInParam.put("queryId",queryId);
		commonInsertor.addResultListToCache(tempInParam);
		
		pagingDeviceTmp.setQueryId(queryId);
	}
	
	/**
	 * 返回第一页记录
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: returnFirstPageList 
	* @param resultList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice returnFirstPageList(List<Map<String, Object>> resultList,IPagingDevice pagingDeviceTmp) throws StrategyError{
		IPagingDevice dealPagingDevice = new PagingDevice();
		List<Map<String, Object>> returnFirstPageList = resultList;
		int perRecordCount = Const.DEFAULT_PER_RECORD_COUNT;
		//可以由前端控制显示的每页记录数。 update by yl at 2016-10-27.
		if(CommonUtils.objectIsNull(pagingDeviceTmp.getPerRecordCount())==false){
			perRecordCount=pagingDeviceTmp.getPerRecordCount();
		}		
		if(resultList.size() >=  perRecordCount){
			returnFirstPageList =  resultList.subList(0, perRecordCount);
		}else{
			returnFirstPageList = resultList.subList(0, resultList.size());
		}
		
		dealPagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		dealPagingDevice.setTotalRecordCount(resultList.size());
		dealPagingDevice.setPerPageInfo(returnFirstPageList);
		dealPagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		dealPagingDevice.setQueryId(pagingDeviceTmp.getQueryId());
		return dealPagingDevice;
	}
	
	/**
	 * 分页功能
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: toPage 
	* @param inParam
	* @param pagingDevice
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice toPage(Map<String,Object> inParam,IPagingDevice pagingDeviceTmp) throws StrategyError{
		IPagingDevice dealPagingDevice = new PagingDevice();
		List<ResultItemPojo> resultItemPojoList = new ArrayList<ResultItemPojo>();
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		
		tempInParam.put(Const.CACHE_START, pagingDeviceTmp.getStartRecord());
		tempInParam.put(Const.CACHE_END,  pagingDeviceTmp.getEndRecord());
		tempInParam.put(Const.CACHE_KEY, Const.CACHE_DATATYPE_RESULTLIST + inParam.get(Const.DEFAULT_PAGING_SEQ));
		resultItemPojoList = commonSelector.getResultListFromCache(tempInParam);
		
		dealPagingDevice.setQueryId(pagingDeviceTmp.getQueryId());
		dealPagingDevice.setCurrentPageCode(pagingDeviceTmp.getCurrentPageCode());
		dealPagingDevice.setTotalRecordCount(pagingDeviceTmp.getTotalRecordCount());
		dealPagingDevice.setPerPageInfo(this.toResultMapList(resultItemPojoList));
		dealPagingDevice.setPerRecordCount(pagingDeviceTmp.getPerRecordCount());
		return dealPagingDevice;
	}
	
	/**
	 * 转为ResultItemPojoList
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: toResultItemPojo 
	* @param resultList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<ResultItemPojo> toResultItemPojo(List<Map<String,Object>> resultList) throws StrategyError{
		List<ResultItemPojo> list = new ArrayList<ResultItemPojo>();
		for(Map<String,Object> resultMap : resultList){
			list.add(ResultItemPojo.setResultItemPojo(resultMap));
		}
		return list;
	}
	
	/**
	 * 转为ResultMapList
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: toResultMapList 
	* @param resultItemPojoList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> toResultMapList(List<ResultItemPojo> resultItemPojoList) throws StrategyError{
		List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();
		for(ResultItemPojo resultItemPojo : resultItemPojoList){
			list.add(resultItemPojo.getResultMap());
		}
		return list;
	}
	
	/**
	 * 排序功能
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: toSort 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice toSort(Map<String,Object> inParam,IPagingDevice pagingDeviceTmp) throws StrategyError{
		List<ResultItemPojo> resultItemPojoList = null;
		Collections.sort(resultItemPojoList);
		this.loadResultListToCache(inParam,resultItemPojoList,pagingDeviceTmp);
		return this.returnFirstPageList(this.toResultMapList(resultItemPojoList),pagingDeviceTmp);
	}
	
}
