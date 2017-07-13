package com.chen.designPatterns.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AOProxy implements InvocationHandler{
	//代理的对象
	private Object obj;
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		AOPTx tx = new AOPTx();
		tx.beginTx();
		Object result = method.invoke(obj, args);
		tx.endTx();
		return result;
	}
	
//	public Object invoke(Object obj,Method method,Object[] args) throws Exception{
//		AOPTx tx = new AOPTx();
//		tx.beginTx();
//		Object result = method.invoke(obj, args);
//		tx.endTx();
//		return result;
//	}
}
