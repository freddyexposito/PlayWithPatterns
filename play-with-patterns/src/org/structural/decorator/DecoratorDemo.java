package org.structural.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		Icecream icecream = new HoneyDecorator(new NuttyDecorator(new SimpleIcecream()));
		System.out.println(icecream.makeIceCream());
	}
}
