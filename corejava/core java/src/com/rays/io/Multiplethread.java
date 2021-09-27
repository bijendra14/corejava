package com.rays.io;

import java.util.Scanner;

public class Multiplethread {
	 private static Scanner scanner;

	public static void main(String[] args) {
	        scanner = new Scanner(System.in);
	       
	        System.out.println("Enter the lower Limit");
	        int lowerLimit=scanner.nextInt();
	       
	        System.out.println("Enter the upper Limit");
	        int upperLimit=scanner.nextInt();
	       
	        if(upperLimit<lowerLimit){
	            lowerLimit=upperLimit;
	            upperLimit=lowerLimit;
	        }
	        int range=(lowerLimit+upperLimit)/2;
	       
	        FactThread f1=new FactThread(lowerLimit,(int)range);
	        FactThread f2=new FactThread(((int)range+1),upperLimit+1);
	        }
	   
	}


