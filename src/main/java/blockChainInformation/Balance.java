package blockChainInformation;

public class Balance {
	
	String final_balance = "";
	String n_tx = "";
	String total_received = "";
	
	public Balance(String final_balance, String n_tx, String total_received) {
		
		this.final_balance = final_balance;
		this.n_tx = n_tx;
		this.total_received = total_received;
	}

	public String getFinal_balance() {
		return final_balance;
	}

	public void setFinal_balance(String final_balance) {
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

	@Override
	public String toString() {
		return "Balance [final_balance=" + final_balance + ", n_tx=" + n_tx + ", total_received=" + total_received
				+ "]";
	}	

}
