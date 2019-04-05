# Bitcoin-BlockChain-ApiClient
This a JAVA api client for retrieving data from https://blockchain.info . It can be extended by any developers. The design of the client is very OOP. Enjoy it!

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven

## Installation

To install the api client library to your local Maven repository, execute the following command:

```shell
mvn clean install
```
[How to include third parties libraries to your local mvn repository](https://www.mkyong.com/maven/how-to-include-library-manully-into-maven-local-repository/)

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
*Chart* | **getResourcesTransaction()** | **GET** | This method retrieves the transactions regarding the parameter chart type that was specified.
*Block* | **getBlockInformationfromHeight()** | **GET** | This method retrieves an array of one or more blocks at the height specified as parameter.
*BitcoinInfo* | **getBitcoinInformationFromAddress()** | **GET** | This method retrieves bitcoin information from a specified address.
*AddressBitcoin*, *Wallet*, *Transaction* | **getBitcoinsMultipleAddresses()** | **GET** | This method retrieves bitcoin information (List of AddressBitcoin, Wallet, Transaction) putting as parameter multiple addresses.
*UnspentOutput* | **getUnspentOutputs()** | **GET** | This method retrieves information (List of UnspentOutput) about the unspent outputs by providing as parameter the address.
*Block* | **getLastBlock()** | **GET** | This method returns the last generated block of a blockchain. 
*Transaction* | **getUnconfirmedTransactions()** | **GET** | This method returns all the unconfirmed transactions. 
*Block* | **getBlocksfromParameter()** | **GET** | This method returns the blocks generated for a day or a specific pool (e.g., putting as parameters 1day or BitClub%20Network as mining pool, respectively)




