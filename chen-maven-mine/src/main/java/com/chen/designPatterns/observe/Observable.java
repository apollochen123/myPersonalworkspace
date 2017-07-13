package com.chen.designPatterns.observe;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
	//观察者队列
	List<Observer> Observers = new ArrayList<Observer>();
	//注册观察者
	public void registObserver(Observer o){
		Observers.add(o);
	}
	//删除观察者
	public void removeObserver(Observer o){
		Observers.remove(o);
	}
	//通知改变
	public void notifyObservers(Object o){
		for(Observer ob:Observers){
			ob.update(this,o);
		}
	}
	
}
