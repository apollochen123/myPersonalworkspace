package com.sitech.strategy.manage.entity.impl;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.SortParamer;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.ICustGroup;
import com.sitech.strategy.core.objectville.inter.ITask;
import com.sitech.strategy.core.pojo.inter.IResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.ICustGroupManageEntity;
import com.sitech.strategy.manage.entity.param.inter.ICustGroupManageParam;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector.IMarketCaseSelector;

/**
 * 目标客户群实体
* @date: 2016-9-5 
* @author: sunliang
* @title: CustGroupManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class CustGroupManageEntity extends BaseManageEntity implements ICustGroupManageEntity {
	
	/**
	 * 公共数据查询对象
	 */
	protected IDataSelector.ICommonSelector commonSelecter;
	/**
	 * 目标客户群对象
	 */
	protected ICustGroup custGroup;
	/**
	 * 目标客户群参数转换对象
	 */
	protected ICustGroupManageParam custGroupManageParam;
	/**
	 * 目标客户群数据插入对象
	 */
	protected IDataInsertor.ICustGroupInsertor custGroupInsertor;
	/**
	 * 目标客户群数据查询对象
	 */
	protected IDataSelector.ICustGroupSelector custGroupSelector;
	/**
	 * 标签码表查询对象
	 */
	protected IDataSelector.ILabelCodeNameSelector labelCodeNameSelector;
	/**
	 * 营销案对象
	 */
	protected IMarketCaseSelector marketCaseSelector;
	/**
	 * 关系删除对象
	 */
	protected IDataDeleter.IRelationDeleter relationDeleter;
	/**
	 * 客户群标签
	 */
	protected IDataSelector.IUserSelector userSelector;
	/**
	 * 查询目标客户群列表对象
	 */
	protected IResultList resultList;
	
	/**
	 * 任务对象
	 */
	protected ITask task;

	/**
	 * 
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: setCommonSelecter 
	* @param commonSelecter 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCommonSelecter(IDataSelector.ICommonSelector commonSelecter) {
		this.commonSelecter = commonSelecter;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: tangaq
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
	 * @date: 2016-9-14 
	 * @author: xiongxq
	 * @Title: setCustGroupManageParam 
	 * @param custGroupManageParam the custGroupManageParam to set
	 * @version 1.0  
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setCustGroupManageParam(ICustGroupManageParam custGroupManageParam) {
		this.custGroupManageParam = custGroupManageParam;
	}
	
	/**
	 * 
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: setCustGroupInsertor 
	* @param custGroupInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupInsertor(
			IDataInsertor.ICustGroupInsertor custGroupInsertor) {
		this.custGroupInsertor = custGroupInsertor;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: setCustGroupSelector 
	* @param custGroupSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupSelector(IDataSelector.ICustGroupSelector custGroupSelector) {
		this.custGroupSelector = custGroupSelector;
	}

	/**
	 * 
	* @date: 2017-3-4 
	* @author: yuanchun
	* @title: setLabelCodeNameSelector 
	* @param labelCodeNameSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setLabelCodeNameSelector(
			IDataSelector.ILabelCodeNameSelector labelCodeNameSelector) {
		this.labelCodeNameSelector = labelCodeNameSelector;
	}

	/** 
	* @date: 2017-2-27 
	* @author: wangpei
	* @title: setMarketCaseSelector 
	* @param marketCaseSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setMarketCaseSelector(IMarketCaseSelector marketCaseSelector) {
		this.marketCaseSelector = marketCaseSelector;
	}

	/** 
	 * @date: 2016-9-22 
	 * @author: xiongxq
	 * @Title: setResultList 
	 * @param resultList the resultList to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setResultList(IResultList resultList) {
		this.resultList = resultList;
	}
	
	/**
	 * 
	* @date: 2016-11-21 
	* @author: zhangjj_crmpd
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
	 * 
	* @date: 2016-11-28 
	* @author: fangyuan_crmpd
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
	* @date: 2017-2-27 
	* @author: wangpei
	* @title: setTask 
	* @param task 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setTask(ITask task) {
		this.task = task;
	}

	/**
	 * 批量添加号码到目标客户群
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: addBatchNoToCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addBatchNoToCustGroup(Map<String, Object> inParam)
			throws StrategyError {
		custGroup.addBatchNoToCustGroup(inParam);		
	}

	/**
	 * 添加单个号码到目标客户群
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: addSingleNoToCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addSingleNoToCustGroup(Map<String, Object> inParam)
			throws StrategyError {
		Map<String, Object> param = custGroup.addSingleNoToCustGroup(inParam);
		log.debug("===addSingleNoToCustGroup==param=", param);
		if(!CommonUtils.objectIsNull(param.get("result")) && !(Boolean) param.get("result")){
			return;
		}
		Map<String, Object> tempInParam = this.getGenerateChannelTaskParam(inParam,param);
		log.debug("===addSingleNoToCustGroup==tempInParam=", tempInParam);
		if (!CommonUtils.objectIsNull(tempInParam)) {
			MarketCaseCachePojo marketCaseCachePojo= marketCaseSelector.getMarketCaseDetailFromCache(tempInParam);
			if (!CommonUtils.objectIsNull(marketCaseCachePojo)) {
				task.generateChannelTask(tempInParam, marketCaseCachePojo);
			}
		}
	}

	/**
	 * 创建标签客户群明细文件--从hive中将明细数据导入到文件中
	* @date: 2017-2-16
	* @author: luogj
	* @title: createLabelCustGroupDetailFile 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void createLabelCustGroupDetailFile(Map<String,Object> inParam) throws StrategyError{
		String labelType = (String) inParam.get("labelType");
		
		if( Const.LABEL_TYPE_DYNAMIC.equals(labelType) ){
			custGroup.createLabelCustGroupDetailFileDynamic(inParam);
		}else if( Const.LABEL_TYPE_STATIC.equals(labelType) ){
			custGroup.createLabelCustGroupDetailFileStatic(inParam);
		}
	}	
	
	/**
	 * 根据ID查询客户群信息
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupById 
	* @param inParam
	* @return Map
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryCustGroupById(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = this.settleCustGroupFilter(inParam);
		Map<String,Object> outMap = custGroup.queryCustGroupById(inParam,queryFilter);
		return outMap;
	}
	
	/**
	 * 查询符合标签的客户群数量
	* @date: 2017-1-24 
	* @author: zhangjj_crmpd
	* @title: queryCustGroupCountByUserLabel 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryCustGroupCountByUserLabel(
			Map<String, Object> inParam) throws StrategyError {
		return custGroup.queryCustGroupCountByUserLabel(inParam);
	}
	/**
	 * 查询二次过滤标签的人数
	* @date: 2017-4-7 
	* @author: chenhao
	* @title: queryLabelFormulaRestrictCountById 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryLabelFormulaRestrictCountById(
			Map<String, Object> inParam) throws StrategyError {
		return custGroup.queryLabelFormulaRestrictCountById(inParam);
	}
	
	/**
	 * 查询客户群处理记录
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: queryCustGroupHandleRecord 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryCustGroupHandleRecord(
			Map<String, Object> inParam) throws StrategyError {
		
		return custGroup.queryCustGroupHandleRecord(inParam);
	}

	/**
	 * 查询客户群标签元素  
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupLabelItem 
	* @param inParam
	* @return Map
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String,Object>>  queryCustGroupLabelItem(Map<String, Object> inParam)
			throws StrategyError {
		return userSelector.selectUserLabelList(inParam);
	}

	/**
	 * 查询客户群列表
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupList 
	* @param inParam
	* @return Map
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryCustGroupList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = this.settleCustGroupListFilter(inParam);
		ISortParamer sortParamer = this.settleCustGroupListSort(inParam);
		Map<String,Object> custGroupMap =  custGroup.queryCustGroupList(inParam, queryFilter, sortParamer);
		Map<String,Object> outParam = this.getCustGroupListByPagingDevice(custGroupMap);
		return outParam;
	}
	
	/**
	 * 根据客户群ID查询客户群关系列表
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupRelationListByCustGroupId 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryCustGroupRelationListByCustGroupId(Map<String, Object> inParam) throws StrategyError {
		//Map<String, Object> tempInParam = inParam;
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentId((String) inParam.get("parentComponentId"));
		queryFilter.setComponentId((String) inParam.get("componentId"));
		queryFilter.setComponentType((String) inParam.get("componentType"));
		queryFilter.setParentComponentType((String) inParam.get("parentComponentType"));
		List<Map<String, Object>> outList = custGroupSelector.selectCustGroupRelationListByCustGroupId(inParam,queryFilter);
		Map<String, Object> outParam = new HashMap<String, Object>();
		outParam.put("queryCustGroupRelationList", outList);
		return outParam;
	}
	
	/**
	 * 查询客户群模板列表
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupTempList 
	* @param inParam
	* @return outParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryCustGroupTempList(Map<String, Object> inParam  )
			throws StrategyError {
		IQueryFilter queryFilter = this.settleCustGroupTempListFilter(inParam);
		ISortParamer sortParamer = this.settleCustGroupTempListSort(inParam);
		IPagingDevice pagingDevice = this.settleCustGroupTempListPagingDevice(inParam);
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice);
		Map<String,Object> outParam = this.getCustGroupTempListByPagingDevice(pagingDeviceTmp);
		return outParam;
	}
	
	/**
	 * 查询客户群明细文件列表
	* @date: 2016-10-30 
	* @author: tangaq
	* @title: queryCustGroupDetailFileList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public  Map<String,Object> queryCustGroupDetailFileList(Map<String,Object> inParam) throws StrategyError{
		IQueryFilter queryFilter = this.settleCustGroupDetailFileListFilter(inParam);
		ISortParamer sortParamer = this.settleCustGroupDetailFileListSort(inParam);
		IPagingDevice pagingDevice = new PagingDevice();
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter, sortParamer, pagingDevice.getInstance(inParam));
		Map<String,Object> outParam = this.getCustGroupDetailFileListByPagingDevice(pagingDeviceTmp);
		
		return outParam;
	}

	/**
	 * 查询码表列表
	* @date: 2017-3-4 
	* @author: yuanchun
	* @title: queryLabelCodeNameList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryLabelCodeNameList(
			Map<String, Object> inParam) throws StrategyError {
		Map<String,Object> outMap = new HashMap<String,Object>();
		Map<String, Object> labelCodeName = labelCodeNameSelector.selectLabelCodeName(inParam);
		return labelCodeName;
	}
	
	/**
	 * 根据标签元素代码查询标签元素值
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryLabelValueByCode 
	* @param inParam
	* @return outMap
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryLabelValueByCode(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = this.settleLabelValueFilter(inParam);
		Map<String,Object> outMap = commonSelecter.selectLabelValueByLabelCode(inParam,queryFilter);
		return outMap;
	}

    /**
     * 批量删除号码
    * @date: 2016-9-5 
    * @author: tangaq
    * @title: removeBatchNoFromCustGroup 
    * @param inParam
    * @throws StrategyError 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	@Override
	public void removeBatchNoFromCustGroup(Map<String, Object> inParam)
			throws StrategyError {
		custGroup.removeBatchNoFromCustGroup(inParam);
	}

	/**
	 * 根据id删除客户群
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: removeCustGroupById 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> removeCustGroupById(Map<String, Object> inParam)
			throws StrategyError {
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		tempInParam.put("custGroupId", inParam.get("custGroupId"));
		
		IQueryFilter queryFilter = this.settleRemoveCustGroupFilter(tempInParam);
		Map<String,Object> outMap = new HashMap<String, Object>();
		List<Map<String,Object>> relationList =custGroup.isRemoveCustGroup(tempInParam, queryFilter);
		log.info("关系列表", relationList.size());
		//判断是否可以删除
		if(CommonUtils.objectIsNull(relationList) == false){
			outMap.put("DEL_CODE", "1");//绑定活动传回标志位1，不给删除
		}else{
			String custGroupType = (String)inParam.get("custGroupType");
			if(Const.CUSTGROUP_TYPE_LABEL.equals(custGroupType) || Const.CUSTGROUP_TYPE_LABEL_STATIC.equals(custGroupType)){
				custGroup.removeLabelCustGroup(tempInParam);
			} else if(Const.CUSTGROUP_TYPE_LOAD.equals(custGroupType)||Const.CUSTGROUP_TYPE_BLACK.equals(custGroupType)){
				custGroup.removeLoadCustGroup(tempInParam);
			}
			outMap.put("DEL_CODE","0");//如果没有绑定活动，传回标志位0
			//custGroup.removeCustGroupById(inParam);
		}
		return outMap;
	}
	
	/**
	 * 根据子客户群ID删除父客户群与子客户的关系
	* @date: 2016-11-28 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupRelationById 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeCustGroupRelationById(Map<String,Object> inParam) throws StrategyError {
		relationDeleter.deleteRelation(inParam);
	}
	
	/**
	 * 删除单个号码
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: removeSingleNoFromCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeSingleNoFromCustGroup(Map<String, Object> inParam)
			throws StrategyError {
		custGroup.removeSingleNoFromCustGroup(inParam);
	}
	
	/**
	 * 保存目标客户群信息
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: saveCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	* 2017-3-22 luogj 增加静态标签客户群类型判断
	 */
	@Override
	public Map<String, Object> saveCustGroup(Map<String, Object> inParam)
			throws StrategyError {
		String custGroupType = (String)inParam.get("custGroupType");
		Map<String, Object> idMap = new HashMap<String, Object>();
		if(Const.CUSTGROUP_TYPE_LABEL.equals(custGroupType) || Const.CUSTGROUP_TYPE_LABEL_STATIC.equals(custGroupType)){
			idMap = custGroup.addLabelCustGroup(inParam);
		} else if(Const.CUSTGROUP_TYPE_LOAD.equals(custGroupType)||Const.CUSTGROUP_TYPE_BLACK.equals(custGroupType)){
			custGroup.addLoadCustGroup(inParam);
		}else if(Const.CUSTGROUP_TYPE_DB.equals(custGroupType)){
			custGroup.addDataCustGroup(inParam);
		}
		return idMap;
	}
	
	/**
	 * 保存客户群与子客户群关系
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupRelation 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveCustGroupRelation(Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> tempInParam = inParam;
		custGroupInsertor.insertCustGroupRelation(inParam, tempInParam);
	}
	
	/**
	 * 判断客户群是否能被删除
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: isRemoveCustGroup 
	* @param inParam
	* @return outList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> isRemoveCustGroup(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		List<Map<String,Object>> outList = custGroupSelector.selectCustGroupList(inParam, queryFilter);
		//在本方法里判断客户群是否能被删除
		
		return outList;
	}

	/**
	 * 将Map中数据放到对象QuertFilter中
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: settleCustGroupListFilter 
	* @param inParam
	* @return IQueryFilter
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleCustGroupListFilter(Map<String,Object> inParam){
		//Map中的参数放入QueryFilter中
		IQueryFilter queryFilter=new QueryFilter();
		queryFilter.setCustGroupId((String)inParam.get("custGroupId"));
		queryFilter.setCustGroupName((String)inParam.get("custGroupName"));
		queryFilter.setCustGroupType((String)inParam.get("custGroupType"));
		queryFilter.setStatusCode((String)inParam.get("custGroupStatus"));
		queryFilter.setOperTimeStart((Timestamp) inParam.get("custGroupOperTimeStart"));
		queryFilter.setOperTimeEnd((Timestamp) inParam.get("custGroupOperTimeEnd"));
		queryFilter.setKeyWords((List<String>)inParam.get("keyWords"));
		queryFilter.setRegionCodeArray((List<String>)inParam.get("regionCodeArray"));
		queryFilter.setOperNo((String)inParam.get("operNo"));
		String withoutBlack = (String)inParam.get("withoutBlack")==null?"false":(String)inParam.get("withoutBlack");
		if(withoutBlack.equals(Const.TRUE_LOWER)){
			queryFilter.setWithoutBlack(withoutBlack);
		}
		//queryFilter.setOperTime((String)inParam.get("operTime"));
		//queryFilter.setOperTime((String)inParam.get("custGroupNum"));
		//queryFilter.setOperTime((String)inParam.get("operName"));
		return queryFilter;
	}

	/**
	 * 将查询目标客户群列表方法返回值放到Map中
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: getCustGroupListByPagingDevice 
	* @param custGroupMap
	* @return Map
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getCustGroupListByPagingDevice(Map<String,Object> custGroupMap){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", custGroupMap.get("startPage"));
		outMap.put("perRecordCount", custGroupMap.get("limit"));
		outMap.put("totalRecordCount", custGroupMap.get("sum"));
		outMap.put("queryId", custGroupMap.get("queryId"));
		outMap.put("custGroupList", custGroupMap.get("result"));
		return outMap;
	}
	
	/**
	 *把List放到Map中 
	* @date: 2016-9-22 
	* @author: xiongxq
	* @Title: queryCustGroupListParam 
	* @param inList
	* @return Map
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> queryCustGroupListParam(List<Map<String,Object>> inList){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("CUST_GROUP_LIST", inList);
		return outMap;
	}
	
	/**
	 *将Map中数据放到对象QuertFilter中
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: settleCustGroupTempListFilter 
	* @param inParam
	* @return IQueryFilter
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleCustGroupTempListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		//Map中的参数放入QueryFilter中
		queryFilter.setCustGroupId((String)inParam.get("custGroupId"));
		//queryFilter.setCustGroupName((String)inParam.get("custGroupName"));
		return queryFilter;
	}
	
	/**
	 * 将Map中数据放到对象QuertFilter中
	* @date: 2017-2-9 
	* @author: wuJiaFu
	* @title: settleActCustGroupFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleActCustGroupFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setComponentId((String)inParam.get("custGroupId"));
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_MARKETCASE);
		return queryFilter;
	}
	
	
	/**
	 * 将Map中数据放到对象QuertFilter中
	* @date: 2016-9-13 
	* @author: xiongxq
	* @Title: settleCustGroupFilter 
	* @return IQueryFilter
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleCustGroupFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setCustGroupId((String)inParam.get("custGroupId"));
		queryFilter.setCustGroupType((String)inParam.get("custGroupType"));
		return queryFilter;
	}
	
	/**
	 *将Map中数据放到对象QuertFilter中
	* @date: 2016-9-13 
	* @author: xiongxq
	* @Title: settleCustGroupLabelFilter 
	* @return IQueryFilter
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleCustGroupLabelFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setUserLabelName((String)inParam.get("userLabelName"));
		queryFilter.setBusiType((String)inParam.get("busiType"));
		return queryFilter;
	}
	
	/**
	 *将Map中数据放到对象SortParam中
	* @date: 2016-9-13 
	* @author: xiongxq
	* @Title: settleCustGroupListSort
	* @return ISortParamer
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settleCustGroupListSort(Map<String, Object> inParam){
		return null;
	}
	
	/**
	 *将Map中数据放到对象PagingDevice中
	* @date: 2016-9-13 
	* @author: xiongxq
	* @Title: settleCustGroupListPagingDevice 
	* @return IPagingDevice
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleCustGroupListPagingDevice(Map<String, Object> inParam){
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPage = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		pagingDevice.setQueryId((String)inParam.get("queryId"));
		if (CommonUtils.objectIsNull(currentPage) == true) {
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}else{
			pagingDevice.setCurrentPageCode(Integer.valueOf(currentPage));
		}
		
		if (CommonUtils.objectIsNull(perRecordCount) == true) {
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}else{
			pagingDevice.setPerRecordCount(Integer.valueOf(perRecordCount));
		}
		
		if(CommonUtils.objectIsNull(totalRecordCount) == true){
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}else{
			pagingDevice.setTotalRecordCount(Integer.valueOf(totalRecordCount));
		}
		
		return pagingDevice;
	}
	
	/**
	 * 查询客户群明细文件列表入参转换成IQueryFilter
	* @date: 2016-10-31 
	* @author: tangaq
	* @title: settleCustGroupDetailFileListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleCustGroupDetailFileListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setOperTimeStart((Timestamp)inParam.get("operTimeStart"));
		queryFilter.setOperTimeEnd((Timestamp)inParam.get("operTimeEnd"));
		queryFilter.setCustGroupDetailFileName((String)inParam.get("taskName"));
		return queryFilter;
	}
	
	/**
	 * 查询客户群明细文件列表入参转换成ISortParamer
	* @date: 2016-10-31 
	* @author: tangaq
	* @title: settleCustGroupDetailFileListSort 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settleCustGroupDetailFileListSort(Map<String,Object> inParam){
		return null;
	}
	
    /**
	 * 把List放到一个Map里
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupTempListParam 
	* @param inList
	* @return Map
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> queryCustGroupTempListParam(List<Map<String,Object>> inList){
		//把List放到Map里
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("CUST_GROUP_LIST", inList);
		return outMap;
	}

	/**
	 * 将对象PagingDevice中数据放到Map中
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: getCustGroupTempListByPagingDevice 
	* @param inList
	* @return Map
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getCustGroupTempListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("custGroupTempList", pagingDeviceTmp.getPerPageInfo());
		return outMap;
	}

	/**
	 * 将pagingDevice中数据放到Map中
	* @date: 2016-10-31 
	* @author: tangaq
	* @title: getCustGroupDetailFileListByPagingDevice 
	* @param pagingDeviceTmp
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getCustGroupDetailFileListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("custGroupInventoryList", pagingDeviceTmp.getPerPageInfo());
		return outMap;
	}

	/** 获取生成任务的参数
	* @date: 2017-2-27 
	* @author: wangpei
	* @title: getGenerateChannelTaskParam 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected Map<String,Object> getGenerateChannelTaskParam(Map<String, Object> inParam,Map<String, Object> tempParam){
		Map<String, Object> tempInParam = new HashMap<String, Object>();
		if (!CommonUtils.objectIsNull(inParam.get("marketCaseId")) && !CommonUtils.objectIsNull(inParam.get("custGroupId")) && !CommonUtils.objectIsNull(tempParam.get("idNo"))) {
			tempInParam.put("marketCaseId", inParam.get("marketCaseId"));
			tempInParam.put("custGroupId", inParam.get("custGroupId"));
			tempInParam.put("idNo", inParam.get("idNo"));
			tempInParam.put("createSeq", SequenceUtil.getSequence());
			tempInParam.put("taskType", "real");
		}
		return tempInParam;
	}

	/**
	 * 将Map中数据放到对象PagingDevice中
	* @date: 2016-9-14 
	* @author: xiongxq
	* @Title: settleCustGroupTempListPagingDevice 
	* @param inParam
	* @return pagingDevice
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleCustGroupTempListPagingDevice(Map<String, Object> inParam){
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPage = (String)inParam.get("currentPage");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		
		if (CommonUtils.objectIsNull(currentPage) == false) {
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}else{
			pagingDevice.setCurrentPageCode(Integer.valueOf(currentPage));
		}
		
		if (CommonUtils.objectIsNull(perRecordCount) == false) {
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}else{
			pagingDevice.setPerRecordCount(Integer.valueOf(perRecordCount));
		}
		
		if(CommonUtils.objectIsNull(totalRecordCount) == false){
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}else{
			pagingDevice.setCurrentPageCode(Integer.valueOf(totalRecordCount));
		}
		
		return pagingDevice;
	}

	/**
	 * 将Map中数据放到对象SortParamer中
	* @date: 2016-9-13 
	* @author: xiongxq
	* @Title: settleCustGroupTempListSort 
	* @param inParam
	* @return sortParamer
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected  ISortParamer settleCustGroupTempListSort(Map<String, Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		return sortParamer;
	}
	
	/**
	 * 将Map中数据放到对象QueryFilter中
	* @date: 2016-10-6 
	* @author: xiongxq
	* @Title: settleLabelValueFilter 
	* @param inParam
	* @return queryFilter
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleLabelValueFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		//queryFilter.setlabelCode((String)inParam.get("labelCode"));
		return queryFilter;
	}
	
	/**
	 * 移除客户群信息
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: removeCustGroup 
	* @param inParam
	* @return Map
	* @exception: 
	* @version: 1.0 
	* @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void removeCustGroup(Map<String,Object> inParam) throws StrategyError{
		custGroup.removeCustGroupById(inParam);
	}
	
	protected IQueryFilter settleRelationRelFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_MARKETCASE);
		queryFilter.setComponentId((String)inParam.get("custGroupId"));
		return queryFilter;
	}
	
	
	/**
	 * 将Map中数据放到对象QueryFilter中
	* @date: 2016-9-13 
	* @author: xiongxq
	* @Title: settleCustGroupFilter 
	* @return queryFilter
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleRemoveCustGroupFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setParentComponentType(Const.COMPONENT_TYPE_MARKETCASE);
		queryFilter.setComponentId((String)inParam.get("custGroupId"));
		queryFilter.setCustGroupId((String)inParam.get("custGroupId"));
		return queryFilter;
	}



}
