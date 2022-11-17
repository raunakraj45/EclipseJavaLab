/*
 * Program: Create a calculator application in Java that will accept two numbers. Further, the calculator application should be able to perform the following operations one at a time on the two numbers:
Addition
Subtraction
Multiplication
Division
You need to implement exception handling that both the numbers should be greater than 0. Further, the operator used to perform the calculations should only be +,-, *, or, /.
 * @Author: Raunak Raj
 * 
 * */

package com.ques4;

import java.util.Scanner;
public class Calculator {
	public static void main(String args[])
	{
		
		int r,s,t;
		Scanner sc = new Scanner(System.in);
		try 
		{
		System.out.println("Enter two nos. for performing operations: ");
		r = sc.nextInt();
		s = sc.nextInt();
		System.out.println("Choose the following operations given below:-");
		System.out.println("Addition: 1\n"+"Subtraction: 2\n"+"Multiplication: 3\n"+"Division: 4");
		t = sc.nextInt();
		switch(t)
		{
			case 1:
				System.out.println("Add: "+ (r+s));
				break;
			case 2:
				System.out.println("Sub: "+ (r-s));
				break;
			case 3:
				System.out.println("Mul: "+ (r*s));
				break;
			case 4:
				System.out.println("Div: "+ (r/s));
				break;
			default:
				System.out.println("Invalid Choice");
				break;
		}
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
		sc.close();
		
	}
}
