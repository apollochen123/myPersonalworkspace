package com.sitech.strategy.process.entity.param.impl;

import java.util.HashMap;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.base.basedto.StandardOutDTO;
import com.sitech.strategy.process.entity.param.inter.ICustGroupProcessParam;

/**
 * CustGroupProcessService参数处理类
* @date: 2016-9-20 
* @author: sunliang 
* @title: CustGroupProcessParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class CustGroupProcessParam extends BaseProcessEntity implements
		ICustGroupProcessParam {
	
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
	@Override
	public Map<String, Object> parseCocCustGroupInParam(InDTO inDTO) {
		MBean mbean = inDTO.getMbean();
		Map<String,Object> inParam = new HashMap<String,Object>();
		inParam.put("xmlPath", mbean.getBodyStr("XML_PATH"));
		return inParam;
	}

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
	@Override
	public StandardOutDTO parseCocCustGroupOutParam(
			Map<String, Object> outParam) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);		
		return standardOutDTO;
	}

	/**
	 * queryCustGroupCountById入参处理
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: queryCustGroupCountByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public Map<String, Object> queryCustGroupCountByIdInParam(InDTO inDTO) {
		return null;
	}

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
	@Override
	public StandardOutDTO queryCustGroupCountByIdOutParam(
			Map<String, Object> outParam) {
		return null;
	}

}
