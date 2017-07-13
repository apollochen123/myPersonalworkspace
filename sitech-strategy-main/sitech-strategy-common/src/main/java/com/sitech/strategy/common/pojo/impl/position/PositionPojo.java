package com.sitech.strategy.common.pojo.impl.position;

import java.io.Serializable;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.position.IPositionPojo;

/**
 * 运营位pojo
* @date: 2017-2-23 
* @author: sunliang 
* @title: PositionPojo 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class PositionPojo extends BaseClass implements IPositionPojo,Serializable {

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
	@Override
	public boolean isGiveFeePositon(String positionId) {
		if("POSITION_11_01".equals(positionId)){
			return true;
		}else{
			return false;
		}
	}

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
	@Override
	public boolean isGiveProdPosition(String positionId) {
		if("POSITION_11_02".equals(positionId)){
			return true;
		}else{
			return false;
		}
	}

	/**
	 * 是否推荐短信运营位
	* @date: 2017年2月27日 
	* @author: luogj 
	* @title: isRecommendMsgPosition 
	* @param positionId
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public boolean isRecommendMsgPosition (String positionId) {
		if("POSITION_11_03".equals(positionId)){
			return true;
		}else{
			return false;
		}
	}
	
}
