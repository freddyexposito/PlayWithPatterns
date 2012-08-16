package org.behavioral.state;


public class UpperState implements State {

	
	private UpperState(){}
	
	private static class UpperStateLoader{
		private static UpperState instance = new UpperState();
	}
	
	public static UpperState getInstance(){
		return UpperStateLoader.instance;
	}
	
	@Override
	public void write(StateContext context, String name) {
		System.out.println(name.toUpperCase());
		//Switch can be made in the context
		context.setState(LowerState.getInstance());
	}

}
