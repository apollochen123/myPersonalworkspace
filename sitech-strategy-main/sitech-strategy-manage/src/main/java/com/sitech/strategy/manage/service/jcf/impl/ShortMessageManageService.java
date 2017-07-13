package com.sitech.strategy.manage.service.jcf.impl;

import java.util.HashMap;
import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageService;
import com.sitech.strategy.manage.base.basedto.StandardInDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.inter.IShortMessageManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IShortMessageManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IShortMessageManageService;
import com.sitech.strategy.persist.utils.ServiceUtil;

/**
 * 短信
* @date: 2016-9-5 
* @author: sunliang
* @title: ShortMessageManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryAccessCodeListByLoginNo", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryShortMessageAccessCodeList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryShortMsgMoveTrafficByDate", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryShortMsgMoveTrafficByMarketCaseId", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeAccessCodeByLoginNo", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeShortMessageAccessCode", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveAccessCodeForLoginNo", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveShortMessageAccessCode", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "sendShortMessageSimulation", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateShortMessageAccessCode", oc = StandardOutDTO.class)
})
public class ShortMessageManageService extends BaseManageService implements IShortMessageManageService {
	
	/**
	 * 短信对象
	 */
	protected IShortMessageManageEntity shortMessageManageEntity;
	/**
	 * 短信参数处理对象
	 */
	protected IShortMessageManageParam shortMessageManageParam;
	
	/** 
	 * @date: 2016-9-15 
	 * @author: xiongxq
	 * @Title: setShortMessageManageParam 
	 * @param shortMessageManageParam the shortMessageManageParam to set
	 * @version 1.0 
	 * @Description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public void setShortMessageManageParam(IShortMessageManageParam shortMessageManageParam) {
		this.shortMessageManageParam = shortMessageManageParam;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: setShortMessageEntity 
	* @param shortMessageEntity 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setShortMessageManageEntity(IShortMessageManageEntity shortMessageManageEntity) {
		this.shortMessageManageEntity = shortMessageManageEntity;
	}

	/**
	 * 根据工号查询接入码列表
	* @date: 2016-10-18 
	* @author: xiongxq
	* @Title: queryAccessCodeListByLoginNo 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO queryAccessCodeListByLoginNo(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
	
		try {
			Map<String,Object> inParam = shortMessageManageParam.queryAccessCodeListByLoginNoInParam(inDTO);
			Map<String,Object> outParam = shortMessageManageEntity.queryAccessCodeListByLoginNo(inParam);
			standardOutDTO = shortMessageManageParam.queryAccessCodeListByLoginNoOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 查询接入码列表
	* @date: 2016-9-5 
	* @author: wangth
	* @Title: queryAccessCodeList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryShortMessageAccessCodeList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = shortMessageManageParam.queryShortMessageAccessCodeListInParam(inDTO);
			Map<String,Object> outParam = shortMessageManageEntity.queryShortMessageAccessCodeList(inParam);
			standardOutDTO = shortMessageManageParam.queryShortMessageAccessCodeListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 根据日期查询短信推送流量
	* @date: 2016-10-30 
	* @author: fangyuan_crmpd
	* @title: queryShortMsgMoveTrafficByDate 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryShortMsgMoveTrafficByDate(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = shortMessageManageParam.queryShortMsgMoveTrafficByDateInParam(inDTO);
			Map<String,Object> outParam = shortMessageManageEntity.queryShortMsgMoveTrafficByDate(inParam);
			standardOutDTO = shortMessageManageParam.queryShortMsgMoveTrafficByDateOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/**
	 * 根据营销案ID查询短信推送流量
	* @date: 2016-10-30 
	* @author: fangyuan_crmpd
	* @title: queryShortMsgMoveTrafficByMarketCaseId 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryShortMsgMoveTrafficByMarketCaseId(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = shortMessageManageParam.queryShortMsgMoveTrafficByMarketCaseIdInParam(inDTO);
			Map<String,Object> outParam = shortMessageManageEntity.queryShortMsgMoveTrafficByMarketCaseId(inParam);
			standardOutDTO = shortMessageManageParam.queryShortMsgMoveTrafficByMarketCaseIdOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}

	/** 
	 * 根据工号删除接入码
	* @date: 2016-10-28 
	* @author: xiongxq
	* @Title: removeAccessCodeByLoginNo 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO removeAccessCodeByLoginNo(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = shortMessageManageParam.removeAccessCodeByLoginNoInParam(inDTO);
			shortMessageManageEntity.removeAccessCodeByLoginNo(inParam);
			standardOutDTO = shortMessageManageParam.removeAccessCodeByLoginNoOutParam();
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;	
	}

	

	/**
	 * 
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: removeShortMessageAccessCode 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeShortMessageAccessCode(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = shortMessageManageParam.removeShortMessageAccessCodeInParam(inDTO);
			Map<String,Object> outParam = shortMessageManageEntity.removeShortMessageAccessCode(inParam);
			standardOutDTO = shortMessageManageParam.removeShortMessageAccessCodeOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;	
	}
	
	/**
	 * 给某个工号添加接入码 
	* @date: 2016-10-28 
	* @author: xiongxq
	* @Title: saveAccessCodeForLoginNo 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO saveAccessCodeForLoginNo(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = shortMessageManageParam.saveAccessCodeForLoginNoInParam(inDTO);
			shortMessageManageEntity.saveAccessCodeForLoginNo(inParam);
			standardOutDTO = shortMessageManageParam.saveAccessCodeForLoginNoOutParam();
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 添加短信接入码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: saveShortMessageAccessCode 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveShortMessageAccessCode(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = shortMessageManageParam.saveShortMessageAccessCodeInParam(inDTO);
			Map<String,Object> outParam = shortMessageManageEntity.saveShortMessageAccessCode(inParam);
			standardOutDTO = shortMessageManageParam.saveShortMessageAccessCodeOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 短信模拟发送
	* @date: 2017-1-9 
	* @author: tangaq
	* @title: sendShortMessageSimulation 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO sendShortMessageSimulation(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			
			Map<String,Object> inParam = shortMessageManageParam.sendShortMessageSimulationInParam(inDTO);
			Map<String,Object> outParam = shortMessageManageEntity.sendShortMessageSimulation(inParam);
			standardOutDTO = shortMessageManageParam.sendShortMessageSimulationOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;		
	}

	/**
	 * 更新短信接入码
	* @date: 2016-10-17 
	* @author: wangth
	* @Title: updateShortMessageAccessCode 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO updateShortMessageAccessCode(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
	
		try {
			Map<String,Object> inParam = shortMessageManageParam.updateShortMessageAccessCodeInParam(inDTO);
			Map<String,Object> outParam = shortMessageManageEntity.updateShortMessageAccessCode(inParam);
			standardOutDTO = shortMessageManageParam.updateShortMessageAccessCodeOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	

}
