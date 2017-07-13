package com.sitech.strategy.manage.entity.param.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;

/**
 * 配置管理参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: IConfManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IConfManageParam {
	
	/**
	 * 查询区域优先级配置列表入参转换
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: queryAreaPriorityConfigListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryAreaPriorityConfigListInParam(InDTO inDTO);
	
	/**
	 * 查询区域优先级配置列表出参转换
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: queryAreaPriorityConfigListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryAreaPriorityConfigListOutParam(Map<String,Object> outParam);
	
	/**
	 * 查询选择配置列表的入参处理
	* @date: 2016-10-22 
	* @author: xiongxq
	* @Title: queryChoiceConfigListInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryChoiceConfigListInParam(InDTO inDTO);
	
	/**
	 * 查询选项配置列表的出参处理
	* @date: 2016-10-22 
	* @author: xiongxq
	* @Title: queryChoiceConfigListOutParam 
	* @param outParam
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryChoiceConfigListOutParam(Map<String,Object> outParam);
	
	/**
	 * 查询用户群优先级配置列表入参转换
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupPriorityConfigListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupPriorityConfigListInParam(InDTO inDTO);
	
	/**
	 * 查询用户群优先级配置列表出参转换
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupPriorityConfigListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCustGroupPriorityConfigListOutParam(Map<String,Object> outParam);
	
	/**
	 * 查询优先级主页面出参转换
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: savePriorityConfigOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryPriorityConfigListOutParam(Map<String,Object> outParam);

	/**
	 * 查询优先级主页面列表入参转换
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: queryPriorityConfigListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryPriorityConfigListInParam(InDTO inDTO);

	/**
	 * 删除区域优先级配置入参转换
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: removeAreaPriorityConfigInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeAreaPriorityConfigInParam(InDTO inDTO);

	/**
	 * 删除区域优先级配置出参转换
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: removeAreaPriorityConfigOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeAreaPriorityConfigOutParam();

	/**
	 * 删除用户群优先级配置入参转换
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupPriorityConfigInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeCustGroupPriorityConfigInParam(InDTO inDTO);

	/**
	 * 删除用户群优先级配置出参转换
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupPriorityConfigOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeCustGroupPriorityConfigOutParam();
	
	/**
	 * 删除选项配置入参处理
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: removeChoiceConfigInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeChoiceConfigInParam(InDTO inDTO);
	
	/**
	 * 删除选项配置出参处理
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: removeChoiceConfigOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeChoiceConfigOutParam();

	/**
	 * 新增区域优先级配置入参转换
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: saveAreaPriorityConfigInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveAreaPriorityConfigInParam(InDTO inDTO);

	/**
	 * 新增区域优先级配置出参转换
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: saveAreaPriorityConfigOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveAreaPriorityConfigOutParam();
	
	/**
	 * 保存选项配置入参处理
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: saveChoiceConfigInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveChoiceConfigInParam(InDTO inDTO);
	
	/**
	 * 保存选项配置出参处理
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: saveChoiceConfigOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveChoiceConfigOutParam();

	/**
	 * 保存优先级配置入参转换
	* @date: 2016-10-11 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupPriorityConfigInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveCustGroupPriorityConfigInParam(InDTO inDTO);
	
	/**
	 * 保存优先级配置出参转换
	* @date: 2016-10-11 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupPriorityConfigOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveCustGroupPriorityConfigOutParam();
	
	/**
	 * 修改选项配置入参处理
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: updateChoiceConfigInParam 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> updateChoiceConfigInParam(InDTO inDTO);
	
	/**
	 * 修改选项配置出参处理
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: updateChoiceConfigOutParam 
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO updateChoiceConfigOutParam();

}
