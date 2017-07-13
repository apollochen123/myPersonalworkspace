package com.chen.designPatterns.observe;

public class Obmain {

	public static void main(String[] args) {
		Topic topic1 = new Topic();
		Observer chen = new ChenObserver("chen");
		topic1.registObserver(chen);
		topic1.setMassage("666");
	}
}
