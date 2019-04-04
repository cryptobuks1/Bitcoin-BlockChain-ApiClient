package blockChainInformation;

import java.util.ArrayList;

public class TransactionData {
	
	private String ver = "";
	private ArrayList<Input> inputs;
	private String weight = "";
	private String block_height = "";
	private String relayed_by = "";
	private ArrayList<PreviousOutput> out;
	private String lock_time = "";
	private String size = "";
	private boolean double_spend = false;
	private String block_index = "";
	private String time = "";
	private String tx_index = "";
	private String vin_sz = "";
	private String hash = "";
	private String vout_sz = "";
	
	
	public TransactionData(String ver, ArrayList<Input> inputs, String weight, String block_height, String relayed_by,
			ArrayList<PreviousOutput> out, String lock_time, String size, boolean double_spend, String block_index,
			String time, String tx_index, String vin_sz, String hash, String vout_sz) {
		super();
		this.ver = ver;
		this.inputs = inputs;
		this.weight = weight;
		this.block_height = block_height;
		this.relayed_by = relayed_by;
		this.out = out;
		this.lock_time = lock_time;
		this.size = size;
		this.double_spend = double_spend;
		this.block_index = block_index;
		this.time = time;
		this.tx_index = tx_index;
		this.vin_sz = vin_sz;
		this.hash = hash;
		this.vout_sz = vout_sz;
	}



	public String getVer() {
		return ver;
	}



	public void setVer(String ver) {
		this.ver = ver;
	}



	public ArrayList<Input> getInputs() {
		return inputs;
	}



	public void setInputs(ArrayList<Input> inputs) {
		this.inputs = inputs;
	}



	public String getWeight() {
		return weight;
	}



	public void setWeight(String weight) {
		this.weight = weight;
	}



	public String getBlock_height() {
		return block_height;
	}



	public void setBlock_height(String block_height) {
		this.block_height = block_height;
	}



	public String getRelayed_by() {
		return relayed_by;
	}



	public void setRelayed_by(String relayed_by) {
		this.relayed_by = relayed_by;
	}



	public ArrayList<PreviousOutput> getOut() {
		return out;
	}



	public void setOut(ArrayList<PreviousOutput> out) {
		this.out = out;
	}



	public String getLock_time() {
		return lock_time;
	}



	public void setLock_time(String lock_time) {
		this.lock_time = lock_time;
	}



	public String getSize() {
		return size;
	}



	public void setSize(String size) {
		this.size = size;
	}



	public boolean isDouble_spend() {
		return double_spend;
	}



	public void setDouble_spend(boolean double_spend) {
		this.double_spend = double_spend;
	}



	public String getBlock_index() {
		return block_index;
	}



	public void setBlock_index(String block_index) {
		this.block_index = block_index;
	}



	public String getTime() {
		return time;
	}



	public void setTime(String time) {
		this.time = time;
	}



	public String getTx_index() {
		return tx_index;
	}



	public void setTx_index(String tx_index) {
		this.tx_index = tx_index;
	}



	public String getVin_sz() {
		return vin_sz;
	}



	public void setVin_sz(String vin_sz) {
		this.vin_sz = vin_sz;
	}



	public String getHash() {
		return hash;
	}



	public void setHash(String hash) {
		this.hash = hash;
	}



	public String getVout_sz() {
		return vout_sz;
	}



	public void setVout_sz(String vout_sz) {
		this.vout_sz = vout_sz;
	}



	@Override
	public String toString() {
		return "TransactionData [ver=" + ver + ", inputs=" + inputs + ", weight=" + weight + ", block_height="
				+ block_height + ", relayed_by=" + relayed_by + ", out=" + out + ", lock_time=" + lock_time + ", size="
				+ size + ", double_spend=" + double_spend + ", block_index=" + block_index + ", time=" + time
				+ ", tx_index=" + tx_index + ", vin_sz=" + vin_sz + ", hash=" + hash + ", vout_sz=" + vout_sz + "]";
	}


}
