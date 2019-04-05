# Bitcoin-BlockChain-ApiClient
This a JAVA api client for retrieving data from https://blockchain.info . It can be extended by any developers. The design of the client is very OOP. Enjoy it!

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven

## Installation


## Getting Started


## API documentation

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
Chart | **getResourcesTransactionPerSecond()** | GET | This method retrieves the number of daily bitcoins transactions. The parameters to include are: 1) timespan or duration of the chart, 2) rollingAverage or duration over which the data should be averaged, 3) star or the datatime when the chart stars (optional), 3) the format that can be in JSON or CSV, 4) Sample that limits the number of points.



