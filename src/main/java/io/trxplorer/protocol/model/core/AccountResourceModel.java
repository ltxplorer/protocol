package io.trxplorer.protocol.model.core;

public class AccountResourceModel {

	private long freeNetUsed;
	
	private long freeNetLimit;
	
	private long netUsed;
	
	private long netLimit;
	
	private long energyUsed;
	
	private long energyLimit;

	public long getFreeNetUsed() {
		return freeNetUsed;
	}

	public void setFreeNetUsed(long freeNetUsed) {
		this.freeNetUsed = freeNetUsed;
	}

	public long getFreeNetLimit() {
		return freeNetLimit;
	}

	public void setFreeNetLimit(long freeNetLimit) {
		this.freeNetLimit = freeNetLimit;
	}

	public long getNetUsed() {
		return netUsed;
	}

	public void setNetUsed(long netUsed) {
		this.netUsed = netUsed;
	}

	public long getNetLimit() {
		return netLimit;
	}

	public void setNetLimit(long netLimit) {
		this.netLimit = netLimit;
	}

	public long getEnergyUsed() {
		return energyUsed;
	}

	public void setEnergyUsed(long energyUsed) {
		this.energyUsed = energyUsed;
	}

	public long getEnergyLimit() {
		return energyLimit;
	}

	public void setEnergyLimit(long energyLimit) {
		this.energyLimit = energyLimit;
	}
	
	
	
}
