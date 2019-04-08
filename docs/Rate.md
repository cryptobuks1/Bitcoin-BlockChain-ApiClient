Method | HTTP request | Description
------------- | ------------- | -------------
[**getBitcoinExchange()**](Rate.md#getBitcoinExchange) | **GET**  | Get Returns a JSON object with the currency codes as keys. "15m" is the 15 minutes delayed market price, "last" is the most recent market price, "symbol" is the currency symbol.

<a name="getBitcoinExchange"></a>
# **getBitcoinExchange**
> getBitcoinExchange

Get the market price of the total existing currencies.

### Example

```java

import java.io.IOException;
import java.util.LinkedHashMap;
import org.json.simple.parser.ParseException;
import market.Exchange;
import market.ExchangeRate;
import java.util.List;

public class ApiCallMain {
public static void main(String[] args) throws IOException, ParseException {


		UtilMethods util = new UtilMethods();
		LinkedHashMap<String, LinkedHashMap<String, Object>> output3 = new LinkedHashMap<String, LinkedHashMap<String, Object>>();
		ExchangeRate exchange = new ExchangeRate();
		output3 = exchange.getRateExchanges();
		System.out.println(output3.toString());
		List<Exchange> exchanges = util.returnToExchangeRate(output3);
		System.out.println(exchanges.get(0).getCurrencyValue());

	}
	}

```
### Parameters
 
 No parameters needed to get the stats.
 
 ### Return 
 
Returns a LinkedHashMap<String, LinkedHashMap<String, Object>> that can be transformed into a List of Exchanges classes through the returnToExchangeRate() method.
 
 ### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8


