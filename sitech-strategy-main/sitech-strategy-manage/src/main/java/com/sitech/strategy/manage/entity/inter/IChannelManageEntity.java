package com.sitech.strategy.manage.entity.inter;

import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.StrategyError;

/**
 * 渠道实体
* @date: 2016-9-5 
* @author: sunliang
* @title: IChannelManageEntity 
* @version 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IChannelManageEntity {

	/**
	 * 查询渠道列表
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryChannelList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> queryChannelList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询运营位
	* @date: 2016-9-5 
	* @author: xiongxq
	* @title: queryPositionListByChannel 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryPositionListByChannel(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询运营位列表
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: queryPositionList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryPositionList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询运营位属性列表
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: queryPositionAttrList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryPositionAttrList(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 查询渠道显示列表
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: queryChannelShowList 
	* @param inParam
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Map<String,Object> queryChannelShowList(Map<String,Object> inParam) throws StrategyError;

	/** 删除客户群渠道
	* @date: 2016-10-17 
	* @author: wangpei
	* @title: removeCustGroupChannelAndDetail 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void removeCustGroupChannelAndDetail(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 删除渠道显示
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: removeChannelShow 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removeChannelShow(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 移除运营位
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: removePosition 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removePosition(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 移除运营位属性信息
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: removePositionAttr 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void removePositionAttr(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 新增渠道
	* @date: 2016-9-27 
	* @author: fangyuan_crmpd
	* @title: saveChannel 
	* @param inParam
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveChannel(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 新增渠道显示
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: saveChannelShow 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void saveChannelShow(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 增加运营位
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: addPosition 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void savePosition(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 保存运营位属性信息
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: savePositionAttr 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void savePositionAttr(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 更新渠道信息
	* @date: 2016-11-17 
	* @author: tangaq
	* @title: updateChannelInfo 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateChannelInfo(Map<String,Object> inParam) throws StrategyError;

	/**
	 * 更新渠道显示
	* @date: 2016-10-18 
	* @author: fangyuan_crmpd
	* @title: updateChannelShow 
	* @param inParam
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updateChannelShow(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 更新运营位信息
	* @date: 2016-10-19 
	* @author: wangth
	* @Title: updatePosition 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updatePosition(Map<String,Object> inParam) throws StrategyError;
	
	/**
	 * 更新运营位属性信息
	* @date: 2016-10-31 
	* @author: wangth
	* @Title: updatePosition 
	* @param inParam
	* @throws StrategyError 
	* @version 1.0 
	* @Description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void updatePositionAttr(Map<String,Object> inParam) throws StrategyError;
}
