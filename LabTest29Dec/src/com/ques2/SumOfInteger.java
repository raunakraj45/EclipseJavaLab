/**
 * Program: Write a Java program and compute the sum of the digits of an integer.
 * @Author:Raunak Raj
 * @Date: 29/12/2022
 */
package com.ques2;

//import scanner class
import java.util.Scanner;

//Class Declaration
public class SumOfInteger {

//	method for add digits of number
	void integerSum(int n) {
		int sum = 0;
		for (int i = n; i > 0; i = i / 10) {
			sum = sum + (i % 10);
		}
		System.out.println("Sum of Digits: " + sum);
	}

//	main method
	public static void main(String[] args) {

		// Class Object
		SumOfInteger obj = new SumOfInteger();

		// Scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int num = sc.nextInt();

//		calling function
		obj.integerSum(num);

	}// main ends

}// class ends
