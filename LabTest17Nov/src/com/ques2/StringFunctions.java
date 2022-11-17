/*
 * Program: write 5 functions of string in java program
 * @Author: Raunak Raj
 * @Date: 17/11/2022
 * */

package com.ques2;

import java.util.Scanner;

public class StringFunctions {
	Scanner sc = new Scanner(System.in);
	
	void upperCase()
	{
		String str1="Python is a programming Language";
		System.out.println(str1.toUpperCase());
	}
	void Length()
	{
		String str2="I am going to Delhi";
		System.out.println("Length of String: "+str2.length());
	}
	void IndexOf()
	{
		String str3 = "We are going to Rameshwaram";
		System.out.println(str3.indexOf("going"));
	}
	void CharAt()
	{
		String str4 = "Java is object oriented programming language";
		System.out.println(str4.charAt(6));
	}
	void Equals()
	{
		String Str5 = "Hello";
		String Str6 = "Hello";
		String Str7 = "How are you";
		System.out.println(Str5.equals(Str6)); // Returns true because they are equal
		System.out.println(Str5.equals(Str7)); // false
	}

	public static void main(String[] args) {
		
		
		StringFunctions obj = new StringFunctions();
		obj.upperCase();
		obj.Length();
		obj.IndexOf();
		obj.CharAt();
		obj.Equals();
		

	}

}
