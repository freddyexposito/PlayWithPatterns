package org.behavioral.visitor;

public class This implements Element{

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public String thiss(){
		return "THIS";
	}

}
