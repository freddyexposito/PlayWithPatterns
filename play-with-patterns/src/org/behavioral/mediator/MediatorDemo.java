package org.behavioral.mediator;

public class MediatorDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mediator mediator = new ConcreteMediator();
		Colleague peter = new ConcreteColleague("Peter", mediator);
		mediator.addColleague(peter);
		
		Colleague john = new ConcreteColleague("John", mediator);
		mediator.addColleague(john);
		
		Colleague mary = new AnotherColleague("Mary", mediator);
		mediator.addColleague(mary);
		
		peter.send("I am hungry, give me something to eat");
		john.send("I want to be your friend");
		mary.send("Hi, I am Mary");
	}

}
