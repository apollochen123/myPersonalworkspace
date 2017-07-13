package com.sitech.strategy.process.batch.test;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.hive.HiveContext;

import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.entity.inter.test.ISparkStreamingTestEntity;

/**
 * 验证spark sql
* @date: 2016-11-30 
* @author: sunliang 
* @title: SparkSQLTest 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class SparkSQLTest {
	
	public static Configuration configuration;
	
	static {
		System.out.println("static1..");
		configuration = HBaseConfiguration.create();
		
		configuration.set("hbase.zookeeper.quorum", "bigdata012020,bigdata012011,bigdata012013,bigdata012012,bigdata012021");
		configuration.set("hbase.master", "134.64.12.11:60000");
		configuration.set("hbase.zookeeper.property.clientPort", "2181");
		
		configuration.set("hbase.rootdir", "/hbase");
		configuration.set("zookeeper.znode.parent", "/hbase");
		
		configuration.set("hbase.security.authentication", "kerberos");
		configuration.set("hbase.rpc.engine", "org.apache.hadoop.hbase.ipc.SecureRpcEngine");
		configuration.set("hbase.master.kerberos.principal","hbase/_HOST@MYCDH");
		configuration.set("hbase.regionserver.kerberos.principal", "hbase/_HOST@MYCDH");
		
		try {
			UserGroupInformation.setConfiguration(configuration);
			
			UserGroupInformation.loginUserFromKeytab("stra_opr@MYCDH","/home/stra_opr/stra_opr.keytab");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("static2..");

	}
	
	
	/**
	 * sparkStreaming测试实体
	 */
	protected ISparkStreamingTestEntity sparkStreamingTestEntity;
	
	/**
	 * 
	* @date: 2016-11-21 
	* @author: sunliang 
	* @title: setSparkStreamingTestEntity 
	* @param sparkStreamingTestEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSparkStreamingTestEntity(
			ISparkStreamingTestEntity sparkStreamingTestEntity) {
		this.sparkStreamingTestEntity = sparkStreamingTestEntity;
	}
	
	/**
	 * 验证spark sql
	* @date: 2016-11-30 
	* @author: sunliang 
	* @title: testSparkSQL  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void testSparkSQL(){
		System.out.println("=========sunliang===========");
		SparkConf conf = new SparkConf().setAppName("SparkSQLTest");
		System.out.println("=========sunliang1===========");
	    JavaSparkContext sc = new JavaSparkContext(conf);
	    System.out.println("=========sunliang2===========");
		HiveContext hiveCtx = new HiveContext(sc);
		System.out.println("=========00000===========");
		hiveCtx.sql("use clzxdb");
		System.out.println("=========11111===========");
    	DataFrame dataFrame = hiveCtx.sql("select test1 from rm_hivetest_hbase_info");
    	System.out.println("=========rm_hivetest_hbase_info===========");
    	
    	List<Row> l = dataFrame.collectAsList();
    	System.out.println("=========List<Row>.size===========" + l.size());
    	Row r = l.get(0);
    	System.out.println("=========rrrrrrrr===========" + r.getString(0));
	    for(Row row:dataFrame.javaRDD().collect()){
	    	String phoneNo = row.getString(0);
	    	System.out.println("=========phoneNo===========" + phoneNo);
	    	try {
				sparkStreamingTestEntity.testSparkSQL(phoneNo);
			} catch (StrategyError e) {
				e.printStackTrace();
			}
	    }
	    System.out.println("=========sunliang1111===========");
	}
	
	public static void main(String[] args){
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_NOSQL);
		SparkSQLTest sparkSQLTest = (SparkSQLTest)springBeanFactory.getBean("sparkSQLTest");
		sparkSQLTest.testSparkSQL();
	}

}
