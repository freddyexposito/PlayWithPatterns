package org.behavorial.command;

/**
 * A concrete command for buying a stock.
 * @author FExposito
 *
 */
public class BuyStockCommand implements OrderCommand{

	private StockTrade stockTrade;
	
	public BuyStockCommand(StockTrade stockTrade) {
		this.stockTrade = stockTrade;
	}

	public void execute() {
		stockTrade.buy();
	}
}
