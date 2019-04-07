Method | HTTP request | Description
------------- | ------------- | -------------
[**getResourcesTransactionPerSecond**](BlockchainCharts&StatisticsApi.md#getResourcesTransactionPerSecond) | **GET** charts/$chartName?timespan=$timespan&rollingAverage=$rollingAverage&start=$start&format=$format&sampled=$sampled | Get the number of transactions per second
[**getStats**](BlockchainCharts&StatisticsApi.md#getStats) | **GET** /stats | Returns the summary of bitcoin statistics.
[**getPools**](BlockchainCharts&StatisticsApi.md#getPools) | **GET** pools?timespan=$timespan | Retrieves all the mining pools.


<a name="getResourcesTransactionPerSecond"></a>
# **getResourcesTransactionPerSecond**
> getResourcesTransactionPerSecond()

Get the number of transactions per second

### Example
```java

import java.io.IOException;
import java.util.LinkedHashMap;
import org.json.simple.parser.ParseException;
import statistics.Chart;
import statistics.Statistic;

public static void main(String[] args) throws IOException, ParseException {

		// Set parameters. In order to get the bitcoins transactions per second,
		// the parameters to include are
		// the timespan and the rollingAverage, which correspond to 5 weeks and
		// 8 hours, respectively.

		LinkedHashMap<String, String> params = new LinkedHashMap<String, String>();
		params.put("timespan", "5weeks");
		params.put("start", "1551444600");
		params.put("sampled", "true");
		params.put("rollingAverage", "8hours");
		params.put("format", "json");
		
		Statistic statistic = new Statistic(params);
		Chart graphic = statistic.getResourcesTransactionPerSecond();
		System.out.println(graphic.toString());
```

### Parameters

Parameters are included in Stastic Java class (non static attributes of the class):

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timespan** | **String**| Duration of the chart, default is 1 year for most charts, 1 week for mempool charts.| Optional
 **start** | **String**| Datetime at which to start the char| Optional
 **sampled** | **String**| Duration over which the data should be averaged | Optional
 **rollingAverage** | **String**| Duration over which the data should be averaged.| Optional
 **format** | **String**| The format in which data is retrieved. For example, JSON. Optional
 
### Return type

Chart

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
