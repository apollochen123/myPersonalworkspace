package com.sitech.strategy.core.objectville.impl;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.base.BaseClass;
import com.sitech.strategy.core.objectville.inter.IAttach;
import com.sitech.strategy.persist.capacity.proxy.IDataDeleter;
import com.sitech.strategy.persist.capacity.proxy.IDataInsertor;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;


/**
 * 附件
* @date: 2016-9-5 
* @author: yangwl
* @title: Attach 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class Attach extends BaseClass implements IAttach,Serializable{
	/**
	 * 附件删除对象
	 */
	protected IDataDeleter.IAttachDeleter attachDeleter;
	/**
	 * 附件插入对象
	 */
	protected IDataInsertor.IAttachInsertor attachInsertor;
	/**
	 * 附件查询对象
	 */
	protected IDataSelector.IAttachSelector attachSelector;
	
	
	/**
	 * 
	* @date: 2016-10-24 
	* @author: wangth
	* @Title: setAttachDeleter 
	* @param attachDeleter 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAttachDeleter(IDataDeleter.IAttachDeleter attachDeleter) {
		this.attachDeleter = attachDeleter;
	}
	
	/**
	 * 
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: setAttachInsertor 
	* @param attachInsertor 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAttachInsertor(IDataInsertor.IAttachInsertor attachInsertor) {
		this.attachInsertor = attachInsertor;
	}
	
	/**
	 * 
	* @date: 2016-10-24 
	* @author: wangth
	* @Title: setAttachSelector 
	* @param attachSelector 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAttachSelector(IDataSelector.IAttachSelector attachSelector) {
		this.attachSelector = attachSelector;
	}

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
	@Override
	public void addBatchAttach(List<Map<String,Object>> list) throws StrategyError {
		attachInsertor.insertBatchAttachs(list);
	}
	
	/**
	 * 添加单个附件
	* @date: 2016-10-23 
	* @author: wangth
	* @Title: addSingleAttach 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void addSingleAttach(Map<String, Object> inParam)
			throws StrategyError {
		Map<String,Object> tempInParam = new HashMap<String,Object>();
		tempInParam.putAll(inParam);
		attachInsertor.insertAttachs(inParam, tempInParam);
	}
	
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
	@Override
	public List<Map<String,Object>> queryAttachList(Map<String,Object> inParam,IQueryFilter queryFilter) throws StrategyError {
		List<Map<String,Object>> list = attachSelector.selectAttachs(inParam, queryFilter);
		return list;
	}
	
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
	@Override
	public Map<String,Object> removeAttach(Map<String,Object> inParam) throws StrategyError {
		attachDeleter.deleteAttach(inParam);
		return null;
	}
	
}
