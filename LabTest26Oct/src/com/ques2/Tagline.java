/*
*Program:  WAP to print the tagline of various IT companies using enhanced switch case .
*@author: Raunak Raj
*@Date: 26 Oct 2022  
*/

package com.ques2;

//import Scanner class
import java.util.Scanner;

//Create Tagline class
public class Tagline {
	
	//method to print Tagline
		static void printTagline(String tag)
		{
			 switch(tag)//Switch Case
		   {
			   //expression
			   case "wipro" ->System.out.println("Applying Thoughts");		               
	           case "infosys" ->System.out.println("Navigate Your Next");		              		
	           case "tcs"-> System.out.println("Building on Belief");		               	
	           case "samsung"-> System.out.println("Together for tomorrow");		               	

	           default-> System.out.println("Wrong input");						
		   } //End of Switch
			
		}	
			
	//Main method starts
	public static void main(String[] args) 
	{
		 // Declaring Variables
		   String input;
		   
		    //creating the object of scanner
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter an Company's Name for Tagline(wipro,infosys,tcs,samsung):");
			input= sc.next().toLowerCase();// converting the input to lowercase
		   
		   //Method Calling
		  printTagline(input);
	}

}
