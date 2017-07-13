package com.sitech.strategy.manage.entity.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IRule;
import com.sitech.strategy.core.pojo.inter.IResultList;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.IRuleManageEntity;

/**
 * 规则实体
* @date: 2016-9-5 
* @author: tangaq
* @title: RuleManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class RuleManageEntity extends BaseManageEntity implements IRuleManageEntity {
	
	/**
	 * 规则配置对象
	 */
	protected IRule rule;
	/**
	 * 查询列表对象
	 */
	protected IResultList resultList;
	
	/** 
	 * @date: 2016-10-16 
	 * @author: xiongxq
	 * @Title: setRule 
	 * @param rule the rule to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setRule(IRule rule) {
		this.rule = rule;
	}

	/** 
	 * @date: 2016-10-11 
	 * @author: xiongxq
	 * @Title: setResultList 
	 * @param resultList the resultList to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setResultList(IResultList resultList) {
		this.resultList = resultList;
	}

	/** 
	 * 查询全局策略配置列表
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: queryGlobalStrategyConfigList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> queryGlobalStrategyConfigList(
			Map<String, Object> inParam) throws StrategyError {
		IQueryFilter queryFilter = this.settleGlobalStrategyConfigListFilter(inParam);
		List<Map<String,Object>> outList = rule.queryGlobalStrategyConfigList(inParam, queryFilter);
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("globalStrategyConfigList", outList);
		return outMap;
		
	}

	/** 
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: queryRuleDetailByDetailId 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String, Object> queryRuleDetailByDetailId(
			Map<String, Object> inParam) throws StrategyError {
		QueryFilter queryFilter = new QueryFilter();
		queryFilter.setRuleDetailId((String) inParam.get("ruleDetailId"));
		Map<String, Object> outMap = new HashMap<String, Object>();
		outMap.put("ruleDetail", rule.queryRuleDetail(inParam, queryFilter));
		return outMap;
	}

	/** 
	 * 删除全局策略配置 
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: GlobalStrategyConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void removeGlobalStrategyConfig(Map<String, Object> inParam)
			throws StrategyError {
		rule.removeGlobalStrategyConfig(inParam);
	}
	
	/** 
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: removeRuleDetailByDetailId 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void removeRuleDetailByDetailId(Map<String, Object> inParam)
			throws StrategyError {
		rule.removeRuleDetailByDetailId(inParam);
	}
	

	/**
	 * 保存全局策略配置  
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: saveGlobalStrategyConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void saveGlobalStrategyConfig(Map<String, Object> inParam)
			throws StrategyError {
		rule.addGlobalStrategyConfig(inParam);
	}
	
	/**
	 * 增加规则明细JL
	* @date: 2017-2-21 
	* @author: zhangyw_crmpd
	* @title: saveRuleDetailByCustGroup 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String,Object> saveRuleDetailByCustGroup(Map<String, Object> inParam)
			throws StrategyError {
		return rule.addRuleDetailByCustGroup(inParam);
	}
	
	/** 增加规则明细
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: saveRuleDetailByCustGroupAndChannel 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public Map<String,Object> saveRuleDetailByCustGroupAndChannel(Map<String, Object> inParam)
			throws StrategyError {
		return rule.addRuleDetailByCustGroupAndChannel(inParam);
	}

	/** 
	 *  全局策略配置中修改免打扰配置 
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateNoDisturbConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void updateNoDisturbConfig(Map<String, Object> inParam)
			throws StrategyError {
		// TODO Auto-generated method stub
	}

	/**
	 * 更新短信推送流量
	* @date: 2016-10-8 
	* @author: xiongxq
	* @title: updateShortMsgMoveTraffic 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void updateShortMsgMoveTraffic(
			Map<String, Object> inParam) throws StrategyError {
	}

	/**
	 * 全局策略配置中修改接触时间的配置  
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateTouchTimeConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void updateTouchTimeConfig(Map<String, Object> inParam)
			throws StrategyError {
		// TODO Auto-generated method stub
	}

	/** 
	 * 全局策略配置中修改接触次数的配置 
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateTouchCountConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public void updateTouchCountConfig(Map<String, Object> inParam)
			throws StrategyError {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 生成IQueryFilter对象
	* @date: 2016-10-24 
	* @author: xiongxq
	* @Title: settleDownLoadAuditListFilter 
	* @param inParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleGlobalStrategyConfigListFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter=new QueryFilter();
		queryFilter.setRuleDetailId((String)inParam.get("ruleDetailId"));
		queryFilter.setRuleId((String)inParam.get("ruleId"));
		queryFilter.setChannelId((String)inParam.get("channelId"));
		return queryFilter;
	}
	
}

