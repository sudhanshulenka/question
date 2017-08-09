package com.ubs;

import java.util.Vector;

public class BankAccount {
	private double balance;

	public synchronized void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		synchronized (this) {
			balance -= amount;
		}
	}

	public double getBalance() {
		return balance;
	}
}
