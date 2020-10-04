package com.access;

import java.util.Scanner;
public class fruit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		orange userObj=new orange();
		System.out.println("Please enter input");
		String userName=s.nextLine();
		
		userObj.frooti(userName);
	}
	}
