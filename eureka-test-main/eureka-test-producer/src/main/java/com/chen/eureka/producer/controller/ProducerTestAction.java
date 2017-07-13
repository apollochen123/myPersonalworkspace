package com.chen.eureka.producer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
@RestController
public class ProducerTestAction {
	@Autowired
	private EurekaClient eurekaClient;
	@Autowired
	private DiscoveryClient discoverClient;
	
	@RequestMapping("/serverip")
	public String hello(){
		InstanceInfo instance = eurekaClient.getNextServerFromEureka("EUREKA-TEST-PRODUCER", false);
		return instance.getHomePageUrl();
	}
	@RequestMapping("/getServices")
	public String hello2(){
		List<String> instance = discoverClient.getServices();
		return instance.toString();
	}
}
