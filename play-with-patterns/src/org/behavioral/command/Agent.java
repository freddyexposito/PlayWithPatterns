package org.behavioral.command;

import java.util.LinkedList;
import java.util.List;

/**
 * This one acts as Invoker in the command pattern
 * @author FExposito
 *
 */
public class Agent {
	
	/**
	 * the command can be used for report, undo actions, etc.
	 */
	private List<OrderCommand> orders;
	
	public Agent() {
		orders = new LinkedList<OrderCommand>();
	}
	
	public void placeOrder(OrderCommand order){
		orders.add(order);
		order.execute();
	}
}
