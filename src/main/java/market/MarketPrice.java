package market;

public class MarketPrice {
	
	
	String fiveteenMinutes = "";
	String last = "";
	String buy = "";
	String sell = "";
	String symbol = "";
	
	
	
	public MarketPrice() {
		super();
	}


	public MarketPrice(String fiveteenMinutes, String buy, String sell, String symbol, String last) {
		super();
		this.fiveteenMinutes = fiveteenMinutes;
		this.last = last;
		this.buy = buy;
		this.sell = sell;
		this.symbol = symbol;
	}


	public String getFiveteenMinutes() {
		return fiveteenMinutes;
	}


	public void setFiveteenMinutes(String fiveteenMinutes) {
		this.fiveteenMinutes = fiveteenMinutes;
	}


	public String getLast() {
		return last;
	}


	public void setLast(String last) {
		this.last = last;
	}


	public String getBuy() {
		return buy;
	}


	public void setBuy(String buy) {
		this.buy = buy;
	}


	public String getSell() {
		return sell;
	}


	public void setSell(String sell) {
		this.sell = sell;
	}


	public String getSymbol() {
		return symbol;
	}


	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}


	@Override
	public String toString() {
		return "MarketPrice [fiveteenMinutes=" + fiveteenMinutes + ", last=" + last + ", buy=" + buy + ", sell=" + sell
				+ ", symbol=" + symbol + "]";
	}

}
