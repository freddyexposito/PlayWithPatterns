package org.behavorial.command;

/**
 * This class acts as Receiver in the Command pattern
 * @author FExposito
 *
 */
public class StockTrade {
	
	public void buy(){
		System.out.println("Buying a stock!!!");
	}
	
	public void sell(){
		System.out.println("Selling a stock!!!!");
	}
}
