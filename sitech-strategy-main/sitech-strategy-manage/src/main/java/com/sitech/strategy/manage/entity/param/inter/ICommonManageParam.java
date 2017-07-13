package com.sitech.strategy.manage.entity.param.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;

/**
 * 公用服务参数转换
* @date: 2016-9-14 
* @author: fangyuan_crmpd
* @title: ICommonManageParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ICommonManageParam {
	
	/**
	 * 查询codeName入参处理
	* @date: 2016-9-15 
	* @author: fangyuan_crmpd
	* @title: queryCodeNameInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCodeNameListInParam(InDTO inDTO);
	
	/**
	 * 查询codeName出参处理
	* @date: 2016-9-15 
	* @author: fangyuan_crmpd
	* @title: queryCodeNameOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCodeNameListOutParam(Map<String,Object> outParam);
	
	/**
	 * 获取序列入参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: getSequenceInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> getSequenceInParam(InDTO inDTO);
	
	/**
	 * 获取序列出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: getSequenceOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO getSequenceOutParam(Map<String,Object> outParam);
	
	/**
	 * 发送消息测试入参处理
	* @date: 2017-3-8 
	* @author: tangaq
	* @title: sendMessageTestInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> sendMessageTestInParam(InDTO inDTO);
	
	/**
	 * 发送消息测试出参处理
	* @date: 2017-3-8 
	* @author: tangaq
	* @title: sendMessageTestOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO sendMessageTestOutParam(Map<String,Object> outParam);
}
