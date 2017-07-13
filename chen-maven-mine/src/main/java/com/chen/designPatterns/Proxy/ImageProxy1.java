package com.chen.designPatterns.Proxy;

public class ImageProxy1 implements Image{

	private Image image;
	//代理类可以在真正使用类的时候再初始化，hibernate延迟加载模式
	public void show() {
		if(image == null){
			image = new ImageImp();
		}
		image.show();
	}
}
