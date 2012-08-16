package org.behavioral.mediator;

import java.util.LinkedList;
import java.util.List;

public class ConcreteMediator implements Mediator {

	private List<Colleague> colleagues;

	public ConcreteMediator() {
		colleagues = new LinkedList<>();
	}

	public void addColleague(Colleague colleague) {
		colleagues.add(colleague);
	}

	public void sendMessage(String message, Colleague colleague) {
		for(Colleague colIt: colleagues){
			if(!colIt.equals(colleague)){
				colIt.recieve(message);
			}
		}
		
	}

}
