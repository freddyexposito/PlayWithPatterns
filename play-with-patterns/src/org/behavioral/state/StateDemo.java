package org.behavioral.state;

public class StateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StateContext context = new StateContext(UpperState.getInstance());
		context.writeName("One");
		context.writeName("Two");
		context.writeName("Three");
		context.writeName("Four");
		context.writeName("Five");
		context.writeName("Six");
	}

}
