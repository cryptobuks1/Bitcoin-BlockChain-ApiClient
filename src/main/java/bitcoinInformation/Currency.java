package bitcoinInformation;

public class Currency {

	public String n_tx = "";
	public String total_received = "";
	public String total_sent = "";
	public String final_balance = "";

	public Currency(String n_tx, String total_received, String total_sent, String final_balance) {
		super();
		this.n_tx = n_tx;
		this.total_received = total_received;
		this.total_sent = total_sent;
		this.final_balance = final_balance;
	}

	public String getN_tx() {
		return n_tx;
	}

	public void setN_tx(String n_tx) {
		this.n_tx = n_tx;
	}

	public String getTotal_received() {
		return total_received;
	}

	public void setTotal_received(String total_received) {
		this.total_received = total_received;
	}

	public String getTotal_sent() {
		return total_sent;
	}

	public void setTotal_sent(String total_sent) {
		this.total_sent = total_sent;
	}

	public String getFinal_balance() {
		return final_balance;
	}

	public void setFinal_balance(String final_balance) {
		this.final_balance = final_balance;
	}

}
