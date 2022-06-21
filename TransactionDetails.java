package com.amdocs.Banking_Application;

import java.util.LinkedList;
import java.util.List;

public class TransactionDetails {
	public static List<Transaction> transactionList = new LinkedList<>();
	
	public static void addTransaction(Transaction t) {
		transactionList.add(t);
		
	}
	
	public static void showMiniStatement( int accountNumber) {
		System.out.println("Mini statement for account Number: " + accountNumber);
		System.out.println();
		
		for( Transaction t : transactionList) {
			
			if (t.getAccountNumber()== accountNumber) {
				
				System.out.println(t.getTransactionNumber() + "-" + t.getTranType() + "-" + t.getTranAmmount() + "-" + t.getBalanceAfterThisTransaction());
				
				
			}
		}
	}
	

}
