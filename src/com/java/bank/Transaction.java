package com.java.bank;

public interface Transaction {
	public void deposit(String name, long accountNumber, double amount);
	public void withdraw(String name, long accountNumber, double amount);
	
}
