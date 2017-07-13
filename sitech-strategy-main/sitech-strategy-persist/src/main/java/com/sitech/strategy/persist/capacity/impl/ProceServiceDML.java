package com.sitech.strategy.persist.capacity.impl;

import java.io.Serializable;
import java.util.Map;

import com.sitech.jcfx.dt.MBean;
import com.sitech.strategy.common.utils.SvcConst;
import com.sitech.strategy.persist.base.BaseServiceDB;
import com.sitech.strategy.persist.utils.ServiceUtil;

/**
 * 服务数据操控实现
* @date: 2016-9-12 
* @author: zhaoyue
* @title: ProceServiceDML 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ProceServiceDML extends BaseServiceDB implements IServiceDML,Serializable{

    /**
     * 调用CRM接口查询派单信息
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
	@Override
	public String selectGroupMsgByCRM(Map<String,Object> inParam) {
		String pin = (String)inParam.get("pin");
		String subChannel = ServiceUtil.callService(SvcConst.SERVICE_ADDR_SENDORDERS_CRM, pin);
        log.info("subChannel:", subChannel);
		return subChannel;
	}

	/**
	 * 查询批量短信营销案推荐量
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
	@Override
	public String selectBatchMarketCaseRecommendCount(
			Map<String, Object> tempInParam) {
		String pin = (String)tempInParam.get("pin");
		String recommendCount = ServiceUtil.callService(SvcConst.SERVICE_ADDR_QUERYRECOMMENDCOUNT, pin,SvcConst.SERVICE_TYPE_HSF);
        //String recommendCount = "{\"ROOT\":{\"HEADER\":{\"ROUTING\":{\"ROUTE_KEY\":\"\",\"ROUTE_VALUE\":\"\"},\"TRACE_ID\":\"-1\",\"CHANNEL_ID\":\"11\"},\"BODY\":{\"OUT_DATA\":{\"RESULT_LIST\":[{\"CUST_NUM\": \"2402746\",\"STOP_SENT\": \"22028\",\"TO_BE_SENT\": \"1998\"}]},\"RETURN_CODE\":\"0\",\"RETURN_MSG\":\"OK\",\"USER_MSG\":\"OK\",\"DETAIL_MSG\":\"OK\",\"PROMPT_MSG\":\"OK\",\"RUN_IP\":\"10.162.200.24\"}}}";
		log.debug("selectBatchMarketCaseRecommendCount.recommendCount", recommendCount);
		return recommendCount;
	}
	
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
	@Override
	public String selectProductList(Map<String, Object> inParam) {
		String pin = (String)inParam.get("pin");
		String productList = ServiceUtil.callService(SvcConst.SERVICE_ADDR_QUERYPRODUCTLIST,pin,SvcConst.SERVICE_TYPE_HSF);
		log.info("productList:", productList); 
		return productList;
	}
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
	@Override
	public String checkFile(String checkFileBean){
		String checkFileResult = ServiceUtil.callService(SvcConst.SERVICE_ADDR_CHECKFILE,checkFileBean,SvcConst.SERVICE_TYPE_HSF);
		return checkFileResult;
	}

	/**
	 * 添加批量任务
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
	@Override
	public String addBatchExePlan(String addBatchExePlan) {
		String addBatchExePlanResult = ServiceUtil.callService(SvcConst.SERVICE_ADDR_ADDBATCHEXEPLAN,addBatchExePlan,SvcConst.SERVICE_TYPE_HSF);
		return addBatchExePlanResult;
	}
}
