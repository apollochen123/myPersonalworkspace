package com.sitech.strategy.manage.service.jcf.impl;

import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageService;
import com.sitech.strategy.manage.base.basedto.StandardInDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.inter.ITaskManageEntity;
import com.sitech.strategy.manage.entity.param.inter.ITaskManageParam;
import com.sitech.strategy.manage.service.jcf.inter.ITaskManageService;

@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryChannelTask", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryDepartmentTaskSurvey", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryTaskAdjustList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveTaskAdjust", oc = StandardOutDTO.class)
})
/**
 * 任务
* @date: 2016-12-14 
* @author: zhangjj_crmpd
* @title: TaskManageService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class TaskManageService extends BaseManageService implements ITaskManageService {

	protected ITaskManageEntity taskManageEntity;
	
	protected ITaskManageParam taskManageParam;
	
	/**
	 * 
	* @date: 2016-12-14 
	* @author: zhangjj_crmpd
	* @title: setTaskManageEntity 
	* @param taskManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTaskManageEntity(ITaskManageEntity taskManageEntity) {
		this.taskManageEntity = taskManageEntity;
	}

	/**
	 * 
	* @date: 2016-12-14 
	* @author: zhangjj_crmpd
	* @title: setTaskManageParam 
	* @param taskManageParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTaskManageParam(ITaskManageParam taskManageParam) {
		this.taskManageParam = taskManageParam;
	}

	/**
	 * 查询渠道任务
	* @date: 2016-12-14 
	* @author: zhangjj_crmpd
	* @title: queryChannelTask 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryChannelTask(InDTO inDTO) {
		StandardOutDTO out = new StandardOutDTO();
		
		try {
			Map<String,Object> inParam =taskManageParam.taskInParam(inDTO);
			Map<String,Object> outParam = taskManageEntity.queryChannelTask(inParam);
			out = taskManageParam.taskListOutParam(outParam); 
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return out;
	}
	
	/**
	 * 查询调配任务
	* @date: 2017-1-9 
	* @author: zhangjj_crmpd
	* @title: queryTaskAdjustList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryTaskAdjustList(InDTO inDTO) {
		StandardOutDTO out = new StandardOutDTO();
		try {
			Map<String,Object> inParam =taskManageParam.taskAdjustInParam(inDTO);
			Map<String,Object> outParam = taskManageEntity.queryChannelTask(inParam);
			out = taskManageParam.taskAdjustListOutParam(outParam); 
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return out;
	}

	/**
	 * 查询营业部任务概况
	* @date: 2017-1-10 
	* @author: yuanchun
	* @title: queryDepartmentTaskSurvey 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryDepartmentTaskSurvey(InDTO inDTO) {
		StandardOutDTO out = new StandardOutDTO();
		
		try {
			Map<String,Object> inParam =taskManageParam.queryDepartmentTaskSurveyInParam(inDTO);
			Map<String,Object> outParam = taskManageEntity.queryDepartmentTaskSurvey(inParam);
			out = taskManageParam.queryDepartmentTaskSurveyOutParam(outParam); 
		} catch (StrategyError e) {
			
			e.printStackTrace();
			e.processExcepByJCF();
		
		}
		return out;
	}
	
	/**
	 * 保存调配信息
	* @date: 2017-1-9 
	* @author: zhangjj_crmpd
	* @title: saveTaskAdjust 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveTaskAdjust(InDTO inDTO) {
		StandardOutDTO out = new StandardOutDTO();
		
		try {
			Map<String,Object> inParam =taskManageParam.saveTaskAdjustInParam(inDTO);
			Map<String,Object> outParam = taskManageEntity.saveTaskAdjust(inParam);
			out = taskManageParam.taskInfoOutParam(outParam); 
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return out;
	}

}
