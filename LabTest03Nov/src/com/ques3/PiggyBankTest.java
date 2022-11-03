package com.ques3;
//importing packages
import java.util.Scanner;
//declaring a class
public class PiggyBankTest {
	
//creating menu
	static void menu() {
		
		// method to display  the options
		System.out.println("1. Deposit Money");
		System.out.println("2. Exit");
		System.out.println("Enter your Choice:");
}
	//main started
	public static void main(String[] args) {
		
		// creating an object of PiggyBank class
		PiggyBank piggy= new PiggyBank();
		
		//create an object of scanner class 
		Scanner sc = new Scanner(System.in);
		//declaring a variable
		int ch = 0;
		//creating a do while loop
		do {
			//calling menu
			menu();
			//taking the choice of user
			ch = sc.nextInt();
			switch (ch) {
			
			case 1:
				// to deposit money
				System.out.println("Enter an amount that you want to add in the piggybank:");
				double amount = sc.nextDouble();
				System.out.println("Balance :" + piggy.addMoney(amount));
				break;
			case 2:
				// to exit from the choice
				System.exit(0);
				break;
			default:
				//printing the choice
				System.out.println("please enter a valid choice");
			} //end of switch 
			
			//taking input from user to add more money
			System.out.println("Do you want more operations:(1-yes/0-no)");
			ch = sc.nextInt();

		} while (ch == 1);
		// do while ends

		sc.close();

} //end of main method
		
		} // end of class