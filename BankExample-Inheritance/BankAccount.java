package com.bank;

public class BankAccount {
	private long accountNumber;
	private String accountHolder;
	private String address;
	private long phoneNumber;
	private String emailId;
	protected double balance;

	public boolean withdraw(double amount) {
		if(balance > amount)
		{
			balance -= amount;
			return true;
		}
		else return false;
	}

	public boolean deposit(double amount) {
		balance += amount;
		return true;
	}

	public BankAccount() {
		super();
	}

	public BankAccount(long accountNumber, String accountHolder, String address, long phoneNumber, String emailId,
			double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.balance = balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
