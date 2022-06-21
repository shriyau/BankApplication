package com.amdocs.Banking_Application;

public class Transaction {
	private int transactionNumber;
	private int accountNumber;
	private int tranAmmount;
	private String tranType;
	private int balanceAfterThisTransaction;
//public String getTranType;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int transactionNumber, int accountNumber, int tranAmmount, String tranType,
			int balanceAfterThisTransaction) {
		super();
		this.transactionNumber = transactionNumber;
		this.accountNumber = accountNumber;
		this.tranAmmount = tranAmmount;
		this.tranType = tranType;
		this.balanceAfterThisTransaction = balanceAfterThisTransaction;
	}
	
	
	
public int getTransactionNumber() {
		return transactionNumber;
	}
	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getTranAmmount() {
		return tranAmmount;
	}
	public void setTranAmmount(int tranAmmount) {
		this.tranAmmount = tranAmmount;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public int getBalanceAfterThisTransaction() {
		return balanceAfterThisTransaction;
	}
	
	public void setBalanceAfterThisTransaction(int balanceAfterThisTransaction) {
		this.balanceAfterThisTransaction = balanceAfterThisTransaction;
	}
	

}
