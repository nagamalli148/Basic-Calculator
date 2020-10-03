package com.practice;

import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
		int age=43;
		
		switch(age) {
		case 18:
			System.out.println("you are major..!");
			break;
		case 24:
			System.out.println("You can vote now!");
		break;
		case 60:
			System.out.println("you can retire now..!");
		default:
			System.out.println("invalid");
		}
}
}