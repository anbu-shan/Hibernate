package com.bank;

public class Savings extends BankAccount {
	private static double maximumAmountCanTransfer = 100000;
	private static int maximumNumberOfTransactions = 5;
	private double amountTransfered;
	private int numberOfTransactions;

	@Override
	public boolean withdraw(double amount) {
		if(numberOfTransactions <= maximumNumberOfTransactions)
			return super.deposit(amount);
		else
			return super.deposit(amount-50);
	}

	@Override
	public boolean deposit(double amount) {
		if(numberOfTransactions <= maximumNumberOfTransactions  &&  amount <= maximumAmountCanTransfer)
			return super.deposit(amount);
		else
			return super.deposit(amount-50);
	}

	public Savings() {
		super();

	}

	public Savings(long accountNumber, String accountHolder, String address, long phoneNumber, String emailId,
			double balance) {
		super(accountNumber, accountHolder, address, phoneNumber, emailId, balance);

	}

	public double getMaximumAmountCanTransfer() {
		return maximumAmountCanTransfer;
	}

	public void setMaximumAmountCanTransfer(double maximumAmountCanTransfer) {
		this.maximumAmountCanTransfer = maximumAmountCanTransfer;
	}

	public int getMaximumNumberOfTransactions() {
		return maximumNumberOfTransactions;
	}

	public void setMaximumNumberOfTransactions(int maximumNumberOfTransactions) {
		this.maximumNumberOfTransactions = maximumNumberOfTransactions;
	}

	public double getAmountTransfered() {
		return amountTransfered;
	}

	public void setAmountTransfered(double amountTransfered) {
		this.amountTransfered = amountTransfered;
	}

	public int getNumberOfTransactions() {
		return numberOfTransactions;
	}

	public void setNumberOfTransactions(int numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
	}

}
