package com.sitech.strategy.manage.entity.param.inter;

import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;

/** 
 * 目标客户群参数转换
 * @date: 2016-9-14 
 * @author: xiongxq
 * @Title: IC 
 * @version 1.0 
 * @Description： 
 * update_version: update_date: update_author: update_note: 
 */
public interface ICustGroupManageParam {
	
	/**
	 *添加批量号码到目标客户群入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: addBatchNoToCustGroupInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> addBatchNoToCustGroupInParam(InDTO inDTO);

	/**
	 * 添加批量号码到目标客户群出参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: addBatchNoToCustGroupOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO addBatchNoToCustGroupOutParam();

	/**
	 * 添加单个号码到目标客户群入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: addSingleNoToCustGroupInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> addSingleNoToCustGroupInParam(InDTO inDTO);

	/**
	 * 添加单个号码到目标客户群出参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: addSingleNoToCustGroupOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO addSingleNoToCustGroupOutParam();

	/**
	 * 创建标签客户群明细文件入参转换--从hive中将明细数据导入到文件中
	* @date: 2017-2-16
	* @author: luogj
	* @title: createLabelCustGroupDetailFileInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> createLabelCustGroupDetailFileInParam(InDTO inDTO);
	

	/**
	 * 创建标签客户群明细文件出参转换--从hive中将明细数据导入到文件中
	* @date: 2017-2-16
	* @author: luogj
	* @title: createLabelCustGroupDetailFileOutParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO createLabelCustGroupDetailFileOutParam();
	
	
	/**
	 * 根据id查询客户群入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupByIdInParam(InDTO inDTO);
	
	/**
	 * 查询符合标签的客户群数量入参转换
	* @date: 2017-1-24 
	* @author: zhangjj_crmpd
	* @title: queryCustGroupCountByUserLabelInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryCustGroupCountByUserLabelInParam(InDTO inDTO);
	
	/**
	 * 查询二次过滤标签的人数入参转换
	* @date: 2017-4-7 
	* @author: chenhao
	* @title: queryLabelFormulaRestrictCountByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryLabelFormulaRestrictCountByIdInParam(InDTO inDTO);

	/**
	 * 查询二次过滤标签的人数出参转换
	* @date: 2017-4-7 
	* @author: chenhao
	* @title: queryLabelFormulaRestrictCountByIdOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryLabelFormulaRestrictCountByIdOutParam(Map<String, Object> outParam);
	
	/**
	 * 查询符合标签的客户群数量出参转换
	* @date: 2017-1-24 
	* @author: zhangjj_crmpd
	* @title: queryCustGroupCountByUserLabelOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCustGroupCountByUserLabelOutParam(
			Map<String, Object> outParam);

	/**
	 * 根据ID查询客户群信息出参转换
	* @date: 2016-9-12 
	* @author: tangaq
	* @title: queryCustGroupByIdOutParam
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCustGroupByIdOutParam(Map<String, Object> inMap);
	
	/**
	 * 查询客户群处理记录入参处理
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: queryCustGroupHandleRecordInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupHandleRecordInParam(InDTO inDTO);
	
	/**
	 * 查询客户群处理记录出参处理
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: queryCustGroupHandleRecordOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCustGroupHandleRecordOutParam(Map<String, Object> outParam);

	/**
	 * 查询客户群标签元素入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupLabelItemInParam 
	* @param inDTO
	* @return  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupLabelItemInParam(InDTO inDTO);

	/**
	 *查询客户群标签元素出参转换
	* @date: 2016-9-12 
	* @author: xiongxq
	* @Title: queryCustGroupLabelOutParam 
	* @param inMap
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCustGroupLabelItemOutParam(List<Map<String,Object>> inMap);

	/**
	 *查询客户群列表入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupListInParam(InDTO inDTO) throws StrategyError;

	/**
	 * 查询客户群列表出参处理
	* @date: 2016-9-13 
	* @author: xiongxq
	* @Title: queryCustGroupListOutParam 
	* @param inMap
	* @return  
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCustGroupListOutParam(Map<String,Object> inMap);
	
	/**
	 * 根据客户群ID查询客户群关系列表入参处理
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupRelationListByCustGroupIdInParam 
	* @param inDTO
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupRelationListByCustGroupIdInParam(InDTO inDTO) throws StrategyError;
	
	/**
	 * 根据客户群ID查询客户群关系列表出参处理
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupRelationListByCustGroupIdOutParam 
	* @param inMap
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCustGroupRelationListByCustGroupIdOutParam(Map<String,Object> outParam);
	
	/**
	 *  查询客户群模板列表入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupTempListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupTempListInParam(InDTO inDTO);

	/**
	 * 查询客户群模板列表出参处理
	* @date: 2016-9-14 
	* @author: xiongxq
	* @Title: queryCustGroupTempListOutParam 
	* @param inMap
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCustGroupTempListOutParam(Map<String,Object> inMap);
	
	/**
	 * 查询客户群明细文件列表入参处理
	* @date: 2016-10-30 
	* @author: tangaq
	* @title: queryCustGroupDetailFileListInParam 
	* @param InDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryCustGroupDetailFileListInParam(InDTO inDTO) throws StrategyError;
	
	/**
	 * 查询客户群明细文件列表出参处理
	* @date: 2016-10-30 
	* @author: tangaq
	* @title: queryCustGroupDetailFileListOutParam 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryCustGroupDetailFileListOutParam(Map<String,Object> inParam);

	/**
	 * 查询标签码表入参
	* @date: 2017-3-4 
	* @author: yuanchun
	* @title: queryLabelCodeNameListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryLabelCodeNameListInParam(InDTO inDTO);
	/**
	 * 查询标签码表出参
	* @date: 2017-3-4 
	* @author: yuanchun
	* @title: queryLabelCodeNameListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryLabelCodeNameListOutParam(Map<String, Object> outParam);
	
	
	
	/**
	 * 根据标签元素查询标签值入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryLabelValueByCodeInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryLabelValueByCodeInParam(InDTO inDTO);

	/**
	 * 根据标签元素查询标签值出参转换
	* @date: 2016-9-12 
	* @author: xiongxq
	* @Title: queryLabelValueByCodeOutParam 
	* @param inMap
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryLabelValueByCodeOutParam(Map<String,Object> inMap);

	/**
	 * 批量删除号码入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: removeBatchNoFromCustGroupInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeBatchNoFromCustGroupInParam(InDTO inDTO);

	/**
	 * 批量删除号码出参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: removeBatchNoFromCustGroupOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeBatchNoFromCustGroupOutParam();

	/**
	 * 根据id删除客户群入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: removeCustGroupByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeCustGroupByIdInParam(InDTO inDTO);

	/**
	 * 根据id删除客户群出参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupByIdOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeCustGroupByIdOutParam(Map<String,Object> outParam);
	
	/**
	 * 根据子客户群ID删除父客户群与子客户的关系入参处理
	* @date: 2016-11-28 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupRelationByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeCustGroupRelationByIdInParam(InDTO inDTO);
	
	/**
	 * 根据子客户群ID删除父客户群与子客户的关系出参处理
	* @date: 2016-11-28 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupRelationByIdOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeCustGroupRelationByIdOutParam();
	
	/**
	 * 删除单个号码入参转换
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: removeSingleNoFromCustGroupInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeSingleNoFromCustGroupInParam(InDTO inDTO);

	/**
	 * 删除单个号码出参转换
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: removeSingleNoFromCustGroupOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeSingleNoFromCustGroupOutParam();
	
	/**
	 * 保存目标客户群信息
	* @date: 2016-9-22 
	* @author: xiongxq
	* @Title: saveCustGroupInParam
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveCustGroupInParam(InDTO inDTO);

	/**
	 * 保存目标客户群信息
	* @date: 2016-10-5 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveCustGroupOutParam(Map<String, Object> outParam);
	
	/**
	 * 保存目标客户群与子客户群关系入参处理
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupRelationInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveCustGroupRelationInParam(InDTO inDTO);
	
	/**
	 * 保存目标客户群与子客户群关系出参处理
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupRelationOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveCustGroupRelationOutParam();



}