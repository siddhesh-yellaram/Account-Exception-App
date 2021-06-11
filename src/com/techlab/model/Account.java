package com.techlab.model;

public class Account {
	private int accountNo;
	private double balance;
	private String accName;
	private boolean isWithdrawSuceeded = true;
	
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
	
	public boolean withdraw(double amount) {
		if(this.balance - amount < 500) {
			isWithdrawSuceeded = false;
			throw new InsufficientBalException(this,500);
		}else {
			this.balance -= amount;
		}
		return isWithdrawSuceeded;
	}
}
