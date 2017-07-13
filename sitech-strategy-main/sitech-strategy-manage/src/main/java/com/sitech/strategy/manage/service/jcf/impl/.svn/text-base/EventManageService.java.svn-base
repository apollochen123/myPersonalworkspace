package com.sitech.strategy.manage.service.jcf.impl;

import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.BaseManageService;
import com.sitech.strategy.manage.base.basedto.StandardInDTO;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;
import com.sitech.strategy.manage.entity.inter.IEventManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IEventManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IEventManageService;

/**
 * 事件
* @date: 2016-9-5 
* @author: tangaq
* @title: EventManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "saveEventDetailInfo", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "removeMarketCaseEventRelAndDetailByRelId", oc = StandardOutDTO.class)
})
public class EventManageService extends BaseManageService implements IEventManageService {
		
	/**
	 * 事件对象
	 */
	protected IEventManageEntity eventManageEntity;
	/**
	 * 事件参数转换对象
	 */
	protected IEventManageParam eventManageParam;
	
	/**
	 * 
	* @date: 2017-2-12 
	* @author:liuqi
	* @title: getEventManageEntity 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IEventManageEntity getEventManageEntity() {
		return eventManageEntity;
	}

	/**
	 * 
	* @date: 2017-2-12 
	* @author:liuqi
	* @title: setEventManageEntity 
	* @param eventManageEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventManageEntity(IEventManageEntity eventManageEntity) {
		this.eventManageEntity = eventManageEntity;
	}

	/**
	 * 
	* @date: 2017-2-12 
	* @author:liuqi
	* @title: getEventManageParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public IEventManageParam getEventManageParam() {
		return eventManageParam;
	}

	/**
	 * 
	* @date: 2017-2-12 
	* @author:liuqi
	* @title: setEventManageParam 
	* @param eventManageParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventManageParam(IEventManageParam eventManageParam) {
		this.eventManageParam = eventManageParam;
	}


	/**
	 * 保存事件明细信息
	* @date: 2017-2-14 
	* @author: liuqi
	* @title: saveEventDetailInfo 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO saveEventDetailInfo(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
		Map<String,Object> inParam = eventManageParam.saveEventDetailInfoInParam(inDTO);
		Map<String,Object> outParam = eventManageEntity.saveEventDetailInfo(inParam);
		standardOutDTO = eventManageParam.saveEventDetailInfoOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}
	
	
	/**
	 *   删除事件关系，缴费事件删除事件详情和事件表
	* @date: 2017-3-30 
	* @author: chenhao
	* @title: removeMarketCaseEventRelAndDetailByRelId 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO removeMarketCaseEventRelAndDetailByRelId(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = eventManageParam.removeMarketCaseEventRelAndDetailByRelIdInParam(inDTO);
			eventManageEntity.removeMarketCaseEventRelAndDetailByRelId(inParam);
			standardOutDTO = eventManageParam.removeMarketCaseEventRelAndDetailByRelIdOutParam();;
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}

}