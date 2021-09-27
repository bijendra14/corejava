package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Date;


public class BinaryToText {
	public static void main(String[] args) throws IOException {
		// read data from keyword
		// binary to text
		InputStreamReader ir = new InputStreamReader(System.in);
		//charto line
		BufferedReader br= new BufferedReader(ir);
		
		// write to file
		FileWriter fw= new FileWriter("E:/Javafilehanding/Mydairy.txt");
		PrintWriter pw= new PrintWriter(fw);
		Date d =new Date();
		pw.println("------------------------------" + d + "------------------");
		System.out.println("WELCOME:" +d);
		
		String line =br.readLine();
		while(!line.equals("quit")) {
			pw.println(line);
			line = br.readLine();
		}
		pw.close();
		fw.close();
		System.out.println("See you later:");
	}

}
