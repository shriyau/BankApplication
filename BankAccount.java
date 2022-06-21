package com.amdocs.Banking_Application;
import java.lang.Math;
import java.util.Random;


public class BankAccount {
	private int accountNumber;
	private String customerName;
	private int accountBalance;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int accountNumber, String customerName, int accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountBalance = accountBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public void deposit(int depositAmount) {
		accountBalance += depositAmount;
		Random r = new Random();
		Transaction t = new Transaction(r.nextInt(), accountNumber, 
				 depositAmount, "Deposit", accountBalance);
		TransactionDetails.addTransaction(t);
		System.out.println( " Deposit completed ");
	}
	public void withdraw(int withdrawAmount) throws InsufficientBalanceException {
		if(withdrawAmount > accountBalance) {
			try {
				throw new InsufficientBalanceException();
			} catch (InsufficientBalanceException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		accountBalance -= withdrawAmount;
		
		Random r = new Random();
		Transaction t = new Transaction(r.nextInt(), accountNumber, 
				 withdrawAmount, "withdraw", accountBalance);
		TransactionDetails.addTransaction(t);
		System.out.println( " Withdrawal completed");
	}
	public void checkbalance(int accountNumber)
	{
		if(accountBalance<1000)
		{
			System.out.println( " Account balance not sufficient");
		}
		else {
			System.out.println( " Account balance is : "+accountBalance);
		}
		
	}
	 @Override
	   public String toString() {
	      return accountNumber + " " + customerName+" "+ accountBalance;
	   }
	
}
