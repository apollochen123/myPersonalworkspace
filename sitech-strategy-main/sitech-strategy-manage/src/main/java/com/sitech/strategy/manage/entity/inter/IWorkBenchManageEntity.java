package com.sitech.strategy.manage.entity.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 工作台实体
* @date: 2016-9-5 
* @author: tangaq
* @title: IWorkBenchManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IWorkBenchManageEntity {
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
	public List<Map<String,Object>> queryChannelMarketCaseOrderReportInfo(Map<String, Object> inParam) throws StrategyError;
	
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
	public Map<String, Object> queryChannelTouchNumByRegionCode(Map<String, Object> inParam) throws StrategyError;
	
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
	public Map<String, Object> queryMarketCaseTouchNumByRegionCode(Map<String, Object> inParam) throws StrategyError;

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
	public Map<String,Object> qureyMarketCaseAuditNum(Map<String,Object> inParam) throws StrategyError;
	
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
	public Map<String, Object> qureyMarketCaseNum(Map<String, Object> inParam) throws StrategyError;
	
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
	public Map<String,Object> queryMarketCaseOrderReportSendNum(Map<String,Object> inParam) throws StrategyError;
	
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
	public Map<String,Object> queryNoticeList(Map<String, Object> inParam) throws StrategyError;
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
	public Map<String,Object> queryProductCommodityReportInfoList (Map<String,Object> inParam) throws StrategyError;
	/**
	 *  查询各个地市的转化率
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
	public Map<String,Object> queryRegionCodeConvertRate(Map<String,Object> inParam) throws StrategyError;
	
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
	public Map<String,Object> queryUserTouchNumByRegionCode(Map<String,Object> inParam) throws StrategyError;
	
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
	public void saveNotice(Map<String,Object> inParam) throws StrategyError;
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
	public void removeNotice(Map<String,Object> inParam) throws StrategyError;
	
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
	public void updateNotice(Map<String,Object> inParam) throws StrategyError;
}
