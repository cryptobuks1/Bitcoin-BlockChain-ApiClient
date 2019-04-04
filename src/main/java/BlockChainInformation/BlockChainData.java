package BlockChainInformation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.StringTokenizer;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;

import bitcoinApi.HttpClient;
import bitcoinInformation.AddressBitcoin;
import bitcoinInformation.BitcoinInfo;
import bitcoinInformation.Currency;
import bitcoinInformation.Wallet;

public class BlockChainData {

	private LinkedHashMap<String, String> parameters = new LinkedHashMap<String, String>();
	private String url = "rawblock/";
	private String urlTx = "rawtx/";
	private String urlHeight = "block-height/";
	private String address = "rawaddr/";
	private String multiAddresses = "multiaddr";
	private String unspent = "unspent";
	private String balance = "balance";
	private String unconfirmedTransactions = "unconfirmed-transactions";
	private String latestBlock = "latestblock";
	private String block = "blocks/";
	private String hash = "";
	
	public BlockChainData() {
		
	}

	public BlockChainData(LinkedHashMap<String, String> parameters) {

		this.parameters = parameters;
		this.url += hash;
		this.urlTx += hash;
		this.urlHeight += hash;
		this.address += hash;
		this.block += hash;

	}

	public BlockChainData(LinkedHashMap<String, String> parameters, String hash) {

		this.parameters = parameters;
		this.hash = hash;
		this.url += hash;
		this.urlTx += hash;
		this.urlHeight += hash;
		this.address += hash;
		this.block += hash;

	}

	public BlockChainData(String hash) {

		this.hash = hash;
		this.url += hash;
		this.urlTx += hash;
		this.urlHeight += hash;
		this.address += hash;
		this.block += hash;

	}
	


	//Get blocks for a specific pool of miners
	
	public ArrayList<Block> getBlocksfromParameter() throws IOException{
		
		ArrayList<Block> jsonList = new ArrayList<Block>();
		String response = HttpClient.getInstance().getURL(block, parameters);
		JSONObject jsonObj = new JSONObject(response);
		JSONArray blocks = new JSONArray(jsonObj.get("blocks").toString());
		for (int i = 0; i < blocks.length(); i++) {

			JSONObject explrObject = blocks.getJSONObject(i);
			Gson gson2 = new Gson();
			Block block = gson2.fromJson(explrObject.toString(), Block.class);
			jsonList.add(block);
		}
		
		return jsonList;
	}
	
	// Get unconfirmed transactions
	
	public ArrayList<Transaction> getUnconfirmedTransactions() throws IOException{
		
		ArrayList<Transaction> jsonList = new ArrayList<Transaction>();
		String response = HttpClient.getInstance().getURL(unconfirmedTransactions, parameters);
		JSONObject jsonObj = new JSONObject(response);
		JSONArray transactions = new JSONArray(jsonObj.get("txs").toString());
		
		for (int i = 0; i < transactions.length(); i++) {

			JSONObject explrObject = transactions.getJSONObject(i);
			Gson gson2 = new Gson();
			Transaction transactionInfo = gson2.fromJson(explrObject.toString(), Transaction.class);
			jsonList.add(transactionInfo);
		}
		
		return jsonList;
	}
	
	// Get latest block
	
	public Block getLastBlock() throws IOException{
		
		String response = HttpClient.getInstance().getURL(latestBlock, parameters);
		Gson gson = new Gson();
		Block block = gson.fromJson(response, Block.class);
		return block;
	}
	
	
	// Get summary of balance according to the provided address
	
	public ArrayList<Balance> getBalance() throws IOException {

		ArrayList<Balance> balanceList = new ArrayList<Balance>();
		ArrayList<String> listAddresses = new ArrayList<String>();

		for (Entry<String, String> entry : parameters.entrySet()) {

			if (entry.getValue().contains("|")) {

				   StringTokenizer st = new StringTokenizer(entry.getValue(), "|");
				   
				   while(st.hasMoreTokens()) {

					   String address1 = st.nextToken();
					   listAddresses.add(address1);
				   }
			
			} else {

				String value = entry.getValue();
				listAddresses.add(value);
			}
		}
		
		String response = HttpClient.getInstance().getURL(balance, parameters);
		
		for(String parameter: listAddresses){
			
			JSONObject jsonObj = (JSONObject) new JSONObject(response).get(parameter);
			Gson gson = new Gson();
			Balance balance = gson.fromJson(jsonObj.toString(), Balance.class);
			balanceList.add(balance);
		}

		return balanceList;
	}

	// Get information about the unspent outputs given by an address

	public ArrayList<UnspentOutput> getUnspentOutputs() throws IOException {

		ArrayList<UnspentOutput> unspentOutputsList = new ArrayList<UnspentOutput>();
		String response = HttpClient.getInstance().getURL(unspent, parameters);
		JSONObject jsonObj = new JSONObject(response);
		JSONArray unspentOutputs = new JSONArray(jsonObj.get("unspent_outputs").toString());

		for (int i = 0; i < unspentOutputs.length(); i++) {

			JSONObject explrObject = unspentOutputs.getJSONObject(i);
			Gson gson = new Gson();
			UnspentOutput output = gson.fromJson(explrObject.toString(), UnspentOutput.class);
			unspentOutputsList.add(output);
		}

		return unspentOutputsList;
	}

	// Get information from bitcoins by using multiple addresses

	public ArrayList<Object> getBitcoinsMultipleAddresses() throws IOException {

		ArrayList<Object> jsonList = new ArrayList<Object>();
		String response = HttpClient.getInstance().getURL(multiAddresses, parameters);
		JSONObject jsonObj = new JSONObject(response);
		JSONArray addresses = new JSONArray(jsonObj.get("addresses").toString());
		JSONArray txs = new JSONArray(jsonObj.get("txs").toString());

		for (int i = 0; i < addresses.length(); i++) {

			JSONObject explrObject = addresses.getJSONObject(i);
			Gson gson = new Gson();
			AddressBitcoin bitcoinInfo = gson.fromJson(explrObject.toString(), AddressBitcoin.class);
			jsonList.add(bitcoinInfo);
		}


		JSONObject wallet = new JSONObject(jsonObj.get("wallet").toString());
		Gson gson = new Gson();
		Wallet walletInfo = gson.fromJson(wallet.toString(), Wallet.class);
		jsonList.add(walletInfo);


		for (int i = 0; i < txs.length(); i++) {

			JSONObject explrObject = txs.getJSONObject(i);
			Gson gson2 = new Gson();
			Transaction transactionInfo = gson2.fromJson(explrObject.toString(), Transaction.class);
			jsonList.add(transactionInfo);
		}

		return jsonList;
	}

	// Get information of a block from an address
	public BitcoinInfo getBitcoinInformationFromAddress() throws IOException {

		String response = HttpClient.getInstance().getURL(address, parameters);
		Gson gson = new Gson();
		BitcoinInfo bitcoinInfo = gson.fromJson(response, BitcoinInfo.class);
		return bitcoinInfo;

	}

	// Get information from a given Height value provided by the user.

	public ArrayList<Block> getBlockInformationfromHeight() throws IOException {

		ArrayList<Block> jsonBlockList = new ArrayList<Block>();
		String response = HttpClient.getInstance().getURL(urlHeight, parameters);
		JSONObject jsonObj = new JSONObject(response);
		JSONArray jsonArray = new JSONArray(jsonObj.get("blocks").toString());

		for (int i = 0; i < jsonArray.length(); i++) {

			JSONObject explrObject = jsonArray.getJSONObject(i);
			Gson gson = new Gson();
			Block block = gson.fromJson(explrObject.toString(), Block.class);
			jsonBlockList.add(block);
		}

		return jsonBlockList;

	}

	// Get information from a specific block where the hash has been provided.

	public Block getBlockDataInformation() throws IOException {

		String response = HttpClient.getInstance().getURL(url, parameters);
		Gson gson = new Gson();
		Block block = gson.fromJson(response, Block.class);
		return block;

	}

	// Get information from a single transaction

	public TransactionData getTransactionData() throws IOException {

		String response = HttpClient.getInstance().getURL(urlTx, parameters);
		Gson gson = new Gson();
		TransactionData transactionData = gson.fromJson(response, TransactionData.class);
		return transactionData;

	}

}
