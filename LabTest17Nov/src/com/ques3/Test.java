package com.ques3;

import java.util.Scanner;

public class Test {
	
	static void menu()
	{
		System.out.println("1: Play");
		System.out.println("2: Check Your Scores");
		System.out.println("3: Exit");
	}

	public static void main(String[] args) throws Excep {
		
		int choice;
		try
		{
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();
			menu();
			System.out.println(choice);
			sc.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
