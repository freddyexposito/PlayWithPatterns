package org.behavorial.strategy;

public class AddStrategy implements Strategy {

	@Override
	public int execute(int x, int y) {
		return x + y;
	}

}
