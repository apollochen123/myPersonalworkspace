package com.sitech.strategy.manage.service.jcf.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 执行实体
* @date: 2016-9-28 
* @author: wangth
* @Title: IExecuteManageService 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IExecuteManageService {
	
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
	public OutDTO pauseMarketCaseRecommend(InDTO inDTO);
	
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
	public OutDTO addRepairWaitSendBatchPushMarketCaseToCache(InDTO inDTO);
	
	/**
	 * 营销案测试时，往优先级缓存添加测试数据
	* @date: 2016-11-7
	* @author: yuanliang
	* @title: addTestWaitSendBatchPushMarketCaseToCache 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO addTestWaitSendBatchPushMarketCaseToCache(InDTO inDTO);
	
	/**
	 * 前台查询需要补发的营销案
	* @date: 2016-11-15 
	* @author: yuanliang
	* @title: getRepairWaitSendBatchPushMarketCase 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO getRepairWaitSendBatchPushMarketCase(InDTO inDTO);
	
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
	public OutDTO marketCaseVerify(InDTO inDTO);
	
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
	public OutDTO recoverMarketCaseRecommendPause(InDTO inDTO);
	
	/**
	 * 发送营销案ID
	* @date: 2016-12-16
	* @author: yuanchun
	* @Title: saveShortMessageAccessCode 
	* @param inDTO
	* @return 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO sendMarketIdToCache(InDTO inDTO);
	
}
