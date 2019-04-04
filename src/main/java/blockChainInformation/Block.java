package blockChainInformation;

import java.util.ArrayList;

public class Block {

	private String hash = "";
	private String ver = "";
	private String prev_block = "";
	private ArrayList<String> next_block;
	private String mrkl_root = "";
	private String time = "";
	private String bits = "";
	private String fee = "";
	private String nonce = "";
	private String n_tx = "";
	private String size = "";
	private String block_index = "";
	private String main_chain = "";
	private String height = "";
	private ArrayList<Transaction> tx;
	
	
	public Block(String hash, String ver, String prev_block, ArrayList<String> next_block, String mrkl_root,
			String time, String bits, String fee, String nonce, String n_tx, String size, String block_index,
			String main_chain, String height, ArrayList<Transaction> tx) {
		super();
		this.hash = hash;
		this.ver = ver;
		this.prev_block = prev_block;
		this.next_block = next_block;
		this.mrkl_root = mrkl_root;
		this.time = time;
		this.bits = bits;
		this.fee = fee;
		this.nonce = nonce;
		this.n_tx = n_tx;
		this.size = size;
		this.block_index = block_index;
		this.main_chain = main_chain;
		this.height = height;
		this.tx = tx;
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


	public String getPrev_block() {
		return prev_block;
	}


	public void setPrev_block(String prev_block) {
		this.prev_block = prev_block;
	}


	public ArrayList<String> getNext_block() {
		return next_block;
	}


	public void setNext_block(ArrayList<String> next_block) {
		this.next_block = next_block;
	}


	public String getMrkl_root() {
		return mrkl_root;
	}


	public void setMrkl_root(String mrkl_root) {
		this.mrkl_root = mrkl_root;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getBits() {
		return bits;
	}


	public void setBits(String bits) {
		this.bits = bits;
	}


	public String getFee() {
		return fee;
	}


	public void setFee(String fee) {
		this.fee = fee;
	}


	public String getNonce() {
		return nonce;
	}


	public void setNonce(String nonce) {
		this.nonce = nonce;
	}


	public String getN_tx() {
		return n_tx;
	}


	public void setN_tx(String n_tx) {
		this.n_tx = n_tx;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}


	public String getBlock_index() {
		return block_index;
	}


	public void setBlock_index(String block_index) {
		this.block_index = block_index;
	}


	public String getMain_chain() {
		return main_chain;
	}


	public void setMain_chain(String main_chain) {
		this.main_chain = main_chain;
	}


	public String getHeight() {
		return height;
	}


	public void setHeight(String height) {
		this.height = height;
	}


	public ArrayList<Transaction> getTx() {
		return tx;
	}


	public void setTx(ArrayList<Transaction> tx) {
		this.tx = tx;
	}


	@Override
	public String toString() {
		return "Block [hash=" + hash + ", ver=" + ver + ", prev_block=" + prev_block + ", next_block=" + next_block
				+ ", mrkl_root=" + mrkl_root + ", time=" + time + ", bits=" + bits + ", fee=" + fee + ", nonce=" + nonce
				+ ", n_tx=" + n_tx + ", size=" + size + ", block_index=" + block_index + ", main_chain=" + main_chain
				+ ", height=" + height + ", tx=" + tx + "]";
	}	
	
}