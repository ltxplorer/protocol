package io.trxplorer.protocol.model.core;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountModel {
	
	private String accountName;
	
	private AccountTypeModel type;
	
	private String address;
	
	private long balance;
	
	private long frozenBalance;
	
	private long frozenBalanceExpiration;
	
	private HashMap<String,Long> votes;
	
	private long netUsage;
	
	private long acquiredDelegatedFrozenBalanceForBandwidth;
	
	private long delegatedFrozenBalanceForBandwidth;
	
	private long createTime;
	
	private long latestOperationTime;
	
	private long allowance;
	
	private long latestWithdrawTime;
	
	private String code;
	
	private boolean isWitness;
	
	private boolean isCommittee;
	
	private List<FrozenModel> frozenSupply;
	
	private String assetIssuedName;
	
	private String assetIssuedId;
	
	private long freeNetUsage;
	
	private long latestConsumeTime;
	
	private long latestConsumeFreeTime;
	
	private String accountId;
	
	private AccountResourceModel accountResource;
	
	private String codeHash;
	
	private Map<String,BigDecimal> assetMap;
	
	
	
	public long getFrozenBalance() {
		return frozenBalance;
	}

	public void setFrozenBalance(long frozenBalance) {
		this.frozenBalance = frozenBalance;
	}

	public long getFrozenBalanceExpiration() {
		return frozenBalanceExpiration;
	}

	public void setFrozenBalanceExpiration(long frozenBalanceExpiration) {
		this.frozenBalanceExpiration = frozenBalanceExpiration;
	}

	public Map<String, BigDecimal> getAssetMap() {
		return assetMap;
	}

	public void setAssetMap(Map<String, BigDecimal> newAssetMap) {
		this.assetMap = newAssetMap;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public AccountTypeModel getType() {
		return type;
	}

	public void setType(AccountTypeModel type) {
		this.type = type;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}


	public HashMap<String, Long> getVotes() {
		return votes;
	}

	public void setVotes(HashMap<String, Long> votes) {
		this.votes = votes;
	}

	public long getNetUsage() {
		return netUsage;
	}

	public void setNetUsage(long netUsage) {
		this.netUsage = netUsage;
	}

	public long getAcquiredDelegatedFrozenBalanceForBandwidth() {
		return acquiredDelegatedFrozenBalanceForBandwidth;
	}

	public void setAcquiredDelegatedFrozenBalanceForBandwidth(long acquiredDelegatedFrozenBalanceForBandwidth) {
		this.acquiredDelegatedFrozenBalanceForBandwidth = acquiredDelegatedFrozenBalanceForBandwidth;
	}

	public long getDelegatedFrozenBalanceForBandwidth() {
		return delegatedFrozenBalanceForBandwidth;
	}

	public void setDelegatedFrozenBalanceForBandwidth(long delegatedFrozenBalanceForBandwidth) {
		this.delegatedFrozenBalanceForBandwidth = delegatedFrozenBalanceForBandwidth;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public long getLatestOperationTime() {
		return latestOperationTime;
	}

	public void setLatestOperationTime(long latestOperationTime) {
		this.latestOperationTime = latestOperationTime;
	}

	public long getAllowance() {
		return allowance;
	}

	public void setAllowance(long allowance) {
		this.allowance = allowance;
	}

	public long getLatestWithdrawTime() {
		return latestWithdrawTime;
	}

	public void setLatestWithdrawTime(long latestWithdrawTime) {
		this.latestWithdrawTime = latestWithdrawTime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public boolean isWitness() {
		return isWitness;
	}

	public void setWitness(boolean isWitness) {
		this.isWitness = isWitness;
	}

	public boolean isCommittee() {
		return isCommittee;
	}

	public void setCommittee(boolean isCommittee) {
		this.isCommittee = isCommittee;
	}

	public List<FrozenModel> getFrozenSupply() {
		return frozenSupply;
	}

	public void setFrozenSupply(List<FrozenModel> frozenSupply) {
		this.frozenSupply = frozenSupply;
	}

	public String getAssetIssuedName() {
		return assetIssuedName;
	}

	public void setAssetIssuedName(String assetIssuedName) {
		this.assetIssuedName = assetIssuedName;
	}

	public String getAssetIssuedId() {
		return assetIssuedId;
	}

	public void setAssetIssuedId(String assetIssuedId) {
		this.assetIssuedId = assetIssuedId;
	}

	public long getFreeNetUsage() {
		return freeNetUsage;
	}

	public void setFreeNetUsage(long freeNetUsage) {
		this.freeNetUsage = freeNetUsage;
	}

	public long getLatestConsumeTime() {
		return latestConsumeTime;
	}

	public void setLatestConsumeTime(long latestConsumeTime) {
		this.latestConsumeTime = latestConsumeTime;
	}

	public long getLatestConsumeFreeTime() {
		return latestConsumeFreeTime;
	}

	public void setLatestConsumeFreeTime(long latestConsumeFreeTime) {
		this.latestConsumeFreeTime = latestConsumeFreeTime;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public AccountResourceModel getAccountResource() {
		return accountResource;
	}

	public void setAccountResource(AccountResourceModel accountResource) {
		this.accountResource = accountResource;
	}

	public String getCodeHash() {
		return codeHash;
	}

	public void setCodeHash(String codeHash) {
		this.codeHash = codeHash;
	}

}
