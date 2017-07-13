package com.sitech.strategy.common.pojo.impl;

public class IdmmTopicConfig {
	private String clientID;//消息中间件的客户端id
	private String topic;//消息中间件的主题
	private String userName;//用户名
	private String password;//密码
	private String fluxNum;//流量
	public String getClientID() {
		return clientID;
	}
	public void setClientID(String clientID) {
		this.clientID = clientID;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFluxNum() {
		return fluxNum;
	}
	public void setFluxNum(String fluxNum) {
		this.fluxNum = fluxNum;
	}
	
	
}
