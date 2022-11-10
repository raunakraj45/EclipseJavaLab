/*
 * Program: get students marks in array,then print rank along with names
 * @Author: Raunak Raj
 * @Date: 10/11/2022
 * */

package com.question4;

//Import Scanner class
import java.util.Scanner;

//Create Class
public class MarksPercentage {
	
	//Scanner object
	static Scanner sc = new Scanner(System.in);
	//declaring variables
	int a[]=new int[5],i,total=0;
	float per;
	
	//Method for enter marks
	void enterMarks()
	{
		System.out.println("Enter marks of 5 subjects:");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
			total=total+a[i];
		}
		
	}
	
	//method for calculate percentage
	void calculatePercent()
	{
		per=total/5;
		System.out.println("Total Marks: "+total);
		System.out.println("Percentage: "+per);
		
	}
	
	//method for printing details
	void printDetails()
	{
		
		if(per>=60)
		{
			System.out.println("Congratulations You've got 1st Rank");
		}
		else if(per<60 && per>=50)
		{
			System.out.println("Very Good You've got 2nd Rank");
		}
		else if(per<50 && per>=40)
		{
			System.out.println("Good You've got 3rd Rank");
		}
		else
		{
			System.out.println("You got fail. You need more improvement.");
		}
	}

	//Main Method
	public static void main(String[] args) {
		
		//declaring variables
		String name;
		System.out.println("Enter the name of Student:");
		name = sc.next();
		
		//Class Object
		MarksPercentage obj = new MarksPercentage();
		
		//Method Calling
		obj.enterMarks();
		obj.calculatePercent();
		System.out.println("--------------------------------------");
		System.out.println("Student Name: "+name);
		obj.printDetails();

	}//end of main

}//end of class
