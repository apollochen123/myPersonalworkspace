package com.sitech.strategy.process.batch;

import java.io.Serializable;
import java.util.Date;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.client.Put;
import org.apache.hadoop.hbase.io.ImmutableBytesWritable;
import org.apache.hadoop.hbase.mapred.TableOutputFormat;
import org.apache.hadoop.hbase.util.Bytes;
import org.apache.hadoop.mapred.JobConf;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.PairFunction;

import scala.Tuple2;

import com.sitech.strategy.common.pojo.inter.ISparkAppProp;
import com.sitech.strategy.common.pojo.inter.hbase.IHbaseTableName;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.PropertiesUtil;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.process.base.BaseProcessBatch;

/**
 * 导入反馈记录
* @date: 2017-3-17 
* @author: sunliang 
* @title: LoadCoupleBack 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class LoadCoupleBack extends BaseProcessBatch implements Serializable{
	
	/**
	 * spark应用配置对象
	 */
	protected ISparkAppProp sparkAppProp;
	/**
	 * hbase表对象
	 */
	protected IHbaseTableName hbaseTableName;
	
	/**
	 * 
	* @date: 2017-2-22 
	* @author: sunliang 
	* @title: setSparkAppProp 
	* @param sparkAppProp 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setSparkAppProp(ISparkAppProp sparkAppProp) {
		this.sparkAppProp = sparkAppProp;
	}
	
	/**
	 * 
	* @date: 2017-3-28 
	* @author: sunliang
	* @title: setHbaseTableName 
	* @param hbaseTableName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setHbaseTableName(IHbaseTableName hbaseTableName) {
		this.hbaseTableName = hbaseTableName;
	}
	
	/**
	 * 导入外呼反馈记录
	* @date: 2017-3-17 
	* @author: sunliang 
	* @title: LoadCallCoupleBack  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void LoadCallCoupleBack(String inPath){
		
		System.out.println("====LoadCallCoupleBack==========");
		sparkAppProp.setSparkAppProp(Const.SPARK_APPNAME_LOADCALLCOUPLEBACK);
		String appName = sparkAppProp.getAppName();
		SparkConf conf = new SparkConf().setAppName(appName);
	    JavaSparkContext sc = new JavaSparkContext(conf);
	    
	    String quorum = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE,"hbase.zookeeper.quorum");
		String clientPort = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE,"hbase.zookeeper.property.clientPort");
		String parent = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_HBASE,"hbase.zookeeper.znode.parent");
		
		log.info("====LoadCallCoupleBack.quorum==========", quorum);
		log.info("====LoadCallCoupleBack.clientPort==========", clientPort);
		log.info("====LoadCallCoupleBack.parent==========", parent);
	    
	    Configuration hbaseConf = HBaseConfiguration.create();
	    hbaseConf.set("hbase.zookeeper.property.clientPort", clientPort);
	    hbaseConf.set("hbase.zookeeper.quorum", quorum);
	    hbaseConf.set("hbase.zookeeper.znode.parent", parent);
	    
	    JobConf jobConf = new JobConf(hbaseConf,this.getClass());
	    jobConf.setOutputFormat(TableOutputFormat.class);
	    jobConf.set(TableOutputFormat.OUTPUT_TABLE, hbaseTableName.getChannelCallContact());
	    
	    System.out.println("==============LoadCallCoupleBack.inPath==========" + inPath);
	    JavaRDD rdd = sc.textFile(inPath);
	    System.out.println("============== rdd.count()==========" +  rdd.count());
	    
	    JavaPairRDD<ImmutableBytesWritable,Put> pairRdd = rdd.mapToPair(
	    	new PairFunction(){
				@Override
				public Tuple2<ImmutableBytesWritable,Put> call(Object t) throws Exception {
					System.out.println("==============LoadCallCoupleBack.t==========" + t);
					String str = (String)t;
					String[] strs = str.split("\\|");
					
					Put put = new Put(Bytes.toBytes(strs[0]));
					put.addColumn(Bytes.toBytes("a"), Bytes.toBytes("SERVICE_ID"), Bytes.toBytes(strs[0]));
					put.addColumn(Bytes.toBytes("a"), Bytes.toBytes("CAMPAIGN_ID"), Bytes.toBytes(strs[1]));
					put.addColumn(Bytes.toBytes("a"), Bytes.toBytes("LOG_DATE"), Bytes.toBytes(strs[2]));
					put.addColumn(Bytes.toBytes("a"), Bytes.toBytes("ACCEPT_PHONE"), Bytes.toBytes(strs[3]));
					put.addColumn(Bytes.toBytes("a"), Bytes.toBytes("STAFF_ID"), Bytes.toBytes(strs[4]));
					put.addColumn(Bytes.toBytes("a"), Bytes.toBytes("CALL_STATUS"), Bytes.toBytes(strs[5]));
					put.addColumn(Bytes.toBytes("a"), Bytes.toBytes("TOTAL_TIME"), Bytes.toBytes(strs[6]));
					return new Tuple2(new ImmutableBytesWritable(), put);
				}	
	    	}
	    );
	    
	    pairRdd.saveAsHadoopDataset(jobConf);
	    System.out.println("============== LoadCallCoupleBack===end=======");
		
	}
	
	public static void main(String[] args) {
		String coupleBackType = args[0];
		String inPath = args[1];
		if("call".equals(coupleBackType)){
			SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_NOSQL);
			LoadCoupleBack loadCoupleBack = (LoadCoupleBack)springBeanFactory.getBean("loadCoupleBack");
			loadCoupleBack.LoadCallCoupleBack(inPath);
		}
	}

}
