package com.sitech.strategy.recommend.service.jcf.impl;

import java.util.Map;

import com.sitech.jcfx.anno.ParamType;
import com.sitech.jcfx.anno.ParamTypes;
import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IMonitor;
import com.sitech.strategy.recommend.base.basedto.StandardInDTO;
import com.sitech.strategy.recommend.base.basedto.StandardOutDTO;
import com.sitech.strategy.recommend.entity.inter.IBatchTaskRecommendEntity;
import com.sitech.strategy.recommend.entity.inter.IManageRecommendEntity;
import com.sitech.strategy.recommend.entity.param.inter.IBatchPushProdTaskParam;
import com.sitech.strategy.recommend.entity.param.inter.IManageRecommendParam;
import com.sitech.strategy.recommend.service.jcf.inter.IManageRecommendService;

/**
 * 管理服务
* @date: 2016-10-15 
* @author: yangwl
* @title: ManageRecommendService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
@ParamTypes({
	@ParamType(c = StandardInDTO.class, m = "queryCustList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryMarketCaseList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "queryTaskList", oc = StandardOutDTO.class),
	@ParamType(c = StandardInDTO.class, m = "sendBatchPushProdTask", oc = StandardOutDTO.class)
})
public class ManageRecommendService implements IManageRecommendService{

	/**
	 * 管理服务参数处理实体
	 */
	protected IManageRecommendParam  manageRecommendParam;
	/**
	 * 推荐管理实体
	 */
	protected IManageRecommendEntity manageRecommendEntity;
	/**
	 * 监控
	 */
	protected IMonitor monitor;
	/**
	 * 批量任务推荐实体对象
	 */
	protected IBatchTaskRecommendEntity batchTaskRecommendEntity;
	/**
	 * 批量送套餐任务实体
	 */
	protected IBatchPushProdTaskParam batchPushProdTaskParam;
	/**
	 * 
	* @date: 2017-4-24 
	* @author: chenhao
	* @title: setBatchTaskRecommendEntity 
	* @param batchTaskRecommendEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBatchTaskRecommendEntity(
			IBatchTaskRecommendEntity batchTaskRecommendEntity) {
		this.batchTaskRecommendEntity = batchTaskRecommendEntity;
	}
	/**
	 * 
	* @date: 2017-4-24 
	* @author: chenhao
	* @title: setBatchPushProdTaskParam 
	* @param batchPushProdTaskParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setBatchPushProdTaskParam(
			IBatchPushProdTaskParam batchPushProdTaskParam) {
		this.batchPushProdTaskParam = batchPushProdTaskParam;
	}

	/**
	 * 
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: setManageRecommendEntity 
	* @param manageRecommendEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setManageRecommendEntity(
			IManageRecommendEntity manageRecommendEntity) {
		this.manageRecommendEntity = manageRecommendEntity;
	}
	
	/**
	 * 
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: setManageRecommendParam 
	* @param manageRecommendParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setManageRecommendParam(IManageRecommendParam manageRecommendParam) {
		this.manageRecommendParam = manageRecommendParam;
	}
	/**
	 * 
	* @date: 2017-03-09 
	* @author: yangyf_crmpd
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
	 * 查询客户列表
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: queryCustList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryCustList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = manageRecommendParam.parseCustListInParam(inDTO);
			Map<String,Object> outParam = manageRecommendEntity.queryCustList(inParam);
			standardOutDTO = manageRecommendParam.parseCustListOutParam(outParam);
			monitor.addServiceMonitoringToCache(inParam, inDTO.getMbean().toString(), standardOutDTO.getBean().toString());
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}
	
	/**
	 * 查询营销案列表
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: queryMarketCaseList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryMarketCaseList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = manageRecommendParam.parseMarketCaseListInParam(inDTO);
			Map<String,Object> outParam = manageRecommendEntity.queryMarketCaseList(inParam);
			standardOutDTO = manageRecommendParam.parseMarketCaseListOutParam(outParam);
			monitor.addServiceMonitoringToCache(inParam, inDTO.getMbean().toString(), standardOutDTO.getBean().toString());
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}

	/**
	 * 查询任务列表
	* @date: 2016-10-15 
	* @author: yangwl
	* @title: queryTaskList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO queryTaskList(InDTO inDTO) {
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		try {
			Map<String,Object> inParam = manageRecommendParam.parseTaskListInParam(inDTO);
			Map<String,Object> outParam = manageRecommendEntity.queryTaskList(inParam);
			standardOutDTO = manageRecommendParam.parseTaskListOutParam(outParam);
			monitor.addServiceMonitoringToCache(inParam, inDTO.getMbean().toString(), standardOutDTO.getBean().toString());
		} catch (StrategyError e) {
			e.printStackTrace();
			e.processExcepByJCF();
		}
		return standardOutDTO;
	}
	/**
	 * 
	* @date: 2017-4-24 
	* @author: chenhao
	* @title: sendBatchPushProdTask 
	* @param inDTO 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public OutDTO sendBatchPushProdTask(InDTO inDTO){
		StandardOutDTO standardOutDTO = new StandardOutDTO();
		MBean mbean = inDTO.getMbean();
		Map<String,Object> inParam = mbean.getBody();
		try {
			Map<String,Object> map = batchPushProdTaskParam.getSendBatchPushProdTaskInParam(inParam);
			batchTaskRecommendEntity.sendBatchPushProdTask(map);
		} catch (StrategyError e) {
			e.printStackTrace();
		}
		standardOutDTO.setBean(mbean);
		return standardOutDTO;
	}

}
