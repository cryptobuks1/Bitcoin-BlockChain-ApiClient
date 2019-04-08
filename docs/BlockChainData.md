Method | HTTP request | Description
------------- | ------------- | -------------
[**getBlockDataInformation()**](BlockChainData.md#getBlockDataInformation) | **GET**  | Get information about a block given its hash

<a name="getBlockDataInformation"></a>
# **getBlockDataInformation**
> getBlockDataInformation

Get information related to a block according its hash

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
 
