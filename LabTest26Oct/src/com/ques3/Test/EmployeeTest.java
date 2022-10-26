/*
 * Employee Test 
 * @Author: Raunak Raj
 * @Date:26 Oct 2022
 */

package com.ques3.Test;

//Import Scanner Class
import java.util.Scanner;

//Import Package
import com.ques3.Employee.EmployeeDetails;

//Creating a Class
public class EmployeeTest {

	public static void main(String[] args) {
		
		// Create the object of EmployeeDetails class
				EmployeeDetails emp = new EmployeeDetails();

				// Declare an object of Scanner class
				Scanner sc = new Scanner(System.in);

				// Declaring variables
				int id;
				String name, department;
				float salary;

				// Taking an input of employees details
				System.out.println("Enter Employee's Name:");
				name = sc.nextLine();
				System.out.println("Enter Employee's Id:");
				id = sc.nextInt();
				System.out.println("Enter Employee's Department:");
				department = sc.next();
				System.out.println("Enter Employee's Salary:");
				salary = sc.nextFloat();

				
				// call the method
				emp.getDetails(id, name, department,salary);

				

				System.out.println("**********************************************************");

				// Print the details
				emp.printDetails();

				sc.close();

	}//End of main

}//End of class
