package io.trxplorer.protocol.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import io.trxplorer.protocol.model.contract.AssetIssueContractModel;
import io.trxplorer.protocol.model.contract.CreateSmartContractModel;
import io.trxplorer.protocol.model.contract.FrozenSupply;
import io.trxplorer.protocol.model.serializer.FrozenSupplySerializer;
import io.trxplorer.protocol.model.serializer.TimestampDeserializer;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenModel {
	
	private String id;
	
	private String name; 
	
	private String _name;
	
	@JsonInclude(Include.NON_DEFAULT)
	private String abbr;
	
	private String description;
	
	private int type;
	
	private BigDecimal supply;
	
	private int precision;
	
	private String txHash;
	
	@JsonInclude(Include.NON_DEFAULT)
	private long num;
	
	@JsonInclude(Include.NON_DEFAULT)
	private long trxNum;
	
	@JsonDeserialize(using=TimestampDeserializer.class)
	@JsonInclude(Include.NON_DEFAULT)
	private long startTime;
	
	@JsonDeserialize(using=TimestampDeserializer.class)
	@JsonInclude(Include.NON_DEFAULT)
	private long endTime;
	
	@JsonInclude(Include.NON_DEFAULT)
	private String contractAbi;
	
	@JsonInclude(Include.NON_DEFAULT)
	private String url;
	
	@JsonDeserialize(using=TimestampDeserializer.class)
	private long created;
	
	@JsonInclude(Include.NON_DEFAULT)
	private Map<String,String> tsSocialMeta;
	
	@JsonInclude(Include.NON_DEFAULT)
	private Map<String,Object> socialMeta;
	
	@JsonInclude(Include.NON_DEFAULT)
	private List<FrozenSupply> frozenSupply;
	
	@JsonInclude(Include.NON_DEFAULT)
	private String issuer;

	public String getTxHash() {
		return txHash;
	}
	
	public void setTxHash(String txHash) {
		this.txHash = txHash;
	}
	
	public Map<String, String> getTsSocialMeta() {
		return tsSocialMeta;
	}

	public void setTsSocialMeta(Map<String, String> tsSocialMeta) {
		this.tsSocialMeta = tsSocialMeta;
	}

	
	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbr() {
		return abbr;
	}

	public void setAbbr(String abbr) {
		this.abbr = abbr;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public BigDecimal getSupply() {
		return supply;
	}

	public void setSupply(BigDecimal supply) {
		this.supply = supply;
	}

	public int getPrecision() {
		return precision;
	}

	public void setPrecision(int precision) {
		this.precision = precision;
	}

	public long getNum() {
		return num;
	}

	public void setNum(long num) {
		this.num = num;
	}

	public long getTrxNum() {
		return trxNum;
	}

	public void setTrxNum(long trxNum) {
		this.trxNum = trxNum;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public void setEndTime(long endTime) {
		this.endTime = endTime;
	}

	public String getContractAbi() {
		return contractAbi;
	}

	public void setContractAbi(String contractAbi) {
		this.contractAbi = contractAbi;
	}

	public Map<String, Object> getSocialMeta() {
		return socialMeta;
	}

	public void setSocialMeta(Map<String, Object> socialMeta) {
		this.socialMeta = socialMeta;
	}

	public List<FrozenSupply> getFrozenSupply() {
		return frozenSupply;
	}

	public void setFrozenSupply(List<FrozenSupply> frozenSupply) {
		this.frozenSupply = frozenSupply;
	}
	

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public long getCreated() {
		return created;
	}

	public void setCreated(long created) {
		this.created = created;
	}

	public static TokenModel from(AssetIssueContractModel model) {
		
		if (model==null) {
			return null;
		}
		
		TokenModel result = new TokenModel();
		
		result.setIssuer(model.getFrom());
		result.setId(model.getId());
		result.setAbbr(model.getAbbr());
		result.setName(model.getName());
		result.setDescription(model.getDescription());
		result.setEndTime(model.getEndTime());
		result.setStartTime(model.getStartTime());
		result.setPrecision(model.getPrecision());
		result.setNum(model.getNum());
		result.setTrxNum(model.getTrxNum());
		result.setType(0);
		result.setSupply(new BigDecimal(model.getTotalSupply()));
		result.setUrl(model.getUrl());
		result.setFrozenSupply(model.getFrozenSupply());
		
		
		return result;
	}
	

	
}
