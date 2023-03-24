package com.icici;

public class BankImpl implements Bank{
	int balance;
	BankImpl(int balance){
		this.balance=balance;
	}
	@Override
	public void deposit(int amount) {
		System.out.println("depositing Rs. "+amount);
		balance+=amount;//balancde=balance+amount;
			System.out.println("amount deposit successfully");
	}
	@Override
	public void withdraw(int amount) {
		System.out.println("withdrawing Rs. "+amount);
	}
	@Override
	public int getBalance() {
		return balance;
	}
}
