package com.deginepatteren.builder;

import java.io.Serializable;
import java.math.BigDecimal;

public class MoneyDetails implements Serializable {

	private Money amount;
	private MoneyType amountType;
	
	public Money getAmount() {
		return amount;
	}
	public void setAmount(Money amount) {
		this.amount = amount;
	}
	public MoneyType getAmountType() {
		return amountType;
	}
	public void setAmountType(MoneyType amountType) {
		this.amountType = amountType;
	}
  
	
	
}
