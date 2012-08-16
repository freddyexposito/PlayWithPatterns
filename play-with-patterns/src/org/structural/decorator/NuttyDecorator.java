	package org.structural.decorator;

public class NuttyDecorator extends IcecreamDecorator {

	public NuttyDecorator(Icecream icecream) {
		super(icecream);
	}

	@Override
	public String makeIceCream() {
		return icecream.makeIceCream() + addNuts();
	}
	
	private String addNuts(){
		return " + nuts ";
	}
}
