// We can have function as same name , compile time polymorphism 


package com.practice;

public class MethodOverloading {
	
public int sum(int a,int b) {
	return a+b;
}
public int sum(int a,int b,int c) {
	return a+b+c;
}
public float sum(int a,float b) {
	
	return a+b;
}

public static void main(String[] args) {
     
	    MethodOverloading a=new MethodOverloading();
        System.out.println(a.sum(2,3));
        
        System.out.println(a.sum(2,3,5));
        
        System.out.println(a.sum(3,2.4f));
	} 
}
