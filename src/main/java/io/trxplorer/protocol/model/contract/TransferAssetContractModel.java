package io.trxplorer.protocol.model.contract;

import java.math.BigDecimal;

public class TransferAssetContractModel {
	
	private String asset;//was asset name prior to ALLOW_SAME_TOKEN_NAME after becomes asset id 
	
	private String from;
	
	private String to;
	
	private BigDecimal amount;

	public String getAsset() {
		return asset;
	}
	
	public void setAsset(String asset) {
		this.asset = asset;
	}
	
	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}	
	
}
