package org.structural.decorator;

public class HoneyDecorator extends IcecreamDecorator {

	public HoneyDecorator(Icecream icecream) {
		super(icecream);
	}

	@Override
	public String makeIceCream() {
		return icecream.makeIceCream() + addHoney();
	}

	private String addHoney() {
		return " + honey ";
	}

}
