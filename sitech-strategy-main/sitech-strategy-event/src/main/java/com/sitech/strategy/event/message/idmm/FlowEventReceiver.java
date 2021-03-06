package com.sitech.strategy.event.message.idmm;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.sitech.strategy.common.pojo.impl.IdmmConsumerProp;
import com.sitech.strategy.common.pojo.impl.IdmmTopicConfig;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.SpringBeanFactory;
import com.sitech.strategy.event.entity.inter.IFlowEventEntity;
import com.sitech.strategy.event.entity.param.inter.IFlowEventReceiverParam;
import com.sitech.strategy.persist.utils.idmm.DmmMultiThreadConsumer;
import com.sitech.strategy.persist.utils.idmm.DmmQueue;

/**
 * 消息中间件消费者：流量类
* @date: 2017-2-10 
* @author: chenmy
* @title: FlowEventReceiver 
* @version: 1.0 
* @description： 
* update_version: update_date: update_author: update_note:
 */
public class FlowEventReceiver extends Thread{
	private static Log log = LogFactory.getLog(FlowEventReceiver.class);
	private Thread[] threadConsumers = new Thread[100];
	protected IFlowEventReceiverParam flowEventReceiverParam;
	protected IFlowEventEntity flowEventEntity;
	
	/**
	 * 消息中间件接收处理
	 */
	public static void main(String[] args) throws NumberFormatException, InterruptedException {
		IdmmConsumerProp.getIdmmTopicConfigList("Idmm_FlowEventReceiver.config");
		//加载延时
		Thread.sleep(10000);//十秒加载延时
		// 启动文件分析
		SpringBeanFactory springBeanFactory = new SpringBeanFactory(Const.BEAN_FILE_TYPE_EVENT);
		FlowEventReceiver flowEventReceiver = (FlowEventReceiver) springBeanFactory.getBean("flowEventReceiverIdmm");
		flowEventReceiver.start();
	
	}

	public void run() {
		new CheckDmmConsumer().start();
		
		String msg="";
		
		//性能压测若处理不过来可修改为多线程处理
		while(true){
			try {
				msg = DmmQueue.getWaitDealMessage();
				
				/**
				 * 调用业务处理方法
				 */
				
				log.debug("===============FlowEventReceiver=================");
				Map<String,Object> inMap = flowEventReceiverParam.receiveFlowEventInParam(msg);
				//System.out.println(msg);
				flowEventEntity.receiveFlowEvent(inMap);
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
	
	public void setFlowEventReceiverParam(
			IFlowEventReceiverParam flowEventReceiverParam) {
		this.flowEventReceiverParam = flowEventReceiverParam;
	}

	public void setFlowEventEntity(IFlowEventEntity flowEventEntity) {
		this.flowEventEntity = flowEventEntity;
	}
}
