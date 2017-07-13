package com.sitech.strategy.manage.service.jcf.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 系统管理
* @date: 2016-9-5 
* @author: sunliang
* @title: ISystemManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ISystemManageService {
	
	/**
	 * 查询短息触发推送操作日志
	* @date: 2017-3-7 
	* @author: wuJiaFu
	* @title: queryMessageTriggerList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMessageTriggerList(InDTO inDTO);
	
	/**
	 * 查询操作日志列表
	* @date: 2016-11-1 
	* @author: tangaq
	* @title: queryOperLogList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryOperLogList(InDTO inDTO);
	
	/**
	 * 查询服务监控列表
	* @date: 2016-11-2 
	* @author: tangaq
	* @title: queryServiceMonitorList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryServiceMonitorList(InDTO inDTO);
	
	/**
	 * 查询作业配置列表
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: queryWorkConfigList 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryWorkConfigList(InDTO inDTO);
	
	/**
	 * 移除作业配置
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: removeWorkConfig 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO removeWorkConfig(InDTO inDTO);
	
	/**
	 * 保存操作日志信息
	* @date: 2017-3-9 
	* @author: yueyi
	* @title: saveOperLogInfo 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
    public OutDTO saveOperLogInfo(InDTO inDTO);
	
	/**
	 * 保存作业配置
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: saveWorkConfig 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveWorkConfig(InDTO inDTO);
	
	/**
	 * 更新作业配置
	* @date: 2016-10-22 
	* @author: wangth
	* @Title: updateWorkConfig 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateWorkConfig(InDTO inDTO);

}
