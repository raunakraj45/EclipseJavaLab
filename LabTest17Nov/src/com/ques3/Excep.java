package com.ques3;

public class Excep extends Exception {
	
	public Excep(String str)
	{
		super(str);
		System.out.println("Wrong Input");
	}
	

}
