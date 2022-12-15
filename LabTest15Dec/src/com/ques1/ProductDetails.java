/*
 * Program: Steve is a programmer in Global Systems Inc.
 * He has been assigned a task to create a Java application 
 * that stores the following details about the 
 * computer products in a text file:
 * Product ID
 * Product name
 * Product price
 * As the details are added, they must be appended in the 
 * ProductDetails.txt file in the D:\Details directory.
 * 
 * @Author: Raunak Raj
 * @Date: 15/12/2022
 * */
package com.ques1;

//Import FileWriter,IOException and Scanner Class
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//Declare Class
public class ProductDetails {

	// Main Method
	public static void main(String[] args) throws IOException {

		// Scanner Class Object
		Scanner sc = new Scanner(System.in);

		// Enter Details of product
		System.out.println("Enter Product ID: ");
		String productID = sc.next();
		System.out.println("Enter Product Name: ");
		String productName = sc.next();
		System.out.println("Enter Product Price: ");
		String productPrice = sc.next();

		// FileWriter Object
		FileWriter fw = new FileWriter("D:\\Details Directory/ProductDetails.txt");

		// Calling FileWriter with his object for writing in a file
		fw.write(productID + "\n" + productName + "\n" + productPrice);
		fw.close();
		sc.close();

	}// Main Method ends

}// Class ends
