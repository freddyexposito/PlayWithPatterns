package org.behavioral.mediator;

import java.text.MessageFormat;

public class AnotherColleague extends Colleague {

	public AnotherColleague(String name, Mediator mediator) {
		super(name, mediator);
	}

	@Override
	public void recieve(String message) {
		System.out.println(MessageFormat.format("{0} almost in same way received: {1}", getName(), message));

	}


}
