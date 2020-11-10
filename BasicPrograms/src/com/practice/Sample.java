package com.practice;

import java.util.Scanner;

public class Sample {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your age");
       int age=input.nextInt();
		System.out.print(age>=18?"you can vote now":"you are not eligible!");
	}



}
