package com.sitech.strategy.common.pojo.impl.assemblyservicestructure;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.assemblyservicestructure.IAssemblyServiceStructure;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 组装服务报文结构XML实现
* @date: 2017-1-12 
* @author: sunliang 
* @title: AssemblyServiceStructureByXML 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class AssemblyServiceStructureByXML extends BaseClass implements IAssemblyServiceStructure,Serializable{

	/** 
	* @date: 2017-2-8 
	* @author: wangpei
	* @title: toPacketCustListFromChannelTask 
	* @param marketCaseMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> toPacketCustListFromChannelTask(
			Map<String, Object> marketCaseMap) throws StrategyError {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: toPacketFromMarketCase 
	* @param inParam
	* @param marketCasePacketPojoMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> toPacketFromMarketCase(
			Map<String, Object> inParam,
			Map<String, Object> marketCasePacketPojoMap) throws StrategyError {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	* @date: 2017-2-8 
	* @author: wangpei
	* @title: toPacketMarketCaseListFromChannelTask 
	* @param marketCaseMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> toPacketMarketCaseListFromChannelTask(
			Map<String, Object> marketCaseMap) throws StrategyError {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	* @date: 2017-2-8 
	* @author: wangpei
	* @title: toPacketTaskListFromChannelTask 
	* @param marketCaseMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public Map<String, Object> toPacketTaskListFromChannelTask(
			Map<String, Object> marketCaseMap) throws StrategyError {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: assemblyChannelTaskPacket 
	* @param packetMarkCaseList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> assemblyChannelTaskPacket(
			List<Map<String, Object>> packetMarkCaseList) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: assemblyChannelTriggerPacket 
	* @param packetMarkCaseList
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> assemblyChannelTriggerPacket(
			List<Map<String, Object>> packetMarkCaseList) {
		// TODO Auto-generated method stub
		return null;
	}

}
