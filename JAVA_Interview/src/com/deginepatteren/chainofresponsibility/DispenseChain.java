package com.deginepatteren.chainofresponsibility;

public interface DispenseChain {

	void setNextChain(DispenseChain dispense);
	void dispense(Currency cur);
	
}
