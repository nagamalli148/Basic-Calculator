package com.practice;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*
	  int a[]; // a is an integer array variable
      a=new int[5]; // Array variable contains 5 integer values
      int b[]=new int[5]; //defining and allocating
      System.out.println(a.length);
       
       for(int i=0;i<5;i++) { 
       System.out.println(a[i]); 
   //default value of int=0,float=0.0,boolean=false,string=null
       a[i]=i;
      System.out.println(a[i]);
    */
		
		int b[]=new int[]{34,89,10,7,90};
        for(int j=0;j<b.length;j++) 
        {
    	   System.out.println(b[j]);
        }
        int c[]=b;
        for(int j=0;j<b.length;j++) 
        System.out.println(c[j]);
	}
}