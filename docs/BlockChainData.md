Method | HTTP request | Description
------------- | ------------- | -------------
[**getBlockDataInformation()**](BlockChainData.md#getBlockDataInformation) | **GET**  | Get information about a block given its hash
[**getTransactionData()**](BlockChainData.md#getTransactionData) | **GET**  | Get information from a single transaction by providing a hash
[**getResourcesTransaction()**](BlockChainData.md#getResourcesTransaction) | **GET**  | Get the transactions according to the  specified chart type.
[**getBlockInformationfromHeight()**](BlockChainData.md#getBlockInformationfromHeight) | **GET**  | Get block information of a block for a given height
[**getBitcoinInformationFromAddress()**](BlockChainData.md#getBitcoinInformationFromAddress) | **GET**  | Get bitcoin information from an address
[**getBitcoinsMultipleAddresses()**](BlockChainData.md#getBitcoinsMultipleAddresses) | **GET**  | Get bitcoin from multiple addresses
[**getUnspentOutputs()**](BlockChainData.md#getUnspentOutputs) | **GET**  | Get information (List of UnspentOutput) about the unspent outputs, providing as parameter the address.
[**getLastBlock()**](BlockChainData.md#getLastBlock) | **GET**  | Get the last generated block of a blockchain.
[**getUnconfirmedTransactions()**](BlockChainData.md#getUnconfirmedTransactions) | **GET**  | Get unconfirmed transactions
[**getBlocksfromParameter()**](BlockChainData.md#getBlocksfromParameter)| **GET** | Get blocks for a specific day or a specific pool
[**getBalance()**](BlockChainData.md#getBalance)| **GET** | Get information about the balance

<a name="getBlockDataInformation"></a>
# **getBlockDataInformation**
> getBlockDataInformation

Get information related to a block according to its hash

### Example

```java

// Get information from a block with a specific hash

import java.io.IOException;
import blockChainInformation.Block;
import blockChainInformation.BlockChainData;

public class ApiCallMain {
	public static void main(String[] args) throws IOException, ParseException {

	public static void main(String[] args) throws IOException, ParseException {


		String hash = "0000000000000bae09a7a393a8acded75aa67e46cb81f7acaa5ad94f9eacd103";
		BlockChainData blockchain = new BlockChainData(hash);
		Block block = blockchain.getBlockDataInformation();

		// Some examples about how to extract from block of the blockchain i ->
		System.out.println("Previous block " + block.getPrev_block());
		System.out.println("Next block " + block.getNext_block().toString());
		System.out.println("Transactions " + block.getTx().toString());
		System.out.println("Block" + block.toString());
		
	}
}
```

### Parameters

The block's hash is included as parameter in the BlockChainData constructor.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_hash** | **String**| Hash that corresponds to a block.| Mandatory
 
### Return type

Block


### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 
<a name="getTransactionData"></a>
# **getTransactionData**
> getTransactionData

Get information from a single transaction by providing a hash

### Example

```java

import java.io.IOException;
import org.json.simple.parser.ParseException;
import blockChainInformation.TransactionData;

public class ApiCallMain {
	public static void main(String[] args) throws IOException, ParseException {


// Get information from a single transaction by providing the hash


public class ApiCallMain {
	public static void main(String[] args) throws IOException, ParseException {


		String hashTransaction = "b6f6991d03df0e2e04dafffcd6bc418aac66049e2cd74b80f14ac86db1e3f0da";
		BlockChainData trasnsactionBlock = new BlockChainData(hashTransaction);
		TransactionData transactionData = trasnsactionBlock.getTransactionData();

		// Some examples about how to extract information about the block ->
		System.out.println("Transaction hash " + transactionData.getHash());
		System.out.println("Transaction's weight " + transactionData.getWeight());
		System.out.println("Transactions' inputs" + transactionData.getInputs());
		System.out.println("Transactions' outputs" + transactionData.getOut().toString());
		System.out.println("Transactions" + transactionData.toString());
	}
}		

```

### Parameters

The transaction's hash is included as parameter in the BlockChainData constructor.

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tx_hash** | **String**| Hash that corresponds to a transaction.| Mandatory

### Return type

TransactionData

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 
<a name="getResourcesTransaction"></a>
# **getResourcesTransaction**
> getResourcesTransaction

Get the transactions according to the specified chart type.

### Example

```java

import java.io.IOException;
import org.json.simple.parser.ParseException;
import statistics.Chart;
import statistics.Statistic;

public class ApiCallMain {
	public static void main(String[] args) throws IOException, ParseException {
	
	import java.io.IOException;
	import org.json.simple.parser.ParseException;
	import statistics.Chart;

	// Retrieve charts (type=transaction per second).

		String chartype2 = "transactions-per-second";
		Statistic statistic4 = new Statistic(chartype2);
		Chart graphic2 = statistic4.getResourcesTransaction();
		System.out.println(graphic2.toString());

	}
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chart-type** | **String**| Type of chart.| Mandatory
 
### Return 

Chart

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8
 
 <a name="getBlockInformationfromHeight"></a>
# **getBlockInformationfromHeight**
> getBlockInformationfromHeight

Get block information of a block for a given height

### Example

```java

import java.io.IOException;
import java.util.LinkedHashMap;
import org.json.simple.parser.ParseException;
import blockChainInformation.Block;
import blockChainInformation.BlockChainData;

public class ApiCallMain {
	public static void main(String[] args) throws IOException, ParseException {
		
		String height = "154595";
		LinkedHashMap<String, String> paramsHeight = new LinkedHashMap<String, String>();
		paramsHeight.put("format", "json");
		BlockChainData trasnsactionBlockHeight = new BlockChainData(paramsHeight, height);
		List<Block> listBlocks = trasnsactionBlockHeight.getBlockInformationfromHeight();
		System.out.println(listBlocks.get(0).getTx().toString());
	}
}

```
### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **block_height** | **String**| Block's height.| Mandatory
 **format** | **String**| Formar.| Optional
 
 ### Return 

List of Blocks

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 
<a name="getBitcoinInformationFromAddress"></a>
# **getBitcoinInformationFromAddress**
> getBitcoinInformationFromAddress

Get bitcoin information from an address

### Example


```java

import java.io.IOException;
import org.json.simple.parser.ParseException;
import bitcoinInformation.BitcoinInfo;

public class ApiCallMain {
	public static void main(String[] args) throws IOException, ParseException {
		

		String address = "1AJbsFZ64EpEfS5UAjAfcUG8pH8Jn3rn1F";
		BlockChainData bitcoinAddress = new BlockChainData(address);
		BitcoinInfo bitcoinInfo = bitcoinAddress.getBitcoinInformationFromAddress();
		System.out.println(bitcoinInfo.toString());
		// List of transactions referring to a bitcoin
		System.out.println("bitcoininfo: " + bitcoinInfo.toString());
		// Total number of Transactions:
		System.out.println("n_tx: " + bitcoinInfo.getN_tx());
	}
}

```
 ### Parameters

 
 Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bitcoin_address** | **String**| Bitcoin's address.| Mandatory
 
### Return 

BitcoinInfo

### HTTP request headers

 - **Content-Type**: application/json; charset=utf-8
 

<a name="getBitcoinsMultipleAddresses"></a>
# **getBitcoinsMultipleAddresses**
> getBitcoinsMultipleAddresses
 
Get bitcoin from multiple addresses

### Example

```java

import java.io.IOException;
import org.json.simple.parser.ParseException;
import blockChainInformation.BlockChainData;
import java.util.LinkedHashMap;
import java.util.List;

public class ApiCallMain {
	public static void main(String[] args) throws IOException, ParseException {
	
		LinkedHashMap<String, String> paramsAdresses = new LinkedHashMap<String, String>();
		paramsAdresses.put("active", "1A8JiWcwvpY7tAopUkSnGuEYHmzGYfZPiq|1MDUoxL1bGvMxhuoDYx6i11ePytECAk9QK");
		BlockChainData bitcoinTwoAddress = new BlockChainData(paramsAdresses);
		List<Object> multipleAddresses = bitcoinTwoAddress.getBitcoinsMultipleAddresses();
		System.out.println(multipleAddresses.toString());
	
	}
}

```
 ### Parameters
 
 Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **$address$address** (separated by a vertical line) | **String**| Bitcoin's addresses.| Mandatory

### Return 

BitcoinInfo

List<Object> that returns -> *AddressBitcoin*, *Wallet*, *Transaction* classes

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8

<a name="getUnspentOutputs"></a>
# **getUnspentOutputs**
> getUnspentOutputs

### Example

```java

import java.io.IOException;
import java.util.List;
import org.json.simple.parser.ParseException;
import blockChainInformation.UnspentOutput;

public class ApiCallMain {
	public static void main(String[] args) throws IOException, ParseException {

		//Get information about the unspent outputs
		LinkedHashMap<String, String> paramsAdressOutputs = new LinkedHashMap<String, String>();
		paramsAdressOutputs.put("active","1MDUoxL1bGvMxhuoDYx6i11ePytECAk9QK");
		BlockChainData outputSpent = new BlockChainData(paramsAdressOutputs);
		List<UnspentOutput> unspentOutputList = outputSpent.getUnspentOutputs();
		System.out.println(unspentOutputList.toString());
	}
}

```

### Parameters

 Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **$address** (multiple addresses are allowed) | **String**| Bitcoin's address.| Mandatory

 ### Return 

List<UnspentOutput> -> list of Unspent class

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8


<a name="getLastBlock"></a>
# **getLastBlock**
> getLastBlock

Get the last generated block of a blockchain.

### Example

```java

import java.io.IOException;
import org.json.simple.parser.ParseException;
import blockChainInformation.Block;
import blockChainInformation.BlockChainData;

public class ApiCallMain {
	public static void main(String[] args) throws IOException, ParseException {
		
		BlockChainData latestBlock = new BlockChainData();
		Block lastblock = latestBlock.getLastBlock();
		System.out.println(lastblock.toString());
		
	}
}

```
### Parameters

No parameters

### Return 

Block

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8


<a name="getUnconfirmedTransactions"></a>
# **getUnconfirmedTransactions**
> getUnconfirmedTransactions
 
Get bitcoin from multiple addresses

### Example

```java

import java.io.IOException;
import org.json.simple.parser.ParseException;
import blockChainInformation.BlockChainData;
import blockChainInformation.Transaction;
import java.util.LinkedHashMap;
import java.util.List;

public class ApiCallMain {
	public static void main(String[] args) throws IOException, ParseException {
	
		LinkedHashMap<String, String> paramsTransactions = new LinkedHashMap<String, String>();
		paramsTransactions.put("format", "json");
		BlockChainData transactions = new BlockChainData(paramsTransactions);
		List<Transaction> unconfirmedTransactions = transactions.getUnconfirmedTransactions();
		System.out.println(unconfirmedTransactions.toString());
	
	}
}

```
 ### Parameters
 
 Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format**  | **String**| JSON | Optional

### Return 

List of Transactions

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8


<a name="getBlocksfromParameter"></a>
# **getBlocksfromParameter**
> getBlocksfromParameter

Get blocks from a specific day or specific pool

### Example

```java

import java.util.LinkedHashMap;
import java.util.List;
import org.json.simple.parser.ParseException;
import blockChainInformation.Block;
import blockChainInformation.BlockChainData;

public class ApiCallMain {
	public static void main(String[] args) throws IOException, ParseException {
		

		//Get blocks from a specific pool (e.g., Bitclub Network)
		LinkedHashMap<String, String> paramsPools = new LinkedHashMap<String, String>();
		paramsPools.put("format","json");
		String poolName =  "BitClub%20Network";
		BlockChainData blockPool = new BlockChainData(paramsPools, poolName);
		List<Block> blocks = blockPool.getBlocksfromParameter();
		System.out.println(blocks.toString());
		

		//Get blocks from a specific day (e.g., Bitclub Network)
		LinkedHashMap<String, String> paramsTime = new LinkedHashMap<String, String>();
		paramsTime.put("timespan", "1day");
		paramsTime.put("format","json");
		BlockChainData blockChain = new BlockChainData(paramsTime);
		List<Block> blocksfromASpecificTime = blockChain.getBlocksfromParameter();
		System.out.println(blocksfromASpecificTime.toString());*/

	}
}
```

### Parameters

 Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **$time_in_milliseconds**| **String**| Time in miliseconds.| Mandatory
 **$format**| **String**| Format.| Optional
 
 
 Name | Type | Description  | Notes
------------- | ------------- | ------------- | ------------- 
**$pool_name** (e.g. BitClub%20Network)| **String**| Pool's name.| Mandatory

### Return 

List of Blocks -> Block


### HTTP request headers

- **Content-Type**: application/json; charset=utf-8


<a name="getBalance"></a>
# **getBalance**
> getBalance

### Example

```java

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.simple.parser.ParseException;
import blockChainInformation.Balance;
import blockChainInformation.BlockChainData;


public class ApiCallMain {
	public static void main(String[] args) throws IOException, ParseException {
		
		//Get information about the balance
		LinkedHashMap<String, String> paramsBalance = new LinkedHashMap<String, String>();
		paramsBalance.put("active", "1MDUoxL1bGvMxhuoDYx6i11ePytECAk9QK|1A8JiWcwvpY7tAopUkSnGuEYHmzGYfZPiq");
		BlockChainData balance = new BlockChainData(paramsBalance);
		List<Balance> balanceList = balance.getBalance();
	}
}

```

### Parameters

 Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **$address** (multiple addresses separated by a vertical line)| **String**| Address.| Mandatory
 
### Return 

Balance

### HTTP request headers

- **Content-Type**: application/json; charset=utf-8


 