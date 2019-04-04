package bitcoinInformation;

import java.util.ArrayList;

import BlockChainInformation.Transaction;

public class BitcoinInfo {
	
	private String address = "";
	private String n_tx = "";
	private String total_received = "";
	private String total_sent = "";
	private String final_balance = "";
	private ArrayList<Transaction> txs;
	
	public BitcoinInfo(String address, String n_tx, String total_received, String total_sent, String final_balance,
			ArrayList<Transaction> txs) {
		super();
		this.address = address;
		this.n_tx = n_tx;
		this.total_received = total_received;
		this.total_sent = total_sent;
		this.final_balance = final_balance;
		this.txs = txs;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public ArrayList<Transaction> getTxs() {
		return txs;
	}

	public void setTxs(ArrayList<Transaction> txs) {
		this.txs = txs;
	}

	@Override
	public String toString() {
		return "BitcoinInfo [address=" + address + ", n_tx=" + n_tx + ", total_received=" + total_received
				+ ", total_sent=" + total_sent + ", final_balance=" + final_balance + ", txs=" + txs + "]";
	}

}
