package blockChainInformation;

import java.util.ArrayList;

public class Transaction {
	
	private String hash = "";
	private String ver = "";
	private String vin_sz = "";
	private String vout_sz = "";
	private String size = "";
	private String weight = "";
	private String fee = "";
	private String relayed_by = "";
	private String lock_time = "";
	private String tx_index = "";
	private String double_spend = "";
	private String time = "";
	private String block_index = "";
	private String block_height = "";
	private ArrayList<Input> inputs;
	private ArrayList<PreviousOutput> out;
	
	
	public Transaction(String hash, String ver, String vin_sz, String vout_sz, String size, String weight, String fee,
			String relayed_by, String lock_time, String tx_index, String double_spend, String time, String block_index,
			String block_height, ArrayList<Input> inputs, ArrayList<PreviousOutput> out) {
		super();
		this.hash = hash;
		this.ver = ver;
		this.vin_sz = vin_sz;
		this.vout_sz = vout_sz;
		this.size = size;
		this.weight = weight;
		this.fee = fee;
		this.relayed_by = relayed_by;
		this.lock_time = lock_time;
		this.tx_index = tx_index;
		this.double_spend = double_spend;
		this.time = time;
		this.block_index = block_index;
		this.block_height = block_height;
		this.inputs = inputs;
		this.out = out;
	}


	public String getHash() {
		return hash;
	}


	public void setHash(String hash) {
		this.hash = hash;
	}


	public String getVer() {
		return ver;
	}


	public void setVer(String ver) {
		this.ver = ver;
	}


	public String getVin_sz() {
		return vin_sz;
	}


	public void setVin_sz(String vin_sz) {
		this.vin_sz = vin_sz;
	}


	public String getVout_sz() {
		return vout_sz;
	}


	public void setVout_sz(String vout_sz) {
		this.vout_sz = vout_sz;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


	public String getFee() {
		return fee;
	}


	public void setFee(String fee) {
		this.fee = fee;
	}


	public String getRelayed_by() {
		return relayed_by;
	}


	public void setRelayed_by(String relayed_by) {
		this.relayed_by = relayed_by;
	}


	public String getLock_time() {
		return lock_time;
	}


	public void setLock_time(String lock_time) {
		this.lock_time = lock_time;
	}


	public String getTx_index() {
		return tx_index;
	}


	public void setTx_index(String tx_index) {
		this.tx_index = tx_index;
	}


	public String getDouble_spend() {
		return double_spend;
	}


	public void setDouble_spend(String double_spend) {
		this.double_spend = double_spend;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getBlock_index() {
		return block_index;
	}


	public void setBlock_index(String block_index) {
		this.block_index = block_index;
	}


	public String getBlock_height() {
		return block_height;
	}


	public void setBlock_height(String block_height) {
		this.block_height = block_height;
	}


	public ArrayList<Input> getInput() {
		return inputs;
	}


	public void setInput(ArrayList<Input> inputs) {
		this.inputs = inputs;
	}


	public ArrayList<PreviousOutput> getOutput() {
		return out;
	}


	public void setOutput(ArrayList<PreviousOutput> out) {
		this.out = out;
	}

	@Override
	public String toString() {
		return "Transaction [hash=" + hash + ", ver=" + ver + ", vin_sz=" + vin_sz + ", vout_sz=" + vout_sz + ", size="
				+ size + ", weight=" + weight + ", fee=" + fee + ", relayed_by=" + relayed_by + ", lock_time="
				+ lock_time + ", tx_index=" + tx_index + ", double_spend=" + double_spend + ", time=" + time
				+ ", block_index=" + block_index + ", block_height=" + block_height + ", inputs=" + inputs + ", out="
				+ out + "]";
	}
}
