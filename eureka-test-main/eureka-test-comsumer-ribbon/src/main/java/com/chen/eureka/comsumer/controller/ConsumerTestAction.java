package com.chen.eureka.comsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerTestAction {
	@Autowired
	private RestTemplate restTemplate;
	@RequestMapping("/consumerTest")
	public String hello(){
		return "this is consumer";
	}
	@RequestMapping("/ribbonTest")
	public String getServerId(){
		return this.restTemplate.getForObject("http://eureka-test-producer/serverip", String.class);
	}
}
