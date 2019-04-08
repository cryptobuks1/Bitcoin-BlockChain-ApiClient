package market;


public class Exchange {
	
	private String symbol;
	private MarketPrice currencyValue;
	
	public Exchange(String symbol, MarketPrice currencyValue) {
		super();
		this.symbol = symbol;
		this.currencyValue = currencyValue;
	}
	
	

	public Exchange() {
		super();
	}



	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public MarketPrice getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(MarketPrice currencyValue) {
		this.currencyValue = currencyValue;
	}

	@Override
	public String toString() {
		return "Exchange [symbol=" + symbol + "]";
	}
	
}
