package com.sitech.strategy.manage.entity.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.SortParamer;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.pojo.inter.regioncode.IRegionCodePojo;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IEvaluate;
import com.sitech.strategy.core.objectville.inter.IWorkBench;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IWorkBenchManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 工作台实体
* @date: 2016-9-5 
* @author: tangaq
* @title: WorkBenchManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class WorkBenchManageEntity extends BaseManageEntity implements
		IWorkBenchManageEntity {
	
	/**
	 * 公共查询对象
	 */
	protected IDataSelector.ICommonSelector commonSelector;
	/**
	 * 评估(报表)对象
	 */
	protected IEvaluate evaluate;	
	/**
	 * 评估(报表)对象
	 */
	protected IDataSelector.IEvaluateSelector evaluateSelector;
	/**
	 * 地市对象
	 */
	protected IRegionCodePojo  regionCodePojo;
	/**
	 * 工作台对象
	 */
	protected IWorkBench workBench;
	/**
	 * 数据统计对象
	 */
	protected IDataSelector.IStatisticSelector statisticSelector;
	/**
	 * 
	* @date: 2016-12-14 
	* @author: tangaq
	* @title: setEvaluate 
	* @param evaluate 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEvaluate(IEvaluate evaluate) {
		this.evaluate = evaluate;
	}

	/**
	 * 
	* @date: 2016-12-14 
	* @author: tangaq
	* @title: setEvaluateSelector 
	* @param evaluateSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEvaluateSelector(IDataSelector.IEvaluateSelector evaluateSelector) {
		this.evaluateSelector = evaluateSelector;
	}

	/**
	 * 
	* @date: 2016-11-9 
	* @author: mengxi
	* @title: setWorkBench 
	* @param workBench 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setWorkBench(IWorkBench workBench) {
		this.workBench = workBench;
	}
	

	public void setRegionCodePojo(IRegionCodePojo regionCodePojo) {
		this.regionCodePojo = regionCodePojo;
	}

	/**
	 * 
	* @date: 2016-12-20 
	* @author: tangaq
	* @title: setStatisticSelector 
	* @param statisticSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setStatisticSelector(
			IDataSelector.IStatisticSelector statisticSelector) {
		this.statisticSelector = statisticSelector;
	}

	/**
	 * 
	* @date: 2016-12-20 
	* @author: tangaq
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
	 * 查询渠道营销案订购汇总信息
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: queryChannelMarketCaseOrderReportInfo 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String,Object>>  queryChannelMarketCaseOrderReportInfo(
			Map<String, Object> inParam) throws StrategyError {
		List<Map<String, Object>> resultList= evaluate.selectChannelMarketCaseOrderReportInfoList(inParam);
		
		return resultList;
	}
	
	/** 
	 * 根据地市查询某个触点下的接触量
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryChannelTouchNumByRegionCode 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryChannelTouchNumByRegionCode(
			Map<String, Object> inParam) throws StrategyError {
		List<Map<String,Object>> touchList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> recommendList = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> accpetList = new ArrayList<Map<String,Object>>();
		inParam.put("statisType",Const.STATISTIC_TYPE_CHANNELRECOMMEND);
   	    touchList = this.settleChannelRecommendNum(inParam);
   	    inParam.put("statisType",Const.STATISTIC_TYPE_CHANNELREALCONTACT_DAY);
   	    recommendList = this.settleChannelRecommendNum(inParam);
   	    inParam.put("statisType", Const.STATISTIC_TYPE_REALACCEPT_DAY);
   	    accpetList = this.settleChannelRecommendNum(inParam);
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("channelTouchNumList", touchList);
		outMap.put("channelRecommendNumList", recommendList);
		outMap.put("accpetList", accpetList);
		return outMap;
		
	}

	/**
	 * 根据地市查询某个营销案大类下面的接触量  
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryMarketCaseTouchNumByRegionCode 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryMarketCaseTouchNumByRegionCode(
			Map<String, Object> inParam) throws StrategyError {
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("statisType",Const.STATISTIC_TYPE_MARKETCASERECOMMEND);
		tempInParam.put("currentDate",inParam.get("nowDay"));
		List<Map<String,Object>> acceptList = new ArrayList<Map<String,Object>>();
		Map<String,Object> acceptInParam = new HashMap<String,Object>();
		acceptInParam.put("statisType",Const.STATISTIC_TYPE_MARKETCASEACCEPT);
		acceptInParam.put("currentDate",inParam.get("nowDay"));
        if("0".equals(inParam.get("regionCode"))){
             List<String> regionList = this.getRegionCodeList();
             for(String regionMap : regionList){
            	 Map<String,Object> outParam = new HashMap<String,Object>();
            	 Map<String,Object> acceptParam = new HashMap<String,Object>();
                 	for(int i = 1;i<=14;i++){
                		String marketCaseType = "";
                		if(i<10){
                			marketCaseType = "0"+i;
                			tempInParam.put("regionCode",regionMap);
                			tempInParam.put("busiType",marketCaseType);
                			outParam.put(marketCaseType,statisticSelector.selectStatistic(tempInParam));
                			acceptInParam.put("regionCode",regionMap);
                			acceptInParam.put("busiType",marketCaseType);
                			acceptParam.put(marketCaseType,statisticSelector.selectStatistic(tempInParam));
                		
                		}else{
                			marketCaseType = i+"";
                			tempInParam.put("regionCode",regionMap);
                			tempInParam.put("busiType",marketCaseType);
            	            outParam.put(marketCaseType,statisticSelector.selectStatistic(tempInParam));
            	        	acceptInParam.put("regionCode",regionMap);
                			acceptInParam.put("busiType",marketCaseType);
                			acceptParam.put(marketCaseType,statisticSelector.selectStatistic(tempInParam));
                		}
                	}
                 	outList.add(outParam);
                 	acceptList.add(acceptParam);
            	 }
        }else{
        	Map<String,Object> outParam = new HashMap<String,Object>();
        	 Map<String,Object> acceptParam = new HashMap<String,Object>();
        	for(int i = 1;i<=14;i++){
        		String marketCaseType = "";
        		if(i<10){
        			marketCaseType = "0"+i;
        			tempInParam.put("regionCode",inParam.get("regionCode"));
        			tempInParam.put("busiType",marketCaseType);
    	    		outParam.put(marketCaseType,statisticSelector.selectStatistic(tempInParam));
    	    		acceptInParam.put("regionCode",inParam.get("regionCode"));
        			acceptInParam.put("busiType",marketCaseType);
        			acceptParam.put(marketCaseType,statisticSelector.selectStatistic(tempInParam));
    	            
        		}else{
        			marketCaseType = i+"";
        			tempInParam.put("regionCode",inParam.get("regionCode"));
        			tempInParam.put("busiType",marketCaseType);
    	    		outParam.put(marketCaseType,statisticSelector.selectStatistic(tempInParam));
    	    		acceptInParam.put("regionCode",inParam.get("regionCode"));
        			acceptInParam.put("busiType",marketCaseType);
        			acceptParam.put(marketCaseType,statisticSelector.selectStatistic(tempInParam));
        		}
        		
        	}
        	 outList.add(outParam);
        	 acceptList.add(acceptParam);
        }
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("marketCaseTouchNumList", outList);
		outMap.put("acceptList", acceptList);
		return outMap;
	}

	/**
	 * 查询营销案审批数量
	* @date: 2016-11-4 
	* @author: mengxi
	* @title: qureyMarketCaseAuditNum 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> qureyMarketCaseAuditNum(Map<String, Object> inParam) throws StrategyError {
		
		IQueryFilter queryFilter = this.settleMarketCaseAuditNumFilter(inParam);
		Map<String,Object> outMap =workBench.selectMarketCaseAuditNum(inParam,queryFilter)	;
		return outMap;
	}
	
	/**
	 * 查询营销案数量
	* @date: 2016-11-8 
	* @author: mengxi
	* @title: qureyMarketCaseNum 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> qureyMarketCaseNum(Map<String, Object> inParam) throws StrategyError {
		
		IQueryFilter queryFilter = this.settleMarketCaseNumFilter(inParam);
		Map<String,Object> outMap =workBench.selectMarketCaseNum(inParam,queryFilter);
		return outMap;
	}


	/**
	 * 根据日期参数的不同，查询昨日曝光量、当日累计曝光量
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: queryMarketCaseOrderReportSendNum 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseOrderReportSendNum(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setSendDate((String) inParam.get("sendDate"));
		Map<String,Object> outMap =evaluate.selectMarketCaseOrderReportSendNum(queryFilter)	;
		return outMap;
	}
	
	/**
	 * 查询公告列表
	* @date: 2017-2-27 
	* @author: yexr
	* @title: queryNoticeList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */	
	@Override
	public Map<String, Object> queryNoticeList(Map<String, Object> inParam) 
			throws StrategyError {
		IQueryFilter queryFilter = this.settleNoticeListFilter(inParam);
		int start = Integer.valueOf(inParam.get("currentPageCode")==null?"1":(String)inParam.get("currentPageCode"));
		int limit = Integer.valueOf(inParam.get("perRecordCount")==null?"10":(String)inParam.get("perRecordCount"));		
		Map<String,Object> resMap = workBench.selectNoticeList(inParam, queryFilter, start, limit);
		if (resMap == null) {
			resMap = new HashMap<String,Object>();
		}
		Map<String,Object> outMap = new HashMap<String, Object>();
		String sum = resMap.get("sum") == null?"0":resMap.get("sum")+"";
		List<Map<String,Object>> outList = resMap.get("result") == null?new ArrayList<Map<String,Object>>():(List<Map<String,Object>>)resMap.get("result");
		outMap.put("sum", sum);
		outMap.put("currentPageCode", start+"");
		outMap.put("perRecordCount", limit+"");
		outMap.put("result", outList);
		Map<String,Object> outParam = this.getNoticeListByPagingDevice(outMap);
		return outParam;
	}

	/**
	 * 查询产商品信息报表
	* @date: 2017-2-21 
	* @author: hannn
	* @title: queryProductCommodityReportInfoList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> queryProductCommodityReportInfoList(Map<String,Object> inParam) throws StrategyError {	
		String cityId=(String) inParam.get("cityId");
		if(cityId.equals("01")){
			IQueryFilter queryFilter = this.queryProductCommodityListFilter(inParam);
			return evaluate.selectProductCommodityReportInfoByProvince(inParam, queryFilter, null);
		}else if(cityId.equals("02")){
			IQueryFilter queryFilter = this.queryProductCommodityListFilter(inParam);
			return evaluate.selectProductCommodityReportInfo(inParam, queryFilter, null);
		}
		return inParam;
	}
	/**
	 * 查询产商品信息报表分页
	* @date: 2017-2-23 
	* @author: hannn
	* @title: queryProductCommodityListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter queryProductCommodityListFilter(Map<String,Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setProductCommodityId((String)inParam.get("productCommodityId"));
		queryFilter.setProductCommodityName((String)inParam.get("productCommodityName"));
		queryFilter.setCityId((String)inParam.get("cityId"));
		queryFilter.setReportDate((String)inParam.get("reportDate"));
		queryFilter.setKeyWords((List<String>)inParam.get("keyWords"));
		return queryFilter;
	}
	
	/** 
	 * 查询各个地市的转化率
	* @date: 2016-12-7 
	* @author: tangaq
	* @Title: queryRegionCodeConvertRate 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryRegionCodeConvertRate(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = this.settleChannelTouchNumByRegionCodeFilter(inParam);
		List<Map<String,Object>> outList = evaluateSelector.selectRegionCodeConvertRate(inParam, queryFilter);
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("convertRateList", outList);
		return outMap;
	}

	/** 
	 * 根据地市查询用户接触量
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryUserTouchNumByRegionCode 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryUserTouchNumByRegionCode(
			Map<String, Object> inParam) throws StrategyError {
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		Map<String,Object> tempInParam = new HashMap<String,Object>();
        if("0".equals(inParam.get("regionCode"))){
             List<String> regionList = this.getRegionCodeList();
             for(String regionMap : regionList){
            	 Map<String,Object> outParam = new HashMap<String,Object>();
            	 tempInParam.put("statisType",Const.STATISTIC_TYPE_REALCONTACT_MONTH);
            	 tempInParam.put("currentDate",inParam.get("nowMonth"));
            	 tempInParam.put("regionCode",regionMap);
            	 outParam.put("MonthNum",statisticSelector.selectStatistic(tempInParam));
            	 tempInParam.put("statisType",Const.STATISTIC_TYPE_REALCONTACT_DAY);
            	 tempInParam.put("currentDate",inParam.get("nowDay"));
            	 outParam.put("DayNum",statisticSelector.selectStatistic(tempInParam));
            	 outList.add(outParam);
             }
        }else{
        	Map<String,Object> outParam = new HashMap<String,Object>();
    		tempInParam.put("statisType",Const.STATISTIC_TYPE_REALCONTACT_MONTH);
        	tempInParam.put("currentDate",inParam.get("nowMonth"));
        	tempInParam.put("regionCode",inParam.get("regionCode"));
    		outParam.put("MonthNum",statisticSelector.selectStatistic(tempInParam));
    		tempInParam.put("statisType",Const.STATISTIC_TYPE_REALCONTACT_DAY);
        	tempInParam.put("currentDate",inParam.get("nowDay"));
        	outParam.put("DayNum",statisticSelector.selectStatistic(tempInParam));
            outList.add(outParam);
        }
        
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("userTouchNumList", outList);
		return outMap;
	}
	
	/**
	 * 查询地市列表
	* @date: 2016-12-20 
	* @author: tangaq
	* @title: getRegionCodeList 
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<String> getRegionCodeList() throws StrategyError{
		
		String[] regionCodeArray = regionCodePojo.getRegionCode();
		List<String> inList = new ArrayList<String>(Arrays.asList(regionCodeArray));
		return inList;
	}
	
	/**
	 * 生成IQueryFilter对象
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: settleChannelTouchNumByRegionCodeFilter 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleChannelTouchNumByRegionCodeFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setRegionCode((String)inParam.get("regionCode"));
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2016-11-4 
	* @author: mengxi
	* @title: settleMarketCaseAuditNumFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleMarketCaseAuditNumFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setAuditNo((String) inParam.get("auditNo"));
		queryFilter.setAuditStatus((String) inParam.get("auditStatus"));
		return queryFilter;
	}
	
	/**
	 * 
	* @date: 2016-11-8 
	* @author: mengxi
	* @title: settleMarketCaseNumFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleMarketCaseNumFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setOperNo((String) inParam.get("operNo"));
		queryFilter.setMarketStatusCode((String) inParam.get("marketStatusCode"));
		queryFilter.setRegionCode((String) inParam.get("regionCode"));
		return queryFilter;
	}
	
	/**
	 * 查询公告列表入参转换为 IQueryFilter
	* @date: 2017-2-27 
	* @author: yexr
	* @title: settleNoticeListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleNoticeListFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setNoticeName((String) inParam.get("noticeName"));
		return queryFilter;
	}
	/**
	 * 新增公告入参转换为Map
	* @date: 2017-3-1 
	* @author: yexr
	* @title: settleNoticeMap 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> settleNoticeMap(Map<String,Object> inParam){
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("serialId", inParam.get("serialId"));
		tempInParam.put("noticeName", inParam.get("noticeName"));
		tempInParam.put("noticeDesc", inParam.get("noticeDesc"));
		tempInParam.put("showFlag", inParam.get("showFlag"));
		tempInParam.put("operNo", inParam.get("operNo"));
		tempInParam.put("operName", inParam.get("operName"));
		tempInParam.put("createTime", inParam.get("createTime"));
		return tempInParam;
	}
	
	/**
	 * 通过分页器获取公告列表
	* @date: 2017-2-27 
	* @author: yexr
	* @title: getNoticeListByPagingDevice 
	* @param out
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
		protected Map<String,Object> getNoticeListByPagingDevice(Map<String,Object> out){
			Map<String,Object> outParam = new HashMap<String,Object>();
			outParam.put("currentPageCode", out.get("currentPageCode"));
			outParam.put("perRecordCount", out.get("perRecordCount"));
			outParam.put("totalRecordCount", out.get("sum"));
			outParam.put("noticeList", out.get("result"));
			outParam.put("queryId", "");
		    return outParam;
		}
	
	/**
	 * 处理某个触点下的推荐量
	* @date: 2017-1-10 
	* @author: tangaq
	* @title: settleChannelRecommendNum 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected List<Map<String,Object>> settleChannelRecommendNum(Map<String,Object> inParam) throws StrategyError{
		List<Map<String,Object>> outList = new ArrayList<Map<String,Object>>();
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.put("statisType",inParam.get("statisType"));
   	    tempInParam.put("currentDate",inParam.get("nowDay"));
		
        if("0".equals(inParam.get("regionCode"))){
             List<String> regionList = this.getRegionCodeList();
             for(String regionMap : regionList){
            	     Map<String,Object> outParam = new HashMap<String,Object>();
	            	 tempInParam.put("regionCode",regionMap);
	            	 tempInParam.put("sceneType","01");
	         		 outParam.put("01",statisticSelector.selectStatistic(tempInParam));
	         		 tempInParam.put("sceneType","02");
	         		 outParam.put("02",statisticSelector.selectStatistic(tempInParam));
	         		 tempInParam.put("sceneType","03");
	         		 outParam.put("03",statisticSelector.selectStatistic(tempInParam));
	         		 tempInParam.put("sceneType","04");
	         		 outParam.put("04",statisticSelector.selectStatistic(tempInParam));
	         		 tempInParam.put("sceneType","05");
	         		 outParam.put("05",statisticSelector.selectStatistic(tempInParam));
	         		 tempInParam.put("sceneType","06");
	         		 outParam.put("06",statisticSelector.selectStatistic(tempInParam));
	         		 outList.add(outParam);
             }
        }else{
        	Map<String,Object> outParam = new HashMap<String,Object>();
        	tempInParam.put("regionCode",inParam.get("regionCode"));
       	    tempInParam.put("sceneType","01");
            outParam.put("01",statisticSelector.selectStatistic(tempInParam));
            tempInParam.put("sceneType","02");
            outParam.put("02",statisticSelector.selectStatistic(tempInParam));
            tempInParam.put("sceneType","03");
            outParam.put("03",statisticSelector.selectStatistic(tempInParam));
            tempInParam.put("sceneType","04");
            outParam.put("04",statisticSelector.selectStatistic(tempInParam));
            tempInParam.put("sceneType","05");
            outParam.put("05",statisticSelector.selectStatistic(tempInParam));
            tempInParam.put("sceneType","06");
            outParam.put("06",statisticSelector.selectStatistic(tempInParam));
            outList.add(outParam);
        }
		return outList;
		
	}
	
	
	/**
	 * 新增公告
	* @date: 2017-3-1 
	* @author: yexr
	* @title: saveNotice 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	 * @return 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void saveNotice(Map<String, Object> inParam)
			throws StrategyError {
		Map<String,Object> tempInParam = this.settleNoticeMap(inParam);
		 workBench.insertNotice(inParam, tempInParam);	
	}
	
	
	/**
	 * 删除公告
	* @date: 2017-3-1 
	* @author: yexr
	* @title: removeNotice 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void removeNotice(Map<String, Object> inParam)
			throws StrategyError {
		workBench.removeNotice(inParam);
	}
	
	/**
	 * 修改公告
	* @date: 2017-3-1 
	* @author: yexr
	* @title: updateNotice 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateNotice(Map<String, Object> inParam)
			throws StrategyError {
		 workBench.updateNotice(inParam);	
	}
	
}
