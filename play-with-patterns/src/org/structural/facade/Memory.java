package org.structural.facade;

public class Memory {
	public void load(long position, byte[] data) {
		System.out.println("Loading memory on position " + position);
	}
}
