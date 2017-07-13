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
import com.sitech.strategy.manage.entity.inter.IConfManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IConfManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IConfManageService;

/**
 * 配置管理
* @date: 2016-9-5 
* @author: tangaq
* @title: ConfManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryAreaPriorityConfigList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryChoiceConfigList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryCustGroupPriorityConfigList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryPriorityConfigList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeAreaPriorityConfig", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeCustGroupPriorityConfig", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeChoiceConfig", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveAreaPriorityConfig", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveChoiceConfig", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveCustGroupPriorityConfig", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateChoiceConfig", oc = StandardOutDTO.class)
	
})
public class ConfManageService extends BaseManageService implements IConfManageService {
	
	/**
	 * 配置管理实体层对象
	 */
	protected IConfManageEntity confManageEntity;
	/**
	 * 配置管理参数转化对象
	 */
	protected IConfManageParam confManageParam;
	
	/**
	 * 
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: setConfManageEntity 
	* @param confManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setConfManageEntity(IConfManageEntity confManageEntity) {
		this.confManageEntity = confManageEntity;
	}
	
	/**
	 * 
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: setConfManageParam 
	* @param confManageParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setConfManageParam(IConfManageParam confManageParam) {
		this.confManageParam = confManageParam;
	}

	/**
	 * 查询区域优先级配置列表
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: queryAreaPriorityConfigList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryAreaPriorityConfigList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = confManageParam.queryAreaPriorityConfigListInParam(inDTO);
			Map<String,Object> outParam = confManageEntity.queryAreaPriorityConfigList(inParam);
			standardOutDTO = confManageParam.queryAreaPriorityConfigListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 查询选项配置列表 
	* @date: 2016-10-22 
	* @author: xiongxq
	* @Title: queryChoiceConfigList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO queryChoiceConfigList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = confManageParam.queryChoiceConfigListInParam(inDTO);
			Map<String,Object> outParam = confManageEntity.queryChoiceConfigList(inParam);
			standardOutDTO = confManageParam.queryChoiceConfigListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 查询用户群优先级配置列表
	* @date: 2016-10-15 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupPriorityConfigList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryCustGroupPriorityConfigList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = confManageParam.queryCustGroupPriorityConfigListInParam(inDTO);
			Map<String,Object> outParam = confManageEntity.queryCustGroupPriorityConfigList(inParam);
			standardOutDTO = confManageParam.queryCustGroupPriorityConfigListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 查询优先级主页面列表
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: queryPriorityConfigList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryPriorityConfigList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = confManageParam.queryPriorityConfigListInParam(inDTO);
			Map<String,Object> outParam = confManageEntity.queryPriorityConfigList(inParam);
			standardOutDTO = confManageParam.queryPriorityConfigListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 删除区域优先级配置
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: removeAreaPriorityConfig 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeAreaPriorityConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = confManageParam.removeAreaPriorityConfigInParam(inDTO);
			confManageEntity.removeAreaPriorityConfig(inParam);
			standardOutDTO = confManageParam.removeAreaPriorityConfigOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 删除选项配置
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: removeChoiceConfig 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO removeChoiceConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = confManageParam.removeChoiceConfigInParam(inDTO);
			confManageEntity.removeChoiceConfig(inParam);
			standardOutDTO = confManageParam.removeChoiceConfigOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 删除用户群优先级配置
	* @date: 2016-10-19 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupPriorityConfig 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeCustGroupPriorityConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = confManageParam.removeCustGroupPriorityConfigInParam(inDTO);
			confManageEntity.removeCustGroupPriorityConfig(inParam);
			standardOutDTO = confManageParam.removeCustGroupPriorityConfigOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 新增区域优先级配置
	* @date: 2016-10-9 
	* @author: fangyuan_crmpd
	* @title: saveAreaPriorityConfig 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveAreaPriorityConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = confManageParam.saveAreaPriorityConfigInParam(inDTO);
			confManageEntity.saveAreaPriorityConfig(inParam);
			standardOutDTO = confManageParam.saveAreaPriorityConfigOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/** 
	 * 保存选项配置
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: saveChoiceConfig 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO saveChoiceConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			Map<String,Object> inParam  = confManageParam.saveChoiceConfigInParam(inDTO);
			confManageEntity.saveChoiceConfig(inParam);
			standardOutDTO = confManageParam.saveChoiceConfigOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 插入用户群优先级配置
	* @date: 2016-10-11 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupPriorityConfig 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveCustGroupPriorityConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = confManageParam.saveCustGroupPriorityConfigInParam(inDTO);
			confManageEntity.saveCustGroupPriorityConfig(inParam);
			standardOutDTO = confManageParam.saveCustGroupPriorityConfigOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/** 
	 * 修改选项配置
	* @date: 2016-10-25 
	* @author: xiongxq
	* @Title: updateChoiceConfig 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO updateChoiceConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = confManageParam.updateChoiceConfigInParam(inDTO);
			confManageEntity.updateChoiceConfig(inParam);
			standardOutDTO = confManageParam.updateChoiceConfigOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

}
