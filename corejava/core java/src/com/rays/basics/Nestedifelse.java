package com.rays.basics;

public class Nestedifelse {
public static void main(String[] args) {
	int pre = 90, mains= 81, criteria= 85;
	if(pre >= criteria && pre<100) {
		if(mains >= criteria ) {
			System.out.println("you are selected");
		} else  {
			System.out.println("your main score  " + mains +" is below the criteria  " + criteria );	
		} 
	}
	else {
		System.out.println(" your pre score "+ pre + " is below the criteria "+ criteria );
	}
}
}
