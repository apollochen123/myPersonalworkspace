package com.stxia.StxiaMQ.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.aliyun.openservices.ons.api.Producer;
import com.stxia.StxiaMQ.servce.ONSSendMsg;
import com.stxia.StxiaMQ.util.StxiaConfig;
import org.apache.log4j.Logger;
@Controller
@RequestMapping(value="/javaSend")
public class StxiaMQTTAction {
	private static Logger log = Logger.getLogger(StxiaMQTTAction.class); 
	@Autowired
	Producer producer;
    //value={"/homer","h"}可以定义多个返回视图
    
	/**
	 * 接收PID，二级Topic：tag，唯一ClientID，信息，
	 * @param producerId   
	 * @param tag
	 * @param targetClientId
	 * @param SendMsg
	 * @return
	 * @throws InterruptedException 
	 */
	@RequestMapping(value="/doSend")
	@ResponseBody
    public String test(
    		@RequestParam("passwd") String passwd,
    		@RequestParam(value="tag",
    		              required=false,
    		              defaultValue="p2p") String tag,
    		@RequestParam("CId") String targetClientId,
    		@RequestParam(value="Msg" ,
    		              required=false,
		                  defaultValue="no msg") String SendMsg) {
		if(StxiaConfig.PASSWD.equals(passwd)){
	    	//获取一个ONSSendMsg对象用于发送
			ONSSendMsg onsSendMsg=new ONSSendMsg();
			onsSendMsg.setProducer(producer);
			onsSendMsg.setTag(tag);
			onsSendMsg.setTargetClientId(targetClientId);
			onsSendMsg.setSendMsg(SendMsg);
			String result = null;
			try {
				result =onsSendMsg.send();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			log.info(result);
			return result;
		}
		String re = "passwd error";
		log.info(re);
		return re;
   }
}
