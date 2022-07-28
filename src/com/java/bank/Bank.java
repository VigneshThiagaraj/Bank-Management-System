package com.java.bank;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Bank implements Transaction{
	private String bankName;
	private String ifscCode;
	private String address;
	private Map<String,AccountHolders> accountHolders = new HashMap<String,AccountHolders>();
	
	public Bank(String bankName, String ifscCode, String address) {
		this.bankName = bankName;
		this.ifscCode = ifscCode;
		this.address = address;
	}

	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public void addUsers(String name, AccountHolders user) {
		accountHolders.put(name,user);
	}

	public Map<String, AccountHolders> getUsers() {
		return accountHolders;
	}

	@Override
	public void deposit(String name, long accountNumber, double amount) {
		// TODO Auto-generated method stub

		if(accountHolders.get(name).getAccount().getAccountNumber() == accountNumber) {
			accountHolders.get(name).getAccount().setAccountBalance(accountHolders.get(name).getAccount().getAccountBalance() + amount);
			accountHolders.get(name).getAccount().addTransactionID(UUID.randomUUID().toString(), new TransactionID("Completed"));
		}

	}

	@Override
	public void withdraw(String name, long accountNumber, double amount) {
		// TODO Auto-generated method stub

		if(accountHolders.get(name).getAccount().getAccountNumber() == accountNumber) {
			accountHolders.get(name).getAccount().setAccountBalance(accountHolders.get(name).getAccount().getAccountBalance() - amount);

		}
	}

}
