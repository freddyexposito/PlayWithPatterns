package org.behavorial.strategy;

public class StrategyContext {
	private Strategy strategy;

	public StrategyContext(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	int execute(int x, int y){
		return strategy.execute(x, y);
	}
	
	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
}
