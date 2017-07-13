package com.chen.designPatterns.Proxy;

public class ImageImp implements Image{

	public void show() {
		System.out.println("展示一个大图片");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
