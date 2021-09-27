package com.rays.basics;

public class Elseifladder {
public static void main(String[] args) {
	int budget=300;
	if(budget>=400) {
		System.out.println("you can buy large size pizza");
	} else if (budget>=300){
	System.out.println("you can buy medium size pizza");
}else  if(budget>=200) {
	System.out.println("you can buy small size pizza");
}else if (budget>=100) {
	System.out.println("regular pizza");
}else {
	System.out.println("you can buy a burger above 30");
}
}
}