package org.behavioral.visitor;

public class That implements Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String that(){
		return "THAT";
	}
	
	
}
