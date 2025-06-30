package com.elevateLabs;

import java.util.ArrayList;

public class Account {
	private String accountHolder;
	private double balance;
	private ArrayList<String> history; 

	public Account(String accountHolder) {
		this.accountHolder = accountHolder;
		this.balance = 0;
		this.history = new ArrayList<>();
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void getBalance() {
		System.out.println("Total balance is "+balance);;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
	
	public void deposit(double amount){
		if(amount > 0) {
			balance = balance + amount;
			history.add("Deposited amount: $"+amount);
			System.out.println("$"+amount+ " Deposited");
		}else {
			System.out.println("Invalid deposite amount.");
		}
		
	}
	public void withdraw(double amount) {
		if(balance > amount) {
			balance = balance - amount;
			history.add("Withdrawal amount: $"+amount);
			System.out.println("$"+ amount + " withdraw completed");
		}else {
			System.out.println("Insufficient balance.");
		}
	}
	
	public void TransactionHistory() {
		System.out.println("Transaction");
		if(history.isEmpty()) {
			System.out.println("No transaction yet.");
		}else {
			for (String string : history) {
				System.out.println(string);
			}
		}
	}

}
