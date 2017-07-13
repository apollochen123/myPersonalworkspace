package com.sitech.strategy.manage.service.jcf.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 规则
* @date: 2016-9-5 
* @author: sunliang
* @title: IRuleManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IRuleManageService {
	
	/**
	 * 查询全局策略配置列表
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: queryGlobalStrategyConfigList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryGlobalStrategyConfigList(InDTO inDTO);
	
	/** 查询规则明细
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: queryRuleDetailBydetailId 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public OutDTO queryRuleDetailBydetailId(InDTO inDTO);

	/**
	 * 删除全局策略配置
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: removeGlobalStrategyConfig 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO removeGlobalStrategyConfig(InDTO inDTO);
	
	/** 耕具规则明细ID删除规则明细
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: removeRuleDetailByDetailId 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public OutDTO removeRuleDetailByDetailId(InDTO inDTO);

	/**
	 * 全局策略配置的保存
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: saveGlobalStrategyConfig 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveGlobalStrategyConfig(InDTO inDTO);
	
	/**
	 * 增加事件或渠道下规则明细
	* @date: 2017-2-21 
	* @author: zhangyw_crmpd
	* @title: saveRuleDetailByCustGroup 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveRuleDetailByCustGroup(InDTO inDTO);
	
	/** 增加规则明细
	* @date: 2016-10-15 
	* @author: wangpei
	* @title: saveRuleDetailByCustGroupAndChannel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public OutDTO saveRuleDetailByCustGroupAndChannel(InDTO inDTO);

	/**
	 * 修改免打扰配置
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateNoDisturbConfig 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateNoDisturbConfig(InDTO inDTO);

	/**
	 * 更新短信推送流量
	* @date: 2016-10-8 
	* @author: xiongxq
	* @title: updateShortMsgMoveTraffic 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateShortMsgMoveTraffic(InDTO inDTO);

	/**
	 * 修改接触次数的配置
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateTouchCountConfig 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateTouchCountConfig(InDTO inDTO);

	/**
	 * 修改接触时间的配置
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateTouchTimeConfig 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateTouchTimeConfig(InDTO inDTO);
}
