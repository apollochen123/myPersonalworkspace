package com.chen.designPatterns.Proxy;

public class AOPTest {
	public static void main(String[] args){
		Image img = new ImageImp();
		Image imgProxy = (Image) AOProxyFactory.getProxy(img);
		imgProxy.show();
	}
}
