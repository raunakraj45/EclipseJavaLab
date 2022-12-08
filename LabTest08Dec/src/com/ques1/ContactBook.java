/*
 * Program: Anna wants to create a Contact book of friends.
 * She needs name,contact number and email of her friends.
 * She don't want duplicates.Help Anna achieve the task.
 * @Author: Raunak Raj
 * @Date: 08/12/2022
 * */

package com.ques1;

import java.util.ArrayList;

public class ContactBook {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> no = new ArrayList<>();
		ArrayList<String> email  = new ArrayList<>();
		name.add("Sakshi");
		no.add("6593254789");
		email.add("sssakshisinha@gmail.com");
		name.add("Raunak");
		no.add("9507066168");
		email.add("raunakraj4518@gmail.com");
		System.out.println(name);
		System.out.println(no);
		System.out.println(email);
		
		
		

	}

}
