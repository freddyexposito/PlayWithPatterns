package org.structural.bridge;

public class Line extends Shape {

	public Line(Color color) {
		super(color);
	}

	@Override
	public String draw(int x1, int y1, int x2, int y2) {
		return "Line from (" + x1 + ',' + y1 + ") to (" + x2 + ',' + y2 + ')';
	}

}
