package com.sitech.strategy.common.utils;

/**
 * 反射工具类
* @date: 2016-9-5 
* @author: sunliang 
* @title: ClassUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ClassUtil {

	/**
	 * 从指定配置文件中，反射生成指定类的实现
	* @date: 2016-9-5 
	* @author: sunliang 
	* @title: getClassObject 
	* @param propertiesFileName
	* @param className
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static Object getClassObject(String propertiesFileName,String className){
		Object ob = null;
		try {
			String strClass = PropertiesUtil.getProperty(propertiesFileName, className);
			Class<?> cla = Class.forName(strClass);
			ob = (Object)cla.newInstance();	
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return ob;
	}
}
