package com.sitech.strategy.persist.capacity.impl;

import java.util.Map;

/**
 *  服务数据操控接口
* @date: 2016-9-12 
* @author: zhaoyue
* @title: IServiceDML 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IServiceDML {
	
    /**
     * 调用CRM接口查询派单消息
    * @date: 2016-12-27 
    * @author: tangaq
    * @title: selectSendOrdersByCRM 
    * @param inParam
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
    public String selectGroupMsgByCRM(Map<String,Object> inParam);
    
    /**
     * 查询批量营销案推荐量
    * @date: 2017-4-18 
    * @author: yuanchun
    * @title: selectBatchMarketCaseRecommendCount 
    * @param tempInParam
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public String selectBatchMarketCaseRecommendCount(Map<String, Object> tempInParam);
    
    /**
     * 调用行业部接口查询产品列表
    * @date: 2017-2-9 
    * @author: yuanchun
    * @title: selectProductList 
    * @param inParam
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public String selectProductList(Map<String, Object> inParam);

	/**
	 * 调用行业部接口校验正确文件名
	* @date: 2017-4-26 
	* @author: chenhao
	* @title: checkFile 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String checkFile(String checkFileBean);

	/**
	 * 调用接口批量赠送套餐
	* @date: 2017-4-26 
	* @author: chenhao
	* @title: addBatchExePlan 
	* @param addBatchExePlan
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String addBatchExePlan(String addBatchExePlan);

}
