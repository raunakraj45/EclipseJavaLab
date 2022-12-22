/*
 * Program: WAP to accept a number and check number is palindrome or not.
 * @Author: Raunak Raj
 * @Date: 22/12/2022
 * 
 * */

package com.ques4;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int i, s = 0, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		n = sc.nextInt();
		for (i = n; i > 0; i = i / 10) {
			s = s * 10 + (i % 10);
		}
		if (s == n)
			System.out.println("Palindrome No.: " + n);
		else
			System.out.println("Not Palindrome No.: " + n);
		sc.close();

	}

}
