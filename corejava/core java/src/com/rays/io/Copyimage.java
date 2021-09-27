package com.rays.io;

import java.io.*;

public class Copyimage {
	public static void main(String[] args) throws IOException {
		String source ="C:\\Users\\bijendra\\Desktop\\profil pic.jpg";
		String des ="E:/Javafilehanding/Copyimage.jpg";
		FileInputStream fin=new FileInputStream(source);
	    FileOutputStream fout=new FileOutputStream(des);
	    int b = fin.read(); // read 1st byte
	    while(b!=-1) {
	    	fout.write(b);
	    	b=fin.read();
	    }
	    fin.close();
	    fout.close();
	    System.out.println("copied");
				
	}

}
