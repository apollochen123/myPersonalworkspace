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
import com.sitech.strategy.manage.entity.inter.ISystemManageEntity;
import com.sitech.strategy.manage.entity.param.inter.ISystemManageParam;
import com.sitech.strategy.manage.service.jcf.inter.ISystemManageService;

/**
 * 系统管理
 * 
 * @date: 2016-9-5
 * @author: tangaq
 * @title: SystemManageService
 * @version 1.0
 * @description： update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryMessageTriggerList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryWorkConfigList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeWorkConfig", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveWorkConfig", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateWorkConfig", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryOperLogList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryServiceMonitorList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveOperLogInfo", oc = StandardOutDTO.class)
})
public class SystemManageService extends BaseManageService implements ISystemManageService {

	/**
	 * 系统对象
	 */
	protected ISystemManageEntity systemManageEntity;
	/**
	 * 系统参数处理对象
	 */
	protected ISystemManageParam systemManageParam;

	/**
	 * @date: 2016-10-26
	 * @author: xiongxq
	 * @Title: setSystemManageEntity
	 * @param systemManageEntity
	 *            the systemManageEntity to set
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setSystemManageEntity(ISystemManageEntity systemManageEntity) {
		this.systemManageEntity = systemManageEntity;
	}

	/**
	 * @date: 2016-10-26
	 * @author: xiongxq
	 * @Title: setSystemManageParam
	 * @param systemManageParam
	 *            the systemManageParam to set
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	public void setSystemManageParam(ISystemManageParam systemManageParam) {
		this.systemManageParam = systemManageParam;
	}
	
	/**
	 * 查询短信触发操作日志
	* @date: 2017-3-7 
	* @author: wuJiaFu
	* @title: queryMessageTriggerList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryMessageTriggerList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
				
		        try {
					
					Map<String,Object> inParam  = systemManageParam.queryMessageTriggerLogListInParam(inDTO);
					Map<String,Object> outParam = systemManageEntity.queryMessageTriggerLogList(inParam);
					standardOutDTO = systemManageParam.queryMessageTriggerLogListOutParam(outParam);
					
		        } catch (StrategyError e) {
					e.printStackTrace();
					e.processExcepByJCF();
				}
				
		 return standardOutDTO;
	}

	/**
	 * 查询操作日志列表
	 * 
	 * @date: 2016-11-1
	 * @author: tangaq
	 * @title: queryOperLogList
	 * @param inDTO
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryOperLogList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {

			Map<String, Object> inParam = systemManageParam.queryOperLogListInParam(inDTO);
			Map<String, Object> outParam = systemManageEntity.queryOperLogList(inParam);
			standardOutDTO = systemManageParam.queryOperLogListOutParam(outParam);

		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}

		return standardOutDTO;
	}

	/**
	 * 查询服务监控列表
	 * 
	 * @date: 2016-11-2
	 * @author: tangaq
	 * @title: queryServiceMonitorList
	 * @param inDTO
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryServiceMonitorList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {

			Map<String, Object> inParam = systemManageParam.queryServiceMonitorListInParam(inDTO);
			Map<String, Object> outParam = systemManageEntity.queryServiceMonitorList(inParam);
			standardOutDTO = systemManageParam.queryServiceMonitorListOutParam(outParam);

		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}

		return standardOutDTO;
	}

	/**
	 * 查询作业配置列表
	 * 
	 * @date: 2016-10-22
	 * @author: wangth
	 * @Title: queryWorkConfigList
	 * @param inDTO
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryWorkConfigList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String, Object> inParam = systemManageParam.queryWorkConfigListInParam(inDTO);
			Map<String, Object> outParam = systemManageEntity.queryWorkConfigList(inParam);
			standardOutDTO = systemManageParam.queryWorkConfigListOutParam(outParam);

		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}

		return standardOutDTO;
	}

	/**
	 * 移除作业配置
	 * 
	 * @date: 2016-10-22
	 * @author: wangth
	 * @Title: removeWorkConfig
	 * @param inDTO
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeWorkConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String, Object> inParam = systemManageParam.removeWorkConfigInParam(inDTO);
			systemManageEntity.removeWorkConfig(inParam);
			standardOutDTO = systemManageParam.removeWorkConfigOutParam();

		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}

		return standardOutDTO;
	}

	/**
	 * 保存操作日志信息
	 * 
	 * @date: 2017-3-9
	 * @author: yueyi
	 * @title: saveOperLogInfo
	 * @param inDTO
	 * @return
	 * @exception:
	 * @version: 1.0
	 * @description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveOperLogInfo(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String, Object> inParam = systemManageParam.saveOperLogInfoInParam(inDTO);
			log.info("第二步ok", inParam);
			systemManageEntity.saveOperLogInfo(inParam);
			standardOutDTO = systemManageParam.saveOperLogInfoOutParam();

		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}

		return standardOutDTO;
	}

	/**
	 * 保存作业配置
	 * 
	 * @date: 2016-10-22
	 * @author: wangth
	 * @Title: saveWorkConfig
	 * @param inDTO
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveWorkConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String, Object> inParam = systemManageParam.saveWorkConfigInParam(inDTO);
			systemManageEntity.saveWorkConfig(inParam);
			standardOutDTO = systemManageParam.saveWorkConfigOutParam();

		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}

		return standardOutDTO;
	}

	/**
	 * 更新作业配置
	 * 
	 * @date: 2016-10-22
	 * @author: wangth
	 * @Title: updateWorkConfig
	 * @param inDTO
	 * @return
	 * @version 1.0
	 * @Description: update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO updateWorkConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String, Object> inParam = systemManageParam.updateWorkConfigInParam(inDTO);
			systemManageEntity.updateWorkConfig(inParam);
			standardOutDTO = systemManageParam.updateWorkConfigOutParam();

		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}

		return standardOutDTO;
	}
}
