package com.sitech.strategy.manage.entity.param.inter;

import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;

/**
 * 工作台参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: IWorkBenchManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IWorkBenchManageParam {
	
	/**
	 * 入参处理:查询渠道营销案订购汇总信息
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: queryChannelMarketCaseOrderReportInfoInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryChannelMarketCaseOrderReportInfoInParam(InDTO inDTO);
	
	/**
	 * 出参处理：查询渠道营销案订购汇总信息
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: queryChannelMarketCaseOrderReportInfoOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryChannelMarketCaseOrderReportInfoOutParam(List<Map<String,Object>> outParam);
	
	/**
	 * 根据地市查询某个触点下的接触量的入参处理
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryChannelTouchNumByRegionCodeInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryChannelTouchNumByRegionCodeInParam(InDTO inDTO);
	
	/**
	 * 根据地市查询某个触点下的接触量的出参处理
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryChannelTouchNumByRegionCodeOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryChannelTouchNumByRegionCodeOutParam(Map<String,Object> outParam);
	
	/**
	 * 根据地市查询某个营销案大类下面的接触量的入参转换
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryMarketCaseTouchNumByRegionCodeInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryMarketCaseTouchNumByRegionCodeInParam(InDTO inDTO);
	
	/**
	 *  根据地市查询某个营销案大类下面的接触量的出参转换
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryMarketCaseTouchNumByRegionCodeOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryMarketCaseTouchNumByRegionCodeOutParam(Map<String,Object> outParam);
	
	/**
	 * 查询营销案审批数量入参处理
	* @date: 2016-11-4 
	* @author: mengxi
	* @title: qureyMarketCaseAuditNumInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> qureyMarketCaseAuditNumInParam(InDTO inDTO);
	
	
	/**
	 * 查询营销案审批数量出参处理
	* @date: 2016-11-4 
	* @author: mengxi
	* @title: qureyMarketCaseAuditNumOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO qureyMarketCaseAuditNumOutParam(Map<String,Object> outParam);
	
	/**
	 * 查询营销案数量入参处理
	* @date: 2016-11-8 
	* @author: mengxi
	* @title: qureyMarketCaseNumInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> qureyMarketCaseNumInParam(InDTO inDTO);
	
	/**
	 * 查询营销案数量出参处理
	* @date: 2016-11-8 
	* @author: mengxi
	* @title: qureyMarketCaseNumOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO qureyMarketCaseNumOutParam(Map<String, Object> outParam);
	/**
	 * 入参处理：根据日期参数的不同，查询昨日曝光量、当日累计曝光量
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: queryMarketCaseOrderReportSendNumInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryMarketCaseOrderReportSendNumInParam(InDTO inDTO);
	/**
	 * 出参处理:根据日期参数的不同，查询昨日曝光量、当日累计曝光量
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: queryMarketCaseOrderReportSendNumOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryMarketCaseOrderReportSendNumOutParam(Map<String, Object> outParam);
	
	

	/**
	 * 查询公告表入参处理
	* @date: 2017-2-27 
	* @author: yexr
	* @title: queryNoticeListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryNoticeListInParam(InDTO inDTO);
	
	/**
	 * 查询公告表出参处理
	* @date: 2017-2-27 
	* @author: yexr
	* @title: queryNoticeListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryNoticeListOutParam(Map<String,Object> outParam);
	
	/**
	 * 产商品信息报表入参
	* @date: 2017-2-22 
	* @author: hannn
	* @title: queryProductCommodityReportInfoListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryProductCommodityReportInfoListInParam(InDTO inDTO); 
	/**
	 * 产商品信息报表出参
	* @date: 2017-2-22 
	* @author: hannn
	* @title: queryProductCommodityReportInfoListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryProductCommodityReportInfoListOutParam(Map<String,Object> outParam);
	
	/**
	 * 查询各个地市的转化率的入参转换
	* @date: 2016-12-7 
	* @author: tangaq
	* @Title: queryRegionCodeConvertRateInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryRegionCodeConvertRateInParam(InDTO inDTO);
	
	/**
	 *  查询各个地市的转化率的出参转换
	* @date: 2016-12-7 
	* @author: tangaq
	* @Title: queryRegionCodeConvertRateOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryRegionCodeConvertRateOutParam(Map<String, Object> outParam);
	
	/**
	 * 根据地市查询用户接触量入参处理 
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryUserTouchNumByRegionCodeInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryUserTouchNumByRegionCodeInParam(InDTO inDTO);
	
	/**
	 * 根据地市查询用户接触量出参处理
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryUserTouchNumByRegionCodeOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryUserTouchNumByRegionCodeOutParam(Map<String, Object> outParam);
	
	/**
	 * 新增公告入参处理
	* @date: 2017-3-1 
	* @author: yexr
	* @title: saveNoticeInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveNoticeInParam(InDTO inDTO);

	/**
	 * 新增公告出参处理
	* @date: 2017-3-1 
	* @author: yexr
	* @title: saveNoticeOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveNoticeOutParam();
	
	
	/**
	 * 删除公告入参处理
	* @date: 2017-3-1 
	* @author: yexr
	* @title: removeNoticeInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeNoticeInParam(InDTO inDTO);
	
	/**
	 * 删除公告出参处理
	* @date: 2017-3-1 
	* @author: yexr
	* @title: removeNoticeOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeNoticeOutParam();
	
 public Map<String,Object> updateNoticeInParam(InDTO inDTO);
	
	/**
	 * 删除公告出参处理
	* @date: 2017-3-1 
	* @author: yexr
	* @title: removeNoticeOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO updateNoticeOutParam();
	
}
