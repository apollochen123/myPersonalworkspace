package com.sitech.strategy.persist.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.UserGroupInformation;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.PropertiesUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.base.BaseClass;

/**
 * hive客户端工作类
* @date: 2016-9-11 
* @author: sunliang 
* @title: HiveUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class HiveUtil extends BaseClass{
	
	/**
	 * Configuration对象
	 */
	private static Configuration conf;
	/**
	 * Connection对象
	 */
	private static Connection connection;
	/**
	 * Statement对象
	 */
	private static Statement statement;
	/**
	 * HiveUtil实例对象
	 */
	private static HiveUtil instance = new HiveUtil();
	
	/**
	 * 私有沟造方法
	* @date: 2016-9-14 
	* @author: sunliang  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private HiveUtil(){
	}
	
	/**
	 * 获取HiveUtil对象实例
	* @date: 2016-9-14 
	* @author: sunliang 
	* @title: getInstance 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static HiveUtil getInstance() {
		return instance;
	}
	
	/**
	 * 初始化静态块
	 */
	static {
		
		String isLoad = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HIVE, "hive.isLoad");
		
		if(Const.TRUE_LOWER.equals(isLoad)){
			System.out.println("=============welcome HiveUtil=============");
			String isKerberos = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_CONF, "security.kerberos");
			System.out.println("=============isKerberos=============" + isKerberos);
			conf = new Configuration();
			
			if(Const.TRUE_LOWER.equals(isKerberos)){
				identifyHiveKerberos();
			}
			
			//连接hive
			connectHive();
			
			System.out.println("=============goodbye HiveUtil=============");
		} else {
			System.out.println("=============not load HiveUtil=============");
		}
		
	}
	
	/**
	 * 验证hive kerberos
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: identifyHiveKerberos  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected static void identifyHiveKerberos() {
		
		String hadoopAuthStr = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HIVE, "kerberos.hadoop.security.authentication");
		String keytab = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HIVE, "kerberos.keytab");
		String principal = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HIVE, "kerberos.principal");
		String krb5Path = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HIVE, "kerberos.krb5Path");
		
		System.out.println("===========identifyHiveKerberos.hadoopAuthStr==========" + hadoopAuthStr);
		System.out.println("===========identifyHiveKerberos.keytab=================" + keytab);
		System.out.println("===========identifyHiveKerberos.principal==============" + principal);
		System.out.println("===========identifyHiveKerberos.krb5Path===============" + krb5Path);
		
		System.setProperty("java.security.krb5.conf", krb5Path);
		conf.set("hadoop.security.authentication", hadoopAuthStr);
		
		System.out.println("============begin to test hive kerberos==============");
		
		UserGroupInformation.setConfiguration(conf);
		try {
			UserGroupInformation.loginUserFromKeytab(principal, keytab);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("============end to test hive kerberos================");
	}
	
	/**
	 * 连接hive
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: connectHive  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected static void connectHive() {
		
		String systemAppType = PropertiesUtil.getProperty(
				Const.PROPERTIES_FILE_NAME_CONF, "SYSTEM_APP_TYPE").equals("${sys}") ? Const.SYSTEM_APP_TYPE_APP
				: PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_CONF,
						"SYSTEM_APP_TYPE");
		
		if(Const.SYSTEM_APP_TYPE_APP.equals(systemAppType)){
			
			String driver = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HIVE,"hive.jdbc.driver");
			String jdbc = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HIVE,"hive.jdbc.url");
			String userName = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HIVE,"hive.jdbc.userName");
			String password = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HIVE,"hive.jdbc.password");
			
			System.out.println("=============connectHive.driver===============" + driver);
			System.out.println("=============connectHive.jdbc=================" + jdbc);
			System.out.println("=============connectHive.userName=============" + userName);
			System.out.println("=============connectHive.password=============" + password);
			
			System.out.println("========begin to connect hive=======");
			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(jdbc,userName,password);
				statement = connection.createStatement();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("========end to connect hive=======");
		}
	}
	
	/**
	 * 执行sql
	* @date: 2016-10-23 
	* @author: sunliang 
	* @title: executeSql 
	* @param sql
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void executeSql(String sql) throws StrategyError {
		try {
			statement.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 执行查询sql
	* @date: 2016-9-14 
	* @author: sunliang 
	* @title: executeQuerySQL 
	* @param sql
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> executeQuerySQL(String sql) throws StrategyError{
		
		System.out.println("=============stage 1=============");
		List<Map<String,Object>> resultList = new ArrayList<Map<String,Object>>();
		ResultSet res = null;
		ResultSetMetaData rsmd = null;
		int ncols = 0;
		System.out.println("=============stage 2=============");
		
		try {
			res = statement.executeQuery(sql);
			rsmd = res.getMetaData();
			ncols = rsmd.getColumnCount();
			System.out.println("=============stage 3=============");
			
			while(res.next()){
				Map<String,Object> resultItem = new HashMap<String,Object>();
				for(int i=0;i<ncols;i++){
					resultItem.put(rsmd.getColumnLabel(i+1), res.getString(i+1));
				}
				resultList.add(resultItem);
			}
			System.out.println("=============HiveUtil.executeQuerySQL.resultList=============" + resultList);
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new StrategyError("","","");
		}
		
		return resultList;
		
	}
	
	/**
	 * 测试hive jdbc 查询
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: testHiveJDBCQuery 
	* @param hiveUtil 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private static void testHiveJDBCQuery(HiveUtil hiveUtil) {
		try {
			hiveUtil.executeSql("use clzxdb");
			hiveUtil.executeQuerySQL("select TEST1,TEST2 from RM_HIVETEST_INFO");
			hiveUtil.executeQuerySQL("select TEST1,TEST2 from RM_HIVETEST_HBASE_INFO");
		} catch (StrategyError e) {
			e.printStackTrace();
		}

	}
	
	/**
	 * 测试方法入口
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: main 
	* @param args
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void main(String[] args) throws Exception{
		System.out.println("=============hive test start=============");
		HiveUtil hiveUtil = getInstance();
		testHiveJDBCQuery(hiveUtil);
		System.out.println("=============hive test end=============");
	}

}
