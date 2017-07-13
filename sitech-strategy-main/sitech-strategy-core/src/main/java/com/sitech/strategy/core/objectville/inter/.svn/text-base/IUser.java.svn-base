package com.sitech.strategy.core.objectville.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.pojo.inter.IQueryFilter;
import com.sitech.strategy.common.pojo.inter.ISortParamer;
import com.sitech.strategy.common.utils.StrategyError;

/**
 * 用户对象
* @date: 2016年9月5日 
* @author: wangth
* @Title: IUser 
* @version 1.0 
* @Description： 
* update_version: update_date: update_author: update_note:
 */
public interface IUser {
	
	/**
	 * 批量保存灰名单
	* @date: 2016-10-18 
	* @author: xiongxq
	* @Title: addBatchGrey 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addBatchGrey(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 保存单个灰名单
	* @date: 2016-10-17 
	* @author: xiongxq
	* @Title: addSingleGrey 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addSingleGrey(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 增加用户接触记录
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: addUserContactRecord 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addUserContactRecord(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 增加用户推荐记录
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: addUserRecommendRecord 
	* @param tempInParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addUserRecommendRecord(Map<String,Object> inParam,List<Map<String, Object>> packetMarkCaseList) throws StrategyError;
	
	/**
	 * 增加用户推荐营销案记录
	* @date: 2017-4-10 
	* @author: sunyuan
	* @title: addUserRecommendMarketCase 
	* @param inParam
	* @param packetMarkCaseList
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addUserRecommendMarketCase(Map<String,Object> inParam,List<Map<String,Object>> packetMarkCaseList)throws StrategyError;
	
	/**
	 * 获取用户历史接触记录
	* @date: 2017-2-12 
	* @author: sunliang 
	* @title: getUserHisTouchRecord 
	* @param userMap
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> getUserHisTouchRecord(Map<String,Object> userMap) throws StrategyError;
	
	/**
	 * 处理灰名单用户
	* @date: 2017-1-18 
	* @author: zhangjj_crmpd
	* @title: handleGreyUser  
	* @exception: 
	* @version: 1.0 
	 * @throws StrategyError 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void handleGreyUser() throws StrategyError;
	
	/**
	 *查询异网号码池列表  
	* @date: 2016-10-31 
	* @author: xiongxq
	* @Title: queryDifferentNetPhonePoolList 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryDifferentNetPhonePoolList(Map<String,Object> inParam,IQueryFilter queryFilter,ISortParamer sortParamer) throws StrategyError;

	/**
	 * 查询灰名单列表
	* @date: 2016-10-17 
	* @author: xiongxq
	* @Title: queryGreyList 
	* @param inParam
	* @param queryFilter
	* @param sortParamer
	* @return
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryGreyList(Map<String,Object> inParam,IQueryFilter queryFilter,ISortParamer sortParamer) throws StrategyError;
	
	/**
	 * 查询用户号码信息
	* @date: 2017-2-9 
	* @author: sunliang 
	* @title: queryUserNo 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryUserNo(Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: queryUserInfoByIdNo 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,String> queryUserInfoByIdNo(Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 查询用户标签列表
	* @date: 2016-10-19 
	* @author: tangaq
	* @title: queryUserLabelTmpList 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryUserLabelList (Map<String, Object> inParam,IQueryFilter queryFilter) throws StrategyError;
	
	/**
	 * 根据service_nbr查询ID_NO
	* @date: 2017-2-13 
	* @author: wuJiaFu
	* @title: queryUserIdNoByServiceNbr 
	* @param inParam
	* @param queryFilter
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryUserIdNoByServiceNbr (Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 查询用户标签数据
	* @date: 2017-2-11 
	* @author: sunliang 
	* @title: queryUserLabelByIdNo 
	* @param tempInParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,String> queryUserLabelByIdNo(Map<String,Object> tempInParam) throws StrategyError;
	
	/**
	 * 删除灰名单
	* @date: 2016-10-17 
	* @author: xiongxq
	* @Title: removeGrey 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeGrey(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 通过黑名单文件删除黑名单记录(oracle/hbase)
	* @date: 2016-12-6 
	* @author: zhangjj_crmpd
	* @title: removeGrepByGreyFile 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeGrepByGreyFile(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 通过黑名单文件入黑名单表(oracle/hbase)
	* @date: 2016-12-6 
	* @author: zhangjj_crmpd
	* @title: saveGreyByGreyFile 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveGreyByGreyFile(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 修改灰名单
	* @date: 2016-10-17 
	* @author: xiongxq
	* @Title: updateGrey 
	* @param inParam
	* @throws StrategyError 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateGrey(Map<String,Object> inParam) throws StrategyError;

}
