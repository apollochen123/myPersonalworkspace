package com.sitech.strategy.core.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.persist.capacity.impl.ProxyDataSelector.RuleSelector;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;

/**
 * 过滤算法接口
* @date: 2016-11-7 
* @author: sunliang 
* @title: FilterAlgorithm 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class FilterAlgorithm extends Algorithm implements IFilterAlgorithm {

	/**
	 * 营销案信息查询
	 */
	protected IDataSelector.IMarketCaseSelector marketCaseSelector;

	protected IRule rule;
	/**
	 * 
	* @date: 2017-4-15 
	* @author: chenhao
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
	* @date: 2016-11-8 
	* @author: zhangjj_crmpd
	* @title: setRule 
	* @param rule 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setRule(IRule rule) {
		this.rule = rule;
	}

	/**
	 * 过滤出批量push营销案
	* @date: 2016-11-29 
	* @author: zhangqia 
	* @title: filterBatchPushMarketCase 
	* @param marketCaseAndCustGroupList
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> filterBatchPushMarketCase(
			List<Map<String, Object>> marketCaseAndCustGroupList,String param) throws StrategyError {
		String positionType = "";
		if(Const.BATCHPUSHMSG.equalsIgnoreCase(param)){
			positionType =Const.POSITION_02_01;
		}else if(Const.BATCHPUSHPROD.equalsIgnoreCase(param)){
			positionType =Const.POSITION_01_02;
		}
		log.info("marketCaseAndCustGroupList:", marketCaseAndCustGroupList);
		List<Map<String, Object>> afterFilterMarketCaseAndCustGroupList = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(marketCaseAndCustGroupList)){
			for(Map<String, Object> marketCaseAndCustGroupMap : marketCaseAndCustGroupList){
				String marketCaseId = (String)marketCaseAndCustGroupMap.get("marketCaseId");
				Map<String,Object> m = new HashMap<String,Object>();
				m.put("marketCaseId", marketCaseId);
				MarketCaseCachePojo marketCaseCachePojo= marketCaseSelector.getMarketCaseDetailFromCache(m);
				List<String> positionList = (List) marketCaseCachePojo.getPositionMap().get("04");
				for(String position:positionList){
					if(position.equals(positionType)){
						//进行规则校验筛选出需要今日批量下发的营销案
						if(rule.isWaitToDayBatchPush(marketCaseAndCustGroupMap)){
							//判断是否在今天已生成的批量下发任务中
							if(rule.itHasBatchPushJob(marketCaseAndCustGroupMap,position)){
								log.info("-------itHasBatchPushJob--------", "true");
								afterFilterMarketCaseAndCustGroupList.add(marketCaseAndCustGroupMap);
							}
						}
					}
				}
			}
		}
		log.info("afterFilterMarketCaseAndCustGroupList:", afterFilterMarketCaseAndCustGroupList);
		return afterFilterMarketCaseAndCustGroupList;
	}
	/**
	 * 过滤出批量push营销案
	* @date: 2016-11-29 
	* @author: zhangqia 
	* @title: filterBatchPushMarketCase 
	* @param marketCaseAndCustGroupList
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> filterBatchPushMarketCaseOnlyWaitSend(
			List<Map<String, Object>> marketCaseAndCustGroupList) throws StrategyError {
		log.info("marketCaseAndCustGroupList:", marketCaseAndCustGroupList);
		List<Map<String, Object>> afterFilterMarketCaseAndCustGroupList = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(marketCaseAndCustGroupList)){
			for(Map<String, Object> marketCaseAndCustGroupMap : marketCaseAndCustGroupList){
				//进行规则校验筛选出需要今日批量下发的营销案
				if(rule.isWaitToDayBatchPush(marketCaseAndCustGroupMap)){
					afterFilterMarketCaseAndCustGroupList.add(marketCaseAndCustGroupMap);
				}
			}
		}
		log.info("afterFilterMarketCaseAndCustGroupList:", afterFilterMarketCaseAndCustGroupList);
		return afterFilterMarketCaseAndCustGroupList;
	}
	
	/**
	 * 过滤出已经生成的外呼任务营销案
	* @date: 2017-4-22 
	* @author: yuanchun
	* @title: filterCallTaskMarketCaseAndCustGroup 
	* @param marketCaseAndCustGroupList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public List<Map<String, Object>> filterCallTaskMarketCaseAndCustGroup(
			List<Map<String, Object>> marketCaseAndCustGroupList)
			throws StrategyError {
		log.debug("marketCaseAndCustGroupList:", marketCaseAndCustGroupList);
		List<Map<String, Object>> afterFilterMarketCaseAndCustGroupList = new ArrayList<Map<String,Object>>();
		if(!CommonUtils.objectIsNull(marketCaseAndCustGroupList)){
			for(Map<String, Object> marketCaseAndCustGroupMap : marketCaseAndCustGroupList){
				//判断是否已经生成外呼任务
				if(rule.isHasCallTask(marketCaseAndCustGroupMap)){
					afterFilterMarketCaseAndCustGroupList.add(marketCaseAndCustGroupMap);
				}
			}
		}
		log.info("afterFilterMarketCaseAndCustGroupList:", afterFilterMarketCaseAndCustGroupList);
		return afterFilterMarketCaseAndCustGroupList;
	}
}
