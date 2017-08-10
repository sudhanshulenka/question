package com.deginepatteren.chainofresponsibility;

import java.util.Scanner;

public class ATMDispense {
	private DispenseChain c1;

	public ATMDispense() {
		// initialize the chain
		this.c1 = new Doller50Dispense();
		DispenseChain c2 = new Doller20Dispense();
		DispenseChain c3 = new Doller10Dispense();
		// set the chain of responsibility
		c1.setNextChain(c2);
		c2.setNextChain(c3);
	}

	public static void main(String[] args) {
		ATMDispense atmDispenser = new ATMDispense();
		while (true) {
			int amount = 0;
			System.out.println("Enter amount to dispense");
			Scanner input = new Scanner(System.in);
			amount = input.nextInt();
			if (amount % 10 != 0) {
				System.out.println("Amount should be in multiple of 10s.");
				return;
			}
			// process the request
			atmDispenser.c1.dispense(new Currency(amount));
		}
	}
}
