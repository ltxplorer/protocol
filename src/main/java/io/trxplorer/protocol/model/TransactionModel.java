package io.trxplorer.protocol.model;

import org.tron.protos.Protocol.Transaction.Contract.ContractType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import io.trxplorer.protocol.model.serializer.TimestampDeserializer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionModel {

	private String hash;
	
	private long block;
	
	private Object contract;
	
	private String from;
	
	private String to;
	
	@JsonDeserialize(using=TimestampDeserializer.class)
	private long timestamp;
	
	private int type;
	
	private String data;
	
	private int size;
	
	private boolean confirmed;
	
	public TransactionModel() {
	}
	
	public boolean isConfirmed() {
		return confirmed;
	}
	
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public long getBlock() {
		return block;
	}

	public void setBlock(long block) {
		this.block = block;
	}

	public Object getContract() {
		return contract;
	}

	public void setContract(Object contract) {
		this.contract = contract;
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

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getTypeLabel() {
		return ContractType.forNumber(this.type).toString(); 
	}
	
	
	
}
