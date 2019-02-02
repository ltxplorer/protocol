package io.trxplorer.protocol.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.trxplorer.protocol.model.contract.AssetIssueContractModel;
import io.trxplorer.protocol.model.contract.CreateSmartContractModel;
import io.trxplorer.protocol.model.contract.FrozenSupply;

public class TokenModel {
	
	private String id;
	
	private String name; 

	@JsonInclude(Include.NON_DEFAULT)
	private String abbr;
	
	private String description;
	
	private int type;
	
	private long supply;
	
	private int precision;
 
	@JsonInclude(Include.NON_DEFAULT)
	private long num;
	
	@JsonInclude(Include.NON_DEFAULT)
	private long trxNum;
	
	@JsonInclude(Include.NON_DEFAULT)
	private long startTime;
	
	@JsonInclude(Include.NON_DEFAULT)
	private long endTime;
	
	@JsonInclude(Include.NON_DEFAULT)
	private String contractAbi;
	
	@JsonInclude(Include.NON_DEFAULT)
	private String url;
	
	private long created;
	
	@JsonInclude(Include.NON_DEFAULT)
	private Map<String,String> tsSocialMeta;
	
	@JsonInclude(Include.NON_DEFAULT)
	private Map<String,String> socialMeta;
	
	@JsonInclude(Include.NON_DEFAULT)
	private Map<Long,Long> frozenSupply;


	public Map<String, String> getTsSocialMeta() {
		return tsSocialMeta;
	}

	public void setTsSocialMeta(Map<String, String> tsSocialMeta) {
		this.tsSocialMeta = tsSocialMeta;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public long getSupply() {
		return supply;
	}

	public void setSupply(long supply) {
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

	public Map<String, String> getSocialMeta() {
		return socialMeta;
	}

	public void setSocialMeta(Map<String, String> socialMeta) {
		this.socialMeta = socialMeta;
	}

	public Map<Long, Long> getFrozenSupply() {
		return frozenSupply;
	}

	public void setFrozenSupply(Map<Long, Long> frozenSupply) {
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
		
		result.setId(model.getId());
		result.setName(model.getName());
		result.setDescription(model.getDescription());
		result.setEndTime(model.getEndTime());
		result.setStartTime(model.getStartTime());
		result.setPrecision(model.getPrecision());
		result.setNum(model.getNum());
		result.setTrxNum(model.getTrxNum());
		result.setType(0);
		result.setSupply(model.getTotalSupply());
		result.setUrl(model.getUrl());
		
		if (model.getFrozenSupply()!=null) {
			HashMap<Long,Long> frozenSupply =  new HashMap<>();		
			for(FrozenSupply fs : model.getFrozenSupply()) {
				frozenSupply.put(fs.getFrozenAmount(), fs.getFrozenDays());
			}
			result.setFrozenSupply(frozenSupply);
		}
		
		
		return result;
	}
	
	public static TokenModel from(CreateSmartContractModel model) {
		
		if (model==null) {
			return null;
		}		
		
		
		
		
		
		return null;
	}
	
}