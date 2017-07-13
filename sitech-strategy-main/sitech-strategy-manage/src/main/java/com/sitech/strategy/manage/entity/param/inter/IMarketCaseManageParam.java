package com.sitech.strategy.manage.entity.param.inter;

import java.util.List;
import java.util.Map;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.strategy.common.pojo.inter.IMarketCaseDetailPojo;
import com.sitech.strategy.manage.base.basedto.StandardOutDTO;

/**
 * 出入参数大小写转换接口
* @date: 2016-9-14 
* @author: tangaq
* @title: IMarketCaseManageParam 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IMarketCaseManageParam {
	
	/**
	 * 权限下放入参处理
	* @date: 2016-10-11 
	* @author: fangyuan_crmpd
	* @title: assignMarketCasePermissionByIdOutParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> assignMarketCasePermissionByIdInParam(InDTO inDTO);
	
	/**
	 * 权限下放出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: assignMarketCasePermissionByIdOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO assignMarketCasePermissionByIdOutParam();
	/**
	 * 根据营销案名称查询营销案信息入参处理
	* @date: 2017-3-7 
	* @author: yuanliang
	* @title: queryMarketCaseIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseBasicByNameInParam(InDTO inDTO);
	/**
	 * 根据营销案名称查询营销案信息出参处理
	* @date: 2017-3-7 
	* @author: yuanliang
	* @title: queryMarketCaseByNameOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryMarketCaseBasicByNameOutParam(List<Map<String,Object>> outParam);
	/**
	 * 查询客户群Id入参处理
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: queryMarketCaseIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseIdInParam(InDTO inDTO);

	/**
	 * 查询客户群Id出参处理
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: queryMarketCaseIdOutParam
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryMarketCaseIdOutParam(Map<String,Object> outParam);
	
	/**
	 * 查询营销案详细信息入参
	* @date: 2017-3-3 
	* @author: yuanliang
	* @title: queryMarketCaseDetailListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseDetailListInParam(InDTO inDTO);
	/**
	 * 查询营销案详细信息出参
	* @date: 2017-3-3 
	* @author: yuanliang
	* @title: queryMarketCaseDetailListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryMarketCaseDetailListOutParam(List<IMarketCaseDetailPojo> outParam);

	/**
	 * 查询营销案模板列表入参处理
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: queryMarketCaseTempListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseTempListInParam(InDTO inDTO);
	
	/**
	 * 查询营销案模板列表出参处理
	* @date: 2016-9-13 
	* @author: fangyuan_crmpd
	* @title: queryMarketCaseTempListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryMarketCaseTempListOutParam(Map<String,Object> outParam);
	
	
	/**
	 * 查询营销案列表入参处理
	* @date: 2016-10-11 
	* @author: fangyuan_crmpd
	* @title: queryMarketCaseListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseListInParam(InDTO inDTO); 
	
	/**
	 * 查询营销案列表出参处理
	* @date: 2016-9-13 
	* @author: tangaq
	* @title: queryMarketCaseListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryMarketCaseListOutParam(Map<String,Object> outParam);
	
	/**
	 * 根据权限查询营销案列表入参处理
	* @date: 2017-1-5 
	* @author: yuanchun
	* @title: queryMarketCaseListByPermissionInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String, Object> queryMarketCaseListByPermissionInParam(InDTO inDTO);

	/**
	 * 根据权限查询营销案列表出参处理
	* @date: 2017-1-5 
	* @author: yuanchun
	* @title: queryMarketCaseListByPermissionOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryMarketCaseListByPermissionOutParam(Map<String, Object> outParam);
	
	/**
	 * 营销案详细入参处理
	* @date: 2016-10-11 
	* @author: fangyuan_crmpd
	* @title: queryMarketCaseInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseInParam(InDTO inDTO);
	
	/**
	 * 营销案详细出参处理
	* @date: 2016-9-15 
	* @author: tangaq
	* @title: queryMarketCaseOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryMarketCaseOutParam(Map<String,Object> outParam);
		
	/**
	 * 根据ID查询营销案、审批详细信息入参处理
	* @date: 2016-10-1 
	* @author: tangaq
	* @title: queryMarketCaseAuditDetailByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryMarketCaseAuditDetailByIdInParam(InDTO inDTO);
	
	/**
	 * 根据ID查询营销案、审批详细信息出参处理
	* @date: 2016-10-1 
	* @author: tangaq
	* @title: queryMarketCaseAuditDetailByIdOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO queryMarketCaseAuditDetailByIdOutParam(Map<String,Object> outParam);
	
	/** 产品列表查询入参处理
	* @date: 2016-10-12 
	* @author: wangpei
	* @title: queryProductListInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> queryProductListInParam(InDTO inDTO);
	
	/** 产品列表查询出餐处理
	* @date: 2016-10-12 
	* @author: wangpei
	* @title: queryProductListOutParam 
	* @param outParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public StandardOutDTO queryProductListOutParam(Map<String,Object> outParam);

	/**
	 * 删除营销案入参处理
	* @date: 2016-10-11 
	* @author: fangyuan_crmpd
	* @title: removeMarketCaseByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> removeMarketCaseByIdInParam(InDTO inDTO);
	
	/**
	 * 删除营销案出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: removeMarketCaseByIdOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO removeMarketCaseByIdOutParam();
	
	/** 删除客户群关系入参处理
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: removeMarketCaseCustGroupRelByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String,Object> removeMarketCaseCustGroupRelByIdInParam(InDTO inDTO);

	/**
	 * 暂停和重新启动营销案入参处理
	* @date: 2016-10-11 
	* @author: fangyuan_crmpd
	* @title: restartAndPauseMarketCaseByIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> restartAndPauseMarketCaseByIdInParam(InDTO inDTO); 
	
	/**
	 * 暂停和重新启动营销案出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: restartAndPauseMarketCaseByIdOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO restartAndPauseMarketCaseByIdOutParam();
	
	/** 保存营销案基本信息入参处理
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseBasicInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String, Object> saveMarketCaseBasicInParam(InDTO inDTO);
	
	/** 保存营销案基本信息出参处理
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseBasicOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public StandardOutDTO saveMarketCaseBasicOutParam(Map<String, Object> outParam);
	
	/** 保存营销案客户群关系入参处理
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseCustGroupRelInParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public Map<String, Object> saveMarketCaseCustGroupRelInParam(InDTO inDTO);
	
	/** 保存营销案客户群关系出参处理
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseCustGroupRelOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public StandardOutDTO saveMarketCaseCustGroupRelOutParam(Map<String, Object> out);
	
	/**
	 * 保存营销案详细信息入参处理
	* @date: 2016-9-14 
	* @author: fangyuan_crmpd
	* @title: saveMarketCaseDetailInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	 * @throws ParseException 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveMarketCaseDetailInParam(InDTO inDTO);
	
	/**
	 * 保存营销案详细信息出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: saveMarketCaseDetailOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveMarketCaseDetailOutParam(Map<String,Object> inMap);
	 
	/**
	 * 根据营销案ID保存营销案模板入参处理
	* @date: 2016-10-11 
	* @author: fangyuan_crmpd
	* @title: saveMarketCaseTempByMCIdInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> saveMarketCaseTempByMCIdInParam(InDTO inDTO);
	
	/**
	 * 根据营销案ID保存营销案模板出参处理
	* @date: 2016-10-5 
	* @author: tangaq
	* @title: saveMarketCaseTempByMCIdOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO saveMarketCaseTempByMCIdOutParam();
	
	/**
	 * 根据模板修改营销案详细信息入参处理
	* @date: 2016-11-15 
	* @author: tangaq
	* @title: updateMarketCaseByTemplateInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> updateMarketCaseByTemplateInParam(InDTO inDTO);
	
	/**
	 * 根据模板修改营销案详细信息出参处理
	* @date: 2016-11-15 
	* @author: tangaq
	* @title: updateMarketCaseByTemplateOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO updateMarketCaseByTemplateOutParam();
	
	/**
	 * 修改营销案状态入参处理
	* @date: 2016-12-19 
	* @author: tangaq
	* @title: updateMarketCaseStatusInParam 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> updateMarketCaseStatusInParam(InDTO inDTO);
	
	/**
	 * 修改营销案状态出参处理
	* @date: 2016-12-19 
	* @author: tangaq
	* @title: updateMarketCaseStatusOutParam 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public StandardOutDTO updateMarketCaseStatusOutParam();

	

}
