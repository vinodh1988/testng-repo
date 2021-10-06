package com.unit;

public class MathOperation {
    public static long factorial(int n) {
    	if(n==1 || n==0)
    		return 1;
    	else 
    		return n*factorial(n-1);
    }
}
