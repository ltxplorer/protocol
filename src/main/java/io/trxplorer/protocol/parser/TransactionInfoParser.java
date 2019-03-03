package io.trxplorer.protocol.parser;

import org.tron.protos.Protocol.TransactionInfo;

import io.trxplorer.protocol.model.core.ResourceReceiptModel;
import io.trxplorer.protocol.model.core.TransactionInfoModel;

public class TransactionInfoParser {

	
	public static TransactionInfoModel parse(TransactionInfo txInfo) {
		
		TransactionInfoModel result = new TransactionInfoModel();
		
		result.setBlockNumber(txInfo.getBlockNumber());
		result.setFee(txInfo.getFee());
		result.setExchangeId(txInfo.getExchangeId());
		result.setWithdrawAmount(txInfo.getWithdrawAmount());
		result.setExchangeReceivedAmount(txInfo.getExchangeReceivedAmount());
		result.setExchangeInjectAnotherAmount(txInfo.getExchangeInjectAnotherAmount());
		result.setExchangeWithdrawAnotherAmount(txInfo.getExchangeWithdrawAnotherAmount());
		
		ResourceReceiptModel receipt = new ResourceReceiptModel();
		
		
		receipt.setEnergyFee(txInfo.getReceipt().getEnergyFee());
		receipt.setEnergyUsage(txInfo.getReceipt().getEnergyUsage());
		receipt.setNetFee(txInfo.getReceipt().getNetFee());//trx 
		receipt.setNetUsage(txInfo.getReceipt().getNetUsage());//bandwidth
		receipt.setOriginEnergyUsage(txInfo.getReceipt().getOriginEnergyUsage());//energy
		receipt.setResult(txInfo.getReceipt().getResult());
		
		result.setReceipt(receipt);
		
		return result;
	}
	
}
