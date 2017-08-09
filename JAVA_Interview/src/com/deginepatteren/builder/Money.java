package com.deginepatteren.builder;

import java.math.BigDecimal;

public class Money {
	
	private CurrencyType currencyType;
	private BigDecimal amount;
	
	public CurrencyType getCurrencyType() {
		return currencyType;
	}
	public void setCurrencyType(CurrencyType currencyType) {
		this.currencyType = currencyType;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
	@Override
	public String toString() {
		return "Money [currencyType=" + currencyType + ", amount=" + amount + "]";
	}
	
	

}
