package io.trxplorer.protocol.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.trxplorer.protocol.model.serializer.TimestampDeserializer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContractModel {

	private String name;
	
	private String tx;
	
	@JsonDeserialize(using=TimestampDeserializer.class)
	private long created;
	
	private boolean isTrc20;
	
	private String address;
	
	private String issuer;
	
	
	
	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTx() {
		return tx;
	}

	public void setTx(String tx) {
		this.tx = tx;
	}

	public long getCreated() {
		return created;
	}

	public void setCreated(long created) {
		this.created = created;
	}

	public boolean isTrc20() {
		return isTrc20;
	}

	public void setTrc20(boolean isTrc20) {
		this.isTrc20 = isTrc20;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
