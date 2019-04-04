package market;

import org.json.JSONArray;
import org.json.JSONObject;

public class Currency {
	
	private int currency = 0;
	private int delayedMarketPrice = 0;
	private int lastPrice = 0;
	private int buyPrice = 0;
	private int sell = 0;
	private String symbol = "";
	

	public Currency(JSONObject jsonObj) {
		
	
	}
	
	
	public int getCurrency() {
		return currency;
	}
	public void setCurrency(int currency) {
		this.currency = currency;
	}
	public int getDelayedMarketPrice() {
		return delayedMarketPrice;
	}
	public void setDelayedMarketPrice(int delayedMarketPrice) {
		this.delayedMarketPrice = delayedMarketPrice;
	}
	public int getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(int lastPrice) {
		this.lastPrice = lastPrice;
	}
	public int getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(int buyPrice) {
		this.buyPrice = buyPrice;
	}
	public int getSell() {
		return sell;
	}
	public void setSell(int sell) {
		this.sell = sell;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	} 
	
}
