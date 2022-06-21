package com.amdocs.Banking_Application;
import java.util.Scanner;
import java.util.*;
public class BankingMain {
	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
		ArrayList<BankAccount> list = new ArrayList<BankAccount>();

//		bankaccountlist list = new bankaccountlist();
		
		
		
		System.out.println("Enter the number of accounts to be added");
		int noofpeople = userInput.nextInt();
		for(int i=0;i<noofpeople;i++)
		{
			
			System.out.println("Enter a account number:");
			int accountno = userInput.nextInt();
			userInput.nextLine();
			System.out.println("Enter a name:");
		    String accname = userInput.nextLine();
		    
	        list.add(new BankAccount(accountno,accname,0));
	        
		
		}
		
		
		int ch;  
        do {  
            System.out.println("\n ----Banking System ");  
            System.out.println(" 1. Display account details for all \n 2. Search by Account number\n 3. Deposit \n 4. Withdraw  \n 5. Print Mini Statement \n 6. Check Balance for an account ");  
            System.out.println("Enter your choice: ");  
            ch = userInput.nextInt();  
                switch (ch) {  
                    case 1:  
                    	for(BankAccount x:list)
                		{
                			System.out.println(x);
                		}
                        break;  
                    case 2:  
                        System.out.print("Enter account no.to be searched: ");  
                        int ac_no = userInput.nextInt(); 
                        //boolean found = false; 
                        for(BankAccount x:list)
                		{
                			if(x.getAccountNumber() == ac_no)
                			{
                				System.out.println(x);
                				break;
                			}
                			else {
                				System.out.println("User not found");
                			}
                		}
                        //boolean found = false;  
                        
                        break;  
                    case 3:  
                        System.out.print("Enter Account no. : ");  
                       int ac_no2 = userInput.nextInt();  
                       //found=false;
                       for(BankAccount x:list)
               		{
               			if(x.getAccountNumber() == ac_no2)
               			{
               				System.out.print("Enter deposit amount: ");  
                            int depamount = userInput.nextInt();  
                            x.deposit(depamount);
                            break;
               			}
               			else {
               				System.out.println("User not found");
               			}
               		}
                        
                        break;  
                    case 4:  
                    	System.out.print("Enter Account no. : ");  
                        int ac_no3 = userInput.nextInt();  
                        for(BankAccount x:list)
                		{
                			if(x.getAccountNumber() == ac_no3)
                			{
                				System.out.print("Enter amount ");  
                             int withdrawamount = userInput.nextInt();  
                             try {
                         		x.withdraw(withdrawamount);
                         	} catch (InsufficientBalanceException e) {
                         		// TODO Auto-generated catch block
                         		e.printStackTrace();
                         	}
                             break;
                			}
                			else {
                				System.out.println("User not found");
                			}
                		}
                        break;  
                    case 5:  
                    	System.out.print("Enter Account no. : ");  
                        int ac_no4 = userInput.nextInt(); 
                        for(BankAccount x:list)
                		{
                			if(x.getAccountNumber() == ac_no4)
                			{
                				TransactionDetails.showMiniStatement(ac_no4);
                				break;
                         	
                			}
                			else {
                				System.out.println("User not found");
                			}
                		}
                        break;  
                    case 6:  
                    	System.out.print("Enter Account no. : ");  
                        int ac_no5 = userInput.nextInt(); 
                        for(BankAccount x:list)
                		{
                			if(x.getAccountNumber() == ac_no5)
                			{
                				x.checkbalance(ac_no5);
                				break;
                         	
                			}
                			else {
                				System.out.println("User not found");
                			}
                		}
                        break;  
                }  
            }  
            while (ch != 6);  
        }  
       
       
        
        
       
        
//        BankAccount b = new BankAccount();
        
        
//        b.setAccountNumber(accountno);
//        b.setCustomerName(accname);
//        b.setAccountBalance(0);
        
//        System.out.println("Account Number: "+b1.getAccountNumber());
//        System.out.println("Customer Name: "+b1.getCustomerName());
//        System.out.println("Account Balance: "+b1.getAccountBalance());
//        b.deposit(1000);
//        b.deposit(100);
//        try {
//    		b.withdraw(50);
//    	} catch (InsufficientBalanceException e) {
//    		// TODO Auto-generated catch block
//    		e.printStackTrace();
//    	}
//        System.out.println("__________");
//        TransactionDetails.showMiniStatement(accountno);
//        b.checkbalance(b.getAccountNumber());
//        
        
        
		
		
//		BankAccount b1 = new BankAccount( 101, "Ravi", 1000);
//		BankAccount b2 = new BankAccount( 102, "Scott", 25000);
//		
//	
//	
//	b1.deposit(1000);
//	b1.deposit(500);
//	b1.deposit(700);
//	
//	try {
//		b1.withdraw(1500);
//	} catch (InsufficientBalanceException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	System.out.println("__________");
//	TransactionDetails.showMiniStatement(101);
//	b1.checkbalance(101);
	}
	
	
