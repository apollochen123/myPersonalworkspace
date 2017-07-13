package com.sitech.strategy.common.pojo.inter;

/**
 * spark应用配置对象
* @date: 2016-9-28 
* @author: sunliang 
* @title: ISparkStreamingAppProp 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public interface ISparkAppProp {
	
	/**
	 * 设置spark应用参数
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: setSparkAppProp 
	* @param appName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSparkAppProp(String appName);

	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getAppName 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getAppName();
	
	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getZkQuorum 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getZkQuorum();
	
	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getTopic 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getTopic();
	
	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getGroup 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getGroup();
	
	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getDurations 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getDurations();
	
	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getProviderUrl 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getProviderUrl();

	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getInitialContextFactory 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getInitialContextFactory();

	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getUrlPkgPrefixes 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getUrlPkgPrefixes();

	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getConnectionFactory 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getConnectionFactory();

	/**
	 * 
	* @date: 2016-9-12 
	* @author: sunliang 
	* @title: getQueue 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getQueue();
	
	/**
	 * 
	* @date: 2017-4-1 
	* @author: sunliang
	* @title: getIdmmAddr 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getIdmmAddr();
	
	/**
	 * 
	* @date: 2017-4-1 
	* @author: sunliang
	* @title: getIdmmTopicId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getIdmmTopicId();
	
	/**
	 * 
	* @date: 2017-4-1 
	* @author: sunliang
	* @title: getIdmmClientId 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public String getIdmmClientId();
	
	/**
	 * 
	* @date: 2017-4-1 
	* @author: sunliang
	* @title: getIdmmProcessTime 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public int getIdmmProcessTime();

}
