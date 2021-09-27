package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Copysong {
	public static void main(String[] args) throws IOException {
		String source ="F:\\c drive data\\Downloads\\gg.mp3";
		String des ="E:/Javafilehanding/song.mp3";
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



