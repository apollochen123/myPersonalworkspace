package com.sitech.strategy.manage.entity.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.impl.QueryFilter;
import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageEntity;
import com.sitech.strategy.manage.entity.inter.ICommonManageEntity;
import com.sitech.strategy.persist.capacity.proxy.IDataSelector;
import com.sitech.strategy.persist.capacity.proxy.IMsgSender;

/**
 * 公用实体
* @date: 2016-9-5 
* @author: sunliang
* @title: CommonManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class CommonManageEntity extends BaseManageEntity implements ICommonManageEntity {
	
	/**
	 * 公共查询对象
	 */
	protected IDataSelector.ICommonSelector commonSelector;
	
	/**
	 * 批量push对象
	 */
	protected IMsgSender.IBatchPushSender batchPushSender;
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: setCommonSelector 
	* @param commonSelector 
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCommonSelector(IDataSelector.ICommonSelector commonSelector) {
		this.commonSelector = commonSelector;
	}
	
	/**
	 * 
	* @date: 2017-3-8 
	* @author: tangaq
	* @title: setBatchPushSender 
	* @param batchPushSender 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBatchPushSender(IMsgSender.IBatchPushSender batchPushSender) {
		this.batchPushSender = batchPushSender;
	}



	/**
	 * 查询codename
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryCodeName 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryCodeNameList(Map<String, Object> inParam)
			throws StrategyError {
		IQueryFilter queryFilter = this.settleCodeNameFilter(inParam);
		List<Map<String, Object>> list = commonSelector.selectCodeName(inParam,queryFilter);
		Map<String,Object> outMap = new HashMap<String,Object>();
		outMap.put("codeList", list);
		return outMap;
	}

	/**
	 * 得到序列号
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: getSequence 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> getSequence(Map<String, Object> inParam)
			throws StrategyError {
		Map<String,Object> outMap=new HashMap<String,Object>();
		outMap.put("sequence",SequenceUtil.getSequence());
		return outMap;
	}	
	
	/**
	 * 发送消息测试
	* @date: 2017-3-8 
	* @author: tangaq
	* @title: sendMessageTest 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> sendMessageTest(Map<String, Object> inParam)
			throws StrategyError {
		batchPushSender.sendMsgSimulation(inParam);
		return null;
	}

	/**
	 * 形成QueryFilter对象
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: settleCodeNameFilter 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected IQueryFilter settleCodeNameFilter(Map<String, Object> inParam){
		IQueryFilter queryFilter = new QueryFilter();
		queryFilter.setFieldCnName((String)inParam.get("fieldCnName"));
		queryFilter.setFieldEnName((String)inParam.get("fieldEnName"));
		return queryFilter;
	}
	
}
