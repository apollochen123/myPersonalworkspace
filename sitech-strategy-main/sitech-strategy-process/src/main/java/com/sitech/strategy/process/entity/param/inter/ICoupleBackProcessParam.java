package com.sitech.strategy.process.entity.param.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.base.basedto.StandardOutDTO;

/**
 * 实时反馈服务参数处理
* @date: 2016-11-28 
* @author: sunliang 
* @title: ICoupleBackProcessService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ICoupleBackProcessParam {
	
	/**
	 * 实时回单反馈服务入参处理
	* @date: 2016-11-28 
	* @author: sunliang 
	* @title: realReceiptRecordInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> realReceiptRecordInParam(InDTO inDTO) throws StrategyError;
	
	/**
	 * 实时回单反馈服务出参处理
	* @date: 2016-11-28 
	* @author: sunliang 
	* @title: realReceiptRecordOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO realReceiptRecordOutParam();
	
	/** 任务关闭参数处理
	* @date: 2016-12-26 
	* @author: wangpei
	* @title: recommonedTaskCloseInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> recommonedTaskCloseInParam(InDTO inDTO) throws StrategyError;
	
	/** 任务关闭出参处理
	* @date: 2016-12-26 
	* @author: wangpei
	* @title: recommonedTaskCloseOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public StandardOutDTO recommonedTaskCloseOutParam();

}
