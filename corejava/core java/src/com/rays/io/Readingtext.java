package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readingtext {
	public static void main(String[] args) throws IOException {
		FileReader fr =new FileReader("E:/Javafilehanding/writetext.txt");
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null) {
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		fr.close();
	}

}
