package com.practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	double x,y,z;
	double a,b,c;
	
	System.out.println("Please Enter a Number : ");
	x=input.nextDouble();
	System.out.println("Please Enter another Number : ");
	y=input.nextDouble();
	
	z=x+y;
	a=x-y;
	b=x*y;
	c=x/y;
	
	System.out.println("Your addition answer is :       " +z);
	System.out.println("Your subtraction answer is :    "  +a);
	System.out.println("Your multiplication answer is : " +b);
	System.out.println("Your division answer is :       " +c);
}
}