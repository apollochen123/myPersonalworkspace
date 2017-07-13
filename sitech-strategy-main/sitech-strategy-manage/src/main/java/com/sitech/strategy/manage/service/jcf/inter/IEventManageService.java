package com.sitech.strategy.manage.service.jcf.inter;

import com.sitech.jcfx.dt.in.InDTO;
import com.sitech.jcfx.dt.out.OutDTO;

/**
 * 事件
* @date: 2016-9-5 
* @author: sunliang
* @title: IEventManageService 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IEventManageService {
	

	/**
	 * 保存事件明细信息
	* @date: 2017-2-14 
	* @author:liuqi
	* @title: saveEventDetailInfo 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO saveEventDetailInfo(InDTO inDTO);
    /**
     * 删除时间和关系
    * @date: 2017-3-30 
    * @author: chenhao
    * @title: removeMarketCaseEventRelAndDetailByRelId 
    * @param inDTO
    * @return 
    * @exception: 
    * @version: 1.0 
    * @description: 
    * update_version: update_date: update_author: update_note:
     */
	/**
	 * 删除事件关系，缴费事件删除事件详情和事件表
	* @date: 2017-3-30 
	* @author: chenhao
	* @title: removeMarketCaseEventRelAndDetailByRelId 
	* @param inDTO
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public OutDTO removeMarketCaseEventRelAndDetailByRelId(InDTO inDTO);
}
