package com.chen.designPatterns.Proxy;

public class AOPTx {
	public void beginTx(){
		System.out.println("模拟事务开始");
	}
	public void endTx(){
		System.out.println("模拟事务结束");
	}

}
