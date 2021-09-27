package com.rays.io;
	class FactThread implements Runnable{
	    int lowerLimit;
	    int upperLimit;
	   
	    FactThread(int lowerLimit,int upperLimit){
	        this.lowerLimit=lowerLimit;
	        this.upperLimit=upperLimit;
	       new Thread(this,"Thread 1").start();
	    }
	   
	    @Override
	    public void run(){
	      calculate();
	    }
	    protected synchronized void calculate(){
	        for(int i=lowerLimit;i<upperLimit;i++){
	            int fact=1;
	            int temp=i;
	            if(temp<0){
	                System.out.println("Factorial not defined!");
	            }

	            if(temp==0){
	                fact=1;
	                System.out.println("Factorial of "+i+" is 1.");
	            }

	            if(temp>0){
	                while(temp>0){
	                    fact=fact*(temp--);
	                }
	                System.out.println("Factorial of "+i+" is "+fact);
	            }
	        }
	    }
	}


