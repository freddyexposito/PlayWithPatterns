package org.structural.adapter;

public class AdapterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape rectangle = new Rectangle();
		rectangle.draw(10, 15, 35, 65);
		
		Shape line = new Line();
		line.draw(10, 16, 36, 67);
	}

}
