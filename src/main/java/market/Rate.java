package market;

public class Rate {
	
	Float bitcoin;
	String currency;
	String value;
	
	public Float getBitcoin() {
		return bitcoin;
	}
	public void setBitcoin(Float bitcoin) {
		this.bitcoin = bitcoin;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "Rate [bitcoin=" + bitcoin + ", currency=" + currency + ", value=" + value + "]";
	}

}
