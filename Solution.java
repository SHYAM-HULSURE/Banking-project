package com.icici;

import java.util.Scanner;

public class Solution {
	int balance;
	public static void main(String[] args) {
		
		System.out.println("welcome to icici bank");
		System.out.println("-------------------");
		Scanner ip=new Scanner(System.in);
		Bank bank=new BankImpl(5000);
		while(true) {
			int balnce=0;
		System.out.println("options\n1.deposit amount\n2.withdraw amount\n3.gebalance\n4.EXIT");
		int choice =ip.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter the amount to be deposit");
			int amountToDeposit=ip.nextInt();
			bank.deposit(amountToDeposit);//bank.deposit(ip.nextInt();
			break;
			
		case 2:
			System.out.println("enter the amount to be deposit");
			int amount =ip.nextInt();
			if(amount<=balance) {
				balance-=amount;
				System.out.println("Rs "+amount+"amount withdraw successfully");		
			}
			else {
				try {
					throw new InsufficientBalanceException("insufficient balncde");
				}
				catch(Exception e){
					System.out.println(e.getMessage());
				}
			}
			int amountToWithdraw=ip.nextInt();
			bank.deposit(amountToWithdraw);//bank.withdraw(ip.nextInt();
			break;
			
		case 3:
			System.out.println();
		case 4:
			System.out.println("Thank you visit amount");
			System.exit(0);
			default:
				System.out.println("invalid choice");
		}
		System.out.println("-------------------------");
		}
	}
}
