package com.sitech.strategy.process.batch;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.hadoop.io.Text;
import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.Function;
import org.apache.spark.sql.DataFrame;
import org.apache.spark.sql.Row;
import org.apache.spark.sql.hive.HiveContext;

import com.sitech.strategy.common.pojo.impl.MarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.IMarketCaseCachePojo;
import com.sitech.strategy.common.pojo.inter.ISparkAppProp;
import com.sitech.strategy.common.pojo.inter.hive.IHiveDBName;
import com.sitech.strategy.common.utils.CommonUtils;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.DateUtil;
import com.sitech.strategy.common.utils.SequenceUtil;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.common.utils.StrategyError;
import com.sitech.strategy.process.base.BaseProcessBatch;
import com.sitech.strategy.process.entity.inter.ITaskProcessEntity;

/**
 * 生成任务
* @date: 2016-9-21 
* @author: sunliang 
* @title: GenerateTask 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class GenerateTask extends BaseProcessBatch implements Serializable{
	
	/**
	 * hive表pojo对象
	 */
	protected IHiveDBName hiveDBName;
	/**
	 * spark应用配置对象
	 */
	protected ISparkAppProp sparkAppProp;
	/**
	 * 任务实体
	 */
	protected ITaskProcessEntity taskProcessEntity;
	/**
	 * 任务类型
	 */
	private String taskType = null;
	/**
	 * 营销案ID
	 */
	private String marketCaseId = null;
	/**
	 * 客户群ID
	 */
	private String custGroupId = null;
	/**
	 * 营销案详细
	 */
	private IMarketCaseCachePojo marketCaseCachePojo = null;
	/**
	 * 内容
	 */
	private Map<String,Object> contentMap = null;
	
	/**
	 * 
	* @date: 2017-2-8 
	* @author: sunliang 
	* @title: setHiveDBName 
	* @param hiveDBName 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setHiveDBName(IHiveDBName hiveDBName) {
		this.hiveDBName = hiveDBName;
	}
	
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
	* @date: 2016-9-26 
	* @author: sunliang 
	* @title: setTaskProcessEntity 
	* @param taskProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setTaskProcessEntity(ITaskProcessEntity taskProcessEntity) {
		this.taskProcessEntity = taskProcessEntity;
	}
	
	/**
	 * 生成批量push任务
	* @date: 2016-9-21 
	* @author: sunliang 
	* @title: generateInitiativePushTask  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void generateBatchPushTask(String newTaskType,String outPath){
		taskType = newTaskType;
		System.out.println("==========GenerateTask.generateBatchPushTask.start==============");
		sparkAppProp.setSparkAppProp(Const.SPARK_APPNAME_GENERATEBATCHPUSHTASK);
		String appName = sparkAppProp.getAppName();
	    
	    SparkConf conf = new SparkConf().setAppName(appName);
	    JavaSparkContext sc = new JavaSparkContext(conf);
	    
		try {
			Map<String, Map<String,String>> waitCreateBatchPushMarketCaseMap = null;
			do {
				waitCreateBatchPushMarketCaseMap = taskProcessEntity.getWaitCreateBatchPushMarketCase(taskType);
				System.out.println("==========generateBatchPushTask.waitCreateBatchPushMarketCaseMap==============" + waitCreateBatchPushMarketCaseMap);
				if(waitCreateBatchPushMarketCaseMap != null && !waitCreateBatchPushMarketCaseMap.isEmpty()){
					HiveContext hiveCtx = new HiveContext(sc);
				    for(Map.Entry<String, Map<String,String>> waitCreateBatchPushMarketCase : waitCreateBatchPushMarketCaseMap.entrySet()){
				    	
				    	String marketCaseAndCustGroupStr = waitCreateBatchPushMarketCase.getKey();
				    	System.out.println("==========generateBatchPushTask.marketCaseAndCustGroupStr==============" + marketCaseAndCustGroupStr);
				    	String[] marketCaseStrs = marketCaseAndCustGroupStr.split(Const.SEPARATOR_COLON);
				    	String marketCaseId = marketCaseStrs[0];
				    	String custGroupId = marketCaseStrs[1];
				    	System.out.println("==========generateBatchPushTask.marketCaseId==============" + marketCaseId);
				    	System.out.println("==========generateBatchPushTask.custGroupId==============" + custGroupId);
				    	
				    	Map<String,String> custGroupTypeAndFormulaMap = waitCreateBatchPushMarketCase.getValue();
				    	System.out.println("==========generateBatchPushTask.custGroupTypeAndFormulaMap==============" + custGroupTypeAndFormulaMap);
				    	
				    	marketCaseCachePojo = taskProcessEntity.getMarketCaseCachePojoById(marketCaseId);
				    	System.out.println("==========generateBatchPushTask.marketCaseCachePojo.getRuleMap()==============" + marketCaseCachePojo.getRuleMap());
				    	System.out.println("==========generateBatchPushTask.marketCaseCachePojo.getMarketCaseRel()==============" + marketCaseCachePojo.getMarketCaseRel());
				    	contentMap = taskProcessEntity.getBatchPushContentMap(marketCaseCachePojo,marketCaseId,custGroupId,taskType);
				    	System.out.println("==========generateBatchPushTask.contentMap==============" + contentMap);
				    	hiveCtx.sql("use " + hiveDBName.getHiveDatabase());
				    	String sql = taskProcessEntity.getCustGroupParseFormula(custGroupTypeAndFormulaMap);
				    	System.out.println("==========generateBatchPushTask.sql==============" + sql);
				    	DataFrame dataFrame = hiveCtx.sql(sql);
				    	
					    JavaRDD<Row> filterJavaRDD = dataFrame.toJavaRDD().filter(
							new Function<Row,Boolean>(){
								@Override
								public Boolean call(Row r) throws Exception {
									Map<String,Object> tempParam = new HashMap<String,Object>();
									Map<String,Object> userMap = new HashMap<String,Object>();
									userMap.put("idNo", r.getString(0));
									userMap.put("phoneNo", r.getString(1));
									tempParam.put("userMap", userMap);
									tempParam.put("contentMap", contentMap);
									boolean b = taskProcessEntity.isGray(tempParam);
					    			return b;
								}
							}
					    );
					   
					    JavaRDD<Text> javaRDD = filterJavaRDD.map(
					    	new Function<Row,Text>(){
					    		@Override
					    		public Text call(Row r){
							    	Map<String,Object> tempParam = new HashMap<String,Object>();
							    	Map<String,Object> userMap = new HashMap<String,Object>();
									userMap.put("idNo", r.getString(0));
									userMap.put("phoneNo", r.getString(1));
									userMap.put("regionCode", r.getString(2));
							    	
							    	tempParam.put("taskType", taskType);
					    			tempParam.put("userMap", userMap);
					    			tempParam.put("contentMap", contentMap);
					    			String retStr = null;
									try {
										retStr = taskProcessEntity.generateBatchPushTask(tempParam);
									} catch (StrategyError e) {
										e.printStackTrace();
									}
					    			return new Text(retStr);
					    		}
					    	}
						);
					    String newPath = outPath + "/" + DateUtil.DateToString(new Date(), DateUtil.DATE_FROMAT_YYYYMMDD1) + "/" + marketCaseId + "/" + custGroupId;
					    System.out.println("====generateCallTask.newPath==========" + newPath);    
						javaRDD.saveAsTextFile(newPath);
				    }
				    //删除tmp表缓存
				    Map<String, Map<String,String>> rm = taskProcessEntity.rmWaitCreateBatchPushMarketCaseTmp(taskType,waitCreateBatchPushMarketCaseMap);
				    System.out.println("==========GenerateTask rm ========："+rm);
				    System.out.println("==========GenerateTask.rmWaitCreateBatchPushMarketCaseTmp.finish==============");  
				}
			} while(waitCreateBatchPushMarketCaseMap != null && !waitCreateBatchPushMarketCaseMap.isEmpty());
		} catch (StrategyError e) {
			e.printStackTrace();
		}
		
		System.out.println("==========GenerateTask.generateBatchPushTask.end==============");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 生成渠道任务
	* @date: 2016-10-10 
	* @author: sunliang 
	* @title: generateChannelTask  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void generateChannelTask(){
		Date start = new Date();
		log.info("====generateChannelTask   start==========", start);
		sparkAppProp.setSparkAppProp(Const.SPARK_APPNAME_GENERATECHANNELTASK);
		String appName = sparkAppProp.getAppName();
		SparkConf conf = new SparkConf().setAppName(appName);
	    JavaSparkContext sc = new JavaSparkContext(conf);
		Map<String, Map<String, String>> channelMarketCaseAndCustGroupMap = null;
		do {
			// 获取需生成渠道任务的目标客户群及营销案<marketCaseId：custGroupId,
			// <custGroupType,relatedDataSourceName>>
			try {
				channelMarketCaseAndCustGroupMap = taskProcessEntity.getChannelMarketCaseAndCustGroup();
			} catch (StrategyError e1) {
				log.info("====generateChannelTask===end===", "");
			}
			log.info("=====generateChannelTask====channelMarketCaseAndCustGroupMap=====",channelMarketCaseAndCustGroupMap);
			log.debug("channelMarketCaseAndCustGroupMap",channelMarketCaseAndCustGroupMap);
			if (!CommonUtils.objectIsNull(channelMarketCaseAndCustGroupMap)) {
				HiveContext hiveCtx = new HiveContext(sc);
				Set<String> marketCaseAndCustGroupSet = channelMarketCaseAndCustGroupMap.keySet();
				Set<String> taskSyn = new HashSet<String>();
				for (String marketCaseAndCustGroupStr : marketCaseAndCustGroupSet) {
					try{	
						String createSeq = SequenceUtil.getSequence();
						log.debug("channelMarketCaseAndCustGroupMap.marketCaseAndCustGroupStr=",marketCaseAndCustGroupStr);
						String[] marketCaseStrs = marketCaseAndCustGroupStr.split(Const.SEPARATOR_COLON);
						String marketCaseId = marketCaseStrs[0];
						String custGroupId = marketCaseStrs[1];
	
						log.debug("channelMarketCaseAndCustGroupMap.marketCaseId=",marketCaseId);
						log.info("channelMarketCaseAndCustGroupMap.marketCaseId=",marketCaseId);
						Map<String, String> custGroupTypeAndFormulaMap = channelMarketCaseAndCustGroupMap.get(marketCaseAndCustGroupStr);
						log.debug("generateChannelTask.custGroupTypeAndFormulaMap=",custGroupTypeAndFormulaMap);
						// 根据营销案ID查询营销案明细
						MarketCaseCachePojo marketCaseCachePojo = taskProcessEntity.getMarketCaseCachePojoById(marketCaseId);
						log.info("marketCaseCachePojo", marketCaseCachePojo);
	
						Map<String, Object> marketCaseBasicMap = marketCaseCachePojo.getMarketCaseMap();
						String sql = taskProcessEntity.getCustGroupParseFormula(custGroupTypeAndFormulaMap);
						String regionCode = (String) marketCaseBasicMap.get("regionCode");
						String custGroupType = "";
						for (Map.Entry<String, String> entry : custGroupTypeAndFormulaMap.entrySet()) {
							custGroupType = entry.getKey();
						}
						if (Const.CUSTGROUP_TYPE_LABEL.equals(custGroupType)&& !"0".equals(regionCode)&& !CommonUtils.objectIsNull(regionCode)) {
							sql += " and latn_id = " + regionCode;
						}
						hiveCtx.sql("use clzxdb");
						System.out.println("===========sql=====" + sql);
						// hiveCtx.sql("use zjcoc");
						// 查询目标客户群明细
						DataFrame dataFrame = hiveCtx.sql(sql);
						Map<String, Object> tempInParam = new HashMap<String, Object>();
						tempInParam.put("marketCaseId", marketCaseId);
						tempInParam.put("custGroupId", custGroupId);
						tempInParam.put("createSeq", createSeq);
						taskSyn.add(createSeq);
						int count = 0;
						for (Row row : dataFrame.javaRDD().collect()) {
							String idNo = row.getString(0);
							tempInParam.put("idNo", idNo);
							taskProcessEntity.generateChannelTask(tempInParam,marketCaseCachePojo);
							count++;
						}
						log.info("=============count=====", count);
						
					} catch (StrategyError e) {
						e.printStackTrace();
						log.error("====generateChannelTask===marketCaseAndCustGroupStr==error===", marketCaseAndCustGroupStr);
					}
				}
				// 加载同步信息到缓存
				Map<String, Object> tempInParam = new HashMap<String, Object>();
				tempInParam.put("taskSyn", taskSyn);
				try {
					taskProcessEntity.addChannelTaskSynCache(tempInParam);
				} catch (StrategyError e) {
					e.printStackTrace();
					log.error("====generateChannelTask===addChannelTaskSynCache==error===", taskSyn);
				}
			}
		} while (channelMarketCaseAndCustGroupMap != null&& !channelMarketCaseAndCustGroupMap.isEmpty());

	    Date end = new Date();
	    log.info("====generateChannelTask   startTime==========", start);
	    log.info("====generateChannelTask   endTime==========", end);
	}
	
	/**
	 * 生成外呼任务
	* @date: 2017-3-16 
	* @author: sunliang 
	* @title: generateCallTask  
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void generateCallTask(String outPath){
		
		System.out.println("====generateCallTask.start==========");
		sparkAppProp.setSparkAppProp(Const.SPARK_APPNAME_GENERATECALLTASK);
		String appName = sparkAppProp.getAppName();
		SparkConf conf = new SparkConf().setAppName(appName);
	    JavaSparkContext sc = new JavaSparkContext(conf);
		
		try {
			Map<String, Map<String, String>> callMarketCaseAndCustGroupMap = null;
			do {
				System.out.println("====generateCallTask.callMarketCaseAndCustGroupMap0==========");
				callMarketCaseAndCustGroupMap = taskProcessEntity.getWaitCreateCallTaskMarketCase();
				System.out.println("====generateCallTask.callMarketCaseAndCustGroupMap1==========" + callMarketCaseAndCustGroupMap);
				
				if(callMarketCaseAndCustGroupMap != null && !callMarketCaseAndCustGroupMap.isEmpty()){
					
					HiveContext hiveCtx = new HiveContext(sc);
					for(Map.Entry<String, Map<String,String>> waitCreateCallTaskMarketCase : callMarketCaseAndCustGroupMap.entrySet()){
				    	
						String marketCaseAndCustGroupStr = waitCreateCallTaskMarketCase.getKey();
						System.out.println("====generateCallTask.marketCaseAndCustGroupStr==========" + marketCaseAndCustGroupStr);
				    	String[] marketCaseStrs = marketCaseAndCustGroupStr.split(Const.SEPARATOR_COLON);
				    	marketCaseId = marketCaseStrs[0];
				    	custGroupId = marketCaseStrs[1];
				    	System.out.println("====generateCallTask.marketCaseId==========" + marketCaseId);
				    	System.out.println("====generateCallTask.custGroupId==========" + custGroupId);
				    	Map<String,String> custGroupTypeAndFormulaMap = waitCreateCallTaskMarketCase.getValue();
				    	marketCaseCachePojo = taskProcessEntity.getMarketCaseCachePojoById(marketCaseId);
				    	System.out.println("====generateCallTask.marketCaseCachePojo.getMarketCaseMap()==========" + marketCaseCachePojo.getMarketCaseMap());
				    	contentMap = taskProcessEntity.getCallContentMap(marketCaseCachePojo,marketCaseId,custGroupId);
				    	System.out.println("====generateCallTask.contentMap==========" + contentMap);
				    	hiveCtx.sql("use " + hiveDBName.getHiveDatabase());
				    	String sql = taskProcessEntity.getCustGroupParseFormula(custGroupTypeAndFormulaMap);
				    	System.out.println("====generateCallTask.sql==========" + sql);
				    	DataFrame dataFrame = hiveCtx.sql(sql);
				    	
					    JavaRDD<Text> javaRDD = dataFrame.toJavaRDD().map(
					    	new Function<Row,Text>(){
					    		public Text call(Row r){
					    			String phoneNo = r.getString(1);
							    	Map<String,Object> tempParam = new HashMap<String,Object>();
					    			tempParam.put("phoneNo", phoneNo);
					    			tempParam.put("contentMap", contentMap);
					    			String retStr = null;
									try {
										retStr = taskProcessEntity.generateCallTask(tempParam);
									} catch (StrategyError e) {
										e.printStackTrace();
									}
					    			return new Text(retStr);
					    		}
					    	}
						);
					    String newPath = outPath + "/" + marketCaseId + "/" + custGroupId;
					    System.out.println("====generateCallTask.newPath==========" + newPath);    
						javaRDD.saveAsTextFile(newPath);
					}
				}
				
			} while (callMarketCaseAndCustGroupMap != null && !callMarketCaseAndCustGroupMap.isEmpty());
		}catch (StrategyError e) {
			e.printStackTrace();
		}
		
		System.out.println("====generateCallTask.end==========");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		String taskType = args[0];
		String outPath = args[1];
		if("batchPushMsg".equals(taskType)){
			SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_NOSQL);
			GenerateTask generateTask = (GenerateTask)springBeanFactory.getBean("generateTask");
			generateTask.generateBatchPushTask(taskType,outPath);
		}else if("batchPushProd".equals(taskType)){
			SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_NOSQL);
			GenerateTask generateTask = (GenerateTask)springBeanFactory.getBean("generateTask");
			generateTask.generateBatchPushTask(taskType,outPath);
		}else if("channel".equals(taskType)){
			SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_NOSQL);
			GenerateTask generateTask = (GenerateTask)springBeanFactory.getBean("generateTask");
			generateTask.generateChannelTask();
		}else if("call".equals(taskType)){
			SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_NOSQL);
			GenerateTask generateTask = (GenerateTask)springBeanFactory.getBean("generateTask");
			generateTask.generateCallTask(outPath);
		}
	}
	
}
