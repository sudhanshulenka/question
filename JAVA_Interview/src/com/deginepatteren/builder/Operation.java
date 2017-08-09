package com.deginepatteren.builder;

import java.math.BigDecimal;

public enum Operation {

	PLUS, MINUS, TIMES, DIVIDE;

	BigDecimal calculate(BigDecimal x, BigDecimal y) {
		switch (this) {
		case PLUS:
			return x.add(y);
		case MINUS:
			return x.subtract(y);
		case TIMES:
			return x.multiply(y);
		case DIVIDE:
			return x.divide(y);
		default:
			throw new AssertionError("Unknown operations " + this);
		}
	}

}
