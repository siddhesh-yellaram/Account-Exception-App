package com.techlab.model;

public class InsufficientBalException extends RuntimeException {
	private Account a1;
	private String message;
	private double amount;
	
	public InsufficientBalException(Account a,double amount) {
		this.a1 = a;
		this.amount = amount;
	}
	
	@Override
	public String getMessage() {
		setMessage();
		return message;
	}
	
	public void setMessage() {
		StringBuilder sb = new StringBuilder();
		sb.append("Insufficient Balance for Amount: ");
		sb.append(amount);
		sb.append("\nAcc Name: ");
		sb.append(a1.getAccName());
		sb.append("\nAcc No: ");
		sb.append(a1.getAccNo());
		sb.append("\nAcc Balance: ");
		sb.append(a1.getBalance());
		message = sb.toString();
	}
}
