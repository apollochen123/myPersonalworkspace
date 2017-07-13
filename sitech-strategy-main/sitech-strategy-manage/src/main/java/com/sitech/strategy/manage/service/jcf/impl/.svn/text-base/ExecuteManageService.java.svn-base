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
import com.sitech.strategy.manage.entity.inter.IExecuteManageEntity;
import com.sitech.strategy.manage.entity.param.inter.IExecuteManageParam;
import com.sitech.strategy.manage.service.jcf.inter.IExecuteManageService;

/**
 * 执行实体
* @date: 2016-9-28 
* @author: wangth
* @Title: ExecuteManageService 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({                                
	
	@ParamType(c = StandardInDTO.class, m = "addRepairWaitSendBatchPushMarketCaseToCache", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "addTestWaitSendBatchPushMarketCaseToCache", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "getRepairWaitSendBatchPushMarketCase", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "marketCaseVerify", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "pauseMarketCaseRecommend", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "recoverMarketCaseRecommendPause", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "sendMarketIdToCache", oc = StandardOutDTO.class)
})
public class ExecuteManageService extends BaseManageService implements IExecuteManageService{
	
	/**
	 * 执行对象
	 */
	protected IExecuteManageEntity executeManageEntity;
	/**
	 * 执行参数处理对象
	 */
	protected IExecuteManageParam executeManageParam;
	
	/**
	 * 
	* @date: 2016-9-28 
	* @author: wangth
	* @Title: setExecuteManageEntity 
	* @param executeManageEntity 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setExecuteManageEntity(IExecuteManageEntity executeManageEntity) {
		this.executeManageEntity = executeManageEntity;
	}
	
	/**
	 * 
	* @date: 2016-9-28 
	* @author: wangth
	* @Title: setExecuteManageParam 
	* @param executeManageParam 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setExecuteManageParam(IExecuteManageParam executeManageParam) {
		this.executeManageParam = executeManageParam;
	}

	/**
	 * 暂停营销案推荐
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: pauseMarketCaseRecommend 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO pauseMarketCaseRecommend(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();

		try {
			
			Map<String,Object> inParam = executeManageParam.addPauseMarketCaseRecommendInParam(inDTO);
			executeManageEntity.pauseMarketCaseRecommend(inParam);
			standardOutDTO = executeManageParam.addPauseMarketCaseRecommendOutParam();
			
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 往批量push营销案待发送营销案列表缓存添加补发数据
	* @date: 2016-11-11 
	* @author: yuanliang
	* @title: addRepairWaitSendBatchPushMarketCaseToCache 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO addRepairWaitSendBatchPushMarketCaseToCache(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			Map<String,Object> inParam = executeManageParam.addRepairWaitSendBatchPushMarketCaseToCacheInParam(inDTO);
			executeManageEntity.addRepairWaitSendBatchPushMarketCaseToCache(inParam);
			standardOutDTO = executeManageParam.addRepairWaitSendBatchPushMarketCaseToCacheOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 营销案测试时，往优先级缓存添加测试数据
	* @date: 2016-11-5 
	* @author: yuanliang
	* @title: addTestWaitSendBatchPushMarketCaseToCache 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO addTestWaitSendBatchPushMarketCaseToCache(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = executeManageParam.addTestWaitSendBatchPushMarketCaseToCacheInParam(inDTO);
			executeManageEntity.addTestWaitSendBatchPushMarketCaseToCache(inParam);
			standardOutDTO = executeManageParam.addTestWaitSendBatchPushMarketCaseToCacheOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 获得补发的营销案
	* @date: 2016-11-16 
	* @author: yuanliang
	* @title: getRepairWaitSendBatchPushMarketCase 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO getRepairWaitSendBatchPushMarketCase(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = executeManageParam.getRepairWaitSendBatchPushMarketCaseInParam(inDTO);
			List<Map<String,Object>> outParam= executeManageEntity.getRepairWaitSendBatchPushMarketCase(inParam);
			standardOutDTO = executeManageParam.getRepairWaitSendBatchPushMarketCaseOutParam(outParam);
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}
	
	/**
	 * 验证营销案 
	* @date: 2016-10-31 
	* @author: songxj
	* @title: marketCaseVerify 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	@Override
	public OutDTO marketCaseVerify(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String, Object> inParam = executeManageParam.marketCaseVerifyInParam(inDTO);
			Map<String, Object> outParam = executeManageEntity.marketCaseVerify(inParam);
			standardOutDTO = executeManageParam.marketCaseVerifyOutParam(outParam);
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}
	
	/**
	 * 恢复营销案推荐暂停
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: recoverMarketCaseRecommendPause 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO recoverMarketCaseRecommendPause(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		
		try {
			
			Map<String,Object> inParam = executeManageParam.recoverMarketCaseRecommendPauseInParam(inDTO);
			executeManageEntity.recoverMarketCaseRecommendPause(inParam);
			standardOutDTO = executeManageParam.recoverMarketCaseRecommendPauseOutParam();
		
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;
	}

	/**
	 * 发送营销案ID
	* @date: 2016-12-16
	* @author: yuanchun
	* @Title: sendMarketIdToCache 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO sendMarketIdToCache(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = executeManageParam.sendMarketIdToCacheInParam(inDTO);
			executeManageEntity.sendMarketIdToCache(inParam);
			standardOutDTO = executeManageParam.sendMarketIdToCacheOutParam();
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		
		return standardOutDTO;	
	}
	
}
