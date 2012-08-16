package org.behavioral.state;

public class LowerState implements State {

	private LowerState(){}
	
	private static class LowerStateLoader{
		private static LowerState instance = new LowerState();
	}
	
	public static LowerState getInstance(){
		return LowerStateLoader.instance;
	}
	
	@Override
	public void write(StateContext context, String name) {
		System.out.println(name.toLowerCase());
		//Switching in the state, could be in the context depending of the app
		context.setState(UpperState.getInstance());
	}

}
