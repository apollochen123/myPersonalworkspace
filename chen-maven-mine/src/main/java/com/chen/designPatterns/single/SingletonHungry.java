package com.chen.designPatterns.single;

public class SingletonHungry {
	public static final SingletonHungry INSTENCE = new SingletonHungry();
	private SingletonHungry(){
		System.out.println("构造函数开始");
	}
	public static SingletonHungry getInstance(){
		return INSTENCE;
	}
}
