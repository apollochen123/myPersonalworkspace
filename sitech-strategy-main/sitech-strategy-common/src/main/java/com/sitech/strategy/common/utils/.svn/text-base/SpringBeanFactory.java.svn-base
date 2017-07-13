package com.sitech.strategy.common.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * spring Bean工厂
* @date: 2016-9-13 
* @author: sunliang 
* @title: SpringBeanFactory 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class SpringBeanFactory {
	
	/**
	 * spring应用上下文
	 */
	private ApplicationContext factory;
	
	/**
	 * 
	* @date: 2016-9-26 
	* @author: sunliang 
	* @param beanFile 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public SpringBeanFactory(String[] beanFile){
		factory = new ClassPathXmlApplicationContext(beanFile);
	}
	
	/**
	 * 获取应用上下文
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: getFactory 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public ApplicationContext getFactory() {
		return factory;
	}
	
	/**
	 * 获取bean
	* @date: 2016-9-13 
	* @author: sunliang 
	* @title: getBean 
	* @param beanName
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public Object getBean(String beanName) {
		return factory.getBean(beanName);
	}

}
