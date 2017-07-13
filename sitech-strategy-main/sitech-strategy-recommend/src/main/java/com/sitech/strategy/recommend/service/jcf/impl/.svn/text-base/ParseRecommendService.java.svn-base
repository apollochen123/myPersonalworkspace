package com.sitech.strategy.recommend.service.jcf.impl;

import java.util.HashMap;
import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IMonitor;
import com.sitech.strategy.recommend.base.BaseRecommendService;
import com.sitech.strategy.recommend.base.basedto.StandardInDTO;
import com.sitech.strategy.recommend.base.basedto.StandardOutDTO;
import com.sitech.strategy.recommend.entity.inter.IParseRecommendEntity;
import com.sitech.strategy.recommend.entity.param.inter.IEventReceiverParam;
import com.sitech.strategy.recommend.entity.param.inter.IParseRecommendParam;
import com.sitech.strategy.recommend.service.jcf.inter.IParseRecommendService;

/**
 * 推荐解析服务
* @date: 2016-9-5 
* @author: sunliang 
* @title: ParseRecommendService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "parseChannelTaskRecommend", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "parseRecommendContent", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "testEventTrigger", oc = StandardOutDTO.class)
})
public class ParseRecommendService extends BaseRecommendService implements IParseRecommendService {
	
	/**
	 * 推荐实体
	 */
	protected IParseRecommendEntity parseRecommendEntity;
	/**
	 * 参数处理实体
	 */
	protected IParseRecommendParam parseRecommendParam;
	/**
	 * 事件
	 */
	protected IEventReceiverParam eventReceiverParam;
	/**
	 * 监控
	 */
	protected IMonitor monitor;
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setParseRecommendEntity 
	* @param parseEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setParseRecommendEntity(IParseRecommendEntity parseRecommendEntity) {
		this.parseRecommendEntity = parseRecommendEntity;
	}
	
	/**
	 * 
	* @date: 2016-9-16 
	* @author: sunliang 
	* @title: setParseRecommendParam 
	* @param parseRecommendParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setParseRecommendParam(IParseRecommendParam parseRecommendParam) {
		this.parseRecommendParam = parseRecommendParam;
	}
	
	/**
	 * 
	* @date: 2017-2-26 
	* @author: sunliang 
	* @title: setEventReceiverParam 
	* @param eventReceiverParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setEventReceiverParam(IEventReceiverParam eventReceiverParam) {
		this.eventReceiverParam = eventReceiverParam;
	}
	
	/** 
	* @date: 2017-3-7 
	* @author: wangpei
	* @title: setMonitor 
	* @param monitor 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void setMonitor(IMonitor monitor) {
		this.monitor = monitor;
	}

	/**
	 * 渠道任务解析接口
	* @date: 2016-10-19 
	* @author: yangwl
	* @title: parseChannelTaskRecommend 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO parseChannelTaskRecommend(InDTO inDTO){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = parseRecommendParam.parseChannelTaskRecommendInParam(inDTO);
			Map<String,Object> outParam = parseRecommendEntity.parseChannelTaskRecommend(inParam);
			standardOutDTO = parseRecommendParam.parseChannelTaskRecommendOutParam(outParam);
			monitor.addServiceMonitoringToCache(inParam, inDTO.getMbean().toString(), standardOutDTO.getBean().toString());
		} catch (StrategyError e) {
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 实时解析推荐内容
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: parseRecommendContent 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO parseRecommendContent(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = parseRecommendParam.parseRecommendContentInParam(inDTO);
			Map<String,Object> outParam = parseRecommendEntity.parseChannelTriggerRecommend(inParam);
			standardOutDTO = parseRecommendParam.parseRecommendContentOutParam(outParam);
			monitor.addServiceMonitoringToCache(inParam, inDTO.getMbean().toString(), standardOutDTO.getBean().toString());
		} catch (StrategyError e) {
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 测试事件触发
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: parseRecommendContent 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO testEventTrigger(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			log.info("testEventTrigger", "start");
			//赠费测试
			//String str = "{\"EVENT_ID\":\"20170301094102150100253\",\"PHONE_NO\":\"10000000060\",\"EVENT_TRIGGER_CHANNEL_ID\":\"02\",\"CONTRACT_NO\":\"220100101038785058\",\"SEQ_ID\":\"100110011001\"}";
			//赠套餐
			String str = "{\"EVENT_ID\":\"10030001001\",\"PHONE_NO\":\"13624314054\",\"EVENT_TRIGGER_CHANNEL_ID\":\"\",\"CONTRACT_NO\":\"\",\"SEQ_ID\":\"100110011001\"}";
			//套外流量超出多少元
			//String str = "{\"EVENT_ID\":\"10020001002\",\"PHONE_NO\":\"10000000060\",\"EVENT_TRIGGER_CHANNEL_ID\":\"\",\"CONTRACT_NO\":\"\",\"SEQ_ID\":\"100110011001\"}";
			Map<String,Object> inParam = eventReceiverParam.parseEventTriggerRecommendParam(str);
			parseRecommendEntity.parseEventTriggerRecommend(inParam);
			standardOutDTO = parseRecommendParam.parseRecommendContentOutParam(new HashMap<String,Object>());
			log.info("testEventTrigger", "end");
		} catch (StrategyError e) {
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
}
