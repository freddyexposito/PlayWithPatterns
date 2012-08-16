package org.structural.bridge;
/**
 *                     --- WRONG ---
 *                         Shape
 *                  /                  \
 *         Rectangle                    Line
 *        /         \                 /      \
 *  BlueRectangle  RedRectangle   BlueLine  RedLine
 *
 *                     --- RIGHT ---
 *               Shape                      Color
 *            /        \                    /   \
 *  Rectangle(Color)  Line(Color)        Blue   Red  
 * @author FExposito
 *
 */
public class BridgeDemo {
	public static void main(String[] args) {
		Shape line = new Line(new Red());
		System.out.println(line.drawWithColor(3,5, 8, 16));
		
		Shape rectangle  = new Rectangle(new Green());
		System.out.println(rectangle.drawWithColor(6, 8, 78, 67));
	}
	
}
