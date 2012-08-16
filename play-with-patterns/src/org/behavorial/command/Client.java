package org.behavorial.command;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StockTrade stockTrade = new StockTrade();
		BuyStockCommand buyStockCmd = new BuyStockCommand(stockTrade);
		SellStockCommand sellStockCmd = new SellStockCommand(stockTrade);
		
		Agent agent = new Agent();
		agent.placeOrder(buyStockCmd);
		agent.placeOrder(sellStockCmd);
	}

}
