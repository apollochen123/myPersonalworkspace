package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 附件
* @date: 2016-9-5 
* @author: yangwl
* @title: IAttach 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IAttach {
	
	/**
	 * 批量添加附件信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: addBatchAttach 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addBatchAttach(List<Map<String,Object>> list) throws StrategyError;
	
	/**
	 * 添加单个附件
	* @date: 2016-10-23 
	* @author: wangth
	* @Title: addSingleAttach 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addSingleAttach(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询附件信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: queryAttachList 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryAttachList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 移除附件信息
	* @date: 2016-9-5 
	* @author: yangwl
	* @title: removeAttach 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeAttach(Map<String,Object> inParam) throws StrategyError;
	
}
