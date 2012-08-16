package org.behavioral.strategy;

public class StrategyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Strategy addStrategy = new AddStrategy();
		
		StrategyContext context = new StrategyContext(addStrategy);
		System.out.println(context.execute(11, 7));
		
		Strategy multiplyStrategy = new MultiplyStrategy();
		context.setStrategy(multiplyStrategy);
		System.out.println(context.execute(11, 7));

	}

}
