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
import com.sitech.strategy.manage.entity.inter.IRuleManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IRuleManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IRuleManageService;

/**
 * 规则
* @date: 2016-9-5 
* @author: tangaq
* @title: RuleManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryGlobalStrategyConfigList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryRuleDetailBydetailId", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeGlobalStrategyConfig", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeRuleDetailByDetailId", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveGlobalStrategyConfig", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveRuleDetailByCustGroup", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveRuleDetailByCustGroupAndChannel", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateNoDisturbConfig", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateShortMsgMoveTraffic", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateTouchTimeConfig", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateTouchCountConfig", oc = StandardOutDTO.class)

})
public class RuleManageService extends BaseManageService implements IRuleManageService {
	
	/**
	 * 规则对象
	 */
	protected IRuleManageEntity ruleManageEntity;
	/**
	 * 规则参数转换对象
	 */
	protected IRuleManageParam ruleManageParam;
	
	/** 
	 * @date: 2016-10-8 
	 * @author: xiongxq
	 * @Title: setRuleManageEntity 
	 * @param ruleManageEntity the ruleManageEntity to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setRuleManageEntity(IRuleManageEntity ruleManageEntity) {
		this.ruleManageEntity = ruleManageEntity;
	}

	/** 
	 * @date: 2016-10-8 
	 * @author: xiongxq
	 * @Title: setRuleManageParam 
	 * @param ruleManageParam the ruleManageParam to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setRuleManageParam(IRuleManageParam ruleManageParam) {
		this.ruleManageParam = ruleManageParam;
	}

	/** 
	 * 查询全局策略配置列表
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: queryGlobalStrategyConfigList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO queryGlobalStrategyConfigList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = ruleManageParam.queryGlobalStrategyConfigListInParam(inDTO);
			Map<String,Object> outParam = ruleManageEntity.queryGlobalStrategyConfigList(inParam);
			standardOutDTO = ruleManageParam.queryGlobalStrategyConfigListOutParam(outParam);
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
	
		return standardOutDTO;
	}

	/** 
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: queryRuleDetailBydetailId 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public OutDTO queryRuleDetailBydetailId(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;
		
		try {
			
			Map<String,Object> inParam = ruleManageParam.queryRuleDetailByDetailIdInParam(inDTO);
			Map<String,Object> outParam = ruleManageEntity.queryRuleDetailByDetailId(inParam);
			standardOutDTO = ruleManageParam.queryRuleDetailByDetailIdOutParam(outParam);
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
	
		return standardOutDTO;
	}

	
	/**
	 *删除全局策略配置 
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: removeNoDisturbConfig 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO removeGlobalStrategyConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = ruleManageParam.removeGlobalStrategyConfigInParam(inDTO);
			ruleManageEntity.removeGlobalStrategyConfig(inParam);
			standardOutDTO = ruleManageParam.removeGlobalStrategyConfigOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
	
		return standardOutDTO;
	}

	/** 耕具规则明细ID删除规则明细
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: removeRuleDetailByDetailId 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	
	@Override
	public OutDTO removeRuleDetailByDetailId(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;
		try {
			
			Map<String,Object> inParam = ruleManageParam.removeRuleDetailByDetailIdInParam(inDTO);
			ruleManageEntity.removeRuleDetailByDetailId(inParam);
			standardOutDTO = ruleManageParam.removeRuleDetailByDetailIdOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
	
		return standardOutDTO;
	}

	/**
	 *  保存全局策略配置 
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: saveGlobalStrategyConfig 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO saveGlobalStrategyConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = ruleManageParam.saveGlobalStrategyConfigInParam(inDTO);
			ruleManageEntity.saveGlobalStrategyConfig(inParam);
			standardOutDTO = ruleManageParam.saveGlobalStrategyConfigOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
	
		return standardOutDTO;
	}
	
	/**
	 * 增加事件或渠道下规则明细 
	* @date: 2017-2-21 
	* @author: zhangyw_crmpd
	* @title: saveRuleDetailByCustGroup 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveRuleDetailByCustGroup(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;
		
		try {
			Map<String,Object> inParam = ruleManageParam.saveRuleDetailByCustGroupInParam(inDTO);
			Map<String,Object> outParam = ruleManageEntity.saveRuleDetailByCustGroup(inParam);
			standardOutDTO = ruleManageParam.saveRuleDetailByCustGroupAndChannelOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}
	
	/** 增加规则明细
	* @date: 2016-10-15 
	* @author: wangpei
	* @title: saveRuleDetailByCustGroupAndChannel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO saveRuleDetailByCustGroupAndChannel(InDTO inDTO) {
		StandardOutDTO standardOutDTO = null;
		
		try {
			Map<String,Object> inParam = ruleManageParam.saveRuleDetailByCustGroupAndChannelInParam(inDTO);
			Map<String,Object> outParam = ruleManageEntity.saveRuleDetailByCustGroupAndChannel(inParam);
			standardOutDTO = ruleManageParam.saveRuleDetailByCustGroupAndChannelOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}

	/**
	 * 修改免打扰配置 
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateNoDisturbConfig 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO updateNoDisturbConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = ruleManageParam.updateNoDisturbConfigInParam(inDTO);
			ruleManageEntity.updateNoDisturbConfig(inParam);
			standardOutDTO = ruleManageParam.updateNoDisturbConfigOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
	
		return standardOutDTO;
	}

	/**
	 * 更新短信推送流量
	* @date: 2016-10-8 
	* @author: xiongxq
	* @title: updateShortMsgMoveTraffic 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateShortMsgMoveTraffic(InDTO inDTO){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
	
		try {
			
			Map<String,Object> inParam = ruleManageParam.updateShortMsgMoveTrafficInParam(inDTO);
			ruleManageEntity.updateShortMsgMoveTraffic(inParam);
			standardOutDTO = ruleManageParam.updateShortMsgMoveTrafficOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/** 
	 * 修改接触次数的配置
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateTouchCountConfig 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO updateTouchCountConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = ruleManageParam.updateTouchCountConfigInParam(inDTO);
			ruleManageEntity.updateTouchCountConfig(inParam);
			standardOutDTO = ruleManageParam.updateTouchCountConfigOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
	
		return standardOutDTO;
	}

	/**
	 *  修改接触时间的配置 
	* @date: 2016-10-8 
	* @author: xiongxq
	* @Title: updateTouchTimeConfig 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO updateTouchTimeConfig(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = ruleManageParam.updateTouchTimeConfigInParam(inDTO);
			ruleManageEntity.updateTouchTimeConfig(inParam);
			standardOutDTO = ruleManageParam.updateTouchTimeConfigOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
	
		return standardOutDTO;
	}
}
