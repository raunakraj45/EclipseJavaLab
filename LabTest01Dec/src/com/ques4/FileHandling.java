package com.ques4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		File f = new File("D:\\Raunak.txt");
		if(f.createNewFile())
		{
			System.out.println("File Created");
		}
		else
			System.out.println("File not Created");
		
		String data = sc.next();
		FileWriter fw = new FileWriter(f);
		fw.write(data);
		fw.close();
		
		FileReader fr = new FileReader("D:\\Raunak.txt");
		char[] data1 = new char[100];
		fr.read(data1);
		System.out.println(data1);

	}

}
