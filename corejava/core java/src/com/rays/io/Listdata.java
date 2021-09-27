package com.rays.io;

import java.io.File;

public class Listdata {
	public static void main(String[] args) {
		File f= new File("E:/");
		String[] list=f.list();
		for (int i=0; i < list.length;i++ ) {
			System.out.println((i + 1)+"\t"+ list[i]);
		}
		System.out.println("______________________");
		File[]files = f.listFiles();
		for(int i=0; i<files.length; i++) {
			if (files [i].isDirectory()) {
				System.out.println((i + 1)+"\t"+ files[i]);
				
			}
		}
		
	}

}
