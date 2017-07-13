package com.sitech.strategy.manage.service.jcf.impl;

import java.util.List;
import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageService;
import com.sitech.strategy.manage.base.basedto.StandardInDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.inter.IAuditManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IAuditManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IAuditManageService;

/**
 * 审核
* @date: 2016-9-5 
* @author: tangaq
* @title: AuditManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryDownLoadAuditList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseAuditList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryLoadAuditorList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseAuditorList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseAuditCaseList", oc = StandardOutDTO.class),	
	@ParamType(c = StandardInDTO.class, m = "removeLoadAuditor", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeMarketCaseAuditor", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveDownLoadAudit", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveLoadAuditor", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveMarketCaseAudit", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveMarketCaseAuditor", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateAuditStatus", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateLoadAuditor", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateMarketCaseAuditor", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "sendShortMessageToAuditor", oc = StandardOutDTO.class)
})
public class AuditManageService extends BaseManageService implements IAuditManageService {
	
	/**
	 * 审批对象
	 */
	protected IAuditManageEntity auditManageEntity;
	/**
	 * 审批参数处理对象
	 */
	protected IAuditManageParam auditManageParam;
	
	/**
	 * 
	* @date: 2016-9-22 
	* @author: tangaq
	* @title: setAuditManageEntity 
	* @param auditManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAuditManageEntity(IAuditManageEntity auditManageEntity) {
		this.auditManageEntity = auditManageEntity;
	}
	
	/**
	 * 
	* @date: 2016-9-22 
	* @author: tangaq
	* @title: setAuditManageParam 
	* @param auditManageParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setAuditManageParam(IAuditManageParam auditManageParam) {
		this.auditManageParam = auditManageParam;
	}
	
	/**
	 * 下载审批列表
	* @date: 2016-9-20 
	* @author: fangyuan_crmpd
	* @title: downLoadAuditList 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryDownLoadAuditList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = auditManageParam.queryDownLoadAuditListInParam(inDTO);
			Map<String,Object> outParam = auditManageEntity.queryDownLoadAuditList(inParam);
			standardOutDTO = auditManageParam.queryDownLoadAuditListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 查询审批列表
	* @date: 2016-9-20 
	* @author: tangaq
	* @title: queryMarketCaseAuditList 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMarketCaseAuditList(InDTO inDTO){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = auditManageParam.queryMarketCaseAuditListInParam(inDTO);
			Map<String,Object> outParam = auditManageEntity.queryMarketCaseAuditList(inParam);
			standardOutDTO = auditManageParam.queryMarketCaseAuditListOutParam(outParam);
			
		} catch(StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/** 
	 * 查询营销案审批人列表
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: queryMarketCaseAuditorList 
	* @param inDTO
	* @return standardOutDTO
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO queryMarketCaseAuditorList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = auditManageParam.queryMarketCaseAuditorListInParam(inDTO);
			Map<String,Object> outParam = auditManageEntity.queryMarketCaseAuditorList(inParam);
			standardOutDTO = auditManageParam.queryMarketCaseAuditorListOutParam(outParam); 
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	/**
	 * 查询某个营销案的审批情况
	* @date: 2017-3-1 
	* @author: yuanliang
	* @title: queryMarketCaseAuditCaseList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryMarketCaseAuditCaseList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = auditManageParam.queryMarketCaseAuditCaseListInParam(inDTO);
			Map<String, Object> outParam = auditManageEntity.queryMarketCaseAuditCaseList(inParam);
			standardOutDTO = auditManageParam.queryMarketCaseAuditCaseListOutParam(outParam); 
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	/** 
	 * 查询下载审批人列表
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: queryLoadAuditorList 
	* @param inDTO
	* @return standardOutDTO
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO queryLoadAuditorList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = auditManageParam.queryLoadAuditorListInParam(inDTO);
			Map<String,Object> outParam = auditManageEntity.queryLoadAuditorList(inParam);
			standardOutDTO = auditManageParam.queryLoadAuditorListOutParam(outParam);
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/** 
	 * 删除下载审批人
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: removeLoadAuditor 
	* @param inDTO
	* @return standardOutDTO
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO removeLoadAuditor(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = auditManageParam.removeLoadAuditorInParam(inDTO);
			auditManageEntity.removeLoadAuditor(inParam);
			standardOutDTO = auditManageParam.removeLoadAuditorOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 删除营销案审批人 
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: removeMarketCaseAuditor 
	* @param inDTO
	* @return standardOutDTO
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO removeMarketCaseAuditor(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = auditManageParam.removeMarketCaseAuditorInParam(inDTO);
			auditManageEntity.removeMarketCaseAuditor(inParam);
			standardOutDTO = auditManageParam.removeMarketCaseAuditorOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 保存下载审批
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: saveLoadAuditor 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveDownLoadAudit(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = auditManageParam.saveDownLoadAuditInParam(inDTO);
			auditManageEntity.saveDownLoadAudit(inParam);
			standardOutDTO = auditManageParam.saveDownLoadAuditOutParam();
		
		} catch (StrategyError e) {
			e.processExcepByJCF();
			e.printStackTrace();
		}
		
		return standardOutDTO;	
	}
	
	/** 
	 * 保存下载审批人
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: saveLoadAuditor 
	* @param inDTO
	* @return standardOutDTO
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO saveLoadAuditor(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = auditManageParam.saveLoadAuditorInParam(inDTO);
			auditManageEntity.saveLoadAuditor(inParam);
			standardOutDTO = auditManageParam.saveLoadAuditorOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/** 
	 * 保存营销案审批
	* @date: 2016-9-20 
	* @author: xiongxq
	* @Title: saveMarketCaseAudit 
	* @param inDTO
	* @return standardOutDTO
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO saveMarketCaseAudit(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = auditManageParam.saveMarketCaseAuditInParam(inDTO);
			auditManageEntity.saveMarketCaseAudit(inParam);
			standardOutDTO = auditManageParam.saveMarketCaseAuditOutParam();
		
		} catch (StrategyError e) {
			e.processExcepByJCF();
			e.printStackTrace();
		}
		
		return standardOutDTO;	
	}

	/** 保存营销案审批人
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: saveMarketCaseAuditor 
	* @param inDTO
	* @return standardOutDTO
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO saveMarketCaseAuditor(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = auditManageParam.saveMarketCaseAuditorInParam(inDTO);
			auditManageEntity.saveMarketCaseAuditor(inParam);
			standardOutDTO = auditManageParam.saveMarketCaseAuditorOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 给待审批人员发送审批短信提醒
	* @date: 2016-11-14 
	* @author: yuanliang
	* @title: sendShortMessageToAuditor 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO sendShortMessageToAuditor(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = auditManageParam.sendShortMessageToAuditorInParam(inDTO);
			auditManageEntity.sendShortMessageToAuditor(inParam);
			standardOutDTO = auditManageParam.sendShortMessageToAuditorOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 审批状态变更
	* @date: 2016-9-22 
	* @author: fangyuan_crmpd
	* @title: updateAuditStatus 
	* @param inDTO
	* @return standardOutDTO
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateAuditStatus(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = auditManageParam.updateAuditStatusInParam(inDTO);
			auditManageEntity.updateAuditStatus(inParam);
			standardOutDTO = auditManageParam.updateAuditStatusOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/** 
	 * 更新下载审批人
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: updateLoadAuditor 
	* @param inDTO
	* @return standardOutDTO
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO updateLoadAuditor(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = auditManageParam.updateLoadAuditorInParam(inDTO);
			auditManageEntity.updateLoadAuditor(inParam);
			standardOutDTO = auditManageParam.updateLoadAuditorOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/** 
	 * 更新营销案审批人
	* @date: 2016-9-27 
	* @author: xiongxq
	* @Title: updateMarketCaseAuditor 
	* @param inDTO
	* @return standardOutDTO
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO updateMarketCaseAuditor(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam  = auditManageParam.updateMarketCaseAuditorInParam(inDTO);
			auditManageEntity.updateMarketCaseAuditor(inParam);
			standardOutDTO = auditManageParam.updateMarketCaseAuditorOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}


}
