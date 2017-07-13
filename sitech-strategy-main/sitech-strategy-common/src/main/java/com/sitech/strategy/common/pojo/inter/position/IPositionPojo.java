package com.sitech.strategy.common.pojo.inter.position;

/**
 * 运营位pojo
* @date: 2017-2-23 
* @author: sunliang 
* @title: IPositionPojo 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface IPositionPojo {

	/**
	 * 是否赠费运营位
	* @date: 2017-2-23 
	* @author: sunliang 
	* @title: isGiveFeePositon 
	* @param positionId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean isGiveFeePositon(String positionId);
	
	/**
	 * 是否赠套餐运营位
	* @date: 2017-2-23 
	* @author: sunliang 
	* @title: isGiveProdPosition 
	* @param positionId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean isGiveProdPosition(String positionId);
	
	/**
	 * 是否推荐短信运营位
	* @date: 2017-2-27
	* @author: luogj 
	* @title: isRecommendMsgPosition 
	* @param positionId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public boolean isRecommendMsgPosition(String positionId);	
}
