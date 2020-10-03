package com.practice;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		int age = 0;
	//	Scanner age=new Scanner(System.in);
		
		switch(age) {
		case 18:
			System.out.println("you are major and can vote now..!");
		break;
		case 24:
			System.out.println("Male can vote now");
		break;
		case 60:
			System.out.println("you can retire now..!");
		default:
			System.out.println("you have to wait..!");
	}
}
}