package com.practice;

import java.util.Scanner;
public class loop {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	int x=0;
	System.out.println("Enter input");
	int y=input.nextInt();
	
	while(x<y)
	{
	    x++;
		System.out.println(x+" Welcome to my world..!");
		
	}
}
}