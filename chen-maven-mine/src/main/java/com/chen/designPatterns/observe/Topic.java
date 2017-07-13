package com.chen.designPatterns.observe;

public class Topic extends Observable {
	String massage;

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
		notifyObservers(massage);
	}
	
}
