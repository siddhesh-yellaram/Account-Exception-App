package com.techlab.model;

import java.io.IOException;

public class Account {
	private int accountNo;
	private double balance;
	private String accName;
	
	public Account(int accountNo, String accName, double balance){
		this.accountNo = accountNo;
		this.accName = accName;
		this.balance = balance;
	}
	
	public int getAccNo() {
		return accountNo;
	}
	
	public String getAccName() {
		return accName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) throws IOException {
		if(this.balance - amount < 500) {
			throw new IOException("Insufficient Balance");
		}else {
			this.balance -= amount;
		}
	}
}
