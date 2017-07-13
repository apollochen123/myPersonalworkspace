package com.sitech.strategy.manage.service.jcf.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 营销案
* @date: 2016-9-5 
* @author: sunliang
* @title: IMarketCaseManageService 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IMarketCaseManageService {
	
	/**
	 * 权限下放
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: assignMarketCasePermissionById 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO assignMarketCasePermissionById(InDTO inDTO); 
	/**
	 * 根据营销案名称查询营销案信息
	* @date: 2017-3-7 
	* @author: yuanliang
	* @title: queryMarketCaseByName 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMarketCaseBasicByName(InDTO inDTO);
	/**
	 * 根据ID查询营销案详细信息
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryMarketCaseDetailById 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMarketCaseDetailById(InDTO inDTO);
	
	/**
	 * 查询营销案详细信息
	* @date: 2017-3-3 
	* @author: yuanliang
	* @title: queryMarketCaseDetailList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMarketCaseDetailList(InDTO inDTO); 
	
	/**
	 * 查询营销案列表
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryMarketCaseList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMarketCaseList(InDTO inDTO); 
		
	/**
	 * 根据权限查询营销案列表
	* @date: 2017-1-5 
	* @author: yuanchun
	* @title: queryMarketCaseListByPermission 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMarketCaseListByPermission(InDTO inDTO);
	
	/**
	 * 查询营销案模板列表
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryMarketCaseTempList 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMarketCaseTempList(InDTO inDTO); 
	
	/**
	 * 根据ID查询营销案、审批详细信息
	* @date: 2016-10-1 
	* @author: tangaq
	* @title: queryMarketCaseAuditDetailById 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO queryMarketCaseAuditDetailById(InDTO inDTO);
	
	/** 查询产品列表(销售品，定价组，补贴规则)
	* @date: 2016-10-12 
	* @author: wangpei
	* @title: queryProductList 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public OutDTO queryProductList(InDTO inDTO);
			
	/**
	 * 删除营销案
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: removeMarketCaseById 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO removeMarketCaseById(InDTO inDTO); 
	
	/** 更具关系Id删除营销案与客户群关系及明细
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: removeMarketCaseCustGroupRelAndDetailByRelId 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public OutDTO removeMarketCaseCustGroupRelAndDetailByRelId(InDTO inDTO); 

	/**
	 * 暂停和重新启动营销案
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: restartAndPauseMarketCaseById 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO restartAndPauseMarketCaseById(InDTO inDTO); 

	/** 保存营销案基本信息
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseBasic 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public OutDTO saveMarketCaseBasic(InDTO inDTO); 
	
	/** 保存营销案和客户群关系
	* @date: 2016-10-14 
	* @author: wangpei
	* @title: saveMarketCaseCustGroupRel 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public OutDTO saveMarketCaseCustGroupRel(InDTO inDTO); 
	
	/**
	 * 保存营销案详细信息
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: saveMarketCaseDetail 
	* @param inDTO
	* @return 
	* @exception:
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveMarketCaseDetail(InDTO inDTO); 
	
	/**
	 * 根据模板修改营销案详细信息
	* @date: 2016-11-15 
	* @author: tangaq
	* @title: updateMarketCaseDetailByTemplate 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateMarketCaseDetailByTemplate(InDTO inDTO);
	
	/**
	 * 修改营销案状态
	* @date: 2016-12-19 
	* @author: tangaq
	* @title: updateMarketCaseStatus 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO updateMarketCaseStatus(InDTO inDTO);

}
