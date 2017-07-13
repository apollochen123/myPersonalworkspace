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
import com.sitech.strategy.manage.entity.inter.IUserManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IUserManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IUserManageService;

/**
 * 用户
* @date: 2016-9-5 
* @author: tangaq
* @title: UserManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryDifferentNetPhonePoolList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryGreyList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryRecommendRecordList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryReceiptRecordList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryUserDataList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryUserLabelList", oc = StandardOutDTO.class), 
	@ParamType(c = StandardInDTO.class, m = "removeGrey", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeDifferentNetPhonePool", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeUserLabel", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveBatchGrey", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveDifferentNetPhonePool", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveSingleGrey", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveUserLabel", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateGrey", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateDifferentNetPhonePool", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateUserLabel", oc = StandardOutDTO.class)
})
public class UserManageService extends BaseManageService implements IUserManageService {
	
	/**
	 * 用户对象
	 */
	protected IUserManageEntity userManageEntity;
	/**
	 * 用户参数转换对象
	 */
	protected IUserManageParam userManageParam;
	
	/** 
	 * @date: 2016-10-16 
	 * @author: xiongxq
	 * @Title: setUserManageEntity 
	 * @param userManageEntity the userManageEntity to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setUserManageEntity(IUserManageEntity userManageEntity) {
		this.userManageEntity = userManageEntity;
	}

	/** 
	 * @date: 2016-10-16 
	 * @author: xiongxq
	 * @Title: setUserManageParam 
	 * @param userManageParam the userManageParam to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setUserManageParam(IUserManageParam userManageParam) {
		this.userManageParam = userManageParam;
	}

	/**
	 * 查询异网号码池列表 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: queryDifferentNetPhonePoolList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO queryDifferentNetPhonePoolList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			Map<String,Object> inParam = userManageParam.queryDifferentNetPhonePoolListInParam(inDTO);
			Map<String,Object> outParam = userManageEntity.queryDifferentNetPhonePoolList(inParam);
			standardOutDTO = userManageParam.queryDifferentNetPhonePoolListOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 查询灰名单列表
	* @date: 2016-10-15 
	* @author: xiongxq
	* @Title: queryGreyList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryGreyList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = userManageParam.queryGreyListInParam(inDTO);
			Map<String,Object> outParam = userManageEntity.queryGreyList(inParam);
			standardOutDTO =  userManageParam.queryGreyListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 查询用户回单记录表
	* @date: 2017-3-12 
	* @author: wuJiaFu
	* @title: queryReceiptRecordList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryReceiptRecordList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = userManageParam.queryReceiptRecordListInParam(inDTO);
			Map<String,Object> outParam = userManageEntity.queryRecommendRecordList(inParam);
			standardOutDTO =  userManageParam.queryReceiptRecordListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 查询用户推荐记录信息
	* @date: 2017-2-13 
	* @author: wuJiaFu
	* @title: queryRecommendRecordList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryRecommendRecordList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = userManageParam.queryRecommendRecordListInParam(inDTO);
			Map<String,Object> outParam = userManageEntity.queryRecommendRecordList(inParam);
			standardOutDTO =  userManageParam.queryRecommendRecordListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 查询用户资料列表
	* @date: 2016-11-7 
	* @author: fangyuan_crmpd
	* @title: queryUserDataList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryUserDataList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = userManageParam.queryUserDataListInParam(inDTO);
			Map<String, Object> outParam = userManageEntity.queryUserDataList(inParam);
			standardOutDTO =  userManageParam.queryUserDataListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 查询用户标签列表
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: queryUserLabelList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryUserLabelList(InDTO inDTO) {
        StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = userManageParam.queryUserLabelListInParam(inDTO);
			Map<String,Object> outParam= userManageEntity.queryUserLabelList(inParam);
			standardOutDTO = userManageParam.queryUserLabelListOutParam(outParam);
			
		}catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}	
		
		return standardOutDTO;
		
	}

	/**
	 * 删除灰名单
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: removeGrey 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeGrey(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = userManageParam.removeGreyInParam(inDTO);
			userManageEntity.removeGrey(inParam);
			standardOutDTO =  userManageParam.removeGreyOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/** 
	 * 删除异网号码池
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: removeDifferentNetPhonePool 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO removeDifferentNetPhonePool(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = userManageParam.removeDifferentNetPhonePoolInParam(inDTO);
			userManageEntity.removeDifferentNetPhonePool(inParam);
			standardOutDTO = userManageParam.removeDifferentNetPhonePoolOutParam();
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;	
	}
	
	/**
	 * 删除用户标签
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: removeUserLabel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeUserLabel(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = userManageParam.removeUserLabelInParam(inDTO);
			userManageEntity.removeUserLabel(inParam);
			standardOutDTO =  userManageParam.removeUserLabelOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/** 
	 * 批量保存灰名单
	* @date: 2016-10-17 
	* @author: xiongxq
	* @Title: saveBatchGrey 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO saveBatchGrey(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = userManageParam.saveBatchGreyInParam(inDTO);
			userManageEntity.saveBatchGrey(inParam);
			standardOutDTO =  userManageParam.saveBatchGreyOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 保存异网号码池  
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: saveDifferentNetPhonePool 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO saveDifferentNetPhonePool(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = userManageParam.saveDifferentNetPhonePoolInParam(inDTO);
			userManageEntity.saveDifferentNetPhonePool(inParam);
			standardOutDTO = userManageParam.saveDifferentNetPhonePoolOutParam();
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/** 
	 * 保存单个灰名单
	* @date: 2016-10-17 
	* @author: xiongxq
	* @Title: saveSingleGrey 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO saveSingleGrey(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = userManageParam.saveSingleGreyInParam(inDTO);
			userManageEntity.saveSingleGrey(inParam);
			standardOutDTO =  userManageParam.saveSingleGreyOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 新增用户标签
	* @date: 2016-10-24 
	* @author: fangyuan_crmpd
	* @title: saveUserLabel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveUserLabel(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = userManageParam.saveUserLabelInParam(inDTO);
			userManageEntity.saveUserLabel(inParam);
			standardOutDTO =  userManageParam.saveUserLabelOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 修改灰名单
	* @date: 2016-10-16 
	* @author: xiongxq
	* @Title: updateGrey 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO updateGrey(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = userManageParam.updateGreyInParam(inDTO);
			userManageEntity.updateGrey(inParam);
			standardOutDTO =  userManageParam.updateGreyOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 修改异网号码池 
	* @date: 2016-10-30 
	* @author: xiongxq
	* @Title: updateDifferentNetPhonePool 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO updateDifferentNetPhonePool(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			Map<String,Object> inParam = userManageParam.updateDifferentNetPhonePoolInParam(inDTO);
			Map<String,Object> outParam = userManageEntity.updateDifferentNetPhonePool(inParam);
			standardOutDTO = userManageParam.updateDifferentNetPhonePoolOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 更新用户标签
	* @date: 2016-10-27 
	* @author: fangyuan_crmpd
	* @title: updateUserLabel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO updateUserLabel(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = userManageParam.updateUserLabelInParam(inDTO);
			userManageEntity.updateUserLabel(inParam);
			standardOutDTO =  userManageParam.updateUserLabelOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
		
}
