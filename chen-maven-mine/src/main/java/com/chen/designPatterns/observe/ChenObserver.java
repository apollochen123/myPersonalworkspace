package com.chen.designPatterns.observe;

public class ChenObserver implements Observer{
	private String ObserverName;
	public ChenObserver(String name){
		ObserverName= name;
	}
	public String getObserverName() {
		return ObserverName;
	}

	public void setObserverName(String observerName) {
		ObserverName = observerName;
	}

	public void update(Observable o, Object arg) {
		System.out.println("订阅者"+ObserverName+"接收到消息:"+arg);
	}
}
