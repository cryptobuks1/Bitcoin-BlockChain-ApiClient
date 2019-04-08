Method | HTTP request | Description
------------- | ------------- | -------------
[**getRateExchanges()**](Rate.md#getRateExchanges) | **GET**  | Get Returns a JSON object with the currency codes as keys. "15m" is the 15 minutes delayed market price, "last" is the most recent market price, "symbol" is the currency symbol.
[**getBitcoinExchange()**](Rate.md#getBitcoinExchange) | **GET**  | Retrieves a given currency in bitcoins.


<a name="getRateExchanges"></a>
# **getRateExchanges**
> getRateExchanges

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
 


<a name="getBitcoinExchange"></a>
# **getBitcoinExchange**
> getBitcoinExchange

Retrieves a given currency in bitcoins

### Example

```java

import org.json.simple.parser.ParseException;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import market.ExchangeRate;
import market.Rate;

public class ApiCallMain {

	public static void main(String[] args) throws IOException, ParseException {
	
		LinkedHashMap<String, String> params4 = new LinkedHashMap<String, String>();
		params4.put("currency", "EUR");
		params4.put("value", "5000");
		ExchangeRate exchange2 = new ExchangeRate(params4);
		Rate rate = exchange2.getBitcoinExchange();
		System.out.println(rate.toString());
	
	}
}

```
### Parameters

The parameters are put in a LinkedHashMap as parameter of the ExchangeRate class.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currency** | **String**|  The currrency's name | Mandatory
 **value** | **String**|  The currrency's vale | Mandatory
 
 ### Return 
 
Returns an insance of the Rate class.

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
