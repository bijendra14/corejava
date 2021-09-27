package com.rays.basics;

public class Whileloop {
	public static void main(String[] args) {
		boolean alive =true;
		int rounds= 1;
		while(alive) {
			System.out.println("I will dance"+ rounds);
			rounds++;
			if (rounds >= 10)
			{
				alive = false;
			}
		}// end of loop 
		System.out.println("--------------------------------------------------");
		int i =1;
		while(i<100) {
			System.out.println(""+i);
			i++;
		}
	}

}
