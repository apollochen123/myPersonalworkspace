package com.sitech.strategy.manage.entity.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 目标客户群实体
* @date: 2016-9-5 
* @author: sunliang
* @title: ICustGroupManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ICustGroupManageEntity {
	
	/**
	 * 批量添加号码到目标客户群
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: addBatchNoToCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addBatchNoToCustGroup(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 添加单个号码到目标客户群
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: addSingleNoToCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void addSingleNoToCustGroup(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 创建标签客户群明细文件--从hive中将明细数据导入到文件中
	* @date: 2017-2-16
	* @author: luogj
	* @title: createLabelCustGroupDetailFile 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void createLabelCustGroupDetailFile(Map<String,Object> inParam) throws StrategyError;	
	
	/**
	 * 根据ID查询客户群信息
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupById 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupById(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询符合标签的客户群数量
	* @date: 2017-1-24 
	* @author: zhangjj_crmpd
	* @title: queryCustGroupCountByUserLabel 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupCountByUserLabel(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询二次过滤标签的人数
	* @date: 2017-4-7 
	* @author: chenhao
	* @title: queryLabelFormulaRestrictCountById 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryLabelFormulaRestrictCountById(Map<String, Object> inParam) throws StrategyError;
	/**
	 * 查询客户群明细文件列表
	* @date: 2016-10-30 
	* @author: tangaq
	* @title: queryCustGroupDetailFileList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public  Map<String,Object> queryCustGroupDetailFileList(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 查询客户群处理记录
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: queryCustGroupHandleRecord 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupHandleRecord(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询客户群标签元素
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupLabelItem 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String, Object>> queryCustGroupLabelItem(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询客户群列表
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupList 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupList(Map<String, Object> inParam) throws StrategyError;
    
	/**
	 * 根据客户群ID查询客户群关系列表
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupRelationListByCustGroupId 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupRelationListByCustGroupId(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 查询客户群模板列表
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupTempList 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupTempList(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 查询标签码表
	* @date: 2017-3-4 
	* @author: yuanchun
	* @title: queryLabelCodeNameList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryLabelCodeNameList(Map<String, Object> inParam) throws StrategyError;
	
	/**
	 * 根据标签元素查询标签元素值
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryLabelValueByCode 
	* @param inParam
	* @return 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public  Map<String,Object> queryLabelValueByCode(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 批量删除号码
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: removeBatchNoFromCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeBatchNoFromCustGroup(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 根据id删除客户群
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: removeCustGroupById 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeCustGroupById(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 根据子客户群ID删除父客户群与子客户的关系
	* @date: 2016-11-28 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupRelationById 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeCustGroupRelationById(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 删除单个号码
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: removeSingleNoFromCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeSingleNoFromCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 保存目标客户群信息
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: saveLabelCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> saveCustGroup(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 保存客户群与子客户群关系
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: saveCustGroup 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveCustGroupRelation(Map<String,Object> inParam) throws StrategyError;


	
}
