/*
 * Program: Identify the student(name) with the help of thier id(unique) from the 
 * 			generic list of students
 * @Author: Raunak Raj
 * @Date: 08/12/2022
 * */
package com.ques2;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		List<Integer> id = new ArrayList<>();
		List<String> name = new ArrayList<>();
		id.add(1);
		name.add("Sakshi");
		id.add(2);
		name.add("Raunak");
		id.add(3);
		name.add("Muskan");
		id.add(4);
		name.add("Sujata");
		id.add(5);
		name.add("Dhiraja");
		System.out.println("ID's: "+id+"\n"+"Name: "+name);
		

	}

}
