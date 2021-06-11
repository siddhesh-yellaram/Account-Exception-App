package com.techlab.test;

import com.techlab.model.Account;

public class AccountTest {

	public static void main(String[] args) {
		try {
		Account a1 = new Account(101,"A1",5000);
		Account a2 = new Account(102, "A2", 450);
		a1.deposit(500);
		a2.deposit(500);
		a2.withdraw(500);
		a1.withdraw(100);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
