package com.sitech.strategy.process.service.jcf.impl;

import java.util.HashMap;
import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.base.BaseProcessService;
import com.sitech.strategy.process.base.basedto.StandardInDTO;
import com.sitech.strategy.process.base.basedto.StandardOutDTO;
import com.sitech.strategy.process.entity.inter.ICustGroupProcessEntity;
import com.sitech.strategy.process.entity.param.inter.ICustGroupProcessParam;
import com.sitech.strategy.process.service.jcf.inter.ICustGroupProcessService;

/**
 * 目标客户群服务
* @date: 2016-9-5 
* @author: sunliang 
* @title: CustGroupProcessService
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "parseCocCustGroup", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryCustGroupCountById", oc = StandardOutDTO.class)
})
public class CustGroupProcessService extends BaseProcessService implements ICustGroupProcessService{
	
	/**
	 * 目标客户群实体
	 */
	protected ICustGroupProcessEntity custGroupProcessEntity;
	/**
	 * 目标客户群参数解析实体
	 */
	protected ICustGroupProcessParam custGroupProcessParam;

	/**
	 * 
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: setCustGroupProcessEntity 
	* @param custGroupProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupProcessEntity(
			ICustGroupProcessEntity custGroupProcessEntity) {
		this.custGroupProcessEntity = custGroupProcessEntity;
	}
	
	/**
	 * 
	* @date: 2016-9-20 
	* @author: sunliang 
	* @title: setCustGroupProcessParam 
	* @param custGroupProcessParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCustGroupProcessParam(
			ICustGroupProcessParam custGroupProcessParam) {
		this.custGroupProcessParam = custGroupProcessParam;
	}

	/** 
	 * coc目标客户群解析
	* @date: 2016-10-31 
	* @author: songxj
	* @title: parseCocCustGroup 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO parseCocCustGroup(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = custGroupProcessParam.parseCocCustGroupInParam(inDTO);
			custGroupProcessEntity.parseCocCustGroup(inParam);
			standardOutDTO = custGroupProcessParam.parseCocCustGroupOutParam(new HashMap<String, Object>());
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}
	
	/**
	 * 查询目标客户群数量
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: queryCustGroupCountById 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryCustGroupCountById(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = custGroupProcessParam.queryCustGroupCountByIdInParam(inDTO);
			Map<String,Object> outParam = custGroupProcessEntity.queryCustGroupCountById(inParam);
			standardOutDTO = custGroupProcessParam.queryCustGroupCountByIdOutParam(outParam);
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;
	}

}
