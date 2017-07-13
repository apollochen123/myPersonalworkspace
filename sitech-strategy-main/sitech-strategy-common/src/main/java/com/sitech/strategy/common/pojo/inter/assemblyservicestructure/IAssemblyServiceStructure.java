package com.sitech.strategy.common.pojo.inter.assemblyservicestructure;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 组装服务报文结构接口
* @date: 2017-1-12 
* @author: sunliang 
* @title: IAssemblyServiceStructure 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IAssemblyServiceStructure {
	
	/**
	 * 组装渠道任务报文
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
	public Map<String, Object> assemblyChannelTaskPacket(List<Map<String, Object>> packetMarkCaseList);
	
	/**
	 * 组装渠道触发报文
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
	public Map<String, Object> assemblyChannelTriggerPacket(List<Map<String, Object>> packetMarkCaseList);
	
	/**
	 * 渠道任务下的客户列表转为报文
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: toPacketCustListFromChannelTask 
	* @param marketCaseMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> toPacketCustListFromChannelTask(Map<String, Object> marketCaseMap) throws StrategyError;
	
	/**
	 * 营销案内容转为报文
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
	public Map<String, Object> toPacketFromMarketCase(Map<String, Object> inParam,Map<String, Object> marketCasePacketPojoMap) throws StrategyError;
	
	/**
	 * 渠道任务营销案列表转为报文
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: toPacketMarketCaseListFromChannelTask 
	* @param marketCaseList
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> toPacketMarketCaseListFromChannelTask(Map<String, Object> marketCaseMap) throws StrategyError;
	
	/**
	 * 渠道任务下的任务列表转为报文
	* @date: 2016-10-17 
	* @author: yangwl
	* @title: toPacketTaskListFromChannelTask 
	* @param marketCaseMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> toPacketTaskListFromChannelTask(Map<String, Object> marketCaseMap) throws StrategyError;
	

}
