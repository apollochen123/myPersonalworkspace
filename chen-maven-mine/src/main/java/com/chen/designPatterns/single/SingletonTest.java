package com.chen.designPatterns.single;

public class SingletonTest implements Runnable{
	public static void main(String[] args) throws InterruptedException{
		long a = System.currentTimeMillis();
		Thread[] threads = new Thread[100];
		for(int i = 0;i<100;i++){
			threads[i] = new Thread(new SingletonTest());
			threads[i].start();
		}
		for(int i = 0;i<100;i++){
			threads[i].join();
		}
		long b =  System.currentTimeMillis() - a;
		System.out.println(b);
	}
	public void run() {
	    System.out.println(Singleton.getInstance3()); 
	}
}
