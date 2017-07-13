package com.stxia.StxiaMQ.util;

import java.util.Properties;

import org.springframework.stereotype.Controller;

import com.aliyun.openservices.ons.api.ONSFactory;
import com.aliyun.openservices.ons.api.Producer;
import com.aliyun.openservices.ons.api.PropertyKeyConst;

@Controller
public class MyProducerFactory {
	
	public static Producer getProd(){
		Properties properties=new Properties();
		properties.setProperty(PropertyKeyConst.ProducerId,StxiaConfig.PID);
		properties.setProperty(PropertyKeyConst.AccessKey,StxiaConfig.ACCESSKEY);
		properties.setProperty(PropertyKeyConst.SecretKey,StxiaConfig.SECRETKEY);
		Producer producer=ONSFactory.createProducer(properties);
		System.out.println("已经启动producer："+producer.toString());
		return producer;
	}

}
