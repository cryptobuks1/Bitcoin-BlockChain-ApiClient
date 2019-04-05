package statistics;

import java.io.IOException;
import java.util.LinkedHashMap;
import org.json.JSONObject;
import bitcoinApi.HttpClient;
import bitcoinUtil.UtilMethods;


public class Statistic {

	private String chart = "charts/";
	private String chartTransaction = "charts/transactions-per-second/";
	private String stats = "stats";
	private String pools = "pools";
	private LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();

	public Statistic(LinkedHashMap<String, String> parameters) {

		this.map = parameters;
	}
	
	public Statistic(String chartype) {
		
		this.chart += chartype;
	}

	public Statistic(LinkedHashMap<String, String> parameters, String chartype) {

		this.map = parameters;
		this.chart += chartype;
	}
	
	public Statistic() {}
	
	
	public Chart getResourcesTransaction() throws IOException{
		
		map.put("format", "json");
		String response = HttpClient.getInstance().get(chart, map);
		JSONObject jsonObj = new JSONObject(response);
		Chart chart = new Chart(jsonObj);
		return chart;
		
	}
	
	// Method that gets all the transactions per second according to parameters
	// such as timespan and rollingAverage

	public Chart getResourcesTransactionPerSecond() throws IOException {

		map.put("format", "json");
		String response = HttpClient.getInstance().get(chartTransaction, map);
		JSONObject jsonObj = new JSONObject(response);
		Chart chart = new Chart(jsonObj);
		return chart;

	}
	
	// Method that gets all the blockchain's state

	public Stat getStats() throws IOException{

		String response = HttpClient.getInstance().get(stats, map);
		JSONObject jsonObj = new JSONObject(response);
		Stat stat = new Stat(jsonObj);
		return stat;

	}
	
	// Method that gets all the blockchain's hashes distribution.
	// Parameters: timespan, for example, five weeks

	public Pool getPools() throws IOException{
		
		String response = HttpClient.getInstance().get(pools, map);
		JSONObject jsonObj = new JSONObject(response);
		Pool pool = new Pool(jsonObj);
		return pool;
	}

}
