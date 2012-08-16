package org.structural.bridge;


public abstract class Shape {
	private Color color;
	
	public Shape(Color color) {
		this.color = color;
	}

	public abstract String draw(int x1, int y1, int x2, int y2);
	
	public String drawWithColor(int x1, int y1, int x2, int y2){
		return draw(x1, y1, x2, y2) + " in " +  color.getColor();
	}
}
