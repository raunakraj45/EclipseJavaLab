/*
 * Program: Create a class with a method that prints "This is parent class" 
 * and its subclass with another method that prints "This is child class".
 *  Now, create an object for each of the class and call
 * 1 - method of parent class by object of parent class
 * 2 - method of child class by object of child class
 * 3 - method of parent class by object of child class
 * @Author: Raunak Raj
 * @Date: 24/11/2022
 * */

package com.ques2;

public class Inheritance1 {
	 public void method()
	 {
		 System.out.println("This is Parent Class");
	 }
	 }
class Inheritance2 extends Inheritance1 {
	public void method()
	{
		super.method();
		System.out.println("This is child class");
	}
}

