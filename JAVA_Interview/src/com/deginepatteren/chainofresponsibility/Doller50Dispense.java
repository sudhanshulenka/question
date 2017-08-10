package com.deginepatteren.chainofresponsibility;

public class Doller50Dispense implements DispenseChain {

	private DispenseChain dispenseChain;

	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.dispenseChain = nextChain;

	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmount() >= 50) {
			int num = cur.getAmount() / 50;
			int remainder = cur.getAmount() % 50;
			System.out.println("Dispensing " + num + " 50$ note");
			if (remainder != 0)
				this.dispenseChain.dispense(new Currency(remainder));
		} else {
			this.dispenseChain.dispense(cur);
		}

	}

}
