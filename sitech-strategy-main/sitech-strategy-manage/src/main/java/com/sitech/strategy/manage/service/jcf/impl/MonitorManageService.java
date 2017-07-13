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
import com.sitech.strategy.manage.entity.impl.MonitorManageEntity;
import com.sitech.strategy.manage.entity.param.impl.MonitorManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IMonitorManageService;

/**
 * 监控
* @date: 2016-9-5 
* @author: tangaq
* @title: MonitorManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryWorkOperMonitorList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryWorkOperWarningDetailByWorkCode", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeWorkOperWarningDetailByWorkCode", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveWorkOperWarningDetail", oc = StandardOutDTO.class)
})
public class MonitorManageService extends BaseManageService implements IMonitorManageService {
	
	/**
	 * 监控实体对象
	 */
	protected MonitorManageEntity monitorManageEntity;
	/**
	 * 监控参数处理对象
	 */
	protected MonitorManageParam monitorManageParam;
	
	/**
	 * 
	* @date: 2016-11-7 
	* @author: fangyuan_crmpd
	* @title: setMonitorManageEntity 
	* @param monitorManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMonitorManageEntity(MonitorManageEntity monitorManageEntity) {
		this.monitorManageEntity = monitorManageEntity;
	}
	
	/**
	 * 
	* @date: 2016-11-7 
	* @author: fangyuan_crmpd
	* @title: setMonitorManageParam 
	* @param monitorManageParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setMonitorManageParam(MonitorManageParam monitorManageParam) {
		this.monitorManageParam = monitorManageParam;
	}

	/**
	 * 查询作业运行监控列表
	* @date: 2016-11-7 
	* @author: fangyuan_crmpd
	* @title: queryWorkOperMonitorList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryWorkOperMonitorList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = monitorManageParam.queryWorkOperMonitorListInParam(inDTO);
			Map<String,Object> outParam = monitorManageEntity.queryWorkOperMonitorList(inParam);
			standardOutDTO =  monitorManageParam.queryWorkOperMonitorListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 根据作业编码查询作业运行告警详细信息
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: queryWorkOperWarningDetailByWorkCode 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryWorkOperWarningDetailByWorkCode(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = monitorManageParam.queryWorkOperWarningDetailByWorkCodeInParam(inDTO);
			Map<String,Object> outParam = monitorManageEntity.queryWorkOperWarningDetailByWorkCode(inParam);
			standardOutDTO =  monitorManageParam.queryWorkOperWarningDetailByWorkCodeOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 根据作业编码删除作业运行告警的详细信息
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: removeWorkOperWarningDetailByWorkCode 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeWorkOperWarningDetailByWorkCode(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = monitorManageParam.removeWorkOperWarningDetailByWorkCodeInParam(inDTO);
			monitorManageEntity.removeWorkOperWarningDetailByWorkCode(inParam);
			standardOutDTO =  monitorManageParam.removeWorkOperWarningDetailByWorkCodeOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 保存作业运行告警详细信息
	* @date: 2016-11-13 
	* @author: fangyuan_crmpd
	* @title: saveWorkOperWarningDetail 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveWorkOperWarningDetail(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = monitorManageParam.saveWorkOperWarningDetailInParam(inDTO);
			monitorManageEntity.saveWorkOperWarningDetail(inParam);
			standardOutDTO =  monitorManageParam.saveWorkOperWarningDetailOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

}
