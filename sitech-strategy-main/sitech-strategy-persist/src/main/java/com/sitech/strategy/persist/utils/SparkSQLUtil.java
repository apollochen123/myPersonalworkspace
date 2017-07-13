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
 * sparkSQL客户端工具类
* @date: 2016-9-11 
* @author: sunliang 
* @title: SparkSQLUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class SparkSQLUtil extends BaseClass{
	
	/**
	 * Configuration对象
	 */
	private static Configuration conf;
	/**
	 * Connection对象
	 */
	private static Connection connection;
	/**
	 * Statement
	 */
	private static Statement statement;
	/**
	 * SparkSQLUtil实例对象
	 */
	private static SparkSQLUtil instance = new SparkSQLUtil();
	
	/**
	 * 私有沟造方法
	* @date: 2016-9-14 
	* @author: sunliang  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private SparkSQLUtil(){
	}
	
	/**
	 * 获取SparkSQLUtil对象实例
	* @date: 2016-9-14 
	* @author: sunliang 
	* @title: getInstance 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static SparkSQLUtil getInstance() {
		return instance;
	}
	
	/**
	 * 初始化静态块
	 */
	static {
		String isLoad = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARK, "spark.isLoad");
		
		if(Const.TRUE_LOWER.equals(isLoad)){
			System.out.println("=============welcome SparkSQLUtil=============");
			String isKerberos = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_CONF, "security.kerberos");
			System.out.println("=============isKerberos=============" + isKerberos);
			conf = new Configuration();
			
			if(Const.TRUE_LOWER.equals(isKerberos)){
				identifySparkSqlKerberos();
			}
			
			//连接spark sql
			connecSparkSql();
			
			System.out.println("=============goodbye SparkSQLUtil=============");
		} else {
			System.out.println("=============not load SparkSQLUtil=============");
		}

	}
	
	/**
	 * 验证spark sql kerberos
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: identifySparkSqlKerberos  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected static void identifySparkSqlKerberos() {
		
		String hadoopAuthStr = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARK, "kerberos.hadoop.security.authentication");
		String keytab = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARK, "kerberos.keytab");
		String principal = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARK, "kerberos.principal");
		String krb5Path = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_SPARK, "kerberos.krb5Path");
		
		System.out.println("===========identifySparkSqlKerberos.hadoopAuthStr==========" + hadoopAuthStr);
		System.out.println("===========identifySparkSqlKerberos.keytab=================" + keytab);
		System.out.println("===========identifySparkSqlKerberos.principal==============" + principal);
		System.out.println("===========identifySparkSqlKerberos.krb5Path===============" + krb5Path);
		
		System.setProperty("java.security.krb5.conf", krb5Path);
		conf.set("hadoop.security.authentication", "Kerberos");
		
		System.out.println("============begin to test spark sql kerberos==============");
		
		UserGroupInformation.setConfiguration(conf);
		try {
			UserGroupInformation.loginUserFromKeytab(principal, keytab);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("============end to test spark sql kerberos================");
		
	}
	
	/**
	 * 连接spark sql
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: connecSparkSql  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected static void connecSparkSql() {
		
		String systemAppType = PropertiesUtil.getProperty(
				Const.PROPERTIES_FILE_NAME_CONF, "SYSTEM_APP_TYPE").equals("${sys}") ? Const.SYSTEM_APP_TYPE_APP
				: PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_CONF,
						"SYSTEM_APP_TYPE");
		
		if(Const.SYSTEM_APP_TYPE_APP.equals(systemAppType) || Const.SYSTEM_APP_TYPE_SPARKSHELL.equals(systemAppType)){
			
			String driver = PropertiesUtil.getProperty("spark.properties","spark.sparksql.jdbc.driver");
			String jdbc = PropertiesUtil.getProperty("spark.properties","spark.sparksql.jdbc.url");
			String userName = PropertiesUtil.getProperty("spark.properties","spark.sparksql.jdbc.userName");
			String password = PropertiesUtil.getProperty("spark.properties","spark.sparksql.jdbc.password");
			
			System.out.println("=============connecSparkSql.driver=============" + driver);
			System.out.println("=============connecSparkSql.jdbc=============" + jdbc);
			System.out.println("=============connecSparkSql.userName=============" + userName);
			System.out.println("=============connecSparkSql.password=============" + password);
			
			System.out.println("========begin to connect spark sql=======");
			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(jdbc,userName,password);
				statement = connection.createStatement();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} 
			System.out.println("========end to connect spark sql=======");
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
	* @date: 2016-10-11 
	* @author: sunliang 
	* @title: executeQuerySQL 
	* @param sql
	* @return
	* @throws StrategyError 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public List<Map<String,Object>> executeQuerySQL(String sql) throws StrategyError{
		log.debug("==============sql================", sql);
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
			System.out.println("=============SparkSQLUtil.executeQuerySQL.resultList=============" + resultList);
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new StrategyError("","","");
		}
		
		return resultList;
		
	}
	
	/**
	 * 测试spark sql jdbc 查询
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: testSparkJDBCQuery 
	* @param sparkSQLUtil 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private static void testSparkJDBCQuery(SparkSQLUtil sparkSQLUtil) {
		try {
			sparkSQLUtil.executeSql("use clzxdb");
			sparkSQLUtil.executeQuerySQL("select TEST1,TEST2 from RM_HIVETEST_INFO");
			sparkSQLUtil.executeQuerySQL("select TEST1,TEST2 from RM_HIVETEST_HBASE_INFO");
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
		System.out.println("=============spark sql test start=============");
		SparkSQLUtil sparkSQLUtil = getInstance();
		testSparkJDBCQuery(sparkSQLUtil);
		System.out.println("=============spark sql test end=============");
	}

}
