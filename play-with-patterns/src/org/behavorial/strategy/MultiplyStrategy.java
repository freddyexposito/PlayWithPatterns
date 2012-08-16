package org.behavorial.strategy;

public class MultiplyStrategy implements Strategy {

	@Override
	public int execute(int x, int y) {
		return x * y;
	}

}
