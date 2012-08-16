package org.behavioral.chainofresponsibility;

/**
 * Base class in the change of responsibilities.
 * @author FExposito
 *
 */
public abstract class Staff {

	private String name;
	private Staff boss;
	
	public Staff(String name, Staff boss) {
		this.name = name;
		this.boss = boss;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public Staff getBoss() {
		return boss;
	}

	public abstract void processRequest(Request request);

}
