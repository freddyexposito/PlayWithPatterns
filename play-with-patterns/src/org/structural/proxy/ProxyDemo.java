package org.structural.proxy;

public class ProxyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Image image1 = new ProxyImage("Image1.png");
		Image image2 = new ProxyImage("Image2.jpg");
		
		image1.displayImage();
		image1.displayImage();
		image2.displayImage();

	}

}
