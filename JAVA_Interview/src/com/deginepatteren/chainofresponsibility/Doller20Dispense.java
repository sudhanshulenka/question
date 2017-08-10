package com.deginepatteren.chainofresponsibility;

public class Doller20Dispense implements DispenseChain {

	private DispenseChain dispense;
	
	@Override
	public void setNextChain(DispenseChain nextDispense) {
		this.dispense=nextDispense;
		
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 20) {
			int num = cur.getAmount() / 20;
			int remainder = cur.getAmount() % 20;
			System.out.println("Dispensing " + num + " 20$ note");
			if (remainder != 0)
				this.dispense.dispense(new Currency(remainder));
		} else {
			this.dispense.dispense(cur);
		}
		
	}

}
