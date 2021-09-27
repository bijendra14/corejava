package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritelineByline {
	public static void main(String[] args) throws IOException   {
		FileWriter fw=new FileWriter("E:/Javafilehanding/writetext.txt",true);
		PrintWriter pw=new PrintWriter(fw);
		for(int i=0;i<=5;i++)
			pw.println(" Line " +1);
		fw.close();
		pw.close();
		System.out.println("Data saved to the file");
	}

}
