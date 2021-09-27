package com.rays.io;

import java.io.File;
import java.io.IOException;

public class FileHanding {
	public static void main(String[] args) throws IOException {
		// create a new file or folder 
		 //File f= new File("E:/Javafilehanding");
		 //System.out.println(f.mkdir());
		// create a single folder
		// multiple folders create
		File f = new File("E:/Javafilehanding/core/java/io/test.txt");
		//System.out.println(f.mkdirs());
		System.out.println(f.createNewFile());
		System.out.println(f.renameTo(new File("E:/Javafilehanding/demo.txt")));
	}
	
		
	
	

}
