package bitcoinInformation;

public class Wallet extends Currency {

	private String n_tx_filtered = "";
	
	public Wallet( String n_tx_filtered, String n_tx, String total_received, String total_sent, String final_balance) {
		super(n_tx, total_received, total_sent, final_balance);
		this.n_tx_filtered = n_tx_filtered;
		
	}

	public String getN_tx_filtered() {
		return n_tx_filtered;
	}

	public void setN_tx_filtered(String n_tx_filtered) {
		this.n_tx_filtered = n_tx_filtered;
	}

	@Override
	public String toString() {
		return "Wallet [n_tx_filtered=" + n_tx_filtered + "]";
	}

}
