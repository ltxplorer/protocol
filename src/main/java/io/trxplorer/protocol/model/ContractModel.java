package io.trxplorer.protocol.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.trxplorer.protocol.model.serializer.TimestampDeserializer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ContractModel {

	private String name;
	
	private long balance;
	
	@JsonInclude(Include.NON_DEFAULT)
	private String tx;
	
	@JsonDeserialize(using=TimestampDeserializer.class)
	private long created;
	
	@JsonInclude(Include.NON_EMPTY)
	private Boolean isTrc20;
	
	private String address;
	
	@JsonInclude(Include.NON_DEFAULT)
	private String issuer;
	
	@JsonInclude(Include.NON_DEFAULT)
	private String abi;
	
	@JsonInclude(Include.NON_DEFAULT)
	private String byteCode;


	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public Boolean getIsTrc20() {
		return isTrc20;
	}

	public void setIsTrc20(Boolean isTrc20) {
		this.isTrc20 = isTrc20;
	}

	public String getAbi() {
		return abi;
	}

	public void setAbi(String abi) {
		this.abi = abi;
	}

	public String getByteCode() {
		return byteCode;
	}

	public void setByteCode(String byteCode) {
		this.byteCode = byteCode;
	}

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

	public Boolean isTrc20() {
		return isTrc20;
	}

	public void setTrc20(Boolean isTrc20) {
		this.isTrc20 = isTrc20;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
