package com.wipro.Day_nine;

class MethodSync {
	private int balance = 10000;

	public synchronized void withdraw(int amount) {
		if (balance >= amount) {
			System.out.println(Thread.currentThread().getName() + " is withdrawing");
			balance -= amount;
			System.out.println("Balance after withdrawal: " + balance);
		} else {
			System.out.println("Insufficient funds for " + Thread.currentThread().getName());
		}
	}
}