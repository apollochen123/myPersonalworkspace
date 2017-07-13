package com.sitech.strategy.recommend.base.basedto;

import com.sitech.jcfx.dt.MBean;
import com.sitech.jcfx.dt.in.InDTO;

/**
 * 标准输入DTO
* @date: 2016-9-5 
* @author: sunliang 
* @title: StandardInDTO 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class StandardInDTO extends InDTO{

	private static final long serialVersionUID = 8011451429059378568L;
	/**
	 * MBean存储
	 */
	private MBean bean;
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: decode 
	* @param arg0 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void decode(MBean arg0){
		this.bean = arg0;
	}

	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getBean 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public MBean getBean() {
		return bean;
	}
}
