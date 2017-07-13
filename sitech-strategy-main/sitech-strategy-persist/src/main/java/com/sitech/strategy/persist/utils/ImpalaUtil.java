package com.sitech.strategy.persist.utils;

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

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.PropertiesUtil;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.persist.base.BaseClass;

/**
 * impala客户端工具类
* @date: 2016-12-5 
* @author: sunliang 
* @title: ImpalaUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class ImpalaUtil extends BaseClass{
	
	/**
	 * Connection对象
	 */
	private static Connection connection;
	/**
	 * Statement对象
	 */
	private static Statement statement;
	/**
	 * ImpalaUtil实例对象
	 */
	private static ImpalaUtil instance = new ImpalaUtil();
	
	/**
	 * 私有沟造方法
	* @date: 2016-9-14 
	* @author: sunliang  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private ImpalaUtil(){
	}
	
	/**
	 * 获取ImpalaUtil对象实例
	* @date: 2016-9-14 
	* @author: sunliang 
	* @title: getInstance 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static ImpalaUtil getInstance() {
		return instance;
	}
	
	/**
	 * 初始化静态块
	 */
	static {
		
		String isLoad = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IMPALA, "impala.isLoad");
		
		if(Const.TRUE_LOWER.equals(isLoad)){
			System.out.println("=============welcome ImpalaUtil=============");
			//连接impala
			connectImpala();
			System.out.println("=============goodbye ImpalaUtil=============");
		} else {
			System.out.println("=============not load ImpalaUtil=============");
		}
		
	}
	
	/**
	 * 连接impala
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: connectImpala  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected static void connectImpala() {
		
		String systemAppType = PropertiesUtil.getProperty(
				Const.PROPERTIES_FILE_NAME_CONF, "SYSTEM_APP_TYPE").equals("${sys}") ? Const.SYSTEM_APP_TYPE_APP
				: PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_CONF,
						"SYSTEM_APP_TYPE");
		
		if(Const.SYSTEM_APP_TYPE_APP.equals(systemAppType)){
			
			String driver = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IMPALA,"impala.jdbc.driver");
			String jdbc = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IMPALA,"impala.jdbc.url");
			String userName = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IMPALA,"impala.jdbc.userName");
			String password = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IMPALA,"impala.jdbc.password");
			
			System.out.println("=============connectImpala.driver===============" + driver);
			System.out.println("=============connectImpala.jdbc=================" + jdbc);
			System.out.println("=============connectImpala.userName=============" + userName);
			System.out.println("=============connectImpala.password=============" + password);
			
			System.out.println("========begin to connect impala=======");
			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(jdbc,userName,password);
				statement = connection.createStatement();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("========end to connect impala=======");
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
		long start = System.currentTimeMillis();
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
			System.out.println("=============ImpalaUtil.executeQuerySQL.resultList.size=============" + resultList.size());
			
		} catch (SQLException e) {
			e.printStackTrace();
			throw new StrategyError("","","");
		}
		long end = System.currentTimeMillis();
		System.out.println("=============ImpalaUtil.executeQuerySQL.cost.time=============" + (end-start)+"ms");
		return resultList;
		
	}
	
	/**
	 * 测试hive jdbc 查询
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: testHiveJDBCQuery 
	* @param impalaUtil 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private static void testImpalaJDBCQuery(ImpalaUtil impalaUtil) {
		try {
			impalaUtil.executeSql("use clzxdb");
			
			System.out.println("==================50W ceshi=====================");
			long time1 = System.currentTimeMillis();
			//impalaUtil.executeQuerySQL("select TASK_ID, ACT_ID, ACT_NAME, CUST_NAME, PRD_INST_ID, CUST_ID, ACCT_ID, REGION_CODE, SERVICE_NBR, SM_NAME, START_DATE, END_DATE, ISNT_4GCARD, SERVICE_NO, SERVICE_NAME, STATUS_NAME, PHOTO_FLAG, CUST_GRADE, ENJOY_FLAG, BIND_FLAG, RISK_FLAG, NOTE, MKT_AREA_NAME, DEPT_NAME, DUTY_ZONE_NAME, GRID_NAME from RM_CHANNELTASK_INFO_HIVE_50 where  position_id = 'POSITION_10_01'  and status_code = '04'  and region_code = '551'  and edw_dept_id = '1072359'");
			//impalaUtil.executeQuerySQL("select REGION_CODE, CUST_ID, CUST_NAME, SERVICE_NBR, DUTY_ZONE_NAME, GRID_NAME, count(1) TASK_NUM from RM_CHANNELTASK_INFO_HIVE_50 where  position_id = 'POSITION_10_01'  and status_code = '04'  and region_code = '551' and edw_dept_id = '1072359'  group by REGION_CODE, CUST_ID, CUST_NAME, SERVICE_NBR, DUTY_ZONE_NAME, GRID_NAME");
			impalaUtil.executeQuerySQL("select ACT_ID, ACT_NAME, ACT_TYPE, BUSI_TYPE, START_DATE, END_DATE, ACT_DESC, count(1) TASK_NUM from RM_CHANNELTASK_INFO_HIVE_50 where position_id = 'POSITION_10_01'  and status_code = '04'  and region_code = '551' and edw_dept_id = '1072359'  group by ACT_ID, ACT_NAME, ACT_TYPE, BUSI_TYPE, START_DATE, END_DATE, ACT_DESC");
			long time2 = System.currentTimeMillis();
			System.out.println("==================50W ceshi=====================" + (time2-time1));
			
			long time3 = System.currentTimeMillis();
			System.out.println("==================100W ceshi=====================");
			//impalaUtil.executeQuerySQL("select TASK_ID, ACT_ID, ACT_NAME, CUST_NAME, PRD_INST_ID, CUST_ID, ACCT_ID, REGION_CODE, SERVICE_NBR, SM_NAME, START_DATE, END_DATE, ISNT_4GCARD, SERVICE_NO, SERVICE_NAME, STATUS_NAME, PHOTO_FLAG, CUST_GRADE, ENJOY_FLAG, BIND_FLAG, RISK_FLAG, NOTE, MKT_AREA_NAME, DEPT_NAME, DUTY_ZONE_NAME, GRID_NAME from RM_CHANNELTASK_INFO_HIVE where  position_id = 'POSITION_10_01'  and status_code = '04'  and region_code = '551'  and edw_dept_id = '1072359'");
			//impalaUtil.executeQuerySQL("select REGION_CODE, CUST_ID, CUST_NAME, SERVICE_NBR, DUTY_ZONE_NAME, GRID_NAME, count(1) TASK_NUM from RM_CHANNELTASK_INFO_HIVE where  position_id = 'POSITION_10_01'  and status_code = '04'  and region_code = '551' and edw_dept_id = '1072359'  group by REGION_CODE, CUST_ID, CUST_NAME, SERVICE_NBR, DUTY_ZONE_NAME, GRID_NAME");
			impalaUtil.executeQuerySQL("select ACT_ID, ACT_NAME, ACT_TYPE, BUSI_TYPE, START_DATE, END_DATE, ACT_DESC, count(1) TASK_NUM from RM_CHANNELTASK_INFO_HIVE where position_id = 'POSITION_10_01'  and status_code = '04'  and region_code = '551' and edw_dept_id = '1072359'  group by ACT_ID, ACT_NAME, ACT_TYPE, BUSI_TYPE, START_DATE, END_DATE, ACT_DESC");
			long time4 = System.currentTimeMillis();
			System.out.println("==================100W ceshi=====================" + (time4-time3));
			
			long time5 = System.currentTimeMillis();
			System.out.println("==================hbase 100W ceshi=====================");
			//impalaUtil.executeQuerySQL("select TASK_ID, ACT_ID, ACT_NAME, CUST_NAME, PRD_INST_ID, CUST_ID, ACCT_ID, REGION_CODE, SERVICE_NBR, SM_NAME, START_DATE, END_DATE, ISNT_4GCARD, SERVICE_NO, SERVICE_NAME, STATUS_NAME, PHOTO_FLAG, CUST_GRADE, ENJOY_FLAG, BIND_FLAG, RISK_FLAG, NOTE, MKT_AREA_NAME, DEPT_NAME, DUTY_ZONE_NAME, GRID_NAME from RM_CHANNELTASK_INFO where  position_id = 'POSITION_10_01'  and status_code = '04'  and region_code = '551'  and edw_dept_id = '1072359'");
			//impalaUtil.executeQuerySQL("select REGION_CODE, CUST_ID, CUST_NAME, SERVICE_NBR, DUTY_ZONE_NAME, GRID_NAME, count(1) TASK_NUM from RM_CHANNELTASK_INFO where  position_id = 'POSITION_10_01'  and status_code = '04'  and region_code = '551' and edw_dept_id = '1072359'  group by REGION_CODE, CUST_ID, CUST_NAME, SERVICE_NBR, DUTY_ZONE_NAME, GRID_NAME");
			impalaUtil.executeQuerySQL("select ACT_ID, ACT_NAME, ACT_TYPE, BUSI_TYPE, START_DATE, END_DATE, ACT_DESC, count(1) TASK_NUM from RM_CHANNELTASK_INFO where position_id = 'POSITION_10_01'  and status_code = '04'  and region_code = '551' and edw_dept_id = '1072359'  group by ACT_ID, ACT_NAME, ACT_TYPE, BUSI_TYPE, START_DATE, END_DATE, ACT_DESC");
			long time6 = System.currentTimeMillis();
			System.out.println("==================hbase 100W ceshi=====================" + (time6-time5));
			
		} catch (StrategyError e) {
			e.printStackTrace();
		}

	}
	
	/** 
	* @date: 2016-12-5 
	* @author: wangpei
	* @title: testQueJry1  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static void testQuery1(){
        ImpalaUtil query = ImpalaUtil.getInstance();
        try {
			query.executeSql("use clzxdb");
			List<Map<String,Object>>  res = query.executeQuerySQL("select REGION_CODE, CUST_ID, CUST_NAME, SERVICE_NBR, DUTY_ZONE_NAME, GRID_NAME, count(1) TASK_NUM from RM_CHANNELTASK_INFO_HIVE where  position_id = 'POSITION_10_01'  and status_code = '04'  and region_code = '550'  group by REGION_CODE, CUST_ID, CUST_NAME, SERVICE_NBR, DUTY_ZONE_NAME, GRID_NAME");
        }catch (Exception e) {
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
		System.out.println("=============impala test start=============");
		ImpalaUtil impalaUtil = getInstance();
		testImpalaJDBCQuery(impalaUtil);
		System.out.println("=============impala test end=============");
		testQuery1();
	}

}
