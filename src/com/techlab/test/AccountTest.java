package com.techlab.test;

import com.techlab.model.Account;
import com.techlab.model.InsufficientBalException;

public class AccountTest {

	public static void main(String[] args) {
		try {
		Account a1 = new Account(101,"A1",5000);
		Account a2 = new Account(102, "A2", 450);
		a1.deposit(500);
		if(a2.withdraw(500)) {
			createAccount(a2);
		}else {
			System.out.println("Insufficient Balance");
		}
		}catch(InsufficientBalException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void createAccount(Account obj) {
		System.out.println("Account No: "+obj.getAccNo());
		System.out.println("Account Name: "+obj.getAccName());
		System.out.println("Account Balance: "+obj.getBalance());
	}

}
