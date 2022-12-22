/*
 * Program: WAP to accept a number and check number is prime or not.
 * @Author: Raunak Raj
 * @Date: 22/12/2022
 * 
 * */

package com.ques3;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, n, f = 0;
		System.out.println("Enter a No.:");
		n = sc.nextInt();
		for (i = 2; i < n; i++) {
			if (n % i == 0)
				break;
		}
		if (i == n)
			System.out.println("Prime No.");
		else
			System.out.println("Not Prime No.");

	}

}
