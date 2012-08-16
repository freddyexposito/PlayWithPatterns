package org.behavioral.mediator;

/**
 * Define Mediator actions
 * @author FExposito
 *
 */
public interface Mediator {

	void sendMessage(String message, Colleague colleage);

	void addColleague(Colleague colleague);
	
}
