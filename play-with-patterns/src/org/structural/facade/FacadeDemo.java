package org.structural.facade;

public class FacadeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Computer facade = new ComputerImpl();
		facade.startComputer();
	}

}
