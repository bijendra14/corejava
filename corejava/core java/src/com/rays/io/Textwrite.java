package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class Textwrite {
	public static void main(String[] args) throws IOException {
		//File f = new File("E:/Javafilehanding","writetext.txt");
		//write char by char
		// FileWriter fw= new Filewriter(f);
		// /OR
		FileWriter fw = new FileWriter("E:/Javafilehanding/writetext.txt");
		fw.write(" helloo writer  ");
		for (int i=0;i<=5;i++) {
			fw.write(" java "  +1);
		}
		//fw.flush();
		//fw.write(" After Flush ");
		fw.close();
		System.out.println("Data Saved");
	}

}
