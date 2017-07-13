package com.sitech.strategy.manage.entity.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.PagingDevice;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.impl.SortParamer;
import com.sitech.strategy.common.pojo.inter.IPagingDevice;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IEvaluate;
import com.sitech.strategy.core.objectville.inter.IMarketCase;
import com.sitech.strategy.core.pojo.impl.ResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IEvaluateManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 评估(查询、报表)实体
* @date: 2016-9-5 
* @author: tangaq
* @title: EvaluateManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class EvaluateManageEntity extends BaseManageEntity implements IEvaluateManageEntity {
	
	/**
	 * hbase批量push任务统计查询
	 */
	protected IDataSelector.IBatchPushTaskSelector batchPushTaskSelector;
	
	/**
	 * 评估对象
	 */
	protected IEvaluate evaluate;
	
	/**
	 * 查询用户接触对象
	 */
	protected IDataSelector.IUserSelector userSelector;
	
	/**
	 * 营销案查询对象
	 */
	protected IMarketCase marketCase;
	
	/**
	 * 查询列表对象
	 */
	protected ResultList resultList;
	
	/**
	 * 
	* @date: 2016-11-21 
	* @author: xiongxq
	* @Title: setBatchPushTaskSelector 
	* @param batchPushTaskSelector 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBatchPushTaskSelector(
			IDataSelector.IBatchPushTaskSelector batchPushTaskSelector) {
		this.batchPushTaskSelector = batchPushTaskSelector;
	}

	/**
	 * 
	* @date: 2017-3-14 
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
	* @date: 2017-4-18 
	* @author: yuanchun
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
	* @date: 2017-4-17 
	* @author: yuanchun
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
	 * @date: 2016-11-21 
	 * @author: xiongxq
	 * @Title: setResultList 
	 * @param resultList the resultList to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setResultList(ResultList resultList) {
		this.resultList = resultList;
	}

	/**
	 * 查询区域市场空间数据
	* @date: 2016-11-9 
	* @author: fangyuan_crmpd
	* @title: queryAreaMarketSpaceData 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryAreaMarketSpaceData(
			Map<String, Object> inParam) throws StrategyError {
		Map<String, Object> outParam = new HashMap<String, Object>();
		outParam.put("cmccItvNum", "553");
		outParam.put("cuccItvNum", "544");
		outParam.put("ctccItvNum", "746");
		outParam.put("cmccMobileNum", "243");
		outParam.put("cuccMobileNum", "756");
		outParam.put("ctccMobileNum", "423");
		outParam.put("cmccBroadbandNum", "123");
		outParam.put("cuccBroadbandNum", "142");
		outParam.put("ctccBroadbandNum", "454");
		return outParam;
	}

	/**
	 * 查询营销案客户关系列表
	* @date: 2016-10-17 
	* @author: fangyuan_crmpd
	* @title: queryMarketCaseRelCustList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryMarketCaseRelCustList(Map<String, Object> inParam) throws StrategyError {
		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("marketCaseId", "123");
		map.put("marketCaseName", "快带提速一");
		map.put("userName", "古惑仔");
		map.put("busiNo", "18395742905");
		map.put("channelId", "01");
		map.put("channelName", "小CEO");
		map.put("taskStatus","执行中");
		map.put("startTime", "2016-11-07 10:10:10");
		map.put("endTime", "2016-11-07 12:12:12");
		map.put("queryId", "42424242151");
		map.put("currentPageCode", "1");
		map.put("perRecordCount", "10");
		map.put("totalRecordCount", "1");
		list.add(map);
		Map<String, Object> outMap = new HashMap<String, Object>();
		outMap.put("queryCustList", list);
		return outMap;			
	}
	
	/** 
	 * 营销案push任务统计查询
	* @date: 2016-10-29 
	* @author: songxj
	* @title: queryPushTaskStatistics 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryPushTaskStatistics(Map<String, Object> inParam) throws StrategyError {
		if(CommonUtils.objectIsNull(inParam.get("queryType"))){
			String marketCaseId = (String) inParam.get("marketCaseId");
			String startTime = "";
			String endTime = "";
			Calendar calendar = Calendar.getInstance();
			//获取查询开始时间,如果没有默认系统当月第一天开始
			if (!CommonUtils.objectIsNull(inParam.get("startTime"))) {
				startTime = (String) inParam.get("startTime");
				startTime = DateUtil.stringToString(startTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD1);
			} else {
				calendar.set(calendar.DAY_OF_MONTH, 1);
				startTime = DateUtil.DateToString(calendar.getTime(), DateUtil.DATE_FROMAT_YYYYMMDD1);
			}
			calendar.set(calendar.DATE, DateUtil.StringToDate(startTime, DateUtil.DATE_FROMAT_YYYYMMDD1).getDate());
			//获取查询结束时间，如果没有默认系统当前时间
			if (CommonUtils.objectIsNull(inParam.get("endTime"))) {
				endTime = DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1);
			} else {
				endTime = (String) inParam.get("endTime");
				endTime = DateUtil.stringToString(endTime, DateUtil.TIME_FROMAT_SIMPLE1, DateUtil.DATE_FROMAT_YYYYMMDD1);
			}
			long total = 0;
			long sendCount = 0;
			while (Long.parseLong(startTime) <= Long.parseLong(endTime)) {
				Map<String, Object> tempInParam = new HashMap<String, Object>();
				tempInParam.put("rowkey", marketCaseId+Const.SEPARATOR_COLON+startTime);
				//查询任务总量
				String createTaskCount = batchPushTaskSelector.selectBatchPushCreateTaskCount(tempInParam);
				String sendTaskCount = batchPushTaskSelector.selectBatchPushSendTaskCount(tempInParam);
				if(null==createTaskCount){
					createTaskCount="0";
				}
				if(null==sendTaskCount){
					sendTaskCount="0";
				}
				total += Integer.parseInt(createTaskCount);
				sendCount += Integer.parseInt(sendTaskCount);

				calendar.add(calendar.DAY_OF_MONTH, 1);
				startTime = DateUtil.DateToString(calendar.getTime(), DateUtil.DATE_FROMAT_YYYYMMDD1);
			}
			inParam.put("total", total);
			inParam.put("send", sendCount);
			inParam.put("rest", total-sendCount);
			inParam.put("marketCaseId", marketCaseId);
		}else{
			Map<String,Object> batchPushCount = new HashMap<String,Object>();
			batchPushCount = evaluate.queryMarketCasePushTaskStatistics(inParam);
			inParam.put("batchPushCount",batchPushCount);	
		}


		return inParam;
	}
	
	/**
	 * 查询报表列表 
	* @date: 2016-11-21 
	* @author: xiongxq
	* @Title: queryReportFormList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryReportFormList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter =this.settleReportFormListFilter(inParam);
		IPagingDevice pagingDevice = new PagingDevice();
		ISortParamer sortParamer = new SortParamer();
		IPagingDevice pagingDeviceTmp = resultList.queryResultList(inParam, queryFilter,sortParamer,pagingDevice.getInstance(inParam));
		Map<String,Object> outParam = this.getReportFormListByPagingDevice(pagingDeviceTmp);
		return outParam;
	}
	
	/**
	 * 查询报表统计
	* @date: 2017-4-17 
	* @author: yuanchun
	* @title: queryReportFormStatistics 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryReportFormStatistics(Map<String, Object> inParam) throws StrategyError {
		//初始化时得到所有执行中和已推送的活动列表
		Map<String,Object> marketCaseReportFormMap = marketCase.queryMarketCaseReportFormList(inParam);
		return marketCaseReportFormMap;
	}
	
	/**
	 * 查询用户回单反馈列表
	* @date: 2017-1-9 
	* @author:liuqi
	* @title: queryUserReceiptRecordListList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryUserReceiptRecordList(Map<String, Object> inParam) throws StrategyError{
		IQueryFilter queryFilter =this.settleUserReceiptRecordListFilter(inParam);
		int start = Integer.valueOf(inParam.get("currentPageCode")==null?"1":(String)inParam.get("currentPageCode"));
		int	limit = Integer.valueOf(inParam.get("perRecordCount")==null?"10":(String)inParam.get("perRecordCount"));
		Map<String,Object> resMap = userSelector.selectUserReceiptRecordList(inParam, queryFilter, start, limit);
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
		Map<String,Object> outParam = this.getUserReceiptRecordList(outMap);
		return outParam;
	}
	
	/**
	 * 查询用户接触视图列表
	* @date: 2017-1-6 
	* @author: liuqi
	* @title: queryUserTouchViewList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryUserTouchViewList(Map<String,Object> inParam) throws StrategyError{
		IQueryFilter queryFilter =this.settleUserTouchViewListFilter(inParam);
		int start = Integer.valueOf(inParam.get("currentPageCode")==null?"1":(String)inParam.get("currentPageCode"));
		int	limit = Integer.valueOf(inParam.get("perRecordCount")==null?"10":(String)inParam.get("perRecordCount"));
		Map<String,Object> resMap = userSelector.selectUserTouchViewList(inParam, queryFilter, start, limit);
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
		Map<String,Object> outParam = this.getUserTouchViewList(outMap);
		return outParam;
		
	}
	
	
	/**
	 * 将查询报表列表的出参转换成Map
	* @date: 2016-11-21 
	* @author: xiongxq
	* @Title: getReportFormListByPagingDevice 
	* @param pagingDevice
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String,Object> getReportFormListByPagingDevice(IPagingDevice pagingDevice){
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("currentPageCode", pagingDevice.getCurrentPageCode());
		outParam.put("perRecordCount", pagingDevice.getPerRecordCount());
		outParam.put("totalRecordCount", pagingDevice.getTotalRecordCount());
		outParam.put("reportFormList", pagingDevice.getPerPageInfo());
		outParam.put("queryId", pagingDevice.getQueryId());
	    return outParam;
	}
	
	/**
	 *查询报表列表时将入参转换成 QueryFilter对象
	* @date: 2016-11-21 
	* @author: xiongxq
	* @Title: settleReportFormListFilter 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleReportFormListFilter(Map<String, Object> inParam){		
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setEndTime((String)inParam.get("endTime"));
		queryFilter.setStartTime((String)inParam.get("startTime"));
		queryFilter.setMarketCaseName((String)inParam.get("marketCaseName"));
		return queryFilter;
	}
		
	/**
	 * 查询用户回单反馈列表的出参转换成Map
	* @date: 2017-1-9 
	* @author:liuqi
	* @title: getUserReceiptRecordList 
	* @param outMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> getUserReceiptRecordList(Map<String, Object> outMap) {
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("currentPageCode", outMap.get("currentPageCode"));
		outParam.put("perRecordCount", outMap.get("perRecordCount"));
		outParam.put("totalRecordCount", outMap.get("sum"));
		outParam.put("userReceiptRecordList", outMap.get("result"));
		return outParam;
	}
	
	/**
	 * 查询用户回单反馈列表时将入参转换成 QueryFilter对象
	* @date: 2017-1-9 
	* @author:liuqi
	* @title: settleUserReceiptRecordListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleUserReceiptRecordListFilter(Map<String, Object> inParam) {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setChannelId((String)inParam.get("channelId"));
		queryFilter.setIdNo((String)inParam.get("idNo"));
		return queryFilter;
	}
	
	/**
	 * 将查询用户接触列表的出参转换成Map
	* @date: 2017-1-5 
	* @author:liuqi
	* @title: getUserTouchViewList 
	* @param outMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected Map<String, Object> getUserTouchViewList(Map<String, Object> outMap) {
		Map<String,Object> outParam = new HashMap<String,Object>();
		outParam.put("currentPageCode", outMap.get("currentPageCode"));
		outParam.put("perRecordCount", outMap.get("perRecordCount"));
		outParam.put("totalRecordCount", outMap.get("sum"));
		outParam.put("userTouchViewList", outMap.get("result"));
	    return outParam;
	}
	
	/**
	 * 查询用户接触列表时将入参转换成 QueryFilter对象
	* @date: 2017-1-5 
	* @author:liuqi
	* @title: settleUserTouchViewListFilter 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleUserTouchViewListFilter(
			Map<String, Object> inParam) {
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setChannelId((String)inParam.get("channelId"));
		queryFilter.setIdNo((String)inParam.get("idNo"));
		queryFilter.setRecommonedStartTime((String)inParam.get("recommonedStartTime"));
		queryFilter.setRecommonedEndTime((String)inParam.get("recommonedEndTime"));
		return queryFilter;
	}

}
