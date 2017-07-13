package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 评估对象
* @date: 2016-9-5 
* @author: yangwl
* @title: IEvaluate 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IEvaluate {
	
	/**
	 * 增加受理统计记录
	* @date: 2017-2-16 
	* @author: tangaq
	* @title: addAcceptStatisticRecord 
	* @param inParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addAcceptStatisticRecord(Map<String,Object> inParam)throws StrategyError;

	/**
	 * 增加实时统计记录
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: addRealStatisticRecord 
	* @param inParam
	* @param cacheMarkCaseList 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addRealStatisticRecord(Map<String, Object> inParam,List<Map<String, Object>> cacheMarkCaseList) throws StrategyError;
	
	/**
	 * 获取营销案订购量
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: getMarketCaseOrderNum 
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> getMarketCaseOrderNum() throws StrategyError;
	
	/**
	 * 获取营销案接触量
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: getMarketCaseContactNum 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> getMarketCaseContactNum(Map<String, Object> inParam) throws StrategyError;

	/**
	 * 导入产商品信息报表数据
	* @date: 2017-1-24 
	* @author: mengxi
	* @title: importProductCommodityReportData 
	* @param dirPath 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void importProductCommodityReportData(String dirPath) throws StrategyError;
	
	/**
	 * 插入营销案产品订购量统计表
	* @date: 2016-11-26 
	* @author: mengxi
	* @title: insertMarketCaseOrderReportData 
	* @param inList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void insertMarketCaseOrderReportData(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 营销案push任务统计查询
	* @date: 2017-3-13 
	* @author: tangaq
	* @title: queryMarketCasePushTaskStatistics 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCasePushTaskStatistics(Map<String, Object> inParam) throws StrategyError; 
	
	/**
	 * 查询报表列表
	* @date: 2016-11-21 
	* @author: xiongxq
	* @Title: queryReportFormList 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryReportFormList(Map<String,Object> inParam,IQueryFilter queryFilter,ISortParamer sortParamer) throws StrategyError;
	/**
	 * 查询渠道营销案订购汇总信息
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: selectChannelMarketCaseOrderReportInfoList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> selectChannelMarketCaseOrderReportInfoList(Map<String,Object> inParam) throws StrategyError;
	/**
	 * 根据日期参数的不同，查询昨日曝光量、当日累计曝光量
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: selectMarketCaseOrderReportSendNum 
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> selectMarketCaseOrderReportSendNum(IQueryFilter queryFilter) throws StrategyError;
	/**
	 * 查询产商品信息报表
	* @date: 2017-3-3 
	* @author: hannn
	* @title: selectProductCommodityReportInfo 
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
	public Map<String,Object> selectProductCommodityReportInfo(Map<String,Object> inParam,IQueryFilter queryFilter, ISortParamer sortParamer) throws StrategyError;
	/**
	 * 查询全省产商品信息报表
	* @date: 2017-2-24 
	* @author: hannn
	* @title: selectProductCommodityReportInfoByProvince 
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
	public Map<String,Object> selectProductCommodityReportInfoByProvince(Map<String,Object> inParam,IQueryFilter queryFilter, ISortParamer sortParamer) throws StrategyError;
	
}
