package bitcoinApi;

import java.io.IOException;
import java.util.Map;

public interface HttpClientInterface {
	
	String get (String resource, Map<String, String> params) throws IOException;
	String getURL(String resource, Map<String, String> params) throws IOException;

}
