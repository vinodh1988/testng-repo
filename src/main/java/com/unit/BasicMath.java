package com.unit;

public class BasicMath {
	
   public static int highest(int ... a){
	   
	   int high=0;
	   for(int i=0;i<a.length;i++) {
		   if(high<a[i])
			   high=a[i];
	   }
	   return high;
   }
   
   public static int highestProper(int ...a) throws NoArgPassedException {
	   int high=0;
	   if(a.length==0)
		   throw new NoArgPassedException();
	   for(int i=0;i<a.length;i++) {
		   if(high<a[i])
			   high=a[i];
	   }
	   return high;
   }
   
   
   
   public static int divide(int a,int b) {
	   return a/b;
   }
   
   public static int divideProper(int a,int b) {
	   try {
		   
		   return a/b;
	   }
	   catch(ArithmeticException e) {
		    return -99999;
	   }
   }
}
