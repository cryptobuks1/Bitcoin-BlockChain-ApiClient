package market;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.json.JSONObject;
import bitcoinApi.HttpClient;
import bitcoinUtil.UtilMethods;
import blockChainInformation.Block;

public class ExchangeRates {
	
	private static String exchangeRates = "ticker";
	private static String exchangeCurrency = "tobtc";

	private LinkedHashMap<String, String> parameters = new LinkedHashMap<String, String>();
	private LinkedHashMap<String, LinkedHashMap<String, Object>> results = 
			new LinkedHashMap<String, LinkedHashMap<String, Object>>();

	
	public ExchangeRates(LinkedHashMap<String, String> parameters){
		
		this.parameters = parameters;
	}
	
	
	public ExchangeRates() {
		super();
	}

	public LinkedHashMap<String, LinkedHashMap<String, Object>> getRateExchanges() throws IOException {

		String response = HttpClient.getInstance().get(exchangeRates, parameters);
		JSONObject jsonObj = new JSONObject(response);
		UtilMethods methods = new UtilMethods(jsonObj);
		results = methods.fromJSONtoLinkedHashMapWithObject();
		return results;	
	}
	
	public Rate getBitcoinExchange() throws IOException {
		
		Rate rate = new Rate();
		String response = HttpClient.getInstance().get(exchangeCurrency, parameters);
		float exchange = Float.parseFloat(response);
		rate.setBitcoin(exchange);
		rate.setCurrency(parameters.get("currency"));
		rate.setValue(parameters.get("value"));
		return rate;
		
	}

}
