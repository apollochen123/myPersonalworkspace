package com.sitech.strategy.persist.utils.idmm;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.pool2.KeyedObjectPool;
import org.apache.commons.pool2.impl.GenericKeyedObjectPool;
import org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig;

import com.sitech.crmpd.idmm2.client.MessageContext;
import com.sitech.crmpd.idmm2.client.api.Message;
import com.sitech.crmpd.idmm2.client.api.PropertyOption;
import com.sitech.crmpd.idmm2.client.api.PullCode;
import com.sitech.crmpd.idmm2.client.api.ResultCode;
import com.sitech.crmpd.idmm2.client.exception.OperationException;
import com.sitech.crmpd.idmm2.client.pool.PooledMessageContextFactory;
import com.sitech.strategy.common.pojo.impl.IdmmConsumerProp;

/**
 * 消息队列取短信线程
 */

public class DmmMultiThreadConsumer implements Runnable {
	private static Log log = LogFactory.getLog(DmmMultiThreadConsumer.class);
	private static final GenericKeyedObjectPoolConfig CONFIG = new GenericKeyedObjectPoolConfig();
	private static String brokerURL = IdmmConsumerProp.brokerURL;
	public static String logDir = IdmmConsumerProp.consumerLogDir;
	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");//格式化请求、返回时间

	
//	private int threadID=IdmmConsumerProp.threadID;
	
	static {
		//连接池大小
		CONFIG.setMaxTotalPerKey(50);
		CONFIG.setTestOnBorrow(true);		
	}
	

	private static final KeyedObjectPool<String, MessageContext> POOL = 
		new GenericKeyedObjectPool<String, MessageContext>(
			new PooledMessageContextFactory(brokerURL, 60000), CONFIG);

	private String clientID;
	private String topic;
	private int index;
	private MessageContext context = null;
	
	public DmmMultiThreadConsumer(String clientID, String topic, int index) throws OperationException {
		super();
		this.clientID = clientID;
		this.topic = topic;
		this.index = index;
	}
	
	private MessageContext getContext(){
		if(context == null){
			try{
				log.error("DmmMultiThreadConsumer context == null  ..."+index);
				context = POOL.borrowObject(clientID);
				Thread.sleep(3000);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return context;
	}
	
	public void run() {
		String lastMessageId = null;
		PullCode code = null;
		String description = "消费成功";
		boolean excep=false;
		DmmLogVo logVo = null;
		
		while (true) {
			try {
				excep=false;
				logVo=null;
				
				//如果获取会话为空  或者  待处理队列量大于9500（初始化的队列大小是10000），sleep 1秒。不取消息
				if (getContext() == null || DmmQueue.dmmConsumerWaitDealQueue.size()>=9500) {
					Thread.sleep(1000);
					continue;
				}
				
				//取数据取消息等待时间
				final Message message = context.fetch(topic,60,lastMessageId, code, description,false);
				log.debug("topic ==="+topic);
				final ResultCode resultCode = ResultCode.valueOf(message.getProperty(PropertyOption.RESULT_CODE));
				log.debug("resultCode ==="+resultCode);
				log.debug("resultCode == ResultCode.NO_MORE_MESSAGE is "+(resultCode == ResultCode.NO_MORE_MESSAGE));
				log.debug("==============begin fetch message ============");
				if (resultCode == ResultCode.NO_MORE_MESSAGE) {
					try {
						Thread.sleep(2000);
						log.debug(">>>>>>>>>>>>>>>>>>>>>>>NO_MORE_MESSAGE~NO_MORE_MESSAGE~NO_MORE_MESSAGE!!!!!!!!!!!!!!!!!");
						log.debug("sleep 3s");
					} catch (final InterruptedException e) {
						e.printStackTrace();
					}
					lastMessageId = null;
					code = null;
					description = null;
					continue;
				}
				
				lastMessageId = message.getId();
				logVo= new DmmLogVo();
				logVo.setReqTime(sdf.format(Calendar.getInstance().getTime()));
				logVo.setTopic(topic);
				logVo.setMsgId(lastMessageId);
				logVo.setMessage(message.getContentAsUtf8String());
				logVo.setMethodName("DmmConsumer");
				
				//消息放入待处理队列
				DmmQueue.inputWaitDealMessage(message.getContentAsUtf8String());
        		code = PullCode.COMMIT_AND_NEXT;
        		logVo.setRespTime(sdf.format(Calendar.getInstance().getTime()));
			} catch (Exception e) {
				log.error("DmmMultiThreadConsumer "+index,e);
				e.printStackTrace();
				excep=true;
			}finally{
				if(excep){
					try {
						POOL.returnObject(clientID, context);
						context=null;
						code = PullCode.ROLLBACK_AND_NEXT;
						description = null;
					
					} catch (final Exception e) {
						log.error("borrowObject error:"+e.getMessage(),e);
						context=null;
						code = PullCode.ROLLBACK_AND_NEXT;
						description = null;
					}
				}
				
				try{
					if (logVo!= null) {
//						System.out.println("logDir:"+logDir);
	    				ResultWriterThread.inputLogMap(logDir, logVo);
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
				try {
					Thread.sleep(5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}

