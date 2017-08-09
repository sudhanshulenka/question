package com.deginepatteren.builder;

public enum CurrencyType {
	USD("usd"), INR("inr");

	private String currency;

	CurrencyType(String currency) {
		this.currency = currency;
	}

	public String currency() {
		return currency;
	}

}
