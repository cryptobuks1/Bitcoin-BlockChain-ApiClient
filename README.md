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
*Chart* | **getResourcesTransactionPerSecond()** | **GET** | This method retrieves the number of daily bitcoins transactions. The parameters to include are: 1) timespan or duration of the chart, 2) rollingAverage or duration over which the data should be averaged, 3) start or the datatime when the chart starts (optional), 3) the format that is in JSON, 4) Sample that limits the number of points.
*Stat* | **getStats()** | **GET** | This method retrieves the stats which refer to a summary of blocks and transactions. For example, the hash rate, the total fees, the total number of transactions or mined blocks.
*Pool* | **getPools()** | **GET** | This method retrieves information about the mining pools.
*Rate* | **getBitcoinExchange()** | **GET** | This method retrieves the value of the currency in bitcoins.
*Block* | **getBlockDataInformation()** | **GET** | This method provides the information related to a block matching with its corresponding hash.
*TransactionData* | **getTransactionData()** | **GET** | This method provides the information from a single transaction with a given hash.







