package bitcoinUtil;

import java.util.LinkedHashMap;
import org.json.JSONObject;

public class UtilMethods {

	private JSONObject jsonObject;
	LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
	LinkedHashMap<String, Object> submap = new LinkedHashMap<String, Object>();
	LinkedHashMap<String, LinkedHashMap<String, Object>> mainMap = new LinkedHashMap<String, LinkedHashMap<String, Object>>();

	public UtilMethods(JSONObject jsonObj) {

		this.jsonObject = jsonObj;
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
}
