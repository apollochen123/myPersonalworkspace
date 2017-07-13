package com.chen.mine.chen_maven_mine;

import com.chen.mine.commonsUtil.RedisUtil;

public class MultithreadingTest implements Runnable{

	public static void main(String[] args) {
		Thread [] threads = new Thread[1000];
		for(int i=0;i<1000;i++){
			threads[i] =new Thread(new MultithreadingTest());
		}
		for(int i=0;i<1000;i++){
			threads[i].start();
		}
	}

	public void run() {
		incrTest();
	}
	public void incrTest(){
		RedisUtil res = RedisUtil.getInstence();
		System.out.println(res.incr("number"));
		
	}

}
