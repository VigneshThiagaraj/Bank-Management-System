package com.java.bank;

import java.util.HashMap;
import java.util.Map;

public class Account {
	
	private long accountNumber;
	private String accountType;
	private double accountBalance;
	private Map<String,TransactionID> transactionID = new HashMap<String,TransactionID>();
	
	public Account(long accountNumber, String accountType, double accountBalance) {
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	
	public void addTransactionID(String ID,TransactionID trans) {
		transactionID.put(ID,trans);
	}
	public Map<String,TransactionID> getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(Map<String,TransactionID> transactionID) {
		this.transactionID = transactionID;
	}

	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
}
