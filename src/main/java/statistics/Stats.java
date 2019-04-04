package statistics;

import org.json.JSONObject;

public class Stats {

	private String market_price_usd = "";
	private String hash_rate = "";
	private String total_fees_btc = "";
	private String n_btc_mined = "";
	private String n_tx = "";
	private String n_blocks_mined = "";
	private String minutes_between_blocks = "";
	private String totalbc = "";
	private String n_blocks_total = "";
	private String estimated_transaction_volume_usd = "";
	private String blocks_size = "";
	private String miners_revenue_usd = "";
	private String nextretarget = "";
	private String difficulty = "";
	private String estimated_btc_sent = "";
	private String miners_revenue_btc = "";
	private String total_btc_sent = "";
	private String trade_volume_btc = "";
	private String trade_volume_usd = "";
	private String timestamp = "";




	public Stats(JSONObject jsonObj) {

		this.market_price_usd = jsonObj.get("market_price_usd").toString();
		this.hash_rate = jsonObj.get("hash_rate").toString();
		this.total_fees_btc = jsonObj.get("n_btc_mined").toString();
		this.n_btc_mined = jsonObj.get("hash_rate").toString();
		this.n_tx = jsonObj.get("n_tx").toString();
		this.n_blocks_mined = jsonObj.get("n_blocks_mined").toString();
		this.minutes_between_blocks = jsonObj.get("minutes_between_blocks").toString();
		this.totalbc = jsonObj.get("totalbc").toString();
		this.n_blocks_total = jsonObj.get("n_blocks_total").toString();
		this.estimated_transaction_volume_usd = jsonObj.get("estimated_transaction_volume_usd").toString();
		this.blocks_size = jsonObj.get("blocks_size").toString();
		this.miners_revenue_usd = jsonObj.get("miners_revenue_usd").toString();
		this.nextretarget = jsonObj.get("nextretarget").toString();
		this.difficulty = jsonObj.get("difficulty").toString();
		this.estimated_btc_sent = jsonObj.get("estimated_btc_sent").toString();
		this.miners_revenue_btc = jsonObj.get("miners_revenue_btc").toString();
		this.total_btc_sent = jsonObj.get("total_btc_sent").toString();
		this.trade_volume_btc = jsonObj.get("trade_volume_btc").toString();
		this.trade_volume_usd = jsonObj.get("trade_volume_usd").toString();
		this.timestamp = jsonObj.get("timestamp").toString();
	}




	public String getMarket_price_usd() {
		return market_price_usd;
	}




	public void setMarket_price_usd(String market_price_usd) {
		this.market_price_usd = market_price_usd;
	}




	public String getHash_rate() {
		return hash_rate;
	}




	public void setHash_rate(String hash_rate) {
		this.hash_rate = hash_rate;
	}




	public String getTotal_fees_btc() {
		return total_fees_btc;
	}




	public void setTotal_fees_btc(String total_fees_btc) {
		this.total_fees_btc = total_fees_btc;
	}




	public String getN_btc_mined() {
		return n_btc_mined;
	}




	public void setN_btc_mined(String n_btc_mined) {
		this.n_btc_mined = n_btc_mined;
	}




	public String getN_tx() {
		return n_tx;
	}




	public void setN_tx(String n_tx) {
		this.n_tx = n_tx;
	}




	public String getN_blocks_mined() {
		return n_blocks_mined;
	}




	public void setN_blocks_mined(String n_blocks_mined) {
		this.n_blocks_mined = n_blocks_mined;
	}




	public String getMinutes_between_blocks() {
		return minutes_between_blocks;
	}




	public void setMinutes_between_blocks(String minutes_between_blocks) {
		this.minutes_between_blocks = minutes_between_blocks;
	}




	public String getTotalbc() {
		return totalbc;
	}




	public void setTotalbc(String totalbc) {
		this.totalbc = totalbc;
	}




	public String getN_blocks_total() {
		return n_blocks_total;
	}




	public void setN_blocks_total(String n_blocks_total) {
		this.n_blocks_total = n_blocks_total;
	}




	public String getEstimated_transaction_volume_usd() {
		return estimated_transaction_volume_usd;
	}




	public void setEstimated_transaction_volume_usd(String estimated_transaction_volume_usd) {
		this.estimated_transaction_volume_usd = estimated_transaction_volume_usd;
	}




	public String getBlocks_size() {
		return blocks_size;
	}




	public void setBlocks_size(String blocks_size) {
		this.blocks_size = blocks_size;
	}




	public String getMiners_revenue_usd() {
		return miners_revenue_usd;
	}




	public void setMiners_revenue_usd(String miners_revenue_usd) {
		this.miners_revenue_usd = miners_revenue_usd;
	}




	public String getNextretarget() {
		return nextretarget;
	}




	public void setNextretarget(String nextretarget) {
		this.nextretarget = nextretarget;
	}




	public String getDifficulty() {
		return difficulty;
	}




	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}




	public String getEstimated_btc_sent() {
		return estimated_btc_sent;
	}




	public void setEstimated_btc_sent(String estimated_btc_sent) {
		this.estimated_btc_sent = estimated_btc_sent;
	}




	public String getMiners_revenue_btc() {
		return miners_revenue_btc;
	}




	public void setMiners_revenue_btc(String miners_revenue_btc) {
		this.miners_revenue_btc = miners_revenue_btc;
	}




	public String getTotal_btc_sent() {
		return total_btc_sent;
	}




	public void setTotal_btc_sent(String total_btc_sent) {
		this.total_btc_sent = total_btc_sent;
	}




	public String getTrade_volume_btc() {
		return trade_volume_btc;
	}




	public void setTrade_volume_btc(String trade_volume_btc) {
		this.trade_volume_btc = trade_volume_btc;
	}




	public String getTrade_volume_usd() {
		return trade_volume_usd;
	}




	public void setTrade_volume_usd(String trade_volume_usd) {
		this.trade_volume_usd = trade_volume_usd;
	}




	public String getTimestamp() {
		return timestamp;
	}




	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	
	@Override
	public String toString() {
		return "Stats [market_price_usd=" + market_price_usd + ", hash_rate=" + hash_rate + ", total_fees_btc="
				+ total_fees_btc + ", n_btc_mined=" + n_btc_mined + ", n_tx=" + n_tx + ", n_blocks_mined="
				+ n_blocks_mined + ", minutes_between_blocks=" + minutes_between_blocks + ", totalbc=" + totalbc
				+ ", n_blocks_total=" + n_blocks_total + ", estimated_transaction_volume_usd="
				+ estimated_transaction_volume_usd + ", blocks_size=" + blocks_size + ", miners_revenue_usd="
				+ miners_revenue_usd + ", nextretarget=" + nextretarget + ", difficulty=" + difficulty
				+ ", estimated_btc_sent=" + estimated_btc_sent + ", miners_revenue_btc=" + miners_revenue_btc
				+ ", total_btc_sent=" + total_btc_sent + ", trade_volume_btc=" + trade_volume_btc
				+ ", trade_volume_usd=" + trade_volume_usd + ", timestamp=" + timestamp + "]";
	}



}
