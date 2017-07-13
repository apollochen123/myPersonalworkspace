package com.sitech.strategy.process.entity.param.impl;

import java.util.HashMap;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.base.basedto.StandardOutDTO;
import com.sitech.strategy.process.entity.inter.ITaskProcessEntity;
import com.sitech.strategy.process.entity.param.inter.ICustGroupProcessParam;
import com.sitech.strategy.process.entity.param.inter.ITaskProcessParam;

/**
 * 任务参数处理
* @date: 2016-12-26 
* @author: zhangjj_crmpd
* @title: TaskProcessParam 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class TaskProcessParam extends BaseProcessEntity implements
		ITaskProcessParam {

	@Override
	public Map<String, Object> parseTaskAdjustInParam(InDTO inDTO) {
		return new HashMap<String, Object>();
	}

	@Override
	public StandardOutDTO parseTaskAdjustOurParam() {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean outBean = new MBean();
		Map<String,Object> outMap = new HashMap<String,Object>();
		outBean.setBody(outMap);
		standardOutDTO.setBean(outBean);		
		return standardOutDTO;
	}
	

}
