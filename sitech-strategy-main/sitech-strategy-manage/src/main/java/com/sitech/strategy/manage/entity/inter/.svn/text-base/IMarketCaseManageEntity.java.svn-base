package com.sitech.strategy.manage.entity.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IMarketCaseDetailPojo;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 营销案实体
* @date: 2016-9-5 
* @author: sunliang
* @title: IMarketCaseManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IMarketCaseManageEntity {
	
	/**
	 * 权限下放
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: assignMarketCasePermissionById 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void assignMarketCasePermissionById(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 根据营销案名称查询营销案信息
	* @date: 2017-3-7 
	* @author: yuanliang
	* @title: queryMarketCaseDetailById 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryMarketCaseBasicByName(Map<String,Object> inParam) throws StrategyError;
	/**
	 * 根据ID查询营销案、审批详细信息
	* @date: 2016-10-1 
	* @author: tangaq
	* @title: queryMarketCaseAuditDetailById 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseAuditDetailById(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 通过Id查询营销案详细信息
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryMarketCaseDetailById 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseDetailById(Map<String,Object> inParam) throws StrategyError;
	/**
	 * 查询营销案详细信息列表
	* @date: 2017-3-3 
	* @author: yuanliang
	* @title: queryMarketCaseDetailList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<IMarketCaseDetailPojo> queryMarketCaseDetailList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询营销案列表
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryMarketCaseList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseList (Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 根据权限查询营销案列表
	* @date: 2017-1-5 
	* @author: yuanchun
	* @title: queryMarketCaseListByPermission 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryMarketCaseListByPermission(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 查询营销案模板列表
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryMarketCaseTempList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseTempList(Map<String,Object> inParam) throws StrategyError;
	
	/** 查询政策列表(销售品，定价组，补贴规则)
	* @date: 2016-10-12 
	* @author: wangpei
	* @title: queryProductList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> queryProductList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 删除营销案
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: removeMarketCaseById 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void  removeMarketCaseById(Map<String,Object> inParam) throws StrategyError;
	
	/** 删除客户群关系及明细
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: removeMarketCaseCustGroupRelAndDetailByRelId 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void  removeMarketCaseCustGroupRelAndDetailByRelId(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 暂停和重新启动营销案
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: restartAndPauseMarketCaseById 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void restartAndPauseMarketCaseById(Map<String,Object> inParam) throws StrategyError;

	/** 保存营销案基本信息
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseBasic 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> saveMarketCaseBasic(Map<String,Object> inParam) throws StrategyError;
	
	/** 保存营销案客户群关系
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseCustGroupRel 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> saveMarketCaseCustGroupRel(Map<String,Object> inParam) throws StrategyError;


	/**
	 * 保存营销案详细信息
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: saveMarketCaseDetail 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public  Map<String,Object> saveMarketCaseDetail(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 根据模板修改营销案详细信息
	* @date: 2016-11-15 
	* @author: tangaq
	* @title: updateMarketCaseDetailByTemplate 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateMarketCaseDetailByTemplate(Map<String,Object> inParam) throws StrategyError;
	
    /**
     * 修改营销案状态
    * @date: 2016-12-22 
    * @author: tangaq
    * @title: updateMarketCaseStatus 
    * @param inParam
    * @throws StrategyError 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public void updateMarketCaseStatus(Map<String,Object> inParam) throws StrategyError;
	
}
