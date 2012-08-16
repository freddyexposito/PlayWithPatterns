package org.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Box extends Entity {
	private List<Entity> children = new ArrayList<Entity>();
	private int value;

	public Box(int val) {
		value = val;
	}

	public void add(Entity c) {
		children.add(c);
	}

	public void traverse() {
		System.out.println(indent.toString() + value);
		indent.append("   ");
		for (Entity entity : children) {
			entity.traverse();
		}
		indent.setLength(indent.length() - 3);
	}
}
