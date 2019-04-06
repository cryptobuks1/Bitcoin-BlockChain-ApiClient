package bitcoinUtil;

import java.io.IOException;
import java.util.LinkedHashMap;
import org.json.JSONObject;

import com.google.gson.Gson;

import bitcoinApi.HttpClient;
import bitcoinInformation.BitcoinInfo;
import blockChainInformation.Block;
import blockChainInformation.TransactionData;
import market.Rate;

public class UtilMethods {

	private JSONObject jsonObject;
	LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
	LinkedHashMap<String, Object> submap = new LinkedHashMap<String, Object>();
	LinkedHashMap<String, LinkedHashMap<String, Object>> mainMap = new LinkedHashMap<String, LinkedHashMap<String, Object>>();

	public UtilMethods(JSONObject jsonObj) {

		this.jsonObject = jsonObj;
	}

	public UtilMethods() {
		super();
	}

	public LinkedHashMap<String, Integer> fromJSONtoLinkedHashMap() {

		for (String key : jsonObject.keySet()) {

			Integer value = (Integer) jsonObject.get(key);
			map.put(key, value);
		}

		return map;
	}

	public LinkedHashMap<String, LinkedHashMap<String, Object>> fromJSONtoLinkedHashMapWithObject() {

		for (String key : jsonObject.keySet()) {

			JSONObject jsonObjectExchange = (JSONObject) jsonObject.get(key);

			for (String key2 : jsonObjectExchange.keySet()) {

				Object object = jsonObjectExchange.get(key2);
				submap.put(key2, object);
			}

			mainMap.put(key, submap);
		}

		return mainMap;
	}

	public Object getResponse(String url, LinkedHashMap<String, String> parameters, Object object) throws IOException {

		if (object instanceof TransactionData) {

			String response = HttpClient.getInstance().getURL(url, parameters);
			Gson gson = new Gson();
			TransactionData transactionData = gson.fromJson(response, TransactionData.class);
			return transactionData;
		}
		

		if (object instanceof Block) {

			String response = HttpClient.getInstance().getURL(url, parameters);
			Gson gson = new Gson();
			Block block = gson.fromJson(response, Block.class);
			return block;
		}
		
		if(object instanceof BitcoinInfo){
			
			String response = HttpClient.getInstance().getURL(url, parameters);
			Gson gson = new Gson();
			BitcoinInfo bitcoinInfo = gson.fromJson(response, BitcoinInfo.class);
			return bitcoinInfo;

		}
	

		return object;
	}

}
