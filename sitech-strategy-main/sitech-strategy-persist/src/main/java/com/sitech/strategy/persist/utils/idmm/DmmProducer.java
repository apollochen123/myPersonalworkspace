package com.sitech.strategy.persist.utils.idmm;

import java.util.Calendar;
import java.text.SimpleDateFormat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.pool2.KeyedObjectPool;
import org.apache.commons.pool2.impl.GenericKeyedObjectPool;
import org.apache.commons.pool2.impl.GenericKeyedObjectPoolConfig;

import com.google.common.base.Strings;
import com.sitech.crmpd.idmm2.client.MessageContext;
import com.sitech.crmpd.idmm2.client.api.Message;
import com.sitech.crmpd.idmm2.client.api.PropertyOption;
import com.sitech.crmpd.idmm2.client.exception.OperationException;
import com.sitech.crmpd.idmm2.client.pool.PooledMessageContextFactory;
import com.sitech.strategy.common.pojo.impl.IdmmProducerProp;

public class DmmProducer {
	public static Log log = LogFactory.getLog(DmmProducer.class);
	public static int maxTotalPerKey = IdmmProducerProp.maxTotalPerKey;
	public static String brokerURL = IdmmProducerProp.brokerURL;
	public static String clientID = IdmmProducerProp.clientID;
	public static String logDir = IdmmProducerProp.producerLogDir;
	public static SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");//格式化请求、返回时间
	//private static String username = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IDMM, "idmm.producer.userName");
	//private static String password = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IDMM, "idmm.producer.password");
	private static final GenericKeyedObjectPoolConfig CONFIG = new GenericKeyedObjectPoolConfig();
	
	static{
		CONFIG.setMaxTotalPerKey(maxTotalPerKey);
		CONFIG.setTestOnBorrow(true);
	}
	
	private static final KeyedObjectPool<String, MessageContext> POOL = new GenericKeyedObjectPool<String, MessageContext>(
			new PooledMessageContextFactory(brokerURL, 60000), CONFIG);

	DmmProducer(String clientID, String topic) throws OperationException {
		super();
		this.clientID = clientID;
	}
	
	/**
	 * 
	* @date: 2017-2-9 
	* @author: chenmy
	* @title: send 
	* @param topic  -- 主题
	* @param msg    -- 请求报文
	* @param phoneNo  -- 手机号
	* @param isSplitTopic  -- 是否是拆分主题：目前只有短信和实时营销消费主题是拆分主题的，此值为true，其他均为false
	* @return 
	* @exception: 
	* @version: 1.0 
	* @description: 
	* update_version: update_date: update_author: update_note:
	 */
	public static String send(String topic, String msg ,String phoneNo , boolean isSplitTopic){
		DmmLogVo dmmLogVo = new DmmLogVo();
		Message message = null;
		String phoneSub  = null;
		String id = null;
		MessageContext context = null;
		try {
			dmmLogVo.setReqTime(sdf.format(Calendar.getInstance().getTime()));//日志设置请求时间
			dmmLogVo.setPhoneNo(phoneNo);//日志设置手机号时间
			dmmLogVo.setTopic(topic);//日志设置消息中间件主题
			dmmLogVo.setMessage(msg);//日志设置请求报文
			dmmLogVo.setMethodName("DmmProducer");//日志设置生产者or消费者日志
			if (Strings.isNullOrEmpty(clientID) || Strings.isNullOrEmpty(topic)) {
				log.error("[clientID | topic] must be set!");
				return "error,clientID and topic must be set";
			}
			if(phoneNo != null|| !"".equals(phoneNo) ){
				   phoneSub = phoneNo.substring(phoneNo.length()-2, phoneNo.length());
			}
			message = Message.create(msg);
			message.setProperty(PropertyOption.GROUP, phoneNo);
			if(isSplitTopic){//是否拆分主题，如果拆分主题，message中增加参数
				message.setProperty(PropertyOption.PRIORITY, 1000);//1-10
				final PropertyOption<String> MESSAGE_PART = PropertyOption.valueOf("msg_part");//消费者拆分多主题的特殊属性
				message.setProperty(MESSAGE_PART,phoneSub);//消费者拆分多主题的特殊属性
			}
			context = POOL.borrowObject(clientID);
			id = context.send(topic, message);
			dmmLogVo.setMsgId(id);//日志设置消息id
			if (id!=null) {
				context.commit(id);
			}
			dmmLogVo.setRespTime(sdf.format(Calendar.getInstance().getTime()));//日志设置返回时间
		} catch (Exception e) {
			log.error(e.getMessage(),e);
			log.error("====>>>>>>> message topic == "+topic+"::::: message === "+message.getContentAsUtf8String());
		}finally{
			try {
				POOL.returnObject(clientID, context);
				context=null;
			} catch (final Exception e) {
				log.error(e.getMessage(),e);
				context=null;
			}
			ResultWriterThread.inputLogMap(logDir, dmmLogVo);
		}
		return id;
	}
	
	public static void main(String args[]){

		for(int i = 0;i<1;i++){
			/*String msg = "{\"ROOT\":" +
					"{\"HEADER\":" +
						"{\"TRACE_ID\":\"600020150511092718912221\"," +
							"\"PARENT_CALL_ID\":\"D46B1571DC341DB1A2C82C305F067999\"," +
							"\"KEEP_LIVE\":\"\"" +
						"}," +
					   "\"BODY\":{" +
					   		"\"SYSID\":\"6\"" +
					   		",\"SEQ\":\"\"," +
					   		"\"TEMPLATEID\":\"11020002\"," +
					   		"\"PARAMS\":{" +
					   			"\"USER_NAME\":\"陈明烨\","+
					   			"\"PASSWORD\":\"123456\"" +
					   		 "}," +
					   		 "\"SERVICENO\":\"1234567890123456789"+i+"\"," +
					   		 "\"PHONENO\":\"13654303279\"," +
					   		 "\"LOGINNO\":\"mnp\"," +
					   		 "\"SERVNO\":\"\"," +
					   		 "\"SERVNAME\":\"\"," +
					   		 "\"SUBPHONESEQ\":\"\"," +
					   		 "\"SENDTIME\":\"201702131000\"," +
					   		 "\"HOLD1\":\"0\"," +
					   		 "\"HOLD2\":\"\"," +
					   		 "\"HOLD3\":\"\"," +
					   		 "\"HOLD4\":\"\"," +
					   		 "\"HOLD5\":\"\"" +
					   	"}" +
					  "}" +
					"}"; */
//		msg="{	\"ROOT\": {		\"HEADER\": {			\"DB_ID\": \"A1\"		},		\"BODY\": {			\"OPR_INFO\": {				\"OP_CODE\": \"8208\",				\"OP_TIME\": \"20170208180020\",				\"LOGIN_NO\": \"ssXXs4kgt\",				\"ORDER_LINE_ID\": \"10031579173830\"			},			\"BUSI_CODE\": \"YXFYHB\",			\"BUSI_INFO\": {				\"INTERVAL_MONTH\": \"1\",				\"FIRST_EFF\": \"20170208010101\",				\"FEE_CODE\": \"NNNN\",				\"RULE_ID\": \"01\",				\"PAY_PATH\": \"98\",				\"ACT_ID\": \"0\",				\"ACT_TYPE\": \"2\",				\"RETURN_MONTH\": \"1\",				\"FEE_TYPE\": \"0\",				\"ID_NO\": \"220190200044295980\",				\"EXP_DATE\": \"20991231235959\",				\"PHONE_NO\": \"13756301045\",				\"PAY_TYPE\": \"8\",				\"MEANS_ID\": \"0\",				\"EXP_FLAG\": \"0\",				\"IS_PRINT\": \"N\",				\"PAY_METHOD\": \"8\",				\"RETURN_FEE\": \"500\",				\"CONTRACT_NO\": \"220190200044295981\"			}		}	}}";		
		String msg = "{\"ROOT\":{\"BODY\":{\"EVENT_ID\":\"10010001005\",\"PHONE_NO\":\"17843124020\",\"EVENT_SOURCE\":\"11\",\"REGION_CODE\":\"2201\"}}}";
//		String msg = "";
//		String msg = "{\"ROOT\":{\"BODY\":{\"EVENT_ID\":\"\",\"EVENT_VALUE\":\"1000\",\"PHONE_NO\":\"17843124020\",\"EVENT_SOURCE\":\"11\",\"REGION_CODE\":\"2201\"}}}";
//		String msg = "{\"EVENT_ID\":\"10010001\",\"PHONE_NO\":\"18686490813\",\"EVENT_TRIGGER_CHANNEL_ID\":\"02\",\"REGION_CODE\":\"2200\"}";
//		String result = DmmProducer.send("T166PayBusiOdr", msg, "13654303279", true);
//		String result = DmmProducer.send("T132GprsSyn", msg, "13654303279", true);
//		String result = DmmProducer.send("TEventSyn", msg, "18686490813", true);
		String result = DmmProducer.send("T132GprsSyn", msg, "17843124020", true);
//		String result = DmmProducer.send("TCoupleBack", msg, "13514484126", true);
		System.out.println(i+"= msgid:"+result);
		}
	}
}