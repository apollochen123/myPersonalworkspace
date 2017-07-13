package com.sitech.strategy.manage.entity.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.SortParamer;
import com.sitech.strategy.common.pojo.inter.IMarketCaseDetailPojo;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.pojo.inter.regioncode.IRegionCodePojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IActDemand;
import com.sitech.strategy.core.objectville.inter.IAudit;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.objectville.inter.ITemplate;
import com.sitech.strategy.core.pojo.impl.ResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IMarketCaseManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;


/**
 * 营销案实体
* @date: 2016-9-5 
* @author: sunliang
* @title: MarketCaseManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class MarketCaseManageEntity extends BaseManageEntity implements IMarketCaseManageEntity {
	
	/**
	 * 活动需求对象
	 */
	protected IActDemand actDemand;
	/**
	 * 审批对象
	 */
	protected IAudit audit;
	/**
	 * 审批查询对象
	 */
	protected IDataSelector.IAuditSelector auditSelector;
	/**
	 * 营销案对象
	 */
	protected IMarketCase marketCase;
	/**
	 * 产品查询
	 */
	protected IDataSelector.IProductSelector productSelector;
	/**
	 * 地市编码
	 */
	protected IRegionCodePojo regionCodePojo;
	/**
	 * 查询结果列表对象
	 */
	protected ResultList resultList;
	/**
	 * 客户群插入对象
	 */
	protected IDataInsertor.ISystemDealInsertor systemDealInsertor;
	/**
	 * 营销案模板对象
	 */
	protected ITemplate template;
	
    /**
     * 
    * @date: 2016-12-19 
    * @author: tangaq
    * @title: setActDemand 
    * @param actDemand 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public void setActDemand(IActDemand actDemand) {
		this.actDemand = actDemand;
	}

	/**
	 * 
	* @date: 2016-10-14 
	* @author: tangaq
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
	* @date: 2016-11-1 
	* @author: fangyuan_crmpd
	* @title: setAuditSeletor 
	* @param auditSeletor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAuditSelector(IDataSelector.IAuditSelector auditSelector) {
		this.auditSelector = auditSelector;
	}

	/** 
	 * @date: 2016-9-5 
	 * @author: xiongxq
	 * @title: setMarketCase 
	 * @param marketCase the marketCase to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setMarketCase(IMarketCase marketCase) {
		this.marketCase = marketCase;
	}

	/** 
	 * @date: 2016-10-30 
	 * @author: wangpei
	 * @title: setProductSelector 
	 * @param productSelector the productSelector to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	
	public void setProductSelector(IDataSelector.IProductSelector productSelector) {
		this.productSelector = productSelector;
	}

	/**
	 * 
	* @date: 2017-1-17 
	* @author: sunliang 
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
	 * 
	* @date: 2016-9-22 
	* @author: tangaq
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
	 * 
	* @date: 2016-12-23 
	* @author: tangaq
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
	 * @date: 2016-9-5 
	 * @author: xiongxq
	 * @title: setTemplate 
	 * @param template the template to set
	 * @version 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setTemplate(ITemplate template) {
		this.template = template;
	}
	
	/**
	 * 权限下放
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: assignMarketCasePermissionById 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void assignMarketCasePermissionById(Map<String,Object> inParam) throws StrategyError {
		marketCase.marketCasePermissionOperById(inParam);
	}

	/**
	 * 根据ID查询营销案、审批详细信息
	* @date: 2016-10-1 
	* @author: tangaq
	* @title: queryMarketCaseAuditDetailById 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryMarketCaseAuditDetailById(Map<String,Object> inParam) throws StrategyError{
		IQueryFilter marketCaseFilter = this.settleMCDetailFilter(inParam);
		IMarketCaseDetailPojo marketCaseDetailPojo = marketCase.queryMarketCaseDetailById(inParam,marketCaseFilter);
	
		Map<String,Object> marketCaseMap = this.getMCDetailByPojo(marketCaseDetailPojo);
		IQueryFilter auditFilter = this.settleAuditDetailFilter(inParam);
		Map<String,Object> auditMap = audit.queryAuditRecordDetail(inParam, auditFilter);
		IQueryFilter auditListFilter = this.settleAuditDetailListFilter(inParam);
		List<Map<String, Object>> auditDetaillist = auditSelector.selectAuditRecordDetailListByMarketCaseId(inParam, auditListFilter);
		Map<String,Object> outParam = this.settleMarketCaseAuditDetail(marketCaseMap,auditMap,auditDetaillist);
		Map<String,Object> actDemandMap = actDemand.queryActDemandDetail(inParam, marketCaseFilter);
		outParam.put("actDemandMap", actDemandMap);
		
		return outParam;
		
	}
	
	/**
	 * 根据营销案名称查询营销案信息
	* @date: 2017-3-7 
	* @author: yuanliang
	* @title: queryMarketCaseByName 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String,Object>> queryMarketCaseBasicByName(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setMarketCaseName((String)inParam.get("marketCaseName"));
		return marketCase.queryMarketCaseList(null,queryFilter,null);
	}	
	/**
	 * 根据Id查询营销案详细信息
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryMarketCaseDetailById 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryMarketCaseDetailById(Map<String,Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = this.settleMCDetailFilter(inParam);
		IMarketCaseDetailPojo marketCaseDetailPojo = marketCase.queryMarketCaseDetailById(inParam,queryFilter);
		Map<String,Object> actDemandMap = actDemand.queryActDemandDetail(inParam, queryFilter);
		Map<String,Object> outParam = this.getMCDetailByPojo(marketCaseDetailPojo);
		outParam.put("actDemandMap", actDemandMap);
		return outParam;
	}
	/**
	 * 查询营销案详细信息列表
	* @date: 2017-3-3 
	* @author: yuanliang
	* @title: queryMarketCaseDetailList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<IMarketCaseDetailPojo> queryMarketCaseDetailList(Map<String, Object> inParam)
			throws StrategyError {

		IQueryFilter queryFilter = new QueryFilter();
		ISortParamer sortParamer = new SortParamer();
		queryFilter.setMarketCaseValidDate("x");
		String sysDate=DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3);
		queryFilter.setSysDate(DateUtil.string2Timestamp(sysDate, DateUtil.TIME_FROMAT_SIMPLE3));

		List<IMarketCaseDetailPojo> detailList=marketCase.queryMarketCaseDetail(inParam,queryFilter,sortParamer);
		
		return detailList;
	}
	
	/**
	 * 查询营销案列表
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryMarketCaseList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryMarketCaseList(Map<String,Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = this.settleMCListFilter(inParam);
		ISortParamer sortParamer = this.settleMCListSort(inParam);
		IPagingDevice pagingDevice = this.settleMCListPagingDevice(inParam);
		Map<String,Object> marketCaseMap = marketCase.queryMarketCaseListByPage(inParam, queryFilter, pagingDevice.getCurrentPageCode(), pagingDevice.getPerRecordCount());
		Map<String,Object> outParam = this.getMCListByPagingDevice(marketCaseMap,pagingDevice);
		return outParam;
	}

	/**
	 * 根据权限查询营销案列表
	* @date: 2017-1-5 
	* @author: yuanchun
	* @title: queryMarketCaseListByPermission 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseListByPermission(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter =this.settleMarketCaseListByPermissionFilter(inParam);
		int start = Integer.valueOf(inParam.get("currentPageCode")==null?"1":(String)inParam.get("currentPageCode"));
		int	limit = Integer.valueOf(inParam.get("perRecordCount")==null?"10":(String)inParam.get("perRecordCount"));
		Map<String,Object> resMap = marketCase.queryMarketCaseListByPage(inParam, queryFilter, start, limit);
		if (resMap == null) {
			resMap = new HashMap<String,Object>();
		}
		Map<String,Object> outMap = new HashMap<String, Object>();
		String sum = resMap.get("sum") == null?"0":resMap.get("sum")+"";
		List<Map<String,Object>> outList = resMap.get("result") == null?new ArrayList<Map<String,Object>>():(List<Map<String,Object>>)resMap.get("result");
		outMap.put("totalRecordCount", sum);
		outMap.put("currentPageCode", start+"");
		outMap.put("perRecordCount", limit+"");
		outMap.put("marketCaseList", outList);
		return outMap;
	}

	
	/**
	 * 查询营销案模板列表
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryMarketCaseTempList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryMarketCaseTempList(Map<String,Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = this.settleMCTempListFilter(inParam);
		ISortParamer sortParamer = this.settleMCTempListSort(inParam);
		IPagingDevice pagingDevice = this.settleMCTempListPagingDevice(inParam);
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice);
		Map<String,Object> outParam = this.getMCTempListByPagingDevice(pagingDeviceTmp);		                                
		return outParam;
	}
	
	/** 查询产品列表(销售品，定价组，补贴规则)
	* @date: 2016-10-12 
	* @author: wangpei
	* @title: queryProductList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> queryProductList(Map<String,Object> inParam) throws StrategyError{
		Map<String,Object> productListInfo = productSelector.selectProductListForPage(inParam);
		return productListInfo;
	}

	/**
	 * 删除营销案
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: removeMarketCaseById 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeMarketCaseById(Map<String,Object> inParam) throws StrategyError {
			this.removeMarketCase(inParam);
	}

	/** 删除客户群关系及明细
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: removeMarketCaseCustGroupRelAndDetailByRelId 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void removeMarketCaseCustGroupRelAndDetailByRelId(
			Map<String, Object> inParam) throws StrategyError {
		marketCase.removeMarketCaseCustGroupRelation(inParam);
	}
	
	/**
	 * 暂停和重新启动营销案
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: restartAndPauseMarketCaseById 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void restartAndPauseMarketCaseById(Map<String,Object> inParam) throws StrategyError {
		marketCase.updateMarketCaseStatusById(inParam);
		this.settleMarketCaseShellProcess(inParam);
	}
	
	/** 保存营销案基本信息
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseBasic 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> saveMarketCaseBasic(Map<String, Object> inParam)
			throws StrategyError {
		String marketCaseId = (String) inParam.get("marketCaseId");
		if (CommonUtils.objectIsNull(marketCaseId)) {
			Map<String, Object> param= new HashMap<String, Object>();
			param.put("marketCaseBasic", inParam);
			marketCaseId = marketCase.addMarketCaseBasic(param);
			inParam.put("marketCaseId",marketCaseId);
			actDemand.addActDemand(inParam);
			
		}else{
			inParam.put("operTime", DateUtil.DateToString(new Date(), DateUtil.TIME_FROMAT_SIMPLE3));
			marketCase.updateMarketCaseBasicById(inParam);
			actDemand.updateActDemand(inParam);
		}
		Map<String, Object> outParam = new HashMap<String, Object>();
		outParam.put("marketCaseId", marketCaseId);
		return outParam;
	}

	/** 保存营销案客户群关系
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseCustGroupRel 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String,Object> saveMarketCaseCustGroupRel(Map<String, Object> inParam)
			throws StrategyError {
		Map<String, Object> in = new HashMap<String, Object>();
		String relId = SequenceUtil.getSequence();
		in.put("parentComponentId", inParam.get("marketCaseId"));
		in.put("componentId", inParam.get("custGroupId"));
		in.put("parentComponentType", Const.COMPONENT_TYPE_MARKETCASE);
		in.put("componentType", Const.COMPONENT_TYPE_CUSTGROUP);
		in.put("relId", relId);
		marketCase.addMarketCaseCustGroupRelation(in);
		Map<String, Object> out = new HashMap<String, Object>();
		out.put("relId", relId);
		return out;
	}
	
	/**
	 * 保存营销案详细信息
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: saveMarketCaseDetail 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> saveMarketCaseDetail(Map<String,Object> inParam) throws StrategyError {
		String marketCaseId = marketCase.addMarketCaseDetail(inParam);
		Map<String, Object> outMap = new HashMap<String, Object>();
		outMap.put("marketCaseId", marketCaseId);
		return outMap;
	}
	
	/**
	 * 根据模板修改营销案详细信息
	* @date: 2016-11-15 
	* @author: tangaq
	* @title: updateMarketCaseDetailByTemplate 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateMarketCaseDetailByTemplate(Map<String, Object> inParam) throws StrategyError {
		marketCase.updateMarketCaseDetailByTempalte(inParam);
	}
	
	/**
	 * 修改营销案状态
	* @date: 2016-12-22 
	* @author: tangaq
	* @title: updateMarketCaseStatus 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateMarketCaseStatus(Map<String,Object> inParam) throws StrategyError {
		marketCase.updateMarketCaseStatusById(inParam);
	}

	/**
	 * 从PagingDevice取出结果放入Map
	* @date: 2016-10-10 
	* @author: tangaq
	* @title: getMarketCasePrioprityListByPagingDevice 
	* @param pagingDeviceTmp
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getMarketCasePrioprityListByPagingDevice(IPagingDevice pagingDeviceTmp){
		return null;
	}

	/**
	 * 从MarketCaseDetailPojo对象里取出查询营销案详细信息
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: getMCdetailByPojo 
	* @param marketCaseDetailPojo
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getMCDetailByPojo(IMarketCaseDetailPojo marketCaseDetailPojo){
		Map<String,Object> outMap = marketCaseDetailPojo.getDetailMap();
		return outMap;
	}

	/**
	 * 得到营销案列表并放入Map中
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: getMCListByPagingDevice 
	* @param inList
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getMCListByPagingDevice(Map<String,Object> marketCaseMap,IPagingDevice pagingDevice){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDevice.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDevice.getPerRecordCount());
		outMap.put("totalRecordCount", marketCaseMap.get("sum"));
		outMap.put("marketCaseList", marketCaseMap.get("result")==null?new ArrayList<Map<String,Object>>():marketCaseMap.get("result"));
		outMap.put("queryId", pagingDevice.getQueryId());
		return outMap;
	}

	/**
	 * 得到营销案模板列表并放入Map中
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: getMCTempListByPagingDevice 
	* @param inList
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getMCTempListByPagingDevice(IPagingDevice pagingDeviceTmp){
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("currentPageCode", pagingDeviceTmp.getCurrentPageCode());
		outMap.put("perRecordCount", pagingDeviceTmp.getPerRecordCount());
		outMap.put("totalRecordCount", pagingDeviceTmp.getTotalRecordCount());
		outMap.put("marketCaseTempList", pagingDeviceTmp.getPerPageInfo());
	    return outMap;
	}
	
	/**
	 * 得到判断营销案是否删除的结果
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: isRemoveMarketCase 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> isRemoveMarketCase(Map<String,Object> inMap) throws StrategyError{
		IQueryFilter queryFilter = this.settleRemoveMCFilter(inMap);
		Map<String,Object> outMap = marketCase.queryMarketCaseById(inMap,queryFilter);
		return outMap;	
	}
	
	/**
	 * 生成QueryFilter对象（根据ID查询审批详细信息）
	* @date: 2016-10-1 
	* @author: tangaq
	* @title: settleAuditDetailFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleAuditDetailFilter (Map<String,Object> inParam){
		IQueryFilter auditFilter = new QueryFilter();
		auditFilter.setAuditRecordId((String)inParam.get("auditRecordId"));
		return auditFilter;
	}

	/**
	 * 生成QueryFilter对象（根据marketCaseId查询审批详细信息）
	* @date: 2016-11-1 
	* @author: fangyuan_crmpd
	* @title: settleAuditDetailListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleAuditDetailListFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setBusiId((String)inParam.get("marketCaseId"));
		return queryFilter;
	}

	/**
	 * 将营销案详细信息和审批详细信息合并在Map里
	* @date: 2016-10-1 
	* @author: tangaq
	* @title: settleMarketCaseAuditDetail 
	* @param marketCaseMap
	* @param auditMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> settleMarketCaseAuditDetail(Map<String, Object> marketCaseMap, Map<String, Object> auditMap,List<Map<String, Object>> auditDetailList) {
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("marketCaseDetail", marketCaseMap.get("marketCaseDetail"));
		outParam.put("marketCaseBasic", marketCaseMap.get("marketCaseBasic"));
		outParam.put("auditDetail", auditMap);
		outParam.put("auditDetailList", auditDetailList);
		return outParam;
	}

	/**
	 * 
	* @date: 2017-1-5 
	* @author: yuanchun
	* @title: settleMarketCaseListByPermissionFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleMarketCaseListByPermissionFilter(
			Map<String, Object> inParam) {
		IQueryFilter queryFilter = new QueryFilter();
		String regionCodeStr = (String)inParam.get("regionCode");
		if ((regionCodePojo.getProvinceCode()).equals(regionCodeStr)) {
			//是省公司regionCode="0"
			queryFilter.setRegionCode(regionCodeStr);
		}else{ 
			//不是省公司带上查询标识  marketCaseQueryFlagByPermission 
			queryFilter.setMarketCaseQueryFlagByPermission((Const.MARKET_CASE_LEVEL_SYNERGY));
			queryFilter.setRegionCode(regionCodeStr);
			//queryFilter.setMarketCaseLevel((Const.MARKET_CASE_LEVEL_SYNERGY));
			
		}
		if(!CommonUtils.objectIsNull(inParam.get("keyWords")) ){
			queryFilter.setKeyWords((List<String>)inParam.get("keyWords"));
		}
		queryFilter.setPositionId((String)inParam.get("positionId"));
		queryFilter.setChannelId((String)inParam.get("channelId"));
		queryFilter.setStatusCode((String)inParam.get("statusCode"));
		queryFilter.setMarketStatusCode((String)inParam.get("statusCode"));
		queryFilter.setMarketCaseBusiType((String)inParam.get("marketCaseBusiType"));
		queryFilter.setMarketCaseType((String)inParam.get("marketCaseType"));
		return queryFilter;
	}

	
	/**
	 * 查询营销案优先级列表入参转换为IQueryFilter
	* @date: 2016-10-10 
	* @author: tangaq
	* @title: settleMarketCasePrioprityListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleMarketCasePrioprityListFilter(Map<String,Object> inParam){
		return null;
	}

	/**
	 * 查询营销案优先级列表入参转换为IPagingDevice
	* @date: 2016-10-10 
	* @author: tangaq
	* @title: settleMarketCasePrioprityListPagingDevice 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleMarketCasePrioprityListPagingDevice(Map<String,Object> inParam){
		return null;
	}

	/**
	 * 查询营销案优先级列表入参转换为ISortParamer
	* @date: 2016-10-10 
	* @author: tangaq
	* @title: settleMarketCasePrioprityListSort 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settleMarketCasePrioprityListSort(Map<String,Object> inParam){
		return null;
	}
	
    /**
     * 处理导入目标客群进程参数处理
    * @date: 2016-12-23 
    * @author: tangaq
    * @title: settleMarketCaseShellProcessParam 
    * @param inParam
    * @throws StrategyError 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	protected void settleMarketCaseShellProcessParam(Map<String,Object> inParam)throws StrategyError{
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		
			tempInParam.put("serialId", SequenceUtil.getSequence());
			tempInParam.put("busiId", inParam.get("marketCaseId"));
			tempInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE);
			tempInParam.put("processNo", Const.SHELLPROCESS_NO_WAITCREATECHANNELTASK);
			tempInParam.put("processName", Const.SHELLPROCESS_NAME_WAITCREATECHANNELTASK);
			tempInParam.put("updateTime", new Date());
			systemDealInsertor.insertShellProcessExecuteInfo(tempInParam);
	}
	
	/**
	 * 活动状态改变时(启动/暂停/终止活动)，在进程表插入记录
	* @date: 2017-3-14 
	* @author: yueyi
	* @title: settleMarketCaseShellProcess 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void settleMarketCaseShellProcess(Map<String,Object> inParam) throws StrategyError{
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", SequenceUtil.getSequence());
		tempInParam.put("busiId", inParam.get("marketCaseId"));
		tempInParam.put("busiType", Const.BUSI_TYPE_MARKETCSAE);
		tempInParam.put("processNo", Const.SHELLPROCESS_NO_MARKETCASESTATUSCHANGE);
		tempInParam.put("processName", Const.SHELLPROCESS_NAME_MARKETCASESTATUSCHANGE);
		tempInParam.put("updateTime", new Date());
		systemDealInsertor.insertShellProcessExecuteInfo(tempInParam);
	}

	/**
	 * 生成QueryFilter对象（根据ID查询营销案详细信息）
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: settleMCDetailFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleMCDetailFilter(Map<String, Object> inParam) {
		//Map中的参数放入QueryFilter中
		IQueryFilter querFilter = new QueryFilter();
		querFilter.setMarketCaseId((String)inParam.get("marketCaseId"));
		querFilter.setBusiId((String)inParam.get("marketCaseId"));
		querFilter.setActDemandId((String)inParam.get("marketCaseId"));
		return querFilter;
	}

	/**
	 * 处理分页信息（查询营销案列表）
	* @date: 2016-9-22 
	* @author: tangaq
	* @title: settleMCListPagingDevice 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleMCListPagingDevice(Map<String, Object> inParam) {
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPageCode = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		pagingDevice.setQueryId((String)inParam.get("queryId"));
		if(CommonUtils.objectIsNull(currentPageCode) == false){
			pagingDevice.setCurrentPageCode(Integer.parseInt(currentPageCode));
		}else{
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}
		if(CommonUtils.objectIsNull(perRecordCount) == false){
			pagingDevice.setPerRecordCount(Integer.parseInt(perRecordCount));
		}else{
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}
		if(CommonUtils.objectIsNull(totalRecordCount) == false){
			pagingDevice.setTotalRecordCount(Integer.parseInt(totalRecordCount));
		}else{
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}
		
		return pagingDevice;
	}

	/**
	 * 生成QueryFilter对象（查询营销案列表）
	* @date: 2016-10-6 
	* @author: tangaq
	* @title: settleMCListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleMCListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();

		queryFilter.setMarketCaseName((String)inParam.get("marketCaseName"));
		queryFilter.setMarketCaseType((String)inParam.get("marketCaseType"));
		queryFilter.setTriggerMode((String)inParam.get("triggerMode"));
		queryFilter.setMarketCaseBusiType((String)inParam.get("marketCaseBusiType"));
		queryFilter.setPositionId((String)inParam.get("positionId"));
		queryFilter.setChannelId((String)inParam.get("channelId"));
		queryFilter.setMarketStatusCode((String)inParam.get("statusCode"));
		if(!CommonUtils.objectIsNull(inParam.get("keyWords")) ){
			queryFilter.setKeyWords((List<String>)inParam.get("keyWords"));
		}
		queryFilter.setRegionCode((String)inParam.get("regionCode"));
		queryFilter.setRegionCodeArray((List<String>)inParam.get("regionCodeArray"));
		queryFilter.setOperNo((String)inParam.get("operNo"));
		queryFilter.setOperName((String)inParam.get("operName"));
		queryFilter.setMarketCaseId((String)inParam.get("marketCaseId"));
		return queryFilter;
	}
	
	/**
	 * 生成SortParamer对象（查询营销案列表）
	* @date: 2016-10-6 
	* @author: tangaq
	* @title: settleMCListSort 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settleMCListSort(Map<String,Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		Map<String,String> sortMap = new HashMap<String, String>();
		
		sortMap.put("sortFlag", (String)inParam.get("sortFlag"));
		sortMap.put("sortField", (String)inParam.get("sortField"));
		sortParamer.setSortMap(sortMap);
		
		return sortParamer;
	}
	

	/**
	 * 处理分页信息（查询营销案模板列表）
	* @date: 2016-9-22 
	* @author: tangaq
	* @title: settleMCTempListPagingDevice 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IPagingDevice settleMCTempListPagingDevice(Map<String,Object> inParam){
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPageCode = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		
		if(CommonUtils.objectIsNull(currentPageCode) == false){
			pagingDevice.setCurrentPageCode(Integer.parseInt(perRecordCount));
		}else{
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}
		if(CommonUtils.objectIsNull(perRecordCount) == false){
			pagingDevice.setCurrentPageCode(Integer.parseInt(currentPageCode));
		}else{
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}
		if(CommonUtils.objectIsNull(totalRecordCount) == false){
			pagingDevice.setTotalRecordCount(Integer.parseInt(totalRecordCount));
		}else{
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}
		
		return pagingDevice;
	}

	/**
	 * 生成QueryFilter（查询营销案模板列表）
	* @date: 2016-9-9 
	* @author: tangaq
	* @title: settleMCTempListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleMCTempListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		//入参不知
		return queryFilter;
	}
	
	/**
	 * 生成SortParamer对象（查询营销案模板列表）
	* @date: 2016-10-6 
	* @author: tangaq
	* @title: settleMCTempListSort 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected ISortParamer settleMCTempListSort(Map<String,Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		Map<String,String> sortMap = new HashMap<String, String>();
		
		sortMap.put("sortFlag", (String)inParam.get("sortFlag"));
		sortMap.put("sortField", (String)inParam.get("sortField"));
		sortParamer.setSortMap(sortMap);
		return sortParamer;
	}
	
	/** 
	* @date: 2016-10-13 
	* @author: wangpei
	* @title: settleProductListSort 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected ISortParamer settleProductListSort(Map<String,Object> inParam){
		ISortParamer sortParamer = new SortParamer();
		Map<String,String> sortMap = new HashMap<String, String>();
		
		sortMap.put("sortFlag", (String)inParam.get("sortFlag"));
		sortMap.put("sortField", (String)inParam.get("sortField"));
		sortParamer.setSortMap(sortMap);
		return sortParamer;
	}
	
	/** 创建分页
	* @date: 2016-10-13 
	* @author: wangpei
	* @title: settleProductListPagingDevice 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	protected IPagingDevice settleProductListPagingDevice(Map<String, Object> inParam) {
		IPagingDevice pagingDevice = new PagingDevice();
		String currentPageCode = (String)inParam.get("currentPageCode");
		String perRecordCount = (String)inParam.get("perRecordCount");
		String totalRecordCount = (String)inParam.get("totalRecordCount");
		pagingDevice.setQueryId((String)inParam.get("queryId"));
		if(CommonUtils.objectIsNull(currentPageCode) == false){
			pagingDevice.setCurrentPageCode(Integer.parseInt(currentPageCode));
		}else{
			pagingDevice.setCurrentPageCode(Const.DEFAULT_CURRENT_PAGE);
		}
		if(CommonUtils.objectIsNull(perRecordCount) == false){
			pagingDevice.setPerRecordCount(Integer.parseInt(perRecordCount));
		}else{
			pagingDevice.setPerRecordCount(Const.DEFAULT_PER_RECORD_COUNT);
		}
		if(CommonUtils.objectIsNull(totalRecordCount) == false){
			pagingDevice.setTotalRecordCount(Integer.parseInt(totalRecordCount));
		}else{
			pagingDevice.setTotalRecordCount(Const.DEFAULT_TOTAL_RECORD_COUNT);
		}
		
		return pagingDevice;
	}
	

	/**
	 * 生成QueryFilter对象（营销案）
	* @date: 2016-10-6 
	* @author: tangaq
	* @title: settleRemoveMCFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleRemoveMCFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setMarketCaseId((String)inParam.get("marketCaseId"));
		return queryFilter;
	}

	/**
	 * 删除营销案
	* @date: 2016-10-6 
	* @author: tangaq
	* @title: removeMarketCase 
	* @param inMap
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected void removeMarketCase(Map<String,Object> inMap) throws StrategyError{	
		marketCase.removeMarketCaseById(inMap);
	}
}
