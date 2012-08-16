package org.structural.decorator;

public class IcecreamDecorator implements Icecream {

	protected Icecream icecream;
	
	public IcecreamDecorator(Icecream icecream) {
		this.icecream = icecream;
	}

	@Override
	public String makeIceCream() {
		return icecream.makeIceCream();
	}
}
