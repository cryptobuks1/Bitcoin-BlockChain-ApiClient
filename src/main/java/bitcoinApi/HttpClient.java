package bitcoinApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;

public class HttpClient implements HttpClientInterface {

	public static final String BASE_URL = "https://api.blockchain.info/";
	public static final String BASE_URL2 = "https://blockchain.info/";

	public volatile static int TIME_OUT = 10000;
	static HttpClientInterface instance;

	public synchronized static HttpClientInterface getInstance() {

		if (instance == null) {

			synchronized (HttpClient.class) {
				if (instance == null) {
					instance = new HttpClient();
				}
			}
		}

		return instance;
	}

	public static void setCustomHttpClient(HttpClientInterface client) {

		instance = client;
	}

	public String get(String resource, Map<String, String> params) throws IOException {

		return openURL(BASE_URL, resource, params, "GET");
	}
	
	public String getURL(String resource, Map<String, String> params) throws IOException {
		
		return openURL(BASE_URL2, resource, params, "GET");
	}
	

	public static String openURL(String baseUrl, String resource, Map<String, String> params, String typeRequest)
			throws IOException {

		String encodedParams = urlEncodeParams(params);

		URL url = null;
		String response = "";

		if (typeRequest.equals("GET")) {

			if (params.isEmpty()) {

				url = new URL(baseUrl + resource);
				System.out.println("url " + url);


			} else {

				url = new URL(baseUrl + resource + "?" + encodedParams);
				System.out.println("url " + url);
			}

			HttpURLConnection conn = null;

			try {

				conn = (HttpURLConnection) url.openConnection();
				conn.setRequestMethod(typeRequest);
				conn.setConnectTimeout(TIME_OUT);

				if (conn.getResponseCode() != 200) {

					throw new RuntimeException("No success, respose different to expected " + conn.getResponseCode()
							+ " " + conn.getResponseMessage());

				} else {

					response = readResponseInputStream(conn.getInputStream());

				}

			} catch (Exception e) {

				e.printStackTrace();

			}
		}

		return response;

	}

	private static String urlEncodeParams(Map<String, String> parameters) {

		String URLCall = "";

		if (parameters != null && !parameters.isEmpty()) {

			for (Entry<String, String> keyvalue : parameters.entrySet()) {

				URLCall += keyvalue.getKey() + "=" + keyvalue.getValue() + "&";
				System.out.println("URLCall: " + URLCall);
			}
			
			URLCall = URLCall.substring(0, URLCall.length() - 1);
		}

		System.out.println(URLCall);

		return URLCall;
	}

	private static String readResponseInputStream(InputStream input) throws IOException {

		String line = "";
		String result = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(input));

		while ((line = br.readLine()) != null) {

			result += line;
		}

		br.close();

		return result;

	}

	
}
