package com.sitech.strategy.manage.entity.inter;

import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 规则实体
* @date: 2016-9-5 
* @author: tangaq
* @title: IRuleManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IRuleManageEntity {
	
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
	public Map<String,Object> queryGlobalStrategyConfigList(Map<String,Object> inParam) throws StrategyError;
	
	/**查询规则明细
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
	public Map<String,Object> queryRuleDetailByDetailId(Map<String,Object> inParam) throws StrategyError;

	/**
	 *删除全局策略配置 
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: removeGlobalStrategyConfig 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeGlobalStrategyConfig(Map<String,Object> inParam) throws StrategyError;
	
	/** 根据明细Id删除规则明细
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
	public void removeRuleDetailByDetailId(Map<String,Object> inParam) throws StrategyError;

	/**
	 *  保存全局策略配置 
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
	public void saveGlobalStrategyConfig(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 规则明细保存JL
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
	public Map<String,Object> saveRuleDetailByCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/** 规则明细保存
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
	public Map<String,Object> saveRuleDetailByCustGroupAndChannel(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 全局策略配置中修改免打扰配置 
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
	public void updateNoDisturbConfig(Map<String,Object> inParam) throws StrategyError;

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
	public void updateShortMsgMoveTraffic(Map<String,Object> inParam) throws StrategyError;

	/**
	 *  全局策略配置中修改接触时间的配置 
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
	public void updateTouchTimeConfig(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 *全局策略配置中修改接触次数的配置 
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
	public void updateTouchCountConfig(Map<String,Object> inParam) throws StrategyError;
}
