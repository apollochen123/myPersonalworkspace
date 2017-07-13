package com.sitech.strategy.process.entity.param.inter;

import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.process.base.basedto.StandardOutDTO;

/**
 * CustGroupProcessService参数处理接口
* @date: 2016-9-20 
* @author: sunliang 
* @title: ICustGroupProcessParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ICustGroupProcessParam {
	
	/** 
	 * coc目标客户群解析入参处理
	* @date: 2016-10-31 
	* @author: songxj
	* @title: parseCocCustGroupInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> parseCocCustGroupInParam(InDTO inDTO);
	
	/**
	 * coc目标客户群解析出差处理 
	* @date: 2016-10-31 
	* @author: songxj
	* @title: parseCocCustGroupOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public StandardOutDTO parseCocCustGroupOutParam(Map<String,Object> outParam);
	/**
	 * queryCustGroupCountById入参处理
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: queryCustGroupCountById 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupCountByIdInParam(InDTO inDTO);
	
	/**
	 * queryCustGroupCountById出参处理
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: queryCustGroupCountByIdOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCustGroupCountByIdOutParam(Map<String,Object> outParam);

}
