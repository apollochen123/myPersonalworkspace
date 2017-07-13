package com.sitech.strategy.manage.service.jcf.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 工作台
* @date: 2016-9-5 
* @author: sunliang
* @title: IWorkBenchManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IWorkBenchManageService {

	/**
	 * 查询渠道营销案订购汇总信息
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: queryChannelMarketCaseOrderReportInfo 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryChannelMarketCaseOrderReportInfo(InDTO inDTO);
	/**
	 * 根据地市查询某个触点下的接触量
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryChannelTouchNumByRegionCode 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryChannelTouchNumByRegionCode(InDTO inDTO);
	
	/**
	 * 根据地市查询某个营销案大类下面的接触量
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryMarketCaseTouchNumByRegionCode 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMarketCaseTouchNumByRegionCode(InDTO inDTO);
	
	/**
	 * 查询营销案审批数量
	* @date: 2016-11-4 
	* @author: mengxi
	* @title: qureyMarketCaseAuditorNum 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO qureyMarketCaseAuditNum(InDTO inDTO);
	
	/**
	 * 查询营销案数量
	* @date: 2016-11-8 
	* @author: mengxi
	* @title: qureyMarketCaseNum 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO qureyMarketCaseNum(InDTO inDTO);

	/**
	 * 根据日期参数的不同，查询昨日曝光量、当日累计曝光量
	* @date: 2016-11-26 
	* @author: yuanliang
	* @title: queryMarketCaseOrderReportSendNum 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMarketCaseOrderReportSendNum(InDTO inDTO);
	
	/**
	 * 查询公告列表
	* @date: 2017-2-24 
	* @author: yexr
	* @title: queryNoticeList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryNoticeList(InDTO inDTO);
	
	/**
	 * 查询产商品通用信息报表
	* @date: 2017-2-10 
	* @author: hannn
	* @title: queryProductCommonReportInfoList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryProductCommodityReportInfoList(InDTO inDTO);
	/**
	 * 查询各个地市的转化率
	* @date: 2016-12-7 
	* @author: tangaq
	* @Title: queryRegionCodeConvertRate 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryRegionCodeConvertRate(InDTO inDTO);
	
	/**
	 * 根据地市查询用户接触量
	* @date: 2016-12-6 
	* @author: tangaq
	* @Title: queryUserTouchNumByRegionCode 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryUserTouchNumByRegionCode(InDTO inDTO);
	
	
	/**
	 * 新增公告
	* @date: 2017-3-1 
	* @author: yexr
	* @title: saveNotice 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveNotice(InDTO inDTO);
	/**
	 * 修改公告
	* @date: 2017-3-1 
	* @author: yexr
	* @title: updateNotice 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateNotice(InDTO inDTO);
	/**
	 * 删除公告
	* @date: 2017-3-1 
	* @author: yexr
	* @title: removeNotice 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO removeNotice(InDTO inDTO);
}
