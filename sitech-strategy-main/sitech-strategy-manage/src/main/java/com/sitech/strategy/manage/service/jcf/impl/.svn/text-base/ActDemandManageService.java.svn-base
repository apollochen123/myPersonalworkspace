package com.sitech.strategy.manage.service.jcf.impl;

import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.basedto.StandardInDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.inter.IActDemandManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IActDemandManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IActDemandManageService;

/**
 * 活动需求对象
* @date: 2016-10-20 
* @author: wangth
* @Title: ActDemandManageService 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryActDemandList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryActDemandDetail", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeActDemand", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "saveActDemand", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "updateActDemand", oc = StandardOutDTO.class)
})
public class ActDemandManageService implements IActDemandManageService {
	/**
	 * 活动需求对象
	 */
	protected IActDemandManageEntity actDemandManageEntity;
	/**
	 * 活动需求参数处理对象
	 */
	protected IActDemandManageParam actDemandManageParam;
	
	
	/**
	 * 
	* @date: 2016-10-23 
	* @author: wangth
	* @Title: setActDemandManageEntity 
	* @param actDemandManageEntity 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setActDemandManageEntity(
			IActDemandManageEntity actDemandManageEntity) {
		this.actDemandManageEntity = actDemandManageEntity;
	}
	
	/**
	 * 
	* @date: 2016-10-23 
	* @author: wangth
	* @Title: setActDemandManageParam 
	* @param actDemandManageParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setActDemandManageParam(IActDemandManageParam actDemandManageParam) {
		this.actDemandManageParam = actDemandManageParam;
	}

	/**
	 * 查询活动需求列表
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: queryActDemandList 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryActDemandList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = actDemandManageParam.queryActDemandListInParam(inDTO);
			Map<String,Object> outParam = actDemandManageEntity.queryActDemandList(inParam);
			standardOutDTO = actDemandManageParam.queryActDemandListOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;	
	}

	
	/**
	 * 查询活动需求详细信息
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: queryActDemandDetail 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryActDemandDetail(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = actDemandManageParam.queryActDemandDetailInParam(inDTO);
			Map<String,Object> outParam = actDemandManageEntity.queryActDemandDetail(inParam);
			standardOutDTO = actDemandManageParam.queryActDemandDetailOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;	
	}
	
	/**
	 * 移除活动需求
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: removeActDemand 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeActDemand(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = actDemandManageParam.removeActDemandInParam(inDTO);
			actDemandManageEntity.removeActDemand(inParam);
			standardOutDTO = actDemandManageParam.removeActDemandOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;	
	}
	
	/**
	 *保存活动需求
	* @date: 2016-10-20 
	* @author: wangth
	* @Title: saveActDemand 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveActDemand(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = actDemandManageParam.saveActDemandInParam(inDTO);
			actDemandManageEntity.saveActDemand(inParam);
			standardOutDTO = actDemandManageParam.saveActDemandOutParam();
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
	/**
	 * 更新活动需求
	* @date: 2016-10-21 
	* @author: wangth
	* @Title: updateActDemand 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO updateActDemand(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			Map<String,Object> inParam = actDemandManageParam.updateActDemandInParam(inDTO);
			actDemandManageEntity.updateActDemand(inParam);
			standardOutDTO = actDemandManageParam.updateActDemandOutParam();
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
}
