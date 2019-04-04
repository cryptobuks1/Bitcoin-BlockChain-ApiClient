package BlockChainInformation;

public class UnspentOutput {
	
	String tx_hash = "";
	String tx_hash_big_endian = "";
	String tx_output_n = "";
	String script = "";
	String value = "";
	String value_hex = "";
	String confirmations = "";
	String tx_index = "";
	
	public UnspentOutput(String tx_hash, String tx_hash_big_endian, String tx_output_n, String script, String value,
			String value_hex, String confirmations, String tx_index) {
		super();
		this.tx_hash = tx_hash;
		this.tx_hash_big_endian = tx_hash_big_endian;
		this.tx_output_n = tx_output_n;
		this.script = script;
		this.value = value;
		this.value_hex = value_hex;
		this.confirmations = confirmations;
		this.tx_index = tx_index;
	}

	public String getTx_hash() {
		return tx_hash;
	}

	public void setTx_hash(String tx_hash) {
		this.tx_hash = tx_hash;
	}

	public String getTx_hash_big_endian() {
		return tx_hash_big_endian;
	}

	public void setTx_hash_big_endian(String tx_hash_big_endian) {
		this.tx_hash_big_endian = tx_hash_big_endian;
	}

	public String getTx_output_n() {
		return tx_output_n;
	}

	public void setTx_output_n(String tx_output_n) {
		this.tx_output_n = tx_output_n;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue_hex() {
		return value_hex;
	}

	public void setValue_hex(String value_hex) {
		this.value_hex = value_hex;
	}

	public String getConfirmations() {
		return confirmations;
	}

	public void setConfirmations(String confirmations) {
		this.confirmations = confirmations;
	}

	public String getTx_index() {
		return tx_index;
	}

	public void setTx_index(String tx_index) {
		this.tx_index = tx_index;
	}

	@Override
	public String toString() {
		return "UnspentOutput [tx_hash=" + tx_hash + ", tx_hash_big_endian=" + tx_hash_big_endian + ", tx_output_n="
				+ tx_output_n + ", script=" + script + ", value=" + value + ", value_hex=" + value_hex
				+ ", confirmations=" + confirmations + ", tx_index=" + tx_index + "]";
	}
	
}
