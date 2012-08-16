package org.behavioral.mediator;

/**
 * Colleague that define base colleagues that will communicate through the Mediator.
 * @author FExposito
 *
 */
public abstract class Colleague {
	
	private String name;
	protected Mediator mediator;
	
	public Colleague(String name, Mediator mediator) {
		this.name = name;
		this.mediator = mediator;
	}

	public void send(String message){
		mediator.sendMessage(message, this);
	}
	
	public abstract void recieve(String message);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Colleague other = (Colleague) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
