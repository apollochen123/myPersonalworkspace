package com.sitech.strategy.common.pojo.impl.rdbms;

import com.sitech.strategy.common.pojo.inter.rdbms.IIBatisSqlMap;


/**
 * ibatis表pojo对象(吉林)
* @date: 2017-2-7 
* @author: sunyuan
* @title: IBatisSqlMapByJLMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class IBatisSqlMapByJLMob extends IBatisSqlMapByAHTel implements IIBatisSqlMap {
	
	/**
	 * 渠道任务表
	 */
	private static final String IBATIS_RMCHANNELTASKINFO_SELECT_TASKCOUNTGROUPBYLOGINNO = "RmChanneltaskInfo.selectTaskCountGroupByLoginNoByJLMob";
	
	/**
	 * 营销案表
	 */
	private static final String IBATIS_RMMARKETCASEINFO_SELECT_EVENTTRIGGERMARKETCASE = "RmMarketcaseInfo.selectEventTriggerMarketCaseByJLMob";
	private static final String IBATIS_RMMARKETCASEINFO_SELECT = "RmMarketcaseInfo.selectRmMarketcaseInfoByJLMob";
	/**
	 * 审批记录表
	 */
	private static final String IBATIS_RMAUDITRECORDINFO_SELECT_MARKETCASEAUDITRECORD = "RmAuditrecordInfo.selectRmMarketCaseAuditRecordInfoByJLMob";
    private static final String IBATIS_RMAUDITRECORDINFO_SELECT_AUDITRECORDDETAILLIST = "RmAuditrecordInfo.selectRmAuditRecordDetailListByJLMob";



	/**
	 * 
	* @date: 2017-1-2 
	* @author: sunliang 
	* @title: getIbatisRmmarketcaseinfoSelectEventtriggermarketcase 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelectEventtriggermarketcase() {
		return IBATIS_RMMARKETCASEINFO_SELECT_EVENTTRIGGERMARKETCASE;
	}
	
	/**
	 * 
	* @date: 2017-2-28 
	* @author: yuanchun
	* @title: getIbatisRmmarketcaseinfoSelect 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelect() {
		return IBATIS_RMMARKETCASEINFO_SELECT;
	}
	
	/**
	 * 
	* @date: 2017-2-28 
	* @author: yuanchun
	* @title: getIbatisRmauditrecordinfoSelectMarketcaseauditrecord 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmauditrecordinfoSelectMarketcaseauditrecord() {
		return IBATIS_RMAUDITRECORDINFO_SELECT_MARKETCASEAUDITRECORD;
	}
	
	/**
	 * 
	* @date: 2017-2-28 
	* @author: yuanchun
	* @title: getbatisRmchanneltaskinfoSelectTaskCountGroupByLoginNo 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getbatisRmchanneltaskinfoSelectTaskCountGroupByLoginNo(){
		return IBATIS_RMCHANNELTASKINFO_SELECT_TASKCOUNTGROUPBYLOGINNO;
	}
	
	/**
	 * 
	* @date: 2017-2-28 
	* @author: yuanchun
	* @title: getIbatisRmauditrecordinfoSelectAuditrecorddetaillist 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmauditrecordinfoSelectAuditrecorddetaillist() {
		return IBATIS_RMAUDITRECORDINFO_SELECT_AUDITRECORDDETAILLIST;
	}
	
}
