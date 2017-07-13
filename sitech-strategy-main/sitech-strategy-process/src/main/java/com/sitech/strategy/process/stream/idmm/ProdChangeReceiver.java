package com.sitech.strategy.process.stream.idmm;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sitech.strategy.common.pojo.impl.IdmmConsumerProp;
import com.sitech.strategy.common.pojo.impl.IdmmTopicConfig;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.persist.utils.idmm.DmmMultiThreadConsumer;
import com.sitech.strategy.persist.utils.idmm.DmmQueue;
import com.sitech.strategy.process.entity.inter.ICoupleBackProcessEntity;
import com.sitech.strategy.process.entity.param.inter.ICoupleBackReceiverParam;

/**
 * 产品订购消息接收
 * @date: 2017-4-12 
 * @author: wangdw
 * @title: ProdChangeReceiver 
 * @version: 1.0 
 * @description： 
 * update_version: update_date: update_author: update_note:
 */
public class ProdChangeReceiver extends Thread {
	private static Log log = LogFactory.getLog(ProdChangeReceiver.class);
	private Thread[] threadConsumers = new Thread[100];
	/**
	 * 反馈处理实体
	 */
	protected ICoupleBackProcessEntity coupleBackProcessEntity;
	/**
	 * 反馈参数处理实体
	 */
	protected ICoupleBackReceiverParam coupleBackReceiverParam;
	
	
	/**
	 * 
	* @date: 2017-4-14 
	* @author: zhangyw_crmpd
	* @title: setCoupleBackProcessEntity 
	* @param coupleBackProcessEntity 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCoupleBackProcessEntity(
			ICoupleBackProcessEntity coupleBackProcessEntity) {
		this.coupleBackProcessEntity = coupleBackProcessEntity;
	}
	/**
	 * 
	* @date: 2017-4-14 
	* @author: zhangyw_crmpd
	* @title: setCoupleBackReceiverParam 
	* @param coupleBackReceiverParam 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public void setCoupleBackReceiverParam(
			ICoupleBackReceiverParam coupleBackReceiverParam) {
		this.coupleBackReceiverParam = coupleBackReceiverParam;
	}

	/**
	 * 消息中间件接收处理
	 */
	public static void main(String[] args) throws NumberFormatException, InterruptedException {
		IdmmConsumerProp.getIdmmTopicConfigList("Idmm_ProdChangeReceiver.config");
		//加载延时
		Thread.sleep(10000);//十秒加载延时
		// 启动文件分析
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_PROCESS);
		ProdChangeReceiver prodChangeReceiver = (ProdChangeReceiver) springBeanFactory.getBean("prodChangeReceiverIdmm");
		prodChangeReceiver.start();
	
	}

	public void run() {
		new CheckDmmConsumer().start();
		
		String msg="";
		
		//性能压测若处理不过来可修改为多线程处理
		while(true){
			try {
				msg = DmmQueue.getWaitDealMessage();
				/*msg = "{                                                                           "
						+"    \"ROOT\": {                                                             "
						+"        \"HEADER\": {                                                       "
						+"            \"ROUTING\": {                                                  "
						+"                \"ROUTE_KEY\": \"10\",                                      "
						+"                \"ROUTE_VALUE\": \"13500938912\"                            "
						+"            },                                                              "
						+"            \"DB_ID\": \"B1\",                                              "
						+"            \"TRACE_ID\": \"04201704060002041018dx0000591233\",             "
						+"            \"KEEP_LIVE\": \"13500938912\",                                 "
						+"            \"CHANNEL_ID\": \"04\",                                         "
						+"            \"PHONE_NO\": \"13500938912\",                                  "
						+"            \"PARENT_CALL_ID\": \"B309267124007F65BE1CB4910308B79B\",       "
						+"            \"USERNAME\": \"\",                                             "
						+"            \"ENDUSRIP\": \"10.161.72.232\",                                "
						+"            \"PASSWORD\": \"\",                                             "
						+"            \"POOL_ID\": \"33\"                                             "
						+"        },                                                                  "
						+"        \"BODY\": {                                                         "
						+"            \"OPR_INFO\": {                                                 "
						+"                \"OP_CODE\": \"1018\",                                      "
						+"                \"ACTION_ID\": \"11040\",                                   "
						+"                \"ORDER_LINE_ID\": \"L17040600000060\"                      "
						+"            },                                                              "
						+"            \"TABLES\": [                                                   "
						+"                {                                                           "
						+"                    \"TABLENAME\": \"UR_USERPRC_INFO\",                     "
						+"                    \"DATARECORDS\": [                                      "
						+"                        {                                                   "
						+"                            \"COLS\": {                                     "
						+"                                \"OP_CODE\": \"1018\",                      "
						+"                                \"ORDER_DATE\": \"20170406000205\",         "
						+"                                \"STATE\": \"A\",                           "
						+"                                \"SERV_ORDER_ID\": \"L17040600000060\",     "
						+"                                \"REMARK\": \"\",                           "
						+"                                \"STATE_DATE\": \"20170406000205\",         "
						+"                                \"PRODPRCINS_ID\": 60000316356791,          "
						+"                                \"CANCLE_SOURCE\": \"\",                    "
						+"                                \"LOGIN_ACCEPT\": 10000711214299,           "
						+"                                \"PRICING_ID\": 0,                          "
						+"                                \"EXP_DATE\": \"20170501000000\",           "
						+"                                \"PROD_ID\": \"22PAZ0837\",                 "
						+"                                \"PROD_PRCID\": \"22CAZ12443\",             "
						+"                                \"GROUP_ID\": 0,                            "
						+"                                \"RELPRCINS_ID\": 0,                        "
						+"                                \"PARPRC_ID\": \"0\",                       "
						+"                                \"DEVELOP_LOGIN\": \"\",                    "
						+"                                \"EFF_DATE\": \"20170406000205\",           "
						+"                                \"ID_NO\": 220910200015312143,              "
						+"                                \"PROD_MAIN_FLAG\": \"1\",                  "
						+"                                \"OP_TIME\": \"20170406000205\",            "
						+"                                \"TEAM_ID\": 0,                             "
						+"                                \"DATA_OPSOURCE\": \"\",                    "
						+"                                \"LOGIN_NO\": \"dx0000\",                   "
						+"                                \"FINISH_FLAG\": \"N\",                     "
						+"                                \"ORDER_SOURCE\": \"04\",                   "
						+"                                \"TRANPRCINS_ID\": 0,                       "
						+"                                \"ORDER_LOGINNO\": \"\"                     "
						+"                            },                                              "
						+"                            \"OP\": \"I\"                                   "
						+"                        }                                                   "
						+"                    ]                                                       "
						+"                }                                                           "
						+"            ]                                                               "
						+"        }                                                                   "
						+"    }                                                                       "
						+"}							";*/
				System.out.println(msg);
				Map<String,Object> inParam = coupleBackReceiverParam.receivePostageOrderInParam(msg);
				coupleBackProcessEntity.receivePostAgeOrder(inParam);
				
				
			} catch (Exception e) {
				log.error(e.getMessage(), e);
				log.error("msg:"+msg);
			}
		}
	}

	
	class CheckDmmConsumer extends Thread{
		
		public void run() {
			List<IdmmTopicConfig> consumerList =IdmmConsumerProp.iDmmTopicConfigList;
			IdmmTopicConfig dmmConfig = null;
			while (true) {
				try {
					log.debug("CheckDmmConsumer  start ========》》》》》》》》》》》》 ");
					int dmmSize = DmmQueue.dmmConsumerWaitDealQueue.size();
					log.debug("dmmQueue  size:"+dmmSize);
					
					if(consumerList != null && consumerList.size() > 0){
						int consumerSize = consumerList.size();
						log.debug("consumers  size:"+consumerSize);
						
						for (int i = 0; i < consumerSize; i++) {
							if (threadConsumers[i] != null && threadConsumers[i].isAlive()){
								log.debug("DmmMultiThread is Alive 》》》》》》》》》》》》 "+i);
								continue;
							}else{
								try{
									if(threadConsumers[i] != null){
										threadConsumers[i].interrupt();
									}
								}catch (Exception e) {
									e.printStackTrace();
								}
								
								threadConsumers[i]=null;
								
								log.debug("DmmMultiThread is start 》》》》》》》》》》》》 "+i);
								dmmConfig = consumerList.get(i);
								threadConsumers[i] = new Thread(new DmmMultiThreadConsumer(dmmConfig.getClientID(),
										dmmConfig.getTopic(), i));
								threadConsumers[i].setDaemon(true);
								sleep(3);
								threadConsumers[i].start();
							}
						}
					}
					
					log.debug("CheckDmmConsumer  end ========》》》》》》》》》》》》 ");
					Thread.sleep(30000);
				}catch (Exception e) {
					e.printStackTrace();
					log.error(e.getMessage(), e);
				}
			}
		}
	}
	
//	public void setBusiEventReceiverParam(
//			IBusiEventReceiverParam busiEventReceiverParam) {
//		this.busiEventReceiverParam = busiEventReceiverParam;
//	}
//
//	public void setBusiEventEntity(IBusiEventEntity busiEventEntity) {
//		this.busiEventEntity = busiEventEntity;
//	}
}
