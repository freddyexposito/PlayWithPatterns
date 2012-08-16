package org.behavioral.mediator;

import java.text.MessageFormat;

public class ConcreteColleague extends Colleague{

	public ConcreteColleague(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void recieve(String message) {
		System.out.println(MessageFormat.format("{0} received: {1}", getName(), message));
	}



}
