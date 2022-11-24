/*
 * Program: The management of LearnMore University is planning 
 * to automate the University management system. Therefore, 
 * Steve Wilkinson, the programmer, has decided to create a Java 
 * program that accepts the student details, such as the first 
 * name, last name, age, course enrolled, and student ID. 
 * In addition, he also needs to accept the employee details, 
 * such as first name, last name, age, salary, department name, 
 * designation, and employee ID. Steve must ensure the reusability
 * of code. The program must offer a choice to accept either the 
 * student’s or employee’s details. Help Steve to develop the program.
 *  
 * @Author: Raunak Raj
 * @Date: 24/11/2022 
 * */

package com.ques1;

import java.util.Scanner;

public class UniversityRecords {
	
	private int s_id,e_id,s_age,e_age;
	private String s_fname,s_lname,e_fname,e_lname,s_course,e_dept,e_designation;
	private float e_salary;
	static Scanner sc = new Scanner (System.in);
	private static int c;
	
	
	public void enterStudentDetails()
	{
		System.out.println("------Student Details------");
		System.out.println("Enter the first name:");
		s_fname = sc.next();
		System.out.println("Enter the last name:");
		s_lname = sc.next();
		System.out.println("Enter Student ID:");
		s_id = sc.nextInt();
		System.out.println("Enter the age:");
		s_age = sc.nextInt();
		System.out.println("Enter the course:");
		s_course = sc.next();
		
		
		System.out.println("------STUDENT DETAILS------");
		System.out.println("Name: "+s_fname+" "+s_lname);
		System.out.println("Student ID: "+s_id);
		System.out.println("Student Age: "+s_age);
		System.out.println("Student Course: "+s_course);
		System.out.println("------------------------------------");
		
	}
	public void enterEmployeeDetails()
	{
		System.out.println("------Employee Details------");
		System.out.println("Enter the first name:");
		e_fname = sc.next();
		System.out.println("Enter the last name:");
		e_lname = sc.next();
		System.out.println("Enter Employee ID:");
		e_id = sc.nextInt();
		System.out.println("Enter the age:");
		e_age = sc.nextInt();
		System.out.println("Enter the course:");
		e_dept = sc.next();
		System.out.println("Enter Designation:");
		e_designation = sc.next();
		
		
		System.out.println("------EMPLOYEE DETAILS------");
		System.out.println("Name: "+e_fname+" "+e_lname);
		System.out.println("Employee ID: "+e_id);
		System.out.println("Employee Age: "+e_age);
		System.out.println("Employee Department: "+e_dept);
		System.out.println("Employee Designation: "+e_designation);
		System.out.println("------------------------------------");
		
	}

	public static void main(String[] args) {
		UniversityRecords obj = new UniversityRecords();
		System.out.println("*********LEARNMORE UNIVERSITY*********\n");
		
		int ch=0;	
		System.out.println("Choose Operations for Entering Details:");
		System.out.println("1: Student\n2:Employee");
		ch = sc.nextInt();
			
			
		switch(ch)
		{
		case 1: 
		{
			obj.enterStudentDetails();
			break;
		}
		case 2:
		{
			obj.enterEmployeeDetails();
			break;
		}
		default:
			System.out.println("Invalid Cholice");
		}
		
		

	}

}
