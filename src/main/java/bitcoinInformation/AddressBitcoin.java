package bitcoinInformation;

public class AddressBitcoin extends Currency {
	
	String address = "";
	String change_index = "";
	String account_index = "";
	
	public AddressBitcoin(String address, String n_tx, String total_received, String total_sent, String final_balance,
			String change_index, String account_index) {
		super(n_tx, total_received, total_sent, final_balance);
		this.address = address;
		this.change_index = change_index;
		this.account_index = account_index;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getChange_index() {
		return change_index;
	}

	public void setChange_index(String change_index) {
		this.change_index = change_index;
	}

	public String getAccount_index() {
		return account_index;
	}

	public void setAccount_index(String account_index) {
		this.account_index = account_index;
	}

	@Override
	public String toString() {
		return "AddressBitcoin [address=" + address + ", change_index=" + change_index + ", account_index="
				+ account_index + "]";
	}

	
}
