package com.ques3;

public class PiggyBank {
	
	
		// instance variables
		private double balance=50;
		
		// method to enter amount
		void AddAmount(double bal) {
			balance = bal;
		}
		
		// method to add more money
		double addMoney(double amount) {
			balance += amount;
			
			System.out.println("The total balance in your piggi bank is .......");
			return balance;
		}
		
		//print amount of piggi bank
		void piggiBankAmount() {
			System.out.println("Balance :" + balance);
		}	

}
