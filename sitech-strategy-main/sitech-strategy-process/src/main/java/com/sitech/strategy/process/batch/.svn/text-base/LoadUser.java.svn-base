package com.sitech.strategy.process.batch;

import java.util.HashMap;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.base.BaseProcessBatch;
import com.sitech.strategy.process.entity.inter.IUserProcessEntity;

/**
 * 加载用户信息(红黑名单)
 */
public class LoadUser extends BaseProcessBatch{

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
	public static void handleGreyUser() {
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_ALL);
		IUserProcessEntity userProcessEntity = (IUserProcessEntity) springBeanFactory.getBean("userProcessEntity");
		try {
			userProcessEntity.handleGreyUser();
		} catch (StrategyError e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		String type = args[0];
		if("handleGreyUser".equals(type)){
			handleGreyUser();
		}
	}
}
