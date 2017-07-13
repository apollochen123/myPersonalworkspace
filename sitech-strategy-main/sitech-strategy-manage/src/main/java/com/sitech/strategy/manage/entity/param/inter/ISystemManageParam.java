package com.sitech.strategy.manage.entity.param.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;

/**
 * 系统管理参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: ISystemManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ISystemManageParam {
	
	/**
	 * 短信触发推送操作日志入参
	* @date: 2017-3-7 
	* @author: wuJiaFu
	* @title: queryMessageTriggerLogListInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMessageTriggerLogListInParam(InDTO inDTO) throws StrategyError ;
	
	/**
	 * 短信触发推送操作日志
	* @date: 2017-3-7 
	* @author: wuJiaFu
	* @title: queryMessageTriggerLogListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryMessageTriggerLogListOutParam(Map<String,Object> outParam);
	
	/**
	 * 查询操作日志列表入参处理
	* @date: 2016-11-1 
	* @author: tangaq
	* @title: queryOperLogListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryOperLogListInParam(InDTO inDTO) throws StrategyError ;
	

	/**
	 * 查询操作日志列表出参处理
	* @date: 2016-11-1 
	* @author: tangaq
	* @title: queryOperLogListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryOperLogListOutParam(Map<String,Object> outParam);
	
	/**
	 * 查询服务监控列表入参处理
	* @date: 2016-11-2 
	* @author: tangaq
	* @title: queryServiceMonitorListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryServiceMonitorListInParam(InDTO inDTO);
	
	/**
	 * 查询服务监控列表出参处理
	* @date: 2016-11-2 
	* @author: tangaq
	* @title: queryServiceMonitorListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryServiceMonitorListOutParam(Map<String,Object> outParam);
	
	/**
	 * 查询工号列表入参处理
	* @date: 2016-10-26 
	* @author: xiongxq
	* @Title: queryLoginUserListInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryLoginUserListInParam(InDTO inDTO);
	
	/**
	 * 查询工号列表出参处理
	* @date: 2016-10-26 
	* @author: xiongxq
	* @Title: queryLoginUserListOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryLoginUserListOutParam(Map<String,Object> outParam);

	/**
	 * 查询作业配置列表入参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: queryWorkConfigInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryWorkConfigListInParam(InDTO inDTO);

	/**
	 * 查询作业配置列表出参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: queryWorkConfigOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryWorkConfigListOutParam(Map<String,Object> outParam);

	/**
	 * 移除作业配置入参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: removeWorkConfigInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeWorkConfigInParam(InDTO inDTO);

	/**
	 * 移除作业配置出参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: removeWorkConfigOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeWorkConfigOutParam();
	
	/**
	 * 保存操作日志信息入参
	* @date: 2017-3-9 
	* @author: yueyi
	* @title: saveOperLogInfoInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveOperLogInfoInParam(InDTO inDTO);
	
	/**
	 * 保存操作日志信息出参
	* @date: 2017-3-9 
	* @author: yueyi
	* @title: saveOperLogInfoOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveOperLogInfoOutParam();
	
	/**
	 * 保存作业配置入参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: saveWorkConfigInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveWorkConfigInParam(InDTO inDTO);

	/**
	 * 保存作业配置出参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: saveWorkConfigOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO  saveWorkConfigOutParam();
	
	/**
	 * 更新作业配置入参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: updateWorkConfigInParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> updateWorkConfigInParam(InDTO inDTO);
	
	/**
	 * 更新作业配置出参
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: updateWorkConfigOutParam 
	* @param outParam
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO updateWorkConfigOutParam();
	

}
