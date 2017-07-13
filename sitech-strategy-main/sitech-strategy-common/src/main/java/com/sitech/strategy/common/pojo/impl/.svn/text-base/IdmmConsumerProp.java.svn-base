package com.sitech.strategy.common.pojo.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ibatis.common.resources.Resources;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.JsonUtil;
import com.sitech.strategy.common.utils.PropertiesUtil;

public class IdmmConsumerProp {
	private static Log log = LogFactory.getLog(IdmmConsumerProp.class);
	public static String brokerURL = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IDMM, "idmm.consumser.brokerURL");
	public static String logEncoding = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IDMM, "idmm.log.encoding");
	public static String consumerLogDir = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IDMM, "idmm.consumer.log.dir");
	public static List<IdmmTopicConfig> iDmmTopicConfigList;
	
	
	public static synchronized void getIdmmTopicConfigList(String filename) {
		List<IdmmTopicConfig> dmmConfigList = null;
		try {
			dmmConfigList = JsonUtil.JsonStrToIdmmTopicConfigList(Resources.getResourceAsReader(filename),IdmmTopicConfig.class);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		iDmmTopicConfigList = dmmConfigList;
	}
	
	
	public static void main(String args[]){
		getIdmmTopicConfigList("Idmm_FeeEventReceiver.config");
		for(int i=0;i<iDmmTopicConfigList.size();i++){
			IdmmTopicConfig idmmTopicConfig = (IdmmTopicConfig)iDmmTopicConfigList.get(i);
			System.out.print(idmmTopicConfig.getClientID() +"   "+idmmTopicConfig.getTopic());
			System.out.println("");
		}
	}
}
