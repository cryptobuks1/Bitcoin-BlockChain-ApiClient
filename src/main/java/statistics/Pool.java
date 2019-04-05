package statistics;

import org.json.JSONObject;

public class Pool {
	
	private String slushPool;
	private String bTCTOP;
	private String bTCCom;
	private String unknown;
	private String bitcoincom;
	private String f2Pool;
	private String bitFury;
	private String vntPool;
	private String viaBTC;
	private String bitMinter;
	private String bitClubNetwork;
	private String bixin;
	private String dpool;
	private String sigmaPoolcom;
	private String kanoPool;
	
	public Pool(String slushPool, String bTCTOP, String bTCCom, String unknown, String bitcoincom, String f2Pool,
			String bitFury, String vntPool, String viaBTC, String bitMinter, String bitClubNetwork, String bixin,
			String dpool, String sigmaPoolcom, String kanoPool) {
		super();
		this.slushPool = slushPool;
		this.bTCTOP = bTCTOP;
		this.bTCCom = bTCCom;
		this.unknown = unknown;
		this.bitcoincom = bitcoincom;
		this.f2Pool = f2Pool;
		this.bitFury = bitFury;
		this.vntPool = vntPool;
		this.viaBTC = viaBTC;
		this.bitMinter = bitMinter;
		this.bitClubNetwork = bitClubNetwork;
		this.bixin = bixin;
		this.dpool = dpool;
		this.sigmaPoolcom = sigmaPoolcom;
		this.kanoPool = kanoPool;
	}

	
	public Pool(JSONObject jsonObj) {
		this.slushPool = jsonObj.get("SlushPool").toString();
		this.bTCTOP = jsonObj.get("BTC.TOP").toString();
		this.bTCCom = jsonObj.get("BTC.com").toString();
		this.unknown = jsonObj.get("Unknown").toString();
		this.bitcoincom = jsonObj.get("Bitcoin.com").toString();
		this.f2Pool = jsonObj.get("F2Pool").toString();
		this.bitFury = jsonObj.get("BitFury").toString();
		this.vntPool = jsonObj.get("AntPool").toString();
		this.viaBTC = jsonObj.get("ViaBTC").toString();
		this.bitMinter = jsonObj.get("BitMinter").toString();
		this.bitClubNetwork = jsonObj.get("BitClub Network").toString();
		this.bixin = jsonObj.get("Bixin").toString();
		this.dpool = jsonObj.get("DPOOL").toString();
		this.sigmaPoolcom = jsonObj.get("SigmaPool.com").toString();
		this.kanoPool = jsonObj.get("KanoPool").toString();	}


	public String getSlushPool() {
		return slushPool;
	}

	public void setSlushPool(String slushPool) {
		this.slushPool = slushPool;
	}

	public String getbTCTOP() {
		return bTCTOP;
	}

	public void setbTCTOP(String bTCTOP) {
		this.bTCTOP = bTCTOP;
	}

	public String getbTCCom() {
		return bTCCom;
	}

	public void setbTCCom(String bTCCom) {
		this.bTCCom = bTCCom;
	}

	public String getUnknown() {
		return unknown;
	}

	public void setUnknown(String unknown) {
		this.unknown = unknown;
	}

	public String getBitcoincom() {
		return bitcoincom;
	}

	public void setBitcoincom(String bitcoincom) {
		this.bitcoincom = bitcoincom;
	}

	public String getF2Pool() {
		return f2Pool;
	}

	public void setF2Pool(String f2Pool) {
		this.f2Pool = f2Pool;
	}

	public String getBitFury() {
		return bitFury;
	}

	public void setBitFury(String bitFury) {
		this.bitFury = bitFury;
	}

	public String getVntPool() {
		return vntPool;
	}

	public void setVntPool(String vntPool) {
		this.vntPool = vntPool;
	}

	public String getViaBTC() {
		return viaBTC;
	}

	public void setViaBTC(String viaBTC) {
		this.viaBTC = viaBTC;
	}

	public String getBitMinter() {
		return bitMinter;
	}

	public void setBitMinter(String bitMinter) {
		this.bitMinter = bitMinter;
	}

	public String getBitClubNetwork() {
		return bitClubNetwork;
	}

	public void setBitClubNetwork(String bitClubNetwork) {
		this.bitClubNetwork = bitClubNetwork;
	}

	public String getBixin() {
		return bixin;
	}

	public void setBixin(String bixin) {
		this.bixin = bixin;
	}

	public String getDpool() {
		return dpool;
	}

	public void setDpool(String dpool) {
		this.dpool = dpool;
	}

	public String getSigmaPoolcom() {
		return sigmaPoolcom;
	}

	public void setSigmaPoolcom(String sigmaPoolcom) {
		this.sigmaPoolcom = sigmaPoolcom;
	}

	public String getKanoPool() {
		return kanoPool;
	}

	public void setKanoPool(String kanoPool) {
		this.kanoPool = kanoPool;
	}


	@Override
	public String toString() {
		return "Pool [slushPool=" + slushPool + ", bTCTOP=" + bTCTOP + ", bTCCom=" + bTCCom + ", unknown=" + unknown
				+ ", bitcoincom=" + bitcoincom + ", f2Pool=" + f2Pool + ", bitFury=" + bitFury + ", vntPool=" + vntPool
				+ ", viaBTC=" + viaBTC + ", bitMinter=" + bitMinter + ", bitClubNetwork=" + bitClubNetwork + ", bixin="
				+ bixin + ", dpool=" + dpool + ", sigmaPoolcom=" + sigmaPoolcom + ", kanoPool=" + kanoPool + "]";
	}

}
