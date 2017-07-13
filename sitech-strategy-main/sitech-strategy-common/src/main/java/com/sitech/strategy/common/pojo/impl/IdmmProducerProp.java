package com.sitech.strategy.common.pojo.impl;

import com.sitech.strategy.common.base.BaseClass;
import com.sitech.strategy.common.utils.Const;
import com.sitech.strategy.common.utils.PropertiesUtil;

public class IdmmProducerProp extends BaseClass{
	public static int maxTotalPerKey = Integer.parseInt(PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IDMM, "idmm.producer.maxTotalPerKey"));
	public static String brokerURL = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IDMM, "idmm.producer.brokerURL");
	public static String clientID = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IDMM, "idmm.producer.clientID");
	public static String logEncoding = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IDMM, "idmm.log.encoding");
	public static String logWritesize = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IDMM, "idmm.log.writesize");
	public static String producerLogDir = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IDMM, "idmm.producer.log.dir");
	public static String username = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IDMM, "idmm.producer.userName");
	public static String password = PropertiesUtil.getProperty(Const.PROPERTIES_FILE_NAME_IDMM, "idmm.producer.password");
	
}
