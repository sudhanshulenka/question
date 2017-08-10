package com.deginepatteren.chainofresponsibility;

public class Doller10Dispense implements DispenseChain {

	private DispenseChain dispense;
	
	@Override
	public void setNextChain(DispenseChain nextDispense) {
		this.dispense=nextDispense;
		
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 10) {
			int num = cur.getAmount() / 10;
			int remainder = cur.getAmount() % 10;
			System.out.println("Dispensing " + num + " 10$ note");
			if (remainder != 0)
				this.dispense.dispense(new Currency(remainder));
		} else {
			this.dispense.dispense(cur);
		}
		
	}

}
