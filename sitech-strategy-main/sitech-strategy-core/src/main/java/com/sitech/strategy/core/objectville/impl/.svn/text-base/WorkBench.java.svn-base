package com.sitech.strategy.core.objectville.impl;

import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IWorkBench;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;

/**
 * 工作台对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: WorkBench 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public class WorkBench extends BaseClass implements IWorkBench {
	
	/**
	 *  审批查询对象
	 */
	protected IDataSelector.IAuditSelector auditSelector;
	
	/**
	 * 营销案查询对象
	 */
	protected IDataSelector.IMarketCaseSelector marketCaseSelector;
	
	/**
	 * 数据统计对象
	 */
	protected IDataSelector.IStatisticSelector statisticSelector;
	protected IDataInsertor.IStatisticInsertor statisticInsertor;
	protected IDataDeleter.IStatisticDeleter statisticDeleter;
	protected IDataUpdater.IStatisticUpdater statisticUpdater;
	


	


	/**
	 * 
	* @date: 2016-11-8 
	* @author: mengxi
	* @title: setMarketCaseSelector 
	* @param marketCaseSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMarketCaseSelector(
			IDataSelector.IMarketCaseSelector marketCaseSelector) {
		this.marketCaseSelector = marketCaseSelector;
	}


	/**
	 * 
	* @date: 2016-11-4 
	* @author: mengxi
	* @title: setAuditSelector 
	* @param auditSelector 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAuditSelector(IDataSelector.IAuditSelector auditSelector) {
		this.auditSelector = auditSelector;
	}
	/**
	 * 
	* @date: 2017-2-28 
	* @author: yexr
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
	* @date: 2017-3-1 
	* @author: yexr
	* @title: setStatisticInsertor 
	* @param statisticInsertor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setStatisticInsertor(
			IDataInsertor.IStatisticInsertor statisticInsertor) {
		this.statisticInsertor = statisticInsertor;
	}

	/**
	 * 
	* @date: 2017-3-1 
	* @author: yexr
	* @title: setStatisticDeleter 
	* @param statisticDeleter 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setStatisticDeleter(IDataDeleter.IStatisticDeleter statisticDeleter) {
		this.statisticDeleter = statisticDeleter;
	}

	/**
	 * 
	* @date: 2017-3-1 
	* @author: yexr
	* @title: setStatisticUpdater 
	* @param statisticUpdater 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setStatisticUpdater(IDataUpdater.IStatisticUpdater statisticUpdater) {
		this.statisticUpdater = statisticUpdater;
	}
	/**
	 *查询营销案审批数量 
	* @date: 2016-11-4 
	* @author: mengxi
	* @title: selectMarketCaseAuditNum 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> selectMarketCaseAuditNum(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		return auditSelector.selectMarketCaseAuditNum(inParam, queryFilter);
	}
	
	/**
	 * 查询营销案数量
	* @date: 2016-11-8 
	* @author: mengxi
	* @title: selectMarketCaseNum 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> selectMarketCaseNum(Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError{
		return marketCaseSelector.selectMarketCaseNum(inParam, queryFilter);
	}
	/**
	 * 查询公告
	* @date: 2017-2-28 
	* @author: yexr
	* @title: selectNoticeList
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> selectNoticeList(Map<String, Object> inParam,IQueryFilter queryFilter,int start,int limit) throws StrategyError{
		return statisticSelector.selectNoticeList(inParam, queryFilter, start, limit);
	}
    /**
     * 新增公告
    * @date: 2017-3-1 
    * @author: yexr
    * @title: insertNotice 
    * @param inParam
    * @param tempInParam
    * @throws StrategyError 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public void insertNotice(Map<String, Object> inParam,Map<String, Object> tempInParam) throws StrategyError{
		 statisticInsertor.insertNotice(inParam,tempInParam);
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
	public void removeNotice(Map<String, Object> inParam) throws StrategyError{
		statisticDeleter.removeNotice(inParam);
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
	public void updateNotice(Map<String, Object> inParam) throws StrategyError{
		statisticUpdater.updateNotice(inParam);
	}
	
}
