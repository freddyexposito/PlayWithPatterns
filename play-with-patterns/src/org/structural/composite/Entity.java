package org.structural.composite;

abstract class Entity {
	protected static StringBuffer indent = new StringBuffer();

	public abstract void traverse();
}
