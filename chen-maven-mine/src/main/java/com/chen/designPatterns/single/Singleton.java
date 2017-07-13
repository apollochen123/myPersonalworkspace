package com.chen.designPatterns.single;

public class Singleton {
	//懒汉式，需要注意线程安全问题
	public static Singleton singleton = null;
	
	private Singleton(){
		System.out.println("正在进行构造函数");
	}
//	想要线程安全可以加锁，双重检查锁定。但是会降低对象的获取速度
	public synchronized static Singleton getInstance(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	//线程不安全
	public static Singleton getInstance3(){
		if(singleton == null){
			singleton = new Singleton();
		}
		return singleton;
	}
	//解决线程安全还可以使用内部静态类
	private static class SingletonHander{
		private static final Singleton INSTANCE = new Singleton();
	}
    public static final Singleton getInstance2(){    
        return SingletonHander.INSTANCE;    
    } 
}
