package com.chen.designPatterns.strategy;

public class StrategyChoose {

	private Mystrategy strategy;
	public double getPrice(double p){
		if(strategy == null){
			strategy = new Strategy_5();
		}
		return this.strategy.disCut(p);
	}
	public void changeStrategy(Mystrategy strategy){
		this.strategy = strategy;
	}
	public static void main(String[] args) {
		StrategyChoose choose = new StrategyChoose();
		choose.changeStrategy(new Strategy_7());
		System.out.println(choose.getPrice(80.0));
	}

}
