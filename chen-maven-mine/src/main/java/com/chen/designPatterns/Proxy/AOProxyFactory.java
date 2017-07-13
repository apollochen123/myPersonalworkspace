package com.chen.designPatterns.Proxy;

import java.lang.reflect.Proxy;

public class AOProxyFactory {
	public static Object getProxy(Object obj){
		AOProxy proxy = new AOProxy();
		proxy.setObj(obj);
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),proxy);
	}
}
