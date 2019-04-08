package bitcoinApi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.json.simple.parser.ParseException;
import bitcoinInformation.BitcoinInfo;
import bitcoinUtil.UtilMethods;
import blockChainInformation.Balance;
import blockChainInformation.Block;
import blockChainInformation.BlockChainData;
import blockChainInformation.Transaction;
import blockChainInformation.TransactionData;
import blockChainInformation.UnspentOutput;
import market.Exchange;
import market.ExchangeRate;
import market.Rate;
import statistics.Chart;
import statistics.Pool;
import statistics.Statistic;
import statistics.Stat;

public class ApiCallMain {

	public static void main(String[] args) throws IOException, ParseException {

		// Set parameters. In order to get the bitcoins transactions per second,
		// the parameters to include are
		// the timespan and the rollingAverage, which correspond to 5 weeks and
		// 8 hours, respectively.

		/*LinkedHashMap<String, String> params = new LinkedHashMap<String, String>();
		params.put("timespan", "5weeks");
		params.put("start", "1551444600");
		params.put("sampled", "true");
		params.put("rollingAverage", "8hours");
		params.put("format", "csv");
		
		Statistic statistic = new Statistic(params);
		Chart graphic = statistic.getResourcesTransactionPerSecond();
		System.out.println(graphic.toString());*/
		
		// Retrieve charts (type=transaction per second).

		String chartype2 = "transactions-per-second";
		Statistic statistic4 = new Statistic(chartype2);
		Chart graphic2 = statistic4.getResourcesTransaction();
		System.out.println(graphic2.toString());

		// The method getStats returns the summary of bitcoin statistics

		/*Statistic statistic2 = new Statistic();
		Stat stats = statistic2.getStats();
		System.out.println(stats.toString());
		System.out.println("Get difficulty: " + stats.getDifficulty());
*/
		/// The method getPools() retrieves all the mining pools. In this case,
		// the parameter
		// is the timespan that corresponds to 5 days.

		/*LinkedHashMap<String, String> params2 = new LinkedHashMap<String, String>();
		params2.put("timespan", "5days");

		Statistic statistic3 = new Statistic(params2);ad
		Pool pool = statistic3.getPools();
		System.out.println(pool.toString().toLowerCase());*/

		// The method getRateExchanges() returns the market prices for each
		// currency

		/*UtilMethods util = new UtilMethods();
		LinkedHashMap<String, LinkedHashMap<String, Object>> output3 = new LinkedHashMap<String, LinkedHashMap<String, Object>>();
		ExchangeRate exchange = new ExchangeRate();
		output3 = exchange.getRateExchanges();
		//System.out.println(output3.toString());
		List<Exchange> exchanges = util.returnToExchangeRate(output3);
		System.out.println(exchanges.get(11).getCurrencyValue());*/

		/// The method getRateExchanges() returns the exchange rates currency X
		// -> bitcoin. The parameters to add are the currency (EUR)
		// and its value. The method returns a float with the ratio of the
		// exchange.

		/*LinkedHashMap<String, String> params4 = new LinkedHashMap<String, String>();
		params4.put("currency", "EUR");
		params4.put("value", "5000");
		ExchangeRate exchange2 = new ExchangeRate(params4);
		Rate rate = exchange2.getBitcoinExchange();
		System.out.println(rate.toString());
		*/

		// Get information from a block with a specific hash

		/*String hash = "0000000000000bae09a7a393a8acded75aa67e46cb81f7acaa5ad94f9eacd103";
		BlockChainData blockchain = new BlockChainData(hash);
		Block block = blockchain.getBlockDataInformation();

		// Some examples about how to extract from block of the blockchain i ->
		System.out.println("Previous block " + block.getPrev_block());
		System.out.println("Next block " + block.getNext_block().toString());
		System.out.println("Transactions " + block.getTx().toString());
		System.out.println("Block" + block.toString());*/
		

		// Get information from a single transaction by providing the hash

		String hashTransaction = "b6f6991d03df0e2e04dafffcd6bc418aac66049e2cd74b80f14ac86db1e3f0da";
		BlockChainData trasnsactionBlock = new BlockChainData(hashTransaction);
		TransactionData transactionData = trasnsactionBlock.getTransactionData();

		// Some examples about how to extract information about the block ->
		System.out.println("Transaction hash " + transactionData.getHash());
		System.out.println("Transaction's weight " + transactionData.getWeight());
		System.out.println("Transactions' inputs" + transactionData.getInputs());
		System.out.println("Transactions' outputs" + transactionData.getOut().toString());
		System.out.println("Transactions" + transactionData.toString());
		
		///Retrieve information from a block given its height
		/*String height = "154595";
		LinkedHashMap<String, String> paramsHeight = new LinkedHashMap<String, String>();
		paramsHeight.put("format", "json");
		BlockChainData trasnsactionBlockHeight = new BlockChainData(paramsHeight, height);
		ArrayList<Block> listBlocks = trasnsactionBlockHeight.getBlockInformationfromHeight();
		System.out.println(listBlocks.get(0).getTx().toString());
		
		//Retrieve information about a bitcoing given its address
		String address = "1AJbsFZ64EpEfS5UAjAfcUG8pH8Jn3rn1F";
		BlockChainData bitcoinAddress = new BlockChainData(address);
		BitcoinInfo bitcoinInfo = bitcoinAddress.getBitcoinInformationFromAddress();
		System.out.println(bitcoinInfo.toString());
		
		// Array of transactions referring to a bitcoin
		System.out.println("bitcoininfo: " + bitcoinInfo.toString());
		// Total number of Transactions:
		System.out.println("n_tx: " + bitcoinInfo.getN_tx());
		
		//Get bitcoin's information from multiple addresses
		LinkedHashMap<String, String> paramsAdresses = new LinkedHashMap<String, String>();
		paramsAdresses.put("active", "1A8JiWcwvpY7tAopUkSnGuEYHmzGYfZPiq|1MDUoxL1bGvMxhuoDYx6i11ePytECAk9QK");
		BlockChainData bitcoinTwoAddress = new BlockChainData(paramsAdresses);
		ArrayList<Object> multipleAddresses = bitcoinTwoAddress.getBitcoinsMultipleAddresses();
		System.out.println(multipleAddresses.toString());
		
		//Get information about the unspent outputs
		LinkedHashMap<String, String> paramsAdressOutputs = new LinkedHashMap<String, String>();
		paramsAdressOutputs.put("active","1MDUoxL1bGvMxhuoDYx6i11ePytECAk9QK");
		BlockChainData outputSpent = new BlockChainData(paramsAdressOutputs);
		ArrayList<UnspentOutput> unspentOutputList = outputSpent.getUnspentOutputs();
		System.out.println(unspentOutputList.toString());

		//Get information about the balance
		LinkedHashMap<String, String> paramsBalance = new LinkedHashMap<String, String>();
		paramsBalance.put("active","1MDUoxL1bGvMxhuoDYx6i11ePytECAk9QK|1A8JiWcwvpY7tAopUkSnGuEYHmzGYfZPiq");
		BlockChainData balance = new BlockChainData(paramsBalance);
		ArrayList<Balance> balanceList = balance.getBalance();
		System.out.println(balanceList.toString());
		
		//Get information about the latest block
		BlockChainData latestBlock = new BlockChainData();
		Block lastblock = latestBlock.getLastBlock();
		System.out.println(lastblock.toString());
		
		//Get unconfirmed transactions
		LinkedHashMap<String, String> paramsTransactions = new LinkedHashMap<String, String>();
		paramsTransactions.put("format","json");
		BlockChainData transactions = new BlockChainData(paramsTransactions);
		ArrayList<Transaction>unconfirmedTransactions = transactions.getUnconfirmedTransactions();
		System.out.println(unconfirmedTransactions.toString());
		
		//Get blocks from a specific pool (e.g., Bitclub Network)
		LinkedHashMap<String, String> paramsPools = new LinkedHashMap<String, String>();
		paramsPools.put("format","json");
		String poolName =  "BitClub%20Network";
		BlockChainData blockPool = new BlockChainData(paramsPools, poolName);
		ArrayList<Block> blocks = blockPool.getBlocksfromParameter();
		System.out.println(blocks.toString());
		
		//Get blocks from a specific pool (e.g., Bitclub Network)
		LinkedHashMap<String, String> paramsTime = new LinkedHashMap<String, String>();
		paramsTime.put("timespan", "1day");
		paramsTime.put("format","json");
		BlockChainData blockChain = new BlockChainData(paramsTime);
		ArrayList<Block> blocksfromASpecificTime = blockChain.getBlocksfromParameter();
		System.out.println(blocksfromASpecificTime.toString());*/

	}
}
