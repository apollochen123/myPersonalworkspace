package com.sitech.strategy.process.service.jcf.impl;

import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.base.BaseProcessService;
import com.sitech.strategy.process.base.basedto.StandardInDTO;
import com.sitech.strategy.process.base.basedto.StandardOutDTO;
import com.sitech.strategy.process.entity.inter.ICoupleBackProcessEntity;
import com.sitech.strategy.process.entity.inter.ITaskProcessEntity;
import com.sitech.strategy.process.entity.param.inter.ICoupleBackProcessParam;
import com.sitech.strategy.process.entity.param.inter.ITaskProcessParam;
import com.sitech.strategy.process.service.jcf.inter.ITaskProcessService;



@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "parseTaskAdjust", oc = StandardOutDTO.class)
})
public class TaskProcessService extends BaseProcessService implements
		ITaskProcessService {
	
	protected ITaskProcessEntity taskProcessEntity;
	
	protected ITaskProcessParam taskProcessParam;

	/**
	 * 
	* @date: 2016-12-26 
	* @author: zhangjj_crmpd
	* @title: setTaskProcessEntity 
	* @param taskProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTaskProcessEntity(ITaskProcessEntity taskProcessEntity) {
		this.taskProcessEntity = taskProcessEntity;
	}
	
	/**
	 * 
	* @date: 2016-12-26 
	* @author: zhangjj_crmpd
	* @title: setTaskProcessParam 
	* @param taskProcessParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTaskProcessParam(ITaskProcessParam taskProcessParam) {
		this.taskProcessParam = taskProcessParam;
	}	
	

	/**
	 * 解析调配任务
	* @date: 2017-1-11 
	* @author: zhangjj_crmpd
	* @title: parseTaskAdjust 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO parseTaskAdjust(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = taskProcessParam.parseTaskAdjustInParam(inDTO);
			taskProcessEntity.handleTaskAdjust();
			standardOutDTO = taskProcessParam.parseTaskAdjustOurParam();
		} catch (StrategyError e) {
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}

}
