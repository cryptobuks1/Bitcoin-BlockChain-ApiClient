package BlockChainInformation;

public class SpendingOutpoint {
	
	
	private String n = "";
	private String tx_index = "";
	
	
	public SpendingOutpoint(String n, String tx_index) {
		super();
		this.n = n;
		this.tx_index = tx_index;
	}


	public String getN() {
		return n;
	}


	public void setN(String n) {
		this.n = n;
	}


	public String getTx_index() {
		return tx_index;
	}


	public void setTx_index(String tx_index) {
		this.tx_index = tx_index;
	}


	@Override
	public String toString() {
		return "SpendingOutpoint [n=" + n + ", tx_index=" + tx_index + "]";
	}
}
