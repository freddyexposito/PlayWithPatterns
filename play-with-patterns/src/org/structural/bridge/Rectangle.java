package org.structural.bridge;

public class Rectangle extends Shape {

	public Rectangle(Color color) {
		super(color);
	}

	@Override
	public String draw(int x1, int y1, int x2, int y2) {
		return "Rectangle from (" + x1 + ',' + y1 + ") to (" + x2 + ',' + y2 + ')';
	}

}
