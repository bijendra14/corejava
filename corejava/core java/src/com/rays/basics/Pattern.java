package com.rays.basics;

public class Pattern {
public static void main(String[] args) {
	for (int row=1; row<=5;row++)   
	{  
	for (int col =1; col<=7;col++)  
	{  
	System.out.print(row+" ");  
	}  
	System.out.println();  
	}  
	System.out.println("----------------------------------");
	for (int row=1; row<=5;row++)   
	{  
	for (int col =1; col<=7;col++)  
	{  
	System.out.print(col+" ");  
	}  
	System.out.println();  
	}  
	System.out.println("----------------------------------");
	for (int row=1; row<=5;row++)   
	{  
	for (int col =1; col<=row;col++)  
	{  
	System.out.print(col+" ");  
	}  
	System.out.println();  
	}  
	System.out.println("_____________________________________");
	
	int i, j, rows=9;  
	for (i = rows; i >= 1; i--)   
	{  
	for (j = 1; j <= i; j++)  
	{  
	System.out.print(j+" ");  
	}  
	System.out.println();  
	}   	 
}
}
