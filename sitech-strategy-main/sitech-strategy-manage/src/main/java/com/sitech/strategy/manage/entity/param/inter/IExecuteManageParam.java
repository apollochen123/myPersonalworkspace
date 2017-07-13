package com.sitech.strategy.manage.entity.param.inter;

import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;

/**
 * 执行参数处理
* @date: 2016-9-28 
* @author: wangth
* @Title: IExecuteManageParam 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IExecuteManageParam {
	
	/**
	 * 暂停营销案推荐入参处理
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: addPauseMarketCaseRecommendInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> addPauseMarketCaseRecommendInParam(InDTO inDTO);
	
	/**
	 * 暂停营销案推荐出参处理
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: addPauseMarketCaseRecommendOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO addPauseMarketCaseRecommendOutParam();
	
	/**
	 * 入参处理(营销案补发时，往批量push营销案待发送营销案列表缓存添加补发数据)
	 * @date: 2016-11-11 
	 * @author: yuanliang
	 * @title: addRepairWaitSendBatchPushMarketCaseToCacheInParam 
	 * @param inDTO
	 * @return 
	 * @exception: 
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note: 
	 */
	public Map<String,Object> addRepairWaitSendBatchPushMarketCaseToCacheInParam(InDTO inDTO) throws StrategyError;
	
	/**
	 * 出参处理(营销案补发时，往批量push营销案待发送营销案列表缓存添加补发数据)
	 * @date: 2016-11-11 
	 * @author: yuanliang
	 * @title: addRepairWaitSendBatchPushMarketCaseToCacheOutParam 
	 * @return 
	 * @exception: 
	 * @version: 1.0 
	 * @description: 
	 * update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO addRepairWaitSendBatchPushMarketCaseToCacheOutParam();
	
	/**
	 * 入参处理(营销案测试时，往优先级缓存添加测试数据)
	* @date: 2016-11-7 
	* @author: yuanliang
	* @title: addTestWaitSendBatchPushMarketCaseToCacheInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> addTestWaitSendBatchPushMarketCaseToCacheInParam(InDTO inDTO);
	
	/**
	 * 出参处理(营销案测试时，往优先级缓存添加测试数据)
	* @date: 2016-11-7 
	* @author: yuanliang
	* @title: addTestWaitSendBatchPushMarketCaseToCacheOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO addTestWaitSendBatchPushMarketCaseToCacheOutParam();
	
	/**
	 * 入参处理（获得补发的营销案）
	* @date: 2016-11-16 
	* @author: yuanliang
	* @title: getRepairWaitSendBatchPushMarketCaseInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> getRepairWaitSendBatchPushMarketCaseInParam(InDTO inDTO);
	/**
	 * 出参处理（获得补发的营销案）
	* @date: 2016-11-16 
	* @author: yuanliang
	* @title: getRepairWaitSendBatchPushMarketCaseOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO getRepairWaitSendBatchPushMarketCaseOutParam(List<Map<String,Object>> outParam);
	
	
	/** 
	 * 验证营销案入参处理
	* @date: 2016-10-31 
	* @author: songxj
	* @title: marketCaseVerifyInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> marketCaseVerifyInParam(InDTO inDTO);
	
	/** 
	 * 验证营销案出差处理
	* @date: 2016-10-31 
	* @author: songxj
	* @title: marketCaseVerifyOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public StandardOutDTO marketCaseVerifyOutParam(Map<String,Object> outParam);
	
	/**
	 * 恢复营销案推荐暂停入参处理
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: recoverMarketCaseRecommendPauseInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> recoverMarketCaseRecommendPauseInParam(InDTO inDTO);
	
	/**
	 * 恢复营销案推荐暂停出参处理
	* @date: 2017-2-7 
	* @author: sunliang 
	* @title: recoverMarketCaseRecommendPauseOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO recoverMarketCaseRecommendPauseOutParam();
	
	/**
	 * 发送营销案ID入参处理
	* @date: 2016-12-16 
	* @author: yuanchun
	* @Title: sendMarketIdToCacheOutParam 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> sendMarketIdToCacheInParam(InDTO inDTO) throws StrategyError;
	
	/**
	 * 发送营销案ID出参处理
	* @date: 2016-12-16 
	* @author: yuanchun
	* @Title: sendMarketIdToCacheOutParam 
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO sendMarketIdToCacheOutParam();
	
}
