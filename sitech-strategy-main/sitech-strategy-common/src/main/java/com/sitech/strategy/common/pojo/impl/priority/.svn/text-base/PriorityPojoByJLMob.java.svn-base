package com.sitech.strategy.common.pojo.impl.priority;

import java.io.Serializable;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.pojo.inter.priority.IPriorityPojo;

/**
 * 优先级pojo
* @date: 2017-2-28 
* @author: sunliang 
* @title: PriorityPojoByJLMob 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class PriorityPojoByJLMob extends BaseClass implements IPriorityPojo ,Serializable{

	/**
	 * 
	* @date: 2017-2-28 
	* @author: sunliang 
	* @title: getDefaultPriority 
	* @param object
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public String getDefaultPriority(Object object) {
		return -Double.valueOf((String)object) + "";
	}

}
