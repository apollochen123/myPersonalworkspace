package com.sitech.strategy.manage.service.jcf.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 目标客户群
* @date: 2016-9-5 
* @author: sunliang
* @title: ICustGroupManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ICustGroupManageService {
	
    /**
     * 添加批量号码到目标客户群
    * @date: 2016-9-5 
    * @author: tangaq
    * @title: addBatchNoToCustGroup 
    * @param inDTO
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public OutDTO addBatchNoToCustGroup(InDTO inDTO);

	/**
	 * 添加单个号码到目标客户群
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: addSingleNoToCustGroup 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO addSingleNoToCustGroup(InDTO inDTO);
	
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
	public OutDTO createLabelCustGroupDetailFile(InDTO inDTO);	

	/**
	 * 根据ID查询客户群信息
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupById 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryCustGroupById(InDTO inDTO);
	
	/**
	 * 查询符合标签的客户群数量
	* @date: 2017-1-24 
	* @author: zhangjj_crmpd
	* @title: queryCustGroupCountByUserLabel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryCustGroupCountByUserLabel(InDTO inDTO);
	
	/**
	 * 查询客户群明细文件列表
	* @date: 2016-10-30 
	* @author: tangaq
	* @title: queryCustGroupDetailFileList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryCustGroupDetailFileList(InDTO inDTO);
	
	/**
	 * 查询客户群处理记录
	* @date: 2017-3-7 
	* @author: tangaq
	* @title: queryCustGroupHandleRecord 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryCustGroupHandleRecord(InDTO inDTO);

	/**
	 * 查询客户群标签元素
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupLabelItem 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryCustGroupLabelItem(InDTO inDTO);
	
	/**
	 * 查询客户群列表
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryCustGroupList(InDTO inDTO);
	
	/**
	 * 根据客户群ID查询客户群关系列表
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: queryCustGroupRelationListByCustGroupId 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryCustGroupRelationListByCustGroupId(InDTO inDTO);

	/**
	 * 查询客户群模板列表
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryCustGroupTempList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryCustGroupTempList(InDTO inDTO);
	
	/**
	 * 查询标签码表
	* @date: 2017-3-4 
	* @author: yuanchun
	* @title: queryLabelCodeNameList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryLabelCodeNameList(InDTO inDTO);
	
	/**
	 * 根据标签元素代码查询标签元素值
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: queryLabelValueByCode 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryLabelValueByCode(InDTO inDTO);

	
	/**
	 * 批量删除号码
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: removeBatchNoFromCustGroup 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO removeBatchNoFromCustGroup(InDTO inDTO);

	/**
	 * 根据id删除客户群
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: removeCustGroupById 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO removeCustGroupById(InDTO inDTO);
	
	/**
	 * 根据子客户群ID删除父客户群与子客户的关系
	* @date: 2016-11-28 
	* @author: fangyuan_crmpd
	* @title: removeCustGroupRelationById 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO removeCustGroupRelationById(InDTO inDTO);

    /**
     * 删除单个号码
    * @date: 2016-9-5 
    * @author: tangaq
    * @title: removeSingleNoFromCustGroup 
    * @param inDTO
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	public OutDTO removeSingleNoFromCustGroup(InDTO inDTO);
	
	/**
	 * 保存目标客户群信息
	* @date: 2016-9-5 
	* @author: tangaq
	* @title: saveCustGroup 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveCustGroup(InDTO inDTO);
	
	/**
	 * 保存目标客户群与子客户群关系
	* @date: 2016-11-24 
	* @author: fangyuan_crmpd
	* @title: saveCustGroupRelation 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveCustGroupRelation(InDTO inDTO);

	/**
	 * 查询客户群二次过滤标签
	* @date: 2017-4-7 
	* @author: chenhao
	* @title: queryLabelFormulaRestrictCountById 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryLabelFormulaRestrictCountById(InDTO inDTO);
}
