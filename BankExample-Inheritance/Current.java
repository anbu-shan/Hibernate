package com.bank;

public class Current extends BankAccount {
	private static double minimumAmountCanTransfer = 500000;
	private static int minimumNumberOfTransactions = 5;
	private double amountTransfered;
	private int numberOfTransactions;

	@Override
	public boolean withdraw(double amount) {
		if(numberOfTransactions <= minimumNumberOfTransactions)
			return super.deposit(amount);
		else
			return super.deposit(amount-50);
	}

	@Override
	public boolean deposit(double amount) {
		if(numberOfTransactions > minimumNumberOfTransactions  &&  amount <= minimumAmountCanTransfer)
			return super.deposit(amount);
		else
			return super.deposit(amount-50);
	}

	public Current() {
		super();
	}

	public Current(long accountNumber, String accountHolder, String address, long phoneNumber, String emailId,
			double balance) {
		super(accountNumber, accountHolder, address, phoneNumber, emailId, balance);
	}

	public double getMinimumAmountCanTransfer() {
		return minimumAmountCanTransfer;
	}

	public void setMinimumAmountCanTransfer(double minimumAmountCanTransfer) {
		this.minimumAmountCanTransfer = minimumAmountCanTransfer;
	}

	public int getMinimumNumberOfTransactions() {
		return minimumNumberOfTransactions;
	}

	public void setMinimumNumberOfTransactions(int minimumNumberOfTransactions) {
		this.minimumNumberOfTransactions = minimumNumberOfTransactions;
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
