package com.sitech.strategy.common.pojo.impl.rdbms;

import com.sitech.strategy.common.base.BaseClass;
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
public class IBatisSqlMapByHBMob extends IBatisSqlMapByAHTel implements IIBatisSqlMap {
	
	private static final String IBATIS_RMMARKETCASEINFO_SELECT_BATCHPUSHMARKETCASEANDCUSTGROUP = "RmMarketcaseInfo.selectMarketCaseAndCustGroup";

	/**
	 * 
	* @date: 2016-2-14 
	* @author: zhangqia 
	* @title: getIbatisRmmarketcaseinfoSelectBatchpushmarketcaseandcustgroup 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getIbatisRmmarketcaseinfoSelectBatchpushmarketcaseandcustgroup() {
		return IBATIS_RMMARKETCASEINFO_SELECT_BATCHPUSHMARKETCASEANDCUSTGROUP;
	}
	
}
