package com.sitech.strategy.process.entity.impl;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.FileUtil;
import com.sitech.strategy.common.utils.PropertiesUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.core.objectville.inter.IUser;
import com.sitech.strategy.persist.capacity.proxy.IDataUpdater;
import com.sitech.strategy.process.base.BaseProcessEntity;
import com.sitech.strategy.process.entity.inter.IUserProcessEntity;

/**
 * 用户实体
* @date: 2016-9-5 
* @author: sunliang 
* @title: UserEntity 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class UserProcessEntity extends BaseProcessEntity implements IUserProcessEntity {
	
	/**
	 * 用户更新对象
	 */
	private IDataUpdater.IUserUpdater userUpdater;
	
	private IUser user;
	
	/**
	 * 
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: setUserUpdater 
	* @param userUpdater 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUserUpdater(IDataUpdater.IUserUpdater userUpdater) {
		this.userUpdater = userUpdater;
	}
	
	/**
	 * 
	* @date: 2016-12-6 
	* @author: zhangjj_crmpd
	* @title: setUser 
	* @param user 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setUser(IUser user) {
		this.user = user;
	}



	/**
	 * 处理灰名单用户
	* @date: 2016-12-5 
	* @author: zhangjj_crmpd
	* @title: handleGreyUser 
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	@Override
	public void handleGreyUser() throws StrategyError {
		user.handleGreyUser();
	}


}
