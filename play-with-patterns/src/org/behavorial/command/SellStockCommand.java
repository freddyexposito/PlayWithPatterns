package org.behavorial.command;

/**
 * A concrete command for selling a stock.
 * @author FExposito
 *
 */
public class SellStockCommand implements OrderCommand {

	private StockTrade stockTrade;
	
	public SellStockCommand(StockTrade stockTrade) {
		this.stockTrade = stockTrade;
	}

	public void execute() {
		stockTrade.sell();
	}

}
