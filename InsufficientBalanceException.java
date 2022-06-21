package com.amdocs.Banking_Application;

public class InsufficientBalanceException extends Exception {
	public String toString() {
		return "Balance not sufficient";
	}

}
