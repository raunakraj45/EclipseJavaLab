/*
 * Program: Write a Java program to reverse a string without using StringBuffer and StringBuilder
 * @Author: Raunak Raj
 * @Date: 29/12/2022
 * */

package com.ques3;

//import scanner class
import java.util.Scanner;

//Class declare
public class ReverseString {

//	function for reversing string
	void revString(String string) {
		System.out.print("Reversed String: ");
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
	}

//	main method
	public static void main(String[] args) {

//		scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str = sc.next();

//		class object
		ReverseString ob = new ReverseString();

//		function calling
		ob.revString(str);
		sc.close();
	}// main ends

}// class ends
