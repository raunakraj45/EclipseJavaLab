/*
 * Program: ABC company wants to increment the salary of employees 10% from 
 * their current salary.But the MD of company set the one criteria,
 * those the employee need to be work more than 3 years in this company.
 * Help the HR of ABC company to achieve the task
 * @Author: Raunak Raj
 * @Date: 08/12/2022
 * */

package com.ques3;
class Employee
{
	int id,year;
	float sal;
	String name;
	
	public Employee(int id,String name,float sal,int year) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.year = year;
	}
	public void increment()
	{
		if(year>3)
		{
			System.out.println("Congratulations!! Your Salary is incremented");
			System.out.println("Your's New Incremented Salary: "+(sal+((sal*10)/100)));
		}
		else
			System.out.println("Sorry your Experience is low");
	}
}
public class EmpSalIncrement {
	
	public static void main(String[] args) {
		Employee obj1 = new Employee(1, "Sakshi", 60000f, 1);
		Employee obj2 = new Employee(2, "Raunak", 90000f, 6);
		System.out.println("ID: "+obj1.id);
		System.out.println("Name: "+obj1.name);
		System.out.println("Salary: "+obj1.sal);
		System.out.println("Year of Experience: "+obj1.year);
		obj1.increment();
		System.out.println("\n");
		System.out.println("ID: "+obj2.id);
		System.out.println("Name: "+obj2.name);
		System.out.println("Salary: "+obj2.sal);
		System.out.println("Year of Experience: "+obj2.year);
		obj2.increment();
		
		
		
		
		
	}

}
