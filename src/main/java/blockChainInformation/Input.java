package blockChainInformation;

public class Input {
	
	private String sequence = "";
	private String witness = "";
	private String script = "";
	private PreviousOutput prev_out;
	
	public Input(String sequence, String witness, String script, PreviousOutput prev_out) {
		super();
		this.sequence = sequence;
		this.witness = witness;
		this.script = script;
		this.prev_out = prev_out;
	}

	public String getSequence() {
		return sequence;
	}

	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	public String getWitness() {
		return witness;
	}

	public void setWitness(String witness) {
		this.witness = witness;
	}

	public String getScript() {
		return script;
	}

	public void setScript(String script) {
		this.script = script;
	}

	public PreviousOutput getPrev_out() {
		return prev_out;
	}

	public void setPrev_out(PreviousOutput prev_out) {
		this.prev_out = prev_out;
	}

	@Override
	public String toString() {
		return "Input [sequence=" + sequence + ", witness=" + witness + ", script=" + script + ", prev_out=" + prev_out
				+ "]";
	}		
}
