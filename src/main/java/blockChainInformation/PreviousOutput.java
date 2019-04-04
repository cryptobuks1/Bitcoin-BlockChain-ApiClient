package blockChainInformation;

import java.util.ArrayList;

public class PreviousOutput {
	
	private String type = "";
	private boolean spent = false;
	private String value = "";
	private ArrayList<SpendingOutpoint> spending_outpoints;
	private String script = "";
	private String tx_index = "";
	private String n = "";
	private String addr = "";
	
	public PreviousOutput(String type, boolean spent, String value, ArrayList<SpendingOutpoint> spending_outpoints,
			String script, String tx_index, String n, String addr) {
		super();
		this.type = type;
		this.spent = spent;
		this.value = value;
		this.spending_outpoints = spending_outpoints;
		this.script = script;
		this.tx_index = tx_index;
		this.n = n;
		this.addr = addr;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isSpent() {
		return spent;
	}

	public void setSpent(boolean spent) {
		this.spent = spent;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ArrayList<SpendingOutpoint> getSpendingoutpoints() {
		return spending_outpoints;
	}

	public void setSpendingoutpoints(ArrayList<SpendingOutpoint> spending_outpoints) {
		this.spending_outpoints = spending_outpoints;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public String getTx_index() {
		return tx_index;
	}

	public void setTx_index(String tx_index) {
		this.tx_index = tx_index;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public String getAddress() {
		return addr;
	}

	public void setAddress(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "PreviousOutput [type=" + type + ", spent=" + spent + ", value=" + value + ", spending_outpoints="
				+ spending_outpoints + ", script=" + script + ", tx_index=" + tx_index + ", n=" + n + ", addr="
				+ addr + "]";
	}
	
	
}
