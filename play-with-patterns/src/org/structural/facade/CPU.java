package org.structural.facade;

public class CPU {
	public void freeze() {
		System.out.println("Freezing CPU");
	}

	public void jump(long position) {
		System.out.println("Jumping to " + position);
	}

	public void execute() {
		System.out.println("Excecuting CPU");
	}
}
