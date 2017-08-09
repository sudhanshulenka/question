package com.deginepatteren.builder;

import java.math.BigDecimal;

public enum MoneyType {

	BASIC("BASIC"), HRA("HOUSE_RENT_ALLOWANCE"), CONVEYANCE("CONVEYANCE"), SA("SPECIAL_ALLOWANCE"), PF(
			"PROVIDENT FUND"), PT("PROFESSION TAX");

	private String amtType;
	public static final BigDecimal ONE_HUNDRED = new BigDecimal(100);

	MoneyType(String amtType) {
		this.amtType = amtType;
	}

	public String amtType() {
		return amtType;
	}
	
	BigDecimal calculate(BigDecimal amount) {
		switch (this) {
		case BASIC:
			return amount.multiply(new BigDecimal(20)).divide(ONE_HUNDRED);
		case HRA:
			return amount.multiply(new BigDecimal(20)).divide(ONE_HUNDRED);
		case CONVEYANCE:
			return amount.multiply(new BigDecimal(20)).divide(ONE_HUNDRED);
		case SA:
			return amount.multiply(new BigDecimal(20)).divide(ONE_HUNDRED);
		case PF:
			return amount.multiply(new BigDecimal(20)).divide(ONE_HUNDRED);
		default:
			throw new AssertionError("Unknown operations " + this);
		}
	}

}
