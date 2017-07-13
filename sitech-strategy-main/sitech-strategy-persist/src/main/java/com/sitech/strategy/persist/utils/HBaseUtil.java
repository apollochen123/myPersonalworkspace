package com.sitech.strategy.persist.utils;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.Cell;
import org.apache.hadoop.hbase.CellUtil;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.HColumnDescriptor;
import org.apache.hadoop.hbase.HTableDescriptor;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.Admin;
import org.apache.hadoop.hbase.client.Connection;
import org.apache.hadoop.hbase.client.ConnectionFactory;
import org.apache.hadoop.hbase.client.Delete;
import org.apache.hadoop.hbase.client.Get;
import org.apache.hadoop.hbase.client.Increment;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.ResultScanner;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.client.Table;
import org.apache.hadoop.hbase.filter.CompareFilter.CompareOp;
import org.apache.hadoop.hbase.filter.Filter;
import org.apache.hadoop.hbase.filter.PrefixFilter;
import org.apache.hadoop.hbase.filter.RegexStringComparator;
import org.apache.hadoop.hbase.filter.RowFilter;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.security.UserGroupInformation;

import com.sitech.strategy.common.pojo.inter.hbase.IHbaseTableName;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.PropertiesUtil;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.persist.base.BaseClass;

/**
 * hbase工具类
* @date: 2016-9-11 
* @author: sunliang 
* @title: HBaseUtil 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class HBaseUtil extends BaseClass implements Serializable{
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -5603853657732886557L;
	/**
	 * Configuration对象
	 */
	private static Configuration conf;
	/**
	 * Connection
	 */
	private static Connection connection;
	/**
	 * HBaseUtil实例对象
	 */
	private static HBaseUtil instance = new HBaseUtil();
	
	/**
	 * 私有构造方法
	* @date: 2016-11-19 
	* @author: sunliang  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private HBaseUtil(){
	}
	
	/**
	 * 获取HbaseUtil对象实例
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: getInstance 
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static HBaseUtil getInstance(){
		return instance;
	}
	
	/**
	 * RowHandler接口
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: RowHandler 
	* @version: 1.0 
	* @description： 
	* update_version: update_date: update_author: update_note:
	 */
	public static interface RowHandler{
		public void handleRow(Map<String,Map<String,String>> rowData );
	}
	
	/**
	 * 初始化静态块
	 */
	static {
		String isLoad = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE, "hbase.isLoad");
		
		if(Const.TRUE_LOWER.equals(isLoad)){
			System.out.println("=============welcome HBaseUtil=============");
			String isKerberos = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_CONF, "security.kerberos");
			System.out.println("=============isKerberos=============" + isKerberos);
			conf = HBaseConfiguration.create();
			
			if(Const.TRUE_LOWER.equals(isKerberos)){
				identifyHBaseKerberos();
			}
			
			//连接hbase
			connectHbase();
			
			System.out.println("=============goodbye HBaseUtil=============");
		} else {
			System.out.println("=============not load HBaseUtil=============");
		}

	}
	
	
	/**
	 * 验证hbase kerberos
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: identifyHBaseKerberos  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected static void identifyHBaseKerberos(){
		
		String hadoopAuthStr = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE, "kerberos.hadoop.security.authentication");
		String hbaseAuthStr = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE, "kerberos.hbase.security.authentication");
		String principalStr = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE, "kerberos.principal");
		String masterPrincipalStr = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE, "kerberos.hbase.master.kerberos.principal");
		String regionserverPrincipalStr = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE, "kerberos.hbase.regionserver.kerberos.principal");
		String clientRetriesNumber = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE, "kerberos.hbase.client.retries.number");
		String user = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE, "kerberos.hbase.user");
		String path = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE, "kerberos.hbase.path");
		
		System.out.println("---------identifyHBaseKerberos.hadoopAuthStr--------------" + hadoopAuthStr);
		System.out.println("---------identifyHBaseKerberos.hbaseAuthStr---------------" + hbaseAuthStr);
		System.out.println("---------identifyHBaseKerberos.principalStr---------------" + principalStr);
		System.out.println("---------identifyHBaseKerberos.masterPrincipalStr---------" + masterPrincipalStr);
		System.out.println("---------identifyHBaseKerberos.regionserverPrincipalStr---" + regionserverPrincipalStr);
		System.out.println("---------identifyHBaseKerberos.clientRetriesNumber--------" + clientRetriesNumber);
		System.out.println("---------identifyHBaseKerberos.user-----------------------" + user);
		System.out.println("---------identifyHBaseKerberos.path-----------------------" + path);
		
		conf.set("hadoop.security.authentication", hadoopAuthStr);		
		conf.set("hbase.security.authentication",hbaseAuthStr);
		conf.set("kerberos.principal", principalStr); 
		conf.set("hbase.master.kerberos.principal",masterPrincipalStr);
		conf.set("hbase.regionserver.kerberos.principal",regionserverPrincipalStr);
		conf.set("hbase.client.retries.number",clientRetriesNumber);
		
		System.out.println("===========begin to test hbase kerberos========");

		UserGroupInformation.setConfiguration(conf);
		try {
			UserGroupInformation.loginUserFromKeytab(user,path);
		} catch (IOException e) {
			//e.printStackTrace();
		}
		
		System.out.println("===========end to test hbase kerberos===========");
		
	}
	
	/**
	 * 连接hbase
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: connectHbase  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	protected static void connectHbase(){
		
		String systemAppType = PropertiesUtil.getProperty(
				Const.PROPERTIES_FILE_NAME_CONF, "SYSTEM_APP_TYPE").equals("${sys}") ? Const.SYSTEM_APP_TYPE_APP
				: PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_CONF,
						"SYSTEM_APP_TYPE");
		
		if(Const.SYSTEM_APP_TYPE_APP.equals(systemAppType) || Const.SYSTEM_APP_TYPE_SPARKSTREAMING.equals(systemAppType)){
			
			String quorum = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE,"hbase.zookeeper.quorum");
			String clientPort = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE,"hbase.zookeeper.property.clientPort");
			String timeout = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE,"hbase.rpc.timeout");
			String parent = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE,"hbase.zookeeper.znode.parent");
			String dir = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE,"hadoop.home.dir");
			
			System.out.println("=========quorum==========" + quorum);
			System.out.println("=========clientPort==========" + clientPort);
			System.out.println("=========timeout==========" + timeout);
			System.out.println("=========parent==========" + parent);
			System.out.println("=========dir==========" + dir);
			
			conf.set("hbase.zookeeper.quorum",quorum);
			conf.set("hbase.zookeeper.property.clientPort",clientPort);
			conf.set("hbase.rpc.timeout",timeout);
			conf.set("zookeeper.znode.parent",parent);
			if(dir != null){
				System.setProperty("hadoop.home.dir",dir);
			}
			
			System.out.println("========begin to connect hbase=======");
			try {
				connection = ConnectionFactory.createConnection(conf);
			} catch (Exception e) {
				//e.printStackTrace();
			}
			System.out.println("========end to connect hbase=========");
		}
	}
	
	/**
	 * connection关闭
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: close  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void close()
	{
		try {
			connection.close();
		} catch (IOException e) {
			
		}
	}
	
	/**
	 *  转换为Table
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: getHTable 
	* @param tableName
	* @return
	* @throws IOException 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static Table getHTable(String tableName) throws IOException {
		return connection.getTable(TableName.valueOf(tableName));
	}
	
	/**
	 * 转换为Table
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: toHTable 
	* @param tableName
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static Table toHTable(String tableName) {
		try {
			return HBaseUtil.getHTable(tableName);
		} catch (IOException e) {
			
		}
		return null;
	}
	
	/**
	 * 创建表操作
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: createTable 
	* @param tablename
	* @param cfs
	* @throws IOException 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void createTable(String tablename, String[] cfs) throws IOException { 
	    Admin admin = connection.getAdmin();
	 
	    if (admin.tableExists(TableName.valueOf(tablename))) { 
	    	
	    }else{
	        HTableDescriptor tableDesc = new HTableDescriptor(TableName.valueOf(tablename)); 
	        for (int i = 0; i < cfs.length; i++) { 
	            tableDesc.addFamily(new HColumnDescriptor(cfs[i])); 
	        } 
	        admin.createTable(tableDesc); 
	    } 
	    
	    admin.close();
	}
	
	/**
	 * 删除表操作
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: deleteTable 
	* @param tablename
	* @throws IOException 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void deleteTable(String tablename) throws IOException { 
	    try { 
	        Admin admin = connection.getAdmin() ;
	        admin.disableTable(TableName.valueOf(tablename)); 
	        admin.deleteTable(TableName.valueOf(tablename)); 
	    } catch (MasterNotRunningException e) { 
	        ////e.printStackTrace(); 
	    } catch (ZooKeeperConnectionException e) { 
	        ////e.printStackTrace(); 
	    } 
	}
	
	/**
	 * 插入一条数据
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: insert 
	* @param tablename
	* @param rowkey
	* @param familiy
	* @param qualifier
	* @param value
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void insert(String tablename,String rowkey,String familiy,String qualifier,String value) throws Exception {
		Table  mTable = null;
		try{
			mTable  = toHTable(tablename);
			insert(mTable,rowkey,familiy,qualifier,value);
		}catch(Exception e){
			throw new Exception(e);
		}finally{
			if(mTable!=null) {
				mTable.close();
			}
		}
	}
	
	/**
	 * 插入单条数据
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: insert 
	* @param mTable
	* @param rowkey
	* @param familiy
	* @param qualifier
	* @param value
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void insert(Table mTable,String rowkey,String familiy,String qualifier,String value) throws Exception{
		Put put = new Put(Bytes.toBytes(rowkey));
		put.addColumn(Bytes.toBytes(familiy), Bytes.toBytes(qualifier),Bytes.toBytes(value));
		mTable.put(put);
	}
	
	/**
	 * 插入多条数据
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: insert 
	* @param tablename
	* @param rowkey
	* @param family
	* @param map
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void insert(String tablename,String rowkey, String family, Map<String, String> map) throws Exception {
		if (rowkey == null || rowkey.equals("") || family == null || family.equals("") || map == null)
			throw new Exception("null exists in the arguments");
		
		Table  mTable = null;
		
		try{
			mTable  = toHTable(tablename);
			List<Put> putList = new ArrayList<Put>();
			for (Map.Entry<String, String> item : map.entrySet()) {
				String qualifier = item.getKey();
				String value = item.getValue();
				Put put = new Put(Bytes.toBytes(rowkey));
				put.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier),Bytes.toBytes(value));
				putList.add(put);
			}
			
			mTable.put(putList);		
		}catch(Exception e){
			////e.printStackTrace();
		}finally{
			if(mTable!=null){
				mTable.close();
			}
		}
	}
	
	/** 
	 * 计数器插入多条数据
	* @date: 2016-11-4 
	* @author: songxj
	* @title: insertCounter 
	* @param tableName
	* @param rowkey
	* @param family
	* @param map
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public void insertCounter(String tableName, String rowkey, String family, Map<String, Long> map) throws Exception{
		if (null == rowkey || "".equals(rowkey) || null == family || "".equals(family) || null == map)
			throw new Exception("null exists in the arguments");
		Table  mTable = null;
		try {
			mTable = toHTable(tableName);
			Increment increment = new Increment(rowkey.getBytes());
			Iterator<String> ite = map.keySet().iterator();
			while (ite.hasNext()) {
				String qualifier = ite.next();
				long value = map.get(qualifier);
				increment.addColumn(family.getBytes(), qualifier.getBytes(), value);
			}
			mTable.increment(increment);
		} catch (Exception e) {
			////e.printStackTrace();
		} finally {
			if(null != mTable){
				mTable.close();
			}
		}
	}
	
	/**
	 * 删除一行数据
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: delete 
	* @param tablename
	* @param rowkey
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void delete (String tablename,String rowkey) throws Exception {
		Table mTable = null;
		try{
			mTable = toHTable(tablename);
			delete(mTable,rowkey);
		}catch(Exception e){
			throw new Exception(e);
		}finally{
			if( mTable!=null)
				mTable.close();
		}
	}
	
	/**
	 * 删除一行数据
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: delete 
	* @param mTable
	* @param rowkey
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void delete(Table mTable,String rowkey) throws Exception {
		Delete delete = new Delete(Bytes.toBytes(rowkey));
		mTable.delete(delete);
	}
	
	/**
	 * 查询单个字段
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: query 
	* @param tablename
	* @param rowkey
	* @param family
	* @param qualifier
	* @return
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String query(String tablename,String rowkey,String family,String qualifier ) throws Exception
	{
		Table mTable = null;
		String retStr="";
		try{
			mTable = toHTable(tablename);;
			retStr = query(mTable,rowkey,family,qualifier);
			
		}catch(Exception e)
		{
		}finally{
			if( mTable!=null ) mTable.close();
		}
		
		return retStr;
		
	}
	
	/**
	 * 查询单个字段
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: query 
	* @param mTable
	* @param rowkey
	* @param family
	* @param qualifier
	* @return
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String query(Table mTable,String rowkey,String family,String qualifier ) throws Exception {
		String retStr = "";
		Get get = new Get(Bytes.toBytes(rowkey));
		get.addColumn(Bytes.toBytes(family), Bytes.toBytes(qualifier));
		
		Result result = mTable.get(get);
		
		byte [] bt = result.getValue(Bytes.toBytes(family), Bytes.toBytes(qualifier));
		
		if( bt !=null ) retStr = Bytes.toString(bt);
		
		return retStr;
	}
	
	/**
	 * 查询family指定字段的值
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: query 
	* @param table
	* @param rowkey
	* @param family
	* @param setQualifiers
	* @return
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static Map<String,String>  query(String table,String rowkey,String family,Set<String> setQualifiers  ) throws Exception {
		Table mTable = null;
		Map<String,String> retMap = null;
		try{		
			mTable = getHTable(table);
			Iterator<String> it = setQualifiers.iterator();
			Get get = new Get(Bytes.toBytes(rowkey));	
			
			while( it.hasNext()){
				get.addColumn(Bytes.toBytes(family), Bytes.toBytes(it.next()));
			}
			
			Result result = mTable.get(get);
			
		    for(Cell cell:result.rawCells()){  
		    	if( retMap ==null ) retMap = new HashMap<String,String>();
		    	String name = Bytes.toString(CellUtil.cloneQualifier(cell));
		    	String value = Bytes.toString(CellUtil.cloneValue(cell));    	
		    	retMap.put(name, value); 
	        }  
			
		}catch(Exception e){
			//e.printStackTrace();
		}finally{
			if( mTable!=null ) mTable.close();
		}
		
		return retMap;
	}
	
	/**
	 * 查询一个family所有字侧面的值
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: query 
	* @param table
	* @param rowkey
	* @param family
	* @return
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static Map<String,String> query(String table,String rowkey,String family ) throws Exception {
		Table mTable = null;
		Map<String,String> retMap = null;
		try{		
			mTable = getHTable(table);
			 
			Get get = new Get(Bytes.toBytes(rowkey));	
			get.addFamily(Bytes.toBytes(family));
			Result result = mTable.get(get);
			
		    for(Cell cell:result.rawCells()){  
		    	if( retMap ==null ) retMap = new HashMap<String,String>();
		    	String name = Bytes.toString(CellUtil.cloneQualifier(cell));
		    	String value = Bytes.toString(CellUtil.cloneValue(cell));    	
		    	retMap.put(name, value); 
	        } 
		}catch(Exception e){
			//e.printStackTrace();
		}finally{
			if( mTable!=null ) mTable.close();
		}
		return retMap;
	}
	
	/** 
	 * 计数器查询
	* @date: 2016-11-5 
	* @author: songxj
	* @title: queryCounter 
	* @param tableName
	* @param rowkey
	* @param family
	* @param map
	* @return
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static Map<String, Long> queryCounter(String tableName, String rowkey, String family, Map<String, Long> map) throws Exception{
		if (null == rowkey || "".equals(rowkey) || null == family || "".equals(family) || null == map)
			throw new Exception("null exists in the arguments");
		Map<String, Long> resultMap = new HashMap<String, Long>();
		Table  mTable = null;
		try {
			mTable = toHTable(tableName);
			Iterator<String> ite = map.keySet().iterator();
			while (ite.hasNext()) {
				String qualifier = ite.next();
				long result = mTable.incrementColumnValue(rowkey.getBytes(), family.getBytes(), qualifier.getBytes(), 0);
				resultMap.put(qualifier, result);
			}
		} catch (Exception e) {
			////e.printStackTrace();
		} finally {
			if(null != mTable){
				mTable.close();
			}
		}
		return resultMap;
	}
	
	/**
	 * 按前缀模糊查询
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: scaneByPrefixFilter 
	* @param table
	* @param rowPrifix
	* @param family
	* @return
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static Map<String,Map<String,Map<String,String>>> scaneByPrefixFilter(String table, String rowPrifix,String family) throws Exception{
		Map<String,Map<String,Map<String,String>>> resultMap = new HashMap<String,Map<String,Map<String,String>>>();
		Table mTable = null;
		try {
			mTable  = toHTable(table);
			Scan s = new Scan();
			s.setFilter(new PrefixFilter(rowPrifix.getBytes()));
			s.addFamily(Bytes.toBytes(family));
			ResultScanner rs = mTable.getScanner(s);
		       
		    for(Result result:rs){
				Map<String,Map<String,String>> familyMap = new HashMap<String,Map<String,String>>();
				byte[] rowkey = result.getRow();
				Map<String,String> cellMap = new HashMap<String,String>();
				for(Cell cell:result.rawCells()){
					String name = Bytes.toString(CellUtil.cloneQualifier(cell));
					String value = Bytes.toString(CellUtil.cloneValue(cell)); 
					cellMap.put(name, value);
				}
				familyMap.put(family, cellMap);
				resultMap.put(Bytes.toString(rowkey), familyMap);
		    }
		} catch (IOException e) {
			////e.printStackTrace();
		} finally{
			if(mTable!=null)
				mTable.close();
		}
		return resultMap;
	}
	
	/**
	 * 模糊查询rowkey,regexStr为正则表达式
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: regexQuery 
	* @param table
	* @param regexStr
	* @param family
	* @return
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static Map<String,Map<String,Map<String,String>>> regexQuery(String table ,String regexStr,String family) throws Exception{
		Map<String,Map<String,Map<String,String>>> resultMap = new HashMap<String,Map<String,Map<String,String>>>();
		Table mTable = null;
		try {
			Filter filter = new RowFilter(CompareOp.EQUAL,new RegexStringComparator(regexStr));
			Scan scan = new Scan(); 
			scan.addFamily(Bytes.toBytes(family));
			scan.setFilter(filter);
			mTable  = toHTable(table);
			ResultScanner scanner = mTable.getScanner(scan);
			
			for(Result result:scanner){
				Map<String,Map<String,String>> familyMap = new HashMap<String,Map<String,String>>();
				byte[] rowkey = result.getRow();
				Map<String,String> cellMap = new HashMap<String,String>();
				for(Cell cell:result.rawCells()){
			    	String name = Bytes.toString(CellUtil.cloneQualifier(cell));
			    	String value = Bytes.toString(CellUtil.cloneValue(cell)); 
					cellMap.put(name, value);
				}
				familyMap.put(family, cellMap);
				resultMap.put(Bytes.toString(rowkey), familyMap);
			}
			
		} catch(Exception e){
			throw new Exception(e);			
		}finally{
			if(mTable!=null)
				mTable.close();
		}
		
		return resultMap;
	}
	
	/**
	 * 
	* @date: 2016-9-11 
	* @author: sunliang 
	* @title: regexQuery 
	* @param table
	* @param rowkeyRegex
	* @param familys
	* @param handler
	* @throws Exception 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void regexQuery(String table ,String rowkeyRegex,Set<String> familys,RowHandler handler) throws Exception {
		Table mTable  = null;
		try{
			Scan scan = new Scan();
			Filter filter = new org.apache.hadoop.hbase.filter.RowFilter(CompareOp.EQUAL,new RegexStringComparator(rowkeyRegex));
			
			if( familys !=null ){
				Iterator<String> it = familys.iterator();
				while( it.hasNext()){
					scan.addFamily(Bytes.toBytes(it.next()));
				}
			}
			
			scan.setFilter(filter);
			ResultScanner scanner;
			mTable = getHTable(table);
			scanner = mTable.getScanner(scan);
			
			for(Result result:scanner){			
				Map<String,Map<String,String>> allFamilyMap = new HashMap<String,Map<String,String>>();
			    for(Cell cell:result.rawCells()){		
			    	String family = Bytes.toString(CellUtil.cloneFamily(cell));
			    	
			    	Map<String,String> familyMap = allFamilyMap.get(family);
			    	if(familyMap == null  ){
			    		familyMap =  new HashMap<String,String>();
			    	}
			    	
			    	String name = Bytes.toString(CellUtil.cloneQualifier(cell));
			    	String value = Bytes.toString(CellUtil.cloneValue(cell)); 
			    	
			    	familyMap.put(name, value);
			    	
			    	allFamilyMap.put(family, familyMap);

		        }  	
		    	try{
		    		handler.handleRow(allFamilyMap);
		    	}catch(Exception e){
		    		
		    	}
			}
			
		}catch(Exception e){
			
		}finally{
			if(mTable!=null)
				mTable.close();
		}
		
	}
	
	/**
	 * 根据范围模糊查询rowkey 
	* @date: 2016-10-28 
	* @author: songxj
	* @title: scaneByScope 
	* @param tablename
	* @param startRow
	* @param stopRow
	* @param family
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note: 
	*/
	public static Map<String,Map<String,Map<String,String>>> scaneByScope(String tablename, String startRow, String stopRow, String family) {
		Table table  = null;
		Map<String, Map<String, Map<String, String>>> resultMap = new HashMap<String, Map<String, Map<String, String>>>();
		try {
			table = getHTable(tablename);
			Scan s = new Scan();
			if (null != family && !"".equals(family)) {
				s.addFamily(Bytes.toBytes(family));
			}
			s.setStartRow(Bytes.toBytes(startRow));
			s.setStopRow(Bytes.toBytes(stopRow));
			s.setCaching(10000);
			s.setCacheBlocks(true);
			ResultScanner rs = table.getScanner(s);
			
			for(Result result:rs){
				Map<String,Map<String,String>> familyMap = new HashMap<String,Map<String,String>>();
				byte[] rowkey = result.getRow();
				if (null != family && !"".equals(family)) {
					Map<String,String> cellMap = new HashMap<String,String>();
					for(Cell cell:result.rawCells()){
						String name = Bytes.toString(CellUtil.cloneQualifier(cell));
						String value = Bytes.toString(CellUtil.cloneValue(cell)); 
						cellMap.put(name, value);
					}
					familyMap.put(family, cellMap);
				}
				resultMap.put(Bytes.toString(rowkey), familyMap);
			}
		} catch (IOException e) {
			////e.printStackTrace();
		}
		return resultMap;
	}
	
	/**
	 * 测试query
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: testHbaseQuery 
	* @param hbaseUtil 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private static void testHbaseQuery(HBaseUtil hbaseUtil,IHbaseTableName HbaseTablePojo){
		try {
			Set set = new HashSet();
			set.add("ID_NO");
			System.out.println("==============testHbaseQuery.start===============");
			Map map = hbaseUtil.query("stra_opr:RM_CUSTGROUP_123456789_DETAIL_INFO", "220180200091236802", "a",set);
			System.out.println("==============testHbaseQuery.map==============" + map);
		} catch (Exception e) {
			//e.printStackTrace();
		}
	}
	
	/**
	 * 测试insert
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: testHbaseInsert 
	* @param hbaseUtil 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	private static void testHbaseInsert(HBaseUtil hbaseUtil,IHbaseTableName hbaseTableName){
		try {
			System.out.println("==============insert start===============");
			hbaseUtil.insert("stra_opr:RM_HBASETEST_INFO", "12345678", "a", "sunliang", "yangyitong");
			System.out.println("==============insert end===============");
		} catch (Exception e) {
			////e.printStackTrace();
		}
	}
	
	/**
	 * 测试方法入口
	* @date: 2016-11-19 
	* @author: sunliang 
	* @title: main 
	* @param args 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static void main(String[] args) {
		System.out.println("==============hbase test start===============");
		//SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_COMMON);
		//IHbaseTableName hbaseTableName = (IHbaseTableName)springBeanFactory.getBean("hbaseTableName");
		
		HBaseUtil hbaseUtil = HBaseUtil.getInstance();
		long start = System.currentTimeMillis();
		//testHbaseInsert(hbaseUtil,hbaseTableName);
		long insertEnd = System.currentTimeMillis();
		System.out.println("==============hbase test insert cost==============="+(insertEnd-start));
		testHbaseQuery(hbaseUtil,null);
		long queryEnd = System.currentTimeMillis();
		System.out.println("==============hbase test query cost==============="+(queryEnd-start));
		System.out.println("==============hbase test end===============");
	}

}
