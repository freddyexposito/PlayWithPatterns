package org.behavioral.state;

public class StateContext {

	private State state;

	public StateContext(State state) {
		this.state = state;
	}

	public void writeName(String name){
		state.write(this, name);
	}
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
