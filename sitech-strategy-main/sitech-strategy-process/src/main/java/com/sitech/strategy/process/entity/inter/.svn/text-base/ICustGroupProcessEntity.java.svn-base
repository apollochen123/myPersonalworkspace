package com.sitech.strategy.process.entity.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 目标客户群实体
* @date: 2016-9-5 
* @author: sunliang 
* @title: ICustGroupEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ICustGroupProcessEntity {
	
	
	/**
	 * 处理数据源模式客户群
	* @date: 2016-11-14 
	* @author: zhangjj_crmpd
	* @title: handleDBCustGroupTemp 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleDBCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 处理导入目标客户群明细表(临时表)
	* @date: 2016-10-30 
	* @author: zhangjj_crmpd
	* @title: handleLoadCustGroupDetailInfo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleLoadCustGroupDetailInfo(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 处理导入目标客户群Csv
	* @date: 2016-11-25 
	* @author: zhangjj_crmpd
	* @title: handleCustGroupCsv 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleCustGroupCsv(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 处理客户群导入Excel文件
	* @date: 2016-11-24 
	* @author: zhangjj_crmpd
	* @title: handleCustGroupExcel 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleCustGroupExcel(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 处理导入目标客户群标签表(临时表)
	* @date: 2016-11-25 
	* @author: zhangjj_crmpd
	* @title: handleLoadCustGroupLabelInfo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleLoadCustGroupLabelInfo(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 处理静态标签导入目标客户群
	* @date: 2017-3-14 
	* @author:liuqi
	* @title: handleStaticLabelLoadCustGroupInfo
	* @param hashMap 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleStaticLabelLoadCustGroupInfo(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 加载目标客户群标签到缓存
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: loadCustGoupLabelToCache 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void loadCustGoupLabelToCache() throws StrategyError;
	
	/** 
	 * coc目标客户群解析
	* @date: 2016-10-31 
	* @author: songxj
	* @title: parseCocXmlDocument 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void parseCocCustGroup(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 查询目标客户群数量
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: queryCustGroupCountById 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupCountById(Map<String,Object> inParam) throws StrategyError;


}
