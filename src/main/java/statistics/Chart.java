package statistics;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class Chart {
	
	private String status = "";
	private String name = "";
	private String unit = "";
	private String period = "";
	private String description = "";
	private JSONArray values;
	private List<String> list = new ArrayList<String>();
	
	
	public Chart(JSONObject jsonObj) {
		
		this.status = jsonObj.get("status").toString();
		this.name = jsonObj.get("name").toString();
		this.unit = jsonObj.get("unit").toString();
		this.period = jsonObj.get("period").toString();
		this.description = jsonObj.get("description").toString();
		this.list = iterateValues((JSONArray)jsonObj.get("values"));
		
	}

	private List<String> iterateValues(JSONArray values){
        
		for (int i = 0; i < values.length(); i++) {
			
			JSONObject xyValues =  values.getJSONObject(i);
			String x =  xyValues.get("x").toString();
			String y =  xyValues.get("y").toString();
			String xy = x + "\t" + y;
			list.add(xy);
		}
		
		return list;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getUnit() {
		return unit;
	}


	public void setUnit(String unit) {
		this.unit = unit;
	}


	public String getPeriod() {
		return period;
	}


	public void setPeriod(String period) {
		this.period = period;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public JSONArray getValues() {
		return values;
	}


	public void setValues(JSONArray values) {
		this.values = values;
	}
	
	
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Chart [status=" + status + ", name=" + name + ", unit=" + unit + ", period=" + period + ", description="
				+ description + ", values=" + values + ", list=" + list + "]";
	}

}
