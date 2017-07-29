package com.chen.eureka.producer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chen.eureka.producer.model.User;
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
	@RequestMapping("/getUser")
	public User getUser(){
		User user = new User("110" , "Producer的张三" , "黄土高坡");
		System.out.println("我已经生产了一个User"+user);
		return user;
	}
	@RequestMapping("/getUser/{id}")
	public User getUser(@PathVariable("id") String id){
		User user = new User(id , "Producer的张三" , "黄土高坡");
		System.out.println("我已经生产了一个User"+user);
		return user;
	}
}
